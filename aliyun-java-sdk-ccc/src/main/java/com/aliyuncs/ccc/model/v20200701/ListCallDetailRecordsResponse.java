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
import com.aliyuncs.ccc.transform.v20200701.ListCallDetailRecordsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListCallDetailRecordsResponse extends AcsResponse {

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

			private String agentIds;

			private String agentNames;

			private String callDuration;

			private String calledNumber;

			private String callingNumber;

			private String contactDisposition;

			private String contactId;

			private String contactType;

			private Long establishedTime;

			private String instanceId;

			private Boolean recordingReady;

			private String releaseInitiator;

			private Long releaseTime;

			private Integer satisfaction;

			private String satisfactionSurveyChannel;

			private Boolean satisfactionSurveyOffered;

			private String skillGroupIds;

			private String skillGroupNames;

			private Long startTime;

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

			public String getCallDuration() {
				return this.callDuration;
			}

			public void setCallDuration(String callDuration) {
				this.callDuration = callDuration;
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

			public Boolean getRecordingReady() {
				return this.recordingReady;
			}

			public void setRecordingReady(Boolean recordingReady) {
				this.recordingReady = recordingReady;
			}

			public String getReleaseInitiator() {
				return this.releaseInitiator;
			}

			public void setReleaseInitiator(String releaseInitiator) {
				this.releaseInitiator = releaseInitiator;
			}

			public Long getReleaseTime() {
				return this.releaseTime;
			}

			public void setReleaseTime(Long releaseTime) {
				this.releaseTime = releaseTime;
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

			public Boolean getSatisfactionSurveyOffered() {
				return this.satisfactionSurveyOffered;
			}

			public void setSatisfactionSurveyOffered(Boolean satisfactionSurveyOffered) {
				this.satisfactionSurveyOffered = satisfactionSurveyOffered;
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

			public Long getStartTime() {
				return this.startTime;
			}

			public void setStartTime(Long startTime) {
				this.startTime = startTime;
			}
		}
	}

	@Override
	public ListCallDetailRecordsResponse getInstance(UnmarshallerContext context) {
		return	ListCallDetailRecordsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
