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
public class MigrateDBClusterRequest extends RpcAcsRequest<MigrateDBClusterResponse> {
	   

	private Long resourceOwnerId;

	private String secondaryZoneId;

	private Integer reservedNodeCount;

	private String productVersion;

	private String storageResource;

	private String resourceOwnerAccount;

	private String dBClusterId;

	private String ownerAccount;

	private String shardNumber;

	private Long ownerId;

	private String productForm;

	private String secondaryVSwitchId;

	private String reservedNodeSize;

	private String computeResource;

	private String storageResourceSize;
	public MigrateDBClusterRequest() {
		super("adb", "2019-03-15", "MigrateDBCluster", "ads");
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

	public String getSecondaryZoneId() {
		return this.secondaryZoneId;
	}

	public void setSecondaryZoneId(String secondaryZoneId) {
		this.secondaryZoneId = secondaryZoneId;
		if(secondaryZoneId != null){
			putQueryParameter("SecondaryZoneId", secondaryZoneId);
		}
	}

	public Integer getReservedNodeCount() {
		return this.reservedNodeCount;
	}

	public void setReservedNodeCount(Integer reservedNodeCount) {
		this.reservedNodeCount = reservedNodeCount;
		if(reservedNodeCount != null){
			putQueryParameter("ReservedNodeCount", reservedNodeCount.toString());
		}
	}

	public String getProductVersion() {
		return this.productVersion;
	}

	public void setProductVersion(String productVersion) {
		this.productVersion = productVersion;
		if(productVersion != null){
			putQueryParameter("ProductVersion", productVersion);
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

	public String getShardNumber() {
		return this.shardNumber;
	}

	public void setShardNumber(String shardNumber) {
		this.shardNumber = shardNumber;
		if(shardNumber != null){
			putQueryParameter("ShardNumber", shardNumber);
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

	public String getProductForm() {
		return this.productForm;
	}

	public void setProductForm(String productForm) {
		this.productForm = productForm;
		if(productForm != null){
			putQueryParameter("ProductForm", productForm);
		}
	}

	public String getSecondaryVSwitchId() {
		return this.secondaryVSwitchId;
	}

	public void setSecondaryVSwitchId(String secondaryVSwitchId) {
		this.secondaryVSwitchId = secondaryVSwitchId;
		if(secondaryVSwitchId != null){
			putQueryParameter("SecondaryVSwitchId", secondaryVSwitchId);
		}
	}

	public String getReservedNodeSize() {
		return this.reservedNodeSize;
	}

	public void setReservedNodeSize(String reservedNodeSize) {
		this.reservedNodeSize = reservedNodeSize;
		if(reservedNodeSize != null){
			putQueryParameter("ReservedNodeSize", reservedNodeSize);
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

	public String getStorageResourceSize() {
		return this.storageResourceSize;
	}

	public void setStorageResourceSize(String storageResourceSize) {
		this.storageResourceSize = storageResourceSize;
		if(storageResourceSize != null){
			putQueryParameter("StorageResourceSize", storageResourceSize);
		}
	}

	@Override
	public Class<MigrateDBClusterResponse> getResponseClass() {
		return MigrateDBClusterResponse.class;
	}

}
