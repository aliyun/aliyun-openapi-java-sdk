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

package com.aliyuncs.petadata.model.v20160101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.petadata.transform.v20160101.DescribePriceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePriceResponse extends AcsResponse {

	private String requestId;

	private List<Rule> rules;

	private Order order;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Rule> getRules() {
		return this.rules;
	}

	public void setRules(List<Rule> rules) {
		this.rules = rules;
	}

	public Order getOrder() {
		return this.order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public static class Rule {

		private Long ruleDescId;

		private String name;

		private String title;

		public Long getRuleDescId() {
			return this.ruleDescId;
		}

		public void setRuleDescId(Long ruleDescId) {
			this.ruleDescId = ruleDescId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}
	}

	public static class Order {

		private Float originalAmount;

		private Float tradeAmount;

		private Float discountAmount;

		private List<String> ruleIds;

		public Float getOriginalAmount() {
			return this.originalAmount;
		}

		public void setOriginalAmount(Float originalAmount) {
			this.originalAmount = originalAmount;
		}

		public Float getTradeAmount() {
			return this.tradeAmount;
		}

		public void setTradeAmount(Float tradeAmount) {
			this.tradeAmount = tradeAmount;
		}

		public Float getDiscountAmount() {
			return this.discountAmount;
		}

		public void setDiscountAmount(Float discountAmount) {
			this.discountAmount = discountAmount;
		}

		public List<String> getRuleIds() {
			return this.ruleIds;
		}

		public void setRuleIds(List<String> ruleIds) {
			this.ruleIds = ruleIds;
		}
	}

	@Override
	public DescribePriceResponse getInstance(UnmarshallerContext context) {
		return	DescribePriceResponseUnmarshaller.unmarshall(this, context);
	}
}
