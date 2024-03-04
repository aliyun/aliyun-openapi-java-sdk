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

package com.aliyuncs.alikafka.model.v20190916;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.alikafka.transform.v20190916.GetInstanceListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetInstanceListResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private Boolean success;

	private List<InstanceVO> instanceList;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<InstanceVO> getInstanceList() {
		return this.instanceList;
	}

	public void setInstanceList(List<InstanceVO> instanceList) {
		this.instanceList = instanceList;
	}

	public static class InstanceVO {

		private String vpcId;

		private String specType;

		private Integer deployType;

		private Long createTime;

		private Integer diskSize;

		private Integer diskType;

		private String securityGroup;

		private String sslEndPoint;

		private String instanceId;

		private String allConfig;

		private Integer serviceStatus;

		private Integer eipMax;

		private String regionId;

		private Integer msgRetain;

		private String vSwitchId;

		private Long expiredTime;

		private Integer topicNumLimit;

		private String zoneId;

		private Integer ioMax;

		private Integer paidType;

		private String name;

		private String endPoint;

		private String domainEndpoint;

		private String sslDomainEndpoint;

		private String saslDomainEndpoint;

		private String resourceGroupId;

		private Integer usedTopicCount;

		private Integer usedGroupCount;

		private Integer usedPartitionCount;

		private String kmsKeyId;

		private String standardZoneId;

		private String ioMaxSpec;

		private List<TagVO> tags;

		private UpgradeServiceDetailInfo upgradeServiceDetailInfo;

		private ConfluentConfig confluentConfig;

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getSpecType() {
			return this.specType;
		}

		public void setSpecType(String specType) {
			this.specType = specType;
		}

		public Integer getDeployType() {
			return this.deployType;
		}

		public void setDeployType(Integer deployType) {
			this.deployType = deployType;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Integer getDiskSize() {
			return this.diskSize;
		}

		public void setDiskSize(Integer diskSize) {
			this.diskSize = diskSize;
		}

		public Integer getDiskType() {
			return this.diskType;
		}

		public void setDiskType(Integer diskType) {
			this.diskType = diskType;
		}

		public String getSecurityGroup() {
			return this.securityGroup;
		}

		public void setSecurityGroup(String securityGroup) {
			this.securityGroup = securityGroup;
		}

		public String getSslEndPoint() {
			return this.sslEndPoint;
		}

		public void setSslEndPoint(String sslEndPoint) {
			this.sslEndPoint = sslEndPoint;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getAllConfig() {
			return this.allConfig;
		}

		public void setAllConfig(String allConfig) {
			this.allConfig = allConfig;
		}

		public Integer getServiceStatus() {
			return this.serviceStatus;
		}

		public void setServiceStatus(Integer serviceStatus) {
			this.serviceStatus = serviceStatus;
		}

		public Integer getEipMax() {
			return this.eipMax;
		}

		public void setEipMax(Integer eipMax) {
			this.eipMax = eipMax;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public Integer getMsgRetain() {
			return this.msgRetain;
		}

		public void setMsgRetain(Integer msgRetain) {
			this.msgRetain = msgRetain;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public Long getExpiredTime() {
			return this.expiredTime;
		}

		public void setExpiredTime(Long expiredTime) {
			this.expiredTime = expiredTime;
		}

		public Integer getTopicNumLimit() {
			return this.topicNumLimit;
		}

		public void setTopicNumLimit(Integer topicNumLimit) {
			this.topicNumLimit = topicNumLimit;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public Integer getIoMax() {
			return this.ioMax;
		}

		public void setIoMax(Integer ioMax) {
			this.ioMax = ioMax;
		}

		public Integer getPaidType() {
			return this.paidType;
		}

		public void setPaidType(Integer paidType) {
			this.paidType = paidType;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEndPoint() {
			return this.endPoint;
		}

		public void setEndPoint(String endPoint) {
			this.endPoint = endPoint;
		}

		public String getDomainEndpoint() {
			return this.domainEndpoint;
		}

		public void setDomainEndpoint(String domainEndpoint) {
			this.domainEndpoint = domainEndpoint;
		}

		public String getSslDomainEndpoint() {
			return this.sslDomainEndpoint;
		}

		public void setSslDomainEndpoint(String sslDomainEndpoint) {
			this.sslDomainEndpoint = sslDomainEndpoint;
		}

		public String getSaslDomainEndpoint() {
			return this.saslDomainEndpoint;
		}

		public void setSaslDomainEndpoint(String saslDomainEndpoint) {
			this.saslDomainEndpoint = saslDomainEndpoint;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public Integer getUsedTopicCount() {
			return this.usedTopicCount;
		}

		public void setUsedTopicCount(Integer usedTopicCount) {
			this.usedTopicCount = usedTopicCount;
		}

		public Integer getUsedGroupCount() {
			return this.usedGroupCount;
		}

		public void setUsedGroupCount(Integer usedGroupCount) {
			this.usedGroupCount = usedGroupCount;
		}

		public Integer getUsedPartitionCount() {
			return this.usedPartitionCount;
		}

		public void setUsedPartitionCount(Integer usedPartitionCount) {
			this.usedPartitionCount = usedPartitionCount;
		}

		public String getKmsKeyId() {
			return this.kmsKeyId;
		}

		public void setKmsKeyId(String kmsKeyId) {
			this.kmsKeyId = kmsKeyId;
		}

		public String getStandardZoneId() {
			return this.standardZoneId;
		}

		public void setStandardZoneId(String standardZoneId) {
			this.standardZoneId = standardZoneId;
		}

		public String getIoMaxSpec() {
			return this.ioMaxSpec;
		}

		public void setIoMaxSpec(String ioMaxSpec) {
			this.ioMaxSpec = ioMaxSpec;
		}

		public List<TagVO> getTags() {
			return this.tags;
		}

		public void setTags(List<TagVO> tags) {
			this.tags = tags;
		}

		public UpgradeServiceDetailInfo getUpgradeServiceDetailInfo() {
			return this.upgradeServiceDetailInfo;
		}

		public void setUpgradeServiceDetailInfo(UpgradeServiceDetailInfo upgradeServiceDetailInfo) {
			this.upgradeServiceDetailInfo = upgradeServiceDetailInfo;
		}

		public ConfluentConfig getConfluentConfig() {
			return this.confluentConfig;
		}

		public void setConfluentConfig(ConfluentConfig confluentConfig) {
			this.confluentConfig = confluentConfig;
		}

		public static class TagVO {

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

		public static class UpgradeServiceDetailInfo {

			private String current2OpenSourceVersion;

			public String getCurrent2OpenSourceVersion() {
				return this.current2OpenSourceVersion;
			}

			public void setCurrent2OpenSourceVersion(String current2OpenSourceVersion) {
				this.current2OpenSourceVersion = current2OpenSourceVersion;
			}
		}

		public static class ConfluentConfig {

			private Integer kafkaCU;

			private Integer kafkaStorage;

			private Integer kafkaReplica;

			private Integer zooKeeperCU;

			private Integer zooKeeperStorage;

			private Integer zooKeeperReplica;

			private Integer controlCenterCU;

			private Integer controlCenterStorage;

			private Integer controlCenterReplica;

			private Integer schemaRegistryCU;

			private Integer schemaRegistryReplica;

			private Integer connectCU;

			private Integer connectReplica;

			private Integer ksqlCU;

			private Integer ksqlStorage;

			private Integer ksqlReplica;

			private Integer kafkaRestProxyCU;

			private Integer kafkaRestProxyReplica;

			public Integer getKafkaCU() {
				return this.kafkaCU;
			}

			public void setKafkaCU(Integer kafkaCU) {
				this.kafkaCU = kafkaCU;
			}

			public Integer getKafkaStorage() {
				return this.kafkaStorage;
			}

			public void setKafkaStorage(Integer kafkaStorage) {
				this.kafkaStorage = kafkaStorage;
			}

			public Integer getKafkaReplica() {
				return this.kafkaReplica;
			}

			public void setKafkaReplica(Integer kafkaReplica) {
				this.kafkaReplica = kafkaReplica;
			}

			public Integer getZooKeeperCU() {
				return this.zooKeeperCU;
			}

			public void setZooKeeperCU(Integer zooKeeperCU) {
				this.zooKeeperCU = zooKeeperCU;
			}

			public Integer getZooKeeperStorage() {
				return this.zooKeeperStorage;
			}

			public void setZooKeeperStorage(Integer zooKeeperStorage) {
				this.zooKeeperStorage = zooKeeperStorage;
			}

			public Integer getZooKeeperReplica() {
				return this.zooKeeperReplica;
			}

			public void setZooKeeperReplica(Integer zooKeeperReplica) {
				this.zooKeeperReplica = zooKeeperReplica;
			}

			public Integer getControlCenterCU() {
				return this.controlCenterCU;
			}

			public void setControlCenterCU(Integer controlCenterCU) {
				this.controlCenterCU = controlCenterCU;
			}

			public Integer getControlCenterStorage() {
				return this.controlCenterStorage;
			}

			public void setControlCenterStorage(Integer controlCenterStorage) {
				this.controlCenterStorage = controlCenterStorage;
			}

			public Integer getControlCenterReplica() {
				return this.controlCenterReplica;
			}

			public void setControlCenterReplica(Integer controlCenterReplica) {
				this.controlCenterReplica = controlCenterReplica;
			}

			public Integer getSchemaRegistryCU() {
				return this.schemaRegistryCU;
			}

			public void setSchemaRegistryCU(Integer schemaRegistryCU) {
				this.schemaRegistryCU = schemaRegistryCU;
			}

			public Integer getSchemaRegistryReplica() {
				return this.schemaRegistryReplica;
			}

			public void setSchemaRegistryReplica(Integer schemaRegistryReplica) {
				this.schemaRegistryReplica = schemaRegistryReplica;
			}

			public Integer getConnectCU() {
				return this.connectCU;
			}

			public void setConnectCU(Integer connectCU) {
				this.connectCU = connectCU;
			}

			public Integer getConnectReplica() {
				return this.connectReplica;
			}

			public void setConnectReplica(Integer connectReplica) {
				this.connectReplica = connectReplica;
			}

			public Integer getKsqlCU() {
				return this.ksqlCU;
			}

			public void setKsqlCU(Integer ksqlCU) {
				this.ksqlCU = ksqlCU;
			}

			public Integer getKsqlStorage() {
				return this.ksqlStorage;
			}

			public void setKsqlStorage(Integer ksqlStorage) {
				this.ksqlStorage = ksqlStorage;
			}

			public Integer getKsqlReplica() {
				return this.ksqlReplica;
			}

			public void setKsqlReplica(Integer ksqlReplica) {
				this.ksqlReplica = ksqlReplica;
			}

			public Integer getKafkaRestProxyCU() {
				return this.kafkaRestProxyCU;
			}

			public void setKafkaRestProxyCU(Integer kafkaRestProxyCU) {
				this.kafkaRestProxyCU = kafkaRestProxyCU;
			}

			public Integer getKafkaRestProxyReplica() {
				return this.kafkaRestProxyReplica;
			}

			public void setKafkaRestProxyReplica(Integer kafkaRestProxyReplica) {
				this.kafkaRestProxyReplica = kafkaRestProxyReplica;
			}
		}
	}

	@Override
	public GetInstanceListResponse getInstance(UnmarshallerContext context) {
		return	GetInstanceListResponseUnmarshaller.unmarshall(this, context);
	}
}
