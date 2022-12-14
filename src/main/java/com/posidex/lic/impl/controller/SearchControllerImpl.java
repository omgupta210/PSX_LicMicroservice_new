package com.posidex.lic.impl.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.posidex.lic.api.controller.SearchController;
import com.posidex.lic.api.service.MessageService;
import com.posidex.lic.api.service.SearchService;
import com.posidex.lic.entity.Psx_cluster_cross_ref_t;
import com.posidex.lic.exception.CustomException;
import com.posidex.lic.mapper.PloicyMapper;
import com.posidex.lic.model.CustomerPolicyinfo;
import com.posidex.lic.model.ErrorCode;
import com.posidex.lic.model.PolicyDetails;
import com.posidex.lic.model.ServiceRequest;
import com.posidex.lic.util.ResponseJson;

@RestController
@RequestMapping("/psx/restservice/licms")
public class SearchControllerImpl implements SearchController {

	@Autowired
	private PloicyMapper plc;

	@Autowired
	private SearchService service;
	@Autowired
	Environment env;
	@Autowired
	private MessageService messageService;
	private final Logger logger = LoggerFactory.getLogger(SearchService.class);
	ResponseJson<HttpStatus, ?> responseJson = new ResponseJson<>();

	@PostMapping("realtimesearch")
	public ResponseEntity<?> realTimeSearch(@RequestBody ServiceRequest request) throws Exception {
		ResponseEntity<?> responseEntity = null;

		logger.info("request.getName()" + request.getName());
		if (request.getName() == null || request.getName().isEmpty()) {
			responseJson.setMessage(messageService.getMessage("INPUT_NAME_ERROR"));
			responseJson.setStatus(HttpStatus.BAD_REQUEST);
			responseJson.setData(null);
			return new ResponseEntity<>(responseJson, HttpStatus.BAD_REQUEST);
		}

		if (request.getName() != null || !(request.getName().isEmpty())) {
			if (request.getDob() == null || (request.getDob().isEmpty())) {
				responseJson.setMessage(messageService.getMessage("INPUT_DOB_ERROR"));
				responseJson.setStatus(HttpStatus.BAD_REQUEST);
				responseJson.setData(null);
				return new ResponseEntity<>(responseJson, HttpStatus.BAD_REQUEST);
			}
		}

		try {
			responseJson = service.getDetails(request);
			responseJson.setStatus(HttpStatus.OK);
			logger.info("reponse" + responseJson.getStatus());
			responseEntity = new ResponseEntity<>(responseJson, HttpStatus.OK);
//		} 
//		catch (NullPointerException e) {
//			// e.printStackTrace();
//			logger.info(e.getMessage());
//			logger.info("Message from Service" + env.getProperty("REQUEST_ERROR"));
//			responseJson.setMessage(env.getProperty("REQUEST_ERROR"));
//
//			responseJson.setStatus(HttpStatus.BAD_REQUEST);
//
//			return new ResponseEntity<>(responseJson, HttpStatus.BAD_REQUEST);
		} catch (CustomException ce) {

			ResponseJson<HttpStatus, Map<String, String>> responseJson = new ResponseJson<>();

			responseJson.setMessage(messageService.getMessage("message.unsuccessful"));
			Map<String, String> data = new HashMap<>();
			data.put("message", ce.getMessage());
			responseJson.setData(data);
			responseJson.setStatus(HttpStatus.PRECONDITION_FAILED);

			responseEntity = new ResponseEntity<>(responseJson, HttpStatus.PRECONDITION_FAILED);

		} catch (RuntimeException re) {
			re.printStackTrace();
			logger.error(re.getMessage(), re);

			ResponseJson<HttpStatus, Map<String, String>> responseJson = new ResponseJson<>();

			responseJson.setMessage(messageService.getMessage("message.unsuccessful"));
			// messageService.getMessage("message.unsuccessful"));
			Map<String, String> data = new HashMap<>();
			data.put("message", messageService.getMessage("message.unsuccessful"));
			responseJson.setData(data);
			responseJson.setStatus(HttpStatus.PRECONDITION_FAILED);

			responseEntity = new ResponseEntity<>(responseJson, HttpStatus.PRECONDITION_FAILED);

		}

		return responseEntity;

	}

	@Override
	@GetMapping("getToken")
	public ResponseEntity<?> getToken() throws Exception {
		ResponseEntity<?> responseEntity = null;
		ResponseJson<HttpStatus, ?> responseJson = service.getToken();
		logger.info("reponse" + responseJson.getStatus());
		responseEntity = new ResponseEntity<>(responseJson, HttpStatus.OK);
		return responseEntity;
	}

