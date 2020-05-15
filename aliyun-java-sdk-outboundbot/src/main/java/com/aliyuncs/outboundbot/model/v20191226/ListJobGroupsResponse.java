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

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private JobGroups jobGroups;

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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public JobGroups getJobGroups() {
		return this.jobGroups;
	}

	public void setJobGroups(JobGroups jobGroups) {
		this.jobGroups = jobGroups;
	}

	public static class JobGroups {

		private Integer totalCount;

		private Integer pageNumber;

		private Integer pageSize;

		private List<JobGroup> list;

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
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

		public List<JobGroup> getList() {
			return this.list;
		}

		public void setList(List<JobGroup> list) {
			this.list = list;
		}

		public static class JobGroup {

			private String jobGroupId;

			private String jobGroupName;

			private String jobGroupDescription;

			private String scriptId;

			private String scriptName;

			private Long creationTime;

			private Strategy strategy;

			private Progress progress;

			public String getJobGroupId() {
				return this.jobGroupId;
			}

			public void setJobGroupId(String jobGroupId) {
				this.jobGroupId = jobGroupId;
			}

			public String getJobGroupName() {
				return this.jobGroupName;
			}

			public void setJobGroupName(String jobGroupName) {
				this.jobGroupName = jobGroupName;
			}

			public String getJobGroupDescription() {
				return this.jobGroupDescription;
			}

			public void setJobGroupDescription(String jobGroupDescription) {
				this.jobGroupDescription = jobGroupDescription;
			}

			public String getScriptId() {
				return this.scriptId;
			}

			public void setScriptId(String scriptId) {
				this.scriptId = scriptId;
			}

			public String getScriptName() {
				return this.scriptName;
			}

			public void setScriptName(String scriptName) {
				this.scriptName = scriptName;
			}

			public Long getCreationTime() {
				return this.creationTime;
			}

			public void setCreationTime(Long creationTime) {
				this.creationTime = creationTime;
			}

			public Strategy getStrategy() {
				return this.strategy;
			}

			public void setStrategy(Strategy strategy) {
				this.strategy = strategy;
			}

			public Progress getProgress() {
				return this.progress;
			}

			public void setProgress(Progress progress) {
				this.progress = progress;
			}

			public static class Strategy {

				private Long startTime;

				private Long endTime;

				public Long getStartTime() {
					return this.startTime;
				}

				public void setStartTime(Long startTime) {
					this.startTime = startTime;
				}

				public Long getEndTime() {
					return this.endTime;
				}

				public void setEndTime(Long endTime) {
					this.endTime = endTime;
				}
			}

			public static class Progress {

				private Integer totalJobs;

				private String status;

				private Integer totalNotAnswered;

				private Integer totalCompleted;

				private Long startTime;

				private Integer duration;

				public Integer getTotalJobs() {
					return this.totalJobs;
				}

				public void setTotalJobs(Integer totalJobs) {
					this.totalJobs = totalJobs;
				}

				public String getStatus() {
					return this.status;
				}

				public void setStatus(String status) {
					this.status = status;
				}

				public Integer getTotalNotAnswered() {
					return this.totalNotAnswered;
				}

				public void setTotalNotAnswered(Integer totalNotAnswered) {
					this.totalNotAnswered = totalNotAnswered;
				}

				public Integer getTotalCompleted() {
					return this.totalCompleted;
				}

				public void setTotalCompleted(Integer totalCompleted) {
					this.totalCompleted = totalCompleted;
				}

				public Long getStartTime() {
					return this.startTime;
				}

				public void setStartTime(Long startTime) {
					this.startTime = startTime;
				}

				public Integer getDuration() {
					return this.duration;
				}

				public void setDuration(Integer duration) {
					this.duration = duration;
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
