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

package com.aliyuncs.edas.model.v20170801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.edas.transform.v20170801.GetChangeOrderInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetChangeOrderInfoResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private ChangeOrderInfo changeOrderInfo;

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

	public ChangeOrderInfo getChangeOrderInfo() {
		return this.changeOrderInfo;
	}

	public void setChangeOrderInfo(ChangeOrderInfo changeOrderInfo) {
		this.changeOrderInfo = changeOrderInfo;
	}

	public static class ChangeOrderInfo {

		private Integer status;

		private String changeOrderId;

		private String batchType;

		private String coType;

		private String createTime;

		private String changeOrderDescription;

		private Integer batchCount;

		private String createUserId;

		private Boolean supportRollback;

		private String desc;

		private List<PipelineInfo> pipelineInfoList;

		private List<String> targets;

		private TrafficControl trafficControl;

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getChangeOrderId() {
			return this.changeOrderId;
		}

		public void setChangeOrderId(String changeOrderId) {
			this.changeOrderId = changeOrderId;
		}

		public String getBatchType() {
			return this.batchType;
		}

		public void setBatchType(String batchType) {
			this.batchType = batchType;
		}

		public String getCoType() {
			return this.coType;
		}

		public void setCoType(String coType) {
			this.coType = coType;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getChangeOrderDescription() {
			return this.changeOrderDescription;
		}

		public void setChangeOrderDescription(String changeOrderDescription) {
			this.changeOrderDescription = changeOrderDescription;
		}

		public Integer getBatchCount() {
			return this.batchCount;
		}

		public void setBatchCount(Integer batchCount) {
			this.batchCount = batchCount;
		}

		public String getCreateUserId() {
			return this.createUserId;
		}

		public void setCreateUserId(String createUserId) {
			this.createUserId = createUserId;
		}

		public Boolean getSupportRollback() {
			return this.supportRollback;
		}

		public void setSupportRollback(Boolean supportRollback) {
			this.supportRollback = supportRollback;
		}

		public String getDesc() {
			return this.desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}

		public List<PipelineInfo> getPipelineInfoList() {
			return this.pipelineInfoList;
		}

		public void setPipelineInfoList(List<PipelineInfo> pipelineInfoList) {
			this.pipelineInfoList = pipelineInfoList;
		}

		public List<String> getTargets() {
			return this.targets;
		}

		public void setTargets(List<String> targets) {
			this.targets = targets;
		}

		public TrafficControl getTrafficControl() {
			return this.trafficControl;
		}

		public void setTrafficControl(TrafficControl trafficControl) {
			this.trafficControl = trafficControl;
		}

		public static class PipelineInfo {

			private String pipelineName;

			private String startTime;

			private String updateTime;

			private Integer pipelineStatus;

			private String pipelineId;

			private List<StageInfoDTO> stageList;

			private List<StageDetailDTO> stageDetailList;

			public String getPipelineName() {
				return this.pipelineName;
			}

			public void setPipelineName(String pipelineName) {
				this.pipelineName = pipelineName;
			}

			public String getStartTime() {
				return this.startTime;
			}

			public void setStartTime(String startTime) {
				this.startTime = startTime;
			}

			public String getUpdateTime() {
				return this.updateTime;
			}

			public void setUpdateTime(String updateTime) {
				this.updateTime = updateTime;
			}

			public Integer getPipelineStatus() {
				return this.pipelineStatus;
			}

			public void setPipelineStatus(Integer pipelineStatus) {
				this.pipelineStatus = pipelineStatus;
			}

			public String getPipelineId() {
				return this.pipelineId;
			}

			public void setPipelineId(String pipelineId) {
				this.pipelineId = pipelineId;
			}

			public List<StageInfoDTO> getStageList() {
				return this.stageList;
			}

			public void setStageList(List<StageInfoDTO> stageList) {
				this.stageList = stageList;
			}

			public List<StageDetailDTO> getStageDetailList() {
				return this.stageDetailList;
			}

			public void setStageDetailList(List<StageDetailDTO> stageDetailList) {
				this.stageDetailList = stageDetailList;
			}

			public static class StageInfoDTO {

				private String stageId;

				private Integer status;

				private String stageName;

				private StageResultDTO stageResultDTO;

				public String getStageId() {
					return this.stageId;
				}

				public void setStageId(String stageId) {
					this.stageId = stageId;
				}

				public Integer getStatus() {
					return this.status;
				}

				public void setStatus(Integer status) {
					this.status = status;
				}

				public String getStageName() {
					return this.stageName;
				}

				public void setStageName(String stageName) {
					this.stageName = stageName;
				}

				public StageResultDTO getStageResultDTO() {
					return this.stageResultDTO;
				}

				public void setStageResultDTO(StageResultDTO stageResultDTO) {
					this.stageResultDTO = stageResultDTO;
				}

				public static class StageResultDTO {

					private List<InstanceDTO> instanceDTOList;

					private ServiceStage serviceStage;

					public List<InstanceDTO> getInstanceDTOList() {
						return this.instanceDTOList;
					}

					public void setInstanceDTOList(List<InstanceDTO> instanceDTOList) {
						this.instanceDTOList = instanceDTOList;
					}

					public ServiceStage getServiceStage() {
						return this.serviceStage;
					}

					public void setServiceStage(ServiceStage serviceStage) {
						this.serviceStage = serviceStage;
					}

					public static class InstanceDTO {

						private Integer status;

						private String instanceIp;

						private String podName;

						private String instanceName;

						private String podStatus;

						private List<InstanceStageDTO> instanceStageDTOList;

						public Integer getStatus() {
							return this.status;
						}

						public void setStatus(Integer status) {
							this.status = status;
						}

						public String getInstanceIp() {
							return this.instanceIp;
						}

						public void setInstanceIp(String instanceIp) {
							this.instanceIp = instanceIp;
						}

						public String getPodName() {
							return this.podName;
						}

						public void setPodName(String podName) {
							this.podName = podName;
						}

						public String getInstanceName() {
							return this.instanceName;
						}

						public void setInstanceName(String instanceName) {
							this.instanceName = instanceName;
						}

						public String getPodStatus() {
							return this.podStatus;
						}

						public void setPodStatus(String podStatus) {
							this.podStatus = podStatus;
						}

						public List<InstanceStageDTO> getInstanceStageDTOList() {
							return this.instanceStageDTOList;
						}

						public void setInstanceStageDTOList(List<InstanceStageDTO> instanceStageDTOList) {
							this.instanceStageDTOList = instanceStageDTOList;
						}

						public static class InstanceStageDTO {

							private String stageId;

							private Integer status;

							private String startTime;

							private String stageMessage;

							private String finishTime;

							private String stageName;

							public String getStageId() {
								return this.stageId;
							}

							public void setStageId(String stageId) {
								this.stageId = stageId;
							}

							public Integer getStatus() {
								return this.status;
							}

							public void setStatus(Integer status) {
								this.status = status;
							}

							public String getStartTime() {
								return this.startTime;
							}

							public void setStartTime(String startTime) {
								this.startTime = startTime;
							}

							public String getStageMessage() {
								return this.stageMessage;
							}

							public void setStageMessage(String stageMessage) {
								this.stageMessage = stageMessage;
							}

							public String getFinishTime() {
								return this.finishTime;
							}

							public void setFinishTime(String finishTime) {
								this.finishTime = finishTime;
							}

							public String getStageName() {
								return this.stageName;
							}

							public void setStageName(String stageName) {
								this.stageName = stageName;
							}
						}
					}

					public static class ServiceStage {

						private String stageId;

						private Integer status;

						private String message;

						private String stageName;

						public String getStageId() {
							return this.stageId;
						}

						public void setStageId(String stageId) {
							this.stageId = stageId;
						}

						public Integer getStatus() {
							return this.status;
						}

						public void setStatus(Integer status) {
							this.status = status;
						}

						public String getMessage() {
							return this.message;
						}

						public void setMessage(String message) {
							this.message = message;
						}

						public String getStageName() {
							return this.stageName;
						}

						public void setStageName(String stageName) {
							this.stageName = stageName;
						}
					}
				}
			}

			public static class StageDetailDTO {

				private String stageId;

				private Integer stageStatus;

				private String stageName;

				private List<TaskInfoDTO> taskList;

				public String getStageId() {
					return this.stageId;
				}

				public void setStageId(String stageId) {
					this.stageId = stageId;
				}

				public Integer getStageStatus() {
					return this.stageStatus;
				}

				public void setStageStatus(Integer stageStatus) {
					this.stageStatus = stageStatus;
				}

				public String getStageName() {
					return this.stageName;
				}

				public void setStageName(String stageName) {
					this.stageName = stageName;
				}

				public List<TaskInfoDTO> getTaskList() {
					return this.taskList;
				}

				public void setTaskList(List<TaskInfoDTO> taskList) {
					this.taskList = taskList;
				}

				public static class TaskInfoDTO {

					private Integer taskErrorIgnorance;

					private Boolean showManualIgnorance;

					private String taskStatus;

					private String taskMessage;

					private String taskName;

					private String taskErrorCode;

					private Integer retryType;

					private String taskId;

					private String taskErrorMessage;

					public Integer getTaskErrorIgnorance() {
						return this.taskErrorIgnorance;
					}

					public void setTaskErrorIgnorance(Integer taskErrorIgnorance) {
						this.taskErrorIgnorance = taskErrorIgnorance;
					}

					public Boolean getShowManualIgnorance() {
						return this.showManualIgnorance;
					}

					public void setShowManualIgnorance(Boolean showManualIgnorance) {
						this.showManualIgnorance = showManualIgnorance;
					}

					public String getTaskStatus() {
						return this.taskStatus;
					}

					public void setTaskStatus(String taskStatus) {
						this.taskStatus = taskStatus;
					}

					public String getTaskMessage() {
						return this.taskMessage;
					}

					public void setTaskMessage(String taskMessage) {
						this.taskMessage = taskMessage;
					}

					public String getTaskName() {
						return this.taskName;
					}

					public void setTaskName(String taskName) {
						this.taskName = taskName;
					}

					public String getTaskErrorCode() {
						return this.taskErrorCode;
					}

					public void setTaskErrorCode(String taskErrorCode) {
						this.taskErrorCode = taskErrorCode;
					}

					public Integer getRetryType() {
						return this.retryType;
					}

					public void setRetryType(Integer retryType) {
						this.retryType = retryType;
					}

					public String getTaskId() {
						return this.taskId;
					}

					public void setTaskId(String taskId) {
						this.taskId = taskId;
					}

					public String getTaskErrorMessage() {
						return this.taskErrorMessage;
					}

					public void setTaskErrorMessage(String taskErrorMessage) {
						this.taskErrorMessage = taskErrorMessage;
					}
				}
			}
		}

		public static class TrafficControl {

			private String routes;

			private String rules;

			private String tips;

			public String getRoutes() {
				return this.routes;
			}

			public void setRoutes(String routes) {
				this.routes = routes;
			}

			public String getRules() {
				return this.rules;
			}

			public void setRules(String rules) {
				this.rules = rules;
			}

			public String getTips() {
				return this.tips;
			}

			public void setTips(String tips) {
				this.tips = tips;
			}
		}
	}

	@Override
	public GetChangeOrderInfoResponse getInstance(UnmarshallerContext context) {
		return	GetChangeOrderInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
