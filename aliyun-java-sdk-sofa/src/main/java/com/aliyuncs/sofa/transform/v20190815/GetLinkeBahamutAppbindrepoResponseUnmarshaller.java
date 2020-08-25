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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutAppbindrepoResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutAppbindrepoResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutAppbindrepoResponseUnmarshaller {

	public static GetLinkeBahamutAppbindrepoResponse unmarshall(GetLinkeBahamutAppbindrepoResponse getLinkeBahamutAppbindrepoResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutAppbindrepoResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutAppbindrepoResponse.RequestId"));
		getLinkeBahamutAppbindrepoResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutAppbindrepoResponse.ResultCode"));
		getLinkeBahamutAppbindrepoResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutAppbindrepoResponse.ResultMessage"));
		getLinkeBahamutAppbindrepoResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutAppbindrepoResponse.ErrorMessage"));
		getLinkeBahamutAppbindrepoResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutAppbindrepoResponse.ErrorMsgParamsMap"));
		getLinkeBahamutAppbindrepoResponse.setMessage(_ctx.stringValue("GetLinkeBahamutAppbindrepoResponse.Message"));
		getLinkeBahamutAppbindrepoResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutAppbindrepoResponse.ResponseStatusCode"));
		getLinkeBahamutAppbindrepoResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutAppbindrepoResponse.Success"));

		Result result = new Result();
		result.setAppGroup(_ctx.stringValue("GetLinkeBahamutAppbindrepoResponse.Result.AppGroup"));
		result.setAppTechStackName(_ctx.stringValue("GetLinkeBahamutAppbindrepoResponse.Result.AppTechStackName"));
		result.setAppType(_ctx.stringValue("GetLinkeBahamutAppbindrepoResponse.Result.AppType"));
		result.setAppTypeBackUp(_ctx.stringValue("GetLinkeBahamutAppbindrepoResponse.Result.AppTypeBackUp"));
		result.setArchDomainExternalId(_ctx.stringValue("GetLinkeBahamutAppbindrepoResponse.Result.ArchDomainExternalId"));
		result.setArchDomainMeta(_ctx.stringValue("GetLinkeBahamutAppbindrepoResponse.Result.ArchDomainMeta"));
		result.setArchDomainName(_ctx.stringValue("GetLinkeBahamutAppbindrepoResponse.Result.ArchDomainName"));
		result.setArchDomainSynacId(_ctx.longValue("GetLinkeBahamutAppbindrepoResponse.Result.ArchDomainSynacId"));
		result.setAutoBetaSitDeploy(_ctx.booleanValue("GetLinkeBahamutAppbindrepoResponse.Result.AutoBetaSitDeploy"));
		result.setBaseJarInfo(_ctx.stringValue("GetLinkeBahamutAppbindrepoResponse.Result.BaseJarInfo"));
		result.setBetterQuality(_ctx.booleanValue("GetLinkeBahamutAppbindrepoResponse.Result.BetterQuality"));
		result.setBlizzardRecordingAndPlaybackSmartTest(_ctx.booleanValue("GetLinkeBahamutAppbindrepoResponse.Result.BlizzardRecordingAndPlaybackSmartTest"));
		result.setCloudDeployType(_ctx.stringValue("GetLinkeBahamutAppbindrepoResponse.Result.CloudDeployType"));
		result.setCommonRiskPointInspection(_ctx.booleanValue("GetLinkeBahamutAppbindrepoResponse.Result.CommonRiskPointInspection"));
		result.setContainerServiceName(_ctx.stringValue("GetLinkeBahamutAppbindrepoResponse.Result.ContainerServiceName"));
		result.setCoverageBaseline(_ctx.stringValue("GetLinkeBahamutAppbindrepoResponse.Result.CoverageBaseline"));
		result.setCoverageFromThirdPlatform(_ctx.booleanValue("GetLinkeBahamutAppbindrepoResponse.Result.CoverageFromThirdPlatform"));
		result.setCreated(_ctx.longValue("GetLinkeBahamutAppbindrepoResponse.Result.Created"));
		result.setCreateIterationNeedReq(_ctx.booleanValue("GetLinkeBahamutAppbindrepoResponse.Result.CreateIterationNeedReq"));
		result.setCreateStageMergeTask(_ctx.booleanValue("GetLinkeBahamutAppbindrepoResponse.Result.CreateStageMergeTask"));
		result.setCrucialApp(_ctx.booleanValue("GetLinkeBahamutAppbindrepoResponse.Result.CrucialApp"));
		result.setCustomBuildType(_ctx.stringValue("GetLinkeBahamutAppbindrepoResponse.Result.CustomBuildType"));
		result.setDbChangeEvaluate(_ctx.booleanValue("GetLinkeBahamutAppbindrepoResponse.Result.DbChangeEvaluate"));
		result.setDeleted(_ctx.booleanValue("GetLinkeBahamutAppbindrepoResponse.Result.Deleted"));
		result.setDevLang(_ctx.stringValue("GetLinkeBahamutAppbindrepoResponse.Result.DevLang"));
		result.setDevServerDeployment(_ctx.booleanValue("GetLinkeBahamutAppbindrepoResponse.Result.DevServerDeployment"));
		result.setDisplayName(_ctx.stringValue("GetLinkeBahamutAppbindrepoResponse.Result.DisplayName"));
		result.setGitLabGroupName(_ctx.stringValue("GetLinkeBahamutAppbindrepoResponse.Result.GitLabGroupName"));
		result.setGitLabHttpUrl(_ctx.stringValue("GetLinkeBahamutAppbindrepoResponse.Result.GitLabHttpUrl"));
		result.setGitLabRepoName(_ctx.stringValue("GetLinkeBahamutAppbindrepoResponse.Result.GitLabRepoName"));
		result.setGitLabSshUrl(_ctx.stringValue("GetLinkeBahamutAppbindrepoResponse.Result.GitLabSshUrl"));
		result.setGreyEmergencyRelease(_ctx.booleanValue("GetLinkeBahamutAppbindrepoResponse.Result.GreyEmergencyRelease"));
		result.setGreyRelease(_ctx.booleanValue("GetLinkeBahamutAppbindrepoResponse.Result.GreyRelease"));
		result.setId(_ctx.stringValue("GetLinkeBahamutAppbindrepoResponse.Result.Id"));
		result.setImage(_ctx.stringValue("GetLinkeBahamutAppbindrepoResponse.Result.Image"));
		result.setLastModified(_ctx.longValue("GetLinkeBahamutAppbindrepoResponse.Result.LastModified"));
		result.setLevel(_ctx.stringValue("GetLinkeBahamutAppbindrepoResponse.Result.Level"));
		result.setLockBranch(_ctx.booleanValue("GetLinkeBahamutAppbindrepoResponse.Result.LockBranch"));
		result.setName(_ctx.stringValue("GetLinkeBahamutAppbindrepoResponse.Result.Name"));
		result.setNetRelease(_ctx.booleanValue("GetLinkeBahamutAppbindrepoResponse.Result.NetRelease"));
		result.setOfflineAuthControl(_ctx.booleanValue("GetLinkeBahamutAppbindrepoResponse.Result.OfflineAuthControl"));
		result.setOfflineZoneMode(_ctx.stringValue("GetLinkeBahamutAppbindrepoResponse.Result.OfflineZoneMode"));
		result.setOnlineStatus(_ctx.stringValue("GetLinkeBahamutAppbindrepoResponse.Result.OnlineStatus"));
		result.setOptionList(_ctx.stringValue("GetLinkeBahamutAppbindrepoResponse.Result.OptionList"));
		result.setParentArchDomainExternalId(_ctx.stringValue("GetLinkeBahamutAppbindrepoResponse.Result.ParentArchDomainExternalId"));
		result.setParentArchDomainName(_ctx.stringValue("GetLinkeBahamutAppbindrepoResponse.Result.ParentArchDomainName"));
		result.setPriPubOwner(_ctx.stringValue("GetLinkeBahamutAppbindrepoResponse.Result.PriPubOwner"));
		result.setReleaseDomainName(_ctx.stringValue("GetLinkeBahamutAppbindrepoResponse.Result.ReleaseDomainName"));
		result.setReleaseType(_ctx.stringValue("GetLinkeBahamutAppbindrepoResponse.Result.ReleaseType"));
		result.setRiskAssessNeeded(_ctx.booleanValue("GetLinkeBahamutAppbindrepoResponse.Result.RiskAssessNeeded"));
		result.setServerDeployment(_ctx.booleanValue("GetLinkeBahamutAppbindrepoResponse.Result.ServerDeployment"));
		result.setSitServerDeployment(_ctx.booleanValue("GetLinkeBahamutAppbindrepoResponse.Result.SitServerDeployment"));
		result.setStableDeployMode(_ctx.stringValue("GetLinkeBahamutAppbindrepoResponse.Result.StableDeployMode"));
		result.setStation(_ctx.stringValue("GetLinkeBahamutAppbindrepoResponse.Result.Station"));
		result.setStatus(_ctx.stringValue("GetLinkeBahamutAppbindrepoResponse.Result.Status"));
		result.setSynacId(_ctx.longValue("GetLinkeBahamutAppbindrepoResponse.Result.SynacId"));
		result.setTcCenterPassRate(_ctx.booleanValue("GetLinkeBahamutAppbindrepoResponse.Result.TcCenterPassRate"));
		result.setTenantId(_ctx.stringValue("GetLinkeBahamutAppbindrepoResponse.Result.TenantId"));
		result.setTrunkMrNeedDefectOrReq(_ctx.booleanValue("GetLinkeBahamutAppbindrepoResponse.Result.TrunkMrNeedDefectOrReq"));
		result.setUseLinkQ(_ctx.booleanValue("GetLinkeBahamutAppbindrepoResponse.Result.UseLinkQ"));
		result.setUsePullRequestInAlipay(_ctx.booleanValue("GetLinkeBahamutAppbindrepoResponse.Result.UsePullRequestInAlipay"));
		result.setUseTenantQualityRule(_ctx.booleanValue("GetLinkeBahamutAppbindrepoResponse.Result.UseTenantQualityRule"));
		result.setVcs(_ctx.stringValue("GetLinkeBahamutAppbindrepoResponse.Result.Vcs"));
		result.setZoneMode(_ctx.stringValue("GetLinkeBahamutAppbindrepoResponse.Result.ZoneMode"));

		List<String> customQualityDisplay = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutAppbindrepoResponse.Result.CustomQualityDisplay.Length"); i++) {
			customQualityDisplay.add(_ctx.stringValue("GetLinkeBahamutAppbindrepoResponse.Result.CustomQualityDisplay["+ i +"]"));
		}
		result.setCustomQualityDisplay(customQualityDisplay);

		List<String> devOwners = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutAppbindrepoResponse.Result.DevOwners.Length"); i++) {
			devOwners.add(_ctx.stringValue("GetLinkeBahamutAppbindrepoResponse.Result.DevOwners["+ i +"]"));
		}
		result.setDevOwners(devOwners);

		List<String> devOwnerUsers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutAppbindrepoResponse.Result.DevOwnerUsers.Length"); i++) {
			devOwnerUsers.add(_ctx.stringValue("GetLinkeBahamutAppbindrepoResponse.Result.DevOwnerUsers["+ i +"]"));
		}
		result.setDevOwnerUsers(devOwnerUsers);

		List<String> iterationMembers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutAppbindrepoResponse.Result.IterationMembers.Length"); i++) {
			iterationMembers.add(_ctx.stringValue("GetLinkeBahamutAppbindrepoResponse.Result.IterationMembers["+ i +"]"));
		}
		result.setIterationMembers(iterationMembers);

		List<String> members = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutAppbindrepoResponse.Result.Members.Length"); i++) {
			members.add(_ctx.stringValue("GetLinkeBahamutAppbindrepoResponse.Result.Members["+ i +"]"));
		}
		result.setMembers(members);

		List<String> memberNames = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutAppbindrepoResponse.Result.MemberNames.Length"); i++) {
			memberNames.add(_ctx.stringValue("GetLinkeBahamutAppbindrepoResponse.Result.MemberNames["+ i +"]"));
		}
		result.setMemberNames(memberNames);

		List<String> modules = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutAppbindrepoResponse.Result.Modules.Length"); i++) {
			modules.add(_ctx.stringValue("GetLinkeBahamutAppbindrepoResponse.Result.Modules["+ i +"]"));
		}
		result.setModules(modules);

		List<String> notAllowSkipComponentName = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutAppbindrepoResponse.Result.NotAllowSkipComponentName.Length"); i++) {
			notAllowSkipComponentName.add(_ctx.stringValue("GetLinkeBahamutAppbindrepoResponse.Result.NotAllowSkipComponentName["+ i +"]"));
		}
		result.setNotAllowSkipComponentName(notAllowSkipComponentName);

		List<String> pes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutAppbindrepoResponse.Result.Pes.Length"); i++) {
			pes.add(_ctx.stringValue("GetLinkeBahamutAppbindrepoResponse.Result.Pes["+ i +"]"));
		}
		result.setPes(pes);

		List<String> productOwners = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutAppbindrepoResponse.Result.ProductOwners.Length"); i++) {
			productOwners.add(_ctx.stringValue("GetLinkeBahamutAppbindrepoResponse.Result.ProductOwners["+ i +"]"));
		}
		result.setProductOwners(productOwners);

		List<String> productTestOwners = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutAppbindrepoResponse.Result.ProductTestOwners.Length"); i++) {
			productTestOwners.add(_ctx.stringValue("GetLinkeBahamutAppbindrepoResponse.Result.ProductTestOwners["+ i +"]"));
		}
		result.setProductTestOwners(productTestOwners);

		List<String> pubOwners = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutAppbindrepoResponse.Result.PubOwners.Length"); i++) {
			pubOwners.add(_ctx.stringValue("GetLinkeBahamutAppbindrepoResponse.Result.PubOwners["+ i +"]"));
		}
		result.setPubOwners(pubOwners);

		List<String> qualityRules = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutAppbindrepoResponse.Result.QualityRules.Length"); i++) {
			qualityRules.add(_ctx.stringValue("GetLinkeBahamutAppbindrepoResponse.Result.QualityRules["+ i +"]"));
		}
		result.setQualityRules(qualityRules);

		List<String> testOwners = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutAppbindrepoResponse.Result.TestOwners.Length"); i++) {
			testOwners.add(_ctx.stringValue("GetLinkeBahamutAppbindrepoResponse.Result.TestOwners["+ i +"]"));
		}
		result.setTestOwners(testOwners);
		getLinkeBahamutAppbindrepoResponse.setResult(result);
	 
	 	return getLinkeBahamutAppbindrepoResponse;
	}
}