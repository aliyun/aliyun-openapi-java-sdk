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

package com.aliyuncs.ecsops.model.v20160401;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class OpsUpdateCloudBoxEbsSkuRequest extends RpcAcsRequest<OpsUpdateCloudBoxEbsSkuResponse> {
	   

	private Long maxCapacity;

	private String cloudBoxSkuId;

	private String performanceLevel;

	private Long stepCapacity;

	private String storageType;

	private String machineType;

	private Long minCapacity;

	private String name;
	public OpsUpdateCloudBoxEbsSkuRequest() {
		super("Ecsops", "2016-04-01", "OpsUpdateCloudBoxEbsSku", "ecsops");
		setMethod(MethodType.POST);
	}

	public Long getMaxCapacity() {
		return this.maxCapacity;
	}

	public void setMaxCapacity(Long maxCapacity) {
		this.maxCapacity = maxCapacity;
		if(maxCapacity != null){
			putQueryParameter("MaxCapacity", maxCapacity.toString());
		}
	}

	public String getCloudBoxSkuId() {
		return this.cloudBoxSkuId;
	}

	public void setCloudBoxSkuId(String cloudBoxSkuId) {
		this.cloudBoxSkuId = cloudBoxSkuId;
		if(cloudBoxSkuId != null){
			putQueryParameter("CloudBoxSkuId", cloudBoxSkuId);
		}
	}

	public String getPerformanceLevel() {
		return this.performanceLevel;
	}

	public void setPerformanceLevel(String performanceLevel) {
		this.performanceLevel = performanceLevel;
		if(performanceLevel != null){
			putQueryParameter("PerformanceLevel", performanceLevel);
		}
	}

	public Long getStepCapacity() {
		return this.stepCapacity;
	}

	public void setStepCapacity(Long stepCapacity) {
		this.stepCapacity = stepCapacity;
		if(stepCapacity != null){
			putQueryParameter("StepCapacity", stepCapacity.toString());
		}
	}

	public String getStorageType() {
		return this.storageType;
	}

	public void setStorageType(String storageType) {
		this.storageType = storageType;
		if(storageType != null){
			putQueryParameter("StorageType", storageType);
		}
	}

	public String getMachineType() {
		return this.machineType;
	}

	public void setMachineType(String machineType) {
		this.machineType = machineType;
		if(machineType != null){
			putQueryParameter("MachineType", machineType);
		}
	}

	public Long getMinCapacity() {
		return this.minCapacity;
	}

	public void setMinCapacity(Long minCapacity) {
		this.minCapacity = minCapacity;
		if(minCapacity != null){
			putQueryParameter("MinCapacity", minCapacity.toString());
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

	@Override
	public Class<OpsUpdateCloudBoxEbsSkuResponse> getResponseClass() {
		return OpsUpdateCloudBoxEbsSkuResponse.class;
	}

}
