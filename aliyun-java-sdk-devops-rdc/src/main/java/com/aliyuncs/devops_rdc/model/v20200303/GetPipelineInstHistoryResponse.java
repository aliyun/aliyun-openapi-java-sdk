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

package com.aliyuncs.devops_rdc.model.v20200303;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.devops_rdc.transform.v20200303.GetPipelineInstHistoryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetPipelineInstHistoryResponse extends AcsResponse {

	private String requestId;

	private String errorMessage;

	private Boolean success;

	private String errorCode;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer total;

		private List<PipelineInst> dataList;

		public Integer getTotal() {
			return this.total;
		}

		public void setTotal(Integer total) {
			this.total = total;
		}

		public List<PipelineInst> getDataList() {
			return this.dataList;
		}

		public void setDataList(List<PipelineInst> dataList) {
			this.dataList = dataList;
		}

		public static class PipelineInst {

			private String status;

			private Long createTime;

			private String statusName;

			private Integer triggerMode;

			private Integer pipelineConfigId;

			private String deletion;

			private String creator;

			private Integer instNumber;

			private String modifier;

			private String packages;

			private Integer flowInstId;

			private Integer pipelineId;

			private Integer id;

			private Long modifyTime;

			private FlowInstance flowInstance;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public Long getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(Long createTime) {
				this.createTime = createTime;
			}

			public String getStatusName() {
				return this.statusName;
			}

			public void setStatusName(String statusName) {
				this.statusName = statusName;
			}

			public Integer getTriggerMode() {
				return this.triggerMode;
			}

			public void setTriggerMode(Integer triggerMode) {
				this.triggerMode = triggerMode;
			}

			public Integer getPipelineConfigId() {
				return this.pipelineConfigId;
			}

			public void setPipelineConfigId(Integer pipelineConfigId) {
				this.pipelineConfigId = pipelineConfigId;
			}

			public String getDeletion() {
				return this.deletion;
			}

			public void setDeletion(String deletion) {
				this.deletion = deletion;
			}

			public String getCreator() {
				return this.creator;
			}

			public void setCreator(String creator) {
				this.creator = creator;
			}

			public Integer getInstNumber() {
				return this.instNumber;
			}

			public void setInstNumber(Integer instNumber) {
				this.instNumber = instNumber;
			}

			public String getModifier() {
				return this.modifier;
			}

			public void setModifier(String modifier) {
				this.modifier = modifier;
			}

			public String getPackages() {
				return this.packages;
			}

			public void setPackages(String packages) {
				this.packages = packages;
			}

			public Integer getFlowInstId() {
				return this.flowInstId;
			}

			public void setFlowInstId(Integer flowInstId) {
				this.flowInstId = flowInstId;
			}

			public Integer getPipelineId() {
				return this.pipelineId;
			}

			public void setPipelineId(Integer pipelineId) {
				this.pipelineId = pipelineId;
			}

			public Integer getId() {
				return this.id;
			}

			public void setId(Integer id) {
				this.id = id;
			}

			public Long getModifyTime() {
				return this.modifyTime;
			}

			public void setModifyTime(Long modifyTime) {
				this.modifyTime = modifyTime;
			}

			public FlowInstance getFlowInstance() {
				return this.flowInstance;
			}

			public void setFlowInstance(FlowInstance flowInstance) {
				this.flowInstance = flowInstance;
			}

			public static class FlowInstance {

				private String status;

				private Map<Object,Object> stages;

				private Long createTime;

				private String statusName;

				private String runningStatus;

				private String creator;

				private String stageTopo;

				private String modifier;

				private Boolean autoDrivenStatus;

				private String resultStatus;

				private Integer id;

				private String systemCode;

				private Long modifyTime;

				private String systemId;

				private List<Group> groups;

				private Result result;

				public String getStatus() {
					return this.status;
				}

				public void setStatus(String status) {
					this.status = status;
				}

				public Map<Object,Object> getStages() {
					return this.stages;
				}

				public void setStages(Map<Object,Object> stages) {
					this.stages = stages;
				}

				public Long getCreateTime() {
					return this.createTime;
				}

				public void setCreateTime(Long createTime) {
					this.createTime = createTime;
				}

				public String getStatusName() {
					return this.statusName;
				}

				public void setStatusName(String statusName) {
					this.statusName = statusName;
				}

				public String getRunningStatus() {
					return this.runningStatus;
				}

				public void setRunningStatus(String runningStatus) {
					this.runningStatus = runningStatus;
				}

				public String getCreator() {
					return this.creator;
				}

				public void setCreator(String creator) {
					this.creator = creator;
				}

				public String getStageTopo() {
					return this.stageTopo;
				}

				public void setStageTopo(String stageTopo) {
					this.stageTopo = stageTopo;
				}

				public String getModifier() {
					return this.modifier;
				}

				public void setModifier(String modifier) {
					this.modifier = modifier;
				}

				public Boolean getAutoDrivenStatus() {
					return this.autoDrivenStatus;
				}

				public void setAutoDrivenStatus(Boolean autoDrivenStatus) {
					this.autoDrivenStatus = autoDrivenStatus;
				}

				public String getResultStatus() {
					return this.resultStatus;
				}

				public void setResultStatus(String resultStatus) {
					this.resultStatus = resultStatus;
				}

				public Integer getId() {
					return this.id;
				}

				public void setId(Integer id) {
					this.id = id;
				}

				public String getSystemCode() {
					return this.systemCode;
				}

				public void setSystemCode(String systemCode) {
					this.systemCode = systemCode;
				}

				public Long getModifyTime() {
					return this.modifyTime;
				}

				public void setModifyTime(Long modifyTime) {
					this.modifyTime = modifyTime;
				}

				public String getSystemId() {
					return this.systemId;
				}

				public void setSystemId(String systemId) {
					this.systemId = systemId;
				}

				public List<Group> getGroups() {
					return this.groups;
				}

				public void setGroups(List<Group> groups) {
					this.groups = groups;
				}

				public Result getResult() {
					return this.result;
				}

				public void setResult(Result result) {
					this.result = result;
				}

				public static class Group {

					private String status;

					private Long createTime;

					private String deleteStatus;

					private Integer idExtent;

					private String creator;

					private Long endTime;

					private Long startTime;

					private String modifier;

					private String resultStatus;

					private Integer flowInstId;

					private String name;

					private Integer id;

					private Long modifyTime;

					public String getStatus() {
						return this.status;
					}

					public void setStatus(String status) {
						this.status = status;
					}

					public Long getCreateTime() {
						return this.createTime;
					}

					public void setCreateTime(Long createTime) {
						this.createTime = createTime;
					}

					public String getDeleteStatus() {
						return this.deleteStatus;
					}

					public void setDeleteStatus(String deleteStatus) {
						this.deleteStatus = deleteStatus;
					}

					public Integer getIdExtent() {
						return this.idExtent;
					}

					public void setIdExtent(Integer idExtent) {
						this.idExtent = idExtent;
					}

					public String getCreator() {
						return this.creator;
					}

					public void setCreator(String creator) {
						this.creator = creator;
					}

					public Long getEndTime() {
						return this.endTime;
					}

					public void setEndTime(Long endTime) {
						this.endTime = endTime;
					}

					public Long getStartTime() {
						return this.startTime;
					}

					public void setStartTime(Long startTime) {
						this.startTime = startTime;
					}

					public String getModifier() {
						return this.modifier;
					}

					public void setModifier(String modifier) {
						this.modifier = modifier;
					}

					public String getResultStatus() {
						return this.resultStatus;
					}

					public void setResultStatus(String resultStatus) {
						this.resultStatus = resultStatus;
					}

					public Integer getFlowInstId() {
						return this.flowInstId;
					}

					public void setFlowInstId(Integer flowInstId) {
						this.flowInstId = flowInstId;
					}

					public String getName() {
						return this.name;
					}

					public void setName(String name) {
						this.name = name;
					}

					public Integer getId() {
						return this.id;
					}

					public void setId(Integer id) {
						this.id = id;
					}

					public Long getModifyTime() {
						return this.modifyTime;
					}

					public void setModifyTime(Long modifyTime) {
						this.modifyTime = modifyTime;
					}
				}

				public static class Result {

					private Integer enginePipelineNumber;

					private String mixFlowInstId;

					private String enginePipelineName;

					private Integer enginePipelineId;

					private Integer enginePipelineInstId;

					private String timeStamp;

					private String triggerMode;

					private String sources;

					private String caches;

					private String dateTime;

					public Integer getEnginePipelineNumber() {
						return this.enginePipelineNumber;
					}

					public void setEnginePipelineNumber(Integer enginePipelineNumber) {
						this.enginePipelineNumber = enginePipelineNumber;
					}

					public String getMixFlowInstId() {
						return this.mixFlowInstId;
					}

					public void setMixFlowInstId(String mixFlowInstId) {
						this.mixFlowInstId = mixFlowInstId;
					}

					public String getEnginePipelineName() {
						return this.enginePipelineName;
					}

					public void setEnginePipelineName(String enginePipelineName) {
						this.enginePipelineName = enginePipelineName;
					}

					public Integer getEnginePipelineId() {
						return this.enginePipelineId;
					}

					public void setEnginePipelineId(Integer enginePipelineId) {
						this.enginePipelineId = enginePipelineId;
					}

					public Integer getEnginePipelineInstId() {
						return this.enginePipelineInstId;
					}

					public void setEnginePipelineInstId(Integer enginePipelineInstId) {
						this.enginePipelineInstId = enginePipelineInstId;
					}

					public String getTimeStamp() {
						return this.timeStamp;
					}

					public void setTimeStamp(String timeStamp) {
						this.timeStamp = timeStamp;
					}

					public String getTriggerMode() {
						return this.triggerMode;
					}

					public void setTriggerMode(String triggerMode) {
						this.triggerMode = triggerMode;
					}

					public String getSources() {
						return this.sources;
					}

					public void setSources(String sources) {
						this.sources = sources;
					}

					public String getCaches() {
						return this.caches;
					}

					public void setCaches(String caches) {
						this.caches = caches;
					}

					public String getDateTime() {
						return this.dateTime;
					}

					public void setDateTime(String dateTime) {
						this.dateTime = dateTime;
					}
				}
			}
		}
	}

	@Override
	public GetPipelineInstHistoryResponse getInstance(UnmarshallerContext context) {
		return	GetPipelineInstHistoryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
