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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.r_kvstore.transform.v20150101.DescribeInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstancesResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private List<KVStoreInstance> instances;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<KVStoreInstance> getInstances() {
		return this.instances;
	}

	public void setInstances(List<KVStoreInstance> instances) {
		this.instances = instances;
	}

	public static class KVStoreInstance {

		private Long connections;

		private String endTime;

		private String resourceGroupId;

		private String editionType;

		private String config;

		private Long port;

		private String destroyTime;

		private String globalInstanceId;

		private Boolean hasRenewChangeOrder;

		private Integer shardCount;

		private String connectionDomain;

		private Integer slaveReplicaCount;

		private String privateIp;

		private Long capacity;

		private Long qPS;

		private String networkType;

		private String instanceStatus;

		private String packageType;

		private Long bandwidth;

		private String instanceType;

		private String replacateId;

		private String architectureType;

		private String engineVersion;

		private String userName;

		private String zoneId;

		private String cloudType;

		private String instanceId;

		private String shardClass;

		private String createTime;

		private String vSwitchId;

		private Integer replicaCount;

		private String readOnlyCount;

		private String instanceClass;

		private Boolean isRds;

		private String secondaryZoneId;

		private String instanceName;

		private Integer slaveReadOnlyCount;

		private String vpcId;

		private String chargeType;

		private String computingType;

		private String nodeType;

		private String connectionMode;

		private Integer proxyCount;

		private String vpcCloudInstanceId;

		private String regionId;

		private List<Tag> tags;

		public Long getConnections() {
			return this.connections;
		}

		public void setConnections(Long connections) {
			this.connections = connections;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getEditionType() {
			return this.editionType;
		}

		public void setEditionType(String editionType) {
			this.editionType = editionType;
		}

		public String getConfig() {
			return this.config;
		}

		public void setConfig(String config) {
			this.config = config;
		}

		public Long getPort() {
			return this.port;
		}

		public void setPort(Long port) {
			this.port = port;
		}

		public String getDestroyTime() {
			return this.destroyTime;
		}

		public void setDestroyTime(String destroyTime) {
			this.destroyTime = destroyTime;
		}

		public String getGlobalInstanceId() {
			return this.globalInstanceId;
		}

		public void setGlobalInstanceId(String globalInstanceId) {
			this.globalInstanceId = globalInstanceId;
		}

		public Boolean getHasRenewChangeOrder() {
			return this.hasRenewChangeOrder;
		}

		public void setHasRenewChangeOrder(Boolean hasRenewChangeOrder) {
			this.hasRenewChangeOrder = hasRenewChangeOrder;
		}

		public Integer getShardCount() {
			return this.shardCount;
		}

		public void setShardCount(Integer shardCount) {
			this.shardCount = shardCount;
		}

		public String getConnectionDomain() {
			return this.connectionDomain;
		}

		public void setConnectionDomain(String connectionDomain) {
			this.connectionDomain = connectionDomain;
		}

		public Integer getSlaveReplicaCount() {
			return this.slaveReplicaCount;
		}

		public void setSlaveReplicaCount(Integer slaveReplicaCount) {
			this.slaveReplicaCount = slaveReplicaCount;
		}

		public String getPrivateIp() {
			return this.privateIp;
		}

		public void setPrivateIp(String privateIp) {
			this.privateIp = privateIp;
		}

		public Long getCapacity() {
			return this.capacity;
		}

		public void setCapacity(Long capacity) {
			this.capacity = capacity;
		}

		public Long getQPS() {
			return this.qPS;
		}

		public void setQPS(Long qPS) {
			this.qPS = qPS;
		}

		public String getNetworkType() {
			return this.networkType;
		}

		public void setNetworkType(String networkType) {
			this.networkType = networkType;
		}

		public String getInstanceStatus() {
			return this.instanceStatus;
		}

		public void setInstanceStatus(String instanceStatus) {
			this.instanceStatus = instanceStatus;
		}

		public String getPackageType() {
			return this.packageType;
		}

		public void setPackageType(String packageType) {
			this.packageType = packageType;
		}

		public Long getBandwidth() {
			return this.bandwidth;
		}

		public void setBandwidth(Long bandwidth) {
			this.bandwidth = bandwidth;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getReplacateId() {
			return this.replacateId;
		}

		public void setReplacateId(String replacateId) {
			this.replacateId = replacateId;
		}

		public String getArchitectureType() {
			return this.architectureType;
		}

		public void setArchitectureType(String architectureType) {
			this.architectureType = architectureType;
		}

		public String getEngineVersion() {
			return this.engineVersion;
		}

		public void setEngineVersion(String engineVersion) {
			this.engineVersion = engineVersion;
		}

		public String getUserName() {
			return this.userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getCloudType() {
			return this.cloudType;
		}

		public void setCloudType(String cloudType) {
			this.cloudType = cloudType;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getShardClass() {
			return this.shardClass;
		}

		public void setShardClass(String shardClass) {
			this.shardClass = shardClass;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public Integer getReplicaCount() {
			return this.replicaCount;
		}

		public void setReplicaCount(Integer replicaCount) {
			this.replicaCount = replicaCount;
		}

		public String getReadOnlyCount() {
			return this.readOnlyCount;
		}

		public void setReadOnlyCount(String readOnlyCount) {
			this.readOnlyCount = readOnlyCount;
		}

		public String getInstanceClass() {
			return this.instanceClass;
		}

		public void setInstanceClass(String instanceClass) {
			this.instanceClass = instanceClass;
		}

		public Boolean getIsRds() {
			return this.isRds;
		}

		public void setIsRds(Boolean isRds) {
			this.isRds = isRds;
		}

		public String getSecondaryZoneId() {
			return this.secondaryZoneId;
		}

		public void setSecondaryZoneId(String secondaryZoneId) {
			this.secondaryZoneId = secondaryZoneId;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public Integer getSlaveReadOnlyCount() {
			return this.slaveReadOnlyCount;
		}

		public void setSlaveReadOnlyCount(Integer slaveReadOnlyCount) {
			this.slaveReadOnlyCount = slaveReadOnlyCount;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getChargeType() {
			return this.chargeType;
		}

		public void setChargeType(String chargeType) {
			this.chargeType = chargeType;
		}

		public String getComputingType() {
			return this.computingType;
		}

		public void setComputingType(String computingType) {
			this.computingType = computingType;
		}

		public String getNodeType() {
			return this.nodeType;
		}

		public void setNodeType(String nodeType) {
			this.nodeType = nodeType;
		}

		public String getConnectionMode() {
			return this.connectionMode;
		}

		public void setConnectionMode(String connectionMode) {
			this.connectionMode = connectionMode;
		}

		public Integer getProxyCount() {
			return this.proxyCount;
		}

		public void setProxyCount(Integer proxyCount) {
			this.proxyCount = proxyCount;
		}

		public String getVpcCloudInstanceId() {
			return this.vpcCloudInstanceId;
		}

		public void setVpcCloudInstanceId(String vpcCloudInstanceId) {
			this.vpcCloudInstanceId = vpcCloudInstanceId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
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
	}

	@Override
	public DescribeInstancesResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstancesResponseUnmarshaller.unmarshall(this, context);
	}
}
