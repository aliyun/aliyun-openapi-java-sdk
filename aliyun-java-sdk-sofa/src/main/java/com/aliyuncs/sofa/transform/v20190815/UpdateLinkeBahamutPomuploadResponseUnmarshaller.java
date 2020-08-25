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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeBahamutPomuploadResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeBahamutPomuploadResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeBahamutPomuploadResponseUnmarshaller {

	public static UpdateLinkeBahamutPomuploadResponse unmarshall(UpdateLinkeBahamutPomuploadResponse updateLinkeBahamutPomuploadResponse, UnmarshallerContext _ctx) {
		
		updateLinkeBahamutPomuploadResponse.setRequestId(_ctx.stringValue("UpdateLinkeBahamutPomuploadResponse.RequestId"));
		updateLinkeBahamutPomuploadResponse.setResultCode(_ctx.stringValue("UpdateLinkeBahamutPomuploadResponse.ResultCode"));
		updateLinkeBahamutPomuploadResponse.setResultMessage(_ctx.stringValue("UpdateLinkeBahamutPomuploadResponse.ResultMessage"));
		updateLinkeBahamutPomuploadResponse.setErrorMessage(_ctx.stringValue("UpdateLinkeBahamutPomuploadResponse.ErrorMessage"));
		updateLinkeBahamutPomuploadResponse.setErrorMsgParamsMap(_ctx.stringValue("UpdateLinkeBahamutPomuploadResponse.ErrorMsgParamsMap"));
		updateLinkeBahamutPomuploadResponse.setMessage(_ctx.stringValue("UpdateLinkeBahamutPomuploadResponse.Message"));
		updateLinkeBahamutPomuploadResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeBahamutPomuploadResponse.ResponseStatusCode"));
		updateLinkeBahamutPomuploadResponse.setSuccess(_ctx.booleanValue("UpdateLinkeBahamutPomuploadResponse.Success"));

		Result result = new Result();
		result.setAppGroup(_ctx.stringValue("UpdateLinkeBahamutPomuploadResponse.Result.AppGroup"));
		result.setAppTechStackName(_ctx.stringValue("UpdateLinkeBahamutPomuploadResponse.Result.AppTechStackName"));
		result.setAppType(_ctx.stringValue("UpdateLinkeBahamutPomuploadResponse.Result.AppType"));
		result.setAppTypeBackUp(_ctx.stringValue("UpdateLinkeBahamutPomuploadResponse.Result.AppTypeBackUp"));
		result.setArchDomainExternalId(_ctx.stringValue("UpdateLinkeBahamutPomuploadResponse.Result.ArchDomainExternalId"));
		result.setArchDomainMeta(_ctx.stringValue("UpdateLinkeBahamutPomuploadResponse.Result.ArchDomainMeta"));
		result.setArchDomainName(_ctx.stringValue("UpdateLinkeBahamutPomuploadResponse.Result.ArchDomainName"));
		result.setArchDomainSynacId(_ctx.longValue("UpdateLinkeBahamutPomuploadResponse.Result.ArchDomainSynacId"));
		result.setAutoBetaSitDeploy(_ctx.booleanValue("UpdateLinkeBahamutPomuploadResponse.Result.AutoBetaSitDeploy"));
		result.setBaseJarInfo(_ctx.stringValue("UpdateLinkeBahamutPomuploadResponse.Result.BaseJarInfo"));
		result.setBetterQuality(_ctx.booleanValue("UpdateLinkeBahamutPomuploadResponse.Result.BetterQuality"));
		result.setBlizzardRecordingAndPlaybackSmartTest(_ctx.booleanValue("UpdateLinkeBahamutPomuploadResponse.Result.BlizzardRecordingAndPlaybackSmartTest"));
		result.setCloudDeployType(_ctx.stringValue("UpdateLinkeBahamutPomuploadResponse.Result.CloudDeployType"));
		result.setCommonRiskPointInspection(_ctx.booleanValue("UpdateLinkeBahamutPomuploadResponse.Result.CommonRiskPointInspection"));
		result.setContainerServiceName(_ctx.stringValue("UpdateLinkeBahamutPomuploadResponse.Result.ContainerServiceName"));
		result.setCoverageBaseline(_ctx.stringValue("UpdateLinkeBahamutPomuploadResponse.Result.CoverageBaseline"));
		result.setCoverageFromThirdPlatform(_ctx.booleanValue("UpdateLinkeBahamutPomuploadResponse.Result.CoverageFromThirdPlatform"));
		result.setCreated(_ctx.longValue("UpdateLinkeBahamutPomuploadResponse.Result.Created"));
		result.setCreateIterationNeedReq(_ctx.booleanValue("UpdateLinkeBahamutPomuploadResponse.Result.CreateIterationNeedReq"));
		result.setCreateStageMergeTask(_ctx.booleanValue("UpdateLinkeBahamutPomuploadResponse.Result.CreateStageMergeTask"));
		result.setCrucialApp(_ctx.booleanValue("UpdateLinkeBahamutPomuploadResponse.Result.CrucialApp"));
		result.setCustomBuildType(_ctx.stringValue("UpdateLinkeBahamutPomuploadResponse.Result.CustomBuildType"));
		result.setDbChangeEvaluate(_ctx.booleanValue("UpdateLinkeBahamutPomuploadResponse.Result.DbChangeEvaluate"));
		result.setDeleted(_ctx.booleanValue("UpdateLinkeBahamutPomuploadResponse.Result.Deleted"));
		result.setDevLang(_ctx.stringValue("UpdateLinkeBahamutPomuploadResponse.Result.DevLang"));
		result.setDevServerDeployment(_ctx.booleanValue("UpdateLinkeBahamutPomuploadResponse.Result.DevServerDeployment"));
		result.setDisplayName(_ctx.stringValue("UpdateLinkeBahamutPomuploadResponse.Result.DisplayName"));
		result.setGitLabGroupName(_ctx.stringValue("UpdateLinkeBahamutPomuploadResponse.Result.GitLabGroupName"));
		result.setGitLabHttpUrl(_ctx.stringValue("UpdateLinkeBahamutPomuploadResponse.Result.GitLabHttpUrl"));
		result.setGitLabRepoName(_ctx.stringValue("UpdateLinkeBahamutPomuploadResponse.Result.GitLabRepoName"));
		result.setGitLabSshUrl(_ctx.stringValue("UpdateLinkeBahamutPomuploadResponse.Result.GitLabSshUrl"));
		result.setGreyEmergencyRelease(_ctx.booleanValue("UpdateLinkeBahamutPomuploadResponse.Result.GreyEmergencyRelease"));
		result.setGreyRelease(_ctx.booleanValue("UpdateLinkeBahamutPomuploadResponse.Result.GreyRelease"));
		result.setId(_ctx.stringValue("UpdateLinkeBahamutPomuploadResponse.Result.Id"));
		result.setImage(_ctx.stringValue("UpdateLinkeBahamutPomuploadResponse.Result.Image"));
		result.setLastModified(_ctx.longValue("UpdateLinkeBahamutPomuploadResponse.Result.LastModified"));
		result.setLevel(_ctx.stringValue("UpdateLinkeBahamutPomuploadResponse.Result.Level"));
		result.setLockBranch(_ctx.booleanValue("UpdateLinkeBahamutPomuploadResponse.Result.LockBranch"));
		result.setName(_ctx.stringValue("UpdateLinkeBahamutPomuploadResponse.Result.Name"));
		result.setNetRelease(_ctx.booleanValue("UpdateLinkeBahamutPomuploadResponse.Result.NetRelease"));
		result.setOfflineAuthControl(_ctx.booleanValue("UpdateLinkeBahamutPomuploadResponse.Result.OfflineAuthControl"));
		result.setOfflineZoneMode(_ctx.stringValue("UpdateLinkeBahamutPomuploadResponse.Result.OfflineZoneMode"));
		result.setOnlineStatus(_ctx.stringValue("UpdateLinkeBahamutPomuploadResponse.Result.OnlineStatus"));
		result.setOptionList(_ctx.stringValue("UpdateLinkeBahamutPomuploadResponse.Result.OptionList"));
		result.setParentArchDomainExternalId(_ctx.stringValue("UpdateLinkeBahamutPomuploadResponse.Result.ParentArchDomainExternalId"));
		result.setParentArchDomainName(_ctx.stringValue("UpdateLinkeBahamutPomuploadResponse.Result.ParentArchDomainName"));
		result.setPriPubOwner(_ctx.stringValue("UpdateLinkeBahamutPomuploadResponse.Result.PriPubOwner"));
		result.setReleaseDomainName(_ctx.stringValue("UpdateLinkeBahamutPomuploadResponse.Result.ReleaseDomainName"));
		result.setReleaseType(_ctx.stringValue("UpdateLinkeBahamutPomuploadResponse.Result.ReleaseType"));
		result.setRiskAssessNeeded(_ctx.booleanValue("UpdateLinkeBahamutPomuploadResponse.Result.RiskAssessNeeded"));
		result.setServerDeployment(_ctx.booleanValue("UpdateLinkeBahamutPomuploadResponse.Result.ServerDeployment"));
		result.setSitServerDeployment(_ctx.booleanValue("UpdateLinkeBahamutPomuploadResponse.Result.SitServerDeployment"));
		result.setStableDeployMode(_ctx.stringValue("UpdateLinkeBahamutPomuploadResponse.Result.StableDeployMode"));
		result.setStation(_ctx.stringValue("UpdateLinkeBahamutPomuploadResponse.Result.Station"));
		result.setStatus(_ctx.stringValue("UpdateLinkeBahamutPomuploadResponse.Result.Status"));
		result.setSynacId(_ctx.longValue("UpdateLinkeBahamutPomuploadResponse.Result.SynacId"));
		result.setTcCenterPassRate(_ctx.booleanValue("UpdateLinkeBahamutPomuploadResponse.Result.TcCenterPassRate"));
		result.setTenantId(_ctx.stringValue("UpdateLinkeBahamutPomuploadResponse.Result.TenantId"));
		result.setTrunkMrNeedDefectOrReq(_ctx.booleanValue("UpdateLinkeBahamutPomuploadResponse.Result.TrunkMrNeedDefectOrReq"));
		result.setUseLinkQ(_ctx.booleanValue("UpdateLinkeBahamutPomuploadResponse.Result.UseLinkQ"));
		result.setUsePullRequestInAlipay(_ctx.booleanValue("UpdateLinkeBahamutPomuploadResponse.Result.UsePullRequestInAlipay"));
		result.setUseTenantQualityRule(_ctx.booleanValue("UpdateLinkeBahamutPomuploadResponse.Result.UseTenantQualityRule"));
		result.setVcs(_ctx.stringValue("UpdateLinkeBahamutPomuploadResponse.Result.Vcs"));
		result.setZoneMode(_ctx.stringValue("UpdateLinkeBahamutPomuploadResponse.Result.ZoneMode"));

		List<String> customQualityDisplay = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutPomuploadResponse.Result.CustomQualityDisplay.Length"); i++) {
			customQualityDisplay.add(_ctx.stringValue("UpdateLinkeBahamutPomuploadResponse.Result.CustomQualityDisplay["+ i +"]"));
		}
		result.setCustomQualityDisplay(customQualityDisplay);

		List<String> devOwners = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutPomuploadResponse.Result.DevOwners.Length"); i++) {
			devOwners.add(_ctx.stringValue("UpdateLinkeBahamutPomuploadResponse.Result.DevOwners["+ i +"]"));
		}
		result.setDevOwners(devOwners);

		List<String> devOwnerUsers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutPomuploadResponse.Result.DevOwnerUsers.Length"); i++) {
			devOwnerUsers.add(_ctx.stringValue("UpdateLinkeBahamutPomuploadResponse.Result.DevOwnerUsers["+ i +"]"));
		}
		result.setDevOwnerUsers(devOwnerUsers);

		List<String> iterationMembers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutPomuploadResponse.Result.IterationMembers.Length"); i++) {
			iterationMembers.add(_ctx.stringValue("UpdateLinkeBahamutPomuploadResponse.Result.IterationMembers["+ i +"]"));
		}
		result.setIterationMembers(iterationMembers);

		List<String> members = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutPomuploadResponse.Result.Members.Length"); i++) {
			members.add(_ctx.stringValue("UpdateLinkeBahamutPomuploadResponse.Result.Members["+ i +"]"));
		}
		result.setMembers(members);

		List<String> memberNames = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutPomuploadResponse.Result.MemberNames.Length"); i++) {
			memberNames.add(_ctx.stringValue("UpdateLinkeBahamutPomuploadResponse.Result.MemberNames["+ i +"]"));
		}
		result.setMemberNames(memberNames);

		List<String> modules = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutPomuploadResponse.Result.Modules.Length"); i++) {
			modules.add(_ctx.stringValue("UpdateLinkeBahamutPomuploadResponse.Result.Modules["+ i +"]"));
		}
		result.setModules(modules);

		List<String> notAllowSkipComponentName = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutPomuploadResponse.Result.NotAllowSkipComponentName.Length"); i++) {
			notAllowSkipComponentName.add(_ctx.stringValue("UpdateLinkeBahamutPomuploadResponse.Result.NotAllowSkipComponentName["+ i +"]"));
		}
		result.setNotAllowSkipComponentName(notAllowSkipComponentName);

		List<String> pes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutPomuploadResponse.Result.Pes.Length"); i++) {
			pes.add(_ctx.stringValue("UpdateLinkeBahamutPomuploadResponse.Result.Pes["+ i +"]"));
		}
		result.setPes(pes);

		List<String> productOwners = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutPomuploadResponse.Result.ProductOwners.Length"); i++) {
			productOwners.add(_ctx.stringValue("UpdateLinkeBahamutPomuploadResponse.Result.ProductOwners["+ i +"]"));
		}
		result.setProductOwners(productOwners);

		List<String> productTestOwners = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutPomuploadResponse.Result.ProductTestOwners.Length"); i++) {
			productTestOwners.add(_ctx.stringValue("UpdateLinkeBahamutPomuploadResponse.Result.ProductTestOwners["+ i +"]"));
		}
		result.setProductTestOwners(productTestOwners);

		List<String> pubOwners = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutPomuploadResponse.Result.PubOwners.Length"); i++) {
			pubOwners.add(_ctx.stringValue("UpdateLinkeBahamutPomuploadResponse.Result.PubOwners["+ i +"]"));
		}
		result.setPubOwners(pubOwners);

		List<String> qualityRules = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutPomuploadResponse.Result.QualityRules.Length"); i++) {
			qualityRules.add(_ctx.stringValue("UpdateLinkeBahamutPomuploadResponse.Result.QualityRules["+ i +"]"));
		}
		result.setQualityRules(qualityRules);

		List<String> testOwners = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutPomuploadResponse.Result.TestOwners.Length"); i++) {
			testOwners.add(_ctx.stringValue("UpdateLinkeBahamutPomuploadResponse.Result.TestOwners["+ i +"]"));
		}
		result.setTestOwners(testOwners);
		updateLinkeBahamutPomuploadResponse.setResult(result);
	 
	 	return updateLinkeBahamutPomuploadResponse;
	}
}