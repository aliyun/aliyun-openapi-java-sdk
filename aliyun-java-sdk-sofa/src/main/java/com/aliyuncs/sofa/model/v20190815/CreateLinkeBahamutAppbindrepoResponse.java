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
import com.aliyuncs.sofa.transform.v20190815.CreateLinkeBahamutAppbindrepoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateLinkeBahamutAppbindrepoResponse extends AcsResponse {

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

		private String appGroup;

		private String appTechStackName;

		private String appType;

		private String appTypeBackUp;

		private String archDomainExternalId;

		private String archDomainMeta;

		private String archDomainName;

		private Long archDomainSynacId;

		private Boolean autoBetaSitDeploy;

		private String baseJarInfo;

		private Boolean betterQuality;

		private Boolean blizzardRecordingAndPlaybackSmartTest;

		private String cloudDeployType;

		private Boolean commonRiskPointInspection;

		private String containerServiceName;

		private String coverageBaseline;

		private Boolean coverageFromThirdPlatform;

		private Long created;

		private Boolean createIterationNeedReq;

		private Boolean createStageMergeTask;

		private Boolean crucialApp;

		private String customBuildType;

		private Boolean dbChangeEvaluate;

		private Boolean deleted;

		private String devLang;

		private Boolean devServerDeployment;

		private String displayName;

		private String gitLabGroupName;

		private String gitLabHttpUrl;

		private String gitLabRepoName;

		private String gitLabSshUrl;

		private Boolean greyEmergencyRelease;

		private Boolean greyRelease;

		private String id;

		private String image;

		private Long lastModified;

		private String level;

		private Boolean lockBranch;

		private String name;

		private Boolean netRelease;

		private Boolean offlineAuthControl;

		private String offlineZoneMode;

		private String onlineStatus;

		private String optionList;

		private String parentArchDomainExternalId;

		private String parentArchDomainName;

		private String priPubOwner;

		private String releaseDomainName;

		private String releaseType;

		private Boolean riskAssessNeeded;

		private Boolean serverDeployment;

		private Boolean sitServerDeployment;

		private String stableDeployMode;

		private String station;

		private String status;

		private Long synacId;

		private Boolean tcCenterPassRate;

		private String tenantId;

		private Boolean trunkMrNeedDefectOrReq;

		private Boolean useLinkQ;

		private Boolean usePullRequestInAlipay;

		private Boolean useTenantQualityRule;

		private String vcs;

		private String zoneMode;

		private List<String> customQualityDisplay;

		private List<String> devOwners;

		private List<String> devOwnerUsers;

		private List<String> iterationMembers;

		private List<String> members;

		private List<String> memberNames;

		private List<String> modules;

		private List<String> notAllowSkipComponentName;

		private List<String> pes;

		private List<String> productOwners;

		private List<String> productTestOwners;

		private List<String> pubOwners;

		private List<String> qualityRules;

		private List<String> testOwners;

		public String getAppGroup() {
			return this.appGroup;
		}

		public void setAppGroup(String appGroup) {
			this.appGroup = appGroup;
		}

		public String getAppTechStackName() {
			return this.appTechStackName;
		}

		public void setAppTechStackName(String appTechStackName) {
			this.appTechStackName = appTechStackName;
		}

		public String getAppType() {
			return this.appType;
		}

		public void setAppType(String appType) {
			this.appType = appType;
		}

		public String getAppTypeBackUp() {
			return this.appTypeBackUp;
		}

		public void setAppTypeBackUp(String appTypeBackUp) {
			this.appTypeBackUp = appTypeBackUp;
		}

		public String getArchDomainExternalId() {
			return this.archDomainExternalId;
		}

		public void setArchDomainExternalId(String archDomainExternalId) {
			this.archDomainExternalId = archDomainExternalId;
		}

		public String getArchDomainMeta() {
			return this.archDomainMeta;
		}

		public void setArchDomainMeta(String archDomainMeta) {
			this.archDomainMeta = archDomainMeta;
		}

		public String getArchDomainName() {
			return this.archDomainName;
		}

		public void setArchDomainName(String archDomainName) {
			this.archDomainName = archDomainName;
		}

		public Long getArchDomainSynacId() {
			return this.archDomainSynacId;
		}

		public void setArchDomainSynacId(Long archDomainSynacId) {
			this.archDomainSynacId = archDomainSynacId;
		}

		public Boolean getAutoBetaSitDeploy() {
			return this.autoBetaSitDeploy;
		}

		public void setAutoBetaSitDeploy(Boolean autoBetaSitDeploy) {
			this.autoBetaSitDeploy = autoBetaSitDeploy;
		}

		public String getBaseJarInfo() {
			return this.baseJarInfo;
		}

		public void setBaseJarInfo(String baseJarInfo) {
			this.baseJarInfo = baseJarInfo;
		}

		public Boolean getBetterQuality() {
			return this.betterQuality;
		}

		public void setBetterQuality(Boolean betterQuality) {
			this.betterQuality = betterQuality;
		}

		public Boolean getBlizzardRecordingAndPlaybackSmartTest() {
			return this.blizzardRecordingAndPlaybackSmartTest;
		}

		public void setBlizzardRecordingAndPlaybackSmartTest(Boolean blizzardRecordingAndPlaybackSmartTest) {
			this.blizzardRecordingAndPlaybackSmartTest = blizzardRecordingAndPlaybackSmartTest;
		}

		public String getCloudDeployType() {
			return this.cloudDeployType;
		}

		public void setCloudDeployType(String cloudDeployType) {
			this.cloudDeployType = cloudDeployType;
		}

		public Boolean getCommonRiskPointInspection() {
			return this.commonRiskPointInspection;
		}

		public void setCommonRiskPointInspection(Boolean commonRiskPointInspection) {
			this.commonRiskPointInspection = commonRiskPointInspection;
		}

		public String getContainerServiceName() {
			return this.containerServiceName;
		}

		public void setContainerServiceName(String containerServiceName) {
			this.containerServiceName = containerServiceName;
		}

		public String getCoverageBaseline() {
			return this.coverageBaseline;
		}

		public void setCoverageBaseline(String coverageBaseline) {
			this.coverageBaseline = coverageBaseline;
		}

		public Boolean getCoverageFromThirdPlatform() {
			return this.coverageFromThirdPlatform;
		}

		public void setCoverageFromThirdPlatform(Boolean coverageFromThirdPlatform) {
			this.coverageFromThirdPlatform = coverageFromThirdPlatform;
		}

		public Long getCreated() {
			return this.created;
		}

		public void setCreated(Long created) {
			this.created = created;
		}

		public Boolean getCreateIterationNeedReq() {
			return this.createIterationNeedReq;
		}

		public void setCreateIterationNeedReq(Boolean createIterationNeedReq) {
			this.createIterationNeedReq = createIterationNeedReq;
		}

		public Boolean getCreateStageMergeTask() {
			return this.createStageMergeTask;
		}

		public void setCreateStageMergeTask(Boolean createStageMergeTask) {
			this.createStageMergeTask = createStageMergeTask;
		}

		public Boolean getCrucialApp() {
			return this.crucialApp;
		}

		public void setCrucialApp(Boolean crucialApp) {
			this.crucialApp = crucialApp;
		}

		public String getCustomBuildType() {
			return this.customBuildType;
		}

		public void setCustomBuildType(String customBuildType) {
			this.customBuildType = customBuildType;
		}

		public Boolean getDbChangeEvaluate() {
			return this.dbChangeEvaluate;
		}

		public void setDbChangeEvaluate(Boolean dbChangeEvaluate) {
			this.dbChangeEvaluate = dbChangeEvaluate;
		}

		public Boolean getDeleted() {
			return this.deleted;
		}

		public void setDeleted(Boolean deleted) {
			this.deleted = deleted;
		}

		public String getDevLang() {
			return this.devLang;
		}

		public void setDevLang(String devLang) {
			this.devLang = devLang;
		}

		public Boolean getDevServerDeployment() {
			return this.devServerDeployment;
		}

		public void setDevServerDeployment(Boolean devServerDeployment) {
			this.devServerDeployment = devServerDeployment;
		}

		public String getDisplayName() {
			return this.displayName;
		}

		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}

		public String getGitLabGroupName() {
			return this.gitLabGroupName;
		}

		public void setGitLabGroupName(String gitLabGroupName) {
			this.gitLabGroupName = gitLabGroupName;
		}

		public String getGitLabHttpUrl() {
			return this.gitLabHttpUrl;
		}

		public void setGitLabHttpUrl(String gitLabHttpUrl) {
			this.gitLabHttpUrl = gitLabHttpUrl;
		}

		public String getGitLabRepoName() {
			return this.gitLabRepoName;
		}

		public void setGitLabRepoName(String gitLabRepoName) {
			this.gitLabRepoName = gitLabRepoName;
		}

		public String getGitLabSshUrl() {
			return this.gitLabSshUrl;
		}

		public void setGitLabSshUrl(String gitLabSshUrl) {
			this.gitLabSshUrl = gitLabSshUrl;
		}

		public Boolean getGreyEmergencyRelease() {
			return this.greyEmergencyRelease;
		}

		public void setGreyEmergencyRelease(Boolean greyEmergencyRelease) {
			this.greyEmergencyRelease = greyEmergencyRelease;
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

		public String getImage() {
			return this.image;
		}

		public void setImage(String image) {
			this.image = image;
		}

		public Long getLastModified() {
			return this.lastModified;
		}

		public void setLastModified(Long lastModified) {
			this.lastModified = lastModified;
		}

		public String getLevel() {
			return this.level;
		}

		public void setLevel(String level) {
			this.level = level;
		}

		public Boolean getLockBranch() {
			return this.lockBranch;
		}

		public void setLockBranch(Boolean lockBranch) {
			this.lockBranch = lockBranch;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Boolean getNetRelease() {
			return this.netRelease;
		}

		public void setNetRelease(Boolean netRelease) {
			this.netRelease = netRelease;
		}

		public Boolean getOfflineAuthControl() {
			return this.offlineAuthControl;
		}

		public void setOfflineAuthControl(Boolean offlineAuthControl) {
			this.offlineAuthControl = offlineAuthControl;
		}

		public String getOfflineZoneMode() {
			return this.offlineZoneMode;
		}

		public void setOfflineZoneMode(String offlineZoneMode) {
			this.offlineZoneMode = offlineZoneMode;
		}

		public String getOnlineStatus() {
			return this.onlineStatus;
		}

		public void setOnlineStatus(String onlineStatus) {
			this.onlineStatus = onlineStatus;
		}

		public String getOptionList() {
			return this.optionList;
		}

		public void setOptionList(String optionList) {
			this.optionList = optionList;
		}

		public String getParentArchDomainExternalId() {
			return this.parentArchDomainExternalId;
		}

		public void setParentArchDomainExternalId(String parentArchDomainExternalId) {
			this.parentArchDomainExternalId = parentArchDomainExternalId;
		}

		public String getParentArchDomainName() {
			return this.parentArchDomainName;
		}

		public void setParentArchDomainName(String parentArchDomainName) {
			this.parentArchDomainName = parentArchDomainName;
		}

		public String getPriPubOwner() {
			return this.priPubOwner;
		}

		public void setPriPubOwner(String priPubOwner) {
			this.priPubOwner = priPubOwner;
		}

		public String getReleaseDomainName() {
			return this.releaseDomainName;
		}

		public void setReleaseDomainName(String releaseDomainName) {
			this.releaseDomainName = releaseDomainName;
		}

		public String getReleaseType() {
			return this.releaseType;
		}

		public void setReleaseType(String releaseType) {
			this.releaseType = releaseType;
		}

		public Boolean getRiskAssessNeeded() {
			return this.riskAssessNeeded;
		}

		public void setRiskAssessNeeded(Boolean riskAssessNeeded) {
			this.riskAssessNeeded = riskAssessNeeded;
		}

		public Boolean getServerDeployment() {
			return this.serverDeployment;
		}

		public void setServerDeployment(Boolean serverDeployment) {
			this.serverDeployment = serverDeployment;
		}

		public Boolean getSitServerDeployment() {
			return this.sitServerDeployment;
		}

		public void setSitServerDeployment(Boolean sitServerDeployment) {
			this.sitServerDeployment = sitServerDeployment;
		}

		public String getStableDeployMode() {
			return this.stableDeployMode;
		}

		public void setStableDeployMode(String stableDeployMode) {
			this.stableDeployMode = stableDeployMode;
		}

		public String getStation() {
			return this.station;
		}

		public void setStation(String station) {
			this.station = station;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Long getSynacId() {
			return this.synacId;
		}

		public void setSynacId(Long synacId) {
			this.synacId = synacId;
		}

		public Boolean getTcCenterPassRate() {
			return this.tcCenterPassRate;
		}

		public void setTcCenterPassRate(Boolean tcCenterPassRate) {
			this.tcCenterPassRate = tcCenterPassRate;
		}

		public String getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}

		public Boolean getTrunkMrNeedDefectOrReq() {
			return this.trunkMrNeedDefectOrReq;
		}

		public void setTrunkMrNeedDefectOrReq(Boolean trunkMrNeedDefectOrReq) {
			this.trunkMrNeedDefectOrReq = trunkMrNeedDefectOrReq;
		}

		public Boolean getUseLinkQ() {
			return this.useLinkQ;
		}

		public void setUseLinkQ(Boolean useLinkQ) {
			this.useLinkQ = useLinkQ;
		}

		public Boolean getUsePullRequestInAlipay() {
			return this.usePullRequestInAlipay;
		}

		public void setUsePullRequestInAlipay(Boolean usePullRequestInAlipay) {
			this.usePullRequestInAlipay = usePullRequestInAlipay;
		}

		public Boolean getUseTenantQualityRule() {
			return this.useTenantQualityRule;
		}

		public void setUseTenantQualityRule(Boolean useTenantQualityRule) {
			this.useTenantQualityRule = useTenantQualityRule;
		}

		public String getVcs() {
			return this.vcs;
		}

		public void setVcs(String vcs) {
			this.vcs = vcs;
		}

		public String getZoneMode() {
			return this.zoneMode;
		}

		public void setZoneMode(String zoneMode) {
			this.zoneMode = zoneMode;
		}

		public List<String> getCustomQualityDisplay() {
			return this.customQualityDisplay;
		}

		public void setCustomQualityDisplay(List<String> customQualityDisplay) {
			this.customQualityDisplay = customQualityDisplay;
		}

		public List<String> getDevOwners() {
			return this.devOwners;
		}

		public void setDevOwners(List<String> devOwners) {
			this.devOwners = devOwners;
		}

		public List<String> getDevOwnerUsers() {
			return this.devOwnerUsers;
		}

		public void setDevOwnerUsers(List<String> devOwnerUsers) {
			this.devOwnerUsers = devOwnerUsers;
		}

		public List<String> getIterationMembers() {
			return this.iterationMembers;
		}

		public void setIterationMembers(List<String> iterationMembers) {
			this.iterationMembers = iterationMembers;
		}

		public List<String> getMembers() {
			return this.members;
		}

		public void setMembers(List<String> members) {
			this.members = members;
		}

		public List<String> getMemberNames() {
			return this.memberNames;
		}

		public void setMemberNames(List<String> memberNames) {
			this.memberNames = memberNames;
		}

		public List<String> getModules() {
			return this.modules;
		}

		public void setModules(List<String> modules) {
			this.modules = modules;
		}

		public List<String> getNotAllowSkipComponentName() {
			return this.notAllowSkipComponentName;
		}

		public void setNotAllowSkipComponentName(List<String> notAllowSkipComponentName) {
			this.notAllowSkipComponentName = notAllowSkipComponentName;
		}

		public List<String> getPes() {
			return this.pes;
		}

		public void setPes(List<String> pes) {
			this.pes = pes;
		}

		public List<String> getProductOwners() {
			return this.productOwners;
		}

		public void setProductOwners(List<String> productOwners) {
			this.productOwners = productOwners;
		}

		public List<String> getProductTestOwners() {
			return this.productTestOwners;
		}

		public void setProductTestOwners(List<String> productTestOwners) {
			this.productTestOwners = productTestOwners;
		}

		public List<String> getPubOwners() {
			return this.pubOwners;
		}

		public void setPubOwners(List<String> pubOwners) {
			this.pubOwners = pubOwners;
		}

		public List<String> getQualityRules() {
			return this.qualityRules;
		}

		public void setQualityRules(List<String> qualityRules) {
			this.qualityRules = qualityRules;
		}

		public List<String> getTestOwners() {
			return this.testOwners;
		}

		public void setTestOwners(List<String> testOwners) {
			this.testOwners = testOwners;
		}
	}

	@Override
	public CreateLinkeBahamutAppbindrepoResponse getInstance(UnmarshallerContext context) {
		return	CreateLinkeBahamutAppbindrepoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
