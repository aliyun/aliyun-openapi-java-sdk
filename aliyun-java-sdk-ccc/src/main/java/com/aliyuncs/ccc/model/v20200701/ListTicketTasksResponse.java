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
import com.aliyuncs.ccc.transform.v20200701.ListTicketTasksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListTicketTasksResponse extends AcsResponse {

	private String requestId;

	private Integer httpStatusCode;

	private String code;

	private String message;

	private List<DataItem> data;

	private List<String> params;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

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

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public List<String> getParams() {
		return this.params;
	}

	public void setParams(List<String> params) {
		this.params = params;
	}

	public static class DataItem {

		private String taskName;

		private String assignee;

		private String comment;

		private Long startTime;

		private Long endTime;

		private String assigneeName;

		private String taskId;

		private String ticketId;

		private String instanceId;

		private String taskDefinitionNodeId;

		private String taskDefinitionNodeType;

		private String action;

		private List<String> fileKeys;

		private List<String> fileUrls;

		public String getTaskName() {
			return this.taskName;
		}

		public void setTaskName(String taskName) {
			this.taskName = taskName;
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

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

		public String getAssigneeName() {
			return this.assigneeName;
		}

		public void setAssigneeName(String assigneeName) {
			this.assigneeName = assigneeName;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public String getTicketId() {
			return this.ticketId;
		}

		public void setTicketId(String ticketId) {
			this.ticketId = ticketId;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getTaskDefinitionNodeId() {
			return this.taskDefinitionNodeId;
		}

		public void setTaskDefinitionNodeId(String taskDefinitionNodeId) {
			this.taskDefinitionNodeId = taskDefinitionNodeId;
		}

		public String getTaskDefinitionNodeType() {
			return this.taskDefinitionNodeType;
		}

		public void setTaskDefinitionNodeType(String taskDefinitionNodeType) {
			this.taskDefinitionNodeType = taskDefinitionNodeType;
		}

		public String getAction() {
			return this.action;
		}

		public void setAction(String action) {
			this.action = action;
		}

		public List<String> getFileKeys() {
			return this.fileKeys;
		}

		public void setFileKeys(List<String> fileKeys) {
			this.fileKeys = fileKeys;
		}

		public List<String> getFileUrls() {
			return this.fileUrls;
		}

		public void setFileUrls(List<String> fileUrls) {
			this.fileUrls = fileUrls;
		}
	}

	@Override
	public ListTicketTasksResponse getInstance(UnmarshallerContext context) {
		return	ListTicketTasksResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
