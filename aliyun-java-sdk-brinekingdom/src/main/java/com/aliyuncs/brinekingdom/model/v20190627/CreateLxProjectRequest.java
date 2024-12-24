/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.brinekingdom.model.v20190627;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateLxProjectRequest extends RpcAcsRequest<CreateLxProjectResponse> {
	   

	private String area;

	private String demanderId;

	private String scProjectNo;

	private String sourceNumber;

	private String remark;

	private Long isStanderProcess;

	private String projectSource;

	private String userId;

	@SerializedName("lxWiringDetail")
	private List<LxWiringDetail> lxWiringDetail;

	@SerializedName("siteCode")
	private List<String> siteCode;

	private String deliveryTime;

	private String sourceSystemUrl;

	private String constructionTeam;

	private String initWiringUrl;

	private String sourceType;

	private String cancelProjectUrl;

	private String wiringDoneNotifyUrl;

	private String systemSource;
	public CreateLxProjectRequest() {
		super("brinekingdom", "2019-06-27", "CreateLxProject");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getArea() {
		return this.area;
	}

	public void setArea(String area) {
		this.area = area;
		if(area != null){
			putQueryParameter("Area", area);
		}
	}

	public String getDemanderId() {
		return this.demanderId;
	}

	public void setDemanderId(String demanderId) {
		this.demanderId = demanderId;
		if(demanderId != null){
			putQueryParameter("DemanderId", demanderId);
		}
	}

	public String getScProjectNo() {
		return this.scProjectNo;
	}

	public void setScProjectNo(String scProjectNo) {
		this.scProjectNo = scProjectNo;
		if(scProjectNo != null){
			putQueryParameter("ScProjectNo", scProjectNo);
		}
	}

	public String getSourceNumber() {
		return this.sourceNumber;
	}

	public void setSourceNumber(String sourceNumber) {
		this.sourceNumber = sourceNumber;
		if(sourceNumber != null){
			putQueryParameter("SourceNumber", sourceNumber);
		}
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
		if(remark != null){
			putQueryParameter("Remark", remark);
		}
	}

	public Long getIsStanderProcess() {
		return this.isStanderProcess;
	}

	public void setIsStanderProcess(Long isStanderProcess) {
		this.isStanderProcess = isStanderProcess;
		if(isStanderProcess != null){
			putQueryParameter("IsStanderProcess", isStanderProcess.toString());
		}
	}

	public String getProjectSource() {
		return this.projectSource;
	}

	public void setProjectSource(String projectSource) {
		this.projectSource = projectSource;
		if(projectSource != null){
			putQueryParameter("ProjectSource", projectSource);
		}
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("UserId", userId);
		}
	}

	public List<LxWiringDetail> getLxWiringDetail() {
		return this.lxWiringDetail;
	}

	public void setLxWiringDetail(List<LxWiringDetail> lxWiringDetail) {
		this.lxWiringDetail = lxWiringDetail;	
		if (lxWiringDetail != null) {
			putQueryParameter("LxWiringDetail" , new Gson().toJson(lxWiringDetail));
		}	
	}

	public List<String> getSiteCode() {
		return this.siteCode;
	}

	public void setSiteCode(List<String> siteCode) {
		this.siteCode = siteCode;	
		if (siteCode != null) {
			putQueryParameter("SiteCode" , new Gson().toJson(siteCode));
		}	
	}

	public String getDeliveryTime() {
		return this.deliveryTime;
	}

	public void setDeliveryTime(String deliveryTime) {
		this.deliveryTime = deliveryTime;
		if(deliveryTime != null){
			putQueryParameter("DeliveryTime", deliveryTime);
		}
	}

	public String getSourceSystemUrl() {
		return this.sourceSystemUrl;
	}

	public void setSourceSystemUrl(String sourceSystemUrl) {
		this.sourceSystemUrl = sourceSystemUrl;
		if(sourceSystemUrl != null){
			putQueryParameter("SourceSystemUrl", sourceSystemUrl);
		}
	}

	public String getConstructionTeam() {
		return this.constructionTeam;
	}

	public void setConstructionTeam(String constructionTeam) {
		this.constructionTeam = constructionTeam;
		if(constructionTeam != null){
			putQueryParameter("ConstructionTeam", constructionTeam);
		}
	}

	public String getInitWiringUrl() {
		return this.initWiringUrl;
	}

	public void setInitWiringUrl(String initWiringUrl) {
		this.initWiringUrl = initWiringUrl;
		if(initWiringUrl != null){
			putQueryParameter("InitWiringUrl", initWiringUrl);
		}
	}

	public String getSourceType() {
		return this.sourceType;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
		if(sourceType != null){
			putQueryParameter("SourceType", sourceType);
		}
	}

	public String getCancelProjectUrl() {
		return this.cancelProjectUrl;
	}

	public void setCancelProjectUrl(String cancelProjectUrl) {
		this.cancelProjectUrl = cancelProjectUrl;
		if(cancelProjectUrl != null){
			putQueryParameter("CancelProjectUrl", cancelProjectUrl);
		}
	}

	public String getWiringDoneNotifyUrl() {
		return this.wiringDoneNotifyUrl;
	}

	public void setWiringDoneNotifyUrl(String wiringDoneNotifyUrl) {
		this.wiringDoneNotifyUrl = wiringDoneNotifyUrl;
		if(wiringDoneNotifyUrl != null){
			putQueryParameter("WiringDoneNotifyUrl", wiringDoneNotifyUrl);
		}
	}

	public String getSystemSource() {
		return this.systemSource;
	}

	public void setSystemSource(String systemSource) {
		this.systemSource = systemSource;
		if(systemSource != null){
			putQueryParameter("SystemSource", systemSource);
		}
	}

	public static class LxWiringDetail {

		@SerializedName("CableDetails")
		private String cableDetails;

		@SerializedName("InterfaceType")
		private String interfaceType;

		@SerializedName("AName")
		private String aName;

		@SerializedName("APort")
		private String aPort;

		@SerializedName("APosition")
		private String aPosition;

		@SerializedName("BPosition")
		private String bPosition;

		@SerializedName("Operator")
		private String operator;

		@SerializedName("SiteCode")
		private String siteCode;

		@SerializedName("ProjectNo")
		private String projectNo;

		@SerializedName("BName")
		private String bName;

		@SerializedName("BPort")
		private String bPort;

		@SerializedName("LengthDistance")
		private Long lengthDistance;

		@SerializedName("BSn")
		private String bSn;

		@SerializedName("ASn")
		private String aSn;

		public String getCableDetails() {
			return this.cableDetails;
		}

		public void setCableDetails(String cableDetails) {
			this.cableDetails = cableDetails;
		}

		public String getInterfaceType() {
			return this.interfaceType;
		}

		public void setInterfaceType(String interfaceType) {
			this.interfaceType = interfaceType;
		}

		public String getAName() {
			return this.aName;
		}

		public void setAName(String aName) {
			this.aName = aName;
		}

		public String getAPort() {
			return this.aPort;
		}

		public void setAPort(String aPort) {
			this.aPort = aPort;
		}

		public String getAPosition() {
			return this.aPosition;
		}

		public void setAPosition(String aPosition) {
			this.aPosition = aPosition;
		}

		public String getBPosition() {
			return this.bPosition;
		}

		public void setBPosition(String bPosition) {
			this.bPosition = bPosition;
		}

		public String getOperator() {
			return this.operator;
		}

		public void setOperator(String operator) {
			this.operator = operator;
		}

		public String getSiteCode() {
			return this.siteCode;
		}

		public void setSiteCode(String siteCode) {
			this.siteCode = siteCode;
		}

		public String getProjectNo() {
			return this.projectNo;
		}

		public void setProjectNo(String projectNo) {
			this.projectNo = projectNo;
		}

		public String getBName() {
			return this.bName;
		}

		public void setBName(String bName) {
			this.bName = bName;
		}

		public String getBPort() {
			return this.bPort;
		}

		public void setBPort(String bPort) {
			this.bPort = bPort;
		}

		public Long getLengthDistance() {
			return this.lengthDistance;
		}

		public void setLengthDistance(Long lengthDistance) {
			this.lengthDistance = lengthDistance;
		}

		public String getBSn() {
			return this.bSn;
		}

		public void setBSn(String bSn) {
			this.bSn = bSn;
		}

		public String getASn() {
			return this.aSn;
		}

		public void setASn(String aSn) {
			this.aSn = aSn;
		}
	}

	@Override
	public Class<CreateLxProjectResponse> getResponseClass() {
		return CreateLxProjectResponse.class;
	}

}
