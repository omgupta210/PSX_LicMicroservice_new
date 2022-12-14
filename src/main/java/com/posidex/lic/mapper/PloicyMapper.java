package  com.posidex.lic.mapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.posidex.lic.entity.Psx_cluster_cross_ref_t;
import com.posidex.lic.model.CustomerPolicyinfo;

@Component
public class PloicyMapper implements Mapper {

	private final Logger logger=LoggerFactory.getLogger(this.getClass());
	
	@Override
	public void Psxclustercrossrefentitytopolicyinfo(Object entity, Object model) {
		
	
		
		
		if (entity == null || model == null) {
			logger.error("mapping failed due to null objects");
			return;
		}
		
		Psx_cluster_cross_ref_t entity1=null;
		
		CustomerPolicyinfo cususer=null;
		if (entity instanceof Psx_cluster_cross_ref_t) {
			entity1 = (Psx_cluster_cross_ref_t) entity;
		} else {
			logger.error("mapping failed due to wrong entity type passed in UserMapper");
			return;
		}
		if (model instanceof CustomerPolicyinfo) {
			cususer = (CustomerPolicyinfo) model;
		} else {
			logger.error("mapping failed due to wrong model type passed in UserMapper");
			return;
		}
		
		BeanUtils.copyProperties(entity1, cususer);
		
	}



}
