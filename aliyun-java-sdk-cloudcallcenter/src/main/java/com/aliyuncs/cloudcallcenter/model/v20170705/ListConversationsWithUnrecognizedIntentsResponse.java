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
import com.aliyuncs.cloudcallcenter.transform.v20170705.ListConversationsWithUnrecognizedIntentsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListConversationsWithUnrecognizedIntentsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private List<Task> tasks;

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

	public List<Task> getTasks() {
		return this.tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	public static class Task {

		private String taskId;

		private String jobId;

		private List<ConversationDetail> conversation;

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

		public List<ConversationDetail> getConversation() {
			return this.conversation;
		}

		public void setConversation(List<ConversationDetail> conversation) {
			this.conversation = conversation;
		}

		public Contact getContact() {
			return this.contact;
		}

		public void setContact(Contact contact) {
			this.contact = contact;
		}

		public static class ConversationDetail {

			private Long timestamp;

			private String speaker;

			private String script;

			private List<SummaryItem> summary;

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

			public List<SummaryItem> getSummary() {
				return this.summary;
			}

			public void setSummary(List<SummaryItem> summary) {
				this.summary = summary;
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
	}

	@Override
	public ListConversationsWithUnrecognizedIntentsResponse getInstance(UnmarshallerContext context) {
		return	ListConversationsWithUnrecognizedIntentsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
