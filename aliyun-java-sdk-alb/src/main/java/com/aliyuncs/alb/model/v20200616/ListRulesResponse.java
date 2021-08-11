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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.alb.transform.v20200616.ListRulesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListRulesResponse extends AcsResponse {

	private Integer maxResults;

	private String nextToken;

	private String requestId;

	private Integer totalCount;

	private List<Rule> rules;

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

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

	public List<Rule> getRules() {
		return this.rules;
	}

	public void setRules(List<Rule> rules) {
		this.rules = rules;
	}

	public static class Rule {

		private String listenerId;

		private String loadBalancerId;

		private Integer priority;

		private String ruleId;

		private String ruleName;

		private String ruleStatus;

		private List<Action> ruleActions;

		private List<Condition> ruleConditions;

		public String getListenerId() {
			return this.listenerId;
		}

		public void setListenerId(String listenerId) {
			this.listenerId = listenerId;
		}

		public String getLoadBalancerId() {
			return this.loadBalancerId;
		}

		public void setLoadBalancerId(String loadBalancerId) {
			this.loadBalancerId = loadBalancerId;
		}

		public Integer getPriority() {
			return this.priority;
		}

		public void setPriority(Integer priority) {
			this.priority = priority;
		}

		public String getRuleId() {
			return this.ruleId;
		}

		public void setRuleId(String ruleId) {
			this.ruleId = ruleId;
		}

		public String getRuleName() {
			return this.ruleName;
		}

		public void setRuleName(String ruleName) {
			this.ruleName = ruleName;
		}

		public String getRuleStatus() {
			return this.ruleStatus;
		}

		public void setRuleStatus(String ruleStatus) {
			this.ruleStatus = ruleStatus;
		}

		public List<Action> getRuleActions() {
			return this.ruleActions;
		}

		public void setRuleActions(List<Action> ruleActions) {
			this.ruleActions = ruleActions;
		}

		public List<Condition> getRuleConditions() {
			return this.ruleConditions;
		}

		public void setRuleConditions(List<Condition> ruleConditions) {
			this.ruleConditions = ruleConditions;
		}

		public static class Action {

			private Integer order;

			private String type;

			private FixedResponseConfig fixedResponseConfig;

			private ForwardGroupConfig forwardGroupConfig;

			private InsertHeaderConfig insertHeaderConfig;

			private RedirectConfig redirectConfig;

			private RewriteConfig rewriteConfig;

			public Integer getOrder() {
				return this.order;
			}

			public void setOrder(Integer order) {
				this.order = order;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

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

			public RewriteConfig getRewriteConfig() {
				return this.rewriteConfig;
			}

			public void setRewriteConfig(RewriteConfig rewriteConfig) {
				this.rewriteConfig = rewriteConfig;
			}

			public static class FixedResponseConfig {

				private String content;

				private String contentType;

				private String httpCode;

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

				public String getHttpCode() {
					return this.httpCode;
				}

				public void setHttpCode(String httpCode) {
					this.httpCode = httpCode;
				}
			}

			public static class ForwardGroupConfig {

				private List<ServerGroupTuple> serverGroupTuples;

				public List<ServerGroupTuple> getServerGroupTuples() {
					return this.serverGroupTuples;
				}

				public void setServerGroupTuples(List<ServerGroupTuple> serverGroupTuples) {
					this.serverGroupTuples = serverGroupTuples;
				}

				public static class ServerGroupTuple {

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

				private String key;

				private String value;

				private String valueType;

				public String getKey() {
					return this.key;
				}

				public void setKey(String key) {
					this.key = key;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}

				public String getValueType() {
					return this.valueType;
				}

				public void setValueType(String valueType) {
					this.valueType = valueType;
				}
			}

			public static class RedirectConfig {

				private String host;

				private String httpCode;

				private String path;

				private String port;

				private String protocol;

				private String query;

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

				public String getPath() {
					return this.path;
				}

				public void setPath(String path) {
					this.path = path;
				}

				public String getPort() {
					return this.port;
				}

				public void setPort(String port) {
					this.port = port;
				}

				public String getBizProtocol() {
					return this.protocol;
				}

				public void setBizProtocol(String protocol) {
					this.protocol = protocol;
				}

				public String getQuery() {
					return this.query;
				}

				public void setQuery(String query) {
					this.query = query;
				}
			}

			public static class RewriteConfig {

				private String host;

				private String path;

				private String query;

				public String getHost() {
					return this.host;
				}

				public void setHost(String host) {
					this.host = host;
				}

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
			}
		}

		public static class Condition {

			private String type;

			private CookieConfig cookieConfig;

			private HeaderConfig headerConfig;

			private HostConfig hostConfig;

			private MethodConfig methodConfig;

			private PathConfig pathConfig;

			private QueryStringConfig queryStringConfig;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public CookieConfig getCookieConfig() {
				return this.cookieConfig;
			}

			public void setCookieConfig(CookieConfig cookieConfig) {
				this.cookieConfig = cookieConfig;
			}

			public HeaderConfig getHeaderConfig() {
				return this.headerConfig;
			}

			public void setHeaderConfig(HeaderConfig headerConfig) {
				this.headerConfig = headerConfig;
			}

			public HostConfig getHostConfig() {
				return this.hostConfig;
			}

			public void setHostConfig(HostConfig hostConfig) {
				this.hostConfig = hostConfig;
			}

			public MethodConfig getMethodConfig() {
				return this.methodConfig;
			}

			public void setMethodConfig(MethodConfig methodConfig) {
				this.methodConfig = methodConfig;
			}

			public PathConfig getPathConfig() {
				return this.pathConfig;
			}

			public void setPathConfig(PathConfig pathConfig) {
				this.pathConfig = pathConfig;
			}

			public QueryStringConfig getQueryStringConfig() {
				return this.queryStringConfig;
			}

			public void setQueryStringConfig(QueryStringConfig queryStringConfig) {
				this.queryStringConfig = queryStringConfig;
			}

			public static class CookieConfig {

				private List<Value> values;

				public List<Value> getValues() {
					return this.values;
				}

				public void setValues(List<Value> values) {
					this.values = values;
				}

				public static class Value {

					private String key;

					private String value;

					public String getKey() {
						return this.key;
					}

					public void setKey(String key) {
						this.key = key;
					}

					public String getValue() {
						return this.value;
					}

					public void setValue(String value) {
						this.value = value;
					}
				}
			}

			public static class HeaderConfig {

				private String key;

				private List<String> values3;

				public String getKey() {
					return this.key;
				}

				public void setKey(String key) {
					this.key = key;
				}

				public List<String> getValues3() {
					return this.values3;
				}

				public void setValues3(List<String> values3) {
					this.values3 = values3;
				}
			}

			public static class HostConfig {

				private List<String> values4;

				public List<String> getValues4() {
					return this.values4;
				}

				public void setValues4(List<String> values4) {
					this.values4 = values4;
				}
			}

			public static class MethodConfig {

				private List<String> values5;

				public List<String> getValues5() {
					return this.values5;
				}

				public void setValues5(List<String> values5) {
					this.values5 = values5;
				}
			}

			public static class PathConfig {

				private List<String> values6;

				public List<String> getValues6() {
					return this.values6;
				}

				public void setValues6(List<String> values6) {
					this.values6 = values6;
				}
			}

			public static class QueryStringConfig {

				private List<Value8> values7;

				public List<Value8> getValues7() {
					return this.values7;
				}

				public void setValues7(List<Value8> values7) {
					this.values7 = values7;
				}

				public static class Value8 {

					private String key;

					private String value;

					public String getKey() {
						return this.key;
					}

					public void setKey(String key) {
						this.key = key;
					}

					public String getValue() {
						return this.value;
					}

					public void setValue(String value) {
						this.value = value;
					}
				}
			}
		}
	}

	@Override
	public ListRulesResponse getInstance(UnmarshallerContext context) {
		return	ListRulesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
