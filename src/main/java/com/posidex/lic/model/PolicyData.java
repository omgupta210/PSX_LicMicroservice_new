package com.posidex.lic.model;
import java.sql.Date;

public class PolicyData {

	private String  clnname ;           
	private Date  clndobdoi; 
	private String  relationname ; 
	private String  partitionnumber ;
	private String  custunqid ;  
	private String customerid ;
	public String getClnname() {
		return clnname;
	}
	public void setClnname(String clnname) {
		this.clnname = clnname;
	}
	public Date getClndobdoi() {
		return clndobdoi;
	}
	public void setClndobdoi(Date clndobdoi) {
		this.clndobdoi = clndobdoi;
	}
	public String getRelationname() {
		return relationname;
	}
	public void setRelationname(String relationname) {
		this.relationname = relationname;
	}
	public String getPartitionnumber() {
		return partitionnumber;
	}
	public void setPartitionnumber(String partitionnumber) {
		this.partitionnumber = partitionnumber;
	}
	public String getCustunqid() {
		return custunqid;
	}
	public void setCustunqid(String custunqid) {
		this.custunqid = custunqid;
	}
	public String getCustomerid() {
		return customerid;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
	@Override
	public String toString() {
		return "PolicyData [clnname=" + clnname + ", clndobdoi=" + clndobdoi + ", relationname=" + relationname
				+ ", partitionnumber=" + partitionnumber + ", custunqid=" + custunqid + ", customerid=" + customerid
				+ "]";
	}
	
	
	
}
