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
import com.aliyuncs.cloudapi.transform.v20160714.ImportSwaggerResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ImportSwaggerResponse extends AcsResponse {

	private String requestId;

	private List<ApiImportSwaggerSuccess> success;

	private List<ApiImportSwaggerFailed> failed;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ApiImportSwaggerSuccess> getSuccess() {
		return this.success;
	}

	public void setSuccess(List<ApiImportSwaggerSuccess> success) {
		this.success = success;
	}

	public List<ApiImportSwaggerFailed> getFailed() {
		return this.failed;
	}

	public void setFailed(List<ApiImportSwaggerFailed> failed) {
		this.failed = failed;
	}

	public static class ApiImportSwaggerSuccess {

		private String path;

		private String httpMethod;

		private String apiUid;

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

		public String getApiUid() {
			return this.apiUid;
		}

		public void setApiUid(String apiUid) {
			this.apiUid = apiUid;
		}

		public String getApiOperation() {
			return this.apiOperation;
		}

		public void setApiOperation(String apiOperation) {
			this.apiOperation = apiOperation;
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

	@Override
	public ImportSwaggerResponse getInstance(UnmarshallerContext context) {
		return	ImportSwaggerResponseUnmarshaller.unmarshall(this, context);
	}
}
