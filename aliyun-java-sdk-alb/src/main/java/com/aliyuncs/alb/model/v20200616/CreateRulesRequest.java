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

package com.aliyuncs.alb.model.v20200616;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.alb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateRulesRequest extends RpcAcsRequest<CreateRulesResponse> {
	   

	private String clientToken;

	private List<Rules> rules;

	private String listenerId;

	private Boolean dryRun;
	public CreateRulesRequest() {
		super("Alb", "2020-06-16", "CreateRules", "alb");
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

	public List<Rules> getRules() {
		return this.rules;
	}

	public void setRules(List<Rules> rules) {
		this.rules = rules;	
		if (rules != null) {
			for (int depth1 = 0; depth1 < rules.size(); depth1++) {
				if (rules.get(depth1) != null) {
					
						if (rules.get(depth1).getRuleConditions() != null) {
							for (int depth2 = 0; depth2 < rules.get(depth1).getRuleConditions().size(); depth2++) {
								if (rules.get(depth1).getRuleConditions().get(depth2) != null) {
									
										if (rules.get(depth1).getRuleConditions().get(depth2).getMethodConfig() != null) {
											
												if (rules.get(depth1).getRuleConditions().get(depth2).getMethodConfig().getValues() != null) {
													for (int depth3 = 0; depth3 < rules.get(depth1).getRuleConditions().get(depth2).getMethodConfig().getValues().size(); depth3++) {
														putBodyParameter("Rules." + (depth1 + 1) + ".RuleConditions." + (depth2 + 1) + ".MethodConfig.Values." + (depth3 + 1) , rules.get(depth1).getRuleConditions().get(depth2).getMethodConfig().getValues().get(depth3));
													}
												}
										}
										if (rules.get(depth1).getRuleConditions().get(depth2).getSourceIpConfig() != null) {
											
												if (rules.get(depth1).getRuleConditions().get(depth2).getSourceIpConfig().getValues() != null) {
													for (int depth3 = 0; depth3 < rules.get(depth1).getRuleConditions().get(depth2).getSourceIpConfig().getValues().size(); depth3++) {
														putBodyParameter("Rules." + (depth1 + 1) + ".RuleConditions." + (depth2 + 1) + ".SourceIpConfig.Values." + (depth3 + 1) , rules.get(depth1).getRuleConditions().get(depth2).getSourceIpConfig().getValues().get(depth3));
													}
												}
										}
										if (rules.get(depth1).getRuleConditions().get(depth2).getHostConfig() != null) {
											
												if (rules.get(depth1).getRuleConditions().get(depth2).getHostConfig().getValues() != null) {
													for (int depth3 = 0; depth3 < rules.get(depth1).getRuleConditions().get(depth2).getHostConfig().getValues().size(); depth3++) {
														putBodyParameter("Rules." + (depth1 + 1) + ".RuleConditions." + (depth2 + 1) + ".HostConfig.Values." + (depth3 + 1) , rules.get(depth1).getRuleConditions().get(depth2).getHostConfig().getValues().get(depth3));
													}
												}
										}
										if (rules.get(depth1).getRuleConditions().get(depth2).getQueryStringConfig() != null) {
											
												if (rules.get(depth1).getRuleConditions().get(depth2).getQueryStringConfig().getValues() != null) {
													for (int depth3 = 0; depth3 < rules.get(depth1).getRuleConditions().get(depth2).getQueryStringConfig().getValues().size(); depth3++) {
														if (rules.get(depth1).getRuleConditions().get(depth2).getQueryStringConfig().getValues().get(depth3) != null) {
															
																putBodyParameter("Rules." + (depth1 + 1) + ".RuleConditions." + (depth2 + 1) + ".QueryStringConfig.Values." + (depth3 + 1) + ".Value" , rules.get(depth1).getRuleConditions().get(depth2).getQueryStringConfig().getValues().get(depth3).getValue());
																putBodyParameter("Rules." + (depth1 + 1) + ".RuleConditions." + (depth2 + 1) + ".QueryStringConfig.Values." + (depth3 + 1) + ".Key" , rules.get(depth1).getRuleConditions().get(depth2).getQueryStringConfig().getValues().get(depth3).getKey());
														}
													}
												}
										}
										if (rules.get(depth1).getRuleConditions().get(depth2).getResponseStatusCodeConfig() != null) {
											
												if (rules.get(depth1).getRuleConditions().get(depth2).getResponseStatusCodeConfig().getValues() != null) {
													for (int depth3 = 0; depth3 < rules.get(depth1).getRuleConditions().get(depth2).getResponseStatusCodeConfig().getValues().size(); depth3++) {
														putBodyParameter("Rules." + (depth1 + 1) + ".RuleConditions." + (depth2 + 1) + ".ResponseStatusCodeConfig.Values." + (depth3 + 1) , rules.get(depth1).getRuleConditions().get(depth2).getResponseStatusCodeConfig().getValues().get(depth3));
													}
												}
										}
										if (rules.get(depth1).getRuleConditions().get(depth2).getPathConfig() != null) {
											
												if (rules.get(depth1).getRuleConditions().get(depth2).getPathConfig().getValues() != null) {
													for (int depth3 = 0; depth3 < rules.get(depth1).getRuleConditions().get(depth2).getPathConfig().getValues().size(); depth3++) {
														putBodyParameter("Rules." + (depth1 + 1) + ".RuleConditions." + (depth2 + 1) + ".PathConfig.Values." + (depth3 + 1) , rules.get(depth1).getRuleConditions().get(depth2).getPathConfig().getValues().get(depth3));
													}
												}
										}
										if (rules.get(depth1).getRuleConditions().get(depth2).getCookieConfig() != null) {
											
												if (rules.get(depth1).getRuleConditions().get(depth2).getCookieConfig().getValues() != null) {
													for (int depth3 = 0; depth3 < rules.get(depth1).getRuleConditions().get(depth2).getCookieConfig().getValues().size(); depth3++) {
														if (rules.get(depth1).getRuleConditions().get(depth2).getCookieConfig().getValues().get(depth3) != null) {
															
																putBodyParameter("Rules." + (depth1 + 1) + ".RuleConditions." + (depth2 + 1) + ".CookieConfig.Values." + (depth3 + 1) + ".Value" , rules.get(depth1).getRuleConditions().get(depth2).getCookieConfig().getValues().get(depth3).getValue());
																putBodyParameter("Rules." + (depth1 + 1) + ".RuleConditions." + (depth2 + 1) + ".CookieConfig.Values." + (depth3 + 1) + ".Key" , rules.get(depth1).getRuleConditions().get(depth2).getCookieConfig().getValues().get(depth3).getKey());
														}
													}
												}
										}
										putBodyParameter("Rules." + (depth1 + 1) + ".RuleConditions." + (depth2 + 1) + ".Type" , rules.get(depth1).getRuleConditions().get(depth2).getType());
										if (rules.get(depth1).getRuleConditions().get(depth2).getHeaderConfig() != null) {
											
												if (rules.get(depth1).getRuleConditions().get(depth2).getHeaderConfig().getValues() != null) {
													for (int depth3 = 0; depth3 < rules.get(depth1).getRuleConditions().get(depth2).getHeaderConfig().getValues().size(); depth3++) {
														putBodyParameter("Rules." + (depth1 + 1) + ".RuleConditions." + (depth2 + 1) + ".HeaderConfig.Values." + (depth3 + 1) , rules.get(depth1).getRuleConditions().get(depth2).getHeaderConfig().getValues().get(depth3));
													}
												}
												putBodyParameter("Rules." + (depth1 + 1) + ".RuleConditions." + (depth2 + 1) + ".HeaderConfig.Key" , rules.get(depth1).getRuleConditions().get(depth2).getHeaderConfig().getKey());
										}
										if (rules.get(depth1).getRuleConditions().get(depth2).getResponseHeaderConfig() != null) {
											
												if (rules.get(depth1).getRuleConditions().get(depth2).getResponseHeaderConfig().getValues() != null) {
													for (int depth3 = 0; depth3 < rules.get(depth1).getRuleConditions().get(depth2).getResponseHeaderConfig().getValues().size(); depth3++) {
														putBodyParameter("Rules." + (depth1 + 1) + ".RuleConditions." + (depth2 + 1) + ".ResponseHeaderConfig.Values." + (depth3 + 1) , rules.get(depth1).getRuleConditions().get(depth2).getResponseHeaderConfig().getValues().get(depth3));
													}
												}
												putBodyParameter("Rules." + (depth1 + 1) + ".RuleConditions." + (depth2 + 1) + ".ResponseHeaderConfig.Key" , rules.get(depth1).getRuleConditions().get(depth2).getResponseHeaderConfig().getKey());
										}
								}
							}
						}
						putBodyParameter("Rules." + (depth1 + 1) + ".RuleName" , rules.get(depth1).getRuleName());
						if (rules.get(depth1).getTag() != null) {
							for (int depth2 = 0; depth2 < rules.get(depth1).getTag().size(); depth2++) {
								if (rules.get(depth1).getTag().get(depth2) != null) {
									
										putBodyParameter("Rules." + (depth1 + 1) + ".Tag." + (depth2 + 1) + ".Value" , rules.get(depth1).getTag().get(depth2).getValue());
										putBodyParameter("Rules." + (depth1 + 1) + ".Tag." + (depth2 + 1) + ".Key" , rules.get(depth1).getTag().get(depth2).getKey());
								}
							}
						}
						putBodyParameter("Rules." + (depth1 + 1) + ".Priority" , rules.get(depth1).getPriority());
						if (rules.get(depth1).getRuleActions() != null) {
							for (int depth2 = 0; depth2 < rules.get(depth1).getRuleActions().size(); depth2++) {
								if (rules.get(depth1).getRuleActions().get(depth2) != null) {
									
										if (rules.get(depth1).getRuleActions().get(depth2).getFixedResponseConfig() != null) {
											
												putBodyParameter("Rules." + (depth1 + 1) + ".RuleActions." + (depth2 + 1) + ".FixedResponseConfig.HttpCode" , rules.get(depth1).getRuleActions().get(depth2).getFixedResponseConfig().getHttpCode());
												putBodyParameter("Rules." + (depth1 + 1) + ".RuleActions." + (depth2 + 1) + ".FixedResponseConfig.Content" , rules.get(depth1).getRuleActions().get(depth2).getFixedResponseConfig().getContent());
												putBodyParameter("Rules." + (depth1 + 1) + ".RuleActions." + (depth2 + 1) + ".FixedResponseConfig.ContentType" , rules.get(depth1).getRuleActions().get(depth2).getFixedResponseConfig().getContentType());
										}
										if (rules.get(depth1).getRuleActions().get(depth2).getTrafficMirrorConfig() != null) {
											
												if (rules.get(depth1).getRuleActions().get(depth2).getTrafficMirrorConfig().getMirrorGroupConfig() != null) {
													
														if (rules.get(depth1).getRuleActions().get(depth2).getTrafficMirrorConfig().getMirrorGroupConfig().getServerGroupTuples() != null) {
															for (int depth3 = 0; depth3 < rules.get(depth1).getRuleActions().get(depth2).getTrafficMirrorConfig().getMirrorGroupConfig().getServerGroupTuples().size(); depth3++) {
																if (rules.get(depth1).getRuleActions().get(depth2).getTrafficMirrorConfig().getMirrorGroupConfig().getServerGroupTuples().get(depth3) != null) {
																	
																		putBodyParameter("Rules." + (depth1 + 1) + ".RuleActions." + (depth2 + 1) + ".TrafficMirrorConfig.MirrorGroupConfig.ServerGroupTuples." + (depth3 + 1) + ".ServerGroupId" , rules.get(depth1).getRuleActions().get(depth2).getTrafficMirrorConfig().getMirrorGroupConfig().getServerGroupTuples().get(depth3).getServerGroupId());
																}
															}
														}
												}
												putBodyParameter("Rules." + (depth1 + 1) + ".RuleActions." + (depth2 + 1) + ".TrafficMirrorConfig.TargetType" , rules.get(depth1).getRuleActions().get(depth2).getTrafficMirrorConfig().getTargetType());
										}
										if (rules.get(depth1).getRuleActions().get(depth2).getForwardGroupConfig() != null) {
											
												if (rules.get(depth1).getRuleActions().get(depth2).getForwardGroupConfig().getServerGroupStickySession() != null) {
													
														putBodyParameter("Rules." + (depth1 + 1) + ".RuleActions." + (depth2 + 1) + ".ForwardGroupConfig.ServerGroupStickySession.Enabled" , rules.get(depth1).getRuleActions().get(depth2).getForwardGroupConfig().getServerGroupStickySession().getEnabled());
														putBodyParameter("Rules." + (depth1 + 1) + ".RuleActions." + (depth2 + 1) + ".ForwardGroupConfig.ServerGroupStickySession.Timeout" , rules.get(depth1).getRuleActions().get(depth2).getForwardGroupConfig().getServerGroupStickySession().getTimeout());
												}
												if (rules.get(depth1).getRuleActions().get(depth2).getForwardGroupConfig().getServerGroupTuples() != null) {
													for (int depth3 = 0; depth3 < rules.get(depth1).getRuleActions().get(depth2).getForwardGroupConfig().getServerGroupTuples().size(); depth3++) {
														if (rules.get(depth1).getRuleActions().get(depth2).getForwardGroupConfig().getServerGroupTuples().get(depth3) != null) {
															
																putBodyParameter("Rules." + (depth1 + 1) + ".RuleActions." + (depth2 + 1) + ".ForwardGroupConfig.ServerGroupTuples." + (depth3 + 1) + ".ServerGroupId" , rules.get(depth1).getRuleActions().get(depth2).getForwardGroupConfig().getServerGroupTuples().get(depth3).getServerGroupId());
																putBodyParameter("Rules." + (depth1 + 1) + ".RuleActions." + (depth2 + 1) + ".ForwardGroupConfig.ServerGroupTuples." + (depth3 + 1) + ".Weight" , rules.get(depth1).getRuleActions().get(depth2).getForwardGroupConfig().getServerGroupTuples().get(depth3).getWeight());
														}
													}
												}
										}
										if (rules.get(depth1).getRuleActions().get(depth2).getRemoveHeaderConfig() != null) {
											
												putBodyParameter("Rules." + (depth1 + 1) + ".RuleActions." + (depth2 + 1) + ".RemoveHeaderConfig.Key" , rules.get(depth1).getRuleActions().get(depth2).getRemoveHeaderConfig().getKey());
										}
										if (rules.get(depth1).getRuleActions().get(depth2).getInsertHeaderConfig() != null) {
											
												putBodyParameter("Rules." + (depth1 + 1) + ".RuleActions." + (depth2 + 1) + ".InsertHeaderConfig.ValueType" , rules.get(depth1).getRuleActions().get(depth2).getInsertHeaderConfig().getValueType());
												putBodyParameter("Rules." + (depth1 + 1) + ".RuleActions." + (depth2 + 1) + ".InsertHeaderConfig.CoverEnabled" , rules.get(depth1).getRuleActions().get(depth2).getInsertHeaderConfig().getCoverEnabled());
												putBodyParameter("Rules." + (depth1 + 1) + ".RuleActions." + (depth2 + 1) + ".InsertHeaderConfig.Value" , rules.get(depth1).getRuleActions().get(depth2).getInsertHeaderConfig().getValue());
												putBodyParameter("Rules." + (depth1 + 1) + ".RuleActions." + (depth2 + 1) + ".InsertHeaderConfig.Key" , rules.get(depth1).getRuleActions().get(depth2).getInsertHeaderConfig().getKey());
										}
										if (rules.get(depth1).getRuleActions().get(depth2).getTrafficLimitConfig() != null) {
											
												putBodyParameter("Rules." + (depth1 + 1) + ".RuleActions." + (depth2 + 1) + ".TrafficLimitConfig.QPS" , rules.get(depth1).getRuleActions().get(depth2).getTrafficLimitConfig().getQPS());
												putBodyParameter("Rules." + (depth1 + 1) + ".RuleActions." + (depth2 + 1) + ".TrafficLimitConfig.PerIpQps" , rules.get(depth1).getRuleActions().get(depth2).getTrafficLimitConfig().getPerIpQps());
										}
										if (rules.get(depth1).getRuleActions().get(depth2).getCorsConfig() != null) {
											
												putBodyParameter("Rules." + (depth1 + 1) + ".RuleActions." + (depth2 + 1) + ".CorsConfig.AllowCredentials" , rules.get(depth1).getRuleActions().get(depth2).getCorsConfig().getAllowCredentials());
												if (rules.get(depth1).getRuleActions().get(depth2).getCorsConfig().getAllowOrigin() != null) {
													for (int depth3 = 0; depth3 < rules.get(depth1).getRuleActions().get(depth2).getCorsConfig().getAllowOrigin().size(); depth3++) {
														putBodyParameter("Rules." + (depth1 + 1) + ".RuleActions." + (depth2 + 1) + ".CorsConfig.AllowOrigin." + (depth3 + 1) , rules.get(depth1).getRuleActions().get(depth2).getCorsConfig().getAllowOrigin().get(depth3));
													}
												}
												putBodyParameter("Rules." + (depth1 + 1) + ".RuleActions." + (depth2 + 1) + ".CorsConfig.MaxAge" , rules.get(depth1).getRuleActions().get(depth2).getCorsConfig().getMaxAge());
												if (rules.get(depth1).getRuleActions().get(depth2).getCorsConfig().getAllowMethods() != null) {
													for (int depth3 = 0; depth3 < rules.get(depth1).getRuleActions().get(depth2).getCorsConfig().getAllowMethods().size(); depth3++) {
														putBodyParameter("Rules." + (depth1 + 1) + ".RuleActions." + (depth2 + 1) + ".CorsConfig.AllowMethods." + (depth3 + 1) , rules.get(depth1).getRuleActions().get(depth2).getCorsConfig().getAllowMethods().get(depth3));
													}
												}
												if (rules.get(depth1).getRuleActions().get(depth2).getCorsConfig().getAllowHeaders() != null) {
													for (int depth3 = 0; depth3 < rules.get(depth1).getRuleActions().get(depth2).getCorsConfig().getAllowHeaders().size(); depth3++) {
														putBodyParameter("Rules." + (depth1 + 1) + ".RuleActions." + (depth2 + 1) + ".CorsConfig.AllowHeaders." + (depth3 + 1) , rules.get(depth1).getRuleActions().get(depth2).getCorsConfig().getAllowHeaders().get(depth3));
													}
												}
												if (rules.get(depth1).getRuleActions().get(depth2).getCorsConfig().getExposeHeaders() != null) {
													for (int depth3 = 0; depth3 < rules.get(depth1).getRuleActions().get(depth2).getCorsConfig().getExposeHeaders().size(); depth3++) {
														putBodyParameter("Rules." + (depth1 + 1) + ".RuleActions." + (depth2 + 1) + ".CorsConfig.ExposeHeaders." + (depth3 + 1) , rules.get(depth1).getRuleActions().get(depth2).getCorsConfig().getExposeHeaders().get(depth3));
													}
												}
										}
										if (rules.get(depth1).getRuleActions().get(depth2).getRedirectConfig() != null) {
											
												putBodyParameter("Rules." + (depth1 + 1) + ".RuleActions." + (depth2 + 1) + ".RedirectConfig.Path" , rules.get(depth1).getRuleActions().get(depth2).getRedirectConfig().getPath());
												putBodyParameter("Rules." + (depth1 + 1) + ".RuleActions." + (depth2 + 1) + ".RedirectConfig.Protocol" , rules.get(depth1).getRuleActions().get(depth2).getRedirectConfig().getBizProtocol());
												putBodyParameter("Rules." + (depth1 + 1) + ".RuleActions." + (depth2 + 1) + ".RedirectConfig.Port" , rules.get(depth1).getRuleActions().get(depth2).getRedirectConfig().getPort());
												putBodyParameter("Rules." + (depth1 + 1) + ".RuleActions." + (depth2 + 1) + ".RedirectConfig.Query" , rules.get(depth1).getRuleActions().get(depth2).getRedirectConfig().getQuery());
												putBodyParameter("Rules." + (depth1 + 1) + ".RuleActions." + (depth2 + 1) + ".RedirectConfig.Host" , rules.get(depth1).getRuleActions().get(depth2).getRedirectConfig().getHost());
												putBodyParameter("Rules." + (depth1 + 1) + ".RuleActions." + (depth2 + 1) + ".RedirectConfig.HttpCode" , rules.get(depth1).getRuleActions().get(depth2).getRedirectConfig().getHttpCode());
										}
										putBodyParameter("Rules." + (depth1 + 1) + ".RuleActions." + (depth2 + 1) + ".Type" , rules.get(depth1).getRuleActions().get(depth2).getType());
										putBodyParameter("Rules." + (depth1 + 1) + ".RuleActions." + (depth2 + 1) + ".Order" , rules.get(depth1).getRuleActions().get(depth2).getOrder());
										if (rules.get(depth1).getRuleActions().get(depth2).getRewriteConfig() != null) {
											
												putBodyParameter("Rules." + (depth1 + 1) + ".RuleActions." + (depth2 + 1) + ".RewriteConfig.Path" , rules.get(depth1).getRuleActions().get(depth2).getRewriteConfig().getPath());
												putBodyParameter("Rules." + (depth1 + 1) + ".RuleActions." + (depth2 + 1) + ".RewriteConfig.Query" , rules.get(depth1).getRuleActions().get(depth2).getRewriteConfig().getQuery());
												putBodyParameter("Rules." + (depth1 + 1) + ".RuleActions." + (depth2 + 1) + ".RewriteConfig.Host" , rules.get(depth1).getRuleActions().get(depth2).getRewriteConfig().getHost());
										}
								}
							}
						}
						putBodyParameter("Rules." + (depth1 + 1) + ".Direction" , rules.get(depth1).getDirection());
				}
			}
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

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putQueryParameter("DryRun", dryRun.toString());
		}
	}

	public static class Rules {

		private List<RuleConditionsItem> ruleConditions;

		private String ruleName;

		private List<TagItem> tag;

		private Integer priority;

		private List<RuleActionsItem> ruleActions;

		private String direction;

		public List<RuleConditionsItem> getRuleConditions() {
			return this.ruleConditions;
		}

		public void setRuleConditions(List<RuleConditionsItem> ruleConditions) {
			this.ruleConditions = ruleConditions;
		}

		public String getRuleName() {
			return this.ruleName;
		}

		public void setRuleName(String ruleName) {
			this.ruleName = ruleName;
		}

		public List<TagItem> getTag() {
			return this.tag;
		}

		public void setTag(List<TagItem> tag) {
			this.tag = tag;
		}

		public Integer getPriority() {
			return this.priority;
		}

		public void setPriority(Integer priority) {
			this.priority = priority;
		}

		public List<RuleActionsItem> getRuleActions() {
			return this.ruleActions;
		}

		public void setRuleActions(List<RuleActionsItem> ruleActions) {
			this.ruleActions = ruleActions;
		}

		public String getDirection() {
			return this.direction;
		}

		public void setDirection(String direction) {
			this.direction = direction;
		}

		public static class RuleConditionsItem {

			private MethodConfig methodConfig;

			private SourceIpConfig sourceIpConfig;

			private HostConfig hostConfig;

			private QueryStringConfig queryStringConfig;

			private ResponseStatusCodeConfig responseStatusCodeConfig;

			private PathConfig pathConfig;

			private CookieConfig cookieConfig;

			private String type;

			private HeaderConfig headerConfig;

			private ResponseHeaderConfig responseHeaderConfig;

			public MethodConfig getMethodConfig() {
				return this.methodConfig;
			}

			public void setMethodConfig(MethodConfig methodConfig) {
				this.methodConfig = methodConfig;
			}

			public SourceIpConfig getSourceIpConfig() {
				return this.sourceIpConfig;
			}

			public void setSourceIpConfig(SourceIpConfig sourceIpConfig) {
				this.sourceIpConfig = sourceIpConfig;
			}

			public HostConfig getHostConfig() {
				return this.hostConfig;
			}

			public void setHostConfig(HostConfig hostConfig) {
				this.hostConfig = hostConfig;
			}

			public QueryStringConfig getQueryStringConfig() {
				return this.queryStringConfig;
			}

			public void setQueryStringConfig(QueryStringConfig queryStringConfig) {
				this.queryStringConfig = queryStringConfig;
			}

			public ResponseStatusCodeConfig getResponseStatusCodeConfig() {
				return this.responseStatusCodeConfig;
			}

			public void setResponseStatusCodeConfig(ResponseStatusCodeConfig responseStatusCodeConfig) {
				this.responseStatusCodeConfig = responseStatusCodeConfig;
			}

			public PathConfig getPathConfig() {
				return this.pathConfig;
			}

			public void setPathConfig(PathConfig pathConfig) {
				this.pathConfig = pathConfig;
			}

			public CookieConfig getCookieConfig() {
				return this.cookieConfig;
			}

			public void setCookieConfig(CookieConfig cookieConfig) {
				this.cookieConfig = cookieConfig;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public HeaderConfig getHeaderConfig() {
				return this.headerConfig;
			}

			public void setHeaderConfig(HeaderConfig headerConfig) {
				this.headerConfig = headerConfig;
			}

			public ResponseHeaderConfig getResponseHeaderConfig() {
				return this.responseHeaderConfig;
			}

			public void setResponseHeaderConfig(ResponseHeaderConfig responseHeaderConfig) {
				this.responseHeaderConfig = responseHeaderConfig;
			}

			public static class MethodConfig {

				private List<String> values;

				public List<String> getValues() {
					return this.values;
				}

				public void setValues(List<String> values) {
					this.values = values;
				}
			}

			public static class SourceIpConfig {

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

			public static class QueryStringConfig {

				private List<ValuesItem> values;

				public List<ValuesItem> getValues() {
					return this.values;
				}

				public void setValues(List<ValuesItem> values) {
					this.values = values;
				}

				public static class ValuesItem {

					private String value;

					private String key;

					public String getValue() {
						return this.value;
					}

					public void setValue(String value) {
						this.value = value;
					}

					public String getKey() {
						return this.key;
					}

					public void setKey(String key) {
						this.key = key;
					}
				}
			}

			public static class ResponseStatusCodeConfig {

				private List<String> values;

				public List<String> getValues() {
					return this.values;
				}

				public void setValues(List<String> values) {
					this.values = values;
				}
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

			public static class CookieConfig {

				private List<ValuesItem> values;

				public List<ValuesItem> getValues() {
					return this.values;
				}

				public void setValues(List<ValuesItem> values) {
					this.values = values;
				}

				public static class ValuesItem {

					private String value;

					private String key;

					public String getValue() {
						return this.value;
					}

					public void setValue(String value) {
						this.value = value;
					}

					public String getKey() {
						return this.key;
					}

					public void setKey(String key) {
						this.key = key;
					}
				}
			}

			public static class HeaderConfig {

				private List<String> values;

				private String key;

				public List<String> getValues() {
					return this.values;
				}

				public void setValues(List<String> values) {
					this.values = values;
				}

				public String getKey() {
					return this.key;
				}

				public void setKey(String key) {
					this.key = key;
				}
			}

			public static class ResponseHeaderConfig {

				private List<String> values;

				private String key;

				public List<String> getValues() {
					return this.values;
				}

				public void setValues(List<String> values) {
					this.values = values;
				}

				public String getKey() {
					return this.key;
				}

				public void setKey(String key) {
					this.key = key;
				}
			}
		}

		public static class TagItem {

			private String value;

			private String key;

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}
		}

		public static class RuleActionsItem {

			private FixedResponseConfig fixedResponseConfig;

			private TrafficMirrorConfig trafficMirrorConfig;

			private ForwardGroupConfig forwardGroupConfig;

			private RemoveHeaderConfig removeHeaderConfig;

			private InsertHeaderConfig insertHeaderConfig;

			private TrafficLimitConfig trafficLimitConfig;

			private CorsConfig corsConfig;

			private RedirectConfig redirectConfig;

			private String type;

			private Integer order;

			private RewriteConfig rewriteConfig;

			public FixedResponseConfig getFixedResponseConfig() {
				return this.fixedResponseConfig;
			}

			public void setFixedResponseConfig(FixedResponseConfig fixedResponseConfig) {
				this.fixedResponseConfig = fixedResponseConfig;
			}

			public TrafficMirrorConfig getTrafficMirrorConfig() {
				return this.trafficMirrorConfig;
			}

			public void setTrafficMirrorConfig(TrafficMirrorConfig trafficMirrorConfig) {
				this.trafficMirrorConfig = trafficMirrorConfig;
			}

			public ForwardGroupConfig getForwardGroupConfig() {
				return this.forwardGroupConfig;
			}

			public void setForwardGroupConfig(ForwardGroupConfig forwardGroupConfig) {
				this.forwardGroupConfig = forwardGroupConfig;
			}

			public RemoveHeaderConfig getRemoveHeaderConfig() {
				return this.removeHeaderConfig;
			}

			public void setRemoveHeaderConfig(RemoveHeaderConfig removeHeaderConfig) {
				this.removeHeaderConfig = removeHeaderConfig;
			}

			public InsertHeaderConfig getInsertHeaderConfig() {
				return this.insertHeaderConfig;
			}

			public void setInsertHeaderConfig(InsertHeaderConfig insertHeaderConfig) {
				this.insertHeaderConfig = insertHeaderConfig;
			}

			public TrafficLimitConfig getTrafficLimitConfig() {
				return this.trafficLimitConfig;
			}

			public void setTrafficLimitConfig(TrafficLimitConfig trafficLimitConfig) {
				this.trafficLimitConfig = trafficLimitConfig;
			}

			public CorsConfig getCorsConfig() {
				return this.corsConfig;
			}

			public void setCorsConfig(CorsConfig corsConfig) {
				this.corsConfig = corsConfig;
			}

			public RedirectConfig getRedirectConfig() {
				return this.redirectConfig;
			}

			public void setRedirectConfig(RedirectConfig redirectConfig) {
				this.redirectConfig = redirectConfig;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public Integer getOrder() {
				return this.order;
			}

			public void setOrder(Integer order) {
				this.order = order;
			}

			public RewriteConfig getRewriteConfig() {
				return this.rewriteConfig;
			}

			public void setRewriteConfig(RewriteConfig rewriteConfig) {
				this.rewriteConfig = rewriteConfig;
			}

			public static class FixedResponseConfig {

				private String httpCode;

				private String content;

				private String contentType;

				public String getHttpCode() {
					return this.httpCode;
				}

				public void setHttpCode(String httpCode) {
					this.httpCode = httpCode;
				}

				public String getContent() {
					return this.content;
				}

				public void setContent(String content) {
					this.content = content;
				}

				public String getContentType() {
					return this.contentType;
				}

				public void setContentType(String contentType) {
					this.contentType = contentType;
				}
			}

			public static class TrafficMirrorConfig {

				private MirrorGroupConfig mirrorGroupConfig;

				private String targetType;

				public MirrorGroupConfig getMirrorGroupConfig() {
					return this.mirrorGroupConfig;
				}

				public void setMirrorGroupConfig(MirrorGroupConfig mirrorGroupConfig) {
					this.mirrorGroupConfig = mirrorGroupConfig;
				}

				public String getTargetType() {
					return this.targetType;
				}

				public void setTargetType(String targetType) {
					this.targetType = targetType;
				}

				public static class MirrorGroupConfig {

					private List<ServerGroupTuplesItem> serverGroupTuples;

					public List<ServerGroupTuplesItem> getServerGroupTuples() {
						return this.serverGroupTuples;
					}

					public void setServerGroupTuples(List<ServerGroupTuplesItem> serverGroupTuples) {
						this.serverGroupTuples = serverGroupTuples;
					}

					public static class ServerGroupTuplesItem {

						private String serverGroupId;

						public String getServerGroupId() {
							return this.serverGroupId;
						}

						public void setServerGroupId(String serverGroupId) {
							this.serverGroupId = serverGroupId;
						}
					}
				}
			}

			public static class ForwardGroupConfig {

				private ServerGroupStickySession serverGroupStickySession;

				private List<ServerGroupTuplesItem> serverGroupTuples;

				public ServerGroupStickySession getServerGroupStickySession() {
					return this.serverGroupStickySession;
				}

				public void setServerGroupStickySession(ServerGroupStickySession serverGroupStickySession) {
					this.serverGroupStickySession = serverGroupStickySession;
				}

				public List<ServerGroupTuplesItem> getServerGroupTuples() {
					return this.serverGroupTuples;
				}

				public void setServerGroupTuples(List<ServerGroupTuplesItem> serverGroupTuples) {
					this.serverGroupTuples = serverGroupTuples;
				}

				public static class ServerGroupStickySession {

					private Boolean enabled;

					private Integer timeout;

					public Boolean getEnabled() {
						return this.enabled;
					}

					public void setEnabled(Boolean enabled) {
						this.enabled = enabled;
					}

					public Integer getTimeout() {
						return this.timeout;
					}

					public void setTimeout(Integer timeout) {
						this.timeout = timeout;
					}
				}

				public static class ServerGroupTuplesItem {

					private String serverGroupId;

					private Integer weight;

					public String getServerGroupId() {
						return this.serverGroupId;
					}

					public void setServerGroupId(String serverGroupId) {
						this.serverGroupId = serverGroupId;
					}

					public Integer getWeight() {
						return this.weight;
					}

					public void setWeight(Integer weight) {
						this.weight = weight;
					}
				}
			}

			public static class RemoveHeaderConfig {

				private String key;

				public String getKey() {
					return this.key;
				}

				public void setKey(String key) {
					this.key = key;
				}
			}

			public static class InsertHeaderConfig {

				private String valueType;

				private Boolean coverEnabled;

				private String value;

				private String key;

				public String getValueType() {
					return this.valueType;
				}

				public void setValueType(String valueType) {
					this.valueType = valueType;
				}

				public Boolean getCoverEnabled() {
					return this.coverEnabled;
				}

				public void setCoverEnabled(Boolean coverEnabled) {
					this.coverEnabled = coverEnabled;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}

				public String getKey() {
					return this.key;
				}

				public void setKey(String key) {
					this.key = key;
				}
			}

			public static class TrafficLimitConfig {

				private Integer qPS;

				private Integer perIpQps;

				public Integer getQPS() {
					return this.qPS;
				}

				public void setQPS(Integer qPS) {
					this.qPS = qPS;
				}

				public Integer getPerIpQps() {
					return this.perIpQps;
				}

				public void setPerIpQps(Integer perIpQps) {
					this.perIpQps = perIpQps;
				}
			}

			public static class CorsConfig {

				private String allowCredentials;

				private List<String> allowOrigin;

				private Long maxAge;

				private List<String> allowMethods;

				private List<String> allowHeaders;

				private List<String> exposeHeaders;

				public String getAllowCredentials() {
					return this.allowCredentials;
				}

				public void setAllowCredentials(String allowCredentials) {
					this.allowCredentials = allowCredentials;
				}

				public List<String> getAllowOrigin() {
					return this.allowOrigin;
				}

				public void setAllowOrigin(List<String> allowOrigin) {
					this.allowOrigin = allowOrigin;
				}

				public Long getMaxAge() {
					return this.maxAge;
				}

				public void setMaxAge(Long maxAge) {
					this.maxAge = maxAge;
				}

				public List<String> getAllowMethods() {
					return this.allowMethods;
				}

				public void setAllowMethods(List<String> allowMethods) {
					this.allowMethods = allowMethods;
				}

				public List<String> getAllowHeaders() {
					return this.allowHeaders;
				}

				public void setAllowHeaders(List<String> allowHeaders) {
					this.allowHeaders = allowHeaders;
				}

				public List<String> getExposeHeaders() {
					return this.exposeHeaders;
				}

				public void setExposeHeaders(List<String> exposeHeaders) {
					this.exposeHeaders = exposeHeaders;
				}
			}

			public static class RedirectConfig {

				private String path;

				private String protocol;

				private String port;

				private String query;

				private String host;

				private String httpCode;

				public String getPath() {
					return this.path;
				}

				public void setPath(String path) {
					this.path = path;
				}

				public String getBizProtocol() {
					return this.protocol;
				}

				public void setBizProtocol(String protocol) {
					this.protocol = protocol;
				}

				public String getPort() {
					return this.port;
				}

				public void setPort(String port) {
					this.port = port;
				}

				public String getQuery() {
					return this.query;
				}

				public void setQuery(String query) {
					this.query = query;
				}

				public String getHost() {
					return this.host;
				}

				public void setHost(String host) {
					this.host = host;
				}

				public String getHttpCode() {
					return this.httpCode;
				}

				public void setHttpCode(String httpCode) {
					this.httpCode = httpCode;
				}
			}

			public static class RewriteConfig {

				private String path;

				private String query;

				private String host;

				public String getPath() {
					return this.path;
				}

				public void setPath(String path) {
					this.path = path;
				}

				public String getQuery() {
					return this.query;
				}

				public void setQuery(String query) {
					this.query = query;
				}

				public String getHost() {
					return this.host;
				}

				public void setHost(String host) {
					this.host = host;
				}
			}
		}
	}

	@Override
	public Class<CreateRulesResponse> getResponseClass() {
		return CreateRulesResponse.class;
	}

}
