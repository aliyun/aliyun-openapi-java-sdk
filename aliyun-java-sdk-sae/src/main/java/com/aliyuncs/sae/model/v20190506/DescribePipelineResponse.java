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
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sae.transform.v20190506.DescribePipelineResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePipelineResponse extends AcsResponse {

	private String requestId;

	private String message;

	private String traceId;

	private String errorCode;

	private String code;

	private Boolean success;

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

	public String getTraceId() {
		return this.traceId;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
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

		private Boolean showBatch;

		private Integer pipelineStatus;

		private Integer currentPoint;

		private String currentStageId;

		private String pipelineName;

		private String nextPipelineId;

		private String pipelineId;

		private String coStatus;

		private List<Stage> stageList;

		public Boolean getShowBatch() {
			return this.showBatch;
		}

		public void setShowBatch(Boolean showBatch) {
			this.showBatch = showBatch;
		}

		public Integer getPipelineStatus() {
			return this.pipelineStatus;
		}

		public void setPipelineStatus(Integer pipelineStatus) {
			this.pipelineStatus = pipelineStatus;
		}

		public Integer getCurrentPoint() {
			return this.currentPoint;
		}

		public void setCurrentPoint(Integer currentPoint) {
			this.currentPoint = currentPoint;
		}

		public String getCurrentStageId() {
			return this.currentStageId;
		}

		public void setCurrentStageId(String currentStageId) {
			this.currentStageId = currentStageId;
		}

		public String getPipelineName() {
			return this.pipelineName;
		}

		public void setPipelineName(String pipelineName) {
			this.pipelineName = pipelineName;
		}

		public String getNextPipelineId() {
			return this.nextPipelineId;
		}

		public void setNextPipelineId(String nextPipelineId) {
			this.nextPipelineId = nextPipelineId;
		}

		public String getPipelineId() {
			return this.pipelineId;
		}

		public void setPipelineId(String pipelineId) {
			this.pipelineId = pipelineId;
		}

		public String getCoStatus() {
			return this.coStatus;
		}

		public void setCoStatus(String coStatus) {
			this.coStatus = coStatus;
		}

		public List<Stage> getStageList() {
			return this.stageList;
		}

		public void setStageList(List<Stage> stageList) {
			this.stageList = stageList;
		}

		public static class Stage {

			private Integer status;

			private String stageId;

			private Integer executorType;

			private String stageName;

			private List<Task> taskList;

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public String getStageId() {
				return this.stageId;
			}

			public void setStageId(String stageId) {
				this.stageId = stageId;
			}

			public Integer getExecutorType() {
				return this.executorType;
			}

			public void setExecutorType(Integer executorType) {
				this.executorType = executorType;
			}

			public String getStageName() {
				return this.stageName;
			}

			public void setStageName(String stageName) {
				this.stageName = stageName;
			}

			public List<Task> getTaskList() {
				return this.taskList;
			}

			public void setTaskList(List<Task> taskList) {
				this.taskList = taskList;
			}

			public static class Task {

				private Integer status;

				private String stageId;

				private String errorMessage;

				private String errorCode;

				private String taskName;

				private Integer errorIgnore;

				private String message;

				private Boolean showManualIgnore;

				private String taskId;

				private Long createTime;

				private Long startTime;

				private Long updateTime;

				public Integer getStatus() {
					return this.status;
				}

				public void setStatus(Integer status) {
					this.status = status;
				}

				public String getStageId() {
					return this.stageId;
				}

				public void setStageId(String stageId) {
					this.stageId = stageId;
				}

				public String getErrorMessage() {
					return this.errorMessage;
				}

				public void setErrorMessage(String errorMessage) {
					this.errorMessage = errorMessage;
				}

				public String getErrorCode() {
					return this.errorCode;
				}

				public void setErrorCode(String errorCode) {
					this.errorCode = errorCode;
				}

				public String getTaskName() {
					return this.taskName;
				}

				public void setTaskName(String taskName) {
					this.taskName = taskName;
				}

				public Integer getErrorIgnore() {
					return this.errorIgnore;
				}

				public void setErrorIgnore(Integer errorIgnore) {
					this.errorIgnore = errorIgnore;
				}

				public String getMessage() {
					return this.message;
				}

				public void setMessage(String message) {
					this.message = message;
				}

				public Boolean getShowManualIgnore() {
					return this.showManualIgnore;
				}

				public void setShowManualIgnore(Boolean showManualIgnore) {
					this.showManualIgnore = showManualIgnore;
				}

				public String getTaskId() {
					return this.taskId;
				}

				public void setTaskId(String taskId) {
					this.taskId = taskId;
				}

				public Long getCreateTime() {
					return this.createTime;
				}

				public void setCreateTime(Long createTime) {
					this.createTime = createTime;
				}

				public Long getStartTime() {
					return this.startTime;
				}

				public void setStartTime(Long startTime) {
					this.startTime = startTime;
				}

				public Long getUpdateTime() {
					return this.updateTime;
				}

				public void setUpdateTime(Long updateTime) {
					this.updateTime = updateTime;
				}
			}
		}
	}

	@Override
	public DescribePipelineResponse getInstance(UnmarshallerContext context) {
		return	DescribePipelineResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
