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

package com.aliyuncs.eiam.model.v20211201;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eiam.transform.v20211201.GetApplicationProvisioningConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetApplicationProvisioningConfigResponse extends AcsResponse {

	private String requestId;

	private ApplicationProvisioningConfig applicationProvisioningConfig;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ApplicationProvisioningConfig getApplicationProvisioningConfig() {
		return this.applicationProvisioningConfig;
	}

	public void setApplicationProvisioningConfig(ApplicationProvisioningConfig applicationProvisioningConfig) {
		this.applicationProvisioningConfig = applicationProvisioningConfig;
	}

	public static class ApplicationProvisioningConfig {

		private String instanceId;

		private String applicationId;

		private String provisionProtocolType;

		private String provisionJwksEndpoint;

		private Boolean provisionPassword;

		private String status;

		private String configOperateMode;

		private String networkAccessEndpointId;

		private CallbackProvisioningConfig callbackProvisioningConfig;

		private ScimProvisioningConfig scimProvisioningConfig;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getApplicationId() {
			return this.applicationId;
		}

		public void setApplicationId(String applicationId) {
			this.applicationId = applicationId;
		}

		public String getProvisionProtocolType() {
			return this.provisionProtocolType;
		}

		public void setProvisionProtocolType(String provisionProtocolType) {
			this.provisionProtocolType = provisionProtocolType;
		}

		public String getProvisionJwksEndpoint() {
			return this.provisionJwksEndpoint;
		}

		public void setProvisionJwksEndpoint(String provisionJwksEndpoint) {
			this.provisionJwksEndpoint = provisionJwksEndpoint;
		}

		public Boolean getProvisionPassword() {
			return this.provisionPassword;
		}

		public void setProvisionPassword(Boolean provisionPassword) {
			this.provisionPassword = provisionPassword;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getConfigOperateMode() {
			return this.configOperateMode;
		}

		public void setConfigOperateMode(String configOperateMode) {
			this.configOperateMode = configOperateMode;
		}

		public String getNetworkAccessEndpointId() {
			return this.networkAccessEndpointId;
		}

		public void setNetworkAccessEndpointId(String networkAccessEndpointId) {
			this.networkAccessEndpointId = networkAccessEndpointId;
		}

		public CallbackProvisioningConfig getCallbackProvisioningConfig() {
			return this.callbackProvisioningConfig;
		}

		public void setCallbackProvisioningConfig(CallbackProvisioningConfig callbackProvisioningConfig) {
			this.callbackProvisioningConfig = callbackProvisioningConfig;
		}

		public ScimProvisioningConfig getScimProvisioningConfig() {
			return this.scimProvisioningConfig;
		}

		public void setScimProvisioningConfig(ScimProvisioningConfig scimProvisioningConfig) {
			this.scimProvisioningConfig = scimProvisioningConfig;
		}

		public static class CallbackProvisioningConfig {

			private String callbackUrl;

			private String encryptKey;

			private Boolean encryptRequired;

			private List<String> listenEventScopes;

			public String getCallbackUrl() {
				return this.callbackUrl;
			}

			public void setCallbackUrl(String callbackUrl) {
				this.callbackUrl = callbackUrl;
			}

			public String getEncryptKey() {
				return this.encryptKey;
			}

			public void setEncryptKey(String encryptKey) {
				this.encryptKey = encryptKey;
			}

			public Boolean getEncryptRequired() {
				return this.encryptRequired;
			}

			public void setEncryptRequired(Boolean encryptRequired) {
				this.encryptRequired = encryptRequired;
			}

			public List<String> getListenEventScopes() {
				return this.listenEventScopes;
			}

			public void setListenEventScopes(List<String> listenEventScopes) {
				this.listenEventScopes = listenEventScopes;
			}
		}

		public static class ScimProvisioningConfig {

			private String scimBaseUrl;

			private List<String> provisioningActions;

			private List<String> fullPushScopes;

			private AuthnConfiguration authnConfiguration;

			public String getScimBaseUrl() {
				return this.scimBaseUrl;
			}

			public void setScimBaseUrl(String scimBaseUrl) {
				this.scimBaseUrl = scimBaseUrl;
			}

			public List<String> getProvisioningActions() {
				return this.provisioningActions;
			}

			public void setProvisioningActions(List<String> provisioningActions) {
				this.provisioningActions = provisioningActions;
			}

			public List<String> getFullPushScopes() {
				return this.fullPushScopes;
			}

			public void setFullPushScopes(List<String> fullPushScopes) {
				this.fullPushScopes = fullPushScopes;
			}

			public AuthnConfiguration getAuthnConfiguration() {
				return this.authnConfiguration;
			}

			public void setAuthnConfiguration(AuthnConfiguration authnConfiguration) {
				this.authnConfiguration = authnConfiguration;
			}

			public static class AuthnConfiguration {

				private String authnMode;

				private String grantType;

				private AuthnParam authnParam;

				public String getAuthnMode() {
					return this.authnMode;
				}

				public void setAuthnMode(String authnMode) {
					this.authnMode = authnMode;
				}

				public String getGrantType() {
					return this.grantType;
				}

				public void setGrantType(String grantType) {
					this.grantType = grantType;
				}

				public AuthnParam getAuthnParam() {
					return this.authnParam;
				}

				public void setAuthnParam(AuthnParam authnParam) {
					this.authnParam = authnParam;
				}

				public static class AuthnParam {

					private String accessToken;

					private String tokenEndpoint;

					private String clientId;

					private String clientSecret;

					private String authnMethod;

					public String getAccessToken() {
						return this.accessToken;
					}

					public void setAccessToken(String accessToken) {
						this.accessToken = accessToken;
					}

					public String getTokenEndpoint() {
						return this.tokenEndpoint;
					}

					public void setTokenEndpoint(String tokenEndpoint) {
						this.tokenEndpoint = tokenEndpoint;
					}

					public String getClientId() {
						return this.clientId;
					}

					public void setClientId(String clientId) {
						this.clientId = clientId;
					}

					public String getClientSecret() {
						return this.clientSecret;
					}

					public void setClientSecret(String clientSecret) {
						this.clientSecret = clientSecret;
					}

					public String getAuthnMethod() {
						return this.authnMethod;
					}

					public void setAuthnMethod(String authnMethod) {
						this.authnMethod = authnMethod;
					}
				}
			}
		}
	}

	@Override
	public GetApplicationProvisioningConfigResponse getInstance(UnmarshallerContext context) {
		return	GetApplicationProvisioningConfigResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
