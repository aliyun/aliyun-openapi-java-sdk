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
import com.aliyuncs.outboundbot.transform.v20191226.SearchTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SearchTaskResponse extends AcsResponse {

	private Integer httpStatusCode;

	private Integer pageIndex;

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer pageSize;

	private Long total;

	private List<SearchTaskInfo> searchTaskInfoList;

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public Integer getPageIndex() {
		return this.pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public List<SearchTaskInfo> getSearchTaskInfoList() {
		return this.searchTaskInfoList;
	}

	public void setSearchTaskInfoList(List<SearchTaskInfo> searchTaskInfoList) {
		this.searchTaskInfoList = searchTaskInfoList;
	}

	public static class SearchTaskInfo {

		private String jobGroupName;

		private String userId;

		private Long actualTime;

		private String calledNumber;

		private String taskStatusString;

		private String taskStatusName;

		private Integer jobStatus;

		private String dialException;

		private String userName;

		private String callDurationDisplay;

		private Boolean hasAnswered;

		private String jobStatusName;

		private Integer callDuration;

		private Long taskCreateTime;

		private String jobStatusString;

		private Boolean hasReachedEndOfFlow;

		private String instanceId;

		private Boolean hasHangUpByRejection;

		private Integer taskEndReason;

		private String jobGroupId;

		private Integer taskStatus;

		private String jobId;

		private Integer recordingDuration;

		private String taskId;

		private String dialExceptionOld;

		private Boolean hasLastPlaybackCompleted;

		private String scriptName;

		private List<String> dialExceptionCodes;

		public String getJobGroupName() {
			return this.jobGroupName;
		}

		public void setJobGroupName(String jobGroupName) {
			this.jobGroupName = jobGroupName;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
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

		public String getTaskStatusString() {
			return this.taskStatusString;
		}

		public void setTaskStatusString(String taskStatusString) {
			this.taskStatusString = taskStatusString;
		}

		public String getTaskStatusName() {
			return this.taskStatusName;
		}

		public void setTaskStatusName(String taskStatusName) {
			this.taskStatusName = taskStatusName;
		}

		public Integer getJobStatus() {
			return this.jobStatus;
		}

		public void setJobStatus(Integer jobStatus) {
			this.jobStatus = jobStatus;
		}

		public String getDialException() {
			return this.dialException;
		}

		public void setDialException(String dialException) {
			this.dialException = dialException;
		}

		public String getUserName() {
			return this.userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getCallDurationDisplay() {
			return this.callDurationDisplay;
		}

		public void setCallDurationDisplay(String callDurationDisplay) {
			this.callDurationDisplay = callDurationDisplay;
		}

		public Boolean getHasAnswered() {
			return this.hasAnswered;
		}

		public void setHasAnswered(Boolean hasAnswered) {
			this.hasAnswered = hasAnswered;
		}

		public String getJobStatusName() {
			return this.jobStatusName;
		}

		public void setJobStatusName(String jobStatusName) {
			this.jobStatusName = jobStatusName;
		}

		public Integer getCallDuration() {
			return this.callDuration;
		}

		public void setCallDuration(Integer callDuration) {
			this.callDuration = callDuration;
		}

		public Long getTaskCreateTime() {
			return this.taskCreateTime;
		}

		public void setTaskCreateTime(Long taskCreateTime) {
			this.taskCreateTime = taskCreateTime;
		}

		public String getJobStatusString() {
			return this.jobStatusString;
		}

		public void setJobStatusString(String jobStatusString) {
			this.jobStatusString = jobStatusString;
		}

		public Boolean getHasReachedEndOfFlow() {
			return this.hasReachedEndOfFlow;
		}

		public void setHasReachedEndOfFlow(Boolean hasReachedEndOfFlow) {
			this.hasReachedEndOfFlow = hasReachedEndOfFlow;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Boolean getHasHangUpByRejection() {
			return this.hasHangUpByRejection;
		}

		public void setHasHangUpByRejection(Boolean hasHangUpByRejection) {
			this.hasHangUpByRejection = hasHangUpByRejection;
		}

		public Integer getTaskEndReason() {
			return this.taskEndReason;
		}

		public void setTaskEndReason(Integer taskEndReason) {
			this.taskEndReason = taskEndReason;
		}

		public String getJobGroupId() {
			return this.jobGroupId;
		}

		public void setJobGroupId(String jobGroupId) {
			this.jobGroupId = jobGroupId;
		}

		public Integer getTaskStatus() {
			return this.taskStatus;
		}

		public void setTaskStatus(Integer taskStatus) {
			this.taskStatus = taskStatus;
		}

		public String getJobId() {
			return this.jobId;
		}

		public void setJobId(String jobId) {
			this.jobId = jobId;
		}

		public Integer getRecordingDuration() {
			return this.recordingDuration;
		}

		public void setRecordingDuration(Integer recordingDuration) {
			this.recordingDuration = recordingDuration;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public String getDialExceptionOld() {
			return this.dialExceptionOld;
		}

		public void setDialExceptionOld(String dialExceptionOld) {
			this.dialExceptionOld = dialExceptionOld;
		}

		public Boolean getHasLastPlaybackCompleted() {
			return this.hasLastPlaybackCompleted;
		}

		public void setHasLastPlaybackCompleted(Boolean hasLastPlaybackCompleted) {
			this.hasLastPlaybackCompleted = hasLastPlaybackCompleted;
		}

		public String getScriptName() {
			return this.scriptName;
		}

		public void setScriptName(String scriptName) {
			this.scriptName = scriptName;
		}

		public List<String> getDialExceptionCodes() {
			return this.dialExceptionCodes;
		}

		public void setDialExceptionCodes(List<String> dialExceptionCodes) {
			this.dialExceptionCodes = dialExceptionCodes;
		}
	}

	@Override
	public SearchTaskResponse getInstance(UnmarshallerContext context) {
		return	SearchTaskResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
