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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutAppstypesearchResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutAppstypesearchResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutAppstypesearchResponseUnmarshaller {

	public static GetLinkeBahamutAppstypesearchResponse unmarshall(GetLinkeBahamutAppstypesearchResponse getLinkeBahamutAppstypesearchResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutAppstypesearchResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutAppstypesearchResponse.RequestId"));
		getLinkeBahamutAppstypesearchResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutAppstypesearchResponse.ResultCode"));
		getLinkeBahamutAppstypesearchResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutAppstypesearchResponse.ResultMessage"));
		getLinkeBahamutAppstypesearchResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutAppstypesearchResponse.ErrorMessage"));
		getLinkeBahamutAppstypesearchResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutAppstypesearchResponse.ErrorMsgParamsMap"));
		getLinkeBahamutAppstypesearchResponse.setMessage(_ctx.stringValue("GetLinkeBahamutAppstypesearchResponse.Message"));
		getLinkeBahamutAppstypesearchResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutAppstypesearchResponse.ResponseStatusCode"));
		getLinkeBahamutAppstypesearchResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutAppstypesearchResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutAppstypesearchResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAppGroup(_ctx.stringValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].AppGroup"));
			resultItem.setAppTechStackName(_ctx.stringValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].AppTechStackName"));
			resultItem.setAppType(_ctx.stringValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].AppType"));
			resultItem.setAppTypeBackUp(_ctx.stringValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].AppTypeBackUp"));
			resultItem.setArchDomainExternalId(_ctx.stringValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].ArchDomainExternalId"));
			resultItem.setArchDomainMeta(_ctx.stringValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].ArchDomainMeta"));
			resultItem.setArchDomainName(_ctx.stringValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].ArchDomainName"));
			resultItem.setArchDomainSynacId(_ctx.longValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].ArchDomainSynacId"));
			resultItem.setAutoBetaSitDeploy(_ctx.booleanValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].AutoBetaSitDeploy"));
			resultItem.setBaseJarInfo(_ctx.stringValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].BaseJarInfo"));
			resultItem.setBetterQuality(_ctx.booleanValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].BetterQuality"));
			resultItem.setBlizzardRecordingAndPlaybackSmartTest(_ctx.booleanValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].BlizzardRecordingAndPlaybackSmartTest"));
			resultItem.setCloudDeployType(_ctx.stringValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].CloudDeployType"));
			resultItem.setCommonRiskPointInspection(_ctx.booleanValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].CommonRiskPointInspection"));
			resultItem.setContainerServiceName(_ctx.stringValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].ContainerServiceName"));
			resultItem.setCoverageBaseline(_ctx.stringValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].CoverageBaseline"));
			resultItem.setCoverageFromThirdPlatform(_ctx.booleanValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].CoverageFromThirdPlatform"));
			resultItem.setCreated(_ctx.longValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].Created"));
			resultItem.setCreateIterationNeedReq(_ctx.booleanValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].CreateIterationNeedReq"));
			resultItem.setCreateStageMergeTask(_ctx.booleanValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].CreateStageMergeTask"));
			resultItem.setCrucialApp(_ctx.booleanValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].CrucialApp"));
			resultItem.setCustomBuildType(_ctx.stringValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].CustomBuildType"));
			resultItem.setDbChangeEvaluate(_ctx.booleanValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].DbChangeEvaluate"));
			resultItem.setDeleted(_ctx.booleanValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].Deleted"));
			resultItem.setDevLang(_ctx.stringValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].DevLang"));
			resultItem.setDevServerDeployment(_ctx.booleanValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].DevServerDeployment"));
			resultItem.setDisplayName(_ctx.stringValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].DisplayName"));
			resultItem.setGitLabGroupName(_ctx.stringValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].GitLabGroupName"));
			resultItem.setGitLabHttpUrl(_ctx.stringValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].GitLabHttpUrl"));
			resultItem.setGitLabRepoName(_ctx.stringValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].GitLabRepoName"));
			resultItem.setGitLabSshUrl(_ctx.stringValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].GitLabSshUrl"));
			resultItem.setGreyEmergencyRelease(_ctx.booleanValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].GreyEmergencyRelease"));
			resultItem.setGreyRelease(_ctx.booleanValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].GreyRelease"));
			resultItem.setId(_ctx.stringValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].Id"));
			resultItem.setImage(_ctx.stringValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].Image"));
			resultItem.setLastModified(_ctx.longValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].LastModified"));
			resultItem.setLevel(_ctx.stringValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].Level"));
			resultItem.setLockBranch(_ctx.booleanValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].LockBranch"));
			resultItem.setName(_ctx.stringValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].Name"));
			resultItem.setNetRelease(_ctx.booleanValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].NetRelease"));
			resultItem.setOfflineAuthControl(_ctx.booleanValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].OfflineAuthControl"));
			resultItem.setOfflineZoneMode(_ctx.stringValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].OfflineZoneMode"));
			resultItem.setOnlineStatus(_ctx.stringValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].OnlineStatus"));
			resultItem.setOptionList(_ctx.stringValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].OptionList"));
			resultItem.setParentArchDomainExternalId(_ctx.stringValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].ParentArchDomainExternalId"));
			resultItem.setParentArchDomainName(_ctx.stringValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].ParentArchDomainName"));
			resultItem.setPriPubOwner(_ctx.stringValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].PriPubOwner"));
			resultItem.setReleaseDomainName(_ctx.stringValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].ReleaseDomainName"));
			resultItem.setReleaseType(_ctx.stringValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].ReleaseType"));
			resultItem.setRiskAssessNeeded(_ctx.booleanValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].RiskAssessNeeded"));
			resultItem.setServerDeployment(_ctx.booleanValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].ServerDeployment"));
			resultItem.setSitServerDeployment(_ctx.booleanValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].SitServerDeployment"));
			resultItem.setStableDeployMode(_ctx.stringValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].StableDeployMode"));
			resultItem.setStation(_ctx.stringValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].Station"));
			resultItem.setStatus(_ctx.stringValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].Status"));
			resultItem.setSynacId(_ctx.longValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].SynacId"));
			resultItem.setTcCenterPassRate(_ctx.booleanValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].TcCenterPassRate"));
			resultItem.setTenantId(_ctx.stringValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].TenantId"));
			resultItem.setTrunkMrNeedDefectOrReq(_ctx.booleanValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].TrunkMrNeedDefectOrReq"));
			resultItem.setUseLinkQ(_ctx.booleanValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].UseLinkQ"));
			resultItem.setUsePullRequestInAlipay(_ctx.booleanValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].UsePullRequestInAlipay"));
			resultItem.setUseTenantQualityRule(_ctx.booleanValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].UseTenantQualityRule"));
			resultItem.setVcs(_ctx.stringValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].Vcs"));
			resultItem.setZoneMode(_ctx.stringValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].ZoneMode"));

			List<String> customQualityDisplay = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].CustomQualityDisplay.Length"); j++) {
				customQualityDisplay.add(_ctx.stringValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].CustomQualityDisplay["+ j +"]"));
			}
			resultItem.setCustomQualityDisplay(customQualityDisplay);

			List<String> devOwners = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].DevOwners.Length"); j++) {
				devOwners.add(_ctx.stringValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].DevOwners["+ j +"]"));
			}
			resultItem.setDevOwners(devOwners);

			List<String> devOwnerUsers = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].DevOwnerUsers.Length"); j++) {
				devOwnerUsers.add(_ctx.stringValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].DevOwnerUsers["+ j +"]"));
			}
			resultItem.setDevOwnerUsers(devOwnerUsers);

			List<String> iterationMembers = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].IterationMembers.Length"); j++) {
				iterationMembers.add(_ctx.stringValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].IterationMembers["+ j +"]"));
			}
			resultItem.setIterationMembers(iterationMembers);

			List<String> members = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].Members.Length"); j++) {
				members.add(_ctx.stringValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].Members["+ j +"]"));
			}
			resultItem.setMembers(members);

			List<String> memberNames = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].MemberNames.Length"); j++) {
				memberNames.add(_ctx.stringValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].MemberNames["+ j +"]"));
			}
			resultItem.setMemberNames(memberNames);

			List<String> modules = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].Modules.Length"); j++) {
				modules.add(_ctx.stringValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].Modules["+ j +"]"));
			}
			resultItem.setModules(modules);

			List<String> notAllowSkipComponentName = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].NotAllowSkipComponentName.Length"); j++) {
				notAllowSkipComponentName.add(_ctx.stringValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].NotAllowSkipComponentName["+ j +"]"));
			}
			resultItem.setNotAllowSkipComponentName(notAllowSkipComponentName);

			List<String> pes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].Pes.Length"); j++) {
				pes.add(_ctx.stringValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].Pes["+ j +"]"));
			}
			resultItem.setPes(pes);

			List<String> productOwners = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].ProductOwners.Length"); j++) {
				productOwners.add(_ctx.stringValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].ProductOwners["+ j +"]"));
			}
			resultItem.setProductOwners(productOwners);

			List<String> productTestOwners = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].ProductTestOwners.Length"); j++) {
				productTestOwners.add(_ctx.stringValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].ProductTestOwners["+ j +"]"));
			}
			resultItem.setProductTestOwners(productTestOwners);

			List<String> pubOwners = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].PubOwners.Length"); j++) {
				pubOwners.add(_ctx.stringValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].PubOwners["+ j +"]"));
			}
			resultItem.setPubOwners(pubOwners);

			List<String> qualityRules = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].QualityRules.Length"); j++) {
				qualityRules.add(_ctx.stringValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].QualityRules["+ j +"]"));
			}
			resultItem.setQualityRules(qualityRules);

			List<String> testOwners = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].TestOwners.Length"); j++) {
				testOwners.add(_ctx.stringValue("GetLinkeBahamutAppstypesearchResponse.Result["+ i +"].TestOwners["+ j +"]"));
			}
			resultItem.setTestOwners(testOwners);

			result.add(resultItem);
		}
		getLinkeBahamutAppstypesearchResponse.setResult(result);
	 
	 	return getLinkeBahamutAppstypesearchResponse;
	}
}