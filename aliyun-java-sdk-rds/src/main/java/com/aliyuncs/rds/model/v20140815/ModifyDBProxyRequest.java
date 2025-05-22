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
public class ModifyDBProxyRequest extends RpcAcsRequest<ModifyDBProxyResponse> {
	   

	private Long resourceOwnerId;

	private String resourceGroupId;

	@SerializedName("dBProxyNodes")
	private List<DBProxyNodes> dBProxyNodes;

	private String dBInstanceId;

	private String persistentConnectionStatus;

	private String resourceOwnerAccount;

	private String dBProxyEngineType;

	private Long ownerId;

	private String dBProxyInstanceNum;

	private String configDBProxyService;

	private String vSwitchId;

	private String dBProxyInstanceType;

	private String vPCId;

	private String instanceNetworkType;
	public ModifyDBProxyRequest() {
		super("Rds", "2014-08-15", "ModifyDBProxy", "rds");
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

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
		}
	}

	public List<DBProxyNodes> getDBProxyNodes() {
		return this.dBProxyNodes;
	}

	public void setDBProxyNodes(List<DBProxyNodes> dBProxyNodes) {
		this.dBProxyNodes = dBProxyNodes;	
		if (dBProxyNodes != null) {
			putQueryParameter("DBProxyNodes" , new Gson().toJson(dBProxyNodes));
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

	public String getPersistentConnectionStatus() {
		return this.persistentConnectionStatus;
	}

	public void setPersistentConnectionStatus(String persistentConnectionStatus) {
		this.persistentConnectionStatus = persistentConnectionStatus;
		if(persistentConnectionStatus != null){
			putQueryParameter("PersistentConnectionStatus", persistentConnectionStatus);
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

	public String getDBProxyEngineType() {
		return this.dBProxyEngineType;
	}

	public void setDBProxyEngineType(String dBProxyEngineType) {
		this.dBProxyEngineType = dBProxyEngineType;
		if(dBProxyEngineType != null){
			putQueryParameter("DBProxyEngineType", dBProxyEngineType);
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

	public String getDBProxyInstanceNum() {
		return this.dBProxyInstanceNum;
	}

	public void setDBProxyInstanceNum(String dBProxyInstanceNum) {
		this.dBProxyInstanceNum = dBProxyInstanceNum;
		if(dBProxyInstanceNum != null){
			putQueryParameter("DBProxyInstanceNum", dBProxyInstanceNum);
		}
	}

	public String getConfigDBProxyService() {
		return this.configDBProxyService;
	}

	public void setConfigDBProxyService(String configDBProxyService) {
		this.configDBProxyService = configDBProxyService;
		if(configDBProxyService != null){
			putQueryParameter("ConfigDBProxyService", configDBProxyService);
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

	public String getDBProxyInstanceType() {
		return this.dBProxyInstanceType;
	}

	public void setDBProxyInstanceType(String dBProxyInstanceType) {
		this.dBProxyInstanceType = dBProxyInstanceType;
		if(dBProxyInstanceType != null){
			putQueryParameter("DBProxyInstanceType", dBProxyInstanceType);
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

	public String getInstanceNetworkType() {
		return this.instanceNetworkType;
	}

	public void setInstanceNetworkType(String instanceNetworkType) {
		this.instanceNetworkType = instanceNetworkType;
		if(instanceNetworkType != null){
			putQueryParameter("InstanceNetworkType", instanceNetworkType);
		}
	}

	public static class DBProxyNodes {

		@SerializedName("cpuCores")
		private String cpuCores;

		@SerializedName("zoneId")
		private String zoneId;

		@SerializedName("nodeCounts")
		private String nodeCounts;

		public String getCpuCores() {
			return this.cpuCores;
		}

		public void setCpuCores(String cpuCores) {
			this.cpuCores = cpuCores;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getNodeCounts() {
			return this.nodeCounts;
		}

		public void setNodeCounts(String nodeCounts) {
			this.nodeCounts = nodeCounts;
		}
	}

	@Override
	public Class<ModifyDBProxyResponse> getResponseClass() {
		return ModifyDBProxyResponse.class;
	}

}
