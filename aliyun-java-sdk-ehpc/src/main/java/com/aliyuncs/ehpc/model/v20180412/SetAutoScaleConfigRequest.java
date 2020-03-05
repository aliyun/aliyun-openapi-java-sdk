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
				putQueryParameter("Queues." + (depth1 + 1) + ".SpotStrategy" , queuess.get(depth1).getSpotStrategy());
				putQueryParameter("Queues." + (depth1 + 1) + ".QueueName" , queuess.get(depth1).getQueueName());
				if (queuess.get(depth1).getInstanceTypess() != null) {
					for (int depth2 = 0; depth2 < queuess.get(depth1).getInstanceTypess().size(); depth2++) {
						putQueryParameter("Queues." + (depth1 + 1) + ".InstanceTypes." + (depth2 + 1) + ".SpotStrategy" , queuess.get(depth1).getInstanceTypess().get(depth2).getSpotStrategy());
						putQueryParameter("Queues." + (depth1 + 1) + ".InstanceTypes." + (depth2 + 1) + ".VSwitchId" , queuess.get(depth1).getInstanceTypess().get(depth2).getVSwitchId());
						putQueryParameter("Queues." + (depth1 + 1) + ".InstanceTypes." + (depth2 + 1) + ".InstanceType" , queuess.get(depth1).getInstanceTypess().get(depth2).getInstanceType());
						putQueryParameter("Queues." + (depth1 + 1) + ".InstanceTypes." + (depth2 + 1) + ".ZoneId" , queuess.get(depth1).getInstanceTypess().get(depth2).getZoneId());
						putQueryParameter("Queues." + (depth1 + 1) + ".InstanceTypes." + (depth2 + 1) + ".HostNamePrefix" , queuess.get(depth1).getInstanceTypess().get(depth2).getHostNamePrefix());
						putQueryParameter("Queues." + (depth1 + 1) + ".InstanceTypes." + (depth2 + 1) + ".SpotPriceLimit" , queuess.get(depth1).getInstanceTypess().get(depth2).getSpotPriceLimit());
					}
				}
				putQueryParameter("Queues." + (depth1 + 1) + ".MaxNodesInQueue" , queuess.get(depth1).getMaxNodesInQueue());
				putQueryParameter("Queues." + (depth1 + 1) + ".InstanceType" , queuess.get(depth1).getInstanceType());
				putQueryParameter("Queues." + (depth1 + 1) + ".EnableAutoGrow" , queuess.get(depth1).getEnableAutoGrow());
				putQueryParameter("Queues." + (depth1 + 1) + ".SpotPriceLimit" , queuess.get(depth1).getSpotPriceLimit());
				putQueryParameter("Queues." + (depth1 + 1) + ".EnableAutoShrink" , queuess.get(depth1).getEnableAutoShrink());
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

		private String spotStrategy;

		private String queueName;

		private List<InstanceTypes> instanceTypess;

		private Integer maxNodesInQueue;

		private String instanceType;

		private Boolean enableAutoGrow;

		private Float spotPriceLimit;

		private Boolean enableAutoShrink;

		public String getSpotStrategy() {
			return this.spotStrategy;
		}

		public void setSpotStrategy(String spotStrategy) {
			this.spotStrategy = spotStrategy;
		}

		public String getQueueName() {
			return this.queueName;
		}

		public void setQueueName(String queueName) {
			this.queueName = queueName;
		}

		public List<InstanceTypes> getInstanceTypess() {
			return this.instanceTypess;
		}

		public void setInstanceTypess(List<InstanceTypes> instanceTypess) {
			this.instanceTypess = instanceTypess;
		}

		public Integer getMaxNodesInQueue() {
			return this.maxNodesInQueue;
		}

		public void setMaxNodesInQueue(Integer maxNodesInQueue) {
			this.maxNodesInQueue = maxNodesInQueue;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public Boolean getEnableAutoGrow() {
			return this.enableAutoGrow;
		}

		public void setEnableAutoGrow(Boolean enableAutoGrow) {
			this.enableAutoGrow = enableAutoGrow;
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

		public static class InstanceTypes {

			private String spotStrategy;

			private String vSwitchId;

			private String instanceType;

			private String zoneId;

			private String hostNamePrefix;

			private Float spotPriceLimit;

			public String getSpotStrategy() {
				return this.spotStrategy;
			}

			public void setSpotStrategy(String spotStrategy) {
				this.spotStrategy = spotStrategy;
			}

			public String getVSwitchId() {
				return this.vSwitchId;
			}

			public void setVSwitchId(String vSwitchId) {
				this.vSwitchId = vSwitchId;
			}

			public String getInstanceType() {
				return this.instanceType;
			}

			public void setInstanceType(String instanceType) {
				this.instanceType = instanceType;
			}

			public String getZoneId() {
				return this.zoneId;
			}

			public void setZoneId(String zoneId) {
				this.zoneId = zoneId;
			}

			public String getHostNamePrefix() {
				return this.hostNamePrefix;
			}

			public void setHostNamePrefix(String hostNamePrefix) {
				this.hostNamePrefix = hostNamePrefix;
			}

			public Float getSpotPriceLimit() {
				return this.spotPriceLimit;
			}

			public void setSpotPriceLimit(Float spotPriceLimit) {
				this.spotPriceLimit = spotPriceLimit;
			}
		}
	}

	@Override
	public Class<SetAutoScaleConfigResponse> getResponseClass() {
		return SetAutoScaleConfigResponse.class;
	}

}
