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
public class CreateLindormV2InstanceRequest extends RpcAcsRequest<CreateLindormV2InstanceResponse> {
	   

	private String archVersion;

	private Long resourceOwnerId;

	private Integer cloudStorageSize;

	private String clusterPattern;

	private String autoRenewDuration;

	private String resourceGroupId;

	private Boolean autoRenewal;

	private String securityToken;

	private String primaryVSwitchId;

	private String clusterMode;

	private Integer capacityStorageSize;

	private Boolean enableCapacityStorage;

	private Long ownerId;

	private String vSwitchId;

	private String zoneId;

	private String arbiterZoneId;

	private String pricingCycle;

	private List<EngineList> engineLists;

	private String cloudStorageType;

	private String primaryZoneId;

	private Integer duration;

	private String standbyVSwitchId;

	private String standbyZoneId;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String instanceAlias;

	private String vPCId;

	private String payType;

	private String arbiterVSwitchId;
	public CreateLindormV2InstanceRequest() {
		super("hitsdb", "2020-06-15", "CreateLindormV2Instance", "hitsdb");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getArchVersion() {
		return this.archVersion;
	}

	public void setArchVersion(String archVersion) {
		this.archVersion = archVersion;
		if(archVersion != null){
			putQueryParameter("ArchVersion", archVersion);
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

	public Integer getCloudStorageSize() {
		return this.cloudStorageSize;
	}

	public void setCloudStorageSize(Integer cloudStorageSize) {
		this.cloudStorageSize = cloudStorageSize;
		if(cloudStorageSize != null){
			putQueryParameter("CloudStorageSize", cloudStorageSize.toString());
		}
	}

	public String getClusterPattern() {
		return this.clusterPattern;
	}

	public void setClusterPattern(String clusterPattern) {
		this.clusterPattern = clusterPattern;
		if(clusterPattern != null){
			putQueryParameter("ClusterPattern", clusterPattern);
		}
	}

	public String getAutoRenewDuration() {
		return this.autoRenewDuration;
	}

	public void setAutoRenewDuration(String autoRenewDuration) {
		this.autoRenewDuration = autoRenewDuration;
		if(autoRenewDuration != null){
			putQueryParameter("AutoRenewDuration", autoRenewDuration);
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

	public Boolean getAutoRenewal() {
		return this.autoRenewal;
	}

	public void setAutoRenewal(Boolean autoRenewal) {
		this.autoRenewal = autoRenewal;
		if(autoRenewal != null){
			putQueryParameter("AutoRenewal", autoRenewal.toString());
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

	public String getPrimaryVSwitchId() {
		return this.primaryVSwitchId;
	}

	public void setPrimaryVSwitchId(String primaryVSwitchId) {
		this.primaryVSwitchId = primaryVSwitchId;
		if(primaryVSwitchId != null){
			putQueryParameter("PrimaryVSwitchId", primaryVSwitchId);
		}
	}

	public String getClusterMode() {
		return this.clusterMode;
	}

	public void setClusterMode(String clusterMode) {
		this.clusterMode = clusterMode;
		if(clusterMode != null){
			putQueryParameter("ClusterMode", clusterMode);
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

	public Boolean getEnableCapacityStorage() {
		return this.enableCapacityStorage;
	}

	public void setEnableCapacityStorage(Boolean enableCapacityStorage) {
		this.enableCapacityStorage = enableCapacityStorage;
		if(enableCapacityStorage != null){
			putQueryParameter("EnableCapacityStorage", enableCapacityStorage.toString());
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

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
		if(zoneId != null){
			putQueryParameter("ZoneId", zoneId);
		}
	}

	public String getArbiterZoneId() {
		return this.arbiterZoneId;
	}

	public void setArbiterZoneId(String arbiterZoneId) {
		this.arbiterZoneId = arbiterZoneId;
		if(arbiterZoneId != null){
			putQueryParameter("ArbiterZoneId", arbiterZoneId);
		}
	}

	public String getPricingCycle() {
		return this.pricingCycle;
	}

	public void setPricingCycle(String pricingCycle) {
		this.pricingCycle = pricingCycle;
		if(pricingCycle != null){
			putQueryParameter("PricingCycle", pricingCycle);
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
						putQueryParameter("EngineList." + (depth1 + 1) + ".NodeGroupList." + (depth2 + 1) + ".NodeDiskSize" , engineLists.get(depth1).getNodeGroupLists().get(depth2).getNodeDiskSize());
					}
				}
				putQueryParameter("EngineList." + (depth1 + 1) + ".EngineType" , engineLists.get(depth1).getEngineType());
			}
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

	public String getPrimaryZoneId() {
		return this.primaryZoneId;
	}

	public void setPrimaryZoneId(String primaryZoneId) {
		this.primaryZoneId = primaryZoneId;
		if(primaryZoneId != null){
			putQueryParameter("PrimaryZoneId", primaryZoneId);
		}
	}

	public Integer getDuration() {
		return this.duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
		if(duration != null){
			putQueryParameter("Duration", duration.toString());
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

	public String getStandbyZoneId() {
		return this.standbyZoneId;
	}

	public void setStandbyZoneId(String standbyZoneId) {
		this.standbyZoneId = standbyZoneId;
		if(standbyZoneId != null){
			putQueryParameter("StandbyZoneId", standbyZoneId);
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

	public String getInstanceAlias() {
		return this.instanceAlias;
	}

	public void setInstanceAlias(String instanceAlias) {
		this.instanceAlias = instanceAlias;
		if(instanceAlias != null){
			putQueryParameter("InstanceAlias", instanceAlias);
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

	public String getPayType() {
		return this.payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
		if(payType != null){
			putQueryParameter("PayType", payType);
		}
	}

	public String getArbiterVSwitchId() {
		return this.arbiterVSwitchId;
	}

	public void setArbiterVSwitchId(String arbiterVSwitchId) {
		this.arbiterVSwitchId = arbiterVSwitchId;
		if(arbiterVSwitchId != null){
			putQueryParameter("ArbiterVSwitchId", arbiterVSwitchId);
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

			public Integer getNodeDiskSize() {
				return this.nodeDiskSize;
			}

			public void setNodeDiskSize(Integer nodeDiskSize) {
				this.nodeDiskSize = nodeDiskSize;
			}
		}
	}

	@Override
	public Class<CreateLindormV2InstanceResponse> getResponseClass() {
		return CreateLindormV2InstanceResponse.class;
	}

}
