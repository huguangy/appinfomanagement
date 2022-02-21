package com.xk.pojo;

import java.util.Date;
/**
 * table name:  app_version
 * author name: mj
 * create time: 2022-01-23 18:57:31
 */ 
public class AppVersion{

	private Integer id;
	private Integer appId;
	private String versionNo;
	private String versionInfo;
	private Integer publishStatus;
	private String downloadLink;
	private double versionSize;
	private Integer createdBy;
	private String creationDate;
	private Integer modifyBy;
	private String modifyDate;
	private String apkLocPath;
	private String apkFileName;
	private String softwareName;

	public String getSoftwareName() {
		return softwareName;
	}

	public void setSoftwareName(String softwareName) {
		this.softwareName = softwareName;
	}

	private DataDictionary dataPublishStatus;

	public DataDictionary getDataPublishStatus() {
		return dataPublishStatus;
	}

	public void setDataPublishStatus(DataDictionary dataPublishStatus) {
		this.dataPublishStatus = dataPublishStatus;
	}

	public void setId(Integer id){
		this.id=id;
	}
	public Integer getId(){
		return id;
	}
	public void setAppId(Integer appId){
		this.appId=appId;
	}
	public Integer getAppId(){
		return appId;
	}
	public void setVersionNo(String versionNo){
		this.versionNo=versionNo;
	}
	public String getVersionNo(){
		return versionNo;
	}
	public void setVersionInfo(String versionInfo){
		this.versionInfo=versionInfo;
	}
	public String getVersionInfo(){
		return versionInfo;
	}
	public void setPublishStatus(Integer publishStatus){
		this.publishStatus=publishStatus;
	}
	public Integer getPublishStatus(){
		return publishStatus;
	}
	public void setDownloadLink(String downloadLink){
		this.downloadLink=downloadLink;
	}
	public String getDownloadLink(){
		return downloadLink;
	}
	public void setVersionSize(double versionSize){
		this.versionSize=versionSize;
	}
	public double getVersionSize(){
		return versionSize;
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
	public void setApkLocPath(String apkLocPath){
		this.apkLocPath=apkLocPath;
	}
	public String getApkLocPath(){
		return apkLocPath;
	}
	public void setApkFileName(String apkFileName){
		this.apkFileName=apkFileName;
	}
	public String getApkFileName(){
		return apkFileName;
	}


	@Override
	public String toString() {
		return "AppVersion{" +
				"id=" + id +
				", appId=" + appId +
				", versionNo='" + versionNo + '\'' +
				", versionInfo='" + versionInfo + '\'' +
				", publishStatus=" + publishStatus +
				", downloadLink='" + downloadLink + '\'' +
				", versionSize=" + versionSize +
				", createdBy=" + createdBy +
				", creationDate='" + creationDate + '\'' +
				", modifyBy=" + modifyBy +
				", modifyDate='" + modifyDate + '\'' +
				", apkLocPath='" + apkLocPath + '\'' +
				", apkFileName='" + apkFileName + '\'' +
				", dataPublishStatus=" + dataPublishStatus +
				'}';
	}
}

