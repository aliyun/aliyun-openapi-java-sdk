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

package com.aliyuncs.bssopenapi.model.v20171214;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.bssopenapi.transform.v20171214.DescribeResourcePackageProductResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeResourcePackageProductResponse extends AcsResponse {

	private String requestId;

	private Long orderId;

	private Boolean success;

	private String code;

	private String message;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<ResourcePackage> resourcePackages;

		public List<ResourcePackage> getResourcePackages() {
			return this.resourcePackages;
		}

		public void setResourcePackages(List<ResourcePackage> resourcePackages) {
			this.resourcePackages = resourcePackages;
		}

		public static class ResourcePackage {

			private String productCode;

			private String productType;

			private String name;

			private List<PackageType> packageTypes;

			public String getProductCode() {
				return this.productCode;
			}

			public void setProductCode(String productCode) {
				this.productCode = productCode;
			}

			public String getProductType() {
				return this.productType;
			}

			public void setProductType(String productType) {
				this.productType = productType;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public List<PackageType> getPackageTypes() {
				return this.packageTypes;
			}

			public void setPackageTypes(List<PackageType> packageTypes) {
				this.packageTypes = packageTypes;
			}

			public static class PackageType {

				private String name;

				private String code;

				private List<Property> properties;

				private List<Specification> specifications;

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getCode() {
					return this.code;
				}

				public void setCode(String code) {
					this.code = code;
				}

				public List<Property> getProperties() {
					return this.properties;
				}

				public void setProperties(List<Property> properties) {
					this.properties = properties;
				}

				public List<Specification> getSpecifications() {
					return this.specifications;
				}

				public void setSpecifications(List<Specification> specifications) {
					this.specifications = specifications;
				}

				public static class Property {

					private String name;

					private String value;

					public String getName() {
						return this.name;
					}

					public void setName(String name) {
						this.name = name;
					}

					public String getValue() {
						return this.value;
					}

					public void setValue(String value) {
						this.value = value;
					}
				}

				public static class Specification {

					private String name;

					private String value;

					private List<AvailableDuration> availableDurations;

					public String getName() {
						return this.name;
					}

					public void setName(String name) {
						this.name = name;
					}

					public String getValue() {
						return this.value;
					}

					public void setValue(String value) {
						this.value = value;
					}

					public List<AvailableDuration> getAvailableDurations() {
						return this.availableDurations;
					}

					public void setAvailableDurations(List<AvailableDuration> availableDurations) {
						this.availableDurations = availableDurations;
					}

					public static class AvailableDuration {

						private String name;

						private Integer value;

						private String unit;

						public String getName() {
							return this.name;
						}

						public void setName(String name) {
							this.name = name;
						}

						public Integer getValue() {
							return this.value;
						}

						public void setValue(Integer value) {
							this.value = value;
						}

						public String getUnit() {
							return this.unit;
						}

						public void setUnit(String unit) {
							this.unit = unit;
						}
					}
				}
			}
		}
	}

	@Override
	public DescribeResourcePackageProductResponse getInstance(UnmarshallerContext context) {
		return	DescribeResourcePackageProductResponseUnmarshaller.unmarshall(this, context);
	}
}
