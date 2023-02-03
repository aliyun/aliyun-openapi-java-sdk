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
import com.aliyuncs.mse.transform.v20190531.ListGatewayServiceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListGatewayServiceResponse extends AcsResponse {

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

		private List<Services> result;

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

		public List<Services> getResult() {
			return this.result;
		}

		public void setResult(List<Services> result) {
			this.result = result;
		}

		public static class Services {

			private Long id;

			private String name;

			private String gatewayUniqueId;

			private Long gatewayId;

			private String sourceType;

			private String namespace;

			private String groupName;

			private Long sourceId;

			private String serviceNameInRegistry;

			private String metaInfo;

			private String gmtCreate;

			private String gmtModified;

			private String serviceProtocol;

			private Long servicePort;

			private String healehStatus;

			private String healthStatus;

			private Boolean healthCheck;

			private List<VersionsItem> versions;

			private List<String> ips;

			private List<String> unhealthyEndpoints;

			private List<Integer> ports;

			private HealthCheckInfo healthCheckInfo;

			private GatewayTrafficPolicy gatewayTrafficPolicy;

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

			public Long getSourceId() {
				return this.sourceId;
			}

			public void setSourceId(Long sourceId) {
				this.sourceId = sourceId;
			}

			public String getServiceNameInRegistry() {
				return this.serviceNameInRegistry;
			}

			public void setServiceNameInRegistry(String serviceNameInRegistry) {
				this.serviceNameInRegistry = serviceNameInRegistry;
			}

			public String getMetaInfo() {
				return this.metaInfo;
			}

			public void setMetaInfo(String metaInfo) {
				this.metaInfo = metaInfo;
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

			public String getServiceProtocol() {
				return this.serviceProtocol;
			}

			public void setServiceProtocol(String serviceProtocol) {
				this.serviceProtocol = serviceProtocol;
			}

			public Long getServicePort() {
				return this.servicePort;
			}

			public void setServicePort(Long servicePort) {
				this.servicePort = servicePort;
			}

			public String getHealehStatus() {
				return this.healehStatus;
			}

			public void setHealehStatus(String healehStatus) {
				this.healehStatus = healehStatus;
			}

			public String getHealthStatus() {
				return this.healthStatus;
			}

			public void setHealthStatus(String healthStatus) {
				this.healthStatus = healthStatus;
			}

			public Boolean getHealthCheck() {
				return this.healthCheck;
			}

			public void setHealthCheck(Boolean healthCheck) {
				this.healthCheck = healthCheck;
			}

			public List<VersionsItem> getVersions() {
				return this.versions;
			}

			public void setVersions(List<VersionsItem> versions) {
				this.versions = versions;
			}

			public List<String> getIps() {
				return this.ips;
			}

			public void setIps(List<String> ips) {
				this.ips = ips;
			}

			public List<String> getUnhealthyEndpoints() {
				return this.unhealthyEndpoints;
			}

			public void setUnhealthyEndpoints(List<String> unhealthyEndpoints) {
				this.unhealthyEndpoints = unhealthyEndpoints;
			}

			public List<Integer> getPorts() {
				return this.ports;
			}

			public void setPorts(List<Integer> ports) {
				this.ports = ports;
			}

			public HealthCheckInfo getHealthCheckInfo() {
				return this.healthCheckInfo;
			}

			public void setHealthCheckInfo(HealthCheckInfo healthCheckInfo) {
				this.healthCheckInfo = healthCheckInfo;
			}

			public GatewayTrafficPolicy getGatewayTrafficPolicy() {
				return this.gatewayTrafficPolicy;
			}

			public void setGatewayTrafficPolicy(GatewayTrafficPolicy gatewayTrafficPolicy) {
				this.gatewayTrafficPolicy = gatewayTrafficPolicy;
			}

			public static class VersionsItem {

				private String name;

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}
			}

			public static class HealthCheckInfo {

				private Boolean check;

				private String protocol;

				private Integer timeout;

				private Integer interval;

				private Integer healthyThreshold;

				private Integer unhealthyThreshold;

				private String httpPath;

				private String httpHost;

				private List<Integer> expectedStatuses;

				public Boolean getCheck() {
					return this.check;
				}

				public void setCheck(Boolean check) {
					this.check = check;
				}

				public String getBizProtocol() {
					return this.protocol;
				}

				public void setBizProtocol(String protocol) {
					this.protocol = protocol;
				}

				public Integer getTimeout() {
					return this.timeout;
				}

				public void setTimeout(Integer timeout) {
					this.timeout = timeout;
				}

				public Integer getInterval() {
					return this.interval;
				}

				public void setInterval(Integer interval) {
					this.interval = interval;
				}

				public Integer getHealthyThreshold() {
					return this.healthyThreshold;
				}

				public void setHealthyThreshold(Integer healthyThreshold) {
					this.healthyThreshold = healthyThreshold;
				}

				public Integer getUnhealthyThreshold() {
					return this.unhealthyThreshold;
				}

				public void setUnhealthyThreshold(Integer unhealthyThreshold) {
					this.unhealthyThreshold = unhealthyThreshold;
				}

				public String getHttpPath() {
					return this.httpPath;
				}

				public void setHttpPath(String httpPath) {
					this.httpPath = httpPath;
				}

				public String getHttpHost() {
					return this.httpHost;
				}

				public void setHttpHost(String httpHost) {
					this.httpHost = httpHost;
				}

				public List<Integer> getExpectedStatuses() {
					return this.expectedStatuses;
				}

				public void setExpectedStatuses(List<Integer> expectedStatuses) {
					this.expectedStatuses = expectedStatuses;
				}
			}

			public static class GatewayTrafficPolicy {

				private Tls tls;

				private LoadBalancerSettings loadBalancerSettings;

				public Tls getTls() {
					return this.tls;
				}

				public void setTls(Tls tls) {
					this.tls = tls;
				}

				public LoadBalancerSettings getLoadBalancerSettings() {
					return this.loadBalancerSettings;
				}

				public void setLoadBalancerSettings(LoadBalancerSettings loadBalancerSettings) {
					this.loadBalancerSettings = loadBalancerSettings;
				}

				public static class Tls {

					private String mode;

					private String certId;

					private String caCertId;

					private String caCertContent;

					private String sni;

					private List<String> subjectAltNames;

					public String getMode() {
						return this.mode;
					}

					public void setMode(String mode) {
						this.mode = mode;
					}

					public String getCertId() {
						return this.certId;
					}

					public void setCertId(String certId) {
						this.certId = certId;
					}

					public String getCaCertId() {
						return this.caCertId;
					}

					public void setCaCertId(String caCertId) {
						this.caCertId = caCertId;
					}

					public String getCaCertContent() {
						return this.caCertContent;
					}

					public void setCaCertContent(String caCertContent) {
						this.caCertContent = caCertContent;
					}

					public String getSni() {
						return this.sni;
					}

					public void setSni(String sni) {
						this.sni = sni;
					}

					public List<String> getSubjectAltNames() {
						return this.subjectAltNames;
					}

					public void setSubjectAltNames(List<String> subjectAltNames) {
						this.subjectAltNames = subjectAltNames;
					}
				}

				public static class LoadBalancerSettings {

					private String loadbalancerType;

					private Integer warmupDuration;

					private ConsistentHashLBConfig consistentHashLBConfig;

					public String getLoadbalancerType() {
						return this.loadbalancerType;
					}

					public void setLoadbalancerType(String loadbalancerType) {
						this.loadbalancerType = loadbalancerType;
					}

					public Integer getWarmupDuration() {
						return this.warmupDuration;
					}

					public void setWarmupDuration(Integer warmupDuration) {
						this.warmupDuration = warmupDuration;
					}

					public ConsistentHashLBConfig getConsistentHashLBConfig() {
						return this.consistentHashLBConfig;
					}

					public void setConsistentHashLBConfig(ConsistentHashLBConfig consistentHashLBConfig) {
						this.consistentHashLBConfig = consistentHashLBConfig;
					}

					public static class ConsistentHashLBConfig {

						private String parameterName;

						private Long minimumRingSize;

						private String consistentHashLBType;

						private HttpCookie httpCookie;

						public String getParameterName() {
							return this.parameterName;
						}

						public void setParameterName(String parameterName) {
							this.parameterName = parameterName;
						}

						public Long getMinimumRingSize() {
							return this.minimumRingSize;
						}

						public void setMinimumRingSize(Long minimumRingSize) {
							this.minimumRingSize = minimumRingSize;
						}

						public String getConsistentHashLBType() {
							return this.consistentHashLBType;
						}

						public void setConsistentHashLBType(String consistentHashLBType) {
							this.consistentHashLBType = consistentHashLBType;
						}

						public HttpCookie getHttpCookie() {
							return this.httpCookie;
						}

						public void setHttpCookie(HttpCookie httpCookie) {
							this.httpCookie = httpCookie;
						}

						public static class HttpCookie {

							private String name;

							private String path;

							private String ttl;

							public String getName() {
								return this.name;
							}

							public void setName(String name) {
								this.name = name;
							}

							public String getPath() {
								return this.path;
							}

							public void setPath(String path) {
								this.path = path;
							}

							public String getTtl() {
								return this.ttl;
							}

							public void setTtl(String ttl) {
								this.ttl = ttl;
							}
						}
					}
				}
			}
		}
	}

	@Override
	public ListGatewayServiceResponse getInstance(UnmarshallerContext context) {
		return	ListGatewayServiceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
