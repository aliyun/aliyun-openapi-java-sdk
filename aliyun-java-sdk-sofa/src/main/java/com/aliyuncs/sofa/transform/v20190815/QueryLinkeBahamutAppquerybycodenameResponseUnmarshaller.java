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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutAppquerybycodenameResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutAppquerybycodenameResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutAppquerybycodenameResponseUnmarshaller {

	public static QueryLinkeBahamutAppquerybycodenameResponse unmarshall(QueryLinkeBahamutAppquerybycodenameResponse queryLinkeBahamutAppquerybycodenameResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutAppquerybycodenameResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutAppquerybycodenameResponse.RequestId"));
		queryLinkeBahamutAppquerybycodenameResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutAppquerybycodenameResponse.ResultCode"));
		queryLinkeBahamutAppquerybycodenameResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutAppquerybycodenameResponse.ResultMessage"));
		queryLinkeBahamutAppquerybycodenameResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutAppquerybycodenameResponse.ErrorMessage"));
		queryLinkeBahamutAppquerybycodenameResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutAppquerybycodenameResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutAppquerybycodenameResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutAppquerybycodenameResponse.Message"));
		queryLinkeBahamutAppquerybycodenameResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutAppquerybycodenameResponse.ResponseStatusCode"));
		queryLinkeBahamutAppquerybycodenameResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutAppquerybycodenameResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutAppquerybycodenameResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAppGroup(_ctx.stringValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].AppGroup"));
			resultItem.setAppTechStackName(_ctx.stringValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].AppTechStackName"));
			resultItem.setAppType(_ctx.stringValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].AppType"));
			resultItem.setAppTypeBackUp(_ctx.stringValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].AppTypeBackUp"));
			resultItem.setArchDomainExternalId(_ctx.stringValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].ArchDomainExternalId"));
			resultItem.setArchDomainMeta(_ctx.stringValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].ArchDomainMeta"));
			resultItem.setArchDomainName(_ctx.stringValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].ArchDomainName"));
			resultItem.setArchDomainSynacId(_ctx.longValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].ArchDomainSynacId"));
			resultItem.setAutoBetaSitDeploy(_ctx.booleanValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].AutoBetaSitDeploy"));
			resultItem.setBaseJarInfo(_ctx.stringValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].BaseJarInfo"));
			resultItem.setBetterQuality(_ctx.booleanValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].BetterQuality"));
			resultItem.setBlizzardRecordingAndPlaybackSmartTest(_ctx.booleanValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].BlizzardRecordingAndPlaybackSmartTest"));
			resultItem.setCloudDeployType(_ctx.stringValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].CloudDeployType"));
			resultItem.setCommonRiskPointInspection(_ctx.booleanValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].CommonRiskPointInspection"));
			resultItem.setContainerServiceName(_ctx.stringValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].ContainerServiceName"));
			resultItem.setCoverageBaseline(_ctx.stringValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].CoverageBaseline"));
			resultItem.setCoverageFromThirdPlatform(_ctx.booleanValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].CoverageFromThirdPlatform"));
			resultItem.setCreated(_ctx.longValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].Created"));
			resultItem.setCreateIterationNeedReq(_ctx.booleanValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].CreateIterationNeedReq"));
			resultItem.setCreateStageMergeTask(_ctx.booleanValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].CreateStageMergeTask"));
			resultItem.setCrucialApp(_ctx.booleanValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].CrucialApp"));
			resultItem.setCustomBuildType(_ctx.stringValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].CustomBuildType"));
			resultItem.setDbChangeEvaluate(_ctx.booleanValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].DbChangeEvaluate"));
			resultItem.setDeleted(_ctx.booleanValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].Deleted"));
			resultItem.setDevLang(_ctx.stringValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].DevLang"));
			resultItem.setDevServerDeployment(_ctx.booleanValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].DevServerDeployment"));
			resultItem.setDisplayName(_ctx.stringValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].DisplayName"));
			resultItem.setGitLabGroupName(_ctx.stringValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].GitLabGroupName"));
			resultItem.setGitLabHttpUrl(_ctx.stringValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].GitLabHttpUrl"));
			resultItem.setGitLabRepoName(_ctx.stringValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].GitLabRepoName"));
			resultItem.setGitLabSshUrl(_ctx.stringValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].GitLabSshUrl"));
			resultItem.setGreyEmergencyRelease(_ctx.booleanValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].GreyEmergencyRelease"));
			resultItem.setGreyRelease(_ctx.booleanValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].GreyRelease"));
			resultItem.setId(_ctx.stringValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].Id"));
			resultItem.setImage(_ctx.stringValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].Image"));
			resultItem.setLastModified(_ctx.longValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].LastModified"));
			resultItem.setLevel(_ctx.stringValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].Level"));
			resultItem.setLockBranch(_ctx.booleanValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].LockBranch"));
			resultItem.setName(_ctx.stringValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].Name"));
			resultItem.setNetRelease(_ctx.booleanValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].NetRelease"));
			resultItem.setOfflineAuthControl(_ctx.booleanValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].OfflineAuthControl"));
			resultItem.setOfflineZoneMode(_ctx.stringValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].OfflineZoneMode"));
			resultItem.setOnlineStatus(_ctx.stringValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].OnlineStatus"));
			resultItem.setOptionList(_ctx.stringValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].OptionList"));
			resultItem.setParentArchDomainExternalId(_ctx.stringValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].ParentArchDomainExternalId"));
			resultItem.setParentArchDomainName(_ctx.stringValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].ParentArchDomainName"));
			resultItem.setPriPubOwner(_ctx.stringValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].PriPubOwner"));
			resultItem.setReleaseDomainName(_ctx.stringValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].ReleaseDomainName"));
			resultItem.setReleaseType(_ctx.stringValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].ReleaseType"));
			resultItem.setRiskAssessNeeded(_ctx.booleanValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].RiskAssessNeeded"));
			resultItem.setServerDeployment(_ctx.booleanValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].ServerDeployment"));
			resultItem.setSitServerDeployment(_ctx.booleanValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].SitServerDeployment"));
			resultItem.setStableDeployMode(_ctx.stringValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].StableDeployMode"));
			resultItem.setStation(_ctx.stringValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].Station"));
			resultItem.setStatus(_ctx.stringValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].Status"));
			resultItem.setSynacId(_ctx.longValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].SynacId"));
			resultItem.setTcCenterPassRate(_ctx.booleanValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].TcCenterPassRate"));
			resultItem.setTenantId(_ctx.stringValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].TenantId"));
			resultItem.setTrunkMrNeedDefectOrReq(_ctx.booleanValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].TrunkMrNeedDefectOrReq"));
			resultItem.setUseLinkQ(_ctx.booleanValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].UseLinkQ"));
			resultItem.setUsePullRequestInAlipay(_ctx.booleanValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].UsePullRequestInAlipay"));
			resultItem.setUseTenantQualityRule(_ctx.booleanValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].UseTenantQualityRule"));
			resultItem.setVcs(_ctx.stringValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].Vcs"));
			resultItem.setZoneMode(_ctx.stringValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].ZoneMode"));

			List<String> customQualityDisplay = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].CustomQualityDisplay.Length"); j++) {
				customQualityDisplay.add(_ctx.stringValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].CustomQualityDisplay["+ j +"]"));
			}
			resultItem.setCustomQualityDisplay(customQualityDisplay);

			List<String> devOwners = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].DevOwners.Length"); j++) {
				devOwners.add(_ctx.stringValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].DevOwners["+ j +"]"));
			}
			resultItem.setDevOwners(devOwners);

			List<String> devOwnerUsers = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].DevOwnerUsers.Length"); j++) {
				devOwnerUsers.add(_ctx.stringValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].DevOwnerUsers["+ j +"]"));
			}
			resultItem.setDevOwnerUsers(devOwnerUsers);

			List<String> iterationMembers = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].IterationMembers.Length"); j++) {
				iterationMembers.add(_ctx.stringValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].IterationMembers["+ j +"]"));
			}
			resultItem.setIterationMembers(iterationMembers);

			List<String> members = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].Members.Length"); j++) {
				members.add(_ctx.stringValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].Members["+ j +"]"));
			}
			resultItem.setMembers(members);

			List<String> memberNames = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].MemberNames.Length"); j++) {
				memberNames.add(_ctx.stringValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].MemberNames["+ j +"]"));
			}
			resultItem.setMemberNames(memberNames);

			List<String> modules = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].Modules.Length"); j++) {
				modules.add(_ctx.stringValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].Modules["+ j +"]"));
			}
			resultItem.setModules(modules);

			List<String> notAllowSkipComponentName = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].NotAllowSkipComponentName.Length"); j++) {
				notAllowSkipComponentName.add(_ctx.stringValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].NotAllowSkipComponentName["+ j +"]"));
			}
			resultItem.setNotAllowSkipComponentName(notAllowSkipComponentName);

			List<String> pes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].Pes.Length"); j++) {
				pes.add(_ctx.stringValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].Pes["+ j +"]"));
			}
			resultItem.setPes(pes);

			List<String> productOwners = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].ProductOwners.Length"); j++) {
				productOwners.add(_ctx.stringValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].ProductOwners["+ j +"]"));
			}
			resultItem.setProductOwners(productOwners);

			List<String> productTestOwners = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].ProductTestOwners.Length"); j++) {
				productTestOwners.add(_ctx.stringValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].ProductTestOwners["+ j +"]"));
			}
			resultItem.setProductTestOwners(productTestOwners);

			List<String> pubOwners = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].PubOwners.Length"); j++) {
				pubOwners.add(_ctx.stringValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].PubOwners["+ j +"]"));
			}
			resultItem.setPubOwners(pubOwners);

			List<String> qualityRules = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].QualityRules.Length"); j++) {
				qualityRules.add(_ctx.stringValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].QualityRules["+ j +"]"));
			}
			resultItem.setQualityRules(qualityRules);

			List<String> testOwners = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].TestOwners.Length"); j++) {
				testOwners.add(_ctx.stringValue("QueryLinkeBahamutAppquerybycodenameResponse.Result["+ i +"].TestOwners["+ j +"]"));
			}
			resultItem.setTestOwners(testOwners);

			result.add(resultItem);
		}
		queryLinkeBahamutAppquerybycodenameResponse.setResult(result);
	 
	 	return queryLinkeBahamutAppquerybycodenameResponse;
	}
}