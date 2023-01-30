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

package com.aliyuncs.cloudapi.model.v20160714;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudapi.transform.v20160714.DescribeImportOASTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeImportOASTaskResponse extends AcsResponse {

	private String requestId;

	private String taskStatus;

	private List<ApiResult> apiResults;

	private List<ModelResult> modelResults;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTaskStatus() {
		return this.taskStatus;
	}

	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}

	public List<ApiResult> getApiResults() {
		return this.apiResults;
	}

	public void setApiResults(List<ApiResult> apiResults) {
		this.apiResults = apiResults;
	}

	public List<ModelResult> getModelResults() {
		return this.modelResults;
	}

	public void setModelResults(List<ModelResult> modelResults) {
		this.modelResults = modelResults;
	}

	public static class ApiResult {

		private String apiId;

		private String path;

		private String method;

		private String description;

		private String groupId;

		private String apiName;

		private String errorMessage;

		private String updateStatus;

		public String getApiId() {
			return this.apiId;
		}

		public void setApiId(String apiId) {
			this.apiId = apiId;
		}

		public String getPath() {
			return this.path;
		}

		public void setPath(String path) {
			this.path = path;
		}

		public String getBizMethod() {
			return this.method;
		}

		public void setBizMethod(String method) {
			this.method = method;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public String getApiName() {
			return this.apiName;
		}

		public void setApiName(String apiName) {
			this.apiName = apiName;
		}

		public String getErrorMessage() {
			return this.errorMessage;
		}

		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}

		public String getUpdateStatus() {
			return this.updateStatus;
		}

		public void setUpdateStatus(String updateStatus) {
			this.updateStatus = updateStatus;
		}
	}

	public static class ModelResult {

		private String modelName;

		private String modelId;

		private String groupId;

		private String errorMessage;

		private String updateStatus;

		public String getModelName() {
			return this.modelName;
		}

		public void setModelName(String modelName) {
			this.modelName = modelName;
		}

		public String getModelId() {
			return this.modelId;
		}

		public void setModelId(String modelId) {
			this.modelId = modelId;
		}

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public String getErrorMessage() {
			return this.errorMessage;
		}

		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}

		public String getUpdateStatus() {
			return this.updateStatus;
		}

		public void setUpdateStatus(String updateStatus) {
			this.updateStatus = updateStatus;
		}
	}

	@Override
	public DescribeImportOASTaskResponse getInstance(UnmarshallerContext context) {
		return	DescribeImportOASTaskResponseUnmarshaller.unmarshall(this, context);
	}
}
