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
public class GetPlanListWithReverseRequest extends RpcAcsRequest<GetPlanListWithReverseResponse> {
	   

	private String fcstDate;

	@SerializedName("dcosIds")
	private List<Long> dcosIds;

	@SerializedName("snList")
	private List<String> snList;

	private String product2;

	private String product1;

	private String nic;

	private String product3;

	private String machineType;

	private Boolean countryNull;

	private Integer diffStart;

	private Integer downloadKey;

	private String productGroup;

	private String orgKey;

	@SerializedName("businessTypeList")
	private List<String> businessTypeList;

	private String azone;

	private String order;

	private String currentUser;

	private String cbmDemander;

	private String agreement;

	private Integer ladingStatus;

	private Integer clickReverse;

	@SerializedName("product1List")
	private List<String> product1List;

	private Integer fromHistory;

	private Integer exclusiveStatus;

	@SerializedName("prList")
	private List<String> prList;

	private Integer fisYear;

	private Boolean fromSop;

	@SerializedName("exclusiveProduct1ApproveList")
	private List<String> exclusiveProduct1ApproveList;

	private Integer status;

	private Integer flag;

	private String applyComment;

	@SerializedName("statusList")
	private List<Integer> statusList;

	@SerializedName("requireTypeList")
	private List<String> requireTypeList;

	private Integer clickNewModify;

	private Integer sumType;

	private Boolean superManager;

	private String dataType;

	private Integer nakedDelivery;

	private Integer pageSize;

	private Boolean orgKeyNull;

	private Integer clickModify;

	@SerializedName("product2ApproveList")
	private List<String> product2ApproveList;

	private String creatorOrModifierEmpId;

	private Integer diffEnd;

	private String creator;

	private String business;

	private String quotaPlanCreatorOrModifierEmpId;

	@SerializedName("roomCodeList")
	private List<String> roomCodeList;

	private Integer currentPage;

	private String safeZoneCode;

	@SerializedName("modelNameList")
	private List<String> modelNameList;

	@SerializedName("ladingIds")
	private List<Long> ladingIds;

	@SerializedName("queryUsers")
	private List<String> queryUsers;

	@SerializedName("poList")
	private List<String> poList;

	private Integer changeSuccess;

	private String processId;

	private String customerCode;

	private String fcstVersion;

	private String classZoneCode;

	private String azEnName;

	private String logicZoneCode;

	private Integer excelStatus;

	private String source;

	private Integer planType;

	@SerializedName("ladingOrderIds")
	private List<Long> ladingOrderIds;

	private Boolean includeDeleted;

	@SerializedName("exclusiveBusinessTypeList")
	private List<String> exclusiveBusinessTypeList;

	private String picker;

	@SerializedName("projectCodes")
	private List<String> projectCodes;

	private Integer approveApplyType;

	private String productRegion;

	private String netArch;

	private Integer offset;

	private Integer level;

	private String manufacturerBrand;

	private Integer timeSpan;

	private Integer exportFromApprove;

	private String requireType;

	private Integer success;

	private String regionEnName;

	private String approveProduct2;

	@SerializedName("product2List")
	private List<String> product2List;

	@SerializedName("outIds")
	private List<String> outIds;

	private String region;

	private String subordinateIndustryLine;

	@SerializedName("orgNames")
	private List<String> orgNames;

	@SerializedName("exclusiveStatusList")
	private List<Integer> exclusiveStatusList;

	@SerializedName("product3List")
	private List<String> product3List;

	@SerializedName("originIds")
	private List<Long> originIds;

	private Boolean pureAllocate;

	private String updater;

	private Integer versionId;

	private String channelType;

	private String projectType;

	private String countryType;

	private String productSu;

	private String productCluster;

	private Boolean robotOrHuman;

	private Integer rdsRoomType;

	private Boolean cntEffective;

	private String workNo;

	private Integer clickNewReverse;

	@SerializedName("sourceList")
	private List<String> sourceList;

	@SerializedName("regionList")
	private List<String> regionList;

	private String roomCode;

