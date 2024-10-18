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

package com.aliyuncs.domain.model.v20180129;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.domain.transform.v20180129.QueryTaskInfoHistoryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryTaskInfoHistoryResponse extends AcsResponse {

	private Integer pageSize;

	private String requestId;

	private List<TaskInfoHistory> objects;

	private CurrentPageCursor currentPageCursor;

	private PrePageCursor prePageCursor;

	private NextPageCursor nextPageCursor;

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<TaskInfoHistory> getObjects() {
		return this.objects;
	}

	public void setObjects(List<TaskInfoHistory> objects) {
		this.objects = objects;
	}

	public CurrentPageCursor getCurrentPageCursor() {
		return this.currentPageCursor;
	}

	public void setCurrentPageCursor(CurrentPageCursor currentPageCursor) {
		this.currentPageCursor = currentPageCursor;
	}

	public PrePageCursor getPrePageCursor() {
		return this.prePageCursor;
	}

	public void setPrePageCursor(PrePageCursor prePageCursor) {
		this.prePageCursor = prePageCursor;
	}

	public NextPageCursor getNextPageCursor() {
		return this.nextPageCursor;
	}

	public void setNextPageCursor(NextPageCursor nextPageCursor) {
		this.nextPageCursor = nextPageCursor;
	}

	public static class TaskInfoHistory {

		private String taskType;

		private String taskNo;

		private Integer taskStatusCode;

		private String taskStatus;

		private String taskTypeDescription;

		private Integer taskNum;

		private String createTime;

		private Long createTimeLong;

		private String clientip;

		public String getTaskType() {
			return this.taskType;
		}

		public void setTaskType(String taskType) {
			this.taskType = taskType;
		}

		public String getTaskNo() {
			return this.taskNo;
		}

		public void setTaskNo(String taskNo) {
			this.taskNo = taskNo;
		}

		public Integer getTaskStatusCode() {
			return this.taskStatusCode;
		}

		public void setTaskStatusCode(Integer taskStatusCode) {
			this.taskStatusCode = taskStatusCode;
		}

		public String getTaskStatus() {
			return this.taskStatus;
		}

		public void setTaskStatus(String taskStatus) {
			this.taskStatus = taskStatus;
		}

		public String getTaskTypeDescription() {
			return this.taskTypeDescription;
		}

		public void setTaskTypeDescription(String taskTypeDescription) {
			this.taskTypeDescription = taskTypeDescription;
		}

		public Integer getTaskNum() {
			return this.taskNum;
		}

		public void setTaskNum(Integer taskNum) {
			this.taskNum = taskNum;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public Long getCreateTimeLong() {
			return this.createTimeLong;
		}

		public void setCreateTimeLong(Long createTimeLong) {
			this.createTimeLong = createTimeLong;
		}

		public String getClientip() {
			return this.clientip;
		}

		public void setClientip(String clientip) {
			this.clientip = clientip;
		}
	}

	public static class CurrentPageCursor {

		private String taskType;

		private String taskNo;

		private Integer taskStatusCode;

		private String taskStatus;

		private String taskTypeDescription;

		private Integer taskNum;

		private String createTime;

		private Long createTimeLong;

		private String clientip;

		public String getTaskType() {
			return this.taskType;
		}

		public void setTaskType(String taskType) {
			this.taskType = taskType;
		}

		public String getTaskNo() {
			return this.taskNo;
		}

		public void setTaskNo(String taskNo) {
			this.taskNo = taskNo;
		}

		public Integer getTaskStatusCode() {
			return this.taskStatusCode;
		}

		public void setTaskStatusCode(Integer taskStatusCode) {
			this.taskStatusCode = taskStatusCode;
		}

		public String getTaskStatus() {
			return this.taskStatus;
		}

		public void setTaskStatus(String taskStatus) {
			this.taskStatus = taskStatus;
		}

		public String getTaskTypeDescription() {
			return this.taskTypeDescription;
		}

		public void setTaskTypeDescription(String taskTypeDescription) {
			this.taskTypeDescription = taskTypeDescription;
		}

		public Integer getTaskNum() {
			return this.taskNum;
		}

		public void setTaskNum(Integer taskNum) {
			this.taskNum = taskNum;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public Long getCreateTimeLong() {
			return this.createTimeLong;
		}

		public void setCreateTimeLong(Long createTimeLong) {
			this.createTimeLong = createTimeLong;
		}

		public String getClientip() {
			return this.clientip;
		}

		public void setClientip(String clientip) {
			this.clientip = clientip;
		}
	}

	public static class PrePageCursor {

		private String taskType;

		private String taskNo;

		private Integer taskStatusCode;

		private String taskStatus;

		private String taskTypeDescription;

		private Integer taskNum;

		private String createTime;

		private Long createTimeLong;

		private String clientip;

		public String getTaskType() {
			return this.taskType;
		}

		public void setTaskType(String taskType) {
			this.taskType = taskType;
		}

		public String getTaskNo() {
			return this.taskNo;
		}

		public void setTaskNo(String taskNo) {
			this.taskNo = taskNo;
		}

		public Integer getTaskStatusCode() {
			return this.taskStatusCode;
		}

		public void setTaskStatusCode(Integer taskStatusCode) {
			this.taskStatusCode = taskStatusCode;
		}

		public String getTaskStatus() {
			return this.taskStatus;
		}

		public void setTaskStatus(String taskStatus) {
			this.taskStatus = taskStatus;
		}

		public String getTaskTypeDescription() {
			return this.taskTypeDescription;
		}

		public void setTaskTypeDescription(String taskTypeDescription) {
			this.taskTypeDescription = taskTypeDescription;
		}

		public Integer getTaskNum() {
			return this.taskNum;
		}

		public void setTaskNum(Integer taskNum) {
			this.taskNum = taskNum;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public Long getCreateTimeLong() {
			return this.createTimeLong;
		}

		public void setCreateTimeLong(Long createTimeLong) {
			this.createTimeLong = createTimeLong;
		}

		public String getClientip() {
			return this.clientip;
		}

		public void setClientip(String clientip) {
			this.clientip = clientip;
		}
	}

	public static class NextPageCursor {

		private String taskType;

		private String taskNo;

		private Integer taskStatusCode;

		private String taskStatus;

		private String taskTypeDescription;

		private Integer taskNum;

		private String createTime;

		private Long createTimeLong;

		private String clientip;

		public String getTaskType() {
			return this.taskType;
		}

		public void setTaskType(String taskType) {
			this.taskType = taskType;
		}

		public String getTaskNo() {
			return this.taskNo;
		}

		public void setTaskNo(String taskNo) {
			this.taskNo = taskNo;
		}

		public Integer getTaskStatusCode() {
			return this.taskStatusCode;
		}

		public void setTaskStatusCode(Integer taskStatusCode) {
			this.taskStatusCode = taskStatusCode;
		}

		public String getTaskStatus() {
			return this.taskStatus;
		}

		public void setTaskStatus(String taskStatus) {
			this.taskStatus = taskStatus;
		}

		public String getTaskTypeDescription() {
			return this.taskTypeDescription;
		}

		public void setTaskTypeDescription(String taskTypeDescription) {
			this.taskTypeDescription = taskTypeDescription;
		}

		public Integer getTaskNum() {
			return this.taskNum;
		}

		public void setTaskNum(Integer taskNum) {
			this.taskNum = taskNum;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public Long getCreateTimeLong() {
			return this.createTimeLong;
		}

		public void setCreateTimeLong(Long createTimeLong) {
			this.createTimeLong = createTimeLong;
		}

		public String getClientip() {
			return this.clientip;
		}

		public void setClientip(String clientip) {
			this.clientip = clientip;
		}
	}

	@Override
	public QueryTaskInfoHistoryResponse getInstance(UnmarshallerContext context) {
		return	QueryTaskInfoHistoryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
