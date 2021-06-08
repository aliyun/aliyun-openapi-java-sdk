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
public class UpdateRuleAttributeRequest extends RpcAcsRequest<UpdateRuleAttributeResponse> {
	   

	private String clientToken;

	private String ruleName;

	private List<RuleActions> ruleActions;

	private List<RuleConditions> ruleConditions;

	private Boolean dryRun;

	private Integer priority;

	private String ruleId;
	public UpdateRuleAttributeRequest() {
		super("Alb", "2020-06-16", "UpdateRuleAttribute", "alb");
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

	public String getRuleName() {
		return this.ruleName;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
		if(ruleName != null){
			putQueryParameter("RuleName", ruleName);
		}
	}

	public List<RuleActions> getRuleActions() {
		return this.ruleActions;
	}

	public void setRuleActions(List<RuleActions> ruleActions) {
		this.ruleActions = ruleActions;	
		if (ruleActions != null) {
			for (int depth1 = 0; depth1 < ruleActions.size(); depth1++) {
				if (ruleActions.get(depth1) != null) {
					
						if (ruleActions.get(depth1).getFixedResponseConfig() != null) {
							
								putQueryParameter("RuleActions." + (depth1 + 1) + ".FixedResponseConfig.HttpCode" , ruleActions.get(depth1).getFixedResponseConfig().getHttpCode());
								putQueryParameter("RuleActions." + (depth1 + 1) + ".FixedResponseConfig.Content" , ruleActions.get(depth1).getFixedResponseConfig().getContent());
								putQueryParameter("RuleActions." + (depth1 + 1) + ".FixedResponseConfig.ContentType" , ruleActions.get(depth1).getFixedResponseConfig().getContentType());
						}
						if (ruleActions.get(depth1).getForwardGroupConfig() != null) {
							
								if (ruleActions.get(depth1).getForwardGroupConfig().getServerGroupTuples() != null) {
									for (int depth2 = 0; depth2 < ruleActions.get(depth1).getForwardGroupConfig().getServerGroupTuples().size(); depth2++) {
										if (ruleActions.get(depth1).getForwardGroupConfig().getServerGroupTuples().get(depth2) != null) {
											
												putQueryParameter("RuleActions." + (depth1 + 1) + ".ForwardGroupConfig.ServerGroupTuples." + (depth2 + 1) + ".ServerGroupId" , ruleActions.get(depth1).getForwardGroupConfig().getServerGroupTuples().get(depth2).getServerGroupId());
										}
									}
								}
						}
						if (ruleActions.get(depth1).getInsertHeaderConfig() != null) {
							
								putQueryParameter("RuleActions." + (depth1 + 1) + ".InsertHeaderConfig.ValueType" , ruleActions.get(depth1).getInsertHeaderConfig().getValueType());
								putQueryParameter("RuleActions." + (depth1 + 1) + ".InsertHeaderConfig.Value" , ruleActions.get(depth1).getInsertHeaderConfig().getValue());
								putQueryParameter("RuleActions." + (depth1 + 1) + ".InsertHeaderConfig.Key" , ruleActions.get(depth1).getInsertHeaderConfig().getKey());
						}
						if (ruleActions.get(depth1).getRedirectConfig() != null) {
							
								putQueryParameter("RuleActions." + (depth1 + 1) + ".RedirectConfig.Path" , ruleActions.get(depth1).getRedirectConfig().getPath());
								putQueryParameter("RuleActions." + (depth1 + 1) + ".RedirectConfig.Protocol" , ruleActions.get(depth1).getRedirectConfig().getBizProtocol());
								putQueryParameter("RuleActions." + (depth1 + 1) + ".RedirectConfig.Port" , ruleActions.get(depth1).getRedirectConfig().getPort());
								putQueryParameter("RuleActions." + (depth1 + 1) + ".RedirectConfig.Query" , ruleActions.get(depth1).getRedirectConfig().getQuery());
								putQueryParameter("RuleActions." + (depth1 + 1) + ".RedirectConfig.Host" , ruleActions.get(depth1).getRedirectConfig().getHost());
								putQueryParameter("RuleActions." + (depth1 + 1) + ".RedirectConfig.HttpCode" , ruleActions.get(depth1).getRedirectConfig().getHttpCode());
						}
						putQueryParameter("RuleActions." + (depth1 + 1) + ".Type" , ruleActions.get(depth1).getType());
						putQueryParameter("RuleActions." + (depth1 + 1) + ".Order" , ruleActions.get(depth1).getOrder());
						if (ruleActions.get(depth1).getRewriteConfig() != null) {
							
								putQueryParameter("RuleActions." + (depth1 + 1) + ".RewriteConfig.Path" , ruleActions.get(depth1).getRewriteConfig().getPath());
								putQueryParameter("RuleActions." + (depth1 + 1) + ".RewriteConfig.Query" , ruleActions.get(depth1).getRewriteConfig().getQuery());
								putQueryParameter("RuleActions." + (depth1 + 1) + ".RewriteConfig.Host" , ruleActions.get(depth1).getRewriteConfig().getHost());
						}
				}
			}
		}	
	}

	public List<RuleConditions> getRuleConditions() {
		return this.ruleConditions;
	}

	public void setRuleConditions(List<RuleConditions> ruleConditions) {
		this.ruleConditions = ruleConditions;	
		if (ruleConditions != null) {
			for (int depth1 = 0; depth1 < ruleConditions.size(); depth1++) {
				if (ruleConditions.get(depth1) != null) {
					
						if (ruleConditions.get(depth1).getMethodConfig() != null) {
							
								if (ruleConditions.get(depth1).getMethodConfig().getValues() != null) {
									for (int depth2 = 0; depth2 < ruleConditions.get(depth1).getMethodConfig().getValues().size(); depth2++) {
										putQueryParameter("RuleConditions." + (depth1 + 1) + ".MethodConfig.Values." + (depth2 + 1) , ruleConditions.get(depth1).getMethodConfig().getValues().get(depth2));
									}
								}
						}
						if (ruleConditions.get(depth1).getHostConfig() != null) {
							
								if (ruleConditions.get(depth1).getHostConfig().getValues() != null) {
									for (int depth2 = 0; depth2 < ruleConditions.get(depth1).getHostConfig().getValues().size(); depth2++) {
										putQueryParameter("RuleConditions." + (depth1 + 1) + ".HostConfig.Values." + (depth2 + 1) , ruleConditions.get(depth1).getHostConfig().getValues().get(depth2));
									}
								}
						}
						if (ruleConditions.get(depth1).getQueryStringConfig() != null) {
							
								if (ruleConditions.get(depth1).getQueryStringConfig().getValues() != null) {
									for (int depth2 = 0; depth2 < ruleConditions.get(depth1).getQueryStringConfig().getValues().size(); depth2++) {
										if (ruleConditions.get(depth1).getQueryStringConfig().getValues().get(depth2) != null) {
											
												putQueryParameter("RuleConditions." + (depth1 + 1) + ".QueryStringConfig.Values." + (depth2 + 1) + ".Value" , ruleConditions.get(depth1).getQueryStringConfig().getValues().get(depth2).getValue());
												putQueryParameter("RuleConditions." + (depth1 + 1) + ".QueryStringConfig.Values." + (depth2 + 1) + ".Key" , ruleConditions.get(depth1).getQueryStringConfig().getValues().get(depth2).getKey());
										}
									}
								}
						}
						if (ruleConditions.get(depth1).getPathConfig() != null) {
							
								if (ruleConditions.get(depth1).getPathConfig().getValues() != null) {
									for (int depth2 = 0; depth2 < ruleConditions.get(depth1).getPathConfig().getValues().size(); depth2++) {
										putQueryParameter("RuleConditions." + (depth1 + 1) + ".PathConfig.Values." + (depth2 + 1) , ruleConditions.get(depth1).getPathConfig().getValues().get(depth2));
									}
								}
						}
						if (ruleConditions.get(depth1).getCookieConfig() != null) {
							
								if (ruleConditions.get(depth1).getCookieConfig().getValues() != null) {
									for (int depth2 = 0; depth2 < ruleConditions.get(depth1).getCookieConfig().getValues().size(); depth2++) {
										if (ruleConditions.get(depth1).getCookieConfig().getValues().get(depth2) != null) {
											
												putQueryParameter("RuleConditions." + (depth1 + 1) + ".CookieConfig.Values." + (depth2 + 1) + ".Value" , ruleConditions.get(depth1).getCookieConfig().getValues().get(depth2).getValue());
												putQueryParameter("RuleConditions." + (depth1 + 1) + ".CookieConfig.Values." + (depth2 + 1) + ".Key" , ruleConditions.get(depth1).getCookieConfig().getValues().get(depth2).getKey());
										}
									}
								}
						}
						putQueryParameter("RuleConditions." + (depth1 + 1) + ".Type" , ruleConditions.get(depth1).getType());
						if (ruleConditions.get(depth1).getHeaderConfig() != null) {
							
								if (ruleConditions.get(depth1).getHeaderConfig().getValues() != null) {
									for (int depth2 = 0; depth2 < ruleConditions.get(depth1).getHeaderConfig().getValues().size(); depth2++) {
										putQueryParameter("RuleConditions." + (depth1 + 1) + ".HeaderConfig.Values." + (depth2 + 1) , ruleConditions.get(depth1).getHeaderConfig().getValues().get(depth2));
									}
								}
								putQueryParameter("RuleConditions." + (depth1 + 1) + ".HeaderConfig.Key" , ruleConditions.get(depth1).getHeaderConfig().getKey());
						}
				}
			}
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

	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
		if(priority != null){
			putQueryParameter("Priority", priority.toString());
		}
	}

	public String getRuleId() {
		return this.ruleId;
	}

	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
		if(ruleId != null){
			putQueryParameter("RuleId", ruleId);
		}
	}

	public static class RuleActions {

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

	public static class RuleConditions {

		private MethodConfig methodConfig;

		private HostConfig hostConfig;

		private QueryStringConfig queryStringConfig;

		private PathConfig pathConfig;

		private CookieConfig cookieConfig;

		private String type;

		private HeaderConfig headerConfig;

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
	}

	@Override
	public Class<UpdateRuleAttributeResponse> getResponseClass() {
		return UpdateRuleAttributeResponse.class;
	}

}
