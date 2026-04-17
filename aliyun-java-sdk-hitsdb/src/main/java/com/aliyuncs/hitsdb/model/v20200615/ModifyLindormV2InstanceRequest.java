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

package com.aliyuncs.hitsdb.model.v20200615;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.hitsdb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyLindormV2InstanceRequest extends RpcAcsRequest<ModifyLindormV2InstanceResponse> {
	   

	private Long resourceOwnerId;

	private Long cloudStorageSize;

	private String cloudStorageType;

	private String upgradeType;

	private List<NodeGroupList> nodeGroupLists;

	private String securityToken;

	private String engineType;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String instanceId;
	public ModifyLindormV2InstanceRequest() {
		super("hitsdb", "2020-06-15", "ModifyLindormV2Instance", "hitsdb");
		setProtocol(ProtocolType.HTTPS);
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

	public Long getCloudStorageSize() {
		return this.cloudStorageSize;
	}

	public void setCloudStorageSize(Long cloudStorageSize) {
		this.cloudStorageSize = cloudStorageSize;
		if(cloudStorageSize != null){
			putQueryParameter("CloudStorageSize", cloudStorageSize.toString());
		}
	}

	public String getCloudStorageType() {
		return this.cloudStorageType;
	}

	public void setCloudStorageType(String cloudStorageType) {
		this.cloudStorageType = cloudStorageType;
		if(cloudStorageType != null){
			putQueryParameter("CloudStorageType", cloudStorageType);
		}
	}

	public String getUpgradeType() {
		return this.upgradeType;
	}

	public void setUpgradeType(String upgradeType) {
		this.upgradeType = upgradeType;
		if(upgradeType != null){
			putQueryParameter("UpgradeType", upgradeType);
		}
	}

	public List<NodeGroupList> getNodeGroupLists() {
		return this.nodeGroupLists;
	}

	public void setNodeGroupLists(List<NodeGroupList> nodeGroupLists) {
		this.nodeGroupLists = nodeGroupLists;	
		if (nodeGroupLists != null) {
			for (int depth1 = 0; depth1 < nodeGroupLists.size(); depth1++) {
				putQueryParameter("NodeGroupList." + (depth1 + 1) + ".ResourceGroupName" , nodeGroupLists.get(depth1).getResourceGroupName());
				putQueryParameter("NodeGroupList." + (depth1 + 1) + ".NodeSpec" , nodeGroupLists.get(depth1).getNodeSpec());
				putQueryParameter("NodeGroupList." + (depth1 + 1) + ".NodeDiskType" , nodeGroupLists.get(depth1).getNodeDiskType());
				putQueryParameter("NodeGroupList." + (depth1 + 1) + ".GroupId" , nodeGroupLists.get(depth1).getGroupId());
				putQueryParameter("NodeGroupList." + (depth1 + 1) + ".NodeCount" , nodeGroupLists.get(depth1).getNodeCount());
				putQueryParameter("NodeGroupList." + (depth1 + 1) + ".NodeDiskSize" , nodeGroupLists.get(depth1).getNodeDiskSize());
			}
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

	public String getEngineType() {
		return this.engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
		if(engineType != null){
			putQueryParameter("EngineType", engineType);
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

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public static class NodeGroupList {

		private String resourceGroupName;

		private String nodeSpec;

		private String nodeDiskType;

		private String groupId;

		private String nodeCount;

		private Long nodeDiskSize;

		public String getResourceGroupName() {
			return this.resourceGroupName;
		}

		public void setResourceGroupName(String resourceGroupName) {
			this.resourceGroupName = resourceGroupName;
		}

		public String getNodeSpec() {
			return this.nodeSpec;
		}

		public void setNodeSpec(String nodeSpec) {
			this.nodeSpec = nodeSpec;
		}

		public String getNodeDiskType() {
			return this.nodeDiskType;
		}

		public void setNodeDiskType(String nodeDiskType) {
			this.nodeDiskType = nodeDiskType;
		}

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public String getNodeCount() {
			return this.nodeCount;
		}

		public void setNodeCount(String nodeCount) {
			this.nodeCount = nodeCount;
		}

		public Long getNodeDiskSize() {
			return this.nodeDiskSize;
		}

		public void setNodeDiskSize(Long nodeDiskSize) {
			this.nodeDiskSize = nodeDiskSize;
		}
	}

	@Override
	public Class<ModifyLindormV2InstanceResponse> getResponseClass() {
		return ModifyLindormV2InstanceResponse.class;
	}

}
