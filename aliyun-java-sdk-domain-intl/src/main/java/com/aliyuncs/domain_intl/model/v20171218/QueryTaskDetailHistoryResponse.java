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

package com.aliyuncs.domain_intl.model.v20171218;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.domain_intl.transform.v20171218.QueryTaskDetailHistoryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryTaskDetailHistoryResponse extends AcsResponse {

	private Integer pageSize;

	private String requestId;

	private List<TaskDetailHistory> objects;

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

	public static class TaskDetailHistory {

		private String updateTime;

		private String taskDetailNo;

		private String createTime;

		private String instanceId;

		private String domainName;

		private String taskType;

		private String taskNo;

		private Integer taskStatusCode;

		private String taskStatus;

		private String taskTypeDescription;

		private Integer tryCount;

		private String errorMsg;

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public String getTaskDetailNo() {
			return this.taskDetailNo;
		}

		public void setTaskDetailNo(String taskDetailNo) {
			this.taskDetailNo = taskDetailNo;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
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
	}

	public static class CurrentPageCursor {

		private String updateTime;

		private String taskDetailNo;

		private String createTime;

		private String instanceId;

		private String domainName;

		private String taskType;

		private String taskNo;

		private Integer taskStatusCode;

		private String taskStatus;

		private String taskTypeDescription;

		private Integer tryCount;

		private String errorMsg;

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public String getTaskDetailNo() {
			return this.taskDetailNo;
		}

		public void setTaskDetailNo(String taskDetailNo) {
			this.taskDetailNo = taskDetailNo;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
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
	}

	public static class PrePageCursor {

		private String updateTime;

		private String taskDetailNo;

		private String createTime;

		private String instanceId;

		private String domainName;

		private String taskType;

		private String taskNo;

		private Integer taskStatusCode;

		private String taskStatus;

		private String taskTypeDescription;

		private Integer tryCount;

		private String errorMsg;

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public String getTaskDetailNo() {
			return this.taskDetailNo;
		}

		public void setTaskDetailNo(String taskDetailNo) {
			this.taskDetailNo = taskDetailNo;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
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
	}

	public static class NextPageCursor {

		private String updateTime;

		private String taskDetailNo;

		private String createTime;

		private String instanceId;

		private String domainName;

		private String taskType;

		private String taskNo;

		private Integer taskStatusCode;

		private String taskStatus;

		private String taskTypeDescription;

		private Integer tryCount;

		private String errorMsg;

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public String getTaskDetailNo() {
			return this.taskDetailNo;
		}

		public void setTaskDetailNo(String taskDetailNo) {
			this.taskDetailNo = taskDetailNo;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
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
