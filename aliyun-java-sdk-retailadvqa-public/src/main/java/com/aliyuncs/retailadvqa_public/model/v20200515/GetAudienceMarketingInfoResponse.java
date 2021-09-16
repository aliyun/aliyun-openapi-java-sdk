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

package com.aliyuncs.retailadvqa_public.model.v20200515;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.retailadvqa_public.transform.v20200515.GetAudienceMarketingInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAudienceMarketingInfoResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String errorDesc;

	private String traceId;

	private String errorCode;

	private Data data;

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

	public String getErrorDesc() {
		return this.errorDesc;
	}

	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long pageNum;

		private Long pageSize;

		private Long totalNum;

		private List<ContentItem> content;

		public Long getPageNum() {
			return this.pageNum;
		}

		public void setPageNum(Long pageNum) {
			this.pageNum = pageNum;
		}

		public Long getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}

		public Long getTotalNum() {
			return this.totalNum;
		}

		public void setTotalNum(Long totalNum) {
			this.totalNum = totalNum;
		}

		public List<ContentItem> getContent() {
			return this.content;
		}

		public void setContent(List<ContentItem> content) {
			this.content = content;
		}

		public static class ContentItem {

			private String id;

			private String name;

			private String gmtCreate;

			private String gmtModified;

			private String latestDataModifyTime;

			private String latestDataModifyStatus;

			private Long numberOfAudiences;

			private String errorMessage;

			private String defaultMappingType;

			private SmsMarketingModel smsMarketingModel;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
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

			public String getLatestDataModifyTime() {
				return this.latestDataModifyTime;
			}

			public void setLatestDataModifyTime(String latestDataModifyTime) {
				this.latestDataModifyTime = latestDataModifyTime;
			}

			public String getLatestDataModifyStatus() {
				return this.latestDataModifyStatus;
			}

			public void setLatestDataModifyStatus(String latestDataModifyStatus) {
				this.latestDataModifyStatus = latestDataModifyStatus;
			}

			public Long getNumberOfAudiences() {
				return this.numberOfAudiences;
			}

			public void setNumberOfAudiences(Long numberOfAudiences) {
				this.numberOfAudiences = numberOfAudiences;
			}

			public String getErrorMessage() {
				return this.errorMessage;
			}

			public void setErrorMessage(String errorMessage) {
				this.errorMessage = errorMessage;
			}

			public String getDefaultMappingType() {
				return this.defaultMappingType;
			}

			public void setDefaultMappingType(String defaultMappingType) {
				this.defaultMappingType = defaultMappingType;
			}

			public SmsMarketingModel getSmsMarketingModel() {
				return this.smsMarketingModel;
			}

			public void setSmsMarketingModel(SmsMarketingModel smsMarketingModel) {
				this.smsMarketingModel = smsMarketingModel;
			}

			public static class SmsMarketingModel {

				private Boolean hasMarketingJob;

				private Boolean hasMarketingTask;

				private String marketingMainAudienceId;

				private List<MarketingJobsItem> marketingJobs;

				private List<MarketingTasksItem> marketingTasks;

				public Boolean getHasMarketingJob() {
					return this.hasMarketingJob;
				}

				public void setHasMarketingJob(Boolean hasMarketingJob) {
					this.hasMarketingJob = hasMarketingJob;
				}

				public Boolean getHasMarketingTask() {
					return this.hasMarketingTask;
				}

				public void setHasMarketingTask(Boolean hasMarketingTask) {
					this.hasMarketingTask = hasMarketingTask;
				}

				public String getMarketingMainAudienceId() {
					return this.marketingMainAudienceId;
				}

				public void setMarketingMainAudienceId(String marketingMainAudienceId) {
					this.marketingMainAudienceId = marketingMainAudienceId;
				}

				public List<MarketingJobsItem> getMarketingJobs() {
					return this.marketingJobs;
				}

				public void setMarketingJobs(List<MarketingJobsItem> marketingJobs) {
					this.marketingJobs = marketingJobs;
				}

				public List<MarketingTasksItem> getMarketingTasks() {
					return this.marketingTasks;
				}

				public void setMarketingTasks(List<MarketingTasksItem> marketingTasks) {
					this.marketingTasks = marketingTasks;
				}

				public static class MarketingJobsItem {

					private String jobId;

					private String jobName;

					private String status;

					public String getJobId() {
						return this.jobId;
					}

					public void setJobId(String jobId) {
						this.jobId = jobId;
					}

					public String getJobName() {
						return this.jobName;
					}

					public void setJobName(String jobName) {
						this.jobName = jobName;
					}

					public String getStatus() {
						return this.status;
					}

					public void setStatus(String status) {
						this.status = status;
					}
				}

				public static class MarketingTasksItem {

					private String jobId;

					private String taskId;

					private String taskName;

					private String marketType;

					private String status;

					private String createTime;

					private String modifyTime;

					public String getJobId() {
						return this.jobId;
					}

					public void setJobId(String jobId) {
						this.jobId = jobId;
					}

					public String getTaskId() {
						return this.taskId;
					}

					public void setTaskId(String taskId) {
						this.taskId = taskId;
					}

					public String getTaskName() {
						return this.taskName;
					}

					public void setTaskName(String taskName) {
						this.taskName = taskName;
					}

					public String getMarketType() {
						return this.marketType;
					}

					public void setMarketType(String marketType) {
						this.marketType = marketType;
					}

					public String getStatus() {
						return this.status;
					}

					public void setStatus(String status) {
						this.status = status;
					}

					public String getCreateTime() {
						return this.createTime;
					}

					public void setCreateTime(String createTime) {
						this.createTime = createTime;
					}

					public String getModifyTime() {
						return this.modifyTime;
					}

					public void setModifyTime(String modifyTime) {
						this.modifyTime = modifyTime;
					}
				}
			}
		}
	}

	@Override
	public GetAudienceMarketingInfoResponse getInstance(UnmarshallerContext context) {
		return	GetAudienceMarketingInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
