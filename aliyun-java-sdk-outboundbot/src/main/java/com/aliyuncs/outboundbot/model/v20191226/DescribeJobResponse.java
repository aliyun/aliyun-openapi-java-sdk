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

	private Integer httpStatusCode;

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private Job job;

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

	public Job getJob() {
		return this.job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public static class Job {

		private String status;

		private Long actualTime;

		private Integer priority;

		private String dsReport;

		private Long nextExecutionTime;

		private String failureReason;

		private Integer systemPriority;

		private String instanceId;

		private String calledNumber;

		private String referenceId;

		private String jobGroupId;

		private String scenarioId;

		private String strategyId;

		private Integer endReason;

		private String jobId;

		private List<Contact> contacts;

		private List<KeyValuePair> extras;

		private List<SummaryItem> summary;

		private List<Task> tasks;

		private List<String> callingNumbers;

		private Script script;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Long getActualTime() {
			return this.actualTime;
		}

		public void setActualTime(Long actualTime) {
			this.actualTime = actualTime;
		}

		public Integer getPriority() {
			return this.priority;
		}

		public void setPriority(Integer priority) {
			this.priority = priority;
		}

		public String getDsReport() {
			return this.dsReport;
		}

		public void setDsReport(String dsReport) {
			this.dsReport = dsReport;
		}

		public Long getNextExecutionTime() {
			return this.nextExecutionTime;
		}

		public void setNextExecutionTime(Long nextExecutionTime) {
			this.nextExecutionTime = nextExecutionTime;
		}

		public String getFailureReason() {
			return this.failureReason;
		}

		public void setFailureReason(String failureReason) {
			this.failureReason = failureReason;
		}

		public Integer getSystemPriority() {
			return this.systemPriority;
		}

		public void setSystemPriority(Integer systemPriority) {
			this.systemPriority = systemPriority;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getCalledNumber() {
			return this.calledNumber;
		}

		public void setCalledNumber(String calledNumber) {
			this.calledNumber = calledNumber;
		}

		public String getReferenceId() {
			return this.referenceId;
		}

		public void setReferenceId(String referenceId) {
			this.referenceId = referenceId;
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

		public Integer getEndReason() {
			return this.endReason;
		}

		public void setEndReason(Integer endReason) {
			this.endReason = endReason;
		}

		public String getJobId() {
			return this.jobId;
		}

		public void setJobId(String jobId) {
			this.jobId = jobId;
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

		public Script getScript() {
			return this.script;
		}

		public void setScript(Script script) {
			this.script = script;
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

			private String category;

			private String content;

			public String getSummaryName() {
				return this.summaryName;
			}

			public void setSummaryName(String summaryName) {
				this.summaryName = summaryName;
			}

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
		}

		public static class Task {

			private String status;

			private Long planedTime;

			private String chatbotId;

			private Long actualTime;

			private String calledNumber;

			private Long endTime;

			private String scenarioId;

			private String endReason;

			private String jobId;

			private String callId;

			private String callingNumber;

			private String brief;

			private Integer duration;

			private String taskId;

			private String hangUpDirection;

			private Long ringingDuration;

			private List<ConversationDetail> conversation;

			private Contact3 contact3;

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

			public Long getEndTime() {
				return this.endTime;
			}

			public void setEndTime(Long endTime) {
				this.endTime = endTime;
			}

			public String getScenarioId() {
				return this.scenarioId;
			}

			public void setScenarioId(String scenarioId) {
				this.scenarioId = scenarioId;
			}

			public String getEndReason() {
				return this.endReason;
			}

			public void setEndReason(String endReason) {
				this.endReason = endReason;
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

			public String getHangUpDirection() {
				return this.hangUpDirection;
			}

			public void setHangUpDirection(String hangUpDirection) {
				this.hangUpDirection = hangUpDirection;
			}

			public Long getRingingDuration() {
				return this.ringingDuration;
			}

			public void setRingingDuration(Long ringingDuration) {
				this.ringingDuration = ringingDuration;
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

				private String actionParams;

				private String action;

				private Long timestamp;

				private String speaker;

				private String script;

				private String sequenceId;

				private List<SummaryItem2> summary1;

				public String getActionParams() {
					return this.actionParams;
				}

				public void setActionParams(String actionParams) {
					this.actionParams = actionParams;
				}

				public String getAction() {
					return this.action;
				}

				public void setAction(String action) {
					this.action = action;
				}

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

				public String getSequenceId() {
					return this.sequenceId;
				}

				public void setSequenceId(String sequenceId) {
					this.sequenceId = sequenceId;
				}

				public List<SummaryItem2> getSummary1() {
					return this.summary1;
				}

				public void setSummary1(List<SummaryItem2> summary1) {
					this.summary1 = summary1;
				}

				public static class SummaryItem2 {

					private String summaryName;

					private String category;

					private String content;

					public String getSummaryName() {
						return this.summaryName;
					}

					public void setSummaryName(String summaryName) {
						this.summaryName = summaryName;
					}

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
				}
			}

			public static class Contact3 {

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

		public static class Script {

			private String status;

			private Long updateTime;

			private String chatbotId;

			private String scriptId;

			private Boolean isDebugDrafted;

			private String industry;

			private String scriptDescription;

			private Boolean miniPlaybackConfigEnabled;

			private Boolean isDrafted;

			private String ttsConfig;

			private String debugStatus;

			private String asrConfig;

			private String scene;

			private String name;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public Long getUpdateTime() {
				return this.updateTime;
			}

			public void setUpdateTime(Long updateTime) {
				this.updateTime = updateTime;
			}

			public String getChatbotId() {
				return this.chatbotId;
			}

			public void setChatbotId(String chatbotId) {
				this.chatbotId = chatbotId;
			}

			public String getScriptId() {
				return this.scriptId;
			}

			public void setScriptId(String scriptId) {
				this.scriptId = scriptId;
			}

			public Boolean getIsDebugDrafted() {
				return this.isDebugDrafted;
			}

			public void setIsDebugDrafted(Boolean isDebugDrafted) {
				this.isDebugDrafted = isDebugDrafted;
			}

			public String getIndustry() {
				return this.industry;
			}

			public void setIndustry(String industry) {
				this.industry = industry;
			}

			public String getScriptDescription() {
				return this.scriptDescription;
			}

			public void setScriptDescription(String scriptDescription) {
				this.scriptDescription = scriptDescription;
			}

			public Boolean getMiniPlaybackConfigEnabled() {
				return this.miniPlaybackConfigEnabled;
			}

			public void setMiniPlaybackConfigEnabled(Boolean miniPlaybackConfigEnabled) {
				this.miniPlaybackConfigEnabled = miniPlaybackConfigEnabled;
			}

			public Boolean getIsDrafted() {
				return this.isDrafted;
			}

			public void setIsDrafted(Boolean isDrafted) {
				this.isDrafted = isDrafted;
			}

			public String getTtsConfig() {
				return this.ttsConfig;
			}

			public void setTtsConfig(String ttsConfig) {
				this.ttsConfig = ttsConfig;
			}

			public String getDebugStatus() {
				return this.debugStatus;
			}

			public void setDebugStatus(String debugStatus) {
				this.debugStatus = debugStatus;
			}

			public String getAsrConfig() {
				return this.asrConfig;
			}

			public void setAsrConfig(String asrConfig) {
				this.asrConfig = asrConfig;
			}

			public String getScene() {
				return this.scene;
			}

			public void setScene(String scene) {
				this.scene = scene;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
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
