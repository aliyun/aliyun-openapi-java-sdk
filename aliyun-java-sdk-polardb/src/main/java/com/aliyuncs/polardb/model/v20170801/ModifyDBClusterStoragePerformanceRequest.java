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

package com.aliyuncs.polardb.model.v20170801;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.polardb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyDBClusterStoragePerformanceRequest extends RpcAcsRequest<ModifyDBClusterStoragePerformanceResponse> {
	   

	private Long resourceOwnerId;

	private String clientToken;

	private String storageType;

	private String dBClusterId;

	private String burstingEnabled;

	private Integer provisionedIops;

	private String modifyType;
	public ModifyDBClusterStoragePerformanceRequest() {
		super("polardb", "2017-08-01", "ModifyDBClusterStoragePerformance", "polardb");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
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

	public String getStorageType() {
		return this.storageType;
	}

	public void setStorageType(String storageType) {
		this.storageType = storageType;
		if(storageType != null){
			putQueryParameter("StorageType", storageType);
		}
	}

	public String getDBClusterId() {
		return this.dBClusterId;
	}

	public void setDBClusterId(String dBClusterId) {
		this.dBClusterId = dBClusterId;
		if(dBClusterId != null){
			putQueryParameter("DBClusterId", dBClusterId);
		}
	}

	public String getBurstingEnabled() {
		return this.burstingEnabled;
	}

	public void setBurstingEnabled(String burstingEnabled) {
		this.burstingEnabled = burstingEnabled;
		if(burstingEnabled != null){
			putQueryParameter("BurstingEnabled", burstingEnabled);
		}
	}

	public Integer getProvisionedIops() {
		return this.provisionedIops;
	}

	public void setProvisionedIops(Integer provisionedIops) {
		this.provisionedIops = provisionedIops;
		if(provisionedIops != null){
			putQueryParameter("ProvisionedIops", provisionedIops.toString());
		}
	}

	public String getModifyType() {
		return this.modifyType;
	}

	public void setModifyType(String modifyType) {
		this.modifyType = modifyType;
		if(modifyType != null){
			putQueryParameter("ModifyType", modifyType);
		}
	}

	@Override
	public Class<ModifyDBClusterStoragePerformanceResponse> getResponseClass() {
		return ModifyDBClusterStoragePerformanceResponse.class;
	}

}
