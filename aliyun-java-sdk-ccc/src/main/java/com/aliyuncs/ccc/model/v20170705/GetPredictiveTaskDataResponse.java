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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ccc.transform.v20170705.GetPredictiveTaskDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetPredictiveTaskDataResponse extends AcsResponse {

	private String requestId;

	private Long httpStatusCode;

	private String code;

	private String message;

	private String success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Long httpStatusCode) {
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

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Boolean abandoned;

		private String contactId;

		private Boolean answered;

		private Boolean connected;

		private Long dialDuration;

		private Long endTime;

		private String jobGroupId;

		private Long queueDuration;

		private Long startTime;

		private Long talkDuration;

		private String taskId;

		public Boolean getAbandoned() {
			return this.abandoned;
		}

		public void setAbandoned(Boolean abandoned) {
			this.abandoned = abandoned;
		}

		public String getContactId() {
			return this.contactId;
		}

		public void setContactId(String contactId) {
			this.contactId = contactId;
		}

		public Boolean getAnswered() {
			return this.answered;
		}

		public void setAnswered(Boolean answered) {
			this.answered = answered;
		}

		public Boolean getConnected() {
			return this.connected;
		}

		public void setConnected(Boolean connected) {
			this.connected = connected;
		}

		public Long getDialDuration() {
			return this.dialDuration;
		}

		public void setDialDuration(Long dialDuration) {
			this.dialDuration = dialDuration;
		}

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

		public String getJobGroupId() {
			return this.jobGroupId;
		}

		public void setJobGroupId(String jobGroupId) {
			this.jobGroupId = jobGroupId;
		}

		public Long getQueueDuration() {
			return this.queueDuration;
		}

		public void setQueueDuration(Long queueDuration) {
			this.queueDuration = queueDuration;
		}

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public Long getTalkDuration() {
			return this.talkDuration;
		}

		public void setTalkDuration(Long talkDuration) {
			this.talkDuration = talkDuration;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}
	}

	@Override
	public GetPredictiveTaskDataResponse getInstance(UnmarshallerContext context) {
		return	GetPredictiveTaskDataResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
