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
import com.aliyuncs.outboundbot.transform.v20191226.ListJobGroupsWithScenarioResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListJobGroupsWithScenarioResponse extends AcsResponse {

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

			private String scenarioName;

			private String jobGroupDescription;

			private String scenarioId;

			private String jobFilePath;

			private Long creationTime;

			private List<String> callingNumbers;

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

			public String getScenarioName() {
				return this.scenarioName;
			}

			public void setScenarioName(String scenarioName) {
				this.scenarioName = scenarioName;
			}

			public String getJobGroupDescription() {
				return this.jobGroupDescription;
			}

			public void setJobGroupDescription(String jobGroupDescription) {
				this.jobGroupDescription = jobGroupDescription;
			}

			public String getScenarioId() {
				return this.scenarioId;
			}

			public void setScenarioId(String scenarioId) {
				this.scenarioId = scenarioId;
			}

			public String getJobFilePath() {
				return this.jobFilePath;
			}

			public void setJobFilePath(String jobFilePath) {
				this.jobFilePath = jobFilePath;
			}

			public Long getCreationTime() {
				return this.creationTime;
			}

			public void setCreationTime(Long creationTime) {
				this.creationTime = creationTime;
			}

			public List<String> getCallingNumbers() {
				return this.callingNumbers;
			}

			public void setCallingNumbers(List<String> callingNumbers) {
				this.callingNumbers = callingNumbers;
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

				private String strategyId;

				private String strategyName;

				private String description;

				private String type;

				private Long startTime;

				private Long endTime;

				private String repeatBy;

				private Integer maxAttemptsPerDay;

				private Integer minAttemptInterval;

				private String customized;

				private String routingStrategy;

				private String followUpStrategy;

				private Boolean isTemplate;

				private List<TimeFrame> workingTime;

				private List<String> repeatDays;

				public String getStrategyId() {
					return this.strategyId;
				}

				public void setStrategyId(String strategyId) {
					this.strategyId = strategyId;
				}

				public String getStrategyName() {
					return this.strategyName;
				}

				public void setStrategyName(String strategyName) {
					this.strategyName = strategyName;
				}

				public String getDescription() {
					return this.description;
				}

				public void setDescription(String description) {
					this.description = description;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

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

				public String getRepeatBy() {
					return this.repeatBy;
				}

				public void setRepeatBy(String repeatBy) {
					this.repeatBy = repeatBy;
				}

				public Integer getMaxAttemptsPerDay() {
					return this.maxAttemptsPerDay;
				}

				public void setMaxAttemptsPerDay(Integer maxAttemptsPerDay) {
					this.maxAttemptsPerDay = maxAttemptsPerDay;
				}

				public Integer getMinAttemptInterval() {
					return this.minAttemptInterval;
				}

				public void setMinAttemptInterval(Integer minAttemptInterval) {
					this.minAttemptInterval = minAttemptInterval;
				}

				public String getCustomized() {
					return this.customized;
				}

				public void setCustomized(String customized) {
					this.customized = customized;
				}

				public String getRoutingStrategy() {
					return this.routingStrategy;
				}

				public void setRoutingStrategy(String routingStrategy) {
					this.routingStrategy = routingStrategy;
				}

				public String getFollowUpStrategy() {
					return this.followUpStrategy;
				}

				public void setFollowUpStrategy(String followUpStrategy) {
					this.followUpStrategy = followUpStrategy;
				}

				public Boolean getIsTemplate() {
					return this.isTemplate;
				}

				public void setIsTemplate(Boolean isTemplate) {
					this.isTemplate = isTemplate;
				}

				public List<TimeFrame> getWorkingTime() {
					return this.workingTime;
				}

				public void setWorkingTime(List<TimeFrame> workingTime) {
					this.workingTime = workingTime;
				}

				public List<String> getRepeatDays() {
					return this.repeatDays;
				}

				public void setRepeatDays(List<String> repeatDays) {
					this.repeatDays = repeatDays;
				}

				public static class TimeFrame {

					private String beginTime;

					private String endTime;

					public String getBeginTime() {
						return this.beginTime;
					}

					public void setBeginTime(String beginTime) {
						this.beginTime = beginTime;
					}

					public String getEndTime() {
						return this.endTime;
					}

					public void setEndTime(String endTime) {
						this.endTime = endTime;
					}
				}
			}

			public static class Progress {

				private Integer totalJobs;

				private String status;

				private Integer totalNotAnswered;

				private Integer totalCompleted;

				private Long startTime;

				private Integer duration;

				private List<KeyValuePair> categories;

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

				public List<KeyValuePair> getCategories() {
					return this.categories;
				}

				public void setCategories(List<KeyValuePair> categories) {
					this.categories = categories;
				}

				public static class KeyValuePair {

					private String key;

					private String value;

					public String getKey() {
						return this.key;
					}

					public void setKey(String key) {
						this.key = key;
					}

					public String getValue() {
						return this.value;
					}

					public void setValue(String value) {
						this.value = value;
					}
				}
			}
		}
	}

	@Override
	public ListJobGroupsWithScenarioResponse getInstance(UnmarshallerContext context) {
		return	ListJobGroupsWithScenarioResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
