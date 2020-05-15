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
import com.aliyuncs.outboundbot.transform.v20191226.ListJobsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListJobsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private List<Job> jobs;

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

	public List<Job> getJobs() {
		return this.jobs;
	}

	public void setJobs(List<Job> jobs) {
		this.jobs = jobs;
	}

	public static class Job {

		private String jobId;

		private String jobGroupId;

		private String scenarioId;

		private String strategyId;

		private Integer priority;

		private Integer systemPriority;

		private String status;

		private String referenceId;

		private String failureReason;

		private List<Contact> contacts;

		private List<KeyValuePair> extras;

		private List<Task> tasks;

		private List<SummaryItem3> summary;

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

		public String getScenarioId() {
			return this.scenarioId;
		}

		public void setScenarioId(String scenarioId) {
			this.scenarioId = scenarioId;
		}

		public String getStrategyId() {
			return this.strategyId;
		}

		public void setStrategyId(String strategyId) {
			this.strategyId = strategyId;
		}

		public Integer getPriority() {
			return this.priority;
		}

		public void setPriority(Integer priority) {
			this.priority = priority;
		}

		public Integer getSystemPriority() {
			return this.systemPriority;
		}

		public void setSystemPriority(Integer systemPriority) {
			this.systemPriority = systemPriority;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getReferenceId() {
			return this.referenceId;
		}

		public void setReferenceId(String referenceId) {
			this.referenceId = referenceId;
		}

		public String getFailureReason() {
			return this.failureReason;
		}

		public void setFailureReason(String failureReason) {
			this.failureReason = failureReason;
		}

		public List<Contact> getContacts() {
			return this.contacts;
		}

		public void setContacts(List<Contact> contacts) {
			this.contacts = contacts;
		}

		public List<KeyValuePair> getExtras() {
			return this.extras;
		}

		public void setExtras(List<KeyValuePair> extras) {
			this.extras = extras;
		}

		public List<Task> getTasks() {
			return this.tasks;
		}

		public void setTasks(List<Task> tasks) {
			this.tasks = tasks;
		}

		public List<SummaryItem3> getSummary() {
			return this.summary;
		}

		public void setSummary(List<SummaryItem3> summary) {
			this.summary = summary;
		}

		public List<String> getCallingNumbers() {
			return this.callingNumbers;
		}

		public void setCallingNumbers(List<String> callingNumbers) {
			this.callingNumbers = callingNumbers;
		}

		public static class Contact {

			private String contactId;

			private String contactName;

			private String honorific;

			private String role;

			private String phoneNumber;

			private String state;

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

			public String getRole() {
				return this.role;
			}

			public void setRole(String role) {
				this.role = role;
			}

			public String getPhoneNumber() {
				return this.phoneNumber;
			}

			public void setPhoneNumber(String phoneNumber) {
				this.phoneNumber = phoneNumber;
			}

			public String getState() {
				return this.state;
			}

			public void setState(String state) {
				this.state = state;
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

		public static class Task {

			private String taskId;

			private String jobId;

			private String scenarioId;

			private String chatbotId;

			private Long planedTime;

			private Long actualTime;

			private String callingNumber;

			private String calledNumber;

			private String callId;

			private String status;

			private String brief;

			private Integer duration;

			private List<ConversationDetail> conversation;

			private Contact2 contact2;

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

			public String getScenarioId() {
				return this.scenarioId;
			}

			public void setScenarioId(String scenarioId) {
				this.scenarioId = scenarioId;
			}

			public String getChatbotId() {
				return this.chatbotId;
			}

			public void setChatbotId(String chatbotId) {
				this.chatbotId = chatbotId;
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

			public String getBrief() {
				return this.brief;
			}

			public void setBrief(String brief) {
				this.brief = brief;
			}

			public Integer getDuration() {
				return this.duration;
			}

			public void setDuration(Integer duration) {
				this.duration = duration;
			}

			public List<ConversationDetail> getConversation() {
				return this.conversation;
			}

			public void setConversation(List<ConversationDetail> conversation) {
				this.conversation = conversation;
			}

			public Contact2 getContact2() {
				return this.contact2;
			}

			public void setContact2(Contact2 contact2) {
				this.contact2 = contact2;
			}

			public static class ConversationDetail {

				private Long timestamp;

				private String speaker;

				private String script;

				private List<SummaryItem> summary1;

				public Long getTimestamp() {
					return this.timestamp;
				}

				public void setTimestamp(Long timestamp) {
					this.timestamp = timestamp;
				}

				public String getSpeaker() {
					return this.speaker;
				}

				public void setSpeaker(String speaker) {
					this.speaker = speaker;
				}

				public String getScript() {
					return this.script;
				}

				public void setScript(String script) {
					this.script = script;
				}

				public List<SummaryItem> getSummary1() {
					return this.summary1;
				}

				public void setSummary1(List<SummaryItem> summary1) {
					this.summary1 = summary1;
				}

				public static class SummaryItem {

					private String category;

					private String summaryName;

					private String content;

					public String getCategory() {
						return this.category;
					}

					public void setCategory(String category) {
						this.category = category;
					}

					public String getSummaryName() {
						return this.summaryName;
					}

					public void setSummaryName(String summaryName) {
						this.summaryName = summaryName;
					}

					public String getContent() {
						return this.content;
					}

					public void setContent(String content) {
						this.content = content;
					}
				}
			}

			public static class Contact2 {

				private String contactId;

				private String contactName;

				private String honorific;

				private String role;

				private String phoneNumber;

				private String state;

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

				public String getRole() {
					return this.role;
				}

				public void setRole(String role) {
					this.role = role;
				}

				public String getPhoneNumber() {
					return this.phoneNumber;
				}

				public void setPhoneNumber(String phoneNumber) {
					this.phoneNumber = phoneNumber;
				}

				public String getState() {
					return this.state;
				}

				public void setState(String state) {
					this.state = state;
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

		public static class SummaryItem3 {

			private String category;

			private String summaryName;

			private String content;

			public String getCategory() {
				return this.category;
			}

			public void setCategory(String category) {
				this.category = category;
			}

			public String getSummaryName() {
				return this.summaryName;
			}

			public void setSummaryName(String summaryName) {
				this.summaryName = summaryName;
			}

			public String getContent() {
				return this.content;
			}

			public void setContent(String content) {
				this.content = content;
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
