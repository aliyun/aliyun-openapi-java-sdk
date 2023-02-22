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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateCycleTaskRequest extends RpcAcsRequest<CreateCycleTaskResponse> {
	   

	private Long firstDateStr;

	private String taskName;

	private String source;

	private Integer targetStartTime;

	private Integer intervalPeriod;

	private String param;

	private Integer enable;

	private String taskType;

	private Integer targetEndTime;

	private String periodUnit;
	public CreateCycleTaskRequest() {
		super("Sas", "2018-12-03", "CreateCycleTask");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getFirstDateStr() {
		return this.firstDateStr;
	}

	public void setFirstDateStr(Long firstDateStr) {
		this.firstDateStr = firstDateStr;
		if(firstDateStr != null){
			putQueryParameter("FirstDateStr", firstDateStr.toString());
		}
	}

	public String getTaskName() {
		return this.taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
		if(taskName != null){
			putQueryParameter("TaskName", taskName);
		}
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
		if(source != null){
			putQueryParameter("Source", source);
		}
	}

	public Integer getTargetStartTime() {
		return this.targetStartTime;
	}

	public void setTargetStartTime(Integer targetStartTime) {
		this.targetStartTime = targetStartTime;
		if(targetStartTime != null){
			putQueryParameter("TargetStartTime", targetStartTime.toString());
		}
	}

	public Integer getIntervalPeriod() {
		return this.intervalPeriod;
	}

	public void setIntervalPeriod(Integer intervalPeriod) {
		this.intervalPeriod = intervalPeriod;
		if(intervalPeriod != null){
			putQueryParameter("IntervalPeriod", intervalPeriod.toString());
		}
	}

	public String getParam() {
		return this.param;
	}

	public void setParam(String param) {
		this.param = param;
		if(param != null){
			putQueryParameter("Param", param);
		}
	}

	public Integer getEnable() {
		return this.enable;
	}

	public void setEnable(Integer enable) {
		this.enable = enable;
		if(enable != null){
			putQueryParameter("Enable", enable.toString());
		}
	}

	public String getTaskType() {
		return this.taskType;
	}

	public void setTaskType(String taskType) {
		this.taskType = taskType;
		if(taskType != null){
			putQueryParameter("TaskType", taskType);
		}
	}

	public Integer getTargetEndTime() {
		return this.targetEndTime;
	}

	public void setTargetEndTime(Integer targetEndTime) {
		this.targetEndTime = targetEndTime;
		if(targetEndTime != null){
			putQueryParameter("TargetEndTime", targetEndTime.toString());
		}
	}

	public String getPeriodUnit() {
		return this.periodUnit;
	}

	public void setPeriodUnit(String periodUnit) {
		this.periodUnit = periodUnit;
		if(periodUnit != null){
			putQueryParameter("PeriodUnit", periodUnit);
		}
	}

	@Override
	public Class<CreateCycleTaskResponse> getResponseClass() {
		return CreateCycleTaskResponse.class;
	}

}
