/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.market.model.v20151101;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.market.transform.v20151101.DescribeProductResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.List;

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
				}
			}
		}
	}

	public static class ProductExtra {

		private String key;

		private String value;

		private String label;

		private Integer order;

		private String type;

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
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
