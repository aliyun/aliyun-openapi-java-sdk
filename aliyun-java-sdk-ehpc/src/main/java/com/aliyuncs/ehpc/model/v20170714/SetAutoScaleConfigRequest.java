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

package com.aliyuncs.ehpc.model.v20170714;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ehpc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SetAutoScaleConfigRequest extends RpcAcsRequest<SetAutoScaleConfigResponse> {
	   

	private String excludeNodes;

	private Integer extraNodesGrowRatio;

	private Integer shrinkIdleTimes;

	private Integer growTimeoutInMinutes;

	private String clusterId;

	private Boolean enableAutoGrow;

	private Boolean enableAutoShrink;

	private Integer maxNodesInCluster;

	private Integer shrinkIntervalInMinutes;

	private Integer growIntervalInMinutes;

	private Integer growRatio;
	public SetAutoScaleConfigRequest() {
		super("EHPC", "2017-07-14", "SetAutoScaleConfig");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	@Override
	public Class<SetAutoScaleConfigResponse> getResponseClass() {
		return SetAutoScaleConfigResponse.class;
	}

}
