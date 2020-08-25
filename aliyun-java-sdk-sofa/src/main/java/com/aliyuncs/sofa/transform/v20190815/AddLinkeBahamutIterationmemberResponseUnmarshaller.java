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

import com.aliyuncs.sofa.model.v20190815.AddLinkeBahamutIterationmemberResponse;
import com.aliyuncs.sofa.model.v20190815.AddLinkeBahamutIterationmemberResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddLinkeBahamutIterationmemberResponseUnmarshaller {

	public static AddLinkeBahamutIterationmemberResponse unmarshall(AddLinkeBahamutIterationmemberResponse addLinkeBahamutIterationmemberResponse, UnmarshallerContext _ctx) {
		
		addLinkeBahamutIterationmemberResponse.setRequestId(_ctx.stringValue("AddLinkeBahamutIterationmemberResponse.RequestId"));
		addLinkeBahamutIterationmemberResponse.setResultCode(_ctx.stringValue("AddLinkeBahamutIterationmemberResponse.ResultCode"));
		addLinkeBahamutIterationmemberResponse.setResultMessage(_ctx.stringValue("AddLinkeBahamutIterationmemberResponse.ResultMessage"));
		addLinkeBahamutIterationmemberResponse.setErrorMessage(_ctx.stringValue("AddLinkeBahamutIterationmemberResponse.ErrorMessage"));
		addLinkeBahamutIterationmemberResponse.setErrorMsgParamsMap(_ctx.stringValue("AddLinkeBahamutIterationmemberResponse.ErrorMsgParamsMap"));
		addLinkeBahamutIterationmemberResponse.setMessage(_ctx.stringValue("AddLinkeBahamutIterationmemberResponse.Message"));
		addLinkeBahamutIterationmemberResponse.setResponseStatusCode(_ctx.longValue("AddLinkeBahamutIterationmemberResponse.ResponseStatusCode"));
		addLinkeBahamutIterationmemberResponse.setSuccess(_ctx.booleanValue("AddLinkeBahamutIterationmemberResponse.Success"));

		Result result = new Result();
		result.setAppGroup(_ctx.stringValue("AddLinkeBahamutIterationmemberResponse.Result.AppGroup"));
		result.setAppTechStackName(_ctx.stringValue("AddLinkeBahamutIterationmemberResponse.Result.AppTechStackName"));
		result.setAppType(_ctx.stringValue("AddLinkeBahamutIterationmemberResponse.Result.AppType"));
		result.setAppTypeBackUp(_ctx.stringValue("AddLinkeBahamutIterationmemberResponse.Result.AppTypeBackUp"));
		result.setArchDomainExternalId(_ctx.stringValue("AddLinkeBahamutIterationmemberResponse.Result.ArchDomainExternalId"));
		result.setArchDomainMeta(_ctx.stringValue("AddLinkeBahamutIterationmemberResponse.Result.ArchDomainMeta"));
		result.setArchDomainName(_ctx.stringValue("AddLinkeBahamutIterationmemberResponse.Result.ArchDomainName"));
		result.setArchDomainSynacId(_ctx.longValue("AddLinkeBahamutIterationmemberResponse.Result.ArchDomainSynacId"));
		result.setAutoBetaSitDeploy(_ctx.booleanValue("AddLinkeBahamutIterationmemberResponse.Result.AutoBetaSitDeploy"));
		result.setBaseJarInfo(_ctx.stringValue("AddLinkeBahamutIterationmemberResponse.Result.BaseJarInfo"));
		result.setBetterQuality(_ctx.booleanValue("AddLinkeBahamutIterationmemberResponse.Result.BetterQuality"));
		result.setBlizzardRecordingAndPlaybackSmartTest(_ctx.booleanValue("AddLinkeBahamutIterationmemberResponse.Result.BlizzardRecordingAndPlaybackSmartTest"));
		result.setCloudDeployType(_ctx.stringValue("AddLinkeBahamutIterationmemberResponse.Result.CloudDeployType"));
		result.setCommonRiskPointInspection(_ctx.booleanValue("AddLinkeBahamutIterationmemberResponse.Result.CommonRiskPointInspection"));
		result.setContainerServiceName(_ctx.stringValue("AddLinkeBahamutIterationmemberResponse.Result.ContainerServiceName"));
		result.setCoverageBaseline(_ctx.stringValue("AddLinkeBahamutIterationmemberResponse.Result.CoverageBaseline"));
		result.setCoverageFromThirdPlatform(_ctx.booleanValue("AddLinkeBahamutIterationmemberResponse.Result.CoverageFromThirdPlatform"));
		result.setCreated(_ctx.longValue("AddLinkeBahamutIterationmemberResponse.Result.Created"));
		result.setCreateIterationNeedReq(_ctx.booleanValue("AddLinkeBahamutIterationmemberResponse.Result.CreateIterationNeedReq"));
		result.setCreateStageMergeTask(_ctx.booleanValue("AddLinkeBahamutIterationmemberResponse.Result.CreateStageMergeTask"));
		result.setCrucialApp(_ctx.booleanValue("AddLinkeBahamutIterationmemberResponse.Result.CrucialApp"));
		result.setCustomBuildType(_ctx.stringValue("AddLinkeBahamutIterationmemberResponse.Result.CustomBuildType"));
		result.setDbChangeEvaluate(_ctx.booleanValue("AddLinkeBahamutIterationmemberResponse.Result.DbChangeEvaluate"));
		result.setDeleted(_ctx.booleanValue("AddLinkeBahamutIterationmemberResponse.Result.Deleted"));
		result.setDevLang(_ctx.stringValue("AddLinkeBahamutIterationmemberResponse.Result.DevLang"));
		result.setDevServerDeployment(_ctx.booleanValue("AddLinkeBahamutIterationmemberResponse.Result.DevServerDeployment"));
		result.setDisplayName(_ctx.stringValue("AddLinkeBahamutIterationmemberResponse.Result.DisplayName"));
		result.setGitLabGroupName(_ctx.stringValue("AddLinkeBahamutIterationmemberResponse.Result.GitLabGroupName"));
		result.setGitLabHttpUrl(_ctx.stringValue("AddLinkeBahamutIterationmemberResponse.Result.GitLabHttpUrl"));
		result.setGitLabRepoName(_ctx.stringValue("AddLinkeBahamutIterationmemberResponse.Result.GitLabRepoName"));
		result.setGitLabSshUrl(_ctx.stringValue("AddLinkeBahamutIterationmemberResponse.Result.GitLabSshUrl"));
		result.setGreyEmergencyRelease(_ctx.booleanValue("AddLinkeBahamutIterationmemberResponse.Result.GreyEmergencyRelease"));
		result.setGreyRelease(_ctx.booleanValue("AddLinkeBahamutIterationmemberResponse.Result.GreyRelease"));
		result.setId(_ctx.stringValue("AddLinkeBahamutIterationmemberResponse.Result.Id"));
		result.setImage(_ctx.stringValue("AddLinkeBahamutIterationmemberResponse.Result.Image"));
		result.setLastModified(_ctx.longValue("AddLinkeBahamutIterationmemberResponse.Result.LastModified"));
		result.setLevel(_ctx.stringValue("AddLinkeBahamutIterationmemberResponse.Result.Level"));
		result.setLockBranch(_ctx.booleanValue("AddLinkeBahamutIterationmemberResponse.Result.LockBranch"));
		result.setName(_ctx.stringValue("AddLinkeBahamutIterationmemberResponse.Result.Name"));
		result.setNetRelease(_ctx.booleanValue("AddLinkeBahamutIterationmemberResponse.Result.NetRelease"));
		result.setOfflineAuthControl(_ctx.booleanValue("AddLinkeBahamutIterationmemberResponse.Result.OfflineAuthControl"));
		result.setOfflineZoneMode(_ctx.stringValue("AddLinkeBahamutIterationmemberResponse.Result.OfflineZoneMode"));
		result.setOnlineStatus(_ctx.stringValue("AddLinkeBahamutIterationmemberResponse.Result.OnlineStatus"));
		result.setOptionList(_ctx.stringValue("AddLinkeBahamutIterationmemberResponse.Result.OptionList"));
		result.setParentArchDomainExternalId(_ctx.stringValue("AddLinkeBahamutIterationmemberResponse.Result.ParentArchDomainExternalId"));
		result.setParentArchDomainName(_ctx.stringValue("AddLinkeBahamutIterationmemberResponse.Result.ParentArchDomainName"));
		result.setPriPubOwner(_ctx.stringValue("AddLinkeBahamutIterationmemberResponse.Result.PriPubOwner"));
		result.setReleaseDomainName(_ctx.stringValue("AddLinkeBahamutIterationmemberResponse.Result.ReleaseDomainName"));
		result.setReleaseType(_ctx.stringValue("AddLinkeBahamutIterationmemberResponse.Result.ReleaseType"));
		result.setRiskAssessNeeded(_ctx.booleanValue("AddLinkeBahamutIterationmemberResponse.Result.RiskAssessNeeded"));
		result.setServerDeployment(_ctx.booleanValue("AddLinkeBahamutIterationmemberResponse.Result.ServerDeployment"));
		result.setSitServerDeployment(_ctx.booleanValue("AddLinkeBahamutIterationmemberResponse.Result.SitServerDeployment"));
		result.setStableDeployMode(_ctx.stringValue("AddLinkeBahamutIterationmemberResponse.Result.StableDeployMode"));
		result.setStation(_ctx.stringValue("AddLinkeBahamutIterationmemberResponse.Result.Station"));
		result.setStatus(_ctx.stringValue("AddLinkeBahamutIterationmemberResponse.Result.Status"));
		result.setSynacId(_ctx.longValue("AddLinkeBahamutIterationmemberResponse.Result.SynacId"));
		result.setTcCenterPassRate(_ctx.booleanValue("AddLinkeBahamutIterationmemberResponse.Result.TcCenterPassRate"));
		result.setTenantId(_ctx.stringValue("AddLinkeBahamutIterationmemberResponse.Result.TenantId"));
		result.setTrunkMrNeedDefectOrReq(_ctx.booleanValue("AddLinkeBahamutIterationmemberResponse.Result.TrunkMrNeedDefectOrReq"));
		result.setUseLinkQ(_ctx.booleanValue("AddLinkeBahamutIterationmemberResponse.Result.UseLinkQ"));
		result.setUsePullRequestInAlipay(_ctx.booleanValue("AddLinkeBahamutIterationmemberResponse.Result.UsePullRequestInAlipay"));
		result.setUseTenantQualityRule(_ctx.booleanValue("AddLinkeBahamutIterationmemberResponse.Result.UseTenantQualityRule"));
		result.setVcs(_ctx.stringValue("AddLinkeBahamutIterationmemberResponse.Result.Vcs"));
		result.setZoneMode(_ctx.stringValue("AddLinkeBahamutIterationmemberResponse.Result.ZoneMode"));

		List<String> customQualityDisplay = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutIterationmemberResponse.Result.CustomQualityDisplay.Length"); i++) {
			customQualityDisplay.add(_ctx.stringValue("AddLinkeBahamutIterationmemberResponse.Result.CustomQualityDisplay["+ i +"]"));
		}
		result.setCustomQualityDisplay(customQualityDisplay);

		List<String> devOwners = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutIterationmemberResponse.Result.DevOwners.Length"); i++) {
			devOwners.add(_ctx.stringValue("AddLinkeBahamutIterationmemberResponse.Result.DevOwners["+ i +"]"));
		}
		result.setDevOwners(devOwners);

		List<String> devOwnerUsers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutIterationmemberResponse.Result.DevOwnerUsers.Length"); i++) {
			devOwnerUsers.add(_ctx.stringValue("AddLinkeBahamutIterationmemberResponse.Result.DevOwnerUsers["+ i +"]"));
		}
		result.setDevOwnerUsers(devOwnerUsers);

		List<String> iterationMembers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutIterationmemberResponse.Result.IterationMembers.Length"); i++) {
			iterationMembers.add(_ctx.stringValue("AddLinkeBahamutIterationmemberResponse.Result.IterationMembers["+ i +"]"));
		}
		result.setIterationMembers(iterationMembers);

		List<String> members = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutIterationmemberResponse.Result.Members.Length"); i++) {
			members.add(_ctx.stringValue("AddLinkeBahamutIterationmemberResponse.Result.Members["+ i +"]"));
		}
		result.setMembers(members);

		List<String> memberNames = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutIterationmemberResponse.Result.MemberNames.Length"); i++) {
			memberNames.add(_ctx.stringValue("AddLinkeBahamutIterationmemberResponse.Result.MemberNames["+ i +"]"));
		}
		result.setMemberNames(memberNames);

		List<String> modules = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutIterationmemberResponse.Result.Modules.Length"); i++) {
			modules.add(_ctx.stringValue("AddLinkeBahamutIterationmemberResponse.Result.Modules["+ i +"]"));
		}
		result.setModules(modules);

		List<String> notAllowSkipComponentName = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutIterationmemberResponse.Result.NotAllowSkipComponentName.Length"); i++) {
			notAllowSkipComponentName.add(_ctx.stringValue("AddLinkeBahamutIterationmemberResponse.Result.NotAllowSkipComponentName["+ i +"]"));
		}
		result.setNotAllowSkipComponentName(notAllowSkipComponentName);

		List<String> pes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutIterationmemberResponse.Result.Pes.Length"); i++) {
			pes.add(_ctx.stringValue("AddLinkeBahamutIterationmemberResponse.Result.Pes["+ i +"]"));
		}
		result.setPes(pes);

		List<String> productOwners = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutIterationmemberResponse.Result.ProductOwners.Length"); i++) {
			productOwners.add(_ctx.stringValue("AddLinkeBahamutIterationmemberResponse.Result.ProductOwners["+ i +"]"));
		}
		result.setProductOwners(productOwners);

		List<String> productTestOwners = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutIterationmemberResponse.Result.ProductTestOwners.Length"); i++) {
			productTestOwners.add(_ctx.stringValue("AddLinkeBahamutIterationmemberResponse.Result.ProductTestOwners["+ i +"]"));
		}
		result.setProductTestOwners(productTestOwners);

		List<String> pubOwners = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutIterationmemberResponse.Result.PubOwners.Length"); i++) {
			pubOwners.add(_ctx.stringValue("AddLinkeBahamutIterationmemberResponse.Result.PubOwners["+ i +"]"));
		}
		result.setPubOwners(pubOwners);

		List<String> qualityRules = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutIterationmemberResponse.Result.QualityRules.Length"); i++) {
			qualityRules.add(_ctx.stringValue("AddLinkeBahamutIterationmemberResponse.Result.QualityRules["+ i +"]"));
		}
		result.setQualityRules(qualityRules);

		List<String> testOwners = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutIterationmemberResponse.Result.TestOwners.Length"); i++) {
			testOwners.add(_ctx.stringValue("AddLinkeBahamutIterationmemberResponse.Result.TestOwners["+ i +"]"));
		}
		result.setTestOwners(testOwners);
		addLinkeBahamutIterationmemberResponse.setResult(result);
	 
	 	return addLinkeBahamutIterationmemberResponse;
	}
}