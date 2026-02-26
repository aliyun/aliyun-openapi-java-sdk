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
public class CreateCampaignRequest extends RpcAcsRequest<CreateCampaignResponse> {
	   

	private String queueId;

	private String contactFlowId;

	private Boolean simulation;

	private Boolean executingUntilTimeout;

	private String endTime;

	private String startTime;

	private Long maxAttemptCount;

	private String strategyParameters;

	private String caseFileKey;

	private Long minAttemptInterval;

	private String instanceId;

	private String simulationParameters;

	private String name;

	private String strategyType;

	private String caseList;

	private String callableTime;
	public CreateCampaignRequest() {
		super("CCC", "2020-07-01", "CreateCampaign", "CCC");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getQueueId() {
		return this.queueId;
	}

	public void setQueueId(String queueId) {
		this.queueId = queueId;
		if(queueId != null){
			putQueryParameter("QueueId", queueId);
		}
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

	public Boolean getSimulation() {
		return this.simulation;
	}

	public void setSimulation(Boolean simulation) {
		this.simulation = simulation;
		if(simulation != null){
			putQueryParameter("Simulation", simulation.toString());
		}
	}

	public Boolean getExecutingUntilTimeout() {
		return this.executingUntilTimeout;
	}

	public void setExecutingUntilTimeout(Boolean executingUntilTimeout) {
		this.executingUntilTimeout = executingUntilTimeout;
		if(executingUntilTimeout != null){
			putQueryParameter("ExecutingUntilTimeout", executingUntilTimeout.toString());
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

	public Long getMaxAttemptCount() {
		return this.maxAttemptCount;
	}

	public void setMaxAttemptCount(Long maxAttemptCount) {
		this.maxAttemptCount = maxAttemptCount;
		if(maxAttemptCount != null){
			putQueryParameter("MaxAttemptCount", maxAttemptCount.toString());
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

	public String getCaseFileKey() {
		return this.caseFileKey;
	}

	public void setCaseFileKey(String caseFileKey) {
		this.caseFileKey = caseFileKey;
		if(caseFileKey != null){
			putQueryParameter("CaseFileKey", caseFileKey);
		}
	}

	public Long getMinAttemptInterval() {
		return this.minAttemptInterval;
	}

	public void setMinAttemptInterval(Long minAttemptInterval) {
		this.minAttemptInterval = minAttemptInterval;
		if(minAttemptInterval != null){
			putQueryParameter("MinAttemptInterval", minAttemptInterval.toString());
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

	public String getSimulationParameters() {
		return this.simulationParameters;
	}

	public void setSimulationParameters(String simulationParameters) {
		this.simulationParameters = simulationParameters;
		if(simulationParameters != null){
			putQueryParameter("SimulationParameters", simulationParameters);
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

	public String getStrategyType() {
		return this.strategyType;
	}

	public void setStrategyType(String strategyType) {
		this.strategyType = strategyType;
		if(strategyType != null){
			putQueryParameter("StrategyType", strategyType);
		}
	}

	public String getCaseList() {
		return this.caseList;
	}

	public void setCaseList(String caseList) {
		this.caseList = caseList;
		if(caseList != null){
			putQueryParameter("CaseList", caseList);
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
	public Class<CreateCampaignResponse> getResponseClass() {
		return CreateCampaignResponse.class;
	}

}
