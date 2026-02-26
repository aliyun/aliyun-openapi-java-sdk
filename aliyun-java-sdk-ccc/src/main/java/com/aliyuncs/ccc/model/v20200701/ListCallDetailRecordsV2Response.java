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
import com.aliyuncs.ccc.transform.v20200701.ListCallDetailRecordsV2ResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListCallDetailRecordsV2Response extends AcsResponse {

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

		private Integer pageNumber;

		private Integer pageSize;

		private Integer totalCount;

		private List<CallDetailRecord> list;

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

		public List<CallDetailRecord> getList() {
			return this.list;
		}

		public void setList(List<CallDetailRecord> list) {
			this.list = list;
		}

		public static class CallDetailRecord {

			private String contactDisposition;

			private String contactType;

			private Long establishedTime;

			private String calledNumber;

			private String additionalBroker;

			private Integer satisfactionIndex;

			private String satisfactionSurveyChannel;

			private Long releaseTime;

			private Long waitTime;

			private String skillGroupNames;

			private Long ivrTime;

			private String satisfactionDescription;

			private String releaseInitiator;

			private String agentIds;

			private String callDuration;

			private Boolean recordingReady;

			private String instanceId;

			private Long ringTime;

			private Boolean satisfactionSurveyOffered;

			private String agentNames;

			private Long startTime;

			private String contactId;

			private Long recordingDuration;

			private String callingNumber;

			private Long queueTime;

			private String broker;

			private String skillGroupIds;

			private String callerLocation;

			private String calleeLocation;

			private String earlyMediaState;

			private String releaseReason;

			private Long dialingTime;

			private Long talkTime;

			private Long heldTime;

			private String earlyMediaText;

			private String offSiteAgentIds;

			private String offsiteAgentDestinationNumbers;

			private Long messagesSent;

			private Long messagesSentByCustomer;

			private Long messagesSentByAgent;

			private Long firstResponseTime;

			private String mediaType;

			private Long transferCount;

			private String accessChannelType;

			private String accessChannelName;

			private String accessChannelUserId;

			private String accessChannelUserName;

			private String clientIpAddress;

			private String clientLocation;

			private String clientUserAgent;

			private String clientAppName;

			private String offsiteAgentOriginatorNumbers;

			public String getContactDisposition() {
				return this.contactDisposition;
			}

			public void setContactDisposition(String contactDisposition) {
				this.contactDisposition = contactDisposition;
			}

			public String getContactType() {
				return this.contactType;
			}

			public void setContactType(String contactType) {
				this.contactType = contactType;
			}

			public Long getEstablishedTime() {
				return this.establishedTime;
			}

			public void setEstablishedTime(Long establishedTime) {
				this.establishedTime = establishedTime;
			}

			public String getCalledNumber() {
				return this.calledNumber;
			}

			public void setCalledNumber(String calledNumber) {
				this.calledNumber = calledNumber;
			}

			public String getAdditionalBroker() {
				return this.additionalBroker;
			}

			public void setAdditionalBroker(String additionalBroker) {
				this.additionalBroker = additionalBroker;
			}

			public Integer getSatisfactionIndex() {
				return this.satisfactionIndex;
			}

			public void setSatisfactionIndex(Integer satisfactionIndex) {
				this.satisfactionIndex = satisfactionIndex;
			}

			public String getSatisfactionSurveyChannel() {
				return this.satisfactionSurveyChannel;
			}

			public void setSatisfactionSurveyChannel(String satisfactionSurveyChannel) {
				this.satisfactionSurveyChannel = satisfactionSurveyChannel;
			}

			public Long getReleaseTime() {
				return this.releaseTime;
			}

			public void setReleaseTime(Long releaseTime) {
				this.releaseTime = releaseTime;
			}

			public Long getWaitTime() {
				return this.waitTime;
			}

			public void setWaitTime(Long waitTime) {
				this.waitTime = waitTime;
			}

			public String getSkillGroupNames() {
				return this.skillGroupNames;
			}

			public void setSkillGroupNames(String skillGroupNames) {
				this.skillGroupNames = skillGroupNames;
			}

			public Long getIvrTime() {
				return this.ivrTime;
			}

			public void setIvrTime(Long ivrTime) {
				this.ivrTime = ivrTime;
			}

			public String getSatisfactionDescription() {
				return this.satisfactionDescription;
			}

			public void setSatisfactionDescription(String satisfactionDescription) {
				this.satisfactionDescription = satisfactionDescription;
			}

			public String getReleaseInitiator() {
				return this.releaseInitiator;
			}

			public void setReleaseInitiator(String releaseInitiator) {
				this.releaseInitiator = releaseInitiator;
			}

			public String getAgentIds() {
				return this.agentIds;
			}

			public void setAgentIds(String agentIds) {
				this.agentIds = agentIds;
			}

			public String getCallDuration() {
				return this.callDuration;
			}

			public void setCallDuration(String callDuration) {
				this.callDuration = callDuration;
			}

			public Boolean getRecordingReady() {
				return this.recordingReady;
			}

			public void setRecordingReady(Boolean recordingReady) {
				this.recordingReady = recordingReady;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public Long getRingTime() {
				return this.ringTime;
			}

			public void setRingTime(Long ringTime) {
				this.ringTime = ringTime;
			}

			public Boolean getSatisfactionSurveyOffered() {
				return this.satisfactionSurveyOffered;
			}

			public void setSatisfactionSurveyOffered(Boolean satisfactionSurveyOffered) {
				this.satisfactionSurveyOffered = satisfactionSurveyOffered;
			}

			public String getAgentNames() {
				return this.agentNames;
			}

			public void setAgentNames(String agentNames) {
				this.agentNames = agentNames;
			}

			public Long getStartTime() {
				return this.startTime;
			}

			public void setStartTime(Long startTime) {
				this.startTime = startTime;
			}

			public String getContactId() {
				return this.contactId;
			}

			public void setContactId(String contactId) {
				this.contactId = contactId;
			}

			public Long getRecordingDuration() {
				return this.recordingDuration;
			}

			public void setRecordingDuration(Long recordingDuration) {
				this.recordingDuration = recordingDuration;
			}

			public String getCallingNumber() {
				return this.callingNumber;
			}

			public void setCallingNumber(String callingNumber) {
				this.callingNumber = callingNumber;
			}

			public Long getQueueTime() {
				return this.queueTime;
			}

			public void setQueueTime(Long queueTime) {
				this.queueTime = queueTime;
			}

			public String getBroker() {
				return this.broker;
			}

			public void setBroker(String broker) {
				this.broker = broker;
			}

			public String getSkillGroupIds() {
				return this.skillGroupIds;
			}

			public void setSkillGroupIds(String skillGroupIds) {
				this.skillGroupIds = skillGroupIds;
			}

			public String getCallerLocation() {
				return this.callerLocation;
			}

			public void setCallerLocation(String callerLocation) {
				this.callerLocation = callerLocation;
			}

			public String getCalleeLocation() {
				return this.calleeLocation;
			}

			public void setCalleeLocation(String calleeLocation) {
				this.calleeLocation = calleeLocation;
			}

			public String getEarlyMediaState() {
				return this.earlyMediaState;
			}

			public void setEarlyMediaState(String earlyMediaState) {
				this.earlyMediaState = earlyMediaState;
			}

			public String getReleaseReason() {
				return this.releaseReason;
			}

			public void setReleaseReason(String releaseReason) {
				this.releaseReason = releaseReason;
			}

			public Long getDialingTime() {
				return this.dialingTime;
			}

			public void setDialingTime(Long dialingTime) {
				this.dialingTime = dialingTime;
			}

			public Long getTalkTime() {
				return this.talkTime;
			}

			public void setTalkTime(Long talkTime) {
				this.talkTime = talkTime;
			}

			public Long getHeldTime() {
				return this.heldTime;
			}

			public void setHeldTime(Long heldTime) {
				this.heldTime = heldTime;
			}

			public String getEarlyMediaText() {
				return this.earlyMediaText;
			}

			public void setEarlyMediaText(String earlyMediaText) {
				this.earlyMediaText = earlyMediaText;
			}

			public String getOffSiteAgentIds() {
				return this.offSiteAgentIds;
			}

			public void setOffSiteAgentIds(String offSiteAgentIds) {
				this.offSiteAgentIds = offSiteAgentIds;
			}

			public String getOffsiteAgentDestinationNumbers() {
				return this.offsiteAgentDestinationNumbers;
			}

			public void setOffsiteAgentDestinationNumbers(String offsiteAgentDestinationNumbers) {
				this.offsiteAgentDestinationNumbers = offsiteAgentDestinationNumbers;
			}

			public Long getMessagesSent() {
				return this.messagesSent;
			}

			public void setMessagesSent(Long messagesSent) {
				this.messagesSent = messagesSent;
			}

			public Long getMessagesSentByCustomer() {
				return this.messagesSentByCustomer;
			}

			public void setMessagesSentByCustomer(Long messagesSentByCustomer) {
				this.messagesSentByCustomer = messagesSentByCustomer;
			}

			public Long getMessagesSentByAgent() {
				return this.messagesSentByAgent;
			}

			public void setMessagesSentByAgent(Long messagesSentByAgent) {
				this.messagesSentByAgent = messagesSentByAgent;
			}

			public Long getFirstResponseTime() {
				return this.firstResponseTime;
			}

			public void setFirstResponseTime(Long firstResponseTime) {
				this.firstResponseTime = firstResponseTime;
			}

			public String getMediaType() {
				return this.mediaType;
			}

			public void setMediaType(String mediaType) {
				this.mediaType = mediaType;
			}

			public Long getTransferCount() {
				return this.transferCount;
			}

			public void setTransferCount(Long transferCount) {
				this.transferCount = transferCount;
			}

			public String getAccessChannelType() {
				return this.accessChannelType;
			}

			public void setAccessChannelType(String accessChannelType) {
				this.accessChannelType = accessChannelType;
			}

			public String getAccessChannelName() {
				return this.accessChannelName;
			}

			public void setAccessChannelName(String accessChannelName) {
				this.accessChannelName = accessChannelName;
			}

			public String getAccessChannelUserId() {
				return this.accessChannelUserId;
			}

			public void setAccessChannelUserId(String accessChannelUserId) {
				this.accessChannelUserId = accessChannelUserId;
			}

			public String getAccessChannelUserName() {
				return this.accessChannelUserName;
			}

			public void setAccessChannelUserName(String accessChannelUserName) {
				this.accessChannelUserName = accessChannelUserName;
			}

			public String getClientIpAddress() {
				return this.clientIpAddress;
			}

			public void setClientIpAddress(String clientIpAddress) {
				this.clientIpAddress = clientIpAddress;
			}

			public String getClientLocation() {
				return this.clientLocation;
			}

			public void setClientLocation(String clientLocation) {
				this.clientLocation = clientLocation;
			}

			public String getClientUserAgent() {
				return this.clientUserAgent;
			}

			public void setClientUserAgent(String clientUserAgent) {
				this.clientUserAgent = clientUserAgent;
			}

			public String getClientAppName() {
				return this.clientAppName;
			}

			public void setClientAppName(String clientAppName) {
				this.clientAppName = clientAppName;
			}

			public String getOffsiteAgentOriginatorNumbers() {
				return this.offsiteAgentOriginatorNumbers;
			}

			public void setOffsiteAgentOriginatorNumbers(String offsiteAgentOriginatorNumbers) {
				this.offsiteAgentOriginatorNumbers = offsiteAgentOriginatorNumbers;
			}
		}
	}

	@Override
	public ListCallDetailRecordsV2Response getInstance(UnmarshallerContext context) {
		return	ListCallDetailRecordsV2ResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
