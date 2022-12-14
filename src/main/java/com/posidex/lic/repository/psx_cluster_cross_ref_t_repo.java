package com.posidex.lic.repository;
import org.springframework.data.repository.CrudRepository;

import com.posidex.lic.entity.Psx_cluster_cross_ref_t;


public interface psx_cluster_cross_ref_t_repo extends CrudRepository<Psx_cluster_cross_ref_t, String> {
	
	//List<Psx_cluster_cross_ref_t> findByCustomerid(String custid);


}
