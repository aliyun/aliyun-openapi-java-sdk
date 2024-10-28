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
import com.aliyuncs.nas.transform.v20170626.DescribeDataFlowsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDataFlowsResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private List<DataFlow> dataFlowInfo;

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

	public List<DataFlow> getDataFlowInfo() {
		return this.dataFlowInfo;
	}

	public void setDataFlowInfo(List<DataFlow> dataFlowInfo) {
		this.dataFlowInfo = dataFlowInfo;
	}

	public static class DataFlow {

		private String fileSystemId;

		private String dataFlowId;

		private String fsetId;

		private String status;

		private String errorMessage;

		private String sourceStorage;

		private String sourceSecurityType;

		private Long throughput;

		private String description;

		private String createTime;

		private String updateTime;

		private String fileSystemPath;

		private String fsetDescription;

		private Long autoRefreshInterval;

		private String autoRefreshPolicy;

		private String sourceStoragePath;

		private List<AutoRefreshItem> autoRefresh;

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

		public String getFsetId() {
			return this.fsetId;
		}

		public void setFsetId(String fsetId) {
			this.fsetId = fsetId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getErrorMessage() {
			return this.errorMessage;
		}

		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}

		public String getSourceStorage() {
			return this.sourceStorage;
		}

		public void setSourceStorage(String sourceStorage) {
			this.sourceStorage = sourceStorage;
		}

		public String getSourceSecurityType() {
			return this.sourceSecurityType;
		}

		public void setSourceSecurityType(String sourceSecurityType) {
			this.sourceSecurityType = sourceSecurityType;
		}

		public Long getThroughput() {
			return this.throughput;
		}

		public void setThroughput(Long throughput) {
			this.throughput = throughput;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public String getFileSystemPath() {
			return this.fileSystemPath;
		}

		public void setFileSystemPath(String fileSystemPath) {
			this.fileSystemPath = fileSystemPath;
		}

		public String getFsetDescription() {
			return this.fsetDescription;
		}

		public void setFsetDescription(String fsetDescription) {
			this.fsetDescription = fsetDescription;
		}

		public Long getAutoRefreshInterval() {
			return this.autoRefreshInterval;
		}

		public void setAutoRefreshInterval(Long autoRefreshInterval) {
			this.autoRefreshInterval = autoRefreshInterval;
		}

		public String getAutoRefreshPolicy() {
			return this.autoRefreshPolicy;
		}

		public void setAutoRefreshPolicy(String autoRefreshPolicy) {
			this.autoRefreshPolicy = autoRefreshPolicy;
		}

		public String getSourceStoragePath() {
			return this.sourceStoragePath;
		}

		public void setSourceStoragePath(String sourceStoragePath) {
			this.sourceStoragePath = sourceStoragePath;
		}

		public List<AutoRefreshItem> getAutoRefresh() {
			return this.autoRefresh;
		}

		public void setAutoRefresh(List<AutoRefreshItem> autoRefresh) {
			this.autoRefresh = autoRefresh;
		}

		public static class AutoRefreshItem {

			private String refreshPath;

			public String getRefreshPath() {
				return this.refreshPath;
			}

			public void setRefreshPath(String refreshPath) {
				this.refreshPath = refreshPath;
			}
		}
	}

	@Override
	public DescribeDataFlowsResponse getInstance(UnmarshallerContext context) {
		return	DescribeDataFlowsResponseUnmarshaller.unmarshall(this, context);
	}
}
