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

package com.aliyuncs.ccc.model.v20200701;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ccc.transform.v20200701.GetCallDetailRecordResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetCallDetailRecordResponse extends AcsResponse {

	private String code;

	private Integer httpStatusCode;

	private String message;

	private String requestId;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String agentIds;

		private String agentNames;

		private String calledNumber;

		private String callingNumber;

		private String contactDisposition;

		private String contactId;

		private String contactType;

		private Long callDuration;

		private Long establishedTime;

		private String instanceId;

		private Long startTime;

		private Long releaseTime;

		private String skillGroupIds;

		private String skillGroupNames;

		private Boolean satisfactionSurveyOffered;

		private Integer satisfaction;

		private String satisfactionSurveyChannel;

		private String releaseInitiator;

		private Boolean recordingReady;

		private List<AgentEventsItem> agentEvents;

		private List<IvrEventsItem> ivrEvents;

		private List<QueueEventsItem> queueEvents;

		public String getAgentIds() {
			return this.agentIds;
		}

		public void setAgentIds(String agentIds) {
			this.agentIds = agentIds;
		}

		public String getAgentNames() {
			return this.agentNames;
		}

		public void setAgentNames(String agentNames) {
			this.agentNames = agentNames;
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

		public String getContactDisposition() {
			return this.contactDisposition;
		}

		public void setContactDisposition(String contactDisposition) {
			this.contactDisposition = contactDisposition;
		}

		public String getContactId() {
			return this.contactId;
		}

		public void setContactId(String contactId) {
			this.contactId = contactId;
		}

		public String getContactType() {
			return this.contactType;
		}

		public void setContactType(String contactType) {
			this.contactType = contactType;
		}

		public Long getCallDuration() {
			return this.callDuration;
		}

		public void setCallDuration(Long callDuration) {
			this.callDuration = callDuration;
		}

		public Long getEstablishedTime() {
			return this.establishedTime;
		}

		public void setEstablishedTime(Long establishedTime) {
			this.establishedTime = establishedTime;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public Long getReleaseTime() {
			return this.releaseTime;
		}

		public void setReleaseTime(Long releaseTime) {
			this.releaseTime = releaseTime;
		}

		public String getSkillGroupIds() {
			return this.skillGroupIds;
		}

		public void setSkillGroupIds(String skillGroupIds) {
			this.skillGroupIds = skillGroupIds;
		}

		public String getSkillGroupNames() {
			return this.skillGroupNames;
		}

		public void setSkillGroupNames(String skillGroupNames) {
			this.skillGroupNames = skillGroupNames;
		}

		public Boolean getSatisfactionSurveyOffered() {
			return this.satisfactionSurveyOffered;
		}

		public void setSatisfactionSurveyOffered(Boolean satisfactionSurveyOffered) {
			this.satisfactionSurveyOffered = satisfactionSurveyOffered;
		}

		public Integer getSatisfaction() {
			return this.satisfaction;
		}

		public void setSatisfaction(Integer satisfaction) {
			this.satisfaction = satisfaction;
		}

		public String getSatisfactionSurveyChannel() {
			return this.satisfactionSurveyChannel;
		}

		public void setSatisfactionSurveyChannel(String satisfactionSurveyChannel) {
			this.satisfactionSurveyChannel = satisfactionSurveyChannel;
		}

		public String getReleaseInitiator() {
			return this.releaseInitiator;
		}

		public void setReleaseInitiator(String releaseInitiator) {
			this.releaseInitiator = releaseInitiator;
		}

		public Boolean getRecordingReady() {
			return this.recordingReady;
		}

		public void setRecordingReady(Boolean recordingReady) {
			this.recordingReady = recordingReady;
		}

		public List<AgentEventsItem> getAgentEvents() {
			return this.agentEvents;
		}

		public void setAgentEvents(List<AgentEventsItem> agentEvents) {
			this.agentEvents = agentEvents;
		}

		public List<IvrEventsItem> getIvrEvents() {
			return this.ivrEvents;
		}

		public void setIvrEvents(List<IvrEventsItem> ivrEvents) {
			this.ivrEvents = ivrEvents;
		}

		public List<QueueEventsItem> getQueueEvents() {
			return this.queueEvents;
		}

		public void setQueueEvents(List<QueueEventsItem> queueEvents) {
			this.queueEvents = queueEvents;
		}

		public static class AgentEventsItem {

			private String agentId;

			private String agentName;

			private String skillGroupId;

			private List<EventSequenceItem> eventSequence;

			public String getAgentId() {
				return this.agentId;
			}

			public void setAgentId(String agentId) {
				this.agentId = agentId;
			}

			public String getAgentName() {
				return this.agentName;
			}

			public void setAgentName(String agentName) {
				this.agentName = agentName;
			}

			public String getSkillGroupId() {
				return this.skillGroupId;
			}

			public void setSkillGroupId(String skillGroupId) {
				this.skillGroupId = skillGroupId;
			}

			public List<EventSequenceItem> getEventSequence() {
				return this.eventSequence;
			}

			public void setEventSequence(List<EventSequenceItem> eventSequence) {
				this.eventSequence = eventSequence;
			}

			public static class EventSequenceItem {

				private String event;

				private Long eventTime;

				public String getEvent() {
					return this.event;
				}

				public void setEvent(String event) {
					this.event = event;
				}

				public Long getEventTime() {
					return this.eventTime;
				}

				public void setEventTime(Long eventTime) {
					this.eventTime = eventTime;
				}
			}
		}

		public static class IvrEventsItem {

			private String flowId;

			private List<EventSequenceItem2> eventSequence1;

			public String getFlowId() {
				return this.flowId;
			}

			public void setFlowId(String flowId) {
				this.flowId = flowId;
			}

			public List<EventSequenceItem2> getEventSequence1() {
				return this.eventSequence1;
			}

			public void setEventSequence1(List<EventSequenceItem2> eventSequence1) {
				this.eventSequence1 = eventSequence1;
			}

			public static class EventSequenceItem2 {

				private String event;

				private Long eventTime;

				public String getEvent() {
					return this.event;
				}

				public void setEvent(String event) {
					this.event = event;
				}

				public Long getEventTime() {
					return this.eventTime;
				}

				public void setEventTime(Long eventTime) {
					this.eventTime = eventTime;
				}
			}
		}

		public static class QueueEventsItem {

			private String flowId;

			private String queueId;

			private String queueName;

			private Integer queueType;

			private List<EventSequenceItem4> eventSequence3;

			public String getFlowId() {
				return this.flowId;
			}

			public void setFlowId(String flowId) {
				this.flowId = flowId;
			}

			public String getQueueId() {
				return this.queueId;
			}

			public void setQueueId(String queueId) {
				this.queueId = queueId;
			}

			public String getQueueName() {
				return this.queueName;
			}

			public void setQueueName(String queueName) {
				this.queueName = queueName;
			}

			public Integer getQueueType() {
				return this.queueType;
			}

			public void setQueueType(Integer queueType) {
				this.queueType = queueType;
			}

			public List<EventSequenceItem4> getEventSequence3() {
				return this.eventSequence3;
			}

			public void setEventSequence3(List<EventSequenceItem4> eventSequence3) {
				this.eventSequence3 = eventSequence3;
			}

			public static class EventSequenceItem4 {

				private String event;

				private Long eventTime;

				public String getEvent() {
					return this.event;
				}

				public void setEvent(String event) {
					this.event = event;
				}

				public Long getEventTime() {
					return this.eventTime;
				}

				public void setEventTime(Long eventTime) {
					this.eventTime = eventTime;
				}
			}
		}
	}

	@Override
	public GetCallDetailRecordResponse getInstance(UnmarshallerContext context) {
		return	GetCallDetailRecordResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
