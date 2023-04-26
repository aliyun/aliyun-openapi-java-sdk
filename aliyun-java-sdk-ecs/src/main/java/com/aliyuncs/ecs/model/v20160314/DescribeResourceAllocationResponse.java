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

package com.aliyuncs.ecs.model.v20160314;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20160314.DescribeResourceAllocationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeResourceAllocationResponse extends AcsResponse {

	private String requestId;

	private ResourcePlanningResponse resourcePlanningResponse;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ResourcePlanningResponse getResourcePlanningResponse() {
		return this.resourcePlanningResponse;
	}

	public void setResourcePlanningResponse(ResourcePlanningResponse resourcePlanningResponse) {
		this.resourcePlanningResponse = resourcePlanningResponse;
	}

	public static class ResourcePlanningResponse {

		private Integer satisfiedAmount;

		private List<ResourceModel> resourceModels;

		public Integer getSatisfiedAmount() {
			return this.satisfiedAmount;
		}

		public void setSatisfiedAmount(Integer satisfiedAmount) {
			this.satisfiedAmount = satisfiedAmount;
		}

		public List<ResourceModel> getResourceModels() {
			return this.resourceModels;
		}

		public void setResourceModels(List<ResourceModel> resourceModels) {
			this.resourceModels = resourceModels;
		}

		public static class ResourceModel {

			private Integer amount;

			private String ioOptimized;

			private Float price;

			private String zoneId;

			private String networkType;

			private String instanceType;

			private String spotStrategy;

			private String instanceChargeType;

			private String regionId;

			public Integer getAmount() {
				return this.amount;
			}

			public void setAmount(Integer amount) {
				this.amount = amount;
			}

			public String getIoOptimized() {
				return this.ioOptimized;
			}

			public void setIoOptimized(String ioOptimized) {
				this.ioOptimized = ioOptimized;
			}

			public Float getPrice() {
				return this.price;
			}

			public void setPrice(Float price) {
				this.price = price;
			}

			public String getZoneId() {
				return this.zoneId;
			}

			public void setZoneId(String zoneId) {
				this.zoneId = zoneId;
			}

			public String getNetworkType() {
				return this.networkType;
			}

			public void setNetworkType(String networkType) {
				this.networkType = networkType;
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

			public String getInstanceChargeType() {
				return this.instanceChargeType;
			}

			public void setInstanceChargeType(String instanceChargeType) {
				this.instanceChargeType = instanceChargeType;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}
		}
	}

	@Override
	public DescribeResourceAllocationResponse getInstance(UnmarshallerContext context) {
		return	DescribeResourceAllocationResponseUnmarshaller.unmarshall(this, context);
	}
}
