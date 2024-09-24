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

package com.aliyuncs.sae.model.v20190506;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sae.transform.v20190506.DescribeWebApplicationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeWebApplicationResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private Boolean success;

	private Data data;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

		private String applicationId;

		private String applicationName;

		private String createdTime;

		private String description;

		private String lastModifiedTime;

		private String namespaceId;

		private String internetURL;

		private String intranetURL;

		private String vpcId;

		private RevisionConfig revisionConfig;

		private WebScalingConfig webScalingConfig;

		private WebTrafficConfig webTrafficConfig;

		public String getApplicationId() {
			return this.applicationId;
		}

		public void setApplicationId(String applicationId) {
			this.applicationId = applicationId;
		}

		public String getApplicationName() {
			return this.applicationName;
		}

		public void setApplicationName(String applicationName) {
			this.applicationName = applicationName;
		}

		public String getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(String createdTime) {
			this.createdTime = createdTime;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getLastModifiedTime() {
			return this.lastModifiedTime;
		}

		public void setLastModifiedTime(String lastModifiedTime) {
			this.lastModifiedTime = lastModifiedTime;
		}

		public String getNamespaceId() {
			return this.namespaceId;
		}

		public void setNamespaceId(String namespaceId) {
			this.namespaceId = namespaceId;
		}

		public String getInternetURL() {
			return this.internetURL;
		}

		public void setInternetURL(String internetURL) {
			this.internetURL = internetURL;
		}

		public String getIntranetURL() {
			return this.intranetURL;
		}

		public void setIntranetURL(String intranetURL) {
			this.intranetURL = intranetURL;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public RevisionConfig getRevisionConfig() {
			return this.revisionConfig;
		}

		public void setRevisionConfig(RevisionConfig revisionConfig) {
			this.revisionConfig = revisionConfig;
		}

		public WebScalingConfig getWebScalingConfig() {
			return this.webScalingConfig;
		}

		public void setWebScalingConfig(WebScalingConfig webScalingConfig) {
			this.webScalingConfig = webScalingConfig;
		}

		public WebTrafficConfig getWebTrafficConfig() {
			return this.webTrafficConfig;
		}

		public void setWebTrafficConfig(WebTrafficConfig webTrafficConfig) {
			this.webTrafficConfig = webTrafficConfig;
		}

		public static class RevisionConfig {

			private Boolean enableArmsMetrics;

			private List<ContainersItem> containers;

			private WebNetworkConfig webNetworkConfig;

			public Boolean getEnableArmsMetrics() {
				return this.enableArmsMetrics;
			}

			public void setEnableArmsMetrics(Boolean enableArmsMetrics) {
				this.enableArmsMetrics = enableArmsMetrics;
			}

			public List<ContainersItem> getContainers() {
				return this.containers;
			}

			public void setContainers(List<ContainersItem> containers) {
				this.containers = containers;
			}

			public WebNetworkConfig getWebNetworkConfig() {
				return this.webNetworkConfig;
			}

			public void setWebNetworkConfig(WebNetworkConfig webNetworkConfig) {
				this.webNetworkConfig = webNetworkConfig;
			}

			public static class ContainersItem {

				private String args;

				private String command;

				private Map<Object,Object> environmentVariables;

				private String image;

				private Integer port;

				private Integer requestConcurrency;

				private Integer requestTimeout;

				private WebNASConfig webNASConfig;

				private WebOSSConfig webOSSConfig;

				private Resources resources;

				private StartupProbe startupProbe;

				private SLSCollectConfigs sLSCollectConfigs;

				private MetricsCollectConfig metricsCollectConfig;

				public String getArgs() {
					return this.args;
				}

				public void setArgs(String args) {
					this.args = args;
				}

				public String getCommand() {
					return this.command;
				}

				public void setCommand(String command) {
					this.command = command;
				}

				public Map<Object,Object> getEnvironmentVariables() {
					return this.environmentVariables;
				}

				public void setEnvironmentVariables(Map<Object,Object> environmentVariables) {
					this.environmentVariables = environmentVariables;
				}

				public String getImage() {
					return this.image;
				}

				public void setImage(String image) {
					this.image = image;
				}

				public Integer getPort() {
					return this.port;
				}

				public void setPort(Integer port) {
					this.port = port;
				}

				public Integer getRequestConcurrency() {
					return this.requestConcurrency;
				}

				public void setRequestConcurrency(Integer requestConcurrency) {
					this.requestConcurrency = requestConcurrency;
				}

				public Integer getRequestTimeout() {
					return this.requestTimeout;
				}

				public void setRequestTimeout(Integer requestTimeout) {
					this.requestTimeout = requestTimeout;
				}

				public WebNASConfig getWebNASConfig() {
					return this.webNASConfig;
				}

				public void setWebNASConfig(WebNASConfig webNASConfig) {
					this.webNASConfig = webNASConfig;
				}

				public WebOSSConfig getWebOSSConfig() {
					return this.webOSSConfig;
				}

				public void setWebOSSConfig(WebOSSConfig webOSSConfig) {
					this.webOSSConfig = webOSSConfig;
				}

				public Resources getResources() {
					return this.resources;
				}

				public void setResources(Resources resources) {
					this.resources = resources;
				}

				public StartupProbe getStartupProbe() {
					return this.startupProbe;
				}

				public void setStartupProbe(StartupProbe startupProbe) {
					this.startupProbe = startupProbe;
				}

				public SLSCollectConfigs getSLSCollectConfigs() {
					return this.sLSCollectConfigs;
				}

				public void setSLSCollectConfigs(SLSCollectConfigs sLSCollectConfigs) {
					this.sLSCollectConfigs = sLSCollectConfigs;
				}

				public MetricsCollectConfig getMetricsCollectConfig() {
					return this.metricsCollectConfig;
				}

				public void setMetricsCollectConfig(MetricsCollectConfig metricsCollectConfig) {
					this.metricsCollectConfig = metricsCollectConfig;
				}

				public static class WebNASConfig {

					private List<Item> mountPoints;

					public List<Item> getMountPoints() {
						return this.mountPoints;
					}

					public void setMountPoints(List<Item> mountPoints) {
						this.mountPoints = mountPoints;
					}

					public static class Item {

						private String mountDir;

						private String nasAddr;

						private String nasPath;

						public String getMountDir() {
							return this.mountDir;
						}

						public void setMountDir(String mountDir) {
							this.mountDir = mountDir;
						}

						public String getNasAddr() {
							return this.nasAddr;
						}

						public void setNasAddr(String nasAddr) {
							this.nasAddr = nasAddr;
						}

						public String getNasPath() {
							return this.nasPath;
						}

						public void setNasPath(String nasPath) {
							this.nasPath = nasPath;
						}
					}
				}

				public static class WebOSSConfig {

					private List<Item2> mountPoints1;

					public List<Item2> getMountPoints1() {
						return this.mountPoints1;
					}

					public void setMountPoints1(List<Item2> mountPoints1) {
						this.mountPoints1 = mountPoints1;
					}

					public static class Item2 {

						private String bucketName;

						private String bucketPath;

						private String mountDir;

						private Boolean readOnly;

						public String getBucketName() {
							return this.bucketName;
						}

						public void setBucketName(String bucketName) {
							this.bucketName = bucketName;
						}

						public String getBucketPath() {
							return this.bucketPath;
						}

						public void setBucketPath(String bucketPath) {
							this.bucketPath = bucketPath;
						}

						public String getMountDir() {
							return this.mountDir;
						}

						public void setMountDir(String mountDir) {
							this.mountDir = mountDir;
						}

						public Boolean getReadOnly() {
							return this.readOnly;
						}

						public void setReadOnly(Boolean readOnly) {
							this.readOnly = readOnly;
						}
					}
				}

				public static class Resources {

					private Integer cpu;

					private Integer memory;

					public Integer getCpu() {
						return this.cpu;
					}

					public void setCpu(Integer cpu) {
						this.cpu = cpu;
					}

					public Integer getMemory() {
						return this.memory;
					}

					public void setMemory(Integer memory) {
						this.memory = memory;
					}
				}

				public static class StartupProbe {

					private Integer failureThreshold;

					private Integer initialDelaySeconds;

					private Integer periodSeconds;

					private Integer timeoutSeconds;

					private ProbeHandler probeHandler;

					public Integer getFailureThreshold() {
						return this.failureThreshold;
					}

					public void setFailureThreshold(Integer failureThreshold) {
						this.failureThreshold = failureThreshold;
					}

					public Integer getInitialDelaySeconds() {
						return this.initialDelaySeconds;
					}

					public void setInitialDelaySeconds(Integer initialDelaySeconds) {
						this.initialDelaySeconds = initialDelaySeconds;
					}

					public Integer getPeriodSeconds() {
						return this.periodSeconds;
					}

					public void setPeriodSeconds(Integer periodSeconds) {
						this.periodSeconds = periodSeconds;
					}

					public Integer getTimeoutSeconds() {
						return this.timeoutSeconds;
					}

					public void setTimeoutSeconds(Integer timeoutSeconds) {
						this.timeoutSeconds = timeoutSeconds;
					}

					public ProbeHandler getProbeHandler() {
						return this.probeHandler;
					}

					public void setProbeHandler(ProbeHandler probeHandler) {
						this.probeHandler = probeHandler;
					}

					public static class ProbeHandler {

						private HttpGet httpGet;

						private TcpSocket tcpSocket;

						public HttpGet getHttpGet() {
							return this.httpGet;
						}

						public void setHttpGet(HttpGet httpGet) {
							this.httpGet = httpGet;
						}

						public TcpSocket getTcpSocket() {
							return this.tcpSocket;
						}

						public void setTcpSocket(TcpSocket tcpSocket) {
							this.tcpSocket = tcpSocket;
						}

						public static class HttpGet {

							private String host;

							private String path;

							private Integer port;

							private String scheme;

							private List<HttpHeadersItem> httpHeaders;

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

							public Integer getPort() {
								return this.port;
							}

							public void setPort(Integer port) {
								this.port = port;
							}

							public String getScheme() {
								return this.scheme;
							}

							public void setScheme(String scheme) {
								this.scheme = scheme;
							}

							public List<HttpHeadersItem> getHttpHeaders() {
								return this.httpHeaders;
							}

							public void setHttpHeaders(List<HttpHeadersItem> httpHeaders) {
								this.httpHeaders = httpHeaders;
							}

							public static class HttpHeadersItem {

								private String name;

								private String value;

								public String getName() {
									return this.name;
								}

								public void setName(String name) {
									this.name = name;
								}

								public String getValue() {
									return this.value;
								}

								public void setValue(String value) {
									this.value = value;
								}
							}
						}

						public static class TcpSocket {

							private String host;

							private Integer port;

							public String getHost() {
								return this.host;
							}

							public void setHost(String host) {
								this.host = host;
							}

							public Integer getPort() {
								return this.port;
							}

							public void setPort(Integer port) {
								this.port = port;
							}
						}
					}
				}

				public static class SLSCollectConfigs {

					private List<CollectConfigsItem> collectConfigs;

					public List<CollectConfigsItem> getCollectConfigs() {
						return this.collectConfigs;
					}

					public void setCollectConfigs(List<CollectConfigsItem> collectConfigs) {
						this.collectConfigs = collectConfigs;
					}

					public static class CollectConfigsItem {

						private String logPath;

						private String logType;

						private String logstoreName;

						private String logtailName;

						private String machineGroup;

						private String projectName;

						public String getLogPath() {
							return this.logPath;
						}

						public void setLogPath(String logPath) {
							this.logPath = logPath;
						}

						public String getLogType() {
							return this.logType;
						}

						public void setLogType(String logType) {
							this.logType = logType;
						}

						public String getLogstoreName() {
							return this.logstoreName;
						}

						public void setLogstoreName(String logstoreName) {
							this.logstoreName = logstoreName;
						}

						public String getLogtailName() {
							return this.logtailName;
						}

						public void setLogtailName(String logtailName) {
							this.logtailName = logtailName;
						}

						public String getMachineGroup() {
							return this.machineGroup;
						}

						public void setMachineGroup(String machineGroup) {
							this.machineGroup = machineGroup;
						}

						public String getProjectName() {
							return this.projectName;
						}

						public void setProjectName(String projectName) {
							this.projectName = projectName;
						}
					}
				}

				public static class MetricsCollectConfig {

					private String logstoreName;

					private String projectName;

					private Boolean enablePushToUserSLS;

					public String getLogstoreName() {
						return this.logstoreName;
					}

					public void setLogstoreName(String logstoreName) {
						this.logstoreName = logstoreName;
					}

					public String getProjectName() {
						return this.projectName;
					}

					public void setProjectName(String projectName) {
						this.projectName = projectName;
					}

					public Boolean getEnablePushToUserSLS() {
						return this.enablePushToUserSLS;
					}

					public void setEnablePushToUserSLS(Boolean enablePushToUserSLS) {
						this.enablePushToUserSLS = enablePushToUserSLS;
					}
				}
			}

			public static class WebNetworkConfig {

				private Boolean internetAccess;

				private String securityGroupId;

				private List<String> vSwitchIds;

				public Boolean getInternetAccess() {
					return this.internetAccess;
				}

				public void setInternetAccess(Boolean internetAccess) {
					this.internetAccess = internetAccess;
				}

				public String getSecurityGroupId() {
					return this.securityGroupId;
				}

				public void setSecurityGroupId(String securityGroupId) {
					this.securityGroupId = securityGroupId;
				}

				public List<String> getVSwitchIds() {
					return this.vSwitchIds;
				}

				public void setVSwitchIds(List<String> vSwitchIds) {
					this.vSwitchIds = vSwitchIds;
				}
			}
		}

		public static class WebScalingConfig {

			private Long maximumInstanceCount;

			private Long minimumInstanceCount;

			public Long getMaximumInstanceCount() {
				return this.maximumInstanceCount;
			}

			public void setMaximumInstanceCount(Long maximumInstanceCount) {
				this.maximumInstanceCount = maximumInstanceCount;
			}

			public Long getMinimumInstanceCount() {
				return this.minimumInstanceCount;
			}

			public void setMinimumInstanceCount(Long minimumInstanceCount) {
				this.minimumInstanceCount = minimumInstanceCount;
			}
		}

		public static class WebTrafficConfig {

			private String authType;

			private Boolean disableInternetURL;

			private Map<Object,Object> revisionsTrafficWeight;

			private WebAclConfig webAclConfig;

			public String getAuthType() {
				return this.authType;
			}

			public void setAuthType(String authType) {
				this.authType = authType;
			}

			public Boolean getDisableInternetURL() {
				return this.disableInternetURL;
			}

			public void setDisableInternetURL(Boolean disableInternetURL) {
				this.disableInternetURL = disableInternetURL;
			}

			public Map<Object,Object> getRevisionsTrafficWeight() {
				return this.revisionsTrafficWeight;
			}

			public void setRevisionsTrafficWeight(Map<Object,Object> revisionsTrafficWeight) {
				this.revisionsTrafficWeight = revisionsTrafficWeight;
			}

			public WebAclConfig getWebAclConfig() {
				return this.webAclConfig;
			}

			public void setWebAclConfig(WebAclConfig webAclConfig) {
				this.webAclConfig = webAclConfig;
			}

			public static class WebAclConfig {

				private String aclDescription;

				private List<WebAclEntriesItem> webAclEntries;

				public String getAclDescription() {
					return this.aclDescription;
				}

				public void setAclDescription(String aclDescription) {
					this.aclDescription = aclDescription;
				}

				public List<WebAclEntriesItem> getWebAclEntries() {
					return this.webAclEntries;
				}

				public void setWebAclEntries(List<WebAclEntriesItem> webAclEntries) {
					this.webAclEntries = webAclEntries;
				}

				public static class WebAclEntriesItem {

					private String entry;

					private String description;

					public String getEntry() {
						return this.entry;
					}

					public void setEntry(String entry) {
						this.entry = entry;
					}

					public String getDescription() {
						return this.description;
					}

					public void setDescription(String description) {
						this.description = description;
					}
				}
			}
		}
	}

	@Override
	public DescribeWebApplicationResponse getInstance(UnmarshallerContext context) {
		return	DescribeWebApplicationResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
