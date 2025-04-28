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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.adb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateDBClusterRequest extends RpcAcsRequest<CreateDBClusterResponse> {
	   

	private Long resourceOwnerId;

	private String dBClusterDescription;

	private String storageType;

	private String mode;

	private String resourceGroupId;

	private List<Tag> tags;

	private String period;

	private String backupSetID;

	private Long ownerId;

	private String dBNodeGroupCount;

	private String vSwitchId;

	private String zoneId;

	private String computeResource;

	private String kmsId;

	private String elasticIOResource;

	private String sourceDBInstanceName;

	private String clientToken;

	private String storageResource;

	private String dBClusterCategory;

	private String dBClusterNetworkType;

	private String restoreTime;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String dBClusterVersion;

	private String dBClusterClass;

	private String usedTime;

	private String restoreType;

	private Boolean enableSSL;

	private String dBNodeStorage;

	private String executorCount;

	private String vPCId;

	private Boolean diskEncryption;

	private String payType;
	public CreateDBClusterRequest() {
		super("adb", "2019-03-15", "CreateDBCluster", "ads");
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

	public String getDBClusterDescription() {
		return this.dBClusterDescription;
	}

	public void setDBClusterDescription(String dBClusterDescription) {
		this.dBClusterDescription = dBClusterDescription;
		if(dBClusterDescription != null){
			putQueryParameter("DBClusterDescription", dBClusterDescription);
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

	public String getMode() {
		return this.mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
		if(mode != null){
			putQueryParameter("Mode", mode);
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

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;	
		if (tags != null) {
			for (int depth1 = 0; depth1 < tags.size(); depth1++) {
				putQueryParameter("Tag." + (depth1 + 1) + ".Value" , tags.get(depth1).getValue());
				putQueryParameter("Tag." + (depth1 + 1) + ".Key" , tags.get(depth1).getKey());
			}
		}	
	}

	public String getPeriod() {
		return this.period;
	}

	public void setPeriod(String period) {
		this.period = period;
		if(period != null){
			putQueryParameter("Period", period);
		}
	}

	public String getBackupSetID() {
		return this.backupSetID;
	}

	public void setBackupSetID(String backupSetID) {
		this.backupSetID = backupSetID;
		if(backupSetID != null){
			putQueryParameter("BackupSetID", backupSetID);
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

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
		if(vSwitchId != null){
			putQueryParameter("VSwitchId", vSwitchId);
		}
	}

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
		if(zoneId != null){
			putQueryParameter("ZoneId", zoneId);
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

	public String getKmsId() {
		return this.kmsId;
	}

	public void setKmsId(String kmsId) {
		this.kmsId = kmsId;
		if(kmsId != null){
			putQueryParameter("KmsId", kmsId);
		}
	}

	public String getElasticIOResource() {
		return this.elasticIOResource;
	}

	public void setElasticIOResource(String elasticIOResource) {
		this.elasticIOResource = elasticIOResource;
		if(elasticIOResource != null){
			putQueryParameter("ElasticIOResource", elasticIOResource);
		}
	}

	public String getSourceDBInstanceName() {
		return this.sourceDBInstanceName;
	}

	public void setSourceDBInstanceName(String sourceDBInstanceName) {
		this.sourceDBInstanceName = sourceDBInstanceName;
		if(sourceDBInstanceName != null){
			putQueryParameter("SourceDBInstanceName", sourceDBInstanceName);
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

	public String getStorageResource() {
		return this.storageResource;
	}

	public void setStorageResource(String storageResource) {
		this.storageResource = storageResource;
		if(storageResource != null){
			putQueryParameter("StorageResource", storageResource);
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

	public String getDBClusterNetworkType() {
		return this.dBClusterNetworkType;
	}

	public void setDBClusterNetworkType(String dBClusterNetworkType) {
		this.dBClusterNetworkType = dBClusterNetworkType;
		if(dBClusterNetworkType != null){
			putQueryParameter("DBClusterNetworkType", dBClusterNetworkType);
		}
	}

	public String getRestoreTime() {
		return this.restoreTime;
	}

	public void setRestoreTime(String restoreTime) {
		this.restoreTime = restoreTime;
		if(restoreTime != null){
			putQueryParameter("RestoreTime", restoreTime);
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

	public String getDBClusterVersion() {
		return this.dBClusterVersion;
	}

	public void setDBClusterVersion(String dBClusterVersion) {
		this.dBClusterVersion = dBClusterVersion;
		if(dBClusterVersion != null){
			putQueryParameter("DBClusterVersion", dBClusterVersion);
		}
	}

	public String getDBClusterClass() {
		return this.dBClusterClass;
	}

	public void setDBClusterClass(String dBClusterClass) {
		this.dBClusterClass = dBClusterClass;
		if(dBClusterClass != null){
			putQueryParameter("DBClusterClass", dBClusterClass);
		}
	}

	public String getUsedTime() {
		return this.usedTime;
	}

	public void setUsedTime(String usedTime) {
		this.usedTime = usedTime;
		if(usedTime != null){
			putQueryParameter("UsedTime", usedTime);
		}
	}

	public String getRestoreType() {
		return this.restoreType;
	}

	public void setRestoreType(String restoreType) {
		this.restoreType = restoreType;
		if(restoreType != null){
			putQueryParameter("RestoreType", restoreType);
		}
	}

	public Boolean getEnableSSL() {
		return this.enableSSL;
	}

	public void setEnableSSL(Boolean enableSSL) {
		this.enableSSL = enableSSL;
		if(enableSSL != null){
			putQueryParameter("EnableSSL", enableSSL.toString());
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

	public String getVPCId() {
		return this.vPCId;
	}

	public void setVPCId(String vPCId) {
		this.vPCId = vPCId;
		if(vPCId != null){
			putQueryParameter("VPCId", vPCId);
		}
	}

	public Boolean getDiskEncryption() {
		return this.diskEncryption;
	}

	public void setDiskEncryption(Boolean diskEncryption) {
		this.diskEncryption = diskEncryption;
		if(diskEncryption != null){
			putQueryParameter("DiskEncryption", diskEncryption.toString());
		}
	}

	public String getPayType() {
		return this.payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
		if(payType != null){
			putQueryParameter("PayType", payType);
		}
	}

	public static class Tag {

		private String value;

		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	@Override
	public Class<CreateDBClusterResponse> getResponseClass() {
		return CreateDBClusterResponse.class;
	}

}
