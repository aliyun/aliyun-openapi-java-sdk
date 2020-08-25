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
import com.aliyuncs.sofa.transform.v20190815.GetLinkeBahamutIterationgetbyreleaseResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetLinkeBahamutIterationgetbyreleaseResponse extends AcsResponse {

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

		private String aoneCodeChangeId;

		private Boolean branchRelease;

		private Boolean compatible;

		private Long created;

		private String creator;

		private String creatorSysName;

		private Boolean deleted;

		private Boolean emergency;

		private String externalId;

		private String fabricBizType;

		private Boolean finished;

		private String greyRelease;

		private String id;

		private Boolean independentComplete;

		private String iterationManager;

		private String iterationTemplate;

		private Long lastModified;

		private String name;

		private String originalRelease;

		private String overdueApplyModifyReleaseId;

		private String prePubOwner;

		private String privateAppGroup;

		private String prodCode;

		private String prodVersion;

		private String projectId;

		private String projectName;

		private String release;

		private String stageStep;

		private Boolean tagAndMergeMasterWhenEmergency;

		private String tecRiskOwner;

		private String tenant;

		private String testOwner;

		private String type;

		private Boolean useBaselineToRelease;

		private Boolean xflushCheckEnable;

		private List<String> appMetaIds;

		private List<String> appMetaNames;

		private List<String> auditProds;

		private List<String> defects;

		private List<String> members;

		private List<String> paasApplyIds;

		private List<String> requirements;

		private List<String> tasks;

		public String getAoneCodeChangeId() {
			return this.aoneCodeChangeId;
		}

		public void setAoneCodeChangeId(String aoneCodeChangeId) {
			this.aoneCodeChangeId = aoneCodeChangeId;
		}

		public Boolean getBranchRelease() {
			return this.branchRelease;
		}

		public void setBranchRelease(Boolean branchRelease) {
			this.branchRelease = branchRelease;
		}

		public Boolean getCompatible() {
			return this.compatible;
		}

		public void setCompatible(Boolean compatible) {
			this.compatible = compatible;
		}

		public Long getCreated() {
			return this.created;
		}

		public void setCreated(Long created) {
			this.created = created;
		}

		public String getCreator() {
			return this.creator;
		}

		public void setCreator(String creator) {
			this.creator = creator;
		}

		public String getCreatorSysName() {
			return this.creatorSysName;
		}

		public void setCreatorSysName(String creatorSysName) {
			this.creatorSysName = creatorSysName;
		}

		public Boolean getDeleted() {
			return this.deleted;
		}

		public void setDeleted(Boolean deleted) {
			this.deleted = deleted;
		}

		public Boolean getEmergency() {
			return this.emergency;
		}

		public void setEmergency(Boolean emergency) {
			this.emergency = emergency;
		}

		public String getExternalId() {
			return this.externalId;
		}

		public void setExternalId(String externalId) {
			this.externalId = externalId;
		}

		public String getFabricBizType() {
			return this.fabricBizType;
		}

		public void setFabricBizType(String fabricBizType) {
			this.fabricBizType = fabricBizType;
		}

		public Boolean getFinished() {
			return this.finished;
		}

		public void setFinished(Boolean finished) {
			this.finished = finished;
		}

		public String getGreyRelease() {
			return this.greyRelease;
		}

		public void setGreyRelease(String greyRelease) {
			this.greyRelease = greyRelease;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public Boolean getIndependentComplete() {
			return this.independentComplete;
		}

		public void setIndependentComplete(Boolean independentComplete) {
			this.independentComplete = independentComplete;
		}

		public String getIterationManager() {
			return this.iterationManager;
		}

		public void setIterationManager(String iterationManager) {
			this.iterationManager = iterationManager;
		}

		public String getIterationTemplate() {
			return this.iterationTemplate;
		}

		public void setIterationTemplate(String iterationTemplate) {
			this.iterationTemplate = iterationTemplate;
		}

		public Long getLastModified() {
			return this.lastModified;
		}

		public void setLastModified(Long lastModified) {
			this.lastModified = lastModified;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getOriginalRelease() {
			return this.originalRelease;
		}

		public void setOriginalRelease(String originalRelease) {
			this.originalRelease = originalRelease;
		}

		public String getOverdueApplyModifyReleaseId() {
			return this.overdueApplyModifyReleaseId;
		}

		public void setOverdueApplyModifyReleaseId(String overdueApplyModifyReleaseId) {
			this.overdueApplyModifyReleaseId = overdueApplyModifyReleaseId;
		}

		public String getPrePubOwner() {
			return this.prePubOwner;
		}

		public void setPrePubOwner(String prePubOwner) {
			this.prePubOwner = prePubOwner;
		}

		public String getPrivateAppGroup() {
			return this.privateAppGroup;
		}

		public void setPrivateAppGroup(String privateAppGroup) {
			this.privateAppGroup = privateAppGroup;
		}

		public String getProdCode() {
			return this.prodCode;
		}

		public void setProdCode(String prodCode) {
			this.prodCode = prodCode;
		}

		public String getProdVersion() {
			return this.prodVersion;
		}

		public void setProdVersion(String prodVersion) {
			this.prodVersion = prodVersion;
		}

		public String getProjectId() {
			return this.projectId;
		}

		public void setProjectId(String projectId) {
			this.projectId = projectId;
		}

		public String getProjectName() {
			return this.projectName;
		}

		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}

		public String getRelease() {
			return this.release;
		}

		public void setRelease(String release) {
			this.release = release;
		}

		public String getStageStep() {
			return this.stageStep;
		}

		public void setStageStep(String stageStep) {
			this.stageStep = stageStep;
		}

		public Boolean getTagAndMergeMasterWhenEmergency() {
			return this.tagAndMergeMasterWhenEmergency;
		}

		public void setTagAndMergeMasterWhenEmergency(Boolean tagAndMergeMasterWhenEmergency) {
			this.tagAndMergeMasterWhenEmergency = tagAndMergeMasterWhenEmergency;
		}

		public String getTecRiskOwner() {
			return this.tecRiskOwner;
		}

		public void setTecRiskOwner(String tecRiskOwner) {
			this.tecRiskOwner = tecRiskOwner;
		}

		public String getTenant() {
			return this.tenant;
		}

		public void setTenant(String tenant) {
			this.tenant = tenant;
		}

		public String getTestOwner() {
			return this.testOwner;
		}

		public void setTestOwner(String testOwner) {
			this.testOwner = testOwner;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Boolean getUseBaselineToRelease() {
			return this.useBaselineToRelease;
		}

		public void setUseBaselineToRelease(Boolean useBaselineToRelease) {
			this.useBaselineToRelease = useBaselineToRelease;
		}

		public Boolean getXflushCheckEnable() {
			return this.xflushCheckEnable;
		}

		public void setXflushCheckEnable(Boolean xflushCheckEnable) {
			this.xflushCheckEnable = xflushCheckEnable;
		}

		public List<String> getAppMetaIds() {
			return this.appMetaIds;
		}

		public void setAppMetaIds(List<String> appMetaIds) {
			this.appMetaIds = appMetaIds;
		}

		public List<String> getAppMetaNames() {
			return this.appMetaNames;
		}

		public void setAppMetaNames(List<String> appMetaNames) {
			this.appMetaNames = appMetaNames;
		}

		public List<String> getAuditProds() {
			return this.auditProds;
		}

		public void setAuditProds(List<String> auditProds) {
			this.auditProds = auditProds;
		}

		public List<String> getDefects() {
			return this.defects;
		}

		public void setDefects(List<String> defects) {
			this.defects = defects;
		}

		public List<String> getMembers() {
			return this.members;
		}

		public void setMembers(List<String> members) {
			this.members = members;
		}

		public List<String> getPaasApplyIds() {
			return this.paasApplyIds;
		}

		public void setPaasApplyIds(List<String> paasApplyIds) {
			this.paasApplyIds = paasApplyIds;
		}

		public List<String> getRequirements() {
			return this.requirements;
		}

		public void setRequirements(List<String> requirements) {
			this.requirements = requirements;
		}

		public List<String> getTasks() {
			return this.tasks;
		}

		public void setTasks(List<String> tasks) {
			this.tasks = tasks;
		}
	}

	@Override
	public GetLinkeBahamutIterationgetbyreleaseResponse getInstance(UnmarshallerContext context) {
		return	GetLinkeBahamutIterationgetbyreleaseResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
