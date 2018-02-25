package com.ecom.common.model;

import java.sql.Blob;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="ad_user_master")
public class UserModel {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer userId;
	
	@Column
	private String  operationDate;
	
	@Column
	private Integer opBrachId;
	
	@Column
	private Integer opDeptId;
	
	@Column
	private Integer fkEntityId;
	
	@Column(unique=true,nullable=false,length=30)
	private String  userName;
	
	@Column(length=30,nullable=false)
	private String  userFirstName;
	
	@Column(length=30,nullable=false)
	private String  userLastName;
	
	@Column(length=30,nullable=false)
	private String  currentPassword;
	
	@Column(length=30)
	private String  previousPassword;
	
	@Temporal(TemporalType.DATE)
	private Date  passChangeDate;
	
	@Temporal(TemporalType.DATE)
	private Date  lastLoginDate;
	
	@Temporal(TemporalType.DATE)
	private Date  lastLogoutDate;
	
	@Temporal(TemporalType.DATE)
	private Date  createDate;
	
	@Column
	private Integer fkDeptId;
	
	@Column(length=1)
	private String  employeeFlag;
	
	@Column
	private Integer fkEmpId;
	
	@Column(length=50)
	private String  userStatusDesc;
	
	@Column(length=30)
	private String  email1;
	
	@Column(length=30)
	private String  email2;
	
	@Lob
	private Blob   userPhoto;
	
	@Column(length=10)
	private String mobile1;
	
	@Column(length=10)
	private String mobile2;
	
	@Column(length=200)
	private String address;
	
	@Column
	private Integer operationId;
	
	@Column
	private Integer enterUserId;
	
	@Column(length=1,nullable=false)
	private String  activeFlag;
	
	@Column(length=1,nullable=false)
	private String  deleteFlag;
	
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getOperationDate() {
		return operationDate;
	}
	public void setOperationDate(String operationDate) {
		this.operationDate = operationDate;
	}
	public Integer getOpBrachId() {
		return opBrachId;
	}
	public void setOpBrachId(Integer opBrachId) {
		this.opBrachId = opBrachId;
	}
	public Integer getOpDeptId() {
		return opDeptId;
	}
	public void setOpDeptId(Integer opDeptId) {
		this.opDeptId = opDeptId;
	}
	public Integer getFkEntityId() {
		return fkEntityId;
	}
	public void setFkEntityId(Integer fkEntityId) {
		this.fkEntityId = fkEntityId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserFirstName() {
		return userFirstName;
	}
	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}
	public String getUserLastName() {
		return userLastName;
	}
	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}
	public String getCurrentPassword() {
		return currentPassword;
	}
	public void setCurrentPassword(String currentPassword) {
		this.currentPassword = currentPassword;
	}
	public String getPreviousPassword() {
		return previousPassword;
	}
	public void setPreviousPassword(String previousPassword) {
		this.previousPassword = previousPassword;
	}
	public Date getPassChangeDate() {
		return passChangeDate;
	}
	public void setPassChangeDate(Date passChangeDate) {
		this.passChangeDate = passChangeDate;
	}
	public Date getLastLoginDate() {
		return lastLoginDate;
	}
	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}
	public Date getLastLogoutDate() {
		return lastLogoutDate;
	}
	public void setLastLogoutDate(Date lastLogoutDate) {
		this.lastLogoutDate = lastLogoutDate;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Integer getFkDeptId() {
		return fkDeptId;
	}
	public void setFkDeptId(Integer fkDeptId) {
		this.fkDeptId = fkDeptId;
	}
	public String getEmployeeFlag() {
		return employeeFlag;
	}
	public void setEmployeeFlag(String employeeFlag) {
		this.employeeFlag = employeeFlag;
	}
	public Integer getFkEmpId() {
		return fkEmpId;
	}
	public void setFkEmpId(Integer fkEmpId) {
		this.fkEmpId = fkEmpId;
	}
	public String getUserStatusDesc() {
		return userStatusDesc;
	}
	public void setUserStatusDesc(String userStatusDesc) {
		this.userStatusDesc = userStatusDesc;
	}
	public String getEmail1() {
		return email1;
	}
	public void setEmail1(String email1) {
		this.email1 = email1;
	}
	public String getEmail2() {
		return email2;
	}
	public void setEmail2(String email2) {
		this.email2 = email2;
	}
	public Blob getUserPhoto() {
		return userPhoto;
	}
	public void setUserPhoto(Blob userPhoto) {
		this.userPhoto = userPhoto;
	}
	public String getMobile1() {
		return mobile1;
	}
	public void setMobile1(String mobile1) {
		this.mobile1 = mobile1;
	}
	public String getMobile2() {
		return mobile2;
	}
	public void setMobile2(String mobile2) {
		this.mobile2 = mobile2;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getOperationId() {
		return operationId;
	}
	public void setOperationId(Integer operationId) {
		this.operationId = operationId;
	}
	public Integer getEnterUserId() {
		return enterUserId;
	}
	public void setEnterUserId(Integer enterUserId) {
		this.enterUserId = enterUserId;
	}
	public String getActiveFlag() {
		return activeFlag;
	}
	public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
	}
	public String getDeleteFlag() {
		return deleteFlag;
	}
	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag;
	}
}
