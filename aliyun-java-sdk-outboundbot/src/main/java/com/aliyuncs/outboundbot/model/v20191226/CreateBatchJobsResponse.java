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
import com.aliyuncs.outboundbot.transform.v20191226.CreateBatchJobsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateBatchJobsResponse extends AcsResponse {

	private Integer httpStatusCode;

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private BatchJob batchJob;

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
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

	public BatchJob getBatchJob() {
		return this.batchJob;
	}

	public void setBatchJob(BatchJob batchJob) {
		this.batchJob = batchJob;
	}

	public static class BatchJob {

		private Long creationTime;

		private String scenarioId;

		private String jobGroupName;

		private String batchJobId;

		private String jobFilePath;

		private String jobGroupDescription;

		private List<String> callingNumbers;

		private Strategy strategy;

		public Long getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(Long creationTime) {
			this.creationTime = creationTime;
		}

		public String getScenarioId() {
			return this.scenarioId;
		}

		public void setScenarioId(String scenarioId) {
			this.scenarioId = scenarioId;
		}

		public String getJobGroupName() {
			return this.jobGroupName;
		}

		public void setJobGroupName(String jobGroupName) {
			this.jobGroupName = jobGroupName;
		}

		public String getBatchJobId() {
			return this.batchJobId;
		}

		public void setBatchJobId(String batchJobId) {
			this.batchJobId = batchJobId;
		}

		public String getJobFilePath() {
			return this.jobFilePath;
		}

		public void setJobFilePath(String jobFilePath) {
			this.jobFilePath = jobFilePath;
		}

		public String getJobGroupDescription() {
			return this.jobGroupDescription;
		}

		public void setJobGroupDescription(String jobGroupDescription) {
			this.jobGroupDescription = jobGroupDescription;
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

		public static class Strategy {

			private String type;

			private String strategyName;

			private Integer maxAttemptsPerDay;

			private String followUpStrategy;

			private Long endTime;

			private String customized;

			private Boolean isTemplate;

			private Long startTime;

			private String strategyId;

			private String routingStrategy;

			private Integer minAttemptInterval;

			private String strategyDescription;

			private String repeatBy;

			private List<TimeFrame> workingTime;

			private List<String> repeatDays;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getStrategyName() {
				return this.strategyName;
			}

			public void setStrategyName(String strategyName) {
				this.strategyName = strategyName;
			}

			public Integer getMaxAttemptsPerDay() {
				return this.maxAttemptsPerDay;
			}

			public void setMaxAttemptsPerDay(Integer maxAttemptsPerDay) {
				this.maxAttemptsPerDay = maxAttemptsPerDay;
			}

			public String getFollowUpStrategy() {
				return this.followUpStrategy;
			}

			public void setFollowUpStrategy(String followUpStrategy) {
				this.followUpStrategy = followUpStrategy;
			}

			public Long getEndTime() {
				return this.endTime;
			}

			public void setEndTime(Long endTime) {
				this.endTime = endTime;
			}

			public String getCustomized() {
				return this.customized;
			}

			public void setCustomized(String customized) {
				this.customized = customized;
			}

			public Boolean getIsTemplate() {
				return this.isTemplate;
			}

			public void setIsTemplate(Boolean isTemplate) {
				this.isTemplate = isTemplate;
			}

			public Long getStartTime() {
				return this.startTime;
			}

			public void setStartTime(Long startTime) {
				this.startTime = startTime;
			}

			public String getStrategyId() {
				return this.strategyId;
			}

			public void setStrategyId(String strategyId) {
				this.strategyId = strategyId;
			}

			public String getRoutingStrategy() {
				return this.routingStrategy;
			}

			public void setRoutingStrategy(String routingStrategy) {
				this.routingStrategy = routingStrategy;
			}

			public Integer getMinAttemptInterval() {
				return this.minAttemptInterval;
			}

			public void setMinAttemptInterval(Integer minAttemptInterval) {
				this.minAttemptInterval = minAttemptInterval;
			}

			public String getStrategyDescription() {
				return this.strategyDescription;
			}

			public void setStrategyDescription(String strategyDescription) {
				this.strategyDescription = strategyDescription;
			}

			public String getRepeatBy() {
				return this.repeatBy;
			}

			public void setRepeatBy(String repeatBy) {
				this.repeatBy = repeatBy;
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

				private String endTime;

				private String beginTime;

				public String getEndTime() {
					return this.endTime;
				}

				public void setEndTime(String endTime) {
					this.endTime = endTime;
				}

				public String getBeginTime() {
					return this.beginTime;
				}

				public void setBeginTime(String beginTime) {
					this.beginTime = beginTime;
				}
			}
		}
	}

	@Override
	public CreateBatchJobsResponse getInstance(UnmarshallerContext context) {
		return	CreateBatchJobsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
