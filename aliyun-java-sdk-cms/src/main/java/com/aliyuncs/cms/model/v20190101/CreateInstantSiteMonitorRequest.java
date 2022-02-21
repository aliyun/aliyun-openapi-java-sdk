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
public class CreateInstantSiteMonitorRequest extends RpcAcsRequest<CreateInstantSiteMonitorResponse> {
	   

	private Integer randomIspCity;

	private String address;

	private String taskType;

	private String taskName;

	private String ispCities;

	private String optionsJson;
	public CreateInstantSiteMonitorRequest() {
		super("Cms", "2019-01-01", "CreateInstantSiteMonitor", "Cms");
		setMethod(MethodType.POST);
	}

	public Integer getRandomIspCity() {
		return this.randomIspCity;
	}

	public void setRandomIspCity(Integer randomIspCity) {
		this.randomIspCity = randomIspCity;
		if(randomIspCity != null){
			putQueryParameter("RandomIspCity", randomIspCity.toString());
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

	public String getTaskName() {
		return this.taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
		if(taskName != null){
			putQueryParameter("TaskName", taskName);
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

	@Override
	public Class<CreateInstantSiteMonitorResponse> getResponseClass() {
		return CreateInstantSiteMonitorResponse.class;
	}

}
