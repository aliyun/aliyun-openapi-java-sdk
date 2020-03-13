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
import com.aliyuncs.sofa.transform.v20190815.ListAKSContainerservicesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAKSContainerservicesResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private List<ListItem> list;

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

	public List<ListItem> getList() {
		return this.list;
	}

	public void setList(List<ListItem> list) {
		this.list = list;
	}

	public static class ListItem {

		private String displayedRevision;

		private String owner;

		private Long podCount;

		private Long processingPodCount;

		private Long replicas;

		private Long runningPodCount;

		private ContainerService containerService;

		private ImageSource imageSource;

		public String getDisplayedRevision() {
			return this.displayedRevision;
		}

		public void setDisplayedRevision(String displayedRevision) {
			this.displayedRevision = displayedRevision;
		}

		public String getOwner() {
			return this.owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public Long getPodCount() {
			return this.podCount;
		}

		public void setPodCount(Long podCount) {
			this.podCount = podCount;
		}

		public Long getProcessingPodCount() {
			return this.processingPodCount;
		}

		public void setProcessingPodCount(Long processingPodCount) {
			this.processingPodCount = processingPodCount;
		}

		public Long getReplicas() {
			return this.replicas;
		}

		public void setReplicas(Long replicas) {
			this.replicas = replicas;
		}

		public Long getRunningPodCount() {
			return this.runningPodCount;
		}

		public void setRunningPodCount(Long runningPodCount) {
			this.runningPodCount = runningPodCount;
		}

		public ContainerService getContainerService() {
			return this.containerService;
		}

		public void setContainerService(ContainerService containerService) {
			this.containerService = containerService;
		}

		public ImageSource getImageSource() {
			return this.imageSource;
		}

		public void setImageSource(ImageSource imageSource) {
			this.imageSource = imageSource;
		}

		public static class ContainerService {

			private String appId;

			private String appName;

			private String appSvcId;

			private String appSvcName;

			private String containerServiceType;

			private String description;

			private String draftedRevision;

			private String draftedTime;

			private Boolean enableBizMonitor;

			private Boolean enableMesh;

			private Boolean enableSofaMesh;

			private String operatorId;

			private String operatorName;

			private String runtimeRevision;

			private Boolean useHostNetwork;

			private List<LogConfigsItem> logConfigs;

			private LifecycleState lifecycleState;

			private NamespaceScopedEntity namespaceScopedEntity;

			private PodTemplate podTemplate;

			public String getAppId() {
				return this.appId;
			}

			public void setAppId(String appId) {
				this.appId = appId;
			}

			public String getAppName() {
				return this.appName;
			}

			public void setAppName(String appName) {
				this.appName = appName;
			}

			public String getAppSvcId() {
				return this.appSvcId;
			}

			public void setAppSvcId(String appSvcId) {
				this.appSvcId = appSvcId;
			}

			public String getAppSvcName() {
				return this.appSvcName;
			}

			public void setAppSvcName(String appSvcName) {
				this.appSvcName = appSvcName;
			}

			public String getContainerServiceType() {
				return this.containerServiceType;
			}

			public void setContainerServiceType(String containerServiceType) {
				this.containerServiceType = containerServiceType;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getDraftedRevision() {
				return this.draftedRevision;
			}

			public void setDraftedRevision(String draftedRevision) {
				this.draftedRevision = draftedRevision;
			}

			public String getDraftedTime() {
				return this.draftedTime;
			}

			public void setDraftedTime(String draftedTime) {
				this.draftedTime = draftedTime;
			}

			public Boolean getEnableBizMonitor() {
				return this.enableBizMonitor;
			}

			public void setEnableBizMonitor(Boolean enableBizMonitor) {
				this.enableBizMonitor = enableBizMonitor;
			}

			public Boolean getEnableMesh() {
				return this.enableMesh;
			}

			public void setEnableMesh(Boolean enableMesh) {
				this.enableMesh = enableMesh;
			}

			public Boolean getEnableSofaMesh() {
				return this.enableSofaMesh;
			}

			public void setEnableSofaMesh(Boolean enableSofaMesh) {
				this.enableSofaMesh = enableSofaMesh;
			}

			public String getOperatorId() {
				return this.operatorId;
			}

			public void setOperatorId(String operatorId) {
				this.operatorId = operatorId;
			}

			public String getOperatorName() {
				return this.operatorName;
			}

			public void setOperatorName(String operatorName) {
				this.operatorName = operatorName;
			}

			public String getRuntimeRevision() {
				return this.runtimeRevision;
			}

			public void setRuntimeRevision(String runtimeRevision) {
				this.runtimeRevision = runtimeRevision;
			}

			public Boolean getUseHostNetwork() {
				return this.useHostNetwork;
			}

			public void setUseHostNetwork(Boolean useHostNetwork) {
				this.useHostNetwork = useHostNetwork;
			}

			public List<LogConfigsItem> getLogConfigs() {
				return this.logConfigs;
			}

			public void setLogConfigs(List<LogConfigsItem> logConfigs) {
				this.logConfigs = logConfigs;
			}

			public LifecycleState getLifecycleState() {
				return this.lifecycleState;
			}

			public void setLifecycleState(LifecycleState lifecycleState) {
				this.lifecycleState = lifecycleState;
			}

			public NamespaceScopedEntity getNamespaceScopedEntity() {
				return this.namespaceScopedEntity;
			}

			public void setNamespaceScopedEntity(NamespaceScopedEntity namespaceScopedEntity) {
				this.namespaceScopedEntity = namespaceScopedEntity;
			}

			public PodTemplate getPodTemplate() {
				return this.podTemplate;
			}

			public void setPodTemplate(PodTemplate podTemplate) {
				this.podTemplate = podTemplate;
			}

			public static class LogConfigsItem {

				private Boolean created;

				private String filePattern;

				private String logConfigPath;

				private String logPath;

				private String logStore;

				private String name;

				private Boolean published;

				public Boolean getCreated() {
					return this.created;
				}

				public void setCreated(Boolean created) {
					this.created = created;
				}

				public String getFilePattern() {
					return this.filePattern;
				}

				public void setFilePattern(String filePattern) {
					this.filePattern = filePattern;
				}

				public String getLogConfigPath() {
					return this.logConfigPath;
				}

				public void setLogConfigPath(String logConfigPath) {
					this.logConfigPath = logConfigPath;
				}

				public String getLogPath() {
					return this.logPath;
				}

				public void setLogPath(String logPath) {
					this.logPath = logPath;
				}

				public String getLogStore() {
					return this.logStore;
				}

				public void setLogStore(String logStore) {
					this.logStore = logStore;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public Boolean getPublished() {
					return this.published;
				}

				public void setPublished(Boolean published) {
					this.published = published;
				}
			}

			public static class LifecycleState {

				private String deploymentState;

				private String metadataState;

				private String runtimeState;

				public String getDeploymentState() {
					return this.deploymentState;
				}

				public void setDeploymentState(String deploymentState) {
					this.deploymentState = deploymentState;
				}

				public String getMetadataState() {
					return this.metadataState;
				}

				public void setMetadataState(String metadataState) {
					this.metadataState = metadataState;
				}

				public String getRuntimeState() {
					return this.runtimeState;
				}

				public void setRuntimeState(String runtimeState) {
					this.runtimeState = runtimeState;
				}
			}

			public static class NamespaceScopedEntity {

				private String clusterId;

				private String name;

				private String namespace;

				private EnvEntity envEntity;

				public String getClusterId() {
					return this.clusterId;
				}

				public void setClusterId(String clusterId) {
					this.clusterId = clusterId;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getNamespace() {
					return this.namespace;
				}

				public void setNamespace(String namespace) {
					this.namespace = namespace;
				}

				public EnvEntity getEnvEntity() {
					return this.envEntity;
				}

				public void setEnvEntity(EnvEntity envEntity) {
					this.envEntity = envEntity;
				}

				public static class EnvEntity {

					private String regionId;

					private String runEnv;

					private String tenantId;

					private String workspaceId;

					private Entity entity;

					public String getRegionId() {
						return this.regionId;
					}

					public void setRegionId(String regionId) {
						this.regionId = regionId;
					}

					public String getRunEnv() {
						return this.runEnv;
					}

					public void setRunEnv(String runEnv) {
						this.runEnv = runEnv;
					}

					public String getTenantId() {
						return this.tenantId;
					}

					public void setTenantId(String tenantId) {
						this.tenantId = tenantId;
					}

					public String getWorkspaceId() {
						return this.workspaceId;
					}

					public void setWorkspaceId(String workspaceId) {
						this.workspaceId = workspaceId;
					}

					public Entity getEntity() {
						return this.entity;
					}

					public void setEntity(Entity entity) {
						this.entity = entity;
					}

					public static class Entity {

						private String createdTime;

						private String id;

						private String modifiedTime;

						public String getCreatedTime() {
							return this.createdTime;
						}

						public void setCreatedTime(String createdTime) {
							this.createdTime = createdTime;
						}

						public String getId() {
							return this.id;
						}

						public void setId(String id) {
							this.id = id;
						}

						public String getModifiedTime() {
							return this.modifiedTime;
						}

						public void setModifiedTime(String modifiedTime) {
							this.modifiedTime = modifiedTime;
						}
					}
				}
			}

			public static class PodTemplate {

				private String containerServiceId;

				private String dnsPolicy;

				private String hostNameTemplate;

				private Boolean useHostNetwork;

				private NamespaceScopedEntity1 namespaceScopedEntity1;

				public String getContainerServiceId() {
					return this.containerServiceId;
				}

				public void setContainerServiceId(String containerServiceId) {
					this.containerServiceId = containerServiceId;
				}

				public String getDnsPolicy() {
					return this.dnsPolicy;
				}

				public void setDnsPolicy(String dnsPolicy) {
					this.dnsPolicy = dnsPolicy;
				}

				public String getHostNameTemplate() {
					return this.hostNameTemplate;
				}

				public void setHostNameTemplate(String hostNameTemplate) {
					this.hostNameTemplate = hostNameTemplate;
				}

				public Boolean getUseHostNetwork() {
					return this.useHostNetwork;
				}

				public void setUseHostNetwork(Boolean useHostNetwork) {
					this.useHostNetwork = useHostNetwork;
				}

				public NamespaceScopedEntity1 getNamespaceScopedEntity1() {
					return this.namespaceScopedEntity1;
				}

				public void setNamespaceScopedEntity1(NamespaceScopedEntity1 namespaceScopedEntity1) {
					this.namespaceScopedEntity1 = namespaceScopedEntity1;
				}

				public static class NamespaceScopedEntity1 {

					private String clusterId;

					private String name;

					private String namespace;

					private EnvEntity2 envEntity2;

					public String getClusterId() {
						return this.clusterId;
					}

					public void setClusterId(String clusterId) {
						this.clusterId = clusterId;
					}

					public String getName() {
						return this.name;
					}

					public void setName(String name) {
						this.name = name;
					}

					public String getNamespace() {
						return this.namespace;
					}

					public void setNamespace(String namespace) {
						this.namespace = namespace;
					}

					public EnvEntity2 getEnvEntity2() {
						return this.envEntity2;
					}

					public void setEnvEntity2(EnvEntity2 envEntity2) {
						this.envEntity2 = envEntity2;
					}

					public static class EnvEntity2 {

						private String regionId;

						private String runEnv;

						private String tenantId;

						private String workspaceId;

						private Entity3 entity3;

						public String getRegionId() {
							return this.regionId;
						}

						public void setRegionId(String regionId) {
							this.regionId = regionId;
						}

						public String getRunEnv() {
							return this.runEnv;
						}

						public void setRunEnv(String runEnv) {
							this.runEnv = runEnv;
						}

						public String getTenantId() {
							return this.tenantId;
						}

						public void setTenantId(String tenantId) {
							this.tenantId = tenantId;
						}

						public String getWorkspaceId() {
							return this.workspaceId;
						}

						public void setWorkspaceId(String workspaceId) {
							this.workspaceId = workspaceId;
						}

						public Entity3 getEntity3() {
							return this.entity3;
						}

						public void setEntity3(Entity3 entity3) {
							this.entity3 = entity3;
						}

						public static class Entity3 {

							private String createdTime;

							private String id;

							private String modifiedTime;

							public String getCreatedTime() {
								return this.createdTime;
							}

							public void setCreatedTime(String createdTime) {
								this.createdTime = createdTime;
							}

							public String getId() {
								return this.id;
							}

							public void setId(String id) {
								this.id = id;
							}

							public String getModifiedTime() {
								return this.modifiedTime;
							}

							public void setModifiedTime(String modifiedTime) {
								this.modifiedTime = modifiedTime;
							}
						}
					}
				}
			}
		}

		public static class ImageSource {

			private String appBuildId;

			private String binaryLocalPath;

			private String branch;

			private Long buildNumber;

			private String pullSecret;

			private String revision;

			private String sourceType;

			private BaseImage baseImage;

			private BinaryRemotePath binaryRemotePath;

			private BuiltImage builtImage;

			private CurrentImage currentImage;

			public String getAppBuildId() {
				return this.appBuildId;
			}

			public void setAppBuildId(String appBuildId) {
				this.appBuildId = appBuildId;
			}

			public String getBinaryLocalPath() {
				return this.binaryLocalPath;
			}

			public void setBinaryLocalPath(String binaryLocalPath) {
				this.binaryLocalPath = binaryLocalPath;
			}

			public String getBranch() {
				return this.branch;
			}

			public void setBranch(String branch) {
				this.branch = branch;
			}

			public Long getBuildNumber() {
				return this.buildNumber;
			}

			public void setBuildNumber(Long buildNumber) {
				this.buildNumber = buildNumber;
			}

			public String getPullSecret() {
				return this.pullSecret;
			}

			public void setPullSecret(String pullSecret) {
				this.pullSecret = pullSecret;
			}

			public String getRevision() {
				return this.revision;
			}

			public void setRevision(String revision) {
				this.revision = revision;
			}

			public String getSourceType() {
				return this.sourceType;
			}

			public void setSourceType(String sourceType) {
				this.sourceType = sourceType;
			}

			public BaseImage getBaseImage() {
				return this.baseImage;
			}

			public void setBaseImage(BaseImage baseImage) {
				this.baseImage = baseImage;
			}

			public BinaryRemotePath getBinaryRemotePath() {
				return this.binaryRemotePath;
			}

			public void setBinaryRemotePath(BinaryRemotePath binaryRemotePath) {
				this.binaryRemotePath = binaryRemotePath;
			}

			public BuiltImage getBuiltImage() {
				return this.builtImage;
			}

			public void setBuiltImage(BuiltImage builtImage) {
				this.builtImage = builtImage;
			}

			public CurrentImage getCurrentImage() {
				return this.currentImage;
			}

			public void setCurrentImage(CurrentImage currentImage) {
				this.currentImage = currentImage;
			}

			public static class BaseImage {

				private String digest;

				private String imageId;

				private String repository;

				private String tag;

				public String getDigest() {
					return this.digest;
				}

				public void setDigest(String digest) {
					this.digest = digest;
				}

				public String getImageId() {
					return this.imageId;
				}

				public void setImageId(String imageId) {
					this.imageId = imageId;
				}

				public String getRepository() {
					return this.repository;
				}

				public void setRepository(String repository) {
					this.repository = repository;
				}

				public String getTag() {
					return this.tag;
				}

				public void setTag(String tag) {
					this.tag = tag;
				}
			}

			public static class BinaryRemotePath {

				private String endpoint;

				private String fileName;

				private String path;

				public String getEndpoint() {
					return this.endpoint;
				}

				public void setEndpoint(String endpoint) {
					this.endpoint = endpoint;
				}

				public String getFileName() {
					return this.fileName;
				}

				public void setFileName(String fileName) {
					this.fileName = fileName;
				}

				public String getPath() {
					return this.path;
				}

				public void setPath(String path) {
					this.path = path;
				}
			}

			public static class BuiltImage {

				private String digest;

				private String imageId;

				private String repository;

				private String tag;

				public String getDigest() {
					return this.digest;
				}

				public void setDigest(String digest) {
					this.digest = digest;
				}

				public String getImageId() {
					return this.imageId;
				}

				public void setImageId(String imageId) {
					this.imageId = imageId;
				}

				public String getRepository() {
					return this.repository;
				}

				public void setRepository(String repository) {
					this.repository = repository;
				}

				public String getTag() {
					return this.tag;
				}

				public void setTag(String tag) {
					this.tag = tag;
				}
			}

			public static class CurrentImage {

				private String digest;

				private String imageId;

				private String repository;

				private String tag;

				public String getDigest() {
					return this.digest;
				}

				public void setDigest(String digest) {
					this.digest = digest;
				}

				public String getImageId() {
					return this.imageId;
				}

				public void setImageId(String imageId) {
					this.imageId = imageId;
				}

				public String getRepository() {
					return this.repository;
				}

				public void setRepository(String repository) {
					this.repository = repository;
				}

				public String getTag() {
					return this.tag;
				}

				public void setTag(String tag) {
					this.tag = tag;
				}
			}
		}
	}

	@Override
	public ListAKSContainerservicesResponse getInstance(UnmarshallerContext context) {
		return	ListAKSContainerservicesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
