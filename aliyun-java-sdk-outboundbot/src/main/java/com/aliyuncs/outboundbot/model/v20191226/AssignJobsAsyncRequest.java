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

package com.aliyuncs.outboundbot.model.v20191226;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.outboundbot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AssignJobsAsyncRequest extends RpcAcsRequest<AssignJobsAsyncResponse> {
	   

	@SerializedName("jobsJson")
	private List<String> jobsJson;

	@SerializedName("callingNumber")
	private List<String> callingNumber;

	private String instanceId;

	private String strategyJson;

	private String jobGroupId;
	public AssignJobsAsyncRequest() {
		super("OutboundBot", "2019-12-26", "AssignJobsAsync", "outboundbot");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getJobsJson() {
		return this.jobsJson;
	}

	public void setJobsJson(List<String> jobsJson) {
		this.jobsJson = jobsJson;	
		if (jobsJson != null) {
			putBodyParameter("JobsJson" , new Gson().toJson(jobsJson));
		}	
	}

	public List<String> getCallingNumber() {
		return this.callingNumber;
	}

	public void setCallingNumber(List<String> callingNumber) {
		this.callingNumber = callingNumber;	
		if (callingNumber != null) {
			putBodyParameter("CallingNumber" , new Gson().toJson(callingNumber));
		}	
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putBodyParameter("InstanceId", instanceId);
		}
	}

	public String getStrategyJson() {
		return this.strategyJson;
	}

	public void setStrategyJson(String strategyJson) {
		this.strategyJson = strategyJson;
		if(strategyJson != null){
			putBodyParameter("StrategyJson", strategyJson);
		}
	}

	public String getJobGroupId() {
		return this.jobGroupId;
	}

	public void setJobGroupId(String jobGroupId) {
		this.jobGroupId = jobGroupId;
		if(jobGroupId != null){
			putBodyParameter("JobGroupId", jobGroupId);
		}
	}

	@Override
	public Class<AssignJobsAsyncResponse> getResponseClass() {
		return AssignJobsAsyncResponse.class;
	}

}
