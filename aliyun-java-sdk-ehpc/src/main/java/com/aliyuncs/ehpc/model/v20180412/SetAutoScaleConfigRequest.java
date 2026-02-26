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

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ehpc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SetAutoScaleConfigRequest extends RpcAcsRequest<SetAutoScaleConfigResponse> {
	   

	private String imageId;

	private String dnsConfig;

	private Float spotPriceLimit;

	private String excludeNodes;

	private Integer extraNodesGrowRatio;

	private Integer shrinkIdleTimes;

	private Integer growTimeoutInMinutes;

	private String clusterId;

	private Boolean enableAutoGrow;

	private Boolean enableAutoShrink;

	private String spotStrategy;

	private Integer maxNodesInCluster;

	private Boolean computeEnableHt;

	private Integer shrinkIntervalInMinutes;

	private List<Queues> queuess;

	private Integer growIntervalInMinutes;

	private Integer growRatio;
	public SetAutoScaleConfigRequest() {
		super("EHPC", "2018-04-12", "SetAutoScaleConfig", "ehs");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getImageId() {
		return this.imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
		if(imageId != null){
			putQueryParameter("ImageId", imageId);
		}
	}

	public String getDnsConfig() {
		return this.dnsConfig;
	}

	public void setDnsConfig(String dnsConfig) {
		this.dnsConfig = dnsConfig;
		if(dnsConfig != null){
			putQueryParameter("DnsConfig", dnsConfig);
		}
	}

	public Float getSpotPriceLimit() {
		return this.spotPriceLimit;
	}

	public void setSpotPriceLimit(Float spotPriceLimit) {
		this.spotPriceLimit = spotPriceLimit;
		if(spotPriceLimit != null){
			putQueryParameter("SpotPriceLimit", spotPriceLimit.toString());
		}
	}

	public String getExcludeNodes() {
		return this.excludeNodes;
	}

	public void setExcludeNodes(String excludeNodes) {
		this.excludeNodes = excludeNodes;
		if(excludeNodes != null){
			putQueryParameter("ExcludeNodes", excludeNodes);
		}
	}

	public Integer getExtraNodesGrowRatio() {
		return this.extraNodesGrowRatio;
	}

	public void setExtraNodesGrowRatio(Integer extraNodesGrowRatio) {
		this.extraNodesGrowRatio = extraNodesGrowRatio;
		if(extraNodesGrowRatio != null){
			putQueryParameter("ExtraNodesGrowRatio", extraNodesGrowRatio.toString());
		}
	}

	public Integer getShrinkIdleTimes() {
		return this.shrinkIdleTimes;
	}

	public void setShrinkIdleTimes(Integer shrinkIdleTimes) {
		this.shrinkIdleTimes = shrinkIdleTimes;
		if(shrinkIdleTimes != null){
			putQueryParameter("ShrinkIdleTimes", shrinkIdleTimes.toString());
		}
	}

	public Integer getGrowTimeoutInMinutes() {
		return this.growTimeoutInMinutes;
	}

	public void setGrowTimeoutInMinutes(Integer growTimeoutInMinutes) {
		this.growTimeoutInMinutes = growTimeoutInMinutes;
		if(growTimeoutInMinutes != null){
			putQueryParameter("GrowTimeoutInMinutes", growTimeoutInMinutes.toString());
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public Boolean getEnableAutoGrow() {
		return this.enableAutoGrow;
	}

	public void setEnableAutoGrow(Boolean enableAutoGrow) {
		this.enableAutoGrow = enableAutoGrow;
		if(enableAutoGrow != null){
			putQueryParameter("EnableAutoGrow", enableAutoGrow.toString());
		}
	}

	public Boolean getEnableAutoShrink() {
		return this.enableAutoShrink;
	}

	public void setEnableAutoShrink(Boolean enableAutoShrink) {
		this.enableAutoShrink = enableAutoShrink;
		if(enableAutoShrink != null){
			putQueryParameter("EnableAutoShrink", enableAutoShrink.toString());
		}
	}

	public String getSpotStrategy() {
		return this.spotStrategy;
	}

	public void setSpotStrategy(String spotStrategy) {
		this.spotStrategy = spotStrategy;
		if(spotStrategy != null){
			putQueryParameter("SpotStrategy", spotStrategy);
		}
	}

	public Integer getMaxNodesInCluster() {
		return this.maxNodesInCluster;
	}

	public void setMaxNodesInCluster(Integer maxNodesInCluster) {
		this.maxNodesInCluster = maxNodesInCluster;
		if(maxNodesInCluster != null){
			putQueryParameter("MaxNodesInCluster", maxNodesInCluster.toString());
		}
	}

	public Boolean getComputeEnableHt() {
		return this.computeEnableHt;
	}

	public void setComputeEnableHt(Boolean computeEnableHt) {
		this.computeEnableHt = computeEnableHt;
		if(computeEnableHt != null){
			putQueryParameter("ComputeEnableHt", computeEnableHt.toString());
		}
	}

	public Integer getShrinkIntervalInMinutes() {
		return this.shrinkIntervalInMinutes;
	}

	public void setShrinkIntervalInMinutes(Integer shrinkIntervalInMinutes) {
		this.shrinkIntervalInMinutes = shrinkIntervalInMinutes;
		if(shrinkIntervalInMinutes != null){
			putQueryParameter("ShrinkIntervalInMinutes", shrinkIntervalInMinutes.toString());
		}
	}

	public List<Queues> getQueuess() {
		return this.queuess;
	}

	public void setQueuess(List<Queues> queuess) {
		this.queuess = queuess;	
		if (queuess != null) {
			for (int depth1 = 0; depth1 < queuess.size(); depth1++) {
				putQueryParameter("Queues." + (depth1 + 1) + ".QueueName" , queuess.get(depth1).getQueueName());
				putQueryParameter("Queues." + (depth1 + 1) + ".SystemDiskLevel" , queuess.get(depth1).getSystemDiskLevel());
				putQueryParameter("Queues." + (depth1 + 1) + ".SortedByInventory" , queuess.get(depth1).getSortedByInventory());
				if (queuess.get(depth1).getInstanceTypess() != null) {
					for (int depth2 = 0; depth2 < queuess.get(depth1).getInstanceTypess().size(); depth2++) {
						putQueryParameter("Queues." + (depth1 + 1) + ".InstanceTypes." + (depth2 + 1) + ".VSwitchId" , queuess.get(depth1).getInstanceTypess().get(depth2).getVSwitchId());
						putQueryParameter("Queues." + (depth1 + 1) + ".InstanceTypes." + (depth2 + 1) + ".SpotStrategy" , queuess.get(depth1).getInstanceTypess().get(depth2).getSpotStrategy());
						putQueryParameter("Queues." + (depth1 + 1) + ".InstanceTypes." + (depth2 + 1) + ".SpotInterruptionBehavior" , queuess.get(depth1).getInstanceTypess().get(depth2).getSpotInterruptionBehavior());
						putQueryParameter("Queues." + (depth1 + 1) + ".InstanceTypes." + (depth2 + 1) + ".ZoneId" , queuess.get(depth1).getInstanceTypess().get(depth2).getZoneId());
						putQueryParameter("Queues." + (depth1 + 1) + ".InstanceTypes." + (depth2 + 1) + ".InstanceType" , queuess.get(depth1).getInstanceTypess().get(depth2).getInstanceType());
						putQueryParameter("Queues." + (depth1 + 1) + ".InstanceTypes." + (depth2 + 1) + ".SpotPriceLimit" , queuess.get(depth1).getInstanceTypess().get(depth2).getSpotPriceLimit());
						putQueryParameter("Queues." + (depth1 + 1) + ".InstanceTypes." + (depth2 + 1) + ".SpotDuration" , queuess.get(depth1).getInstanceTypess().get(depth2).getSpotDuration());
					}
				}
				putQueryParameter("Queues." + (depth1 + 1) + ".EnableAutoGrow" , queuess.get(depth1).getEnableAutoGrow());
				putQueryParameter("Queues." + (depth1 + 1) + ".HostNameSuffix" , queuess.get(depth1).getHostNameSuffix());
				putQueryParameter("Queues." + (depth1 + 1) + ".SpotPriceLimit" , queuess.get(depth1).getSpotPriceLimit());
				putQueryParameter("Queues." + (depth1 + 1) + ".EnableAutoShrink" , queuess.get(depth1).getEnableAutoShrink());
				putQueryParameter("Queues." + (depth1 + 1) + ".SpotStrategy" , queuess.get(depth1).getSpotStrategy());
				putQueryParameter("Queues." + (depth1 + 1) + ".AutoMinNodesPerCycle" , queuess.get(depth1).getAutoMinNodesPerCycle());
				if (queuess.get(depth1).getDataDiskss() != null) {
					for (int depth2 = 0; depth2 < queuess.get(depth1).getDataDiskss().size(); depth2++) {
						putQueryParameter("Queues." + (depth1 + 1) + ".DataDisks." + (depth2 + 1) + ".DataDiskDeleteWithInstance" , queuess.get(depth1).getDataDiskss().get(depth2).getDataDiskDeleteWithInstance());
						putQueryParameter("Queues." + (depth1 + 1) + ".DataDisks." + (depth2 + 1) + ".DataDiskEncrypted" , queuess.get(depth1).getDataDiskss().get(depth2).getDataDiskEncrypted());
						putQueryParameter("Queues." + (depth1 + 1) + ".DataDisks." + (depth2 + 1) + ".DataDiskKMSKeyId" , queuess.get(depth1).getDataDiskss().get(depth2).getDataDiskKMSKeyId());
						putQueryParameter("Queues." + (depth1 + 1) + ".DataDisks." + (depth2 + 1) + ".DataDiskSize" , queuess.get(depth1).getDataDiskss().get(depth2).getDataDiskSize());
						putQueryParameter("Queues." + (depth1 + 1) + ".DataDisks." + (depth2 + 1) + ".DataDiskCategory" , queuess.get(depth1).getDataDiskss().get(depth2).getDataDiskCategory());
						putQueryParameter("Queues." + (depth1 + 1) + ".DataDisks." + (depth2 + 1) + ".DataDiskPerformanceLevel" , queuess.get(depth1).getDataDiskss().get(depth2).getDataDiskPerformanceLevel());
					}
				}
				putQueryParameter("Queues." + (depth1 + 1) + ".MinNodesInQueue" , queuess.get(depth1).getMinNodesInQueue());
				putQueryParameter("Queues." + (depth1 + 1) + ".MaxNodesPerCycle" , queuess.get(depth1).getMaxNodesPerCycle());
				putQueryParameter("Queues." + (depth1 + 1) + ".SystemDiskCategory" , queuess.get(depth1).getSystemDiskCategory());
				putQueryParameter("Queues." + (depth1 + 1) + ".MaxNodesInQueue" , queuess.get(depth1).getMaxNodesInQueue());
				putQueryParameter("Queues." + (depth1 + 1) + ".SystemDiskSize" , queuess.get(depth1).getSystemDiskSize());
				putQueryParameter("Queues." + (depth1 + 1) + ".QueueImageId" , queuess.get(depth1).getQueueImageId());
				putQueryParameter("Queues." + (depth1 + 1) + ".InstanceType" , queuess.get(depth1).getInstanceType());
				putQueryParameter("Queues." + (depth1 + 1) + ".HostNamePrefix" , queuess.get(depth1).getHostNamePrefix());
				putQueryParameter("Queues." + (depth1 + 1) + ".MinNodesPerCycle" , queuess.get(depth1).getMinNodesPerCycle());
			}
		}	
	}

	public Integer getGrowIntervalInMinutes() {
		return this.growIntervalInMinutes;
	}

	public void setGrowIntervalInMinutes(Integer growIntervalInMinutes) {
		this.growIntervalInMinutes = growIntervalInMinutes;
		if(growIntervalInMinutes != null){
			putQueryParameter("GrowIntervalInMinutes", growIntervalInMinutes.toString());
		}
	}

	public Integer getGrowRatio() {
		return this.growRatio;
	}

	public void setGrowRatio(Integer growRatio) {
		this.growRatio = growRatio;
		if(growRatio != null){
			putQueryParameter("GrowRatio", growRatio.toString());
		}
	}

	public static class Queues {

		private String queueName;

		private String systemDiskLevel;

		private Boolean sortedByInventory;

		private List<InstanceTypes> instanceTypess;

		private Boolean enableAutoGrow;

		private String hostNameSuffix;

		private Float spotPriceLimit;

		private Boolean enableAutoShrink;

		private String spotStrategy;

		private Boolean autoMinNodesPerCycle;

		private List<DataDisks> dataDiskss;

		private Integer minNodesInQueue;

		private Long maxNodesPerCycle;

		private String systemDiskCategory;

		private Integer maxNodesInQueue;

		private Integer systemDiskSize;

		private String queueImageId;

		private String instanceType;

		private String hostNamePrefix;

		private Long minNodesPerCycle;

		public String getQueueName() {
			return this.queueName;
		}

		public void setQueueName(String queueName) {
			this.queueName = queueName;
		}

		public String getSystemDiskLevel() {
			return this.systemDiskLevel;
		}

		public void setSystemDiskLevel(String systemDiskLevel) {
			this.systemDiskLevel = systemDiskLevel;
		}

		public Boolean getSortedByInventory() {
			return this.sortedByInventory;
		}

		public void setSortedByInventory(Boolean sortedByInventory) {
			this.sortedByInventory = sortedByInventory;
		}

		public List<InstanceTypes> getInstanceTypess() {
			return this.instanceTypess;
		}

		public void setInstanceTypess(List<InstanceTypes> instanceTypess) {
			this.instanceTypess = instanceTypess;
		}

		public Boolean getEnableAutoGrow() {
			return this.enableAutoGrow;
		}

		public void setEnableAutoGrow(Boolean enableAutoGrow) {
			this.enableAutoGrow = enableAutoGrow;
		}

		public String getHostNameSuffix() {
			return this.hostNameSuffix;
		}

		public void setHostNameSuffix(String hostNameSuffix) {
			this.hostNameSuffix = hostNameSuffix;
		}

		public Float getSpotPriceLimit() {
			return this.spotPriceLimit;
		}

		public void setSpotPriceLimit(Float spotPriceLimit) {
			this.spotPriceLimit = spotPriceLimit;
		}

		public Boolean getEnableAutoShrink() {
			return this.enableAutoShrink;
		}

		public void setEnableAutoShrink(Boolean enableAutoShrink) {
			this.enableAutoShrink = enableAutoShrink;
		}

		public String getSpotStrategy() {
			return this.spotStrategy;
		}

		public void setSpotStrategy(String spotStrategy) {
			this.spotStrategy = spotStrategy;
		}

		public Boolean getAutoMinNodesPerCycle() {
			return this.autoMinNodesPerCycle;
		}

		public void setAutoMinNodesPerCycle(Boolean autoMinNodesPerCycle) {
			this.autoMinNodesPerCycle = autoMinNodesPerCycle;
		}

		public List<DataDisks> getDataDiskss() {
			return this.dataDiskss;
		}

		public void setDataDiskss(List<DataDisks> dataDiskss) {
			this.dataDiskss = dataDiskss;
		}

		public Integer getMinNodesInQueue() {
			return this.minNodesInQueue;
		}

		public void setMinNodesInQueue(Integer minNodesInQueue) {
			this.minNodesInQueue = minNodesInQueue;
		}

		public Long getMaxNodesPerCycle() {
			return this.maxNodesPerCycle;
		}

		public void setMaxNodesPerCycle(Long maxNodesPerCycle) {
			this.maxNodesPerCycle = maxNodesPerCycle;
		}

		public String getSystemDiskCategory() {
			return this.systemDiskCategory;
		}

		public void setSystemDiskCategory(String systemDiskCategory) {
			this.systemDiskCategory = systemDiskCategory;
		}

		public Integer getMaxNodesInQueue() {
			return this.maxNodesInQueue;
		}

		public void setMaxNodesInQueue(Integer maxNodesInQueue) {
			this.maxNodesInQueue = maxNodesInQueue;
		}

		public Integer getSystemDiskSize() {
			return this.systemDiskSize;
		}

		public void setSystemDiskSize(Integer systemDiskSize) {
			this.systemDiskSize = systemDiskSize;
		}

		public String getQueueImageId() {
			return this.queueImageId;
		}

		public void setQueueImageId(String queueImageId) {
			this.queueImageId = queueImageId;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getHostNamePrefix() {
			return this.hostNamePrefix;
		}

		public void setHostNamePrefix(String hostNamePrefix) {
			this.hostNamePrefix = hostNamePrefix;
		}

		public Long getMinNodesPerCycle() {
			return this.minNodesPerCycle;
		}

		public void setMinNodesPerCycle(Long minNodesPerCycle) {
			this.minNodesPerCycle = minNodesPerCycle;
		}

		public static class InstanceTypes {

			private String vSwitchId;

			private String spotStrategy;

			private String spotInterruptionBehavior;

			private String zoneId;

			private String instanceType;

			private Float spotPriceLimit;

			private Integer spotDuration;

			public String getVSwitchId() {
				return this.vSwitchId;
			}

			public void setVSwitchId(String vSwitchId) {
				this.vSwitchId = vSwitchId;
			}

			public String getSpotStrategy() {
				return this.spotStrategy;
			}

			public void setSpotStrategy(String spotStrategy) {
				this.spotStrategy = spotStrategy;
			}

			public String getSpotInterruptionBehavior() {
				return this.spotInterruptionBehavior;
			}

			public void setSpotInterruptionBehavior(String spotInterruptionBehavior) {
				this.spotInterruptionBehavior = spotInterruptionBehavior;
			}

			public String getZoneId() {
				return this.zoneId;
			}

			public void setZoneId(String zoneId) {
				this.zoneId = zoneId;
			}

			public String getInstanceType() {
				return this.instanceType;
			}

			public void setInstanceType(String instanceType) {
				this.instanceType = instanceType;
			}

			public Float getSpotPriceLimit() {
				return this.spotPriceLimit;
			}

			public void setSpotPriceLimit(Float spotPriceLimit) {
				this.spotPriceLimit = spotPriceLimit;
			}

			public Integer getSpotDuration() {
				return this.spotDuration;
			}

			public void setSpotDuration(Integer spotDuration) {
				this.spotDuration = spotDuration;
			}
		}

		public static class DataDisks {

			private Boolean dataDiskDeleteWithInstance;

			private Boolean dataDiskEncrypted;

			private String dataDiskKMSKeyId;

			private Integer dataDiskSize;

			private String dataDiskCategory;

			private String dataDiskPerformanceLevel;

			public Boolean getDataDiskDeleteWithInstance() {
				return this.dataDiskDeleteWithInstance;
			}

			public void setDataDiskDeleteWithInstance(Boolean dataDiskDeleteWithInstance) {
				this.dataDiskDeleteWithInstance = dataDiskDeleteWithInstance;
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

			public Integer getDataDiskSize() {
				return this.dataDiskSize;
			}

			public void setDataDiskSize(Integer dataDiskSize) {
				this.dataDiskSize = dataDiskSize;
			}

			public String getDataDiskCategory() {
				return this.dataDiskCategory;
			}

			public void setDataDiskCategory(String dataDiskCategory) {
				this.dataDiskCategory = dataDiskCategory;
			}

			public String getDataDiskPerformanceLevel() {
				return this.dataDiskPerformanceLevel;
			}

			public void setDataDiskPerformanceLevel(String dataDiskPerformanceLevel) {
				this.dataDiskPerformanceLevel = dataDiskPerformanceLevel;
			}
		}
	}

	@Override
	public Class<SetAutoScaleConfigResponse> getResponseClass() {
		return SetAutoScaleConfigResponse.class;
	}

}
