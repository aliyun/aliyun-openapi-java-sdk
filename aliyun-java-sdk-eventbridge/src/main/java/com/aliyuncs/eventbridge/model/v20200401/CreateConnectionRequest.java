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

package com.aliyuncs.eventbridge.model.v20200401;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateConnectionRequest extends RpcAcsRequest<CreateConnectionResponse> {
	   

	private String connectionName;

	private String description;

	@SerializedName("networkParameters")
	private NetworkParameters networkParameters;

	@SerializedName("authParameters")
	private AuthParameters authParameters;
	public CreateConnectionRequest() {
		super("eventbridge", "2020-04-01", "CreateConnection");
		setMethod(MethodType.POST);
	}

	public String getConnectionName() {
		return this.connectionName;
	}

	public void setConnectionName(String connectionName) {
		this.connectionName = connectionName;
		if(connectionName != null){
			putQueryParameter("ConnectionName", connectionName);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public NetworkParameters getNetworkParameters() {
		return this.networkParameters;
	}

	public void setNetworkParameters(NetworkParameters networkParameters) {
		this.networkParameters = networkParameters;	
		if (networkParameters != null) {
			putQueryParameter("NetworkParameters" , new Gson().toJson(networkParameters));
		}	
	}

	public AuthParameters getAuthParameters() {
		return this.authParameters;
	}

	public void setAuthParameters(AuthParameters authParameters) {
		this.authParameters = authParameters;	
		if (authParameters != null) {
			putQueryParameter("AuthParameters" , new Gson().toJson(authParameters));
		}	
	}

	public static class NetworkParameters {

		@SerializedName("VpcId")
		private String vpcId;

		@SerializedName("SecurityGroupId")
		private String securityGroupId;

		@SerializedName("NetworkType")
		private String networkType;

		@SerializedName("VswitcheId")
		private String vswitcheId;

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getSecurityGroupId() {
			return this.securityGroupId;
		}

		public void setSecurityGroupId(String securityGroupId) {
			this.securityGroupId = securityGroupId;
		}

		public String getNetworkType() {
			return this.networkType;
		}

		public void setNetworkType(String networkType) {
			this.networkType = networkType;
		}

		public String getVswitcheId() {
			return this.vswitcheId;
		}

		public void setVswitcheId(String vswitcheId) {
			this.vswitcheId = vswitcheId;
		}
	}

	public static class AuthParameters {

		@SerializedName("BasicAuthParameters")
		private BasicAuthParameters basicAuthParameters;

		@SerializedName("ApiKeyAuthParameters")
		private ApiKeyAuthParameters apiKeyAuthParameters;

		@SerializedName("AuthorizationType")
		private String authorizationType;

		@SerializedName("InvocationHttpParameters")
		private InvocationHttpParameters invocationHttpParameters;

		@SerializedName("OAuthParameters")
		private OAuthParameters oAuthParameters;

		public BasicAuthParameters getBasicAuthParameters() {
			return this.basicAuthParameters;
		}

		public void setBasicAuthParameters(BasicAuthParameters basicAuthParameters) {
			this.basicAuthParameters = basicAuthParameters;
		}

		public ApiKeyAuthParameters getApiKeyAuthParameters() {
			return this.apiKeyAuthParameters;
		}

		public void setApiKeyAuthParameters(ApiKeyAuthParameters apiKeyAuthParameters) {
			this.apiKeyAuthParameters = apiKeyAuthParameters;
		}

		public String getAuthorizationType() {
			return this.authorizationType;
		}

		public void setAuthorizationType(String authorizationType) {
			this.authorizationType = authorizationType;
		}

		public InvocationHttpParameters getInvocationHttpParameters() {
			return this.invocationHttpParameters;
		}

		public void setInvocationHttpParameters(InvocationHttpParameters invocationHttpParameters) {
			this.invocationHttpParameters = invocationHttpParameters;
		}

		public OAuthParameters getOAuthParameters() {
			return this.oAuthParameters;
		}

		public void setOAuthParameters(OAuthParameters oAuthParameters) {
			this.oAuthParameters = oAuthParameters;
		}

		public static class BasicAuthParameters {

			@SerializedName("Password")
			private String password;

			@SerializedName("Username")
			private String username;

			public String getPassword() {
				return this.password;
			}

			public void setPassword(String password) {
				this.password = password;
			}

			public String getUsername() {
				return this.username;
			}

			public void setUsername(String username) {
				this.username = username;
			}
		}

		public static class ApiKeyAuthParameters {

			@SerializedName("ApiKeyName")
			private String apiKeyName;

			@SerializedName("ApiKeyValue")
			private String apiKeyValue;

			public String getApiKeyName() {
				return this.apiKeyName;
			}

			public void setApiKeyName(String apiKeyName) {
				this.apiKeyName = apiKeyName;
			}

			public String getApiKeyValue() {
				return this.apiKeyValue;
			}

			public void setApiKeyValue(String apiKeyValue) {
				this.apiKeyValue = apiKeyValue;
			}
		}

		public static class InvocationHttpParameters {

			@SerializedName("BodyParameters")
			private List<BodyParametersItem> bodyParameters;

			@SerializedName("HeaderParameters")
			private List<HeaderParametersItem> headerParameters;

			@SerializedName("QueryStringParameters")
			private List<QueryStringParametersItem> queryStringParameters;

			public List<BodyParametersItem> getBodyParameters() {
				return this.bodyParameters;
			}

			public void setBodyParameters(List<BodyParametersItem> bodyParameters) {
				this.bodyParameters = bodyParameters;
			}

			public List<HeaderParametersItem> getHeaderParameters() {
				return this.headerParameters;
			}

			public void setHeaderParameters(List<HeaderParametersItem> headerParameters) {
				this.headerParameters = headerParameters;
			}

			public List<QueryStringParametersItem> getQueryStringParameters() {
				return this.queryStringParameters;
			}

			public void setQueryStringParameters(List<QueryStringParametersItem> queryStringParameters) {
				this.queryStringParameters = queryStringParameters;
			}

			public static class BodyParametersItem {

				@SerializedName("IsValueSecret")
				private String isValueSecret;

				@SerializedName("Value")
				private String value;

				@SerializedName("Key")
				private String key;

				public String getIsValueSecret() {
					return this.isValueSecret;
				}

				public void setIsValueSecret(String isValueSecret) {
					this.isValueSecret = isValueSecret;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}

				public String getKey() {
					return this.key;
				}

				public void setKey(String key) {
					this.key = key;
				}
			}

			public static class HeaderParametersItem {

				@SerializedName("IsValueSecret")
				private String isValueSecret;

				@SerializedName("Value")
				private String value;

				@SerializedName("Key")
				private String key;

				public String getIsValueSecret() {
					return this.isValueSecret;
				}

				public void setIsValueSecret(String isValueSecret) {
					this.isValueSecret = isValueSecret;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}

				public String getKey() {
					return this.key;
				}

				public void setKey(String key) {
					this.key = key;
				}
			}

			public static class QueryStringParametersItem {

				@SerializedName("IsValueSecret")
				private String isValueSecret;

				@SerializedName("Value")
				private String value;

				@SerializedName("Key")
				private String key;

				public String getIsValueSecret() {
					return this.isValueSecret;
				}

				public void setIsValueSecret(String isValueSecret) {
					this.isValueSecret = isValueSecret;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}

				public String getKey() {
					return this.key;
				}

				public void setKey(String key) {
					this.key = key;
				}
			}
		}

		public static class OAuthParameters {

			@SerializedName("ClientParameters")
			private ClientParameters clientParameters;

			@SerializedName("AuthorizationEndpoint")
			private String authorizationEndpoint;

			@SerializedName("HttpMethod")
			private String httpMethod;

			@SerializedName("OAuthHttpParameters")
			private OAuthHttpParameters oAuthHttpParameters;

			public ClientParameters getClientParameters() {
				return this.clientParameters;
			}

			public void setClientParameters(ClientParameters clientParameters) {
				this.clientParameters = clientParameters;
			}

			public String getAuthorizationEndpoint() {
				return this.authorizationEndpoint;
			}

			public void setAuthorizationEndpoint(String authorizationEndpoint) {
				this.authorizationEndpoint = authorizationEndpoint;
			}

			public String getHttpMethod() {
				return this.httpMethod;
			}

			public void setHttpMethod(String httpMethod) {
				this.httpMethod = httpMethod;
			}

			public OAuthHttpParameters getOAuthHttpParameters() {
				return this.oAuthHttpParameters;
			}

			public void setOAuthHttpParameters(OAuthHttpParameters oAuthHttpParameters) {
				this.oAuthHttpParameters = oAuthHttpParameters;
			}

			public static class ClientParameters {

				@SerializedName("ClientID")
				private String clientID;

				@SerializedName("ClientSecret")
				private String clientSecret;

				public String getClientID() {
					return this.clientID;
				}

				public void setClientID(String clientID) {
					this.clientID = clientID;
				}

				public String getClientSecret() {
					return this.clientSecret;
				}

				public void setClientSecret(String clientSecret) {
					this.clientSecret = clientSecret;
				}
			}

			public static class OAuthHttpParameters {

				@SerializedName("BodyParameters")
				private List<BodyParametersItem> bodyParameters;

				@SerializedName("HeaderParameters")
				private List<HeaderParametersItem> headerParameters;

				@SerializedName("QueryStringParameters")
				private List<QueryStringParametersItem> queryStringParameters;

				public List<BodyParametersItem> getBodyParameters() {
					return this.bodyParameters;
				}

				public void setBodyParameters(List<BodyParametersItem> bodyParameters) {
					this.bodyParameters = bodyParameters;
				}

				public List<HeaderParametersItem> getHeaderParameters() {
					return this.headerParameters;
				}

				public void setHeaderParameters(List<HeaderParametersItem> headerParameters) {
					this.headerParameters = headerParameters;
				}

				public List<QueryStringParametersItem> getQueryStringParameters() {
					return this.queryStringParameters;
				}

				public void setQueryStringParameters(List<QueryStringParametersItem> queryStringParameters) {
					this.queryStringParameters = queryStringParameters;
				}

				public static class BodyParametersItem {

					@SerializedName("IsValueSecret")
					private String isValueSecret;

					@SerializedName("Value")
					private String value;

					@SerializedName("Key")
					private String key;

					public String getIsValueSecret() {
						return this.isValueSecret;
					}

					public void setIsValueSecret(String isValueSecret) {
						this.isValueSecret = isValueSecret;
					}

					public String getValue() {
						return this.value;
					}

					public void setValue(String value) {
						this.value = value;
					}

					public String getKey() {
						return this.key;
					}

					public void setKey(String key) {
						this.key = key;
					}
				}

				public static class HeaderParametersItem {

					@SerializedName("IsValueSecret")
					private String isValueSecret;

					@SerializedName("Value")
					private String value;

					@SerializedName("Key")
					private String key;

					public String getIsValueSecret() {
						return this.isValueSecret;
					}

					public void setIsValueSecret(String isValueSecret) {
						this.isValueSecret = isValueSecret;
					}

					public String getValue() {
						return this.value;
					}

					public void setValue(String value) {
						this.value = value;
					}

					public String getKey() {
						return this.key;
					}

					public void setKey(String key) {
						this.key = key;
					}
				}

				public static class QueryStringParametersItem {

					@SerializedName("IsValueSecret")
					private String isValueSecret;

					@SerializedName("Value")
					private String value;

					@SerializedName("Key")
					private String key;

					public String getIsValueSecret() {
						return this.isValueSecret;
					}

					public void setIsValueSecret(String isValueSecret) {
						this.isValueSecret = isValueSecret;
					}

					public String getValue() {
						return this.value;
					}

					public void setValue(String value) {
						this.value = value;
					}

					public String getKey() {
						return this.key;
					}

					public void setKey(String key) {
						this.key = key;
					}
				}
			}
		}
	}

	@Override
	public Class<CreateConnectionResponse> getResponseClass() {
		return CreateConnectionResponse.class;
	}

}
