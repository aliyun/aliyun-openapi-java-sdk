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

import com.aliyuncs.sofa.model.v20190815.CreateLinkeBahamutAppbindrepoResponse;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeBahamutAppbindrepoResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeBahamutAppbindrepoResponseUnmarshaller {

	public static CreateLinkeBahamutAppbindrepoResponse unmarshall(CreateLinkeBahamutAppbindrepoResponse createLinkeBahamutAppbindrepoResponse, UnmarshallerContext _ctx) {
		
		createLinkeBahamutAppbindrepoResponse.setRequestId(_ctx.stringValue("CreateLinkeBahamutAppbindrepoResponse.RequestId"));
		createLinkeBahamutAppbindrepoResponse.setResultCode(_ctx.stringValue("CreateLinkeBahamutAppbindrepoResponse.ResultCode"));
		createLinkeBahamutAppbindrepoResponse.setResultMessage(_ctx.stringValue("CreateLinkeBahamutAppbindrepoResponse.ResultMessage"));
		createLinkeBahamutAppbindrepoResponse.setErrorMessage(_ctx.stringValue("CreateLinkeBahamutAppbindrepoResponse.ErrorMessage"));
		createLinkeBahamutAppbindrepoResponse.setErrorMsgParamsMap(_ctx.stringValue("CreateLinkeBahamutAppbindrepoResponse.ErrorMsgParamsMap"));
		createLinkeBahamutAppbindrepoResponse.setMessage(_ctx.stringValue("CreateLinkeBahamutAppbindrepoResponse.Message"));
		createLinkeBahamutAppbindrepoResponse.setResponseStatusCode(_ctx.longValue("CreateLinkeBahamutAppbindrepoResponse.ResponseStatusCode"));
		createLinkeBahamutAppbindrepoResponse.setSuccess(_ctx.booleanValue("CreateLinkeBahamutAppbindrepoResponse.Success"));

		Result result = new Result();
		result.setAppGroup(_ctx.stringValue("CreateLinkeBahamutAppbindrepoResponse.Result.AppGroup"));
		result.setAppTechStackName(_ctx.stringValue("CreateLinkeBahamutAppbindrepoResponse.Result.AppTechStackName"));
		result.setAppType(_ctx.stringValue("CreateLinkeBahamutAppbindrepoResponse.Result.AppType"));
		result.setAppTypeBackUp(_ctx.stringValue("CreateLinkeBahamutAppbindrepoResponse.Result.AppTypeBackUp"));
		result.setArchDomainExternalId(_ctx.stringValue("CreateLinkeBahamutAppbindrepoResponse.Result.ArchDomainExternalId"));
		result.setArchDomainMeta(_ctx.stringValue("CreateLinkeBahamutAppbindrepoResponse.Result.ArchDomainMeta"));
		result.setArchDomainName(_ctx.stringValue("CreateLinkeBahamutAppbindrepoResponse.Result.ArchDomainName"));
		result.setArchDomainSynacId(_ctx.longValue("CreateLinkeBahamutAppbindrepoResponse.Result.ArchDomainSynacId"));
		result.setAutoBetaSitDeploy(_ctx.booleanValue("CreateLinkeBahamutAppbindrepoResponse.Result.AutoBetaSitDeploy"));
		result.setBaseJarInfo(_ctx.stringValue("CreateLinkeBahamutAppbindrepoResponse.Result.BaseJarInfo"));
		result.setBetterQuality(_ctx.booleanValue("CreateLinkeBahamutAppbindrepoResponse.Result.BetterQuality"));
		result.setBlizzardRecordingAndPlaybackSmartTest(_ctx.booleanValue("CreateLinkeBahamutAppbindrepoResponse.Result.BlizzardRecordingAndPlaybackSmartTest"));
		result.setCloudDeployType(_ctx.stringValue("CreateLinkeBahamutAppbindrepoResponse.Result.CloudDeployType"));
		result.setCommonRiskPointInspection(_ctx.booleanValue("CreateLinkeBahamutAppbindrepoResponse.Result.CommonRiskPointInspection"));
		result.setContainerServiceName(_ctx.stringValue("CreateLinkeBahamutAppbindrepoResponse.Result.ContainerServiceName"));
		result.setCoverageBaseline(_ctx.stringValue("CreateLinkeBahamutAppbindrepoResponse.Result.CoverageBaseline"));
		result.setCoverageFromThirdPlatform(_ctx.booleanValue("CreateLinkeBahamutAppbindrepoResponse.Result.CoverageFromThirdPlatform"));
		result.setCreated(_ctx.longValue("CreateLinkeBahamutAppbindrepoResponse.Result.Created"));
		result.setCreateIterationNeedReq(_ctx.booleanValue("CreateLinkeBahamutAppbindrepoResponse.Result.CreateIterationNeedReq"));
		result.setCreateStageMergeTask(_ctx.booleanValue("CreateLinkeBahamutAppbindrepoResponse.Result.CreateStageMergeTask"));
		result.setCrucialApp(_ctx.booleanValue("CreateLinkeBahamutAppbindrepoResponse.Result.CrucialApp"));
		result.setCustomBuildType(_ctx.stringValue("CreateLinkeBahamutAppbindrepoResponse.Result.CustomBuildType"));
		result.setDbChangeEvaluate(_ctx.booleanValue("CreateLinkeBahamutAppbindrepoResponse.Result.DbChangeEvaluate"));
		result.setDeleted(_ctx.booleanValue("CreateLinkeBahamutAppbindrepoResponse.Result.Deleted"));
		result.setDevLang(_ctx.stringValue("CreateLinkeBahamutAppbindrepoResponse.Result.DevLang"));
		result.setDevServerDeployment(_ctx.booleanValue("CreateLinkeBahamutAppbindrepoResponse.Result.DevServerDeployment"));
		result.setDisplayName(_ctx.stringValue("CreateLinkeBahamutAppbindrepoResponse.Result.DisplayName"));
		result.setGitLabGroupName(_ctx.stringValue("CreateLinkeBahamutAppbindrepoResponse.Result.GitLabGroupName"));
		result.setGitLabHttpUrl(_ctx.stringValue("CreateLinkeBahamutAppbindrepoResponse.Result.GitLabHttpUrl"));
		result.setGitLabRepoName(_ctx.stringValue("CreateLinkeBahamutAppbindrepoResponse.Result.GitLabRepoName"));
		result.setGitLabSshUrl(_ctx.stringValue("CreateLinkeBahamutAppbindrepoResponse.Result.GitLabSshUrl"));
		result.setGreyEmergencyRelease(_ctx.booleanValue("CreateLinkeBahamutAppbindrepoResponse.Result.GreyEmergencyRelease"));
		result.setGreyRelease(_ctx.booleanValue("CreateLinkeBahamutAppbindrepoResponse.Result.GreyRelease"));
		result.setId(_ctx.stringValue("CreateLinkeBahamutAppbindrepoResponse.Result.Id"));
		result.setImage(_ctx.stringValue("CreateLinkeBahamutAppbindrepoResponse.Result.Image"));
		result.setLastModified(_ctx.longValue("CreateLinkeBahamutAppbindrepoResponse.Result.LastModified"));
		result.setLevel(_ctx.stringValue("CreateLinkeBahamutAppbindrepoResponse.Result.Level"));
		result.setLockBranch(_ctx.booleanValue("CreateLinkeBahamutAppbindrepoResponse.Result.LockBranch"));
		result.setName(_ctx.stringValue("CreateLinkeBahamutAppbindrepoResponse.Result.Name"));
		result.setNetRelease(_ctx.booleanValue("CreateLinkeBahamutAppbindrepoResponse.Result.NetRelease"));
		result.setOfflineAuthControl(_ctx.booleanValue("CreateLinkeBahamutAppbindrepoResponse.Result.OfflineAuthControl"));
		result.setOfflineZoneMode(_ctx.stringValue("CreateLinkeBahamutAppbindrepoResponse.Result.OfflineZoneMode"));
		result.setOnlineStatus(_ctx.stringValue("CreateLinkeBahamutAppbindrepoResponse.Result.OnlineStatus"));
		result.setOptionList(_ctx.stringValue("CreateLinkeBahamutAppbindrepoResponse.Result.OptionList"));
		result.setParentArchDomainExternalId(_ctx.stringValue("CreateLinkeBahamutAppbindrepoResponse.Result.ParentArchDomainExternalId"));
		result.setParentArchDomainName(_ctx.stringValue("CreateLinkeBahamutAppbindrepoResponse.Result.ParentArchDomainName"));
		result.setPriPubOwner(_ctx.stringValue("CreateLinkeBahamutAppbindrepoResponse.Result.PriPubOwner"));
		result.setReleaseDomainName(_ctx.stringValue("CreateLinkeBahamutAppbindrepoResponse.Result.ReleaseDomainName"));
		result.setReleaseType(_ctx.stringValue("CreateLinkeBahamutAppbindrepoResponse.Result.ReleaseType"));
		result.setRiskAssessNeeded(_ctx.booleanValue("CreateLinkeBahamutAppbindrepoResponse.Result.RiskAssessNeeded"));
		result.setServerDeployment(_ctx.booleanValue("CreateLinkeBahamutAppbindrepoResponse.Result.ServerDeployment"));
		result.setSitServerDeployment(_ctx.booleanValue("CreateLinkeBahamutAppbindrepoResponse.Result.SitServerDeployment"));
		result.setStableDeployMode(_ctx.stringValue("CreateLinkeBahamutAppbindrepoResponse.Result.StableDeployMode"));
		result.setStation(_ctx.stringValue("CreateLinkeBahamutAppbindrepoResponse.Result.Station"));
		result.setStatus(_ctx.stringValue("CreateLinkeBahamutAppbindrepoResponse.Result.Status"));
		result.setSynacId(_ctx.longValue("CreateLinkeBahamutAppbindrepoResponse.Result.SynacId"));
		result.setTcCenterPassRate(_ctx.booleanValue("CreateLinkeBahamutAppbindrepoResponse.Result.TcCenterPassRate"));
		result.setTenantId(_ctx.stringValue("CreateLinkeBahamutAppbindrepoResponse.Result.TenantId"));
		result.setTrunkMrNeedDefectOrReq(_ctx.booleanValue("CreateLinkeBahamutAppbindrepoResponse.Result.TrunkMrNeedDefectOrReq"));
		result.setUseLinkQ(_ctx.booleanValue("CreateLinkeBahamutAppbindrepoResponse.Result.UseLinkQ"));
		result.setUsePullRequestInAlipay(_ctx.booleanValue("CreateLinkeBahamutAppbindrepoResponse.Result.UsePullRequestInAlipay"));
		result.setUseTenantQualityRule(_ctx.booleanValue("CreateLinkeBahamutAppbindrepoResponse.Result.UseTenantQualityRule"));
		result.setVcs(_ctx.stringValue("CreateLinkeBahamutAppbindrepoResponse.Result.Vcs"));
		result.setZoneMode(_ctx.stringValue("CreateLinkeBahamutAppbindrepoResponse.Result.ZoneMode"));

		List<String> customQualityDisplay = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeBahamutAppbindrepoResponse.Result.CustomQualityDisplay.Length"); i++) {
			customQualityDisplay.add(_ctx.stringValue("CreateLinkeBahamutAppbindrepoResponse.Result.CustomQualityDisplay["+ i +"]"));
		}
		result.setCustomQualityDisplay(customQualityDisplay);

		List<String> devOwners = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeBahamutAppbindrepoResponse.Result.DevOwners.Length"); i++) {
			devOwners.add(_ctx.stringValue("CreateLinkeBahamutAppbindrepoResponse.Result.DevOwners["+ i +"]"));
		}
		result.setDevOwners(devOwners);

		List<String> devOwnerUsers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeBahamutAppbindrepoResponse.Result.DevOwnerUsers.Length"); i++) {
			devOwnerUsers.add(_ctx.stringValue("CreateLinkeBahamutAppbindrepoResponse.Result.DevOwnerUsers["+ i +"]"));
		}
		result.setDevOwnerUsers(devOwnerUsers);

		List<String> iterationMembers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeBahamutAppbindrepoResponse.Result.IterationMembers.Length"); i++) {
			iterationMembers.add(_ctx.stringValue("CreateLinkeBahamutAppbindrepoResponse.Result.IterationMembers["+ i +"]"));
		}
		result.setIterationMembers(iterationMembers);

		List<String> members = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeBahamutAppbindrepoResponse.Result.Members.Length"); i++) {
			members.add(_ctx.stringValue("CreateLinkeBahamutAppbindrepoResponse.Result.Members["+ i +"]"));
		}
		result.setMembers(members);

		List<String> memberNames = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeBahamutAppbindrepoResponse.Result.MemberNames.Length"); i++) {
			memberNames.add(_ctx.stringValue("CreateLinkeBahamutAppbindrepoResponse.Result.MemberNames["+ i +"]"));
		}
		result.setMemberNames(memberNames);

		List<String> modules = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeBahamutAppbindrepoResponse.Result.Modules.Length"); i++) {
			modules.add(_ctx.stringValue("CreateLinkeBahamutAppbindrepoResponse.Result.Modules["+ i +"]"));
		}
		result.setModules(modules);

		List<String> notAllowSkipComponentName = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeBahamutAppbindrepoResponse.Result.NotAllowSkipComponentName.Length"); i++) {
			notAllowSkipComponentName.add(_ctx.stringValue("CreateLinkeBahamutAppbindrepoResponse.Result.NotAllowSkipComponentName["+ i +"]"));
		}
		result.setNotAllowSkipComponentName(notAllowSkipComponentName);

		List<String> pes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeBahamutAppbindrepoResponse.Result.Pes.Length"); i++) {
			pes.add(_ctx.stringValue("CreateLinkeBahamutAppbindrepoResponse.Result.Pes["+ i +"]"));
		}
		result.setPes(pes);

		List<String> productOwners = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeBahamutAppbindrepoResponse.Result.ProductOwners.Length"); i++) {
			productOwners.add(_ctx.stringValue("CreateLinkeBahamutAppbindrepoResponse.Result.ProductOwners["+ i +"]"));
		}
		result.setProductOwners(productOwners);

		List<String> productTestOwners = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeBahamutAppbindrepoResponse.Result.ProductTestOwners.Length"); i++) {
			productTestOwners.add(_ctx.stringValue("CreateLinkeBahamutAppbindrepoResponse.Result.ProductTestOwners["+ i +"]"));
		}
		result.setProductTestOwners(productTestOwners);

		List<String> pubOwners = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeBahamutAppbindrepoResponse.Result.PubOwners.Length"); i++) {
			pubOwners.add(_ctx.stringValue("CreateLinkeBahamutAppbindrepoResponse.Result.PubOwners["+ i +"]"));
		}
		result.setPubOwners(pubOwners);

		List<String> qualityRules = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeBahamutAppbindrepoResponse.Result.QualityRules.Length"); i++) {
			qualityRules.add(_ctx.stringValue("CreateLinkeBahamutAppbindrepoResponse.Result.QualityRules["+ i +"]"));
		}
		result.setQualityRules(qualityRules);

		List<String> testOwners = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeBahamutAppbindrepoResponse.Result.TestOwners.Length"); i++) {
			testOwners.add(_ctx.stringValue("CreateLinkeBahamutAppbindrepoResponse.Result.TestOwners["+ i +"]"));
		}
		result.setTestOwners(testOwners);
		createLinkeBahamutAppbindrepoResponse.setResult(result);
	 
	 	return createLinkeBahamutAppbindrepoResponse;
	}
}