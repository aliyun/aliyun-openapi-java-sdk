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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.imm.transform.v20200930.GetProjectResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetProjectResponse extends AcsResponse {

	private String requestId;

	private Project project;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Project getProject() {
		return this.project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public static class Project {

		private String projectName;

		private String serviceRole;

		private String templateId;

		private String createTime;

		private String updateTime;

		private String description;

		private Long projectQueriesPerSecond;

		private Long engineConcurrency;

		private Long projectMaxDatasetCount;

		private Long datasetMaxBindCount;

		private Long datasetMaxFileCount;

		private Long datasetMaxEntityCount;

		private Long datasetMaxRelationCount;

		private Long datasetMaxTotalFileSize;

		private Long datasetCount;

		private Long fileCount;

		private Long totalFileSize;

		public String getProjectName() {
			return this.projectName;
		}

		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}

		public String getServiceRole() {
			return this.serviceRole;
		}

		public void setServiceRole(String serviceRole) {
			this.serviceRole = serviceRole;
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

		public Long getProjectQueriesPerSecond() {
			return this.projectQueriesPerSecond;
		}

		public void setProjectQueriesPerSecond(Long projectQueriesPerSecond) {
			this.projectQueriesPerSecond = projectQueriesPerSecond;
		}

		public Long getEngineConcurrency() {
			return this.engineConcurrency;
		}

		public void setEngineConcurrency(Long engineConcurrency) {
			this.engineConcurrency = engineConcurrency;
		}

		public Long getProjectMaxDatasetCount() {
			return this.projectMaxDatasetCount;
		}

		public void setProjectMaxDatasetCount(Long projectMaxDatasetCount) {
			this.projectMaxDatasetCount = projectMaxDatasetCount;
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

		public Long getDatasetCount() {
			return this.datasetCount;
		}

		public void setDatasetCount(Long datasetCount) {
			this.datasetCount = datasetCount;
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
	public GetProjectResponse getInstance(UnmarshallerContext context) {
		return	GetProjectResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
