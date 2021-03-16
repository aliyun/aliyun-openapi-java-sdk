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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeResourcePlanningResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeResourcePlanningResponse extends AcsResponse {

	private String requestId;

	private ResourcePlanningResult resourcePlanningResult;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ResourcePlanningResult getResourcePlanningResult() {
		return this.resourcePlanningResult;
	}

	public void setResourcePlanningResult(ResourcePlanningResult resourcePlanningResult) {
		this.resourcePlanningResult = resourcePlanningResult;
	}

	public static class ResourcePlanningResult {

		private String resourceType;

		private Integer satisfiedCapacity;

		private List<ResourceModel> resourceModels;

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public Integer getSatisfiedCapacity() {
			return this.satisfiedCapacity;
		}

		public void setSatisfiedCapacity(Integer satisfiedCapacity) {
			this.satisfiedCapacity = satisfiedCapacity;
		}

		public List<ResourceModel> getResourceModels() {
			return this.resourceModels;
		}

		public void setResourceModels(List<ResourceModel> resourceModels) {
			this.resourceModels = resourceModels;
		}

		public static class ResourceModel {

			private String regionId;

			private String zoneId;

			private String instanceType;

			private Integer cores;

			private Integer memory;

			private Float price;

			private Integer amount;

			private String deliveryType;

			private String deliveryTimeBegin;

			private String deliveryTimeEnd;

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
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

			public Integer getCores() {
				return this.cores;
			}

			public void setCores(Integer cores) {
				this.cores = cores;
			}

			public Integer getMemory() {
				return this.memory;
			}

			public void setMemory(Integer memory) {
				this.memory = memory;
			}

			public Float getPrice() {
				return this.price;
			}

			public void setPrice(Float price) {
				this.price = price;
			}

			public Integer getAmount() {
				return this.amount;
			}

			public void setAmount(Integer amount) {
				this.amount = amount;
			}

			public String getDeliveryType() {
				return this.deliveryType;
			}

			public void setDeliveryType(String deliveryType) {
				this.deliveryType = deliveryType;
			}

			public String getDeliveryTimeBegin() {
				return this.deliveryTimeBegin;
			}

			public void setDeliveryTimeBegin(String deliveryTimeBegin) {
				this.deliveryTimeBegin = deliveryTimeBegin;
			}

			public String getDeliveryTimeEnd() {
				return this.deliveryTimeEnd;
			}

			public void setDeliveryTimeEnd(String deliveryTimeEnd) {
				this.deliveryTimeEnd = deliveryTimeEnd;
			}
		}
	}

	@Override
	public OpsDescribeResourcePlanningResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeResourcePlanningResponseUnmarshaller.unmarshall(this, context);
	}
}
