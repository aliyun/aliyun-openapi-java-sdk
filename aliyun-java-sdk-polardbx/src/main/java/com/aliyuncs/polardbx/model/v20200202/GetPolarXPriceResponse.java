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

package com.aliyuncs.polardbx.model.v20200202;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.polardbx.transform.v20200202.GetPolarXPriceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetPolarXPriceResponse extends AcsResponse {

	private String requestId;

	private List<OrderPrice> orderPriceList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<OrderPrice> getOrderPriceList() {
		return this.orderPriceList;
	}

	public void setOrderPriceList(List<OrderPrice> orderPriceList) {
		this.orderPriceList = orderPriceList;
	}

	public static class OrderPrice {

		private String dBInstanceName;

		private String totalCostAmount;

		private String discountAmount;

		private String tradeAmount;

		private String originalAmount;

		private String payType;

		private List<Rule> rules;

		public String getDBInstanceName() {
			return this.dBInstanceName;
		}

		public void setDBInstanceName(String dBInstanceName) {
			this.dBInstanceName = dBInstanceName;
		}

		public String getTotalCostAmount() {
			return this.totalCostAmount;
		}

		public void setTotalCostAmount(String totalCostAmount) {
			this.totalCostAmount = totalCostAmount;
		}

		public String getDiscountAmount() {
			return this.discountAmount;
		}

		public void setDiscountAmount(String discountAmount) {
			this.discountAmount = discountAmount;
		}

		public String getTradeAmount() {
			return this.tradeAmount;
		}

		public void setTradeAmount(String tradeAmount) {
			this.tradeAmount = tradeAmount;
		}

		public String getOriginalAmount() {
			return this.originalAmount;
		}

		public void setOriginalAmount(String originalAmount) {
			this.originalAmount = originalAmount;
		}

		public String getPayType() {
			return this.payType;
		}

		public void setPayType(String payType) {
			this.payType = payType;
		}

		public List<Rule> getRules() {
			return this.rules;
		}

		public void setRules(List<Rule> rules) {
			this.rules = rules;
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
	}

	@Override
	public GetPolarXPriceResponse getInstance(UnmarshallerContext context) {
		return	GetPolarXPriceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
