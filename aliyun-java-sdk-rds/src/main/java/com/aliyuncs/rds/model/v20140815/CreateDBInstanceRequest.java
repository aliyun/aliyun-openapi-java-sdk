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
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.rds.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateDBInstanceRequest extends RpcAcsRequest<CreateDBInstanceResponse> {
	   

	private String dBParamGroupId;

	private String babelfishConfig;

	private Long resourceOwnerId;

	private Integer dBInstanceStorage;

	private String systemDBCharset;

	private String engineVersion;

	private Boolean deletionProtection;

	private String resourceGroupId;

	private String targetDedicatedHostIdForMaster;

	private String dBInstanceDescription;

	private List<Tag> tags;

	private String businessInfo;

	private String period;

	private Boolean dryRun;

	private String encryptionKey;

	private String dBInstanceClass;

	private String securityIPList;

	private String vSwitchId;

	private String privateIpAddress;

	private String targetDedicatedHostIdForLog;

	private String autoRenew;

	private String roleARN;

	private String zoneId;

	private String storageAutoScale;

	private String instanceNetworkType;

	private String connectionMode;

	private String clientToken;

	private String targetDedicatedHostIdForSlave;

	private String zoneIdSlave1;

	private String zoneIdSlave2;

	private String dBIsIgnoreCase;

	private String engine;

	private String dBTimeZone;

	private String dBInstanceStorageType;

	private String dedicatedHostGroupId;

	private String createStrategy;

	private String dBInstanceNetType;

	private Integer amount;

	@SerializedName("serverlessConfig")
	private ServerlessConfig serverlessConfig;

	private String usedTime;

	private String targetMinorVersion;

	private String userBackupId;

	private Integer storageUpperBound;

	private Integer storageThreshold;

	private String vPCId;

	private String category;

	private String payType;
	public CreateDBInstanceRequest() {
		super("Rds", "2014-08-15", "CreateDBInstance", "rds");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDBParamGroupId() {
		return this.dBParamGroupId;
	}

	public void setDBParamGroupId(String dBParamGroupId) {
		this.dBParamGroupId = dBParamGroupId;
		if(dBParamGroupId != null){
			putQueryParameter("DBParamGroupId", dBParamGroupId);
		}
	}

	public String getBabelfishConfig() {
		return this.babelfishConfig;
	}

	public void setBabelfishConfig(String babelfishConfig) {
		this.babelfishConfig = babelfishConfig;
		if(babelfishConfig != null){
			putQueryParameter("BabelfishConfig", babelfishConfig);
		}
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

	public String getSystemDBCharset() {
		return this.systemDBCharset;
	}

	public void setSystemDBCharset(String systemDBCharset) {
		this.systemDBCharset = systemDBCharset;
		if(systemDBCharset != null){
			putQueryParameter("SystemDBCharset", systemDBCharset);
		}
	}

	public String getEngineVersion() {
		return this.engineVersion;
	}

	public void setEngineVersion(String engineVersion) {
		this.engineVersion = engineVersion;
		if(engineVersion != null){
			putQueryParameter("EngineVersion", engineVersion);
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

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
		}
	}

	public String getTargetDedicatedHostIdForMaster() {
		return this.targetDedicatedHostIdForMaster;
	}

	public void setTargetDedicatedHostIdForMaster(String targetDedicatedHostIdForMaster) {
		this.targetDedicatedHostIdForMaster = targetDedicatedHostIdForMaster;
		if(targetDedicatedHostIdForMaster != null){
			putQueryParameter("TargetDedicatedHostIdForMaster", targetDedicatedHostIdForMaster);
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

	public String getBusinessInfo() {
		return this.businessInfo;
	}

	public void setBusinessInfo(String businessInfo) {
		this.businessInfo = businessInfo;
		if(businessInfo != null){
			putQueryParameter("BusinessInfo", businessInfo);
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

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putQueryParameter("DryRun", dryRun.toString());
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

	public String getDBInstanceClass() {
		return this.dBInstanceClass;
	}

	public void setDBInstanceClass(String dBInstanceClass) {
		this.dBInstanceClass = dBInstanceClass;
		if(dBInstanceClass != null){
			putQueryParameter("DBInstanceClass", dBInstanceClass);
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

	public String getTargetDedicatedHostIdForLog() {
		return this.targetDedicatedHostIdForLog;
	}

	public void setTargetDedicatedHostIdForLog(String targetDedicatedHostIdForLog) {
		this.targetDedicatedHostIdForLog = targetDedicatedHostIdForLog;
		if(targetDedicatedHostIdForLog != null){
			putQueryParameter("TargetDedicatedHostIdForLog", targetDedicatedHostIdForLog);
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

	public String getRoleARN() {
		return this.roleARN;
	}

	public void setRoleARN(String roleARN) {
		this.roleARN = roleARN;
		if(roleARN != null){
			putQueryParameter("RoleARN", roleARN);
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

	public String getStorageAutoScale() {
		return this.storageAutoScale;
	}

	public void setStorageAutoScale(String storageAutoScale) {
		this.storageAutoScale = storageAutoScale;
		if(storageAutoScale != null){
			putQueryParameter("StorageAutoScale", storageAutoScale);
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

	public String getConnectionMode() {
		return this.connectionMode;
	}

	public void setConnectionMode(String connectionMode) {
		this.connectionMode = connectionMode;
		if(connectionMode != null){
			putQueryParameter("ConnectionMode", connectionMode);
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

	public String getTargetDedicatedHostIdForSlave() {
		return this.targetDedicatedHostIdForSlave;
	}

	public void setTargetDedicatedHostIdForSlave(String targetDedicatedHostIdForSlave) {
		this.targetDedicatedHostIdForSlave = targetDedicatedHostIdForSlave;
		if(targetDedicatedHostIdForSlave != null){
			putQueryParameter("TargetDedicatedHostIdForSlave", targetDedicatedHostIdForSlave);
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

	public String getDBIsIgnoreCase() {
		return this.dBIsIgnoreCase;
	}

	public void setDBIsIgnoreCase(String dBIsIgnoreCase) {
		this.dBIsIgnoreCase = dBIsIgnoreCase;
		if(dBIsIgnoreCase != null){
			putQueryParameter("DBIsIgnoreCase", dBIsIgnoreCase);
		}
	}

	public String getEngine() {
		return this.engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
		if(engine != null){
			putQueryParameter("Engine", engine);
		}
	}

	public String getDBTimeZone() {
		return this.dBTimeZone;
	}

	public void setDBTimeZone(String dBTimeZone) {
		this.dBTimeZone = dBTimeZone;
		if(dBTimeZone != null){
			putQueryParameter("DBTimeZone", dBTimeZone);
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

	public String getCreateStrategy() {
		return this.createStrategy;
	}

	public void setCreateStrategy(String createStrategy) {
		this.createStrategy = createStrategy;
		if(createStrategy != null){
			putQueryParameter("CreateStrategy", createStrategy);
		}
	}

	public String getDBInstanceNetType() {
		return this.dBInstanceNetType;
	}

	public void setDBInstanceNetType(String dBInstanceNetType) {
		this.dBInstanceNetType = dBInstanceNetType;
		if(dBInstanceNetType != null){
			putQueryParameter("DBInstanceNetType", dBInstanceNetType);
		}
	}

	public Integer getAmount() {
		return this.amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
		if(amount != null){
			putQueryParameter("Amount", amount.toString());
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

	public String getUsedTime() {
		return this.usedTime;
	}

	public void setUsedTime(String usedTime) {
		this.usedTime = usedTime;
		if(usedTime != null){
			putQueryParameter("UsedTime", usedTime);
		}
	}

	public String getTargetMinorVersion() {
		return this.targetMinorVersion;
	}

	public void setTargetMinorVersion(String targetMinorVersion) {
		this.targetMinorVersion = targetMinorVersion;
		if(targetMinorVersion != null){
			putQueryParameter("TargetMinorVersion", targetMinorVersion);
		}
	}

	public String getUserBackupId() {
		return this.userBackupId;
	}

	public void setUserBackupId(String userBackupId) {
		this.userBackupId = userBackupId;
		if(userBackupId != null){
			putQueryParameter("UserBackupId", userBackupId);
		}
	}

	public Integer getStorageUpperBound() {
		return this.storageUpperBound;
	}

	public void setStorageUpperBound(Integer storageUpperBound) {
		this.storageUpperBound = storageUpperBound;
		if(storageUpperBound != null){
			putQueryParameter("StorageUpperBound", storageUpperBound.toString());
		}
	}

	public Integer getStorageThreshold() {
		return this.storageThreshold;
	}

	public void setStorageThreshold(Integer storageThreshold) {
		this.storageThreshold = storageThreshold;
		if(storageThreshold != null){
			putQueryParameter("StorageThreshold", storageThreshold.toString());
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

	public static class ServerlessConfig {

		@SerializedName("MinCapacity")
		private Double minCapacity;

		@SerializedName("MaxCapacity")
		private Double maxCapacity;

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
	}

	@Override
	public Class<CreateDBInstanceResponse> getResponseClass() {
		return CreateDBInstanceResponse.class;
	}

}
