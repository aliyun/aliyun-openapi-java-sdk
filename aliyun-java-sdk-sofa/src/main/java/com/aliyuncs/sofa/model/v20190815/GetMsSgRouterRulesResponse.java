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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.GetMsSgRouterRulesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetMsSgRouterRulesResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private RouterRuleGroupModel routerRuleGroupModel;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public RouterRuleGroupModel getRouterRuleGroupModel() {
		return this.routerRuleGroupModel;
	}

	public void setRouterRuleGroupModel(RouterRuleGroupModel routerRuleGroupModel) {
		this.routerRuleGroupModel = routerRuleGroupModel;
	}

	public static class RouterRuleGroupModel {

		private String appName;

		private String dataId;

		private Long dispatchVersion;

		private Long enabled;

		private String gmtModified;

		private Long id;

		private String instanceId;

		private String operator;

		private String type;

		private List<RulesItem> rules;

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public String getDataId() {
			return this.dataId;
		}

		public void setDataId(String dataId) {
			this.dataId = dataId;
		}

		public Long getDispatchVersion() {
			return this.dispatchVersion;
		}

		public void setDispatchVersion(Long dispatchVersion) {
			this.dispatchVersion = dispatchVersion;
		}

		public Long getEnabled() {
			return this.enabled;
		}

		public void setEnabled(Long enabled) {
			this.enabled = enabled;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getOperator() {
			return this.operator;
		}

		public void setOperator(String operator) {
			this.operator = operator;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public List<RulesItem> getRules() {
			return this.rules;
		}

		public void setRules(List<RulesItem> rules) {
			this.rules = rules;
		}

		public static class RulesItem {

			private Long enabled;

			private Long fallback;

			private Long faultProtection;

			private Long gmtModified;

			private String name;

			private Long orderNum;

			private List<ConditionsItem> conditions;

			private List<DestinationsItem> destinations;

			private List<GraysItem> grays;

			public Long getEnabled() {
				return this.enabled;
			}

			public void setEnabled(Long enabled) {
				this.enabled = enabled;
			}

			public Long getFallback() {
				return this.fallback;
			}

			public void setFallback(Long fallback) {
				this.fallback = fallback;
			}

			public Long getFaultProtection() {
				return this.faultProtection;
			}

			public void setFaultProtection(Long faultProtection) {
				this.faultProtection = faultProtection;
			}

			public Long getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(Long gmtModified) {
				this.gmtModified = gmtModified;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Long getOrderNum() {
				return this.orderNum;
			}

			public void setOrderNum(Long orderNum) {
				this.orderNum = orderNum;
			}

			public List<ConditionsItem> getConditions() {
				return this.conditions;
			}

			public void setConditions(List<ConditionsItem> conditions) {
				this.conditions = conditions;
			}

			public List<DestinationsItem> getDestinations() {
				return this.destinations;
			}

			public void setDestinations(List<DestinationsItem> destinations) {
				this.destinations = destinations;
			}

			public List<GraysItem> getGrays() {
				return this.grays;
			}

			public void setGrays(List<GraysItem> grays) {
				this.grays = grays;
			}

			public static class ConditionsItem {

				private String field;

				private String operation;

				private String type;

				private List<String> value;

				public String getField() {
					return this.field;
				}

				public void setField(String field) {
					this.field = field;
				}

				public String getOperation() {
					return this.operation;
				}

				public void setOperation(String operation) {
					this.operation = operation;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public List<String> getValue() {
					return this.value;
				}

				public void setValue(List<String> value) {
					this.value = value;
				}
			}

			public static class DestinationsItem {

				private Long weight;

				private List<DestinationItem> destination;

				public Long getWeight() {
					return this.weight;
				}

				public void setWeight(Long weight) {
					this.weight = weight;
				}

				public List<DestinationItem> getDestination() {
					return this.destination;
				}

				public void setDestination(List<DestinationItem> destination) {
					this.destination = destination;
				}

				public static class DestinationItem {

					private String field;

					private String operation;

					private String type;

					private List<String> value1;

					public String getField() {
						return this.field;
					}

					public void setField(String field) {
						this.field = field;
					}

					public String getOperation() {
						return this.operation;
					}

					public void setOperation(String operation) {
						this.operation = operation;
					}

					public String getType() {
						return this.type;
					}

					public void setType(String type) {
						this.type = type;
					}

					public List<String> getValue1() {
						return this.value1;
					}

					public void setValue1(List<String> value1) {
						this.value1 = value1;
					}
				}
			}

			public static class GraysItem {

				private String field;

				private String operation;

				private String type;

				private List<String> value2;

				public String getField() {
					return this.field;
				}

				public void setField(String field) {
					this.field = field;
				}

				public String getOperation() {
					return this.operation;
				}

				public void setOperation(String operation) {
					this.operation = operation;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public List<String> getValue2() {
					return this.value2;
				}

				public void setValue2(List<String> value2) {
					this.value2 = value2;
				}
			}
		}
	}

	@Override
	public GetMsSgRouterRulesResponse getInstance(UnmarshallerContext context) {
		return	GetMsSgRouterRulesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
