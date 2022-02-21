package com.xk.pojo;

import java.util.Date;
/**
 * table name:  app_category
 * author name: mj
 * create time: 2022-01-23 18:57:31
 */ 
public class AppCategory{

	private Integer id;
	private String categoryCode;
	private String categoryName;
	private Integer parentId;
	private Integer createdBy;
	private String creationTime;
	private Integer modifyBy;
	private String modifyDate;

	public void setId(Integer id){
		this.id=id;
	}
	public Integer getId(){
		return id;
	}
	public void setCategoryCode(String categoryCode){
		this.categoryCode=categoryCode;
	}
	public String getCategoryCode(){
		return categoryCode;
	}
	public void setCategoryName(String categoryName){
		this.categoryName=categoryName;
	}
	public String getCategoryName(){
		return categoryName;
	}
	public void setParentId(Integer parentId){
		this.parentId=parentId;
	}
	public Integer getParentId(){
		return parentId;
	}
	public void setCreatedBy(Integer createdBy){
		this.createdBy=createdBy;
	}
	public Integer getCreatedBy(){
		return createdBy;
	}
	public void setCreationTime(String creationTime){
		this.creationTime=creationTime;
	}
	public String getCreationTime(){
		return creationTime;
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

