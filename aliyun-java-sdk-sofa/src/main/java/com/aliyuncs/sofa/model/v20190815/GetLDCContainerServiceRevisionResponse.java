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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.GetLDCContainerServiceRevisionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetLDCContainerServiceRevisionResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Revision revision;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public Revision getRevision() {
		return this.revision;
	}

	public void setRevision(Revision revision) {
		this.revision = revision;
	}

	public static class Revision {

		private String containerServiceName;

		private String createdTime;

		private String deployStatus;

		private String description;

		private String lastPlanId;

		private String metaStatus;

		private String modifiedTime;

		private String namespace;

		private String operator;

		private String remarks;

		private String revision;

		private AppInfo appInfo;

		private ContainerServiceConfig containerServiceConfig;

		private ContainerServiceReleaseInfo containerServiceReleaseInfo;

		public String getContainerServiceName() {
			return this.containerServiceName;
		}

		public void setContainerServiceName(String containerServiceName) {
			this.containerServiceName = containerServiceName;
		}

		public String getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(String createdTime) {
			this.createdTime = createdTime;
		}

		public String getDeployStatus() {
			return this.deployStatus;
		}

		public void setDeployStatus(String deployStatus) {
			this.deployStatus = deployStatus;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getLastPlanId() {
			return this.lastPlanId;
		}

		public void setLastPlanId(String lastPlanId) {
			this.lastPlanId = lastPlanId;
		}

		public String getMetaStatus() {
			return this.metaStatus;
		}

		public void setMetaStatus(String metaStatus) {
			this.metaStatus = metaStatus;
		}

		public String getModifiedTime() {
			return this.modifiedTime;
		}

		public void setModifiedTime(String modifiedTime) {
			this.modifiedTime = modifiedTime;
		}

		public String getNamespace() {
			return this.namespace;
		}

		public void setNamespace(String namespace) {
			this.namespace = namespace;
		}

		public String getOperator() {
			return this.operator;
		}

		public void setOperator(String operator) {
			this.operator = operator;
		}

		public String getRemarks() {
			return this.remarks;
		}

		public void setRemarks(String remarks) {
			this.remarks = remarks;
		}

		public String getRevision() {
			return this.revision;
		}

		public void setRevision(String revision) {
			this.revision = revision;
		}

		public AppInfo getAppInfo() {
			return this.appInfo;
		}

		public void setAppInfo(AppInfo appInfo) {
			this.appInfo = appInfo;
		}

		public ContainerServiceConfig getContainerServiceConfig() {
			return this.containerServiceConfig;
		}

		public void setContainerServiceConfig(ContainerServiceConfig containerServiceConfig) {
			this.containerServiceConfig = containerServiceConfig;
		}

		public ContainerServiceReleaseInfo getContainerServiceReleaseInfo() {
			return this.containerServiceReleaseInfo;
		}

		public void setContainerServiceReleaseInfo(ContainerServiceReleaseInfo containerServiceReleaseInfo) {
			this.containerServiceReleaseInfo = containerServiceReleaseInfo;
		}

		public static class AppInfo {

			private String buildpackVersion;

			private String description;

			private String id;

			private String name;

			private String owner;

			private String techstackIdentity;

			private String ownerId;

			public String getBuildpackVersion() {
				return this.buildpackVersion;
			}

			public void setBuildpackVersion(String buildpackVersion) {
				this.buildpackVersion = buildpackVersion;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getOwner() {
				return this.owner;
			}

			public void setOwner(String owner) {
				this.owner = owner;
			}

			public String getTechstackIdentity() {
				return this.techstackIdentity;
			}

			public void setTechstackIdentity(String techstackIdentity) {
				this.techstackIdentity = techstackIdentity;
			}

			public String getOwnerId() {
				return this.ownerId;
			}

			public void setOwnerId(String ownerId) {
				this.ownerId = ownerId;
			}
		}

		public static class ContainerServiceConfig {

			private Boolean enableBizMonitor;

			private Boolean enableLogConfig;

			private Boolean enableSofaMesh;

			private Boolean useHostNetwork;

			private List<ClusterIpServicesItem> clusterIpServices;

			private List<ContainerSpecsItem> containerSpecs;

			private List<IngressesItem> ingresses;

			private List<InnerLoadBalancerServicesItem> innerLoadBalancerServices;

			private List<PublicLoadBalancerServicesItem> publicLoadBalancerServices;

			private List<SidecarConfigsItem> sidecarConfigs;

			private List<LoadBalancerServicesItem> loadBalancerServices;

			private List<String> bizMonitorPaths;

			private DeployConfig deployConfig;

			private ElasticConfig elasticConfig;

			public Boolean getEnableBizMonitor() {
				return this.enableBizMonitor;
			}

			public void setEnableBizMonitor(Boolean enableBizMonitor) {
				this.enableBizMonitor = enableBizMonitor;
			}

			public Boolean getEnableLogConfig() {
				return this.enableLogConfig;
			}

			public void setEnableLogConfig(Boolean enableLogConfig) {
				this.enableLogConfig = enableLogConfig;
			}

			public Boolean getEnableSofaMesh() {
				return this.enableSofaMesh;
			}

			public void setEnableSofaMesh(Boolean enableSofaMesh) {
				this.enableSofaMesh = enableSofaMesh;
			}

			public Boolean getUseHostNetwork() {
				return this.useHostNetwork;
			}

			public void setUseHostNetwork(Boolean useHostNetwork) {
				this.useHostNetwork = useHostNetwork;
			}

			public List<ClusterIpServicesItem> getClusterIpServices() {
				return this.clusterIpServices;
			}

			public void setClusterIpServices(List<ClusterIpServicesItem> clusterIpServices) {
				this.clusterIpServices = clusterIpServices;
			}

			public List<ContainerSpecsItem> getContainerSpecs() {
				return this.containerSpecs;
			}

			public void setContainerSpecs(List<ContainerSpecsItem> containerSpecs) {
				this.containerSpecs = containerSpecs;
			}

			public List<IngressesItem> getIngresses() {
				return this.ingresses;
			}

			public void setIngresses(List<IngressesItem> ingresses) {
				this.ingresses = ingresses;
			}

			public List<InnerLoadBalancerServicesItem> getInnerLoadBalancerServices() {
				return this.innerLoadBalancerServices;
			}

			public void setInnerLoadBalancerServices(List<InnerLoadBalancerServicesItem> innerLoadBalancerServices) {
				this.innerLoadBalancerServices = innerLoadBalancerServices;
			}

			public List<PublicLoadBalancerServicesItem> getPublicLoadBalancerServices() {
				return this.publicLoadBalancerServices;
			}

			public void setPublicLoadBalancerServices(List<PublicLoadBalancerServicesItem> publicLoadBalancerServices) {
				this.publicLoadBalancerServices = publicLoadBalancerServices;
			}

			public List<SidecarConfigsItem> getSidecarConfigs() {
				return this.sidecarConfigs;
			}

			public void setSidecarConfigs(List<SidecarConfigsItem> sidecarConfigs) {
				this.sidecarConfigs = sidecarConfigs;
			}

			public List<LoadBalancerServicesItem> getLoadBalancerServices() {
				return this.loadBalancerServices;
			}

			public void setLoadBalancerServices(List<LoadBalancerServicesItem> loadBalancerServices) {
				this.loadBalancerServices = loadBalancerServices;
			}

			public List<String> getBizMonitorPaths() {
				return this.bizMonitorPaths;
			}

			public void setBizMonitorPaths(List<String> bizMonitorPaths) {
				this.bizMonitorPaths = bizMonitorPaths;
			}

			public DeployConfig getDeployConfig() {
				return this.deployConfig;
			}

			public void setDeployConfig(DeployConfig deployConfig) {
				this.deployConfig = deployConfig;
			}

			public ElasticConfig getElasticConfig() {
				return this.elasticConfig;
			}

			public void setElasticConfig(ElasticConfig elasticConfig) {
				this.elasticConfig = elasticConfig;
			}

			public static class ClusterIpServicesItem {

				private String name;

				private List<PortsItem> ports;

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public List<PortsItem> getPorts() {
					return this.ports;
				}

				public void setPorts(List<PortsItem> ports) {
					this.ports = ports;
				}

				public static class PortsItem {

					private Long port;

					private String protocol;

					private Long targetPort;

					public Long getPort() {
						return this.port;
					}

					public void setPort(Long port) {
						this.port = port;
					}

					public String getBizProtocol() {
						return this.protocol;
					}

					public void setBizProtocol(String protocol) {
						this.protocol = protocol;
					}

					public Long getTargetPort() {
						return this.targetPort;
					}

					public void setTargetPort(Long targetPort) {
						this.targetPort = targetPort;
					}
				}
			}

			public static class ContainerSpecsItem {

				private String cpuLimit;

				private String cpuRequest;

				private String image;

				private String imageBuildName;

				private String imagePullSecret;

				private String imageSource;

				private String memoryLimit;

				private String memoryRequest;

				private String name;

				private String restartPolicy;

				private String type;

				private String volumeMountsStr;

				private String volumesStr;

				private List<EnvsItem> envs;

				private List<EnvOverridesItem> envOverrides;

				private List<LogConfigsItem> logConfigs;

				private List<VolumeMountsItem> volumeMounts;

				private List<String> entryPoints;

				private HealthCheckConfig healthCheckConfig;

				private LifecycleHook lifecycleHook;

				public String getCpuLimit() {
					return this.cpuLimit;
				}

				public void setCpuLimit(String cpuLimit) {
					this.cpuLimit = cpuLimit;
				}

				public String getCpuRequest() {
					return this.cpuRequest;
				}

				public void setCpuRequest(String cpuRequest) {
					this.cpuRequest = cpuRequest;
				}

				public String getImage() {
					return this.image;
				}

				public void setImage(String image) {
					this.image = image;
				}

				public String getImageBuildName() {
					return this.imageBuildName;
				}

				public void setImageBuildName(String imageBuildName) {
					this.imageBuildName = imageBuildName;
				}

				public String getImagePullSecret() {
					return this.imagePullSecret;
				}

				public void setImagePullSecret(String imagePullSecret) {
					this.imagePullSecret = imagePullSecret;
				}

				public String getImageSource() {
					return this.imageSource;
				}

				public void setImageSource(String imageSource) {
					this.imageSource = imageSource;
				}

				public String getMemoryLimit() {
					return this.memoryLimit;
				}

				public void setMemoryLimit(String memoryLimit) {
					this.memoryLimit = memoryLimit;
				}

				public String getMemoryRequest() {
					return this.memoryRequest;
				}

				public void setMemoryRequest(String memoryRequest) {
					this.memoryRequest = memoryRequest;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getRestartPolicy() {
					return this.restartPolicy;
				}

				public void setRestartPolicy(String restartPolicy) {
					this.restartPolicy = restartPolicy;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public String getVolumeMountsStr() {
					return this.volumeMountsStr;
				}

				public void setVolumeMountsStr(String volumeMountsStr) {
					this.volumeMountsStr = volumeMountsStr;
				}

				public String getVolumesStr() {
					return this.volumesStr;
				}

				public void setVolumesStr(String volumesStr) {
					this.volumesStr = volumesStr;
				}

				public List<EnvsItem> getEnvs() {
					return this.envs;
				}

				public void setEnvs(List<EnvsItem> envs) {
					this.envs = envs;
				}

				public List<EnvOverridesItem> getEnvOverrides() {
					return this.envOverrides;
				}

				public void setEnvOverrides(List<EnvOverridesItem> envOverrides) {
					this.envOverrides = envOverrides;
				}

				public List<LogConfigsItem> getLogConfigs() {
					return this.logConfigs;
				}

				public void setLogConfigs(List<LogConfigsItem> logConfigs) {
					this.logConfigs = logConfigs;
				}

				public List<VolumeMountsItem> getVolumeMounts() {
					return this.volumeMounts;
				}

				public void setVolumeMounts(List<VolumeMountsItem> volumeMounts) {
					this.volumeMounts = volumeMounts;
				}

				public List<String> getEntryPoints() {
					return this.entryPoints;
				}

				public void setEntryPoints(List<String> entryPoints) {
					this.entryPoints = entryPoints;
				}

				public HealthCheckConfig getHealthCheckConfig() {
					return this.healthCheckConfig;
				}

				public void setHealthCheckConfig(HealthCheckConfig healthCheckConfig) {
					this.healthCheckConfig = healthCheckConfig;
				}

				public LifecycleHook getLifecycleHook() {
					return this.lifecycleHook;
				}

				public void setLifecycleHook(LifecycleHook lifecycleHook) {
					this.lifecycleHook = lifecycleHook;
				}

				public static class EnvsItem {

					private String name;

					private String value;

					private String type;

					private ValueFrom valueFrom;

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

					public String getType() {
						return this.type;
					}

					public void setType(String type) {
						this.type = type;
					}

					public ValueFrom getValueFrom() {
						return this.valueFrom;
					}

					public void setValueFrom(ValueFrom valueFrom) {
						this.valueFrom = valueFrom;
					}

					public static class ValueFrom {

						private String objectName;

						private String objectType;

						private String key;

						public String getObjectName() {
							return this.objectName;
						}

						public void setObjectName(String objectName) {
							this.objectName = objectName;
						}

						public String getObjectType() {
							return this.objectType;
						}

						public void setObjectType(String objectType) {
							this.objectType = objectType;
						}

						public String getKey() {
							return this.key;
						}

						public void setKey(String key) {
							this.key = key;
						}
					}
				}

				public static class EnvOverridesItem {

					private String cell;

					private String name;

					private String value;

					public String getCell() {
						return this.cell;
					}

					public void setCell(String cell) {
						this.cell = cell;
					}

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

				public static class LogConfigsItem {

					private String configName;

					private String inputType;

					private String logstoreName;

					private String logPath;

					private String filePattern;

					public String getConfigName() {
						return this.configName;
					}

					public void setConfigName(String configName) {
						this.configName = configName;
					}

					public String getInputType() {
						return this.inputType;
					}

					public void setInputType(String inputType) {
						this.inputType = inputType;
					}

					public String getLogstoreName() {
						return this.logstoreName;
					}

					public void setLogstoreName(String logstoreName) {
						this.logstoreName = logstoreName;
					}

					public String getLogPath() {
						return this.logPath;
					}

					public void setLogPath(String logPath) {
						this.logPath = logPath;
					}

					public String getFilePattern() {
						return this.filePattern;
					}

					public void setFilePattern(String filePattern) {
						this.filePattern = filePattern;
					}
				}

				public static class VolumeMountsItem {

					private String mountPath;

					private String name;

					private Boolean readOnly;

					private String subPath;

					private String volumeSourceCategoryType;

					private ConfigmapSecretVolumeSource configmapSecretVolumeSource;

					private EmptyDirVolumeSource emptyDirVolumeSource;

					private LocalDiskVolumeSource localDiskVolumeSource;

					private PvcSource pvcSource;

					public String getMountPath() {
						return this.mountPath;
					}

					public void setMountPath(String mountPath) {
						this.mountPath = mountPath;
					}

					public String getName() {
						return this.name;
					}

					public void setName(String name) {
						this.name = name;
					}

					public Boolean getReadOnly() {
						return this.readOnly;
					}

					public void setReadOnly(Boolean readOnly) {
						this.readOnly = readOnly;
					}

					public String getSubPath() {
						return this.subPath;
					}

					public void setSubPath(String subPath) {
						this.subPath = subPath;
					}

					public String getVolumeSourceCategoryType() {
						return this.volumeSourceCategoryType;
					}

					public void setVolumeSourceCategoryType(String volumeSourceCategoryType) {
						this.volumeSourceCategoryType = volumeSourceCategoryType;
					}

					public ConfigmapSecretVolumeSource getConfigmapSecretVolumeSource() {
						return this.configmapSecretVolumeSource;
					}

					public void setConfigmapSecretVolumeSource(ConfigmapSecretVolumeSource configmapSecretVolumeSource) {
						this.configmapSecretVolumeSource = configmapSecretVolumeSource;
					}

					public EmptyDirVolumeSource getEmptyDirVolumeSource() {
						return this.emptyDirVolumeSource;
					}

					public void setEmptyDirVolumeSource(EmptyDirVolumeSource emptyDirVolumeSource) {
						this.emptyDirVolumeSource = emptyDirVolumeSource;
					}

					public LocalDiskVolumeSource getLocalDiskVolumeSource() {
						return this.localDiskVolumeSource;
					}

					public void setLocalDiskVolumeSource(LocalDiskVolumeSource localDiskVolumeSource) {
						this.localDiskVolumeSource = localDiskVolumeSource;
					}

					public PvcSource getPvcSource() {
						return this.pvcSource;
					}

					public void setPvcSource(PvcSource pvcSource) {
						this.pvcSource = pvcSource;
					}

					public static class ConfigmapSecretVolumeSource {

						private String volumeRefName;

						public String getVolumeRefName() {
							return this.volumeRefName;
						}

						public void setVolumeRefName(String volumeRefName) {
							this.volumeRefName = volumeRefName;
						}
					}

					public static class EmptyDirVolumeSource {

						private String medium;

						private String name;

						private String sizeLimit;

						public String getMedium() {
							return this.medium;
						}

						public void setMedium(String medium) {
							this.medium = medium;
						}

						public String getName() {
							return this.name;
						}

						public void setName(String name) {
							this.name = name;
						}

						public String getSizeLimit() {
							return this.sizeLimit;
						}

						public void setSizeLimit(String sizeLimit) {
							this.sizeLimit = sizeLimit;
						}
					}

					public static class LocalDiskVolumeSource {

						private String hostDirectoryPath;

						private Boolean createIfNotPresent;

						public String getHostDirectoryPath() {
							return this.hostDirectoryPath;
						}

						public void setHostDirectoryPath(String hostDirectoryPath) {
							this.hostDirectoryPath = hostDirectoryPath;
						}

						public Boolean getCreateIfNotPresent() {
							return this.createIfNotPresent;
						}

						public void setCreateIfNotPresent(Boolean createIfNotPresent) {
							this.createIfNotPresent = createIfNotPresent;
						}
					}

					public static class PvcSource {

						private String pvcName;

						public String getPvcName() {
							return this.pvcName;
						}

						public void setPvcName(String pvcName) {
							this.pvcName = pvcName;
						}
					}
				}

				public static class HealthCheckConfig {

					private LivenessProbe livenessProbe;

					private ReadinessProbe readinessProbe;

					public LivenessProbe getLivenessProbe() {
						return this.livenessProbe;
					}

					public void setLivenessProbe(LivenessProbe livenessProbe) {
						this.livenessProbe = livenessProbe;
					}

					public ReadinessProbe getReadinessProbe() {
						return this.readinessProbe;
					}

					public void setReadinessProbe(ReadinessProbe readinessProbe) {
						this.readinessProbe = readinessProbe;
					}

					public static class LivenessProbe {

						private Long failureThreshold;

						private Long initialDelaySeconds;

						private Long periodSeconds;

						private Long successThreshold;

						private Long timeOutSeconds;

						private ExecAction execAction;

						private HttpGetAction httpGetAction;

						private TcpSocketAction tcpSocketAction;

						public Long getFailureThreshold() {
							return this.failureThreshold;
						}

						public void setFailureThreshold(Long failureThreshold) {
							this.failureThreshold = failureThreshold;
						}

						public Long getInitialDelaySeconds() {
							return this.initialDelaySeconds;
						}

						public void setInitialDelaySeconds(Long initialDelaySeconds) {
							this.initialDelaySeconds = initialDelaySeconds;
						}

						public Long getPeriodSeconds() {
							return this.periodSeconds;
						}

						public void setPeriodSeconds(Long periodSeconds) {
							this.periodSeconds = periodSeconds;
						}

						public Long getSuccessThreshold() {
							return this.successThreshold;
						}

						public void setSuccessThreshold(Long successThreshold) {
							this.successThreshold = successThreshold;
						}

						public Long getTimeOutSeconds() {
							return this.timeOutSeconds;
						}

						public void setTimeOutSeconds(Long timeOutSeconds) {
							this.timeOutSeconds = timeOutSeconds;
						}

						public ExecAction getExecAction() {
							return this.execAction;
						}

						public void setExecAction(ExecAction execAction) {
							this.execAction = execAction;
						}

						public HttpGetAction getHttpGetAction() {
							return this.httpGetAction;
						}

						public void setHttpGetAction(HttpGetAction httpGetAction) {
							this.httpGetAction = httpGetAction;
						}

						public TcpSocketAction getTcpSocketAction() {
							return this.tcpSocketAction;
						}

						public void setTcpSocketAction(TcpSocketAction tcpSocketAction) {
							this.tcpSocketAction = tcpSocketAction;
						}

						public static class ExecAction {

							private String command;

							public String getCommand() {
								return this.command;
							}

							public void setCommand(String command) {
								this.command = command;
							}
						}

						public static class HttpGetAction {

							private String path;

							private String port;

							private String scheme;

							public String getPath() {
								return this.path;
							}

							public void setPath(String path) {
								this.path = path;
							}

							public String getPort() {
								return this.port;
							}

							public void setPort(String port) {
								this.port = port;
							}

							public String getScheme() {
								return this.scheme;
							}

							public void setScheme(String scheme) {
								this.scheme = scheme;
							}
						}

						public static class TcpSocketAction {

							private String port;

							public String getPort() {
								return this.port;
							}

							public void setPort(String port) {
								this.port = port;
							}
						}
					}

					public static class ReadinessProbe {

						private Long failureThreshold;

						private Long initialDelaySeconds;

						private Long periodSeconds;

						private Long successThreshold;

						private Long timeOutSeconds;

						private ExecAction1 execAction1;

						private HttpGetAction2 httpGetAction2;

						private TcpSocketAction3 tcpSocketAction3;

						public Long getFailureThreshold() {
							return this.failureThreshold;
						}

						public void setFailureThreshold(Long failureThreshold) {
							this.failureThreshold = failureThreshold;
						}

						public Long getInitialDelaySeconds() {
							return this.initialDelaySeconds;
						}

						public void setInitialDelaySeconds(Long initialDelaySeconds) {
							this.initialDelaySeconds = initialDelaySeconds;
						}

						public Long getPeriodSeconds() {
							return this.periodSeconds;
						}

						public void setPeriodSeconds(Long periodSeconds) {
							this.periodSeconds = periodSeconds;
						}

						public Long getSuccessThreshold() {
							return this.successThreshold;
						}

						public void setSuccessThreshold(Long successThreshold) {
							this.successThreshold = successThreshold;
						}

						public Long getTimeOutSeconds() {
							return this.timeOutSeconds;
						}

						public void setTimeOutSeconds(Long timeOutSeconds) {
							this.timeOutSeconds = timeOutSeconds;
						}

						public ExecAction1 getExecAction1() {
							return this.execAction1;
						}

						public void setExecAction1(ExecAction1 execAction1) {
							this.execAction1 = execAction1;
						}

						public HttpGetAction2 getHttpGetAction2() {
							return this.httpGetAction2;
						}

						public void setHttpGetAction2(HttpGetAction2 httpGetAction2) {
							this.httpGetAction2 = httpGetAction2;
						}

						public TcpSocketAction3 getTcpSocketAction3() {
							return this.tcpSocketAction3;
						}

						public void setTcpSocketAction3(TcpSocketAction3 tcpSocketAction3) {
							this.tcpSocketAction3 = tcpSocketAction3;
						}

						public static class ExecAction1 {

							private String command;

							public String getCommand() {
								return this.command;
							}

							public void setCommand(String command) {
								this.command = command;
							}
						}

						public static class HttpGetAction2 {

							private String path;

							private String port;

							private String scheme;

							public String getPath() {
								return this.path;
							}

							public void setPath(String path) {
								this.path = path;
							}

							public String getPort() {
								return this.port;
							}

							public void setPort(String port) {
								this.port = port;
							}

							public String getScheme() {
								return this.scheme;
							}

							public void setScheme(String scheme) {
								this.scheme = scheme;
							}
						}

						public static class TcpSocketAction3 {

							private String port;

							public String getPort() {
								return this.port;
							}

							public void setPort(String port) {
								this.port = port;
							}
						}
					}
				}

				public static class LifecycleHook {

					private PostStartExec postStartExec;

					private PostStartHttp postStartHttp;

					private PostStartTcp postStartTcp;

					private PreStopExec preStopExec;

					private PreStopHttp preStopHttp;

					private PreStopTcp preStopTcp;

					public PostStartExec getPostStartExec() {
						return this.postStartExec;
					}

					public void setPostStartExec(PostStartExec postStartExec) {
						this.postStartExec = postStartExec;
					}

					public PostStartHttp getPostStartHttp() {
						return this.postStartHttp;
					}

					public void setPostStartHttp(PostStartHttp postStartHttp) {
						this.postStartHttp = postStartHttp;
					}

					public PostStartTcp getPostStartTcp() {
						return this.postStartTcp;
					}

					public void setPostStartTcp(PostStartTcp postStartTcp) {
						this.postStartTcp = postStartTcp;
					}

					public PreStopExec getPreStopExec() {
						return this.preStopExec;
					}

					public void setPreStopExec(PreStopExec preStopExec) {
						this.preStopExec = preStopExec;
					}

					public PreStopHttp getPreStopHttp() {
						return this.preStopHttp;
					}

					public void setPreStopHttp(PreStopHttp preStopHttp) {
						this.preStopHttp = preStopHttp;
					}

					public PreStopTcp getPreStopTcp() {
						return this.preStopTcp;
					}

					public void setPreStopTcp(PreStopTcp preStopTcp) {
						this.preStopTcp = preStopTcp;
					}

					public static class PostStartExec {

						private String command;

						public String getCommand() {
							return this.command;
						}

						public void setCommand(String command) {
							this.command = command;
						}
					}

					public static class PostStartHttp {

						private String path;

						private String port;

						private String scheme;

						public String getPath() {
							return this.path;
						}

						public void setPath(String path) {
							this.path = path;
						}

						public String getPort() {
							return this.port;
						}

						public void setPort(String port) {
							this.port = port;
						}

						public String getScheme() {
							return this.scheme;
						}

						public void setScheme(String scheme) {
							this.scheme = scheme;
						}
					}

					public static class PostStartTcp {

						private String port;

						public String getPort() {
							return this.port;
						}

						public void setPort(String port) {
							this.port = port;
						}
					}

					public static class PreStopExec {

						private String command;

						public String getCommand() {
							return this.command;
						}

						public void setCommand(String command) {
							this.command = command;
						}
					}

					public static class PreStopHttp {

						private String path;

						private String port;

						private String scheme;

						public String getPath() {
							return this.path;
						}

						public void setPath(String path) {
							this.path = path;
						}

						public String getPort() {
							return this.port;
						}

						public void setPort(String port) {
							this.port = port;
						}

						public String getScheme() {
							return this.scheme;
						}

						public void setScheme(String scheme) {
							this.scheme = scheme;
						}
					}

					public static class PreStopTcp {

						private String port;

						public String getPort() {
							return this.port;
						}

						public void setPort(String port) {
							this.port = port;
						}
					}
				}
			}

			public static class IngressesItem {

				private String domain;

				private String loadBalancerIaasId;

				private String loadBalancerName;

				private String loadBalancerType;

				private String name;

				private String spannerClusterId;

				private String unifiedAccessInstanceName;

				private String unifiedAccessRouteRule;

				private List<ListenersItem> listeners;

				private List<ListenersV2Item> listenersV2;

				private List<String> unifiedAccessEntries;

				public String getDomain() {
					return this.domain;
				}

				public void setDomain(String domain) {
					this.domain = domain;
				}

				public String getLoadBalancerIaasId() {
					return this.loadBalancerIaasId;
				}

				public void setLoadBalancerIaasId(String loadBalancerIaasId) {
					this.loadBalancerIaasId = loadBalancerIaasId;
				}

				public String getLoadBalancerName() {
					return this.loadBalancerName;
				}

				public void setLoadBalancerName(String loadBalancerName) {
					this.loadBalancerName = loadBalancerName;
				}

				public String getLoadBalancerType() {
					return this.loadBalancerType;
				}

				public void setLoadBalancerType(String loadBalancerType) {
					this.loadBalancerType = loadBalancerType;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getSpannerClusterId() {
					return this.spannerClusterId;
				}

				public void setSpannerClusterId(String spannerClusterId) {
					this.spannerClusterId = spannerClusterId;
				}

				public String getUnifiedAccessInstanceName() {
					return this.unifiedAccessInstanceName;
				}

				public void setUnifiedAccessInstanceName(String unifiedAccessInstanceName) {
					this.unifiedAccessInstanceName = unifiedAccessInstanceName;
				}

				public String getUnifiedAccessRouteRule() {
					return this.unifiedAccessRouteRule;
				}

				public void setUnifiedAccessRouteRule(String unifiedAccessRouteRule) {
					this.unifiedAccessRouteRule = unifiedAccessRouteRule;
				}

				public List<ListenersItem> getListeners() {
					return this.listeners;
				}

				public void setListeners(List<ListenersItem> listeners) {
					this.listeners = listeners;
				}

				public List<ListenersV2Item> getListenersV2() {
					return this.listenersV2;
				}

				public void setListenersV2(List<ListenersV2Item> listenersV2) {
					this.listenersV2 = listenersV2;
				}

				public List<String> getUnifiedAccessEntries() {
					return this.unifiedAccessEntries;
				}

				public void setUnifiedAccessEntries(List<String> unifiedAccessEntries) {
					this.unifiedAccessEntries = unifiedAccessEntries;
				}

				public static class ListenersItem {

					private Long backendServerPort;

					private Long bandWidth;

					private String caCertificateId;

					private String cookie;

					private Long cookieTimeout;

					private Long establishedTimeout;

					private Long healthyThreshold;

					private String healthCheck;

					private Long healthCheckConnectPort;

					private Long healthCheckConnectTimeout;

					private String healthCheckDomain;

					private String healthCheckHttpCode;

					private Long healthCheckInterval;

					private Long healthCheckThreshold;

					private Long healthCheckTimeout;

					private String healthCheckUri;

					private Long listenerPort;

					private Long persistenceTimeout;

					private String protocol;

					private String scheduler;

					private Long sessionStickyType;

					private Long unhealthyThreshold;

					private Boolean xforwardFor;

					private String domain;

					private String path;

					public Long getBackendServerPort() {
						return this.backendServerPort;
					}

					public void setBackendServerPort(Long backendServerPort) {
						this.backendServerPort = backendServerPort;
					}

					public Long getBandWidth() {
						return this.bandWidth;
					}

					public void setBandWidth(Long bandWidth) {
						this.bandWidth = bandWidth;
					}

					public String getCaCertificateId() {
						return this.caCertificateId;
					}

					public void setCaCertificateId(String caCertificateId) {
						this.caCertificateId = caCertificateId;
					}

					public String getCookie() {
						return this.cookie;
					}

					public void setCookie(String cookie) {
						this.cookie = cookie;
					}

					public Long getCookieTimeout() {
						return this.cookieTimeout;
					}

					public void setCookieTimeout(Long cookieTimeout) {
						this.cookieTimeout = cookieTimeout;
					}

					public Long getEstablishedTimeout() {
						return this.establishedTimeout;
					}

					public void setEstablishedTimeout(Long establishedTimeout) {
						this.establishedTimeout = establishedTimeout;
					}

					public Long getHealthyThreshold() {
						return this.healthyThreshold;
					}

					public void setHealthyThreshold(Long healthyThreshold) {
						this.healthyThreshold = healthyThreshold;
					}

					public String getHealthCheck() {
						return this.healthCheck;
					}

					public void setHealthCheck(String healthCheck) {
						this.healthCheck = healthCheck;
					}

					public Long getHealthCheckConnectPort() {
						return this.healthCheckConnectPort;
					}

					public void setHealthCheckConnectPort(Long healthCheckConnectPort) {
						this.healthCheckConnectPort = healthCheckConnectPort;
					}

					public Long getHealthCheckConnectTimeout() {
						return this.healthCheckConnectTimeout;
					}

					public void setHealthCheckConnectTimeout(Long healthCheckConnectTimeout) {
						this.healthCheckConnectTimeout = healthCheckConnectTimeout;
					}

					public String getHealthCheckDomain() {
						return this.healthCheckDomain;
					}

					public void setHealthCheckDomain(String healthCheckDomain) {
						this.healthCheckDomain = healthCheckDomain;
					}

					public String getHealthCheckHttpCode() {
						return this.healthCheckHttpCode;
					}

					public void setHealthCheckHttpCode(String healthCheckHttpCode) {
						this.healthCheckHttpCode = healthCheckHttpCode;
					}

					public Long getHealthCheckInterval() {
						return this.healthCheckInterval;
					}

					public void setHealthCheckInterval(Long healthCheckInterval) {
						this.healthCheckInterval = healthCheckInterval;
					}

					public Long getHealthCheckThreshold() {
						return this.healthCheckThreshold;
					}

					public void setHealthCheckThreshold(Long healthCheckThreshold) {
						this.healthCheckThreshold = healthCheckThreshold;
					}

					public Long getHealthCheckTimeout() {
						return this.healthCheckTimeout;
					}

					public void setHealthCheckTimeout(Long healthCheckTimeout) {
						this.healthCheckTimeout = healthCheckTimeout;
					}

					public String getHealthCheckUri() {
						return this.healthCheckUri;
					}

					public void setHealthCheckUri(String healthCheckUri) {
						this.healthCheckUri = healthCheckUri;
					}

					public Long getListenerPort() {
						return this.listenerPort;
					}

					public void setListenerPort(Long listenerPort) {
						this.listenerPort = listenerPort;
					}

					public Long getPersistenceTimeout() {
						return this.persistenceTimeout;
					}

					public void setPersistenceTimeout(Long persistenceTimeout) {
						this.persistenceTimeout = persistenceTimeout;
					}

					public String getBizProtocol() {
						return this.protocol;
					}

					public void setBizProtocol(String protocol) {
						this.protocol = protocol;
					}

					public String getScheduler() {
						return this.scheduler;
					}

					public void setScheduler(String scheduler) {
						this.scheduler = scheduler;
					}

					public Long getSessionStickyType() {
						return this.sessionStickyType;
					}

					public void setSessionStickyType(Long sessionStickyType) {
						this.sessionStickyType = sessionStickyType;
					}

					public Long getUnhealthyThreshold() {
						return this.unhealthyThreshold;
					}

					public void setUnhealthyThreshold(Long unhealthyThreshold) {
						this.unhealthyThreshold = unhealthyThreshold;
					}

					public Boolean getXforwardFor() {
						return this.xforwardFor;
					}

					public void setXforwardFor(Boolean xforwardFor) {
						this.xforwardFor = xforwardFor;
					}

					public String getDomain() {
						return this.domain;
					}

					public void setDomain(String domain) {
						this.domain = domain;
					}

					public String getPath() {
						return this.path;
					}

					public void setPath(String path) {
						this.path = path;
					}
				}

				public static class ListenersV2Item {

					private Long backendServerPort;

					private Long bandWidth;

					private String caCertificateId;

					private String cookie;

					private Long cookieTimeout;

					private Long establishedTimeout;

					private Long healthyThreshold;

					private String healthCheck;

					private Long healthCheckConnectPort;

					private Long healthCheckConnectTimeout;

					private String healthCheckDomain;

					private String healthCheckHttpCode;

					private Long healthCheckInterval;

					private Long healthCheckThreshold;

					private Long healthCheckTimeout;

					private String healthCheckUri;

					private Long listenerPort;

					private Long persistenceTimeout;

					private String protocol;

					private String scheduler;

					private Long sessionStickyType;

					private Long unhealthyThreshold;

					private Boolean xforwardFor;

					private String domain;

					private String path;

					public Long getBackendServerPort() {
						return this.backendServerPort;
					}

					public void setBackendServerPort(Long backendServerPort) {
						this.backendServerPort = backendServerPort;
					}

					public Long getBandWidth() {
						return this.bandWidth;
					}

					public void setBandWidth(Long bandWidth) {
						this.bandWidth = bandWidth;
					}

					public String getCaCertificateId() {
						return this.caCertificateId;
					}

					public void setCaCertificateId(String caCertificateId) {
						this.caCertificateId = caCertificateId;
					}

					public String getCookie() {
						return this.cookie;
					}

					public void setCookie(String cookie) {
						this.cookie = cookie;
					}

					public Long getCookieTimeout() {
						return this.cookieTimeout;
					}

					public void setCookieTimeout(Long cookieTimeout) {
						this.cookieTimeout = cookieTimeout;
					}

					public Long getEstablishedTimeout() {
						return this.establishedTimeout;
					}

					public void setEstablishedTimeout(Long establishedTimeout) {
						this.establishedTimeout = establishedTimeout;
					}

					public Long getHealthyThreshold() {
						return this.healthyThreshold;
					}

					public void setHealthyThreshold(Long healthyThreshold) {
						this.healthyThreshold = healthyThreshold;
					}

					public String getHealthCheck() {
						return this.healthCheck;
					}

					public void setHealthCheck(String healthCheck) {
						this.healthCheck = healthCheck;
					}

					public Long getHealthCheckConnectPort() {
						return this.healthCheckConnectPort;
					}

					public void setHealthCheckConnectPort(Long healthCheckConnectPort) {
						this.healthCheckConnectPort = healthCheckConnectPort;
					}

					public Long getHealthCheckConnectTimeout() {
						return this.healthCheckConnectTimeout;
					}

					public void setHealthCheckConnectTimeout(Long healthCheckConnectTimeout) {
						this.healthCheckConnectTimeout = healthCheckConnectTimeout;
					}

					public String getHealthCheckDomain() {
						return this.healthCheckDomain;
					}

					public void setHealthCheckDomain(String healthCheckDomain) {
						this.healthCheckDomain = healthCheckDomain;
					}

					public String getHealthCheckHttpCode() {
						return this.healthCheckHttpCode;
					}

					public void setHealthCheckHttpCode(String healthCheckHttpCode) {
						this.healthCheckHttpCode = healthCheckHttpCode;
					}

					public Long getHealthCheckInterval() {
						return this.healthCheckInterval;
					}

					public void setHealthCheckInterval(Long healthCheckInterval) {
						this.healthCheckInterval = healthCheckInterval;
					}

					public Long getHealthCheckThreshold() {
						return this.healthCheckThreshold;
					}

					public void setHealthCheckThreshold(Long healthCheckThreshold) {
						this.healthCheckThreshold = healthCheckThreshold;
					}

					public Long getHealthCheckTimeout() {
						return this.healthCheckTimeout;
					}

					public void setHealthCheckTimeout(Long healthCheckTimeout) {
						this.healthCheckTimeout = healthCheckTimeout;
					}

					public String getHealthCheckUri() {
						return this.healthCheckUri;
					}

					public void setHealthCheckUri(String healthCheckUri) {
						this.healthCheckUri = healthCheckUri;
					}

					public Long getListenerPort() {
						return this.listenerPort;
					}

					public void setListenerPort(Long listenerPort) {
						this.listenerPort = listenerPort;
					}

					public Long getPersistenceTimeout() {
						return this.persistenceTimeout;
					}

					public void setPersistenceTimeout(Long persistenceTimeout) {
						this.persistenceTimeout = persistenceTimeout;
					}

					public String getBizProtocol() {
						return this.protocol;
					}

					public void setBizProtocol(String protocol) {
						this.protocol = protocol;
					}

					public String getScheduler() {
						return this.scheduler;
					}

					public void setScheduler(String scheduler) {
						this.scheduler = scheduler;
					}

					public Long getSessionStickyType() {
						return this.sessionStickyType;
					}

					public void setSessionStickyType(Long sessionStickyType) {
						this.sessionStickyType = sessionStickyType;
					}

					public Long getUnhealthyThreshold() {
						return this.unhealthyThreshold;
					}

					public void setUnhealthyThreshold(Long unhealthyThreshold) {
						this.unhealthyThreshold = unhealthyThreshold;
					}

					public Boolean getXforwardFor() {
						return this.xforwardFor;
					}

					public void setXforwardFor(Boolean xforwardFor) {
						this.xforwardFor = xforwardFor;
					}

					public String getDomain() {
						return this.domain;
					}

					public void setDomain(String domain) {
						this.domain = domain;
					}

					public String getPath() {
						return this.path;
					}

					public void setPath(String path) {
						this.path = path;
					}
				}
			}

			public static class InnerLoadBalancerServicesItem {

				private String domain;

				private String loadBalancerIaasId;

				private String loadBalancerName;

				private String name;

				private String spannerClusterId;

				private String addressType;

				private List<ListenersItem5> listeners4;

				private List<CellSlbIaasIdMapItem> cellSlbIaasIdMap;

				public String getDomain() {
					return this.domain;
				}

				public void setDomain(String domain) {
					this.domain = domain;
				}

				public String getLoadBalancerIaasId() {
					return this.loadBalancerIaasId;
				}

				public void setLoadBalancerIaasId(String loadBalancerIaasId) {
					this.loadBalancerIaasId = loadBalancerIaasId;
				}

				public String getLoadBalancerName() {
					return this.loadBalancerName;
				}

				public void setLoadBalancerName(String loadBalancerName) {
					this.loadBalancerName = loadBalancerName;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getSpannerClusterId() {
					return this.spannerClusterId;
				}

				public void setSpannerClusterId(String spannerClusterId) {
					this.spannerClusterId = spannerClusterId;
				}

				public String getAddressType() {
					return this.addressType;
				}

				public void setAddressType(String addressType) {
					this.addressType = addressType;
				}

				public List<ListenersItem5> getListeners4() {
					return this.listeners4;
				}

				public void setListeners4(List<ListenersItem5> listeners4) {
					this.listeners4 = listeners4;
				}

				public List<CellSlbIaasIdMapItem> getCellSlbIaasIdMap() {
					return this.cellSlbIaasIdMap;
				}

				public void setCellSlbIaasIdMap(List<CellSlbIaasIdMapItem> cellSlbIaasIdMap) {
					this.cellSlbIaasIdMap = cellSlbIaasIdMap;
				}

				public static class ListenersItem5 {

					private Long backendServerPort;

					private Long bandWidth;

					private String caCertificateId;

					private String cookie;

					private Long cookieTimeout;

					private Long establishedTimeout;

					private Long healthyThreshold;

					private String healthCheck;

					private Long healthCheckConnectPort;

					private Long healthCheckConnectTimeout;

					private String healthCheckDomain;

					private String healthCheckHttpCode;

					private Long healthCheckInterval;

					private Long healthCheckThreshold;

					private Long healthCheckTimeout;

					private String healthCheckUri;

					private Long listenerPort;

					private Long persistenceTimeout;

					private String protocol;

					private String scheduler;

					private Long sessionStickyType;

					private Long unhealthyThreshold;

					private Boolean xforwardFor;

					private String domain;

					private String path;

					public Long getBackendServerPort() {
						return this.backendServerPort;
					}

					public void setBackendServerPort(Long backendServerPort) {
						this.backendServerPort = backendServerPort;
					}

					public Long getBandWidth() {
						return this.bandWidth;
					}

					public void setBandWidth(Long bandWidth) {
						this.bandWidth = bandWidth;
					}

					public String getCaCertificateId() {
						return this.caCertificateId;
					}

					public void setCaCertificateId(String caCertificateId) {
						this.caCertificateId = caCertificateId;
					}

					public String getCookie() {
						return this.cookie;
					}

					public void setCookie(String cookie) {
						this.cookie = cookie;
					}

					public Long getCookieTimeout() {
						return this.cookieTimeout;
					}

					public void setCookieTimeout(Long cookieTimeout) {
						this.cookieTimeout = cookieTimeout;
					}

					public Long getEstablishedTimeout() {
						return this.establishedTimeout;
					}

					public void setEstablishedTimeout(Long establishedTimeout) {
						this.establishedTimeout = establishedTimeout;
					}

					public Long getHealthyThreshold() {
						return this.healthyThreshold;
					}

					public void setHealthyThreshold(Long healthyThreshold) {
						this.healthyThreshold = healthyThreshold;
					}

					public String getHealthCheck() {
						return this.healthCheck;
					}

					public void setHealthCheck(String healthCheck) {
						this.healthCheck = healthCheck;
					}

					public Long getHealthCheckConnectPort() {
						return this.healthCheckConnectPort;
					}

					public void setHealthCheckConnectPort(Long healthCheckConnectPort) {
						this.healthCheckConnectPort = healthCheckConnectPort;
					}

					public Long getHealthCheckConnectTimeout() {
						return this.healthCheckConnectTimeout;
					}

					public void setHealthCheckConnectTimeout(Long healthCheckConnectTimeout) {
						this.healthCheckConnectTimeout = healthCheckConnectTimeout;
					}

					public String getHealthCheckDomain() {
						return this.healthCheckDomain;
					}

					public void setHealthCheckDomain(String healthCheckDomain) {
						this.healthCheckDomain = healthCheckDomain;
					}

					public String getHealthCheckHttpCode() {
						return this.healthCheckHttpCode;
					}

					public void setHealthCheckHttpCode(String healthCheckHttpCode) {
						this.healthCheckHttpCode = healthCheckHttpCode;
					}

					public Long getHealthCheckInterval() {
						return this.healthCheckInterval;
					}

					public void setHealthCheckInterval(Long healthCheckInterval) {
						this.healthCheckInterval = healthCheckInterval;
					}

					public Long getHealthCheckThreshold() {
						return this.healthCheckThreshold;
					}

					public void setHealthCheckThreshold(Long healthCheckThreshold) {
						this.healthCheckThreshold = healthCheckThreshold;
					}

					public Long getHealthCheckTimeout() {
						return this.healthCheckTimeout;
					}

					public void setHealthCheckTimeout(Long healthCheckTimeout) {
						this.healthCheckTimeout = healthCheckTimeout;
					}

					public String getHealthCheckUri() {
						return this.healthCheckUri;
					}

					public void setHealthCheckUri(String healthCheckUri) {
						this.healthCheckUri = healthCheckUri;
					}

					public Long getListenerPort() {
						return this.listenerPort;
					}

					public void setListenerPort(Long listenerPort) {
						this.listenerPort = listenerPort;
					}

					public Long getPersistenceTimeout() {
						return this.persistenceTimeout;
					}

					public void setPersistenceTimeout(Long persistenceTimeout) {
						this.persistenceTimeout = persistenceTimeout;
					}

					public String getBizProtocol() {
						return this.protocol;
					}

					public void setBizProtocol(String protocol) {
						this.protocol = protocol;
					}

					public String getScheduler() {
						return this.scheduler;
					}

					public void setScheduler(String scheduler) {
						this.scheduler = scheduler;
					}

					public Long getSessionStickyType() {
						return this.sessionStickyType;
					}

					public void setSessionStickyType(Long sessionStickyType) {
						this.sessionStickyType = sessionStickyType;
					}

					public Long getUnhealthyThreshold() {
						return this.unhealthyThreshold;
					}

					public void setUnhealthyThreshold(Long unhealthyThreshold) {
						this.unhealthyThreshold = unhealthyThreshold;
					}

					public Boolean getXforwardFor() {
						return this.xforwardFor;
					}

					public void setXforwardFor(Boolean xforwardFor) {
						this.xforwardFor = xforwardFor;
					}

					public String getDomain() {
						return this.domain;
					}

					public void setDomain(String domain) {
						this.domain = domain;
					}

					public String getPath() {
						return this.path;
					}

					public void setPath(String path) {
						this.path = path;
					}
				}

				public static class CellSlbIaasIdMapItem {

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

			public static class PublicLoadBalancerServicesItem {

				private String domain;

				private String loadBalancerIaasId;

				private String loadBalancerName;

				private String name;

				private String spannerClusterId;

				private String addressType;

				private List<ListenersItem8> listeners6;

				private List<CellSlbIaasIdMapItem9> cellSlbIaasIdMap7;

				public String getDomain() {
					return this.domain;
				}

				public void setDomain(String domain) {
					this.domain = domain;
				}

				public String getLoadBalancerIaasId() {
					return this.loadBalancerIaasId;
				}

				public void setLoadBalancerIaasId(String loadBalancerIaasId) {
					this.loadBalancerIaasId = loadBalancerIaasId;
				}

				public String getLoadBalancerName() {
					return this.loadBalancerName;
				}

				public void setLoadBalancerName(String loadBalancerName) {
					this.loadBalancerName = loadBalancerName;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getSpannerClusterId() {
					return this.spannerClusterId;
				}

				public void setSpannerClusterId(String spannerClusterId) {
					this.spannerClusterId = spannerClusterId;
				}

				public String getAddressType() {
					return this.addressType;
				}

				public void setAddressType(String addressType) {
					this.addressType = addressType;
				}

				public List<ListenersItem8> getListeners6() {
					return this.listeners6;
				}

				public void setListeners6(List<ListenersItem8> listeners6) {
					this.listeners6 = listeners6;
				}

				public List<CellSlbIaasIdMapItem9> getCellSlbIaasIdMap7() {
					return this.cellSlbIaasIdMap7;
				}

				public void setCellSlbIaasIdMap7(List<CellSlbIaasIdMapItem9> cellSlbIaasIdMap7) {
					this.cellSlbIaasIdMap7 = cellSlbIaasIdMap7;
				}

				public static class ListenersItem8 {

					private Long backendServerPort;

					private Long bandWidth;

					private String caCertificateId;

					private String cookie;

					private Long cookieTimeout;

					private Long establishedTimeout;

					private Long healthyThreshold;

					private String healthCheck;

					private Long healthCheckConnectPort;

					private Long healthCheckConnectTimeout;

					private String healthCheckDomain;

					private String healthCheckHttpCode;

					private Long healthCheckInterval;

					private Long healthCheckThreshold;

					private Long healthCheckTimeout;

					private String healthCheckUri;

					private Long listenerPort;

					private Long persistenceTimeout;

					private String protocol;

					private String scheduler;

					private Long sessionStickyType;

					private Long unhealthyThreshold;

					private Boolean xforwardFor;

					private String domain;

					private String path;

					public Long getBackendServerPort() {
						return this.backendServerPort;
					}

					public void setBackendServerPort(Long backendServerPort) {
						this.backendServerPort = backendServerPort;
					}

					public Long getBandWidth() {
						return this.bandWidth;
					}

					public void setBandWidth(Long bandWidth) {
						this.bandWidth = bandWidth;
					}

					public String getCaCertificateId() {
						return this.caCertificateId;
					}

					public void setCaCertificateId(String caCertificateId) {
						this.caCertificateId = caCertificateId;
					}

					public String getCookie() {
						return this.cookie;
					}

					public void setCookie(String cookie) {
						this.cookie = cookie;
					}

					public Long getCookieTimeout() {
						return this.cookieTimeout;
					}

					public void setCookieTimeout(Long cookieTimeout) {
						this.cookieTimeout = cookieTimeout;
					}

					public Long getEstablishedTimeout() {
						return this.establishedTimeout;
					}

					public void setEstablishedTimeout(Long establishedTimeout) {
						this.establishedTimeout = establishedTimeout;
					}

					public Long getHealthyThreshold() {
						return this.healthyThreshold;
					}

					public void setHealthyThreshold(Long healthyThreshold) {
						this.healthyThreshold = healthyThreshold;
					}

					public String getHealthCheck() {
						return this.healthCheck;
					}

					public void setHealthCheck(String healthCheck) {
						this.healthCheck = healthCheck;
					}

					public Long getHealthCheckConnectPort() {
						return this.healthCheckConnectPort;
					}

					public void setHealthCheckConnectPort(Long healthCheckConnectPort) {
						this.healthCheckConnectPort = healthCheckConnectPort;
					}

					public Long getHealthCheckConnectTimeout() {
						return this.healthCheckConnectTimeout;
					}

					public void setHealthCheckConnectTimeout(Long healthCheckConnectTimeout) {
						this.healthCheckConnectTimeout = healthCheckConnectTimeout;
					}

					public String getHealthCheckDomain() {
						return this.healthCheckDomain;
					}

					public void setHealthCheckDomain(String healthCheckDomain) {
						this.healthCheckDomain = healthCheckDomain;
					}

					public String getHealthCheckHttpCode() {
						return this.healthCheckHttpCode;
					}

					public void setHealthCheckHttpCode(String healthCheckHttpCode) {
						this.healthCheckHttpCode = healthCheckHttpCode;
					}

					public Long getHealthCheckInterval() {
						return this.healthCheckInterval;
					}

					public void setHealthCheckInterval(Long healthCheckInterval) {
						this.healthCheckInterval = healthCheckInterval;
					}

					public Long getHealthCheckThreshold() {
						return this.healthCheckThreshold;
					}

					public void setHealthCheckThreshold(Long healthCheckThreshold) {
						this.healthCheckThreshold = healthCheckThreshold;
					}

					public Long getHealthCheckTimeout() {
						return this.healthCheckTimeout;
					}

					public void setHealthCheckTimeout(Long healthCheckTimeout) {
						this.healthCheckTimeout = healthCheckTimeout;
					}

					public String getHealthCheckUri() {
						return this.healthCheckUri;
					}

					public void setHealthCheckUri(String healthCheckUri) {
						this.healthCheckUri = healthCheckUri;
					}

					public Long getListenerPort() {
						return this.listenerPort;
					}

					public void setListenerPort(Long listenerPort) {
						this.listenerPort = listenerPort;
					}

					public Long getPersistenceTimeout() {
						return this.persistenceTimeout;
					}

					public void setPersistenceTimeout(Long persistenceTimeout) {
						this.persistenceTimeout = persistenceTimeout;
					}

					public String getBizProtocol() {
						return this.protocol;
					}

					public void setBizProtocol(String protocol) {
						this.protocol = protocol;
					}

					public String getScheduler() {
						return this.scheduler;
					}

					public void setScheduler(String scheduler) {
						this.scheduler = scheduler;
					}

					public Long getSessionStickyType() {
						return this.sessionStickyType;
					}

					public void setSessionStickyType(Long sessionStickyType) {
						this.sessionStickyType = sessionStickyType;
					}

					public Long getUnhealthyThreshold() {
						return this.unhealthyThreshold;
					}

					public void setUnhealthyThreshold(Long unhealthyThreshold) {
						this.unhealthyThreshold = unhealthyThreshold;
					}

					public Boolean getXforwardFor() {
						return this.xforwardFor;
					}

					public void setXforwardFor(Boolean xforwardFor) {
						this.xforwardFor = xforwardFor;
					}

					public String getDomain() {
						return this.domain;
					}

					public void setDomain(String domain) {
						this.domain = domain;
					}

					public String getPath() {
						return this.path;
					}

					public void setPath(String path) {
						this.path = path;
					}
				}

				public static class CellSlbIaasIdMapItem9 {

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

			public static class SidecarConfigsItem {

				private String id;

				private String regionId;

				private String scope;

				private String sidecarName;

				private String sidecarVersion;

				private String template;

				private String type;

				private String workspaceGroupId;

				private String workspaceId;

				public String getId() {
					return this.id;
				}

				public void setId(String id) {
					this.id = id;
				}

				public String getRegionId() {
					return this.regionId;
				}

				public void setRegionId(String regionId) {
					this.regionId = regionId;
				}

				public String getScope() {
					return this.scope;
				}

				public void setScope(String scope) {
					this.scope = scope;
				}

				public String getSidecarName() {
					return this.sidecarName;
				}

				public void setSidecarName(String sidecarName) {
					this.sidecarName = sidecarName;
				}

				public String getSidecarVersion() {
					return this.sidecarVersion;
				}

				public void setSidecarVersion(String sidecarVersion) {
					this.sidecarVersion = sidecarVersion;
				}

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public String getWorkspaceGroupId() {
					return this.workspaceGroupId;
				}

				public void setWorkspaceGroupId(String workspaceGroupId) {
					this.workspaceGroupId = workspaceGroupId;
				}

				public String getWorkspaceId() {
					return this.workspaceId;
				}

				public void setWorkspaceId(String workspaceId) {
					this.workspaceId = workspaceId;
				}
			}

			public static class LoadBalancerServicesItem {

				private String domain;

				private String loadBalancerIaasId;

				private String loadBalancerName;

				private String name;

				private String spannerClusterId;

				private String addressType;

				private List<ListenersItem12> listeners10;

				private List<CellSlbIaasIdMapItem13> cellSlbIaasIdMap11;

				public String getDomain() {
					return this.domain;
				}

				public void setDomain(String domain) {
					this.domain = domain;
				}

				public String getLoadBalancerIaasId() {
					return this.loadBalancerIaasId;
				}

				public void setLoadBalancerIaasId(String loadBalancerIaasId) {
					this.loadBalancerIaasId = loadBalancerIaasId;
				}

				public String getLoadBalancerName() {
					return this.loadBalancerName;
				}

				public void setLoadBalancerName(String loadBalancerName) {
					this.loadBalancerName = loadBalancerName;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getSpannerClusterId() {
					return this.spannerClusterId;
				}

				public void setSpannerClusterId(String spannerClusterId) {
					this.spannerClusterId = spannerClusterId;
				}

				public String getAddressType() {
					return this.addressType;
				}

				public void setAddressType(String addressType) {
					this.addressType = addressType;
				}

				public List<ListenersItem12> getListeners10() {
					return this.listeners10;
				}

				public void setListeners10(List<ListenersItem12> listeners10) {
					this.listeners10 = listeners10;
				}

				public List<CellSlbIaasIdMapItem13> getCellSlbIaasIdMap11() {
					return this.cellSlbIaasIdMap11;
				}

				public void setCellSlbIaasIdMap11(List<CellSlbIaasIdMapItem13> cellSlbIaasIdMap11) {
					this.cellSlbIaasIdMap11 = cellSlbIaasIdMap11;
				}

				public static class ListenersItem12 {

					private Long backendServerPort;

					private Long bandWidth;

					private String caCertificateId;

					private String cookie;

					private Long cookieTimeout;

					private Long establishedTimeout;

					private Long healthyThreshold;

					private String healthCheck;

					private Long healthCheckConnectPort;

					private Long healthCheckConnectTimeout;

					private String healthCheckDomain;

					private String healthCheckHttpCode;

					private Long healthCheckInterval;

					private Long healthCheckThreshold;

					private Long healthCheckTimeout;

					private String healthCheckUri;

					private Long listenerPort;

					private Long persistenceTimeout;

					private String protocol;

					private String scheduler;

					private Long sessionStickyType;

					private Long unhealthyThreshold;

					private Boolean xforwardFor;

					private String domain;

					private String path;

					public Long getBackendServerPort() {
						return this.backendServerPort;
					}

					public void setBackendServerPort(Long backendServerPort) {
						this.backendServerPort = backendServerPort;
					}

					public Long getBandWidth() {
						return this.bandWidth;
					}

					public void setBandWidth(Long bandWidth) {
						this.bandWidth = bandWidth;
					}

					public String getCaCertificateId() {
						return this.caCertificateId;
					}

					public void setCaCertificateId(String caCertificateId) {
						this.caCertificateId = caCertificateId;
					}

					public String getCookie() {
						return this.cookie;
					}

					public void setCookie(String cookie) {
						this.cookie = cookie;
					}

					public Long getCookieTimeout() {
						return this.cookieTimeout;
					}

					public void setCookieTimeout(Long cookieTimeout) {
						this.cookieTimeout = cookieTimeout;
					}

					public Long getEstablishedTimeout() {
						return this.establishedTimeout;
					}

					public void setEstablishedTimeout(Long establishedTimeout) {
						this.establishedTimeout = establishedTimeout;
					}

					public Long getHealthyThreshold() {
						return this.healthyThreshold;
					}

					public void setHealthyThreshold(Long healthyThreshold) {
						this.healthyThreshold = healthyThreshold;
					}

					public String getHealthCheck() {
						return this.healthCheck;
					}

					public void setHealthCheck(String healthCheck) {
						this.healthCheck = healthCheck;
					}

					public Long getHealthCheckConnectPort() {
						return this.healthCheckConnectPort;
					}

					public void setHealthCheckConnectPort(Long healthCheckConnectPort) {
						this.healthCheckConnectPort = healthCheckConnectPort;
					}

					public Long getHealthCheckConnectTimeout() {
						return this.healthCheckConnectTimeout;
					}

					public void setHealthCheckConnectTimeout(Long healthCheckConnectTimeout) {
						this.healthCheckConnectTimeout = healthCheckConnectTimeout;
					}

					public String getHealthCheckDomain() {
						return this.healthCheckDomain;
					}

					public void setHealthCheckDomain(String healthCheckDomain) {
						this.healthCheckDomain = healthCheckDomain;
					}

					public String getHealthCheckHttpCode() {
						return this.healthCheckHttpCode;
					}

					public void setHealthCheckHttpCode(String healthCheckHttpCode) {
						this.healthCheckHttpCode = healthCheckHttpCode;
					}

					public Long getHealthCheckInterval() {
						return this.healthCheckInterval;
					}

					public void setHealthCheckInterval(Long healthCheckInterval) {
						this.healthCheckInterval = healthCheckInterval;
					}

					public Long getHealthCheckThreshold() {
						return this.healthCheckThreshold;
					}

					public void setHealthCheckThreshold(Long healthCheckThreshold) {
						this.healthCheckThreshold = healthCheckThreshold;
					}

					public Long getHealthCheckTimeout() {
						return this.healthCheckTimeout;
					}

					public void setHealthCheckTimeout(Long healthCheckTimeout) {
						this.healthCheckTimeout = healthCheckTimeout;
					}

					public String getHealthCheckUri() {
						return this.healthCheckUri;
					}

					public void setHealthCheckUri(String healthCheckUri) {
						this.healthCheckUri = healthCheckUri;
					}

					public Long getListenerPort() {
						return this.listenerPort;
					}

					public void setListenerPort(Long listenerPort) {
						this.listenerPort = listenerPort;
					}

					public Long getPersistenceTimeout() {
						return this.persistenceTimeout;
					}

					public void setPersistenceTimeout(Long persistenceTimeout) {
						this.persistenceTimeout = persistenceTimeout;
					}

					public String getBizProtocol() {
						return this.protocol;
					}

					public void setBizProtocol(String protocol) {
						this.protocol = protocol;
					}

					public String getScheduler() {
						return this.scheduler;
					}

					public void setScheduler(String scheduler) {
						this.scheduler = scheduler;
					}

					public Long getSessionStickyType() {
						return this.sessionStickyType;
					}

					public void setSessionStickyType(Long sessionStickyType) {
						this.sessionStickyType = sessionStickyType;
					}

					public Long getUnhealthyThreshold() {
						return this.unhealthyThreshold;
					}

					public void setUnhealthyThreshold(Long unhealthyThreshold) {
						this.unhealthyThreshold = unhealthyThreshold;
					}

					public Boolean getXforwardFor() {
						return this.xforwardFor;
					}

					public void setXforwardFor(Boolean xforwardFor) {
						this.xforwardFor = xforwardFor;
					}

					public String getDomain() {
						return this.domain;
					}

					public void setDomain(String domain) {
						this.domain = domain;
					}

					public String getPath() {
						return this.path;
					}

					public void setPath(String path) {
						this.path = path;
					}
				}

				public static class CellSlbIaasIdMapItem13 {

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

			public static class DeployConfig {

				private String annotations;

				private String customLabels;

				private Long groupCount;

				private String groupStrategy;

				private String labels;

				private Long maxGroupCapacity;

				private Boolean needBeta;

				private Boolean needConfirm;

				private Boolean enableSofaMesh;

				private Affinity affinity;

				public String getAnnotations() {
					return this.annotations;
				}

				public void setAnnotations(String annotations) {
					this.annotations = annotations;
				}

				public String getCustomLabels() {
					return this.customLabels;
				}

				public void setCustomLabels(String customLabels) {
					this.customLabels = customLabels;
				}

				public Long getGroupCount() {
					return this.groupCount;
				}

				public void setGroupCount(Long groupCount) {
					this.groupCount = groupCount;
				}

				public String getGroupStrategy() {
					return this.groupStrategy;
				}

				public void setGroupStrategy(String groupStrategy) {
					this.groupStrategy = groupStrategy;
				}

				public String getLabels() {
					return this.labels;
				}

				public void setLabels(String labels) {
					this.labels = labels;
				}

				public Long getMaxGroupCapacity() {
					return this.maxGroupCapacity;
				}

				public void setMaxGroupCapacity(Long maxGroupCapacity) {
					this.maxGroupCapacity = maxGroupCapacity;
				}

				public Boolean getNeedBeta() {
					return this.needBeta;
				}

				public void setNeedBeta(Boolean needBeta) {
					this.needBeta = needBeta;
				}

				public Boolean getNeedConfirm() {
					return this.needConfirm;
				}

				public void setNeedConfirm(Boolean needConfirm) {
					this.needConfirm = needConfirm;
				}

				public Boolean getEnableSofaMesh() {
					return this.enableSofaMesh;
				}

				public void setEnableSofaMesh(Boolean enableSofaMesh) {
					this.enableSofaMesh = enableSofaMesh;
				}

				public Affinity getAffinity() {
					return this.affinity;
				}

				public void setAffinity(Affinity affinity) {
					this.affinity = affinity;
				}

				public static class Affinity {

					private List<NodeAffinityItem> nodeAffinity;

					private List<PodAffinityItem> podAffinity;

					public List<NodeAffinityItem> getNodeAffinity() {
						return this.nodeAffinity;
					}

					public void setNodeAffinity(List<NodeAffinityItem> nodeAffinity) {
						this.nodeAffinity = nodeAffinity;
					}

					public List<PodAffinityItem> getPodAffinity() {
						return this.podAffinity;
					}

					public void setPodAffinity(List<PodAffinityItem> podAffinity) {
						this.podAffinity = podAffinity;
					}

					public static class NodeAffinityItem {

						private Boolean requested;

						private Long weight;

						private List<MatchExpressionsItem> matchExpressions;

						public Boolean getRequested() {
							return this.requested;
						}

						public void setRequested(Boolean requested) {
							this.requested = requested;
						}

						public Long getWeight() {
							return this.weight;
						}

						public void setWeight(Long weight) {
							this.weight = weight;
						}

						public List<MatchExpressionsItem> getMatchExpressions() {
							return this.matchExpressions;
						}

						public void setMatchExpressions(List<MatchExpressionsItem> matchExpressions) {
							this.matchExpressions = matchExpressions;
						}

						public static class MatchExpressionsItem {

							private String key;

							private String operator;

							private List<String> values;

							public String getKey() {
								return this.key;
							}

							public void setKey(String key) {
								this.key = key;
							}

							public String getOperator() {
								return this.operator;
							}

							public void setOperator(String operator) {
								this.operator = operator;
							}

							public List<String> getValues() {
								return this.values;
							}

							public void setValues(List<String> values) {
								this.values = values;
							}
						}
					}

					public static class PodAffinityItem {

						private Boolean antiAffinity;

						private Boolean requested;

						private Long weight;

						private PodAffinityTerm podAffinityTerm;

						public Boolean getAntiAffinity() {
							return this.antiAffinity;
						}

						public void setAntiAffinity(Boolean antiAffinity) {
							this.antiAffinity = antiAffinity;
						}

						public Boolean getRequested() {
							return this.requested;
						}

						public void setRequested(Boolean requested) {
							this.requested = requested;
						}

						public Long getWeight() {
							return this.weight;
						}

						public void setWeight(Long weight) {
							this.weight = weight;
						}

						public PodAffinityTerm getPodAffinityTerm() {
							return this.podAffinityTerm;
						}

						public void setPodAffinityTerm(PodAffinityTerm podAffinityTerm) {
							this.podAffinityTerm = podAffinityTerm;
						}

						public static class PodAffinityTerm {

							private String topologyKey;

							private List<LabelSelectorItem> labelSelector;

							private List<String> namespaces;

							public String getTopologyKey() {
								return this.topologyKey;
							}

							public void setTopologyKey(String topologyKey) {
								this.topologyKey = topologyKey;
							}

							public List<LabelSelectorItem> getLabelSelector() {
								return this.labelSelector;
							}

							public void setLabelSelector(List<LabelSelectorItem> labelSelector) {
								this.labelSelector = labelSelector;
							}

							public List<String> getNamespaces() {
								return this.namespaces;
							}

							public void setNamespaces(List<String> namespaces) {
								this.namespaces = namespaces;
							}

							public static class LabelSelectorItem {

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
				}
			}

			public static class ElasticConfig {

				private String mode;

				private FixedReplica fixedReplica;

				private Hpa hpa;

				public String getMode() {
					return this.mode;
				}

				public void setMode(String mode) {
					this.mode = mode;
				}

				public FixedReplica getFixedReplica() {
					return this.fixedReplica;
				}

				public void setFixedReplica(FixedReplica fixedReplica) {
					this.fixedReplica = fixedReplica;
				}

				public Hpa getHpa() {
					return this.hpa;
				}

				public void setHpa(Hpa hpa) {
					this.hpa = hpa;
				}

				public static class FixedReplica {

					private List<ReplicasItem> replicas;

					public List<ReplicasItem> getReplicas() {
						return this.replicas;
					}

					public void setReplicas(List<ReplicasItem> replicas) {
						this.replicas = replicas;
					}

					public static class ReplicasItem {

						private String type;

						private String name;

						private Long count;

						public String getType() {
							return this.type;
						}

						public void setType(String type) {
							this.type = type;
						}

						public String getName() {
							return this.name;
						}

						public void setName(String name) {
							this.name = name;
						}

						public Long getCount() {
							return this.count;
						}

						public void setCount(Long count) {
							this.count = count;
						}
					}
				}

				public static class Hpa {

					private Long minReplica;

					private Long maxReplica;

					private List<CellsItem> cells;

					private List<MetricsItem> metrics;

					public Long getMinReplica() {
						return this.minReplica;
					}

					public void setMinReplica(Long minReplica) {
						this.minReplica = minReplica;
					}

					public Long getMaxReplica() {
						return this.maxReplica;
					}

					public void setMaxReplica(Long maxReplica) {
						this.maxReplica = maxReplica;
					}

					public List<CellsItem> getCells() {
						return this.cells;
					}

					public void setCells(List<CellsItem> cells) {
						this.cells = cells;
					}

					public List<MetricsItem> getMetrics() {
						return this.metrics;
					}

					public void setMetrics(List<MetricsItem> metrics) {
						this.metrics = metrics;
					}

					public static class CellsItem {

						private String name;

						private Long replicas;

						public String getName() {
							return this.name;
						}

						public void setName(String name) {
							this.name = name;
						}

						public Long getReplicas() {
							return this.replicas;
						}

						public void setReplicas(Long replicas) {
							this.replicas = replicas;
						}
					}

					public static class MetricsItem {

						private String name;

						private Target target;

						public String getName() {
							return this.name;
						}

						public void setName(String name) {
							this.name = name;
						}

						public Target getTarget() {
							return this.target;
						}

						public void setTarget(Target target) {
							this.target = target;
						}

						public static class Target {

							private String type;

							private Long utilization;

							private Value value;

							public String getType() {
								return this.type;
							}

							public void setType(String type) {
								this.type = type;
							}

							public Long getUtilization() {
								return this.utilization;
							}

							public void setUtilization(Long utilization) {
								this.utilization = utilization;
							}

							public Value getValue() {
								return this.value;
							}

							public void setValue(Value value) {
								this.value = value;
							}

							public static class Value {

								private Long value;

								private String unit;

								public Long getValue() {
									return this.value;
								}

								public void setValue(Long value) {
									this.value = value;
								}

								public String getUnit() {
									return this.unit;
								}

								public void setUnit(String unit) {
									this.unit = unit;
								}
							}
						}
					}
				}
			}
		}

		public static class ContainerServiceReleaseInfo {

			private String createdPlanId;

			private String latestDeploymentStartTime;

			private String latestDeploymentEndTime;

			public String getCreatedPlanId() {
				return this.createdPlanId;
			}

			public void setCreatedPlanId(String createdPlanId) {
				this.createdPlanId = createdPlanId;
			}

			public String getLatestDeploymentStartTime() {
				return this.latestDeploymentStartTime;
			}

			public void setLatestDeploymentStartTime(String latestDeploymentStartTime) {
				this.latestDeploymentStartTime = latestDeploymentStartTime;
			}

			public String getLatestDeploymentEndTime() {
				return this.latestDeploymentEndTime;
			}

			public void setLatestDeploymentEndTime(String latestDeploymentEndTime) {
				this.latestDeploymentEndTime = latestDeploymentEndTime;
			}
		}
	}

	@Override
	public GetLDCContainerServiceRevisionResponse getInstance(UnmarshallerContext context) {
		return	GetLDCContainerServiceRevisionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
