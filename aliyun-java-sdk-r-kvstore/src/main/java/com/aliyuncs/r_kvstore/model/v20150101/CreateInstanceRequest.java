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

package com.aliyuncs.r_kvstore.model.v20150101;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.r_kvstore.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateInstanceRequest extends RpcAcsRequest<CreateInstanceResponse> {
	   

	private Long resourceOwnerId;

	private String connectionStringPrefix;

	private String secondaryZoneId;

	private Integer slaveReadOnlyCount;

	private String couponNo;

	private String networkType;

	private String engineVersion;

	private String resourceGroupId;

	private String password;

	private String securityToken;

	private List<Tag> tags;

	private String globalSecurityGroupIds;

	private String businessInfo;

	private Integer shardCount;

	private String autoRenewPeriod;

	private String period;

	private Boolean dryRun;

	private String backupId;

	private Long ownerId;

	private String vSwitchId;

	private String privateIpAddress;

	private String instanceName;

	private String autoRenew;

	private String port;

	private String zoneId;

	private Integer replicaCount;

	private String appendonly;

	private String nodeType;

	private String autoUseCoupon;

	private String instanceClass;

	private Long capacity;

	private String instanceType;

	private String dedicatedHostGroupId;

	private String restoreTime;

	private String resourceOwnerAccount;

	private String srcDBInstanceId;

	private String ownerAccount;

	private Boolean globalInstance;

	private String recoverConfigMode;

	private String token;

	private String globalInstanceId;

	private String paramGroupId;

	private String vpcId;

	private Integer readOnlyCount;

	private String chargeType;

	private Integer slaveReplicaCount;

	private String clusterBackupId;
	public CreateInstanceRequest() {
		super("R-kvstore", "2015-01-01", "CreateInstance", "redisa");
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

	public String getConnectionStringPrefix() {
		return this.connectionStringPrefix;
	}

	public void setConnectionStringPrefix(String connectionStringPrefix) {
		this.connectionStringPrefix = connectionStringPrefix;
		if(connectionStringPrefix != null){
			putQueryParameter("ConnectionStringPrefix", connectionStringPrefix);
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

	public Integer getSlaveReadOnlyCount() {
		return this.slaveReadOnlyCount;
	}

	public void setSlaveReadOnlyCount(Integer slaveReadOnlyCount) {
		this.slaveReadOnlyCount = slaveReadOnlyCount;
		if(slaveReadOnlyCount != null){
			putQueryParameter("SlaveReadOnlyCount", slaveReadOnlyCount.toString());
		}
	}

	public String getCouponNo() {
		return this.couponNo;
	}

	public void setCouponNo(String couponNo) {
		this.couponNo = couponNo;
		if(couponNo != null){
			putQueryParameter("CouponNo", couponNo);
		}
	}

	public String getNetworkType() {
		return this.networkType;
	}

	public void setNetworkType(String networkType) {
		this.networkType = networkType;
		if(networkType != null){
			putQueryParameter("NetworkType", networkType);
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

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
		}
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
		if(password != null){
			putQueryParameter("Password", password);
		}
	}

	public String getSecurityToken() {
		return this.securityToken;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
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

	public String getGlobalSecurityGroupIds() {
		return this.globalSecurityGroupIds;
	}

	public void setGlobalSecurityGroupIds(String globalSecurityGroupIds) {
		this.globalSecurityGroupIds = globalSecurityGroupIds;
		if(globalSecurityGroupIds != null){
			putQueryParameter("GlobalSecurityGroupIds", globalSecurityGroupIds);
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

	public Integer getShardCount() {
		return this.shardCount;
	}

	public void setShardCount(Integer shardCount) {
		this.shardCount = shardCount;
		if(shardCount != null){
			putQueryParameter("ShardCount", shardCount.toString());
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

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putQueryParameter("DryRun", dryRun.toString());
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

	public String getPrivateIpAddress() {
		return this.privateIpAddress;
	}

	public void setPrivateIpAddress(String privateIpAddress) {
		this.privateIpAddress = privateIpAddress;
		if(privateIpAddress != null){
			putQueryParameter("PrivateIpAddress", privateIpAddress);
		}
	}

	public String getInstanceName() {
		return this.instanceName;
	}

	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
		if(instanceName != null){
			putQueryParameter("InstanceName", instanceName);
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

	public String getPort() {
		return this.port;
	}

	public void setPort(String port) {
		this.port = port;
		if(port != null){
			putQueryParameter("Port", port);
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

	public Integer getReplicaCount() {
		return this.replicaCount;
	}

	public void setReplicaCount(Integer replicaCount) {
		this.replicaCount = replicaCount;
		if(replicaCount != null){
			putQueryParameter("ReplicaCount", replicaCount.toString());
		}
	}

	public String getAppendonly() {
		return this.appendonly;
	}

	public void setAppendonly(String appendonly) {
		this.appendonly = appendonly;
		if(appendonly != null){
			putQueryParameter("Appendonly", appendonly);
		}
	}

	public String getNodeType() {
		return this.nodeType;
	}

	public void setNodeType(String nodeType) {
		this.nodeType = nodeType;
		if(nodeType != null){
			putQueryParameter("NodeType", nodeType);
		}
	}

	public String getAutoUseCoupon() {
		return this.autoUseCoupon;
	}

	public void setAutoUseCoupon(String autoUseCoupon) {
		this.autoUseCoupon = autoUseCoupon;
		if(autoUseCoupon != null){
			putQueryParameter("AutoUseCoupon", autoUseCoupon);
		}
	}

	public String getInstanceClass() {
		return this.instanceClass;
	}

	public void setInstanceClass(String instanceClass) {
		this.instanceClass = instanceClass;
		if(instanceClass != null){
			putQueryParameter("InstanceClass", instanceClass);
		}
	}

	public Long getCapacity() {
		return this.capacity;
	}

	public void setCapacity(Long capacity) {
		this.capacity = capacity;
		if(capacity != null){
			putQueryParameter("Capacity", capacity.toString());
		}
	}

	public String getInstanceType() {
		return this.instanceType;
	}

	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
		if(instanceType != null){
			putQueryParameter("InstanceType", instanceType);
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

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getSrcDBInstanceId() {
		return this.srcDBInstanceId;
	}

	public void setSrcDBInstanceId(String srcDBInstanceId) {
		this.srcDBInstanceId = srcDBInstanceId;
		if(srcDBInstanceId != null){
			putQueryParameter("SrcDBInstanceId", srcDBInstanceId);
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

	public Boolean getGlobalInstance() {
		return this.globalInstance;
	}

	public void setGlobalInstance(Boolean globalInstance) {
		this.globalInstance = globalInstance;
		if(globalInstance != null){
			putQueryParameter("GlobalInstance", globalInstance.toString());
		}
	}

	public String getRecoverConfigMode() {
		return this.recoverConfigMode;
	}

	public void setRecoverConfigMode(String recoverConfigMode) {
		this.recoverConfigMode = recoverConfigMode;
		if(recoverConfigMode != null){
			putQueryParameter("RecoverConfigMode", recoverConfigMode);
		}
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
		if(token != null){
			putQueryParameter("Token", token);
		}
	}

	public String getGlobalInstanceId() {
		return this.globalInstanceId;
	}

	public void setGlobalInstanceId(String globalInstanceId) {
		this.globalInstanceId = globalInstanceId;
		if(globalInstanceId != null){
			putQueryParameter("GlobalInstanceId", globalInstanceId);
		}
	}

	public String getParamGroupId() {
		return this.paramGroupId;
	}

	public void setParamGroupId(String paramGroupId) {
		this.paramGroupId = paramGroupId;
		if(paramGroupId != null){
			putQueryParameter("ParamGroupId", paramGroupId);
		}
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
		if(vpcId != null){
			putQueryParameter("VpcId", vpcId);
		}
	}

	public Integer getReadOnlyCount() {
		return this.readOnlyCount;
	}

	public void setReadOnlyCount(Integer readOnlyCount) {
		this.readOnlyCount = readOnlyCount;
		if(readOnlyCount != null){
			putQueryParameter("ReadOnlyCount", readOnlyCount.toString());
		}
	}

	public String getChargeType() {
		return this.chargeType;
	}

	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
		if(chargeType != null){
			putQueryParameter("ChargeType", chargeType);
		}
	}

	public Integer getSlaveReplicaCount() {
		return this.slaveReplicaCount;
	}

	public void setSlaveReplicaCount(Integer slaveReplicaCount) {
		this.slaveReplicaCount = slaveReplicaCount;
		if(slaveReplicaCount != null){
			putQueryParameter("SlaveReplicaCount", slaveReplicaCount.toString());
		}
	}

	public String getClusterBackupId() {
		return this.clusterBackupId;
	}

	public void setClusterBackupId(String clusterBackupId) {
		this.clusterBackupId = clusterBackupId;
		if(clusterBackupId != null){
			putQueryParameter("ClusterBackupId", clusterBackupId);
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
	public Class<CreateInstanceResponse> getResponseClass() {
		return CreateInstanceResponse.class;
	}

}
