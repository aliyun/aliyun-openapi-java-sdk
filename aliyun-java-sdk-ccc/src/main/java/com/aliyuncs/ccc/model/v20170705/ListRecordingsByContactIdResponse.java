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
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ccc.transform.v20170705.ListRecordingsByContactIdResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListRecordingsByContactIdResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private List<Recording> recordings;

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

	public List<Recording> getRecordings() {
		return this.recordings;
	}

	public void setRecordings(List<Recording> recordings) {
		this.recordings = recordings;
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

		private String qualityCheckTid;

		private String qualityCheckTaskId;

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

		public String getQualityCheckTid() {
			return this.qualityCheckTid;
		}

		public void setQualityCheckTid(String qualityCheckTid) {
			this.qualityCheckTid = qualityCheckTid;
		}

		public String getQualityCheckTaskId() {
			return this.qualityCheckTaskId;
		}

		public void setQualityCheckTaskId(String qualityCheckTaskId) {
			this.qualityCheckTaskId = qualityCheckTaskId;
		}
	}

	@Override
	public ListRecordingsByContactIdResponse getInstance(UnmarshallerContext context) {
		return	ListRecordingsByContactIdResponseUnmarshaller.unmarshall(this, context);
	}
}
