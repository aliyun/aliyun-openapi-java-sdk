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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeBahamutUpdatequalityrulesResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeBahamutUpdatequalityrulesResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeBahamutUpdatequalityrulesResponseUnmarshaller {

	public static UpdateLinkeBahamutUpdatequalityrulesResponse unmarshall(UpdateLinkeBahamutUpdatequalityrulesResponse updateLinkeBahamutUpdatequalityrulesResponse, UnmarshallerContext _ctx) {
		
		updateLinkeBahamutUpdatequalityrulesResponse.setRequestId(_ctx.stringValue("UpdateLinkeBahamutUpdatequalityrulesResponse.RequestId"));
		updateLinkeBahamutUpdatequalityrulesResponse.setResultCode(_ctx.stringValue("UpdateLinkeBahamutUpdatequalityrulesResponse.ResultCode"));
		updateLinkeBahamutUpdatequalityrulesResponse.setResultMessage(_ctx.stringValue("UpdateLinkeBahamutUpdatequalityrulesResponse.ResultMessage"));
		updateLinkeBahamutUpdatequalityrulesResponse.setErrorMessage(_ctx.stringValue("UpdateLinkeBahamutUpdatequalityrulesResponse.ErrorMessage"));
		updateLinkeBahamutUpdatequalityrulesResponse.setErrorMsgParamsMap(_ctx.stringValue("UpdateLinkeBahamutUpdatequalityrulesResponse.ErrorMsgParamsMap"));
		updateLinkeBahamutUpdatequalityrulesResponse.setMessage(_ctx.stringValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Message"));
		updateLinkeBahamutUpdatequalityrulesResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeBahamutUpdatequalityrulesResponse.ResponseStatusCode"));
		updateLinkeBahamutUpdatequalityrulesResponse.setSuccess(_ctx.booleanValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Success"));

		Result result = new Result();
		result.setAppGroup(_ctx.stringValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.AppGroup"));
		result.setAppTechStackName(_ctx.stringValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.AppTechStackName"));
		result.setAppType(_ctx.stringValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.AppType"));
		result.setAppTypeBackUp(_ctx.stringValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.AppTypeBackUp"));
		result.setArchDomainExternalId(_ctx.stringValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.ArchDomainExternalId"));
		result.setArchDomainMeta(_ctx.stringValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.ArchDomainMeta"));
		result.setArchDomainName(_ctx.stringValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.ArchDomainName"));
		result.setArchDomainSynacId(_ctx.longValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.ArchDomainSynacId"));
		result.setAutoBetaSitDeploy(_ctx.booleanValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.AutoBetaSitDeploy"));
		result.setBaseJarInfo(_ctx.stringValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.BaseJarInfo"));
		result.setBetterQuality(_ctx.booleanValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.BetterQuality"));
		result.setBlizzardRecordingAndPlaybackSmartTest(_ctx.booleanValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.BlizzardRecordingAndPlaybackSmartTest"));
		result.setCloudDeployType(_ctx.stringValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.CloudDeployType"));
		result.setCommonRiskPointInspection(_ctx.booleanValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.CommonRiskPointInspection"));
		result.setContainerServiceName(_ctx.stringValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.ContainerServiceName"));
		result.setCoverageBaseline(_ctx.stringValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.CoverageBaseline"));
		result.setCoverageFromThirdPlatform(_ctx.booleanValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.CoverageFromThirdPlatform"));
		result.setCreated(_ctx.longValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.Created"));
		result.setCreateIterationNeedReq(_ctx.booleanValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.CreateIterationNeedReq"));
		result.setCreateStageMergeTask(_ctx.booleanValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.CreateStageMergeTask"));
		result.setCrucialApp(_ctx.booleanValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.CrucialApp"));
		result.setCustomBuildType(_ctx.stringValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.CustomBuildType"));
		result.setDbChangeEvaluate(_ctx.booleanValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.DbChangeEvaluate"));
		result.setDeleted(_ctx.booleanValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.Deleted"));
		result.setDevLang(_ctx.stringValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.DevLang"));
		result.setDevServerDeployment(_ctx.booleanValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.DevServerDeployment"));
		result.setDisplayName(_ctx.stringValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.DisplayName"));
		result.setGitLabGroupName(_ctx.stringValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.GitLabGroupName"));
		result.setGitLabHttpUrl(_ctx.stringValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.GitLabHttpUrl"));
		result.setGitLabRepoName(_ctx.stringValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.GitLabRepoName"));
		result.setGitLabSshUrl(_ctx.stringValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.GitLabSshUrl"));
		result.setGreyEmergencyRelease(_ctx.booleanValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.GreyEmergencyRelease"));
		result.setGreyRelease(_ctx.booleanValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.GreyRelease"));
		result.setId(_ctx.stringValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.Id"));
		result.setImage(_ctx.stringValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.Image"));
		result.setLastModified(_ctx.longValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.LastModified"));
		result.setLevel(_ctx.stringValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.Level"));
		result.setLockBranch(_ctx.booleanValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.LockBranch"));
		result.setName(_ctx.stringValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.Name"));
		result.setNetRelease(_ctx.booleanValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.NetRelease"));
		result.setOfflineAuthControl(_ctx.booleanValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.OfflineAuthControl"));
		result.setOfflineZoneMode(_ctx.stringValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.OfflineZoneMode"));
		result.setOnlineStatus(_ctx.stringValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.OnlineStatus"));
		result.setOptionList(_ctx.stringValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.OptionList"));
		result.setParentArchDomainExternalId(_ctx.stringValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.ParentArchDomainExternalId"));
		result.setParentArchDomainName(_ctx.stringValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.ParentArchDomainName"));
		result.setPriPubOwner(_ctx.stringValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.PriPubOwner"));
		result.setReleaseDomainName(_ctx.stringValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.ReleaseDomainName"));
		result.setReleaseType(_ctx.stringValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.ReleaseType"));
		result.setRiskAssessNeeded(_ctx.booleanValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.RiskAssessNeeded"));
		result.setServerDeployment(_ctx.booleanValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.ServerDeployment"));
		result.setSitServerDeployment(_ctx.booleanValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.SitServerDeployment"));
		result.setStableDeployMode(_ctx.stringValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.StableDeployMode"));
		result.setStation(_ctx.stringValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.Station"));
		result.setStatus(_ctx.stringValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.Status"));
		result.setSynacId(_ctx.longValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.SynacId"));
		result.setTcCenterPassRate(_ctx.booleanValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.TcCenterPassRate"));
		result.setTenantId(_ctx.stringValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.TenantId"));
		result.setTrunkMrNeedDefectOrReq(_ctx.booleanValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.TrunkMrNeedDefectOrReq"));
		result.setUseLinkQ(_ctx.booleanValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.UseLinkQ"));
		result.setUsePullRequestInAlipay(_ctx.booleanValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.UsePullRequestInAlipay"));
		result.setUseTenantQualityRule(_ctx.booleanValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.UseTenantQualityRule"));
		result.setVcs(_ctx.stringValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.Vcs"));
		result.setZoneMode(_ctx.stringValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.ZoneMode"));

		List<String> customQualityDisplay = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.CustomQualityDisplay.Length"); i++) {
			customQualityDisplay.add(_ctx.stringValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.CustomQualityDisplay["+ i +"]"));
		}
		result.setCustomQualityDisplay(customQualityDisplay);

		List<String> devOwners = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.DevOwners.Length"); i++) {
			devOwners.add(_ctx.stringValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.DevOwners["+ i +"]"));
		}
		result.setDevOwners(devOwners);

		List<String> devOwnerUsers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.DevOwnerUsers.Length"); i++) {
			devOwnerUsers.add(_ctx.stringValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.DevOwnerUsers["+ i +"]"));
		}
		result.setDevOwnerUsers(devOwnerUsers);

		List<String> iterationMembers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.IterationMembers.Length"); i++) {
			iterationMembers.add(_ctx.stringValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.IterationMembers["+ i +"]"));
		}
		result.setIterationMembers(iterationMembers);

		List<String> members = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.Members.Length"); i++) {
			members.add(_ctx.stringValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.Members["+ i +"]"));
		}
		result.setMembers(members);

		List<String> memberNames = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.MemberNames.Length"); i++) {
			memberNames.add(_ctx.stringValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.MemberNames["+ i +"]"));
		}
		result.setMemberNames(memberNames);

		List<String> modules = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.Modules.Length"); i++) {
			modules.add(_ctx.stringValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.Modules["+ i +"]"));
		}
		result.setModules(modules);

		List<String> notAllowSkipComponentName = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.NotAllowSkipComponentName.Length"); i++) {
			notAllowSkipComponentName.add(_ctx.stringValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.NotAllowSkipComponentName["+ i +"]"));
		}
		result.setNotAllowSkipComponentName(notAllowSkipComponentName);

		List<String> pes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.Pes.Length"); i++) {
			pes.add(_ctx.stringValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.Pes["+ i +"]"));
		}
		result.setPes(pes);

		List<String> productOwners = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.ProductOwners.Length"); i++) {
			productOwners.add(_ctx.stringValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.ProductOwners["+ i +"]"));
		}
		result.setProductOwners(productOwners);

		List<String> productTestOwners = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.ProductTestOwners.Length"); i++) {
			productTestOwners.add(_ctx.stringValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.ProductTestOwners["+ i +"]"));
		}
		result.setProductTestOwners(productTestOwners);

		List<String> pubOwners = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.PubOwners.Length"); i++) {
			pubOwners.add(_ctx.stringValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.PubOwners["+ i +"]"));
		}
		result.setPubOwners(pubOwners);

		List<String> qualityRules = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.QualityRules.Length"); i++) {
			qualityRules.add(_ctx.stringValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.QualityRules["+ i +"]"));
		}
		result.setQualityRules(qualityRules);

		List<String> testOwners = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.TestOwners.Length"); i++) {
			testOwners.add(_ctx.stringValue("UpdateLinkeBahamutUpdatequalityrulesResponse.Result.TestOwners["+ i +"]"));
		}
		result.setTestOwners(testOwners);
		updateLinkeBahamutUpdatequalityrulesResponse.setResult(result);
	 
	 	return updateLinkeBahamutUpdatequalityrulesResponse;
	}
}