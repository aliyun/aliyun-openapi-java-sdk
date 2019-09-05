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

package com.aliyuncs.ccc.model.v20170705;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ccc.transform.v20170705.ListRecentCallRecordsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListRecentCallRecordsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private CallDetailRecords callDetailRecords;

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

	public CallDetailRecords getCallDetailRecords() {
		return this.callDetailRecords;
	}

	public void setCallDetailRecords(CallDetailRecords callDetailRecords) {
		this.callDetailRecords = callDetailRecords;
	}

	public static class CallDetailRecords {

		private Integer totalCount;

		private Integer pageNumber;

		private Integer pageSize;

		private List<CallDetailRecord> list;

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

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

		public List<CallDetailRecord> getList() {
			return this.list;
		}

		public void setList(List<CallDetailRecord> list) {
			this.list = list;
		}

		public static class CallDetailRecord {

			private String contactId;

			private Long startTime;

			private Integer duration;

			private Integer satisfaction;

			private String contactType;

			private String contactDisposition;

			private String callingNumber;

			private String calledNumber;

			private String agentNames;

			private String skillGroupNames;

			private String instanceId;

			private String extraAttr;

			private String extraAttr1;

			private String satisfactionDesc;

			private String feedback;

			private List<CallDetailAgent> agents;

			private List<Recording> recordings;

			public String getContactId() {
				return this.contactId;
			}

			public void setContactId(String contactId) {
				this.contactId = contactId;
			}

			public Long getStartTime() {
				return this.startTime;
			}

			public void setStartTime(Long startTime) {
				this.startTime = startTime;
			}

			public Integer getDuration() {
				return this.duration;
			}

			public void setDuration(Integer duration) {
				this.duration = duration;
			}

			public Integer getSatisfaction() {
				return this.satisfaction;
			}

			public void setSatisfaction(Integer satisfaction) {
				this.satisfaction = satisfaction;
			}

			public String getContactType() {
				return this.contactType;
			}

			public void setContactType(String contactType) {
				this.contactType = contactType;
			}

			public String getContactDisposition() {
				return this.contactDisposition;
			}

			public void setContactDisposition(String contactDisposition) {
				this.contactDisposition = contactDisposition;
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

			public String getAgentNames() {
				return this.agentNames;
			}

			public void setAgentNames(String agentNames) {
				this.agentNames = agentNames;
			}

			public String getSkillGroupNames() {
				return this.skillGroupNames;
			}

			public void setSkillGroupNames(String skillGroupNames) {
				this.skillGroupNames = skillGroupNames;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getExtraAttr() {
				return this.extraAttr;
			}

			public void setExtraAttr(String extraAttr) {
				this.extraAttr = extraAttr;
			}

			public String getExtraAttr1() {
				return this.extraAttr1;
			}

			public void setExtraAttr1(String extraAttr1) {
				this.extraAttr1 = extraAttr1;
			}

			public String getSatisfactionDesc() {
				return this.satisfactionDesc;
			}

			public void setSatisfactionDesc(String satisfactionDesc) {
				this.satisfactionDesc = satisfactionDesc;
			}

			public String getFeedback() {
				return this.feedback;
			}

			public void setFeedback(String feedback) {
				this.feedback = feedback;
			}

			public List<CallDetailAgent> getAgents() {
				return this.agents;
			}

			public void setAgents(List<CallDetailAgent> agents) {
				this.agents = agents;
			}

			public List<Recording> getRecordings() {
				return this.recordings;
			}

			public void setRecordings(List<Recording> recordings) {
				this.recordings = recordings;
			}

			public static class CallDetailAgent {

				private String contactId;

				private String agentId;

				private String agentName;

				private String skillGroupName;

				private Integer queueTime;

				private Integer ringTime;

				private Long startTime;

				private Integer talkTime;

				private Integer holdTime;

				private Integer workTime;

				private String satisfaction;

				private String feedback;

				public String getContactId() {
					return this.contactId;
				}

				public void setContactId(String contactId) {
					this.contactId = contactId;
				}

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

				public String getSkillGroupName() {
					return this.skillGroupName;
				}

				public void setSkillGroupName(String skillGroupName) {
					this.skillGroupName = skillGroupName;
				}

				public Integer getQueueTime() {
					return this.queueTime;
				}

				public void setQueueTime(Integer queueTime) {
					this.queueTime = queueTime;
				}

				public Integer getRingTime() {
					return this.ringTime;
				}

				public void setRingTime(Integer ringTime) {
					this.ringTime = ringTime;
				}

				public Long getStartTime() {
					return this.startTime;
				}

				public void setStartTime(Long startTime) {
					this.startTime = startTime;
				}

				public Integer getTalkTime() {
					return this.talkTime;
				}

				public void setTalkTime(Integer talkTime) {
					this.talkTime = talkTime;
				}

				public Integer getHoldTime() {
					return this.holdTime;
				}

				public void setHoldTime(Integer holdTime) {
					this.holdTime = holdTime;
				}

				public Integer getWorkTime() {
					return this.workTime;
				}

				public void setWorkTime(Integer workTime) {
					this.workTime = workTime;
				}

				public String getSatisfaction() {
					return this.satisfaction;
				}

				public void setSatisfaction(String satisfaction) {
					this.satisfaction = satisfaction;
				}

				public String getFeedback() {
					return this.feedback;
				}

				public void setFeedback(String feedback) {
					this.feedback = feedback;
				}
			}

			public static class Recording {

				private String contactId;

				private String contactType;

				private String agentId;

				private String agentName;

				private String callingNumber;

				private String calledNumber;

				private Long startTime;

				private Integer duration;

				private String fileName;

				private String filePath;

				private String fileDescription;

				private String channel;

				private String instanceId;

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

				public Long getStartTime() {
					return this.startTime;
				}

				public void setStartTime(Long startTime) {
					this.startTime = startTime;
				}

				public Integer getDuration() {
					return this.duration;
				}

				public void setDuration(Integer duration) {
					this.duration = duration;
				}

				public String getFileName() {
					return this.fileName;
				}

				public void setFileName(String fileName) {
					this.fileName = fileName;
				}

				public String getFilePath() {
					return this.filePath;
				}

				public void setFilePath(String filePath) {
					this.filePath = filePath;
				}

				public String getFileDescription() {
					return this.fileDescription;
				}

				public void setFileDescription(String fileDescription) {
					this.fileDescription = fileDescription;
				}

				public String getChannel() {
					return this.channel;
				}

				public void setChannel(String channel) {
					this.channel = channel;
				}

				public String getInstanceId() {
					return this.instanceId;
				}

				public void setInstanceId(String instanceId) {
					this.instanceId = instanceId;
				}
			}
		}
	}

	@Override
	public ListRecentCallRecordsResponse getInstance(UnmarshallerContext context) {
		return	ListRecentCallRecordsResponseUnmarshaller.unmarshall(this, context);
	}
}
