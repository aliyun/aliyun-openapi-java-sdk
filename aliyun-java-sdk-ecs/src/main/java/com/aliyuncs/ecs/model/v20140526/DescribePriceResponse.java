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

package com.aliyuncs.ecs.model.v20140526;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.DescribePriceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePriceResponse extends AcsResponse {

	private String requestId;

	private PriceInfo priceInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public PriceInfo getPriceInfo() {
		return this.priceInfo;
	}

	public void setPriceInfo(PriceInfo priceInfo) {
		this.priceInfo = priceInfo;
	}

	public static class PriceInfo {

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

			private Float originalPrice;

			private Float discountPrice;

			private Float tradePrice;

			private Float reservedInstanceHourPrice;

			private String currency;

			private List<ResourcePriceModel> detailInfos;

			public Float getOriginalPrice() {
				return this.originalPrice;
			}

			public void setOriginalPrice(Float originalPrice) {
				this.originalPrice = originalPrice;
			}

			public Float getDiscountPrice() {
				return this.discountPrice;
			}

			public void setDiscountPrice(Float discountPrice) {
				this.discountPrice = discountPrice;
			}

			public Float getTradePrice() {
				return this.tradePrice;
			}

			public void setTradePrice(Float tradePrice) {
				this.tradePrice = tradePrice;
			}

			public Float getReservedInstanceHourPrice() {
				return this.reservedInstanceHourPrice;
			}

			public void setReservedInstanceHourPrice(Float reservedInstanceHourPrice) {
				this.reservedInstanceHourPrice = reservedInstanceHourPrice;
			}

			public String getCurrency() {
				return this.currency;
			}

			public void setCurrency(String currency) {
				this.currency = currency;
			}

			public List<ResourcePriceModel> getDetailInfos() {
				return this.detailInfos;
			}

			public void setDetailInfos(List<ResourcePriceModel> detailInfos) {
				this.detailInfos = detailInfos;
			}

			public static class ResourcePriceModel {

				private String resource;

				private Float originalPrice;

				private Float discountPrice;

				private Float tradePrice;

				private List<Rule1> subRules;

				public String getResource() {
					return this.resource;
				}

				public void setResource(String resource) {
					this.resource = resource;
				}

				public Float getOriginalPrice() {
					return this.originalPrice;
				}

				public void setOriginalPrice(Float originalPrice) {
					this.originalPrice = originalPrice;
				}

				public Float getDiscountPrice() {
					return this.discountPrice;
				}

				public void setDiscountPrice(Float discountPrice) {
					this.discountPrice = discountPrice;
				}

				public Float getTradePrice() {
					return this.tradePrice;
				}

				public void setTradePrice(Float tradePrice) {
					this.tradePrice = tradePrice;
				}

				public List<Rule1> getSubRules() {
					return this.subRules;
				}

				public void setSubRules(List<Rule1> subRules) {
					this.subRules = subRules;
				}

				public static class Rule1 {

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
			}
		}
	}

	@Override
	public DescribePriceResponse getInstance(UnmarshallerContext context) {
		return	DescribePriceResponseUnmarshaller.unmarshall(this, context);
	}
}
