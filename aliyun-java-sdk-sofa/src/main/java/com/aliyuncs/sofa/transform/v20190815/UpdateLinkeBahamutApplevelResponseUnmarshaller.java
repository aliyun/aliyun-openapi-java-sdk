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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeBahamutApplevelResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeBahamutApplevelResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeBahamutApplevelResponseUnmarshaller {

	public static UpdateLinkeBahamutApplevelResponse unmarshall(UpdateLinkeBahamutApplevelResponse updateLinkeBahamutApplevelResponse, UnmarshallerContext _ctx) {
		
		updateLinkeBahamutApplevelResponse.setRequestId(_ctx.stringValue("UpdateLinkeBahamutApplevelResponse.RequestId"));
		updateLinkeBahamutApplevelResponse.setResultCode(_ctx.stringValue("UpdateLinkeBahamutApplevelResponse.ResultCode"));
		updateLinkeBahamutApplevelResponse.setResultMessage(_ctx.stringValue("UpdateLinkeBahamutApplevelResponse.ResultMessage"));
		updateLinkeBahamutApplevelResponse.setErrorMessage(_ctx.stringValue("UpdateLinkeBahamutApplevelResponse.ErrorMessage"));
		updateLinkeBahamutApplevelResponse.setErrorMsgParamsMap(_ctx.stringValue("UpdateLinkeBahamutApplevelResponse.ErrorMsgParamsMap"));
		updateLinkeBahamutApplevelResponse.setMessage(_ctx.stringValue("UpdateLinkeBahamutApplevelResponse.Message"));
		updateLinkeBahamutApplevelResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeBahamutApplevelResponse.ResponseStatusCode"));
		updateLinkeBahamutApplevelResponse.setSuccess(_ctx.booleanValue("UpdateLinkeBahamutApplevelResponse.Success"));

		Result result = new Result();
		result.setAppGroup(_ctx.stringValue("UpdateLinkeBahamutApplevelResponse.Result.AppGroup"));
		result.setAppTechStackName(_ctx.stringValue("UpdateLinkeBahamutApplevelResponse.Result.AppTechStackName"));
		result.setAppType(_ctx.stringValue("UpdateLinkeBahamutApplevelResponse.Result.AppType"));
		result.setAppTypeBackUp(_ctx.stringValue("UpdateLinkeBahamutApplevelResponse.Result.AppTypeBackUp"));
		result.setArchDomainExternalId(_ctx.stringValue("UpdateLinkeBahamutApplevelResponse.Result.ArchDomainExternalId"));
		result.setArchDomainMeta(_ctx.stringValue("UpdateLinkeBahamutApplevelResponse.Result.ArchDomainMeta"));
		result.setArchDomainName(_ctx.stringValue("UpdateLinkeBahamutApplevelResponse.Result.ArchDomainName"));
		result.setArchDomainSynacId(_ctx.longValue("UpdateLinkeBahamutApplevelResponse.Result.ArchDomainSynacId"));
		result.setAutoBetaSitDeploy(_ctx.booleanValue("UpdateLinkeBahamutApplevelResponse.Result.AutoBetaSitDeploy"));
		result.setBaseJarInfo(_ctx.stringValue("UpdateLinkeBahamutApplevelResponse.Result.BaseJarInfo"));
		result.setBetterQuality(_ctx.booleanValue("UpdateLinkeBahamutApplevelResponse.Result.BetterQuality"));
		result.setBlizzardRecordingAndPlaybackSmartTest(_ctx.booleanValue("UpdateLinkeBahamutApplevelResponse.Result.BlizzardRecordingAndPlaybackSmartTest"));
		result.setCloudDeployType(_ctx.stringValue("UpdateLinkeBahamutApplevelResponse.Result.CloudDeployType"));
		result.setCommonRiskPointInspection(_ctx.booleanValue("UpdateLinkeBahamutApplevelResponse.Result.CommonRiskPointInspection"));
		result.setContainerServiceName(_ctx.stringValue("UpdateLinkeBahamutApplevelResponse.Result.ContainerServiceName"));
		result.setCoverageBaseline(_ctx.stringValue("UpdateLinkeBahamutApplevelResponse.Result.CoverageBaseline"));
		result.setCoverageFromThirdPlatform(_ctx.booleanValue("UpdateLinkeBahamutApplevelResponse.Result.CoverageFromThirdPlatform"));
		result.setCreated(_ctx.longValue("UpdateLinkeBahamutApplevelResponse.Result.Created"));
		result.setCreateIterationNeedReq(_ctx.booleanValue("UpdateLinkeBahamutApplevelResponse.Result.CreateIterationNeedReq"));
		result.setCreateStageMergeTask(_ctx.booleanValue("UpdateLinkeBahamutApplevelResponse.Result.CreateStageMergeTask"));
		result.setCrucialApp(_ctx.booleanValue("UpdateLinkeBahamutApplevelResponse.Result.CrucialApp"));
		result.setCustomBuildType(_ctx.stringValue("UpdateLinkeBahamutApplevelResponse.Result.CustomBuildType"));
		result.setDbChangeEvaluate(_ctx.booleanValue("UpdateLinkeBahamutApplevelResponse.Result.DbChangeEvaluate"));
		result.setDeleted(_ctx.booleanValue("UpdateLinkeBahamutApplevelResponse.Result.Deleted"));
		result.setDevLang(_ctx.stringValue("UpdateLinkeBahamutApplevelResponse.Result.DevLang"));
		result.setDevServerDeployment(_ctx.booleanValue("UpdateLinkeBahamutApplevelResponse.Result.DevServerDeployment"));
		result.setDisplayName(_ctx.stringValue("UpdateLinkeBahamutApplevelResponse.Result.DisplayName"));
		result.setGitLabGroupName(_ctx.stringValue("UpdateLinkeBahamutApplevelResponse.Result.GitLabGroupName"));
		result.setGitLabHttpUrl(_ctx.stringValue("UpdateLinkeBahamutApplevelResponse.Result.GitLabHttpUrl"));
		result.setGitLabRepoName(_ctx.stringValue("UpdateLinkeBahamutApplevelResponse.Result.GitLabRepoName"));
		result.setGitLabSshUrl(_ctx.stringValue("UpdateLinkeBahamutApplevelResponse.Result.GitLabSshUrl"));
		result.setGreyEmergencyRelease(_ctx.booleanValue("UpdateLinkeBahamutApplevelResponse.Result.GreyEmergencyRelease"));
		result.setGreyRelease(_ctx.booleanValue("UpdateLinkeBahamutApplevelResponse.Result.GreyRelease"));
		result.setId(_ctx.stringValue("UpdateLinkeBahamutApplevelResponse.Result.Id"));
		result.setImage(_ctx.stringValue("UpdateLinkeBahamutApplevelResponse.Result.Image"));
		result.setLastModified(_ctx.longValue("UpdateLinkeBahamutApplevelResponse.Result.LastModified"));
		result.setLevel(_ctx.stringValue("UpdateLinkeBahamutApplevelResponse.Result.Level"));
		result.setLockBranch(_ctx.booleanValue("UpdateLinkeBahamutApplevelResponse.Result.LockBranch"));
		result.setName(_ctx.stringValue("UpdateLinkeBahamutApplevelResponse.Result.Name"));
		result.setNetRelease(_ctx.booleanValue("UpdateLinkeBahamutApplevelResponse.Result.NetRelease"));
		result.setOfflineAuthControl(_ctx.booleanValue("UpdateLinkeBahamutApplevelResponse.Result.OfflineAuthControl"));
		result.setOfflineZoneMode(_ctx.stringValue("UpdateLinkeBahamutApplevelResponse.Result.OfflineZoneMode"));
		result.setOnlineStatus(_ctx.stringValue("UpdateLinkeBahamutApplevelResponse.Result.OnlineStatus"));
		result.setOptionList(_ctx.stringValue("UpdateLinkeBahamutApplevelResponse.Result.OptionList"));
		result.setParentArchDomainExternalId(_ctx.stringValue("UpdateLinkeBahamutApplevelResponse.Result.ParentArchDomainExternalId"));
		result.setParentArchDomainName(_ctx.stringValue("UpdateLinkeBahamutApplevelResponse.Result.ParentArchDomainName"));
		result.setPriPubOwner(_ctx.stringValue("UpdateLinkeBahamutApplevelResponse.Result.PriPubOwner"));
		result.setReleaseDomainName(_ctx.stringValue("UpdateLinkeBahamutApplevelResponse.Result.ReleaseDomainName"));
		result.setReleaseType(_ctx.stringValue("UpdateLinkeBahamutApplevelResponse.Result.ReleaseType"));
		result.setRiskAssessNeeded(_ctx.booleanValue("UpdateLinkeBahamutApplevelResponse.Result.RiskAssessNeeded"));
		result.setServerDeployment(_ctx.booleanValue("UpdateLinkeBahamutApplevelResponse.Result.ServerDeployment"));
		result.setSitServerDeployment(_ctx.booleanValue("UpdateLinkeBahamutApplevelResponse.Result.SitServerDeployment"));
		result.setStableDeployMode(_ctx.stringValue("UpdateLinkeBahamutApplevelResponse.Result.StableDeployMode"));
		result.setStation(_ctx.stringValue("UpdateLinkeBahamutApplevelResponse.Result.Station"));
		result.setStatus(_ctx.stringValue("UpdateLinkeBahamutApplevelResponse.Result.Status"));
		result.setSynacId(_ctx.longValue("UpdateLinkeBahamutApplevelResponse.Result.SynacId"));
		result.setTcCenterPassRate(_ctx.booleanValue("UpdateLinkeBahamutApplevelResponse.Result.TcCenterPassRate"));
		result.setTenantId(_ctx.stringValue("UpdateLinkeBahamutApplevelResponse.Result.TenantId"));
		result.setTrunkMrNeedDefectOrReq(_ctx.booleanValue("UpdateLinkeBahamutApplevelResponse.Result.TrunkMrNeedDefectOrReq"));
		result.setUseLinkQ(_ctx.booleanValue("UpdateLinkeBahamutApplevelResponse.Result.UseLinkQ"));
		result.setUsePullRequestInAlipay(_ctx.booleanValue("UpdateLinkeBahamutApplevelResponse.Result.UsePullRequestInAlipay"));
		result.setUseTenantQualityRule(_ctx.booleanValue("UpdateLinkeBahamutApplevelResponse.Result.UseTenantQualityRule"));
		result.setVcs(_ctx.stringValue("UpdateLinkeBahamutApplevelResponse.Result.Vcs"));
		result.setZoneMode(_ctx.stringValue("UpdateLinkeBahamutApplevelResponse.Result.ZoneMode"));

		List<String> customQualityDisplay = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutApplevelResponse.Result.CustomQualityDisplay.Length"); i++) {
			customQualityDisplay.add(_ctx.stringValue("UpdateLinkeBahamutApplevelResponse.Result.CustomQualityDisplay["+ i +"]"));
		}
		result.setCustomQualityDisplay(customQualityDisplay);

		List<String> devOwners = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutApplevelResponse.Result.DevOwners.Length"); i++) {
			devOwners.add(_ctx.stringValue("UpdateLinkeBahamutApplevelResponse.Result.DevOwners["+ i +"]"));
		}
		result.setDevOwners(devOwners);

		List<String> devOwnerUsers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutApplevelResponse.Result.DevOwnerUsers.Length"); i++) {
			devOwnerUsers.add(_ctx.stringValue("UpdateLinkeBahamutApplevelResponse.Result.DevOwnerUsers["+ i +"]"));
		}
		result.setDevOwnerUsers(devOwnerUsers);

		List<String> iterationMembers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutApplevelResponse.Result.IterationMembers.Length"); i++) {
			iterationMembers.add(_ctx.stringValue("UpdateLinkeBahamutApplevelResponse.Result.IterationMembers["+ i +"]"));
		}
		result.setIterationMembers(iterationMembers);

		List<String> members = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutApplevelResponse.Result.Members.Length"); i++) {
			members.add(_ctx.stringValue("UpdateLinkeBahamutApplevelResponse.Result.Members["+ i +"]"));
		}
		result.setMembers(members);

		List<String> memberNames = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutApplevelResponse.Result.MemberNames.Length"); i++) {
			memberNames.add(_ctx.stringValue("UpdateLinkeBahamutApplevelResponse.Result.MemberNames["+ i +"]"));
		}
		result.setMemberNames(memberNames);

		List<String> modules = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutApplevelResponse.Result.Modules.Length"); i++) {
			modules.add(_ctx.stringValue("UpdateLinkeBahamutApplevelResponse.Result.Modules["+ i +"]"));
		}
		result.setModules(modules);

		List<String> notAllowSkipComponentName = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutApplevelResponse.Result.NotAllowSkipComponentName.Length"); i++) {
			notAllowSkipComponentName.add(_ctx.stringValue("UpdateLinkeBahamutApplevelResponse.Result.NotAllowSkipComponentName["+ i +"]"));
		}
		result.setNotAllowSkipComponentName(notAllowSkipComponentName);

		List<String> pes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutApplevelResponse.Result.Pes.Length"); i++) {
			pes.add(_ctx.stringValue("UpdateLinkeBahamutApplevelResponse.Result.Pes["+ i +"]"));
		}
		result.setPes(pes);

		List<String> productOwners = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutApplevelResponse.Result.ProductOwners.Length"); i++) {
			productOwners.add(_ctx.stringValue("UpdateLinkeBahamutApplevelResponse.Result.ProductOwners["+ i +"]"));
		}
		result.setProductOwners(productOwners);

		List<String> productTestOwners = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutApplevelResponse.Result.ProductTestOwners.Length"); i++) {
			productTestOwners.add(_ctx.stringValue("UpdateLinkeBahamutApplevelResponse.Result.ProductTestOwners["+ i +"]"));
		}
		result.setProductTestOwners(productTestOwners);

		List<String> pubOwners = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutApplevelResponse.Result.PubOwners.Length"); i++) {
			pubOwners.add(_ctx.stringValue("UpdateLinkeBahamutApplevelResponse.Result.PubOwners["+ i +"]"));
		}
		result.setPubOwners(pubOwners);

		List<String> qualityRules = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutApplevelResponse.Result.QualityRules.Length"); i++) {
			qualityRules.add(_ctx.stringValue("UpdateLinkeBahamutApplevelResponse.Result.QualityRules["+ i +"]"));
		}
		result.setQualityRules(qualityRules);

		List<String> testOwners = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutApplevelResponse.Result.TestOwners.Length"); i++) {
			testOwners.add(_ctx.stringValue("UpdateLinkeBahamutApplevelResponse.Result.TestOwners["+ i +"]"));
		}
		result.setTestOwners(testOwners);
		updateLinkeBahamutApplevelResponse.setResult(result);
	 
	 	return updateLinkeBahamutApplevelResponse;
	}
}