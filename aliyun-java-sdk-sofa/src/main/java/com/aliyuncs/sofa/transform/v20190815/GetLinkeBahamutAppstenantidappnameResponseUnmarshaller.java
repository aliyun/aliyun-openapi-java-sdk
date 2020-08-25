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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutAppstenantidappnameResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutAppstenantidappnameResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutAppstenantidappnameResponseUnmarshaller {

	public static GetLinkeBahamutAppstenantidappnameResponse unmarshall(GetLinkeBahamutAppstenantidappnameResponse getLinkeBahamutAppstenantidappnameResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutAppstenantidappnameResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutAppstenantidappnameResponse.RequestId"));
		getLinkeBahamutAppstenantidappnameResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutAppstenantidappnameResponse.ResultCode"));
		getLinkeBahamutAppstenantidappnameResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutAppstenantidappnameResponse.ResultMessage"));
		getLinkeBahamutAppstenantidappnameResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutAppstenantidappnameResponse.ErrorMessage"));
		getLinkeBahamutAppstenantidappnameResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutAppstenantidappnameResponse.ErrorMsgParamsMap"));
		getLinkeBahamutAppstenantidappnameResponse.setMessage(_ctx.stringValue("GetLinkeBahamutAppstenantidappnameResponse.Message"));
		getLinkeBahamutAppstenantidappnameResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutAppstenantidappnameResponse.ResponseStatusCode"));
		getLinkeBahamutAppstenantidappnameResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutAppstenantidappnameResponse.Success"));

		Result result = new Result();
		result.setAppGroup(_ctx.stringValue("GetLinkeBahamutAppstenantidappnameResponse.Result.AppGroup"));
		result.setAppTechStackName(_ctx.stringValue("GetLinkeBahamutAppstenantidappnameResponse.Result.AppTechStackName"));
		result.setAppType(_ctx.stringValue("GetLinkeBahamutAppstenantidappnameResponse.Result.AppType"));
		result.setAppTypeBackUp(_ctx.stringValue("GetLinkeBahamutAppstenantidappnameResponse.Result.AppTypeBackUp"));
		result.setArchDomainExternalId(_ctx.stringValue("GetLinkeBahamutAppstenantidappnameResponse.Result.ArchDomainExternalId"));
		result.setArchDomainMeta(_ctx.stringValue("GetLinkeBahamutAppstenantidappnameResponse.Result.ArchDomainMeta"));
		result.setArchDomainName(_ctx.stringValue("GetLinkeBahamutAppstenantidappnameResponse.Result.ArchDomainName"));
		result.setArchDomainSynacId(_ctx.longValue("GetLinkeBahamutAppstenantidappnameResponse.Result.ArchDomainSynacId"));
		result.setAutoBetaSitDeploy(_ctx.booleanValue("GetLinkeBahamutAppstenantidappnameResponse.Result.AutoBetaSitDeploy"));
		result.setBaseJarInfo(_ctx.stringValue("GetLinkeBahamutAppstenantidappnameResponse.Result.BaseJarInfo"));
		result.setBetterQuality(_ctx.booleanValue("GetLinkeBahamutAppstenantidappnameResponse.Result.BetterQuality"));
		result.setBlizzardRecordingAndPlaybackSmartTest(_ctx.booleanValue("GetLinkeBahamutAppstenantidappnameResponse.Result.BlizzardRecordingAndPlaybackSmartTest"));
		result.setCloudDeployType(_ctx.stringValue("GetLinkeBahamutAppstenantidappnameResponse.Result.CloudDeployType"));
		result.setCommonRiskPointInspection(_ctx.booleanValue("GetLinkeBahamutAppstenantidappnameResponse.Result.CommonRiskPointInspection"));
		result.setContainerServiceName(_ctx.stringValue("GetLinkeBahamutAppstenantidappnameResponse.Result.ContainerServiceName"));
		result.setCoverageBaseline(_ctx.stringValue("GetLinkeBahamutAppstenantidappnameResponse.Result.CoverageBaseline"));
		result.setCoverageFromThirdPlatform(_ctx.booleanValue("GetLinkeBahamutAppstenantidappnameResponse.Result.CoverageFromThirdPlatform"));
		result.setCreated(_ctx.longValue("GetLinkeBahamutAppstenantidappnameResponse.Result.Created"));
		result.setCreateIterationNeedReq(_ctx.booleanValue("GetLinkeBahamutAppstenantidappnameResponse.Result.CreateIterationNeedReq"));
		result.setCreateStageMergeTask(_ctx.booleanValue("GetLinkeBahamutAppstenantidappnameResponse.Result.CreateStageMergeTask"));
		result.setCrucialApp(_ctx.booleanValue("GetLinkeBahamutAppstenantidappnameResponse.Result.CrucialApp"));
		result.setCustomBuildType(_ctx.stringValue("GetLinkeBahamutAppstenantidappnameResponse.Result.CustomBuildType"));
		result.setDbChangeEvaluate(_ctx.booleanValue("GetLinkeBahamutAppstenantidappnameResponse.Result.DbChangeEvaluate"));
		result.setDeleted(_ctx.booleanValue("GetLinkeBahamutAppstenantidappnameResponse.Result.Deleted"));
		result.setDevLang(_ctx.stringValue("GetLinkeBahamutAppstenantidappnameResponse.Result.DevLang"));
		result.setDevServerDeployment(_ctx.booleanValue("GetLinkeBahamutAppstenantidappnameResponse.Result.DevServerDeployment"));
		result.setDisplayName(_ctx.stringValue("GetLinkeBahamutAppstenantidappnameResponse.Result.DisplayName"));
		result.setGitLabGroupName(_ctx.stringValue("GetLinkeBahamutAppstenantidappnameResponse.Result.GitLabGroupName"));
		result.setGitLabHttpUrl(_ctx.stringValue("GetLinkeBahamutAppstenantidappnameResponse.Result.GitLabHttpUrl"));
		result.setGitLabRepoName(_ctx.stringValue("GetLinkeBahamutAppstenantidappnameResponse.Result.GitLabRepoName"));
		result.setGitLabSshUrl(_ctx.stringValue("GetLinkeBahamutAppstenantidappnameResponse.Result.GitLabSshUrl"));
		result.setGreyEmergencyRelease(_ctx.booleanValue("GetLinkeBahamutAppstenantidappnameResponse.Result.GreyEmergencyRelease"));
		result.setGreyRelease(_ctx.booleanValue("GetLinkeBahamutAppstenantidappnameResponse.Result.GreyRelease"));
		result.setId(_ctx.stringValue("GetLinkeBahamutAppstenantidappnameResponse.Result.Id"));
		result.setImage(_ctx.stringValue("GetLinkeBahamutAppstenantidappnameResponse.Result.Image"));
		result.setLastModified(_ctx.longValue("GetLinkeBahamutAppstenantidappnameResponse.Result.LastModified"));
		result.setLevel(_ctx.stringValue("GetLinkeBahamutAppstenantidappnameResponse.Result.Level"));
		result.setLockBranch(_ctx.booleanValue("GetLinkeBahamutAppstenantidappnameResponse.Result.LockBranch"));
		result.setName(_ctx.stringValue("GetLinkeBahamutAppstenantidappnameResponse.Result.Name"));
		result.setNetRelease(_ctx.booleanValue("GetLinkeBahamutAppstenantidappnameResponse.Result.NetRelease"));
		result.setOfflineAuthControl(_ctx.booleanValue("GetLinkeBahamutAppstenantidappnameResponse.Result.OfflineAuthControl"));
		result.setOfflineZoneMode(_ctx.stringValue("GetLinkeBahamutAppstenantidappnameResponse.Result.OfflineZoneMode"));
		result.setOnlineStatus(_ctx.stringValue("GetLinkeBahamutAppstenantidappnameResponse.Result.OnlineStatus"));
		result.setOptionList(_ctx.stringValue("GetLinkeBahamutAppstenantidappnameResponse.Result.OptionList"));
		result.setParentArchDomainExternalId(_ctx.stringValue("GetLinkeBahamutAppstenantidappnameResponse.Result.ParentArchDomainExternalId"));
		result.setParentArchDomainName(_ctx.stringValue("GetLinkeBahamutAppstenantidappnameResponse.Result.ParentArchDomainName"));
		result.setPriPubOwner(_ctx.stringValue("GetLinkeBahamutAppstenantidappnameResponse.Result.PriPubOwner"));
		result.setReleaseDomainName(_ctx.stringValue("GetLinkeBahamutAppstenantidappnameResponse.Result.ReleaseDomainName"));
		result.setReleaseType(_ctx.stringValue("GetLinkeBahamutAppstenantidappnameResponse.Result.ReleaseType"));
		result.setRiskAssessNeeded(_ctx.booleanValue("GetLinkeBahamutAppstenantidappnameResponse.Result.RiskAssessNeeded"));
		result.setServerDeployment(_ctx.booleanValue("GetLinkeBahamutAppstenantidappnameResponse.Result.ServerDeployment"));
		result.setSitServerDeployment(_ctx.booleanValue("GetLinkeBahamutAppstenantidappnameResponse.Result.SitServerDeployment"));
		result.setStableDeployMode(_ctx.stringValue("GetLinkeBahamutAppstenantidappnameResponse.Result.StableDeployMode"));
		result.setStation(_ctx.stringValue("GetLinkeBahamutAppstenantidappnameResponse.Result.Station"));
		result.setStatus(_ctx.stringValue("GetLinkeBahamutAppstenantidappnameResponse.Result.Status"));
		result.setSynacId(_ctx.longValue("GetLinkeBahamutAppstenantidappnameResponse.Result.SynacId"));
		result.setTcCenterPassRate(_ctx.booleanValue("GetLinkeBahamutAppstenantidappnameResponse.Result.TcCenterPassRate"));
		result.setTenantId(_ctx.stringValue("GetLinkeBahamutAppstenantidappnameResponse.Result.TenantId"));
		result.setTrunkMrNeedDefectOrReq(_ctx.booleanValue("GetLinkeBahamutAppstenantidappnameResponse.Result.TrunkMrNeedDefectOrReq"));
		result.setUseLinkQ(_ctx.booleanValue("GetLinkeBahamutAppstenantidappnameResponse.Result.UseLinkQ"));
		result.setUsePullRequestInAlipay(_ctx.booleanValue("GetLinkeBahamutAppstenantidappnameResponse.Result.UsePullRequestInAlipay"));
		result.setUseTenantQualityRule(_ctx.booleanValue("GetLinkeBahamutAppstenantidappnameResponse.Result.UseTenantQualityRule"));
		result.setVcs(_ctx.stringValue("GetLinkeBahamutAppstenantidappnameResponse.Result.Vcs"));
		result.setZoneMode(_ctx.stringValue("GetLinkeBahamutAppstenantidappnameResponse.Result.ZoneMode"));

		List<String> customQualityDisplay = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutAppstenantidappnameResponse.Result.CustomQualityDisplay.Length"); i++) {
			customQualityDisplay.add(_ctx.stringValue("GetLinkeBahamutAppstenantidappnameResponse.Result.CustomQualityDisplay["+ i +"]"));
		}
		result.setCustomQualityDisplay(customQualityDisplay);

		List<String> devOwners = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutAppstenantidappnameResponse.Result.DevOwners.Length"); i++) {
			devOwners.add(_ctx.stringValue("GetLinkeBahamutAppstenantidappnameResponse.Result.DevOwners["+ i +"]"));
		}
		result.setDevOwners(devOwners);

		List<String> devOwnerUsers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutAppstenantidappnameResponse.Result.DevOwnerUsers.Length"); i++) {
			devOwnerUsers.add(_ctx.stringValue("GetLinkeBahamutAppstenantidappnameResponse.Result.DevOwnerUsers["+ i +"]"));
		}
		result.setDevOwnerUsers(devOwnerUsers);

		List<String> iterationMembers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutAppstenantidappnameResponse.Result.IterationMembers.Length"); i++) {
			iterationMembers.add(_ctx.stringValue("GetLinkeBahamutAppstenantidappnameResponse.Result.IterationMembers["+ i +"]"));
		}
		result.setIterationMembers(iterationMembers);

		List<String> members = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutAppstenantidappnameResponse.Result.Members.Length"); i++) {
			members.add(_ctx.stringValue("GetLinkeBahamutAppstenantidappnameResponse.Result.Members["+ i +"]"));
		}
		result.setMembers(members);

		List<String> memberNames = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutAppstenantidappnameResponse.Result.MemberNames.Length"); i++) {
			memberNames.add(_ctx.stringValue("GetLinkeBahamutAppstenantidappnameResponse.Result.MemberNames["+ i +"]"));
		}
		result.setMemberNames(memberNames);

		List<String> modules = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutAppstenantidappnameResponse.Result.Modules.Length"); i++) {
			modules.add(_ctx.stringValue("GetLinkeBahamutAppstenantidappnameResponse.Result.Modules["+ i +"]"));
		}
		result.setModules(modules);

		List<String> notAllowSkipComponentName = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutAppstenantidappnameResponse.Result.NotAllowSkipComponentName.Length"); i++) {
			notAllowSkipComponentName.add(_ctx.stringValue("GetLinkeBahamutAppstenantidappnameResponse.Result.NotAllowSkipComponentName["+ i +"]"));
		}
		result.setNotAllowSkipComponentName(notAllowSkipComponentName);

		List<String> pes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutAppstenantidappnameResponse.Result.Pes.Length"); i++) {
			pes.add(_ctx.stringValue("GetLinkeBahamutAppstenantidappnameResponse.Result.Pes["+ i +"]"));
		}
		result.setPes(pes);

		List<String> productOwners = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutAppstenantidappnameResponse.Result.ProductOwners.Length"); i++) {
			productOwners.add(_ctx.stringValue("GetLinkeBahamutAppstenantidappnameResponse.Result.ProductOwners["+ i +"]"));
		}
		result.setProductOwners(productOwners);

		List<String> productTestOwners = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutAppstenantidappnameResponse.Result.ProductTestOwners.Length"); i++) {
			productTestOwners.add(_ctx.stringValue("GetLinkeBahamutAppstenantidappnameResponse.Result.ProductTestOwners["+ i +"]"));
		}
		result.setProductTestOwners(productTestOwners);

		List<String> pubOwners = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutAppstenantidappnameResponse.Result.PubOwners.Length"); i++) {
			pubOwners.add(_ctx.stringValue("GetLinkeBahamutAppstenantidappnameResponse.Result.PubOwners["+ i +"]"));
		}
		result.setPubOwners(pubOwners);

		List<String> qualityRules = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutAppstenantidappnameResponse.Result.QualityRules.Length"); i++) {
			qualityRules.add(_ctx.stringValue("GetLinkeBahamutAppstenantidappnameResponse.Result.QualityRules["+ i +"]"));
		}
		result.setQualityRules(qualityRules);

		List<String> testOwners = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutAppstenantidappnameResponse.Result.TestOwners.Length"); i++) {
			testOwners.add(_ctx.stringValue("GetLinkeBahamutAppstenantidappnameResponse.Result.TestOwners["+ i +"]"));
		}
		result.setTestOwners(testOwners);
		getLinkeBahamutAppstenantidappnameResponse.setResult(result);
	 
	 	return getLinkeBahamutAppstenantidappnameResponse;
	}
}