	@Override
	@GetMapping("/findbycustomerid")
	public ResponseEntity<?> CustomerIdSerch(String customerid) throws CustomException, Exception {

		ResponseJson finalresponse = new ResponseJson();
		ResponseEntity response = null;

		try {

			if (customerid.isBlank() || customerid.isEmpty()) {

				throw new CustomException(messageService.getMessage(ErrorCode.CIR.getMessageKey()));
			}

			List<PolicyDetails> policydata = new ArrayList<>();
			List<CustomerPolicyinfo> p = new ArrayList<CustomerPolicyinfo>();

			ResponseJson responsejson = service.getcustomerDetails(customerid);

			if (responsejson.getData() == null || !responsejson.isStatusflag()) {
				throw new CustomException(messageService.getMessage(ErrorCode.RNF.getMessageKey()));
			}
			logger.info("Records from the PSX_cross_ref_table for custmerid: " + customerid + " : " + responsejson);
			List<Psx_cluster_cross_ref_t> t = (List<Psx_cluster_cross_ref_t>) responsejson.getData();

			for (Psx_cluster_cross_ref_t m : t) {

				CustomerPolicyinfo p1 = new CustomerPolicyinfo();

				plc.Psxclustercrossrefentitytopolicyinfo(m, p1);
				p1.setCustomerid(customerid);
				p.add(p1);
			}
			logger.info("request data in customerpolicyinfo" + p);

			String partition = p.get(0).getCust_id();

			for (CustomerPolicyinfo temp : p) {

				responsejson = service.getPolicydetails(partition, temp.getcust_unq_id());
				if (!responsejson.isStatusflag() || responsejson.getData() == null) {
					throw new CustomException(messageService.getMessage(ErrorCode.RNF.getMessageKey()));
				}

				PolicyDetails ptemp = (PolicyDetails) responsejson.getData();
				ptemp.setCustomerid(customerid);
				policydata.add(ptemp);

			}

			finalresponse.setData(policydata);
			finalresponse.setMessage("successful!!");
			finalresponse.setStatus(HttpStatus.OK);
			finalresponse.setStatusflag(true);

			response = new ResponseEntity(finalresponse, HttpStatus.OK);

		} catch (CustomException ce) {
			finalresponse.setMessage(messageService.getMessage("message.unsuccessful"));
			finalresponse.setStatus(false);
			Map<String, String> data = new HashMap<String, String>();
			data.put("message", ce.getMessage());
			finalresponse.setData(data);

			if (ce.getMessage().equalsIgnoreCase(messageService.getMessage(ErrorCode.CIR.getMessageKey())))
				response = new ResponseEntity(finalresponse, HttpStatus.PRECONDITION_FAILED);

			else if (ce.getMessage().equalsIgnoreCase(messageService.getMessage(ErrorCode.RNF.getMessageKey())))
				response = new ResponseEntity(finalresponse, HttpStatus.PRECONDITION_FAILED);
		}

		catch (Exception ce) {
			finalresponse.setMessage(messageService.getMessage("message.unsuccessful"));
			finalresponse.setStatus(false);
			Map<String, String> data = new HashMap<String, String>();
			data.put("RTE", ce.getMessage());
			finalresponse.setData(data);
			response = new ResponseEntity(finalresponse, HttpStatus.PRECONDITION_FAILED);
		}

		return response;

	}

	@GetMapping("findbypolicyno")
	public ResponseEntity<?> PloicySearch(String policyno) throws CustomException, NullPointerException, Exception {

		ResponseEntity response = null;
		ResponseJson finalresponse = new ResponseJson();
		try {

			if (policyno.isBlank() || policyno.isEmpty()) {
				throw new CustomException(messageService.getMessage(ErrorCode.CIR.getMessageKey()));
			}

			Psx_cluster_cross_ref_t clusterrecordwithpno = (Psx_cluster_cross_ref_t) service
					.getcustomerdetailswithpno(policyno).getData();

			logger.info("value of Psx_cluster_cross_ref_t :" + clusterrecordwithpno);

			if (clusterrecordwithpno == null) {
				throw new CustomException(messageService.getMessage(ErrorCode.RNF.getMessageKey()));
			}

			// PolicyData cust1 = new PolicyData();

			String p = clusterrecordwithpno.getCust_id();
			ResponseJson responsejson = service.getPolicydetails(p, policyno);
			if (responsejson.getData() == null || !responsejson.isStatusflag()) {
				throw new CustomException(messageService.getMessage(ErrorCode.RNF.getMessageKey()));
			}

			PolicyDetails cust1 = (PolicyDetails) responsejson.getData();
			cust1.setCustomerid(clusterrecordwithpno.getCust_unq_id());

			finalresponse.setData(cust1);
			finalresponse.setMessage("successful!!");
			finalresponse.setStatus(HttpStatus.OK);
			finalresponse.setStatusflag(true);
			response = new ResponseEntity(finalresponse, HttpStatus.OK);

		} catch (CustomException ce) {
			finalresponse.setMessage(messageService.getMessage("message.unsuccessful"));
			finalresponse.setStatus(false);
			Map<String, String> data = new HashMap<String, String>();
			data.put("message", ce.getMessage());
			finalresponse.setData(data);

			if (ce.getMessage().equalsIgnoreCase(messageService.getMessage(ErrorCode.CIR.getMessageKey())))
				response = new ResponseEntity(finalresponse, HttpStatus.PRECONDITION_FAILED);

			else if (ce.getMessage().equalsIgnoreCase(messageService.getMessage(ErrorCode.RNF.getMessageKey())))
				response = new ResponseEntity(finalresponse, HttpStatus.PRECONDITION_FAILED);

		} catch (Exception ce) {
			finalresponse.setMessage(messageService.getMessage("message.unsuccessful"));
			finalresponse.setStatus(false);
			Map<String, String> data = new HashMap<String, String>();
			data.put("RTE", ce.getMessage());
			finalresponse.setData(data);
			response = new ResponseEntity(finalresponse, HttpStatus.PRECONDITION_FAILED);
		}

		return response;
	}

	

}
