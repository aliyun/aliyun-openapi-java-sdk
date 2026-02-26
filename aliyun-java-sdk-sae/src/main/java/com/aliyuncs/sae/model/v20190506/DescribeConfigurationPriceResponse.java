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

package com.aliyuncs.sae.model.v20190506;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sae.transform.v20190506.DescribeConfigurationPriceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeConfigurationPriceResponse extends AcsResponse {

	private String requestId;

	private String message;

	private String traceId;

	private String errorCode;

	private String code;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getTraceId() {
		return this.traceId;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<Rule> rules;

		private BagUsage bagUsage;

		private Order order;

		private RequestPrice requestPrice;

		private TrafficPrice trafficPrice;

		private CpuMemPrice cpuMemPrice;

		public List<Rule> getRules() {
			return this.rules;
		}

		public void setRules(List<Rule> rules) {
			this.rules = rules;
		}

		public BagUsage getBagUsage() {
			return this.bagUsage;
		}

		public void setBagUsage(BagUsage bagUsage) {
			this.bagUsage = bagUsage;
		}

		public Order getOrder() {
			return this.order;
		}

		public void setOrder(Order order) {
			this.order = order;
		}

		public RequestPrice getRequestPrice() {
			return this.requestPrice;
		}

		public void setRequestPrice(RequestPrice requestPrice) {
			this.requestPrice = requestPrice;
		}

		public TrafficPrice getTrafficPrice() {
			return this.trafficPrice;
		}

		public void setTrafficPrice(TrafficPrice trafficPrice) {
			this.trafficPrice = trafficPrice;
		}

		public CpuMemPrice getCpuMemPrice() {
			return this.cpuMemPrice;
		}

		public void setCpuMemPrice(CpuMemPrice cpuMemPrice) {
			this.cpuMemPrice = cpuMemPrice;
		}

		public static class Rule {

			private Long ruleDescId;

			private String name;

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
		}

		public static class BagUsage {

			private Float cpu;

			private Float mem;

			public Float getCpu() {
				return this.cpu;
			}

			public void setCpu(Float cpu) {
				this.cpu = cpu;
			}

			public Float getMem() {
				return this.mem;
			}

			public void setMem(Float mem) {
				this.mem = mem;
			}
		}

		public static class Order {

			private Float originalAmount;

			private Float discountAmount;

			private Float tradeAmount;

			private List<String> ruleIds;

			public Float getOriginalAmount() {
				return this.originalAmount;
			}

			public void setOriginalAmount(Float originalAmount) {
				this.originalAmount = originalAmount;
			}

			public Float getDiscountAmount() {
				return this.discountAmount;
			}

			public void setDiscountAmount(Float discountAmount) {
				this.discountAmount = discountAmount;
			}

			public Float getTradeAmount() {
				return this.tradeAmount;
			}

			public void setTradeAmount(Float tradeAmount) {
				this.tradeAmount = tradeAmount;
			}

			public List<String> getRuleIds() {
				return this.ruleIds;
			}

			public void setRuleIds(List<String> ruleIds) {
				this.ruleIds = ruleIds;
			}
		}

		public static class RequestPrice {

			private List<Rule3> rules2;

			private Order1 order1;

			public List<Rule3> getRules2() {
				return this.rules2;
			}

			public void setRules2(List<Rule3> rules2) {
				this.rules2 = rules2;
			}

			public Order1 getOrder1() {
				return this.order1;
			}

			public void setOrder1(Order1 order1) {
				this.order1 = order1;
			}

			public static class Rule3 {

				private Long ruleDescId;

				private String name;

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
			}

			public static class Order1 {

				private Float originalAmount;

				private Float discountAmount;

				private Float tradeAmount;

				private List<String> ruleIds4;

				public Float getOriginalAmount() {
					return this.originalAmount;
				}

				public void setOriginalAmount(Float originalAmount) {
					this.originalAmount = originalAmount;
				}

				public Float getDiscountAmount() {
					return this.discountAmount;
				}

				public void setDiscountAmount(Float discountAmount) {
					this.discountAmount = discountAmount;
				}

				public Float getTradeAmount() {
					return this.tradeAmount;
				}

				public void setTradeAmount(Float tradeAmount) {
					this.tradeAmount = tradeAmount;
				}

				public List<String> getRuleIds4() {
					return this.ruleIds4;
				}

				public void setRuleIds4(List<String> ruleIds4) {
					this.ruleIds4 = ruleIds4;
				}
			}
		}

		public static class TrafficPrice {

			private List<Rule7> rules6;

			private Order5 order5;

			public List<Rule7> getRules6() {
				return this.rules6;
			}

			public void setRules6(List<Rule7> rules6) {
				this.rules6 = rules6;
			}

			public Order5 getOrder5() {
				return this.order5;
			}

			public void setOrder5(Order5 order5) {
				this.order5 = order5;
			}

			public static class Rule7 {

				private Float ruleDescId;

				private String name;

				public Float getRuleDescId() {
					return this.ruleDescId;
				}

				public void setRuleDescId(Float ruleDescId) {
					this.ruleDescId = ruleDescId;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}
			}

			public static class Order5 {

				private Float originalAmount;

				private Float discountAmount;

				private Float tradeAmount;

				private List<String> ruleIds8;

				public Float getOriginalAmount() {
					return this.originalAmount;
				}

				public void setOriginalAmount(Float originalAmount) {
					this.originalAmount = originalAmount;
				}

				public Float getDiscountAmount() {
					return this.discountAmount;
				}

				public void setDiscountAmount(Float discountAmount) {
					this.discountAmount = discountAmount;
				}

				public Float getTradeAmount() {
					return this.tradeAmount;
				}

				public void setTradeAmount(Float tradeAmount) {
					this.tradeAmount = tradeAmount;
				}

				public List<String> getRuleIds8() {
					return this.ruleIds8;
				}

				public void setRuleIds8(List<String> ruleIds8) {
					this.ruleIds8 = ruleIds8;
				}
			}
		}

		public static class CpuMemPrice {

			private List<Rule11> rules10;

			private Order9 order9;

			public List<Rule11> getRules10() {
				return this.rules10;
			}

			public void setRules10(List<Rule11> rules10) {
				this.rules10 = rules10;
			}

			public Order9 getOrder9() {
				return this.order9;
			}

			public void setOrder9(Order9 order9) {
				this.order9 = order9;
			}

			public static class Rule11 {

				private Float ruleDescId;

				private String name;

				public Float getRuleDescId() {
					return this.ruleDescId;
				}

				public void setRuleDescId(Float ruleDescId) {
					this.ruleDescId = ruleDescId;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}
			}

			public static class Order9 {

				private Float originalAmount;

				private Float discountAmount;

				private Float tradeAmount;

				private List<String> ruleIds12;

				public Float getOriginalAmount() {
					return this.originalAmount;
				}

				public void setOriginalAmount(Float originalAmount) {
					this.originalAmount = originalAmount;
				}

				public Float getDiscountAmount() {
					return this.discountAmount;
				}

				public void setDiscountAmount(Float discountAmount) {
					this.discountAmount = discountAmount;
				}

				public Float getTradeAmount() {
					return this.tradeAmount;
				}

				public void setTradeAmount(Float tradeAmount) {
					this.tradeAmount = tradeAmount;
				}

				public List<String> getRuleIds12() {
					return this.ruleIds12;
				}

				public void setRuleIds12(List<String> ruleIds12) {
					this.ruleIds12 = ruleIds12;
				}
			}
		}
	}

	@Override
	public DescribeConfigurationPriceResponse getInstance(UnmarshallerContext context) {
		return	DescribeConfigurationPriceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
