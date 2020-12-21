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

package com.aliyuncs.mpaas.model.v20201028;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mpaas.transform.v20201028.ListMgsApiResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListMgsApiResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private ResultContent resultContent;

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

	public ResultContent getResultContent() {
		return this.resultContent;
	}

	public void setResultContent(ResultContent resultContent) {
		this.resultContent = resultContent;
	}

	public static class ResultContent {

		private String errorMessage;

		private Boolean success;

		private List<ValueItem> value;

		public String getErrorMessage() {
			return this.errorMessage;
		}

		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}

		public Boolean getSuccess() {
			return this.success;
		}

		public void setSuccess(Boolean success) {
			this.success = success;
		}

		public List<ValueItem> getValue() {
			return this.value;
		}

		public void setValue(List<ValueItem> value) {
			this.value = value;
		}

		public static class ValueItem {

			private String apiName;

			private String apiStatus;

			private String apiType;

			private String appId;

			private String authRuleName;

			private String charset;

			private String contentType;

			private String description;

			private String gmtCreate;

			private String gmtModified;

			private String host;

			private Long id;

			private String interfaceType;

			private String method;

			private String methodName;

			private String needEncrypt;

			private String needETag;

			private String needJsonp;

			private String needSign;

			private String operationType;

			private String paramGetMethod;

			private String path;

			private String requestBodyModel;

			private String responseBodyModel;

			private Long sysId;

			private String sysName;

			private String timeout;

			private String workspaceId;

			private List<HeaderRuleItem> headerRule;

			private List<HeaderRulesItem> headerRules;

			private List<RequestParamsItem> requestParams;

			private ApiInvoker apiInvoker;

			private CacheRule cacheRule;

			private LimitRule limitRule;

			private MigrateRule migrateRule;

			private MockRule mockRule;

			public String getApiName() {
				return this.apiName;
			}

			public void setApiName(String apiName) {
				this.apiName = apiName;
			}

			public String getApiStatus() {
				return this.apiStatus;
			}

			public void setApiStatus(String apiStatus) {
				this.apiStatus = apiStatus;
			}

			public String getApiType() {
				return this.apiType;
			}

			public void setApiType(String apiType) {
				this.apiType = apiType;
			}

			public String getAppId() {
				return this.appId;
			}

			public void setAppId(String appId) {
				this.appId = appId;
			}

			public String getAuthRuleName() {
				return this.authRuleName;
			}

			public void setAuthRuleName(String authRuleName) {
				this.authRuleName = authRuleName;
			}

			public String getCharset() {
				return this.charset;
			}

			public void setCharset(String charset) {
				this.charset = charset;
			}

			public String getContentType() {
				return this.contentType;
			}

			public void setContentType(String contentType) {
				this.contentType = contentType;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(String gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public String getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(String gmtModified) {
				this.gmtModified = gmtModified;
			}

			public String getHost() {
				return this.host;
			}

			public void setHost(String host) {
				this.host = host;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getInterfaceType() {
				return this.interfaceType;
			}

			public void setInterfaceType(String interfaceType) {
				this.interfaceType = interfaceType;
			}

			public String getBizMethod() {
				return this.method;
			}

			public void setBizMethod(String method) {
				this.method = method;
			}

			public String getMethodName() {
				return this.methodName;
			}

			public void setMethodName(String methodName) {
				this.methodName = methodName;
			}

			public String getNeedEncrypt() {
				return this.needEncrypt;
			}

			public void setNeedEncrypt(String needEncrypt) {
				this.needEncrypt = needEncrypt;
			}

			public String getNeedETag() {
				return this.needETag;
			}

			public void setNeedETag(String needETag) {
				this.needETag = needETag;
			}

			public String getNeedJsonp() {
				return this.needJsonp;
			}

			public void setNeedJsonp(String needJsonp) {
				this.needJsonp = needJsonp;
			}

			public String getNeedSign() {
				return this.needSign;
			}

			public void setNeedSign(String needSign) {
				this.needSign = needSign;
			}

			public String getOperationType() {
				return this.operationType;
			}

			public void setOperationType(String operationType) {
				this.operationType = operationType;
			}

			public String getParamGetMethod() {
				return this.paramGetMethod;
			}

			public void setParamGetMethod(String paramGetMethod) {
				this.paramGetMethod = paramGetMethod;
			}

			public String getPath() {
				return this.path;
			}

			public void setPath(String path) {
				this.path = path;
			}

			public String getRequestBodyModel() {
				return this.requestBodyModel;
			}

			public void setRequestBodyModel(String requestBodyModel) {
				this.requestBodyModel = requestBodyModel;
			}

			public String getResponseBodyModel() {
				return this.responseBodyModel;
			}

			public void setResponseBodyModel(String responseBodyModel) {
				this.responseBodyModel = responseBodyModel;
			}

			public Long getSysId() {
				return this.sysId;
			}

			public void setSysId(Long sysId) {
				this.sysId = sysId;
			}

			public String getSysName() {
				return this.sysName;
			}

			public void setSysName(String sysName) {
				this.sysName = sysName;
			}

			public String getTimeout() {
				return this.timeout;
			}

			public void setTimeout(String timeout) {
				this.timeout = timeout;
			}

			public String getWorkspaceId() {
				return this.workspaceId;
			}

			public void setWorkspaceId(String workspaceId) {
				this.workspaceId = workspaceId;
			}

			public List<HeaderRuleItem> getHeaderRule() {
				return this.headerRule;
			}

			public void setHeaderRule(List<HeaderRuleItem> headerRule) {
				this.headerRule = headerRule;
			}

			public List<HeaderRulesItem> getHeaderRules() {
				return this.headerRules;
			}

			public void setHeaderRules(List<HeaderRulesItem> headerRules) {
				this.headerRules = headerRules;
			}

			public List<RequestParamsItem> getRequestParams() {
				return this.requestParams;
			}

			public void setRequestParams(List<RequestParamsItem> requestParams) {
				this.requestParams = requestParams;
			}

			public ApiInvoker getApiInvoker() {
				return this.apiInvoker;
			}

			public void setApiInvoker(ApiInvoker apiInvoker) {
				this.apiInvoker = apiInvoker;
			}

			public CacheRule getCacheRule() {
				return this.cacheRule;
			}

			public void setCacheRule(CacheRule cacheRule) {
				this.cacheRule = cacheRule;
			}

			public LimitRule getLimitRule() {
				return this.limitRule;
			}

			public void setLimitRule(LimitRule limitRule) {
				this.limitRule = limitRule;
			}

			public MigrateRule getMigrateRule() {
				return this.migrateRule;
			}

			public void setMigrateRule(MigrateRule migrateRule) {
				this.migrateRule = migrateRule;
			}

			public MockRule getMockRule() {
				return this.mockRule;
			}

			public void setMockRule(MockRule mockRule) {
				this.mockRule = mockRule;
			}

			public static class HeaderRuleItem {

				private String headerKey;

				private String location;

				private String type;

				private String value;

				public String getHeaderKey() {
					return this.headerKey;
				}

				public void setHeaderKey(String headerKey) {
					this.headerKey = headerKey;
				}

				public String getLocation() {
					return this.location;
				}

				public void setLocation(String location) {
					this.location = location;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class HeaderRulesItem {

				private String headerKey;

				private String location;

				private String type;

				private String value;

				public String getHeaderKey() {
					return this.headerKey;
				}

				public void setHeaderKey(String headerKey) {
					this.headerKey = headerKey;
				}

				public String getLocation() {
					return this.location;
				}

				public void setLocation(String location) {
					this.location = location;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class RequestParamsItem {

				private String apiId;

				private String appId;

				private String defaultValue;

				private String description;

				private Long id;

				private String location;

				private String name;

				private String refType;

				private String type;

				private String workspaceId;

				public String getApiId() {
					return this.apiId;
				}

				public void setApiId(String apiId) {
					this.apiId = apiId;
				}

				public String getAppId() {
					return this.appId;
				}

				public void setAppId(String appId) {
					this.appId = appId;
				}

				public String getDefaultValue() {
					return this.defaultValue;
				}

				public void setDefaultValue(String defaultValue) {
					this.defaultValue = defaultValue;
				}

				public String getDescription() {
					return this.description;
				}

				public void setDescription(String description) {
					this.description = description;
				}

				public Long getId() {
					return this.id;
				}

				public void setId(Long id) {
					this.id = id;
				}

				public String getLocation() {
					return this.location;
				}

				public void setLocation(String location) {
					this.location = location;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getRefType() {
					return this.refType;
				}

				public void setRefType(String refType) {
					this.refType = refType;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public String getWorkspaceId() {
					return this.workspaceId;
				}

				public void setWorkspaceId(String workspaceId) {
					this.workspaceId = workspaceId;
				}
			}

			public static class ApiInvoker {

				private String rpcInvoker;

				private HttpInvoker httpInvoker;

				public String getRpcInvoker() {
					return this.rpcInvoker;
				}

				public void setRpcInvoker(String rpcInvoker) {
					this.rpcInvoker = rpcInvoker;
				}

				public HttpInvoker getHttpInvoker() {
					return this.httpInvoker;
				}

				public void setHttpInvoker(HttpInvoker httpInvoker) {
					this.httpInvoker = httpInvoker;
				}

				public static class HttpInvoker {

					private String charset;

					private String contentType;

					private String host;

					private String method;

					private String path;

					public String getCharset() {
						return this.charset;
					}

					public void setCharset(String charset) {
						this.charset = charset;
					}

					public String getContentType() {
						return this.contentType;
					}

					public void setContentType(String contentType) {
						this.contentType = contentType;
					}

					public String getHost() {
						return this.host;
					}

					public void setHost(String host) {
						this.host = host;
					}

					public String getBizMethod() {
						return this.method;
					}

					public void setBizMethod(String method) {
						this.method = method;
					}

					public String getPath() {
						return this.path;
					}

					public void setPath(String path) {
						this.path = path;
					}
				}
			}

			public static class CacheRule {

				private String cacheKey;

				private Boolean needCache;

				private Long ttl;

				public String getCacheKey() {
					return this.cacheKey;
				}

				public void setCacheKey(String cacheKey) {
					this.cacheKey = cacheKey;
				}

				public Boolean getNeedCache() {
					return this.needCache;
				}

				public void setNeedCache(Boolean needCache) {
					this.needCache = needCache;
				}

				public Long getTtl() {
					return this.ttl;
				}

				public void setTtl(Long ttl) {
					this.ttl = ttl;
				}
			}

			public static class LimitRule {

				private String defaultResponse;

				private String i18nResponse;

				private Long interval;

				private Long limit;

				private String mode;

				public String getDefaultResponse() {
					return this.defaultResponse;
				}

				public void setDefaultResponse(String defaultResponse) {
					this.defaultResponse = defaultResponse;
				}

				public String getI18nResponse() {
					return this.i18nResponse;
				}

				public void setI18nResponse(String i18nResponse) {
					this.i18nResponse = i18nResponse;
				}

				public Long getInterval() {
					return this.interval;
				}

				public void setInterval(Long interval) {
					this.interval = interval;
				}

				public Long getLimit() {
					return this.limit;
				}

				public void setLimit(Long limit) {
					this.limit = limit;
				}

				public String getMode() {
					return this.mode;
				}

				public void setMode(String mode) {
					this.mode = mode;
				}
			}

			public static class MigrateRule {

				private Long flowPercent;

				private Boolean needMigrate;

				private Boolean needSwitchCompletely;

				private Long sysId;

				private String sysName;

				private String upstreamType;

				public Long getFlowPercent() {
					return this.flowPercent;
				}

				public void setFlowPercent(Long flowPercent) {
					this.flowPercent = flowPercent;
				}

				public Boolean getNeedMigrate() {
					return this.needMigrate;
				}

				public void setNeedMigrate(Boolean needMigrate) {
					this.needMigrate = needMigrate;
				}

				public Boolean getNeedSwitchCompletely() {
					return this.needSwitchCompletely;
				}

				public void setNeedSwitchCompletely(Boolean needSwitchCompletely) {
					this.needSwitchCompletely = needSwitchCompletely;
				}

				public Long getSysId() {
					return this.sysId;
				}

				public void setSysId(Long sysId) {
					this.sysId = sysId;
				}

				public String getSysName() {
					return this.sysName;
				}

				public void setSysName(String sysName) {
					this.sysName = sysName;
				}

				public String getUpstreamType() {
					return this.upstreamType;
				}

				public void setUpstreamType(String upstreamType) {
					this.upstreamType = upstreamType;
				}
			}

			public static class MockRule {

				private String mockData;

				private Boolean needMock;

				private Long percentage;

				private String type;

				public String getMockData() {
					return this.mockData;
				}

				public void setMockData(String mockData) {
					this.mockData = mockData;
				}

				public Boolean getNeedMock() {
					return this.needMock;
				}

				public void setNeedMock(Boolean needMock) {
					this.needMock = needMock;
				}

				public Long getPercentage() {
					return this.percentage;
				}

				public void setPercentage(Long percentage) {
					this.percentage = percentage;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}
			}
		}
	}

	@Override
	public ListMgsApiResponse getInstance(UnmarshallerContext context) {
		return	ListMgsApiResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
