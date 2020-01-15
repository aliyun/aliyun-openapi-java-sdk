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

package com.aliyuncs.drds.model.v20190123;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.drds.transform.v20190123.DescribeDataImportTasksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDataImportTasksResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer total;

	private List<DataImportTask> data;

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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List<DataImportTask> getData() {
		return this.data;
	}

	public void setData(List<DataImportTask> data) {
		this.data = data;
	}

	public static class DataImportTask {

		private Integer id;

		private String taskName;

		private String gmtCreate;

		private String gmtModified;

		private Integer type;

		private String status;

		private String stage;

		private String srcInstId;

		private String srcDbName;

		private String dstInstId;

		private String dstDbName;

		private Integer evaluateTaskId;

		private Integer batchEvaluateTaskId;

		private Integer createDbProgress;

		private Integer createTablesProgress;

		private Integer progress;

		private JingweiProgress jingweiProgress;

		public Integer getId() {
			return this.id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getTaskName() {
			return this.taskName;
		}

		public void setTaskName(String taskName) {
			this.taskName = taskName;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public Integer getType() {
			return this.type;
		}

		public void setType(Integer type) {
			this.type = type;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getStage() {
			return this.stage;
		}

		public void setStage(String stage) {
			this.stage = stage;
		}

		public String getSrcInstId() {
			return this.srcInstId;
		}

		public void setSrcInstId(String srcInstId) {
			this.srcInstId = srcInstId;
		}

		public String getSrcDbName() {
			return this.srcDbName;
		}

		public void setSrcDbName(String srcDbName) {
			this.srcDbName = srcDbName;
		}

		public String getDstInstId() {
			return this.dstInstId;
		}

		public void setDstInstId(String dstInstId) {
			this.dstInstId = dstInstId;
		}

		public String getDstDbName() {
			return this.dstDbName;
		}

		public void setDstDbName(String dstDbName) {
			this.dstDbName = dstDbName;
		}

		public Integer getEvaluateTaskId() {
			return this.evaluateTaskId;
		}

		public void setEvaluateTaskId(Integer evaluateTaskId) {
			this.evaluateTaskId = evaluateTaskId;
		}

		public Integer getBatchEvaluateTaskId() {
			return this.batchEvaluateTaskId;
		}

		public void setBatchEvaluateTaskId(Integer batchEvaluateTaskId) {
			this.batchEvaluateTaskId = batchEvaluateTaskId;
		}

		public Integer getCreateDbProgress() {
			return this.createDbProgress;
		}

		public void setCreateDbProgress(Integer createDbProgress) {
			this.createDbProgress = createDbProgress;
		}

		public Integer getCreateTablesProgress() {
			return this.createTablesProgress;
		}

		public void setCreateTablesProgress(Integer createTablesProgress) {
			this.createTablesProgress = createTablesProgress;
		}

		public Integer getProgress() {
			return this.progress;
		}

		public void setProgress(Integer progress) {
			this.progress = progress;
		}

		public JingweiProgress getJingweiProgress() {
			return this.jingweiProgress;
		}

		public void setJingweiProgress(JingweiProgress jingweiProgress) {
			this.jingweiProgress = jingweiProgress;
		}

		public static class JingweiProgress {

			private Boolean fullRunning;

			private Boolean incrementRunning;

			private Full full;

			private Increment increment;

			public Boolean getFullRunning() {
				return this.fullRunning;
			}

			public void setFullRunning(Boolean fullRunning) {
				this.fullRunning = fullRunning;
			}

			public Boolean getIncrementRunning() {
				return this.incrementRunning;
			}

			public void setIncrementRunning(Boolean incrementRunning) {
				this.incrementRunning = incrementRunning;
			}

			public Full getFull() {
				return this.full;
			}

			public void setFull(Full full) {
				this.full = full;
			}

			public Increment getIncrement() {
				return this.increment;
			}

			public void setIncrement(Increment increment) {
				this.increment = increment;
			}

			public static class Full {

				private Integer progress;

				private Integer tps;

				private Integer needTime;

				private Integer transferCount;

				public Integer getProgress() {
					return this.progress;
				}

				public void setProgress(Integer progress) {
					this.progress = progress;
				}

				public Integer getTps() {
					return this.tps;
				}

				public void setTps(Integer tps) {
					this.tps = tps;
				}

				public Integer getNeedTime() {
					return this.needTime;
				}

				public void setNeedTime(Integer needTime) {
					this.needTime = needTime;
				}

				public Integer getTransferCount() {
					return this.transferCount;
				}

				public void setTransferCount(Integer transferCount) {
					this.transferCount = transferCount;
				}
			}

			public static class Increment {

				private Integer delay;

				private Integer tps;

				private Integer transferCount;

				public Integer getDelay() {
					return this.delay;
				}

				public void setDelay(Integer delay) {
					this.delay = delay;
				}

				public Integer getTps() {
					return this.tps;
				}

				public void setTps(Integer tps) {
					this.tps = tps;
				}

				public Integer getTransferCount() {
					return this.transferCount;
				}

				public void setTransferCount(Integer transferCount) {
					this.transferCount = transferCount;
				}
			}
		}
	}

	@Override
	public DescribeDataImportTasksResponse getInstance(UnmarshallerContext context) {
		return	DescribeDataImportTasksResponseUnmarshaller.unmarshall(this, context);
	}
}
