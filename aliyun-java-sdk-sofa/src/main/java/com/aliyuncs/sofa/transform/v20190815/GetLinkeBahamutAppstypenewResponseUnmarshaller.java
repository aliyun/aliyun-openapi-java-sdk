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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutAppstypenewResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutAppstypenewResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutAppstypenewResponseUnmarshaller {

	public static GetLinkeBahamutAppstypenewResponse unmarshall(GetLinkeBahamutAppstypenewResponse getLinkeBahamutAppstypenewResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutAppstypenewResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutAppstypenewResponse.RequestId"));
		getLinkeBahamutAppstypenewResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutAppstypenewResponse.ResultCode"));
		getLinkeBahamutAppstypenewResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutAppstypenewResponse.ResultMessage"));
		getLinkeBahamutAppstypenewResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutAppstypenewResponse.ErrorMessage"));
		getLinkeBahamutAppstypenewResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutAppstypenewResponse.ErrorMsgParamsMap"));
		getLinkeBahamutAppstypenewResponse.setMessage(_ctx.stringValue("GetLinkeBahamutAppstypenewResponse.Message"));
		getLinkeBahamutAppstypenewResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutAppstypenewResponse.ResponseStatusCode"));
		getLinkeBahamutAppstypenewResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutAppstypenewResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutAppstypenewResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAppGroup(_ctx.stringValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].AppGroup"));
			resultItem.setAppTechStackName(_ctx.stringValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].AppTechStackName"));
			resultItem.setAppType(_ctx.stringValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].AppType"));
			resultItem.setAppTypeBackUp(_ctx.stringValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].AppTypeBackUp"));
			resultItem.setArchDomainExternalId(_ctx.stringValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].ArchDomainExternalId"));
			resultItem.setArchDomainMeta(_ctx.stringValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].ArchDomainMeta"));
			resultItem.setArchDomainName(_ctx.stringValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].ArchDomainName"));
			resultItem.setArchDomainSynacId(_ctx.longValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].ArchDomainSynacId"));
			resultItem.setAutoBetaSitDeploy(_ctx.booleanValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].AutoBetaSitDeploy"));
			resultItem.setBaseJarInfo(_ctx.stringValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].BaseJarInfo"));
			resultItem.setBetterQuality(_ctx.booleanValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].BetterQuality"));
			resultItem.setBlizzardRecordingAndPlaybackSmartTest(_ctx.booleanValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].BlizzardRecordingAndPlaybackSmartTest"));
			resultItem.setCloudDeployType(_ctx.stringValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].CloudDeployType"));
			resultItem.setCommonRiskPointInspection(_ctx.booleanValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].CommonRiskPointInspection"));
			resultItem.setContainerServiceName(_ctx.stringValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].ContainerServiceName"));
			resultItem.setCoverageBaseline(_ctx.stringValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].CoverageBaseline"));
			resultItem.setCoverageFromThirdPlatform(_ctx.booleanValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].CoverageFromThirdPlatform"));
			resultItem.setCreated(_ctx.longValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].Created"));
			resultItem.setCreateIterationNeedReq(_ctx.booleanValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].CreateIterationNeedReq"));
			resultItem.setCreateStageMergeTask(_ctx.booleanValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].CreateStageMergeTask"));
			resultItem.setCrucialApp(_ctx.booleanValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].CrucialApp"));
			resultItem.setCustomBuildType(_ctx.stringValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].CustomBuildType"));
			resultItem.setDbChangeEvaluate(_ctx.booleanValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].DbChangeEvaluate"));
			resultItem.setDeleted(_ctx.booleanValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].Deleted"));
			resultItem.setDevLang(_ctx.stringValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].DevLang"));
			resultItem.setDevServerDeployment(_ctx.booleanValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].DevServerDeployment"));
			resultItem.setDisplayName(_ctx.stringValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].DisplayName"));
			resultItem.setGitLabGroupName(_ctx.stringValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].GitLabGroupName"));
			resultItem.setGitLabHttpUrl(_ctx.stringValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].GitLabHttpUrl"));
			resultItem.setGitLabRepoName(_ctx.stringValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].GitLabRepoName"));
			resultItem.setGitLabSshUrl(_ctx.stringValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].GitLabSshUrl"));
			resultItem.setGreyEmergencyRelease(_ctx.booleanValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].GreyEmergencyRelease"));
			resultItem.setGreyRelease(_ctx.booleanValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].GreyRelease"));
			resultItem.setId(_ctx.stringValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].Id"));
			resultItem.setImage(_ctx.stringValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].Image"));
			resultItem.setLastModified(_ctx.longValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].LastModified"));
			resultItem.setLevel(_ctx.stringValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].Level"));
			resultItem.setLockBranch(_ctx.booleanValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].LockBranch"));
			resultItem.setName(_ctx.stringValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].Name"));
			resultItem.setNetRelease(_ctx.booleanValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].NetRelease"));
			resultItem.setOfflineAuthControl(_ctx.booleanValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].OfflineAuthControl"));
			resultItem.setOfflineZoneMode(_ctx.stringValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].OfflineZoneMode"));
			resultItem.setOnlineStatus(_ctx.stringValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].OnlineStatus"));
			resultItem.setOptionList(_ctx.stringValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].OptionList"));
			resultItem.setParentArchDomainExternalId(_ctx.stringValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].ParentArchDomainExternalId"));
			resultItem.setParentArchDomainName(_ctx.stringValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].ParentArchDomainName"));
			resultItem.setPriPubOwner(_ctx.stringValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].PriPubOwner"));
			resultItem.setReleaseDomainName(_ctx.stringValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].ReleaseDomainName"));
			resultItem.setReleaseType(_ctx.stringValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].ReleaseType"));
			resultItem.setRiskAssessNeeded(_ctx.booleanValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].RiskAssessNeeded"));
			resultItem.setServerDeployment(_ctx.booleanValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].ServerDeployment"));
			resultItem.setSitServerDeployment(_ctx.booleanValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].SitServerDeployment"));
			resultItem.setStableDeployMode(_ctx.stringValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].StableDeployMode"));
			resultItem.setStation(_ctx.stringValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].Station"));
			resultItem.setStatus(_ctx.stringValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].Status"));
			resultItem.setSynacId(_ctx.longValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].SynacId"));
			resultItem.setTcCenterPassRate(_ctx.booleanValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].TcCenterPassRate"));
			resultItem.setTenantId(_ctx.stringValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].TenantId"));
			resultItem.setTrunkMrNeedDefectOrReq(_ctx.booleanValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].TrunkMrNeedDefectOrReq"));
			resultItem.setUseLinkQ(_ctx.booleanValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].UseLinkQ"));
			resultItem.setUsePullRequestInAlipay(_ctx.booleanValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].UsePullRequestInAlipay"));
			resultItem.setUseTenantQualityRule(_ctx.booleanValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].UseTenantQualityRule"));
			resultItem.setVcs(_ctx.stringValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].Vcs"));
			resultItem.setZoneMode(_ctx.stringValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].ZoneMode"));

			List<String> customQualityDisplay = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].CustomQualityDisplay.Length"); j++) {
				customQualityDisplay.add(_ctx.stringValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].CustomQualityDisplay["+ j +"]"));
			}
			resultItem.setCustomQualityDisplay(customQualityDisplay);

			List<String> devOwners = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].DevOwners.Length"); j++) {
				devOwners.add(_ctx.stringValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].DevOwners["+ j +"]"));
			}
			resultItem.setDevOwners(devOwners);

			List<String> devOwnerUsers = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].DevOwnerUsers.Length"); j++) {
				devOwnerUsers.add(_ctx.stringValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].DevOwnerUsers["+ j +"]"));
			}
			resultItem.setDevOwnerUsers(devOwnerUsers);

			List<String> iterationMembers = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].IterationMembers.Length"); j++) {
				iterationMembers.add(_ctx.stringValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].IterationMembers["+ j +"]"));
			}
			resultItem.setIterationMembers(iterationMembers);

			List<String> members = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].Members.Length"); j++) {
				members.add(_ctx.stringValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].Members["+ j +"]"));
			}
			resultItem.setMembers(members);

			List<String> memberNames = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].MemberNames.Length"); j++) {
				memberNames.add(_ctx.stringValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].MemberNames["+ j +"]"));
			}
			resultItem.setMemberNames(memberNames);

			List<String> modules = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].Modules.Length"); j++) {
				modules.add(_ctx.stringValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].Modules["+ j +"]"));
			}
			resultItem.setModules(modules);

			List<String> notAllowSkipComponentName = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].NotAllowSkipComponentName.Length"); j++) {
				notAllowSkipComponentName.add(_ctx.stringValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].NotAllowSkipComponentName["+ j +"]"));
			}
			resultItem.setNotAllowSkipComponentName(notAllowSkipComponentName);

			List<String> pes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].Pes.Length"); j++) {
				pes.add(_ctx.stringValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].Pes["+ j +"]"));
			}
			resultItem.setPes(pes);

			List<String> productOwners = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].ProductOwners.Length"); j++) {
				productOwners.add(_ctx.stringValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].ProductOwners["+ j +"]"));
			}
			resultItem.setProductOwners(productOwners);

			List<String> productTestOwners = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].ProductTestOwners.Length"); j++) {
				productTestOwners.add(_ctx.stringValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].ProductTestOwners["+ j +"]"));
			}
			resultItem.setProductTestOwners(productTestOwners);

			List<String> pubOwners = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].PubOwners.Length"); j++) {
				pubOwners.add(_ctx.stringValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].PubOwners["+ j +"]"));
			}
			resultItem.setPubOwners(pubOwners);

			List<String> qualityRules = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].QualityRules.Length"); j++) {
				qualityRules.add(_ctx.stringValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].QualityRules["+ j +"]"));
			}
			resultItem.setQualityRules(qualityRules);

			List<String> testOwners = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].TestOwners.Length"); j++) {
				testOwners.add(_ctx.stringValue("GetLinkeBahamutAppstypenewResponse.Result["+ i +"].TestOwners["+ j +"]"));
			}
			resultItem.setTestOwners(testOwners);

			result.add(resultItem);
		}
		getLinkeBahamutAppstypenewResponse.setResult(result);
	 
	 	return getLinkeBahamutAppstypenewResponse;
	}
}