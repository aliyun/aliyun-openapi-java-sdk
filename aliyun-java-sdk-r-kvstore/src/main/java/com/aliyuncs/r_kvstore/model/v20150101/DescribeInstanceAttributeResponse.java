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
import com.aliyuncs.r_kvstore.transform.v20150101.DescribeInstanceAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstanceAttributeResponse extends AcsResponse {

	private String requestId;

	private List<DBInstanceAttribute> instances;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DBInstanceAttribute> getInstances() {
		return this.instances;
	}

	public void setInstances(List<DBInstanceAttribute> instances) {
		this.instances = instances;
	}

	public static class DBInstanceAttribute {

		private String vpcId;

		private String privateIp;

		private Long capacity;

		private String createTime;

		private String connectionDomain;

		private Boolean isRds;

		private String chargeType;

		private String storageType;

		private String vpcAuthMode;

		private String architectureType;

		private String availabilityValue;

		private String networkType;

		private Long port;

		private String secondaryZoneId;

		private String packageType;

		private String engineVersion;

		private String config;

		private String vpcCloudInstanceId;

		private Long bandwidth;

		private String instanceName;

		private String securityIPList;

		private Integer shardCount;

		private Integer readOnlyCount;

		private String globalInstanceId;

		private Long qPS;

		private String auditLogRetention;

		private String zoneType;

		private String maintainStartTime;

		private String maintainEndTime;

		private String instanceClass;

		private String realInstanceClass;

		private String instanceId;

		private String instanceType;

		private String hasRenewChangeOrder;

		private Boolean instanceReleaseProtection;

		private String replicationMode;

		private String regionId;

		private String endTime;

		private String vSwitchId;

		private String replicaId;

		private String nodeType;

		private Long connections;

		private String backupLogStartTime;

		private String resourceGroupId;

		private String zoneId;

		private String instanceStatus;

		private String engine;

		private String storage;

		private String cloudType;

		private Boolean isOrderCompleted;

		private Boolean isSupportTDE;

		private List<Tag> tags;

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
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

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getConnectionDomain() {
			return this.connectionDomain;
		}

		public void setConnectionDomain(String connectionDomain) {
			this.connectionDomain = connectionDomain;
		}

		public Boolean getIsRds() {
			return this.isRds;
		}

		public void setIsRds(Boolean isRds) {
			this.isRds = isRds;
		}

		public String getChargeType() {
			return this.chargeType;
		}

		public void setChargeType(String chargeType) {
			this.chargeType = chargeType;
		}

		public String getStorageType() {
			return this.storageType;
		}

		public void setStorageType(String storageType) {
			this.storageType = storageType;
		}

		public String getVpcAuthMode() {
			return this.vpcAuthMode;
		}

		public void setVpcAuthMode(String vpcAuthMode) {
			this.vpcAuthMode = vpcAuthMode;
		}

		public String getArchitectureType() {
			return this.architectureType;
		}

		public void setArchitectureType(String architectureType) {
			this.architectureType = architectureType;
		}

		public String getAvailabilityValue() {
			return this.availabilityValue;
		}

		public void setAvailabilityValue(String availabilityValue) {
			this.availabilityValue = availabilityValue;
		}

		public String getNetworkType() {
			return this.networkType;
		}

		public void setNetworkType(String networkType) {
			this.networkType = networkType;
		}

		public Long getPort() {
			return this.port;
		}

		public void setPort(Long port) {
			this.port = port;
		}

		public String getSecondaryZoneId() {
			return this.secondaryZoneId;
		}

		public void setSecondaryZoneId(String secondaryZoneId) {
			this.secondaryZoneId = secondaryZoneId;
		}

		public String getPackageType() {
			return this.packageType;
		}

		public void setPackageType(String packageType) {
			this.packageType = packageType;
		}

		public String getEngineVersion() {
			return this.engineVersion;
		}

		public void setEngineVersion(String engineVersion) {
			this.engineVersion = engineVersion;
		}

		public String getConfig() {
			return this.config;
		}

		public void setConfig(String config) {
			this.config = config;
		}

		public String getVpcCloudInstanceId() {
			return this.vpcCloudInstanceId;
		}

		public void setVpcCloudInstanceId(String vpcCloudInstanceId) {
			this.vpcCloudInstanceId = vpcCloudInstanceId;
		}

		public Long getBandwidth() {
			return this.bandwidth;
		}

		public void setBandwidth(Long bandwidth) {
			this.bandwidth = bandwidth;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getSecurityIPList() {
			return this.securityIPList;
		}

		public void setSecurityIPList(String securityIPList) {
			this.securityIPList = securityIPList;
		}

		public Integer getShardCount() {
			return this.shardCount;
		}

		public void setShardCount(Integer shardCount) {
			this.shardCount = shardCount;
		}

		public Integer getReadOnlyCount() {
			return this.readOnlyCount;
		}

		public void setReadOnlyCount(Integer readOnlyCount) {
			this.readOnlyCount = readOnlyCount;
		}

		public String getGlobalInstanceId() {
			return this.globalInstanceId;
		}

		public void setGlobalInstanceId(String globalInstanceId) {
			this.globalInstanceId = globalInstanceId;
		}

		public Long getQPS() {
			return this.qPS;
		}

		public void setQPS(Long qPS) {
			this.qPS = qPS;
		}

		public String getAuditLogRetention() {
			return this.auditLogRetention;
		}

		public void setAuditLogRetention(String auditLogRetention) {
			this.auditLogRetention = auditLogRetention;
		}

		public String getZoneType() {
			return this.zoneType;
		}

		public void setZoneType(String zoneType) {
			this.zoneType = zoneType;
		}

		public String getMaintainStartTime() {
			return this.maintainStartTime;
		}

		public void setMaintainStartTime(String maintainStartTime) {
			this.maintainStartTime = maintainStartTime;
		}

		public String getMaintainEndTime() {
			return this.maintainEndTime;
		}

		public void setMaintainEndTime(String maintainEndTime) {
			this.maintainEndTime = maintainEndTime;
		}

		public String getInstanceClass() {
			return this.instanceClass;
		}

		public void setInstanceClass(String instanceClass) {
			this.instanceClass = instanceClass;
		}

		public String getRealInstanceClass() {
			return this.realInstanceClass;
		}

		public void setRealInstanceClass(String realInstanceClass) {
			this.realInstanceClass = realInstanceClass;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getHasRenewChangeOrder() {
			return this.hasRenewChangeOrder;
		}

		public void setHasRenewChangeOrder(String hasRenewChangeOrder) {
			this.hasRenewChangeOrder = hasRenewChangeOrder;
		}

		public Boolean getInstanceReleaseProtection() {
			return this.instanceReleaseProtection;
		}

		public void setInstanceReleaseProtection(Boolean instanceReleaseProtection) {
			this.instanceReleaseProtection = instanceReleaseProtection;
		}

		public String getReplicationMode() {
			return this.replicationMode;
		}

		public void setReplicationMode(String replicationMode) {
			this.replicationMode = replicationMode;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getReplicaId() {
			return this.replicaId;
		}

		public void setReplicaId(String replicaId) {
			this.replicaId = replicaId;
		}

		public String getNodeType() {
			return this.nodeType;
		}

		public void setNodeType(String nodeType) {
			this.nodeType = nodeType;
		}

		public Long getConnections() {
			return this.connections;
		}

		public void setConnections(Long connections) {
			this.connections = connections;
		}

		public String getBackupLogStartTime() {
			return this.backupLogStartTime;
		}

		public void setBackupLogStartTime(String backupLogStartTime) {
			this.backupLogStartTime = backupLogStartTime;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getInstanceStatus() {
			return this.instanceStatus;
		}

		public void setInstanceStatus(String instanceStatus) {
			this.instanceStatus = instanceStatus;
		}

		public String getEngine() {
			return this.engine;
		}

		public void setEngine(String engine) {
			this.engine = engine;
		}

		public String getStorage() {
			return this.storage;
		}

		public void setStorage(String storage) {
			this.storage = storage;
		}

		public String getCloudType() {
			return this.cloudType;
		}

		public void setCloudType(String cloudType) {
			this.cloudType = cloudType;
		}

		public Boolean getIsOrderCompleted() {
			return this.isOrderCompleted;
		}

		public void setIsOrderCompleted(Boolean isOrderCompleted) {
			this.isOrderCompleted = isOrderCompleted;
		}

		public Boolean getIsSupportTDE() {
			return this.isSupportTDE;
		}

		public void setIsSupportTDE(Boolean isSupportTDE) {
			this.isSupportTDE = isSupportTDE;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public static class Tag {

			private String key;

			private String value;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}
	}

	@Override
	public DescribeInstanceAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstanceAttributeResponseUnmarshaller.unmarshall(this, context);
	}
}
