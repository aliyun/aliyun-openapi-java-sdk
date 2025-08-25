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

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SetApplicationProvisioningConfigRequest extends RpcAcsRequest<SetApplicationProvisioningConfigResponse> {
	   

	private String networkAccessEndpointId;

	private String provisionProtocolType;

	private String applicationId;

	private CallbackProvisioningConfig callbackProvisioningConfig;

	private String instanceId;

	private Boolean provisionPassword;

	private ScimProvisioningConfig scimProvisioningConfig;
	public SetApplicationProvisioningConfigRequest() {
		super("Eiam", "2021-12-01", "SetApplicationProvisioningConfig", "eiam");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getNetworkAccessEndpointId() {
		return this.networkAccessEndpointId;
	}

	public void setNetworkAccessEndpointId(String networkAccessEndpointId) {
		this.networkAccessEndpointId = networkAccessEndpointId;
		if(networkAccessEndpointId != null){
			putQueryParameter("NetworkAccessEndpointId", networkAccessEndpointId);
		}
	}

	public String getProvisionProtocolType() {
		return this.provisionProtocolType;
	}

	public void setProvisionProtocolType(String provisionProtocolType) {
		this.provisionProtocolType = provisionProtocolType;
		if(provisionProtocolType != null){
			putQueryParameter("ProvisionProtocolType", provisionProtocolType);
		}
	}

	public String getApplicationId() {
		return this.applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
		if(applicationId != null){
			putQueryParameter("ApplicationId", applicationId);
		}
	}

	public CallbackProvisioningConfig getCallbackProvisioningConfig() {
		return this.callbackProvisioningConfig;
	}

	public void setCallbackProvisioningConfig(CallbackProvisioningConfig callbackProvisioningConfig) {
		this.callbackProvisioningConfig = callbackProvisioningConfig;	
		if (callbackProvisioningConfig != null) {
			
				if (callbackProvisioningConfig.getListenEventScopes() != null) {
					for (int depth1 = 0; depth1 < callbackProvisioningConfig.getListenEventScopes().size(); depth1++) {
						putQueryParameter("CallbackProvisioningConfig.ListenEventScopes." + (depth1 + 1) , callbackProvisioningConfig.getListenEventScopes().get(depth1));
					}
				}
				putQueryParameter("CallbackProvisioningConfig.EncryptRequired" , callbackProvisioningConfig.getEncryptRequired());
				putQueryParameter("CallbackProvisioningConfig.CallbackUrl" , callbackProvisioningConfig.getCallbackUrl());
				putQueryParameter("CallbackProvisioningConfig.EncryptKey" , callbackProvisioningConfig.getEncryptKey());
		}	
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public Boolean getProvisionPassword() {
		return this.provisionPassword;
	}

	public void setProvisionPassword(Boolean provisionPassword) {
		this.provisionPassword = provisionPassword;
		if(provisionPassword != null){
			putQueryParameter("ProvisionPassword", provisionPassword.toString());
		}
	}

	public ScimProvisioningConfig getScimProvisioningConfig() {
		return this.scimProvisioningConfig;
	}

	public void setScimProvisioningConfig(ScimProvisioningConfig scimProvisioningConfig) {
		this.scimProvisioningConfig = scimProvisioningConfig;	
		if (scimProvisioningConfig != null) {
			
				if (scimProvisioningConfig.getFullPushScopes() != null) {
					for (int depth1 = 0; depth1 < scimProvisioningConfig.getFullPushScopes().size(); depth1++) {
						putQueryParameter("ScimProvisioningConfig.FullPushScopes." + (depth1 + 1) , scimProvisioningConfig.getFullPushScopes().get(depth1));
					}
				}
				if (scimProvisioningConfig.getAuthnConfiguration() != null) {
					
						putQueryParameter("ScimProvisioningConfig.AuthnConfiguration.AuthnMode" , scimProvisioningConfig.getAuthnConfiguration().getAuthnMode());
						putQueryParameter("ScimProvisioningConfig.AuthnConfiguration.GrantType" , scimProvisioningConfig.getAuthnConfiguration().getGrantType());
						if (scimProvisioningConfig.getAuthnConfiguration().getAuthnParam() != null) {
							
								putQueryParameter("ScimProvisioningConfig.AuthnConfiguration.AuthnParam.ClientId" , scimProvisioningConfig.getAuthnConfiguration().getAuthnParam().getClientId());
								putQueryParameter("ScimProvisioningConfig.AuthnConfiguration.AuthnParam.ClientSecret" , scimProvisioningConfig.getAuthnConfiguration().getAuthnParam().getClientSecret());
								putQueryParameter("ScimProvisioningConfig.AuthnConfiguration.AuthnParam.AccessToken" , scimProvisioningConfig.getAuthnConfiguration().getAuthnParam().getAccessToken());
								putQueryParameter("ScimProvisioningConfig.AuthnConfiguration.AuthnParam.TokenEndpoint" , scimProvisioningConfig.getAuthnConfiguration().getAuthnParam().getTokenEndpoint());
								putQueryParameter("ScimProvisioningConfig.AuthnConfiguration.AuthnParam.AuthnMethod" , scimProvisioningConfig.getAuthnConfiguration().getAuthnParam().getAuthnMethod());
						}
				}
				putQueryParameter("ScimProvisioningConfig.ScimBaseUrl" , scimProvisioningConfig.getScimBaseUrl());
				if (scimProvisioningConfig.getProvisioningActions() != null) {
					for (int depth1 = 0; depth1 < scimProvisioningConfig.getProvisioningActions().size(); depth1++) {
						putQueryParameter("ScimProvisioningConfig.ProvisioningActions." + (depth1 + 1) , scimProvisioningConfig.getProvisioningActions().get(depth1));
					}
				}
		}	
	}

	public static class CallbackProvisioningConfig {

		private List<String> listenEventScopes;

		private Boolean encryptRequired;

		private String callbackUrl;

		private String encryptKey;

		public List<String> getListenEventScopes() {
			return this.listenEventScopes;
		}

		public void setListenEventScopes(List<String> listenEventScopes) {
			this.listenEventScopes = listenEventScopes;
		}

		public Boolean getEncryptRequired() {
			return this.encryptRequired;
		}

		public void setEncryptRequired(Boolean encryptRequired) {
			this.encryptRequired = encryptRequired;
		}

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
	}

	public static class ScimProvisioningConfig {

		private List<String> fullPushScopes;

		private AuthnConfiguration authnConfiguration;

		private String scimBaseUrl;

		private List<String> provisioningActions;

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

				private String clientId;

				private String clientSecret;

				private String accessToken;

				private String tokenEndpoint;

				private String authnMethod;

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

				public String getAuthnMethod() {
					return this.authnMethod;
				}

				public void setAuthnMethod(String authnMethod) {
					this.authnMethod = authnMethod;
				}
			}
		}
	}

	@Override
	public Class<SetApplicationProvisioningConfigResponse> getResponseClass() {
		return SetApplicationProvisioningConfigResponse.class;
	}

}
