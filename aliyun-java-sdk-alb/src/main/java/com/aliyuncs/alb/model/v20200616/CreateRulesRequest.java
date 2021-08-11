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
														putQueryParameter("Rules." + (depth1 + 1) + ".RuleConditions." + (depth2 + 1) + ".MethodConfig.Values." + (depth3 + 1) , rules.get(depth1).getRuleConditions().get(depth2).getMethodConfig().getValues().get(depth3));
													}
												}
										}
										if (rules.get(depth1).getRuleConditions().get(depth2).getHostConfig() != null) {
											
												if (rules.get(depth1).getRuleConditions().get(depth2).getHostConfig().getValues() != null) {
													for (int depth3 = 0; depth3 < rules.get(depth1).getRuleConditions().get(depth2).getHostConfig().getValues().size(); depth3++) {
														putQueryParameter("Rules." + (depth1 + 1) + ".RuleConditions." + (depth2 + 1) + ".HostConfig.Values." + (depth3 + 1) , rules.get(depth1).getRuleConditions().get(depth2).getHostConfig().getValues().get(depth3));
													}
												}
										}
										if (rules.get(depth1).getRuleConditions().get(depth2).getQueryStringConfig() != null) {
											
												if (rules.get(depth1).getRuleConditions().get(depth2).getQueryStringConfig().getValues() != null) {
													for (int depth3 = 0; depth3 < rules.get(depth1).getRuleConditions().get(depth2).getQueryStringConfig().getValues().size(); depth3++) {
														if (rules.get(depth1).getRuleConditions().get(depth2).getQueryStringConfig().getValues().get(depth3) != null) {
															
																putQueryParameter("Rules." + (depth1 + 1) + ".RuleConditions." + (depth2 + 1) + ".QueryStringConfig.Values." + (depth3 + 1) + ".Value" , rules.get(depth1).getRuleConditions().get(depth2).getQueryStringConfig().getValues().get(depth3).getValue());
																putQueryParameter("Rules." + (depth1 + 1) + ".RuleConditions." + (depth2 + 1) + ".QueryStringConfig.Values." + (depth3 + 1) + ".Key" , rules.get(depth1).getRuleConditions().get(depth2).getQueryStringConfig().getValues().get(depth3).getKey());
														}
													}
												}
										}
										if (rules.get(depth1).getRuleConditions().get(depth2).getPathConfig() != null) {
											
												if (rules.get(depth1).getRuleConditions().get(depth2).getPathConfig().getValues() != null) {
													for (int depth3 = 0; depth3 < rules.get(depth1).getRuleConditions().get(depth2).getPathConfig().getValues().size(); depth3++) {
														putQueryParameter("Rules." + (depth1 + 1) + ".RuleConditions." + (depth2 + 1) + ".PathConfig.Values." + (depth3 + 1) , rules.get(depth1).getRuleConditions().get(depth2).getPathConfig().getValues().get(depth3));
													}
												}
										}
										if (rules.get(depth1).getRuleConditions().get(depth2).getCookieConfig() != null) {
											
												if (rules.get(depth1).getRuleConditions().get(depth2).getCookieConfig().getValues() != null) {
													for (int depth3 = 0; depth3 < rules.get(depth1).getRuleConditions().get(depth2).getCookieConfig().getValues().size(); depth3++) {
														if (rules.get(depth1).getRuleConditions().get(depth2).getCookieConfig().getValues().get(depth3) != null) {
															
																putQueryParameter("Rules." + (depth1 + 1) + ".RuleConditions." + (depth2 + 1) + ".CookieConfig.Values." + (depth3 + 1) + ".Value" , rules.get(depth1).getRuleConditions().get(depth2).getCookieConfig().getValues().get(depth3).getValue());
																putQueryParameter("Rules." + (depth1 + 1) + ".RuleConditions." + (depth2 + 1) + ".CookieConfig.Values." + (depth3 + 1) + ".Key" , rules.get(depth1).getRuleConditions().get(depth2).getCookieConfig().getValues().get(depth3).getKey());
														}
													}
												}
										}
										putQueryParameter("Rules." + (depth1 + 1) + ".RuleConditions." + (depth2 + 1) + ".Type" , rules.get(depth1).getRuleConditions().get(depth2).getType());
										if (rules.get(depth1).getRuleConditions().get(depth2).getHeaderConfig() != null) {
											
												if (rules.get(depth1).getRuleConditions().get(depth2).getHeaderConfig().getValues() != null) {
													for (int depth3 = 0; depth3 < rules.get(depth1).getRuleConditions().get(depth2).getHeaderConfig().getValues().size(); depth3++) {
														putQueryParameter("Rules." + (depth1 + 1) + ".RuleConditions." + (depth2 + 1) + ".HeaderConfig.Values." + (depth3 + 1) , rules.get(depth1).getRuleConditions().get(depth2).getHeaderConfig().getValues().get(depth3));
													}
												}
												putQueryParameter("Rules." + (depth1 + 1) + ".RuleConditions." + (depth2 + 1) + ".HeaderConfig.Key" , rules.get(depth1).getRuleConditions().get(depth2).getHeaderConfig().getKey());
										}
										if (rules.get(depth1).getRuleConditions().get(depth2).getResponseHeaderConfig() != null) {
											
												if (rules.get(depth1).getRuleConditions().get(depth2).getResponseHeaderConfig().getValues() != null) {
													for (int depth3 = 0; depth3 < rules.get(depth1).getRuleConditions().get(depth2).getResponseHeaderConfig().getValues().size(); depth3++) {
														putQueryParameter("Rules." + (depth1 + 1) + ".RuleConditions." + (depth2 + 1) + ".ResponseHeaderConfig.Values." + (depth3 + 1) , rules.get(depth1).getRuleConditions().get(depth2).getResponseHeaderConfig().getValues().get(depth3));
													}
												}
												putQueryParameter("Rules." + (depth1 + 1) + ".RuleConditions." + (depth2 + 1) + ".ResponseHeaderConfig.Key" , rules.get(depth1).getRuleConditions().get(depth2).getResponseHeaderConfig().getKey());
										}
								}
							}
						}
						putQueryParameter("Rules." + (depth1 + 1) + ".RuleName" , rules.get(depth1).getRuleName());
						putQueryParameter("Rules." + (depth1 + 1) + ".Priority" , rules.get(depth1).getPriority());
						if (rules.get(depth1).getRuleActions() != null) {
							for (int depth2 = 0; depth2 < rules.get(depth1).getRuleActions().size(); depth2++) {
								if (rules.get(depth1).getRuleActions().get(depth2) != null) {
									
										if (rules.get(depth1).getRuleActions().get(depth2).getFixedResponseConfig() != null) {
											
												putQueryParameter("Rules." + (depth1 + 1) + ".RuleActions." + (depth2 + 1) + ".FixedResponseConfig.HttpCode" , rules.get(depth1).getRuleActions().get(depth2).getFixedResponseConfig().getHttpCode());
												putQueryParameter("Rules." + (depth1 + 1) + ".RuleActions." + (depth2 + 1) + ".FixedResponseConfig.Content" , rules.get(depth1).getRuleActions().get(depth2).getFixedResponseConfig().getContent());
												putQueryParameter("Rules." + (depth1 + 1) + ".RuleActions." + (depth2 + 1) + ".FixedResponseConfig.ContentType" , rules.get(depth1).getRuleActions().get(depth2).getFixedResponseConfig().getContentType());
										}
										if (rules.get(depth1).getRuleActions().get(depth2).getForwardGroupConfig() != null) {
											
												if (rules.get(depth1).getRuleActions().get(depth2).getForwardGroupConfig().getServerGroupTuples() != null) {
													for (int depth3 = 0; depth3 < rules.get(depth1).getRuleActions().get(depth2).getForwardGroupConfig().getServerGroupTuples().size(); depth3++) {
														if (rules.get(depth1).getRuleActions().get(depth2).getForwardGroupConfig().getServerGroupTuples().get(depth3) != null) {
															
																putQueryParameter("Rules." + (depth1 + 1) + ".RuleActions." + (depth2 + 1) + ".ForwardGroupConfig.ServerGroupTuples." + (depth3 + 1) + ".ServerGroupId" , rules.get(depth1).getRuleActions().get(depth2).getForwardGroupConfig().getServerGroupTuples().get(depth3).getServerGroupId());
														}
													}
												}
										}
										if (rules.get(depth1).getRuleActions().get(depth2).getInsertHeaderConfig() != null) {
											
												putQueryParameter("Rules." + (depth1 + 1) + ".RuleActions." + (depth2 + 1) + ".InsertHeaderConfig.ValueType" , rules.get(depth1).getRuleActions().get(depth2).getInsertHeaderConfig().getValueType());
												putQueryParameter("Rules." + (depth1 + 1) + ".RuleActions." + (depth2 + 1) + ".InsertHeaderConfig.Value" , rules.get(depth1).getRuleActions().get(depth2).getInsertHeaderConfig().getValue());
												putQueryParameter("Rules." + (depth1 + 1) + ".RuleActions." + (depth2 + 1) + ".InsertHeaderConfig.Key" , rules.get(depth1).getRuleActions().get(depth2).getInsertHeaderConfig().getKey());
										}
										if (rules.get(depth1).getRuleActions().get(depth2).getRedirectConfig() != null) {
											
												putQueryParameter("Rules." + (depth1 + 1) + ".RuleActions." + (depth2 + 1) + ".RedirectConfig.Path" , rules.get(depth1).getRuleActions().get(depth2).getRedirectConfig().getPath());
												putQueryParameter("Rules." + (depth1 + 1) + ".RuleActions." + (depth2 + 1) + ".RedirectConfig.Protocol" , rules.get(depth1).getRuleActions().get(depth2).getRedirectConfig().getBizProtocol());
												putQueryParameter("Rules." + (depth1 + 1) + ".RuleActions." + (depth2 + 1) + ".RedirectConfig.Port" , rules.get(depth1).getRuleActions().get(depth2).getRedirectConfig().getPort());
												putQueryParameter("Rules." + (depth1 + 1) + ".RuleActions." + (depth2 + 1) + ".RedirectConfig.Query" , rules.get(depth1).getRuleActions().get(depth2).getRedirectConfig().getQuery());
												putQueryParameter("Rules." + (depth1 + 1) + ".RuleActions." + (depth2 + 1) + ".RedirectConfig.Host" , rules.get(depth1).getRuleActions().get(depth2).getRedirectConfig().getHost());
												putQueryParameter("Rules." + (depth1 + 1) + ".RuleActions." + (depth2 + 1) + ".RedirectConfig.HttpCode" , rules.get(depth1).getRuleActions().get(depth2).getRedirectConfig().getHttpCode());
										}
										putQueryParameter("Rules." + (depth1 + 1) + ".RuleActions." + (depth2 + 1) + ".Type" , rules.get(depth1).getRuleActions().get(depth2).getType());
										putQueryParameter("Rules." + (depth1 + 1) + ".RuleActions." + (depth2 + 1) + ".Order" , rules.get(depth1).getRuleActions().get(depth2).getOrder());
										if (rules.get(depth1).getRuleActions().get(depth2).getRewriteConfig() != null) {
											
												putQueryParameter("Rules." + (depth1 + 1) + ".RuleActions." + (depth2 + 1) + ".RewriteConfig.Path" , rules.get(depth1).getRuleActions().get(depth2).getRewriteConfig().getPath());
												putQueryParameter("Rules." + (depth1 + 1) + ".RuleActions." + (depth2 + 1) + ".RewriteConfig.Query" , rules.get(depth1).getRuleActions().get(depth2).getRewriteConfig().getQuery());
												putQueryParameter("Rules." + (depth1 + 1) + ".RuleActions." + (depth2 + 1) + ".RewriteConfig.Host" , rules.get(depth1).getRuleActions().get(depth2).getRewriteConfig().getHost());
										}
								}
							}
						}
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

		private Integer priority;

		private List<RuleActionsItem> ruleActions;

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

		public static class RuleConditionsItem {

			private MethodConfig methodConfig;

			private HostConfig hostConfig;

			private QueryStringConfig queryStringConfig;

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

		public static class RuleActionsItem {

			private FixedResponseConfig fixedResponseConfig;

			private ForwardGroupConfig forwardGroupConfig;

			private InsertHeaderConfig insertHeaderConfig;

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

			public ForwardGroupConfig getForwardGroupConfig() {
				return this.forwardGroupConfig;
			}

			public void setForwardGroupConfig(ForwardGroupConfig forwardGroupConfig) {
				this.forwardGroupConfig = forwardGroupConfig;
			}

			public InsertHeaderConfig getInsertHeaderConfig() {
				return this.insertHeaderConfig;
			}

			public void setInsertHeaderConfig(InsertHeaderConfig insertHeaderConfig) {
				this.insertHeaderConfig = insertHeaderConfig;
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

			public static class ForwardGroupConfig {

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

			public static class InsertHeaderConfig {

				private String valueType;

				private String value;

				private String key;

				public String getValueType() {
					return this.valueType;
				}

				public void setValueType(String valueType) {
					this.valueType = valueType;
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
