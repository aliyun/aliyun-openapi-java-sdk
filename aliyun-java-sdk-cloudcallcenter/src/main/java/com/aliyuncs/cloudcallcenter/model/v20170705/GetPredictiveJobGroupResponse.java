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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudcallcenter.transform.v20170705.GetPredictiveJobGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetPredictiveJobGroupResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private JobGroup jobGroup;

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

	public JobGroup getJobGroup() {
		return this.jobGroup;
	}

	public void setJobGroup(JobGroup jobGroup) {
		this.jobGroup = jobGroup;
	}

	public static class JobGroup {

		private String jobGroupId;

		private String instanceId;

		private String skillGroupId;

		private String skillGroupName;

		private String name;

		private String description;

		private Long creationTime;

		private Progress progress;

		private Strategy strategy;

		public String getJobGroupId() {
			return this.jobGroupId;
		}

		public void setJobGroupId(String jobGroupId) {
			this.jobGroupId = jobGroupId;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getSkillGroupId() {
			return this.skillGroupId;
		}

		public void setSkillGroupId(String skillGroupId) {
			this.skillGroupId = skillGroupId;
		}

		public String getSkillGroupName() {
			return this.skillGroupName;
		}

		public void setSkillGroupName(String skillGroupName) {
			this.skillGroupName = skillGroupName;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Long getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(Long creationTime) {
			this.creationTime = creationTime;
		}

		public Progress getProgress() {
			return this.progress;
		}

		public void setProgress(Progress progress) {
			this.progress = progress;
		}

		public Strategy getStrategy() {
			return this.strategy;
		}

		public void setStrategy(Strategy strategy) {
			this.strategy = strategy;
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

		public static class Strategy {

			private String strategyId;

			private Long startTime;

			private Long endTime;

			private Integer maxAttemptsPerDay;

			private Integer minAttemptInterval;

			private List<TimeFrame> workingTime;

			public String getStrategyId() {
				return this.strategyId;
			}

			public void setStrategyId(String strategyId) {
				this.strategyId = strategyId;
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

			public List<TimeFrame> getWorkingTime() {
				return this.workingTime;
			}

			public void setWorkingTime(List<TimeFrame> workingTime) {
				this.workingTime = workingTime;
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
	}

	@Override
	public GetPredictiveJobGroupResponse getInstance(UnmarshallerContext context) {
		return	GetPredictiveJobGroupResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
