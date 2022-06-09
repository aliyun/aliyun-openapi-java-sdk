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

import com.aliyuncs.RpcAcsRequest;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.mse.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateGatewayServiceTrafficPolicyRequest extends RpcAcsRequest<UpdateGatewayServiceTrafficPolicyResponse> {
	   

	private String gatewayUniqueId;

	@SerializedName("gatewayTrafficPolicy")
	private GatewayTrafficPolicy gatewayTrafficPolicy;

	private String acceptLanguage;

	private Long serviceId;

	private Long gatewayId;
	public UpdateGatewayServiceTrafficPolicyRequest() {
		super("mse", "2019-05-31", "UpdateGatewayServiceTrafficPolicy", "mse");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getGatewayUniqueId() {
		return this.gatewayUniqueId;
	}

	public void setGatewayUniqueId(String gatewayUniqueId) {
		this.gatewayUniqueId = gatewayUniqueId;
		if(gatewayUniqueId != null){
			putQueryParameter("GatewayUniqueId", gatewayUniqueId);
		}
	}

	public GatewayTrafficPolicy getGatewayTrafficPolicy() {
		return this.gatewayTrafficPolicy;
	}

	public void setGatewayTrafficPolicy(GatewayTrafficPolicy gatewayTrafficPolicy) {
		this.gatewayTrafficPolicy = gatewayTrafficPolicy;	
		if (gatewayTrafficPolicy != null) {
			putQueryParameter("GatewayTrafficPolicy" , new Gson().toJson(gatewayTrafficPolicy));
		}	
	}

	public String getAcceptLanguage() {
		return this.acceptLanguage;
	}

	public void setAcceptLanguage(String acceptLanguage) {
		this.acceptLanguage = acceptLanguage;
		if(acceptLanguage != null){
			putQueryParameter("AcceptLanguage", acceptLanguage);
		}
	}

	public Long getServiceId() {
		return this.serviceId;
	}

	public void setServiceId(Long serviceId) {
		this.serviceId = serviceId;
		if(serviceId != null){
			putQueryParameter("ServiceId", serviceId.toString());
		}
	}

	public Long getGatewayId() {
		return this.gatewayId;
	}

	public void setGatewayId(Long gatewayId) {
		this.gatewayId = gatewayId;
		if(gatewayId != null){
			putQueryParameter("GatewayId", gatewayId.toString());
		}
	}

	public static class GatewayTrafficPolicy {

		@SerializedName("TlsSetting")
		private TlsSetting tlsSetting;

		@SerializedName("LoadBalancerSettings")
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

			@SerializedName("TlsMode")
			private String tlsMode;

			@SerializedName("CaCertContent")
			private String caCertContent;

			@SerializedName("CertId")
			private String certId;

			@SerializedName("Sni")
			private String sni;

			public String getTlsMode() {
				return this.tlsMode;
			}

			public void setTlsMode(String tlsMode) {
				this.tlsMode = tlsMode;
			}

			public String getCaCertContent() {
				return this.caCertContent;
			}

			public void setCaCertContent(String caCertContent) {
				this.caCertContent = caCertContent;
			}

			public String getCertId() {
				return this.certId;
			}

			public void setCertId(String certId) {
				this.certId = certId;
			}

			public String getSni() {
				return this.sni;
			}

			public void setSni(String sni) {
				this.sni = sni;
			}
		}

		public static class LoadBalancerSettings {

			@SerializedName("WarmupDuration")
			private Long warmupDuration;

			@SerializedName("LoadbalancerType")
			private String loadbalancerType;

			@SerializedName("ConsistentHashLBConfig")
			private ConsistentHashLBConfig consistentHashLBConfig;

			public Long getWarmupDuration() {
				return this.warmupDuration;
			}

			public void setWarmupDuration(Long warmupDuration) {
				this.warmupDuration = warmupDuration;
			}

			public String getLoadbalancerType() {
				return this.loadbalancerType;
			}

			public void setLoadbalancerType(String loadbalancerType) {
				this.loadbalancerType = loadbalancerType;
			}

			public ConsistentHashLBConfig getConsistentHashLBConfig() {
				return this.consistentHashLBConfig;
			}

			public void setConsistentHashLBConfig(ConsistentHashLBConfig consistentHashLBConfig) {
				this.consistentHashLBConfig = consistentHashLBConfig;
			}

			public static class ConsistentHashLBConfig {

				@SerializedName("HttpCookie")
				private HttpCookie httpCookie;

				@SerializedName("ParameterName")
				private String parameterName;

				@SerializedName("ConsistentHashLBType")
				private String consistentHashLBType;

				public HttpCookie getHttpCookie() {
					return this.httpCookie;
				}

				public void setHttpCookie(HttpCookie httpCookie) {
					this.httpCookie = httpCookie;
				}

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

				public static class HttpCookie {

					@SerializedName("Path")
					private String path;

					@SerializedName("Name")
					private String name;

					@SerializedName("TTL")
					private String tTL;

					public String getPath() {
						return this.path;
					}

					public void setPath(String path) {
						this.path = path;
					}

					public String getName() {
						return this.name;
					}

					public void setName(String name) {
						this.name = name;
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

	@Override
	public Class<UpdateGatewayServiceTrafficPolicyResponse> getResponseClass() {
		return UpdateGatewayServiceTrafficPolicyResponse.class;
	}

}
