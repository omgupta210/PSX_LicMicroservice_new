package com.posidex.lic.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

import lombok.Data;

@Entity

@DynamicUpdate
@Table(name = "PSX_CLUSTER_CROSS_REF_T")

public class Psx_cluster_cross_ref_t {

	        @Id
	        @Column(name="REQUEST_ID")
            private String requestid;
	        
	        @Column(name="BATCH_ID")
			private Integer batchid;   
	        
	        @Column(name="COMMENTS")
			private String comments;   
	        
	        

			public String getRequestid() {
				return requestid;
			}

			public void setRequestid(String requestid) {
				this.requestid = requestid;
			}

			public Integer getBatchid() {
				return batchid;
			}

			public void setBatchid(Integer batchid) {
				this.batchid = batchid;
			}

			public String getComments() {
				return comments;
			}

			public void setComments(String comments) {
				this.comments = comments;
			}

			public String getCust_id() {
				return cust_id;
			}

			public void setCust_id(String cust_id) {
				this.cust_id = cust_id;
			}

			public String getCust_id_part_1() {
				return cust_id_part_1;
			}

			public void setCust_id_part_1(String cust_id_part_1) {
				this.cust_id_part_1 = cust_id_part_1;
			}

			public String getCust_id_part_2() {
				return cust_id_part_2;
			}

			public void setCust_id_part_2(String cust_id_part_2) {
				this.cust_id_part_2 = cust_id_part_2;
			}

			public String getCust_id_part_3() {
				return cust_id_part_3;
			}

			public void setCust_id_part_3(String cust_id_part_3) {
				this.cust_id_part_3 = cust_id_part_3;
			}

			public String getCust_id_part_4() {
				return cust_id_part_4;
			}

			public void setCust_id_part_4(String cust_id_part_4) {
				this.cust_id_part_4 = cust_id_part_4;
			}

			public String getCust_id_part_5() {
				return cust_id_part_5;
			}

			public void setCust_id_part_5(String cust_id_part_5) {
				this.cust_id_part_5 = cust_id_part_5;
			}

			public String getCust_tag_id() {
				return cust_tag_id;
			}

			public void setCust_tag_id(String cust_tag_id) {
				this.cust_tag_id = cust_tag_id;
			}

			public String getCust_unq_id() {
				return cust_unq_id;
			}

			public void setCust_unq_id(String custunqid) {
				this.cust_unq_id = custunqid;
			}

			public String getCusT_unq_id_o() {
				return cuts_unq_id_o;
			}

			public void setCuts_unq_id_o(String cuts_unq_id_o) {
				this.cuts_unq_id_o = cuts_unq_id_o;
			}

			public String getCustomer_id() {
				return customer_id;
			}

			public void setCustomer_id(String customer_id) {
				this.customer_id = customer_id;
			}

			public String getCustomer_type() {
				return customer_type;
			}

			public void setCustomer_type(String customer_type) {
				this.customer_type = customer_type;
			}

			public String getGroup_type() {
				return group_type;
			}

			public void setGroup_type(String group_type) {
				this.group_type = group_type;
			}

			public String getinitial_customer_id() {
				return initial_customer_id;
			}

			public void setInitial_customer_id(String initial_customer_id) {
				this.initial_customer_id = initial_customer_id;
			}

			public Timestamp getInster_ts() {
				return inster_ts;
			}

			public void setInster_ts(Timestamp inster_ts) {
				this.inster_ts = inster_ts;
			}

			public String getInternal_use_batchid() {
				return internal_use_batchid;
			}

			public void setInternal_use_batchid(String internal_use_batchid) {
				this.internal_use_batchid = internal_use_batchid;
			}

			public String getIs_merged_manual() {
				return is_merged_manual;
			}

			public void setIs_merged_manual(String is_merged_manual) {
				this.is_merged_manual = is_merged_manual;
			}

			public String getIs_split_manual() {
				return is_split_manual;
			}

			public void setIs_split_manual(String is_split_manual) {
				this.is_split_manual = is_split_manual;
			}

			public String getIs_to_process() {
				return is_to_process;
			}

			public void setIs_to_process(String is_to_process) {
				this.is_to_process = is_to_process;
			}

			public String getIslock() {
				return islock;
			}

			public void setIslock(String islock) {
				this.islock = islock;
			}

			public String getLocked_by() {
				return locked_by;
			}

			public void setLocked_by(String locked_by) {
				this.locked_by = locked_by;
			}

			public Integer getLpc() {
				return lpc;
			}

			public void setLpc(Integer lpc) {
				this.lpc = lpc;
			}

			public String getMatch_status() {
				return match_status;
			}

			public void setMatch_status(String match_status) {
				this.match_status = match_status;
			}

			public String getModified_batch_id() {
				return modified_batch_id;
			}

