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
import com.aliyuncs.sofa.transform.v20190815.GetLinkeBahamutReleasebyexternalidResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetLinkeBahamutReleasebyexternalidResponse extends AcsResponse {

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

		private Boolean afterFastDevDate;

		private String aoneReleaseId;

		private String appGroup;

		private Boolean attachable;

		private Boolean betaRelease;

		private Boolean containPreInMultiEnv;

		private Long created;

		private String creator;

		private Boolean dailyRelease;

		private String deadlines;

		private Boolean deleted;

		private String dependencies;

		private String externalId;

		private String greenChannelId;

		private String greenChannelName;

		private String greenChannelPortalUrl;

		private Boolean hasCreatedAppReleaseDetail;

		private String id;

		private String iterationType;

		private Long lastModified;

		private Long mergeStartTime;

		private Boolean multiEnvProd;

		private Boolean multiEnvRelease;

		private String name;

		private Long releaseDate;

		private String status;

		private Boolean tagAndMergeMasterWhenEmergency;

		private String tenantId;

		private String ticket;

		private String type;

		private Boolean windowRelease;

		private List<String> apps;

		private List<String> delAppMetaIds;

		private List<String> iterations;

		private List<String> managers;

		private List<String> multiEnvConfigs;

		private List<String> stages;

		private List<String> tenantReleaseInfos;

		public Boolean getAfterFastDevDate() {
			return this.afterFastDevDate;
		}

		public void setAfterFastDevDate(Boolean afterFastDevDate) {
			this.afterFastDevDate = afterFastDevDate;
		}

		public String getAoneReleaseId() {
			return this.aoneReleaseId;
		}

		public void setAoneReleaseId(String aoneReleaseId) {
			this.aoneReleaseId = aoneReleaseId;
		}

		public String getAppGroup() {
			return this.appGroup;
		}

		public void setAppGroup(String appGroup) {
			this.appGroup = appGroup;
		}

		public Boolean getAttachable() {
			return this.attachable;
		}

		public void setAttachable(Boolean attachable) {
			this.attachable = attachable;
		}

		public Boolean getBetaRelease() {
			return this.betaRelease;
		}

		public void setBetaRelease(Boolean betaRelease) {
			this.betaRelease = betaRelease;
		}

		public Boolean getContainPreInMultiEnv() {
			return this.containPreInMultiEnv;
		}

		public void setContainPreInMultiEnv(Boolean containPreInMultiEnv) {
			this.containPreInMultiEnv = containPreInMultiEnv;
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

		public Boolean getDailyRelease() {
			return this.dailyRelease;
		}

		public void setDailyRelease(Boolean dailyRelease) {
			this.dailyRelease = dailyRelease;
		}

		public String getDeadlines() {
			return this.deadlines;
		}

		public void setDeadlines(String deadlines) {
			this.deadlines = deadlines;
		}

		public Boolean getDeleted() {
			return this.deleted;
		}

		public void setDeleted(Boolean deleted) {
			this.deleted = deleted;
		}

		public String getDependencies() {
			return this.dependencies;
		}

		public void setDependencies(String dependencies) {
			this.dependencies = dependencies;
		}

		public String getExternalId() {
			return this.externalId;
		}

		public void setExternalId(String externalId) {
			this.externalId = externalId;
		}

		public String getGreenChannelId() {
			return this.greenChannelId;
		}

		public void setGreenChannelId(String greenChannelId) {
			this.greenChannelId = greenChannelId;
		}

		public String getGreenChannelName() {
			return this.greenChannelName;
		}

		public void setGreenChannelName(String greenChannelName) {
			this.greenChannelName = greenChannelName;
		}

		public String getGreenChannelPortalUrl() {
			return this.greenChannelPortalUrl;
		}

		public void setGreenChannelPortalUrl(String greenChannelPortalUrl) {
			this.greenChannelPortalUrl = greenChannelPortalUrl;
		}

		public Boolean getHasCreatedAppReleaseDetail() {
			return this.hasCreatedAppReleaseDetail;
		}

		public void setHasCreatedAppReleaseDetail(Boolean hasCreatedAppReleaseDetail) {
			this.hasCreatedAppReleaseDetail = hasCreatedAppReleaseDetail;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getIterationType() {
			return this.iterationType;
		}

		public void setIterationType(String iterationType) {
			this.iterationType = iterationType;
		}

		public Long getLastModified() {
			return this.lastModified;
		}

		public void setLastModified(Long lastModified) {
			this.lastModified = lastModified;
		}

		public Long getMergeStartTime() {
			return this.mergeStartTime;
		}

		public void setMergeStartTime(Long mergeStartTime) {
			this.mergeStartTime = mergeStartTime;
		}

		public Boolean getMultiEnvProd() {
			return this.multiEnvProd;
		}

		public void setMultiEnvProd(Boolean multiEnvProd) {
			this.multiEnvProd = multiEnvProd;
		}

		public Boolean getMultiEnvRelease() {
			return this.multiEnvRelease;
		}

		public void setMultiEnvRelease(Boolean multiEnvRelease) {
			this.multiEnvRelease = multiEnvRelease;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Long getReleaseDate() {
			return this.releaseDate;
		}

		public void setReleaseDate(Long releaseDate) {
			this.releaseDate = releaseDate;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Boolean getTagAndMergeMasterWhenEmergency() {
			return this.tagAndMergeMasterWhenEmergency;
		}

		public void setTagAndMergeMasterWhenEmergency(Boolean tagAndMergeMasterWhenEmergency) {
			this.tagAndMergeMasterWhenEmergency = tagAndMergeMasterWhenEmergency;
		}

		public String getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
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

		public Boolean getWindowRelease() {
			return this.windowRelease;
		}

		public void setWindowRelease(Boolean windowRelease) {
			this.windowRelease = windowRelease;
		}

		public List<String> getApps() {
			return this.apps;
		}

		public void setApps(List<String> apps) {
			this.apps = apps;
		}

		public List<String> getDelAppMetaIds() {
			return this.delAppMetaIds;
		}

		public void setDelAppMetaIds(List<String> delAppMetaIds) {
			this.delAppMetaIds = delAppMetaIds;
		}

		public List<String> getIterations() {
			return this.iterations;
		}

		public void setIterations(List<String> iterations) {
			this.iterations = iterations;
		}

		public List<String> getManagers() {
			return this.managers;
		}

		public void setManagers(List<String> managers) {
			this.managers = managers;
		}

		public List<String> getMultiEnvConfigs() {
			return this.multiEnvConfigs;
		}

		public void setMultiEnvConfigs(List<String> multiEnvConfigs) {
			this.multiEnvConfigs = multiEnvConfigs;
		}

		public List<String> getStages() {
			return this.stages;
		}

		public void setStages(List<String> stages) {
			this.stages = stages;
		}

		public List<String> getTenantReleaseInfos() {
			return this.tenantReleaseInfos;
		}

		public void setTenantReleaseInfos(List<String> tenantReleaseInfos) {
			this.tenantReleaseInfos = tenantReleaseInfos;
		}
	}

	@Override
	public GetLinkeBahamutReleasebyexternalidResponse getInstance(UnmarshallerContext context) {
		return	GetLinkeBahamutReleasebyexternalidResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
