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
public class UpdateLindormV2InstanceRequest extends RpcAcsRequest<UpdateLindormV2InstanceResponse> {
	   

	private Long resourceOwnerId;

	private Integer cloudStorageSize;

	private String cloudStorageType;

	private String securityToken;

	private Integer capacityStorageSize;

	private String resourceOwnerAccount;

	private Boolean enableCapacityStorage;

	private String ownerAccount;

	private Long ownerId;

	private String instanceId;

	private List<EngineList> engineLists;
	public UpdateLindormV2InstanceRequest() {
		super("hitsdb", "2020-06-15", "UpdateLindormV2Instance", "hitsdb");
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

	public Integer getCloudStorageSize() {
		return this.cloudStorageSize;
	}

	public void setCloudStorageSize(Integer cloudStorageSize) {
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

	public String getSecurityToken() {
		return this.securityToken;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	public Integer getCapacityStorageSize() {
		return this.capacityStorageSize;
	}

	public void setCapacityStorageSize(Integer capacityStorageSize) {
		this.capacityStorageSize = capacityStorageSize;
		if(capacityStorageSize != null){
			putQueryParameter("CapacityStorageSize", capacityStorageSize.toString());
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

	public Boolean getEnableCapacityStorage() {
		return this.enableCapacityStorage;
	}

	public void setEnableCapacityStorage(Boolean enableCapacityStorage) {
		this.enableCapacityStorage = enableCapacityStorage;
		if(enableCapacityStorage != null){
			putQueryParameter("EnableCapacityStorage", enableCapacityStorage.toString());
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

	public List<EngineList> getEngineLists() {
		return this.engineLists;
	}

	public void setEngineLists(List<EngineList> engineLists) {
		this.engineLists = engineLists;	
		if (engineLists != null) {
			for (int depth1 = 0; depth1 < engineLists.size(); depth1++) {
				if (engineLists.get(depth1).getNodeGroupLists() != null) {
					for (int depth2 = 0; depth2 < engineLists.get(depth1).getNodeGroupLists().size(); depth2++) {
						putQueryParameter("EngineList." + (depth1 + 1) + ".NodeGroupList." + (depth2 + 1) + ".ResourceGroupName" , engineLists.get(depth1).getNodeGroupLists().get(depth2).getResourceGroupName());
						putQueryParameter("EngineList." + (depth1 + 1) + ".NodeGroupList." + (depth2 + 1) + ".NodeSpec" , engineLists.get(depth1).getNodeGroupLists().get(depth2).getNodeSpec());
						putQueryParameter("EngineList." + (depth1 + 1) + ".NodeGroupList." + (depth2 + 1) + ".NodeDiskType" , engineLists.get(depth1).getNodeGroupLists().get(depth2).getNodeDiskType());
						putQueryParameter("EngineList." + (depth1 + 1) + ".NodeGroupList." + (depth2 + 1) + ".NodeCount" , engineLists.get(depth1).getNodeGroupLists().get(depth2).getNodeCount());
						putQueryParameter("EngineList." + (depth1 + 1) + ".NodeGroupList." + (depth2 + 1) + ".GroupId" , engineLists.get(depth1).getNodeGroupLists().get(depth2).getGroupId());
						putQueryParameter("EngineList." + (depth1 + 1) + ".NodeGroupList." + (depth2 + 1) + ".NodeDiskSize" , engineLists.get(depth1).getNodeGroupLists().get(depth2).getNodeDiskSize());
					}
				}
				putQueryParameter("EngineList." + (depth1 + 1) + ".EngineType" , engineLists.get(depth1).getEngineType());
			}
		}	
	}

	public static class EngineList {

		private List<NodeGroupList> nodeGroupLists;

		private String engineType;

		public List<NodeGroupList> getNodeGroupLists() {
			return this.nodeGroupLists;
		}

		public void setNodeGroupLists(List<NodeGroupList> nodeGroupLists) {
			this.nodeGroupLists = nodeGroupLists;
		}

		public String getEngineType() {
			return this.engineType;
		}

		public void setEngineType(String engineType) {
			this.engineType = engineType;
		}

		public static class NodeGroupList {

			private String resourceGroupName;

			private String nodeSpec;

			private String nodeDiskType;

			private Integer nodeCount;

			private String groupId;

			private Integer nodeDiskSize;

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

			public Integer getNodeCount() {
				return this.nodeCount;
			}

			public void setNodeCount(Integer nodeCount) {
				this.nodeCount = nodeCount;
			}

			public String getGroupId() {
				return this.groupId;
			}

			public void setGroupId(String groupId) {
				this.groupId = groupId;
			}

			public Integer getNodeDiskSize() {
				return this.nodeDiskSize;
			}

			public void setNodeDiskSize(Integer nodeDiskSize) {
				this.nodeDiskSize = nodeDiskSize;
			}
		}
	}

	@Override
	public Class<UpdateLindormV2InstanceResponse> getResponseClass() {
		return UpdateLindormV2InstanceResponse.class;
	}

}
