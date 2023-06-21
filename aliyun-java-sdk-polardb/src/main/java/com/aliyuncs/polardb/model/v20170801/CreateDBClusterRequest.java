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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.polardb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateDBClusterRequest extends RpcAcsRequest<CreateDBClusterResponse> {
	   

	private Long resourceOwnerId;

	private String dBClusterDescription;

	private String proxyClass;

	private String proxyType;

	private String scaleMax;

	private String storageType;

	private String creationCategory;

	private String resourceGroupId;

	private String dBNodeClass;

	private String creationOption;

	private List<Tag> tags;

	private String sourceResourceId;

	private String scaleMin;

	private String backupRetentionPolicyOnClusterDeletion;

	private String period;

	private Long ownerId;

	private String vSwitchId;

	private String securityIPList;

	private String dBMinorVersion;

	private Boolean autoRenew;

	private String hotStandbyCluster;

	private String zoneId;

	private Boolean tDEStatus;

	private String allowShutDown;

	private String lowerCaseTableNames;

	private String scaleRoNumMax;

	private String standbyAZ;

	private String clientToken;

	private String defaultTimeZone;

	private String clusterNetworkType;

	private String parameterGroupId;

	private String gDNId;

	private String looseXEngine;

	private String loosePolarLogBin;

	private String architecture;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String looseXEngineUseMemoryPct;

	private String usedTime;

	private Integer dBNodeNum;

	private String vPCId;

	private String scaleRoNumMin;

	private String dBType;

	private String dBVersion;

	private String strictConsistency;

	private String cloneDataPoint;

	private String payType;

	private Long storageSpace;

	private String serverlessType;
	public CreateDBClusterRequest() {
		super("polardb", "2017-08-01", "CreateDBCluster", "polardb");
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

	public String getProxyClass() {
		return this.proxyClass;
	}

	public void setProxyClass(String proxyClass) {
		this.proxyClass = proxyClass;
		if(proxyClass != null){
			putQueryParameter("ProxyClass", proxyClass);
		}
	}

	public String getProxyType() {
		return this.proxyType;
	}

	public void setProxyType(String proxyType) {
		this.proxyType = proxyType;
		if(proxyType != null){
			putQueryParameter("ProxyType", proxyType);
		}
	}

	public String getScaleMax() {
		return this.scaleMax;
	}

	public void setScaleMax(String scaleMax) {
		this.scaleMax = scaleMax;
		if(scaleMax != null){
			putQueryParameter("ScaleMax", scaleMax);
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

	public String getCreationCategory() {
		return this.creationCategory;
	}

	public void setCreationCategory(String creationCategory) {
		this.creationCategory = creationCategory;
		if(creationCategory != null){
			putQueryParameter("CreationCategory", creationCategory);
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

	public String getDBNodeClass() {
		return this.dBNodeClass;
	}

	public void setDBNodeClass(String dBNodeClass) {
		this.dBNodeClass = dBNodeClass;
		if(dBNodeClass != null){
			putQueryParameter("DBNodeClass", dBNodeClass);
		}
	}

	public String getCreationOption() {
		return this.creationOption;
	}

	public void setCreationOption(String creationOption) {
		this.creationOption = creationOption;
		if(creationOption != null){
			putQueryParameter("CreationOption", creationOption);
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

	public String getSourceResourceId() {
		return this.sourceResourceId;
	}

	public void setSourceResourceId(String sourceResourceId) {
		this.sourceResourceId = sourceResourceId;
		if(sourceResourceId != null){
			putQueryParameter("SourceResourceId", sourceResourceId);
		}
	}

	public String getScaleMin() {
		return this.scaleMin;
	}

	public void setScaleMin(String scaleMin) {
		this.scaleMin = scaleMin;
		if(scaleMin != null){
			putQueryParameter("ScaleMin", scaleMin);
		}
	}

	public String getBackupRetentionPolicyOnClusterDeletion() {
		return this.backupRetentionPolicyOnClusterDeletion;
	}

	public void setBackupRetentionPolicyOnClusterDeletion(String backupRetentionPolicyOnClusterDeletion) {
		this.backupRetentionPolicyOnClusterDeletion = backupRetentionPolicyOnClusterDeletion;
		if(backupRetentionPolicyOnClusterDeletion != null){
			putQueryParameter("BackupRetentionPolicyOnClusterDeletion", backupRetentionPolicyOnClusterDeletion);
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

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
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

	public String getDBMinorVersion() {
		return this.dBMinorVersion;
	}

	public void setDBMinorVersion(String dBMinorVersion) {
		this.dBMinorVersion = dBMinorVersion;
		if(dBMinorVersion != null){
			putQueryParameter("DBMinorVersion", dBMinorVersion);
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

	public String getHotStandbyCluster() {
		return this.hotStandbyCluster;
	}

	public void setHotStandbyCluster(String hotStandbyCluster) {
		this.hotStandbyCluster = hotStandbyCluster;
		if(hotStandbyCluster != null){
			putQueryParameter("HotStandbyCluster", hotStandbyCluster);
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

	public Boolean getTDEStatus() {
		return this.tDEStatus;
	}

	public void setTDEStatus(Boolean tDEStatus) {
		this.tDEStatus = tDEStatus;
		if(tDEStatus != null){
			putQueryParameter("TDEStatus", tDEStatus.toString());
		}
	}

	public String getAllowShutDown() {
		return this.allowShutDown;
	}

	public void setAllowShutDown(String allowShutDown) {
		this.allowShutDown = allowShutDown;
		if(allowShutDown != null){
			putQueryParameter("AllowShutDown", allowShutDown);
		}
	}

	public String getLowerCaseTableNames() {
		return this.lowerCaseTableNames;
	}

	public void setLowerCaseTableNames(String lowerCaseTableNames) {
		this.lowerCaseTableNames = lowerCaseTableNames;
		if(lowerCaseTableNames != null){
			putQueryParameter("LowerCaseTableNames", lowerCaseTableNames);
		}
	}

	public String getScaleRoNumMax() {
		return this.scaleRoNumMax;
	}

	public void setScaleRoNumMax(String scaleRoNumMax) {
		this.scaleRoNumMax = scaleRoNumMax;
		if(scaleRoNumMax != null){
			putQueryParameter("ScaleRoNumMax", scaleRoNumMax);
		}
	}

	public String getStandbyAZ() {
		return this.standbyAZ;
	}

	public void setStandbyAZ(String standbyAZ) {
		this.standbyAZ = standbyAZ;
		if(standbyAZ != null){
			putQueryParameter("StandbyAZ", standbyAZ);
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

	public String getDefaultTimeZone() {
		return this.defaultTimeZone;
	}

	public void setDefaultTimeZone(String defaultTimeZone) {
		this.defaultTimeZone = defaultTimeZone;
		if(defaultTimeZone != null){
			putQueryParameter("DefaultTimeZone", defaultTimeZone);
		}
	}

	public String getClusterNetworkType() {
		return this.clusterNetworkType;
	}

	public void setClusterNetworkType(String clusterNetworkType) {
		this.clusterNetworkType = clusterNetworkType;
		if(clusterNetworkType != null){
			putQueryParameter("ClusterNetworkType", clusterNetworkType);
		}
	}

	public String getParameterGroupId() {
		return this.parameterGroupId;
	}

	public void setParameterGroupId(String parameterGroupId) {
		this.parameterGroupId = parameterGroupId;
		if(parameterGroupId != null){
			putQueryParameter("ParameterGroupId", parameterGroupId);
		}
	}

	public String getGDNId() {
		return this.gDNId;
	}

	public void setGDNId(String gDNId) {
		this.gDNId = gDNId;
		if(gDNId != null){
			putQueryParameter("GDNId", gDNId);
		}
	}

	public String getLooseXEngine() {
		return this.looseXEngine;
	}

	public void setLooseXEngine(String looseXEngine) {
		this.looseXEngine = looseXEngine;
		if(looseXEngine != null){
			putQueryParameter("LooseXEngine", looseXEngine);
		}
	}

	public String getLoosePolarLogBin() {
		return this.loosePolarLogBin;
	}

	public void setLoosePolarLogBin(String loosePolarLogBin) {
		this.loosePolarLogBin = loosePolarLogBin;
		if(loosePolarLogBin != null){
			putQueryParameter("LoosePolarLogBin", loosePolarLogBin);
		}
	}

	public String getArchitecture() {
		return this.architecture;
	}

	public void setArchitecture(String architecture) {
		this.architecture = architecture;
		if(architecture != null){
			putQueryParameter("Architecture", architecture);
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

	public String getLooseXEngineUseMemoryPct() {
		return this.looseXEngineUseMemoryPct;
	}

	public void setLooseXEngineUseMemoryPct(String looseXEngineUseMemoryPct) {
		this.looseXEngineUseMemoryPct = looseXEngineUseMemoryPct;
		if(looseXEngineUseMemoryPct != null){
			putQueryParameter("LooseXEngineUseMemoryPct", looseXEngineUseMemoryPct);
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

	public Integer getDBNodeNum() {
		return this.dBNodeNum;
	}

	public void setDBNodeNum(Integer dBNodeNum) {
		this.dBNodeNum = dBNodeNum;
		if(dBNodeNum != null){
			putQueryParameter("DBNodeNum", dBNodeNum.toString());
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

	public String getScaleRoNumMin() {
		return this.scaleRoNumMin;
	}

	public void setScaleRoNumMin(String scaleRoNumMin) {
		this.scaleRoNumMin = scaleRoNumMin;
		if(scaleRoNumMin != null){
			putQueryParameter("ScaleRoNumMin", scaleRoNumMin);
		}
	}

	public String getDBType() {
		return this.dBType;
	}

	public void setDBType(String dBType) {
		this.dBType = dBType;
		if(dBType != null){
			putQueryParameter("DBType", dBType);
		}
	}

	public String getDBVersion() {
		return this.dBVersion;
	}

	public void setDBVersion(String dBVersion) {
		this.dBVersion = dBVersion;
		if(dBVersion != null){
			putQueryParameter("DBVersion", dBVersion);
		}
	}

	public String getStrictConsistency() {
		return this.strictConsistency;
	}

	public void setStrictConsistency(String strictConsistency) {
		this.strictConsistency = strictConsistency;
		if(strictConsistency != null){
			putQueryParameter("StrictConsistency", strictConsistency);
		}
	}

	public String getCloneDataPoint() {
		return this.cloneDataPoint;
	}

	public void setCloneDataPoint(String cloneDataPoint) {
		this.cloneDataPoint = cloneDataPoint;
		if(cloneDataPoint != null){
			putQueryParameter("CloneDataPoint", cloneDataPoint);
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

	public Long getStorageSpace() {
		return this.storageSpace;
	}

	public void setStorageSpace(Long storageSpace) {
		this.storageSpace = storageSpace;
		if(storageSpace != null){
			putQueryParameter("StorageSpace", storageSpace.toString());
		}
	}

	public String getServerlessType() {
		return this.serverlessType;
	}

	public void setServerlessType(String serverlessType) {
		this.serverlessType = serverlessType;
		if(serverlessType != null){
			putQueryParameter("ServerlessType", serverlessType);
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
