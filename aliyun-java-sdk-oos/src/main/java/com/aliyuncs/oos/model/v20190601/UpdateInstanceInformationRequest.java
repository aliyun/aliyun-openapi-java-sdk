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

package com.aliyuncs.oos.model.v20190601;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.oos.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateInstanceInformationRequest extends RpcAcsRequest<UpdateInstanceInformationResponse> {
	   

	private String agentVersion;

	private String ipAddress;

	private String computerName;

	private String platformName;

	private String instanceId;

	private String agentName;

	private String platformType;

	private String platformVersion;
	public UpdateInstanceInformationRequest() {
		super("oos", "2019-06-01", "UpdateInstanceInformation");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAgentVersion() {
		return this.agentVersion;
	}

	public void setAgentVersion(String agentVersion) {
		this.agentVersion = agentVersion;
		if(agentVersion != null){
			putQueryParameter("AgentVersion", agentVersion);
		}
	}

	public String getIpAddress() {
		return this.ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
		if(ipAddress != null){
			putQueryParameter("IpAddress", ipAddress);
		}
	}

	public String getComputerName() {
		return this.computerName;
	}

	public void setComputerName(String computerName) {
		this.computerName = computerName;
		if(computerName != null){
			putQueryParameter("ComputerName", computerName);
		}
	}

	public String getPlatformName() {
		return this.platformName;
	}

	public void setPlatformName(String platformName) {
		this.platformName = platformName;
		if(platformName != null){
			putQueryParameter("PlatformName", platformName);
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

	public String getAgentName() {
		return this.agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
		if(agentName != null){
			putQueryParameter("AgentName", agentName);
		}
	}

	public String getPlatformType() {
		return this.platformType;
	}

	public void setPlatformType(String platformType) {
		this.platformType = platformType;
		if(platformType != null){
			putQueryParameter("PlatformType", platformType);
		}
	}

	public String getPlatformVersion() {
		return this.platformVersion;
	}

	public void setPlatformVersion(String platformVersion) {
		this.platformVersion = platformVersion;
		if(platformVersion != null){
			putQueryParameter("PlatformVersion", platformVersion);
		}
	}

	@Override
	public Class<UpdateInstanceInformationResponse> getResponseClass() {
		return UpdateInstanceInformationResponse.class;
	}

}
