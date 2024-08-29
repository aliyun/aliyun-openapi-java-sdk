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
import com.aliyuncs.outboundbot.transform.v20191226.QueryJobsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryJobsResponse extends AcsResponse {

	private Integer httpStatusCode;

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private Jobs jobs;

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

	public Jobs getJobs() {
		return this.jobs;
	}

	public void setJobs(Jobs jobs) {
		this.jobs = jobs;
	}

	public static class Jobs {

		private Integer pageNumber;

		private Integer pageSize;

		private Integer totalCount;

		private List<Job> list;

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

		public List<Job> getList() {
			return this.list;
		}

		public void setList(List<Job> list) {
			this.list = list;
		}

		public static class Job {

			private String status;

			private String jobGroupId;

			private String scenarioId;

			private String strategyId;

			private String jobId;

			private Integer priority;

			private String failureReason;

			private String referenceId;

			private List<Contact> contacts;

			private List<KeyValuePair> extras;

			private List<SummaryItem> summary;

			private List<Task> tasks;

			private List<TagHit> tagHits;

			private List<String> callingNumbers;

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

			public String getFailureReason() {
				return this.failureReason;
			}

			public void setFailureReason(String failureReason) {
				this.failureReason = failureReason;
			}

			public String getReferenceId() {
				return this.referenceId;
			}

			public void setReferenceId(String referenceId) {
				this.referenceId = referenceId;
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

			public List<TagHit> getTagHits() {
				return this.tagHits;
			}

			public void setTagHits(List<TagHit> tagHits) {
				this.tagHits = tagHits;
			}

			public List<String> getCallingNumbers() {
				return this.callingNumbers;
			}

			public void setCallingNumbers(List<String> callingNumbers) {
				this.callingNumbers = callingNumbers;
			}

			public static class Contact {

				private String phoneNumber;

				private String state;

				private String contactId;

				private String honorific;

				private String jobId;

				private String contactName;

				private String role;

				private String referenceId;

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

				public String getContactId() {
					return this.contactId;
				}

				public void setContactId(String contactId) {
					this.contactId = contactId;
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

				public String getContactName() {
					return this.contactName;
				}

				public void setContactName(String contactName) {
					this.contactName = contactName;
				}

				public String getRole() {
					return this.role;
				}

				public void setRole(String role) {
					this.role = role;
				}

				public String getReferenceId() {
					return this.referenceId;
				}

				public void setReferenceId(String referenceId) {
					this.referenceId = referenceId;
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

				private String summaryName;

				private String groupId;

				private String jobId;

				private String category;

				private String taskId;

				private String content;

				private String conversationDetailId;

				private String summaryId;

				public String getSummaryName() {
					return this.summaryName;
				}

				public void setSummaryName(String summaryName) {
					this.summaryName = summaryName;
				}

				public String getGroupId() {
					return this.groupId;
				}

				public void setGroupId(String groupId) {
					this.groupId = groupId;
				}

				public String getJobId() {
					return this.jobId;
				}

				public void setJobId(String jobId) {
					this.jobId = jobId;
				}

				public String getCategory() {
					return this.category;
				}

				public void setCategory(String category) {
					this.category = category;
				}

				public String getTaskId() {
					return this.taskId;
				}

				public void setTaskId(String taskId) {
					this.taskId = taskId;
				}

				public String getContent() {
					return this.content;
				}

				public void setContent(String content) {
					this.content = content;
				}

				public String getConversationDetailId() {
					return this.conversationDetailId;
				}

				public void setConversationDetailId(String conversationDetailId) {
					this.conversationDetailId = conversationDetailId;
				}

				public String getSummaryId() {
					return this.summaryId;
				}

				public void setSummaryId(String summaryId) {
					this.summaryId = summaryId;
				}
			}

			public static class Task {

				private String status;

				private Long planedTime;

				private String chatbotId;

				private Long actualTime;

				private String calledNumber;

				private String scenarioId;

				private String jobId;

				private String callId;

				private String callingNumber;

				private String brief;

				private Integer duration;

				private String taskId;

				private Contact1 contact1;

				public String getStatus() {
					return this.status;
				}

				public void setStatus(String status) {
					this.status = status;
				}

				public Long getPlanedTime() {
					return this.planedTime;
				}

				public void setPlanedTime(Long planedTime) {
					this.planedTime = planedTime;
				}

				public String getChatbotId() {
					return this.chatbotId;
				}

				public void setChatbotId(String chatbotId) {
					this.chatbotId = chatbotId;
				}

				public Long getActualTime() {
					return this.actualTime;
				}

				public void setActualTime(Long actualTime) {
					this.actualTime = actualTime;
				}

				public String getCalledNumber() {
					return this.calledNumber;
				}

				public void setCalledNumber(String calledNumber) {
					this.calledNumber = calledNumber;
				}

				public String getScenarioId() {
					return this.scenarioId;
				}

				public void setScenarioId(String scenarioId) {
					this.scenarioId = scenarioId;
				}

				public String getJobId() {
					return this.jobId;
				}

				public void setJobId(String jobId) {
					this.jobId = jobId;
				}

				public String getCallId() {
					return this.callId;
				}

				public void setCallId(String callId) {
					this.callId = callId;
				}

				public String getCallingNumber() {
					return this.callingNumber;
				}

				public void setCallingNumber(String callingNumber) {
					this.callingNumber = callingNumber;
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

				public String getTaskId() {
					return this.taskId;
				}

				public void setTaskId(String taskId) {
					this.taskId = taskId;
				}

				public Contact1 getContact1() {
					return this.contact1;
				}

				public void setContact1(Contact1 contact1) {
					this.contact1 = contact1;
				}

				public static class Contact1 {

					private String phoneNumber;

					private String state;

					private String contactId;

					private String honorific;

					private String jobId;

					private String contactName;

					private String role;

					private String referenceId;

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

					public String getContactId() {
						return this.contactId;
					}

					public void setContactId(String contactId) {
						this.contactId = contactId;
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

					public String getContactName() {
						return this.contactName;
					}

					public void setContactName(String contactName) {
						this.contactName = contactName;
					}

					public String getRole() {
						return this.role;
					}

					public void setRole(String role) {
						this.role = role;
					}

					public String getReferenceId() {
						return this.referenceId;
					}

					public void setReferenceId(String referenceId) {
						this.referenceId = referenceId;
					}
				}
			}

			public static class TagHit {

				private String tagName;

				private String tagGroup;

				public String getTagName() {
					return this.tagName;
				}

				public void setTagName(String tagName) {
					this.tagName = tagName;
				}

				public String getTagGroup() {
					return this.tagGroup;
				}

				public void setTagGroup(String tagGroup) {
					this.tagGroup = tagGroup;
				}
			}
		}
	}

	@Override
	public QueryJobsResponse getInstance(UnmarshallerContext context) {
		return	QueryJobsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
