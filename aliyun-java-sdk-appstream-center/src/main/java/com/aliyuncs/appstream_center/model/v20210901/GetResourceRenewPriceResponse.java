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

package com.aliyuncs.appstream_center.model.v20210901;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.appstream_center.transform.v20210901.GetResourceRenewPriceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetResourceRenewPriceResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<Rule> rules;

		private Price price;

		public List<Rule> getRules() {
			return this.rules;
		}

		public void setRules(List<Rule> rules) {
			this.rules = rules;
		}

		public Price getPrice() {
			return this.price;
		}

		public void setPrice(Price price) {
			this.price = price;
		}

		public static class Rule {

			private Long ruleId;

			private String description;

			public Long getRuleId() {
				return this.ruleId;
			}

			public void setRuleId(Long ruleId) {
				this.ruleId = ruleId;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}
		}

		public static class Price {

			private String originalPrice;

			private String discountPrice;

			private String tradePrice;

			private String currency;

			private List<Promotion> promotions;

			public String getOriginalPrice() {
				return this.originalPrice;
			}

			public void setOriginalPrice(String originalPrice) {
				this.originalPrice = originalPrice;
			}

			public String getDiscountPrice() {
				return this.discountPrice;
			}

			public void setDiscountPrice(String discountPrice) {
				this.discountPrice = discountPrice;
			}

			public String getTradePrice() {
				return this.tradePrice;
			}

			public void setTradePrice(String tradePrice) {
				this.tradePrice = tradePrice;
			}

			public String getCurrency() {
				return this.currency;
			}

			public void setCurrency(String currency) {
				this.currency = currency;
			}

			public List<Promotion> getPromotions() {
				return this.promotions;
			}

			public void setPromotions(List<Promotion> promotions) {
				this.promotions = promotions;
			}

			public static class Promotion {

				private String optionCode;

				private String promotionId;

				private String promotionName;

				private String promotionDesc;

				private Boolean selected;

				public String getOptionCode() {
					return this.optionCode;
				}

				public void setOptionCode(String optionCode) {
					this.optionCode = optionCode;
				}

				public String getPromotionId() {
					return this.promotionId;
				}

				public void setPromotionId(String promotionId) {
					this.promotionId = promotionId;
				}

				public String getPromotionName() {
					return this.promotionName;
				}

				public void setPromotionName(String promotionName) {
					this.promotionName = promotionName;
				}

				public String getPromotionDesc() {
					return this.promotionDesc;
				}

				public void setPromotionDesc(String promotionDesc) {
					this.promotionDesc = promotionDesc;
				}

				public Boolean getSelected() {
					return this.selected;
				}

				public void setSelected(Boolean selected) {
					this.selected = selected;
				}
			}
		}
	}

	@Override
	public GetResourceRenewPriceResponse getInstance(UnmarshallerContext context) {
		return	GetResourceRenewPriceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
