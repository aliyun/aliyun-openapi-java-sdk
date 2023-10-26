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

package com.aliyuncs.cloudapi.model.v20160714;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudapi.transform.v20160714.DescribeBackendInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeBackendInfoResponse extends AcsResponse {

	private String requestId;

	private BackendInfo backendInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public BackendInfo getBackendInfo() {
		return this.backendInfo;
	}

	public void setBackendInfo(BackendInfo backendInfo) {
		this.backendInfo = backendInfo;
	}

	public static class BackendInfo {

		private String backendName;

		private String backendType;

		private String modifiedTime;

		private String description;

		private String createdTime;

		private String backendId;

		private List<BackendModel> backendModels;

		public String getBackendName() {
			return this.backendName;
		}

		public void setBackendName(String backendName) {
			this.backendName = backendName;
		}

		public String getBackendType() {
			return this.backendType;
		}

		public void setBackendType(String backendType) {
			this.backendType = backendType;
		}

		public String getModifiedTime() {
			return this.modifiedTime;
		}

		public void setModifiedTime(String modifiedTime) {
			this.modifiedTime = modifiedTime;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(String createdTime) {
			this.createdTime = createdTime;
		}

		public String getBackendId() {
			return this.backendId;
		}

		public void setBackendId(String backendId) {
			this.backendId = backendId;
		}

		public List<BackendModel> getBackendModels() {
			return this.backendModels;
		}

		public void setBackendModels(List<BackendModel> backendModels) {
			this.backendModels = backendModels;
		}

		public static class BackendModel {

			private String backendModelId;

			private String stageModeId;

			private String description;

			private String gmtCreate;

			private String gmtModified;

			private String stageName;

			private BackendConfig backendConfig;

			public String getBackendModelId() {
				return this.backendModelId;
			}

			public void setBackendModelId(String backendModelId) {
				this.backendModelId = backendModelId;
			}

			public String getStageModeId() {
				return this.stageModeId;
			}

			public void setStageModeId(String stageModeId) {
				this.stageModeId = stageModeId;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
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

			public String getStageName() {
				return this.stageName;
			}

			public void setStageName(String stageName) {
				this.stageName = stageName;
			}

			public BackendConfig getBackendConfig() {
				return this.backendConfig;
			}

			public void setBackendConfig(BackendConfig backendConfig) {
				this.backendConfig = backendConfig;
			}

			public static class BackendConfig {

				private String serviceAddress;

				private String httpTargetHostName;

				private String type;

				private Integer serviceTimeout;

				private VpcConfig vpcConfig;

				private FunctionComputeConfig functionComputeConfig;

				private OssConfig ossConfig;

				private EventBridgeConfig eventBridgeConfig;

				private MockConfig mockConfig;

				private DiscoveryConfig discoveryConfig;

				public String getServiceAddress() {
					return this.serviceAddress;
				}

				public void setServiceAddress(String serviceAddress) {
					this.serviceAddress = serviceAddress;
				}

				public String getHttpTargetHostName() {
					return this.httpTargetHostName;
				}

				public void setHttpTargetHostName(String httpTargetHostName) {
					this.httpTargetHostName = httpTargetHostName;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public Integer getServiceTimeout() {
					return this.serviceTimeout;
				}

				public void setServiceTimeout(Integer serviceTimeout) {
					this.serviceTimeout = serviceTimeout;
				}

				public VpcConfig getVpcConfig() {
					return this.vpcConfig;
				}

				public void setVpcConfig(VpcConfig vpcConfig) {
					this.vpcConfig = vpcConfig;
				}

				public FunctionComputeConfig getFunctionComputeConfig() {
					return this.functionComputeConfig;
				}

				public void setFunctionComputeConfig(FunctionComputeConfig functionComputeConfig) {
					this.functionComputeConfig = functionComputeConfig;
				}

				public OssConfig getOssConfig() {
					return this.ossConfig;
				}

				public void setOssConfig(OssConfig ossConfig) {
					this.ossConfig = ossConfig;
				}

				public EventBridgeConfig getEventBridgeConfig() {
					return this.eventBridgeConfig;
				}

				public void setEventBridgeConfig(EventBridgeConfig eventBridgeConfig) {
					this.eventBridgeConfig = eventBridgeConfig;
				}

				public MockConfig getMockConfig() {
					return this.mockConfig;
				}

				public void setMockConfig(MockConfig mockConfig) {
					this.mockConfig = mockConfig;
				}

				public DiscoveryConfig getDiscoveryConfig() {
					return this.discoveryConfig;
				}

				public void setDiscoveryConfig(DiscoveryConfig discoveryConfig) {
					this.discoveryConfig = discoveryConfig;
				}

				public static class VpcConfig {

					private String vpcId;

					private String instanceId;

					private Long port;

					private String vpcAccessId;

					private String name;

					private String vpcScheme;

					private String vpcTargetHostName;

					public String getVpcId() {
						return this.vpcId;
					}

					public void setVpcId(String vpcId) {
						this.vpcId = vpcId;
					}

					public String getInstanceId() {
						return this.instanceId;
					}

					public void setInstanceId(String instanceId) {
						this.instanceId = instanceId;
					}

					public Long getPort() {
						return this.port;
					}

					public void setPort(Long port) {
						this.port = port;
					}

					public String getVpcAccessId() {
						return this.vpcAccessId;
					}

					public void setVpcAccessId(String vpcAccessId) {
						this.vpcAccessId = vpcAccessId;
					}

					public String getName() {
						return this.name;
					}

					public void setName(String name) {
						this.name = name;
					}

					public String getVpcScheme() {
						return this.vpcScheme;
					}

					public void setVpcScheme(String vpcScheme) {
						this.vpcScheme = vpcScheme;
					}

					public String getVpcTargetHostName() {
						return this.vpcTargetHostName;
					}

					public void setVpcTargetHostName(String vpcTargetHostName) {
						this.vpcTargetHostName = vpcTargetHostName;
					}
				}

				public static class FunctionComputeConfig {

					private String fcType;

					private String fcRegionId;

					private String serviceName;

					private String functionName;

					private String roleArn;

					private String qualifier;

					private String fcBaseUrl;

					private Boolean onlyBusinessPath;

					public String getFcType() {
						return this.fcType;
					}

					public void setFcType(String fcType) {
						this.fcType = fcType;
					}

					public String getFcRegionId() {
						return this.fcRegionId;
					}

					public void setFcRegionId(String fcRegionId) {
						this.fcRegionId = fcRegionId;
					}

					public String getServiceName() {
						return this.serviceName;
					}

					public void setServiceName(String serviceName) {
						this.serviceName = serviceName;
					}

					public String getFunctionName() {
						return this.functionName;
					}

					public void setFunctionName(String functionName) {
						this.functionName = functionName;
					}

					public String getRoleArn() {
						return this.roleArn;
					}

					public void setRoleArn(String roleArn) {
						this.roleArn = roleArn;
					}

					public String getQualifier() {
						return this.qualifier;
					}

					public void setQualifier(String qualifier) {
						this.qualifier = qualifier;
					}

					public String getFcBaseUrl() {
						return this.fcBaseUrl;
					}

					public void setFcBaseUrl(String fcBaseUrl) {
						this.fcBaseUrl = fcBaseUrl;
					}

					public Boolean getOnlyBusinessPath() {
						return this.onlyBusinessPath;
					}

					public void setOnlyBusinessPath(Boolean onlyBusinessPath) {
						this.onlyBusinessPath = onlyBusinessPath;
					}
				}

				public static class OssConfig {

					private String ossRegionId;

					private String bucketName;

					public String getOssRegionId() {
						return this.ossRegionId;
					}

					public void setOssRegionId(String ossRegionId) {
						this.ossRegionId = ossRegionId;
					}

					public String getBucketName() {
						return this.bucketName;
					}

					public void setBucketName(String bucketName) {
						this.bucketName = bucketName;
					}
				}

				public static class EventBridgeConfig {

					private String eventBridgeRegionId;

					private String eventSource;

					private String eventBus;

					private String roleArn;

					public String getEventBridgeRegionId() {
						return this.eventBridgeRegionId;
					}

					public void setEventBridgeRegionId(String eventBridgeRegionId) {
						this.eventBridgeRegionId = eventBridgeRegionId;
					}

					public String getEventSource() {
						return this.eventSource;
					}

					public void setEventSource(String eventSource) {
						this.eventSource = eventSource;
					}

					public String getEventBus() {
						return this.eventBus;
					}

					public void setEventBus(String eventBus) {
						this.eventBus = eventBus;
					}

					public String getRoleArn() {
						return this.roleArn;
					}

					public void setRoleArn(String roleArn) {
						this.roleArn = roleArn;
					}
				}

				public static class MockConfig {

					private String mockResult;

					private String mockStatusCode;

					private List<MockHeader> mockHeaders;

					public String getMockResult() {
						return this.mockResult;
					}

					public void setMockResult(String mockResult) {
						this.mockResult = mockResult;
					}

					public String getMockStatusCode() {
						return this.mockStatusCode;
					}

					public void setMockStatusCode(String mockStatusCode) {
						this.mockStatusCode = mockStatusCode;
					}

					public List<MockHeader> getMockHeaders() {
						return this.mockHeaders;
					}

					public void setMockHeaders(List<MockHeader> mockHeaders) {
						this.mockHeaders = mockHeaders;
					}

					public static class MockHeader {

						private String headerName;

						private String headerValue;

						public String getHeaderName() {
							return this.headerName;
						}

						public void setHeaderName(String headerName) {
							this.headerName = headerName;
						}

						public String getHeaderValue() {
							return this.headerValue;
						}

						public void setHeaderValue(String headerValue) {
							this.headerValue = headerValue;
						}
					}
				}

				public static class DiscoveryConfig {

					private String rcType;

					private NacosConfig nacosConfig;

					public String getRcType() {
						return this.rcType;
					}

					public void setRcType(String rcType) {
						this.rcType = rcType;
					}

					public NacosConfig getNacosConfig() {
						return this.nacosConfig;
					}

					public void setNacosConfig(NacosConfig nacosConfig) {
						this.nacosConfig = nacosConfig;
					}

					public static class NacosConfig {

						private String serverAddress;

						private String namespace;

						private String groupName;

						private String serviceName;

						private String clusters;

						private String authType;

						private String userName;

						private String password;

						private String accessKey;

						private String secretKey;

						public String getServerAddress() {
							return this.serverAddress;
						}

						public void setServerAddress(String serverAddress) {
							this.serverAddress = serverAddress;
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

						public String getServiceName() {
							return this.serviceName;
						}

						public void setServiceName(String serviceName) {
							this.serviceName = serviceName;
						}

						public String getClusters() {
							return this.clusters;
						}

						public void setClusters(String clusters) {
							this.clusters = clusters;
						}

						public String getAuthType() {
							return this.authType;
						}

						public void setAuthType(String authType) {
							this.authType = authType;
						}

						public String getUserName() {
							return this.userName;
						}

						public void setUserName(String userName) {
							this.userName = userName;
						}

						public String getPassword() {
							return this.password;
						}

						public void setPassword(String password) {
							this.password = password;
						}

						public String getAccessKey() {
							return this.accessKey;
						}

						public void setAccessKey(String accessKey) {
							this.accessKey = accessKey;
						}

						public String getSecretKey() {
							return this.secretKey;
						}

						public void setSecretKey(String secretKey) {
							this.secretKey = secretKey;
						}
					}
				}
			}
		}
	}

	@Override
	public DescribeBackendInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeBackendInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
