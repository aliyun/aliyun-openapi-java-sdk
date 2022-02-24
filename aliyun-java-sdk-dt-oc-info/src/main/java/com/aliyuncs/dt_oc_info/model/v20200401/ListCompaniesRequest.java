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
public class ListCompaniesRequest extends RpcAcsRequest<ListCompaniesResponse> {
	   

	private String registerAssert;

	private String productShopMatch;

	private String licenseNumber;

	private String spreadInfo;

	private String regions;

	private Integer offset;

	private String recCap;

	private String staffSize;

	private String bizCategories;

	private String newCorp;

	private String orderBy;

	private String brandInfo;

	private String bizType;

	private String lifecycle;

	private String bizScopeKeyword;

	private String orgNo;

	private String bizStatus;

	private String buildTime;

	private String companyType;

	private Integer limit;

	private String bizInfo;

	private String corpName;
	public ListCompaniesRequest() {
		super("dt-oc-info", "2020-04-01", "ListCompanies");
		setMethod(MethodType.POST);
	}

	public String getRegisterAssert() {
		return this.registerAssert;
	}

	public void setRegisterAssert(String registerAssert) {
		this.registerAssert = registerAssert;
		if(registerAssert != null){
			putBodyParameter("RegisterAssert", registerAssert);
		}
	}

	public String getProductShopMatch() {
		return this.productShopMatch;
	}

	public void setProductShopMatch(String productShopMatch) {
		this.productShopMatch = productShopMatch;
		if(productShopMatch != null){
			putQueryParameter("ProductShopMatch", productShopMatch);
		}
	}

	public String getLicenseNumber() {
		return this.licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
		if(licenseNumber != null){
			putQueryParameter("LicenseNumber", licenseNumber);
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

	public String getRegions() {
		return this.regions;
	}

	public void setRegions(String regions) {
		this.regions = regions;
		if(regions != null){
			putBodyParameter("Regions", regions);
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

	public String getRecCap() {
		return this.recCap;
	}

	public void setRecCap(String recCap) {
		this.recCap = recCap;
		if(recCap != null){
			putQueryParameter("RecCap", recCap);
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

	public String getBizCategories() {
		return this.bizCategories;
	}

	public void setBizCategories(String bizCategories) {
		this.bizCategories = bizCategories;
		if(bizCategories != null){
			putBodyParameter("BizCategories", bizCategories);
		}
	}

	public String getNewCorp() {
		return this.newCorp;
	}

	public void setNewCorp(String newCorp) {
		this.newCorp = newCorp;
		if(newCorp != null){
			putBodyParameter("NewCorp", newCorp);
		}
	}

	public String getOrderBy() {
		return this.orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
		if(orderBy != null){
			putBodyParameter("OrderBy", orderBy);
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

	public String getBizType() {
		return this.bizType;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
		if(bizType != null){
			putBodyParameter("BizType", bizType);
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

	public String getBizScopeKeyword() {
		return this.bizScopeKeyword;
	}

	public void setBizScopeKeyword(String bizScopeKeyword) {
		this.bizScopeKeyword = bizScopeKeyword;
		if(bizScopeKeyword != null){
			putBodyParameter("BizScopeKeyword", bizScopeKeyword);
		}
	}

	public String getOrgNo() {
		return this.orgNo;
	}

	public void setOrgNo(String orgNo) {
		this.orgNo = orgNo;
		if(orgNo != null){
			putQueryParameter("OrgNo", orgNo);
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

	public String getBuildTime() {
		return this.buildTime;
	}

	public void setBuildTime(String buildTime) {
		this.buildTime = buildTime;
		if(buildTime != null){
			putBodyParameter("BuildTime", buildTime);
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

	public Integer getLimit() {
		return this.limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
		if(limit != null){
			putQueryParameter("Limit", limit.toString());
		}
	}

	public String getBizInfo() {
		return this.bizInfo;
	}

	public void setBizInfo(String bizInfo) {
		this.bizInfo = bizInfo;
		if(bizInfo != null){
			putBodyParameter("BizInfo", bizInfo);
		}
	}

	public String getCorpName() {
		return this.corpName;
	}

	public void setCorpName(String corpName) {
		this.corpName = corpName;
		if(corpName != null){
			putQueryParameter("CorpName", corpName);
		}
	}

	@Override
	public Class<ListCompaniesResponse> getResponseClass() {
		return ListCompaniesResponse.class;
	}

}
