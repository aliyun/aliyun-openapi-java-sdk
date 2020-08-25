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

import com.aliyuncs.sofa.model.v20190815.DeleteLinkeBahamutAppmoduleResponse;
import com.aliyuncs.sofa.model.v20190815.DeleteLinkeBahamutAppmoduleResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteLinkeBahamutAppmoduleResponseUnmarshaller {

	public static DeleteLinkeBahamutAppmoduleResponse unmarshall(DeleteLinkeBahamutAppmoduleResponse deleteLinkeBahamutAppmoduleResponse, UnmarshallerContext _ctx) {
		
		deleteLinkeBahamutAppmoduleResponse.setRequestId(_ctx.stringValue("DeleteLinkeBahamutAppmoduleResponse.RequestId"));
		deleteLinkeBahamutAppmoduleResponse.setResultCode(_ctx.stringValue("DeleteLinkeBahamutAppmoduleResponse.ResultCode"));
		deleteLinkeBahamutAppmoduleResponse.setResultMessage(_ctx.stringValue("DeleteLinkeBahamutAppmoduleResponse.ResultMessage"));
		deleteLinkeBahamutAppmoduleResponse.setErrorMessage(_ctx.stringValue("DeleteLinkeBahamutAppmoduleResponse.ErrorMessage"));
		deleteLinkeBahamutAppmoduleResponse.setErrorMsgParamsMap(_ctx.stringValue("DeleteLinkeBahamutAppmoduleResponse.ErrorMsgParamsMap"));
		deleteLinkeBahamutAppmoduleResponse.setMessage(_ctx.stringValue("DeleteLinkeBahamutAppmoduleResponse.Message"));
		deleteLinkeBahamutAppmoduleResponse.setResponseStatusCode(_ctx.longValue("DeleteLinkeBahamutAppmoduleResponse.ResponseStatusCode"));
		deleteLinkeBahamutAppmoduleResponse.setSuccess(_ctx.booleanValue("DeleteLinkeBahamutAppmoduleResponse.Success"));

		Result result = new Result();
		result.setAppGroup(_ctx.stringValue("DeleteLinkeBahamutAppmoduleResponse.Result.AppGroup"));
		result.setAppTechStackName(_ctx.stringValue("DeleteLinkeBahamutAppmoduleResponse.Result.AppTechStackName"));
		result.setAppType(_ctx.stringValue("DeleteLinkeBahamutAppmoduleResponse.Result.AppType"));
		result.setAppTypeBackUp(_ctx.stringValue("DeleteLinkeBahamutAppmoduleResponse.Result.AppTypeBackUp"));
		result.setArchDomainExternalId(_ctx.stringValue("DeleteLinkeBahamutAppmoduleResponse.Result.ArchDomainExternalId"));
		result.setArchDomainMeta(_ctx.stringValue("DeleteLinkeBahamutAppmoduleResponse.Result.ArchDomainMeta"));
		result.setArchDomainName(_ctx.stringValue("DeleteLinkeBahamutAppmoduleResponse.Result.ArchDomainName"));
		result.setArchDomainSynacId(_ctx.longValue("DeleteLinkeBahamutAppmoduleResponse.Result.ArchDomainSynacId"));
		result.setAutoBetaSitDeploy(_ctx.booleanValue("DeleteLinkeBahamutAppmoduleResponse.Result.AutoBetaSitDeploy"));
		result.setBaseJarInfo(_ctx.stringValue("DeleteLinkeBahamutAppmoduleResponse.Result.BaseJarInfo"));
		result.setBetterQuality(_ctx.booleanValue("DeleteLinkeBahamutAppmoduleResponse.Result.BetterQuality"));
		result.setBlizzardRecordingAndPlaybackSmartTest(_ctx.booleanValue("DeleteLinkeBahamutAppmoduleResponse.Result.BlizzardRecordingAndPlaybackSmartTest"));
		result.setCloudDeployType(_ctx.stringValue("DeleteLinkeBahamutAppmoduleResponse.Result.CloudDeployType"));
		result.setCommonRiskPointInspection(_ctx.booleanValue("DeleteLinkeBahamutAppmoduleResponse.Result.CommonRiskPointInspection"));
		result.setContainerServiceName(_ctx.stringValue("DeleteLinkeBahamutAppmoduleResponse.Result.ContainerServiceName"));
		result.setCoverageBaseline(_ctx.stringValue("DeleteLinkeBahamutAppmoduleResponse.Result.CoverageBaseline"));
		result.setCoverageFromThirdPlatform(_ctx.booleanValue("DeleteLinkeBahamutAppmoduleResponse.Result.CoverageFromThirdPlatform"));
		result.setCreated(_ctx.longValue("DeleteLinkeBahamutAppmoduleResponse.Result.Created"));
		result.setCreateIterationNeedReq(_ctx.booleanValue("DeleteLinkeBahamutAppmoduleResponse.Result.CreateIterationNeedReq"));
		result.setCreateStageMergeTask(_ctx.booleanValue("DeleteLinkeBahamutAppmoduleResponse.Result.CreateStageMergeTask"));
		result.setCrucialApp(_ctx.booleanValue("DeleteLinkeBahamutAppmoduleResponse.Result.CrucialApp"));
		result.setCustomBuildType(_ctx.stringValue("DeleteLinkeBahamutAppmoduleResponse.Result.CustomBuildType"));
		result.setDbChangeEvaluate(_ctx.booleanValue("DeleteLinkeBahamutAppmoduleResponse.Result.DbChangeEvaluate"));
		result.setDeleted(_ctx.booleanValue("DeleteLinkeBahamutAppmoduleResponse.Result.Deleted"));
		result.setDevLang(_ctx.stringValue("DeleteLinkeBahamutAppmoduleResponse.Result.DevLang"));
		result.setDevServerDeployment(_ctx.booleanValue("DeleteLinkeBahamutAppmoduleResponse.Result.DevServerDeployment"));
		result.setDisplayName(_ctx.stringValue("DeleteLinkeBahamutAppmoduleResponse.Result.DisplayName"));
		result.setGitLabGroupName(_ctx.stringValue("DeleteLinkeBahamutAppmoduleResponse.Result.GitLabGroupName"));
		result.setGitLabHttpUrl(_ctx.stringValue("DeleteLinkeBahamutAppmoduleResponse.Result.GitLabHttpUrl"));
		result.setGitLabRepoName(_ctx.stringValue("DeleteLinkeBahamutAppmoduleResponse.Result.GitLabRepoName"));
		result.setGitLabSshUrl(_ctx.stringValue("DeleteLinkeBahamutAppmoduleResponse.Result.GitLabSshUrl"));
		result.setGreyEmergencyRelease(_ctx.booleanValue("DeleteLinkeBahamutAppmoduleResponse.Result.GreyEmergencyRelease"));
		result.setGreyRelease(_ctx.booleanValue("DeleteLinkeBahamutAppmoduleResponse.Result.GreyRelease"));
		result.setId(_ctx.stringValue("DeleteLinkeBahamutAppmoduleResponse.Result.Id"));
		result.setImage(_ctx.stringValue("DeleteLinkeBahamutAppmoduleResponse.Result.Image"));
		result.setLastModified(_ctx.longValue("DeleteLinkeBahamutAppmoduleResponse.Result.LastModified"));
		result.setLevel(_ctx.stringValue("DeleteLinkeBahamutAppmoduleResponse.Result.Level"));
		result.setLockBranch(_ctx.booleanValue("DeleteLinkeBahamutAppmoduleResponse.Result.LockBranch"));
		result.setName(_ctx.stringValue("DeleteLinkeBahamutAppmoduleResponse.Result.Name"));
		result.setNetRelease(_ctx.booleanValue("DeleteLinkeBahamutAppmoduleResponse.Result.NetRelease"));
		result.setOfflineAuthControl(_ctx.booleanValue("DeleteLinkeBahamutAppmoduleResponse.Result.OfflineAuthControl"));
		result.setOfflineZoneMode(_ctx.stringValue("DeleteLinkeBahamutAppmoduleResponse.Result.OfflineZoneMode"));
		result.setOnlineStatus(_ctx.stringValue("DeleteLinkeBahamutAppmoduleResponse.Result.OnlineStatus"));
		result.setOptionList(_ctx.stringValue("DeleteLinkeBahamutAppmoduleResponse.Result.OptionList"));
		result.setParentArchDomainExternalId(_ctx.stringValue("DeleteLinkeBahamutAppmoduleResponse.Result.ParentArchDomainExternalId"));
		result.setParentArchDomainName(_ctx.stringValue("DeleteLinkeBahamutAppmoduleResponse.Result.ParentArchDomainName"));
		result.setPriPubOwner(_ctx.stringValue("DeleteLinkeBahamutAppmoduleResponse.Result.PriPubOwner"));
		result.setReleaseDomainName(_ctx.stringValue("DeleteLinkeBahamutAppmoduleResponse.Result.ReleaseDomainName"));
		result.setReleaseType(_ctx.stringValue("DeleteLinkeBahamutAppmoduleResponse.Result.ReleaseType"));
		result.setRiskAssessNeeded(_ctx.booleanValue("DeleteLinkeBahamutAppmoduleResponse.Result.RiskAssessNeeded"));
		result.setServerDeployment(_ctx.booleanValue("DeleteLinkeBahamutAppmoduleResponse.Result.ServerDeployment"));
		result.setSitServerDeployment(_ctx.booleanValue("DeleteLinkeBahamutAppmoduleResponse.Result.SitServerDeployment"));
		result.setStableDeployMode(_ctx.stringValue("DeleteLinkeBahamutAppmoduleResponse.Result.StableDeployMode"));
		result.setStation(_ctx.stringValue("DeleteLinkeBahamutAppmoduleResponse.Result.Station"));
		result.setStatus(_ctx.stringValue("DeleteLinkeBahamutAppmoduleResponse.Result.Status"));
		result.setSynacId(_ctx.longValue("DeleteLinkeBahamutAppmoduleResponse.Result.SynacId"));
		result.setTcCenterPassRate(_ctx.booleanValue("DeleteLinkeBahamutAppmoduleResponse.Result.TcCenterPassRate"));
		result.setTenantId(_ctx.stringValue("DeleteLinkeBahamutAppmoduleResponse.Result.TenantId"));
		result.setTrunkMrNeedDefectOrReq(_ctx.booleanValue("DeleteLinkeBahamutAppmoduleResponse.Result.TrunkMrNeedDefectOrReq"));
		result.setUseLinkQ(_ctx.booleanValue("DeleteLinkeBahamutAppmoduleResponse.Result.UseLinkQ"));
		result.setUsePullRequestInAlipay(_ctx.booleanValue("DeleteLinkeBahamutAppmoduleResponse.Result.UsePullRequestInAlipay"));
		result.setUseTenantQualityRule(_ctx.booleanValue("DeleteLinkeBahamutAppmoduleResponse.Result.UseTenantQualityRule"));
		result.setVcs(_ctx.stringValue("DeleteLinkeBahamutAppmoduleResponse.Result.Vcs"));
		result.setZoneMode(_ctx.stringValue("DeleteLinkeBahamutAppmoduleResponse.Result.ZoneMode"));

		List<String> customQualityDisplay = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DeleteLinkeBahamutAppmoduleResponse.Result.CustomQualityDisplay.Length"); i++) {
			customQualityDisplay.add(_ctx.stringValue("DeleteLinkeBahamutAppmoduleResponse.Result.CustomQualityDisplay["+ i +"]"));
		}
		result.setCustomQualityDisplay(customQualityDisplay);

		List<String> devOwners = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DeleteLinkeBahamutAppmoduleResponse.Result.DevOwners.Length"); i++) {
			devOwners.add(_ctx.stringValue("DeleteLinkeBahamutAppmoduleResponse.Result.DevOwners["+ i +"]"));
		}
		result.setDevOwners(devOwners);

		List<String> devOwnerUsers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DeleteLinkeBahamutAppmoduleResponse.Result.DevOwnerUsers.Length"); i++) {
			devOwnerUsers.add(_ctx.stringValue("DeleteLinkeBahamutAppmoduleResponse.Result.DevOwnerUsers["+ i +"]"));
		}
		result.setDevOwnerUsers(devOwnerUsers);

		List<String> iterationMembers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DeleteLinkeBahamutAppmoduleResponse.Result.IterationMembers.Length"); i++) {
			iterationMembers.add(_ctx.stringValue("DeleteLinkeBahamutAppmoduleResponse.Result.IterationMembers["+ i +"]"));
		}
		result.setIterationMembers(iterationMembers);

		List<String> members = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DeleteLinkeBahamutAppmoduleResponse.Result.Members.Length"); i++) {
			members.add(_ctx.stringValue("DeleteLinkeBahamutAppmoduleResponse.Result.Members["+ i +"]"));
		}
		result.setMembers(members);

		List<String> memberNames = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DeleteLinkeBahamutAppmoduleResponse.Result.MemberNames.Length"); i++) {
			memberNames.add(_ctx.stringValue("DeleteLinkeBahamutAppmoduleResponse.Result.MemberNames["+ i +"]"));
		}
		result.setMemberNames(memberNames);

		List<String> modules = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DeleteLinkeBahamutAppmoduleResponse.Result.Modules.Length"); i++) {
			modules.add(_ctx.stringValue("DeleteLinkeBahamutAppmoduleResponse.Result.Modules["+ i +"]"));
		}
		result.setModules(modules);

		List<String> notAllowSkipComponentName = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DeleteLinkeBahamutAppmoduleResponse.Result.NotAllowSkipComponentName.Length"); i++) {
			notAllowSkipComponentName.add(_ctx.stringValue("DeleteLinkeBahamutAppmoduleResponse.Result.NotAllowSkipComponentName["+ i +"]"));
		}
		result.setNotAllowSkipComponentName(notAllowSkipComponentName);

		List<String> pes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DeleteLinkeBahamutAppmoduleResponse.Result.Pes.Length"); i++) {
			pes.add(_ctx.stringValue("DeleteLinkeBahamutAppmoduleResponse.Result.Pes["+ i +"]"));
		}
		result.setPes(pes);

		List<String> productOwners = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DeleteLinkeBahamutAppmoduleResponse.Result.ProductOwners.Length"); i++) {
			productOwners.add(_ctx.stringValue("DeleteLinkeBahamutAppmoduleResponse.Result.ProductOwners["+ i +"]"));
		}
		result.setProductOwners(productOwners);

		List<String> productTestOwners = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DeleteLinkeBahamutAppmoduleResponse.Result.ProductTestOwners.Length"); i++) {
			productTestOwners.add(_ctx.stringValue("DeleteLinkeBahamutAppmoduleResponse.Result.ProductTestOwners["+ i +"]"));
		}
		result.setProductTestOwners(productTestOwners);

		List<String> pubOwners = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DeleteLinkeBahamutAppmoduleResponse.Result.PubOwners.Length"); i++) {
			pubOwners.add(_ctx.stringValue("DeleteLinkeBahamutAppmoduleResponse.Result.PubOwners["+ i +"]"));
		}
		result.setPubOwners(pubOwners);

		List<String> qualityRules = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DeleteLinkeBahamutAppmoduleResponse.Result.QualityRules.Length"); i++) {
			qualityRules.add(_ctx.stringValue("DeleteLinkeBahamutAppmoduleResponse.Result.QualityRules["+ i +"]"));
		}
		result.setQualityRules(qualityRules);

		List<String> testOwners = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DeleteLinkeBahamutAppmoduleResponse.Result.TestOwners.Length"); i++) {
			testOwners.add(_ctx.stringValue("DeleteLinkeBahamutAppmoduleResponse.Result.TestOwners["+ i +"]"));
		}
		result.setTestOwners(testOwners);
		deleteLinkeBahamutAppmoduleResponse.setResult(result);
	 
	 	return deleteLinkeBahamutAppmoduleResponse;
	}
}