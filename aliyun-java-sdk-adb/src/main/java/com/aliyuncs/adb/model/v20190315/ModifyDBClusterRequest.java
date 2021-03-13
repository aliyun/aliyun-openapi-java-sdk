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

package com.aliyuncs.adb.model.v20190315;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.adb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyDBClusterRequest extends RpcAcsRequest<ModifyDBClusterResponse> {
	   

	private Long resourceOwnerId;

	private String mode;

	private String storageResource;

	private String dBNodeClass;

	private String dBClusterCategory;

	private String resourceOwnerAccount;

	private String dBClusterId;

	private String ownerAccount;

	private Long ownerId;

	private String dBNodeGroupCount;

	private String dBNodeStorage;

	private String executorCount;

	private String modifyType;

	private String computeResource;

	private Integer elasticIOResource;
	public ModifyDBClusterRequest() {
		super("adb", "2019-03-15", "ModifyDBCluster", "ads");
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

	public String getMode() {
		return this.mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
		if(mode != null){
			putQueryParameter("Mode", mode);
		}
	}

	public String getStorageResource() {
		return this.storageResource;
	}

	public void setStorageResource(String storageResource) {
		this.storageResource = storageResource;
		if(storageResource != null){
			putQueryParameter("StorageResource", storageResource);
		}
	}

	public String getDBNodeClass() {
		return this.dBNodeClass;
	}

	public void setDBNodeClass(String dBNodeClass) {
		this.dBNodeClass = dBNodeClass;
		if(dBNodeClass != null){
			putQueryParameter("DBNodeClass", dBNodeClass);
		}
	}

	public String getDBClusterCategory() {
		return this.dBClusterCategory;
	}

	public void setDBClusterCategory(String dBClusterCategory) {
		this.dBClusterCategory = dBClusterCategory;
		if(dBClusterCategory != null){
			putQueryParameter("DBClusterCategory", dBClusterCategory);
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

	public String getDBClusterId() {
		return this.dBClusterId;
	}

	public void setDBClusterId(String dBClusterId) {
		this.dBClusterId = dBClusterId;
		if(dBClusterId != null){
			putQueryParameter("DBClusterId", dBClusterId);
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

	public String getDBNodeGroupCount() {
		return this.dBNodeGroupCount;
	}

	public void setDBNodeGroupCount(String dBNodeGroupCount) {
		this.dBNodeGroupCount = dBNodeGroupCount;
		if(dBNodeGroupCount != null){
			putQueryParameter("DBNodeGroupCount", dBNodeGroupCount);
		}
	}

	public String getDBNodeStorage() {
		return this.dBNodeStorage;
	}

	public void setDBNodeStorage(String dBNodeStorage) {
		this.dBNodeStorage = dBNodeStorage;
		if(dBNodeStorage != null){
			putQueryParameter("DBNodeStorage", dBNodeStorage);
		}
	}

	public String getExecutorCount() {
		return this.executorCount;
	}

	public void setExecutorCount(String executorCount) {
		this.executorCount = executorCount;
		if(executorCount != null){
			putQueryParameter("ExecutorCount", executorCount);
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

	public String getComputeResource() {
		return this.computeResource;
	}

	public void setComputeResource(String computeResource) {
		this.computeResource = computeResource;
		if(computeResource != null){
			putQueryParameter("ComputeResource", computeResource);
		}
	}

	public Integer getElasticIOResource() {
		return this.elasticIOResource;
	}

	public void setElasticIOResource(Integer elasticIOResource) {
		this.elasticIOResource = elasticIOResource;
		if(elasticIOResource != null){
			putQueryParameter("ElasticIOResource", elasticIOResource.toString());
		}
	}

	@Override
	public Class<ModifyDBClusterResponse> getResponseClass() {
		return ModifyDBClusterResponse.class;
	}

}
