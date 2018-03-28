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
public class FindBillingInfoByUserInPeriodRequest extends RpcAcsRequest<FindBillingInfoByUserInPeriodResponse> {
	
	public FindBillingInfoByUserInPeriodRequest() {
		super("Phoenixsp-inner", "2016-08-05", "FindBillingInfoByUserInPeriod");
	}

	private Integer currPage;

	private Integer pageSize;

	private Long endTime;

	private Long aliUID;

	private String commodityCode;

	private Long startTime;

	private String bid;

	private String tradeInstanceID;

	public Integer getCurrPage() {
		return this.currPage;
	}

	public void setCurrPage(Integer currPage) {
		this.currPage = currPage;
		if(currPage != null){
			putQueryParameter("CurrPage", currPage.toString());
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

	public Long getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime.toString());
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

	public String getCommodityCode() {
		return this.commodityCode;
	}

	public void setCommodityCode(String commodityCode) {
		this.commodityCode = commodityCode;
		if(commodityCode != null){
			putQueryParameter("CommodityCode", commodityCode);
		}
	}

	public Long getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime.toString());
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

	public String getTradeInstanceID() {
		return this.tradeInstanceID;
	}

	public void setTradeInstanceID(String tradeInstanceID) {
		this.tradeInstanceID = tradeInstanceID;
		if(tradeInstanceID != null){
			putQueryParameter("TradeInstanceID", tradeInstanceID);
		}
	}

	@Override
	public Class<FindBillingInfoByUserInPeriodResponse> getResponseClass() {
		return FindBillingInfoByUserInPeriodResponse.class;
	}

}
