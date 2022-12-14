package com.posidex.lic.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;

import com.posidex.lic.model.ServiceRequest;

public interface SearchController {

	public ResponseEntity<?> realTimeSearch(  ServiceRequest request) throws Exception;

	public ResponseEntity<?> getToken() throws Exception;
	
	public ResponseEntity<?> CustomerIdSerch(@RequestParam  (required = true) String custmerid) throws Exception;
	
	public ResponseEntity<?> PloicySearch(@RequestParam (required = true) String policyno) throws Exception;
	
}
