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
import com.aliyuncs.sofa.transform.v20190815.AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponse extends AcsResponse {

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

		private Boolean autoComplete;

		private String branch;

		private Boolean checkQuality;

		private Boolean checkStc;

		private String cloudWorkspaceId;

		private Boolean configItemCheck;

		private Long created;

		private Boolean deleted;

		private String description;

		private String displayName;

		private Boolean dockerImageCheck;

		private String fabricStage;

		private Boolean greyRelease;

		private String id;

		private Boolean joint;

		private Long lastModified;

		private String mavenRepo;

		private Boolean mergeRequestAllowed;

		private Boolean mutualCheck;

		private Boolean mvnCheck;

		private String name;

		private Boolean preCheck;

		private String preSetId;

		private Boolean serialCheck;

		private Boolean showRelease;

		private Boolean skipApprovalTasks;

		private Boolean skipCodeChangeCheck;

		private String templateGroup;

		private String type;

		private String workspace;

		private String workspaceId;

		private List<String> multiEnvConfigs;

		private List<String> pipelines;

		private List<String> postGuards;

		private List<String> postTasks;

		private List<String> preGuards;

		private List<String> preSetPipelineTemplateIds;

		private List<String> preTasks;

		private List<String> revertTasks;

		public Boolean getAutoComplete() {
			return this.autoComplete;
		}

		public void setAutoComplete(Boolean autoComplete) {
			this.autoComplete = autoComplete;
		}

		public String getBranch() {
			return this.branch;
		}

		public void setBranch(String branch) {
			this.branch = branch;
		}

		public Boolean getCheckQuality() {
			return this.checkQuality;
		}

		public void setCheckQuality(Boolean checkQuality) {
			this.checkQuality = checkQuality;
		}

		public Boolean getCheckStc() {
			return this.checkStc;
		}

		public void setCheckStc(Boolean checkStc) {
			this.checkStc = checkStc;
		}

		public String getCloudWorkspaceId() {
			return this.cloudWorkspaceId;
		}

		public void setCloudWorkspaceId(String cloudWorkspaceId) {
			this.cloudWorkspaceId = cloudWorkspaceId;
		}

		public Boolean getConfigItemCheck() {
			return this.configItemCheck;
		}

		public void setConfigItemCheck(Boolean configItemCheck) {
			this.configItemCheck = configItemCheck;
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

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getDisplayName() {
			return this.displayName;
		}

		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}

		public Boolean getDockerImageCheck() {
			return this.dockerImageCheck;
		}

		public void setDockerImageCheck(Boolean dockerImageCheck) {
			this.dockerImageCheck = dockerImageCheck;
		}

		public String getFabricStage() {
			return this.fabricStage;
		}

		public void setFabricStage(String fabricStage) {
			this.fabricStage = fabricStage;
		}

		public Boolean getGreyRelease() {
			return this.greyRelease;
		}

		public void setGreyRelease(Boolean greyRelease) {
			this.greyRelease = greyRelease;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public Boolean getJoint() {
			return this.joint;
		}

		public void setJoint(Boolean joint) {
			this.joint = joint;
		}

		public Long getLastModified() {
			return this.lastModified;
		}

		public void setLastModified(Long lastModified) {
			this.lastModified = lastModified;
		}

		public String getMavenRepo() {
			return this.mavenRepo;
		}

		public void setMavenRepo(String mavenRepo) {
			this.mavenRepo = mavenRepo;
		}

		public Boolean getMergeRequestAllowed() {
			return this.mergeRequestAllowed;
		}

		public void setMergeRequestAllowed(Boolean mergeRequestAllowed) {
			this.mergeRequestAllowed = mergeRequestAllowed;
		}

		public Boolean getMutualCheck() {
			return this.mutualCheck;
		}

		public void setMutualCheck(Boolean mutualCheck) {
			this.mutualCheck = mutualCheck;
		}

		public Boolean getMvnCheck() {
			return this.mvnCheck;
		}

		public void setMvnCheck(Boolean mvnCheck) {
			this.mvnCheck = mvnCheck;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Boolean getPreCheck() {
			return this.preCheck;
		}

		public void setPreCheck(Boolean preCheck) {
			this.preCheck = preCheck;
		}

		public String getPreSetId() {
			return this.preSetId;
		}

		public void setPreSetId(String preSetId) {
			this.preSetId = preSetId;
		}

		public Boolean getSerialCheck() {
			return this.serialCheck;
		}

		public void setSerialCheck(Boolean serialCheck) {
			this.serialCheck = serialCheck;
		}

		public Boolean getShowRelease() {
			return this.showRelease;
		}

		public void setShowRelease(Boolean showRelease) {
			this.showRelease = showRelease;
		}

		public Boolean getSkipApprovalTasks() {
			return this.skipApprovalTasks;
		}

		public void setSkipApprovalTasks(Boolean skipApprovalTasks) {
			this.skipApprovalTasks = skipApprovalTasks;
		}

		public Boolean getSkipCodeChangeCheck() {
			return this.skipCodeChangeCheck;
		}

		public void setSkipCodeChangeCheck(Boolean skipCodeChangeCheck) {
			this.skipCodeChangeCheck = skipCodeChangeCheck;
		}

		public String getTemplateGroup() {
			return this.templateGroup;
		}

		public void setTemplateGroup(String templateGroup) {
			this.templateGroup = templateGroup;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getWorkspace() {
			return this.workspace;
		}

		public void setWorkspace(String workspace) {
			this.workspace = workspace;
		}

		public String getWorkspaceId() {
			return this.workspaceId;
		}

		public void setWorkspaceId(String workspaceId) {
			this.workspaceId = workspaceId;
		}

		public List<String> getMultiEnvConfigs() {
			return this.multiEnvConfigs;
		}

		public void setMultiEnvConfigs(List<String> multiEnvConfigs) {
			this.multiEnvConfigs = multiEnvConfigs;
		}

		public List<String> getPipelines() {
			return this.pipelines;
		}

		public void setPipelines(List<String> pipelines) {
			this.pipelines = pipelines;
		}

		public List<String> getPostGuards() {
			return this.postGuards;
		}

		public void setPostGuards(List<String> postGuards) {
			this.postGuards = postGuards;
		}

		public List<String> getPostTasks() {
			return this.postTasks;
		}

		public void setPostTasks(List<String> postTasks) {
			this.postTasks = postTasks;
		}

		public List<String> getPreGuards() {
			return this.preGuards;
		}

		public void setPreGuards(List<String> preGuards) {
			this.preGuards = preGuards;
		}

		public List<String> getPreSetPipelineTemplateIds() {
			return this.preSetPipelineTemplateIds;
		}

		public void setPreSetPipelineTemplateIds(List<String> preSetPipelineTemplateIds) {
			this.preSetPipelineTemplateIds = preSetPipelineTemplateIds;
		}

		public List<String> getPreTasks() {
			return this.preTasks;
		}

		public void setPreTasks(List<String> preTasks) {
			this.preTasks = preTasks;
		}

		public List<String> getRevertTasks() {
			return this.revertTasks;
		}

		public void setRevertTasks(List<String> revertTasks) {
			this.revertTasks = revertTasks;
		}
	}

	@Override
	public AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponse getInstance(UnmarshallerContext context) {
		return	AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
