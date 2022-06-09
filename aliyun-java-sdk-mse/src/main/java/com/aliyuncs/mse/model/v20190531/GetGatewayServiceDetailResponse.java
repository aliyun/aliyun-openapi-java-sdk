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
import com.aliyuncs.mse.transform.v20190531.GetGatewayServiceDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetGatewayServiceDetailResponse extends AcsResponse {

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

		private String sourceType;

		private String namespace;

		private String groupName;

		private Long sourceId;

		private String serviceNameInRegistry;

		private String metaInfo;

		private String gmtCreate;

		private String gmtModified;

		private List<VersionsItem> versions;

		private List<LabelDetailsItem> labelDetails;

		private List<VersionDetailsItem> versionDetails;

		private List<String> ips;

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

		public List<VersionsItem> getVersions() {
			return this.versions;
		}

		public void setVersions(List<VersionsItem> versions) {
			this.versions = versions;
		}

		public List<LabelDetailsItem> getLabelDetails() {
			return this.labelDetails;
		}

		public void setLabelDetails(List<LabelDetailsItem> labelDetails) {
			this.labelDetails = labelDetails;
		}

		public List<VersionDetailsItem> getVersionDetails() {
			return this.versionDetails;
		}

		public void setVersionDetails(List<VersionDetailsItem> versionDetails) {
			this.versionDetails = versionDetails;
		}

		public List<String> getIps() {
			return this.ips;
		}

		public void setIps(List<String> ips) {
			this.ips = ips;
		}

		public GatewayTrafficPolicy getGatewayTrafficPolicy() {
			return this.gatewayTrafficPolicy;
		}

		public void setGatewayTrafficPolicy(GatewayTrafficPolicy gatewayTrafficPolicy) {
			this.gatewayTrafficPolicy = gatewayTrafficPolicy;
		}

		public static class VersionsItem {

			private String label;

			private String value;

			private String type;

			public String getLabel() {
				return this.label;
			}

			public void setLabel(String label) {
				this.label = label;
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

		public static class LabelDetailsItem {

			private String key;

			private List<String> values;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public List<String> getValues() {
				return this.values;
			}

			public void setValues(List<String> values) {
				this.values = values;
			}
		}

		public static class VersionDetailsItem {

			private Integer endpointNum;

			private String endpointNumPercent;

			private ServiceVersion serviceVersion;

			public Integer getEndpointNum() {
				return this.endpointNum;
			}

			public void setEndpointNum(Integer endpointNum) {
				this.endpointNum = endpointNum;
			}

			public String getEndpointNumPercent() {
				return this.endpointNumPercent;
			}

			public void setEndpointNumPercent(String endpointNumPercent) {
				this.endpointNumPercent = endpointNumPercent;
			}

			public ServiceVersion getServiceVersion() {
				return this.serviceVersion;
			}

			public void setServiceVersion(ServiceVersion serviceVersion) {
				this.serviceVersion = serviceVersion;
			}

			public static class ServiceVersion {

				private String name;

				private List<LabelsItem> labels;

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public List<LabelsItem> getLabels() {
					return this.labels;
				}

				public void setLabels(List<LabelsItem> labels) {
					this.labels = labels;
				}

				public static class LabelsItem {

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

		public static class GatewayTrafficPolicy {

			private TlsSetting tlsSetting;

			private LoadBalancerSettings loadBalancerSettings;

			public TlsSetting getTlsSetting() {
				return this.tlsSetting;
			}

			public void setTlsSetting(TlsSetting tlsSetting) {
				this.tlsSetting = tlsSetting;
			}

			public LoadBalancerSettings getLoadBalancerSettings() {
				return this.loadBalancerSettings;
			}

			public void setLoadBalancerSettings(LoadBalancerSettings loadBalancerSettings) {
				this.loadBalancerSettings = loadBalancerSettings;
			}

			public static class TlsSetting {

				private String tlsMode;

				private String certId;

				private String caCertContent;

				private String sni;

				public String getTlsMode() {
					return this.tlsMode;
				}

				public void setTlsMode(String tlsMode) {
					this.tlsMode = tlsMode;
				}

				public String getCertId() {
					return this.certId;
				}

				public void setCertId(String certId) {
					this.certId = certId;
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
			}

			public static class LoadBalancerSettings {

				private String loadbalancerType;

				private Long warmupDuration;

				private ConsistentHashLBConfig consistentHashLBConfig;

				public String getLoadbalancerType() {
					return this.loadbalancerType;
				}

				public void setLoadbalancerType(String loadbalancerType) {
					this.loadbalancerType = loadbalancerType;
				}

				public Long getWarmupDuration() {
					return this.warmupDuration;
				}

				public void setWarmupDuration(Long warmupDuration) {
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

					private String consistentHashLBType;

					private HttpCookie httpCookie;

					public String getParameterName() {
						return this.parameterName;
					}

					public void setParameterName(String parameterName) {
						this.parameterName = parameterName;
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

						private String tTL;

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

						public String getTTL() {
							return this.tTL;
						}

						public void setTTL(String tTL) {
							this.tTL = tTL;
						}
					}
				}
			}
		}
	}

	@Override
	public GetGatewayServiceDetailResponse getInstance(UnmarshallerContext context) {
		return	GetGatewayServiceDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
