package com.posidex.lic.model;

public enum ErrorCode {
	
	
	PIR("Request.policyno.empty","policy no should not be empty"),
	CIR("Request.cutomerid.empty","customerid should not be empty"),
	RNF("Record.Not.Found","Record not found"),
	WDS("Wrong.Data.Stored","Please check the record store in the database");

	

	private String messageKey;
	private String abbreviation;

	private ErrorCode(String messageKey, String abbreviation) {
		this.messageKey = messageKey;
		this.abbreviation = abbreviation;
	}


	public String getMessageKey() {
		return messageKey;
	}


	public void setMessageKey(String messageKey) {
		this.messageKey = messageKey;
	}


	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

}
