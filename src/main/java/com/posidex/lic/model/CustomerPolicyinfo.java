package com.posidex.lic.model;

public class CustomerPolicyinfo {
	
/*
 cust_id",
customerid
custunqid
*/

	private String cust_unq_id;
	private String customerid;
	private String cust_id;
	public String getcust_unq_id() {
		return cust_unq_id;
	}
	public void setcust_unq_id(String custunqid) {
		this.cust_unq_id = custunqid;
	}
	public String getCustomerid() {
		return customerid;
	}
	@Override
	public String toString() {
		return "CustomerPolicyinfo [cust_unq_id=" + cust_unq_id + ", customerid=" + customerid + ", cust_id=" + cust_id
				+ "]";
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
	public String getCust_id() {
		return cust_id;
	}
	public void setCust_id(String cust_id) {
		this.cust_id = cust_id;
	}
	
	
}
