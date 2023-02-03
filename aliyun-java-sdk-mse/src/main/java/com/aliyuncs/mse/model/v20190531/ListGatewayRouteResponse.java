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
import com.aliyuncs.mse.transform.v20190531.ListGatewayRouteResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListGatewayRouteResponse extends AcsResponse {

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

		private Long totalSize;

		private Integer pageNumber;

		private Integer pageSize;

		private List<Routes> result;

		public Long getTotalSize() {
			return this.totalSize;
		}

		public void setTotalSize(Long totalSize) {
			this.totalSize = totalSize;
		}

		public Integer getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Integer pageNumber) {
			this.pageNumber = pageNumber;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public List<Routes> getResult() {
			return this.result;
		}

		public void setResult(List<Routes> result) {
			this.result = result;
		}

		public static class Routes {

			private Long id;

			private String name;

			private String gatewayUniqueId;

			private Long gatewayId;

			private Integer status;

			private Integer routeOrder;

			private String defaultServiceName;

			private Long defaultServiceId;

			private String predicates;

			private String gmtCreate;

			private String gmtModified;

			private String services;

			private Long domainId;

			private String domainName;

			private String destinationType;

			private String type;

			private String enableWaf;

			private Boolean fallback;

			private List<RouteServicesItem> routeServices;

			private List<FallbackServicesItem> fallbackServices;

			private List<Long> domainIdList;

			private List<String> domainNameList;

			private RoutePredicates routePredicates;

			private DirectResponse directResponse;

			private Redirect redirect;

			private Comment comment;

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

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public Integer getRouteOrder() {
				return this.routeOrder;
			}

			public void setRouteOrder(Integer routeOrder) {
				this.routeOrder = routeOrder;
			}

			public String getDefaultServiceName() {
				return this.defaultServiceName;
			}

			public void setDefaultServiceName(String defaultServiceName) {
				this.defaultServiceName = defaultServiceName;
			}

			public Long getDefaultServiceId() {
				return this.defaultServiceId;
			}

			public void setDefaultServiceId(Long defaultServiceId) {
				this.defaultServiceId = defaultServiceId;
			}

			public String getPredicates() {
				return this.predicates;
			}

			public void setPredicates(String predicates) {
				this.predicates = predicates;
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

			public String getServices() {
				return this.services;
			}

			public void setServices(String services) {
				this.services = services;
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

			public String getDestinationType() {
				return this.destinationType;
			}

			public void setDestinationType(String destinationType) {
				this.destinationType = destinationType;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getEnableWaf() {
				return this.enableWaf;
			}

			public void setEnableWaf(String enableWaf) {
				this.enableWaf = enableWaf;
			}

			public Boolean getFallback() {
				return this.fallback;
			}

			public void setFallback(Boolean fallback) {
				this.fallback = fallback;
			}

			public List<RouteServicesItem> getRouteServices() {
				return this.routeServices;
			}

			public void setRouteServices(List<RouteServicesItem> routeServices) {
				this.routeServices = routeServices;
			}

			public List<FallbackServicesItem> getFallbackServices() {
				return this.fallbackServices;
			}

			public void setFallbackServices(List<FallbackServicesItem> fallbackServices) {
				this.fallbackServices = fallbackServices;
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

			public DirectResponse getDirectResponse() {
				return this.directResponse;
			}

			public void setDirectResponse(DirectResponse directResponse) {
				this.directResponse = directResponse;
			}

			public Redirect getRedirect() {
				return this.redirect;
			}

			public void setRedirect(Redirect redirect) {
				this.redirect = redirect;
			}

			public Comment getComment() {
				return this.comment;
			}

			public void setComment(Comment comment) {
				this.comment = comment;
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

				private String agreementType;

				private Integer servicePort;

				private HttpDubboTranscoder httpDubboTranscoder;

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

				public String getAgreementType() {
					return this.agreementType;
				}

				public void setAgreementType(String agreementType) {
					this.agreementType = agreementType;
				}

				public Integer getServicePort() {
					return this.servicePort;
				}

				public void setServicePort(Integer servicePort) {
					this.servicePort = servicePort;
				}

				public HttpDubboTranscoder getHttpDubboTranscoder() {
					return this.httpDubboTranscoder;
				}

				public void setHttpDubboTranscoder(HttpDubboTranscoder httpDubboTranscoder) {
					this.httpDubboTranscoder = httpDubboTranscoder;
				}

				public static class HttpDubboTranscoder {

					private String dubboServiceName;

					private String dubboServiceVersion;

					private String dubboServiceGroup;

					private List<MothedMapListItem> mothedMapList;

					public String getDubboServiceName() {
						return this.dubboServiceName;
					}

					public void setDubboServiceName(String dubboServiceName) {
						this.dubboServiceName = dubboServiceName;
					}

					public String getDubboServiceVersion() {
						return this.dubboServiceVersion;
					}

					public void setDubboServiceVersion(String dubboServiceVersion) {
						this.dubboServiceVersion = dubboServiceVersion;
					}

					public String getDubboServiceGroup() {
						return this.dubboServiceGroup;
					}

					public void setDubboServiceGroup(String dubboServiceGroup) {
						this.dubboServiceGroup = dubboServiceGroup;
					}

					public List<MothedMapListItem> getMothedMapList() {
						return this.mothedMapList;
					}

					public void setMothedMapList(List<MothedMapListItem> mothedMapList) {
						this.mothedMapList = mothedMapList;
					}

					public static class MothedMapListItem {

						private String dubboMothedName;

						private String httpMothed;

						private String mothedpath;

						private String passThroughAllHeaders;

						private List<ParamMapsListItem> paramMapsList;

						private List<String> passThroughList;

						public String getDubboMothedName() {
							return this.dubboMothedName;
						}

						public void setDubboMothedName(String dubboMothedName) {
							this.dubboMothedName = dubboMothedName;
						}

						public String getHttpMothed() {
							return this.httpMothed;
						}

						public void setHttpMothed(String httpMothed) {
							this.httpMothed = httpMothed;
						}

						public String getMothedpath() {
							return this.mothedpath;
						}

						public void setMothedpath(String mothedpath) {
							this.mothedpath = mothedpath;
						}

						public String getPassThroughAllHeaders() {
							return this.passThroughAllHeaders;
						}

						public void setPassThroughAllHeaders(String passThroughAllHeaders) {
							this.passThroughAllHeaders = passThroughAllHeaders;
						}

						public List<ParamMapsListItem> getParamMapsList() {
							return this.paramMapsList;
						}

						public void setParamMapsList(List<ParamMapsListItem> paramMapsList) {
							this.paramMapsList = paramMapsList;
						}

						public List<String> getPassThroughList() {
							return this.passThroughList;
						}

						public void setPassThroughList(List<String> passThroughList) {
							this.passThroughList = passThroughList;
						}

						public static class ParamMapsListItem {

							private String extractKeySpec;

							private String extractKey;

							private String mappingType;

							public String getExtractKeySpec() {
								return this.extractKeySpec;
							}

							public void setExtractKeySpec(String extractKeySpec) {
								this.extractKeySpec = extractKeySpec;
							}

							public String getExtractKey() {
								return this.extractKey;
							}

							public void setExtractKey(String extractKey) {
								this.extractKey = extractKey;
							}

							public String getMappingType() {
								return this.mappingType;
							}

							public void setMappingType(String mappingType) {
								this.mappingType = mappingType;
							}
						}
					}
				}
			}

			public static class FallbackServicesItem {

				private Long serviceId;

				private String serviceName;

				private Integer percent;

				private String version;

				private String name;

				private String sourceType;

				private String namespace;

				private String groupName;

				private String agreementType;

				private Integer servicePort;

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

				public String getAgreementType() {
					return this.agreementType;
				}

				public void setAgreementType(String agreementType) {
					this.agreementType = agreementType;
				}

				public Integer getServicePort() {
					return this.servicePort;
				}

				public void setServicePort(Integer servicePort) {
					this.servicePort = servicePort;
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

			public static class Comment {

				private String status;

				public String getStatus() {
					return this.status;
				}

				public void setStatus(String status) {
					this.status = status;
				}
			}
		}
	}

	@Override
	public ListGatewayRouteResponse getInstance(UnmarshallerContext context) {
		return	ListGatewayRouteResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
