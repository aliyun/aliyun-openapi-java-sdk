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

package com.aliyuncs.ecs.model.v20140526;

import com.aliyuncs.RpcAcsRequest;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribePlanMaintenanceWindowsRequest extends RpcAcsRequest<DescribePlanMaintenanceWindowsResponse> {
	   

	@SerializedName("targetResourceTags")
	private TargetResourceTags targetResourceTags;

	private String planWindowId;

	private String nextToken;

	private Boolean enable;

	private String planWindowName;

	private String targetResourceGroupId;

	private Integer maxResults;
	public DescribePlanMaintenanceWindowsRequest() {
		super("Ecs", "2014-05-26", "DescribePlanMaintenanceWindows", "ecs");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public TargetResourceTags getTargetResourceTags() {
		return this.targetResourceTags;
	}

	public void setTargetResourceTags(TargetResourceTags targetResourceTags) {
		this.targetResourceTags = targetResourceTags;	
		if (targetResourceTags != null) {
			putQueryParameter("TargetResourceTags" , new Gson().toJson(targetResourceTags));
		}	
	}

	public String getPlanWindowId() {
		return this.planWindowId;
	}

	public void setPlanWindowId(String planWindowId) {
		this.planWindowId = planWindowId;
		if(planWindowId != null){
			putQueryParameter("PlanWindowId", planWindowId);
		}
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putQueryParameter("NextToken", nextToken);
		}
	}

	public Boolean getEnable() {
		return this.enable;
	}

	public void setEnable(Boolean enable) {
		this.enable = enable;
		if(enable != null){
			putQueryParameter("Enable", enable.toString());
		}
	}

	public String getPlanWindowName() {
		return this.planWindowName;
	}

	public void setPlanWindowName(String planWindowName) {
		this.planWindowName = planWindowName;
		if(planWindowName != null){
			putQueryParameter("PlanWindowName", planWindowName);
		}
	}

	public String getTargetResourceGroupId() {
		return this.targetResourceGroupId;
	}

	public void setTargetResourceGroupId(String targetResourceGroupId) {
		this.targetResourceGroupId = targetResourceGroupId;
		if(targetResourceGroupId != null){
			putQueryParameter("TargetResourceGroupId", targetResourceGroupId);
		}
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("MaxResults", maxResults.toString());
		}
	}

	public static class TargetResourceTags {

		@SerializedName("Value")
		private String value;

		@SerializedName("Key")
		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	@Override
	public Class<DescribePlanMaintenanceWindowsResponse> getResponseClass() {
		return DescribePlanMaintenanceWindowsResponse.class;
	}

}
