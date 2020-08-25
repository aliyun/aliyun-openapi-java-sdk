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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutAppssearchResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutAppssearchResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutAppssearchResponseUnmarshaller {

	public static QueryLinkeBahamutAppssearchResponse unmarshall(QueryLinkeBahamutAppssearchResponse queryLinkeBahamutAppssearchResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutAppssearchResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutAppssearchResponse.RequestId"));
		queryLinkeBahamutAppssearchResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutAppssearchResponse.ResultCode"));
		queryLinkeBahamutAppssearchResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutAppssearchResponse.ResultMessage"));
		queryLinkeBahamutAppssearchResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutAppssearchResponse.ErrorMessage"));
		queryLinkeBahamutAppssearchResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutAppssearchResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutAppssearchResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutAppssearchResponse.Message"));
		queryLinkeBahamutAppssearchResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutAppssearchResponse.ResponseStatusCode"));
		queryLinkeBahamutAppssearchResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutAppssearchResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutAppssearchResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAppGroup(_ctx.stringValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].AppGroup"));
			resultItem.setAppTechStackName(_ctx.stringValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].AppTechStackName"));
			resultItem.setAppType(_ctx.stringValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].AppType"));
			resultItem.setAppTypeBackUp(_ctx.stringValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].AppTypeBackUp"));
			resultItem.setArchDomainExternalId(_ctx.stringValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].ArchDomainExternalId"));
			resultItem.setArchDomainMeta(_ctx.stringValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].ArchDomainMeta"));
			resultItem.setArchDomainName(_ctx.stringValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].ArchDomainName"));
			resultItem.setArchDomainSynacId(_ctx.longValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].ArchDomainSynacId"));
			resultItem.setAutoBetaSitDeploy(_ctx.booleanValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].AutoBetaSitDeploy"));
			resultItem.setBaseJarInfo(_ctx.stringValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].BaseJarInfo"));
			resultItem.setBetterQuality(_ctx.booleanValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].BetterQuality"));
			resultItem.setBlizzardRecordingAndPlaybackSmartTest(_ctx.booleanValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].BlizzardRecordingAndPlaybackSmartTest"));
			resultItem.setCloudDeployType(_ctx.stringValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].CloudDeployType"));
			resultItem.setCommonRiskPointInspection(_ctx.booleanValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].CommonRiskPointInspection"));
			resultItem.setContainerServiceName(_ctx.stringValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].ContainerServiceName"));
			resultItem.setCoverageBaseline(_ctx.stringValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].CoverageBaseline"));
			resultItem.setCoverageFromThirdPlatform(_ctx.booleanValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].CoverageFromThirdPlatform"));
			resultItem.setCreated(_ctx.longValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].Created"));
			resultItem.setCreateIterationNeedReq(_ctx.booleanValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].CreateIterationNeedReq"));
			resultItem.setCreateStageMergeTask(_ctx.booleanValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].CreateStageMergeTask"));
			resultItem.setCrucialApp(_ctx.booleanValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].CrucialApp"));
			resultItem.setCustomBuildType(_ctx.stringValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].CustomBuildType"));
			resultItem.setDbChangeEvaluate(_ctx.booleanValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].DbChangeEvaluate"));
			resultItem.setDeleted(_ctx.booleanValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].Deleted"));
			resultItem.setDevLang(_ctx.stringValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].DevLang"));
			resultItem.setDevServerDeployment(_ctx.booleanValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].DevServerDeployment"));
			resultItem.setDisplayName(_ctx.stringValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].DisplayName"));
			resultItem.setGitLabGroupName(_ctx.stringValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].GitLabGroupName"));
			resultItem.setGitLabHttpUrl(_ctx.stringValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].GitLabHttpUrl"));
			resultItem.setGitLabRepoName(_ctx.stringValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].GitLabRepoName"));
			resultItem.setGitLabSshUrl(_ctx.stringValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].GitLabSshUrl"));
			resultItem.setGreyEmergencyRelease(_ctx.booleanValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].GreyEmergencyRelease"));
			resultItem.setGreyRelease(_ctx.booleanValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].GreyRelease"));
			resultItem.setId(_ctx.stringValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].Id"));
			resultItem.setImage(_ctx.stringValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].Image"));
			resultItem.setLastModified(_ctx.longValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].LastModified"));
			resultItem.setLevel(_ctx.stringValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].Level"));
			resultItem.setLockBranch(_ctx.booleanValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].LockBranch"));
			resultItem.setName(_ctx.stringValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].Name"));
			resultItem.setNetRelease(_ctx.booleanValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].NetRelease"));
			resultItem.setOfflineAuthControl(_ctx.booleanValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].OfflineAuthControl"));
			resultItem.setOfflineZoneMode(_ctx.stringValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].OfflineZoneMode"));
			resultItem.setOnlineStatus(_ctx.stringValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].OnlineStatus"));
			resultItem.setOptionList(_ctx.stringValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].OptionList"));
			resultItem.setParentArchDomainExternalId(_ctx.stringValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].ParentArchDomainExternalId"));
			resultItem.setParentArchDomainName(_ctx.stringValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].ParentArchDomainName"));
			resultItem.setPriPubOwner(_ctx.stringValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].PriPubOwner"));
			resultItem.setReleaseDomainName(_ctx.stringValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].ReleaseDomainName"));
			resultItem.setReleaseType(_ctx.stringValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].ReleaseType"));
			resultItem.setRiskAssessNeeded(_ctx.booleanValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].RiskAssessNeeded"));
			resultItem.setServerDeployment(_ctx.booleanValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].ServerDeployment"));
			resultItem.setSitServerDeployment(_ctx.booleanValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].SitServerDeployment"));
			resultItem.setStableDeployMode(_ctx.stringValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].StableDeployMode"));
			resultItem.setStation(_ctx.stringValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].Station"));
			resultItem.setStatus(_ctx.stringValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].Status"));
			resultItem.setSynacId(_ctx.longValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].SynacId"));
			resultItem.setTcCenterPassRate(_ctx.booleanValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].TcCenterPassRate"));
			resultItem.setTenantId(_ctx.stringValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].TenantId"));
			resultItem.setTrunkMrNeedDefectOrReq(_ctx.booleanValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].TrunkMrNeedDefectOrReq"));
			resultItem.setUseLinkQ(_ctx.booleanValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].UseLinkQ"));
			resultItem.setUsePullRequestInAlipay(_ctx.booleanValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].UsePullRequestInAlipay"));
			resultItem.setUseTenantQualityRule(_ctx.booleanValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].UseTenantQualityRule"));
			resultItem.setVcs(_ctx.stringValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].Vcs"));
			resultItem.setZoneMode(_ctx.stringValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].ZoneMode"));

			List<String> customQualityDisplay = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].CustomQualityDisplay.Length"); j++) {
				customQualityDisplay.add(_ctx.stringValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].CustomQualityDisplay["+ j +"]"));
			}
			resultItem.setCustomQualityDisplay(customQualityDisplay);

			List<String> devOwners = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].DevOwners.Length"); j++) {
				devOwners.add(_ctx.stringValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].DevOwners["+ j +"]"));
			}
			resultItem.setDevOwners(devOwners);

			List<String> devOwnerUsers = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].DevOwnerUsers.Length"); j++) {
				devOwnerUsers.add(_ctx.stringValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].DevOwnerUsers["+ j +"]"));
			}
			resultItem.setDevOwnerUsers(devOwnerUsers);

			List<String> iterationMembers = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].IterationMembers.Length"); j++) {
				iterationMembers.add(_ctx.stringValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].IterationMembers["+ j +"]"));
			}
			resultItem.setIterationMembers(iterationMembers);

			List<String> members = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].Members.Length"); j++) {
				members.add(_ctx.stringValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].Members["+ j +"]"));
			}
			resultItem.setMembers(members);

			List<String> memberNames = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].MemberNames.Length"); j++) {
				memberNames.add(_ctx.stringValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].MemberNames["+ j +"]"));
			}
			resultItem.setMemberNames(memberNames);

			List<String> modules = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].Modules.Length"); j++) {
				modules.add(_ctx.stringValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].Modules["+ j +"]"));
			}
			resultItem.setModules(modules);

			List<String> notAllowSkipComponentName = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].NotAllowSkipComponentName.Length"); j++) {
				notAllowSkipComponentName.add(_ctx.stringValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].NotAllowSkipComponentName["+ j +"]"));
			}
			resultItem.setNotAllowSkipComponentName(notAllowSkipComponentName);

			List<String> pes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].Pes.Length"); j++) {
				pes.add(_ctx.stringValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].Pes["+ j +"]"));
			}
			resultItem.setPes(pes);

			List<String> productOwners = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].ProductOwners.Length"); j++) {
				productOwners.add(_ctx.stringValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].ProductOwners["+ j +"]"));
			}
			resultItem.setProductOwners(productOwners);

			List<String> productTestOwners = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].ProductTestOwners.Length"); j++) {
				productTestOwners.add(_ctx.stringValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].ProductTestOwners["+ j +"]"));
			}
			resultItem.setProductTestOwners(productTestOwners);

			List<String> pubOwners = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].PubOwners.Length"); j++) {
				pubOwners.add(_ctx.stringValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].PubOwners["+ j +"]"));
			}
			resultItem.setPubOwners(pubOwners);

			List<String> qualityRules = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].QualityRules.Length"); j++) {
				qualityRules.add(_ctx.stringValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].QualityRules["+ j +"]"));
			}
			resultItem.setQualityRules(qualityRules);

			List<String> testOwners = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].TestOwners.Length"); j++) {
				testOwners.add(_ctx.stringValue("QueryLinkeBahamutAppssearchResponse.Result["+ i +"].TestOwners["+ j +"]"));
			}
			resultItem.setTestOwners(testOwners);

			result.add(resultItem);
		}
		queryLinkeBahamutAppssearchResponse.setResult(result);
	 
	 	return queryLinkeBahamutAppssearchResponse;
	}
}