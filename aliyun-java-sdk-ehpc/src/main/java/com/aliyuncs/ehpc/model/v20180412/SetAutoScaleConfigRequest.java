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

/**
 * @author auto create
 * @version 
 */
public class SetAutoScaleConfigRequest extends RpcAcsRequest<SetAutoScaleConfigResponse> {
	
	public SetAutoScaleConfigRequest() {
		super("EHPC", "2018-04-12", "SetAutoScaleConfig", "ehs");
	}

	private Integer shrinkIdleTimes;

	private Integer growTimeoutInMinutes;

	private String clusterId;

	private Boolean enableAutoGrow;

	private Float spotPriceLimit;

	private Boolean enableAutoShrink;

	private String spotStrategy;

	private Integer maxNodesInCluster;

	private String excludeNodes;

	private Integer shrinkIntervalInMinutes;

	private List<Queues> queuess;

	private Integer extraNodesGrowRatio;

	private Integer growIntervalInMinutes;

	private Integer growRatio;

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

	public Float getSpotPriceLimit() {
		return this.spotPriceLimit;
	}

	public void setSpotPriceLimit(Float spotPriceLimit) {
		this.spotPriceLimit = spotPriceLimit;
		if(spotPriceLimit != null){
			putQueryParameter("SpotPriceLimit", spotPriceLimit.toString());
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

	public String getExcludeNodes() {
		return this.excludeNodes;
	}

	public void setExcludeNodes(String excludeNodes) {
		this.excludeNodes = excludeNodes;
		if(excludeNodes != null){
			putQueryParameter("ExcludeNodes", excludeNodes);
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
				putQueryParameter("Queues." + (depth1 + 1) + ".InstanceType" , queuess.get(depth1).getInstanceType());
				putQueryParameter("Queues." + (depth1 + 1) + ".EnableAutoGrow" , queuess.get(depth1).getEnableAutoGrow());
				putQueryParameter("Queues." + (depth1 + 1) + ".SpotPriceLimit" , queuess.get(depth1).getSpotPriceLimit());
				putQueryParameter("Queues." + (depth1 + 1) + ".EnableAutoShrink" , queuess.get(depth1).getEnableAutoShrink());
			}
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
	}

	@Override
	public Class<SetAutoScaleConfigResponse> getResponseClass() {
		return SetAutoScaleConfigResponse.class;
	}

}
