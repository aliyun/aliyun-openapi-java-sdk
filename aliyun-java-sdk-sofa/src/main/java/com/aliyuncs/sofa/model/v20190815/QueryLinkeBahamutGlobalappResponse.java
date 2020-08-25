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
import com.aliyuncs.sofa.transform.v20190815.QueryLinkeBahamutGlobalappResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryLinkeBahamutGlobalappResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private String errorMessage;

	private String errorMsgParamsMap;

	private String message;

	private Long responseStatusCode;

	private Boolean success;

	private List<ResultItem> result;

	private Paginator paginator;

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

	public Paginator getPaginator() {
		return this.paginator;
	}

	public void setPaginator(Paginator paginator) {
		this.paginator = paginator;
	}

	public static class ResultItem {

		private String appGroup;

		private String appType;

		private String archDomainExternalId;

		private String archDomainName;

		private Boolean autoBetaSitDeploy;

		private String baseJarInfo;

		private Boolean betterQuality;

		private Boolean commonRiskPointInspection;

		private String coverageBaseline;

		private Boolean coverageFromThirdPlatform;

		private Boolean crucialApp;

		private String devLang;

		private Boolean devServerDeployment;

		private String displayName;

		private String gitLabGroupName;

		private String gitLabHttpUrl;

		private String gitLabRepoName;

		private String gitLabSshUrl;

		private Boolean greyEmergencyRelease;

		private Boolean greyRelease;

		private String legacyConflict;

		private String level;

		private Boolean lockBranch;

		private String name;

		private Boolean netRelease;

		private String optionList;

		private String parentArchDomainExternalId;

		private String parentArchDomainName;

		private String priPubOwner;

		private String releaseDomainName;

		private String releaseType;

		private Boolean riskAssessNeeded;

		private Boolean serverDeployment;

		private Boolean sitServerDeployment;

		private String status;

		private Boolean tcCenterPassRate;

		private String tenantId;

		private Boolean trunkMrNeedDefectOrReq;

		private Boolean useTenantQualityRule;

		private String vcs;

		private String zoneMode;

		private List<String> customQualityDisplay;

		private List<String> devOwners;

		private List<String> devOwnerUsers;

		private List<String> members;

		private List<String> memberNames;

		private List<String> modules;

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

		public String getAppType() {
			return this.appType;
		}

		public void setAppType(String appType) {
			this.appType = appType;
		}

		public String getArchDomainExternalId() {
			return this.archDomainExternalId;
		}

		public void setArchDomainExternalId(String archDomainExternalId) {
			this.archDomainExternalId = archDomainExternalId;
		}

		public String getArchDomainName() {
			return this.archDomainName;
		}

		public void setArchDomainName(String archDomainName) {
			this.archDomainName = archDomainName;
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

		public Boolean getCommonRiskPointInspection() {
			return this.commonRiskPointInspection;
		}

		public void setCommonRiskPointInspection(Boolean commonRiskPointInspection) {
			this.commonRiskPointInspection = commonRiskPointInspection;
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

		public Boolean getCrucialApp() {
			return this.crucialApp;
		}

		public void setCrucialApp(Boolean crucialApp) {
			this.crucialApp = crucialApp;
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

		public String getLegacyConflict() {
			return this.legacyConflict;
		}

		public void setLegacyConflict(String legacyConflict) {
			this.legacyConflict = legacyConflict;
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

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
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

	public static class Paginator {

		private Long itemCount;

		private Long page;

		private Long pageCount;

		private Long pageSize;

		public Long getItemCount() {
			return this.itemCount;
		}

		public void setItemCount(Long itemCount) {
			this.itemCount = itemCount;
		}

		public Long getPage() {
			return this.page;
		}

		public void setPage(Long page) {
			this.page = page;
		}

		public Long getPageCount() {
			return this.pageCount;
		}

		public void setPageCount(Long pageCount) {
			this.pageCount = pageCount;
		}

		public Long getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}
	}

	@Override
	public QueryLinkeBahamutGlobalappResponse getInstance(UnmarshallerContext context) {
		return	QueryLinkeBahamutGlobalappResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
