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

package com.aliyuncs.cms.model.v20190101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateSiteMonitorRequest extends RpcAcsRequest<CreateSiteMonitorResponse> {
	   

	private String taskName;

	private String alertIds;

	private String address;

	private String taskType;

	private String ispCities;

	private String optionsJson;

	private String intervalUnit;

	private String interval;
	public CreateSiteMonitorRequest() {
		super("Cms", "2019-01-01", "CreateSiteMonitor", "cms");
		setMethod(MethodType.POST);
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

	public String getAlertIds() {
		return this.alertIds;
	}

	public void setAlertIds(String alertIds) {
		this.alertIds = alertIds;
		if(alertIds != null){
			putQueryParameter("AlertIds", alertIds);
		}
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
		if(address != null){
			putQueryParameter("Address", address);
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

	public String getIspCities() {
		return this.ispCities;
	}

	public void setIspCities(String ispCities) {
		this.ispCities = ispCities;
		if(ispCities != null){
			putQueryParameter("IspCities", ispCities);
		}
	}

	public String getOptionsJson() {
		return this.optionsJson;
	}

	public void setOptionsJson(String optionsJson) {
		this.optionsJson = optionsJson;
		if(optionsJson != null){
			putQueryParameter("OptionsJson", optionsJson);
		}
	}

	public String getIntervalUnit() {
		return this.intervalUnit;
	}

	public void setIntervalUnit(String intervalUnit) {
		this.intervalUnit = intervalUnit;
		if(intervalUnit != null){
			putQueryParameter("IntervalUnit", intervalUnit);
		}
	}

	public String getInterval() {
		return this.interval;
	}

	public void setInterval(String interval) {
		this.interval = interval;
		if(interval != null){
			putQueryParameter("Interval", interval);
		}
	}

	@Override
	public Class<CreateSiteMonitorResponse> getResponseClass() {
		return CreateSiteMonitorResponse.class;
	}

}
