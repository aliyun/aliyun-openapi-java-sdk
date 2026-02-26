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
import com.aliyuncs.outboundbot.transform.v20191226.GetTaskByUuidResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTaskByUuidResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Boolean success;

	private Integer httpStatusCode;

	private Task task;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public Task getTask() {
		return this.task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

	public static class Task {

		private String jobGroupId;

		private Long endTime;

		private Long plannedTime;

		private String jobId;

		private String callId;

		private String callingNumber;

		private Long actualTime;

		private String instanceId;

		private String calledNumber;

		private String id;

		private String endReason;

		private List<Conversation> conversations;

		public String getJobGroupId() {
			return this.jobGroupId;
		}

		public void setJobGroupId(String jobGroupId) {
			this.jobGroupId = jobGroupId;
		}

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

		public Long getPlannedTime() {
			return this.plannedTime;
		}

		public void setPlannedTime(Long plannedTime) {
			this.plannedTime = plannedTime;
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

		public Long getActualTime() {
			return this.actualTime;
		}

		public void setActualTime(Long actualTime) {
			this.actualTime = actualTime;
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

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getEndReason() {
			return this.endReason;
		}

		public void setEndReason(String endReason) {
			this.endReason = endReason;
		}

		public List<Conversation> getConversations() {
			return this.conversations;
		}

		public void setConversations(List<Conversation> conversations) {
			this.conversations = conversations;
		}

		public static class Conversation {

			private String speaker;

			private String script;

			private Long timestamp;

			private String action;

			private String sequenceId;

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

			public Long getTimestamp() {
				return this.timestamp;
			}

			public void setTimestamp(Long timestamp) {
				this.timestamp = timestamp;
			}

			public String getAction() {
				return this.action;
			}

			public void setAction(String action) {
				this.action = action;
			}

			public String getSequenceId() {
				return this.sequenceId;
			}

			public void setSequenceId(String sequenceId) {
				this.sequenceId = sequenceId;
			}
		}
	}

	@Override
	public GetTaskByUuidResponse getInstance(UnmarshallerContext context) {
		return	GetTaskByUuidResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
