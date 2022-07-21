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

package com.aliyuncs.imm.model.v20200930;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.imm.transform.v20200930.ListDatasetsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDatasetsResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private List<DatasetsItem> datasets;

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

	public List<DatasetsItem> getDatasets() {
		return this.datasets;
	}

	public void setDatasets(List<DatasetsItem> datasets) {
		this.datasets = datasets;
	}

	public static class DatasetsItem {

		private String projectName;

		private String datasetName;

		private String templateId;

		private String createTime;

		private String updateTime;

		private String description;

		private Long datasetMaxBindCount;

		private Long datasetMaxFileCount;

		private Long datasetMaxEntityCount;

		private Long datasetMaxRelationCount;

		private Long datasetMaxTotalFileSize;

		private Long bindCount;

		private Long fileCount;

		private Long totalFileSize;

		public String getProjectName() {
			return this.projectName;
		}

		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}

		public String getDatasetName() {
			return this.datasetName;
		}

		public void setDatasetName(String datasetName) {
			this.datasetName = datasetName;
		}

		public String getTemplateId() {
			return this.templateId;
		}

		public void setTemplateId(String templateId) {
			this.templateId = templateId;
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

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Long getDatasetMaxBindCount() {
			return this.datasetMaxBindCount;
		}

		public void setDatasetMaxBindCount(Long datasetMaxBindCount) {
			this.datasetMaxBindCount = datasetMaxBindCount;
		}

		public Long getDatasetMaxFileCount() {
			return this.datasetMaxFileCount;
		}

		public void setDatasetMaxFileCount(Long datasetMaxFileCount) {
			this.datasetMaxFileCount = datasetMaxFileCount;
		}

		public Long getDatasetMaxEntityCount() {
			return this.datasetMaxEntityCount;
		}

		public void setDatasetMaxEntityCount(Long datasetMaxEntityCount) {
			this.datasetMaxEntityCount = datasetMaxEntityCount;
		}

		public Long getDatasetMaxRelationCount() {
			return this.datasetMaxRelationCount;
		}

		public void setDatasetMaxRelationCount(Long datasetMaxRelationCount) {
			this.datasetMaxRelationCount = datasetMaxRelationCount;
		}

		public Long getDatasetMaxTotalFileSize() {
			return this.datasetMaxTotalFileSize;
		}

		public void setDatasetMaxTotalFileSize(Long datasetMaxTotalFileSize) {
			this.datasetMaxTotalFileSize = datasetMaxTotalFileSize;
		}

		public Long getBindCount() {
			return this.bindCount;
		}

		public void setBindCount(Long bindCount) {
			this.bindCount = bindCount;
		}

		public Long getFileCount() {
			return this.fileCount;
		}

		public void setFileCount(Long fileCount) {
			this.fileCount = fileCount;
		}

		public Long getTotalFileSize() {
			return this.totalFileSize;
		}

		public void setTotalFileSize(Long totalFileSize) {
			this.totalFileSize = totalFileSize;
		}
	}

	@Override
	public ListDatasetsResponse getInstance(UnmarshallerContext context) {
		return	ListDatasetsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
