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

package com.aliyuncs.ga.model.v20191120;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ga.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateApplicationMonitorRequest extends RpcAcsRequest<CreateApplicationMonitorResponse> {
	   

	private String address;

	private Boolean detectEnable;

	private String clientToken;

	private String taskName;

	private Integer detectThreshold;

	private String listenerId;

	private String optionsJson;

	private Integer detectTimes;

	private String acceleratorId;

	private Integer silenceTime;
	public CreateApplicationMonitorRequest() {
		super("Ga", "2019-11-20", "CreateApplicationMonitor", "gaplus");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public Boolean getDetectEnable() {
		return this.detectEnable;
	}

	public void setDetectEnable(Boolean detectEnable) {
		this.detectEnable = detectEnable;
		if(detectEnable != null){
			putQueryParameter("DetectEnable", detectEnable.toString());
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
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

	public Integer getDetectThreshold() {
		return this.detectThreshold;
	}

	public void setDetectThreshold(Integer detectThreshold) {
		this.detectThreshold = detectThreshold;
		if(detectThreshold != null){
			putQueryParameter("DetectThreshold", detectThreshold.toString());
		}
	}

	public String getListenerId() {
		return this.listenerId;
	}

	public void setListenerId(String listenerId) {
		this.listenerId = listenerId;
		if(listenerId != null){
			putQueryParameter("ListenerId", listenerId);
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

	public Integer getDetectTimes() {
		return this.detectTimes;
	}

	public void setDetectTimes(Integer detectTimes) {
		this.detectTimes = detectTimes;
		if(detectTimes != null){
			putQueryParameter("DetectTimes", detectTimes.toString());
		}
	}

	public String getAcceleratorId() {
		return this.acceleratorId;
	}

	public void setAcceleratorId(String acceleratorId) {
		this.acceleratorId = acceleratorId;
		if(acceleratorId != null){
			putQueryParameter("AcceleratorId", acceleratorId);
		}
	}

	public Integer getSilenceTime() {
		return this.silenceTime;
	}

	public void setSilenceTime(Integer silenceTime) {
		this.silenceTime = silenceTime;
		if(silenceTime != null){
			putQueryParameter("SilenceTime", silenceTime.toString());
		}
	}

	@Override
	public Class<CreateApplicationMonitorResponse> getResponseClass() {
		return CreateApplicationMonitorResponse.class;
	}

}
