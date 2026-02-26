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
import com.aliyuncs.cloudapi.transform.v20160714.ImportOASResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ImportOASResponse extends AcsResponse {

	private String operationId;

	private String requestId;

	private List<SuccessApi> successApis;

	private List<FailedApi> failedApis;

	private List<FailedModel> failedModels;

	private List<SuccessModel> successModels;

	private List<String> errorMessages;

	private List<String> warningMessages;

	public String getOperationId() {
		return this.operationId;
	}

	public void setOperationId(String operationId) {
		this.operationId = operationId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<SuccessApi> getSuccessApis() {
		return this.successApis;
	}

	public void setSuccessApis(List<SuccessApi> successApis) {
		this.successApis = successApis;
	}

	public List<FailedApi> getFailedApis() {
		return this.failedApis;
	}

	public void setFailedApis(List<FailedApi> failedApis) {
		this.failedApis = failedApis;
	}

	public List<FailedModel> getFailedModels() {
		return this.failedModels;
	}

	public void setFailedModels(List<FailedModel> failedModels) {
		this.failedModels = failedModels;
	}

	public List<SuccessModel> getSuccessModels() {
		return this.successModels;
	}

	public void setSuccessModels(List<SuccessModel> successModels) {
		this.successModels = successModels;
	}

	public List<String> getErrorMessages() {
		return this.errorMessages;
	}

	public void setErrorMessages(List<String> errorMessages) {
		this.errorMessages = errorMessages;
	}

	public List<String> getWarningMessages() {
		return this.warningMessages;
	}

	public void setWarningMessages(List<String> warningMessages) {
		this.warningMessages = warningMessages;
	}

	public static class SuccessApi {

		private String path;

		private String httpMethod;

		private String apiId;

		private String apiOperation;

		public String getPath() {
			return this.path;
		}

		public void setPath(String path) {
			this.path = path;
		}

		public String getHttpMethod() {
			return this.httpMethod;
		}

		public void setHttpMethod(String httpMethod) {
			this.httpMethod = httpMethod;
		}

		public String getApiId() {
			return this.apiId;
		}

		public void setApiId(String apiId) {
			this.apiId = apiId;
		}

		public String getApiOperation() {
			return this.apiOperation;
		}

		public void setApiOperation(String apiOperation) {
			this.apiOperation = apiOperation;
		}
	}

	public static class FailedApi {

		private String path;

		private String httpMethod;

		private String errorMsg;

		public String getPath() {
			return this.path;
		}

		public void setPath(String path) {
			this.path = path;
		}

		public String getHttpMethod() {
			return this.httpMethod;
		}

		public void setHttpMethod(String httpMethod) {
			this.httpMethod = httpMethod;
		}

		public String getErrorMsg() {
			return this.errorMsg;
		}

		public void setErrorMsg(String errorMsg) {
			this.errorMsg = errorMsg;
		}
	}

	public static class FailedModel {

		private String errorMsg;

		private String modelName;

		private String groupId;

		public String getErrorMsg() {
			return this.errorMsg;
		}

		public void setErrorMsg(String errorMsg) {
			this.errorMsg = errorMsg;
		}

		public String getModelName() {
			return this.modelName;
		}

		public void setModelName(String modelName) {
			this.modelName = modelName;
		}

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}
	}

	public static class SuccessModel {

		private String modelUid;

		private String modelName;

		private String groupId;

		private String modelOperation;

		public String getModelUid() {
			return this.modelUid;
		}

		public void setModelUid(String modelUid) {
			this.modelUid = modelUid;
		}

		public String getModelName() {
			return this.modelName;
		}

		public void setModelName(String modelName) {
			this.modelName = modelName;
		}

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public String getModelOperation() {
			return this.modelOperation;
		}

		public void setModelOperation(String modelOperation) {
			this.modelOperation = modelOperation;
		}
	}

	@Override
	public ImportOASResponse getInstance(UnmarshallerContext context) {
		return	ImportOASResponseUnmarshaller.unmarshall(this, context);
	}
}
