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

package com.aliyuncs.outboundbot.model.v20191226;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.outboundbot.transform.v20191226.ListJobGroupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListJobGroupsResponse extends AcsResponse {

	private Integer httpStatusCode;

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private String asyncTaskId;

	private JobGroups jobGroups;

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getAsyncTaskId() {
		return this.asyncTaskId;
	}

	public void setAsyncTaskId(String asyncTaskId) {
		this.asyncTaskId = asyncTaskId;
	}

	public JobGroups getJobGroups() {
		return this.jobGroups;
	}

	public void setJobGroups(JobGroups jobGroups) {
		this.jobGroups = jobGroups;
	}

	public static class JobGroups {

		private Integer pageNumber;

		private Integer pageSize;

		private Integer totalCount;

		private List<JobGroup> list;

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

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<JobGroup> getList() {
			return this.list;
		}

		public void setList(List<JobGroup> list) {
			this.list = list;
		}

		public static class JobGroup {

			private String status;

			private String jobGroupId;

			private Long creationTime;

			private String jobGroupName;

			private Integer totalCallNum;

			private String scriptId;

			private String jobGroupDescription;

			private String jobDataParsingTaskId;

			private String scriptName;

			private String scriptVersion;

			private String modifyTime;

			private Integer minConcurrency;

			private Progress progress;

			private ExportProgress exportProgress;

			private Strategy strategy;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getJobGroupId() {
				return this.jobGroupId;
			}

			public void setJobGroupId(String jobGroupId) {
				this.jobGroupId = jobGroupId;
			}

			public Long getCreationTime() {
				return this.creationTime;
			}

			public void setCreationTime(Long creationTime) {
				this.creationTime = creationTime;
			}

			public String getJobGroupName() {
				return this.jobGroupName;
			}

			public void setJobGroupName(String jobGroupName) {
				this.jobGroupName = jobGroupName;
			}

			public Integer getTotalCallNum() {
				return this.totalCallNum;
			}

			public void setTotalCallNum(Integer totalCallNum) {
				this.totalCallNum = totalCallNum;
			}

			public String getScriptId() {
				return this.scriptId;
			}

			public void setScriptId(String scriptId) {
				this.scriptId = scriptId;
			}

			public String getJobGroupDescription() {
				return this.jobGroupDescription;
			}

			public void setJobGroupDescription(String jobGroupDescription) {
				this.jobGroupDescription = jobGroupDescription;
			}

			public String getJobDataParsingTaskId() {
				return this.jobDataParsingTaskId;
			}

			public void setJobDataParsingTaskId(String jobDataParsingTaskId) {
				this.jobDataParsingTaskId = jobDataParsingTaskId;
			}

			public String getScriptName() {
				return this.scriptName;
			}

			public void setScriptName(String scriptName) {
				this.scriptName = scriptName;
			}

			public String getScriptVersion() {
				return this.scriptVersion;
			}

			public void setScriptVersion(String scriptVersion) {
				this.scriptVersion = scriptVersion;
			}

			public String getModifyTime() {
				return this.modifyTime;
			}

			public void setModifyTime(String modifyTime) {
				this.modifyTime = modifyTime;
			}

			public Integer getMinConcurrency() {
				return this.minConcurrency;
			}

			public void setMinConcurrency(Integer minConcurrency) {
				this.minConcurrency = minConcurrency;
			}

			public Progress getProgress() {
				return this.progress;
			}

			public void setProgress(Progress progress) {
				this.progress = progress;
			}

			public ExportProgress getExportProgress() {
				return this.exportProgress;
			}

			public void setExportProgress(ExportProgress exportProgress) {
				this.exportProgress = exportProgress;
			}

			public Strategy getStrategy() {
				return this.strategy;
			}

			public void setStrategy(Strategy strategy) {
				this.strategy = strategy;
			}

			public static class Progress {

				private Integer totalNotAnswered;

				private String status;

				private Long startTime;

				private Integer failedNum;

				private Integer pausedNum;

				private Integer cancelledNum;

				private Integer totalJobs;

				private Integer totalCompleted;

				private Integer duration;

				private Integer executingNum;

				private Integer scheduling;

				public Integer getTotalNotAnswered() {
					return this.totalNotAnswered;
				}

				public void setTotalNotAnswered(Integer totalNotAnswered) {
					this.totalNotAnswered = totalNotAnswered;
				}

				public String getStatus() {
					return this.status;
				}

				public void setStatus(String status) {
					this.status = status;
				}

				public Long getStartTime() {
					return this.startTime;
				}

				public void setStartTime(Long startTime) {
					this.startTime = startTime;
				}

				public Integer getFailedNum() {
					return this.failedNum;
				}

				public void setFailedNum(Integer failedNum) {
					this.failedNum = failedNum;
				}

				public Integer getPausedNum() {
					return this.pausedNum;
				}

				public void setPausedNum(Integer pausedNum) {
					this.pausedNum = pausedNum;
				}

				public Integer getCancelledNum() {
					return this.cancelledNum;
				}

				public void setCancelledNum(Integer cancelledNum) {
					this.cancelledNum = cancelledNum;
				}

				public Integer getTotalJobs() {
					return this.totalJobs;
				}

				public void setTotalJobs(Integer totalJobs) {
					this.totalJobs = totalJobs;
				}

				public Integer getTotalCompleted() {
					return this.totalCompleted;
				}

				public void setTotalCompleted(Integer totalCompleted) {
					this.totalCompleted = totalCompleted;
				}

				public Integer getDuration() {
					return this.duration;
				}

				public void setDuration(Integer duration) {
					this.duration = duration;
				}

				public Integer getExecutingNum() {
					return this.executingNum;
				}

				public void setExecutingNum(Integer executingNum) {
					this.executingNum = executingNum;
				}

				public Integer getScheduling() {
					return this.scheduling;
				}

				public void setScheduling(Integer scheduling) {
					this.scheduling = scheduling;
				}
			}

			public static class ExportProgress {

				private String status;

				private String fileHttpUrl;

				private String progress;

				public String getStatus() {
					return this.status;
				}

				public void setStatus(String status) {
					this.status = status;
				}

				public String getFileHttpUrl() {
					return this.fileHttpUrl;
				}

				public void setFileHttpUrl(String fileHttpUrl) {
					this.fileHttpUrl = fileHttpUrl;
				}

				public String getProgress() {
					return this.progress;
				}

				public void setProgress(String progress) {
					this.progress = progress;
				}
			}

			public static class Strategy {

				private Long endTime;

				private Long startTime;

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
			}
		}
	}

	@Override
	public ListJobGroupsResponse getInstance(UnmarshallerContext context) {
		return	ListJobGroupsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
