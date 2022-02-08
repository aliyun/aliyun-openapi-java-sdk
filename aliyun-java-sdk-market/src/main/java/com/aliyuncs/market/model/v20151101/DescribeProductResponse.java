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
import com.aliyuncs.market.transform.v20151101.DescribeProductResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeProductResponse extends AcsResponse {

	private Long frontCategoryId;

	private String status;

	private String type;

	private String picUrl;

	private Float score;

	private Long useCount;

	private Long gmtModified;

	private Long supplierPk;

	private Long gmtCreated;

	private String requestId;

	private String shortDescription;

	private String description;

	private String code;

	private String auditFailMsg;

	private String name;

	private Long auditTime;

	private String auditStatus;

	private List<ProductSku> productSkus;

	private List<ProductExtra> productExtras;

	private ShopInfo shopInfo;

	public Long getFrontCategoryId() {
		return this.frontCategoryId;
	}

	public void setFrontCategoryId(Long frontCategoryId) {
		this.frontCategoryId = frontCategoryId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPicUrl() {
		return this.picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public Float getScore() {
		return this.score;
	}

	public void setScore(Float score) {
		this.score = score;
	}

	public Long getUseCount() {
		return this.useCount;
	}

	public void setUseCount(Long useCount) {
		this.useCount = useCount;
	}

	public Long getGmtModified() {
		return this.gmtModified;
	}

	public void setGmtModified(Long gmtModified) {
		this.gmtModified = gmtModified;
	}

	public Long getSupplierPk() {
		return this.supplierPk;
	}

	public void setSupplierPk(Long supplierPk) {
		this.supplierPk = supplierPk;
	}

	public Long getGmtCreated() {
		return this.gmtCreated;
	}

	public void setGmtCreated(Long gmtCreated) {
		this.gmtCreated = gmtCreated;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getShortDescription() {
		return this.shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getAuditFailMsg() {
		return this.auditFailMsg;
	}

	public void setAuditFailMsg(String auditFailMsg) {
		this.auditFailMsg = auditFailMsg;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getAuditTime() {
		return this.auditTime;
	}

	public void setAuditTime(Long auditTime) {
		this.auditTime = auditTime;
	}

	public String getAuditStatus() {
		return this.auditStatus;
	}

	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}

	public List<ProductSku> getProductSkus() {
		return this.productSkus;
	}

	public void setProductSkus(List<ProductSku> productSkus) {
		this.productSkus = productSkus;
	}

	public List<ProductExtra> getProductExtras() {
		return this.productExtras;
	}

	public void setProductExtras(List<ProductExtra> productExtras) {
		this.productExtras = productExtras;
	}

	public ShopInfo getShopInfo() {
		return this.shopInfo;
	}

	public void setShopInfo(ShopInfo shopInfo) {
		this.shopInfo = shopInfo;
	}

	public static class ProductSku {

		private Boolean hidden;

		private String code;

		private String constraints;

		private String name;

		private String chargeType;

		private List<OrderPeriod> orderPeriods;

		private List<Module> modules;

		public Boolean getHidden() {
			return this.hidden;
		}

		public void setHidden(Boolean hidden) {
			this.hidden = hidden;
		}

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getConstraints() {
			return this.constraints;
		}

		public void setConstraints(String constraints) {
			this.constraints = constraints;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getChargeType() {
			return this.chargeType;
		}

		public void setChargeType(String chargeType) {
			this.chargeType = chargeType;
		}

		public List<OrderPeriod> getOrderPeriods() {
			return this.orderPeriods;
		}

		public void setOrderPeriods(List<OrderPeriod> orderPeriods) {
			this.orderPeriods = orderPeriods;
		}

		public List<Module> getModules() {
			return this.modules;
		}

		public void setModules(List<Module> modules) {
			this.modules = modules;
		}

		public static class OrderPeriod {

			private String name;

			private String periodType;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getPeriodType() {
				return this.periodType;
			}

			public void setPeriodType(String periodType) {
				this.periodType = periodType;
			}
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
	}

	public static class ProductExtra {

		private String type;

		private String key;

		private String label;

		private Integer order;

		private String values;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getLabel() {
			return this.label;
		}

		public void setLabel(String label) {
			this.label = label;
		}

		public Integer getOrder() {
			return this.order;
		}

		public void setOrder(Integer order) {
			this.order = order;
		}

		public String getValues() {
			return this.values;
		}

		public void setValues(String values) {
			this.values = values;
		}
	}

	public static class ShopInfo {

		private String name;

		private String emails;

		private Long id;

		private List<WangWang> wangWangs;

		private List<String> telephones;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmails() {
			return this.emails;
		}

		public void setEmails(String emails) {
			this.emails = emails;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public List<WangWang> getWangWangs() {
			return this.wangWangs;
		}

		public void setWangWangs(List<WangWang> wangWangs) {
			this.wangWangs = wangWangs;
		}

		public List<String> getTelephones() {
			return this.telephones;
		}

		public void setTelephones(List<String> telephones) {
			this.telephones = telephones;
		}

		public static class WangWang {

			private String remark;

			private String userName;

			public String getRemark() {
				return this.remark;
			}

			public void setRemark(String remark) {
				this.remark = remark;
			}

			public String getUserName() {
				return this.userName;
			}

			public void setUserName(String userName) {
				this.userName = userName;
			}
		}
	}

	@Override
	public DescribeProductResponse getInstance(UnmarshallerContext context) {
		return	DescribeProductResponseUnmarshaller.unmarshall(this, context);
	}
}
