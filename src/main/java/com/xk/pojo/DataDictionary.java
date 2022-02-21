package com.xk.pojo;

import java.util.Date;
/**
 * table name:  data_dictionary
 * author name: mj
 * create time: 2022-01-23 18:57:31
 */ 
public class DataDictionary{

	private Integer id;
	private String typeCode;
	private String typeName;
	private Integer valueId;
	private String valueName;
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
	public void setTypeCode(String typeCode){
		this.typeCode=typeCode;
	}
	public String getTypeCode(){
		return typeCode;
	}
	public void setTypeName(String typeName){
		this.typeName=typeName;
	}
	public String getTypeName(){
		return typeName;
	}
	public void setValueId(Integer valueId){
		this.valueId=valueId;
	}
	public Integer getValueId(){
		return valueId;
	}
	public void setValueName(String valueName){
		this.valueName=valueName;
	}
	public String getValueName(){
		return valueName;
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

