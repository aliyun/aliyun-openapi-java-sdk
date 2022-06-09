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

package com.aliyuncs.mse.model.v20190531;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mse.transform.v20190531.GetGatewayRouteDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetGatewayRouteDetailResponse extends AcsResponse {

	private String requestId;

	private Integer httpStatusCode;

	private String message;

	private Integer code;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
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

		private Long id;

		private String name;

		private String gatewayUniqueId;

		private Long gatewayId;

		private Long defaultServiceId;

		private String defaultServiceName;

		private Integer status;

		private String gmtCreate;

		private String gmtModified;

		private Integer routeOrder;

		private String predicates;

		private Long domainId;

		private String domainName;

		private String services;

		private String destinationType;

		private Boolean enableWaf;

		private Integer ahasStatus;

		private List<RouteServicesItem> routeServices;

		private List<Long> domainIdList;

		private List<String> domainNameList;

		private RoutePredicates routePredicates;

		private HTTPRewrite hTTPRewrite;

		private HeaderOp headerOp;

		private DirectResponse directResponse;

		private Cors cors;

		private Timeout timeout;

		private Retry retry;

		private Redirect redirect;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getGatewayUniqueId() {
			return this.gatewayUniqueId;
		}

		public void setGatewayUniqueId(String gatewayUniqueId) {
			this.gatewayUniqueId = gatewayUniqueId;
		}

		public Long getGatewayId() {
			return this.gatewayId;
		}

		public void setGatewayId(Long gatewayId) {
			this.gatewayId = gatewayId;
		}

		public Long getDefaultServiceId() {
			return this.defaultServiceId;
		}

		public void setDefaultServiceId(Long defaultServiceId) {
			this.defaultServiceId = defaultServiceId;
		}

		public String getDefaultServiceName() {
			return this.defaultServiceName;
		}

		public void setDefaultServiceName(String defaultServiceName) {
			this.defaultServiceName = defaultServiceName;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
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

		public Integer getRouteOrder() {
			return this.routeOrder;
		}

		public void setRouteOrder(Integer routeOrder) {
			this.routeOrder = routeOrder;
		}

		public String getPredicates() {
			return this.predicates;
		}

		public void setPredicates(String predicates) {
			this.predicates = predicates;
		}

		public Long getDomainId() {
			return this.domainId;
		}

		public void setDomainId(Long domainId) {
			this.domainId = domainId;
		}

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public String getServices() {
			return this.services;
		}

		public void setServices(String services) {
			this.services = services;
		}

		public String getDestinationType() {
			return this.destinationType;
		}

		public void setDestinationType(String destinationType) {
			this.destinationType = destinationType;
		}

		public Boolean getEnableWaf() {
			return this.enableWaf;
		}

		public void setEnableWaf(Boolean enableWaf) {
			this.enableWaf = enableWaf;
		}

		public Integer getAhasStatus() {
			return this.ahasStatus;
		}

		public void setAhasStatus(Integer ahasStatus) {
			this.ahasStatus = ahasStatus;
		}

		public List<RouteServicesItem> getRouteServices() {
			return this.routeServices;
		}

		public void setRouteServices(List<RouteServicesItem> routeServices) {
			this.routeServices = routeServices;
		}

		public List<Long> getDomainIdList() {
			return this.domainIdList;
		}

		public void setDomainIdList(List<Long> domainIdList) {
			this.domainIdList = domainIdList;
		}

		public List<String> getDomainNameList() {
			return this.domainNameList;
		}

		public void setDomainNameList(List<String> domainNameList) {
			this.domainNameList = domainNameList;
		}

		public RoutePredicates getRoutePredicates() {
			return this.routePredicates;
		}

		public void setRoutePredicates(RoutePredicates routePredicates) {
			this.routePredicates = routePredicates;
		}

		public HTTPRewrite getHTTPRewrite() {
			return this.hTTPRewrite;
		}

		public void setHTTPRewrite(HTTPRewrite hTTPRewrite) {
			this.hTTPRewrite = hTTPRewrite;
		}

		public HeaderOp getHeaderOp() {
			return this.headerOp;
		}

		public void setHeaderOp(HeaderOp headerOp) {
			this.headerOp = headerOp;
		}

		public DirectResponse getDirectResponse() {
			return this.directResponse;
		}

		public void setDirectResponse(DirectResponse directResponse) {
			this.directResponse = directResponse;
		}

		public Cors getCors() {
			return this.cors;
		}

		public void setCors(Cors cors) {
			this.cors = cors;
		}

		public Timeout getTimeout() {
			return this.timeout;
		}

		public void setTimeout(Timeout timeout) {
			this.timeout = timeout;
		}

		public Retry getRetry() {
			return this.retry;
		}

		public void setRetry(Retry retry) {
			this.retry = retry;
		}

		public Redirect getRedirect() {
			return this.redirect;
		}

		public void setRedirect(Redirect redirect) {
			this.redirect = redirect;
		}

		public static class RouteServicesItem {

			private Long serviceId;

			private String serviceName;

			private Integer percent;

			private String version;

			private String name;

			private String sourceType;

			private String namespace;

			private String groupName;

			public Long getServiceId() {
				return this.serviceId;
			}

			public void setServiceId(Long serviceId) {
				this.serviceId = serviceId;
			}

			public String getServiceName() {
				return this.serviceName;
			}

			public void setServiceName(String serviceName) {
				this.serviceName = serviceName;
			}

			public Integer getPercent() {
				return this.percent;
			}

			public void setPercent(Integer percent) {
				this.percent = percent;
			}

			public String getVersion() {
				return this.version;
			}

			public void setVersion(String version) {
				this.version = version;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getSourceType() {
				return this.sourceType;
			}

			public void setSourceType(String sourceType) {
				this.sourceType = sourceType;
			}

			public String getNamespace() {
				return this.namespace;
			}

			public void setNamespace(String namespace) {
				this.namespace = namespace;
			}

			public String getGroupName() {
				return this.groupName;
			}

			public void setGroupName(String groupName) {
				this.groupName = groupName;
			}
		}

		public static class RoutePredicates {

			private List<HeaderPredicatesItem> headerPredicates;

			private List<QueryPredicatesItem> queryPredicates;

			private List<String> methodPredicates;

			private PathPredicates pathPredicates;

			public List<HeaderPredicatesItem> getHeaderPredicates() {
				return this.headerPredicates;
			}

			public void setHeaderPredicates(List<HeaderPredicatesItem> headerPredicates) {
				this.headerPredicates = headerPredicates;
			}

			public List<QueryPredicatesItem> getQueryPredicates() {
				return this.queryPredicates;
			}

			public void setQueryPredicates(List<QueryPredicatesItem> queryPredicates) {
				this.queryPredicates = queryPredicates;
			}

			public List<String> getMethodPredicates() {
				return this.methodPredicates;
			}

			public void setMethodPredicates(List<String> methodPredicates) {
				this.methodPredicates = methodPredicates;
			}

			public PathPredicates getPathPredicates() {
				return this.pathPredicates;
			}

			public void setPathPredicates(PathPredicates pathPredicates) {
				this.pathPredicates = pathPredicates;
			}

			public static class HeaderPredicatesItem {

				private String key;

				private String value;

				private String type;

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

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}
			}

			public static class QueryPredicatesItem {

				private String key;

				private String value;

				private String type;

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

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}
			}

			public static class PathPredicates {

				private String path;

				private String type;

				private Boolean ignoreCase;

				public String getPath() {
					return this.path;
				}

				public void setPath(String path) {
					this.path = path;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public Boolean getIgnoreCase() {
					return this.ignoreCase;
				}

				public void setIgnoreCase(Boolean ignoreCase) {
					this.ignoreCase = ignoreCase;
				}
			}
		}

		public static class HTTPRewrite {

			private String status;

			private String path;

			private String host;

			private String pathType;

			private String pattern;

			private String substitution;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getPath() {
				return this.path;
			}

			public void setPath(String path) {
				this.path = path;
			}

			public String getHost() {
				return this.host;
			}

			public void setHost(String host) {
				this.host = host;
			}

			public String getPathType() {
				return this.pathType;
			}

			public void setPathType(String pathType) {
				this.pathType = pathType;
			}

			public String getPattern() {
				return this.pattern;
			}

			public void setPattern(String pattern) {
				this.pattern = pattern;
			}

			public String getSubstitution() {
				return this.substitution;
			}

			public void setSubstitution(String substitution) {
				this.substitution = substitution;
			}
		}

		public static class HeaderOp {

			private String status;

			private List<HeaderOpItemsItem> headerOpItems;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public List<HeaderOpItemsItem> getHeaderOpItems() {
				return this.headerOpItems;
			}

			public void setHeaderOpItems(List<HeaderOpItemsItem> headerOpItems) {
				this.headerOpItems = headerOpItems;
			}

			public static class HeaderOpItemsItem {

				private String directionType;

				private String opType;

				private String key;

				private String value;

				public String getDirectionType() {
					return this.directionType;
				}

				public void setDirectionType(String directionType) {
					this.directionType = directionType;
				}

				public String getOpType() {
					return this.opType;
				}

				public void setOpType(String opType) {
					this.opType = opType;
				}

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

		public static class DirectResponse {

			private Integer code;

			private String body;

			public Integer getCode() {
				return this.code;
			}

			public void setCode(Integer code) {
				this.code = code;
			}

			public String getBody() {
				return this.body;
			}

			public void setBody(String body) {
				this.body = body;
			}
		}

		public static class Cors {

			private String status;

			private String allowOrigins;

			private String allowMethods;

			private String allowHeaders;

			private String exposeHeaders;

			private String timeUnit;

			private Long unitNum;

			private Boolean allowCredentials;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getAllowOrigins() {
				return this.allowOrigins;
			}

			public void setAllowOrigins(String allowOrigins) {
				this.allowOrigins = allowOrigins;
			}

			public String getAllowMethods() {
				return this.allowMethods;
			}

			public void setAllowMethods(String allowMethods) {
				this.allowMethods = allowMethods;
			}

			public String getAllowHeaders() {
				return this.allowHeaders;
			}

			public void setAllowHeaders(String allowHeaders) {
				this.allowHeaders = allowHeaders;
			}

			public String getExposeHeaders() {
				return this.exposeHeaders;
			}

			public void setExposeHeaders(String exposeHeaders) {
				this.exposeHeaders = exposeHeaders;
			}

			public String getTimeUnit() {
				return this.timeUnit;
			}

			public void setTimeUnit(String timeUnit) {
				this.timeUnit = timeUnit;
			}

			public Long getUnitNum() {
				return this.unitNum;
			}

			public void setUnitNum(Long unitNum) {
				this.unitNum = unitNum;
			}

			public Boolean getAllowCredentials() {
				return this.allowCredentials;
			}

			public void setAllowCredentials(Boolean allowCredentials) {
				this.allowCredentials = allowCredentials;
			}
		}

		public static class Timeout {

			private Integer unitNum;

			private String timeUnit;

			private String status;

			public Integer getUnitNum() {
				return this.unitNum;
			}

			public void setUnitNum(Integer unitNum) {
				this.unitNum = unitNum;
			}

			public String getTimeUnit() {
				return this.timeUnit;
			}

			public void setTimeUnit(String timeUnit) {
				this.timeUnit = timeUnit;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}
		}

		public static class Retry {

			private Integer attempts;

			private String status;

			private List<String> retryOn;

			private List<String> httpCodes;

			public Integer getAttempts() {
				return this.attempts;
			}

			public void setAttempts(Integer attempts) {
				this.attempts = attempts;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public List<String> getRetryOn() {
				return this.retryOn;
			}

			public void setRetryOn(List<String> retryOn) {
				this.retryOn = retryOn;
			}

			public List<String> getHttpCodes() {
				return this.httpCodes;
			}

			public void setHttpCodes(List<String> httpCodes) {
				this.httpCodes = httpCodes;
			}
		}

		public static class Redirect {

			private Integer code;

			private String host;

			private String path;

			public Integer getCode() {
				return this.code;
			}

			public void setCode(Integer code) {
				this.code = code;
			}

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
		}
	}

	@Override
	public GetGatewayRouteDetailResponse getInstance(UnmarshallerContext context) {
		return	GetGatewayRouteDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
