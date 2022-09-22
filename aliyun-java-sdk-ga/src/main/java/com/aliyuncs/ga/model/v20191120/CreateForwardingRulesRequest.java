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

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ga.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateForwardingRulesRequest extends RpcAcsRequest<CreateForwardingRulesResponse> {
	   

	private String clientToken;

	private String listenerId;

	private String acceleratorId;

	private List<ForwardingRules> forwardingRules;
	public CreateForwardingRulesRequest() {
		super("Ga", "2019-11-20", "CreateForwardingRules", "gaplus");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getListenerId() {
		return this.listenerId;
	}

	public void setListenerId(String listenerId) {
		this.listenerId = listenerId;
		if(listenerId != null){
			putQueryParameter("ListenerId", listenerId);
		}
	}

	public String getAcceleratorId() {
		return this.acceleratorId;
	}

	public void setAcceleratorId(String acceleratorId) {
		this.acceleratorId = acceleratorId;
		if(acceleratorId != null){
			putQueryParameter("AcceleratorId", acceleratorId);
		}
	}

	public List<ForwardingRules> getForwardingRules() {
		return this.forwardingRules;
	}

	public void setForwardingRules(List<ForwardingRules> forwardingRules) {
		this.forwardingRules = forwardingRules;	
		if (forwardingRules != null) {
			for (int depth1 = 0; depth1 < forwardingRules.size(); depth1++) {
				if (forwardingRules.get(depth1) != null) {
					
						putQueryParameter("ForwardingRules." + (depth1 + 1) + ".Priority" , forwardingRules.get(depth1).getPriority());
						if (forwardingRules.get(depth1).getRuleConditions() != null) {
							for (int depth2 = 0; depth2 < forwardingRules.get(depth1).getRuleConditions().size(); depth2++) {
								if (forwardingRules.get(depth1).getRuleConditions().get(depth2) != null) {
									
										putQueryParameter("ForwardingRules." + (depth1 + 1) + ".RuleConditions." + (depth2 + 1) + ".RuleConditionType" , forwardingRules.get(depth1).getRuleConditions().get(depth2).getRuleConditionType());
										putQueryParameter("ForwardingRules." + (depth1 + 1) + ".RuleConditions." + (depth2 + 1) + ".RuleConditionValue" , forwardingRules.get(depth1).getRuleConditions().get(depth2).getRuleConditionValue());
										if (forwardingRules.get(depth1).getRuleConditions().get(depth2).getPathConfig() != null) {
											
												if (forwardingRules.get(depth1).getRuleConditions().get(depth2).getPathConfig().getValues() != null) {
													for (int depth3 = 0; depth3 < forwardingRules.get(depth1).getRuleConditions().get(depth2).getPathConfig().getValues().size(); depth3++) {
														putQueryParameter("ForwardingRules." + (depth1 + 1) + ".RuleConditions." + (depth2 + 1) + ".PathConfig.Values." + (depth3 + 1) , forwardingRules.get(depth1).getRuleConditions().get(depth2).getPathConfig().getValues().get(depth3));
													}
												}
										}
										if (forwardingRules.get(depth1).getRuleConditions().get(depth2).getHostConfig() != null) {
											
												if (forwardingRules.get(depth1).getRuleConditions().get(depth2).getHostConfig().getValues() != null) {
													for (int depth3 = 0; depth3 < forwardingRules.get(depth1).getRuleConditions().get(depth2).getHostConfig().getValues().size(); depth3++) {
														putQueryParameter("ForwardingRules." + (depth1 + 1) + ".RuleConditions." + (depth2 + 1) + ".HostConfig.Values." + (depth3 + 1) , forwardingRules.get(depth1).getRuleConditions().get(depth2).getHostConfig().getValues().get(depth3));
													}
												}
										}
								}
							}
						}
						if (forwardingRules.get(depth1).getRuleActions() != null) {
							for (int depth2 = 0; depth2 < forwardingRules.get(depth1).getRuleActions().size(); depth2++) {
								if (forwardingRules.get(depth1).getRuleActions().get(depth2) != null) {
									
										putQueryParameter("ForwardingRules." + (depth1 + 1) + ".RuleActions." + (depth2 + 1) + ".Order" , forwardingRules.get(depth1).getRuleActions().get(depth2).getOrder());
										putQueryParameter("ForwardingRules." + (depth1 + 1) + ".RuleActions." + (depth2 + 1) + ".RuleActionType" , forwardingRules.get(depth1).getRuleActions().get(depth2).getRuleActionType());
										putQueryParameter("ForwardingRules." + (depth1 + 1) + ".RuleActions." + (depth2 + 1) + ".RuleActionValue" , forwardingRules.get(depth1).getRuleActions().get(depth2).getRuleActionValue());
										if (forwardingRules.get(depth1).getRuleActions().get(depth2).getForwardGroupConfig() != null) {
											
												if (forwardingRules.get(depth1).getRuleActions().get(depth2).getForwardGroupConfig().getServerGroupTuples() != null) {
													for (int depth3 = 0; depth3 < forwardingRules.get(depth1).getRuleActions().get(depth2).getForwardGroupConfig().getServerGroupTuples().size(); depth3++) {
														if (forwardingRules.get(depth1).getRuleActions().get(depth2).getForwardGroupConfig().getServerGroupTuples().get(depth3) != null) {
															
																putQueryParameter("ForwardingRules." + (depth1 + 1) + ".RuleActions." + (depth2 + 1) + ".ForwardGroupConfig.ServerGroupTuples." + (depth3 + 1) + ".EndpointGroupId" , forwardingRules.get(depth1).getRuleActions().get(depth2).getForwardGroupConfig().getServerGroupTuples().get(depth3).getEndpointGroupId());
														}
													}
												}
										}
								}
							}
						}
						putQueryParameter("ForwardingRules." + (depth1 + 1) + ".ForwardingRuleName" , forwardingRules.get(depth1).getForwardingRuleName());
						putQueryParameter("ForwardingRules." + (depth1 + 1) + ".RuleDirection" , forwardingRules.get(depth1).getRuleDirection());
				}
			}
		}	
	}

	public static class ForwardingRules {

		private Integer priority;

		private List<RuleConditionsItem> ruleConditions;

		private List<RuleActionsItem> ruleActions;

		private String forwardingRuleName;

		private String ruleDirection;

		public Integer getPriority() {
			return this.priority;
		}

		public void setPriority(Integer priority) {
			this.priority = priority;
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

		public String getForwardingRuleName() {
			return this.forwardingRuleName;
		}

		public void setForwardingRuleName(String forwardingRuleName) {
			this.forwardingRuleName = forwardingRuleName;
		}

		public String getRuleDirection() {
			return this.ruleDirection;
		}

		public void setRuleDirection(String ruleDirection) {
			this.ruleDirection = ruleDirection;
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

				private List<String> values;

				public List<String> getValues() {
					return this.values;
				}

				public void setValues(List<String> values) {
					this.values = values;
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
	public Class<CreateForwardingRulesResponse> getResponseClass() {
		return CreateForwardingRulesResponse.class;
	}

}
