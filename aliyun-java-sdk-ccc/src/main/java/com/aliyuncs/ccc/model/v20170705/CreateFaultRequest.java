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

package com.aliyuncs.ccc.model.v20170705;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ccc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateFaultRequest extends RpcAcsRequest<CreateFaultResponse> {
	
	public CreateFaultRequest() {
		super("CCC", "2017-07-05", "CreateFault");
		setSysMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String agentOssFileName;

	private String description;

	private String operatingSystemVersion;

	private Long startTime;

	private String microphoneList;

	private String clientPort;

	private String customFilePath;

	private String clientIp;

	private String speakerList;

	private Long agentId;

	private Long endTime;

	private String speakerEquipment;

	private String servicePort;

	private String serviceIp;

	private String instanceId;

	private String agentFilePath;

	private String connectId;

	private String customOssFileName;

	private String microphoneEquipment;

	private String browserVersion;

	public String getAgentOssFileName() {
		return this.agentOssFileName;
	}

	public void setAgentOssFileName(String agentOssFileName) {
		this.agentOssFileName = agentOssFileName;
		if(agentOssFileName != null){
			putQueryParameter("AgentOssFileName", agentOssFileName);
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

	public String getOperatingSystemVersion() {
		return this.operatingSystemVersion;
	}

	public void setOperatingSystemVersion(String operatingSystemVersion) {
		this.operatingSystemVersion = operatingSystemVersion;
		if(operatingSystemVersion != null){
			putQueryParameter("OperatingSystemVersion", operatingSystemVersion);
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

	public String getMicrophoneList() {
		return this.microphoneList;
	}

	public void setMicrophoneList(String microphoneList) {
		this.microphoneList = microphoneList;
		if(microphoneList != null){
			putQueryParameter("MicrophoneList", microphoneList);
		}
	}

	public String getClientPort() {
		return this.clientPort;
	}

	public void setClientPort(String clientPort) {
		this.clientPort = clientPort;
		if(clientPort != null){
			putQueryParameter("ClientPort", clientPort);
		}
	}

	public String getCustomFilePath() {
		return this.customFilePath;
	}

	public void setCustomFilePath(String customFilePath) {
		this.customFilePath = customFilePath;
		if(customFilePath != null){
			putQueryParameter("CustomFilePath", customFilePath);
		}
	}

	public String getClientIp() {
		return this.clientIp;
	}

	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
		if(clientIp != null){
			putQueryParameter("ClientIp", clientIp);
		}
	}

	public String getSpeakerList() {
		return this.speakerList;
	}

	public void setSpeakerList(String speakerList) {
		this.speakerList = speakerList;
		if(speakerList != null){
			putQueryParameter("SpeakerList", speakerList);
		}
	}

	public Long getAgentId() {
		return this.agentId;
	}

	public void setAgentId(Long agentId) {
		this.agentId = agentId;
		if(agentId != null){
			putQueryParameter("AgentId", agentId.toString());
		}
	}

	public Long getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime.toString());
		}
	}

	public String getSpeakerEquipment() {
		return this.speakerEquipment;
	}

	public void setSpeakerEquipment(String speakerEquipment) {
		this.speakerEquipment = speakerEquipment;
		if(speakerEquipment != null){
			putQueryParameter("SpeakerEquipment", speakerEquipment);
		}
	}

	public String getServicePort() {
		return this.servicePort;
	}

	public void setServicePort(String servicePort) {
		this.servicePort = servicePort;
		if(servicePort != null){
			putQueryParameter("ServicePort", servicePort);
		}
	}

	public String getServiceIp() {
		return this.serviceIp;
	}

	public void setServiceIp(String serviceIp) {
		this.serviceIp = serviceIp;
		if(serviceIp != null){
			putQueryParameter("ServiceIp", serviceIp);
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

	public String getAgentFilePath() {
		return this.agentFilePath;
	}

	public void setAgentFilePath(String agentFilePath) {
		this.agentFilePath = agentFilePath;
		if(agentFilePath != null){
			putQueryParameter("AgentFilePath", agentFilePath);
		}
	}

	public String getConnectId() {
		return this.connectId;
	}

	public void setConnectId(String connectId) {
		this.connectId = connectId;
		if(connectId != null){
			putQueryParameter("ConnectId", connectId);
		}
	}

	public String getCustomOssFileName() {
		return this.customOssFileName;
	}

	public void setCustomOssFileName(String customOssFileName) {
		this.customOssFileName = customOssFileName;
		if(customOssFileName != null){
			putQueryParameter("CustomOssFileName", customOssFileName);
		}
	}

	public String getMicrophoneEquipment() {
		return this.microphoneEquipment;
	}

	public void setMicrophoneEquipment(String microphoneEquipment) {
		this.microphoneEquipment = microphoneEquipment;
		if(microphoneEquipment != null){
			putQueryParameter("MicrophoneEquipment", microphoneEquipment);
		}
	}

	public String getBrowserVersion() {
		return this.browserVersion;
	}

	public void setBrowserVersion(String browserVersion) {
		this.browserVersion = browserVersion;
		if(browserVersion != null){
			putQueryParameter("BrowserVersion", browserVersion);
		}
	}

	@Override
	public Class<CreateFaultResponse> getResponseClass() {
		return CreateFaultResponse.class;
	}

}
