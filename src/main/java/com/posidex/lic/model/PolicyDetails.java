package com.posidex.lic.model;

import java.sql.Date;

public class PolicyDetails {

	
	private String  name ;           
	private String  dob; 
	private String  Fathername ; 
	private String  partitionnumber ;
	private String  PolicyNo ;
	private String customerid;
	public String getCustomerid() {
		return customerid;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getFathername() {
		return Fathername;
	}
	public void setFathername(String fathername) {
		Fathername = fathername;
	}
	public String getPartitionnumber() {
		return partitionnumber;
	}
	public void setPartitionnumber(String partitionnumber) {
		this.partitionnumber = partitionnumber;
	}
	public String getPolicyNo() {
		return PolicyNo;
	}
	public void setPolicyNo(String policyNo) {
		PolicyNo = policyNo;
	}
	public PolicyDetails(String name, String dob, String fathername, String partitionnumber, String policyNo) {
		super();
		this.name = name;
		this.dob = dob;
		Fathername = fathername;
		this.partitionnumber = partitionnumber;
		PolicyNo = policyNo;
	}
	public PolicyDetails() {
		super();
	}
	@Override
	public String toString() {
		return "PolicyDetails [name=" + name + ", dob=" + dob + ", Fathername=" + Fathername + ", partitionnumber="
				+ partitionnumber + ", PolicyNo=" + PolicyNo + ", customerid=" + customerid + "]";
	}
	
	
	
	
}
