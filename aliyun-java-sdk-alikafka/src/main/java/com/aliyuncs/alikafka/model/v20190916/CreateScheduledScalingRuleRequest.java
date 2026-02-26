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

package com.aliyuncs.alikafka.model.v20190916;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.alikafka.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateScheduledScalingRuleRequest extends RpcAcsRequest<CreateScheduledScalingRuleResponse> {
	   

	private String scheduleType;

	private String weeklyTypes;

	private Integer reservedPubFlow;

	private String timeZone;

	private String ruleName;

	private Long firstScheduledTime;

	private Boolean enable;

	private Integer durationMinutes;

	private Integer reservedSubFlow;

	private String instanceId;

	private String repeatType;
	public CreateScheduledScalingRuleRequest() {
		super("alikafka", "2019-09-16", "CreateScheduledScalingRule", "alikafka");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getScheduleType() {
		return this.scheduleType;
	}

	public void setScheduleType(String scheduleType) {
		this.scheduleType = scheduleType;
		if(scheduleType != null){
			putQueryParameter("ScheduleType", scheduleType);
		}
	}

	public String getWeeklyTypes() {
		return this.weeklyTypes;
	}

	public void setWeeklyTypes(String weeklyTypes) {
		this.weeklyTypes = weeklyTypes;
		if(weeklyTypes != null){
			putQueryParameter("WeeklyTypes", weeklyTypes);
		}
	}

	public Integer getReservedPubFlow() {
		return this.reservedPubFlow;
	}

	public void setReservedPubFlow(Integer reservedPubFlow) {
		this.reservedPubFlow = reservedPubFlow;
		if(reservedPubFlow != null){
			putQueryParameter("ReservedPubFlow", reservedPubFlow.toString());
		}
	}

	public String getTimeZone() {
		return this.timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
		if(timeZone != null){
			putQueryParameter("TimeZone", timeZone);
		}
	}

	public String getRuleName() {
		return this.ruleName;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
		if(ruleName != null){
			putQueryParameter("RuleName", ruleName);
		}
	}

	public Long getFirstScheduledTime() {
		return this.firstScheduledTime;
	}

	public void setFirstScheduledTime(Long firstScheduledTime) {
		this.firstScheduledTime = firstScheduledTime;
		if(firstScheduledTime != null){
			putQueryParameter("FirstScheduledTime", firstScheduledTime.toString());
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

	public Integer getDurationMinutes() {
		return this.durationMinutes;
	}

	public void setDurationMinutes(Integer durationMinutes) {
		this.durationMinutes = durationMinutes;
		if(durationMinutes != null){
			putQueryParameter("DurationMinutes", durationMinutes.toString());
		}
	}

	public Integer getReservedSubFlow() {
		return this.reservedSubFlow;
	}

	public void setReservedSubFlow(Integer reservedSubFlow) {
		this.reservedSubFlow = reservedSubFlow;
		if(reservedSubFlow != null){
			putQueryParameter("ReservedSubFlow", reservedSubFlow.toString());
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

	public String getRepeatType() {
		return this.repeatType;
	}

	public void setRepeatType(String repeatType) {
		this.repeatType = repeatType;
		if(repeatType != null){
			putQueryParameter("RepeatType", repeatType);
		}
	}

	@Override
	public Class<CreateScheduledScalingRuleResponse> getResponseClass() {
		return CreateScheduledScalingRuleResponse.class;
	}

}
