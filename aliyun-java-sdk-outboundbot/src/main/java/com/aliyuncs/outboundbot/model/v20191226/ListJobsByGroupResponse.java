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
import com.aliyuncs.outboundbot.transform.v20191226.ListJobsByGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListJobsByGroupResponse extends AcsResponse {

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

			private String scenarioId;

			private String jobGroupId;

			private String strategyId;

			private String jobId;

			private Integer priority;

			private Integer systemPriority;

			private String failureReason;

			private String referenceId;

			private List<Contact> contacts;

			private List<KeyValuePair> extras;

			private List<SummaryItem> summary;

			private List<String> callingNumbers;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getScenarioId() {
				return this.scenarioId;
			}

			public void setScenarioId(String scenarioId) {
				this.scenarioId = scenarioId;
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

			public Integer getSystemPriority() {
				return this.systemPriority;
			}

			public void setSystemPriority(Integer systemPriority) {
				this.systemPriority = systemPriority;
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

				private String jobGroupId;

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
		}
	}

	@Override
	public ListJobsByGroupResponse getInstance(UnmarshallerContext context) {
		return	ListJobsByGroupResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