	@SerializedName("ladingStatusList")
	private List<Integer> ladingStatusList;

	private Integer applyType;
	public GetPlanListWithReverseRequest() {
		super("brinekingdom", "2019-06-27", "GetPlanListWithReverse");
		setMethod(MethodType.POST);
	}

	public String getFcstDate() {
		return this.fcstDate;
	}

	public void setFcstDate(String fcstDate) {
		this.fcstDate = fcstDate;
		if(fcstDate != null){
			putQueryParameter("FcstDate", fcstDate);
		}
	}

	public List<Long> getDcosIds() {
		return this.dcosIds;
	}

	public void setDcosIds(List<Long> dcosIds) {
		this.dcosIds = dcosIds;	
		if (dcosIds != null) {
			putQueryParameter("DcosIds" , new Gson().toJson(dcosIds));
		}	
	}

	public List<String> getSnList() {
		return this.snList;
	}

	public void setSnList(List<String> snList) {
		this.snList = snList;	
		if (snList != null) {
			putQueryParameter("SnList" , new Gson().toJson(snList));
		}	
	}

	public String getProduct2() {
		return this.product2;
	}

	public void setProduct2(String product2) {
		this.product2 = product2;
		if(product2 != null){
			putQueryParameter("Product2", product2);
		}
	}

	public String getProduct1() {
		return this.product1;
	}

	public void setProduct1(String product1) {
		this.product1 = product1;
		if(product1 != null){
			putQueryParameter("Product1", product1);
		}
	}

	public String getNic() {
		return this.nic;
	}

	public void setNic(String nic) {
		this.nic = nic;
		if(nic != null){
			putQueryParameter("Nic", nic);
		}
	}

	public String getProduct3() {
		return this.product3;
	}

	public void setProduct3(String product3) {
		this.product3 = product3;
		if(product3 != null){
			putQueryParameter("Product3", product3);
		}
	}

	public String getMachineType() {
		return this.machineType;
	}

	public void setMachineType(String machineType) {
		this.machineType = machineType;
		if(machineType != null){
			putQueryParameter("MachineType", machineType);
		}
	}

	public Boolean getCountryNull() {
		return this.countryNull;
	}

	public void setCountryNull(Boolean countryNull) {
		this.countryNull = countryNull;
		if(countryNull != null){
			putQueryParameter("CountryNull", countryNull.toString());
		}
	}

	public Integer getDiffStart() {
		return this.diffStart;
	}

	public void setDiffStart(Integer diffStart) {
		this.diffStart = diffStart;
		if(diffStart != null){
			putQueryParameter("DiffStart", diffStart.toString());
		}
	}

	public Integer getDownloadKey() {
		return this.downloadKey;
	}

	public void setDownloadKey(Integer downloadKey) {
		this.downloadKey = downloadKey;
		if(downloadKey != null){
			putQueryParameter("DownloadKey", downloadKey.toString());
		}
	}

	public String getProductGroup() {
		return this.productGroup;
	}

	public void setProductGroup(String productGroup) {
		this.productGroup = productGroup;
		if(productGroup != null){
			putQueryParameter("ProductGroup", productGroup);
		}
	}

	public String getOrgKey() {
		return this.orgKey;
	}

	public void setOrgKey(String orgKey) {
		this.orgKey = orgKey;
		if(orgKey != null){
			putQueryParameter("OrgKey", orgKey);
		}
	}

	public List<String> getBusinessTypeList() {
		return this.businessTypeList;
	}

	public void setBusinessTypeList(List<String> businessTypeList) {
		this.businessTypeList = businessTypeList;	
		if (businessTypeList != null) {
			putQueryParameter("BusinessTypeList" , new Gson().toJson(businessTypeList));
		}	
	}

	public String getAzone() {
		return this.azone;
	}

	public void setAzone(String azone) {
		this.azone = azone;
		if(azone != null){
			putQueryParameter("Azone", azone);
		}
	}

	public String getOrder() {
		return this.order;
	}

	public void setOrder(String order) {
		this.order = order;
		if(order != null){
			putQueryParameter("Order", order);
		}
	}

