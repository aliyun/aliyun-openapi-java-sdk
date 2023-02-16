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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eventbridge.transform.v20200401.GetConnectionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetConnectionResponse extends AcsResponse {

	private String requestId;

	private String message;

	private String code;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<ConnectionsItem> connections;

		public List<ConnectionsItem> getConnections() {
			return this.connections;
		}

		public void setConnections(List<ConnectionsItem> connections) {
			this.connections = connections;
		}

		public static class ConnectionsItem {

			private String connectionName;

			private Long id;

			private String description;

			private Long gmtCreate;

			private String apiDestinationName;

			private NetworkParameters networkParameters;

			private AuthParameters authParameters;

			public String getConnectionName() {
				return this.connectionName;
			}

			public void setConnectionName(String connectionName) {
				this.connectionName = connectionName;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public Long getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(Long gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public String getApiDestinationName() {
				return this.apiDestinationName;
			}

			public void setApiDestinationName(String apiDestinationName) {
				this.apiDestinationName = apiDestinationName;
			}

			public NetworkParameters getNetworkParameters() {
				return this.networkParameters;
			}

			public void setNetworkParameters(NetworkParameters networkParameters) {
				this.networkParameters = networkParameters;
			}

			public AuthParameters getAuthParameters() {
				return this.authParameters;
			}

			public void setAuthParameters(AuthParameters authParameters) {
				this.authParameters = authParameters;
			}

			public static class NetworkParameters {

				private String networkType;

				private String vpcId;

				private String vswitcheId;

				private String securityGroupId;

				public String getNetworkType() {
					return this.networkType;
				}

				public void setNetworkType(String networkType) {
					this.networkType = networkType;
				}

				public String getVpcId() {
					return this.vpcId;
				}

				public void setVpcId(String vpcId) {
					this.vpcId = vpcId;
				}

				public String getVswitcheId() {
					return this.vswitcheId;
				}

				public void setVswitcheId(String vswitcheId) {
					this.vswitcheId = vswitcheId;
				}

				public String getSecurityGroupId() {
					return this.securityGroupId;
				}

				public void setSecurityGroupId(String securityGroupId) {
					this.securityGroupId = securityGroupId;
				}
			}

			public static class AuthParameters {

				private String authorizationType;

				private ApiKeyAuthParameters apiKeyAuthParameters;

				private BasicAuthParameters basicAuthParameters;

				private InvocationHttpParameters invocationHttpParameters;

				private OAuthParameters oAuthParameters;

				public String getAuthorizationType() {
					return this.authorizationType;
				}

				public void setAuthorizationType(String authorizationType) {
					this.authorizationType = authorizationType;
				}

				public ApiKeyAuthParameters getApiKeyAuthParameters() {
					return this.apiKeyAuthParameters;
				}

				public void setApiKeyAuthParameters(ApiKeyAuthParameters apiKeyAuthParameters) {
					this.apiKeyAuthParameters = apiKeyAuthParameters;
				}

				public BasicAuthParameters getBasicAuthParameters() {
					return this.basicAuthParameters;
				}

				public void setBasicAuthParameters(BasicAuthParameters basicAuthParameters) {
					this.basicAuthParameters = basicAuthParameters;
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

				public static class ApiKeyAuthParameters {

					private String apiKeyName;

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

				public static class BasicAuthParameters {

					private String password;

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

				public static class InvocationHttpParameters {

					private List<BodyParametersItem> bodyParameters;

					private List<HeaderParametersItem> headerParameters;

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

						private String isValueSecret;

						private String key;

						private String valuValuee;

						public String getIsValueSecret() {
							return this.isValueSecret;
						}

						public void setIsValueSecret(String isValueSecret) {
							this.isValueSecret = isValueSecret;
						}

						public String getKey() {
							return this.key;
						}

						public void setKey(String key) {
							this.key = key;
						}

						public String getValuValuee() {
							return this.valuValuee;
						}

						public void setValuValuee(String valuValuee) {
							this.valuValuee = valuValuee;
						}
					}

					public static class HeaderParametersItem {

						private String isValueSecret;

						private String key;

						private String value;

						public String getIsValueSecret() {
							return this.isValueSecret;
						}

						public void setIsValueSecret(String isValueSecret) {
							this.isValueSecret = isValueSecret;
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

					public static class QueryStringParametersItem {

						private String isValueSecret;

						private String key;

						private String value;

						public String getIsValueSecret() {
							return this.isValueSecret;
						}

						public void setIsValueSecret(String isValueSecret) {
							this.isValueSecret = isValueSecret;
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

				public static class OAuthParameters {

					private String authorizationEndpoint;

					private String httpMethod;

					private ClientParameters clientParameters;

					private OAuthHttpParameters oAuthHttpParameters;

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

					public ClientParameters getClientParameters() {
						return this.clientParameters;
					}

					public void setClientParameters(ClientParameters clientParameters) {
						this.clientParameters = clientParameters;
					}

					public OAuthHttpParameters getOAuthHttpParameters() {
						return this.oAuthHttpParameters;
					}

					public void setOAuthHttpParameters(OAuthHttpParameters oAuthHttpParameters) {
						this.oAuthHttpParameters = oAuthHttpParameters;
					}

					public static class ClientParameters {

						private String clientID;

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

						private List<BodyParametersItem4> bodyParameters1;

						private List<HeaderParametersItem5> headerParameters2;

						private List<QueryStringParametersItem6> queryStringParameters3;

						public List<BodyParametersItem4> getBodyParameters1() {
							return this.bodyParameters1;
						}

						public void setBodyParameters1(List<BodyParametersItem4> bodyParameters1) {
							this.bodyParameters1 = bodyParameters1;
						}

						public List<HeaderParametersItem5> getHeaderParameters2() {
							return this.headerParameters2;
						}

						public void setHeaderParameters2(List<HeaderParametersItem5> headerParameters2) {
							this.headerParameters2 = headerParameters2;
						}

						public List<QueryStringParametersItem6> getQueryStringParameters3() {
							return this.queryStringParameters3;
						}

						public void setQueryStringParameters3(List<QueryStringParametersItem6> queryStringParameters3) {
							this.queryStringParameters3 = queryStringParameters3;
						}

						public static class BodyParametersItem4 {

							private String isValueSecret;

							private String key;

							private String value;

							public String getIsValueSecret() {
								return this.isValueSecret;
							}

							public void setIsValueSecret(String isValueSecret) {
								this.isValueSecret = isValueSecret;
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

						public static class HeaderParametersItem5 {

							private String isValueSecret;

							private String key;

							private String value;

							public String getIsValueSecret() {
								return this.isValueSecret;
							}

							public void setIsValueSecret(String isValueSecret) {
								this.isValueSecret = isValueSecret;
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

						public static class QueryStringParametersItem6 {

							private String isValueSecret;

							private String key;

							private String value;

							public String getIsValueSecret() {
								return this.isValueSecret;
							}

							public void setIsValueSecret(String isValueSecret) {
								this.isValueSecret = isValueSecret;
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
				}
			}
		}
	}

	@Override
	public GetConnectionResponse getInstance(UnmarshallerContext context) {
		return	GetConnectionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
