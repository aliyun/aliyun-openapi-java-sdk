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

package com.aliyuncs.gdb.model.v20190903;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.gdb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CloneDBInstanceRequest extends RpcAcsRequest<CloneDBInstanceResponse> {
	   

	private Long resourceOwnerId;

	private String clientToken;

	private String dBInstanceCategory;

	private String resourceGroupId;

	private String dBNodeStorageType;

	private String dBInstanceDescription;

	private String autoRenewPeriod;

	private String period;

	private String restoreTime;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String backupSetId;

	private Long ownerId;

	private String usedTime;

	private String dBInstanceClass;

	private String vSwitchId;

	private String securityIPList;

	private String restoreType;

	private String sourceDBInstanceId;

	private String dBNodeStorage;

	private String dBInstanceNetworkType;

	private String autoRenew;

	private String dBInstanceVersion;

	private String vPCId;

	private String zoneId;

	private String payType;
	public CloneDBInstanceRequest() {
		super("gdb", "2019-09-03", "CloneDBInstance", "gds");
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

	public String getDBInstanceCategory() {
		return this.dBInstanceCategory;
	}

	public void setDBInstanceCategory(String dBInstanceCategory) {
		this.dBInstanceCategory = dBInstanceCategory;
		if(dBInstanceCategory != null){
			putQueryParameter("DBInstanceCategory", dBInstanceCategory);
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

	public String getDBNodeStorageType() {
		return this.dBNodeStorageType;
	}

	public void setDBNodeStorageType(String dBNodeStorageType) {
		this.dBNodeStorageType = dBNodeStorageType;
		if(dBNodeStorageType != null){
			putQueryParameter("DBNodeStorageType", dBNodeStorageType);
		}
	}

	public String getDBInstanceDescription() {
		return this.dBInstanceDescription;
	}

	public void setDBInstanceDescription(String dBInstanceDescription) {
		this.dBInstanceDescription = dBInstanceDescription;
		if(dBInstanceDescription != null){
			putQueryParameter("DBInstanceDescription", dBInstanceDescription);
		}
	}

	public String getAutoRenewPeriod() {
		return this.autoRenewPeriod;
	}

	public void setAutoRenewPeriod(String autoRenewPeriod) {
		this.autoRenewPeriod = autoRenewPeriod;
		if(autoRenewPeriod != null){
			putQueryParameter("AutoRenewPeriod", autoRenewPeriod);
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

	public String getBackupSetId() {
		return this.backupSetId;
	}

	public void setBackupSetId(String backupSetId) {
		this.backupSetId = backupSetId;
		if(backupSetId != null){
			putQueryParameter("BackupSetId", backupSetId);
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

	public String getUsedTime() {
		return this.usedTime;
	}

	public void setUsedTime(String usedTime) {
		this.usedTime = usedTime;
		if(usedTime != null){
			putQueryParameter("UsedTime", usedTime);
		}
	}

	public String getDBInstanceClass() {
		return this.dBInstanceClass;
	}

	public void setDBInstanceClass(String dBInstanceClass) {
		this.dBInstanceClass = dBInstanceClass;
		if(dBInstanceClass != null){
			putQueryParameter("DBInstanceClass", dBInstanceClass);
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

	public String getSecurityIPList() {
		return this.securityIPList;
	}

	public void setSecurityIPList(String securityIPList) {
		this.securityIPList = securityIPList;
		if(securityIPList != null){
			putQueryParameter("SecurityIPList", securityIPList);
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

	public String getSourceDBInstanceId() {
		return this.sourceDBInstanceId;
	}

	public void setSourceDBInstanceId(String sourceDBInstanceId) {
		this.sourceDBInstanceId = sourceDBInstanceId;
		if(sourceDBInstanceId != null){
			putQueryParameter("SourceDBInstanceId", sourceDBInstanceId);
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

	public String getDBInstanceNetworkType() {
		return this.dBInstanceNetworkType;
	}

	public void setDBInstanceNetworkType(String dBInstanceNetworkType) {
		this.dBInstanceNetworkType = dBInstanceNetworkType;
		if(dBInstanceNetworkType != null){
			putQueryParameter("DBInstanceNetworkType", dBInstanceNetworkType);
		}
	}

	public String getAutoRenew() {
		return this.autoRenew;
	}

	public void setAutoRenew(String autoRenew) {
		this.autoRenew = autoRenew;
		if(autoRenew != null){
			putQueryParameter("AutoRenew", autoRenew);
		}
	}

	public String getDBInstanceVersion() {
		return this.dBInstanceVersion;
	}

	public void setDBInstanceVersion(String dBInstanceVersion) {
		this.dBInstanceVersion = dBInstanceVersion;
		if(dBInstanceVersion != null){
			putQueryParameter("DBInstanceVersion", dBInstanceVersion);
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

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
		if(zoneId != null){
			putQueryParameter("ZoneId", zoneId);
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
	public Class<CloneDBInstanceResponse> getResponseClass() {
		return CloneDBInstanceResponse.class;
	}

}
