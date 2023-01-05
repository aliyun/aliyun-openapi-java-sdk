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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ga.transform.v20191120.DescribeCommodityPriceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCommodityPriceResponse extends AcsResponse {

	private String currency;

	private Double originalPrice;

	private Double discountPrice;

	private Double tradePrice;

	private String requestId;

	private List<OrderDetailsItem> orderDetails;

	private List<RuleDetailsItem> ruleDetails;

	private List<PromotionDetails> promotions;

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Double getOriginalPrice() {
		return this.originalPrice;
	}

	public void setOriginalPrice(Double originalPrice) {
		this.originalPrice = originalPrice;
	}

	public Double getDiscountPrice() {
		return this.discountPrice;
	}

	public void setDiscountPrice(Double discountPrice) {
		this.discountPrice = discountPrice;
	}

	public Double getTradePrice() {
		return this.tradePrice;
	}

	public void setTradePrice(Double tradePrice) {
		this.tradePrice = tradePrice;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<OrderDetailsItem> getOrderDetails() {
		return this.orderDetails;
	}

	public void setOrderDetails(List<OrderDetailsItem> orderDetails) {
		this.orderDetails = orderDetails;
	}

	public List<RuleDetailsItem> getRuleDetails() {
		return this.ruleDetails;
	}

	public void setRuleDetails(List<RuleDetailsItem> ruleDetails) {
		this.ruleDetails = ruleDetails;
	}

	public List<PromotionDetails> getPromotions() {
		return this.promotions;
	}

	public void setPromotions(List<PromotionDetails> promotions) {
		this.promotions = promotions;
	}

	public static class OrderDetailsItem {

		private String commodityCode;

		private String commodityName;

		private Double originalPrice;

		private Double discountPrice;

		private Double tradePrice;

		private Long quantity;

		private List<ModuleDetailsItem> moduleDetails;

		private List<PromDetailsItem> promDetails;

		private List<Long> ruleIds;

		public String getCommodityCode() {
			return this.commodityCode;
		}

		public void setCommodityCode(String commodityCode) {
			this.commodityCode = commodityCode;
		}

		public String getCommodityName() {
			return this.commodityName;
		}

		public void setCommodityName(String commodityName) {
			this.commodityName = commodityName;
		}

		public Double getOriginalPrice() {
			return this.originalPrice;
		}

		public void setOriginalPrice(Double originalPrice) {
			this.originalPrice = originalPrice;
		}

		public Double getDiscountPrice() {
			return this.discountPrice;
		}

		public void setDiscountPrice(Double discountPrice) {
			this.discountPrice = discountPrice;
		}

		public Double getTradePrice() {
			return this.tradePrice;
		}

		public void setTradePrice(Double tradePrice) {
			this.tradePrice = tradePrice;
		}

		public Long getQuantity() {
			return this.quantity;
		}

		public void setQuantity(Long quantity) {
			this.quantity = quantity;
		}

		public List<ModuleDetailsItem> getModuleDetails() {
			return this.moduleDetails;
		}

		public void setModuleDetails(List<ModuleDetailsItem> moduleDetails) {
			this.moduleDetails = moduleDetails;
		}

		public List<PromDetailsItem> getPromDetails() {
			return this.promDetails;
		}

		public void setPromDetails(List<PromDetailsItem> promDetails) {
			this.promDetails = promDetails;
		}

		public List<Long> getRuleIds() {
			return this.ruleIds;
		}

		public void setRuleIds(List<Long> ruleIds) {
			this.ruleIds = ruleIds;
		}

		public static class ModuleDetailsItem {

			private String moduleCode;

			private String moduleName;

			private Double originalPrice;

			private Double discountPrice;

			private Double tradePrice;

			public String getModuleCode() {
				return this.moduleCode;
			}

			public void setModuleCode(String moduleCode) {
				this.moduleCode = moduleCode;
			}

			public String getModuleName() {
				return this.moduleName;
			}

			public void setModuleName(String moduleName) {
				this.moduleName = moduleName;
			}

			public Double getOriginalPrice() {
				return this.originalPrice;
			}

			public void setOriginalPrice(Double originalPrice) {
				this.originalPrice = originalPrice;
			}

			public Double getDiscountPrice() {
				return this.discountPrice;
			}

			public void setDiscountPrice(Double discountPrice) {
				this.discountPrice = discountPrice;
			}

			public Double getTradePrice() {
				return this.tradePrice;
			}

			public void setTradePrice(Double tradePrice) {
				this.tradePrice = tradePrice;
			}
		}

		public static class PromDetailsItem {

			private String promotionId;

			private String promotionName;

			private Double finalPromFee;

			private String promType;

			private String optionCode;

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

			public Double getFinalPromFee() {
				return this.finalPromFee;
			}

			public void setFinalPromFee(Double finalPromFee) {
				this.finalPromFee = finalPromFee;
			}

			public String getPromType() {
				return this.promType;
			}

			public void setPromType(String promType) {
				this.promType = promType;
			}

			public String getOptionCode() {
				return this.optionCode;
			}

			public void setOptionCode(String optionCode) {
				this.optionCode = optionCode;
			}
		}
	}

	public static class RuleDetailsItem {

		private String ruleId;

		private String ruleName;

		public String getRuleId() {
			return this.ruleId;
		}

		public void setRuleId(String ruleId) {
			this.ruleId = ruleId;
		}

		public String getRuleName() {
			return this.ruleName;
		}

		public void setRuleName(String ruleName) {
			this.ruleName = ruleName;
		}
	}

	public static class PromotionDetails {

		private String promotionOptionNo;

		private String promotionName;

		private Double canPromFee;

		private Boolean selected;

		private String optionCode;

		public String getPromotionOptionNo() {
			return this.promotionOptionNo;
		}

		public void setPromotionOptionNo(String promotionOptionNo) {
			this.promotionOptionNo = promotionOptionNo;
		}

		public String getPromotionName() {
			return this.promotionName;
		}

		public void setPromotionName(String promotionName) {
			this.promotionName = promotionName;
		}

		public Double getCanPromFee() {
			return this.canPromFee;
		}

		public void setCanPromFee(Double canPromFee) {
			this.canPromFee = canPromFee;
		}

		public Boolean getSelected() {
			return this.selected;
		}

		public void setSelected(Boolean selected) {
			this.selected = selected;
		}

		public String getOptionCode() {
			return this.optionCode;
		}

		public void setOptionCode(String optionCode) {
			this.optionCode = optionCode;
		}
	}

	@Override
	public DescribeCommodityPriceResponse getInstance(UnmarshallerContext context) {
		return	DescribeCommodityPriceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
