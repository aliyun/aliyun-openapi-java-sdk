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

package com.aliyuncs.clickhouse.model.v20191111;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.clickhouse.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateDBInstanceRequest extends RpcAcsRequest<CreateDBInstanceResponse> {
	   

	private Long resourceOwnerId;

	private String dBClusterDescription;

	private String sourceDBClusterId;

	private String resourceGroupId;

	private String zondIdBak2;

	private String dbNodeStorageType;

	private String encryptionType;

	private String zoneIdBak;

	private String period;

	private String backupSetID;

	private String encryptionKey;

	private Long ownerId;

	private String dBNodeGroupCount;

	private String vSwitchId;

	private Boolean autoRenew;

	private String zoneId;

	private String clientToken;

	private String dBClusterCategory;

	private String dBClusterNetworkType;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String dBClusterVersion;

	private String dBClusterClass;

	private String vSwitchBak;

	private String usedTime;

	private String vSwitchBak2;

	private String dBNodeStorage;

	private String vPCId;

	private String payType;
	public CreateDBInstanceRequest() {
		super("clickhouse", "2019-11-11", "CreateDBInstance", "service");
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

	public String getSourceDBClusterId() {
		return this.sourceDBClusterId;
	}

	public void setSourceDBClusterId(String sourceDBClusterId) {
		this.sourceDBClusterId = sourceDBClusterId;
		if(sourceDBClusterId != null){
			putQueryParameter("SourceDBClusterId", sourceDBClusterId);
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

	public String getZondIdBak2() {
		return this.zondIdBak2;
	}

	public void setZondIdBak2(String zondIdBak2) {
		this.zondIdBak2 = zondIdBak2;
		if(zondIdBak2 != null){
			putQueryParameter("ZondIdBak2", zondIdBak2);
		}
	}

	public String getDbNodeStorageType() {
		return this.dbNodeStorageType;
	}

	public void setDbNodeStorageType(String dbNodeStorageType) {
		this.dbNodeStorageType = dbNodeStorageType;
		if(dbNodeStorageType != null){
			putQueryParameter("DbNodeStorageType", dbNodeStorageType);
		}
	}

	public String getEncryptionType() {
		return this.encryptionType;
	}

	public void setEncryptionType(String encryptionType) {
		this.encryptionType = encryptionType;
		if(encryptionType != null){
			putQueryParameter("EncryptionType", encryptionType);
		}
	}

	public String getZoneIdBak() {
		return this.zoneIdBak;
	}

	public void setZoneIdBak(String zoneIdBak) {
		this.zoneIdBak = zoneIdBak;
		if(zoneIdBak != null){
			putQueryParameter("ZoneIdBak", zoneIdBak);
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

	public String getEncryptionKey() {
		return this.encryptionKey;
	}

	public void setEncryptionKey(String encryptionKey) {
		this.encryptionKey = encryptionKey;
		if(encryptionKey != null){
			putQueryParameter("EncryptionKey", encryptionKey);
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

	public Boolean getAutoRenew() {
		return this.autoRenew;
	}

	public void setAutoRenew(Boolean autoRenew) {
		this.autoRenew = autoRenew;
		if(autoRenew != null){
			putQueryParameter("AutoRenew", autoRenew.toString());
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

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
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

	public String getVSwitchBak() {
		return this.vSwitchBak;
	}

	public void setVSwitchBak(String vSwitchBak) {
		this.vSwitchBak = vSwitchBak;
		if(vSwitchBak != null){
			putQueryParameter("VSwitchBak", vSwitchBak);
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

	public String getVSwitchBak2() {
		return this.vSwitchBak2;
	}

	public void setVSwitchBak2(String vSwitchBak2) {
		this.vSwitchBak2 = vSwitchBak2;
		if(vSwitchBak2 != null){
			putQueryParameter("VSwitchBak2", vSwitchBak2);
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

	public String getVPCId() {
		return this.vPCId;
	}

	public void setVPCId(String vPCId) {
		this.vPCId = vPCId;
		if(vPCId != null){
			putQueryParameter("VPCId", vPCId);
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

	@Override
	public Class<CreateDBInstanceResponse> getResponseClass() {
		return CreateDBInstanceResponse.class;
	}

}
