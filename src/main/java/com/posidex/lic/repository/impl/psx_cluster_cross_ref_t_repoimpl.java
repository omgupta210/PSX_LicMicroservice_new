package com.posidex.lic.repository.impl;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.posidex.lic.entity.Psx_cluster_cross_ref_t;
import com.posidex.lic.repository.psx_cluster_cross_ref_t_repo;

@Repository
public class psx_cluster_cross_ref_t_repoimpl implements psx_cluster_cross_ref_t_repo {
	 
	private org.apache.juli.logging.Log log=LogFactory.getLog(this.getClass());
	
	@Autowired
	  private JdbcTemplate jdbcTemplate;
	 public psx_cluster_cross_ref_t_repoimpl(JdbcTemplate jdbcTemplate)
	 {
		 this.jdbcTemplate=jdbcTemplate;
	 }

	@Override
	public <S extends Psx_cluster_cross_ref_t> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Psx_cluster_cross_ref_t> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Psx_cluster_cross_ref_t> findById(String id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean existsById(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Psx_cluster_cross_ref_t> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Psx_cluster_cross_ref_t> findAllById(Iterable<String> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Psx_cluster_cross_ref_t entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAllById(Iterable<? extends String> ids) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll(Iterable<? extends Psx_cluster_cross_ref_t> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}


	public List<Psx_cluster_cross_ref_t> findByCustomerid(String custid) {
		
		String q="SELECT * FROM PSX_CLUSTER_CROSS_REF_T WHERE customer_id='"+custid+"'";
		try {
		return jdbcTemplate.query(q, BeanPropertyRowMapper.newInstance(Psx_cluster_cross_ref_t.class));
		}
		catch(Exception e)
		{
			
			return null;
		}
	}


	public Psx_cluster_cross_ref_t findByCustunqid(String pno) {
		
		String q="SELECT * FROM PSX_CLUSTER_CROSS_REF_T WHERE cust_unq_id='"+pno+"'";
		
		//log.info("query data : "+jdbcTemplate.queryForObject(q,BeanPropertyRowMapper.newInstance(Psx_cluster_cross_ref_t.class)) );
		try {
		return jdbcTemplate.queryForObject(q,BeanPropertyRowMapper.newInstance(Psx_cluster_cross_ref_t.class));}
		catch(Exception e)
		{
			
			return null;
		}
	}

}



