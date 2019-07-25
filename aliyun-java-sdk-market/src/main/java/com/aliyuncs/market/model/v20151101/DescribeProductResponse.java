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

	private String code;

	private String name;

	private String type;

	private String picUrl;

	private String description;

	private String shortDescription;

	private Long useCount;

	private Float score;

	private String status;

	private String auditStatus;

	private String auditFailMsg;

	private Long auditTime;

	private Long gmtCreated;

	private Long gmtModified;

	private List<ProductSku> productSkus;

	private List<ProductExtra> productExtras;

	private ShopInfo shopInfo;

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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getShortDescription() {
		return this.shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public Long getUseCount() {
		return this.useCount;
	}

	public void setUseCount(Long useCount) {
		this.useCount = useCount;
	}

	public Float getScore() {
		return this.score;
	}

	public void setScore(Float score) {
		this.score = score;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAuditStatus() {
		return this.auditStatus;
	}

	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}

	public String getAuditFailMsg() {
		return this.auditFailMsg;
	}

	public void setAuditFailMsg(String auditFailMsg) {
		this.auditFailMsg = auditFailMsg;
	}

	public Long getAuditTime() {
		return this.auditTime;
	}

	public void setAuditTime(Long auditTime) {
		this.auditTime = auditTime;
	}

	public Long getGmtCreated() {
		return this.gmtCreated;
	}

	public void setGmtCreated(Long gmtCreated) {
		this.gmtCreated = gmtCreated;
	}

	public Long getGmtModified() {
		return this.gmtModified;
	}

	public void setGmtModified(Long gmtModified) {
		this.gmtModified = gmtModified;
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

		private String name;

		private String code;

		private String chargeType;

		private String constraints;

		private Boolean hidden;

		private List<OrderPeriod> orderPeriods;

		private List<Module> modules;

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

		public String getChargeType() {
			return this.chargeType;
		}

		public void setChargeType(String chargeType) {
			this.chargeType = chargeType;
		}

		public String getConstraints() {
			return this.constraints;
		}

		public void setConstraints(String constraints) {
			this.constraints = constraints;
		}

		public Boolean getHidden() {
			return this.hidden;
		}

		public void setHidden(Boolean hidden) {
			this.hidden = hidden;
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

			private String id;

			private String name;

			private String code;

			private List<Property> properties;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

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

			public static class Property {

				private String name;

				private String key;

				private String showType;

				private String displayUnit;

				private List<PropertyValue> propertyValues;

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

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

					private String value;

					private String displayName;

					private String type;

					private String min;

					private String max;

					private String step;

					private String remark;

					public String getValue() {
						return this.value;
					}

					public void setValue(String value) {
						this.value = value;
					}

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

					public String getMin() {
						return this.min;
					}

					public void setMin(String min) {
						this.min = min;
					}

					public String getMax() {
						return this.max;
					}

					public void setMax(String max) {
						this.max = max;
					}

					public String getStep() {
						return this.step;
					}

					public void setStep(String step) {
						this.step = step;
					}

					public String getRemark() {
						return this.remark;
					}

					public void setRemark(String remark) {
						this.remark = remark;
					}
				}
			}
		}
	}

	public static class ProductExtra {

		private String key;

		private String values;

		private String label;

		private Integer order;

		private String type;

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getValues() {
			return this.values;
		}

		public void setValues(String values) {
			this.values = values;
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

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}
	}

	public static class ShopInfo {

		private Long id;

		private String name;

		private String emails;

		private List<WangWang> wangWangs;

		private List<String> telephones;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

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

			private String userName;

			private String remark;

			public String getUserName() {
				return this.userName;
			}

			public void setUserName(String userName) {
				this.userName = userName;
			}

			public String getRemark() {
				return this.remark;
			}

			public void setRemark(String remark) {
				this.remark = remark;
			}
		}
	}

	@Override
	public DescribeProductResponse getInstance(UnmarshallerContext context) {
		return	DescribeProductResponseUnmarshaller.unmarshall(this, context);
	}
}
