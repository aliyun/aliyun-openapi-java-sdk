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

package com.aliyuncs.gpdb.model.v20160503;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.gpdb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateDBInstanceRequest extends RpcAcsRequest<CreateDBInstanceResponse> {
	   

	private String engineVersion;

	private String dBInstanceCategory;

	private String storageType;

	private String deployMode;

	private String resourceGroupId;

	private String encryptionType;

	private String dBInstanceDescription;

	private String serverlessMode;

	private List<Tag> tags;

	private String period;

	private String vectorConfigurationStatus;

	private String backupId;

	private String encryptionKey;

	private Long ownerId;

	private String segDiskPerformanceLevel;

	private String dBInstanceClass;

	private String securityIPList;

	private String vSwitchId;

	private String privateIpAddress;

	private Integer masterCU;

	private String zoneId;

	private String prodType;

	private String instanceNetworkType;

	private String clientToken;

	private String instanceSpec;

	private Long storageSize;

	private String segStorageType;

	private String masterNodeNum;

	private String segNodeNum;

	private String engine;

	private Boolean createSampleData;

	private String standbyVSwitchId;

	private String dBInstanceGroupCount;

	private String standbyZoneId;

	private String cacheStorageSize;

	private String dBInstanceMode;

	private String masterAISpec;

	private String usedTime;

	private Boolean enableSSL;

	private String vPCId;

	private Integer serverlessResource;

	private Integer idleTime;

	private String payType;

	private String srcDbInstanceName;

	private List<AINodeSpecInfos> aINodeSpecInfoss;
	public CreateDBInstanceRequest() {
		super("gpdb", "2016-05-03", "CreateDBInstance", "gpdb");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getDBInstanceCategory() {
		return this.dBInstanceCategory;
	}

	public void setDBInstanceCategory(String dBInstanceCategory) {
		this.dBInstanceCategory = dBInstanceCategory;
		if(dBInstanceCategory != null){
			putQueryParameter("DBInstanceCategory", dBInstanceCategory);
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

	public String getDeployMode() {
		return this.deployMode;
	}

	public void setDeployMode(String deployMode) {
		this.deployMode = deployMode;
		if(deployMode != null){
			putQueryParameter("DeployMode", deployMode);
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

	public String getEncryptionType() {
		return this.encryptionType;
	}

	public void setEncryptionType(String encryptionType) {
		this.encryptionType = encryptionType;
		if(encryptionType != null){
			putQueryParameter("EncryptionType", encryptionType);
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

	public String getServerlessMode() {
		return this.serverlessMode;
	}

	public void setServerlessMode(String serverlessMode) {
		this.serverlessMode = serverlessMode;
		if(serverlessMode != null){
			putQueryParameter("ServerlessMode", serverlessMode);
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

	public String getVectorConfigurationStatus() {
		return this.vectorConfigurationStatus;
	}

	public void setVectorConfigurationStatus(String vectorConfigurationStatus) {
		this.vectorConfigurationStatus = vectorConfigurationStatus;
		if(vectorConfigurationStatus != null){
			putQueryParameter("VectorConfigurationStatus", vectorConfigurationStatus);
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

	public String getSegDiskPerformanceLevel() {
		return this.segDiskPerformanceLevel;
	}

	public void setSegDiskPerformanceLevel(String segDiskPerformanceLevel) {
		this.segDiskPerformanceLevel = segDiskPerformanceLevel;
		if(segDiskPerformanceLevel != null){
			putQueryParameter("SegDiskPerformanceLevel", segDiskPerformanceLevel);
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

	public Integer getMasterCU() {
		return this.masterCU;
	}

	public void setMasterCU(Integer masterCU) {
		this.masterCU = masterCU;
		if(masterCU != null){
			putQueryParameter("MasterCU", masterCU.toString());
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

	public String getProdType() {
		return this.prodType;
	}

	public void setProdType(String prodType) {
		this.prodType = prodType;
		if(prodType != null){
			putQueryParameter("ProdType", prodType);
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

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getInstanceSpec() {
		return this.instanceSpec;
	}

	public void setInstanceSpec(String instanceSpec) {
		this.instanceSpec = instanceSpec;
		if(instanceSpec != null){
			putQueryParameter("InstanceSpec", instanceSpec);
		}
	}

	public Long getStorageSize() {
		return this.storageSize;
	}

	public void setStorageSize(Long storageSize) {
		this.storageSize = storageSize;
		if(storageSize != null){
			putQueryParameter("StorageSize", storageSize.toString());
		}
	}

	public String getSegStorageType() {
		return this.segStorageType;
	}

	public void setSegStorageType(String segStorageType) {
		this.segStorageType = segStorageType;
		if(segStorageType != null){
			putQueryParameter("SegStorageType", segStorageType);
		}
	}

	public String getMasterNodeNum() {
		return this.masterNodeNum;
	}

	public void setMasterNodeNum(String masterNodeNum) {
		this.masterNodeNum = masterNodeNum;
		if(masterNodeNum != null){
			putQueryParameter("MasterNodeNum", masterNodeNum);
		}
	}

	public String getSegNodeNum() {
		return this.segNodeNum;
	}

	public void setSegNodeNum(String segNodeNum) {
		this.segNodeNum = segNodeNum;
		if(segNodeNum != null){
			putQueryParameter("SegNodeNum", segNodeNum);
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

	public Boolean getCreateSampleData() {
		return this.createSampleData;
	}

	public void setCreateSampleData(Boolean createSampleData) {
		this.createSampleData = createSampleData;
		if(createSampleData != null){
			putQueryParameter("CreateSampleData", createSampleData.toString());
		}
	}

	public String getStandbyVSwitchId() {
		return this.standbyVSwitchId;
	}

	public void setStandbyVSwitchId(String standbyVSwitchId) {
		this.standbyVSwitchId = standbyVSwitchId;
		if(standbyVSwitchId != null){
			putQueryParameter("StandbyVSwitchId", standbyVSwitchId);
		}
	}

	public String getDBInstanceGroupCount() {
		return this.dBInstanceGroupCount;
	}

	public void setDBInstanceGroupCount(String dBInstanceGroupCount) {
		this.dBInstanceGroupCount = dBInstanceGroupCount;
		if(dBInstanceGroupCount != null){
			putQueryParameter("DBInstanceGroupCount", dBInstanceGroupCount);
		}
	}

	public String getStandbyZoneId() {
		return this.standbyZoneId;
	}

	public void setStandbyZoneId(String standbyZoneId) {
		this.standbyZoneId = standbyZoneId;
		if(standbyZoneId != null){
			putQueryParameter("StandbyZoneId", standbyZoneId);
		}
	}

	public String getCacheStorageSize() {
		return this.cacheStorageSize;
	}

	public void setCacheStorageSize(String cacheStorageSize) {
		this.cacheStorageSize = cacheStorageSize;
		if(cacheStorageSize != null){
			putQueryParameter("CacheStorageSize", cacheStorageSize);
		}
	}

	public String getDBInstanceMode() {
		return this.dBInstanceMode;
	}

	public void setDBInstanceMode(String dBInstanceMode) {
		this.dBInstanceMode = dBInstanceMode;
		if(dBInstanceMode != null){
			putQueryParameter("DBInstanceMode", dBInstanceMode);
		}
	}

	public String getMasterAISpec() {
		return this.masterAISpec;
	}

	public void setMasterAISpec(String masterAISpec) {
		this.masterAISpec = masterAISpec;
		if(masterAISpec != null){
			putQueryParameter("MasterAISpec", masterAISpec);
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

	public Boolean getEnableSSL() {
		return this.enableSSL;
	}

	public void setEnableSSL(Boolean enableSSL) {
		this.enableSSL = enableSSL;
		if(enableSSL != null){
			putQueryParameter("EnableSSL", enableSSL.toString());
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

	public Integer getServerlessResource() {
		return this.serverlessResource;
	}

	public void setServerlessResource(Integer serverlessResource) {
		this.serverlessResource = serverlessResource;
		if(serverlessResource != null){
			putQueryParameter("ServerlessResource", serverlessResource.toString());
		}
	}

	public Integer getIdleTime() {
		return this.idleTime;
	}

	public void setIdleTime(Integer idleTime) {
		this.idleTime = idleTime;
		if(idleTime != null){
			putQueryParameter("IdleTime", idleTime.toString());
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

	public String getSrcDbInstanceName() {
		return this.srcDbInstanceName;
	}

	public void setSrcDbInstanceName(String srcDbInstanceName) {
		this.srcDbInstanceName = srcDbInstanceName;
		if(srcDbInstanceName != null){
			putQueryParameter("SrcDbInstanceName", srcDbInstanceName);
		}
	}

	public List<AINodeSpecInfos> getAINodeSpecInfoss() {
		return this.aINodeSpecInfoss;
	}

	public void setAINodeSpecInfoss(List<AINodeSpecInfos> aINodeSpecInfoss) {
		this.aINodeSpecInfoss = aINodeSpecInfoss;	
		if (aINodeSpecInfoss != null) {
			for (int depth1 = 0; depth1 < aINodeSpecInfoss.size(); depth1++) {
				putQueryParameter("AINodeSpecInfos." + (depth1 + 1) + ".AINodeSpec" , aINodeSpecInfoss.get(depth1).getAINodeSpec());
				putQueryParameter("AINodeSpecInfos." + (depth1 + 1) + ".AINodeNum" , aINodeSpecInfoss.get(depth1).getAINodeNum());
			}
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

	public static class AINodeSpecInfos {

		private String aINodeSpec;

		private String aINodeNum;

		public String getAINodeSpec() {
			return this.aINodeSpec;
		}

		public void setAINodeSpec(String aINodeSpec) {
			this.aINodeSpec = aINodeSpec;
		}

		public String getAINodeNum() {
			return this.aINodeNum;
		}

		public void setAINodeNum(String aINodeNum) {
			this.aINodeNum = aINodeNum;
		}
	}

	@Override
	public Class<CreateDBInstanceResponse> getResponseClass() {
		return CreateDBInstanceResponse.class;
	}

}
