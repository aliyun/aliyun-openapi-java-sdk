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
public class CreateJobGroupRequest extends RpcAcsRequest<CreateJobGroupResponse> {
	   

	private String jobGroupDescription;

	private String jobGroupName;

	private String scriptId;

	private List<String> callingNumbers;

	private String instanceId;

	private String strategyJson;

	private String scenarioId;
	public CreateJobGroupRequest() {
		super("OutboundBot", "2019-12-26", "CreateJobGroup", "outboundbot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getJobGroupDescription() {
		return this.jobGroupDescription;
	}

	public void setJobGroupDescription(String jobGroupDescription) {
		this.jobGroupDescription = jobGroupDescription;
		if(jobGroupDescription != null){
			putQueryParameter("JobGroupDescription", jobGroupDescription);
		}
	}

	public String getJobGroupName() {
		return this.jobGroupName;
	}

	public void setJobGroupName(String jobGroupName) {
		this.jobGroupName = jobGroupName;
		if(jobGroupName != null){
			putQueryParameter("JobGroupName", jobGroupName);
		}
	}

	public String getScriptId() {
		return this.scriptId;
	}

	public void setScriptId(String scriptId) {
		this.scriptId = scriptId;
		if(scriptId != null){
			putQueryParameter("ScriptId", scriptId);
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
	public Class<CreateJobGroupResponse> getResponseClass() {
		return CreateJobGroupResponse.class;
	}

}
