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

package com.aliyuncs.retailcloud.model.v20180313;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.retailcloud.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeployAppRequest extends RpcAcsRequest<DeployAppResponse> {
	   

	private Long deployPacketId;

	private String deployPacketUrl;

	private Integer totalPartitions;

	private String name;

	private String description;

	private Long envId;

	private String pauseType;

	private Boolean armsFlag;
	public DeployAppRequest() {
		super("retailcloud", "2018-03-13", "DeployApp", "retailcloud");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getDeployPacketId() {
		return this.deployPacketId;
	}

	public void setDeployPacketId(Long deployPacketId) {
		this.deployPacketId = deployPacketId;
		if(deployPacketId != null){
			putQueryParameter("DeployPacketId", deployPacketId.toString());
		}
	}

	public String getDeployPacketUrl() {
		return this.deployPacketUrl;
	}

	public void setDeployPacketUrl(String deployPacketUrl) {
		this.deployPacketUrl = deployPacketUrl;
		if(deployPacketUrl != null){
			putQueryParameter("DeployPacketUrl", deployPacketUrl);
		}
	}

	public Integer getTotalPartitions() {
		return this.totalPartitions;
	}

	public void setTotalPartitions(Integer totalPartitions) {
		this.totalPartitions = totalPartitions;
		if(totalPartitions != null){
			putQueryParameter("TotalPartitions", totalPartitions.toString());
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
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

	public Long getEnvId() {
		return this.envId;
	}

	public void setEnvId(Long envId) {
		this.envId = envId;
		if(envId != null){
			putQueryParameter("EnvId", envId.toString());
		}
	}

	public String getPauseType() {
		return this.pauseType;
	}

	public void setPauseType(String pauseType) {
		this.pauseType = pauseType;
		if(pauseType != null){
			putQueryParameter("PauseType", pauseType);
		}
	}

	public Boolean getArmsFlag() {
		return this.armsFlag;
	}

	public void setArmsFlag(Boolean armsFlag) {
		this.armsFlag = armsFlag;
		if(armsFlag != null){
			putQueryParameter("ArmsFlag", armsFlag.toString());
		}
	}

	@Override
	public Class<DeployAppResponse> getResponseClass() {
		return DeployAppResponse.class;
	}

}
