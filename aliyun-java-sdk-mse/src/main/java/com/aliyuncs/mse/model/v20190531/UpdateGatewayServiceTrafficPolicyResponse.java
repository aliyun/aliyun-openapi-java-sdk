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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.mse.transform.v20190531.UpdateGatewayServiceTrafficPolicyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UpdateGatewayServiceTrafficPolicyResponse extends AcsResponse {

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

		private String sourceType;

		private String gatewayUniqueId;

		private String metaInfo;

		private String namespace;

		private String groupName;

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

		public String getSourceType() {
			return this.sourceType;
		}

		public void setSourceType(String sourceType) {
			this.sourceType = sourceType;
		}

		public String getGatewayUniqueId() {
			return this.gatewayUniqueId;
		}

		public void setGatewayUniqueId(String gatewayUniqueId) {
			this.gatewayUniqueId = gatewayUniqueId;
		}

		public String getMetaInfo() {
			return this.metaInfo;
		}

		public void setMetaInfo(String metaInfo) {
			this.metaInfo = metaInfo;
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

		public GatewayTrafficPolicy getGatewayTrafficPolicy() {
			return this.gatewayTrafficPolicy;
		}

		public void setGatewayTrafficPolicy(GatewayTrafficPolicy gatewayTrafficPolicy) {
			this.gatewayTrafficPolicy = gatewayTrafficPolicy;
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
	public UpdateGatewayServiceTrafficPolicyResponse getInstance(UnmarshallerContext context) {
		return	UpdateGatewayServiceTrafficPolicyResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
