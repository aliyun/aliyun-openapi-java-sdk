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

package com.aliyuncs.nas.model.v20170626;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.nas.transform.v20170626.DescribeDataFlowTasksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDataFlowTasksResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private List<Task> taskInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public List<Task> getTaskInfo() {
		return this.taskInfo;
	}

	public void setTaskInfo(List<Task> taskInfo) {
		this.taskInfo = taskInfo;
	}

	public static class Task {

		private String filesystemId;

		private String dataFlowId;

		private String taskId;

		private String sourceStorage;

		private String fileSystemPath;

		private String originator;

		private String taskAction;

		private String dataType;

		private Long progress;

		private String status;

		private String reportPath;

		private String createTime;

		private String startTime;

		private String endTime;

		private String fsPath;

		public String getFilesystemId() {
			return this.filesystemId;
		}

		public void setFilesystemId(String filesystemId) {
			this.filesystemId = filesystemId;
		}

		public String getDataFlowId() {
			return this.dataFlowId;
		}

		public void setDataFlowId(String dataFlowId) {
			this.dataFlowId = dataFlowId;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public String getSourceStorage() {
			return this.sourceStorage;
		}

		public void setSourceStorage(String sourceStorage) {
			this.sourceStorage = sourceStorage;
		}

		public String getFileSystemPath() {
			return this.fileSystemPath;
		}

		public void setFileSystemPath(String fileSystemPath) {
			this.fileSystemPath = fileSystemPath;
		}

		public String getOriginator() {
			return this.originator;
		}

		public void setOriginator(String originator) {
			this.originator = originator;
		}

		public String getTaskAction() {
			return this.taskAction;
		}

		public void setTaskAction(String taskAction) {
			this.taskAction = taskAction;
		}

		public String getDataType() {
			return this.dataType;
		}

		public void setDataType(String dataType) {
			this.dataType = dataType;
		}

		public Long getProgress() {
			return this.progress;
		}

		public void setProgress(Long progress) {
			this.progress = progress;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getReportPath() {
			return this.reportPath;
		}

		public void setReportPath(String reportPath) {
			this.reportPath = reportPath;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getFsPath() {
			return this.fsPath;
		}

		public void setFsPath(String fsPath) {
			this.fsPath = fsPath;
		}
	}

	@Override
	public DescribeDataFlowTasksResponse getInstance(UnmarshallerContext context) {
		return	DescribeDataFlowTasksResponseUnmarshaller.unmarshall(this, context);
	}
}
