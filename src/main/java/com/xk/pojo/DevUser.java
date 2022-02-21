package com.xk.pojo;

import java.util.Date;
/**
 * table name:  dev_user
 * author name: mj
 * create time: 2022-01-23 18:57:31
 */ 
public class DevUser{

	private Integer id;
	private String devCode;
	private String devName;
	private String devPassword;
	private String devEmail;
	private String devInfo;
	private Integer createdBy;
	private String creationDate;
	private Integer modifyBy;
	private String modifyDate;

	public void setId(Integer id){
		this.id=id;
	}
	public Integer getId(){
		return id;
	}
	public void setDevCode(String devCode){
		this.devCode=devCode;
	}
	public String getDevCode(){
		return devCode;
	}
	public void setDevName(String devName){
		this.devName=devName;
	}
	public String getDevName(){
		return devName;
	}
	public void setDevPassword(String devPassword){
		this.devPassword=devPassword;
	}
	public String getDevPassword(){
		return devPassword;
	}
	public void setDevEmail(String devEmail){
		this.devEmail=devEmail;
	}
	public String getDevEmail(){
		return devEmail;
	}
	public void setDevInfo(String devInfo){
		this.devInfo=devInfo;
	}
	public String getDevInfo(){
		return devInfo;
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
}

