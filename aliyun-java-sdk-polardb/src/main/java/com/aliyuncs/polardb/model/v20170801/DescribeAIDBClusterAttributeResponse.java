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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.polardb.transform.v20170801.DescribeAIDBClusterAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAIDBClusterAttributeResponse extends AcsResponse {

	private String requestId;

	private String dBClusterId;

	private String dBClusterStatus;

	private String dBClusterDescription;

	private String regionId;

	private String zoneId;

	private String vPCId;

	private String vSwitchId;

	private String internalIp;

	private String storageType;

	private String lockMode;

	private String creationTime;

	private String payType;

	private String expireTime;

	private Boolean expired;

	private String zoneIds;

	private String runType;

	private String kubeClusterId;

	private String dBVersion;

	private String aiNodeType;

	private String modelName;

	private String maxQPM;

	private String publicIp;

	private String kVCacheInstanceId;

	private String ecsSecurityGroupId;

	private List<DBNode> dBNodes;

	private List<VolumesItem> volumes;

	private List<EndpointListItem> endpointList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDBClusterId() {
		return this.dBClusterId;
	}

	public void setDBClusterId(String dBClusterId) {
		this.dBClusterId = dBClusterId;
	}

	public String getDBClusterStatus() {
		return this.dBClusterStatus;
	}

	public void setDBClusterStatus(String dBClusterStatus) {
		this.dBClusterStatus = dBClusterStatus;
	}

	public String getDBClusterDescription() {
		return this.dBClusterDescription;
	}

	public void setDBClusterDescription(String dBClusterDescription) {
		this.dBClusterDescription = dBClusterDescription;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
	}

	public String getVPCId() {
		return this.vPCId;
	}

	public void setVPCId(String vPCId) {
		this.vPCId = vPCId;
	}

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
	}

	public String getInternalIp() {
		return this.internalIp;
	}

	public void setInternalIp(String internalIp) {
		this.internalIp = internalIp;
	}

	public String getStorageType() {
		return this.storageType;
	}

	public void setStorageType(String storageType) {
		this.storageType = storageType;
	}

	public String getLockMode() {
		return this.lockMode;
	}

	public void setLockMode(String lockMode) {
		this.lockMode = lockMode;
	}

	public String getCreationTime() {
		return this.creationTime;
	}

	public void setCreationTime(String creationTime) {
		this.creationTime = creationTime;
	}

	public String getPayType() {
		return this.payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getExpireTime() {
		return this.expireTime;
	}

	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}

	public Boolean getExpired() {
		return this.expired;
	}

	public void setExpired(Boolean expired) {
		this.expired = expired;
	}

	public String getZoneIds() {
		return this.zoneIds;
	}

	public void setZoneIds(String zoneIds) {
		this.zoneIds = zoneIds;
	}

	public String getRunType() {
		return this.runType;
	}

	public void setRunType(String runType) {
		this.runType = runType;
	}

	public String getKubeClusterId() {
		return this.kubeClusterId;
	}

	public void setKubeClusterId(String kubeClusterId) {
		this.kubeClusterId = kubeClusterId;
	}

	public String getDBVersion() {
		return this.dBVersion;
	}

	public void setDBVersion(String dBVersion) {
		this.dBVersion = dBVersion;
	}

	public String getAiNodeType() {
		return this.aiNodeType;
	}

	public void setAiNodeType(String aiNodeType) {
		this.aiNodeType = aiNodeType;
	}

	public String getModelName() {
		return this.modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getMaxQPM() {
		return this.maxQPM;
	}

	public void setMaxQPM(String maxQPM) {
		this.maxQPM = maxQPM;
	}

	public String getPublicIp() {
		return this.publicIp;
	}

	public void setPublicIp(String publicIp) {
		this.publicIp = publicIp;
	}

	public String getKVCacheInstanceId() {
		return this.kVCacheInstanceId;
	}

	public void setKVCacheInstanceId(String kVCacheInstanceId) {
		this.kVCacheInstanceId = kVCacheInstanceId;
	}

	public String getEcsSecurityGroupId() {
		return this.ecsSecurityGroupId;
	}

	public void setEcsSecurityGroupId(String ecsSecurityGroupId) {
		this.ecsSecurityGroupId = ecsSecurityGroupId;
	}

	public List<DBNode> getDBNodes() {
		return this.dBNodes;
	}

	public void setDBNodes(List<DBNode> dBNodes) {
		this.dBNodes = dBNodes;
	}

	public List<VolumesItem> getVolumes() {
		return this.volumes;
	}

	public void setVolumes(List<VolumesItem> volumes) {
		this.volumes = volumes;
	}

	public List<EndpointListItem> getEndpointList() {
		return this.endpointList;
	}

	public void setEndpointList(List<EndpointListItem> endpointList) {
		this.endpointList = endpointList;
	}

	public static class DBNode {

		private String dBNodeClass;

		private String cpuCores;

		private String memorySize;

		private String gPU;

		private String dBNodeId;

		private String dBNodeDescription;

		private String vSwitchId;

		private String vPCId;

		private String dBNodeStatus;

		private String zoneId;

		private String vNodeId;

		private String linkIP;

		private String publicIp;

		private String creationTime;

		private List<Volumes> childVolumes;

		public String getDBNodeClass() {
			return this.dBNodeClass;
		}

		public void setDBNodeClass(String dBNodeClass) {
			this.dBNodeClass = dBNodeClass;
		}

		public String getCpuCores() {
			return this.cpuCores;
		}

		public void setCpuCores(String cpuCores) {
			this.cpuCores = cpuCores;
		}

		public String getMemorySize() {
			return this.memorySize;
		}

		public void setMemorySize(String memorySize) {
			this.memorySize = memorySize;
		}

		public String getGPU() {
			return this.gPU;
		}

		public void setGPU(String gPU) {
			this.gPU = gPU;
		}

		public String getDBNodeId() {
			return this.dBNodeId;
		}

		public void setDBNodeId(String dBNodeId) {
			this.dBNodeId = dBNodeId;
		}

		public String getDBNodeDescription() {
			return this.dBNodeDescription;
		}

		public void setDBNodeDescription(String dBNodeDescription) {
			this.dBNodeDescription = dBNodeDescription;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getVPCId() {
			return this.vPCId;
		}

		public void setVPCId(String vPCId) {
			this.vPCId = vPCId;
		}

		public String getDBNodeStatus() {
			return this.dBNodeStatus;
		}

		public void setDBNodeStatus(String dBNodeStatus) {
			this.dBNodeStatus = dBNodeStatus;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getVNodeId() {
			return this.vNodeId;
		}

		public void setVNodeId(String vNodeId) {
			this.vNodeId = vNodeId;
		}

		public String getLinkIP() {
			return this.linkIP;
		}

		public void setLinkIP(String linkIP) {
			this.linkIP = linkIP;
		}

		public String getPublicIp() {
			return this.publicIp;
		}

		public void setPublicIp(String publicIp) {
			this.publicIp = publicIp;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public List<Volumes> getChildVolumes() {
			return this.childVolumes;
		}

		public void setChildVolumes(List<Volumes> childVolumes) {
			this.childVolumes = childVolumes;
		}

		public static class Volumes {

			private String storageType;

			private String storageCategory;

			private String sizeGB;

			private String name;

			private String mountPath;

			public String getStorageType() {
				return this.storageType;
			}

			public void setStorageType(String storageType) {
				this.storageType = storageType;
			}

			public String getStorageCategory() {
				return this.storageCategory;
			}

			public void setStorageCategory(String storageCategory) {
				this.storageCategory = storageCategory;
			}

			public String getSizeGB() {
				return this.sizeGB;
			}

			public void setSizeGB(String sizeGB) {
				this.sizeGB = sizeGB;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getMountPath() {
				return this.mountPath;
			}

			public void setMountPath(String mountPath) {
				this.mountPath = mountPath;
			}
		}
	}

	public static class VolumesItem {

		private String storageType;

		private String storageCategory;

		private String name;

		private String sizeGB;

		private String mountPath;

		public String getStorageType() {
			return this.storageType;
		}

		public void setStorageType(String storageType) {
			this.storageType = storageType;
		}

		public String getStorageCategory() {
			return this.storageCategory;
		}

		public void setStorageCategory(String storageCategory) {
			this.storageCategory = storageCategory;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSizeGB() {
			return this.sizeGB;
		}

		public void setSizeGB(String sizeGB) {
			this.sizeGB = sizeGB;
		}

		public String getMountPath() {
			return this.mountPath;
		}

		public void setMountPath(String mountPath) {
			this.mountPath = mountPath;
		}
	}

	public static class EndpointListItem {

		private List<NetInfoItemsItem> netInfoItems;

		public List<NetInfoItemsItem> getNetInfoItems() {
			return this.netInfoItems;
		}

		public void setNetInfoItems(List<NetInfoItemsItem> netInfoItems) {
			this.netInfoItems = netInfoItems;
		}

		public static class NetInfoItemsItem {

			private String netType;

			private String connectionString;

			private String port;

			public String getNetType() {
				return this.netType;
			}

			public void setNetType(String netType) {
				this.netType = netType;
			}

			public String getConnectionString() {
				return this.connectionString;
			}

			public void setConnectionString(String connectionString) {
				this.connectionString = connectionString;
			}

			public String getPort() {
				return this.port;
			}

			public void setPort(String port) {
				this.port = port;
			}
		}
	}

	@Override
	public DescribeAIDBClusterAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeAIDBClusterAttributeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
