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

package com.aliyuncs.devops.model.v20210625;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.devops.transform.v20210625.GetWorkspaceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetWorkspaceResponse extends AcsResponse {

	private Boolean success;

	private String errorCode;

	private String errorMessage;

	private String requestId;

	private Workspace workspace;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Workspace getWorkspace() {
		return this.workspace;
	}

	public void setWorkspace(Workspace workspace) {
		this.workspace = workspace;
	}

	public static class Workspace {

		private String codeVersion;

		private String codeUrl;

		private String name;

		private String spec;

		private String status;

		private String template;

		private String id;

		private String userId;

		private String createTime;

		public String getCodeVersion() {
			return this.codeVersion;
		}

		public void setCodeVersion(String codeVersion) {
			this.codeVersion = codeVersion;
		}

		public String getCodeUrl() {
			return this.codeUrl;
		}

		public void setCodeUrl(String codeUrl) {
			this.codeUrl = codeUrl;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSpec() {
			return this.spec;
		}

		public void setSpec(String spec) {
			this.spec = spec;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getTemplate() {
			return this.template;
		}

		public void setTemplate(String template) {
			this.template = template;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}
	}

	@Override
	public GetWorkspaceResponse getInstance(UnmarshallerContext context) {
		return	GetWorkspaceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
