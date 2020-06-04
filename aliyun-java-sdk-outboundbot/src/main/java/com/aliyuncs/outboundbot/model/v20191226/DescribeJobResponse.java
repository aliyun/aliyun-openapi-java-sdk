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
import com.aliyuncs.outboundbot.transform.v20191226.DescribeJobResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeJobResponse extends AcsResponse {

	private String code;

	private Integer httpStatusCode;

	private String message;

	private String requestId;

	private Boolean success;

	private Job job;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
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

	public Job getJob() {
		return this.job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public static class Job {

		private String failureReason;

		private String jobGroupId;

		private String jobId;

		private Integer priority;

		private String referenceId;

		private String scenarioId;

		private String status;

		private String strategyId;

		private Integer systemPriority;

		private List<Contact> contacts;

		private List<KeyValuePair> extras;

		private List<SummaryItem> summary;

		private List<Task> tasks;

		private List<String> callingNumbers;

		public String getFailureReason() {
			return this.failureReason;
		}

		public void setFailureReason(String failureReason) {
			this.failureReason = failureReason;
		}

		public String getJobGroupId() {
			return this.jobGroupId;
		}

		public void setJobGroupId(String jobGroupId) {
			this.jobGroupId = jobGroupId;
		}

		public String getJobId() {
			return this.jobId;
		}

		public void setJobId(String jobId) {
			this.jobId = jobId;
		}

		public Integer getPriority() {
			return this.priority;
		}

		public void setPriority(Integer priority) {
			this.priority = priority;
		}

		public String getReferenceId() {
			return this.referenceId;
		}

		public void setReferenceId(String referenceId) {
			this.referenceId = referenceId;
		}

		public String getScenarioId() {
			return this.scenarioId;
		}

		public void setScenarioId(String scenarioId) {
			this.scenarioId = scenarioId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getStrategyId() {
			return this.strategyId;
		}

		public void setStrategyId(String strategyId) {
			this.strategyId = strategyId;
		}

		public Integer getSystemPriority() {
			return this.systemPriority;
		}

		public void setSystemPriority(Integer systemPriority) {
			this.systemPriority = systemPriority;
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

		public List<SummaryItem> getSummary() {
			return this.summary;
		}

		public void setSummary(List<SummaryItem> summary) {
			this.summary = summary;
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

		public static class Contact {

			private String contactId;

			private String contactName;

			private String honorific;

			private String jobId;

			private String phoneNumber;

			private String referenceId;

			private String role;

			private String state;

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

			public String getJobId() {
				return this.jobId;
			}

			public void setJobId(String jobId) {
				this.jobId = jobId;
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

			public String getRole() {
				return this.role;
			}

			public void setRole(String role) {
				this.role = role;
			}

			public String getState() {
				return this.state;
			}

			public void setState(String state) {
				this.state = state;
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

		public static class SummaryItem {

			private String category;

			private String content;

			private String summaryName;

			public String getCategory() {
				return this.category;
			}

			public void setCategory(String category) {
				this.category = category;
			}

			public String getContent() {
				return this.content;
			}

			public void setContent(String content) {
				this.content = content;
			}

			public String getSummaryName() {
				return this.summaryName;
			}

			public void setSummaryName(String summaryName) {
				this.summaryName = summaryName;
			}
		}

		public static class Task {

			private Long actualTime;

			private String brief;

			private String callId;

			private String calledNumber;

			private String callingNumber;

			private String chatbotId;

			private Integer duration;

			private String jobId;

			private Long planedTime;

			private String scenarioId;

			private String status;

			private String taskId;

			private List<ConversationDetail> conversation;

			private Contact3 contact3;

			public Long getActualTime() {
				return this.actualTime;
			}

			public void setActualTime(Long actualTime) {
				this.actualTime = actualTime;
			}

			public String getBrief() {
				return this.brief;
			}

			public void setBrief(String brief) {
				this.brief = brief;
			}

			public String getCallId() {
				return this.callId;
			}

			public void setCallId(String callId) {
				this.callId = callId;
			}

			public String getCalledNumber() {
				return this.calledNumber;
			}

			public void setCalledNumber(String calledNumber) {
				this.calledNumber = calledNumber;
			}

			public String getCallingNumber() {
				return this.callingNumber;
			}

			public void setCallingNumber(String callingNumber) {
				this.callingNumber = callingNumber;
			}

			public String getChatbotId() {
				return this.chatbotId;
			}

			public void setChatbotId(String chatbotId) {
				this.chatbotId = chatbotId;
			}

			public Integer getDuration() {
				return this.duration;
			}

			public void setDuration(Integer duration) {
				this.duration = duration;
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

			public String getScenarioId() {
				return this.scenarioId;
			}

			public void setScenarioId(String scenarioId) {
				this.scenarioId = scenarioId;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getTaskId() {
				return this.taskId;
			}

			public void setTaskId(String taskId) {
				this.taskId = taskId;
			}

			public List<ConversationDetail> getConversation() {
				return this.conversation;
			}

			public void setConversation(List<ConversationDetail> conversation) {
				this.conversation = conversation;
			}

			public Contact3 getContact3() {
				return this.contact3;
			}

			public void setContact3(Contact3 contact3) {
				this.contact3 = contact3;
			}

			public static class ConversationDetail {

				private String script;

				private String speaker;

				private Long timestamp;

				private List<SummaryItem2> summary1;

				public String getScript() {
					return this.script;
				}

				public void setScript(String script) {
					this.script = script;
				}

				public String getSpeaker() {
					return this.speaker;
				}

				public void setSpeaker(String speaker) {
					this.speaker = speaker;
				}

				public Long getTimestamp() {
					return this.timestamp;
				}

				public void setTimestamp(Long timestamp) {
					this.timestamp = timestamp;
				}

				public List<SummaryItem2> getSummary1() {
					return this.summary1;
				}

				public void setSummary1(List<SummaryItem2> summary1) {
					this.summary1 = summary1;
				}

				public static class SummaryItem2 {

					private String category;

					private String content;

					private String summaryName;

					public String getCategory() {
						return this.category;
					}

					public void setCategory(String category) {
						this.category = category;
					}

					public String getContent() {
						return this.content;
					}

					public void setContent(String content) {
						this.content = content;
					}

					public String getSummaryName() {
						return this.summaryName;
					}

					public void setSummaryName(String summaryName) {
						this.summaryName = summaryName;
					}
				}
			}

			public static class Contact3 {

				private String contactId;

				private String contactName;

				private String honorific;

				private String jobId;

				private String phoneNumber;

				private String referenceId;

				private String role;

				private String state;

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

				public String getJobId() {
					return this.jobId;
				}

				public void setJobId(String jobId) {
					this.jobId = jobId;
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

				public String getRole() {
					return this.role;
				}

				public void setRole(String role) {
					this.role = role;
				}

				public String getState() {
					return this.state;
				}

				public void setState(String state) {
					this.state = state;
				}
			}
		}
	}

	@Override
	public DescribeJobResponse getInstance(UnmarshallerContext context) {
		return	DescribeJobResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
