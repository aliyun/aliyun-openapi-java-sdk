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
import com.aliyuncs.mpaas.transform.v20201028.QueryMgsApirestResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryMgsApirestResponse extends AcsResponse {

	private String resultMessage;

	private String resultCode;

	private String requestId;

	private ResultContent resultContent;

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ResultContent getResultContent() {
		return this.resultContent;
	}

	public void setResultContent(ResultContent resultContent) {
		this.resultContent = resultContent;
	}

	public static class ResultContent {

		private Boolean success;

		private String errorMessage;

		private Value value;

		public Boolean getSuccess() {
			return this.success;
		}

		public void setSuccess(Boolean success) {
			this.success = success;
		}

		public String getErrorMessage() {
			return this.errorMessage;
		}

		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}

		public Value getValue() {
			return this.value;
		}

		public void setValue(Value value) {
			this.value = value;
		}

		public static class Value {

			private String timeout;

			private String contentType;

			private String authRuleName;

			private String apiType;

			private String gmtModified;

			private String operationType;

			private String requestBodyModel;

			private String description;

			private String responseBodyModel;

			private String appId;

			private String charset;

			private String needEncrypt;

			private Long sysId;

			private String paramGetMethod;

			private String apiStatus;

			private String host;

			private String method;

			private String needETag;

			private String methodName;

			private String workspaceId;

			private String needSign;

			private String gmtCreate;

			private String path;

			private String sysName;

			private String interfaceType;

			private String needJsonp;

			private String apiName;

			private Long id;

			private List<HeaderRuleItem> headerRule;

			private List<HeaderRulesItem> headerRules;

			private List<RequestParamsItem> requestParams;

			private ApiInvoker apiInvoker;

			private CacheRule cacheRule;

			private LimitRule limitRule;

			private MigrateRule migrateRule;

			private MockRule mockRule;

			private DefaultLimitRule defaultLimitRule;

			private CircuitBreakerRule circuitBreakerRule;

			public String getTimeout() {
				return this.timeout;
			}

			public void setTimeout(String timeout) {
				this.timeout = timeout;
			}

			public String getContentType() {
				return this.contentType;
			}

			public void setContentType(String contentType) {
				this.contentType = contentType;
			}

			public String getAuthRuleName() {
				return this.authRuleName;
			}

			public void setAuthRuleName(String authRuleName) {
				this.authRuleName = authRuleName;
			}

			public String getApiType() {
				return this.apiType;
			}

			public void setApiType(String apiType) {
				this.apiType = apiType;
			}

			public String getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(String gmtModified) {
				this.gmtModified = gmtModified;
			}

			public String getOperationType() {
				return this.operationType;
			}

			public void setOperationType(String operationType) {
				this.operationType = operationType;
			}

			public String getRequestBodyModel() {
				return this.requestBodyModel;
			}

			public void setRequestBodyModel(String requestBodyModel) {
				this.requestBodyModel = requestBodyModel;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getResponseBodyModel() {
				return this.responseBodyModel;
			}

			public void setResponseBodyModel(String responseBodyModel) {
				this.responseBodyModel = responseBodyModel;
			}

			public String getAppId() {
				return this.appId;
			}

			public void setAppId(String appId) {
				this.appId = appId;
			}

			public String getCharset() {
				return this.charset;
			}

			public void setCharset(String charset) {
				this.charset = charset;
			}

			public String getNeedEncrypt() {
				return this.needEncrypt;
			}

			public void setNeedEncrypt(String needEncrypt) {
				this.needEncrypt = needEncrypt;
			}

			public Long getSysId() {
				return this.sysId;
			}

			public void setSysId(Long sysId) {
				this.sysId = sysId;
			}

			public String getParamGetMethod() {
				return this.paramGetMethod;
			}

			public void setParamGetMethod(String paramGetMethod) {
				this.paramGetMethod = paramGetMethod;
			}

			public String getApiStatus() {
				return this.apiStatus;
			}

			public void setApiStatus(String apiStatus) {
				this.apiStatus = apiStatus;
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

			public String getNeedETag() {
				return this.needETag;
			}

			public void setNeedETag(String needETag) {
				this.needETag = needETag;
			}

			public String getMethodName() {
				return this.methodName;
			}

			public void setMethodName(String methodName) {
				this.methodName = methodName;
			}

			public String getWorkspaceId() {
				return this.workspaceId;
			}

			public void setWorkspaceId(String workspaceId) {
				this.workspaceId = workspaceId;
			}

			public String getNeedSign() {
				return this.needSign;
			}

			public void setNeedSign(String needSign) {
				this.needSign = needSign;
			}

			public String getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(String gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public String getPath() {
				return this.path;
			}

			public void setPath(String path) {
				this.path = path;
			}

			public String getSysName() {
				return this.sysName;
			}

			public void setSysName(String sysName) {
				this.sysName = sysName;
			}

			public String getInterfaceType() {
				return this.interfaceType;
			}

			public void setInterfaceType(String interfaceType) {
				this.interfaceType = interfaceType;
			}

			public String getNeedJsonp() {
				return this.needJsonp;
			}

			public void setNeedJsonp(String needJsonp) {
				this.needJsonp = needJsonp;
			}

			public String getApiName() {
				return this.apiName;
			}

			public void setApiName(String apiName) {
				this.apiName = apiName;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
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

			public DefaultLimitRule getDefaultLimitRule() {
				return this.defaultLimitRule;
			}

			public void setDefaultLimitRule(DefaultLimitRule defaultLimitRule) {
				this.defaultLimitRule = defaultLimitRule;
			}

			public CircuitBreakerRule getCircuitBreakerRule() {
				return this.circuitBreakerRule;
			}

			public void setCircuitBreakerRule(CircuitBreakerRule circuitBreakerRule) {
				this.circuitBreakerRule = circuitBreakerRule;
			}

			public static class HeaderRuleItem {

				private String type;

				private String value;

				private String location;

				private String headerKey;

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

				public String getLocation() {
					return this.location;
				}

				public void setLocation(String location) {
					this.location = location;
				}

				public String getHeaderKey() {
					return this.headerKey;
				}

				public void setHeaderKey(String headerKey) {
					this.headerKey = headerKey;
				}
			}

			public static class HeaderRulesItem {

				private String type;

				private String value;

				private String location;

				private String headerKey;

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

				public String getLocation() {
					return this.location;
				}

				public void setLocation(String location) {
					this.location = location;
				}

				public String getHeaderKey() {
					return this.headerKey;
				}

				public void setHeaderKey(String headerKey) {
					this.headerKey = headerKey;
				}
			}

			public static class RequestParamsItem {

				private String type;

				private String apiId;

				private String workspaceId;

				private String description;

				private String appId;

				private String name;

				private String defaultValue;

				private String location;

				private Long id;

				private String refType;

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public String getApiId() {
					return this.apiId;
				}

				public void setApiId(String apiId) {
					this.apiId = apiId;
				}

				public String getWorkspaceId() {
					return this.workspaceId;
				}

				public void setWorkspaceId(String workspaceId) {
					this.workspaceId = workspaceId;
				}

				public String getDescription() {
					return this.description;
				}

				public void setDescription(String description) {
					this.description = description;
				}

				public String getAppId() {
					return this.appId;
				}

				public void setAppId(String appId) {
					this.appId = appId;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getDefaultValue() {
					return this.defaultValue;
				}

				public void setDefaultValue(String defaultValue) {
					this.defaultValue = defaultValue;
				}

				public String getLocation() {
					return this.location;
				}

				public void setLocation(String location) {
					this.location = location;
				}

				public Long getId() {
					return this.id;
				}

				public void setId(Long id) {
					this.id = id;
				}

				public String getRefType() {
					return this.refType;
				}

				public void setRefType(String refType) {
					this.refType = refType;
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

					private String path;

					private String method;

					private String host;

					private String contentType;

					private String charset;

					public String getPath() {
						return this.path;
					}

					public void setPath(String path) {
						this.path = path;
					}

					public String getBizMethod() {
						return this.method;
					}

					public void setBizMethod(String method) {
						this.method = method;
					}

					public String getHost() {
						return this.host;
					}

					public void setHost(String host) {
						this.host = host;
					}

					public String getContentType() {
						return this.contentType;
					}

					public void setContentType(String contentType) {
						this.contentType = contentType;
					}

					public String getCharset() {
						return this.charset;
					}

					public void setCharset(String charset) {
						this.charset = charset;
					}
				}
			}

			public static class CacheRule {

				private Long ttl;

				private String cacheKey;

				private Boolean needCache;

				public Long getTtl() {
					return this.ttl;
				}

				public void setTtl(Long ttl) {
					this.ttl = ttl;
				}

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
			}

			public static class LimitRule {

				private String defaultResponse;

				private String mode;

				private Long interval;

				private Long limit;

				private String i18nResponse;

				public String getDefaultResponse() {
					return this.defaultResponse;
				}

				public void setDefaultResponse(String defaultResponse) {
					this.defaultResponse = defaultResponse;
				}

				public String getMode() {
					return this.mode;
				}

				public void setMode(String mode) {
					this.mode = mode;
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

				public String getI18nResponse() {
					return this.i18nResponse;
				}

				public void setI18nResponse(String i18nResponse) {
					this.i18nResponse = i18nResponse;
				}
			}

			public static class MigrateRule {

				private Long flowPercent;

				private Boolean needMigrate;

				private Long sysId;

				private String upstreamType;

				private String sysName;

				private Boolean needSwitchCompletely;

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

				public Long getSysId() {
					return this.sysId;
				}

				public void setSysId(Long sysId) {
					this.sysId = sysId;
				}

				public String getUpstreamType() {
					return this.upstreamType;
				}

				public void setUpstreamType(String upstreamType) {
					this.upstreamType = upstreamType;
				}

				public String getSysName() {
					return this.sysName;
				}

				public void setSysName(String sysName) {
					this.sysName = sysName;
				}

				public Boolean getNeedSwitchCompletely() {
					return this.needSwitchCompletely;
				}

				public void setNeedSwitchCompletely(Boolean needSwitchCompletely) {
					this.needSwitchCompletely = needSwitchCompletely;
				}
			}

			public static class MockRule {

				private String type;

				private Boolean needMock;

				private String mockData;

				private Long percentage;

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public Boolean getNeedMock() {
					return this.needMock;
				}

				public void setNeedMock(Boolean needMock) {
					this.needMock = needMock;
				}

				public String getMockData() {
					return this.mockData;
				}

				public void setMockData(String mockData) {
					this.mockData = mockData;
				}

				public Long getPercentage() {
					return this.percentage;
				}

				public void setPercentage(Long percentage) {
					this.percentage = percentage;
				}
			}

			public static class DefaultLimitRule {

				private Boolean defaultLimit;

				private Integer configId;

				public Boolean getDefaultLimit() {
					return this.defaultLimit;
				}

				public void setDefaultLimit(Boolean defaultLimit) {
					this.defaultLimit = defaultLimit;
				}

				public Integer getConfigId() {
					return this.configId;
				}

				public void setConfigId(Integer configId) {
					this.configId = configId;
				}
			}

			public static class CircuitBreakerRule {

				private String appId;

				private String workspaceId;

				private Long id;

				private String model;

				private String switchStatus;

				private Long errorThreshold;

				private Long windowsInSeconds;

				private Long openTimeoutSeconds;

				private String defaultResponse;

				private Double slowRatioThreshold;

				public String getAppId() {
					return this.appId;
				}

				public void setAppId(String appId) {
					this.appId = appId;
				}

				public String getWorkspaceId() {
					return this.workspaceId;
				}

				public void setWorkspaceId(String workspaceId) {
					this.workspaceId = workspaceId;
				}

				public Long getId() {
					return this.id;
				}

				public void setId(Long id) {
					this.id = id;
				}

				public String getModel() {
					return this.model;
				}

				public void setModel(String model) {
					this.model = model;
				}

				public String getSwitchStatus() {
					return this.switchStatus;
				}

				public void setSwitchStatus(String switchStatus) {
					this.switchStatus = switchStatus;
				}

				public Long getErrorThreshold() {
					return this.errorThreshold;
				}

				public void setErrorThreshold(Long errorThreshold) {
					this.errorThreshold = errorThreshold;
				}

				public Long getWindowsInSeconds() {
					return this.windowsInSeconds;
				}

				public void setWindowsInSeconds(Long windowsInSeconds) {
					this.windowsInSeconds = windowsInSeconds;
				}

				public Long getOpenTimeoutSeconds() {
					return this.openTimeoutSeconds;
				}

				public void setOpenTimeoutSeconds(Long openTimeoutSeconds) {
					this.openTimeoutSeconds = openTimeoutSeconds;
				}

				public String getDefaultResponse() {
					return this.defaultResponse;
				}

				public void setDefaultResponse(String defaultResponse) {
					this.defaultResponse = defaultResponse;
				}

				public Double getSlowRatioThreshold() {
					return this.slowRatioThreshold;
				}

				public void setSlowRatioThreshold(Double slowRatioThreshold) {
					this.slowRatioThreshold = slowRatioThreshold;
				}
			}
		}
	}

	@Override
	public QueryMgsApirestResponse getInstance(UnmarshallerContext context) {
		return	QueryMgsApirestResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
