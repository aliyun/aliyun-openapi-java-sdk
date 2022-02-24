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

package com.aliyuncs.dt_oc_info.model.v20200401;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class QueryCompanyRequest extends RpcAcsRequest<QueryCompanyResponse> {
	   

	private Integer registerCapitalStart;

	private String isMobilePhone;

	private String ossKey;

	private String staffSize;

	private String isAgency;

	private Integer registerCapitalEnd;

	private String isElectronicBusiness;

	private String jobTimeLevel;

	private String hasFinance;

	private Integer corpHouseId;

	private String lifecycle;

	private String electronicBusinessYear;

	private String bizScopeKeyword;

	private String dataModuleIds;

	private String isRiskLegalExecutions;

	private String isIndividual;

	private String isRecruit;

	private String corpHouseName;

	private String isPublic;

	private String registerCapitalType;

	private String isLegalComp;

	private String isImportOutput;

	private String recruitPayLevel;

	private String registerCapital;

	private String isHomeUrl;

	private String keyword;

	private String taskId;

	private String productShopMatch;

	private String recruitProvince;

	private String positionName;

	private String isBidding;

	private String brandInfo;

	private String isPatents;

	private String electronicBusinessYearType;

	private String isTrademarks;

	private Integer pageNo;

	private String buildTime;

	private String companyName;

	private String isBranch;

	private String isHasEShop;

	private String oneCompanyId;

	private String listedStatus;

	private String isDeadNum;

	private String regions;

	private String isTierATaxpayer;

	private Boolean searchNewComp;

	private String lbsParam;

	private String isSoftCopyrights;

	private Boolean filterUnusedCompany;

	private String isAboveScale;

	private Integer orderByType;

	private String esDateEnd;

	private String isValidPhone;

	private String positionWelfare;

	private String fetchFieldList;

	private String bizStatus;

	private Integer pageSize;

	private String isIpDomains;

	private String powerTag;

	private String positionRequirement;

	private String bizCategory;

	private String isEmail;

	private String spreadInfo;

	private Long pushDataLimit;

	private String isNormalCopyrights;

	private String isFixedPhone;

	private String isZone;

	private String companyNames;

	private Boolean fetchLbsInfo;

	private String isInvestment;

	private String bizType;

	private String bizScope;

	private String pushUrl;

	private String isProductNames;

	private String transformRate;

	private String companyType;

	private String esDateStart;

	private String recruitEducationLevel;
	public QueryCompanyRequest() {
		super("dt-oc-info", "2020-04-01", "QueryCompany");
		setMethod(MethodType.POST);
	}

	public Integer getRegisterCapitalStart() {
		return this.registerCapitalStart;
	}

	public void setRegisterCapitalStart(Integer registerCapitalStart) {
		this.registerCapitalStart = registerCapitalStart;
		if(registerCapitalStart != null){
			putBodyParameter("RegisterCapitalStart", registerCapitalStart.toString());
		}
	}

	public String getIsMobilePhone() {
		return this.isMobilePhone;
	}

	public void setIsMobilePhone(String isMobilePhone) {
		this.isMobilePhone = isMobilePhone;
		if(isMobilePhone != null){
			putBodyParameter("IsMobilePhone", isMobilePhone);
		}
	}

	public String getOssKey() {
		return this.ossKey;
	}

	public void setOssKey(String ossKey) {
		this.ossKey = ossKey;
		if(ossKey != null){
			putBodyParameter("OssKey", ossKey);
		}
	}

	public String getStaffSize() {
		return this.staffSize;
	}

	public void setStaffSize(String staffSize) {
		this.staffSize = staffSize;
		if(staffSize != null){
			putBodyParameter("StaffSize", staffSize);
		}
	}

	public String getIsAgency() {
		return this.isAgency;
	}

	public void setIsAgency(String isAgency) {
		this.isAgency = isAgency;
		if(isAgency != null){
			putBodyParameter("IsAgency", isAgency);
		}
	}

	public Integer getRegisterCapitalEnd() {
		return this.registerCapitalEnd;
	}

	public void setRegisterCapitalEnd(Integer registerCapitalEnd) {
		this.registerCapitalEnd = registerCapitalEnd;
		if(registerCapitalEnd != null){
			putBodyParameter("RegisterCapitalEnd", registerCapitalEnd.toString());
		}
	}

	public String getIsElectronicBusiness() {
		return this.isElectronicBusiness;
	}

	public void setIsElectronicBusiness(String isElectronicBusiness) {
		this.isElectronicBusiness = isElectronicBusiness;
		if(isElectronicBusiness != null){
			putBodyParameter("IsElectronicBusiness", isElectronicBusiness);
		}
	}

	public String getJobTimeLevel() {
		return this.jobTimeLevel;
	}

	public void setJobTimeLevel(String jobTimeLevel) {
		this.jobTimeLevel = jobTimeLevel;
		if(jobTimeLevel != null){
			putBodyParameter("JobTimeLevel", jobTimeLevel);
		}
	}

	public String getHasFinance() {
		return this.hasFinance;
	}

	public void setHasFinance(String hasFinance) {
		this.hasFinance = hasFinance;
		if(hasFinance != null){
			putBodyParameter("HasFinance", hasFinance);
		}
	}

	public Integer getCorpHouseId() {
		return this.corpHouseId;
	}

	public void setCorpHouseId(Integer corpHouseId) {
		this.corpHouseId = corpHouseId;
		if(corpHouseId != null){
			putBodyParameter("CorpHouseId", corpHouseId.toString());
		}
	}

	public String getLifecycle() {
		return this.lifecycle;
	}

	public void setLifecycle(String lifecycle) {
		this.lifecycle = lifecycle;
		if(lifecycle != null){
			putBodyParameter("Lifecycle", lifecycle);
		}
	}

	public String getElectronicBusinessYear() {
		return this.electronicBusinessYear;
	}

	public void setElectronicBusinessYear(String electronicBusinessYear) {
		this.electronicBusinessYear = electronicBusinessYear;
		if(electronicBusinessYear != null){
			putBodyParameter("ElectronicBusinessYear", electronicBusinessYear);
		}
	}

	public String getBizScopeKeyword() {
		return this.bizScopeKeyword;
	}

	public void setBizScopeKeyword(String bizScopeKeyword) {
		this.bizScopeKeyword = bizScopeKeyword;
		if(bizScopeKeyword != null){
			putBodyParameter("BizScopeKeyword", bizScopeKeyword);
		}
	}

	public String getDataModuleIds() {
		return this.dataModuleIds;
	}

	public void setDataModuleIds(String dataModuleIds) {
		this.dataModuleIds = dataModuleIds;
		if(dataModuleIds != null){
			putBodyParameter("DataModuleIds", dataModuleIds);
		}
	}

	public String getIsRiskLegalExecutions() {
		return this.isRiskLegalExecutions;
	}

	public void setIsRiskLegalExecutions(String isRiskLegalExecutions) {
		this.isRiskLegalExecutions = isRiskLegalExecutions;
		if(isRiskLegalExecutions != null){
			putBodyParameter("IsRiskLegalExecutions", isRiskLegalExecutions);
		}
	}

	public String getIsIndividual() {
		return this.isIndividual;
	}

	public void setIsIndividual(String isIndividual) {
		this.isIndividual = isIndividual;
		if(isIndividual != null){
			putBodyParameter("IsIndividual", isIndividual);
		}
	}

	public String getIsRecruit() {
		return this.isRecruit;
	}

	public void setIsRecruit(String isRecruit) {
		this.isRecruit = isRecruit;
		if(isRecruit != null){
			putBodyParameter("IsRecruit", isRecruit);
		}
	}

	public String getCorpHouseName() {
		return this.corpHouseName;
	}

	public void setCorpHouseName(String corpHouseName) {
		this.corpHouseName = corpHouseName;
		if(corpHouseName != null){
			putBodyParameter("CorpHouseName", corpHouseName);
		}
	}

	public String getIsPublic() {
		return this.isPublic;
	}

	public void setIsPublic(String isPublic) {
		this.isPublic = isPublic;
		if(isPublic != null){
			putBodyParameter("IsPublic", isPublic);
		}
	}

	public String getRegisterCapitalType() {
		return this.registerCapitalType;
	}

	public void setRegisterCapitalType(String registerCapitalType) {
		this.registerCapitalType = registerCapitalType;
		if(registerCapitalType != null){
			putBodyParameter("RegisterCapitalType", registerCapitalType);
		}
	}

	public String getIsLegalComp() {
		return this.isLegalComp;
	}

	public void setIsLegalComp(String isLegalComp) {
		this.isLegalComp = isLegalComp;
		if(isLegalComp != null){
			putBodyParameter("IsLegalComp", isLegalComp);
		}
	}

	public String getIsImportOutput() {
		return this.isImportOutput;
	}

	public void setIsImportOutput(String isImportOutput) {
		this.isImportOutput = isImportOutput;
		if(isImportOutput != null){
			putBodyParameter("IsImportOutput", isImportOutput);
		}
	}

	public String getRecruitPayLevel() {
		return this.recruitPayLevel;
	}

	public void setRecruitPayLevel(String recruitPayLevel) {
		this.recruitPayLevel = recruitPayLevel;
		if(recruitPayLevel != null){
			putBodyParameter("RecruitPayLevel", recruitPayLevel);
		}
	}

	public String getRegisterCapital() {
		return this.registerCapital;
	}

	public void setRegisterCapital(String registerCapital) {
		this.registerCapital = registerCapital;
		if(registerCapital != null){
			putBodyParameter("RegisterCapital", registerCapital);
		}
	}

	public String getIsHomeUrl() {
		return this.isHomeUrl;
	}

	public void setIsHomeUrl(String isHomeUrl) {
		this.isHomeUrl = isHomeUrl;
		if(isHomeUrl != null){
			putBodyParameter("IsHomeUrl", isHomeUrl);
		}
	}

	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
		if(keyword != null){
			putBodyParameter("Keyword", keyword);
		}
	}

	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
		if(taskId != null){
			putBodyParameter("TaskId", taskId);
		}
	}

	public String getProductShopMatch() {
		return this.productShopMatch;
	}

	public void setProductShopMatch(String productShopMatch) {
		this.productShopMatch = productShopMatch;
		if(productShopMatch != null){
			putBodyParameter("ProductShopMatch", productShopMatch);
		}
	}

	public String getRecruitProvince() {
		return this.recruitProvince;
	}

	public void setRecruitProvince(String recruitProvince) {
		this.recruitProvince = recruitProvince;
		if(recruitProvince != null){
			putBodyParameter("RecruitProvince", recruitProvince);
		}
	}

	public String getPositionName() {
		return this.positionName;
	}

	public void setPositionName(String positionName) {
		this.positionName = positionName;
		if(positionName != null){
			putBodyParameter("PositionName", positionName);
		}
	}

	public String getIsBidding() {
		return this.isBidding;
	}

	public void setIsBidding(String isBidding) {
		this.isBidding = isBidding;
		if(isBidding != null){
			putBodyParameter("IsBidding", isBidding);
		}
	}

	public String getBrandInfo() {
		return this.brandInfo;
	}

	public void setBrandInfo(String brandInfo) {
		this.brandInfo = brandInfo;
		if(brandInfo != null){
			putBodyParameter("BrandInfo", brandInfo);
		}
	}

	public String getIsPatents() {
		return this.isPatents;
	}

	public void setIsPatents(String isPatents) {
		this.isPatents = isPatents;
		if(isPatents != null){
			putBodyParameter("IsPatents", isPatents);
		}
	}

	public String getElectronicBusinessYearType() {
		return this.electronicBusinessYearType;
	}

	public void setElectronicBusinessYearType(String electronicBusinessYearType) {
		this.electronicBusinessYearType = electronicBusinessYearType;
		if(electronicBusinessYearType != null){
			putBodyParameter("ElectronicBusinessYearType", electronicBusinessYearType);
		}
	}

	public String getIsTrademarks() {
		return this.isTrademarks;
	}

	public void setIsTrademarks(String isTrademarks) {
		this.isTrademarks = isTrademarks;
		if(isTrademarks != null){
			putBodyParameter("IsTrademarks", isTrademarks);
		}
	}

	public Integer getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
		if(pageNo != null){
			putBodyParameter("PageNo", pageNo.toString());
		}
	}

	public String getBuildTime() {
		return this.buildTime;
	}

	public void setBuildTime(String buildTime) {
		this.buildTime = buildTime;
		if(buildTime != null){
			putBodyParameter("BuildTime", buildTime);
		}
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
		if(companyName != null){
			putBodyParameter("CompanyName", companyName);
		}
	}

	public String getIsBranch() {
		return this.isBranch;
	}

	public void setIsBranch(String isBranch) {
		this.isBranch = isBranch;
		if(isBranch != null){
			putBodyParameter("IsBranch", isBranch);
		}
	}

	public String getIsHasEShop() {
		return this.isHasEShop;
	}

	public void setIsHasEShop(String isHasEShop) {
		this.isHasEShop = isHasEShop;
		if(isHasEShop != null){
			putBodyParameter("IsHasEShop", isHasEShop);
		}
	}

	public String getOneCompanyId() {
		return this.oneCompanyId;
	}

	public void setOneCompanyId(String oneCompanyId) {
		this.oneCompanyId = oneCompanyId;
		if(oneCompanyId != null){
			putBodyParameter("OneCompanyId", oneCompanyId);
		}
	}

	public String getListedStatus() {
		return this.listedStatus;
	}

	public void setListedStatus(String listedStatus) {
		this.listedStatus = listedStatus;
		if(listedStatus != null){
			putBodyParameter("ListedStatus", listedStatus);
		}
	}

	public String getIsDeadNum() {
		return this.isDeadNum;
	}

	public void setIsDeadNum(String isDeadNum) {
		this.isDeadNum = isDeadNum;
		if(isDeadNum != null){
			putBodyParameter("IsDeadNum", isDeadNum);
		}
	}

	public String getRegions() {
		return this.regions;
	}

	public void setRegions(String regions) {
		this.regions = regions;
		if(regions != null){
			putBodyParameter("Regions", regions);
		}
	}

	public String getIsTierATaxpayer() {
		return this.isTierATaxpayer;
	}

	public void setIsTierATaxpayer(String isTierATaxpayer) {
		this.isTierATaxpayer = isTierATaxpayer;
		if(isTierATaxpayer != null){
			putBodyParameter("IsTierATaxpayer", isTierATaxpayer);
		}
	}

	public Boolean getSearchNewComp() {
		return this.searchNewComp;
	}

	public void setSearchNewComp(Boolean searchNewComp) {
		this.searchNewComp = searchNewComp;
		if(searchNewComp != null){
			putBodyParameter("SearchNewComp", searchNewComp.toString());
		}
	}

	public String getLbsParam() {
		return this.lbsParam;
	}

	public void setLbsParam(String lbsParam) {
		this.lbsParam = lbsParam;
		if(lbsParam != null){
			putBodyParameter("LbsParam", lbsParam);
		}
	}

	public String getIsSoftCopyrights() {
		return this.isSoftCopyrights;
	}

	public void setIsSoftCopyrights(String isSoftCopyrights) {
		this.isSoftCopyrights = isSoftCopyrights;
		if(isSoftCopyrights != null){
			putBodyParameter("IsSoftCopyrights", isSoftCopyrights);
		}
	}

	public Boolean getFilterUnusedCompany() {
		return this.filterUnusedCompany;
	}

	public void setFilterUnusedCompany(Boolean filterUnusedCompany) {
		this.filterUnusedCompany = filterUnusedCompany;
		if(filterUnusedCompany != null){
			putBodyParameter("FilterUnusedCompany", filterUnusedCompany.toString());
		}
	}

	public String getIsAboveScale() {
		return this.isAboveScale;
	}

	public void setIsAboveScale(String isAboveScale) {
		this.isAboveScale = isAboveScale;
		if(isAboveScale != null){
			putBodyParameter("IsAboveScale", isAboveScale);
		}
	}

	public Integer getOrderByType() {
		return this.orderByType;
	}

	public void setOrderByType(Integer orderByType) {
		this.orderByType = orderByType;
		if(orderByType != null){
			putBodyParameter("OrderByType", orderByType.toString());
		}
	}

	public String getEsDateEnd() {
		return this.esDateEnd;
	}

	public void setEsDateEnd(String esDateEnd) {
		this.esDateEnd = esDateEnd;
		if(esDateEnd != null){
			putBodyParameter("EsDateEnd", esDateEnd);
		}
	}

	public String getIsValidPhone() {
		return this.isValidPhone;
	}

	public void setIsValidPhone(String isValidPhone) {
		this.isValidPhone = isValidPhone;
		if(isValidPhone != null){
			putBodyParameter("IsValidPhone", isValidPhone);
		}
	}

	public String getPositionWelfare() {
		return this.positionWelfare;
	}

	public void setPositionWelfare(String positionWelfare) {
		this.positionWelfare = positionWelfare;
		if(positionWelfare != null){
			putBodyParameter("PositionWelfare", positionWelfare);
		}
	}

	public String getFetchFieldList() {
		return this.fetchFieldList;
	}

	public void setFetchFieldList(String fetchFieldList) {
		this.fetchFieldList = fetchFieldList;
		if(fetchFieldList != null){
			putBodyParameter("FetchFieldList", fetchFieldList);
		}
	}

	public String getBizStatus() {
		return this.bizStatus;
	}

	public void setBizStatus(String bizStatus) {
		this.bizStatus = bizStatus;
		if(bizStatus != null){
			putBodyParameter("BizStatus", bizStatus);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public String getIsIpDomains() {
		return this.isIpDomains;
	}

	public void setIsIpDomains(String isIpDomains) {
		this.isIpDomains = isIpDomains;
		if(isIpDomains != null){
			putBodyParameter("IsIpDomains", isIpDomains);
		}
	}

	public String getPowerTag() {
		return this.powerTag;
	}

	public void setPowerTag(String powerTag) {
		this.powerTag = powerTag;
		if(powerTag != null){
			putBodyParameter("PowerTag", powerTag);
		}
	}

	public String getPositionRequirement() {
		return this.positionRequirement;
	}

	public void setPositionRequirement(String positionRequirement) {
		this.positionRequirement = positionRequirement;
		if(positionRequirement != null){
			putBodyParameter("PositionRequirement", positionRequirement);
		}
	}

	public String getBizCategory() {
		return this.bizCategory;
	}

	public void setBizCategory(String bizCategory) {
		this.bizCategory = bizCategory;
		if(bizCategory != null){
			putBodyParameter("BizCategory", bizCategory);
		}
	}

	public String getIsEmail() {
		return this.isEmail;
	}

	public void setIsEmail(String isEmail) {
		this.isEmail = isEmail;
		if(isEmail != null){
			putBodyParameter("IsEmail", isEmail);
		}
	}

	public String getSpreadInfo() {
		return this.spreadInfo;
	}

	public void setSpreadInfo(String spreadInfo) {
		this.spreadInfo = spreadInfo;
		if(spreadInfo != null){
			putBodyParameter("SpreadInfo", spreadInfo);
		}
	}

	public Long getPushDataLimit() {
		return this.pushDataLimit;
	}

	public void setPushDataLimit(Long pushDataLimit) {
		this.pushDataLimit = pushDataLimit;
		if(pushDataLimit != null){
			putBodyParameter("PushDataLimit", pushDataLimit.toString());
		}
	}

	public String getIsNormalCopyrights() {
		return this.isNormalCopyrights;
	}

	public void setIsNormalCopyrights(String isNormalCopyrights) {
		this.isNormalCopyrights = isNormalCopyrights;
		if(isNormalCopyrights != null){
			putBodyParameter("IsNormalCopyrights", isNormalCopyrights);
		}
	}

	public String getIsFixedPhone() {
		return this.isFixedPhone;
	}

	public void setIsFixedPhone(String isFixedPhone) {
		this.isFixedPhone = isFixedPhone;
		if(isFixedPhone != null){
			putBodyParameter("IsFixedPhone", isFixedPhone);
		}
	}

	public String getIsZone() {
		return this.isZone;
	}

	public void setIsZone(String isZone) {
		this.isZone = isZone;
		if(isZone != null){
			putBodyParameter("IsZone", isZone);
		}
	}

	public String getCompanyNames() {
		return this.companyNames;
	}

	public void setCompanyNames(String companyNames) {
		this.companyNames = companyNames;
		if(companyNames != null){
			putBodyParameter("CompanyNames", companyNames);
		}
	}

	public Boolean getFetchLbsInfo() {
		return this.fetchLbsInfo;
	}

	public void setFetchLbsInfo(Boolean fetchLbsInfo) {
		this.fetchLbsInfo = fetchLbsInfo;
		if(fetchLbsInfo != null){
			putBodyParameter("FetchLbsInfo", fetchLbsInfo.toString());
		}
	}

	public String getIsInvestment() {
		return this.isInvestment;
	}

	public void setIsInvestment(String isInvestment) {
		this.isInvestment = isInvestment;
		if(isInvestment != null){
			putBodyParameter("IsInvestment", isInvestment);
		}
	}

	public String getBizType() {
		return this.bizType;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
		if(bizType != null){
			putBodyParameter("BizType", bizType);
		}
	}

	public String getBizScope() {
		return this.bizScope;
	}

	public void setBizScope(String bizScope) {
		this.bizScope = bizScope;
		if(bizScope != null){
			putBodyParameter("BizScope", bizScope);
		}
	}

	public String getPushUrl() {
		return this.pushUrl;
	}

	public void setPushUrl(String pushUrl) {
		this.pushUrl = pushUrl;
		if(pushUrl != null){
			putBodyParameter("PushUrl", pushUrl);
		}
	}

	public String getIsProductNames() {
		return this.isProductNames;
	}

	public void setIsProductNames(String isProductNames) {
		this.isProductNames = isProductNames;
		if(isProductNames != null){
			putBodyParameter("IsProductNames", isProductNames);
		}
	}

	public String getTransformRate() {
		return this.transformRate;
	}

	public void setTransformRate(String transformRate) {
		this.transformRate = transformRate;
		if(transformRate != null){
			putBodyParameter("TransformRate", transformRate);
		}
	}

	public String getCompanyType() {
		return this.companyType;
	}

	public void setCompanyType(String companyType) {
		this.companyType = companyType;
		if(companyType != null){
			putBodyParameter("CompanyType", companyType);
		}
	}

	public String getEsDateStart() {
		return this.esDateStart;
	}

	public void setEsDateStart(String esDateStart) {
		this.esDateStart = esDateStart;
		if(esDateStart != null){
			putBodyParameter("EsDateStart", esDateStart);
		}
	}

	public String getRecruitEducationLevel() {
		return this.recruitEducationLevel;
	}

	public void setRecruitEducationLevel(String recruitEducationLevel) {
		this.recruitEducationLevel = recruitEducationLevel;
		if(recruitEducationLevel != null){
			putBodyParameter("RecruitEducationLevel", recruitEducationLevel);
		}
	}

	@Override
	public Class<QueryCompanyResponse> getResponseClass() {
		return QueryCompanyResponse.class;
	}

}
