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

package com.aliyuncs.emr.model.v20160408;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ModifyExecutionPlanScheduleInfoRequest extends RpcAcsRequest<ModifyExecutionPlanScheduleInfoResponse> {
	
	public ModifyExecutionPlanScheduleInfoRequest() {
		super("Emr", "2016-04-08", "ModifyExecutionPlanScheduleInfo");
	}

	private Long resourceOwnerId;

	private Integer timeInterval;

	private String dayOfWeek;

	private String id;

	private Long startTime;

	private String strategy;

	private String timeUnit;

	private String dayOfMonth;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public Integer getTimeInterval() {
		return this.timeInterval;
	}

	public void setTimeInterval(Integer timeInterval) {
		this.timeInterval = timeInterval;
		if(timeInterval != null){
			putQueryParameter("TimeInterval", timeInterval.toString());
		}
	}

	public String getDayOfWeek() {
		return this.dayOfWeek;
	}

	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
		if(dayOfWeek != null){
			putQueryParameter("DayOfWeek", dayOfWeek);
		}
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id);
		}
	}

	public Long getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime.toString());
		}
	}

	public String getStrategy() {
		return this.strategy;
	}

	public void setStrategy(String strategy) {
		this.strategy = strategy;
		if(strategy != null){
			putQueryParameter("Strategy", strategy);
		}
	}

	public String getTimeUnit() {
		return this.timeUnit;
	}

	public void setTimeUnit(String timeUnit) {
		this.timeUnit = timeUnit;
		if(timeUnit != null){
			putQueryParameter("TimeUnit", timeUnit);
		}
	}

	public String getDayOfMonth() {
		return this.dayOfMonth;
	}

	public void setDayOfMonth(String dayOfMonth) {
		this.dayOfMonth = dayOfMonth;
		if(dayOfMonth != null){
			putQueryParameter("DayOfMonth", dayOfMonth);
		}
	}

	@Override
	public Class<ModifyExecutionPlanScheduleInfoResponse> getResponseClass() {
		return ModifyExecutionPlanScheduleInfoResponse.class;
	}

}
