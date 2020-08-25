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
import com.aliyuncs.sofa.transform.v20190815.GetLinkeBahamutIterationunithistroryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetLinkeBahamutIterationunithistroryResponse extends AcsResponse {

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

		private String applicant;

		private String artifactId;

		private String branch;

		private String commit;

		private String componentExecutionId;

		private Long created;

		private Boolean deleted;

		private String groupId;

		private String id;

		private Boolean incompatible;

		private String iterationUnitHistoryTypeEnum;

		private String key;

		private Long lastModified;

		private Long pipelineExecutionId;

		private Long pipelineInstanceId;

		private String publishJarEnv;

		private Long releaseTime;

		private String status;

		private String unitId;

		private String unitStageId;

		private String value;

		private String version;

		private List<String> mvnRepo;

		public String getApplicant() {
			return this.applicant;
		}

		public void setApplicant(String applicant) {
			this.applicant = applicant;
		}

		public String getArtifactId() {
			return this.artifactId;
		}

		public void setArtifactId(String artifactId) {
			this.artifactId = artifactId;
		}

		public String getBranch() {
			return this.branch;
		}

		public void setBranch(String branch) {
			this.branch = branch;
		}

		public String getCommit() {
			return this.commit;
		}

		public void setCommit(String commit) {
			this.commit = commit;
		}

		public String getComponentExecutionId() {
			return this.componentExecutionId;
		}

		public void setComponentExecutionId(String componentExecutionId) {
			this.componentExecutionId = componentExecutionId;
		}

		public Long getCreated() {
			return this.created;
		}

		public void setCreated(Long created) {
			this.created = created;
		}

		public Boolean getDeleted() {
			return this.deleted;
		}

		public void setDeleted(Boolean deleted) {
			this.deleted = deleted;
		}

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public Boolean getIncompatible() {
			return this.incompatible;
		}

		public void setIncompatible(Boolean incompatible) {
			this.incompatible = incompatible;
		}

		public String getIterationUnitHistoryTypeEnum() {
			return this.iterationUnitHistoryTypeEnum;
		}

		public void setIterationUnitHistoryTypeEnum(String iterationUnitHistoryTypeEnum) {
			this.iterationUnitHistoryTypeEnum = iterationUnitHistoryTypeEnum;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public Long getLastModified() {
			return this.lastModified;
		}

		public void setLastModified(Long lastModified) {
			this.lastModified = lastModified;
		}

		public Long getPipelineExecutionId() {
			return this.pipelineExecutionId;
		}

		public void setPipelineExecutionId(Long pipelineExecutionId) {
			this.pipelineExecutionId = pipelineExecutionId;
		}

		public Long getPipelineInstanceId() {
			return this.pipelineInstanceId;
		}

		public void setPipelineInstanceId(Long pipelineInstanceId) {
			this.pipelineInstanceId = pipelineInstanceId;
		}

		public String getPublishJarEnv() {
			return this.publishJarEnv;
		}

		public void setPublishJarEnv(String publishJarEnv) {
			this.publishJarEnv = publishJarEnv;
		}

		public Long getReleaseTime() {
			return this.releaseTime;
		}

		public void setReleaseTime(Long releaseTime) {
			this.releaseTime = releaseTime;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getUnitId() {
			return this.unitId;
		}

		public void setUnitId(String unitId) {
			this.unitId = unitId;
		}

		public String getUnitStageId() {
			return this.unitStageId;
		}

		public void setUnitStageId(String unitStageId) {
			this.unitStageId = unitStageId;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public List<String> getMvnRepo() {
			return this.mvnRepo;
		}

		public void setMvnRepo(List<String> mvnRepo) {
			this.mvnRepo = mvnRepo;
		}
	}

	@Override
	public GetLinkeBahamutIterationunithistroryResponse getInstance(UnmarshallerContext context) {
		return	GetLinkeBahamutIterationunithistroryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
