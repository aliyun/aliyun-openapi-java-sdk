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
import com.aliyuncs.sofa.transform.v20190815.QueryLinkeLinkaOutdatedtaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryLinkeLinkaOutdatedtaskResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private String errorCode;

	private String errorMsg;

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

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
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

		private String aciConsoleUrl;

		private Boolean aciMode;

		private String aciTenant;

		private String branch;

		private String callbackUrl;

		private String commitId;

		private Long createdAt;

		private String customToken;

		private String customUser;

		private Boolean deleted;

		private Boolean diffOverflow;

		private Boolean diffToolarge;

		private String encode;

		private Long endAt;

		private String executorId;

		private String extra;

		private String gitUrl;

		private String id;

		private String kind;

		private String localPath;

		private String message;

		private String parentTaskId;

		private String ruleSetName;

		private String scanKind;

		private Long startedAt;

		private String startCommitId;

		private String status;

		private Long updatedAt;

		private List<String> excludes;

		private List<String> ruleSets;

		private List<String> subTasks;

		public String getAciConsoleUrl() {
			return this.aciConsoleUrl;
		}

		public void setAciConsoleUrl(String aciConsoleUrl) {
			this.aciConsoleUrl = aciConsoleUrl;
		}

		public Boolean getAciMode() {
			return this.aciMode;
		}

		public void setAciMode(Boolean aciMode) {
			this.aciMode = aciMode;
		}

		public String getAciTenant() {
			return this.aciTenant;
		}

		public void setAciTenant(String aciTenant) {
			this.aciTenant = aciTenant;
		}

		public String getBranch() {
			return this.branch;
		}

		public void setBranch(String branch) {
			this.branch = branch;
		}

		public String getCallbackUrl() {
			return this.callbackUrl;
		}

		public void setCallbackUrl(String callbackUrl) {
			this.callbackUrl = callbackUrl;
		}

		public String getCommitId() {
			return this.commitId;
		}

		public void setCommitId(String commitId) {
			this.commitId = commitId;
		}

		public Long getCreatedAt() {
			return this.createdAt;
		}

		public void setCreatedAt(Long createdAt) {
			this.createdAt = createdAt;
		}

		public String getCustomToken() {
			return this.customToken;
		}

		public void setCustomToken(String customToken) {
			this.customToken = customToken;
		}

		public String getCustomUser() {
			return this.customUser;
		}

		public void setCustomUser(String customUser) {
			this.customUser = customUser;
		}

		public Boolean getDeleted() {
			return this.deleted;
		}

		public void setDeleted(Boolean deleted) {
			this.deleted = deleted;
		}

		public Boolean getDiffOverflow() {
			return this.diffOverflow;
		}

		public void setDiffOverflow(Boolean diffOverflow) {
			this.diffOverflow = diffOverflow;
		}

		public Boolean getDiffToolarge() {
			return this.diffToolarge;
		}

		public void setDiffToolarge(Boolean diffToolarge) {
			this.diffToolarge = diffToolarge;
		}

		public String getEncode() {
			return this.encode;
		}

		public void setEncode(String encode) {
			this.encode = encode;
		}

		public Long getEndAt() {
			return this.endAt;
		}

		public void setEndAt(Long endAt) {
			this.endAt = endAt;
		}

		public String getExecutorId() {
			return this.executorId;
		}

		public void setExecutorId(String executorId) {
			this.executorId = executorId;
		}

		public String getExtra() {
			return this.extra;
		}

		public void setExtra(String extra) {
			this.extra = extra;
		}

		public String getGitUrl() {
			return this.gitUrl;
		}

		public void setGitUrl(String gitUrl) {
			this.gitUrl = gitUrl;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getKind() {
			return this.kind;
		}

		public void setKind(String kind) {
			this.kind = kind;
		}

		public String getLocalPath() {
			return this.localPath;
		}

		public void setLocalPath(String localPath) {
			this.localPath = localPath;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getParentTaskId() {
			return this.parentTaskId;
		}

		public void setParentTaskId(String parentTaskId) {
			this.parentTaskId = parentTaskId;
		}

		public String getRuleSetName() {
			return this.ruleSetName;
		}

		public void setRuleSetName(String ruleSetName) {
			this.ruleSetName = ruleSetName;
		}

		public String getScanKind() {
			return this.scanKind;
		}

		public void setScanKind(String scanKind) {
			this.scanKind = scanKind;
		}

		public Long getStartedAt() {
			return this.startedAt;
		}

		public void setStartedAt(Long startedAt) {
			this.startedAt = startedAt;
		}

		public String getStartCommitId() {
			return this.startCommitId;
		}

		public void setStartCommitId(String startCommitId) {
			this.startCommitId = startCommitId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Long getUpdatedAt() {
			return this.updatedAt;
		}

		public void setUpdatedAt(Long updatedAt) {
			this.updatedAt = updatedAt;
		}

		public List<String> getExcludes() {
			return this.excludes;
		}

		public void setExcludes(List<String> excludes) {
			this.excludes = excludes;
		}

		public List<String> getRuleSets() {
			return this.ruleSets;
		}

		public void setRuleSets(List<String> ruleSets) {
			this.ruleSets = ruleSets;
		}

		public List<String> getSubTasks() {
			return this.subTasks;
		}

		public void setSubTasks(List<String> subTasks) {
			this.subTasks = subTasks;
		}
	}

	@Override
	public QueryLinkeLinkaOutdatedtaskResponse getInstance(UnmarshallerContext context) {
		return	QueryLinkeLinkaOutdatedtaskResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
