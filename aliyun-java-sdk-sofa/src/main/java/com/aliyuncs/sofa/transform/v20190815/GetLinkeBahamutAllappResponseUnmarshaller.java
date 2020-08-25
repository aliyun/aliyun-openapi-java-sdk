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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutAllappResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutAllappResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutAllappResponseUnmarshaller {

	public static GetLinkeBahamutAllappResponse unmarshall(GetLinkeBahamutAllappResponse getLinkeBahamutAllappResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutAllappResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutAllappResponse.RequestId"));
		getLinkeBahamutAllappResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutAllappResponse.ResultCode"));
		getLinkeBahamutAllappResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutAllappResponse.ResultMessage"));
		getLinkeBahamutAllappResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutAllappResponse.ErrorMessage"));
		getLinkeBahamutAllappResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutAllappResponse.ErrorMsgParamsMap"));
		getLinkeBahamutAllappResponse.setMessage(_ctx.stringValue("GetLinkeBahamutAllappResponse.Message"));
		getLinkeBahamutAllappResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutAllappResponse.ResponseStatusCode"));
		getLinkeBahamutAllappResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutAllappResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutAllappResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAppGroup(_ctx.stringValue("GetLinkeBahamutAllappResponse.Result["+ i +"].AppGroup"));
			resultItem.setAppTechStackName(_ctx.stringValue("GetLinkeBahamutAllappResponse.Result["+ i +"].AppTechStackName"));
			resultItem.setAppType(_ctx.stringValue("GetLinkeBahamutAllappResponse.Result["+ i +"].AppType"));
			resultItem.setAppTypeBackUp(_ctx.stringValue("GetLinkeBahamutAllappResponse.Result["+ i +"].AppTypeBackUp"));
			resultItem.setArchDomainExternalId(_ctx.stringValue("GetLinkeBahamutAllappResponse.Result["+ i +"].ArchDomainExternalId"));
			resultItem.setArchDomainMeta(_ctx.stringValue("GetLinkeBahamutAllappResponse.Result["+ i +"].ArchDomainMeta"));
			resultItem.setArchDomainName(_ctx.stringValue("GetLinkeBahamutAllappResponse.Result["+ i +"].ArchDomainName"));
			resultItem.setArchDomainSynacId(_ctx.longValue("GetLinkeBahamutAllappResponse.Result["+ i +"].ArchDomainSynacId"));
			resultItem.setAutoBetaSitDeploy(_ctx.booleanValue("GetLinkeBahamutAllappResponse.Result["+ i +"].AutoBetaSitDeploy"));
			resultItem.setBaseJarInfo(_ctx.stringValue("GetLinkeBahamutAllappResponse.Result["+ i +"].BaseJarInfo"));
			resultItem.setBetterQuality(_ctx.booleanValue("GetLinkeBahamutAllappResponse.Result["+ i +"].BetterQuality"));
			resultItem.setBlizzardRecordingAndPlaybackSmartTest(_ctx.booleanValue("GetLinkeBahamutAllappResponse.Result["+ i +"].BlizzardRecordingAndPlaybackSmartTest"));
			resultItem.setCloudDeployType(_ctx.stringValue("GetLinkeBahamutAllappResponse.Result["+ i +"].CloudDeployType"));
			resultItem.setCommonRiskPointInspection(_ctx.booleanValue("GetLinkeBahamutAllappResponse.Result["+ i +"].CommonRiskPointInspection"));
			resultItem.setContainerServiceName(_ctx.stringValue("GetLinkeBahamutAllappResponse.Result["+ i +"].ContainerServiceName"));
			resultItem.setCoverageBaseline(_ctx.stringValue("GetLinkeBahamutAllappResponse.Result["+ i +"].CoverageBaseline"));
			resultItem.setCoverageFromThirdPlatform(_ctx.booleanValue("GetLinkeBahamutAllappResponse.Result["+ i +"].CoverageFromThirdPlatform"));
			resultItem.setCreated(_ctx.longValue("GetLinkeBahamutAllappResponse.Result["+ i +"].Created"));
			resultItem.setCreateIterationNeedReq(_ctx.booleanValue("GetLinkeBahamutAllappResponse.Result["+ i +"].CreateIterationNeedReq"));
			resultItem.setCreateStageMergeTask(_ctx.booleanValue("GetLinkeBahamutAllappResponse.Result["+ i +"].CreateStageMergeTask"));
			resultItem.setCrucialApp(_ctx.booleanValue("GetLinkeBahamutAllappResponse.Result["+ i +"].CrucialApp"));
			resultItem.setCustomBuildType(_ctx.stringValue("GetLinkeBahamutAllappResponse.Result["+ i +"].CustomBuildType"));
			resultItem.setDbChangeEvaluate(_ctx.booleanValue("GetLinkeBahamutAllappResponse.Result["+ i +"].DbChangeEvaluate"));
			resultItem.setDeleted(_ctx.booleanValue("GetLinkeBahamutAllappResponse.Result["+ i +"].Deleted"));
			resultItem.setDevLang(_ctx.stringValue("GetLinkeBahamutAllappResponse.Result["+ i +"].DevLang"));
			resultItem.setDevServerDeployment(_ctx.booleanValue("GetLinkeBahamutAllappResponse.Result["+ i +"].DevServerDeployment"));
			resultItem.setDisplayName(_ctx.stringValue("GetLinkeBahamutAllappResponse.Result["+ i +"].DisplayName"));
			resultItem.setGitLabGroupName(_ctx.stringValue("GetLinkeBahamutAllappResponse.Result["+ i +"].GitLabGroupName"));
			resultItem.setGitLabHttpUrl(_ctx.stringValue("GetLinkeBahamutAllappResponse.Result["+ i +"].GitLabHttpUrl"));
			resultItem.setGitLabRepoName(_ctx.stringValue("GetLinkeBahamutAllappResponse.Result["+ i +"].GitLabRepoName"));
			resultItem.setGitLabSshUrl(_ctx.stringValue("GetLinkeBahamutAllappResponse.Result["+ i +"].GitLabSshUrl"));
			resultItem.setGreyEmergencyRelease(_ctx.booleanValue("GetLinkeBahamutAllappResponse.Result["+ i +"].GreyEmergencyRelease"));
			resultItem.setGreyRelease(_ctx.booleanValue("GetLinkeBahamutAllappResponse.Result["+ i +"].GreyRelease"));
			resultItem.setId(_ctx.stringValue("GetLinkeBahamutAllappResponse.Result["+ i +"].Id"));
			resultItem.setImage(_ctx.stringValue("GetLinkeBahamutAllappResponse.Result["+ i +"].Image"));
			resultItem.setLastModified(_ctx.longValue("GetLinkeBahamutAllappResponse.Result["+ i +"].LastModified"));
			resultItem.setLevel(_ctx.stringValue("GetLinkeBahamutAllappResponse.Result["+ i +"].Level"));
			resultItem.setLockBranch(_ctx.booleanValue("GetLinkeBahamutAllappResponse.Result["+ i +"].LockBranch"));
			resultItem.setName(_ctx.stringValue("GetLinkeBahamutAllappResponse.Result["+ i +"].Name"));
			resultItem.setNetRelease(_ctx.booleanValue("GetLinkeBahamutAllappResponse.Result["+ i +"].NetRelease"));
			resultItem.setOfflineAuthControl(_ctx.booleanValue("GetLinkeBahamutAllappResponse.Result["+ i +"].OfflineAuthControl"));
			resultItem.setOfflineZoneMode(_ctx.stringValue("GetLinkeBahamutAllappResponse.Result["+ i +"].OfflineZoneMode"));
			resultItem.setOnlineStatus(_ctx.stringValue("GetLinkeBahamutAllappResponse.Result["+ i +"].OnlineStatus"));
			resultItem.setOptionList(_ctx.stringValue("GetLinkeBahamutAllappResponse.Result["+ i +"].OptionList"));
			resultItem.setParentArchDomainExternalId(_ctx.stringValue("GetLinkeBahamutAllappResponse.Result["+ i +"].ParentArchDomainExternalId"));
			resultItem.setParentArchDomainName(_ctx.stringValue("GetLinkeBahamutAllappResponse.Result["+ i +"].ParentArchDomainName"));
			resultItem.setPriPubOwner(_ctx.stringValue("GetLinkeBahamutAllappResponse.Result["+ i +"].PriPubOwner"));
			resultItem.setReleaseDomainName(_ctx.stringValue("GetLinkeBahamutAllappResponse.Result["+ i +"].ReleaseDomainName"));
			resultItem.setReleaseType(_ctx.stringValue("GetLinkeBahamutAllappResponse.Result["+ i +"].ReleaseType"));
			resultItem.setRiskAssessNeeded(_ctx.booleanValue("GetLinkeBahamutAllappResponse.Result["+ i +"].RiskAssessNeeded"));
			resultItem.setServerDeployment(_ctx.booleanValue("GetLinkeBahamutAllappResponse.Result["+ i +"].ServerDeployment"));
			resultItem.setSitServerDeployment(_ctx.booleanValue("GetLinkeBahamutAllappResponse.Result["+ i +"].SitServerDeployment"));
			resultItem.setStableDeployMode(_ctx.stringValue("GetLinkeBahamutAllappResponse.Result["+ i +"].StableDeployMode"));
			resultItem.setStation(_ctx.stringValue("GetLinkeBahamutAllappResponse.Result["+ i +"].Station"));
			resultItem.setStatus(_ctx.stringValue("GetLinkeBahamutAllappResponse.Result["+ i +"].Status"));
			resultItem.setSynacId(_ctx.longValue("GetLinkeBahamutAllappResponse.Result["+ i +"].SynacId"));
			resultItem.setTcCenterPassRate(_ctx.booleanValue("GetLinkeBahamutAllappResponse.Result["+ i +"].TcCenterPassRate"));
			resultItem.setTenantId(_ctx.stringValue("GetLinkeBahamutAllappResponse.Result["+ i +"].TenantId"));
			resultItem.setTrunkMrNeedDefectOrReq(_ctx.booleanValue("GetLinkeBahamutAllappResponse.Result["+ i +"].TrunkMrNeedDefectOrReq"));
			resultItem.setUseLinkQ(_ctx.booleanValue("GetLinkeBahamutAllappResponse.Result["+ i +"].UseLinkQ"));
			resultItem.setUsePullRequestInAlipay(_ctx.booleanValue("GetLinkeBahamutAllappResponse.Result["+ i +"].UsePullRequestInAlipay"));
			resultItem.setUseTenantQualityRule(_ctx.booleanValue("GetLinkeBahamutAllappResponse.Result["+ i +"].UseTenantQualityRule"));
			resultItem.setVcs(_ctx.stringValue("GetLinkeBahamutAllappResponse.Result["+ i +"].Vcs"));
			resultItem.setZoneMode(_ctx.stringValue("GetLinkeBahamutAllappResponse.Result["+ i +"].ZoneMode"));

			List<String> customQualityDisplay = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAllappResponse.Result["+ i +"].CustomQualityDisplay.Length"); j++) {
				customQualityDisplay.add(_ctx.stringValue("GetLinkeBahamutAllappResponse.Result["+ i +"].CustomQualityDisplay["+ j +"]"));
			}
			resultItem.setCustomQualityDisplay(customQualityDisplay);

			List<String> devOwners = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAllappResponse.Result["+ i +"].DevOwners.Length"); j++) {
				devOwners.add(_ctx.stringValue("GetLinkeBahamutAllappResponse.Result["+ i +"].DevOwners["+ j +"]"));
			}
			resultItem.setDevOwners(devOwners);

			List<String> devOwnerUsers = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAllappResponse.Result["+ i +"].DevOwnerUsers.Length"); j++) {
				devOwnerUsers.add(_ctx.stringValue("GetLinkeBahamutAllappResponse.Result["+ i +"].DevOwnerUsers["+ j +"]"));
			}
			resultItem.setDevOwnerUsers(devOwnerUsers);

			List<String> iterationMembers = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAllappResponse.Result["+ i +"].IterationMembers.Length"); j++) {
				iterationMembers.add(_ctx.stringValue("GetLinkeBahamutAllappResponse.Result["+ i +"].IterationMembers["+ j +"]"));
			}
			resultItem.setIterationMembers(iterationMembers);

			List<String> members = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAllappResponse.Result["+ i +"].Members.Length"); j++) {
				members.add(_ctx.stringValue("GetLinkeBahamutAllappResponse.Result["+ i +"].Members["+ j +"]"));
			}
			resultItem.setMembers(members);

			List<String> memberNames = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAllappResponse.Result["+ i +"].MemberNames.Length"); j++) {
				memberNames.add(_ctx.stringValue("GetLinkeBahamutAllappResponse.Result["+ i +"].MemberNames["+ j +"]"));
			}
			resultItem.setMemberNames(memberNames);

			List<String> modules = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAllappResponse.Result["+ i +"].Modules.Length"); j++) {
				modules.add(_ctx.stringValue("GetLinkeBahamutAllappResponse.Result["+ i +"].Modules["+ j +"]"));
			}
			resultItem.setModules(modules);

			List<String> notAllowSkipComponentName = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAllappResponse.Result["+ i +"].NotAllowSkipComponentName.Length"); j++) {
				notAllowSkipComponentName.add(_ctx.stringValue("GetLinkeBahamutAllappResponse.Result["+ i +"].NotAllowSkipComponentName["+ j +"]"));
			}
			resultItem.setNotAllowSkipComponentName(notAllowSkipComponentName);

			List<String> pes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAllappResponse.Result["+ i +"].Pes.Length"); j++) {
				pes.add(_ctx.stringValue("GetLinkeBahamutAllappResponse.Result["+ i +"].Pes["+ j +"]"));
			}
			resultItem.setPes(pes);

			List<String> productOwners = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAllappResponse.Result["+ i +"].ProductOwners.Length"); j++) {
				productOwners.add(_ctx.stringValue("GetLinkeBahamutAllappResponse.Result["+ i +"].ProductOwners["+ j +"]"));
			}
			resultItem.setProductOwners(productOwners);

			List<String> productTestOwners = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAllappResponse.Result["+ i +"].ProductTestOwners.Length"); j++) {
				productTestOwners.add(_ctx.stringValue("GetLinkeBahamutAllappResponse.Result["+ i +"].ProductTestOwners["+ j +"]"));
			}
			resultItem.setProductTestOwners(productTestOwners);

			List<String> pubOwners = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAllappResponse.Result["+ i +"].PubOwners.Length"); j++) {
				pubOwners.add(_ctx.stringValue("GetLinkeBahamutAllappResponse.Result["+ i +"].PubOwners["+ j +"]"));
			}
			resultItem.setPubOwners(pubOwners);

			List<String> qualityRules = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAllappResponse.Result["+ i +"].QualityRules.Length"); j++) {
				qualityRules.add(_ctx.stringValue("GetLinkeBahamutAllappResponse.Result["+ i +"].QualityRules["+ j +"]"));
			}
			resultItem.setQualityRules(qualityRules);

			List<String> testOwners = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAllappResponse.Result["+ i +"].TestOwners.Length"); j++) {
				testOwners.add(_ctx.stringValue("GetLinkeBahamutAllappResponse.Result["+ i +"].TestOwners["+ j +"]"));
			}
			resultItem.setTestOwners(testOwners);

			result.add(resultItem);
		}
		getLinkeBahamutAllappResponse.setResult(result);
	 
	 	return getLinkeBahamutAllappResponse;
	}
}