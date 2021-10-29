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

		private String targetDBCluster;

		private String status;

		private String progress;

		public String getSourceDBCluster() {
			return this.sourceDBCluster;
		}

		public void setSourceDBCluster(String sourceDBCluster) {
			this.sourceDBCluster = sourceDBCluster;
		}

		public String getTargetDBCluster() {
			return this.targetDBCluster;
		}

		public void setTargetDBCluster(String targetDBCluster) {
			this.targetDBCluster = targetDBCluster;
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
	}

	@Override
	public DescribeTransferHistoryResponse getInstance(UnmarshallerContext context) {
		return	DescribeTransferHistoryResponseUnmarshaller.unmarshall(this, context);
	}
}
