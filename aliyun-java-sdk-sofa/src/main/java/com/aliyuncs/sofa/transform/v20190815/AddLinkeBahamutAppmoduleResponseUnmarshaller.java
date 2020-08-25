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

import com.aliyuncs.sofa.model.v20190815.AddLinkeBahamutAppmoduleResponse;
import com.aliyuncs.sofa.model.v20190815.AddLinkeBahamutAppmoduleResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddLinkeBahamutAppmoduleResponseUnmarshaller {

	public static AddLinkeBahamutAppmoduleResponse unmarshall(AddLinkeBahamutAppmoduleResponse addLinkeBahamutAppmoduleResponse, UnmarshallerContext _ctx) {
		
		addLinkeBahamutAppmoduleResponse.setRequestId(_ctx.stringValue("AddLinkeBahamutAppmoduleResponse.RequestId"));
		addLinkeBahamutAppmoduleResponse.setResultCode(_ctx.stringValue("AddLinkeBahamutAppmoduleResponse.ResultCode"));
		addLinkeBahamutAppmoduleResponse.setResultMessage(_ctx.stringValue("AddLinkeBahamutAppmoduleResponse.ResultMessage"));
		addLinkeBahamutAppmoduleResponse.setErrorMessage(_ctx.stringValue("AddLinkeBahamutAppmoduleResponse.ErrorMessage"));
		addLinkeBahamutAppmoduleResponse.setErrorMsgParamsMap(_ctx.stringValue("AddLinkeBahamutAppmoduleResponse.ErrorMsgParamsMap"));
		addLinkeBahamutAppmoduleResponse.setMessage(_ctx.stringValue("AddLinkeBahamutAppmoduleResponse.Message"));
		addLinkeBahamutAppmoduleResponse.setResponseStatusCode(_ctx.longValue("AddLinkeBahamutAppmoduleResponse.ResponseStatusCode"));
		addLinkeBahamutAppmoduleResponse.setSuccess(_ctx.booleanValue("AddLinkeBahamutAppmoduleResponse.Success"));

		Result result = new Result();
		result.setAppGroup(_ctx.stringValue("AddLinkeBahamutAppmoduleResponse.Result.AppGroup"));
		result.setAppTechStackName(_ctx.stringValue("AddLinkeBahamutAppmoduleResponse.Result.AppTechStackName"));
		result.setAppType(_ctx.stringValue("AddLinkeBahamutAppmoduleResponse.Result.AppType"));
		result.setAppTypeBackUp(_ctx.stringValue("AddLinkeBahamutAppmoduleResponse.Result.AppTypeBackUp"));
		result.setArchDomainExternalId(_ctx.stringValue("AddLinkeBahamutAppmoduleResponse.Result.ArchDomainExternalId"));
		result.setArchDomainMeta(_ctx.stringValue("AddLinkeBahamutAppmoduleResponse.Result.ArchDomainMeta"));
		result.setArchDomainName(_ctx.stringValue("AddLinkeBahamutAppmoduleResponse.Result.ArchDomainName"));
		result.setArchDomainSynacId(_ctx.longValue("AddLinkeBahamutAppmoduleResponse.Result.ArchDomainSynacId"));
		result.setAutoBetaSitDeploy(_ctx.booleanValue("AddLinkeBahamutAppmoduleResponse.Result.AutoBetaSitDeploy"));
		result.setBaseJarInfo(_ctx.stringValue("AddLinkeBahamutAppmoduleResponse.Result.BaseJarInfo"));
		result.setBetterQuality(_ctx.booleanValue("AddLinkeBahamutAppmoduleResponse.Result.BetterQuality"));
		result.setBlizzardRecordingAndPlaybackSmartTest(_ctx.booleanValue("AddLinkeBahamutAppmoduleResponse.Result.BlizzardRecordingAndPlaybackSmartTest"));
		result.setCloudDeployType(_ctx.stringValue("AddLinkeBahamutAppmoduleResponse.Result.CloudDeployType"));
		result.setCommonRiskPointInspection(_ctx.booleanValue("AddLinkeBahamutAppmoduleResponse.Result.CommonRiskPointInspection"));
		result.setContainerServiceName(_ctx.stringValue("AddLinkeBahamutAppmoduleResponse.Result.ContainerServiceName"));
		result.setCoverageBaseline(_ctx.stringValue("AddLinkeBahamutAppmoduleResponse.Result.CoverageBaseline"));
		result.setCoverageFromThirdPlatform(_ctx.booleanValue("AddLinkeBahamutAppmoduleResponse.Result.CoverageFromThirdPlatform"));
		result.setCreated(_ctx.longValue("AddLinkeBahamutAppmoduleResponse.Result.Created"));
		result.setCreateIterationNeedReq(_ctx.booleanValue("AddLinkeBahamutAppmoduleResponse.Result.CreateIterationNeedReq"));
		result.setCreateStageMergeTask(_ctx.booleanValue("AddLinkeBahamutAppmoduleResponse.Result.CreateStageMergeTask"));
		result.setCrucialApp(_ctx.booleanValue("AddLinkeBahamutAppmoduleResponse.Result.CrucialApp"));
		result.setCustomBuildType(_ctx.stringValue("AddLinkeBahamutAppmoduleResponse.Result.CustomBuildType"));
		result.setDbChangeEvaluate(_ctx.booleanValue("AddLinkeBahamutAppmoduleResponse.Result.DbChangeEvaluate"));
		result.setDeleted(_ctx.booleanValue("AddLinkeBahamutAppmoduleResponse.Result.Deleted"));
		result.setDevLang(_ctx.stringValue("AddLinkeBahamutAppmoduleResponse.Result.DevLang"));
		result.setDevServerDeployment(_ctx.booleanValue("AddLinkeBahamutAppmoduleResponse.Result.DevServerDeployment"));
		result.setDisplayName(_ctx.stringValue("AddLinkeBahamutAppmoduleResponse.Result.DisplayName"));
		result.setGitLabGroupName(_ctx.stringValue("AddLinkeBahamutAppmoduleResponse.Result.GitLabGroupName"));
		result.setGitLabHttpUrl(_ctx.stringValue("AddLinkeBahamutAppmoduleResponse.Result.GitLabHttpUrl"));
		result.setGitLabRepoName(_ctx.stringValue("AddLinkeBahamutAppmoduleResponse.Result.GitLabRepoName"));
		result.setGitLabSshUrl(_ctx.stringValue("AddLinkeBahamutAppmoduleResponse.Result.GitLabSshUrl"));
		result.setGreyEmergencyRelease(_ctx.booleanValue("AddLinkeBahamutAppmoduleResponse.Result.GreyEmergencyRelease"));
		result.setGreyRelease(_ctx.booleanValue("AddLinkeBahamutAppmoduleResponse.Result.GreyRelease"));
		result.setId(_ctx.stringValue("AddLinkeBahamutAppmoduleResponse.Result.Id"));
		result.setImage(_ctx.stringValue("AddLinkeBahamutAppmoduleResponse.Result.Image"));
		result.setLastModified(_ctx.longValue("AddLinkeBahamutAppmoduleResponse.Result.LastModified"));
		result.setLevel(_ctx.stringValue("AddLinkeBahamutAppmoduleResponse.Result.Level"));
		result.setLockBranch(_ctx.booleanValue("AddLinkeBahamutAppmoduleResponse.Result.LockBranch"));
		result.setName(_ctx.stringValue("AddLinkeBahamutAppmoduleResponse.Result.Name"));
		result.setNetRelease(_ctx.booleanValue("AddLinkeBahamutAppmoduleResponse.Result.NetRelease"));
		result.setOfflineAuthControl(_ctx.booleanValue("AddLinkeBahamutAppmoduleResponse.Result.OfflineAuthControl"));
		result.setOfflineZoneMode(_ctx.stringValue("AddLinkeBahamutAppmoduleResponse.Result.OfflineZoneMode"));
		result.setOnlineStatus(_ctx.stringValue("AddLinkeBahamutAppmoduleResponse.Result.OnlineStatus"));
		result.setOptionList(_ctx.stringValue("AddLinkeBahamutAppmoduleResponse.Result.OptionList"));
		result.setParentArchDomainExternalId(_ctx.stringValue("AddLinkeBahamutAppmoduleResponse.Result.ParentArchDomainExternalId"));
		result.setParentArchDomainName(_ctx.stringValue("AddLinkeBahamutAppmoduleResponse.Result.ParentArchDomainName"));
		result.setPriPubOwner(_ctx.stringValue("AddLinkeBahamutAppmoduleResponse.Result.PriPubOwner"));
		result.setReleaseDomainName(_ctx.stringValue("AddLinkeBahamutAppmoduleResponse.Result.ReleaseDomainName"));
		result.setReleaseType(_ctx.stringValue("AddLinkeBahamutAppmoduleResponse.Result.ReleaseType"));
		result.setRiskAssessNeeded(_ctx.booleanValue("AddLinkeBahamutAppmoduleResponse.Result.RiskAssessNeeded"));
		result.setServerDeployment(_ctx.booleanValue("AddLinkeBahamutAppmoduleResponse.Result.ServerDeployment"));
		result.setSitServerDeployment(_ctx.booleanValue("AddLinkeBahamutAppmoduleResponse.Result.SitServerDeployment"));
		result.setStableDeployMode(_ctx.stringValue("AddLinkeBahamutAppmoduleResponse.Result.StableDeployMode"));
		result.setStation(_ctx.stringValue("AddLinkeBahamutAppmoduleResponse.Result.Station"));
		result.setStatus(_ctx.stringValue("AddLinkeBahamutAppmoduleResponse.Result.Status"));
		result.setSynacId(_ctx.longValue("AddLinkeBahamutAppmoduleResponse.Result.SynacId"));
		result.setTcCenterPassRate(_ctx.booleanValue("AddLinkeBahamutAppmoduleResponse.Result.TcCenterPassRate"));
		result.setTenantId(_ctx.stringValue("AddLinkeBahamutAppmoduleResponse.Result.TenantId"));
		result.setTrunkMrNeedDefectOrReq(_ctx.booleanValue("AddLinkeBahamutAppmoduleResponse.Result.TrunkMrNeedDefectOrReq"));
		result.setUseLinkQ(_ctx.booleanValue("AddLinkeBahamutAppmoduleResponse.Result.UseLinkQ"));
		result.setUsePullRequestInAlipay(_ctx.booleanValue("AddLinkeBahamutAppmoduleResponse.Result.UsePullRequestInAlipay"));
		result.setUseTenantQualityRule(_ctx.booleanValue("AddLinkeBahamutAppmoduleResponse.Result.UseTenantQualityRule"));
		result.setVcs(_ctx.stringValue("AddLinkeBahamutAppmoduleResponse.Result.Vcs"));
		result.setZoneMode(_ctx.stringValue("AddLinkeBahamutAppmoduleResponse.Result.ZoneMode"));

		List<String> customQualityDisplay = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutAppmoduleResponse.Result.CustomQualityDisplay.Length"); i++) {
			customQualityDisplay.add(_ctx.stringValue("AddLinkeBahamutAppmoduleResponse.Result.CustomQualityDisplay["+ i +"]"));
		}
		result.setCustomQualityDisplay(customQualityDisplay);

		List<String> devOwners = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutAppmoduleResponse.Result.DevOwners.Length"); i++) {
			devOwners.add(_ctx.stringValue("AddLinkeBahamutAppmoduleResponse.Result.DevOwners["+ i +"]"));
		}
		result.setDevOwners(devOwners);

		List<String> devOwnerUsers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutAppmoduleResponse.Result.DevOwnerUsers.Length"); i++) {
			devOwnerUsers.add(_ctx.stringValue("AddLinkeBahamutAppmoduleResponse.Result.DevOwnerUsers["+ i +"]"));
		}
		result.setDevOwnerUsers(devOwnerUsers);

		List<String> iterationMembers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutAppmoduleResponse.Result.IterationMembers.Length"); i++) {
			iterationMembers.add(_ctx.stringValue("AddLinkeBahamutAppmoduleResponse.Result.IterationMembers["+ i +"]"));
		}
		result.setIterationMembers(iterationMembers);

		List<String> members = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutAppmoduleResponse.Result.Members.Length"); i++) {
			members.add(_ctx.stringValue("AddLinkeBahamutAppmoduleResponse.Result.Members["+ i +"]"));
		}
		result.setMembers(members);

		List<String> memberNames = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutAppmoduleResponse.Result.MemberNames.Length"); i++) {
			memberNames.add(_ctx.stringValue("AddLinkeBahamutAppmoduleResponse.Result.MemberNames["+ i +"]"));
		}
		result.setMemberNames(memberNames);

		List<String> modules = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutAppmoduleResponse.Result.Modules.Length"); i++) {
			modules.add(_ctx.stringValue("AddLinkeBahamutAppmoduleResponse.Result.Modules["+ i +"]"));
		}
		result.setModules(modules);

		List<String> notAllowSkipComponentName = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutAppmoduleResponse.Result.NotAllowSkipComponentName.Length"); i++) {
			notAllowSkipComponentName.add(_ctx.stringValue("AddLinkeBahamutAppmoduleResponse.Result.NotAllowSkipComponentName["+ i +"]"));
		}
		result.setNotAllowSkipComponentName(notAllowSkipComponentName);

		List<String> pes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutAppmoduleResponse.Result.Pes.Length"); i++) {
			pes.add(_ctx.stringValue("AddLinkeBahamutAppmoduleResponse.Result.Pes["+ i +"]"));
		}
		result.setPes(pes);

		List<String> productOwners = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutAppmoduleResponse.Result.ProductOwners.Length"); i++) {
			productOwners.add(_ctx.stringValue("AddLinkeBahamutAppmoduleResponse.Result.ProductOwners["+ i +"]"));
		}
		result.setProductOwners(productOwners);

		List<String> productTestOwners = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutAppmoduleResponse.Result.ProductTestOwners.Length"); i++) {
			productTestOwners.add(_ctx.stringValue("AddLinkeBahamutAppmoduleResponse.Result.ProductTestOwners["+ i +"]"));
		}
		result.setProductTestOwners(productTestOwners);

		List<String> pubOwners = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutAppmoduleResponse.Result.PubOwners.Length"); i++) {
			pubOwners.add(_ctx.stringValue("AddLinkeBahamutAppmoduleResponse.Result.PubOwners["+ i +"]"));
		}
		result.setPubOwners(pubOwners);

		List<String> qualityRules = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutAppmoduleResponse.Result.QualityRules.Length"); i++) {
			qualityRules.add(_ctx.stringValue("AddLinkeBahamutAppmoduleResponse.Result.QualityRules["+ i +"]"));
		}
		result.setQualityRules(qualityRules);

		List<String> testOwners = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutAppmoduleResponse.Result.TestOwners.Length"); i++) {
			testOwners.add(_ctx.stringValue("AddLinkeBahamutAppmoduleResponse.Result.TestOwners["+ i +"]"));
		}
		result.setTestOwners(testOwners);
		addLinkeBahamutAppmoduleResponse.setResult(result);
	 
	 	return addLinkeBahamutAppmoduleResponse;
	}
}