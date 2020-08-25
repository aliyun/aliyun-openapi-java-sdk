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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutAppmetalistResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutAppmetalistResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutAppmetalistResponseUnmarshaller {

	public static GetLinkeBahamutAppmetalistResponse unmarshall(GetLinkeBahamutAppmetalistResponse getLinkeBahamutAppmetalistResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutAppmetalistResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutAppmetalistResponse.RequestId"));
		getLinkeBahamutAppmetalistResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutAppmetalistResponse.ResultCode"));
		getLinkeBahamutAppmetalistResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutAppmetalistResponse.ResultMessage"));
		getLinkeBahamutAppmetalistResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutAppmetalistResponse.ErrorMessage"));
		getLinkeBahamutAppmetalistResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutAppmetalistResponse.ErrorMsgParamsMap"));
		getLinkeBahamutAppmetalistResponse.setMessage(_ctx.stringValue("GetLinkeBahamutAppmetalistResponse.Message"));
		getLinkeBahamutAppmetalistResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutAppmetalistResponse.ResponseStatusCode"));
		getLinkeBahamutAppmetalistResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutAppmetalistResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutAppmetalistResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAppGroup(_ctx.stringValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].AppGroup"));
			resultItem.setAppTechStackName(_ctx.stringValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].AppTechStackName"));
			resultItem.setAppType(_ctx.stringValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].AppType"));
			resultItem.setAppTypeBackUp(_ctx.stringValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].AppTypeBackUp"));
			resultItem.setArchDomainExternalId(_ctx.stringValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].ArchDomainExternalId"));
			resultItem.setArchDomainMeta(_ctx.stringValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].ArchDomainMeta"));
			resultItem.setArchDomainName(_ctx.stringValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].ArchDomainName"));
			resultItem.setArchDomainSynacId(_ctx.longValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].ArchDomainSynacId"));
			resultItem.setAutoBetaSitDeploy(_ctx.booleanValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].AutoBetaSitDeploy"));
			resultItem.setBaseJarInfo(_ctx.stringValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].BaseJarInfo"));
			resultItem.setBetterQuality(_ctx.booleanValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].BetterQuality"));
			resultItem.setBlizzardRecordingAndPlaybackSmartTest(_ctx.booleanValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].BlizzardRecordingAndPlaybackSmartTest"));
			resultItem.setCloudDeployType(_ctx.stringValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].CloudDeployType"));
			resultItem.setCommonRiskPointInspection(_ctx.booleanValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].CommonRiskPointInspection"));
			resultItem.setContainerServiceName(_ctx.stringValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].ContainerServiceName"));
			resultItem.setCoverageBaseline(_ctx.stringValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].CoverageBaseline"));
			resultItem.setCoverageFromThirdPlatform(_ctx.booleanValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].CoverageFromThirdPlatform"));
			resultItem.setCreated(_ctx.longValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].Created"));
			resultItem.setCreateIterationNeedReq(_ctx.booleanValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].CreateIterationNeedReq"));
			resultItem.setCreateStageMergeTask(_ctx.booleanValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].CreateStageMergeTask"));
			resultItem.setCrucialApp(_ctx.booleanValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].CrucialApp"));
			resultItem.setCustomBuildType(_ctx.stringValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].CustomBuildType"));
			resultItem.setDbChangeEvaluate(_ctx.booleanValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].DbChangeEvaluate"));
			resultItem.setDeleted(_ctx.booleanValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].Deleted"));
			resultItem.setDevLang(_ctx.stringValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].DevLang"));
			resultItem.setDevServerDeployment(_ctx.booleanValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].DevServerDeployment"));
			resultItem.setDisplayName(_ctx.stringValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].DisplayName"));
			resultItem.setGitLabGroupName(_ctx.stringValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].GitLabGroupName"));
			resultItem.setGitLabHttpUrl(_ctx.stringValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].GitLabHttpUrl"));
			resultItem.setGitLabRepoName(_ctx.stringValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].GitLabRepoName"));
			resultItem.setGitLabSshUrl(_ctx.stringValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].GitLabSshUrl"));
			resultItem.setGreyEmergencyRelease(_ctx.booleanValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].GreyEmergencyRelease"));
			resultItem.setGreyRelease(_ctx.booleanValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].GreyRelease"));
			resultItem.setId(_ctx.stringValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].Id"));
			resultItem.setImage(_ctx.stringValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].Image"));
			resultItem.setLastModified(_ctx.longValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].LastModified"));
			resultItem.setLevel(_ctx.stringValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].Level"));
			resultItem.setLockBranch(_ctx.booleanValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].LockBranch"));
			resultItem.setName(_ctx.stringValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].Name"));
			resultItem.setNetRelease(_ctx.booleanValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].NetRelease"));
			resultItem.setOfflineAuthControl(_ctx.booleanValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].OfflineAuthControl"));
			resultItem.setOfflineZoneMode(_ctx.stringValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].OfflineZoneMode"));
			resultItem.setOnlineStatus(_ctx.stringValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].OnlineStatus"));
			resultItem.setOptionList(_ctx.stringValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].OptionList"));
			resultItem.setParentArchDomainExternalId(_ctx.stringValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].ParentArchDomainExternalId"));
			resultItem.setParentArchDomainName(_ctx.stringValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].ParentArchDomainName"));
			resultItem.setPriPubOwner(_ctx.stringValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].PriPubOwner"));
			resultItem.setReleaseDomainName(_ctx.stringValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].ReleaseDomainName"));
			resultItem.setReleaseType(_ctx.stringValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].ReleaseType"));
			resultItem.setRiskAssessNeeded(_ctx.booleanValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].RiskAssessNeeded"));
			resultItem.setServerDeployment(_ctx.booleanValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].ServerDeployment"));
			resultItem.setSitServerDeployment(_ctx.booleanValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].SitServerDeployment"));
			resultItem.setStableDeployMode(_ctx.stringValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].StableDeployMode"));
			resultItem.setStation(_ctx.stringValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].Station"));
			resultItem.setStatus(_ctx.stringValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].Status"));
			resultItem.setSynacId(_ctx.longValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].SynacId"));
			resultItem.setTcCenterPassRate(_ctx.booleanValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].TcCenterPassRate"));
			resultItem.setTenantId(_ctx.stringValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].TenantId"));
			resultItem.setTrunkMrNeedDefectOrReq(_ctx.booleanValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].TrunkMrNeedDefectOrReq"));
			resultItem.setUseLinkQ(_ctx.booleanValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].UseLinkQ"));
			resultItem.setUsePullRequestInAlipay(_ctx.booleanValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].UsePullRequestInAlipay"));
			resultItem.setUseTenantQualityRule(_ctx.booleanValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].UseTenantQualityRule"));
			resultItem.setVcs(_ctx.stringValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].Vcs"));
			resultItem.setZoneMode(_ctx.stringValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].ZoneMode"));

			List<String> customQualityDisplay = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].CustomQualityDisplay.Length"); j++) {
				customQualityDisplay.add(_ctx.stringValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].CustomQualityDisplay["+ j +"]"));
			}
			resultItem.setCustomQualityDisplay(customQualityDisplay);

			List<String> devOwners = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].DevOwners.Length"); j++) {
				devOwners.add(_ctx.stringValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].DevOwners["+ j +"]"));
			}
			resultItem.setDevOwners(devOwners);

			List<String> devOwnerUsers = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].DevOwnerUsers.Length"); j++) {
				devOwnerUsers.add(_ctx.stringValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].DevOwnerUsers["+ j +"]"));
			}
			resultItem.setDevOwnerUsers(devOwnerUsers);

			List<String> iterationMembers = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].IterationMembers.Length"); j++) {
				iterationMembers.add(_ctx.stringValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].IterationMembers["+ j +"]"));
			}
			resultItem.setIterationMembers(iterationMembers);

			List<String> members = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].Members.Length"); j++) {
				members.add(_ctx.stringValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].Members["+ j +"]"));
			}
			resultItem.setMembers(members);

			List<String> memberNames = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].MemberNames.Length"); j++) {
				memberNames.add(_ctx.stringValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].MemberNames["+ j +"]"));
			}
			resultItem.setMemberNames(memberNames);

			List<String> modules = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].Modules.Length"); j++) {
				modules.add(_ctx.stringValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].Modules["+ j +"]"));
			}
			resultItem.setModules(modules);

			List<String> notAllowSkipComponentName = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].NotAllowSkipComponentName.Length"); j++) {
				notAllowSkipComponentName.add(_ctx.stringValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].NotAllowSkipComponentName["+ j +"]"));
			}
			resultItem.setNotAllowSkipComponentName(notAllowSkipComponentName);

			List<String> pes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].Pes.Length"); j++) {
				pes.add(_ctx.stringValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].Pes["+ j +"]"));
			}
			resultItem.setPes(pes);

			List<String> productOwners = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].ProductOwners.Length"); j++) {
				productOwners.add(_ctx.stringValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].ProductOwners["+ j +"]"));
			}
			resultItem.setProductOwners(productOwners);

			List<String> productTestOwners = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].ProductTestOwners.Length"); j++) {
				productTestOwners.add(_ctx.stringValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].ProductTestOwners["+ j +"]"));
			}
			resultItem.setProductTestOwners(productTestOwners);

			List<String> pubOwners = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].PubOwners.Length"); j++) {
				pubOwners.add(_ctx.stringValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].PubOwners["+ j +"]"));
			}
			resultItem.setPubOwners(pubOwners);

			List<String> qualityRules = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].QualityRules.Length"); j++) {
				qualityRules.add(_ctx.stringValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].QualityRules["+ j +"]"));
			}
			resultItem.setQualityRules(qualityRules);

			List<String> testOwners = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].TestOwners.Length"); j++) {
				testOwners.add(_ctx.stringValue("GetLinkeBahamutAppmetalistResponse.Result["+ i +"].TestOwners["+ j +"]"));
			}
			resultItem.setTestOwners(testOwners);

			result.add(resultItem);
		}
		getLinkeBahamutAppmetalistResponse.setResult(result);
	 
	 	return getLinkeBahamutAppmetalistResponse;
	}
}