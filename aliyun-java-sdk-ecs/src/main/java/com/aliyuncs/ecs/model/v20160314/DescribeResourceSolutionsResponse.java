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
import com.aliyuncs.ecs.transform.v20160314.DescribeResourceSolutionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeResourceSolutionsResponse extends AcsResponse {

	private String requestId;

	private List<ResourcePlanningResponse> resourcePlanningResponses;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ResourcePlanningResponse> getResourcePlanningResponses() {
		return this.resourcePlanningResponses;
	}

	public void setResourcePlanningResponses(List<ResourcePlanningResponse> resourcePlanningResponses) {
		this.resourcePlanningResponses = resourcePlanningResponses;
	}

	public static class ResourcePlanningResponse {

		private Integer satisfiedAmount;

		private List<ResourceModel> resourceModels;

		private List<String> recommendReasons;

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

		public List<String> getRecommendReasons() {
			return this.recommendReasons;
		}

		public void setRecommendReasons(List<String> recommendReasons) {
			this.recommendReasons = recommendReasons;
		}

		public static class ResourceModel {

			private Integer amount;

			private String zoneId;

			private String instanceType;

			private String regionId;

			private String deliveryTime;

			public Integer getAmount() {
				return this.amount;
			}

			public void setAmount(Integer amount) {
				this.amount = amount;
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

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getDeliveryTime() {
				return this.deliveryTime;
			}

			public void setDeliveryTime(String deliveryTime) {
				this.deliveryTime = deliveryTime;
			}
		}
	}

	@Override
	public DescribeResourceSolutionsResponse getInstance(UnmarshallerContext context) {
		return	DescribeResourceSolutionsResponseUnmarshaller.unmarshall(this, context);
	}
}
