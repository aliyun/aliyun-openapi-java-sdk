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
import com.aliyuncs.ess.transform.v20140828.DescribeElasticStrengthResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeElasticStrengthResponse extends AcsResponse {

	private String requestId;

	private Double totalStrength;

	private String elasticStrength;

	private List<ResourcePool> resourcePools;

	private List<ElasticStrengthModel> elasticStrengthModels;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Double getTotalStrength() {
		return this.totalStrength;
	}

	public void setTotalStrength(Double totalStrength) {
		this.totalStrength = totalStrength;
	}

	public String getElasticStrength() {
		return this.elasticStrength;
	}

	public void setElasticStrength(String elasticStrength) {
		this.elasticStrength = elasticStrength;
	}

	public List<ResourcePool> getResourcePools() {
		return this.resourcePools;
	}

	public void setResourcePools(List<ResourcePool> resourcePools) {
		this.resourcePools = resourcePools;
	}

	public List<ElasticStrengthModel> getElasticStrengthModels() {
		return this.elasticStrengthModels;
	}

	public void setElasticStrengthModels(List<ElasticStrengthModel> elasticStrengthModels) {
		this.elasticStrengthModels = elasticStrengthModels;
	}

	public static class ResourcePool {

		private Double strength;

		private String instanceType;

		private String zoneId;

		private String code;

		private String msg;

		private String status;

		private List<String> vSwitchIds;

		private InventoryHealth inventoryHealth;

		public Double getStrength() {
			return this.strength;
		}

		public void setStrength(Double strength) {
			this.strength = strength;
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

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getMsg() {
			return this.msg;
		}

		public void setMsg(String msg) {
			this.msg = msg;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public List<String> getVSwitchIds() {
			return this.vSwitchIds;
		}

		public void setVSwitchIds(List<String> vSwitchIds) {
			this.vSwitchIds = vSwitchIds;
		}

		public InventoryHealth getInventoryHealth() {
			return this.inventoryHealth;
		}

		public void setInventoryHealth(InventoryHealth inventoryHealth) {
			this.inventoryHealth = inventoryHealth;
		}

		public static class InventoryHealth {

			private Integer healthScore;

			private Integer adequacyScore;

			private Integer supplyScore;

			private Integer hotScore;

			public Integer getHealthScore() {
				return this.healthScore;
			}

			public void setHealthScore(Integer healthScore) {
				this.healthScore = healthScore;
			}

			public Integer getAdequacyScore() {
				return this.adequacyScore;
			}

			public void setAdequacyScore(Integer adequacyScore) {
				this.adequacyScore = adequacyScore;
			}

			public Integer getSupplyScore() {
				return this.supplyScore;
			}

			public void setSupplyScore(Integer supplyScore) {
				this.supplyScore = supplyScore;
			}

			public Integer getHotScore() {
				return this.hotScore;
			}

			public void setHotScore(Integer hotScore) {
				this.hotScore = hotScore;
			}
		}
	}

	public static class ElasticStrengthModel {

		private String scalingGroupId;

		private String elasticStrength;

		private Double totalStrength;

		private List<ResourcePool2> resourcePools1;

		public String getScalingGroupId() {
			return this.scalingGroupId;
		}

		public void setScalingGroupId(String scalingGroupId) {
			this.scalingGroupId = scalingGroupId;
		}

		public String getElasticStrength() {
			return this.elasticStrength;
		}

		public void setElasticStrength(String elasticStrength) {
			this.elasticStrength = elasticStrength;
		}

		public Double getTotalStrength() {
			return this.totalStrength;
		}

		public void setTotalStrength(Double totalStrength) {
			this.totalStrength = totalStrength;
		}

		public List<ResourcePool2> getResourcePools1() {
			return this.resourcePools1;
		}

		public void setResourcePools1(List<ResourcePool2> resourcePools1) {
			this.resourcePools1 = resourcePools1;
		}

		public static class ResourcePool2 {

			private String instanceType;

			private Double strength;

			private String zoneId;

			private String code;

			private String msg;

			private String status;

			private List<String> vSwitchIds3;

			private InventoryHealth4 inventoryHealth4;

			public String getInstanceType() {
				return this.instanceType;
			}

			public void setInstanceType(String instanceType) {
				this.instanceType = instanceType;
			}

			public Double getStrength() {
				return this.strength;
			}

			public void setStrength(Double strength) {
				this.strength = strength;
			}

			public String getZoneId() {
				return this.zoneId;
			}

			public void setZoneId(String zoneId) {
				this.zoneId = zoneId;
			}

			public String getCode() {
				return this.code;
			}

			public void setCode(String code) {
				this.code = code;
			}

			public String getMsg() {
				return this.msg;
			}

			public void setMsg(String msg) {
				this.msg = msg;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public List<String> getVSwitchIds3() {
				return this.vSwitchIds3;
			}

			public void setVSwitchIds3(List<String> vSwitchIds3) {
				this.vSwitchIds3 = vSwitchIds3;
			}

			public InventoryHealth4 getInventoryHealth4() {
				return this.inventoryHealth4;
			}

			public void setInventoryHealth4(InventoryHealth4 inventoryHealth4) {
				this.inventoryHealth4 = inventoryHealth4;
			}

			public static class InventoryHealth4 {

				private Integer healthScore;

				private Integer adequacyScore;

				private Integer supplyScore;

				private Integer hotScore;

				public Integer getHealthScore() {
					return this.healthScore;
				}

				public void setHealthScore(Integer healthScore) {
					this.healthScore = healthScore;
				}

				public Integer getAdequacyScore() {
					return this.adequacyScore;
				}

				public void setAdequacyScore(Integer adequacyScore) {
					this.adequacyScore = adequacyScore;
				}

				public Integer getSupplyScore() {
					return this.supplyScore;
				}

				public void setSupplyScore(Integer supplyScore) {
					this.supplyScore = supplyScore;
				}

				public Integer getHotScore() {
					return this.hotScore;
				}

				public void setHotScore(Integer hotScore) {
					this.hotScore = hotScore;
				}
			}
		}
	}

	@Override
	public DescribeElasticStrengthResponse getInstance(UnmarshallerContext context) {
		return	DescribeElasticStrengthResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
