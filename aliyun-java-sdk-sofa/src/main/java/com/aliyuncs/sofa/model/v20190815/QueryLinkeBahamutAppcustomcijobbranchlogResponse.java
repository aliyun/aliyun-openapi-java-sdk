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
import com.aliyuncs.sofa.transform.v20190815.QueryLinkeBahamutAppcustomcijobbranchlogResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryLinkeBahamutAppcustomcijobbranchlogResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private String errorMessage;

	private String errorMsgParamsMap;

	private String message;

	private Long responseStatusCode;

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

	public List<ResultItem> getResult() {
		return this.result;
	}

	public void setResult(List<ResultItem> result) {
		this.result = result;
	}

	public static class ResultItem {

		private String appId;

		private String appName;

		private String branch;

		private String commitMessage;

		private String context;

		private Long created;

		private String customCIId;

		private Boolean deleted;

		private Long executionDate;

		private Long executionId;

		private String id;

		private Boolean isLatest;

		private String lastCommitId;

		private Long lastExecuted;

		private Long lastExecuteCost;

		private Long lastModified;

		private Long pipelineInstanceId;

		private Long pipelineTemplateId;

		private String pipelineTemplateName;

		private String quality;

		private String result;

		private String status;

		private String tenantId;

		public String getAppId() {
			return this.appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public String getBranch() {
			return this.branch;
		}

		public void setBranch(String branch) {
			this.branch = branch;
		}

		public String getCommitMessage() {
			return this.commitMessage;
		}

		public void setCommitMessage(String commitMessage) {
			this.commitMessage = commitMessage;
		}

		public String getContext() {
			return this.context;
		}

		public void setContext(String context) {
			this.context = context;
		}

		public Long getCreated() {
			return this.created;
		}

		public void setCreated(Long created) {
			this.created = created;
		}

		public String getCustomCIId() {
			return this.customCIId;
		}

		public void setCustomCIId(String customCIId) {
			this.customCIId = customCIId;
		}

		public Boolean getDeleted() {
			return this.deleted;
		}

		public void setDeleted(Boolean deleted) {
			this.deleted = deleted;
		}

		public Long getExecutionDate() {
			return this.executionDate;
		}

		public void setExecutionDate(Long executionDate) {
			this.executionDate = executionDate;
		}

		public Long getExecutionId() {
			return this.executionId;
		}

		public void setExecutionId(Long executionId) {
			this.executionId = executionId;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public Boolean getIsLatest() {
			return this.isLatest;
		}

		public void setIsLatest(Boolean isLatest) {
			this.isLatest = isLatest;
		}

		public String getLastCommitId() {
			return this.lastCommitId;
		}

		public void setLastCommitId(String lastCommitId) {
			this.lastCommitId = lastCommitId;
		}

		public Long getLastExecuted() {
			return this.lastExecuted;
		}

		public void setLastExecuted(Long lastExecuted) {
			this.lastExecuted = lastExecuted;
		}

		public Long getLastExecuteCost() {
			return this.lastExecuteCost;
		}

		public void setLastExecuteCost(Long lastExecuteCost) {
			this.lastExecuteCost = lastExecuteCost;
		}

		public Long getLastModified() {
			return this.lastModified;
		}

		public void setLastModified(Long lastModified) {
			this.lastModified = lastModified;
		}

		public Long getPipelineInstanceId() {
			return this.pipelineInstanceId;
		}

		public void setPipelineInstanceId(Long pipelineInstanceId) {
			this.pipelineInstanceId = pipelineInstanceId;
		}

		public Long getPipelineTemplateId() {
			return this.pipelineTemplateId;
		}

		public void setPipelineTemplateId(Long pipelineTemplateId) {
			this.pipelineTemplateId = pipelineTemplateId;
		}

		public String getPipelineTemplateName() {
			return this.pipelineTemplateName;
		}

		public void setPipelineTemplateName(String pipelineTemplateName) {
			this.pipelineTemplateName = pipelineTemplateName;
		}

		public String getQuality() {
			return this.quality;
		}

		public void setQuality(String quality) {
			this.quality = quality;
		}

		public String getResult() {
			return this.result;
		}

		public void setResult(String result) {
			this.result = result;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}
	}

	@Override
	public QueryLinkeBahamutAppcustomcijobbranchlogResponse getInstance(UnmarshallerContext context) {
		return	QueryLinkeBahamutAppcustomcijobbranchlogResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
