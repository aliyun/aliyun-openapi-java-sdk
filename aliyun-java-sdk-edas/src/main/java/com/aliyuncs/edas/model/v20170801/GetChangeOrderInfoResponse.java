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

		private List<PipelineInfo> pipelineInfoList;

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

		public List<PipelineInfo> getPipelineInfoList() {
			return this.pipelineInfoList;
		}

		public void setPipelineInfoList(List<PipelineInfo> pipelineInfoList) {
			this.pipelineInfoList = pipelineInfoList;
		}

		public static class PipelineInfo {

			private String pipelineId;

			private String pipelineName;

			private Integer pipelineStatus;

			private List<StageInfoDTO> stageList;

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

			public List<StageInfoDTO> getStageList() {
				return this.stageList;
			}

			public void setStageList(List<StageInfoDTO> stageList) {
				this.stageList = stageList;
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
		}
	}

	@Override
	public GetChangeOrderInfoResponse getInstance(UnmarshallerContext context) {
		return	GetChangeOrderInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
