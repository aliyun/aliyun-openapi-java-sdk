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
import com.aliyuncs.sofa.transform.v20190815.UpdateLinkeBahamutAdmintenantidconfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UpdateLinkeBahamutAdmintenantidconfigResponse extends AcsResponse {

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

		private Boolean antflowEnabled;

		private String appChangeNeedNotice;

		private String appInitMeta;

		private Boolean autoAppReleaseStatus;

		private Boolean autoReleaseMachine;

		private Boolean autoUnbindMachine;

		private String baseJarInfo;

		private Boolean checkAntWatchRiskControl;

		private Boolean checkRunningPreBuildTask;

		private Long created;

		private Boolean createMrWhenMergeConflicts;

		private Boolean createOrImportAppNeedApproval;

		private Boolean crossCloud;

		private Boolean deleted;

		private Boolean getSecretFromLinku;

		private String gitLabAccount;

		private String gitLabPrivateToken;

		private String gitLabSite;

		private String gitLabUser;

		private Boolean highAvailabilityEnabled;

		private String id;

		private Boolean jarEnabled;

		private Long lastModified;

		private String linkcApiHost;

		private String linkcFrontHost;

		private Boolean linksEnable;

		private String linktFrontHost;

		private Boolean mergeRequestEnabled;

		private String mvnJarInfo;

		private String myCodeCenterHost;

		private Boolean onexMode;

		private String originOSSConfig;

		private String ossConfig;

		private String preConfirmArchDomainMap;

		private String qualityIndices;

		private String realGitLabSite;

		private Boolean releaseControlEnabled;

		private String settingsFile;

		private Boolean skipPreCheck;

		private Boolean startAccCallback;

		private String tenantId;

		private String tokens;

		private Boolean updateAppMetaWhenSync;

		private Boolean useAppReleaseView;

		private Boolean useBaselineToRelease;

		private Boolean useCustomOss;

		private Boolean useNewCloudAppImportView;

		private Boolean useNewPrePubEnvIdList;

		private Boolean useNewThirdPartyWay;

		private Boolean useOldFabricPreCheck;

		private Boolean useShareMiddleware;

		private String webHookUrl;

		private List<String> defaultQualityRules;

		private List<String> gitlabSitePrefixs;

		public Boolean getAntflowEnabled() {
			return this.antflowEnabled;
		}

		public void setAntflowEnabled(Boolean antflowEnabled) {
			this.antflowEnabled = antflowEnabled;
		}

		public String getAppChangeNeedNotice() {
			return this.appChangeNeedNotice;
		}

		public void setAppChangeNeedNotice(String appChangeNeedNotice) {
			this.appChangeNeedNotice = appChangeNeedNotice;
		}

		public String getAppInitMeta() {
			return this.appInitMeta;
		}

		public void setAppInitMeta(String appInitMeta) {
			this.appInitMeta = appInitMeta;
		}

		public Boolean getAutoAppReleaseStatus() {
			return this.autoAppReleaseStatus;
		}

		public void setAutoAppReleaseStatus(Boolean autoAppReleaseStatus) {
			this.autoAppReleaseStatus = autoAppReleaseStatus;
		}

		public Boolean getAutoReleaseMachine() {
			return this.autoReleaseMachine;
		}

		public void setAutoReleaseMachine(Boolean autoReleaseMachine) {
			this.autoReleaseMachine = autoReleaseMachine;
		}

		public Boolean getAutoUnbindMachine() {
			return this.autoUnbindMachine;
		}

		public void setAutoUnbindMachine(Boolean autoUnbindMachine) {
			this.autoUnbindMachine = autoUnbindMachine;
		}

		public String getBaseJarInfo() {
			return this.baseJarInfo;
		}

		public void setBaseJarInfo(String baseJarInfo) {
			this.baseJarInfo = baseJarInfo;
		}

		public Boolean getCheckAntWatchRiskControl() {
			return this.checkAntWatchRiskControl;
		}

		public void setCheckAntWatchRiskControl(Boolean checkAntWatchRiskControl) {
			this.checkAntWatchRiskControl = checkAntWatchRiskControl;
		}

		public Boolean getCheckRunningPreBuildTask() {
			return this.checkRunningPreBuildTask;
		}

		public void setCheckRunningPreBuildTask(Boolean checkRunningPreBuildTask) {
			this.checkRunningPreBuildTask = checkRunningPreBuildTask;
		}

		public Long getCreated() {
			return this.created;
		}

		public void setCreated(Long created) {
			this.created = created;
		}

		public Boolean getCreateMrWhenMergeConflicts() {
			return this.createMrWhenMergeConflicts;
		}

		public void setCreateMrWhenMergeConflicts(Boolean createMrWhenMergeConflicts) {
			this.createMrWhenMergeConflicts = createMrWhenMergeConflicts;
		}

		public Boolean getCreateOrImportAppNeedApproval() {
			return this.createOrImportAppNeedApproval;
		}

		public void setCreateOrImportAppNeedApproval(Boolean createOrImportAppNeedApproval) {
			this.createOrImportAppNeedApproval = createOrImportAppNeedApproval;
		}

		public Boolean getCrossCloud() {
			return this.crossCloud;
		}

		public void setCrossCloud(Boolean crossCloud) {
			this.crossCloud = crossCloud;
		}

		public Boolean getDeleted() {
			return this.deleted;
		}

		public void setDeleted(Boolean deleted) {
			this.deleted = deleted;
		}

		public Boolean getGetSecretFromLinku() {
			return this.getSecretFromLinku;
		}

		public void setGetSecretFromLinku(Boolean getSecretFromLinku) {
			this.getSecretFromLinku = getSecretFromLinku;
		}

		public String getGitLabAccount() {
			return this.gitLabAccount;
		}

		public void setGitLabAccount(String gitLabAccount) {
			this.gitLabAccount = gitLabAccount;
		}

		public String getGitLabPrivateToken() {
			return this.gitLabPrivateToken;
		}

		public void setGitLabPrivateToken(String gitLabPrivateToken) {
			this.gitLabPrivateToken = gitLabPrivateToken;
		}

		public String getGitLabSite() {
			return this.gitLabSite;
		}

		public void setGitLabSite(String gitLabSite) {
			this.gitLabSite = gitLabSite;
		}

		public String getGitLabUser() {
			return this.gitLabUser;
		}

		public void setGitLabUser(String gitLabUser) {
			this.gitLabUser = gitLabUser;
		}

		public Boolean getHighAvailabilityEnabled() {
			return this.highAvailabilityEnabled;
		}

		public void setHighAvailabilityEnabled(Boolean highAvailabilityEnabled) {
			this.highAvailabilityEnabled = highAvailabilityEnabled;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public Boolean getJarEnabled() {
			return this.jarEnabled;
		}

		public void setJarEnabled(Boolean jarEnabled) {
			this.jarEnabled = jarEnabled;
		}

		public Long getLastModified() {
			return this.lastModified;
		}

		public void setLastModified(Long lastModified) {
			this.lastModified = lastModified;
		}

		public String getLinkcApiHost() {
			return this.linkcApiHost;
		}

		public void setLinkcApiHost(String linkcApiHost) {
			this.linkcApiHost = linkcApiHost;
		}

		public String getLinkcFrontHost() {
			return this.linkcFrontHost;
		}

		public void setLinkcFrontHost(String linkcFrontHost) {
			this.linkcFrontHost = linkcFrontHost;
		}

		public Boolean getLinksEnable() {
			return this.linksEnable;
		}

		public void setLinksEnable(Boolean linksEnable) {
			this.linksEnable = linksEnable;
		}

		public String getLinktFrontHost() {
			return this.linktFrontHost;
		}

		public void setLinktFrontHost(String linktFrontHost) {
			this.linktFrontHost = linktFrontHost;
		}

		public Boolean getMergeRequestEnabled() {
			return this.mergeRequestEnabled;
		}

		public void setMergeRequestEnabled(Boolean mergeRequestEnabled) {
			this.mergeRequestEnabled = mergeRequestEnabled;
		}

		public String getMvnJarInfo() {
			return this.mvnJarInfo;
		}

		public void setMvnJarInfo(String mvnJarInfo) {
			this.mvnJarInfo = mvnJarInfo;
		}

		public String getMyCodeCenterHost() {
			return this.myCodeCenterHost;
		}

		public void setMyCodeCenterHost(String myCodeCenterHost) {
			this.myCodeCenterHost = myCodeCenterHost;
		}

		public Boolean getOnexMode() {
			return this.onexMode;
		}

		public void setOnexMode(Boolean onexMode) {
			this.onexMode = onexMode;
		}

		public String getOriginOSSConfig() {
			return this.originOSSConfig;
		}

		public void setOriginOSSConfig(String originOSSConfig) {
			this.originOSSConfig = originOSSConfig;
		}

		public String getOssConfig() {
			return this.ossConfig;
		}

		public void setOssConfig(String ossConfig) {
			this.ossConfig = ossConfig;
		}

		public String getPreConfirmArchDomainMap() {
			return this.preConfirmArchDomainMap;
		}

		public void setPreConfirmArchDomainMap(String preConfirmArchDomainMap) {
			this.preConfirmArchDomainMap = preConfirmArchDomainMap;
		}

		public String getQualityIndices() {
			return this.qualityIndices;
		}

		public void setQualityIndices(String qualityIndices) {
			this.qualityIndices = qualityIndices;
		}

		public String getRealGitLabSite() {
			return this.realGitLabSite;
		}

		public void setRealGitLabSite(String realGitLabSite) {
			this.realGitLabSite = realGitLabSite;
		}

		public Boolean getReleaseControlEnabled() {
			return this.releaseControlEnabled;
		}

		public void setReleaseControlEnabled(Boolean releaseControlEnabled) {
			this.releaseControlEnabled = releaseControlEnabled;
		}

		public String getSettingsFile() {
			return this.settingsFile;
		}

		public void setSettingsFile(String settingsFile) {
			this.settingsFile = settingsFile;
		}

		public Boolean getSkipPreCheck() {
			return this.skipPreCheck;
		}

		public void setSkipPreCheck(Boolean skipPreCheck) {
			this.skipPreCheck = skipPreCheck;
		}

		public Boolean getStartAccCallback() {
			return this.startAccCallback;
		}

		public void setStartAccCallback(Boolean startAccCallback) {
			this.startAccCallback = startAccCallback;
		}

		public String getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}

		public String getTokens() {
			return this.tokens;
		}

		public void setTokens(String tokens) {
			this.tokens = tokens;
		}

		public Boolean getUpdateAppMetaWhenSync() {
			return this.updateAppMetaWhenSync;
		}

		public void setUpdateAppMetaWhenSync(Boolean updateAppMetaWhenSync) {
			this.updateAppMetaWhenSync = updateAppMetaWhenSync;
		}

		public Boolean getUseAppReleaseView() {
			return this.useAppReleaseView;
		}

		public void setUseAppReleaseView(Boolean useAppReleaseView) {
			this.useAppReleaseView = useAppReleaseView;
		}

		public Boolean getUseBaselineToRelease() {
			return this.useBaselineToRelease;
		}

		public void setUseBaselineToRelease(Boolean useBaselineToRelease) {
			this.useBaselineToRelease = useBaselineToRelease;
		}

		public Boolean getUseCustomOss() {
			return this.useCustomOss;
		}

		public void setUseCustomOss(Boolean useCustomOss) {
			this.useCustomOss = useCustomOss;
		}

		public Boolean getUseNewCloudAppImportView() {
			return this.useNewCloudAppImportView;
		}

		public void setUseNewCloudAppImportView(Boolean useNewCloudAppImportView) {
			this.useNewCloudAppImportView = useNewCloudAppImportView;
		}

		public Boolean getUseNewPrePubEnvIdList() {
			return this.useNewPrePubEnvIdList;
		}

		public void setUseNewPrePubEnvIdList(Boolean useNewPrePubEnvIdList) {
			this.useNewPrePubEnvIdList = useNewPrePubEnvIdList;
		}

		public Boolean getUseNewThirdPartyWay() {
			return this.useNewThirdPartyWay;
		}

		public void setUseNewThirdPartyWay(Boolean useNewThirdPartyWay) {
			this.useNewThirdPartyWay = useNewThirdPartyWay;
		}

		public Boolean getUseOldFabricPreCheck() {
			return this.useOldFabricPreCheck;
		}

		public void setUseOldFabricPreCheck(Boolean useOldFabricPreCheck) {
			this.useOldFabricPreCheck = useOldFabricPreCheck;
		}

		public Boolean getUseShareMiddleware() {
			return this.useShareMiddleware;
		}

		public void setUseShareMiddleware(Boolean useShareMiddleware) {
			this.useShareMiddleware = useShareMiddleware;
		}

		public String getWebHookUrl() {
			return this.webHookUrl;
		}

		public void setWebHookUrl(String webHookUrl) {
			this.webHookUrl = webHookUrl;
		}

		public List<String> getDefaultQualityRules() {
			return this.defaultQualityRules;
		}

		public void setDefaultQualityRules(List<String> defaultQualityRules) {
			this.defaultQualityRules = defaultQualityRules;
		}

		public List<String> getGitlabSitePrefixs() {
			return this.gitlabSitePrefixs;
		}

		public void setGitlabSitePrefixs(List<String> gitlabSitePrefixs) {
			this.gitlabSitePrefixs = gitlabSitePrefixs;
		}
	}

	@Override
	public UpdateLinkeBahamutAdmintenantidconfigResponse getInstance(UnmarshallerContext context) {
		return	UpdateLinkeBahamutAdmintenantidconfigResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
