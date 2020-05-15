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
public class StartJobRequest extends RpcAcsRequest<StartJobResponse> {
	   

	private String jobJson;

	private List<String> callingNumbers;

	private String instanceId;

	private String jobGroupId;

	private Boolean selfHostedCallCenter;

	private String scenarioId;
	public StartJobRequest() {
		super("OutboundBot", "2019-12-26", "StartJob", "outboundbot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getJobJson() {
		return this.jobJson;
	}

	public void setJobJson(String jobJson) {
		this.jobJson = jobJson;
		if(jobJson != null){
			putQueryParameter("JobJson", jobJson);
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

	public String getJobGroupId() {
		return this.jobGroupId;
	}

	public void setJobGroupId(String jobGroupId) {
		this.jobGroupId = jobGroupId;
		if(jobGroupId != null){
			putQueryParameter("JobGroupId", jobGroupId);
		}
	}

	public Boolean getSelfHostedCallCenter() {
		return this.selfHostedCallCenter;
	}

	public void setSelfHostedCallCenter(Boolean selfHostedCallCenter) {
		this.selfHostedCallCenter = selfHostedCallCenter;
		if(selfHostedCallCenter != null){
			putQueryParameter("SelfHostedCallCenter", selfHostedCallCenter.toString());
		}
	}

	public String getScenarioId() {
		return this.scenarioId;
	}

	public void setScenarioId(String scenarioId) {
		this.scenarioId = scenarioId;
		if(scenarioId != null){
			putQueryParameter("ScenarioId", scenarioId);
		}
	}

	@Override
	public Class<StartJobResponse> getResponseClass() {
		return StartJobResponse.class;
	}

}
