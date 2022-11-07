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

package com.aliyuncs.dds.model.v20151201;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateShardingDBInstanceRequest extends RpcAcsRequest<CreateShardingDBInstanceResponse> {
	   

	private Long resourceOwnerId;

	private String secondaryZoneId;

	private String engineVersion;

	private String networkType;

	private List<ReplicaSet> replicaSets;

	private String storageType;

	private String resourceGroupId;

	private String securityToken;

	private String dBInstanceDescription;

	private Integer period;

	private List<ConfigServer> configServers;

	private Long ownerId;

	private String securityIPList;

	private String vSwitchId;

	private List<Mongos> mongoss;

	private String autoRenew;

	private String zoneId;

	private String clientToken;

	private String storageEngine;

	private String engine;

	private String hiddenZoneId;

	private String restoreTime;

	private String resourceOwnerAccount;

	private String srcDBInstanceId;

	private String ownerAccount;

	private String accountPassword;

	private String vpcId;

	private String protocolType;

	private String chargeType;
	public CreateShardingDBInstanceRequest() {
		super("Dds", "2015-12-01", "CreateShardingDBInstance", "dds");
		setMethod(MethodType.POST);
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

	public String getEngineVersion() {
		return this.engineVersion;
	}

	public void setEngineVersion(String engineVersion) {
		this.engineVersion = engineVersion;
		if(engineVersion != null){
			putQueryParameter("EngineVersion", engineVersion);
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

	public List<ReplicaSet> getReplicaSets() {
		return this.replicaSets;
	}

	public void setReplicaSets(List<ReplicaSet> replicaSets) {
		this.replicaSets = replicaSets;	
		if (replicaSets != null) {
			for (int depth1 = 0; depth1 < replicaSets.size(); depth1++) {
				putQueryParameter("ReplicaSet." + (depth1 + 1) + ".ReadonlyReplicas" , replicaSets.get(depth1).getReadonlyReplicas());
				putQueryParameter("ReplicaSet." + (depth1 + 1) + ".Storage" , replicaSets.get(depth1).getStorage());
				putQueryParameter("ReplicaSet." + (depth1 + 1) + ".Class" , replicaSets.get(depth1).get_Class());
			}
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

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
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

	public String getDBInstanceDescription() {
		return this.dBInstanceDescription;
	}

	public void setDBInstanceDescription(String dBInstanceDescription) {
		this.dBInstanceDescription = dBInstanceDescription;
		if(dBInstanceDescription != null){
			putQueryParameter("DBInstanceDescription", dBInstanceDescription);
		}
	}

	public Integer getPeriod() {
		return this.period;
	}

	public void setPeriod(Integer period) {
		this.period = period;
		if(period != null){
			putQueryParameter("Period", period.toString());
		}
	}

	public List<ConfigServer> getConfigServers() {
		return this.configServers;
	}

	public void setConfigServers(List<ConfigServer> configServers) {
		this.configServers = configServers;	
		if (configServers != null) {
			for (int depth1 = 0; depth1 < configServers.size(); depth1++) {
				putQueryParameter("ConfigServer." + (depth1 + 1) + ".Storage" , configServers.get(depth1).getStorage());
				putQueryParameter("ConfigServer." + (depth1 + 1) + ".Class" , configServers.get(depth1).get_Class());
			}
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

	public List<Mongos> getMongoss() {
		return this.mongoss;
	}

	public void setMongoss(List<Mongos> mongoss) {
		this.mongoss = mongoss;	
		if (mongoss != null) {
			for (int depth1 = 0; depth1 < mongoss.size(); depth1++) {
				putQueryParameter("Mongos." + (depth1 + 1) + ".Class" , mongoss.get(depth1).get_Class());
			}
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

	public String getStorageEngine() {
		return this.storageEngine;
	}

	public void setStorageEngine(String storageEngine) {
		this.storageEngine = storageEngine;
		if(storageEngine != null){
			putQueryParameter("StorageEngine", storageEngine);
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

	public String getHiddenZoneId() {
		return this.hiddenZoneId;
	}

	public void setHiddenZoneId(String hiddenZoneId) {
		this.hiddenZoneId = hiddenZoneId;
		if(hiddenZoneId != null){
			putQueryParameter("HiddenZoneId", hiddenZoneId);
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

	public String getAccountPassword() {
		return this.accountPassword;
	}

	public void setAccountPassword(String accountPassword) {
		this.accountPassword = accountPassword;
		if(accountPassword != null){
			putQueryParameter("AccountPassword", accountPassword);
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

	public String getProtocolType() {
		return this.protocolType;
	}

	public void setProtocolType(String protocolType) {
		this.protocolType = protocolType;
		if(protocolType != null){
			putQueryParameter("ProtocolType", protocolType);
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

	public static class ReplicaSet {

		private Integer readonlyReplicas;

		private Integer storage;

		private String _class;

		public Integer getReadonlyReplicas() {
			return this.readonlyReplicas;
		}

		public void setReadonlyReplicas(Integer readonlyReplicas) {
			this.readonlyReplicas = readonlyReplicas;
		}

		public Integer getStorage() {
			return this.storage;
		}

		public void setStorage(Integer storage) {
			this.storage = storage;
		}

		public String get_Class() {
			return this._class;
		}

		public void set_Class(String _class) {
			this._class = _class;
		}
	}

	public static class ConfigServer {

		private Integer storage;

		private String _class;

		public Integer getStorage() {
			return this.storage;
		}

		public void setStorage(Integer storage) {
			this.storage = storage;
		}

		public String get_Class() {
			return this._class;
		}

		public void set_Class(String _class) {
			this._class = _class;
		}
	}

	public static class Mongos {

		private String _class;

		public String get_Class() {
			return this._class;
		}

		public void set_Class(String _class) {
			this._class = _class;
		}
	}

	@Override
	public Class<CreateShardingDBInstanceResponse> getResponseClass() {
		return CreateShardingDBInstanceResponse.class;
	}

}
