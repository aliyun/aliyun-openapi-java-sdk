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

package com.aliyuncs.schedulerx3.model.v20240624;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.schedulerx3.transform.v20240624.GetJobExecutionProgressResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetJobExecutionProgressResponse extends AcsResponse {

	private Integer code;

	private String requestId;

	private String message;

	private Boolean success;

	private Data data;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

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

		private String jobDescription;

		private Map<Object,Object> statisticDetail;

		private List<TaskProgressItem> taskProgress;

		private List<ShardingProgressItem> shardingProgress;

		private List<WorkerProgressItem> workerProgress;

		private TotalProgress totalProgress;

		private RootProgress rootProgress;

		public String getJobDescription() {
			return this.jobDescription;
		}

		public void setJobDescription(String jobDescription) {
			this.jobDescription = jobDescription;
		}

		public Map<Object,Object> getStatisticDetail() {
			return this.statisticDetail;
		}

		public void setStatisticDetail(Map<Object,Object> statisticDetail) {
			this.statisticDetail = statisticDetail;
		}

		public List<TaskProgressItem> getTaskProgress() {
			return this.taskProgress;
		}

		public void setTaskProgress(List<TaskProgressItem> taskProgress) {
			this.taskProgress = taskProgress;
		}

		public List<ShardingProgressItem> getShardingProgress() {
			return this.shardingProgress;
		}

		public void setShardingProgress(List<ShardingProgressItem> shardingProgress) {
			this.shardingProgress = shardingProgress;
		}

		public List<WorkerProgressItem> getWorkerProgress() {
			return this.workerProgress;
		}

		public void setWorkerProgress(List<WorkerProgressItem> workerProgress) {
			this.workerProgress = workerProgress;
		}

		public TotalProgress getTotalProgress() {
			return this.totalProgress;
		}

		public void setTotalProgress(TotalProgress totalProgress) {
			this.totalProgress = totalProgress;
		}

		public RootProgress getRootProgress() {
			return this.rootProgress;
		}

		public void setRootProgress(RootProgress rootProgress) {
			this.rootProgress = rootProgress;
		}

		public static class TaskProgressItem {

			private String name;

			private Integer total;

			private Integer pulled;

			private Integer queue;

			private Integer running;

			private Integer success;

			private Integer failed;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Integer getTotal() {
				return this.total;
			}

			public void setTotal(Integer total) {
				this.total = total;
			}

			public Integer getPulled() {
				return this.pulled;
			}

			public void setPulled(Integer pulled) {
				this.pulled = pulled;
			}

			public Integer getQueue() {
				return this.queue;
			}

			public void setQueue(Integer queue) {
				this.queue = queue;
			}

			public Integer getRunning() {
				return this.running;
			}

			public void setRunning(Integer running) {
				this.running = running;
			}

			public Integer getSuccess() {
				return this.success;
			}

			public void setSuccess(Integer success) {
				this.success = success;
			}

			public Integer getFailed() {
				return this.failed;
			}

			public void setFailed(Integer failed) {
				this.failed = failed;
			}
		}

		public static class ShardingProgressItem {

			private Long id;

			private String workerAddr;

			private Integer status;

			private String jobExecutionId;

			private String result;

			private StatusType statusType;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getWorkerAddr() {
				return this.workerAddr;
			}

			public void setWorkerAddr(String workerAddr) {
				this.workerAddr = workerAddr;
			}

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public String getJobExecutionId() {
				return this.jobExecutionId;
			}

			public void setJobExecutionId(String jobExecutionId) {
				this.jobExecutionId = jobExecutionId;
			}

			public String getResult() {
				return this.result;
			}

			public void setResult(String result) {
				this.result = result;
			}

			public StatusType getStatusType() {
				return this.statusType;
			}

			public void setStatusType(StatusType statusType) {
				this.statusType = statusType;
			}

			public static class StatusType {

				private String code;

				private String name;

				private Map<Object,Object> tips;

				public String getCode() {
					return this.code;
				}

				public void setCode(String code) {
					this.code = code;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public Map<Object,Object> getTips() {
					return this.tips;
				}

				public void setTips(Map<Object,Object> tips) {
					this.tips = tips;
				}
			}
		}

		public static class WorkerProgressItem {

			private String workerAddr;

			private Integer total;

			private Integer pulled;

			private Integer queue;

			private Integer running;

			private Integer success;

			private Integer failed;

			private String traceId;

			public String getWorkerAddr() {
				return this.workerAddr;
			}

			public void setWorkerAddr(String workerAddr) {
				this.workerAddr = workerAddr;
			}

			public Integer getTotal() {
				return this.total;
			}

			public void setTotal(Integer total) {
				this.total = total;
			}

			public Integer getPulled() {
				return this.pulled;
			}

			public void setPulled(Integer pulled) {
				this.pulled = pulled;
			}

			public Integer getQueue() {
				return this.queue;
			}

			public void setQueue(Integer queue) {
				this.queue = queue;
			}

			public Integer getRunning() {
				return this.running;
			}

			public void setRunning(Integer running) {
				this.running = running;
			}

			public Integer getSuccess() {
				return this.success;
			}

			public void setSuccess(Integer success) {
				this.success = success;
			}

			public Integer getFailed() {
				return this.failed;
			}

			public void setFailed(Integer failed) {
				this.failed = failed;
			}

			public String getTraceId() {
				return this.traceId;
			}

			public void setTraceId(String traceId) {
				this.traceId = traceId;
			}
		}

		public static class TotalProgress {

			private Long total;

			private Long finished;

			public Long getTotal() {
				return this.total;
			}

			public void setTotal(Long total) {
				this.total = total;
			}

			public Long getFinished() {
				return this.finished;
			}

			public void setFinished(Long finished) {
				this.finished = finished;
			}
		}

		public static class RootProgress {

			private Long total;

			private Long finished;

			public Long getTotal() {
				return this.total;
			}

			public void setTotal(Long total) {
				this.total = total;
			}

			public Long getFinished() {
				return this.finished;
			}

			public void setFinished(Long finished) {
				this.finished = finished;
			}
		}
	}

	@Override
	public GetJobExecutionProgressResponse getInstance(UnmarshallerContext context) {
		return	GetJobExecutionProgressResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
