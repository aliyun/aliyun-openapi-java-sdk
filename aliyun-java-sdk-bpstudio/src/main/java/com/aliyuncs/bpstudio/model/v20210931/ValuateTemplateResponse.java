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

package com.aliyuncs.bpstudio.model.v20210931;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.bpstudio.transform.v20210931.ValuateTemplateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ValuateTemplateResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String code;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<Item> resourceList;

		public List<Item> getResourceList() {
			return this.resourceList;
		}

		public void setResourceList(List<Item> resourceList) {
			this.resourceList = resourceList;
		}

		public static class Item {

			private String nodeType;

			private String error;

			private Double tradePrice;

			private Double discountAmount;

			private Double originalPrice;

			private String promotionName;

			private String priceUnit;

			private List<Item1> priceList;

			public String getNodeType() {
				return this.nodeType;
			}

			public void setNodeType(String nodeType) {
				this.nodeType = nodeType;
			}

			public String getError() {
				return this.error;
			}

			public void setError(String error) {
				this.error = error;
			}

			public Double getTradePrice() {
				return this.tradePrice;
			}

			public void setTradePrice(Double tradePrice) {
				this.tradePrice = tradePrice;
			}

			public Double getDiscountAmount() {
				return this.discountAmount;
			}

			public void setDiscountAmount(Double discountAmount) {
				this.discountAmount = discountAmount;
			}

			public Double getOriginalPrice() {
				return this.originalPrice;
			}

			public void setOriginalPrice(Double originalPrice) {
				this.originalPrice = originalPrice;
			}

			public String getPromotionName() {
				return this.promotionName;
			}

			public void setPromotionName(String promotionName) {
				this.promotionName = promotionName;
			}

			public String getPriceUnit() {
				return this.priceUnit;
			}

			public void setPriceUnit(String priceUnit) {
				this.priceUnit = priceUnit;
			}

			public List<Item1> getPriceList() {
				return this.priceList;
			}

			public void setPriceList(List<Item1> priceList) {
				this.priceList = priceList;
			}

			public static class Item1 {

				private String nodeType;

				private String resourceId;

				private String error;

				private Float tradePrice;

				private Float discountAmount;

				private Float originalPrice;

				private String promotionName;

				private String priceUnit;

				private String type;

				public String getNodeType() {
					return this.nodeType;
				}

				public void setNodeType(String nodeType) {
					this.nodeType = nodeType;
				}

				public String getResourceId() {
					return this.resourceId;
				}

				public void setResourceId(String resourceId) {
					this.resourceId = resourceId;
				}

				public String getError() {
					return this.error;
				}

				public void setError(String error) {
					this.error = error;
				}

				public Float getTradePrice() {
					return this.tradePrice;
				}

				public void setTradePrice(Float tradePrice) {
					this.tradePrice = tradePrice;
				}

				public Float getDiscountAmount() {
					return this.discountAmount;
				}

				public void setDiscountAmount(Float discountAmount) {
					this.discountAmount = discountAmount;
				}

				public Float getOriginalPrice() {
					return this.originalPrice;
				}

				public void setOriginalPrice(Float originalPrice) {
					this.originalPrice = originalPrice;
				}

				public String getPromotionName() {
					return this.promotionName;
				}

				public void setPromotionName(String promotionName) {
					this.promotionName = promotionName;
				}

				public String getPriceUnit() {
					return this.priceUnit;
				}

				public void setPriceUnit(String priceUnit) {
					this.priceUnit = priceUnit;
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

	@Override
	public ValuateTemplateResponse getInstance(UnmarshallerContext context) {
		return	ValuateTemplateResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
