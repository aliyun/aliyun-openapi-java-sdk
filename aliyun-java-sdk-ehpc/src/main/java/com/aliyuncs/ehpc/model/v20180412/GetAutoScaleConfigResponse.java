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

package com.aliyuncs.ehpc.model.v20180412;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ehpc.transform.v20180412.GetAutoScaleConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAutoScaleConfigResponse extends AcsResponse {

	private Integer maxNodesInCluster;

	private Integer growTimeoutInMinutes;

	private String spotStrategy;

	private Boolean enableAutoShrink;

	private String requestId;

	private Boolean enableAutoGrow;

	private String clusterType;

	private String excludeNodes;

	private Integer shrinkIntervalInMinutes;

	private Integer growIntervalInMinutes;

	private Float spotPriceLimit;

	private Integer extraNodesGrowRatio;

	private Integer shrinkIdleTimes;

	private String imageId;

	private Integer growRatio;

	private String clusterId;

	private String uid;

	private List<QueueInfo> queues;

	public Integer getMaxNodesInCluster() {
		return this.maxNodesInCluster;
	}

	public void setMaxNodesInCluster(Integer maxNodesInCluster) {
		this.maxNodesInCluster = maxNodesInCluster;
	}

	public Integer getGrowTimeoutInMinutes() {
		return this.growTimeoutInMinutes;
	}

	public void setGrowTimeoutInMinutes(Integer growTimeoutInMinutes) {
		this.growTimeoutInMinutes = growTimeoutInMinutes;
	}

	public String getSpotStrategy() {
		return this.spotStrategy;
	}

	public void setSpotStrategy(String spotStrategy) {
		this.spotStrategy = spotStrategy;
	}

	public Boolean getEnableAutoShrink() {
		return this.enableAutoShrink;
	}

	public void setEnableAutoShrink(Boolean enableAutoShrink) {
		this.enableAutoShrink = enableAutoShrink;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getEnableAutoGrow() {
		return this.enableAutoGrow;
	}

	public void setEnableAutoGrow(Boolean enableAutoGrow) {
		this.enableAutoGrow = enableAutoGrow;
	}

	public String getClusterType() {
		return this.clusterType;
	}

	public void setClusterType(String clusterType) {
		this.clusterType = clusterType;
	}

	public String getExcludeNodes() {
		return this.excludeNodes;
	}

	public void setExcludeNodes(String excludeNodes) {
		this.excludeNodes = excludeNodes;
	}

	public Integer getShrinkIntervalInMinutes() {
		return this.shrinkIntervalInMinutes;
	}

	public void setShrinkIntervalInMinutes(Integer shrinkIntervalInMinutes) {
		this.shrinkIntervalInMinutes = shrinkIntervalInMinutes;
	}

	public Integer getGrowIntervalInMinutes() {
		return this.growIntervalInMinutes;
	}

	public void setGrowIntervalInMinutes(Integer growIntervalInMinutes) {
		this.growIntervalInMinutes = growIntervalInMinutes;
	}

	public Float getSpotPriceLimit() {
		return this.spotPriceLimit;
	}

	public void setSpotPriceLimit(Float spotPriceLimit) {
		this.spotPriceLimit = spotPriceLimit;
	}

	public Integer getExtraNodesGrowRatio() {
		return this.extraNodesGrowRatio;
	}

	public void setExtraNodesGrowRatio(Integer extraNodesGrowRatio) {
		this.extraNodesGrowRatio = extraNodesGrowRatio;
	}

	public Integer getShrinkIdleTimes() {
		return this.shrinkIdleTimes;
	}

	public void setShrinkIdleTimes(Integer shrinkIdleTimes) {
		this.shrinkIdleTimes = shrinkIdleTimes;
	}

	public String getImageId() {
		return this.imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
	}

	public Integer getGrowRatio() {
		return this.growRatio;
	}

	public void setGrowRatio(Integer growRatio) {
		this.growRatio = growRatio;
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
	}

	public String getUid() {
		return this.uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public List<QueueInfo> getQueues() {
		return this.queues;
	}

	public void setQueues(List<QueueInfo> queues) {
		this.queues = queues;
	}

	public static class QueueInfo {

		private String queueImageId;

		private String systemDiskCategory;

		private String instanceType;

		private String hostNameSuffix;

		private String spotStrategy;

		private Integer minNodesInQueue;

		private String hostNamePrefix;

		private Integer systemDiskSize;

		private Integer maxNodesInQueue;

		private Boolean enableAutoShrink;

		private String queueName;

		private Boolean enableAutoGrow;

		private String systemDiskLevel;

		private String resourceGroupId;

		private Float spotPriceLimit;

		private Long maxNodesPerCycle;

		private Long minNodesPerCycle;

		private List<InstanceTypeInfo> instanceTypes;

		private List<DataDisksInfo> dataDisks;

		public String getQueueImageId() {
			return this.queueImageId;
		}

		public void setQueueImageId(String queueImageId) {
			this.queueImageId = queueImageId;
		}

		public String getSystemDiskCategory() {
			return this.systemDiskCategory;
		}

		public void setSystemDiskCategory(String systemDiskCategory) {
			this.systemDiskCategory = systemDiskCategory;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getHostNameSuffix() {
			return this.hostNameSuffix;
		}

		public void setHostNameSuffix(String hostNameSuffix) {
			this.hostNameSuffix = hostNameSuffix;
		}

		public String getSpotStrategy() {
			return this.spotStrategy;
		}

		public void setSpotStrategy(String spotStrategy) {
			this.spotStrategy = spotStrategy;
		}

		public Integer getMinNodesInQueue() {
			return this.minNodesInQueue;
		}

		public void setMinNodesInQueue(Integer minNodesInQueue) {
			this.minNodesInQueue = minNodesInQueue;
		}

		public String getHostNamePrefix() {
			return this.hostNamePrefix;
		}

		public void setHostNamePrefix(String hostNamePrefix) {
			this.hostNamePrefix = hostNamePrefix;
		}

		public Integer getSystemDiskSize() {
			return this.systemDiskSize;
		}

		public void setSystemDiskSize(Integer systemDiskSize) {
			this.systemDiskSize = systemDiskSize;
		}

		public Integer getMaxNodesInQueue() {
			return this.maxNodesInQueue;
		}

		public void setMaxNodesInQueue(Integer maxNodesInQueue) {
			this.maxNodesInQueue = maxNodesInQueue;
		}

		public Boolean getEnableAutoShrink() {
			return this.enableAutoShrink;
		}

		public void setEnableAutoShrink(Boolean enableAutoShrink) {
			this.enableAutoShrink = enableAutoShrink;
		}

		public String getQueueName() {
			return this.queueName;
		}

		public void setQueueName(String queueName) {
			this.queueName = queueName;
		}

		public Boolean getEnableAutoGrow() {
			return this.enableAutoGrow;
		}

		public void setEnableAutoGrow(Boolean enableAutoGrow) {
			this.enableAutoGrow = enableAutoGrow;
		}

		public String getSystemDiskLevel() {
			return this.systemDiskLevel;
		}

		public void setSystemDiskLevel(String systemDiskLevel) {
			this.systemDiskLevel = systemDiskLevel;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public Float getSpotPriceLimit() {
			return this.spotPriceLimit;
		}

		public void setSpotPriceLimit(Float spotPriceLimit) {
			this.spotPriceLimit = spotPriceLimit;
		}

		public Long getMaxNodesPerCycle() {
			return this.maxNodesPerCycle;
		}

		public void setMaxNodesPerCycle(Long maxNodesPerCycle) {
			this.maxNodesPerCycle = maxNodesPerCycle;
		}

		public Long getMinNodesPerCycle() {
			return this.minNodesPerCycle;
		}

		public void setMinNodesPerCycle(Long minNodesPerCycle) {
			this.minNodesPerCycle = minNodesPerCycle;
		}

		public List<InstanceTypeInfo> getInstanceTypes() {
			return this.instanceTypes;
		}

		public void setInstanceTypes(List<InstanceTypeInfo> instanceTypes) {
			this.instanceTypes = instanceTypes;
		}

		public List<DataDisksInfo> getDataDisks() {
			return this.dataDisks;
		}

		public void setDataDisks(List<DataDisksInfo> dataDisks) {
			this.dataDisks = dataDisks;
		}

		public static class InstanceTypeInfo {

			private String hostNamePrefix;

			private String vSwitchId;

			private String zoneId;

			private Float spotPriceLimit;

			private String instanceType;

			private String spotStrategy;

			public String getHostNamePrefix() {
				return this.hostNamePrefix;
			}

			public void setHostNamePrefix(String hostNamePrefix) {
				this.hostNamePrefix = hostNamePrefix;
			}

			public String getVSwitchId() {
				return this.vSwitchId;
			}

			public void setVSwitchId(String vSwitchId) {
				this.vSwitchId = vSwitchId;
			}

			public String getZoneId() {
				return this.zoneId;
			}

			public void setZoneId(String zoneId) {
				this.zoneId = zoneId;
			}

			public Float getSpotPriceLimit() {
				return this.spotPriceLimit;
			}

			public void setSpotPriceLimit(Float spotPriceLimit) {
				this.spotPriceLimit = spotPriceLimit;
			}

			public String getInstanceType() {
				return this.instanceType;
			}

			public void setInstanceType(String instanceType) {
				this.instanceType = instanceType;
			}

			public String getSpotStrategy() {
				return this.spotStrategy;
			}

			public void setSpotStrategy(String spotStrategy) {
				this.spotStrategy = spotStrategy;
			}
		}

		public static class DataDisksInfo {

			private String dataDiskCategory;

			private Integer dataDiskSize;

			private Boolean dataDiskDeleteWithInstance;

			private String dataDiskPerformanceLevel;

			private Boolean dataDiskEncrypted;

			private String dataDiskKMSKeyId;

			public String getDataDiskCategory() {
				return this.dataDiskCategory;
			}

			public void setDataDiskCategory(String dataDiskCategory) {
				this.dataDiskCategory = dataDiskCategory;
			}

			public Integer getDataDiskSize() {
				return this.dataDiskSize;
			}

			public void setDataDiskSize(Integer dataDiskSize) {
				this.dataDiskSize = dataDiskSize;
			}

			public Boolean getDataDiskDeleteWithInstance() {
				return this.dataDiskDeleteWithInstance;
			}

			public void setDataDiskDeleteWithInstance(Boolean dataDiskDeleteWithInstance) {
				this.dataDiskDeleteWithInstance = dataDiskDeleteWithInstance;
			}

			public String getDataDiskPerformanceLevel() {
				return this.dataDiskPerformanceLevel;
			}

			public void setDataDiskPerformanceLevel(String dataDiskPerformanceLevel) {
				this.dataDiskPerformanceLevel = dataDiskPerformanceLevel;
			}

			public Boolean getDataDiskEncrypted() {
				return this.dataDiskEncrypted;
			}

			public void setDataDiskEncrypted(Boolean dataDiskEncrypted) {
				this.dataDiskEncrypted = dataDiskEncrypted;
			}

			public String getDataDiskKMSKeyId() {
				return this.dataDiskKMSKeyId;
			}

			public void setDataDiskKMSKeyId(String dataDiskKMSKeyId) {
				this.dataDiskKMSKeyId = dataDiskKMSKeyId;
			}
		}
	}

	@Override
	public GetAutoScaleConfigResponse getInstance(UnmarshallerContext context) {
		return	GetAutoScaleConfigResponseUnmarshaller.unmarshall(this, context);
	}
}
