package com.xk.pojo;

import java.util.Date;
/**
 * table name:  backend_user
 * author name: mj
 * create time: 2022-01-23 18:57:31
 */ 
public class BackendUser{

	private Integer id;
	private String userCode;
	private String userName;
	private Integer userType;
	private Integer createdBy;
	private String creationDate;
	private Integer modifyBy;
	private String modifyDate;
	private String userPassword;

	public void setId(Integer id){
		this.id=id;
	}
	public Integer getId(){
		return id;
	}
	public void setUserCode(String userCode){
		this.userCode=userCode;
	}
	public String getUserCode(){
		return userCode;
	}
	public void setUserName(String userName){
		this.userName=userName;
	}
	public String getUserName(){
		return userName;
	}
	public void setUserType(Integer userType){
		this.userType=userType;
	}
	public Integer getUserType(){
		return userType;
	}
	public void setCreatedBy(Integer createdBy){
		this.createdBy=createdBy;
	}
	public Integer getCreatedBy(){
		return createdBy;
	}
	public void setCreationDate(String creationDate){
		this.creationDate=creationDate;
	}
	public String getCreationDate(){
		return creationDate;
	}
	public void setModifyBy(Integer modifyBy){
		this.modifyBy=modifyBy;
	}
	public Integer getModifyBy(){
		return modifyBy;
	}
	public void setModifyDate(String modifyDate){
		this.modifyDate=modifyDate;
	}
	public String getModifyDate(){
		return modifyDate;
	}
	public void setUserPassword(String userPassword){
		this.userPassword=userPassword;
	}
	public String getUserPassword(){
		return userPassword;
	}
}

