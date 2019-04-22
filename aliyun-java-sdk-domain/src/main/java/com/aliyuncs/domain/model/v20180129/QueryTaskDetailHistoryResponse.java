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
import com.aliyuncs.domain.transform.v20180129.QueryTaskDetailHistoryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryTaskDetailHistoryResponse extends AcsResponse {

	private String requestId;

	private Integer pageSize;

	private List<TaskDetailHistory> objects;

	private CurrentPageCursor currentPageCursor;

	private NextPageCursor nextPageCursor;

	private PrePageCursor prePageCursor;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<TaskDetailHistory> getObjects() {
		return this.objects;
	}

	public void setObjects(List<TaskDetailHistory> objects) {
		this.objects = objects;
	}

	public CurrentPageCursor getCurrentPageCursor() {
		return this.currentPageCursor;
	}

	public void setCurrentPageCursor(CurrentPageCursor currentPageCursor) {
		this.currentPageCursor = currentPageCursor;
	}

	public NextPageCursor getNextPageCursor() {
		return this.nextPageCursor;
	}

	public void setNextPageCursor(NextPageCursor nextPageCursor) {
		this.nextPageCursor = nextPageCursor;
	}

	public PrePageCursor getPrePageCursor() {
		return this.prePageCursor;
	}

	public void setPrePageCursor(PrePageCursor prePageCursor) {
		this.prePageCursor = prePageCursor;
	}

	public static class TaskDetailHistory {

		private String taskNo;

		private String taskDetailNo;

		private String taskType;

		private String instanceId;

		private String domainName;

		private String taskStatus;

		private String updateTime;

		private String createTime;

		private Integer tryCount;

		private String errorMsg;

		private Integer taskStatusCode;

		private String taskTypeDescription;

		public String getTaskNo() {
			return this.taskNo;
		}

		public void setTaskNo(String taskNo) {
			this.taskNo = taskNo;
		}

		public String getTaskDetailNo() {
			return this.taskDetailNo;
		}

		public void setTaskDetailNo(String taskDetailNo) {
			this.taskDetailNo = taskDetailNo;
		}

		public String getTaskType() {
			return this.taskType;
		}

		public void setTaskType(String taskType) {
			this.taskType = taskType;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public String getTaskStatus() {
			return this.taskStatus;
		}

		public void setTaskStatus(String taskStatus) {
			this.taskStatus = taskStatus;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public Integer getTryCount() {
			return this.tryCount;
		}

		public void setTryCount(Integer tryCount) {
			this.tryCount = tryCount;
		}

		public String getErrorMsg() {
			return this.errorMsg;
		}

		public void setErrorMsg(String errorMsg) {
			this.errorMsg = errorMsg;
		}

		public Integer getTaskStatusCode() {
			return this.taskStatusCode;
		}

		public void setTaskStatusCode(Integer taskStatusCode) {
			this.taskStatusCode = taskStatusCode;
		}

		public String getTaskTypeDescription() {
			return this.taskTypeDescription;
		}

		public void setTaskTypeDescription(String taskTypeDescription) {
			this.taskTypeDescription = taskTypeDescription;
		}
	}

	public static class CurrentPageCursor {

		private String taskNo;

		private String taskDetailNo;

		private String taskType;

		private String instanceId;

		private String domainName;

		private String taskStatus;

		private String updateTime;

		private String createTime;

		private Integer tryCount;

		private String errorMsg;

		private Integer taskStatusCode;

		private String taskTypeDescription;

		public String getTaskNo() {
			return this.taskNo;
		}

		public void setTaskNo(String taskNo) {
			this.taskNo = taskNo;
		}

		public String getTaskDetailNo() {
			return this.taskDetailNo;
		}

		public void setTaskDetailNo(String taskDetailNo) {
			this.taskDetailNo = taskDetailNo;
		}

		public String getTaskType() {
			return this.taskType;
		}

		public void setTaskType(String taskType) {
			this.taskType = taskType;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public String getTaskStatus() {
			return this.taskStatus;
		}

		public void setTaskStatus(String taskStatus) {
			this.taskStatus = taskStatus;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public Integer getTryCount() {
			return this.tryCount;
		}

		public void setTryCount(Integer tryCount) {
			this.tryCount = tryCount;
		}

		public String getErrorMsg() {
			return this.errorMsg;
		}

		public void setErrorMsg(String errorMsg) {
			this.errorMsg = errorMsg;
		}

		public Integer getTaskStatusCode() {
			return this.taskStatusCode;
		}

		public void setTaskStatusCode(Integer taskStatusCode) {
			this.taskStatusCode = taskStatusCode;
		}

		public String getTaskTypeDescription() {
			return this.taskTypeDescription;
		}

		public void setTaskTypeDescription(String taskTypeDescription) {
			this.taskTypeDescription = taskTypeDescription;
		}
	}

	public static class NextPageCursor {

		private String taskNo;

		private String taskDetailNo;

		private String taskType;

		private String instanceId;

		private String domainName;

		private String taskStatus;

		private String updateTime;

		private String createTime;

		private Integer tryCount;

		private String errorMsg;

		private Integer taskStatusCode;

		private String taskTypeDescription;

		public String getTaskNo() {
			return this.taskNo;
		}

		public void setTaskNo(String taskNo) {
			this.taskNo = taskNo;
		}

		public String getTaskDetailNo() {
			return this.taskDetailNo;
		}

		public void setTaskDetailNo(String taskDetailNo) {
			this.taskDetailNo = taskDetailNo;
		}

		public String getTaskType() {
			return this.taskType;
		}

		public void setTaskType(String taskType) {
			this.taskType = taskType;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public String getTaskStatus() {
			return this.taskStatus;
		}

		public void setTaskStatus(String taskStatus) {
			this.taskStatus = taskStatus;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public Integer getTryCount() {
			return this.tryCount;
		}

		public void setTryCount(Integer tryCount) {
			this.tryCount = tryCount;
		}

		public String getErrorMsg() {
			return this.errorMsg;
		}

		public void setErrorMsg(String errorMsg) {
			this.errorMsg = errorMsg;
		}

		public Integer getTaskStatusCode() {
			return this.taskStatusCode;
		}

		public void setTaskStatusCode(Integer taskStatusCode) {
			this.taskStatusCode = taskStatusCode;
		}

		public String getTaskTypeDescription() {
			return this.taskTypeDescription;
		}

		public void setTaskTypeDescription(String taskTypeDescription) {
			this.taskTypeDescription = taskTypeDescription;
		}
	}

	public static class PrePageCursor {

		private String taskNo;

		private String taskDetailNo;

		private String taskType;

		private String instanceId;

		private String domainName;

		private String taskStatus;

		private String updateTime;

		private String createTime;

		private Integer tryCount;

		private String errorMsg;

		private Integer taskStatusCode;

		private String taskTypeDescription;

		public String getTaskNo() {
			return this.taskNo;
		}

		public void setTaskNo(String taskNo) {
			this.taskNo = taskNo;
		}

		public String getTaskDetailNo() {
			return this.taskDetailNo;
		}

		public void setTaskDetailNo(String taskDetailNo) {
			this.taskDetailNo = taskDetailNo;
		}

		public String getTaskType() {
			return this.taskType;
		}

		public void setTaskType(String taskType) {
			this.taskType = taskType;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public String getTaskStatus() {
			return this.taskStatus;
		}

		public void setTaskStatus(String taskStatus) {
			this.taskStatus = taskStatus;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public Integer getTryCount() {
			return this.tryCount;
		}

		public void setTryCount(Integer tryCount) {
			this.tryCount = tryCount;
		}

		public String getErrorMsg() {
			return this.errorMsg;
		}

		public void setErrorMsg(String errorMsg) {
			this.errorMsg = errorMsg;
		}

		public Integer getTaskStatusCode() {
			return this.taskStatusCode;
		}

		public void setTaskStatusCode(Integer taskStatusCode) {
			this.taskStatusCode = taskStatusCode;
		}

		public String getTaskTypeDescription() {
			return this.taskTypeDescription;
		}

		public void setTaskTypeDescription(String taskTypeDescription) {
			this.taskTypeDescription = taskTypeDescription;
		}
	}

	@Override
	public QueryTaskDetailHistoryResponse getInstance(UnmarshallerContext context) {
		return	QueryTaskDetailHistoryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
