package com.xk.pojo;

import java.util.Date;
/**
 * table name:  app_info
 * author name: mj
 * create time: 2022-01-23 18:57:31
 */ 
public class AppInfo{

	private Integer id;//id
	private String softwareName;//名称
	private String apkName;
	private String supportROM;
	private String interfaceLanguage;
	private double softwareSize;
	private String updateDate;
	private Integer devId;
	private String appInfo;
	private Integer status;
	private String onSaleDate;
	private String offSaleDate;
	private Integer flatformId;
	private Integer categoryLevel3;
	private Integer downloads;
	private Integer createdBy;
	private String creationDate;
	private Integer modifyBy;
	private String modifyDate;
	private Integer categoryLevel1;
	private Integer categoryLevel2;
	private String logoPicPath;
	private String logoLocPath;
	private Integer versionId;

	private DataDictionary flatform;
	private DataDictionary appStatus;

	private AppCategory categoryA;
	private AppCategory categoryB;
	private AppCategory categoryC;

	private AppVersion appVersion;

	public AppVersion getAppVersion() {
		return appVersion;
	}

	public void setAppVersion(AppVersion appVersion) {
		this.appVersion = appVersion;
	}

	public DataDictionary getFlatform() {
		return flatform;
	}

	public void setFlatform(DataDictionary flatform) {
		this.flatform = flatform;
	}

	public DataDictionary getAppStatus() {
		return appStatus;
	}

	public void setAppStatus(DataDictionary appStatus) {
		this.appStatus = appStatus;
	}

	public AppCategory getCategoryA() {
		return categoryA;
	}

	public void setCategoryA(AppCategory categoryA) {
		this.categoryA = categoryA;
	}

	public AppCategory getCategoryB() {
		return categoryB;
	}

	public void setCategoryB(AppCategory categoryB) {
		this.categoryB = categoryB;
	}

	public AppCategory getCategoryC() {
		return categoryC;
	}

	public void setCategoryC(AppCategory categoryC) {
		this.categoryC = categoryC;
	}

	public void setId(Integer id){
		this.id=id;
	}
	public Integer getId(){
		return id;
	}
	public void setSoftwareName(String softwareName){
		this.softwareName=softwareName;
	}
	public String getSoftwareName(){
		return softwareName;
	}

	public String getApkName() {
		return apkName;
	}

	public void setApkName(String apkName) {
		this.apkName = apkName;
	}

	public void setSupportROM(String supportROM){
		this.supportROM=supportROM;
	}
	public String getSupportROM(){
		return supportROM;
	}
	public void setInterfaceLanguage(String interfaceLanguage){
		this.interfaceLanguage=interfaceLanguage;
	}
	public String getInterfaceLanguage(){
		return interfaceLanguage;
	}
	public void setSoftwareSize(double softwareSize){
		this.softwareSize=softwareSize;
	}
	public double getSoftwareSize(){
		return softwareSize;
	}
	public void setUpdateDate(String updateDate){
		this.updateDate=updateDate;
	}
	public String getUpdateDate(){
		return updateDate;
	}
	public void setDevId(Integer devId){
		this.devId=devId;
	}
	public Integer getDevId(){
		return devId;
	}
	public void setAppInfo(String appInfo){
		this.appInfo=appInfo;
	}
	public String getAppInfo(){
		return appInfo;
	}
	public void setStatus(Integer status){
		this.status=status;
	}
	public Integer getStatus(){
		return status;
	}
	public void setOnSaleDate(String onSaleDate){
		this.onSaleDate=onSaleDate;
	}
	public String getOnSaleDate(){
		return onSaleDate;
	}
	public void setOffSaleDate(String offSaleDate){
		this.offSaleDate=offSaleDate;
	}
	public String getOffSaleDate(){
		return offSaleDate;
	}
	public void setFlatformId(Integer flatformId){
		this.flatformId=flatformId;
	}
	public Integer getFlatformId(){
		return flatformId;
	}
	public void setCategoryLevel3(Integer categoryLevel3){
		this.categoryLevel3=categoryLevel3;
	}
	public Integer getCategoryLevel3(){
		return categoryLevel3;
	}
	public void setDownloads(Integer downloads){
		this.downloads=downloads;
	}
	public Integer getDownloads(){
		return downloads;
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
	public void setCategoryLevel1(Integer categoryLevel1){
		this.categoryLevel1=categoryLevel1;
	}
	public Integer getCategoryLevel1(){
		return categoryLevel1;
	}
	public void setCategoryLevel2(Integer categoryLevel2){
		this.categoryLevel2=categoryLevel2;
	}
	public Integer getCategoryLevel2(){
		return categoryLevel2;
	}
	public void setLogoPicPath(String logoPicPath){
		this.logoPicPath=logoPicPath;
	}
	public String getLogoPicPath(){
		return logoPicPath;
	}
	public void setLogoLocPath(String logoLocPath){
		this.logoLocPath=logoLocPath;
	}
	public String getLogoLocPath(){
		return logoLocPath;
	}
	public void setVersionId(Integer versionId){
		this.versionId=versionId;
	}
	public Integer getVersionId(){
		return versionId;
	}

	@Override
	public String toString() {
		return "AppInfo{" +
				"id=" + id +
				", softwareName='" + softwareName + '\'' +
				", apkName='" + apkName + '\'' +
				", supportROM='" + supportROM + '\'' +
				", interfaceLanguage='" + interfaceLanguage + '\'' +
				", softwareSize=" + softwareSize +
				", updateDate='" + updateDate + '\'' +
				", devId=" + devId +
				", appInfo='" + appInfo + '\'' +
				", status=" + status +
				", onSaleDate='" + onSaleDate + '\'' +
				", offSaleDate='" + offSaleDate + '\'' +
				", flatformId=" + flatformId +
				", categoryLevel3=" + categoryLevel3 +
				", downloads=" + downloads +
				", createdBy=" + createdBy +
				", creationDate='" + creationDate + '\'' +
				", modifyBy=" + modifyBy +
				", modifyDate='" + modifyDate + '\'' +
				", categoryLevel1=" + categoryLevel1 +
				", categoryLevel2=" + categoryLevel2 +
				", logoPicPath='" + logoPicPath + '\'' +
				", logoLocPath='" + logoLocPath + '\'' +
				", versionId=" + versionId +
				", flatform=" + flatform +
				", appStatus=" + appStatus +
				", categoryA=" + categoryA +
				", categoryB=" + categoryB +
				", categoryC=" + categoryC +
				", appVersion=" + appVersion +
				'}';
	}
}

