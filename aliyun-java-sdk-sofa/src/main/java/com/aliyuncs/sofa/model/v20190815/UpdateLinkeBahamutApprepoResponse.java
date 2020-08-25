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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.UpdateLinkeBahamutApprepoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UpdateLinkeBahamutApprepoResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private String errorMessage;

	private String errorMsgParamsMap;

	private String message;

	private Long responseStatusCode;

	private Boolean success;

	private Result result;

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

	public String getErrorMsgParamsMap() {
		return this.errorMsgParamsMap;
	}

	public void setErrorMsgParamsMap(String errorMsgParamsMap) {
		this.errorMsgParamsMap = errorMsgParamsMap;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Long getResponseStatusCode() {
		return this.responseStatusCode;
	}

	public void setResponseStatusCode(Long responseStatusCode) {
		this.responseStatusCode = responseStatusCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private String appName;

		private Boolean readNeedOwnerAudit;

		private String readSecLevel;

		private String repoName;

		private String repoUrl;

		private Long tenantId;

		private String visibilityLevel;

		private Boolean writeNeedOwnerAudit;

		private String writeSecLevel;

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public Boolean getReadNeedOwnerAudit() {
			return this.readNeedOwnerAudit;
		}

		public void setReadNeedOwnerAudit(Boolean readNeedOwnerAudit) {
			this.readNeedOwnerAudit = readNeedOwnerAudit;
		}

		public String getReadSecLevel() {
			return this.readSecLevel;
		}

		public void setReadSecLevel(String readSecLevel) {
			this.readSecLevel = readSecLevel;
		}

		public String getRepoName() {
			return this.repoName;
		}

		public void setRepoName(String repoName) {
			this.repoName = repoName;
		}

		public String getRepoUrl() {
			return this.repoUrl;
		}

		public void setRepoUrl(String repoUrl) {
			this.repoUrl = repoUrl;
		}

		public Long getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(Long tenantId) {
			this.tenantId = tenantId;
		}

		public String getVisibilityLevel() {
			return this.visibilityLevel;
		}

		public void setVisibilityLevel(String visibilityLevel) {
			this.visibilityLevel = visibilityLevel;
		}

		public Boolean getWriteNeedOwnerAudit() {
			return this.writeNeedOwnerAudit;
		}

		public void setWriteNeedOwnerAudit(Boolean writeNeedOwnerAudit) {
			this.writeNeedOwnerAudit = writeNeedOwnerAudit;
		}

		public String getWriteSecLevel() {
			return this.writeSecLevel;
		}

		public void setWriteSecLevel(String writeSecLevel) {
			this.writeSecLevel = writeSecLevel;
		}
	}

	@Override
	public UpdateLinkeBahamutApprepoResponse getInstance(UnmarshallerContext context) {
		return	UpdateLinkeBahamutApprepoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
