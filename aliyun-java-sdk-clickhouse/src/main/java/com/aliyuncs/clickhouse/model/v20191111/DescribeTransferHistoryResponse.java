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

package com.aliyuncs.clickhouse.model.v20191111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.clickhouse.transform.v20191111.DescribeTransferHistoryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeTransferHistoryResponse extends AcsResponse {

	private String requestId;

	private List<HistoryDetail> historyDetails;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<HistoryDetail> getHistoryDetails() {
		return this.historyDetails;
	}

	public void setHistoryDetails(List<HistoryDetail> historyDetails) {
		this.historyDetails = historyDetails;
	}

	public static class HistoryDetail {

		private String sourceDBCluster;

		private String sourceControlVersion;

		private String targetDBCluster;

		private String targetControlVersion;

		private String status;

		private String progress;

		private String disableWriteWindows;

		private Long unsyncedBytes;

		private Long unsyncedParts;

		private Double partsPerMinute;

		private Long bytesPerMinute;

		private String subJob;

		private String subJobStatus;

		public String getSourceDBCluster() {
			return this.sourceDBCluster;
		}

		public void setSourceDBCluster(String sourceDBCluster) {
			this.sourceDBCluster = sourceDBCluster;
		}

		public String getSourceControlVersion() {
			return this.sourceControlVersion;
		}

		public void setSourceControlVersion(String sourceControlVersion) {
			this.sourceControlVersion = sourceControlVersion;
		}

		public String getTargetDBCluster() {
			return this.targetDBCluster;
		}

		public void setTargetDBCluster(String targetDBCluster) {
			this.targetDBCluster = targetDBCluster;
		}

		public String getTargetControlVersion() {
			return this.targetControlVersion;
		}

		public void setTargetControlVersion(String targetControlVersion) {
			this.targetControlVersion = targetControlVersion;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getProgress() {
			return this.progress;
		}

		public void setProgress(String progress) {
			this.progress = progress;
		}

		public String getDisableWriteWindows() {
			return this.disableWriteWindows;
		}

		public void setDisableWriteWindows(String disableWriteWindows) {
			this.disableWriteWindows = disableWriteWindows;
		}

		public Long getUnsyncedBytes() {
			return this.unsyncedBytes;
		}

		public void setUnsyncedBytes(Long unsyncedBytes) {
			this.unsyncedBytes = unsyncedBytes;
		}

		public Long getUnsyncedParts() {
			return this.unsyncedParts;
		}

		public void setUnsyncedParts(Long unsyncedParts) {
			this.unsyncedParts = unsyncedParts;
		}

		public Double getPartsPerMinute() {
			return this.partsPerMinute;
		}

		public void setPartsPerMinute(Double partsPerMinute) {
			this.partsPerMinute = partsPerMinute;
		}

		public Long getBytesPerMinute() {
			return this.bytesPerMinute;
		}

		public void setBytesPerMinute(Long bytesPerMinute) {
			this.bytesPerMinute = bytesPerMinute;
		}

		public String getSubJob() {
			return this.subJob;
		}

		public void setSubJob(String subJob) {
			this.subJob = subJob;
		}

		public String getSubJobStatus() {
			return this.subJobStatus;
		}

		public void setSubJobStatus(String subJobStatus) {
			this.subJobStatus = subJobStatus;
		}
	}

	@Override
	public DescribeTransferHistoryResponse getInstance(UnmarshallerContext context) {
		return	DescribeTransferHistoryResponseUnmarshaller.unmarshall(this, context);
	}
}
