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

package com.aliyuncs.phoenixsp_inner.model.v20160805;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class FindUserAvailableResourcesByRequest extends RpcAcsRequest<FindUserAvailableResourcesByResponse> {
	
	public FindUserAvailableResourcesByRequest() {
		super("Phoenixsp-inner", "2016-08-05", "FindUserAvailableResourcesBy");
	}

	private Long beginEndTime;

	private Long endResCreateTime;

	private String billingTag;

	private String commodityCode;

	private Integer availableDays;

	private String resourceType;

	private Long beginResCreateTime;

	private Integer currPage;

	private String caller;

	private Boolean autoRenewal;

	private Long endEndTime;

	private String instanceIdList;

	private String renewalStatus;

	private Boolean hasExpiredRes;

	private Integer pageSize;

	private Long aliuid;

	private Boolean isPrepaid;

	private String bid;

	private String region;

	public Long getBeginEndTime() {
		return this.beginEndTime;
	}

	public void setBeginEndTime(Long beginEndTime) {
		this.beginEndTime = beginEndTime;
		if(beginEndTime != null){
			putQueryParameter("BeginEndTime", beginEndTime.toString());
		}
	}

	public Long getEndResCreateTime() {
		return this.endResCreateTime;
	}

	public void setEndResCreateTime(Long endResCreateTime) {
		this.endResCreateTime = endResCreateTime;
		if(endResCreateTime != null){
			putQueryParameter("EndResCreateTime", endResCreateTime.toString());
		}
	}

	public String getBillingTag() {
		return this.billingTag;
	}

	public void setBillingTag(String billingTag) {
		this.billingTag = billingTag;
		if(billingTag != null){
			putQueryParameter("BillingTag", billingTag);
		}
	}

	public String getCommodityCode() {
		return this.commodityCode;
	}

	public void setCommodityCode(String commodityCode) {
		this.commodityCode = commodityCode;
		if(commodityCode != null){
			putQueryParameter("CommodityCode", commodityCode);
		}
	}

	public Integer getAvailableDays() {
		return this.availableDays;
	}

	public void setAvailableDays(Integer availableDays) {
		this.availableDays = availableDays;
		if(availableDays != null){
			putQueryParameter("AvailableDays", availableDays.toString());
		}
	}

	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
		if(resourceType != null){
			putQueryParameter("ResourceType", resourceType);
		}
	}

	public Long getBeginResCreateTime() {
		return this.beginResCreateTime;
	}

	public void setBeginResCreateTime(Long beginResCreateTime) {
		this.beginResCreateTime = beginResCreateTime;
		if(beginResCreateTime != null){
			putQueryParameter("BeginResCreateTime", beginResCreateTime.toString());
		}
	}

	public Integer getCurrPage() {
		return this.currPage;
	}

	public void setCurrPage(Integer currPage) {
		this.currPage = currPage;
		if(currPage != null){
			putQueryParameter("CurrPage", currPage.toString());
		}
	}

	public String getCaller() {
		return this.caller;
	}

	public void setCaller(String caller) {
		this.caller = caller;
		if(caller != null){
			putQueryParameter("Caller", caller);
		}
	}

	public Boolean getAutoRenewal() {
		return this.autoRenewal;
	}

	public void setAutoRenewal(Boolean autoRenewal) {
		this.autoRenewal = autoRenewal;
		if(autoRenewal != null){
			putQueryParameter("AutoRenewal", autoRenewal.toString());
		}
	}

	public Long getEndEndTime() {
		return this.endEndTime;
	}

	public void setEndEndTime(Long endEndTime) {
		this.endEndTime = endEndTime;
		if(endEndTime != null){
			putQueryParameter("EndEndTime", endEndTime.toString());
		}
	}

	public String getInstanceIdList() {
		return this.instanceIdList;
	}

	public void setInstanceIdList(String instanceIdList) {
		this.instanceIdList = instanceIdList;
		if(instanceIdList != null){
			putQueryParameter("InstanceIdList", instanceIdList);
		}
	}

	public String getRenewalStatus() {
		return this.renewalStatus;
	}

	public void setRenewalStatus(String renewalStatus) {
		this.renewalStatus = renewalStatus;
		if(renewalStatus != null){
			putQueryParameter("RenewalStatus", renewalStatus);
		}
	}

	public Boolean getHasExpiredRes() {
		return this.hasExpiredRes;
	}

	public void setHasExpiredRes(Boolean hasExpiredRes) {
		this.hasExpiredRes = hasExpiredRes;
		if(hasExpiredRes != null){
			putQueryParameter("HasExpiredRes", hasExpiredRes.toString());
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

	public Long getAliuid() {
		return this.aliuid;
	}

	public void setAliuid(Long aliuid) {
		this.aliuid = aliuid;
		if(aliuid != null){
			putQueryParameter("Aliuid", aliuid.toString());
		}
	}

	public Boolean getIsPrepaid() {
		return this.isPrepaid;
	}

	public void setIsPrepaid(Boolean isPrepaid) {
		this.isPrepaid = isPrepaid;
		if(isPrepaid != null){
			putQueryParameter("IsPrepaid", isPrepaid.toString());
		}
	}

	public String getBid() {
		return this.bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
		if(bid != null){
			putQueryParameter("Bid", bid);
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
	public Class<FindUserAvailableResourcesByResponse> getResponseClass() {
		return FindUserAvailableResourcesByResponse.class;
	}

}
