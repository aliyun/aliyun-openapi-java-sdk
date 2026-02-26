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
import com.aliyuncs.cloudapi.transform.v20160714.DryRunSwaggerResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DryRunSwaggerResponse extends AcsResponse {

	private String globalCondition;

	private String requestId;

	private List<ApiDryRunSwaggerSuccess> success;

	private List<ApiImportSwaggerFailed> failed;

	private List<ApiImportModelFailed> modelFailed;

	private List<ApiImportModelSuccess> modelSuccess;

	public String getGlobalCondition() {
		return this.globalCondition;
	}

	public void setGlobalCondition(String globalCondition) {
		this.globalCondition = globalCondition;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ApiDryRunSwaggerSuccess> getSuccess() {
		return this.success;
	}

	public void setSuccess(List<ApiDryRunSwaggerSuccess> success) {
		this.success = success;
	}

	public List<ApiImportSwaggerFailed> getFailed() {
		return this.failed;
	}

	public void setFailed(List<ApiImportSwaggerFailed> failed) {
		this.failed = failed;
	}

	public List<ApiImportModelFailed> getModelFailed() {
		return this.modelFailed;
	}

	public void setModelFailed(List<ApiImportModelFailed> modelFailed) {
		this.modelFailed = modelFailed;
	}

	public List<ApiImportModelSuccess> getModelSuccess() {
		return this.modelSuccess;
	}

	public void setModelSuccess(List<ApiImportModelSuccess> modelSuccess) {
		this.modelSuccess = modelSuccess;
	}

	public static class ApiDryRunSwaggerSuccess {

		private String path;

		private String httpMethod;

		private String apiSwagger;

		private String apiOperation;

		private String apiUid;

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

		public String getApiSwagger() {
			return this.apiSwagger;
		}

		public void setApiSwagger(String apiSwagger) {
			this.apiSwagger = apiSwagger;
		}

		public String getApiOperation() {
			return this.apiOperation;
		}

		public void setApiOperation(String apiOperation) {
			this.apiOperation = apiOperation;
		}

		public String getApiUid() {
			return this.apiUid;
		}

		public void setApiUid(String apiUid) {
			this.apiUid = apiUid;
		}
	}

	public static class ApiImportSwaggerFailed {

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

	public static class ApiImportModelFailed {

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

	public static class ApiImportModelSuccess {

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
	public DryRunSwaggerResponse getInstance(UnmarshallerContext context) {
		return	DryRunSwaggerResponseUnmarshaller.unmarshall(this, context);
	}
}
