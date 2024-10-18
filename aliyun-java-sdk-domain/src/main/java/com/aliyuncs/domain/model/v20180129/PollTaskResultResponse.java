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
import com.aliyuncs.domain.transform.v20180129.PollTaskResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class PollTaskResultResponse extends AcsResponse {

	private Boolean prePage;

	private Integer currentPageNum;

	private String requestId;

	private Integer pageSize;

	private Integer totalPageNum;

	private Integer totalItemNum;

	private Boolean nextPage;

	private List<TaskDetail> data;

	public Boolean getPrePage() {
		return this.prePage;
	}

	public void setPrePage(Boolean prePage) {
		this.prePage = prePage;
	}

	public Integer getCurrentPageNum() {
		return this.currentPageNum;
	}

	public void setCurrentPageNum(Integer currentPageNum) {
		this.currentPageNum = currentPageNum;
	}

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

	public Integer getTotalPageNum() {
		return this.totalPageNum;
	}

	public void setTotalPageNum(Integer totalPageNum) {
		this.totalPageNum = totalPageNum;
	}

	public Integer getTotalItemNum() {
		return this.totalItemNum;
	}

	public void setTotalItemNum(Integer totalItemNum) {
		this.totalItemNum = totalItemNum;
	}

	public Boolean getNextPage() {
		return this.nextPage;
	}

	public void setNextPage(Boolean nextPage) {
		this.nextPage = nextPage;
	}

	public List<TaskDetail> getData() {
		return this.data;
	}

	public void setData(List<TaskDetail> data) {
		this.data = data;
	}

	public static class TaskDetail {

		private String updateTime;

		private String taskDetailNo;

		private String createTime;

		private String instanceId;

		private String domainName;

		private String taskType;

		private String taskNo;

		private String taskResult;

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

		public String getTaskResult() {
			return this.taskResult;
		}

		public void setTaskResult(String taskResult) {
			this.taskResult = taskResult;
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
	public PollTaskResultResponse getInstance(UnmarshallerContext context) {
		return	PollTaskResultResponseUnmarshaller.unmarshall(this, context);
	}
}
