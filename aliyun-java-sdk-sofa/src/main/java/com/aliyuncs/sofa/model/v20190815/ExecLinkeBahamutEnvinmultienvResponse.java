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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.ExecLinkeBahamutEnvinmultienvResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ExecLinkeBahamutEnvinmultienvResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private String errorMessage;

	private String message;

	private Boolean success;

	private List<ResultItem> result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<ResultItem> getResult() {
		return this.result;
	}

	public void setResult(List<ResultItem> result) {
		this.result = result;
	}

	public static class ResultItem {

		private String cloudTenantId;

		private String cloudTenantName;

		private PreEnvReleaseInfo preEnvReleaseInfo;

		private ProdEnvReleaseInfo prodEnvReleaseInfo;

		public String getCloudTenantId() {
			return this.cloudTenantId;
		}

		public void setCloudTenantId(String cloudTenantId) {
			this.cloudTenantId = cloudTenantId;
		}

		public String getCloudTenantName() {
			return this.cloudTenantName;
		}

		public void setCloudTenantName(String cloudTenantName) {
			this.cloudTenantName = cloudTenantName;
		}

		public PreEnvReleaseInfo getPreEnvReleaseInfo() {
			return this.preEnvReleaseInfo;
		}

		public void setPreEnvReleaseInfo(PreEnvReleaseInfo preEnvReleaseInfo) {
			this.preEnvReleaseInfo = preEnvReleaseInfo;
		}

		public ProdEnvReleaseInfo getProdEnvReleaseInfo() {
			return this.prodEnvReleaseInfo;
		}

		public void setProdEnvReleaseInfo(ProdEnvReleaseInfo prodEnvReleaseInfo) {
			this.prodEnvReleaseInfo = prodEnvReleaseInfo;
		}

		public static class PreEnvReleaseInfo {

			private String envId;

			private String info;

			private String status;

			private String ticket;

			private String type;

			private String workspaceId;

			private String workspaceName;

			public String getEnvId() {
				return this.envId;
			}

			public void setEnvId(String envId) {
				this.envId = envId;
			}

			public String getInfo() {
				return this.info;
			}

			public void setInfo(String info) {
				this.info = info;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getTicket() {
				return this.ticket;
			}

			public void setTicket(String ticket) {
				this.ticket = ticket;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getWorkspaceId() {
				return this.workspaceId;
			}

			public void setWorkspaceId(String workspaceId) {
				this.workspaceId = workspaceId;
			}

			public String getWorkspaceName() {
				return this.workspaceName;
			}

			public void setWorkspaceName(String workspaceName) {
				this.workspaceName = workspaceName;
			}
		}

		public static class ProdEnvReleaseInfo {

			private String envId;

			private String info;

			private String status;

			private String ticket;

			private String type;

			private String workspaceId;

			private String workspaceName;

			public String getEnvId() {
				return this.envId;
			}

			public void setEnvId(String envId) {
				this.envId = envId;
			}

			public String getInfo() {
				return this.info;
			}

			public void setInfo(String info) {
				this.info = info;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getTicket() {
				return this.ticket;
			}

			public void setTicket(String ticket) {
				this.ticket = ticket;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getWorkspaceId() {
				return this.workspaceId;
			}

			public void setWorkspaceId(String workspaceId) {
				this.workspaceId = workspaceId;
			}

			public String getWorkspaceName() {
				return this.workspaceName;
			}

			public void setWorkspaceName(String workspaceName) {
				this.workspaceName = workspaceName;
			}
		}
	}

	@Override
	public ExecLinkeBahamutEnvinmultienvResponse getInstance(UnmarshallerContext context) {
		return	ExecLinkeBahamutEnvinmultienvResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
