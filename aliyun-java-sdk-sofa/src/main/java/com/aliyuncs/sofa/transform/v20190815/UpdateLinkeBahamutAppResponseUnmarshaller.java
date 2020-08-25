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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeBahamutAppResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeBahamutAppResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeBahamutAppResponseUnmarshaller {

	public static UpdateLinkeBahamutAppResponse unmarshall(UpdateLinkeBahamutAppResponse updateLinkeBahamutAppResponse, UnmarshallerContext _ctx) {
		
		updateLinkeBahamutAppResponse.setRequestId(_ctx.stringValue("UpdateLinkeBahamutAppResponse.RequestId"));
		updateLinkeBahamutAppResponse.setResultCode(_ctx.stringValue("UpdateLinkeBahamutAppResponse.ResultCode"));
		updateLinkeBahamutAppResponse.setResultMessage(_ctx.stringValue("UpdateLinkeBahamutAppResponse.ResultMessage"));
		updateLinkeBahamutAppResponse.setErrorMessage(_ctx.stringValue("UpdateLinkeBahamutAppResponse.ErrorMessage"));
		updateLinkeBahamutAppResponse.setErrorMsgParamsMap(_ctx.stringValue("UpdateLinkeBahamutAppResponse.ErrorMsgParamsMap"));
		updateLinkeBahamutAppResponse.setMessage(_ctx.stringValue("UpdateLinkeBahamutAppResponse.Message"));
		updateLinkeBahamutAppResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeBahamutAppResponse.ResponseStatusCode"));
		updateLinkeBahamutAppResponse.setSuccess(_ctx.booleanValue("UpdateLinkeBahamutAppResponse.Success"));

		Result result = new Result();
		result.setAppGroup(_ctx.stringValue("UpdateLinkeBahamutAppResponse.Result.AppGroup"));
		result.setAppTechStackName(_ctx.stringValue("UpdateLinkeBahamutAppResponse.Result.AppTechStackName"));
		result.setAppType(_ctx.stringValue("UpdateLinkeBahamutAppResponse.Result.AppType"));
		result.setAppTypeBackUp(_ctx.stringValue("UpdateLinkeBahamutAppResponse.Result.AppTypeBackUp"));
		result.setArchDomainExternalId(_ctx.stringValue("UpdateLinkeBahamutAppResponse.Result.ArchDomainExternalId"));
		result.setArchDomainMeta(_ctx.stringValue("UpdateLinkeBahamutAppResponse.Result.ArchDomainMeta"));
		result.setArchDomainName(_ctx.stringValue("UpdateLinkeBahamutAppResponse.Result.ArchDomainName"));
		result.setArchDomainSynacId(_ctx.longValue("UpdateLinkeBahamutAppResponse.Result.ArchDomainSynacId"));
		result.setAutoBetaSitDeploy(_ctx.booleanValue("UpdateLinkeBahamutAppResponse.Result.AutoBetaSitDeploy"));
		result.setBaseJarInfo(_ctx.stringValue("UpdateLinkeBahamutAppResponse.Result.BaseJarInfo"));
		result.setBetterQuality(_ctx.booleanValue("UpdateLinkeBahamutAppResponse.Result.BetterQuality"));
		result.setBlizzardRecordingAndPlaybackSmartTest(_ctx.booleanValue("UpdateLinkeBahamutAppResponse.Result.BlizzardRecordingAndPlaybackSmartTest"));
		result.setCloudDeployType(_ctx.stringValue("UpdateLinkeBahamutAppResponse.Result.CloudDeployType"));
		result.setCommonRiskPointInspection(_ctx.booleanValue("UpdateLinkeBahamutAppResponse.Result.CommonRiskPointInspection"));
		result.setContainerServiceName(_ctx.stringValue("UpdateLinkeBahamutAppResponse.Result.ContainerServiceName"));
		result.setCoverageBaseline(_ctx.stringValue("UpdateLinkeBahamutAppResponse.Result.CoverageBaseline"));
		result.setCoverageFromThirdPlatform(_ctx.booleanValue("UpdateLinkeBahamutAppResponse.Result.CoverageFromThirdPlatform"));
		result.setCreated(_ctx.longValue("UpdateLinkeBahamutAppResponse.Result.Created"));
		result.setCreateIterationNeedReq(_ctx.booleanValue("UpdateLinkeBahamutAppResponse.Result.CreateIterationNeedReq"));
		result.setCreateStageMergeTask(_ctx.booleanValue("UpdateLinkeBahamutAppResponse.Result.CreateStageMergeTask"));
		result.setCrucialApp(_ctx.booleanValue("UpdateLinkeBahamutAppResponse.Result.CrucialApp"));
		result.setCustomBuildType(_ctx.stringValue("UpdateLinkeBahamutAppResponse.Result.CustomBuildType"));
		result.setDbChangeEvaluate(_ctx.booleanValue("UpdateLinkeBahamutAppResponse.Result.DbChangeEvaluate"));
		result.setDeleted(_ctx.booleanValue("UpdateLinkeBahamutAppResponse.Result.Deleted"));
		result.setDevLang(_ctx.stringValue("UpdateLinkeBahamutAppResponse.Result.DevLang"));
		result.setDevServerDeployment(_ctx.booleanValue("UpdateLinkeBahamutAppResponse.Result.DevServerDeployment"));
		result.setDisplayName(_ctx.stringValue("UpdateLinkeBahamutAppResponse.Result.DisplayName"));
		result.setGitLabGroupName(_ctx.stringValue("UpdateLinkeBahamutAppResponse.Result.GitLabGroupName"));
		result.setGitLabHttpUrl(_ctx.stringValue("UpdateLinkeBahamutAppResponse.Result.GitLabHttpUrl"));
		result.setGitLabRepoName(_ctx.stringValue("UpdateLinkeBahamutAppResponse.Result.GitLabRepoName"));
		result.setGitLabSshUrl(_ctx.stringValue("UpdateLinkeBahamutAppResponse.Result.GitLabSshUrl"));
		result.setGreyEmergencyRelease(_ctx.booleanValue("UpdateLinkeBahamutAppResponse.Result.GreyEmergencyRelease"));
		result.setGreyRelease(_ctx.booleanValue("UpdateLinkeBahamutAppResponse.Result.GreyRelease"));
		result.setId(_ctx.stringValue("UpdateLinkeBahamutAppResponse.Result.Id"));
		result.setImage(_ctx.stringValue("UpdateLinkeBahamutAppResponse.Result.Image"));
		result.setLastModified(_ctx.longValue("UpdateLinkeBahamutAppResponse.Result.LastModified"));
		result.setLevel(_ctx.stringValue("UpdateLinkeBahamutAppResponse.Result.Level"));
		result.setLockBranch(_ctx.booleanValue("UpdateLinkeBahamutAppResponse.Result.LockBranch"));
		result.setName(_ctx.stringValue("UpdateLinkeBahamutAppResponse.Result.Name"));
		result.setNetRelease(_ctx.booleanValue("UpdateLinkeBahamutAppResponse.Result.NetRelease"));
		result.setOfflineAuthControl(_ctx.booleanValue("UpdateLinkeBahamutAppResponse.Result.OfflineAuthControl"));
		result.setOfflineZoneMode(_ctx.stringValue("UpdateLinkeBahamutAppResponse.Result.OfflineZoneMode"));
		result.setOnlineStatus(_ctx.stringValue("UpdateLinkeBahamutAppResponse.Result.OnlineStatus"));
		result.setOptionList(_ctx.stringValue("UpdateLinkeBahamutAppResponse.Result.OptionList"));
		result.setParentArchDomainExternalId(_ctx.stringValue("UpdateLinkeBahamutAppResponse.Result.ParentArchDomainExternalId"));
		result.setParentArchDomainName(_ctx.stringValue("UpdateLinkeBahamutAppResponse.Result.ParentArchDomainName"));
		result.setPriPubOwner(_ctx.stringValue("UpdateLinkeBahamutAppResponse.Result.PriPubOwner"));
		result.setReleaseDomainName(_ctx.stringValue("UpdateLinkeBahamutAppResponse.Result.ReleaseDomainName"));
		result.setReleaseType(_ctx.stringValue("UpdateLinkeBahamutAppResponse.Result.ReleaseType"));
		result.setRiskAssessNeeded(_ctx.booleanValue("UpdateLinkeBahamutAppResponse.Result.RiskAssessNeeded"));
		result.setServerDeployment(_ctx.booleanValue("UpdateLinkeBahamutAppResponse.Result.ServerDeployment"));
		result.setSitServerDeployment(_ctx.booleanValue("UpdateLinkeBahamutAppResponse.Result.SitServerDeployment"));
		result.setStableDeployMode(_ctx.stringValue("UpdateLinkeBahamutAppResponse.Result.StableDeployMode"));
		result.setStation(_ctx.stringValue("UpdateLinkeBahamutAppResponse.Result.Station"));
		result.setStatus(_ctx.stringValue("UpdateLinkeBahamutAppResponse.Result.Status"));
		result.setSynacId(_ctx.longValue("UpdateLinkeBahamutAppResponse.Result.SynacId"));
		result.setTcCenterPassRate(_ctx.booleanValue("UpdateLinkeBahamutAppResponse.Result.TcCenterPassRate"));
		result.setTenantId(_ctx.stringValue("UpdateLinkeBahamutAppResponse.Result.TenantId"));
		result.setTrunkMrNeedDefectOrReq(_ctx.booleanValue("UpdateLinkeBahamutAppResponse.Result.TrunkMrNeedDefectOrReq"));
		result.setUseLinkQ(_ctx.booleanValue("UpdateLinkeBahamutAppResponse.Result.UseLinkQ"));
		result.setUsePullRequestInAlipay(_ctx.booleanValue("UpdateLinkeBahamutAppResponse.Result.UsePullRequestInAlipay"));
		result.setUseTenantQualityRule(_ctx.booleanValue("UpdateLinkeBahamutAppResponse.Result.UseTenantQualityRule"));
		result.setVcs(_ctx.stringValue("UpdateLinkeBahamutAppResponse.Result.Vcs"));
		result.setZoneMode(_ctx.stringValue("UpdateLinkeBahamutAppResponse.Result.ZoneMode"));

		List<String> customQualityDisplay = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutAppResponse.Result.CustomQualityDisplay.Length"); i++) {
			customQualityDisplay.add(_ctx.stringValue("UpdateLinkeBahamutAppResponse.Result.CustomQualityDisplay["+ i +"]"));
		}
		result.setCustomQualityDisplay(customQualityDisplay);

		List<String> devOwners = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutAppResponse.Result.DevOwners.Length"); i++) {
			devOwners.add(_ctx.stringValue("UpdateLinkeBahamutAppResponse.Result.DevOwners["+ i +"]"));
		}
		result.setDevOwners(devOwners);

		List<String> devOwnerUsers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutAppResponse.Result.DevOwnerUsers.Length"); i++) {
			devOwnerUsers.add(_ctx.stringValue("UpdateLinkeBahamutAppResponse.Result.DevOwnerUsers["+ i +"]"));
		}
		result.setDevOwnerUsers(devOwnerUsers);

		List<String> iterationMembers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutAppResponse.Result.IterationMembers.Length"); i++) {
			iterationMembers.add(_ctx.stringValue("UpdateLinkeBahamutAppResponse.Result.IterationMembers["+ i +"]"));
		}
		result.setIterationMembers(iterationMembers);

		List<String> members = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutAppResponse.Result.Members.Length"); i++) {
			members.add(_ctx.stringValue("UpdateLinkeBahamutAppResponse.Result.Members["+ i +"]"));
		}
		result.setMembers(members);

		List<String> memberNames = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutAppResponse.Result.MemberNames.Length"); i++) {
			memberNames.add(_ctx.stringValue("UpdateLinkeBahamutAppResponse.Result.MemberNames["+ i +"]"));
		}
		result.setMemberNames(memberNames);

		List<String> modules = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutAppResponse.Result.Modules.Length"); i++) {
			modules.add(_ctx.stringValue("UpdateLinkeBahamutAppResponse.Result.Modules["+ i +"]"));
		}
		result.setModules(modules);

		List<String> notAllowSkipComponentName = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutAppResponse.Result.NotAllowSkipComponentName.Length"); i++) {
			notAllowSkipComponentName.add(_ctx.stringValue("UpdateLinkeBahamutAppResponse.Result.NotAllowSkipComponentName["+ i +"]"));
		}
		result.setNotAllowSkipComponentName(notAllowSkipComponentName);

		List<String> pes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutAppResponse.Result.Pes.Length"); i++) {
			pes.add(_ctx.stringValue("UpdateLinkeBahamutAppResponse.Result.Pes["+ i +"]"));
		}
		result.setPes(pes);

		List<String> productOwners = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutAppResponse.Result.ProductOwners.Length"); i++) {
			productOwners.add(_ctx.stringValue("UpdateLinkeBahamutAppResponse.Result.ProductOwners["+ i +"]"));
		}
		result.setProductOwners(productOwners);

		List<String> productTestOwners = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutAppResponse.Result.ProductTestOwners.Length"); i++) {
			productTestOwners.add(_ctx.stringValue("UpdateLinkeBahamutAppResponse.Result.ProductTestOwners["+ i +"]"));
		}
		result.setProductTestOwners(productTestOwners);

		List<String> pubOwners = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutAppResponse.Result.PubOwners.Length"); i++) {
			pubOwners.add(_ctx.stringValue("UpdateLinkeBahamutAppResponse.Result.PubOwners["+ i +"]"));
		}
		result.setPubOwners(pubOwners);

		List<String> qualityRules = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutAppResponse.Result.QualityRules.Length"); i++) {
			qualityRules.add(_ctx.stringValue("UpdateLinkeBahamutAppResponse.Result.QualityRules["+ i +"]"));
		}
		result.setQualityRules(qualityRules);

		List<String> testOwners = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutAppResponse.Result.TestOwners.Length"); i++) {
			testOwners.add(_ctx.stringValue("UpdateLinkeBahamutAppResponse.Result.TestOwners["+ i +"]"));
		}
		result.setTestOwners(testOwners);
		updateLinkeBahamutAppResponse.setResult(result);
	 
	 	return updateLinkeBahamutAppResponse;
	}
}