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

import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ehpc.transform.v20180412.DescribeAutoScaleConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAutoScaleConfigResponse extends AcsResponse {

	private String requestId;

	private String uid;

	private String clusterId;

	private String clusterType;

	private Boolean enableAutoGrow;

	private Boolean enableAutoShrink;

	private Integer growIntervalInMinutes;

	private Integer shrinkIntervalInMinutes;

	private Integer shrinkIdleTimes;

	private Integer growTimeoutInMinutes;

	private Integer extraNodesGrowRatio;

	private Integer growRatio;

	private Integer maxNodesInCluster;

	private String excludeNodes;

	private String spotStrategy;

	private String spotPriceLimit;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getUid() {
		return this.uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
	}

	public String getClusterType() {
		return this.clusterType;
	}

	public void setClusterType(String clusterType) {
		this.clusterType = clusterType;
	}

	public Boolean getEnableAutoGrow() {
		return this.enableAutoGrow;
	}

	public void setEnableAutoGrow(Boolean enableAutoGrow) {
		this.enableAutoGrow = enableAutoGrow;
	}

	public Boolean getEnableAutoShrink() {
		return this.enableAutoShrink;
	}

	public void setEnableAutoShrink(Boolean enableAutoShrink) {
		this.enableAutoShrink = enableAutoShrink;
	}

	public Integer getGrowIntervalInMinutes() {
		return this.growIntervalInMinutes;
	}

	public void setGrowIntervalInMinutes(Integer growIntervalInMinutes) {
		this.growIntervalInMinutes = growIntervalInMinutes;
	}

	public Integer getShrinkIntervalInMinutes() {
		return this.shrinkIntervalInMinutes;
	}

	public void setShrinkIntervalInMinutes(Integer shrinkIntervalInMinutes) {
		this.shrinkIntervalInMinutes = shrinkIntervalInMinutes;
	}

	public Integer getShrinkIdleTimes() {
		return this.shrinkIdleTimes;
	}

	public void setShrinkIdleTimes(Integer shrinkIdleTimes) {
		this.shrinkIdleTimes = shrinkIdleTimes;
	}

	public Integer getGrowTimeoutInMinutes() {
		return this.growTimeoutInMinutes;
	}

	public void setGrowTimeoutInMinutes(Integer growTimeoutInMinutes) {
		this.growTimeoutInMinutes = growTimeoutInMinutes;
	}

	public Integer getExtraNodesGrowRatio() {
		return this.extraNodesGrowRatio;
	}

	public void setExtraNodesGrowRatio(Integer extraNodesGrowRatio) {
		this.extraNodesGrowRatio = extraNodesGrowRatio;
	}

	public Integer getGrowRatio() {
		return this.growRatio;
	}

	public void setGrowRatio(Integer growRatio) {
		this.growRatio = growRatio;
	}

	public Integer getMaxNodesInCluster() {
		return this.maxNodesInCluster;
	}

	public void setMaxNodesInCluster(Integer maxNodesInCluster) {
		this.maxNodesInCluster = maxNodesInCluster;
	}

	public String getExcludeNodes() {
		return this.excludeNodes;
	}

	public void setExcludeNodes(String excludeNodes) {
		this.excludeNodes = excludeNodes;
	}

	public String getSpotStrategy() {
		return this.spotStrategy;
	}

	public void setSpotStrategy(String spotStrategy) {
		this.spotStrategy = spotStrategy;
	}

	public String getSpotPriceLimit() {
		return this.spotPriceLimit;
	}

	public void setSpotPriceLimit(String spotPriceLimit) {
		this.spotPriceLimit = spotPriceLimit;
	}

	@Override
	public DescribeAutoScaleConfigResponse getInstance(UnmarshallerContext context) {
		return	DescribeAutoScaleConfigResponseUnmarshaller.unmarshall(this, context);
	}
}
