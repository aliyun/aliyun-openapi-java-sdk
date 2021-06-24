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

package com.aliyuncs.bssopenapi.model.v20171214;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.bssopenapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryDPUtilizationDetailRequest extends RpcAcsRequest<QueryDPUtilizationDetailResponse> {
	   

	private String deductedInstanceId;

	private String lastToken;

	private String instanceSpec;

	private String endTime;

	private Boolean includeShare;

	private String commodityCode;

	private String startTime;

	private String instanceId;

	private Integer limit;
	public QueryDPUtilizationDetailRequest() {
		super("BssOpenApi", "2017-12-14", "QueryDPUtilizationDetail");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDeductedInstanceId() {
		return this.deductedInstanceId;
	}

	public void setDeductedInstanceId(String deductedInstanceId) {
		this.deductedInstanceId = deductedInstanceId;
		if(deductedInstanceId != null){
			putQueryParameter("DeductedInstanceId", deductedInstanceId);
		}
	}

	public String getLastToken() {
		return this.lastToken;
	}

	public void setLastToken(String lastToken) {
		this.lastToken = lastToken;
		if(lastToken != null){
			putQueryParameter("LastToken", lastToken);
		}
	}

	public String getInstanceSpec() {
		return this.instanceSpec;
	}

	public void setInstanceSpec(String instanceSpec) {
		this.instanceSpec = instanceSpec;
		if(instanceSpec != null){
			putQueryParameter("InstanceSpec", instanceSpec);
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

	public Boolean getIncludeShare() {
		return this.includeShare;
	}

	public void setIncludeShare(Boolean includeShare) {
		this.includeShare = includeShare;
		if(includeShare != null){
			putQueryParameter("IncludeShare", includeShare.toString());
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

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
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

	@Override
	public Class<QueryDPUtilizationDetailResponse> getResponseClass() {
		return QueryDPUtilizationDetailResponse.class;
	}

}
