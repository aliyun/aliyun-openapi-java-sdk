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
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class RequestDemandReverseRequest extends RpcAcsRequest<RequestDemandReverseResponse> {
	   

	private Long demandId;

	@SerializedName("dataList")
	private List<DataList> dataList;
	public RequestDemandReverseRequest() {
		super("brinekingdom", "2019-06-27", "RequestDemandReverse");
		setMethod(MethodType.POST);
	}

	public Long getDemandId() {
		return this.demandId;
	}

	public void setDemandId(Long demandId) {
		this.demandId = demandId;
		if(demandId != null){
			putQueryParameter("DemandId", demandId.toString());
		}
	}

	public List<DataList> getDataList() {
		return this.dataList;
	}

	public void setDataList(List<DataList> dataList) {
		this.dataList = dataList;	
		if (dataList != null) {
			putQueryParameter("DataList" , new Gson().toJson(dataList));
		}	
	}

	public static class DataList {

		@SerializedName("Country")
		private String country;

		@SerializedName("ClassZoneCode")
		private String classZoneCode;

		@SerializedName("ProjectCode")
		private String projectCode;

		@SerializedName("Product2")
		private String product2;

		@SerializedName("Product1")
		private String product1;

		@SerializedName("Nic")
		private String nic;

		@SerializedName("BusinessModeName")
		private String businessModeName;

		@SerializedName("LogicZoneCode")
		private String logicZoneCode;

		@SerializedName("PlanType")
		private Integer planType;

		@SerializedName("Product3")
		private String product3;

		@SerializedName("MachineType")
		private String machineType;

		@SerializedName("BusinessMode")
		private String businessMode;

		@SerializedName("HighCnt")
		private Integer highCnt;

		@SerializedName("SafeZoneName")
		private String safeZoneName;

		@SerializedName("LogicZoneName")
		private String logicZoneName;

		@SerializedName("Id")
		private Long id;

		@SerializedName("AssetReceiverNick")
		private String assetReceiverNick;

		@SerializedName("Azone")
		private String azone;

		@SerializedName("OsName")
		private String osName;

		@SerializedName("SubLine")
		private String subLine;

		@SerializedName("ReverseType")
		private String reverseType;

		@SerializedName("ProjectTypeName")
		private String projectTypeName;

		@SerializedName("CbmDemander")
		private String cbmDemander;

		@SerializedName("ProjectName")
		private String projectName;

		@SerializedName("NetArch")
		private String netArch;

		@SerializedName("Product3Name")
		private String product3Name;

		@SerializedName("NewPlanId")
		private Long newPlanId;

		@SerializedName("ManufacturerBrand")
		private Long manufacturerBrand;

		@SerializedName("AssetReceiver")
		private String assetReceiver;

		@SerializedName("LadingStatus")
		private Integer ladingStatus;

		@SerializedName("Priority")
		private String priority;

		@SerializedName("DemandStatus")
		private Integer demandStatus;

		@SerializedName("AppGroupName")
		private String appGroupName;

		@SerializedName("RequireType")
		private String requireType;

		@SerializedName("ClassZoneName")
		private String classZoneName;

		@SerializedName("Install")
		private Integer install;

		@SerializedName("CmC")
		private String cmC;

		@SerializedName("BusinessName")
		private String businessName;

		@SerializedName("OutId")
		private String outId;

		@SerializedName("ModelLoad")
		private Integer modelLoad;

		@SerializedName("Region")
		private String region;

		@SerializedName("ScStatus")
		private String scStatus;

		@SerializedName("Product1Name")
		private String product1Name;

		@SerializedName("ReverseStatus")
		private String reverseStatus;

		@SerializedName("StockStatus")
		private String stockStatus;

		@SerializedName("CmP")
		private String cmP;

		@SerializedName("CmU")
		private String cmU;

		@SerializedName("OsId")
		private Long osId;

		@SerializedName("ManufacturerBrandName")
		private String manufacturerBrandName;

		@SerializedName("Error")
		private String error;

		@SerializedName("CmV")
		private String cmV;

		@SerializedName("InstallId")
		private Long installId;

		@SerializedName("QuotaPlanId")
		private Long quotaPlanId;

		@SerializedName("CloudDeployProduct1Name")
		private String cloudDeployProduct1Name;

		@SerializedName("DcosStatus")
		private String dcosStatus;

		@SerializedName("Product2Name")
		private String product2Name;

		@SerializedName("RequireTypeName")
		private String requireTypeName;

		@SerializedName("Scenario")
		private String scenario;

		@SerializedName("NakedDelivery")
		private Integer nakedDelivery;

		@SerializedName("CloudDeployProduct3")
		private String cloudDeployProduct3;

		@SerializedName("ProjectType")
		private String projectType;

		@SerializedName("SubLineName")
		private String subLineName;

		@SerializedName("AppGroupId")
		private Long appGroupId;

		@SerializedName("PlanChangeReason")
		private String planChangeReason;

		@SerializedName("Creator")
		private String creator;

		@SerializedName("Business")
		private String business;

		@SerializedName("Org")
		private String org;

		@SerializedName("Cnt")
		private Integer cnt;

		@SerializedName("InstallName")
		private String installName;

		@SerializedName("CreatorNic")
		private String creatorNic;

		@SerializedName("SafeZoneCode")
		private String safeZoneCode;

		@SerializedName("TimeStr")
		private String timeStr;

		@SerializedName("CloudDeployProduct2Name")
		private String cloudDeployProduct2Name;

		@SerializedName("BenefitOld")
		private Integer benefitOld;

		@SerializedName("OriginId")
		private Long originId;

		@SerializedName("SafeYear")
		private String safeYear;

		@SerializedName("AddStatus")
		private String addStatus;

		@SerializedName("ProcessId")
		private String processId;

		@SerializedName("Comment")
		private String comment;

		@SerializedName("RoomCode")
		private String roomCode;

		@SerializedName("CloudDeployProduct3Name")
		private String cloudDeployProduct3Name;

		public String getCountry() {
			return this.country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public String getClassZoneCode() {
			return this.classZoneCode;
		}

		public void setClassZoneCode(String classZoneCode) {
			this.classZoneCode = classZoneCode;
		}

		public String getProjectCode() {
			return this.projectCode;
		}

		public void setProjectCode(String projectCode) {
			this.projectCode = projectCode;
		}

		public String getProduct2() {
			return this.product2;
		}

		public void setProduct2(String product2) {
			this.product2 = product2;
		}

		public String getProduct1() {
			return this.product1;
		}

		public void setProduct1(String product1) {
			this.product1 = product1;
		}

		public String getNic() {
			return this.nic;
		}

		public void setNic(String nic) {
			this.nic = nic;
		}

		public String getBusinessModeName() {
			return this.businessModeName;
		}

		public void setBusinessModeName(String businessModeName) {
			this.businessModeName = businessModeName;
		}

		public String getLogicZoneCode() {
			return this.logicZoneCode;
		}

		public void setLogicZoneCode(String logicZoneCode) {
			this.logicZoneCode = logicZoneCode;
		}

		public Integer getPlanType() {
			return this.planType;
		}

		public void setPlanType(Integer planType) {
			this.planType = planType;
		}

		public String getProduct3() {
			return this.product3;
		}

		public void setProduct3(String product3) {
			this.product3 = product3;
		}

		public String getMachineType() {
			return this.machineType;
		}

		public void setMachineType(String machineType) {
			this.machineType = machineType;
		}

		public String getBusinessMode() {
			return this.businessMode;
		}

		public void setBusinessMode(String businessMode) {
			this.businessMode = businessMode;
		}

		public Integer getHighCnt() {
			return this.highCnt;
		}

		public void setHighCnt(Integer highCnt) {
			this.highCnt = highCnt;
		}

		public String getSafeZoneName() {
			return this.safeZoneName;
		}

		public void setSafeZoneName(String safeZoneName) {
			this.safeZoneName = safeZoneName;
		}

		public String getLogicZoneName() {
			return this.logicZoneName;
		}

		public void setLogicZoneName(String logicZoneName) {
			this.logicZoneName = logicZoneName;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getAssetReceiverNick() {
			return this.assetReceiverNick;
		}

		public void setAssetReceiverNick(String assetReceiverNick) {
			this.assetReceiverNick = assetReceiverNick;
		}

		public String getAzone() {
			return this.azone;
		}

		public void setAzone(String azone) {
			this.azone = azone;
		}

		public String getOsName() {
			return this.osName;
		}

		public void setOsName(String osName) {
			this.osName = osName;
		}

		public String getSubLine() {
			return this.subLine;
		}

		public void setSubLine(String subLine) {
			this.subLine = subLine;
		}

		public String getReverseType() {
			return this.reverseType;
		}

		public void setReverseType(String reverseType) {
			this.reverseType = reverseType;
		}

		public String getProjectTypeName() {
			return this.projectTypeName;
		}

		public void setProjectTypeName(String projectTypeName) {
			this.projectTypeName = projectTypeName;
		}

		public String getCbmDemander() {
			return this.cbmDemander;
		}

		public void setCbmDemander(String cbmDemander) {
			this.cbmDemander = cbmDemander;
		}

		public String getProjectName() {
			return this.projectName;
		}

		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}

		public String getNetArch() {
			return this.netArch;
		}

		public void setNetArch(String netArch) {
			this.netArch = netArch;
		}

		public String getProduct3Name() {
			return this.product3Name;
		}

		public void setProduct3Name(String product3Name) {
			this.product3Name = product3Name;
		}

		public Long getNewPlanId() {
			return this.newPlanId;
		}

		public void setNewPlanId(Long newPlanId) {
			this.newPlanId = newPlanId;
		}

		public Long getManufacturerBrand() {
			return this.manufacturerBrand;
		}

		public void setManufacturerBrand(Long manufacturerBrand) {
			this.manufacturerBrand = manufacturerBrand;
		}

		public String getAssetReceiver() {
			return this.assetReceiver;
		}

		public void setAssetReceiver(String assetReceiver) {
			this.assetReceiver = assetReceiver;
		}

		public Integer getLadingStatus() {
			return this.ladingStatus;
		}

		public void setLadingStatus(Integer ladingStatus) {
			this.ladingStatus = ladingStatus;
		}

		public String getPriority() {
			return this.priority;
		}

		public void setPriority(String priority) {
			this.priority = priority;
		}

		public Integer getDemandStatus() {
			return this.demandStatus;
		}

		public void setDemandStatus(Integer demandStatus) {
			this.demandStatus = demandStatus;
		}

		public String getAppGroupName() {
			return this.appGroupName;
		}

		public void setAppGroupName(String appGroupName) {
			this.appGroupName = appGroupName;
		}

		public String getRequireType() {
			return this.requireType;
		}

		public void setRequireType(String requireType) {
			this.requireType = requireType;
		}

		public String getClassZoneName() {
			return this.classZoneName;
		}

		public void setClassZoneName(String classZoneName) {
			this.classZoneName = classZoneName;
		}

		public Integer getInstall() {
			return this.install;
		}

		public void setInstall(Integer install) {
			this.install = install;
		}

		public String getCmC() {
			return this.cmC;
		}

		public void setCmC(String cmC) {
			this.cmC = cmC;
		}

		public String getBusinessName() {
			return this.businessName;
		}

		public void setBusinessName(String businessName) {
			this.businessName = businessName;
		}

		public String getOutId() {
			return this.outId;
		}

		public void setOutId(String outId) {
			this.outId = outId;
		}

		public Integer getModelLoad() {
			return this.modelLoad;
		}

		public void setModelLoad(Integer modelLoad) {
			this.modelLoad = modelLoad;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getScStatus() {
			return this.scStatus;
		}

		public void setScStatus(String scStatus) {
			this.scStatus = scStatus;
		}

		public String getProduct1Name() {
			return this.product1Name;
		}

		public void setProduct1Name(String product1Name) {
			this.product1Name = product1Name;
		}

		public String getReverseStatus() {
			return this.reverseStatus;
		}

		public void setReverseStatus(String reverseStatus) {
			this.reverseStatus = reverseStatus;
		}

		public String getStockStatus() {
			return this.stockStatus;
		}

		public void setStockStatus(String stockStatus) {
			this.stockStatus = stockStatus;
		}

		public String getCmP() {
			return this.cmP;
		}

		public void setCmP(String cmP) {
			this.cmP = cmP;
		}

		public String getCmU() {
			return this.cmU;
		}

		public void setCmU(String cmU) {
			this.cmU = cmU;
		}

		public Long getOsId() {
			return this.osId;
		}

		public void setOsId(Long osId) {
			this.osId = osId;
		}

		public String getManufacturerBrandName() {
			return this.manufacturerBrandName;
		}

		public void setManufacturerBrandName(String manufacturerBrandName) {
			this.manufacturerBrandName = manufacturerBrandName;
		}

		public String getError() {
			return this.error;
		}

		public void setError(String error) {
			this.error = error;
		}

		public String getCmV() {
			return this.cmV;
		}

		public void setCmV(String cmV) {
			this.cmV = cmV;
		}

		public Long getInstallId() {
			return this.installId;
		}

		public void setInstallId(Long installId) {
			this.installId = installId;
		}

		public Long getQuotaPlanId() {
			return this.quotaPlanId;
		}

		public void setQuotaPlanId(Long quotaPlanId) {
			this.quotaPlanId = quotaPlanId;
		}

		public String getCloudDeployProduct1Name() {
			return this.cloudDeployProduct1Name;
		}

		public void setCloudDeployProduct1Name(String cloudDeployProduct1Name) {
			this.cloudDeployProduct1Name = cloudDeployProduct1Name;
		}

		public String getDcosStatus() {
			return this.dcosStatus;
		}

		public void setDcosStatus(String dcosStatus) {
			this.dcosStatus = dcosStatus;
		}

		public String getProduct2Name() {
			return this.product2Name;
		}

		public void setProduct2Name(String product2Name) {
			this.product2Name = product2Name;
		}

		public String getRequireTypeName() {
			return this.requireTypeName;
		}

		public void setRequireTypeName(String requireTypeName) {
			this.requireTypeName = requireTypeName;
		}

		public String getScenario() {
			return this.scenario;
		}

		public void setScenario(String scenario) {
			this.scenario = scenario;
		}

		public Integer getNakedDelivery() {
			return this.nakedDelivery;
		}

		public void setNakedDelivery(Integer nakedDelivery) {
			this.nakedDelivery = nakedDelivery;
		}

		public String getCloudDeployProduct3() {
			return this.cloudDeployProduct3;
		}

		public void setCloudDeployProduct3(String cloudDeployProduct3) {
			this.cloudDeployProduct3 = cloudDeployProduct3;
		}

		public String getProjectType() {
			return this.projectType;
		}

		public void setProjectType(String projectType) {
			this.projectType = projectType;
		}

		public String getSubLineName() {
			return this.subLineName;
		}

		public void setSubLineName(String subLineName) {
			this.subLineName = subLineName;
		}

		public Long getAppGroupId() {
			return this.appGroupId;
		}

		public void setAppGroupId(Long appGroupId) {
			this.appGroupId = appGroupId;
		}

		public String getPlanChangeReason() {
			return this.planChangeReason;
		}

		public void setPlanChangeReason(String planChangeReason) {
			this.planChangeReason = planChangeReason;
		}

		public String getCreator() {
			return this.creator;
		}

		public void setCreator(String creator) {
			this.creator = creator;
		}

		public String getBusiness() {
			return this.business;
		}

		public void setBusiness(String business) {
			this.business = business;
		}

		public String getOrg() {
			return this.org;
		}

		public void setOrg(String org) {
			this.org = org;
		}

		public Integer getCnt() {
			return this.cnt;
		}

		public void setCnt(Integer cnt) {
			this.cnt = cnt;
		}

		public String getInstallName() {
			return this.installName;
		}

		public void setInstallName(String installName) {
			this.installName = installName;
		}

		public String getCreatorNic() {
			return this.creatorNic;
		}

		public void setCreatorNic(String creatorNic) {
			this.creatorNic = creatorNic;
		}

		public String getSafeZoneCode() {
			return this.safeZoneCode;
		}

		public void setSafeZoneCode(String safeZoneCode) {
			this.safeZoneCode = safeZoneCode;
		}

		public String getTimeStr() {
			return this.timeStr;
		}

		public void setTimeStr(String timeStr) {
			this.timeStr = timeStr;
		}

		public String getCloudDeployProduct2Name() {
			return this.cloudDeployProduct2Name;
		}

		public void setCloudDeployProduct2Name(String cloudDeployProduct2Name) {
			this.cloudDeployProduct2Name = cloudDeployProduct2Name;
		}

		public Integer getBenefitOld() {
			return this.benefitOld;
		}

		public void setBenefitOld(Integer benefitOld) {
			this.benefitOld = benefitOld;
		}

		public Long getOriginId() {
			return this.originId;
		}

		public void setOriginId(Long originId) {
			this.originId = originId;
		}

		public String getSafeYear() {
			return this.safeYear;
		}

		public void setSafeYear(String safeYear) {
			this.safeYear = safeYear;
		}

		public String getAddStatus() {
			return this.addStatus;
		}

		public void setAddStatus(String addStatus) {
			this.addStatus = addStatus;
		}

		public String getProcessId() {
			return this.processId;
		}

		public void setProcessId(String processId) {
			this.processId = processId;
		}

		public String getComment() {
			return this.comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public String getRoomCode() {
			return this.roomCode;
		}

		public void setRoomCode(String roomCode) {
			this.roomCode = roomCode;
		}

		public String getCloudDeployProduct3Name() {
			return this.cloudDeployProduct3Name;
		}

		public void setCloudDeployProduct3Name(String cloudDeployProduct3Name) {
			this.cloudDeployProduct3Name = cloudDeployProduct3Name;
		}
	}

	@Override
	public Class<RequestDemandReverseResponse> getResponseClass() {
		return RequestDemandReverseResponse.class;
	}

}
