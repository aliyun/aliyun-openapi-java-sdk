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
public class CountRegionAvailableResourcesByRequest extends RpcAcsRequest<CountRegionAvailableResourcesByResponse> {
	
	public CountRegionAvailableResourcesByRequest() {
		super("Phoenixsp-inner", "2016-08-05", "CountRegionAvailableResourcesBy");
	}

	private String marketType;

	private String filter;

	private String caller;

	private Long resCreateTimeEnd;

	private String resourceSource;

	private Long aliUID;

	private String chargeType;

	private String commodityCode;

	private String bid;

	private String region;

	private String resourceType;

	private Long resCreateTimeBegin;

	public String getMarketType() {
		return this.marketType;
	}

	public void setMarketType(String marketType) {
		this.marketType = marketType;
		if(marketType != null){
			putQueryParameter("MarketType", marketType);
		}
	}

	public String getFilter() {
		return this.filter;
	}

	public void setFilter(String filter) {
		this.filter = filter;
		if(filter != null){
			putQueryParameter("Filter", filter);
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

	public Long getResCreateTimeEnd() {
		return this.resCreateTimeEnd;
	}

	public void setResCreateTimeEnd(Long resCreateTimeEnd) {
		this.resCreateTimeEnd = resCreateTimeEnd;
		if(resCreateTimeEnd != null){
			putQueryParameter("ResCreateTimeEnd", resCreateTimeEnd.toString());
		}
	}

	public String getResourceSource() {
		return this.resourceSource;
	}

	public void setResourceSource(String resourceSource) {
		this.resourceSource = resourceSource;
		if(resourceSource != null){
			putQueryParameter("ResourceSource", resourceSource);
		}
	}

	public Long getAliUID() {
		return this.aliUID;
	}

	public void setAliUID(Long aliUID) {
		this.aliUID = aliUID;
		if(aliUID != null){
			putQueryParameter("AliUID", aliUID.toString());
		}
	}

	public String getChargeType() {
		return this.chargeType;
	}

	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
		if(chargeType != null){
			putQueryParameter("ChargeType", chargeType);
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

	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
		if(resourceType != null){
			putQueryParameter("ResourceType", resourceType);
		}
	}

	public Long getResCreateTimeBegin() {
		return this.resCreateTimeBegin;
	}

	public void setResCreateTimeBegin(Long resCreateTimeBegin) {
		this.resCreateTimeBegin = resCreateTimeBegin;
		if(resCreateTimeBegin != null){
			putQueryParameter("ResCreateTimeBegin", resCreateTimeBegin.toString());
		}
	}

	@Override
	public Class<CountRegionAvailableResourcesByResponse> getResponseClass() {
		return CountRegionAvailableResourcesByResponse.class;
	}

}
