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

package com.aliyuncs.appstream_center.model.v20210901;

import com.aliyuncs.RpcAcsRequest;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ModifyNodePoolAttributeRequest extends RpcAcsRequest<ModifyNodePoolAttributeResponse> {
	   

	private String bizRegionId;

	private String productType;

	private String poolId;

	@SerializedName("nodePoolStrategy")
	private NodePoolStrategy nodePoolStrategy;

	private Integer nodeCapacity;
	public ModifyNodePoolAttributeRequest() {
		super("appstream-center", "2021-09-01", "ModifyNodePoolAttribute");
		setMethod(MethodType.POST);
	}

	public String getBizRegionId() {
		return this.bizRegionId;
	}

	public void setBizRegionId(String bizRegionId) {
		this.bizRegionId = bizRegionId;
		if(bizRegionId != null){
			putBodyParameter("BizRegionId", bizRegionId);
		}
	}

	public String getProductType() {
		return this.productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
		if(productType != null){
			putBodyParameter("ProductType", productType);
		}
	}

	public String getPoolId() {
		return this.poolId;
	}

	public void setPoolId(String poolId) {
		this.poolId = poolId;
		if(poolId != null){
			putBodyParameter("PoolId", poolId);
		}
	}

	public NodePoolStrategy getNodePoolStrategy() {
		return this.nodePoolStrategy;
	}

	public void setNodePoolStrategy(NodePoolStrategy nodePoolStrategy) {
		this.nodePoolStrategy = nodePoolStrategy;	
		if (nodePoolStrategy != null) {
			putBodyParameter("NodePoolStrategy" , new Gson().toJson(nodePoolStrategy));
		}	
	}

	public Integer getNodeCapacity() {
		return this.nodeCapacity;
	}

	public void setNodeCapacity(Integer nodeCapacity) {
		this.nodeCapacity = nodeCapacity;
		if(nodeCapacity != null){
			putBodyParameter("NodeCapacity", nodeCapacity.toString());
		}
	}

	public static class NodePoolStrategy {

		@SerializedName("ScalingStep")
		private Integer scalingStep;

		@SerializedName("ScalingDownAfterIdleMinutes")
		private Integer scalingDownAfterIdleMinutes;

		@SerializedName("StrategyType")
		private String strategyType;

		@SerializedName("MaxScalingAmount")
		private Integer maxScalingAmount;

		@SerializedName("ScalingUsageThreshold")
		private String scalingUsageThreshold;

		public Integer getScalingStep() {
			return this.scalingStep;
		}

		public void setScalingStep(Integer scalingStep) {
			this.scalingStep = scalingStep;
		}

		public Integer getScalingDownAfterIdleMinutes() {
			return this.scalingDownAfterIdleMinutes;
		}

		public void setScalingDownAfterIdleMinutes(Integer scalingDownAfterIdleMinutes) {
			this.scalingDownAfterIdleMinutes = scalingDownAfterIdleMinutes;
		}

		public String getStrategyType() {
			return this.strategyType;
		}

		public void setStrategyType(String strategyType) {
			this.strategyType = strategyType;
		}

		public Integer getMaxScalingAmount() {
			return this.maxScalingAmount;
		}

		public void setMaxScalingAmount(Integer maxScalingAmount) {
			this.maxScalingAmount = maxScalingAmount;
		}

		public String getScalingUsageThreshold() {
			return this.scalingUsageThreshold;
		}

		public void setScalingUsageThreshold(String scalingUsageThreshold) {
			this.scalingUsageThreshold = scalingUsageThreshold;
		}
	}

	@Override
	public Class<ModifyNodePoolAttributeResponse> getResponseClass() {
		return ModifyNodePoolAttributeResponse.class;
	}

}
