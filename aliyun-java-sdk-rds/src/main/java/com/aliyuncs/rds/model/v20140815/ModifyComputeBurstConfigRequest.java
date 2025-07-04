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

package com.aliyuncs.rds.model.v20140815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.rds.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyComputeBurstConfigRequest extends RpcAcsRequest<ModifyComputeBurstConfigResponse> {
	   

	private String clientToken;

	private String cpuShrinkThreshold;

	private String burstStatus;

	private String switchTimeMode;

	private String resourceGroupId;

	private String dBInstanceId;

	private String switchTime;

	private String taskId;

	private String memoryEnlargeThreshold;

	private String crontabJobId;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String scaleMaxMemory;

	private String memoryShrinkThreshold;

	private String scaleMaxCpus;

	private String cpuEnlargeThreshold;
	public ModifyComputeBurstConfigRequest() {
		super("Rds", "2014-08-15", "ModifyComputeBurstConfig", "rds");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getCpuShrinkThreshold() {
		return this.cpuShrinkThreshold;
	}

	public void setCpuShrinkThreshold(String cpuShrinkThreshold) {
		this.cpuShrinkThreshold = cpuShrinkThreshold;
		if(cpuShrinkThreshold != null){
			putQueryParameter("CpuShrinkThreshold", cpuShrinkThreshold);
		}
	}

	public String getBurstStatus() {
		return this.burstStatus;
	}

	public void setBurstStatus(String burstStatus) {
		this.burstStatus = burstStatus;
		if(burstStatus != null){
			putQueryParameter("BurstStatus", burstStatus);
		}
	}

	public String getSwitchTimeMode() {
		return this.switchTimeMode;
	}

	public void setSwitchTimeMode(String switchTimeMode) {
		this.switchTimeMode = switchTimeMode;
		if(switchTimeMode != null){
			putQueryParameter("SwitchTimeMode", switchTimeMode);
		}
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
		}
	}

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
		if(dBInstanceId != null){
			putQueryParameter("DBInstanceId", dBInstanceId);
		}
	}

	public String getSwitchTime() {
		return this.switchTime;
	}

	public void setSwitchTime(String switchTime) {
		this.switchTime = switchTime;
		if(switchTime != null){
			putQueryParameter("SwitchTime", switchTime);
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

	public String getMemoryEnlargeThreshold() {
		return this.memoryEnlargeThreshold;
	}

	public void setMemoryEnlargeThreshold(String memoryEnlargeThreshold) {
		this.memoryEnlargeThreshold = memoryEnlargeThreshold;
		if(memoryEnlargeThreshold != null){
			putQueryParameter("MemoryEnlargeThreshold", memoryEnlargeThreshold);
		}
	}

	public String getCrontabJobId() {
		return this.crontabJobId;
	}

	public void setCrontabJobId(String crontabJobId) {
		this.crontabJobId = crontabJobId;
		if(crontabJobId != null){
			putQueryParameter("CrontabJobId", crontabJobId);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getScaleMaxMemory() {
		return this.scaleMaxMemory;
	}

	public void setScaleMaxMemory(String scaleMaxMemory) {
		this.scaleMaxMemory = scaleMaxMemory;
		if(scaleMaxMemory != null){
			putQueryParameter("ScaleMaxMemory", scaleMaxMemory);
		}
	}

	public String getMemoryShrinkThreshold() {
		return this.memoryShrinkThreshold;
	}

	public void setMemoryShrinkThreshold(String memoryShrinkThreshold) {
		this.memoryShrinkThreshold = memoryShrinkThreshold;
		if(memoryShrinkThreshold != null){
			putQueryParameter("MemoryShrinkThreshold", memoryShrinkThreshold);
		}
	}

	public String getScaleMaxCpus() {
		return this.scaleMaxCpus;
	}

	public void setScaleMaxCpus(String scaleMaxCpus) {
		this.scaleMaxCpus = scaleMaxCpus;
		if(scaleMaxCpus != null){
			putQueryParameter("ScaleMaxCpus", scaleMaxCpus);
		}
	}

	public String getCpuEnlargeThreshold() {
		return this.cpuEnlargeThreshold;
	}

	public void setCpuEnlargeThreshold(String cpuEnlargeThreshold) {
		this.cpuEnlargeThreshold = cpuEnlargeThreshold;
		if(cpuEnlargeThreshold != null){
			putQueryParameter("CpuEnlargeThreshold", cpuEnlargeThreshold);
		}
	}

	@Override
	public Class<ModifyComputeBurstConfigResponse> getResponseClass() {
		return ModifyComputeBurstConfigResponse.class;
	}

}
