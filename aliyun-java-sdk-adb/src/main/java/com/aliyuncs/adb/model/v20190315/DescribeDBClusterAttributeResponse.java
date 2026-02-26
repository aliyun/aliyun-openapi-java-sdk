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

package com.aliyuncs.adb.model.v20190315;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.adb.transform.v20190315.DescribeDBClusterAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBClusterAttributeResponse extends AcsResponse {

	private String requestId;

	private List<DBCluster> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DBCluster> getItems() {
		return this.items;
	}

	public void setItems(List<DBCluster> items) {
		this.items = items;
	}

	public static class DBCluster {

		private String creationTime;

		private Boolean enableSpark;

		private String dtsJobId;

		private Long dBNodeCount;

		private String expired;

		private String maintainTime;

		private String payType;

		private String diskType;

		private String mode;

		private Integer port;

		private String lockMode;

		private String engineVersion;

		private Boolean enableAirflow;

		private String executorCount;

		private String storageResource;

		private String dBClusterId;

		private String connectionString;

		private String rdsInstanceId;

		private String dBClusterType;

		private String commodityCode;

		private String expireTime;

		private Long dBNodeStorage;

		private String dBNodeClass;

		private String lockReason;

		private String vPCId;

		private String computeResource;

		private String regionId;

		private Integer elasticIOResource;

		private String vSwitchId;

		private String dBVersion;

		private String vPCCloudInstanceId;

		private String dBClusterStatus;

		private String resourceGroupId;

		private String dBClusterNetworkType;

		private String dBClusterDescription;

		private Boolean userENIStatus;

		private String zoneId;

		private String category;

		private String engine;

		private String kmsId;

		private String innerIp;

		private String innerPort;

		private String diskPerformanceLevel;

		private String elasticIOResourceSize;

		private Boolean diskEncryption;

		private String productVersion;

		private String secondaryZoneId;

		private String secondaryVSwitchId;

		private String reservedNodeSize;

		private Integer reservedNodeCount;

		private String productForm;

		private List<Tag> tags;

		private TaskInfo taskInfo;

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public Boolean getEnableSpark() {
			return this.enableSpark;
		}

		public void setEnableSpark(Boolean enableSpark) {
			this.enableSpark = enableSpark;
		}

		public String getDtsJobId() {
			return this.dtsJobId;
		}

		public void setDtsJobId(String dtsJobId) {
			this.dtsJobId = dtsJobId;
		}

		public Long getDBNodeCount() {
			return this.dBNodeCount;
		}

		public void setDBNodeCount(Long dBNodeCount) {
			this.dBNodeCount = dBNodeCount;
		}

		public String getExpired() {
			return this.expired;
		}

		public void setExpired(String expired) {
			this.expired = expired;
		}

		public String getMaintainTime() {
			return this.maintainTime;
		}

		public void setMaintainTime(String maintainTime) {
			this.maintainTime = maintainTime;
		}

		public String getPayType() {
			return this.payType;
		}

		public void setPayType(String payType) {
			this.payType = payType;
		}

		public String getDiskType() {
			return this.diskType;
		}

		public void setDiskType(String diskType) {
			this.diskType = diskType;
		}

		public String getMode() {
			return this.mode;
		}

		public void setMode(String mode) {
			this.mode = mode;
		}

		public Integer getPort() {
			return this.port;
		}

		public void setPort(Integer port) {
			this.port = port;
		}

		public String getLockMode() {
			return this.lockMode;
		}

		public void setLockMode(String lockMode) {
			this.lockMode = lockMode;
		}

		public String getEngineVersion() {
			return this.engineVersion;
		}

		public void setEngineVersion(String engineVersion) {
			this.engineVersion = engineVersion;
		}

		public Boolean getEnableAirflow() {
			return this.enableAirflow;
		}

		public void setEnableAirflow(Boolean enableAirflow) {
			this.enableAirflow = enableAirflow;
		}

		public String getExecutorCount() {
			return this.executorCount;
		}

		public void setExecutorCount(String executorCount) {
			this.executorCount = executorCount;
		}

		public String getStorageResource() {
			return this.storageResource;
		}

		public void setStorageResource(String storageResource) {
			this.storageResource = storageResource;
		}

		public String getDBClusterId() {
			return this.dBClusterId;
		}

		public void setDBClusterId(String dBClusterId) {
			this.dBClusterId = dBClusterId;
		}

		public String getConnectionString() {
			return this.connectionString;
		}

		public void setConnectionString(String connectionString) {
			this.connectionString = connectionString;
		}

		public String getRdsInstanceId() {
			return this.rdsInstanceId;
		}

		public void setRdsInstanceId(String rdsInstanceId) {
			this.rdsInstanceId = rdsInstanceId;
		}

		public String getDBClusterType() {
			return this.dBClusterType;
		}

		public void setDBClusterType(String dBClusterType) {
			this.dBClusterType = dBClusterType;
		}

		public String getCommodityCode() {
			return this.commodityCode;
		}

		public void setCommodityCode(String commodityCode) {
			this.commodityCode = commodityCode;
		}

		public String getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(String expireTime) {
			this.expireTime = expireTime;
		}

		public Long getDBNodeStorage() {
			return this.dBNodeStorage;
		}

		public void setDBNodeStorage(Long dBNodeStorage) {
			this.dBNodeStorage = dBNodeStorage;
		}

		public String getDBNodeClass() {
			return this.dBNodeClass;
		}

		public void setDBNodeClass(String dBNodeClass) {
			this.dBNodeClass = dBNodeClass;
		}

		public String getLockReason() {
			return this.lockReason;
		}

		public void setLockReason(String lockReason) {
			this.lockReason = lockReason;
		}

		public String getVPCId() {
			return this.vPCId;
		}

		public void setVPCId(String vPCId) {
			this.vPCId = vPCId;
		}

		public String getComputeResource() {
			return this.computeResource;
		}

		public void setComputeResource(String computeResource) {
			this.computeResource = computeResource;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public Integer getElasticIOResource() {
			return this.elasticIOResource;
		}

		public void setElasticIOResource(Integer elasticIOResource) {
			this.elasticIOResource = elasticIOResource;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getDBVersion() {
			return this.dBVersion;
		}

		public void setDBVersion(String dBVersion) {
			this.dBVersion = dBVersion;
		}

		public String getVPCCloudInstanceId() {
			return this.vPCCloudInstanceId;
		}

		public void setVPCCloudInstanceId(String vPCCloudInstanceId) {
			this.vPCCloudInstanceId = vPCCloudInstanceId;
		}

		public String getDBClusterStatus() {
			return this.dBClusterStatus;
		}

		public void setDBClusterStatus(String dBClusterStatus) {
			this.dBClusterStatus = dBClusterStatus;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getDBClusterNetworkType() {
			return this.dBClusterNetworkType;
		}

		public void setDBClusterNetworkType(String dBClusterNetworkType) {
			this.dBClusterNetworkType = dBClusterNetworkType;
		}

		public String getDBClusterDescription() {
			return this.dBClusterDescription;
		}

		public void setDBClusterDescription(String dBClusterDescription) {
			this.dBClusterDescription = dBClusterDescription;
		}

		public Boolean getUserENIStatus() {
			return this.userENIStatus;
		}

		public void setUserENIStatus(Boolean userENIStatus) {
			this.userENIStatus = userENIStatus;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getEngine() {
			return this.engine;
		}

		public void setEngine(String engine) {
			this.engine = engine;
		}

		public String getKmsId() {
			return this.kmsId;
		}

		public void setKmsId(String kmsId) {
			this.kmsId = kmsId;
		}

		public String getInnerIp() {
			return this.innerIp;
		}

		public void setInnerIp(String innerIp) {
			this.innerIp = innerIp;
		}

		public String getInnerPort() {
			return this.innerPort;
		}

		public void setInnerPort(String innerPort) {
			this.innerPort = innerPort;
		}

		public String getDiskPerformanceLevel() {
			return this.diskPerformanceLevel;
		}

		public void setDiskPerformanceLevel(String diskPerformanceLevel) {
			this.diskPerformanceLevel = diskPerformanceLevel;
		}

		public String getElasticIOResourceSize() {
			return this.elasticIOResourceSize;
		}

		public void setElasticIOResourceSize(String elasticIOResourceSize) {
			this.elasticIOResourceSize = elasticIOResourceSize;
		}

		public Boolean getDiskEncryption() {
			return this.diskEncryption;
		}

		public void setDiskEncryption(Boolean diskEncryption) {
			this.diskEncryption = diskEncryption;
		}

		public String getProductVersion() {
			return this.productVersion;
		}

		public void setProductVersion(String productVersion) {
			this.productVersion = productVersion;
		}

		public String getSecondaryZoneId() {
			return this.secondaryZoneId;
		}

		public void setSecondaryZoneId(String secondaryZoneId) {
			this.secondaryZoneId = secondaryZoneId;
		}

		public String getSecondaryVSwitchId() {
			return this.secondaryVSwitchId;
		}

		public void setSecondaryVSwitchId(String secondaryVSwitchId) {
			this.secondaryVSwitchId = secondaryVSwitchId;
		}

		public String getReservedNodeSize() {
			return this.reservedNodeSize;
		}

		public void setReservedNodeSize(String reservedNodeSize) {
			this.reservedNodeSize = reservedNodeSize;
		}

		public Integer getReservedNodeCount() {
			return this.reservedNodeCount;
		}

		public void setReservedNodeCount(Integer reservedNodeCount) {
			this.reservedNodeCount = reservedNodeCount;
		}

		public String getProductForm() {
			return this.productForm;
		}

		public void setProductForm(String productForm) {
			this.productForm = productForm;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public TaskInfo getTaskInfo() {
			return this.taskInfo;
		}

		public void setTaskInfo(TaskInfo taskInfo) {
			this.taskInfo = taskInfo;
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

		public static class TaskInfo {

			private String name;

			private String status;

			private String progress;

			private List<StepListItem> stepList;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getProgress() {
				return this.progress;
			}

			public void setProgress(String progress) {
				this.progress = progress;
			}

			public List<StepListItem> getStepList() {
				return this.stepList;
			}

			public void setStepList(List<StepListItem> stepList) {
				this.stepList = stepList;
			}

			public static class StepListItem {

				private String stepName;

				private String stepDesc;

				private String stepStatus;

				private String stepProgress;

				private String startTime;

				private String endTime;

				public String getStepName() {
					return this.stepName;
				}

				public void setStepName(String stepName) {
					this.stepName = stepName;
				}

				public String getStepDesc() {
					return this.stepDesc;
				}

				public void setStepDesc(String stepDesc) {
					this.stepDesc = stepDesc;
				}

				public String getStepStatus() {
					return this.stepStatus;
				}

				public void setStepStatus(String stepStatus) {
					this.stepStatus = stepStatus;
				}

				public String getStepProgress() {
					return this.stepProgress;
				}

				public void setStepProgress(String stepProgress) {
					this.stepProgress = stepProgress;
				}

				public String getStartTime() {
					return this.startTime;
				}

				public void setStartTime(String startTime) {
					this.startTime = startTime;
				}

				public String getEndTime() {
					return this.endTime;
				}

				public void setEndTime(String endTime) {
					this.endTime = endTime;
				}
			}
		}
	}

	@Override
	public DescribeDBClusterAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBClusterAttributeResponseUnmarshaller.unmarshall(this, context);
	}
}
