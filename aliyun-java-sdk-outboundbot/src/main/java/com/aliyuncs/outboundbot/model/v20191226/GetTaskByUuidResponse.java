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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.outboundbot.transform.v20191226.GetTaskByUuidResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTaskByUuidResponse extends AcsResponse {

	private String requestId;

	private Task task;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Task getTask() {
		return this.task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

	public static class Task {

		private String id;

		private String jobId;

		private Long plannedTime;

		private Long actualTime;

		private Long endTime;

		private String callingNumber;

		private String calledNumber;

		private String callId;

		private Integer endReason;

		private String instanceId;

		private String jobGroupId;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getJobId() {
			return this.jobId;
		}

		public void setJobId(String jobId) {
			this.jobId = jobId;
		}

		public Long getPlannedTime() {
			return this.plannedTime;
		}

		public void setPlannedTime(Long plannedTime) {
			this.plannedTime = plannedTime;
		}

		public Long getActualTime() {
			return this.actualTime;
		}

		public void setActualTime(Long actualTime) {
			this.actualTime = actualTime;
		}

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
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

		public String getCallId() {
			return this.callId;
		}

		public void setCallId(String callId) {
			this.callId = callId;
		}

		public Integer getEndReason() {
			return this.endReason;
		}

		public void setEndReason(Integer endReason) {
			this.endReason = endReason;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getJobGroupId() {
			return this.jobGroupId;
		}

		public void setJobGroupId(String jobGroupId) {
			this.jobGroupId = jobGroupId;
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
