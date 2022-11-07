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

package com.aliyuncs.schedulerx2.model.v20190430;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.schedulerx2.transform.v20190430.ListJobsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListJobsResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private Boolean success;

	private Data data;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<Job> jobs;

		public List<Job> getJobs() {
			return this.jobs;
		}

		public void setJobs(List<Job> jobs) {
			this.jobs = jobs;
		}

		public static class Job {

			private Integer status;

			private String jarUrl;

			private Integer maxAttempt;

			private String parameters;

			private String description;

			private Long jobId;

			private String executeMode;

			private String maxConcurrency;

			private String name;

			private String className;

			private String content;

			private String jobType;

			private Integer attemptInterval;

			private String xAttrs;

			private MapTaskXAttrs mapTaskXAttrs;

			private TimeConfig timeConfig;

			private JobMonitorInfo jobMonitorInfo;

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public String getJarUrl() {
				return this.jarUrl;
			}

			public void setJarUrl(String jarUrl) {
				this.jarUrl = jarUrl;
			}

			public Integer getMaxAttempt() {
				return this.maxAttempt;
			}

			public void setMaxAttempt(Integer maxAttempt) {
				this.maxAttempt = maxAttempt;
			}

			public String getParameters() {
				return this.parameters;
			}

			public void setParameters(String parameters) {
				this.parameters = parameters;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public Long getJobId() {
				return this.jobId;
			}

			public void setJobId(Long jobId) {
				this.jobId = jobId;
			}

			public String getExecuteMode() {
				return this.executeMode;
			}

			public void setExecuteMode(String executeMode) {
				this.executeMode = executeMode;
			}

			public String getMaxConcurrency() {
				return this.maxConcurrency;
			}

			public void setMaxConcurrency(String maxConcurrency) {
				this.maxConcurrency = maxConcurrency;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getClassName() {
				return this.className;
			}

			public void setClassName(String className) {
				this.className = className;
			}

			public String getContent() {
				return this.content;
			}

			public void setContent(String content) {
				this.content = content;
			}

			public String getJobType() {
				return this.jobType;
			}

			public void setJobType(String jobType) {
				this.jobType = jobType;
			}

			public Integer getAttemptInterval() {
				return this.attemptInterval;
			}

			public void setAttemptInterval(Integer attemptInterval) {
				this.attemptInterval = attemptInterval;
			}

			public String getXAttrs() {
				return this.xAttrs;
			}

			public void setXAttrs(String xAttrs) {
				this.xAttrs = xAttrs;
			}

			public MapTaskXAttrs getMapTaskXAttrs() {
				return this.mapTaskXAttrs;
			}

			public void setMapTaskXAttrs(MapTaskXAttrs mapTaskXAttrs) {
				this.mapTaskXAttrs = mapTaskXAttrs;
			}

			public TimeConfig getTimeConfig() {
				return this.timeConfig;
			}

			public void setTimeConfig(TimeConfig timeConfig) {
				this.timeConfig = timeConfig;
			}

			public JobMonitorInfo getJobMonitorInfo() {
				return this.jobMonitorInfo;
			}

			public void setJobMonitorInfo(JobMonitorInfo jobMonitorInfo) {
				this.jobMonitorInfo = jobMonitorInfo;
			}

			public static class MapTaskXAttrs {

				private Integer taskMaxAttempt;

				private Integer taskAttemptInterval;

				private Integer consumerSize;

				private Integer queueSize;

				private Integer dispatcherSize;

				private Integer pageSize;

				public Integer getTaskMaxAttempt() {
					return this.taskMaxAttempt;
				}

				public void setTaskMaxAttempt(Integer taskMaxAttempt) {
					this.taskMaxAttempt = taskMaxAttempt;
				}

				public Integer getTaskAttemptInterval() {
					return this.taskAttemptInterval;
				}

				public void setTaskAttemptInterval(Integer taskAttemptInterval) {
					this.taskAttemptInterval = taskAttemptInterval;
				}

				public Integer getConsumerSize() {
					return this.consumerSize;
				}

				public void setConsumerSize(Integer consumerSize) {
					this.consumerSize = consumerSize;
				}

				public Integer getQueueSize() {
					return this.queueSize;
				}

				public void setQueueSize(Integer queueSize) {
					this.queueSize = queueSize;
				}

				public Integer getDispatcherSize() {
					return this.dispatcherSize;
				}

				public void setDispatcherSize(Integer dispatcherSize) {
					this.dispatcherSize = dispatcherSize;
				}

				public Integer getPageSize() {
					return this.pageSize;
				}

				public void setPageSize(Integer pageSize) {
					this.pageSize = pageSize;
				}
			}

			public static class TimeConfig {

				private String calendar;

				private Integer timeType;

				private Integer dataOffset;

				private String timeExpression;

				public String getCalendar() {
					return this.calendar;
				}

				public void setCalendar(String calendar) {
					this.calendar = calendar;
				}

				public Integer getTimeType() {
					return this.timeType;
				}

				public void setTimeType(Integer timeType) {
					this.timeType = timeType;
				}

				public Integer getDataOffset() {
					return this.dataOffset;
				}

				public void setDataOffset(Integer dataOffset) {
					this.dataOffset = dataOffset;
				}

				public String getTimeExpression() {
					return this.timeExpression;
				}

				public void setTimeExpression(String timeExpression) {
					this.timeExpression = timeExpression;
				}
			}

			public static class JobMonitorInfo {

				private List<ContactInfoItem> contactInfo;

				private MonitorConfig monitorConfig;

				public List<ContactInfoItem> getContactInfo() {
					return this.contactInfo;
				}

				public void setContactInfo(List<ContactInfoItem> contactInfo) {
					this.contactInfo = contactInfo;
				}

				public MonitorConfig getMonitorConfig() {
					return this.monitorConfig;
				}

				public void setMonitorConfig(MonitorConfig monitorConfig) {
					this.monitorConfig = monitorConfig;
				}

				public static class ContactInfoItem {

					private String userPhone;

					private String userName;

					private String ding;

					private String userMail;

					public String getUserPhone() {
						return this.userPhone;
					}

					public void setUserPhone(String userPhone) {
						this.userPhone = userPhone;
					}

					public String getUserName() {
						return this.userName;
					}

					public void setUserName(String userName) {
						this.userName = userName;
					}

					public String getDing() {
						return this.ding;
					}

					public void setDing(String ding) {
						this.ding = ding;
					}

					public String getUserMail() {
						return this.userMail;
					}

					public void setUserMail(String userMail) {
						this.userMail = userMail;
					}
				}

				public static class MonitorConfig {

					private Long timeout;

					private String sendChannel;

					private Boolean timeoutKillEnable;

					private Boolean timeoutEnable;

					private Boolean failEnable;

					private Boolean missWorkerEnable;

					public Long getTimeout() {
						return this.timeout;
					}

					public void setTimeout(Long timeout) {
						this.timeout = timeout;
					}

					public String getSendChannel() {
						return this.sendChannel;
					}

					public void setSendChannel(String sendChannel) {
						this.sendChannel = sendChannel;
					}

					public Boolean getTimeoutKillEnable() {
						return this.timeoutKillEnable;
					}

					public void setTimeoutKillEnable(Boolean timeoutKillEnable) {
						this.timeoutKillEnable = timeoutKillEnable;
					}

					public Boolean getTimeoutEnable() {
						return this.timeoutEnable;
					}

					public void setTimeoutEnable(Boolean timeoutEnable) {
						this.timeoutEnable = timeoutEnable;
					}

					public Boolean getFailEnable() {
						return this.failEnable;
					}

					public void setFailEnable(Boolean failEnable) {
						this.failEnable = failEnable;
					}

					public Boolean getMissWorkerEnable() {
						return this.missWorkerEnable;
					}

					public void setMissWorkerEnable(Boolean missWorkerEnable) {
						this.missWorkerEnable = missWorkerEnable;
					}
				}
			}
		}
	}

	@Override
	public ListJobsResponse getInstance(UnmarshallerContext context) {
		return	ListJobsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
