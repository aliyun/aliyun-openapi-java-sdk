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
import com.aliyuncs.nas.transform.v20170626.DescribeDataFlowSubTasksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDataFlowSubTasksResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private List<DataFlowSubTaskItem> dataFlowSubTask;

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

	public List<DataFlowSubTaskItem> getDataFlowSubTask() {
		return this.dataFlowSubTask;
	}

	public void setDataFlowSubTask(List<DataFlowSubTaskItem> dataFlowSubTask) {
		this.dataFlowSubTask = dataFlowSubTask;
	}

	public static class DataFlowSubTaskItem {

		private String fileSystemId;

		private String dataFlowId;

		private String dataFlowTaskId;

		private String dataFlowSubTaskId;

		private String srcFilePath;

		private String dstFilePath;

		private String status;

		private Integer progress;

		private String createTime;

		private String startTime;

		private String endTime;

		private String errorMsg;

		private ProgressStats progressStats;

		private FileDetail fileDetail;

		public String getFileSystemId() {
			return this.fileSystemId;
		}

		public void setFileSystemId(String fileSystemId) {
			this.fileSystemId = fileSystemId;
		}

		public String getDataFlowId() {
			return this.dataFlowId;
		}

		public void setDataFlowId(String dataFlowId) {
			this.dataFlowId = dataFlowId;
		}

		public String getDataFlowTaskId() {
			return this.dataFlowTaskId;
		}

		public void setDataFlowTaskId(String dataFlowTaskId) {
			this.dataFlowTaskId = dataFlowTaskId;
		}

		public String getDataFlowSubTaskId() {
			return this.dataFlowSubTaskId;
		}

		public void setDataFlowSubTaskId(String dataFlowSubTaskId) {
			this.dataFlowSubTaskId = dataFlowSubTaskId;
		}

		public String getSrcFilePath() {
			return this.srcFilePath;
		}

		public void setSrcFilePath(String srcFilePath) {
			this.srcFilePath = srcFilePath;
		}

		public String getDstFilePath() {
			return this.dstFilePath;
		}

		public void setDstFilePath(String dstFilePath) {
			this.dstFilePath = dstFilePath;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Integer getProgress() {
			return this.progress;
		}

		public void setProgress(Integer progress) {
			this.progress = progress;
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

		public String getErrorMsg() {
			return this.errorMsg;
		}

		public void setErrorMsg(String errorMsg) {
			this.errorMsg = errorMsg;
		}

		public ProgressStats getProgressStats() {
			return this.progressStats;
		}

		public void setProgressStats(ProgressStats progressStats) {
			this.progressStats = progressStats;
		}

		public FileDetail getFileDetail() {
			return this.fileDetail;
		}

		public void setFileDetail(FileDetail fileDetail) {
			this.fileDetail = fileDetail;
		}

		public static class ProgressStats {

			private Long bytesTotal;

			private Long bytesDone;

			private Long actualBytes;

			private Long averageSpeed;

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

			public Long getAverageSpeed() {
				return this.averageSpeed;
			}

			public void setAverageSpeed(Long averageSpeed) {
				this.averageSpeed = averageSpeed;
			}
		}

		public static class FileDetail {

			private Long modifyTime;

			private Long size;

			private String checksum;

			public Long getModifyTime() {
				return this.modifyTime;
			}

			public void setModifyTime(Long modifyTime) {
				this.modifyTime = modifyTime;
			}

			public Long getSize() {
				return this.size;
			}

			public void setSize(Long size) {
				this.size = size;
			}

			public String getChecksum() {
				return this.checksum;
			}

			public void setChecksum(String checksum) {
				this.checksum = checksum;
			}
		}
	}

	@Override
	public DescribeDataFlowSubTasksResponse getInstance(UnmarshallerContext context) {
		return	DescribeDataFlowSubTasksResponseUnmarshaller.unmarshall(this, context);
	}
}
