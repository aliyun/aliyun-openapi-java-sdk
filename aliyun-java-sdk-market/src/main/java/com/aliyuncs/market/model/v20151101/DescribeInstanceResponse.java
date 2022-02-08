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

package com.aliyuncs.market.model.v20151101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.market.transform.v20151101.DescribeInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstanceResponse extends AcsResponse {

	private String status;

	private String appJson;

	private String productName;

	private Long instanceId;

	private String extendJson;

	private Boolean isTrial;

	private Long beganOn;

	private String componentJson;

	private String constraints;

	private String productType;

	private String hostJson;

	private String productSkuCode;

	private Long createdOn;

	private Long endOn;

	private Long orderId;

	private String productCode;

	private String supplierName;

	private List<Module> modules;

	private RelationalData relationalData;

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAppJson() {
		return this.appJson;
	}

	public void setAppJson(String appJson) {
		this.appJson = appJson;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Long getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(Long instanceId) {
		this.instanceId = instanceId;
	}

	public String getExtendJson() {
		return this.extendJson;
	}

	public void setExtendJson(String extendJson) {
		this.extendJson = extendJson;
	}

	public Boolean getIsTrial() {
		return this.isTrial;
	}

	public void setIsTrial(Boolean isTrial) {
		this.isTrial = isTrial;
	}

	public Long getBeganOn() {
		return this.beganOn;
	}

	public void setBeganOn(Long beganOn) {
		this.beganOn = beganOn;
	}

	public String getComponentJson() {
		return this.componentJson;
	}

	public void setComponentJson(String componentJson) {
		this.componentJson = componentJson;
	}

	public String getConstraints() {
		return this.constraints;
	}

	public void setConstraints(String constraints) {
		this.constraints = constraints;
	}

	public String getProductType() {
		return this.productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getHostJson() {
		return this.hostJson;
	}

	public void setHostJson(String hostJson) {
		this.hostJson = hostJson;
	}

	public String getProductSkuCode() {
		return this.productSkuCode;
	}

	public void setProductSkuCode(String productSkuCode) {
		this.productSkuCode = productSkuCode;
	}

	public Long getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Long createdOn) {
		this.createdOn = createdOn;
	}

	public Long getEndOn() {
		return this.endOn;
	}

	public void setEndOn(Long endOn) {
		this.endOn = endOn;
	}

	public Long getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getSupplierName() {
		return this.supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public List<Module> getModules() {
		return this.modules;
	}

	public void setModules(List<Module> modules) {
		this.modules = modules;
	}

	public RelationalData getRelationalData() {
		return this.relationalData;
	}

	public void setRelationalData(RelationalData relationalData) {
		this.relationalData = relationalData;
	}

	public static class Module {

		private String code;

		private String name;

		private String id;

		private List<Property> properties;

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public List<Property> getProperties() {
			return this.properties;
		}

		public void setProperties(List<Property> properties) {
			this.properties = properties;
		}

		public static class Property {

			private String key;

			private String showType;

			private String name;

			private String displayUnit;

			private List<PropertyValue> propertyValues;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getShowType() {
				return this.showType;
			}

			public void setShowType(String showType) {
				this.showType = showType;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getDisplayUnit() {
				return this.displayUnit;
			}

			public void setDisplayUnit(String displayUnit) {
				this.displayUnit = displayUnit;
			}

			public List<PropertyValue> getPropertyValues() {
				return this.propertyValues;
			}

			public void setPropertyValues(List<PropertyValue> propertyValues) {
				this.propertyValues = propertyValues;
			}

			public static class PropertyValue {

				private String displayName;

				private String type;

				private String step;

				private String value;

				private String max;

				private String remark;

				private String min;

				public String getDisplayName() {
					return this.displayName;
				}

				public void setDisplayName(String displayName) {
					this.displayName = displayName;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public String getStep() {
					return this.step;
				}

				public void setStep(String step) {
					this.step = step;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}

				public String getMax() {
					return this.max;
				}

				public void setMax(String max) {
					this.max = max;
				}

				public String getRemark() {
					return this.remark;
				}

				public void setRemark(String remark) {
					this.remark = remark;
				}

				public String getMin() {
					return this.min;
				}

				public void setMin(String min) {
					this.min = min;
				}
			}
		}
	}

	public static class RelationalData {

		private String serviceStatus;

		public String getServiceStatus() {
			return this.serviceStatus;
		}

		public void setServiceStatus(String serviceStatus) {
			this.serviceStatus = serviceStatus;
		}
	}

	@Override
	public DescribeInstanceResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstanceResponseUnmarshaller.unmarshall(this, context);
	}
}
