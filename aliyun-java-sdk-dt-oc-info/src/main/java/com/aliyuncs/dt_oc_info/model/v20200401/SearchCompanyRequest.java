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
public class SearchCompanyRequest extends RpcAcsRequest<SearchCompanyResponse> {
	   

	private String registerAssert;

	private String licenseNumber;

	private String regions;

	private String recCap;

	private String staffSize;

	private String newCorp;

	private String lifecycle;

	private String bizScopeKeyword;

	private String bizStatus;

	private Integer limit;

	private String keyword;

	private String goodsCorpType;

	private String goodsList;

	private String productShopMatch;

	private String spreadInfo;

	private Integer offset;

	private String bizCategories;

	private String orderBy;

	private String brandInfo;

	private String bizType;

	private String orgNo;

	private String buildTime;

	private String companyType;

	private String bizInfo;

	private String corpName;

	private String region;

	private String account;
	public SearchCompanyRequest() {
		super("dt-oc-info", "2020-04-01", "SearchCompany");
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

	public String getLicenseNumber() {
		return this.licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
		if(licenseNumber != null){
			putQueryParameter("LicenseNumber", licenseNumber);
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

	public String getNewCorp() {
		return this.newCorp;
	}

	public void setNewCorp(String newCorp) {
		this.newCorp = newCorp;
		if(newCorp != null){
			putQueryParameter("NewCorp", newCorp);
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

	public String getBizStatus() {
		return this.bizStatus;
	}

	public void setBizStatus(String bizStatus) {
		this.bizStatus = bizStatus;
		if(bizStatus != null){
			putBodyParameter("BizStatus", bizStatus);
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

	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
		if(keyword != null){
			putQueryParameter("Keyword", keyword);
		}
	}

	public String getGoodsCorpType() {
		return this.goodsCorpType;
	}

	public void setGoodsCorpType(String goodsCorpType) {
		this.goodsCorpType = goodsCorpType;
		if(goodsCorpType != null){
			putQueryParameter("GoodsCorpType", goodsCorpType);
		}
	}

	public String getGoodsList() {
		return this.goodsList;
	}

	public void setGoodsList(String goodsList) {
		this.goodsList = goodsList;
		if(goodsList != null){
			putQueryParameter("GoodsList", goodsList);
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

	public String getSpreadInfo() {
		return this.spreadInfo;
	}

	public void setSpreadInfo(String spreadInfo) {
		this.spreadInfo = spreadInfo;
		if(spreadInfo != null){
			putBodyParameter("SpreadInfo", spreadInfo);
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

	public String getBizCategories() {
		return this.bizCategories;
	}

	public void setBizCategories(String bizCategories) {
		this.bizCategories = bizCategories;
		if(bizCategories != null){
			putBodyParameter("BizCategories", bizCategories);
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

	public String getOrgNo() {
		return this.orgNo;
	}

	public void setOrgNo(String orgNo) {
		this.orgNo = orgNo;
		if(orgNo != null){
			putQueryParameter("OrgNo", orgNo);
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

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
		if(region != null){
			putBodyParameter("Region", region);
		}
	}

	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
		if(account != null){
			putQueryParameter("Account", account);
		}
	}

	@Override
	public Class<SearchCompanyResponse> getResponseClass() {
		return SearchCompanyResponse.class;
	}

}
