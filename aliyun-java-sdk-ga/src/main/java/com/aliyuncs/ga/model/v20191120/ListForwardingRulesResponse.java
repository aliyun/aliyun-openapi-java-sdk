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
import com.aliyuncs.ga.transform.v20191120.ListForwardingRulesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListForwardingRulesResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private String nextToken;

	private Integer maxResults;

	private List<ForwardingRulesItem> forwardingRules;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public List<ForwardingRulesItem> getForwardingRules() {
		return this.forwardingRules;
	}

	public void setForwardingRules(List<ForwardingRulesItem> forwardingRules) {
		this.forwardingRules = forwardingRules;
	}

	public static class ForwardingRulesItem {

		private Integer priority;

		private String forwardingRuleId;

		private String forwardingRuleName;

		private String forwardingRuleDirection;

		private String forwardingRuleStatus;

		private String listenerId;

		private List<RuleConditionsItem> ruleConditions;

		private List<RuleActionsItem> ruleActions;

		public Integer getPriority() {
			return this.priority;
		}

		public void setPriority(Integer priority) {
			this.priority = priority;
		}

		public String getForwardingRuleId() {
			return this.forwardingRuleId;
		}

		public void setForwardingRuleId(String forwardingRuleId) {
			this.forwardingRuleId = forwardingRuleId;
		}

		public String getForwardingRuleName() {
			return this.forwardingRuleName;
		}

		public void setForwardingRuleName(String forwardingRuleName) {
			this.forwardingRuleName = forwardingRuleName;
		}

		public String getForwardingRuleDirection() {
			return this.forwardingRuleDirection;
		}

		public void setForwardingRuleDirection(String forwardingRuleDirection) {
			this.forwardingRuleDirection = forwardingRuleDirection;
		}

		public String getForwardingRuleStatus() {
			return this.forwardingRuleStatus;
		}

		public void setForwardingRuleStatus(String forwardingRuleStatus) {
			this.forwardingRuleStatus = forwardingRuleStatus;
		}

		public String getListenerId() {
			return this.listenerId;
		}

		public void setListenerId(String listenerId) {
			this.listenerId = listenerId;
		}

		public List<RuleConditionsItem> getRuleConditions() {
			return this.ruleConditions;
		}

		public void setRuleConditions(List<RuleConditionsItem> ruleConditions) {
			this.ruleConditions = ruleConditions;
		}

		public List<RuleActionsItem> getRuleActions() {
			return this.ruleActions;
		}

		public void setRuleActions(List<RuleActionsItem> ruleActions) {
			this.ruleActions = ruleActions;
		}

		public static class RuleConditionsItem {

			private String ruleConditionType;

			private String ruleConditionValue;

			private PathConfig pathConfig;

			private HostConfig hostConfig;

			public String getRuleConditionType() {
				return this.ruleConditionType;
			}

			public void setRuleConditionType(String ruleConditionType) {
				this.ruleConditionType = ruleConditionType;
			}

			public String getRuleConditionValue() {
				return this.ruleConditionValue;
			}

			public void setRuleConditionValue(String ruleConditionValue) {
				this.ruleConditionValue = ruleConditionValue;
			}

			public PathConfig getPathConfig() {
				return this.pathConfig;
			}

			public void setPathConfig(PathConfig pathConfig) {
				this.pathConfig = pathConfig;
			}

			public HostConfig getHostConfig() {
				return this.hostConfig;
			}

			public void setHostConfig(HostConfig hostConfig) {
				this.hostConfig = hostConfig;
			}

			public static class PathConfig {

				private List<String> values;

				public List<String> getValues() {
					return this.values;
				}

				public void setValues(List<String> values) {
					this.values = values;
				}
			}

			public static class HostConfig {

				private List<String> values1;

				public List<String> getValues1() {
					return this.values1;
				}

				public void setValues1(List<String> values1) {
					this.values1 = values1;
				}
			}
		}

		public static class RuleActionsItem {

			private Integer order;

			private String ruleActionType;

			private String ruleActionValue;

			private ForwardGroupConfig forwardGroupConfig;

			public Integer getOrder() {
				return this.order;
			}

			public void setOrder(Integer order) {
				this.order = order;
			}

			public String getRuleActionType() {
				return this.ruleActionType;
			}

			public void setRuleActionType(String ruleActionType) {
				this.ruleActionType = ruleActionType;
			}

			public String getRuleActionValue() {
				return this.ruleActionValue;
			}

			public void setRuleActionValue(String ruleActionValue) {
				this.ruleActionValue = ruleActionValue;
			}

			public ForwardGroupConfig getForwardGroupConfig() {
				return this.forwardGroupConfig;
			}

			public void setForwardGroupConfig(ForwardGroupConfig forwardGroupConfig) {
				this.forwardGroupConfig = forwardGroupConfig;
			}

			public static class ForwardGroupConfig {

				private List<ServerGroupTuplesItem> serverGroupTuples;

				public List<ServerGroupTuplesItem> getServerGroupTuples() {
					return this.serverGroupTuples;
				}

				public void setServerGroupTuples(List<ServerGroupTuplesItem> serverGroupTuples) {
					this.serverGroupTuples = serverGroupTuples;
				}

				public static class ServerGroupTuplesItem {

					private String endpointGroupId;

					public String getEndpointGroupId() {
						return this.endpointGroupId;
					}

					public void setEndpointGroupId(String endpointGroupId) {
						this.endpointGroupId = endpointGroupId;
					}
				}
			}
		}
	}

	@Override
	public ListForwardingRulesResponse getInstance(UnmarshallerContext context) {
		return	ListForwardingRulesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
