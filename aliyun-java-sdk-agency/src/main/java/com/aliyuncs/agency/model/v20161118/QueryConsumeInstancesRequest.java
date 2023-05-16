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

package com.aliyuncs.agency.model.v20161118;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.agency.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryConsumeInstancesRequest extends RpcAcsRequest<QueryConsumeInstancesResponse> {
	   

	private String ownerAccount;

	private String endTime;

	private String commodityCode;

	private String startTime;

	private String consumeCategory;

	private Long pageMinId;

	private Integer pageSize;

	private Boolean needDetail;
	public QueryConsumeInstancesRequest() {
		super("Agency", "2016-11-18", "QueryConsumeInstances", "openApi");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime);
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

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime);
		}
	}

	public String getConsumeCategory() {
		return this.consumeCategory;
	}

	public void setConsumeCategory(String consumeCategory) {
		this.consumeCategory = consumeCategory;
		if(consumeCategory != null){
			putQueryParameter("ConsumeCategory", consumeCategory);
		}
	}

	public Long getPageMinId() {
		return this.pageMinId;
	}

	public void setPageMinId(Long pageMinId) {
		this.pageMinId = pageMinId;
		if(pageMinId != null){
			putQueryParameter("PageMinId", pageMinId.toString());
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

	public Boolean getNeedDetail() {
		return this.needDetail;
	}

	public void setNeedDetail(Boolean needDetail) {
		this.needDetail = needDetail;
		if(needDetail != null){
			putQueryParameter("NeedDetail", needDetail.toString());
		}
	}

	@Override
	public Class<QueryConsumeInstancesResponse> getResponseClass() {
		return QueryConsumeInstancesResponse.class;
	}

}
