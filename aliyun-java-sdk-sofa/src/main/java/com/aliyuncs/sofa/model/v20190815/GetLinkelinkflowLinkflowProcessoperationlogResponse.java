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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.GetLinkelinkflowLinkflowProcessoperationlogResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetLinkelinkflowLinkflowProcessoperationlogResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Long current;

	private String errorCode;

	private String errorMsg;

	private Long pageSize;

	private Long responseStatusCode;

	private Boolean success;

	private Long total;

	private List<DataItem> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public Long getCurrent() {
		return this.current;
	}

	public void setCurrent(Long current) {
		this.current = current;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getResponseStatusCode() {
		return this.responseStatusCode;
	}

	public void setResponseStatusCode(Long responseStatusCode) {
		this.responseStatusCode = responseStatusCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String activityId;

		private String activityName;

		private String activityType;

		private String assignee;

		private String comment;

		private Long duration;

		private Long endTime;

		private String id;

		private String processDefinitionId;

		private String processInstanceId;

		private Long startTime;

		private String taskId;

		public String getActivityId() {
			return this.activityId;
		}

		public void setActivityId(String activityId) {
			this.activityId = activityId;
		}

		public String getActivityName() {
			return this.activityName;
		}

		public void setActivityName(String activityName) {
			this.activityName = activityName;
		}

		public String getActivityType() {
			return this.activityType;
		}

		public void setActivityType(String activityType) {
			this.activityType = activityType;
		}

		public String getAssignee() {
			return this.assignee;
		}

		public void setAssignee(String assignee) {
			this.assignee = assignee;
		}

		public String getComment() {
			return this.comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public Long getDuration() {
			return this.duration;
		}

		public void setDuration(Long duration) {
			this.duration = duration;
		}

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getProcessDefinitionId() {
			return this.processDefinitionId;
		}

		public void setProcessDefinitionId(String processDefinitionId) {
			this.processDefinitionId = processDefinitionId;
		}

		public String getProcessInstanceId() {
			return this.processInstanceId;
		}

		public void setProcessInstanceId(String processInstanceId) {
			this.processInstanceId = processInstanceId;
		}

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}
	}

	@Override
	public GetLinkelinkflowLinkflowProcessoperationlogResponse getInstance(UnmarshallerContext context) {
		return	GetLinkelinkflowLinkflowProcessoperationlogResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
