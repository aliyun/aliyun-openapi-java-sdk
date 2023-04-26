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
import com.aliyuncs.ecs.transform.v20160314.DescribeResourceDisplayResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeResourceDisplayResponse extends AcsResponse {

	private String requestId;

	private ResourceDisplay resourceDisplay;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ResourceDisplay getResourceDisplay() {
		return this.resourceDisplay;
	}

	public void setResourceDisplay(ResourceDisplay resourceDisplay) {
		this.resourceDisplay = resourceDisplay;
	}

	public static class ResourceDisplay {

		private List<InstanceChargeType> instanceChargeTypes;

		private List<Zone> zones;

		private List<InstanceCategory> instanceCategories;

		private List<ProductCategory> productCategories;

		public List<InstanceChargeType> getInstanceChargeTypes() {
			return this.instanceChargeTypes;
		}

		public void setInstanceChargeTypes(List<InstanceChargeType> instanceChargeTypes) {
			this.instanceChargeTypes = instanceChargeTypes;
		}

		public List<Zone> getZones() {
			return this.zones;
		}

		public void setZones(List<Zone> zones) {
			this.zones = zones;
		}

		public List<InstanceCategory> getInstanceCategories() {
			return this.instanceCategories;
		}

		public void setInstanceCategories(List<InstanceCategory> instanceCategories) {
			this.instanceCategories = instanceCategories;
		}

		public List<ProductCategory> getProductCategories() {
			return this.productCategories;
		}

		public void setProductCategories(List<ProductCategory> productCategories) {
			this.productCategories = productCategories;
		}

		public static class InstanceChargeType {

			private String spotStrategy;

			private String chargeType;

			private List<String> tags;

			public String getSpotStrategy() {
				return this.spotStrategy;
			}

			public void setSpotStrategy(String spotStrategy) {
				this.spotStrategy = spotStrategy;
			}

			public String getChargeType() {
				return this.chargeType;
			}

			public void setChargeType(String chargeType) {
				this.chargeType = chargeType;
			}

			public List<String> getTags() {
				return this.tags;
			}

			public void setTags(List<String> tags) {
				this.tags = tags;
			}
		}

		public static class Zone {

			private String zoneId;

			private List<String> tags1;

			public String getZoneId() {
				return this.zoneId;
			}

			public void setZoneId(String zoneId) {
				this.zoneId = zoneId;
			}

			public List<String> getTags1() {
				return this.tags1;
			}

			public void setTags1(List<String> tags1) {
				this.tags1 = tags1;
			}
		}

		public static class InstanceCategory {

			private String categoryType;

			private List<InstanceTopCategory> instanceTopCategories;

			private List<String> zoneIds;

			public String getCategoryType() {
				return this.categoryType;
			}

			public void setCategoryType(String categoryType) {
				this.categoryType = categoryType;
			}

			public List<InstanceTopCategory> getInstanceTopCategories() {
				return this.instanceTopCategories;
			}

			public void setInstanceTopCategories(List<InstanceTopCategory> instanceTopCategories) {
				this.instanceTopCategories = instanceTopCategories;
			}

			public List<String> getZoneIds() {
				return this.zoneIds;
			}

			public void setZoneIds(List<String> zoneIds) {
				this.zoneIds = zoneIds;
			}

			public static class InstanceTopCategory {

				private String topCategoryLevel;

				private List<InstanceSecondCategory> instanceSecondCategories;

				public String getTopCategoryLevel() {
					return this.topCategoryLevel;
				}

				public void setTopCategoryLevel(String topCategoryLevel) {
					this.topCategoryLevel = topCategoryLevel;
				}

				public List<InstanceSecondCategory> getInstanceSecondCategories() {
					return this.instanceSecondCategories;
				}

				public void setInstanceSecondCategories(List<InstanceSecondCategory> instanceSecondCategories) {
					this.instanceSecondCategories = instanceSecondCategories;
				}

				public static class InstanceSecondCategory {

					private String secondCategoryLevel;

					private List<InstanceTypeFamily> instanceTypeFamilies;

					private List<InstanceType> instanceTypes;

					public String getSecondCategoryLevel() {
						return this.secondCategoryLevel;
					}

					public void setSecondCategoryLevel(String secondCategoryLevel) {
						this.secondCategoryLevel = secondCategoryLevel;
					}

					public List<InstanceTypeFamily> getInstanceTypeFamilies() {
						return this.instanceTypeFamilies;
					}

					public void setInstanceTypeFamilies(List<InstanceTypeFamily> instanceTypeFamilies) {
						this.instanceTypeFamilies = instanceTypeFamilies;
					}

					public List<InstanceType> getInstanceTypes() {
						return this.instanceTypes;
					}

					public void setInstanceTypes(List<InstanceType> instanceTypes) {
						this.instanceTypes = instanceTypes;
					}

					public static class InstanceTypeFamily {

						private String instanceTypeFamilyId;

						private List<String> tags2;

						public String getInstanceTypeFamilyId() {
							return this.instanceTypeFamilyId;
						}

						public void setInstanceTypeFamilyId(String instanceTypeFamilyId) {
							this.instanceTypeFamilyId = instanceTypeFamilyId;
						}

						public List<String> getTags2() {
							return this.tags2;
						}

						public void setTags2(List<String> tags2) {
							this.tags2 = tags2;
						}
					}

					public static class InstanceType {

						private String instanceTypeId;

						private List<String> tags3;

						public String getInstanceTypeId() {
							return this.instanceTypeId;
						}

						public void setInstanceTypeId(String instanceTypeId) {
							this.instanceTypeId = instanceTypeId;
						}

						public List<String> getTags3() {
							return this.tags3;
						}

						public void setTags3(List<String> tags3) {
							this.tags3 = tags3;
						}
					}
				}
			}
		}

		public static class ProductCategory {

			private String productName;

			private List<InstanceFamilyGroup> instanceFamilyGroups;

			public String getProductName() {
				return this.productName;
			}

			public void setProductName(String productName) {
				this.productName = productName;
			}

			public List<InstanceFamilyGroup> getInstanceFamilyGroups() {
				return this.instanceFamilyGroups;
			}

			public void setInstanceFamilyGroups(List<InstanceFamilyGroup> instanceFamilyGroups) {
				this.instanceFamilyGroups = instanceFamilyGroups;
			}

			public static class InstanceFamilyGroup {

				private String instanceFamilyGroupName;

				private List<InstanceTypeFamily5> instanceTypeFamilies4;

				public String getInstanceFamilyGroupName() {
					return this.instanceFamilyGroupName;
				}

				public void setInstanceFamilyGroupName(String instanceFamilyGroupName) {
					this.instanceFamilyGroupName = instanceFamilyGroupName;
				}

				public List<InstanceTypeFamily5> getInstanceTypeFamilies4() {
					return this.instanceTypeFamilies4;
				}

				public void setInstanceTypeFamilies4(List<InstanceTypeFamily5> instanceTypeFamilies4) {
					this.instanceTypeFamilies4 = instanceTypeFamilies4;
				}

				public static class InstanceTypeFamily5 {

					private String instanceTypeFamilyId;

					private List<String> tags6;

					public String getInstanceTypeFamilyId() {
						return this.instanceTypeFamilyId;
					}

					public void setInstanceTypeFamilyId(String instanceTypeFamilyId) {
						this.instanceTypeFamilyId = instanceTypeFamilyId;
					}

					public List<String> getTags6() {
						return this.tags6;
					}

					public void setTags6(List<String> tags6) {
						this.tags6 = tags6;
					}
				}
			}
		}
	}

	@Override
	public DescribeResourceDisplayResponse getInstance(UnmarshallerContext context) {
		return	DescribeResourceDisplayResponseUnmarshaller.unmarshall(this, context);
	}
}
