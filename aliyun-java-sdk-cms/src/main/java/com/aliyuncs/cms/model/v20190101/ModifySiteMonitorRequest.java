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

/**
 * @author auto create
 * @version 
 */
public class ModifySiteMonitorRequest extends RpcAcsRequest<ModifySiteMonitorResponse> {
	
	public ModifySiteMonitorRequest() {
		super("Cms", "2019-01-01", "ModifySiteMonitor", "cms");
	}

	private String optionsJson;

	private String address;

	private String alertIds;

	private String taskName;

	private String interval;

	private String taskId;

	private String ispCities;

	public String getOptionsJson() {
		return this.optionsJson;
	}

	public void setOptionsJson(String optionsJson) {
		this.optionsJson = optionsJson;
		if(optionsJson != null){
			putQueryParameter("OptionsJson", optionsJson);
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

	public String getAlertIds() {
		return this.alertIds;
	}

	public void setAlertIds(String alertIds) {
		this.alertIds = alertIds;
		if(alertIds != null){
			putQueryParameter("AlertIds", alertIds);
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

	public String getInterval() {
		return this.interval;
	}

	public void setInterval(String interval) {
		this.interval = interval;
		if(interval != null){
			putQueryParameter("Interval", interval);
		}
	}

	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
		if(taskId != null){
			putQueryParameter("TaskId", taskId);
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

	@Override
	public Class<ModifySiteMonitorResponse> getResponseClass() {
		return ModifySiteMonitorResponse.class;
	}

}
