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

		private String conflictPolicy;

		private String directory;

		private String dstDirectory;

		private String errorMsg;

		private List<Report> reports;

		private ProgressStats progressStats;

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

		public String getConflictPolicy() {
			return this.conflictPolicy;
		}

		public void setConflictPolicy(String conflictPolicy) {
			this.conflictPolicy = conflictPolicy;
		}

		public String getDirectory() {
			return this.directory;
		}

		public void setDirectory(String directory) {
			this.directory = directory;
		}

		public String getDstDirectory() {
			return this.dstDirectory;
		}

		public void setDstDirectory(String dstDirectory) {
			this.dstDirectory = dstDirectory;
		}

		public String getErrorMsg() {
			return this.errorMsg;
		}

		public void setErrorMsg(String errorMsg) {
			this.errorMsg = errorMsg;
		}

		public List<Report> getReports() {
			return this.reports;
		}

		public void setReports(List<Report> reports) {
			this.reports = reports;
		}

		public ProgressStats getProgressStats() {
			return this.progressStats;
		}

		public void setProgressStats(ProgressStats progressStats) {
			this.progressStats = progressStats;
		}

		public static class Report {

			private String name;

			private String path;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getPath() {
				return this.path;
			}

			public void setPath(String path) {
				this.path = path;
			}
		}

		public static class ProgressStats {

			private Long filesTotal;

			private Long filesDone;

			private Long actualFiles;

			private Long bytesTotal;

			private Long bytesDone;

			private Long actualBytes;

			private Long remainTime;

			private Long averageSpeed;

			public Long getFilesTotal() {
				return this.filesTotal;
			}

			public void setFilesTotal(Long filesTotal) {
				this.filesTotal = filesTotal;
			}

			public Long getFilesDone() {
				return this.filesDone;
			}

			public void setFilesDone(Long filesDone) {
				this.filesDone = filesDone;
			}

			public Long getActualFiles() {
				return this.actualFiles;
			}

			public void setActualFiles(Long actualFiles) {
				this.actualFiles = actualFiles;
			}

			public Long getBytesTotal() {
				return this.bytesTotal;
			}

			public void setBytesTotal(Long bytesTotal) {
				this.bytesTotal = bytesTotal;
			}

			public Long getBytesDone() {
				return this.bytesDone;
			}

			public void setBytesDone(Long bytesDone) {
				this.bytesDone = bytesDone;
			}

			public Long getActualBytes() {
				return this.actualBytes;
			}

			public void setActualBytes(Long actualBytes) {
				this.actualBytes = actualBytes;
			}

			public Long getRemainTime() {
				return this.remainTime;
			}

			public void setRemainTime(Long remainTime) {
				this.remainTime = remainTime;
			}

			public Long getAverageSpeed() {
				return this.averageSpeed;
			}

			public void setAverageSpeed(Long averageSpeed) {
				this.averageSpeed = averageSpeed;
			}
		}
	}

	@Override
	public DescribeDataFlowTasksResponse getInstance(UnmarshallerContext context) {
		return	DescribeDataFlowTasksResponseUnmarshaller.unmarshall(this, context);
	}
}
