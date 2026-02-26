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

package com.aliyuncs.das.model.v20200116;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.das.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateAutoThrottleRulesAsyncRequest extends RpcAcsRequest<UpdateAutoThrottleRulesAsyncResponse> {
	   

	private String resultId;

	private String cpuSessionRelation;

	private Double abnormalDuration;

	private Double maxThrottleTime;

	private String consoleContext;

	private Double cpuUsage;

	private Boolean autoKillSession;

	private String allowThrottleStartTime;

	private String allowThrottleEndTime;

	private String instanceIds;

	private Long activeSessions;
	public UpdateAutoThrottleRulesAsyncRequest() {
		super("DAS", "2020-01-16", "UpdateAutoThrottleRulesAsync");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getResultId() {
		return this.resultId;
	}

	public void setResultId(String resultId) {
		this.resultId = resultId;
		if(resultId != null){
			putQueryParameter("ResultId", resultId);
		}
	}

	public String getCpuSessionRelation() {
		return this.cpuSessionRelation;
	}

	public void setCpuSessionRelation(String cpuSessionRelation) {
		this.cpuSessionRelation = cpuSessionRelation;
		if(cpuSessionRelation != null){
			putQueryParameter("CpuSessionRelation", cpuSessionRelation);
		}
	}

	public Double getAbnormalDuration() {
		return this.abnormalDuration;
	}

	public void setAbnormalDuration(Double abnormalDuration) {
		this.abnormalDuration = abnormalDuration;
		if(abnormalDuration != null){
			putQueryParameter("AbnormalDuration", abnormalDuration.toString());
		}
	}

	public Double getMaxThrottleTime() {
		return this.maxThrottleTime;
	}

	public void setMaxThrottleTime(Double maxThrottleTime) {
		this.maxThrottleTime = maxThrottleTime;
		if(maxThrottleTime != null){
			putQueryParameter("MaxThrottleTime", maxThrottleTime.toString());
		}
	}

	public String getConsoleContext() {
		return this.consoleContext;
	}

	public void setConsoleContext(String consoleContext) {
		this.consoleContext = consoleContext;
		if(consoleContext != null){
			putQueryParameter("ConsoleContext", consoleContext);
		}
	}

	public Double getCpuUsage() {
		return this.cpuUsage;
	}

	public void setCpuUsage(Double cpuUsage) {
		this.cpuUsage = cpuUsage;
		if(cpuUsage != null){
			putQueryParameter("CpuUsage", cpuUsage.toString());
		}
	}

	public Boolean getAutoKillSession() {
		return this.autoKillSession;
	}

	public void setAutoKillSession(Boolean autoKillSession) {
		this.autoKillSession = autoKillSession;
		if(autoKillSession != null){
			putQueryParameter("AutoKillSession", autoKillSession.toString());
		}
	}

	public String getAllowThrottleStartTime() {
		return this.allowThrottleStartTime;
	}

	public void setAllowThrottleStartTime(String allowThrottleStartTime) {
		this.allowThrottleStartTime = allowThrottleStartTime;
		if(allowThrottleStartTime != null){
			putQueryParameter("AllowThrottleStartTime", allowThrottleStartTime);
		}
	}

	public String getAllowThrottleEndTime() {
		return this.allowThrottleEndTime;
	}

	public void setAllowThrottleEndTime(String allowThrottleEndTime) {
		this.allowThrottleEndTime = allowThrottleEndTime;
		if(allowThrottleEndTime != null){
			putQueryParameter("AllowThrottleEndTime", allowThrottleEndTime);
		}
	}

	public String getInstanceIds() {
		return this.instanceIds;
	}

	public void setInstanceIds(String instanceIds) {
		this.instanceIds = instanceIds;
		if(instanceIds != null){
			putQueryParameter("InstanceIds", instanceIds);
		}
	}

	public Long getActiveSessions() {
		return this.activeSessions;
	}

	public void setActiveSessions(Long activeSessions) {
		this.activeSessions = activeSessions;
		if(activeSessions != null){
			putQueryParameter("ActiveSessions", activeSessions.toString());
		}
	}

	@Override
	public Class<UpdateAutoThrottleRulesAsyncResponse> getResponseClass() {
		return UpdateAutoThrottleRulesAsyncResponse.class;
	}

}
