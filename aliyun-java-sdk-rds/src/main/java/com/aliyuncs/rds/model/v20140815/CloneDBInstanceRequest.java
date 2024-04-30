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
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.rds.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CloneDBInstanceRequest extends RpcAcsRequest<CloneDBInstanceResponse> {
	   

	private Long resourceOwnerId;

	private Integer dBInstanceStorage;

	private Boolean deletionProtection;

	private String backupType;

	private String period;

	private String backupId;

	private String dBInstanceClass;

	private String vSwitchId;

	private String privateIpAddress;

	private String zoneId;

	private String instanceNetworkType;

	private String zoneIdSlave1;

	private String zoneIdSlave2;

	private String ioAccelerationEnabled;

	private String tableMeta;

	private String dBInstanceId;

	private String dBInstanceStorageType;

	private String dedicatedHostGroupId;

	private String restoreTime;

	private Boolean autoPay;

	@SerializedName("serverlessConfig")
	private ServerlessConfig serverlessConfig;

	private String restoreTable;

	private Integer usedTime;

	private Boolean burstingEnabled;

	private String dbNames;

	private String vPCId;

	private String category;

	private String payType;

	private String bpeEnabled;
	public CloneDBInstanceRequest() {
		super("Rds", "2014-08-15", "CloneDBInstance", "rds");
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

	public Integer getDBInstanceStorage() {
		return this.dBInstanceStorage;
	}

	public void setDBInstanceStorage(Integer dBInstanceStorage) {
		this.dBInstanceStorage = dBInstanceStorage;
		if(dBInstanceStorage != null){
			putQueryParameter("DBInstanceStorage", dBInstanceStorage.toString());
		}
	}

	public Boolean getDeletionProtection() {
		return this.deletionProtection;
	}

	public void setDeletionProtection(Boolean deletionProtection) {
		this.deletionProtection = deletionProtection;
		if(deletionProtection != null){
			putQueryParameter("DeletionProtection", deletionProtection.toString());
		}
	}

	public String getBackupType() {
		return this.backupType;
	}

	public void setBackupType(String backupType) {
		this.backupType = backupType;
		if(backupType != null){
			putQueryParameter("BackupType", backupType);
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

	public String getBackupId() {
		return this.backupId;
	}

	public void setBackupId(String backupId) {
		this.backupId = backupId;
		if(backupId != null){
			putQueryParameter("BackupId", backupId);
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

	public String getPrivateIpAddress() {
		return this.privateIpAddress;
	}

	public void setPrivateIpAddress(String privateIpAddress) {
		this.privateIpAddress = privateIpAddress;
		if(privateIpAddress != null){
			putQueryParameter("PrivateIpAddress", privateIpAddress);
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

	public String getInstanceNetworkType() {
		return this.instanceNetworkType;
	}

	public void setInstanceNetworkType(String instanceNetworkType) {
		this.instanceNetworkType = instanceNetworkType;
		if(instanceNetworkType != null){
			putQueryParameter("InstanceNetworkType", instanceNetworkType);
		}
	}

	public String getZoneIdSlave1() {
		return this.zoneIdSlave1;
	}

	public void setZoneIdSlave1(String zoneIdSlave1) {
		this.zoneIdSlave1 = zoneIdSlave1;
		if(zoneIdSlave1 != null){
			putQueryParameter("ZoneIdSlave1", zoneIdSlave1);
		}
	}

	public String getZoneIdSlave2() {
		return this.zoneIdSlave2;
	}

	public void setZoneIdSlave2(String zoneIdSlave2) {
		this.zoneIdSlave2 = zoneIdSlave2;
		if(zoneIdSlave2 != null){
			putQueryParameter("ZoneIdSlave2", zoneIdSlave2);
		}
	}

	public String getIoAccelerationEnabled() {
		return this.ioAccelerationEnabled;
	}

	public void setIoAccelerationEnabled(String ioAccelerationEnabled) {
		this.ioAccelerationEnabled = ioAccelerationEnabled;
		if(ioAccelerationEnabled != null){
			putQueryParameter("IoAccelerationEnabled", ioAccelerationEnabled);
		}
	}

	public String getTableMeta() {
		return this.tableMeta;
	}

	public void setTableMeta(String tableMeta) {
		this.tableMeta = tableMeta;
		if(tableMeta != null){
			putQueryParameter("TableMeta", tableMeta);
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

	public String getDBInstanceStorageType() {
		return this.dBInstanceStorageType;
	}

	public void setDBInstanceStorageType(String dBInstanceStorageType) {
		this.dBInstanceStorageType = dBInstanceStorageType;
		if(dBInstanceStorageType != null){
			putQueryParameter("DBInstanceStorageType", dBInstanceStorageType);
		}
	}

	public String getDedicatedHostGroupId() {
		return this.dedicatedHostGroupId;
	}

	public void setDedicatedHostGroupId(String dedicatedHostGroupId) {
		this.dedicatedHostGroupId = dedicatedHostGroupId;
		if(dedicatedHostGroupId != null){
			putQueryParameter("DedicatedHostGroupId", dedicatedHostGroupId);
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

	public Boolean getAutoPay() {
		return this.autoPay;
	}

	public void setAutoPay(Boolean autoPay) {
		this.autoPay = autoPay;
		if(autoPay != null){
			putQueryParameter("AutoPay", autoPay.toString());
		}
	}

	public ServerlessConfig getServerlessConfig() {
		return this.serverlessConfig;
	}

	public void setServerlessConfig(ServerlessConfig serverlessConfig) {
		this.serverlessConfig = serverlessConfig;	
		if (serverlessConfig != null) {
			putQueryParameter("ServerlessConfig" , new Gson().toJson(serverlessConfig));
		}	
	}

	public String getRestoreTable() {
		return this.restoreTable;
	}

	public void setRestoreTable(String restoreTable) {
		this.restoreTable = restoreTable;
		if(restoreTable != null){
			putQueryParameter("RestoreTable", restoreTable);
		}
	}

	public Integer getUsedTime() {
		return this.usedTime;
	}

	public void setUsedTime(Integer usedTime) {
		this.usedTime = usedTime;
		if(usedTime != null){
			putQueryParameter("UsedTime", usedTime.toString());
		}
	}

	public Boolean getBurstingEnabled() {
		return this.burstingEnabled;
	}

	public void setBurstingEnabled(Boolean burstingEnabled) {
		this.burstingEnabled = burstingEnabled;
		if(burstingEnabled != null){
			putQueryParameter("BurstingEnabled", burstingEnabled.toString());
		}
	}

	public String getDbNames() {
		return this.dbNames;
	}

	public void setDbNames(String dbNames) {
		this.dbNames = dbNames;
		if(dbNames != null){
			putQueryParameter("DbNames", dbNames);
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

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
		if(category != null){
			putQueryParameter("Category", category);
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

	public String getBpeEnabled() {
		return this.bpeEnabled;
	}

	public void setBpeEnabled(String bpeEnabled) {
		this.bpeEnabled = bpeEnabled;
		if(bpeEnabled != null){
			putQueryParameter("BpeEnabled", bpeEnabled);
		}
	}

	public static class ServerlessConfig {

		@SerializedName("MinCapacity")
		private Double minCapacity;

		@SerializedName("MaxCapacity")
		private Double maxCapacity;

		@SerializedName("AutoPause")
		private Boolean autoPause;

		@SerializedName("SwitchForce")
		private Boolean switchForce;

		public Double getMinCapacity() {
			return this.minCapacity;
		}

		public void setMinCapacity(Double minCapacity) {
			this.minCapacity = minCapacity;
		}

		public Double getMaxCapacity() {
			return this.maxCapacity;
		}

		public void setMaxCapacity(Double maxCapacity) {
			this.maxCapacity = maxCapacity;
		}

		public Boolean getAutoPause() {
			return this.autoPause;
		}

		public void setAutoPause(Boolean autoPause) {
			this.autoPause = autoPause;
		}

		public Boolean getSwitchForce() {
			return this.switchForce;
		}

		public void setSwitchForce(Boolean switchForce) {
			this.switchForce = switchForce;
		}
	}

	@Override
	public Class<CloneDBInstanceResponse> getResponseClass() {
		return CloneDBInstanceResponse.class;
	}

}
