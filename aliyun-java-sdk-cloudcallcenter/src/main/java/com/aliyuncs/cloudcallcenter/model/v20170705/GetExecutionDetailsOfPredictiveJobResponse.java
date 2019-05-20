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
import com.aliyuncs.cloudcallcenter.transform.v20170705.GetExecutionDetailsOfPredictiveJobResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetExecutionDetailsOfPredictiveJobResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private Job job;

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

	public Job getJob() {
		return this.job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public static class Job {

		private String jobId;

		private String jobGroupId;

		private String strategyId;

		private String status;

		private String failureReason;

		private List<Task> tasks;

		private List<String> callingNumbers;

		public String getJobId() {
			return this.jobId;
		}

		public void setJobId(String jobId) {
			this.jobId = jobId;
		}

		public String getJobGroupId() {
			return this.jobGroupId;
		}

		public void setJobGroupId(String jobGroupId) {
			this.jobGroupId = jobGroupId;
		}

		public String getStrategyId() {
			return this.strategyId;
		}

		public void setStrategyId(String strategyId) {
			this.strategyId = strategyId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getFailureReason() {
			return this.failureReason;
		}

		public void setFailureReason(String failureReason) {
			this.failureReason = failureReason;
		}

		public List<Task> getTasks() {
			return this.tasks;
		}

		public void setTasks(List<Task> tasks) {
			this.tasks = tasks;
		}

		public List<String> getCallingNumbers() {
			return this.callingNumbers;
		}

		public void setCallingNumbers(List<String> callingNumbers) {
			this.callingNumbers = callingNumbers;
		}

		public static class Task {

			private String taskId;

			private String jobId;

			private Long planedTime;

			private Long actualTime;

			private Long endTime;

			private String callingNumber;

			private String calledNumber;

			private String callId;

			private String status;

			private Integer duration;

			private Contact contact;

			public String getTaskId() {
				return this.taskId;
			}

			public void setTaskId(String taskId) {
				this.taskId = taskId;
			}

			public String getJobId() {
				return this.jobId;
			}

			public void setJobId(String jobId) {
				this.jobId = jobId;
			}

			public Long getPlanedTime() {
				return this.planedTime;
			}

			public void setPlanedTime(Long planedTime) {
				this.planedTime = planedTime;
			}

			public Long getActualTime() {
				return this.actualTime;
			}

			public void setActualTime(Long actualTime) {
				this.actualTime = actualTime;
			}

			public Long getEndTime() {
				return this.endTime;
			}

			public void setEndTime(Long endTime) {
				this.endTime = endTime;
			}

			public String getCallingNumber() {
				return this.callingNumber;
			}

			public void setCallingNumber(String callingNumber) {
				this.callingNumber = callingNumber;
			}

			public String getCalledNumber() {
				return this.calledNumber;
			}

			public void setCalledNumber(String calledNumber) {
				this.calledNumber = calledNumber;
			}

			public String getCallId() {
				return this.callId;
			}

			public void setCallId(String callId) {
				this.callId = callId;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public Integer getDuration() {
				return this.duration;
			}

			public void setDuration(Integer duration) {
				this.duration = duration;
			}

			public Contact getContact() {
				return this.contact;
			}

			public void setContact(Contact contact) {
				this.contact = contact;
			}

			public static class Contact {

				private String contactId;

				private String contactName;

				private String honorific;

				private String phoneNumber;

				private String referenceId;

				private String jobId;

				public String getContactId() {
					return this.contactId;
				}

				public void setContactId(String contactId) {
					this.contactId = contactId;
				}

				public String getContactName() {
					return this.contactName;
				}

				public void setContactName(String contactName) {
					this.contactName = contactName;
				}

				public String getHonorific() {
					return this.honorific;
				}

				public void setHonorific(String honorific) {
					this.honorific = honorific;
				}

				public String getPhoneNumber() {
					return this.phoneNumber;
				}

				public void setPhoneNumber(String phoneNumber) {
					this.phoneNumber = phoneNumber;
				}

				public String getReferenceId() {
					return this.referenceId;
				}

				public void setReferenceId(String referenceId) {
					this.referenceId = referenceId;
				}

				public String getJobId() {
					return this.jobId;
				}

				public void setJobId(String jobId) {
					this.jobId = jobId;
				}
			}
		}
	}

	@Override
	public GetExecutionDetailsOfPredictiveJobResponse getInstance(UnmarshallerContext context) {
		return	GetExecutionDetailsOfPredictiveJobResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
