package com.ecom.common.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ad_operation_master")
public class Operation implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer opId;
	
	@Column
	private Date opDate;
	
	@Column
	private String opName;
	
	@Column
	private String opType;
	
	@Column
	private String opTableName;
	
	@Column
	private String opUsername;
	
	@Column
	private String fkOpUserId;
	
	@Column
	private String opRowPrimaryKey;
	
	@Column
	private String opDescription;

	public Integer getOpId() {
		return opId;
	}

	public void setOpId(Integer opId) {
		this.opId = opId;
	}

	public Date getOpDate() {
		return opDate;
	}

	public void setOpDate(Date opDate) {
		this.opDate = opDate;
	}

	public String getOpName() {
		return opName;
	}

	public void setOpName(String opName) {
		this.opName = opName;
	}

	public String getOpType() {
		return opType;
	}

	public void setOpType(String opType) {
		this.opType = opType;
	}

	public String getOpTableName() {
		return opTableName;
	}

	public void setOpTableName(String opTableName) {
		this.opTableName = opTableName;
	}

	public String getOpUsername() {
		return opUsername;
	}

	public void setOpUsername(String opUsername) {
		this.opUsername = opUsername;
	}

	public String getFkOpUserId() {
		return fkOpUserId;
	}

	public void setFkOpUserId(String fkOpUserId) {
		this.fkOpUserId = fkOpUserId;
	}

	public String getOpRowPrimaryKey() {
		return opRowPrimaryKey;
	}

	public void setOpRowPrimaryKey(String opRowPrimaryKey) {
		this.opRowPrimaryKey = opRowPrimaryKey;
	}

	public String getOpDescription() {
		return opDescription;
	}

	public void setOpDescription(String opDescription) {
		this.opDescription = opDescription;
	}

	

}
