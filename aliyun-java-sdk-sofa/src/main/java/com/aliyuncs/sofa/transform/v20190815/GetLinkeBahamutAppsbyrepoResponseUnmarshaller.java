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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutAppsbyrepoResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutAppsbyrepoResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutAppsbyrepoResponseUnmarshaller {

	public static GetLinkeBahamutAppsbyrepoResponse unmarshall(GetLinkeBahamutAppsbyrepoResponse getLinkeBahamutAppsbyrepoResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutAppsbyrepoResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutAppsbyrepoResponse.RequestId"));
		getLinkeBahamutAppsbyrepoResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutAppsbyrepoResponse.ResultCode"));
		getLinkeBahamutAppsbyrepoResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutAppsbyrepoResponse.ResultMessage"));
		getLinkeBahamutAppsbyrepoResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutAppsbyrepoResponse.ErrorMessage"));
		getLinkeBahamutAppsbyrepoResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutAppsbyrepoResponse.ErrorMsgParamsMap"));
		getLinkeBahamutAppsbyrepoResponse.setMessage(_ctx.stringValue("GetLinkeBahamutAppsbyrepoResponse.Message"));
		getLinkeBahamutAppsbyrepoResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutAppsbyrepoResponse.ResponseStatusCode"));
		getLinkeBahamutAppsbyrepoResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutAppsbyrepoResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutAppsbyrepoResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAppGroup(_ctx.stringValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].AppGroup"));
			resultItem.setAppTechStackName(_ctx.stringValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].AppTechStackName"));
			resultItem.setAppType(_ctx.stringValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].AppType"));
			resultItem.setAppTypeBackUp(_ctx.stringValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].AppTypeBackUp"));
			resultItem.setArchDomainExternalId(_ctx.stringValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].ArchDomainExternalId"));
			resultItem.setArchDomainMeta(_ctx.stringValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].ArchDomainMeta"));
			resultItem.setArchDomainName(_ctx.stringValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].ArchDomainName"));
			resultItem.setArchDomainSynacId(_ctx.longValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].ArchDomainSynacId"));
			resultItem.setAutoBetaSitDeploy(_ctx.booleanValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].AutoBetaSitDeploy"));
			resultItem.setBaseJarInfo(_ctx.stringValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].BaseJarInfo"));
			resultItem.setBetterQuality(_ctx.booleanValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].BetterQuality"));
			resultItem.setBlizzardRecordingAndPlaybackSmartTest(_ctx.booleanValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].BlizzardRecordingAndPlaybackSmartTest"));
			resultItem.setCloudDeployType(_ctx.stringValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].CloudDeployType"));
			resultItem.setCommonRiskPointInspection(_ctx.booleanValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].CommonRiskPointInspection"));
			resultItem.setContainerServiceName(_ctx.stringValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].ContainerServiceName"));
			resultItem.setCoverageBaseline(_ctx.stringValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].CoverageBaseline"));
			resultItem.setCoverageFromThirdPlatform(_ctx.booleanValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].CoverageFromThirdPlatform"));
			resultItem.setCreated(_ctx.longValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].Created"));
			resultItem.setCreateIterationNeedReq(_ctx.booleanValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].CreateIterationNeedReq"));
			resultItem.setCreateStageMergeTask(_ctx.booleanValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].CreateStageMergeTask"));
			resultItem.setCrucialApp(_ctx.booleanValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].CrucialApp"));
			resultItem.setCustomBuildType(_ctx.stringValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].CustomBuildType"));
			resultItem.setDbChangeEvaluate(_ctx.booleanValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].DbChangeEvaluate"));
			resultItem.setDeleted(_ctx.booleanValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].Deleted"));
			resultItem.setDevLang(_ctx.stringValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].DevLang"));
			resultItem.setDevServerDeployment(_ctx.booleanValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].DevServerDeployment"));
			resultItem.setDisplayName(_ctx.stringValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].DisplayName"));
			resultItem.setGitLabGroupName(_ctx.stringValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].GitLabGroupName"));
			resultItem.setGitLabHttpUrl(_ctx.stringValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].GitLabHttpUrl"));
			resultItem.setGitLabRepoName(_ctx.stringValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].GitLabRepoName"));
			resultItem.setGitLabSshUrl(_ctx.stringValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].GitLabSshUrl"));
			resultItem.setGreyEmergencyRelease(_ctx.booleanValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].GreyEmergencyRelease"));
			resultItem.setGreyRelease(_ctx.booleanValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].GreyRelease"));
			resultItem.setId(_ctx.stringValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].Id"));
			resultItem.setImage(_ctx.stringValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].Image"));
			resultItem.setLastModified(_ctx.longValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].LastModified"));
			resultItem.setLevel(_ctx.stringValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].Level"));
			resultItem.setLockBranch(_ctx.booleanValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].LockBranch"));
			resultItem.setName(_ctx.stringValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].Name"));
			resultItem.setNetRelease(_ctx.booleanValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].NetRelease"));
			resultItem.setOfflineAuthControl(_ctx.booleanValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].OfflineAuthControl"));
			resultItem.setOfflineZoneMode(_ctx.stringValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].OfflineZoneMode"));
			resultItem.setOnlineStatus(_ctx.stringValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].OnlineStatus"));
			resultItem.setOptionList(_ctx.stringValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].OptionList"));
			resultItem.setParentArchDomainExternalId(_ctx.stringValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].ParentArchDomainExternalId"));
			resultItem.setParentArchDomainName(_ctx.stringValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].ParentArchDomainName"));
			resultItem.setPriPubOwner(_ctx.stringValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].PriPubOwner"));
			resultItem.setReleaseDomainName(_ctx.stringValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].ReleaseDomainName"));
			resultItem.setReleaseType(_ctx.stringValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].ReleaseType"));
			resultItem.setRiskAssessNeeded(_ctx.booleanValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].RiskAssessNeeded"));
			resultItem.setServerDeployment(_ctx.booleanValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].ServerDeployment"));
			resultItem.setSitServerDeployment(_ctx.booleanValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].SitServerDeployment"));
			resultItem.setStableDeployMode(_ctx.stringValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].StableDeployMode"));
			resultItem.setStation(_ctx.stringValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].Station"));
			resultItem.setStatus(_ctx.stringValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].Status"));
			resultItem.setSynacId(_ctx.longValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].SynacId"));
			resultItem.setTcCenterPassRate(_ctx.booleanValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].TcCenterPassRate"));
			resultItem.setTenantId(_ctx.stringValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].TenantId"));
			resultItem.setTrunkMrNeedDefectOrReq(_ctx.booleanValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].TrunkMrNeedDefectOrReq"));
			resultItem.setUseLinkQ(_ctx.booleanValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].UseLinkQ"));
			resultItem.setUsePullRequestInAlipay(_ctx.booleanValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].UsePullRequestInAlipay"));
			resultItem.setUseTenantQualityRule(_ctx.booleanValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].UseTenantQualityRule"));
			resultItem.setVcs(_ctx.stringValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].Vcs"));
			resultItem.setZoneMode(_ctx.stringValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].ZoneMode"));

			List<String> customQualityDisplay = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].CustomQualityDisplay.Length"); j++) {
				customQualityDisplay.add(_ctx.stringValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].CustomQualityDisplay["+ j +"]"));
			}
			resultItem.setCustomQualityDisplay(customQualityDisplay);

			List<String> devOwners = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].DevOwners.Length"); j++) {
				devOwners.add(_ctx.stringValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].DevOwners["+ j +"]"));
			}
			resultItem.setDevOwners(devOwners);

			List<String> devOwnerUsers = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].DevOwnerUsers.Length"); j++) {
				devOwnerUsers.add(_ctx.stringValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].DevOwnerUsers["+ j +"]"));
			}
			resultItem.setDevOwnerUsers(devOwnerUsers);

			List<String> iterationMembers = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].IterationMembers.Length"); j++) {
				iterationMembers.add(_ctx.stringValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].IterationMembers["+ j +"]"));
			}
			resultItem.setIterationMembers(iterationMembers);

			List<String> members = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].Members.Length"); j++) {
				members.add(_ctx.stringValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].Members["+ j +"]"));
			}
			resultItem.setMembers(members);

			List<String> memberNames = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].MemberNames.Length"); j++) {
				memberNames.add(_ctx.stringValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].MemberNames["+ j +"]"));
			}
			resultItem.setMemberNames(memberNames);

			List<String> modules = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].Modules.Length"); j++) {
				modules.add(_ctx.stringValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].Modules["+ j +"]"));
			}
			resultItem.setModules(modules);

			List<String> notAllowSkipComponentName = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].NotAllowSkipComponentName.Length"); j++) {
				notAllowSkipComponentName.add(_ctx.stringValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].NotAllowSkipComponentName["+ j +"]"));
			}
			resultItem.setNotAllowSkipComponentName(notAllowSkipComponentName);

			List<String> pes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].Pes.Length"); j++) {
				pes.add(_ctx.stringValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].Pes["+ j +"]"));
			}
			resultItem.setPes(pes);

			List<String> productOwners = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].ProductOwners.Length"); j++) {
				productOwners.add(_ctx.stringValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].ProductOwners["+ j +"]"));
			}
			resultItem.setProductOwners(productOwners);

			List<String> productTestOwners = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].ProductTestOwners.Length"); j++) {
				productTestOwners.add(_ctx.stringValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].ProductTestOwners["+ j +"]"));
			}
			resultItem.setProductTestOwners(productTestOwners);

			List<String> pubOwners = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].PubOwners.Length"); j++) {
				pubOwners.add(_ctx.stringValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].PubOwners["+ j +"]"));
			}
			resultItem.setPubOwners(pubOwners);

			List<String> qualityRules = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].QualityRules.Length"); j++) {
				qualityRules.add(_ctx.stringValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].QualityRules["+ j +"]"));
			}
			resultItem.setQualityRules(qualityRules);

			List<String> testOwners = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].TestOwners.Length"); j++) {
				testOwners.add(_ctx.stringValue("GetLinkeBahamutAppsbyrepoResponse.Result["+ i +"].TestOwners["+ j +"]"));
			}
			resultItem.setTestOwners(testOwners);

			result.add(resultItem);
		}
		getLinkeBahamutAppsbyrepoResponse.setResult(result);
	 
	 	return getLinkeBahamutAppsbyrepoResponse;
	}
}