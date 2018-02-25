package com.ecom.common.model;

import java.io.Serializable;

public class CommonResponse implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String   statusMsg;
    private Integer  statusCode;
    private Object   objectData;
	public String getStatusMsg() {
		return statusMsg;
	}
	public void setStatusMsg(String statusMsg) {
		this.statusMsg = statusMsg;
	}
	public Integer getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}
	public Object getObjectData() {
		return objectData;
	}
	public void setObjectData(Object objectData) {
		this.objectData = objectData;
	}
	
	@Override
	public String toString() {
		return "CommonResponse [statusMsg=" + statusMsg + ", statusCode=" + statusCode + ", objectData=" + objectData
				+ "]";
	}
	
	public CommonResponse(String statusMsg, Integer statusCode, Object objectData) {
		super();
		this.statusMsg = statusMsg;
		this.statusCode = statusCode;
		this.objectData = objectData;
	}
	
	public CommonResponse() {
		super();
	}   
}
