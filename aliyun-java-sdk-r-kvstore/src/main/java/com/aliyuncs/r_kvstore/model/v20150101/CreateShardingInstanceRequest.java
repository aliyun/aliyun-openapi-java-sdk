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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.r_kvstore.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateShardingInstanceRequest extends RpcAcsRequest<CreateShardingInstanceResponse> {
	
	public CreateShardingInstanceRequest() {
		super("R-kvstore", "2015-01-01", "CreateShardingInstance");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private Integer shardStorageQuantity;

	private Long resourceOwnerId;

	private String couponNo;

	private String networkType;

	private String engineVersion;

	private String password;

	private String shardReplicaClass;

	private String securityToken;

	private String incrementalBackupMode;

	private String businessInfo;

	private String period;

	private String backupId;

	private Long ownerId;

	private String vSwitchId;

	private String privateIpAddress;

	private String securityIPList;

	private String instanceName;

	private String zoneId;

	private Integer proxyQuantity;

	private String proxyMode;

	private String nodeType;

	private String instanceClass;

	private Long capacity;

	private String instanceType;

	private String resourceOwnerAccount;

	private String srcDBInstanceId;

	private String ownerAccount;

	private String token;

	private Integer shardQuantity;

	private Integer shardReplicaQuantity;

	private String architectureType;

	private String vpcId;

	private String redisManagerClass;

	private String chargeType;

	private String config;

	public Integer getShardStorageQuantity() {
		return this.shardStorageQuantity;
	}

	public void setShardStorageQuantity(Integer shardStorageQuantity) {
		this.shardStorageQuantity = shardStorageQuantity;
		if(shardStorageQuantity != null){
			putQueryParameter("ShardStorageQuantity", shardStorageQuantity.toString());
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

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
		if(password != null){
			putQueryParameter("Password", password);
		}
	}

	public String getShardReplicaClass() {
		return this.shardReplicaClass;
	}

	public void setShardReplicaClass(String shardReplicaClass) {
		this.shardReplicaClass = shardReplicaClass;
		if(shardReplicaClass != null){
			putQueryParameter("ShardReplicaClass", shardReplicaClass);
		}
	}

	public String getBizSecurityToken() {
		return this.securityToken;
	}

	public void setBizSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	/**
	 * @deprecated use getBizSecurityToken instead of this.
	 */
	@Deprecated
	public String getSecurityToken() {
		return this.securityToken;
	}

	/**
	 * @deprecated use setBizSecurityToken instead of this.
	 */
	@Deprecated
	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	public String getIncrementalBackupMode() {
		return this.incrementalBackupMode;
	}

	public void setIncrementalBackupMode(String incrementalBackupMode) {
		this.incrementalBackupMode = incrementalBackupMode;
		if(incrementalBackupMode != null){
			putQueryParameter("IncrementalBackupMode", incrementalBackupMode);
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

	public String getSecurityIPList() {
		return this.securityIPList;
	}

	public void setSecurityIPList(String securityIPList) {
		this.securityIPList = securityIPList;
		if(securityIPList != null){
			putQueryParameter("SecurityIPList", securityIPList);
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

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
		if(zoneId != null){
			putQueryParameter("ZoneId", zoneId);
		}
	}

	public Integer getProxyQuantity() {
		return this.proxyQuantity;
	}

	public void setProxyQuantity(Integer proxyQuantity) {
		this.proxyQuantity = proxyQuantity;
		if(proxyQuantity != null){
			putQueryParameter("ProxyQuantity", proxyQuantity.toString());
		}
	}

	public String getProxyMode() {
		return this.proxyMode;
	}

	public void setProxyMode(String proxyMode) {
		this.proxyMode = proxyMode;
		if(proxyMode != null){
			putQueryParameter("ProxyMode", proxyMode);
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

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
		if(token != null){
			putQueryParameter("Token", token);
		}
	}

	public Integer getShardQuantity() {
		return this.shardQuantity;
	}

	public void setShardQuantity(Integer shardQuantity) {
		this.shardQuantity = shardQuantity;
		if(shardQuantity != null){
			putQueryParameter("ShardQuantity", shardQuantity.toString());
		}
	}

	public Integer getShardReplicaQuantity() {
		return this.shardReplicaQuantity;
	}

	public void setShardReplicaQuantity(Integer shardReplicaQuantity) {
		this.shardReplicaQuantity = shardReplicaQuantity;
		if(shardReplicaQuantity != null){
			putQueryParameter("ShardReplicaQuantity", shardReplicaQuantity.toString());
		}
	}

	public String getArchitectureType() {
		return this.architectureType;
	}

	public void setArchitectureType(String architectureType) {
		this.architectureType = architectureType;
		if(architectureType != null){
			putQueryParameter("ArchitectureType", architectureType);
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

	public String getRedisManagerClass() {
		return this.redisManagerClass;
	}

	public void setRedisManagerClass(String redisManagerClass) {
		this.redisManagerClass = redisManagerClass;
		if(redisManagerClass != null){
			putQueryParameter("RedisManagerClass", redisManagerClass);
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

	public String getConfig() {
		return this.config;
	}

	public void setConfig(String config) {
		this.config = config;
		if(config != null){
			putQueryParameter("Config", config);
		}
	}

	@Override
	public Class<CreateShardingInstanceResponse> getResponseClass() {
		return CreateShardingInstanceResponse.class;
	}

}
