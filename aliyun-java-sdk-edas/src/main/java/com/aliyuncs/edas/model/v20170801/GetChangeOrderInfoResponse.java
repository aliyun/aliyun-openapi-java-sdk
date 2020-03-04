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

		private String changeOrderId;

		private String createUserId;

		private String desc;

		private Integer batchCount;

		private String batchType;

		private Integer status;

		private String coType;

		private String createTime;

		private Boolean supportRollback;

		private List<PipelineInfo> pipelineInfoList;

		private TrafficControl trafficControl;

		public String getChangeOrderId() {
			return this.changeOrderId;
		}

		public void setChangeOrderId(String changeOrderId) {
			this.changeOrderId = changeOrderId;
		}

		public String getCreateUserId() {
			return this.createUserId;
		}

		public void setCreateUserId(String createUserId) {
			this.createUserId = createUserId;
		}

		public String getDesc() {
			return this.desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}

		public Integer getBatchCount() {
			return this.batchCount;
		}

		public void setBatchCount(Integer batchCount) {
			this.batchCount = batchCount;
		}

		public String getBatchType() {
			return this.batchType;
		}

		public void setBatchType(String batchType) {
			this.batchType = batchType;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
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

		public Boolean getSupportRollback() {
			return this.supportRollback;
		}

		public void setSupportRollback(Boolean supportRollback) {
			this.supportRollback = supportRollback;
		}

		public List<PipelineInfo> getPipelineInfoList() {
			return this.pipelineInfoList;
		}

		public void setPipelineInfoList(List<PipelineInfo> pipelineInfoList) {
			this.pipelineInfoList = pipelineInfoList;
		}

		public TrafficControl getTrafficControl() {
			return this.trafficControl;
		}

		public void setTrafficControl(TrafficControl trafficControl) {
			this.trafficControl = trafficControl;
		}

		public static class PipelineInfo {

			private String pipelineId;

			private String pipelineName;

			private Integer pipelineStatus;

			private String startTime;

			private String updateTime;

			private List<StageInfoDTO> stageList;

			private List<StageDetailDTO> stageDetailList;

			public String getPipelineId() {
				return this.pipelineId;
			}

			public void setPipelineId(String pipelineId) {
				this.pipelineId = pipelineId;
			}

			public String getPipelineName() {
				return this.pipelineName;
			}

			public void setPipelineName(String pipelineName) {
				this.pipelineName = pipelineName;
			}

			public Integer getPipelineStatus() {
				return this.pipelineStatus;
			}

			public void setPipelineStatus(Integer pipelineStatus) {
				this.pipelineStatus = pipelineStatus;
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

				private String stageName;

				private Integer status;

				private StageResultDTO stageResultDTO;

				public String getStageId() {
					return this.stageId;
				}

				public void setStageId(String stageId) {
					this.stageId = stageId;
				}

				public String getStageName() {
					return this.stageName;
				}

				public void setStageName(String stageName) {
					this.stageName = stageName;
				}

				public Integer getStatus() {
					return this.status;
				}

				public void setStatus(Integer status) {
					this.status = status;
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

						private String instanceName;

						private String instanceIp;

						private Integer status;

						private String podName;

						private List<InstanceStageDTO> instanceStageDTOList;

						public String getInstanceName() {
							return this.instanceName;
						}

						public void setInstanceName(String instanceName) {
							this.instanceName = instanceName;
						}

						public String getInstanceIp() {
							return this.instanceIp;
						}

						public void setInstanceIp(String instanceIp) {
							this.instanceIp = instanceIp;
						}

						public Integer getStatus() {
							return this.status;
						}

						public void setStatus(Integer status) {
							this.status = status;
						}

						public String getPodName() {
							return this.podName;
						}

						public void setPodName(String podName) {
							this.podName = podName;
						}

						public List<InstanceStageDTO> getInstanceStageDTOList() {
							return this.instanceStageDTOList;
						}

						public void setInstanceStageDTOList(List<InstanceStageDTO> instanceStageDTOList) {
							this.instanceStageDTOList = instanceStageDTOList;
						}

						public static class InstanceStageDTO {

							private String stageId;

							private String stageName;

							private Integer status;

							private String stageMessage;

							private String startTime;

							private String finishTime;

							public String getStageId() {
								return this.stageId;
							}

							public void setStageId(String stageId) {
								this.stageId = stageId;
							}

							public String getStageName() {
								return this.stageName;
							}

							public void setStageName(String stageName) {
								this.stageName = stageName;
							}

							public Integer getStatus() {
								return this.status;
							}

							public void setStatus(Integer status) {
								this.status = status;
							}

							public String getStageMessage() {
								return this.stageMessage;
							}

							public void setStageMessage(String stageMessage) {
								this.stageMessage = stageMessage;
							}

							public String getStartTime() {
								return this.startTime;
							}

							public void setStartTime(String startTime) {
								this.startTime = startTime;
							}

							public String getFinishTime() {
								return this.finishTime;
							}

							public void setFinishTime(String finishTime) {
								this.finishTime = finishTime;
							}
						}
					}

					public static class ServiceStage {

						private String stageId;

						private String stageName;

						private Integer status;

						private String message;

						public String getStageId() {
							return this.stageId;
						}

						public void setStageId(String stageId) {
							this.stageId = stageId;
						}

						public String getStageName() {
							return this.stageName;
						}

						public void setStageName(String stageName) {
							this.stageName = stageName;
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
					}
				}
			}

			public static class StageDetailDTO {

				private String stageId;

				private String stageName;

				private Integer stageStatus;

				private List<TaskInfoDTO> taskList;

				public String getStageId() {
					return this.stageId;
				}

				public void setStageId(String stageId) {
					this.stageId = stageId;
				}

				public String getStageName() {
					return this.stageName;
				}

				public void setStageName(String stageName) {
					this.stageName = stageName;
				}

				public Integer getStageStatus() {
					return this.stageStatus;
				}

				public void setStageStatus(Integer stageStatus) {
					this.stageStatus = stageStatus;
				}

				public List<TaskInfoDTO> getTaskList() {
					return this.taskList;
				}

				public void setTaskList(List<TaskInfoDTO> taskList) {
					this.taskList = taskList;
				}

				public static class TaskInfoDTO {

					private String taskName;

					private String taskStatus;

					private String taskMessage;

					private String taskId;

					private String taskErrorCode;

					private String taskErrorMessage;

					private Boolean showManualIgnorance;

					private Integer taskErrorIgnorance;

					public String getTaskName() {
						return this.taskName;
					}

					public void setTaskName(String taskName) {
						this.taskName = taskName;
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

					public String getTaskId() {
						return this.taskId;
					}

					public void setTaskId(String taskId) {
						this.taskId = taskId;
					}

					public String getTaskErrorCode() {
						return this.taskErrorCode;
					}

					public void setTaskErrorCode(String taskErrorCode) {
						this.taskErrorCode = taskErrorCode;
					}

					public String getTaskErrorMessage() {
						return this.taskErrorMessage;
					}

					public void setTaskErrorMessage(String taskErrorMessage) {
						this.taskErrorMessage = taskErrorMessage;
					}

					public Boolean getShowManualIgnorance() {
						return this.showManualIgnorance;
					}

					public void setShowManualIgnorance(Boolean showManualIgnorance) {
						this.showManualIgnorance = showManualIgnorance;
					}

					public Integer getTaskErrorIgnorance() {
						return this.taskErrorIgnorance;
					}

					public void setTaskErrorIgnorance(Integer taskErrorIgnorance) {
						this.taskErrorIgnorance = taskErrorIgnorance;
					}
				}
			}
		}

		public static class TrafficControl {

			private String module;

			private Boolean single;

			private String rules;

			private String routes;

			private String tips;

			public String getModule() {
				return this.module;
			}

			public void setModule(String module) {
				this.module = module;
			}

			public Boolean getSingle() {
				return this.single;
			}

			public void setSingle(Boolean single) {
				this.single = single;
			}

			public String getRules() {
				return this.rules;
			}

			public void setRules(String rules) {
				this.rules = rules;
			}

			public String getRoutes() {
				return this.routes;
			}

			public void setRoutes(String routes) {
				this.routes = routes;
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
