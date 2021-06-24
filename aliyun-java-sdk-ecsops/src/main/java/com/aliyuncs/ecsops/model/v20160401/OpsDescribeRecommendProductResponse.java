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
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeRecommendProductResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeRecommendProductResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String code;

	private Boolean success;

	private List<RecommendProduct> recommendProducts;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<RecommendProduct> getRecommendProducts() {
		return this.recommendProducts;
	}

	public void setRecommendProducts(List<RecommendProduct> recommendProducts) {
		this.recommendProducts = recommendProducts;
	}

	public static class RecommendProduct {

		private String zoneId;

		private List<RecommendInstanceType> recommendInstanceTypes;

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public List<RecommendInstanceType> getRecommendInstanceTypes() {
			return this.recommendInstanceTypes;
		}

		public void setRecommendInstanceTypes(List<RecommendInstanceType> recommendInstanceTypes) {
			this.recommendInstanceTypes = recommendInstanceTypes;
		}

		public static class RecommendInstanceType {

			private Float price;

			private String capacitySpecification;

			private Integer priority;

			private Integer inventoryAmount;

			private String networkType;

			private Integer quotaAmount;

			private String spotStrategy;

			private String instanceChargeType;

			private InstanceType instanceType;

			public Float getPrice() {
				return this.price;
			}

			public void setPrice(Float price) {
				this.price = price;
			}

			public String getCapacitySpecification() {
				return this.capacitySpecification;
			}

			public void setCapacitySpecification(String capacitySpecification) {
				this.capacitySpecification = capacitySpecification;
			}

			public Integer getPriority() {
				return this.priority;
			}

			public void setPriority(Integer priority) {
				this.priority = priority;
			}

			public Integer getInventoryAmount() {
				return this.inventoryAmount;
			}

			public void setInventoryAmount(Integer inventoryAmount) {
				this.inventoryAmount = inventoryAmount;
			}

			public String getNetworkType() {
				return this.networkType;
			}

			public void setNetworkType(String networkType) {
				this.networkType = networkType;
			}

			public Integer getQuotaAmount() {
				return this.quotaAmount;
			}

			public void setQuotaAmount(Integer quotaAmount) {
				this.quotaAmount = quotaAmount;
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

			public InstanceType getInstanceType() {
				return this.instanceType;
			}

			public void setInstanceType(InstanceType instanceType) {
				this.instanceType = instanceType;
			}

			public static class InstanceType {

				private String supportIoOptimized;

				private Integer cores;

				private String instanceFamilyLevel;

				private Integer memory;

				private String instanceType;

				private String instanceTypeFamily;

				private String generation;

				public String getSupportIoOptimized() {
					return this.supportIoOptimized;
				}

				public void setSupportIoOptimized(String supportIoOptimized) {
					this.supportIoOptimized = supportIoOptimized;
				}

				public Integer getCores() {
					return this.cores;
				}

				public void setCores(Integer cores) {
					this.cores = cores;
				}

				public String getInstanceFamilyLevel() {
					return this.instanceFamilyLevel;
				}

				public void setInstanceFamilyLevel(String instanceFamilyLevel) {
					this.instanceFamilyLevel = instanceFamilyLevel;
				}

				public Integer getMemory() {
					return this.memory;
				}

				public void setMemory(Integer memory) {
					this.memory = memory;
				}

				public String getInstanceType() {
					return this.instanceType;
				}

				public void setInstanceType(String instanceType) {
					this.instanceType = instanceType;
				}

				public String getInstanceTypeFamily() {
					return this.instanceTypeFamily;
				}

				public void setInstanceTypeFamily(String instanceTypeFamily) {
					this.instanceTypeFamily = instanceTypeFamily;
				}

				public String getGeneration() {
					return this.generation;
				}

				public void setGeneration(String generation) {
					this.generation = generation;
				}
			}
		}
	}

	@Override
	public OpsDescribeRecommendProductResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeRecommendProductResponseUnmarshaller.unmarshall(this, context);
	}
}
