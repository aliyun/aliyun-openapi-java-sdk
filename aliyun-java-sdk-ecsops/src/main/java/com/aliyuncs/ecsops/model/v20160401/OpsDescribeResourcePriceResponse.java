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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeResourcePriceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeResourcePriceResponse extends AcsResponse {

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

			private String title;

			private String name;

			public Long getRuleId() {
				return this.ruleId;
			}

			public void setRuleId(Long ruleId) {
				this.ruleId = ruleId;
			}

			public String getTitle() {
				return this.title;
			}

			public void setTitle(String title) {
				this.title = title;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}

		public static class Price {

			private Float originalPrice;

			private Float discountPrice;

			private Float tradePrice;

			private Float reservedInstanceHourPrice;

			private String currency;

			private List<String> ruleIdSet;

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

			public List<String> getRuleIdSet() {
				return this.ruleIdSet;
			}

			public void setRuleIdSet(List<String> ruleIdSet) {
				this.ruleIdSet = ruleIdSet;
			}
		}
	}

	@Override
	public OpsDescribeResourcePriceResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeResourcePriceResponseUnmarshaller.unmarshall(this, context);
	}
}