			public void setModified_batch_id(String modified_batch_id) {
				this.modified_batch_id = modified_batch_id;
			}

			public Integer getMpc() {
				return mpc;
			}

			public void setMpc(Integer mpc) {
				this.mpc = mpc;
			}

			public Integer getMpc_group_count() {
				return mpc_group_count;
			}

			public void setMpc_group_count(Integer mpc_group_count) {
				this.mpc_group_count = mpc_group_count;
			}

			public String getOriginal_batch_id() {
				return original_batch_id;
			}

			public void setOriginal_batch_id(String original_batch_id) {
				this.original_batch_id = original_batch_id;
			}

			public String getOriginal_customer_id() {
				return original_customer_id;
			}

			public void setOriginal_customer_id(String original_customer_id) {
				this.original_customer_id = original_customer_id;
			}

			public String getProcess_type() {
				return process_type;
			}

			public void setProcess_type(String process_type) {
				this.process_type = process_type;
			}

			public Integer getPsx_batch_id() {
				return psx_batch_id;
			}

			public void setPsx_batch_id(Integer psx_batch_id) {
				this.psx_batch_id = psx_batch_id;
			}

			public Integer getPsx_id() {
				return psx_id;
			}

			public void setPsx_id(Integer psx_id) {
				this.psx_id = psx_id;
			}

			public String getReview() {
				return review;
			}

			public void setReview(String review) {
				this.review = review;
			}

			public String getReview_comment() {
				return review_comment;
			}

			public void setReview_comment(String review_comment) {
				this.review_comment = review_comment;
			}

			public String getReviewed_by() {
				return reviewed_by;
			}

			public void setReviewed_by(String reviewed_by) {
				this.reviewed_by = reviewed_by;
			}

			public String getSkipped_by() {
				return skipped_by;
			}

			public void setSkipped_by(String skipped_by) {
				this.skipped_by = skipped_by;
			}

			public String getSkipped_by_checker() {
				return skipped_by_checker;
			}

			public void setSkipped_by_checker(String skipped_by_checker) {
				this.skipped_by_checker = skipped_by_checker;
			}

			public Integer getSource_sys_id() {
				return source_sys_id;
			}

			public void setSource_sys_id(Integer source_sys_id) {
				this.source_sys_id = source_sys_id;
			}

			public String getSplit_merge_flag() {
				return split_merge_flag;
			}

			public void setSplit_merge_flag(String split_merge_flag) {
				this.split_merge_flag = split_merge_flag;
			}

			public String getSubgroup() {
				return subgroup;
			}

			public void setSubgroup(String subgroup) {
				this.subgroup = subgroup;
			}

			public String getTemp_mergergroup() {
				return temp_mergergroup;
			}

			public void setTemp_mergergroup(String temp_mergergroup) {
				this.temp_mergergroup = temp_mergergroup;
			}

			public String getTransaction_id() {
				return transaction_id;
			}

			public void setTransaction_id(String transaction_id) {
				this.transaction_id = transaction_id;
			}

			public Timestamp getUpdate_ts() {
				return update_ts;
			}

			public void setUpdate_ts(Timestamp update_ts) {
				this.update_ts = update_ts;
			}

			public String getUpdated_user() {
				return updated_user;
			}

			public void setUpdated_user(String updated_user) {
				this.updated_user = updated_user;
			}

			public String getUserid() {
				return userid;
			}

			public void setUserid(String userid) {
				this.userid = userid;
			}

			public String getVerified_by() {
				return verified_by;
			}

			public void setVerified_by(String verified_by) {
				this.verified_by = verified_by;
			}

			@Column(name="CUST_ID")
			private String cust_id; 
	        
	        @Column(name="CUST_ID_PART_1")
			private String cust_id_part_1;
	        
	        @Column(name="CUST_ID_PART_2")
			private String cust_id_part_2;   
	        
	        @Column(name="CUST_ID_PART_3")
			private String cust_id_part_3;       
	        
	        @Column(name="CUST_ID_PART_4")
			private String cust_id_part_4;  
	        
	        @Column(name="CUST_ID_PART_5")
			private String cust_id_part_5;   
	        
	        @Column(name="CUST_TAG_ID")
			private String cust_tag_id; 
	        
	        @Column(name="CUST_UNQ_ID")
			private String cust_unq_id;   
	        
	        @Column(name="CUST_UNQ_ID_O")
			private String cuts_unq_id_o; 
	        
	        @Column(name="CUSTOMER_ID")
			private String customer_id; 
	        
	        @Column(name="CUSTOMER_TYPE")
			private String customer_type;  
	        
	        @Column(name="GROUP_TYPE")
			private String group_type;    
	        
	        @Column(name="INITIAL_customer_id")
			private String initial_customer_id;   
	        
