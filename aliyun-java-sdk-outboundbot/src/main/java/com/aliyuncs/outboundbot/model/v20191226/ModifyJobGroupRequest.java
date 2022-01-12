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
public class ModifyJobGroupRequest extends RpcAcsRequest<ModifyJobGroupResponse> {
	   

	private String recallStrategyJson;

	private String description;

	private String scriptId;

	private String strategyJson;

	private Long ringingDuration;

	private String scenarioId;

	private String jobGroupStatus;

	private List<String> callingNumbers;

	private String instanceId;

	private String jobGroupId;

	private String name;
	public ModifyJobGroupRequest() {
		super("OutboundBot", "2019-12-26", "ModifyJobGroup", "outboundbot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getRecallStrategyJson() {
		return this.recallStrategyJson;
	}

	public void setRecallStrategyJson(String recallStrategyJson) {
		this.recallStrategyJson = recallStrategyJson;
		if(recallStrategyJson != null){
			putQueryParameter("RecallStrategyJson", recallStrategyJson);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
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

	public String getStrategyJson() {
		return this.strategyJson;
	}

	public void setStrategyJson(String strategyJson) {
		this.strategyJson = strategyJson;
		if(strategyJson != null){
			putQueryParameter("StrategyJson", strategyJson);
		}
	}

	public Long getRingingDuration() {
		return this.ringingDuration;
	}

	public void setRingingDuration(Long ringingDuration) {
		this.ringingDuration = ringingDuration;
		if(ringingDuration != null){
			putQueryParameter("RingingDuration", ringingDuration.toString());
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

	public String getJobGroupStatus() {
		return this.jobGroupStatus;
	}

	public void setJobGroupStatus(String jobGroupStatus) {
		this.jobGroupStatus = jobGroupStatus;
		if(jobGroupStatus != null){
			putQueryParameter("JobGroupStatus", jobGroupStatus);
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	@Override
	public Class<ModifyJobGroupResponse> getResponseClass() {
		return ModifyJobGroupResponse.class;
	}

}
