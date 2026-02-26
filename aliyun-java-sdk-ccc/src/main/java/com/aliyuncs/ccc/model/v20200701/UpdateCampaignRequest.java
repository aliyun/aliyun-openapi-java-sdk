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

package com.aliyuncs.ccc.model.v20200701;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ccc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateCampaignRequest extends RpcAcsRequest<UpdateCampaignResponse> {
	   

	private String contactFlowId;

	private String instanceId;

	private String campaignId;

	private String name;

	private String endTime;

	private String startTime;

	private String strategyParameters;

	private String callableTime;
	public UpdateCampaignRequest() {
		super("CCC", "2020-07-01", "UpdateCampaign", "CCC");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getContactFlowId() {
		return this.contactFlowId;
	}

	public void setContactFlowId(String contactFlowId) {
		this.contactFlowId = contactFlowId;
		if(contactFlowId != null){
			putQueryParameter("ContactFlowId", contactFlowId);
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

	public String getCampaignId() {
		return this.campaignId;
	}

	public void setCampaignId(String campaignId) {
		this.campaignId = campaignId;
		if(campaignId != null){
			putQueryParameter("CampaignId", campaignId);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
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

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime);
		}
	}

	public String getStrategyParameters() {
		return this.strategyParameters;
	}

	public void setStrategyParameters(String strategyParameters) {
		this.strategyParameters = strategyParameters;
		if(strategyParameters != null){
			putQueryParameter("StrategyParameters", strategyParameters);
		}
	}

	public String getCallableTime() {
		return this.callableTime;
	}

	public void setCallableTime(String callableTime) {
		this.callableTime = callableTime;
		if(callableTime != null){
			putQueryParameter("CallableTime", callableTime);
		}
	}

	@Override
	public Class<UpdateCampaignResponse> getResponseClass() {
		return UpdateCampaignResponse.class;
	}

}
