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
import com.aliyuncs.sofa.transform.v20190815.ReinitAKSOpsContainerServiceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ReinitAKSOpsContainerServiceResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String appName;

		private String arrangementId;

		private String executorId;

		private String executorName;

		private Boolean grayTraffic;

		private Boolean isRollbackType;

		private String name;

		private String namespace;

		private String opsType;

		private String resultContext;

		private String revision;

		private String rollbackEntityId;

		private String rollbackEntityType;

		private String rollbackRevision;

		private String serviceGroupCollectionId;

		private String targetId;

		private List<EnvConfigItem> envConfig;

		private List<PostDeploymentArrangementsItem> postDeploymentArrangements;

		private List<PreDeploymentArrangementsItem> preDeploymentArrangements;

		private BaseEntityRelation baseEntityRelation;

		private DeploymentArrangement deploymentArrangement;

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public String getArrangementId() {
			return this.arrangementId;
		}

		public void setArrangementId(String arrangementId) {
			this.arrangementId = arrangementId;
		}

		public String getExecutorId() {
			return this.executorId;
		}

		public void setExecutorId(String executorId) {
			this.executorId = executorId;
		}

		public String getExecutorName() {
			return this.executorName;
		}

		public void setExecutorName(String executorName) {
			this.executorName = executorName;
		}

		public Boolean getGrayTraffic() {
			return this.grayTraffic;
		}

		public void setGrayTraffic(Boolean grayTraffic) {
			this.grayTraffic = grayTraffic;
		}

		public Boolean getIsRollbackType() {
			return this.isRollbackType;
		}

		public void setIsRollbackType(Boolean isRollbackType) {
			this.isRollbackType = isRollbackType;
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

		public String getOpsType() {
			return this.opsType;
		}

		public void setOpsType(String opsType) {
			this.opsType = opsType;
		}

		public String getResultContext() {
			return this.resultContext;
		}

		public void setResultContext(String resultContext) {
			this.resultContext = resultContext;
		}

		public String getRevision() {
			return this.revision;
		}

		public void setRevision(String revision) {
			this.revision = revision;
		}

		public String getRollbackEntityId() {
			return this.rollbackEntityId;
		}

		public void setRollbackEntityId(String rollbackEntityId) {
			this.rollbackEntityId = rollbackEntityId;
		}

		public String getRollbackEntityType() {
			return this.rollbackEntityType;
		}

		public void setRollbackEntityType(String rollbackEntityType) {
			this.rollbackEntityType = rollbackEntityType;
		}

		public String getRollbackRevision() {
			return this.rollbackRevision;
		}

		public void setRollbackRevision(String rollbackRevision) {
			this.rollbackRevision = rollbackRevision;
		}

		public String getServiceGroupCollectionId() {
			return this.serviceGroupCollectionId;
		}

		public void setServiceGroupCollectionId(String serviceGroupCollectionId) {
			this.serviceGroupCollectionId = serviceGroupCollectionId;
		}

		public String getTargetId() {
			return this.targetId;
		}

		public void setTargetId(String targetId) {
			this.targetId = targetId;
		}

		public List<EnvConfigItem> getEnvConfig() {
			return this.envConfig;
		}

		public void setEnvConfig(List<EnvConfigItem> envConfig) {
			this.envConfig = envConfig;
		}

		public List<PostDeploymentArrangementsItem> getPostDeploymentArrangements() {
			return this.postDeploymentArrangements;
		}

		public void setPostDeploymentArrangements(List<PostDeploymentArrangementsItem> postDeploymentArrangements) {
			this.postDeploymentArrangements = postDeploymentArrangements;
		}

		public List<PreDeploymentArrangementsItem> getPreDeploymentArrangements() {
			return this.preDeploymentArrangements;
		}

		public void setPreDeploymentArrangements(List<PreDeploymentArrangementsItem> preDeploymentArrangements) {
			this.preDeploymentArrangements = preDeploymentArrangements;
		}

		public BaseEntityRelation getBaseEntityRelation() {
			return this.baseEntityRelation;
		}

		public void setBaseEntityRelation(BaseEntityRelation baseEntityRelation) {
			this.baseEntityRelation = baseEntityRelation;
		}

		public DeploymentArrangement getDeploymentArrangement() {
			return this.deploymentArrangement;
		}

		public void setDeploymentArrangement(DeploymentArrangement deploymentArrangement) {
			this.deploymentArrangement = deploymentArrangement;
		}

		public static class EnvConfigItem {

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

		public static class PostDeploymentArrangementsItem {

			private List<TasksItem> tasks;

			private OpsGenericArrangement opsGenericArrangement;

			public List<TasksItem> getTasks() {
				return this.tasks;
			}

			public void setTasks(List<TasksItem> tasks) {
				this.tasks = tasks;
			}

			public OpsGenericArrangement getOpsGenericArrangement() {
				return this.opsGenericArrangement;
			}

			public void setOpsGenericArrangement(OpsGenericArrangement opsGenericArrangement) {
				this.opsGenericArrangement = opsGenericArrangement;
			}

			public static class TasksItem {

				private String actionHandlerCode;

				private String arrangementId;

				private String serviceGroupCollectionId;

				private String serviceGroupId;

				private String serviceId;

				private List<ContextItem> context;

				private EntityRelation entityRelation;

				public String getActionHandlerCode() {
					return this.actionHandlerCode;
				}

				public void setActionHandlerCode(String actionHandlerCode) {
					this.actionHandlerCode = actionHandlerCode;
				}

				public String getArrangementId() {
					return this.arrangementId;
				}

				public void setArrangementId(String arrangementId) {
					this.arrangementId = arrangementId;
				}

				public String getServiceGroupCollectionId() {
					return this.serviceGroupCollectionId;
				}

				public void setServiceGroupCollectionId(String serviceGroupCollectionId) {
					this.serviceGroupCollectionId = serviceGroupCollectionId;
				}

				public String getServiceGroupId() {
					return this.serviceGroupId;
				}

				public void setServiceGroupId(String serviceGroupId) {
					this.serviceGroupId = serviceGroupId;
				}

				public String getServiceId() {
					return this.serviceId;
				}

				public void setServiceId(String serviceId) {
					this.serviceId = serviceId;
				}

				public List<ContextItem> getContext() {
					return this.context;
				}

				public void setContext(List<ContextItem> context) {
					this.context = context;
				}

				public EntityRelation getEntityRelation() {
					return this.entityRelation;
				}

				public void setEntityRelation(EntityRelation entityRelation) {
					this.entityRelation = entityRelation;
				}

				public static class ContextItem {

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

				public static class EntityRelation {

					private String parentEntityType;

					private String parentId;

					private String processDefinitionId;

					private TransitableWithStateEntity transitableWithStateEntity;

					public String getParentEntityType() {
						return this.parentEntityType;
					}

					public void setParentEntityType(String parentEntityType) {
						this.parentEntityType = parentEntityType;
					}

					public String getParentId() {
						return this.parentId;
					}

					public void setParentId(String parentId) {
						this.parentId = parentId;
					}

					public String getProcessDefinitionId() {
						return this.processDefinitionId;
					}

					public void setProcessDefinitionId(String processDefinitionId) {
						this.processDefinitionId = processDefinitionId;
					}

					public TransitableWithStateEntity getTransitableWithStateEntity() {
						return this.transitableWithStateEntity;
					}

					public void setTransitableWithStateEntity(TransitableWithStateEntity transitableWithStateEntity) {
						this.transitableWithStateEntity = transitableWithStateEntity;
					}

					public static class TransitableWithStateEntity {

						private String state;

						private EnvExecutableEntityWithResult envExecutableEntityWithResult;

						public String getState() {
							return this.state;
						}

						public void setState(String state) {
							this.state = state;
						}

						public EnvExecutableEntityWithResult getEnvExecutableEntityWithResult() {
							return this.envExecutableEntityWithResult;
						}

						public void setEnvExecutableEntityWithResult(EnvExecutableEntityWithResult envExecutableEntityWithResult) {
							this.envExecutableEntityWithResult = envExecutableEntityWithResult;
						}

						public static class EnvExecutableEntityWithResult {

							private List<MessageDetailItem> messageDetail;

							private List<MessageParamsItem> messageParams;

							private EnvExecutableEntity envExecutableEntity;

							private ErrorCode errorCode;

							public List<MessageDetailItem> getMessageDetail() {
								return this.messageDetail;
							}

							public void setMessageDetail(List<MessageDetailItem> messageDetail) {
								this.messageDetail = messageDetail;
							}

							public List<MessageParamsItem> getMessageParams() {
								return this.messageParams;
							}

							public void setMessageParams(List<MessageParamsItem> messageParams) {
								this.messageParams = messageParams;
							}

							public EnvExecutableEntity getEnvExecutableEntity() {
								return this.envExecutableEntity;
							}

							public void setEnvExecutableEntity(EnvExecutableEntity envExecutableEntity) {
								this.envExecutableEntity = envExecutableEntity;
							}

							public ErrorCode getErrorCode() {
								return this.errorCode;
							}

							public void setErrorCode(ErrorCode errorCode) {
								this.errorCode = errorCode;
							}

							public static class MessageDetailItem {

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

							public static class MessageParamsItem {

								private String data;

								public String getData() {
									return this.data;
								}

								public void setData(String data) {
									this.data = data;
								}
							}

							public static class EnvExecutableEntity {

								private String finishedTime;

								private Boolean standaloneExecutable;

								private String startedTime;

								private EnvEntity envEntity;

								public String getFinishedTime() {
									return this.finishedTime;
								}

								public void setFinishedTime(String finishedTime) {
									this.finishedTime = finishedTime;
								}

								public Boolean getStandaloneExecutable() {
									return this.standaloneExecutable;
								}

								public void setStandaloneExecutable(Boolean standaloneExecutable) {
									this.standaloneExecutable = standaloneExecutable;
								}

								public String getStartedTime() {
									return this.startedTime;
								}

								public void setStartedTime(String startedTime) {
									this.startedTime = startedTime;
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

							public static class ErrorCode {

								private String exceptionCode;

								private String level;

								private String prefix;

								private String scene;

								private String type;

								private String version;

								public String getExceptionCode() {
									return this.exceptionCode;
								}

								public void setExceptionCode(String exceptionCode) {
									this.exceptionCode = exceptionCode;
								}

								public String getLevel() {
									return this.level;
								}

								public void setLevel(String level) {
									this.level = level;
								}

								public String getPrefix() {
									return this.prefix;
								}

								public void setPrefix(String prefix) {
									this.prefix = prefix;
								}

								public String getScene() {
									return this.scene;
								}

								public void setScene(String scene) {
									this.scene = scene;
								}

								public String getType() {
									return this.type;
								}

								public void setType(String type) {
									this.type = type;
								}

								public String getVersion() {
									return this.version;
								}

								public void setVersion(String version) {
									this.version = version;
								}
							}
						}
					}
				}
			}

			public static class OpsGenericArrangement {

				private String arrangementType;

				private String name;

				private String serviceGroupCollectionId;

				private List<ActionTypesItem> actionTypes;

				private List<OpsGenericEnvConfigItem> opsGenericEnvConfig;

				private OpsGenericEntityRelation opsGenericEntityRelation;

				public String getArrangementType() {
					return this.arrangementType;
				}

				public void setArrangementType(String arrangementType) {
					this.arrangementType = arrangementType;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getServiceGroupCollectionId() {
					return this.serviceGroupCollectionId;
				}

				public void setServiceGroupCollectionId(String serviceGroupCollectionId) {
					this.serviceGroupCollectionId = serviceGroupCollectionId;
				}

				public List<ActionTypesItem> getActionTypes() {
					return this.actionTypes;
				}

				public void setActionTypes(List<ActionTypesItem> actionTypes) {
					this.actionTypes = actionTypes;
				}

				public List<OpsGenericEnvConfigItem> getOpsGenericEnvConfig() {
					return this.opsGenericEnvConfig;
				}

				public void setOpsGenericEnvConfig(List<OpsGenericEnvConfigItem> opsGenericEnvConfig) {
					this.opsGenericEnvConfig = opsGenericEnvConfig;
				}

				public OpsGenericEntityRelation getOpsGenericEntityRelation() {
					return this.opsGenericEntityRelation;
				}

				public void setOpsGenericEntityRelation(OpsGenericEntityRelation opsGenericEntityRelation) {
					this.opsGenericEntityRelation = opsGenericEntityRelation;
				}

				public static class ActionTypesItem {

					private String data;

					public String getData() {
						return this.data;
					}

					public void setData(String data) {
						this.data = data;
					}
				}

				public static class OpsGenericEnvConfigItem {

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

				public static class OpsGenericEntityRelation {

					private String parentEntityType;

					private String parentId;

					private String processDefinitionId;

					private TransitableWithStateEntity1 transitableWithStateEntity1;

					public String getParentEntityType() {
						return this.parentEntityType;
					}

					public void setParentEntityType(String parentEntityType) {
						this.parentEntityType = parentEntityType;
					}

					public String getParentId() {
						return this.parentId;
					}

					public void setParentId(String parentId) {
						this.parentId = parentId;
					}

					public String getProcessDefinitionId() {
						return this.processDefinitionId;
					}

					public void setProcessDefinitionId(String processDefinitionId) {
						this.processDefinitionId = processDefinitionId;
					}

					public TransitableWithStateEntity1 getTransitableWithStateEntity1() {
						return this.transitableWithStateEntity1;
					}

					public void setTransitableWithStateEntity1(TransitableWithStateEntity1 transitableWithStateEntity1) {
						this.transitableWithStateEntity1 = transitableWithStateEntity1;
					}

					public static class TransitableWithStateEntity1 {

						private String state;

						private EnvExecutableEntityWithResult2 envExecutableEntityWithResult2;

						public String getState() {
							return this.state;
						}

						public void setState(String state) {
							this.state = state;
						}

						public EnvExecutableEntityWithResult2 getEnvExecutableEntityWithResult2() {
							return this.envExecutableEntityWithResult2;
						}

						public void setEnvExecutableEntityWithResult2(EnvExecutableEntityWithResult2 envExecutableEntityWithResult2) {
							this.envExecutableEntityWithResult2 = envExecutableEntityWithResult2;
						}

						public static class EnvExecutableEntityWithResult2 {

							private List<MessageDetailItem7> messageDetail5;

							private List<MessageParamsItem8> messageParams6;

							private EnvExecutableEntity3 envExecutableEntity3;

							private ErrorCode4 errorCode4;

							public List<MessageDetailItem7> getMessageDetail5() {
								return this.messageDetail5;
							}

							public void setMessageDetail5(List<MessageDetailItem7> messageDetail5) {
								this.messageDetail5 = messageDetail5;
							}

							public List<MessageParamsItem8> getMessageParams6() {
								return this.messageParams6;
							}

							public void setMessageParams6(List<MessageParamsItem8> messageParams6) {
								this.messageParams6 = messageParams6;
							}

							public EnvExecutableEntity3 getEnvExecutableEntity3() {
								return this.envExecutableEntity3;
							}

							public void setEnvExecutableEntity3(EnvExecutableEntity3 envExecutableEntity3) {
								this.envExecutableEntity3 = envExecutableEntity3;
							}

							public ErrorCode4 getErrorCode4() {
								return this.errorCode4;
							}

							public void setErrorCode4(ErrorCode4 errorCode4) {
								this.errorCode4 = errorCode4;
							}

							public static class MessageDetailItem7 {

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

							public static class MessageParamsItem8 {

								private String data;

								public String getData() {
									return this.data;
								}

								public void setData(String data) {
									this.data = data;
								}
							}

							public static class EnvExecutableEntity3 {

								private String finishedTime;

								private Boolean standaloneExecutable;

								private String startedTime;

								private EnvEntity9 envEntity9;

								public String getFinishedTime() {
									return this.finishedTime;
								}

								public void setFinishedTime(String finishedTime) {
									this.finishedTime = finishedTime;
								}

								public Boolean getStandaloneExecutable() {
									return this.standaloneExecutable;
								}

								public void setStandaloneExecutable(Boolean standaloneExecutable) {
									this.standaloneExecutable = standaloneExecutable;
								}

								public String getStartedTime() {
									return this.startedTime;
								}

								public void setStartedTime(String startedTime) {
									this.startedTime = startedTime;
								}

								public EnvEntity9 getEnvEntity9() {
									return this.envEntity9;
								}

								public void setEnvEntity9(EnvEntity9 envEntity9) {
									this.envEntity9 = envEntity9;
								}

								public static class EnvEntity9 {

									private String regionId;

									private String runEnv;

									private String tenantId;

									private String workspaceId;

									private Entity10 entity10;

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

									public Entity10 getEntity10() {
										return this.entity10;
									}

									public void setEntity10(Entity10 entity10) {
										this.entity10 = entity10;
									}

									public static class Entity10 {

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

							public static class ErrorCode4 {

								private String exceptionCode;

								private String level;

								private String prefix;

								private String scene;

								private String type;

								private String version;

								public String getExceptionCode() {
									return this.exceptionCode;
								}

								public void setExceptionCode(String exceptionCode) {
									this.exceptionCode = exceptionCode;
								}

								public String getLevel() {
									return this.level;
								}

								public void setLevel(String level) {
									this.level = level;
								}

								public String getPrefix() {
									return this.prefix;
								}

								public void setPrefix(String prefix) {
									this.prefix = prefix;
								}

								public String getScene() {
									return this.scene;
								}

								public void setScene(String scene) {
									this.scene = scene;
								}

								public String getType() {
									return this.type;
								}

								public void setType(String type) {
									this.type = type;
								}

								public String getVersion() {
									return this.version;
								}

								public void setVersion(String version) {
									this.version = version;
								}
							}
						}
					}
				}
			}
		}

		public static class PreDeploymentArrangementsItem {

			private List<TasksItem13> tasks12;

			private OpsGenericArrangement11 opsGenericArrangement11;

			public List<TasksItem13> getTasks12() {
				return this.tasks12;
			}

			public void setTasks12(List<TasksItem13> tasks12) {
				this.tasks12 = tasks12;
			}

			public OpsGenericArrangement11 getOpsGenericArrangement11() {
				return this.opsGenericArrangement11;
			}

			public void setOpsGenericArrangement11(OpsGenericArrangement11 opsGenericArrangement11) {
				this.opsGenericArrangement11 = opsGenericArrangement11;
			}

			public static class TasksItem13 {

				private String actionHandlerCode;

				private String arrangementId;

				private String serviceGroupCollectionId;

				private String serviceGroupId;

				private String serviceId;

				private List<ContextItem16> context15;

				private EntityRelation14 entityRelation14;

				public String getActionHandlerCode() {
					return this.actionHandlerCode;
				}

				public void setActionHandlerCode(String actionHandlerCode) {
					this.actionHandlerCode = actionHandlerCode;
				}

				public String getArrangementId() {
					return this.arrangementId;
				}

				public void setArrangementId(String arrangementId) {
					this.arrangementId = arrangementId;
				}

				public String getServiceGroupCollectionId() {
					return this.serviceGroupCollectionId;
				}

				public void setServiceGroupCollectionId(String serviceGroupCollectionId) {
					this.serviceGroupCollectionId = serviceGroupCollectionId;
				}

				public String getServiceGroupId() {
					return this.serviceGroupId;
				}

				public void setServiceGroupId(String serviceGroupId) {
					this.serviceGroupId = serviceGroupId;
				}

				public String getServiceId() {
					return this.serviceId;
				}

				public void setServiceId(String serviceId) {
					this.serviceId = serviceId;
				}

				public List<ContextItem16> getContext15() {
					return this.context15;
				}

				public void setContext15(List<ContextItem16> context15) {
					this.context15 = context15;
				}

				public EntityRelation14 getEntityRelation14() {
					return this.entityRelation14;
				}

				public void setEntityRelation14(EntityRelation14 entityRelation14) {
					this.entityRelation14 = entityRelation14;
				}

				public static class ContextItem16 {

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

				public static class EntityRelation14 {

					private String parentEntityType;

					private String parentId;

					private String processDefinitionId;

					private TransitableWithStateEntity17 transitableWithStateEntity17;

					public String getParentEntityType() {
						return this.parentEntityType;
					}

					public void setParentEntityType(String parentEntityType) {
						this.parentEntityType = parentEntityType;
					}

					public String getParentId() {
						return this.parentId;
					}

					public void setParentId(String parentId) {
						this.parentId = parentId;
					}

					public String getProcessDefinitionId() {
						return this.processDefinitionId;
					}

					public void setProcessDefinitionId(String processDefinitionId) {
						this.processDefinitionId = processDefinitionId;
					}

					public TransitableWithStateEntity17 getTransitableWithStateEntity17() {
						return this.transitableWithStateEntity17;
					}

					public void setTransitableWithStateEntity17(TransitableWithStateEntity17 transitableWithStateEntity17) {
						this.transitableWithStateEntity17 = transitableWithStateEntity17;
					}

					public static class TransitableWithStateEntity17 {

						private String state;

						private EnvExecutableEntityWithResult18 envExecutableEntityWithResult18;

						public String getState() {
							return this.state;
						}

						public void setState(String state) {
							this.state = state;
						}

						public EnvExecutableEntityWithResult18 getEnvExecutableEntityWithResult18() {
							return this.envExecutableEntityWithResult18;
						}

						public void setEnvExecutableEntityWithResult18(EnvExecutableEntityWithResult18 envExecutableEntityWithResult18) {
							this.envExecutableEntityWithResult18 = envExecutableEntityWithResult18;
						}

						public static class EnvExecutableEntityWithResult18 {

							private List<MessageDetailItem23> messageDetail21;

							private List<MessageParamsItem24> messageParams22;

							private EnvExecutableEntity19 envExecutableEntity19;

							private ErrorCode20 errorCode20;

							public List<MessageDetailItem23> getMessageDetail21() {
								return this.messageDetail21;
							}

							public void setMessageDetail21(List<MessageDetailItem23> messageDetail21) {
								this.messageDetail21 = messageDetail21;
							}

							public List<MessageParamsItem24> getMessageParams22() {
								return this.messageParams22;
							}

							public void setMessageParams22(List<MessageParamsItem24> messageParams22) {
								this.messageParams22 = messageParams22;
							}

							public EnvExecutableEntity19 getEnvExecutableEntity19() {
								return this.envExecutableEntity19;
							}

							public void setEnvExecutableEntity19(EnvExecutableEntity19 envExecutableEntity19) {
								this.envExecutableEntity19 = envExecutableEntity19;
							}

							public ErrorCode20 getErrorCode20() {
								return this.errorCode20;
							}

							public void setErrorCode20(ErrorCode20 errorCode20) {
								this.errorCode20 = errorCode20;
							}

							public static class MessageDetailItem23 {

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

							public static class MessageParamsItem24 {

								private String data;

								public String getData() {
									return this.data;
								}

								public void setData(String data) {
									this.data = data;
								}
							}

							public static class EnvExecutableEntity19 {

								private String finishedTime;

								private Boolean standaloneExecutable;

								private String startedTime;

								private EnvEntity25 envEntity25;

								public String getFinishedTime() {
									return this.finishedTime;
								}

								public void setFinishedTime(String finishedTime) {
									this.finishedTime = finishedTime;
								}

								public Boolean getStandaloneExecutable() {
									return this.standaloneExecutable;
								}

								public void setStandaloneExecutable(Boolean standaloneExecutable) {
									this.standaloneExecutable = standaloneExecutable;
								}

								public String getStartedTime() {
									return this.startedTime;
								}

								public void setStartedTime(String startedTime) {
									this.startedTime = startedTime;
								}

								public EnvEntity25 getEnvEntity25() {
									return this.envEntity25;
								}

								public void setEnvEntity25(EnvEntity25 envEntity25) {
									this.envEntity25 = envEntity25;
								}

								public static class EnvEntity25 {

									private String regionId;

									private String runEnv;

									private String tenantId;

									private String workspaceId;

									private Entity26 entity26;

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

									public Entity26 getEntity26() {
										return this.entity26;
									}

									public void setEntity26(Entity26 entity26) {
										this.entity26 = entity26;
									}

									public static class Entity26 {

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

							public static class ErrorCode20 {

								private String exceptionCode;

								private String level;

								private String prefix;

								private String scene;

								private String type;

								private String version;

								public String getExceptionCode() {
									return this.exceptionCode;
								}

								public void setExceptionCode(String exceptionCode) {
									this.exceptionCode = exceptionCode;
								}

								public String getLevel() {
									return this.level;
								}

								public void setLevel(String level) {
									this.level = level;
								}

								public String getPrefix() {
									return this.prefix;
								}

								public void setPrefix(String prefix) {
									this.prefix = prefix;
								}

								public String getScene() {
									return this.scene;
								}

								public void setScene(String scene) {
									this.scene = scene;
								}

								public String getType() {
									return this.type;
								}

								public void setType(String type) {
									this.type = type;
								}

								public String getVersion() {
									return this.version;
								}

								public void setVersion(String version) {
									this.version = version;
								}
							}
						}
					}
				}
			}

			public static class OpsGenericArrangement11 {

				private String arrangementType;

				private String name;

				private String serviceGroupCollectionId;

				private List<ActionTypesItem30> actionTypes28;

				private List<OpsGenericEnvConfigItem31> opsGenericEnvConfig29;

				private OpsGenericEntityRelation27 opsGenericEntityRelation27;

				public String getArrangementType() {
					return this.arrangementType;
				}

				public void setArrangementType(String arrangementType) {
					this.arrangementType = arrangementType;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getServiceGroupCollectionId() {
					return this.serviceGroupCollectionId;
				}

				public void setServiceGroupCollectionId(String serviceGroupCollectionId) {
					this.serviceGroupCollectionId = serviceGroupCollectionId;
				}

				public List<ActionTypesItem30> getActionTypes28() {
					return this.actionTypes28;
				}

				public void setActionTypes28(List<ActionTypesItem30> actionTypes28) {
					this.actionTypes28 = actionTypes28;
				}

				public List<OpsGenericEnvConfigItem31> getOpsGenericEnvConfig29() {
					return this.opsGenericEnvConfig29;
				}

				public void setOpsGenericEnvConfig29(List<OpsGenericEnvConfigItem31> opsGenericEnvConfig29) {
					this.opsGenericEnvConfig29 = opsGenericEnvConfig29;
				}

				public OpsGenericEntityRelation27 getOpsGenericEntityRelation27() {
					return this.opsGenericEntityRelation27;
				}

				public void setOpsGenericEntityRelation27(OpsGenericEntityRelation27 opsGenericEntityRelation27) {
					this.opsGenericEntityRelation27 = opsGenericEntityRelation27;
				}

				public static class ActionTypesItem30 {

					private String data;

					public String getData() {
						return this.data;
					}

					public void setData(String data) {
						this.data = data;
					}
				}

				public static class OpsGenericEnvConfigItem31 {

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

				public static class OpsGenericEntityRelation27 {

					private String parentEntityType;

					private String parentId;

					private String processDefinitionId;

					private TransitableWithStateEntity32 transitableWithStateEntity32;

					public String getParentEntityType() {
						return this.parentEntityType;
					}

					public void setParentEntityType(String parentEntityType) {
						this.parentEntityType = parentEntityType;
					}

					public String getParentId() {
						return this.parentId;
					}

					public void setParentId(String parentId) {
						this.parentId = parentId;
					}

					public String getProcessDefinitionId() {
						return this.processDefinitionId;
					}

					public void setProcessDefinitionId(String processDefinitionId) {
						this.processDefinitionId = processDefinitionId;
					}

					public TransitableWithStateEntity32 getTransitableWithStateEntity32() {
						return this.transitableWithStateEntity32;
					}

					public void setTransitableWithStateEntity32(TransitableWithStateEntity32 transitableWithStateEntity32) {
						this.transitableWithStateEntity32 = transitableWithStateEntity32;
					}

					public static class TransitableWithStateEntity32 {

						private String state;

						private EnvExecutableEntityWithResult33 envExecutableEntityWithResult33;

						public String getState() {
							return this.state;
						}

						public void setState(String state) {
							this.state = state;
						}

						public EnvExecutableEntityWithResult33 getEnvExecutableEntityWithResult33() {
							return this.envExecutableEntityWithResult33;
						}

						public void setEnvExecutableEntityWithResult33(EnvExecutableEntityWithResult33 envExecutableEntityWithResult33) {
							this.envExecutableEntityWithResult33 = envExecutableEntityWithResult33;
						}

						public static class EnvExecutableEntityWithResult33 {

							private List<MessageDetailItem38> messageDetail36;

							private List<MessageParamsItem39> messageParams37;

							private EnvExecutableEntity34 envExecutableEntity34;

							private ErrorCode35 errorCode35;

							public List<MessageDetailItem38> getMessageDetail36() {
								return this.messageDetail36;
							}

							public void setMessageDetail36(List<MessageDetailItem38> messageDetail36) {
								this.messageDetail36 = messageDetail36;
							}

							public List<MessageParamsItem39> getMessageParams37() {
								return this.messageParams37;
							}

							public void setMessageParams37(List<MessageParamsItem39> messageParams37) {
								this.messageParams37 = messageParams37;
							}

							public EnvExecutableEntity34 getEnvExecutableEntity34() {
								return this.envExecutableEntity34;
							}

							public void setEnvExecutableEntity34(EnvExecutableEntity34 envExecutableEntity34) {
								this.envExecutableEntity34 = envExecutableEntity34;
							}

							public ErrorCode35 getErrorCode35() {
								return this.errorCode35;
							}

							public void setErrorCode35(ErrorCode35 errorCode35) {
								this.errorCode35 = errorCode35;
							}

							public static class MessageDetailItem38 {

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

							public static class MessageParamsItem39 {

								private String data;

								public String getData() {
									return this.data;
								}

								public void setData(String data) {
									this.data = data;
								}
							}

							public static class EnvExecutableEntity34 {

								private String finishedTime;

								private Boolean standaloneExecutable;

								private String startedTime;

								private EnvEntity40 envEntity40;

								public String getFinishedTime() {
									return this.finishedTime;
								}

								public void setFinishedTime(String finishedTime) {
									this.finishedTime = finishedTime;
								}

								public Boolean getStandaloneExecutable() {
									return this.standaloneExecutable;
								}

								public void setStandaloneExecutable(Boolean standaloneExecutable) {
									this.standaloneExecutable = standaloneExecutable;
								}

								public String getStartedTime() {
									return this.startedTime;
								}

								public void setStartedTime(String startedTime) {
									this.startedTime = startedTime;
								}

								public EnvEntity40 getEnvEntity40() {
									return this.envEntity40;
								}

								public void setEnvEntity40(EnvEntity40 envEntity40) {
									this.envEntity40 = envEntity40;
								}

								public static class EnvEntity40 {

									private String regionId;

									private String runEnv;

									private String tenantId;

									private String workspaceId;

									private Entity41 entity41;

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

									public Entity41 getEntity41() {
										return this.entity41;
									}

									public void setEntity41(Entity41 entity41) {
										this.entity41 = entity41;
									}

									public static class Entity41 {

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

							public static class ErrorCode35 {

								private String exceptionCode;

								private String level;

								private String prefix;

								private String scene;

								private String type;

								private String version;

								public String getExceptionCode() {
									return this.exceptionCode;
								}

								public void setExceptionCode(String exceptionCode) {
									this.exceptionCode = exceptionCode;
								}

								public String getLevel() {
									return this.level;
								}

								public void setLevel(String level) {
									this.level = level;
								}

								public String getPrefix() {
									return this.prefix;
								}

								public void setPrefix(String prefix) {
									this.prefix = prefix;
								}

								public String getScene() {
									return this.scene;
								}

								public void setScene(String scene) {
									this.scene = scene;
								}

								public String getType() {
									return this.type;
								}

								public void setType(String type) {
									this.type = type;
								}

								public String getVersion() {
									return this.version;
								}

								public void setVersion(String version) {
									this.version = version;
								}
							}
						}
					}
				}
			}
		}

		public static class BaseEntityRelation {

			private String parentEntityType;

			private String parentId;

			private String processDefinitionId;

			private TransitableWithStateEntity42 transitableWithStateEntity42;

			public String getParentEntityType() {
				return this.parentEntityType;
			}

			public void setParentEntityType(String parentEntityType) {
				this.parentEntityType = parentEntityType;
			}

			public String getParentId() {
				return this.parentId;
			}

			public void setParentId(String parentId) {
				this.parentId = parentId;
			}

			public String getProcessDefinitionId() {
				return this.processDefinitionId;
			}

			public void setProcessDefinitionId(String processDefinitionId) {
				this.processDefinitionId = processDefinitionId;
			}

			public TransitableWithStateEntity42 getTransitableWithStateEntity42() {
				return this.transitableWithStateEntity42;
			}

			public void setTransitableWithStateEntity42(TransitableWithStateEntity42 transitableWithStateEntity42) {
				this.transitableWithStateEntity42 = transitableWithStateEntity42;
			}

			public static class TransitableWithStateEntity42 {

				private String state;

				private EnvExecutableEntityWithResult43 envExecutableEntityWithResult43;

				public String getState() {
					return this.state;
				}

				public void setState(String state) {
					this.state = state;
				}

				public EnvExecutableEntityWithResult43 getEnvExecutableEntityWithResult43() {
					return this.envExecutableEntityWithResult43;
				}

				public void setEnvExecutableEntityWithResult43(EnvExecutableEntityWithResult43 envExecutableEntityWithResult43) {
					this.envExecutableEntityWithResult43 = envExecutableEntityWithResult43;
				}

				public static class EnvExecutableEntityWithResult43 {

					private List<MessageDetailItem48> messageDetail46;

					private List<MessageParamsItem49> messageParams47;

					private EnvExecutableEntity44 envExecutableEntity44;

					private ErrorCode45 errorCode45;

					public List<MessageDetailItem48> getMessageDetail46() {
						return this.messageDetail46;
					}

					public void setMessageDetail46(List<MessageDetailItem48> messageDetail46) {
						this.messageDetail46 = messageDetail46;
					}

					public List<MessageParamsItem49> getMessageParams47() {
						return this.messageParams47;
					}

					public void setMessageParams47(List<MessageParamsItem49> messageParams47) {
						this.messageParams47 = messageParams47;
					}

					public EnvExecutableEntity44 getEnvExecutableEntity44() {
						return this.envExecutableEntity44;
					}

					public void setEnvExecutableEntity44(EnvExecutableEntity44 envExecutableEntity44) {
						this.envExecutableEntity44 = envExecutableEntity44;
					}

					public ErrorCode45 getErrorCode45() {
						return this.errorCode45;
					}

					public void setErrorCode45(ErrorCode45 errorCode45) {
						this.errorCode45 = errorCode45;
					}

					public static class MessageDetailItem48 {

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

					public static class MessageParamsItem49 {

						private String data;

						public String getData() {
							return this.data;
						}

						public void setData(String data) {
							this.data = data;
						}
					}

					public static class EnvExecutableEntity44 {

						private String finishedTime;

						private Boolean standaloneExecutable;

						private String startedTime;

						private EnvEntity50 envEntity50;

						public String getFinishedTime() {
							return this.finishedTime;
						}

						public void setFinishedTime(String finishedTime) {
							this.finishedTime = finishedTime;
						}

						public Boolean getStandaloneExecutable() {
							return this.standaloneExecutable;
						}

						public void setStandaloneExecutable(Boolean standaloneExecutable) {
							this.standaloneExecutable = standaloneExecutable;
						}

						public String getStartedTime() {
							return this.startedTime;
						}

						public void setStartedTime(String startedTime) {
							this.startedTime = startedTime;
						}

						public EnvEntity50 getEnvEntity50() {
							return this.envEntity50;
						}

						public void setEnvEntity50(EnvEntity50 envEntity50) {
							this.envEntity50 = envEntity50;
						}

						public static class EnvEntity50 {

							private String regionId;

							private String runEnv;

							private String tenantId;

							private String workspaceId;

							private Entity51 entity51;

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

							public Entity51 getEntity51() {
								return this.entity51;
							}

							public void setEntity51(Entity51 entity51) {
								this.entity51 = entity51;
							}

							public static class Entity51 {

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

					public static class ErrorCode45 {

						private String exceptionCode;

						private String level;

						private String prefix;

						private String scene;

						private String type;

						private String version;

						public String getExceptionCode() {
							return this.exceptionCode;
						}

						public void setExceptionCode(String exceptionCode) {
							this.exceptionCode = exceptionCode;
						}

						public String getLevel() {
							return this.level;
						}

						public void setLevel(String level) {
							this.level = level;
						}

						public String getPrefix() {
							return this.prefix;
						}

						public void setPrefix(String prefix) {
							this.prefix = prefix;
						}

						public String getScene() {
							return this.scene;
						}

						public void setScene(String scene) {
							this.scene = scene;
						}

						public String getType() {
							return this.type;
						}

						public void setType(String type) {
							this.type = type;
						}

						public String getVersion() {
							return this.version;
						}

						public void setVersion(String version) {
							this.version = version;
						}
					}
				}
			}
		}

		public static class DeploymentArrangement {

			private List<TasksItem54> tasks53;

			private OpsGenericArrangement52 opsGenericArrangement52;

			public List<TasksItem54> getTasks53() {
				return this.tasks53;
			}

			public void setTasks53(List<TasksItem54> tasks53) {
				this.tasks53 = tasks53;
			}

			public OpsGenericArrangement52 getOpsGenericArrangement52() {
				return this.opsGenericArrangement52;
			}

			public void setOpsGenericArrangement52(OpsGenericArrangement52 opsGenericArrangement52) {
				this.opsGenericArrangement52 = opsGenericArrangement52;
			}

			public static class TasksItem54 {

				private String actionHandlerCode;

				private String arrangementId;

				private String serviceGroupCollectionId;

				private String serviceGroupId;

				private String serviceId;

				private List<ContextItem57> context56;

				private EntityRelation55 entityRelation55;

				public String getActionHandlerCode() {
					return this.actionHandlerCode;
				}

				public void setActionHandlerCode(String actionHandlerCode) {
					this.actionHandlerCode = actionHandlerCode;
				}

				public String getArrangementId() {
					return this.arrangementId;
				}

				public void setArrangementId(String arrangementId) {
					this.arrangementId = arrangementId;
				}

				public String getServiceGroupCollectionId() {
					return this.serviceGroupCollectionId;
				}

				public void setServiceGroupCollectionId(String serviceGroupCollectionId) {
					this.serviceGroupCollectionId = serviceGroupCollectionId;
				}

				public String getServiceGroupId() {
					return this.serviceGroupId;
				}

				public void setServiceGroupId(String serviceGroupId) {
					this.serviceGroupId = serviceGroupId;
				}

				public String getServiceId() {
					return this.serviceId;
				}

				public void setServiceId(String serviceId) {
					this.serviceId = serviceId;
				}

				public List<ContextItem57> getContext56() {
					return this.context56;
				}

				public void setContext56(List<ContextItem57> context56) {
					this.context56 = context56;
				}

				public EntityRelation55 getEntityRelation55() {
					return this.entityRelation55;
				}

				public void setEntityRelation55(EntityRelation55 entityRelation55) {
					this.entityRelation55 = entityRelation55;
				}

				public static class ContextItem57 {

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

				public static class EntityRelation55 {

					private String parentEntityType;

					private String parentId;

					private String processDefinitionId;

					private TransitableWithStateEntity58 transitableWithStateEntity58;

					public String getParentEntityType() {
						return this.parentEntityType;
					}

					public void setParentEntityType(String parentEntityType) {
						this.parentEntityType = parentEntityType;
					}

					public String getParentId() {
						return this.parentId;
					}

					public void setParentId(String parentId) {
						this.parentId = parentId;
					}

					public String getProcessDefinitionId() {
						return this.processDefinitionId;
					}

					public void setProcessDefinitionId(String processDefinitionId) {
						this.processDefinitionId = processDefinitionId;
					}

					public TransitableWithStateEntity58 getTransitableWithStateEntity58() {
						return this.transitableWithStateEntity58;
					}

					public void setTransitableWithStateEntity58(TransitableWithStateEntity58 transitableWithStateEntity58) {
						this.transitableWithStateEntity58 = transitableWithStateEntity58;
					}

					public static class TransitableWithStateEntity58 {

						private String state;

						private EnvExecutableEntityWithResult59 envExecutableEntityWithResult59;

						public String getState() {
							return this.state;
						}

						public void setState(String state) {
							this.state = state;
						}

						public EnvExecutableEntityWithResult59 getEnvExecutableEntityWithResult59() {
							return this.envExecutableEntityWithResult59;
						}

						public void setEnvExecutableEntityWithResult59(EnvExecutableEntityWithResult59 envExecutableEntityWithResult59) {
							this.envExecutableEntityWithResult59 = envExecutableEntityWithResult59;
						}

						public static class EnvExecutableEntityWithResult59 {

							private List<MessageDetailItem64> messageDetail62;

							private List<MessageParamsItem65> messageParams63;

							private EnvExecutableEntity60 envExecutableEntity60;

							private ErrorCode61 errorCode61;

							public List<MessageDetailItem64> getMessageDetail62() {
								return this.messageDetail62;
							}

							public void setMessageDetail62(List<MessageDetailItem64> messageDetail62) {
								this.messageDetail62 = messageDetail62;
							}

							public List<MessageParamsItem65> getMessageParams63() {
								return this.messageParams63;
							}

							public void setMessageParams63(List<MessageParamsItem65> messageParams63) {
								this.messageParams63 = messageParams63;
							}

							public EnvExecutableEntity60 getEnvExecutableEntity60() {
								return this.envExecutableEntity60;
							}

							public void setEnvExecutableEntity60(EnvExecutableEntity60 envExecutableEntity60) {
								this.envExecutableEntity60 = envExecutableEntity60;
							}

							public ErrorCode61 getErrorCode61() {
								return this.errorCode61;
							}

							public void setErrorCode61(ErrorCode61 errorCode61) {
								this.errorCode61 = errorCode61;
							}

							public static class MessageDetailItem64 {

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

							public static class MessageParamsItem65 {

								private String data;

								public String getData() {
									return this.data;
								}

								public void setData(String data) {
									this.data = data;
								}
							}

							public static class EnvExecutableEntity60 {

								private String finishedTime;

								private Boolean standaloneExecutable;

								private String startedTime;

								private EnvEntity66 envEntity66;

								public String getFinishedTime() {
									return this.finishedTime;
								}

								public void setFinishedTime(String finishedTime) {
									this.finishedTime = finishedTime;
								}

								public Boolean getStandaloneExecutable() {
									return this.standaloneExecutable;
								}

								public void setStandaloneExecutable(Boolean standaloneExecutable) {
									this.standaloneExecutable = standaloneExecutable;
								}

								public String getStartedTime() {
									return this.startedTime;
								}

								public void setStartedTime(String startedTime) {
									this.startedTime = startedTime;
								}

								public EnvEntity66 getEnvEntity66() {
									return this.envEntity66;
								}

								public void setEnvEntity66(EnvEntity66 envEntity66) {
									this.envEntity66 = envEntity66;
								}

								public static class EnvEntity66 {

									private String regionId;

									private String runEnv;

									private String tenantId;

									private String workspaceId;

									private Entity67 entity67;

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

									public Entity67 getEntity67() {
										return this.entity67;
									}

									public void setEntity67(Entity67 entity67) {
										this.entity67 = entity67;
									}

									public static class Entity67 {

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

							public static class ErrorCode61 {

								private String exceptionCode;

								private String level;

								private String prefix;

								private String scene;

								private String type;

								private String version;

								public String getExceptionCode() {
									return this.exceptionCode;
								}

								public void setExceptionCode(String exceptionCode) {
									this.exceptionCode = exceptionCode;
								}

								public String getLevel() {
									return this.level;
								}

								public void setLevel(String level) {
									this.level = level;
								}

								public String getPrefix() {
									return this.prefix;
								}

								public void setPrefix(String prefix) {
									this.prefix = prefix;
								}

								public String getScene() {
									return this.scene;
								}

								public void setScene(String scene) {
									this.scene = scene;
								}

								public String getType() {
									return this.type;
								}

								public void setType(String type) {
									this.type = type;
								}

								public String getVersion() {
									return this.version;
								}

								public void setVersion(String version) {
									this.version = version;
								}
							}
						}
					}
				}
			}

			public static class OpsGenericArrangement52 {

				private String arrangementType;

				private String name;

				private String serviceGroupCollectionId;

				private List<ActionTypesItem71> actionTypes69;

				private List<OpsGenericEnvConfigItem72> opsGenericEnvConfig70;

				private OpsGenericEntityRelation68 opsGenericEntityRelation68;

				public String getArrangementType() {
					return this.arrangementType;
				}

				public void setArrangementType(String arrangementType) {
					this.arrangementType = arrangementType;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getServiceGroupCollectionId() {
					return this.serviceGroupCollectionId;
				}

				public void setServiceGroupCollectionId(String serviceGroupCollectionId) {
					this.serviceGroupCollectionId = serviceGroupCollectionId;
				}

				public List<ActionTypesItem71> getActionTypes69() {
					return this.actionTypes69;
				}

				public void setActionTypes69(List<ActionTypesItem71> actionTypes69) {
					this.actionTypes69 = actionTypes69;
				}

				public List<OpsGenericEnvConfigItem72> getOpsGenericEnvConfig70() {
					return this.opsGenericEnvConfig70;
				}

				public void setOpsGenericEnvConfig70(List<OpsGenericEnvConfigItem72> opsGenericEnvConfig70) {
					this.opsGenericEnvConfig70 = opsGenericEnvConfig70;
				}

				public OpsGenericEntityRelation68 getOpsGenericEntityRelation68() {
					return this.opsGenericEntityRelation68;
				}

				public void setOpsGenericEntityRelation68(OpsGenericEntityRelation68 opsGenericEntityRelation68) {
					this.opsGenericEntityRelation68 = opsGenericEntityRelation68;
				}

				public static class ActionTypesItem71 {

					private String data;

					public String getData() {
						return this.data;
					}

					public void setData(String data) {
						this.data = data;
					}
				}

				public static class OpsGenericEnvConfigItem72 {

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

				public static class OpsGenericEntityRelation68 {

					private String parentEntityType;

					private String parentId;

					private String processDefinitionId;

					private TransitableWithStateEntity73 transitableWithStateEntity73;

					public String getParentEntityType() {
						return this.parentEntityType;
					}

					public void setParentEntityType(String parentEntityType) {
						this.parentEntityType = parentEntityType;
					}

					public String getParentId() {
						return this.parentId;
					}

					public void setParentId(String parentId) {
						this.parentId = parentId;
					}

					public String getProcessDefinitionId() {
						return this.processDefinitionId;
					}

					public void setProcessDefinitionId(String processDefinitionId) {
						this.processDefinitionId = processDefinitionId;
					}

					public TransitableWithStateEntity73 getTransitableWithStateEntity73() {
						return this.transitableWithStateEntity73;
					}

					public void setTransitableWithStateEntity73(TransitableWithStateEntity73 transitableWithStateEntity73) {
						this.transitableWithStateEntity73 = transitableWithStateEntity73;
					}

					public static class TransitableWithStateEntity73 {

						private String state;

						private EnvExecutableEntityWithResult74 envExecutableEntityWithResult74;

						public String getState() {
							return this.state;
						}

						public void setState(String state) {
							this.state = state;
						}

						public EnvExecutableEntityWithResult74 getEnvExecutableEntityWithResult74() {
							return this.envExecutableEntityWithResult74;
						}

						public void setEnvExecutableEntityWithResult74(EnvExecutableEntityWithResult74 envExecutableEntityWithResult74) {
							this.envExecutableEntityWithResult74 = envExecutableEntityWithResult74;
						}

						public static class EnvExecutableEntityWithResult74 {

							private List<MessageDetailItem79> messageDetail77;

							private List<MessageParamsItem80> messageParams78;

							private EnvExecutableEntity75 envExecutableEntity75;

							private ErrorCode76 errorCode76;

							public List<MessageDetailItem79> getMessageDetail77() {
								return this.messageDetail77;
							}

							public void setMessageDetail77(List<MessageDetailItem79> messageDetail77) {
								this.messageDetail77 = messageDetail77;
							}

							public List<MessageParamsItem80> getMessageParams78() {
								return this.messageParams78;
							}

							public void setMessageParams78(List<MessageParamsItem80> messageParams78) {
								this.messageParams78 = messageParams78;
							}

							public EnvExecutableEntity75 getEnvExecutableEntity75() {
								return this.envExecutableEntity75;
							}

							public void setEnvExecutableEntity75(EnvExecutableEntity75 envExecutableEntity75) {
								this.envExecutableEntity75 = envExecutableEntity75;
							}

							public ErrorCode76 getErrorCode76() {
								return this.errorCode76;
							}

							public void setErrorCode76(ErrorCode76 errorCode76) {
								this.errorCode76 = errorCode76;
							}

							public static class MessageDetailItem79 {

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

							public static class MessageParamsItem80 {

								private String data;

								public String getData() {
									return this.data;
								}

								public void setData(String data) {
									this.data = data;
								}
							}

							public static class EnvExecutableEntity75 {

								private String finishedTime;

								private Boolean standaloneExecutable;

								private String startedTime;

								private EnvEntity81 envEntity81;

								public String getFinishedTime() {
									return this.finishedTime;
								}

								public void setFinishedTime(String finishedTime) {
									this.finishedTime = finishedTime;
								}

								public Boolean getStandaloneExecutable() {
									return this.standaloneExecutable;
								}

								public void setStandaloneExecutable(Boolean standaloneExecutable) {
									this.standaloneExecutable = standaloneExecutable;
								}

								public String getStartedTime() {
									return this.startedTime;
								}

								public void setStartedTime(String startedTime) {
									this.startedTime = startedTime;
								}

								public EnvEntity81 getEnvEntity81() {
									return this.envEntity81;
								}

								public void setEnvEntity81(EnvEntity81 envEntity81) {
									this.envEntity81 = envEntity81;
								}

								public static class EnvEntity81 {

									private String regionId;

									private String runEnv;

									private String tenantId;

									private String workspaceId;

									private Entity82 entity82;

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

									public Entity82 getEntity82() {
										return this.entity82;
									}

									public void setEntity82(Entity82 entity82) {
										this.entity82 = entity82;
									}

									public static class Entity82 {

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

							public static class ErrorCode76 {

								private String exceptionCode;

								private String level;

								private String prefix;

								private String scene;

								private String type;

								private String version;

								public String getExceptionCode() {
									return this.exceptionCode;
								}

								public void setExceptionCode(String exceptionCode) {
									this.exceptionCode = exceptionCode;
								}

								public String getLevel() {
									return this.level;
								}

								public void setLevel(String level) {
									this.level = level;
								}

								public String getPrefix() {
									return this.prefix;
								}

								public void setPrefix(String prefix) {
									this.prefix = prefix;
								}

								public String getScene() {
									return this.scene;
								}

								public void setScene(String scene) {
									this.scene = scene;
								}

								public String getType() {
									return this.type;
								}

								public void setType(String type) {
									this.type = type;
								}

								public String getVersion() {
									return this.version;
								}

								public void setVersion(String version) {
									this.version = version;
								}
							}
						}
					}
				}
			}
		}
	}

	@Override
	public ReinitAKSOpsContainerServiceResponse getInstance(UnmarshallerContext context) {
		return	ReinitAKSOpsContainerServiceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
