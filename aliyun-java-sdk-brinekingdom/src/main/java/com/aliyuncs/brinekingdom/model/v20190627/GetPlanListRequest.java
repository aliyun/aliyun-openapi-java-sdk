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
public class GetPlanListRequest extends RpcAcsRequest<GetPlanListResponse> {
	   

	@SerializedName("statusList")
	private List<Integer> statusList;

	@SerializedName("orgNames")
	private List<String> orgNames;

	@SerializedName("dcosIds")
	private List<Long> dcosIds;

	private String classZoneCode;

	private String nic;

	private String logicZoneCode;

	@SerializedName("product3List")
	private List<String> product3List;

	@SerializedName("originIds")
	private List<Long> originIds;

	private Boolean includeDeleted;

	private String machineType;

	private Boolean superManager;

	private Integer nakedDelivery;

	private Long pageSize;

	@SerializedName("projectCodes")
	private List<String> projectCodes;

	private String countryType;

	private String azone;

	private String business;

	private String netArch;

	private Integer ladingStatus;

	private Integer currentPage;

	private String safeZoneCode;

	private String dateStartStr;

	@SerializedName("product1List")
	private List<String> product1List;

	@SerializedName("queryUsers")
	private List<String> queryUsers;

	private Integer changeSuccess;

	private String requireType;

	private Integer fromHistory;

	private Integer success;

	private String dateEndStr;

	private String roomCode;

	@SerializedName("outIds")
	private List<String> outIds;

	@SerializedName("product2List")
	private List<String> product2List;

	private String region;
	public GetPlanListRequest() {
		super("brinekingdom", "2019-06-27", "GetPlanList");
		setMethod(MethodType.POST);
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

	public List<String> getOrgNames() {
		return this.orgNames;
	}

	public void setOrgNames(List<String> orgNames) {
		this.orgNames = orgNames;	
		if (orgNames != null) {
			putQueryParameter("OrgNames" , new Gson().toJson(orgNames));
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

	public String getClassZoneCode() {
		return this.classZoneCode;
	}

	public void setClassZoneCode(String classZoneCode) {
		this.classZoneCode = classZoneCode;
		if(classZoneCode != null){
			putQueryParameter("ClassZoneCode", classZoneCode);
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

	public String getLogicZoneCode() {
		return this.logicZoneCode;
	}

	public void setLogicZoneCode(String logicZoneCode) {
		this.logicZoneCode = logicZoneCode;
		if(logicZoneCode != null){
			putQueryParameter("LogicZoneCode", logicZoneCode);
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

	public Boolean getIncludeDeleted() {
		return this.includeDeleted;
	}

	public void setIncludeDeleted(Boolean includeDeleted) {
		this.includeDeleted = includeDeleted;
		if(includeDeleted != null){
			putQueryParameter("IncludeDeleted", includeDeleted.toString());
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

	public Boolean getSuperManager() {
		return this.superManager;
	}

	public void setSuperManager(Boolean superManager) {
		this.superManager = superManager;
		if(superManager != null){
			putQueryParameter("SuperManager", superManager.toString());
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

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
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

	public String getCountryType() {
		return this.countryType;
	}

	public void setCountryType(String countryType) {
		this.countryType = countryType;
		if(countryType != null){
			putQueryParameter("CountryType", countryType);
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

	public String getBusiness() {
		return this.business;
	}

	public void setBusiness(String business) {
		this.business = business;
		if(business != null){
			putQueryParameter("Business", business);
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

	public Integer getLadingStatus() {
		return this.ladingStatus;
	}

	public void setLadingStatus(Integer ladingStatus) {
		this.ladingStatus = ladingStatus;
		if(ladingStatus != null){
			putQueryParameter("LadingStatus", ladingStatus.toString());
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

	public String getDateStartStr() {
		return this.dateStartStr;
	}

	public void setDateStartStr(String dateStartStr) {
		this.dateStartStr = dateStartStr;
		if(dateStartStr != null){
			putQueryParameter("DateStartStr", dateStartStr);
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

	public List<String> getQueryUsers() {
		return this.queryUsers;
	}

	public void setQueryUsers(List<String> queryUsers) {
		this.queryUsers = queryUsers;	
		if (queryUsers != null) {
			putQueryParameter("QueryUsers" , new Gson().toJson(queryUsers));
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

	public String getRequireType() {
		return this.requireType;
	}

	public void setRequireType(String requireType) {
		this.requireType = requireType;
		if(requireType != null){
			putQueryParameter("RequireType", requireType);
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

	public Integer getSuccess() {
		return this.success;
	}

	public void setSuccess(Integer success) {
		this.success = success;
		if(success != null){
			putQueryParameter("Success", success.toString());
		}
	}

	public String getDateEndStr() {
		return this.dateEndStr;
	}

	public void setDateEndStr(String dateEndStr) {
		this.dateEndStr = dateEndStr;
		if(dateEndStr != null){
			putQueryParameter("DateEndStr", dateEndStr);
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

	public List<String> getOutIds() {
		return this.outIds;
	}

	public void setOutIds(List<String> outIds) {
		this.outIds = outIds;	
		if (outIds != null) {
			putQueryParameter("OutIds" , new Gson().toJson(outIds));
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

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
		if(region != null){
			putQueryParameter("Region", region);
		}
	}

	@Override
	public Class<GetPlanListResponse> getResponseClass() {
		return GetPlanListResponse.class;
	}

}