	        @Column(name="INSERT_TS")
			private Timestamp inster_ts; 
	        
	        @Column(name="INTERNAL_USE_BATCHID")
			private String internal_use_batchid;  
	        
	        @Column(name="IS_MERGED_MANUAL")
			private String is_merged_manual;
	        
	        @Column(name="IS_SPLIT_MANUAL")
			private String is_split_manual;    
	        
	        @Column(name="IS_TO_PROCESS")
			private String is_to_process;     
	        
	        @Column(name="ISLOCK")
			private String islock;    
	        
	        @Column(name="LOCKED_BY")
			private String locked_by;  
	        
	        @Column(name="LPC")
			private Integer lpc;         
	        
	        @Column(name="MATCH_STATUS")
			private String match_status;    
	        
	        @Column(name="MODIFIED_BATCH_ID")
			private String modified_batch_id;  
	        
	        @Column(name="MPC")
			private Integer mpc;            
	        
	        @Column(name="MPC_GROUP_COUNT")
			private Integer mpc_group_count; 
	        
	        @Column(name="ORIGINAL_BATCH_ID")
			private String original_batch_id;
			
		    @Column(name="ORIGINAL_customer_id")
			private String original_customer_id; 
			  
		    @Column(name="process_type")
			private String process_type;  
			  
		    @Column(name="PSX_BATCH_ID")
			private Integer psx_batch_id; 
			  
			  @Column(name="PSX_ID")
			private Integer psx_id;              
			
			  @Column(name="REVIEW")
			private String review; 
			  
			  @Column(name="REVIEW_COMMENT")
			private String review_comment; 
			  
			  @Column(name="REVIEWED_BY")
			private String reviewed_by;    
			  
			  @Column(name="SKIPPED_BY")
			private String skipped_by;  
			  
			  @Column(name="SKIPPED_BY_CHECKER")
			private String skipped_by_checker;  
			  
			  @Column(name="SOURCE_SYS_ID")
			private Integer source_sys_id; 
			  
			  @Column(name="SPLIT_MERGE_FLAG")
			private String split_merge_flag;     
			  
			  @Column(name="SUBGROUP")
			private String subgroup;   
			  
			  @Column(name="TEMP_Mergegroup")
			private String temp_mergergroup;    
			  
			  @Column(name="TRANSACTION_ID")
			private String transaction_id;  
			  
			  @Column(name="UPDATE_TS")
			private Timestamp update_ts;   
			  
			  @Column(name="updated_user")
			private String updated_user;  
			  
			  @Column(name="USERID")
			private String userid;   
			  
			  @Column(name="VERIFIED_BY")
			private String verified_by;



			@Override
			public String toString() {
				return "Psx_cluster_cross_ref_t [requestid=" + requestid + ", batchid=" + batchid + ", comments="
						+ comments + ", cust_id=" + cust_id + ", cust_id_part_1=" + cust_id_part_1 + ", cust_id_part_2="
						+ cust_id_part_2 + ", cust_id_part_3=" + cust_id_part_3 + ", cust_id_part_4=" + cust_id_part_4
						+ ", cust_id_part_5=" + cust_id_part_5 + ", cust_tag_id=" + cust_tag_id + ", cust_unq_id="
						+ cust_unq_id + ", cuts_unq_id_o=" + cuts_unq_id_o + ", customer_id=" + customer_id
						+ ", customer_type=" + customer_type + ", group_type=" + group_type + ", initial_customer_id="
						+ initial_customer_id + ", inster_ts=" + inster_ts + ", internal_use_batchid="
						+ internal_use_batchid + ", is_merged_manual=" + is_merged_manual + ", is_split_manual="
						+ is_split_manual + ", is_to_process=" + is_to_process + ", islock=" + islock + ", locked_by="
						+ locked_by + ", lpc=" + lpc + ", match_status=" + match_status + ", modified_batch_id="
						+ modified_batch_id + ", mpc=" + mpc + ", mpc_group_count=" + mpc_group_count
						+ ", original_batch_id=" + original_batch_id + ", original_customer_id=" + original_customer_id
						+ ", process_type=" + process_type + ", psx_batch_id=" + psx_batch_id + ", psx_id=" + psx_id
						+ ", review=" + review + ", review_comment=" + review_comment + ", reviewed_by=" + reviewed_by
						+ ", skipped_by=" + skipped_by + ", skipped_by_checker=" + skipped_by_checker
						+ ", source_sys_id=" + source_sys_id + ", split_merge_flag=" + split_merge_flag + ", subgroup="
						+ subgroup + ", temp_mergergroup=" + temp_mergergroup + ", transaction_id=" + transaction_id
						+ ", update_ts=" + update_ts + ", updated_user=" + updated_user + ", userid=" + userid
						+ ", verified_by=" + verified_by + "]";
			}  
			  
			  
			
}
