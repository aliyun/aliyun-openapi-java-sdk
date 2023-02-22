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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.GetOnceTaskResultInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetOnceTaskResultInfoResponse extends AcsResponse {

	private Long collectTime;

	private String requestId;

	private Integer totalCount;

	private Long taskId;

	private Integer finishCount;

	private Integer failedCount;

	private Integer successCount;

	private TaskInfo taskInfo;

	public Long getCollectTime() {
		return this.collectTime;
	}

	public void setCollectTime(Long collectTime) {
		this.collectTime = collectTime;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Long getTaskId() {
		return this.taskId;
	}

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}

	public Integer getFinishCount() {
		return this.finishCount;
	}

	public void setFinishCount(Integer finishCount) {
		this.finishCount = finishCount;
	}

	public Integer getFailedCount() {
		return this.failedCount;
	}

	public void setFailedCount(Integer failedCount) {
		this.failedCount = failedCount;
	}

	public Integer getSuccessCount() {
		return this.successCount;
	}

	public void setSuccessCount(Integer successCount) {
		this.successCount = successCount;
	}

	public TaskInfo getTaskInfo() {
		return this.taskInfo;
	}

	public void setTaskInfo(TaskInfo taskInfo) {
		this.taskInfo = taskInfo;
	}

	public static class TaskInfo {

		private String status;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	@Override
	public GetOnceTaskResultInfoResponse getInstance(UnmarshallerContext context) {
		return	GetOnceTaskResultInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