	public String getCurrentUser() {
		return this.currentUser;
	}

	public void setCurrentUser(String currentUser) {
		this.currentUser = currentUser;
		if(currentUser != null){
			putQueryParameter("CurrentUser", currentUser);
		}
	}

	public String getCbmDemander() {
		return this.cbmDemander;
	}

	public void setCbmDemander(String cbmDemander) {
		this.cbmDemander = cbmDemander;
		if(cbmDemander != null){
			putQueryParameter("CbmDemander", cbmDemander);
		}
	}

	public String getAgreement() {
		return this.agreement;
	}

	public void setAgreement(String agreement) {
		this.agreement = agreement;
		if(agreement != null){
			putQueryParameter("Agreement", agreement);
		}
	}

	public Integer getLadingStatus() {
		return this.ladingStatus;
	}

	public void setLadingStatus(Integer ladingStatus) {
		this.ladingStatus = ladingStatus;
		if(ladingStatus != null){
			putQueryParameter("LadingStatus", ladingStatus.toString());
		}
	}

	public Integer getClickReverse() {
		return this.clickReverse;
	}

	public void setClickReverse(Integer clickReverse) {
		this.clickReverse = clickReverse;
		if(clickReverse != null){
			putQueryParameter("ClickReverse", clickReverse.toString());
		}
	}

	public List<String> getProduct1List() {
		return this.product1List;
	}

	public void setProduct1List(List<String> product1List) {
		this.product1List = product1List;	
		if (product1List != null) {
			putQueryParameter("Product1List" , new Gson().toJson(product1List));
		}	
	}

	public Integer getFromHistory() {
		return this.fromHistory;
	}

	public void setFromHistory(Integer fromHistory) {
		this.fromHistory = fromHistory;
		if(fromHistory != null){
			putQueryParameter("FromHistory", fromHistory.toString());
		}
	}

	public Integer getExclusiveStatus() {
		return this.exclusiveStatus;
	}

	public void setExclusiveStatus(Integer exclusiveStatus) {
		this.exclusiveStatus = exclusiveStatus;
		if(exclusiveStatus != null){
			putQueryParameter("ExclusiveStatus", exclusiveStatus.toString());
		}
	}

	public List<String> getPrList() {
		return this.prList;
	}

	public void setPrList(List<String> prList) {
		this.prList = prList;	
		if (prList != null) {
			putQueryParameter("PrList" , new Gson().toJson(prList));
		}	
	}

	public Integer getFisYear() {
		return this.fisYear;
	}

	public void setFisYear(Integer fisYear) {
		this.fisYear = fisYear;
		if(fisYear != null){
			putQueryParameter("FisYear", fisYear.toString());
		}
	}

	public Boolean getFromSop() {
		return this.fromSop;
	}

	public void setFromSop(Boolean fromSop) {
		this.fromSop = fromSop;
		if(fromSop != null){
			putQueryParameter("FromSop", fromSop.toString());
		}
	}

	public List<String> getExclusiveProduct1ApproveList() {
		return this.exclusiveProduct1ApproveList;
	}

