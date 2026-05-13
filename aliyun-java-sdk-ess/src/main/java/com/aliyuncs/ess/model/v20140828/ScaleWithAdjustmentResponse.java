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

package com.aliyuncs.ess.model.v20140828;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ess.transform.v20140828.ScaleWithAdjustmentResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ScaleWithAdjustmentResponse extends AcsResponse {

	private String scalingActivityId;

	private String requestId;

	private String activityType;

	private PlanResult planResult;

	public String getScalingActivityId() {
		return this.scalingActivityId;
	}

	public void setScalingActivityId(String scalingActivityId) {
		this.scalingActivityId = scalingActivityId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getActivityType() {
		return this.activityType;
	}

	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	public PlanResult getPlanResult() {
		return this.planResult;
	}

	public void setPlanResult(PlanResult planResult) {
		this.planResult = planResult;
	}

	public static class PlanResult {

		private List<ResourceAllocationModels> resourceAllocations;

		public List<ResourceAllocationModels> getResourceAllocations() {
			return this.resourceAllocations;
		}

		public void setResourceAllocations(List<ResourceAllocationModels> resourceAllocations) {
			this.resourceAllocations = resourceAllocations;
		}

		public static class ResourceAllocationModels {

			private String zoneId;

			private String instanceType;

			private String spotStrategy;

			private Integer amount;

			private String instanceChargeType;

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

			public String getSpotStrategy() {
				return this.spotStrategy;
			}

			public void setSpotStrategy(String spotStrategy) {
				this.spotStrategy = spotStrategy;
			}

			public Integer getAmount() {
				return this.amount;
			}

			public void setAmount(Integer amount) {
				this.amount = amount;
			}

			public String getInstanceChargeType() {
				return this.instanceChargeType;
			}

			public void setInstanceChargeType(String instanceChargeType) {
				this.instanceChargeType = instanceChargeType;
			}
		}
	}

	@Override
	public ScaleWithAdjustmentResponse getInstance(UnmarshallerContext context) {
		return	ScaleWithAdjustmentResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
