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
import com.aliyuncs.ccc.transform.v20170705.ListCallDetailRecordsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListCallDetailRecordsResponse extends AcsResponse {

	private Integer httpStatusCode;

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private CallDetailRecords callDetailRecords;

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

	public CallDetailRecords getCallDetailRecords() {
		return this.callDetailRecords;
	}

	public void setCallDetailRecords(CallDetailRecords callDetailRecords) {
		this.callDetailRecords = callDetailRecords;
	}

	public static class CallDetailRecords {

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

			private String skillGroupIdList;

			private String instanceId;

			private String calledNumber;

			private String agentNames;

			private Integer satisfaction;

			private Long startTime;

			private String satisfactionDesc;

			private String contactId;

			private String callingNumber;

			private Integer duration;

			private String skillGroupNames;

			private String feedback;

			private List<CallDetailAgent> agents;

			private List<Recording> recordings;

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

			public String getSkillGroupIdList() {
				return this.skillGroupIdList;
			}

			public void setSkillGroupIdList(String skillGroupIdList) {
				this.skillGroupIdList = skillGroupIdList;
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

			public String getAgentNames() {
				return this.agentNames;
			}

			public void setAgentNames(String agentNames) {
				this.agentNames = agentNames;
			}

			public Integer getSatisfaction() {
				return this.satisfaction;
			}

			public void setSatisfaction(Integer satisfaction) {
				this.satisfaction = satisfaction;
			}

			public Long getStartTime() {
				return this.startTime;
			}

			public void setStartTime(Long startTime) {
				this.startTime = startTime;
			}

			public String getSatisfactionDesc() {
				return this.satisfactionDesc;
			}

			public void setSatisfactionDesc(String satisfactionDesc) {
				this.satisfactionDesc = satisfactionDesc;
			}

			public String getContactId() {
				return this.contactId;
			}

			public void setContactId(String contactId) {
				this.contactId = contactId;
			}

			public String getCallingNumber() {
				return this.callingNumber;
			}

			public void setCallingNumber(String callingNumber) {
				this.callingNumber = callingNumber;
			}

			public Integer getDuration() {
				return this.duration;
			}

			public void setDuration(Integer duration) {
				this.duration = duration;
			}

			public String getSkillGroupNames() {
				return this.skillGroupNames;
			}

			public void setSkillGroupNames(String skillGroupNames) {
				this.skillGroupNames = skillGroupNames;
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

				private String satisfaction;

				private String feedback;

				private String agentId;

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

				public String getAgentId() {
					return this.agentId;
				}

				public void setAgentId(String agentId) {
					this.agentId = agentId;
				}
			}

			public static class Recording {

				private Long startTime;

				private String contactId;

				private String qualityCheckTaskId;

				private String agentId;

				private String fileDescription;

				private Integer duration;

				private String agentName;

				private String fileName;

				private String qualityCheckTid;

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

				public String getQualityCheckTaskId() {
					return this.qualityCheckTaskId;
				}

				public void setQualityCheckTaskId(String qualityCheckTaskId) {
					this.qualityCheckTaskId = qualityCheckTaskId;
				}

				public String getAgentId() {
					return this.agentId;
				}

				public void setAgentId(String agentId) {
					this.agentId = agentId;
				}

				public String getFileDescription() {
					return this.fileDescription;
				}

				public void setFileDescription(String fileDescription) {
					this.fileDescription = fileDescription;
				}

				public Integer getDuration() {
					return this.duration;
				}

				public void setDuration(Integer duration) {
					this.duration = duration;
				}

				public String getAgentName() {
					return this.agentName;
				}

				public void setAgentName(String agentName) {
					this.agentName = agentName;
				}

				public String getFileName() {
					return this.fileName;
				}

				public void setFileName(String fileName) {
					this.fileName = fileName;
				}

				public String getQualityCheckTid() {
					return this.qualityCheckTid;
				}

				public void setQualityCheckTid(String qualityCheckTid) {
					this.qualityCheckTid = qualityCheckTid;
				}
			}
		}
	}

	@Override
	public ListCallDetailRecordsResponse getInstance(UnmarshallerContext context) {
		return	ListCallDetailRecordsResponseUnmarshaller.unmarshall(this, context);
	}
}