	public void setExclusiveProduct1ApproveList(List<String> exclusiveProduct1ApproveList) {
		this.exclusiveProduct1ApproveList = exclusiveProduct1ApproveList;	
		if (exclusiveProduct1ApproveList != null) {
			putQueryParameter("ExclusiveProduct1ApproveList" , new Gson().toJson(exclusiveProduct1ApproveList));
		}	
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status.toString());
		}
	}

	public Integer getFlag() {
		return this.flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
		if(flag != null){
			putQueryParameter("Flag", flag.toString());
		}
	}

	public String getApplyComment() {
		return this.applyComment;
	}

	public void setApplyComment(String applyComment) {
		this.applyComment = applyComment;
		if(applyComment != null){
			putQueryParameter("ApplyComment", applyComment);
		}
	}

	public List<Integer> getStatusList() {
		return this.statusList;
	}

	public void setStatusList(List<Integer> statusList) {
		this.statusList = statusList;	
		if (statusList != null) {
			putQueryParameter("StatusList" , new Gson().toJson(statusList));
		}	
	}

	public List<String> getRequireTypeList() {
		return this.requireTypeList;
	}

	public void setRequireTypeList(List<String> requireTypeList) {
		this.requireTypeList = requireTypeList;	
		if (requireTypeList != null) {
			putQueryParameter("RequireTypeList" , new Gson().toJson(requireTypeList));
		}	
	}

	public Integer getClickNewModify() {
		return this.clickNewModify;
	}

	public void setClickNewModify(Integer clickNewModify) {
		this.clickNewModify = clickNewModify;
		if(clickNewModify != null){
			putQueryParameter("ClickNewModify", clickNewModify.toString());
		}
	}

	public Integer getSumType() {
		return this.sumType;
	}

	public void setSumType(Integer sumType) {
		this.sumType = sumType;
		if(sumType != null){
			putQueryParameter("SumType", sumType.toString());
		}
	}

	public Boolean getSuperManager() {
		return this.superManager;
	}

	public void setSuperManager(Boolean superManager) {
		this.superManager = superManager;
		if(superManager != null){
			putQueryParameter("SuperManager", superManager.toString());
		}
	}

	public String getDataType() {
		return this.dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
		if(dataType != null){
			putQueryParameter("DataType", dataType);
		}
	}

	public Integer getNakedDelivery() {
		return this.nakedDelivery;
	}

	public void setNakedDelivery(Integer nakedDelivery) {
		this.nakedDelivery = nakedDelivery;
		if(nakedDelivery != null){
			putQueryParameter("NakedDelivery", nakedDelivery.toString());
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public Boolean getOrgKeyNull() {
		return this.orgKeyNull;
	}

	public void setOrgKeyNull(Boolean orgKeyNull) {
		this.orgKeyNull = orgKeyNull;
		if(orgKeyNull != null){
			putQueryParameter("OrgKeyNull", orgKeyNull.toString());
		}
	}

	public Integer getClickModify() {
		return this.clickModify;
	}

	public void setClickModify(Integer clickModify) {
		this.clickModify = clickModify;
		if(clickModify != null){
			putQueryParameter("ClickModify", clickModify.toString());
		}
	}

	public List<String> getProduct2ApproveList() {
		return this.product2ApproveList;
	}

	public void setProduct2ApproveList(List<String> product2ApproveList) {
		this.product2ApproveList = product2ApproveList;	
		if (product2ApproveList != null) {
			putQueryParameter("Product2ApproveList" , new Gson().toJson(product2ApproveList));
		}	
	}

	public String getCreatorOrModifierEmpId() {
		return this.creatorOrModifierEmpId;
	}

	public void setCreatorOrModifierEmpId(String creatorOrModifierEmpId) {
		this.creatorOrModifierEmpId = creatorOrModifierEmpId;
		if(creatorOrModifierEmpId != null){
			putQueryParameter("CreatorOrModifierEmpId", creatorOrModifierEmpId);
		}
	}

	public Integer getDiffEnd() {
		return this.diffEnd;
	}

	public void setDiffEnd(Integer diffEnd) {
		this.diffEnd = diffEnd;
		if(diffEnd != null){
			putQueryParameter("DiffEnd", diffEnd.toString());
		}
	}

	public String getCreator() {
		return this.creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
		if(creator != null){
			putQueryParameter("Creator", creator);
		}
	}

	public String getBusiness() {
		return this.business;
	}

	public void setBusiness(String business) {
		this.business = business;
		if(business != null){
			putQueryParameter("Business", business);
		}
	}

	public String getQuotaPlanCreatorOrModifierEmpId() {
		return this.quotaPlanCreatorOrModifierEmpId;
	}

	public void setQuotaPlanCreatorOrModifierEmpId(String quotaPlanCreatorOrModifierEmpId) {
		this.quotaPlanCreatorOrModifierEmpId = quotaPlanCreatorOrModifierEmpId;
		if(quotaPlanCreatorOrModifierEmpId != null){
			putQueryParameter("QuotaPlanCreatorOrModifierEmpId", quotaPlanCreatorOrModifierEmpId);
		}
	}

	public List<String> getRoomCodeList() {
		return this.roomCodeList;
	}

	public void setRoomCodeList(List<String> roomCodeList) {
		this.roomCodeList = roomCodeList;	
		if (roomCodeList != null) {
			putQueryParameter("RoomCodeList" , new Gson().toJson(roomCodeList));
		}	
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putQueryParameter("CurrentPage", currentPage.toString());
		}
	}

	public String getSafeZoneCode() {
		return this.safeZoneCode;
	}

	public void setSafeZoneCode(String safeZoneCode) {
		this.safeZoneCode = safeZoneCode;
		if(safeZoneCode != null){
			putQueryParameter("SafeZoneCode", safeZoneCode);
		}
	}

	public List<String> getModelNameList() {
		return this.modelNameList;
	}

	public void setModelNameList(List<String> modelNameList) {
		this.modelNameList = modelNameList;	
		if (modelNameList != null) {
			putQueryParameter("ModelNameList" , new Gson().toJson(modelNameList));
		}	
	}

	public List<Long> getLadingIds() {
		return this.ladingIds;
	}

	public void setLadingIds(List<Long> ladingIds) {
		this.ladingIds = ladingIds;	
		if (ladingIds != null) {
			putQueryParameter("LadingIds" , new Gson().toJson(ladingIds));
		}	
	}

	public List<String> getQueryUsers() {
		return this.queryUsers;
	}

	public void setQueryUsers(List<String> queryUsers) {
		this.queryUsers = queryUsers;	
		if (queryUsers != null) {
			putQueryParameter("QueryUsers" , new Gson().toJson(queryUsers));
		}	
	}

	public List<String> getPoList() {
		return this.poList;
	}

	public void setPoList(List<String> poList) {
		this.poList = poList;	
		if (poList != null) {
			putQueryParameter("PoList" , new Gson().toJson(poList));
		}	
	}

	public Integer getChangeSuccess() {
		return this.changeSuccess;
	}

	public void setChangeSuccess(Integer changeSuccess) {
		this.changeSuccess = changeSuccess;
		if(changeSuccess != null){
			putQueryParameter("ChangeSuccess", changeSuccess.toString());
		}
	}

	public String getProcessId() {
		return this.processId;
	}

	public void setProcessId(String processId) {
		this.processId = processId;
		if(processId != null){
			putQueryParameter("ProcessId", processId);
		}
	}

	public String getCustomerCode() {
		return this.customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
		if(customerCode != null){
			putQueryParameter("CustomerCode", customerCode);
		}
	}

	public String getFcstVersion() {
		return this.fcstVersion;
	}

	public void setFcstVersion(String fcstVersion) {
		this.fcstVersion = fcstVersion;
		if(fcstVersion != null){
			putQueryParameter("FcstVersion", fcstVersion);
		}
	}

	public String getClassZoneCode() {
		return this.classZoneCode;
	}

	public void setClassZoneCode(String classZoneCode) {
		this.classZoneCode = classZoneCode;
		if(classZoneCode != null){
			putQueryParameter("ClassZoneCode", classZoneCode);
		}
	}

	public String getAzEnName() {
		return this.azEnName;
	}

	public void setAzEnName(String azEnName) {
		this.azEnName = azEnName;
		if(azEnName != null){
			putQueryParameter("AzEnName", azEnName);
		}
	}

	public String getLogicZoneCode() {
		return this.logicZoneCode;
	}

	public void setLogicZoneCode(String logicZoneCode) {
		this.logicZoneCode = logicZoneCode;
		if(logicZoneCode != null){
			putQueryParameter("LogicZoneCode", logicZoneCode);
		}
	}

	public Integer getExcelStatus() {
		return this.excelStatus;
	}

	public void setExcelStatus(Integer excelStatus) {
		this.excelStatus = excelStatus;
		if(excelStatus != null){
			putQueryParameter("ExcelStatus", excelStatus.toString());
		}
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
		if(source != null){
			putQueryParameter("Source", source);
		}
	}

	public Integer getPlanType() {
		return this.planType;
	}

	public void setPlanType(Integer planType) {
		this.planType = planType;
		if(planType != null){
			putQueryParameter("PlanType", planType.toString());
		}
	}

	public List<Long> getLadingOrderIds() {
		return this.ladingOrderIds;
	}

	public void setLadingOrderIds(List<Long> ladingOrderIds) {
		this.ladingOrderIds = ladingOrderIds;	
		if (ladingOrderIds != null) {
			putQueryParameter("LadingOrderIds" , new Gson().toJson(ladingOrderIds));
		}	
	}

	public Boolean getIncludeDeleted() {
		return this.includeDeleted;
	}

	public void setIncludeDeleted(Boolean includeDeleted) {
		this.includeDeleted = includeDeleted;
		if(includeDeleted != null){
			putQueryParameter("IncludeDeleted", includeDeleted.toString());
		}
	}

	public List<String> getExclusiveBusinessTypeList() {
		return this.exclusiveBusinessTypeList;
	}

	public void setExclusiveBusinessTypeList(List<String> exclusiveBusinessTypeList) {
		this.exclusiveBusinessTypeList = exclusiveBusinessTypeList;	
		if (exclusiveBusinessTypeList != null) {
			putQueryParameter("ExclusiveBusinessTypeList" , new Gson().toJson(exclusiveBusinessTypeList));
		}	
	}

	public String getPicker() {
		return this.picker;
	}

	public void setPicker(String picker) {
		this.picker = picker;
		if(picker != null){
			putQueryParameter("Picker", picker);
		}
	}

	public List<String> getProjectCodes() {
		return this.projectCodes;
	}

	public void setProjectCodes(List<String> projectCodes) {
		this.projectCodes = projectCodes;	
		if (projectCodes != null) {
			putQueryParameter("ProjectCodes" , new Gson().toJson(projectCodes));
		}	
	}

	public Integer getApproveApplyType() {
		return this.approveApplyType;
	}

	public void setApproveApplyType(Integer approveApplyType) {
		this.approveApplyType = approveApplyType;
		if(approveApplyType != null){
			putQueryParameter("ApproveApplyType", approveApplyType.toString());
		}
	}

	public String getProductRegion() {
		return this.productRegion;
	}

	public void setProductRegion(String productRegion) {
		this.productRegion = productRegion;
		if(productRegion != null){
			putQueryParameter("ProductRegion", productRegion);
		}
	}

	public String getNetArch() {
		return this.netArch;
	}

	public void setNetArch(String netArch) {
		this.netArch = netArch;
		if(netArch != null){
			putQueryParameter("NetArch", netArch);
		}
	}

	public Integer getOffset() {
		return this.offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
		if(offset != null){
			putQueryParameter("Offset", offset.toString());
		}
	}

	public Integer getLevel() {
		return this.level;
	}

	public void setLevel(Integer level) {
		this.level = level;
		if(level != null){
			putQueryParameter("Level", level.toString());
		}
	}

	public String getManufacturerBrand() {
		return this.manufacturerBrand;
	}

	public void setManufacturerBrand(String manufacturerBrand) {
		this.manufacturerBrand = manufacturerBrand;
		if(manufacturerBrand != null){
			putQueryParameter("ManufacturerBrand", manufacturerBrand);
		}
	}

	public Integer getTimeSpan() {
		return this.timeSpan;
	}

	public void setTimeSpan(Integer timeSpan) {
		this.timeSpan = timeSpan;
		if(timeSpan != null){
			putQueryParameter("TimeSpan", timeSpan.toString());
		}
	}

	public Integer getExportFromApprove() {
		return this.exportFromApprove;
	}

	public void setExportFromApprove(Integer exportFromApprove) {
		this.exportFromApprove = exportFromApprove;
		if(exportFromApprove != null){
			putQueryParameter("ExportFromApprove", exportFromApprove.toString());
		}
	}

	public String getRequireType() {
		return this.requireType;
	}

	public void setRequireType(String requireType) {
		this.requireType = requireType;
		if(requireType != null){
			putQueryParameter("RequireType", requireType);
		}
	}

	public Integer getSuccess() {
		return this.success;
	}

	public void setSuccess(Integer success) {
		this.success = success;
		if(success != null){
			putQueryParameter("Success", success.toString());
		}
	}

	public String getRegionEnName() {
		return this.regionEnName;
	}

	public void setRegionEnName(String regionEnName) {
		this.regionEnName = regionEnName;
		if(regionEnName != null){
			putQueryParameter("RegionEnName", regionEnName);
		}
	}

	public String getApproveProduct2() {
		return this.approveProduct2;
	}

	public void setApproveProduct2(String approveProduct2) {
		this.approveProduct2 = approveProduct2;
		if(approveProduct2 != null){
			putQueryParameter("ApproveProduct2", approveProduct2);
		}
	}

	public List<String> getProduct2List() {
		return this.product2List;
	}

	public void setProduct2List(List<String> product2List) {
		this.product2List = product2List;	
		if (product2List != null) {
			putQueryParameter("Product2List" , new Gson().toJson(product2List));
		}	
	}

	public List<String> getOutIds() {
		return this.outIds;
	}

	public void setOutIds(List<String> outIds) {
		this.outIds = outIds;	
		if (outIds != null) {
			putQueryParameter("OutIds" , new Gson().toJson(outIds));
		}	
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
		if(region != null){
			putQueryParameter("Region", region);
		}
	}

	public String getSubordinateIndustryLine() {
		return this.subordinateIndustryLine;
	}

	public void setSubordinateIndustryLine(String subordinateIndustryLine) {
		this.subordinateIndustryLine = subordinateIndustryLine;
		if(subordinateIndustryLine != null){
			putQueryParameter("SubordinateIndustryLine", subordinateIndustryLine);
		}
	}

	public List<String> getOrgNames() {
		return this.orgNames;
	}

	public void setOrgNames(List<String> orgNames) {
		this.orgNames = orgNames;	
		if (orgNames != null) {
			putQueryParameter("OrgNames" , new Gson().toJson(orgNames));
		}	
	}

	public List<Integer> getExclusiveStatusList() {
		return this.exclusiveStatusList;
	}

	public void setExclusiveStatusList(List<Integer> exclusiveStatusList) {
		this.exclusiveStatusList = exclusiveStatusList;	
		if (exclusiveStatusList != null) {
			putQueryParameter("ExclusiveStatusList" , new Gson().toJson(exclusiveStatusList));
		}	
	}

	public List<String> getProduct3List() {
		return this.product3List;
	}

	public void setProduct3List(List<String> product3List) {
		this.product3List = product3List;	
		if (product3List != null) {
			putQueryParameter("Product3List" , new Gson().toJson(product3List));
		}	
	}

	public List<Long> getOriginIds() {
		return this.originIds;
	}

	public void setOriginIds(List<Long> originIds) {
		this.originIds = originIds;	
		if (originIds != null) {
			putQueryParameter("OriginIds" , new Gson().toJson(originIds));
		}	
	}

	public Boolean getPureAllocate() {
		return this.pureAllocate;
	}

	public void setPureAllocate(Boolean pureAllocate) {
		this.pureAllocate = pureAllocate;
		if(pureAllocate != null){
			putQueryParameter("PureAllocate", pureAllocate.toString());
		}
	}

	public String getUpdater() {
		return this.updater;
	}

	public void setUpdater(String updater) {
		this.updater = updater;
		if(updater != null){
			putQueryParameter("Updater", updater);
		}
	}

	public Integer getVersionId() {
		return this.versionId;
	}

	public void setVersionId(Integer versionId) {
		this.versionId = versionId;
		if(versionId != null){
			putQueryParameter("VersionId", versionId.toString());
		}
	}

	public String getChannelType() {
		return this.channelType;
	}

	public void setChannelType(String channelType) {
		this.channelType = channelType;
		if(channelType != null){
			putQueryParameter("ChannelType", channelType);
		}
	}

	public String getProjectType() {
		return this.projectType;
	}

	public void setProjectType(String projectType) {
		this.projectType = projectType;
		if(projectType != null){
			putQueryParameter("ProjectType", projectType);
		}
	}

	public String getCountryType() {
		return this.countryType;
	}

	public void setCountryType(String countryType) {
		this.countryType = countryType;
		if(countryType != null){
			putQueryParameter("CountryType", countryType);
		}
	}

	public String getProductSu() {
		return this.productSu;
	}

	public void setProductSu(String productSu) {
		this.productSu = productSu;
		if(productSu != null){
			putQueryParameter("ProductSu", productSu);
		}
	}

	public String getProductCluster() {
		return this.productCluster;
	}

	public void setProductCluster(String productCluster) {
		this.productCluster = productCluster;
		if(productCluster != null){
			putQueryParameter("ProductCluster", productCluster);
		}
	}

	public Boolean getRobotOrHuman() {
		return this.robotOrHuman;
	}

	public void setRobotOrHuman(Boolean robotOrHuman) {
		this.robotOrHuman = robotOrHuman;
		if(robotOrHuman != null){
			putQueryParameter("RobotOrHuman", robotOrHuman.toString());
		}
	}

	public Integer getRdsRoomType() {
		return this.rdsRoomType;
	}

	public void setRdsRoomType(Integer rdsRoomType) {
		this.rdsRoomType = rdsRoomType;
		if(rdsRoomType != null){
			putQueryParameter("RdsRoomType", rdsRoomType.toString());
		}
	}

	public Boolean getCntEffective() {
		return this.cntEffective;
	}

	public void setCntEffective(Boolean cntEffective) {
		this.cntEffective = cntEffective;
		if(cntEffective != null){
			putQueryParameter("CntEffective", cntEffective.toString());
		}
	}

	public String getWorkNo() {
		return this.workNo;
	}

	public void setWorkNo(String workNo) {
		this.workNo = workNo;
		if(workNo != null){
			putQueryParameter("WorkNo", workNo);
		}
	}

	public Integer getClickNewReverse() {
		return this.clickNewReverse;
	}

	public void setClickNewReverse(Integer clickNewReverse) {
		this.clickNewReverse = clickNewReverse;
		if(clickNewReverse != null){
			putQueryParameter("ClickNewReverse", clickNewReverse.toString());
		}
	}

	public List<String> getSourceList() {
		return this.sourceList;
	}

	public void setSourceList(List<String> sourceList) {
		this.sourceList = sourceList;	
		if (sourceList != null) {
			putQueryParameter("SourceList" , new Gson().toJson(sourceList));
		}	
	}

	public List<String> getRegionList() {
		return this.regionList;
	}

	public void setRegionList(List<String> regionList) {
		this.regionList = regionList;	
		if (regionList != null) {
			putQueryParameter("RegionList" , new Gson().toJson(regionList));
		}	
	}

	public String getRoomCode() {
		return this.roomCode;
	}

	public void setRoomCode(String roomCode) {
		this.roomCode = roomCode;
		if(roomCode != null){
			putQueryParameter("RoomCode", roomCode);
		}
	}

	public List<Integer> getLadingStatusList() {
		return this.ladingStatusList;
	}

	public void setLadingStatusList(List<Integer> ladingStatusList) {
		this.ladingStatusList = ladingStatusList;	
		if (ladingStatusList != null) {
			putQueryParameter("LadingStatusList" , new Gson().toJson(ladingStatusList));
		}	
	}

	public Integer getApplyType() {
		return this.applyType;
	}

	public void setApplyType(Integer applyType) {
		this.applyType = applyType;
		if(applyType != null){
			putQueryParameter("ApplyType", applyType.toString());
		}
	}

	@Override
	public Class<GetPlanListWithReverseResponse> getResponseClass() {
		return GetPlanListWithReverseResponse.class;
	}

}
