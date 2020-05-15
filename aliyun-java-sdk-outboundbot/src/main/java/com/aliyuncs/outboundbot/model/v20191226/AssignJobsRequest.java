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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.outboundbot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AssignJobsRequest extends RpcAcsRequest<AssignJobsResponse> {
	   

	private List<String> jobsJsons;

	private List<String> callingNumbers;

	private String instanceId;

	private String strategyJson;

	private String jobGroupId;
	public AssignJobsRequest() {
		super("OutboundBot", "2019-12-26", "AssignJobs", "outboundbot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getJobsJsons() {
		return this.jobsJsons;
	}

	public void setJobsJsons(List<String> jobsJsons) {
		this.jobsJsons = jobsJsons;	
		if (jobsJsons != null) {
			for (int i = 0; i < jobsJsons.size(); i++) {
				putQueryParameter("JobsJson." + (i + 1) , jobsJsons.get(i));
			}
		}	
	}

	public List<String> getCallingNumbers() {
		return this.callingNumbers;
	}

	public void setCallingNumbers(List<String> callingNumbers) {
		this.callingNumbers = callingNumbers;	
		if (callingNumbers != null) {
			for (int i = 0; i < callingNumbers.size(); i++) {
				putQueryParameter("CallingNumber." + (i + 1) , callingNumbers.get(i));
			}
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

	public String getStrategyJson() {
		return this.strategyJson;
	}

	public void setStrategyJson(String strategyJson) {
		this.strategyJson = strategyJson;
		if(strategyJson != null){
			putQueryParameter("StrategyJson", strategyJson);
		}
	}

	public String getJobGroupId() {
		return this.jobGroupId;
	}

	public void setJobGroupId(String jobGroupId) {
		this.jobGroupId = jobGroupId;
		if(jobGroupId != null){
			putQueryParameter("JobGroupId", jobGroupId);
		}
	}

	@Override
	public Class<AssignJobsResponse> getResponseClass() {
		return AssignJobsResponse.class;
	}

}
