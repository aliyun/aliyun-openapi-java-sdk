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

package com.aliyuncs.ga.model.v20191120;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ga.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeCommodityPriceRequest extends RpcAcsRequest<DescribeCommodityPriceResponse> {
	   

	private String promotionOptionNo;

	private List<Orders> orders;
	public DescribeCommodityPriceRequest() {
		super("Ga", "2019-11-20", "DescribeCommodityPrice", "gaplus");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getPromotionOptionNo() {
		return this.promotionOptionNo;
	}

	public void setPromotionOptionNo(String promotionOptionNo) {
		this.promotionOptionNo = promotionOptionNo;
		if(promotionOptionNo != null){
			putQueryParameter("PromotionOptionNo", promotionOptionNo);
		}
	}

	public List<Orders> getOrders() {
		return this.orders;
	}

	public void setOrders(List<Orders> orders) {
		this.orders = orders;	
		if (orders != null) {
			for (int depth1 = 0; depth1 < orders.size(); depth1++) {
				if (orders.get(depth1) != null) {
					
						putQueryParameter("Orders." + (depth1 + 1) + ".CommodityCode" , orders.get(depth1).getCommodityCode());
						putQueryParameter("Orders." + (depth1 + 1) + ".OrderType" , orders.get(depth1).getOrderType());
						putQueryParameter("Orders." + (depth1 + 1) + ".ChargeType" , orders.get(depth1).getChargeType());
						putQueryParameter("Orders." + (depth1 + 1) + ".PricingCycle" , orders.get(depth1).getPricingCycle());
						putQueryParameter("Orders." + (depth1 + 1) + ".Duration" , orders.get(depth1).getDuration());
						putQueryParameter("Orders." + (depth1 + 1) + ".Quantity" , orders.get(depth1).getQuantity());
						if (orders.get(depth1).getComponents() != null) {
							for (int depth2 = 0; depth2 < orders.get(depth1).getComponents().size(); depth2++) {
								if (orders.get(depth1).getComponents().get(depth2) != null) {
									
										putQueryParameter("Orders." + (depth1 + 1) + ".Components." + (depth2 + 1) + ".ComponentCode" , orders.get(depth1).getComponents().get(depth2).getComponentCode());
										if (orders.get(depth1).getComponents().get(depth2).getProperties() != null) {
											for (int depth3 = 0; depth3 < orders.get(depth1).getComponents().get(depth2).getProperties().size(); depth3++) {
												if (orders.get(depth1).getComponents().get(depth2).getProperties().get(depth3) != null) {
													
														putQueryParameter("Orders." + (depth1 + 1) + ".Components." + (depth2 + 1) + ".Properties." + (depth3 + 1) + ".Code" , orders.get(depth1).getComponents().get(depth2).getProperties().get(depth3).getCode());
														putQueryParameter("Orders." + (depth1 + 1) + ".Components." + (depth2 + 1) + ".Properties." + (depth3 + 1) + ".Value" , orders.get(depth1).getComponents().get(depth2).getProperties().get(depth3).getValue());
												}
											}
										}
								}
							}
						}
				}
			}
		}	
	}

	public static class Orders {

		private String commodityCode;

		private String orderType;

		private String chargeType;

		private String pricingCycle;

		private Long duration;

		private Long quantity;

		private List<ComponentsItem> components;

		public String getCommodityCode() {
			return this.commodityCode;
		}

		public void setCommodityCode(String commodityCode) {
			this.commodityCode = commodityCode;
		}

		public String getOrderType() {
			return this.orderType;
		}

		public void setOrderType(String orderType) {
			this.orderType = orderType;
		}

		public String getChargeType() {
			return this.chargeType;
		}

		public void setChargeType(String chargeType) {
			this.chargeType = chargeType;
		}

		public String getPricingCycle() {
			return this.pricingCycle;
		}

		public void setPricingCycle(String pricingCycle) {
			this.pricingCycle = pricingCycle;
		}

		public Long getDuration() {
			return this.duration;
		}

		public void setDuration(Long duration) {
			this.duration = duration;
		}

		public Long getQuantity() {
			return this.quantity;
		}

		public void setQuantity(Long quantity) {
			this.quantity = quantity;
		}

		public List<ComponentsItem> getComponents() {
			return this.components;
		}

		public void setComponents(List<ComponentsItem> components) {
			this.components = components;
		}

		public static class ComponentsItem {

			private String componentCode;

			private List<PropertiesItem> properties;

			public String getComponentCode() {
				return this.componentCode;
			}

			public void setComponentCode(String componentCode) {
				this.componentCode = componentCode;
			}

			public List<PropertiesItem> getProperties() {
				return this.properties;
			}

			public void setProperties(List<PropertiesItem> properties) {
				this.properties = properties;
			}

			public static class PropertiesItem {

				private String code;

				private String value;

				public String getCode() {
					return this.code;
				}

				public void setCode(String code) {
					this.code = code;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}
		}
	}

	@Override
	public Class<DescribeCommodityPriceResponse> getResponseClass() {
		return DescribeCommodityPriceResponse.class;
	}

}
