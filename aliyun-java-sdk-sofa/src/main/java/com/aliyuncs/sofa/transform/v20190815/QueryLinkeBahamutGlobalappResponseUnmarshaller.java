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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutGlobalappResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutGlobalappResponse.Paginator;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutGlobalappResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutGlobalappResponseUnmarshaller {

	public static QueryLinkeBahamutGlobalappResponse unmarshall(QueryLinkeBahamutGlobalappResponse queryLinkeBahamutGlobalappResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutGlobalappResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutGlobalappResponse.RequestId"));
		queryLinkeBahamutGlobalappResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutGlobalappResponse.ResultCode"));
		queryLinkeBahamutGlobalappResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutGlobalappResponse.ResultMessage"));
		queryLinkeBahamutGlobalappResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutGlobalappResponse.ErrorMessage"));
		queryLinkeBahamutGlobalappResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutGlobalappResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutGlobalappResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutGlobalappResponse.Message"));
		queryLinkeBahamutGlobalappResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutGlobalappResponse.ResponseStatusCode"));
		queryLinkeBahamutGlobalappResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutGlobalappResponse.Success"));

		Paginator paginator = new Paginator();
		paginator.setItemCount(_ctx.longValue("QueryLinkeBahamutGlobalappResponse.Paginator.ItemCount"));
		paginator.setPage(_ctx.longValue("QueryLinkeBahamutGlobalappResponse.Paginator.Page"));
		paginator.setPageCount(_ctx.longValue("QueryLinkeBahamutGlobalappResponse.Paginator.PageCount"));
		paginator.setPageSize(_ctx.longValue("QueryLinkeBahamutGlobalappResponse.Paginator.PageSize"));
		queryLinkeBahamutGlobalappResponse.setPaginator(paginator);

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutGlobalappResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAppGroup(_ctx.stringValue("QueryLinkeBahamutGlobalappResponse.Result["+ i +"].AppGroup"));
			resultItem.setAppType(_ctx.stringValue("QueryLinkeBahamutGlobalappResponse.Result["+ i +"].AppType"));
			resultItem.setArchDomainExternalId(_ctx.stringValue("QueryLinkeBahamutGlobalappResponse.Result["+ i +"].ArchDomainExternalId"));
			resultItem.setArchDomainName(_ctx.stringValue("QueryLinkeBahamutGlobalappResponse.Result["+ i +"].ArchDomainName"));
			resultItem.setAutoBetaSitDeploy(_ctx.booleanValue("QueryLinkeBahamutGlobalappResponse.Result["+ i +"].AutoBetaSitDeploy"));
			resultItem.setBaseJarInfo(_ctx.stringValue("QueryLinkeBahamutGlobalappResponse.Result["+ i +"].BaseJarInfo"));
			resultItem.setBetterQuality(_ctx.booleanValue("QueryLinkeBahamutGlobalappResponse.Result["+ i +"].BetterQuality"));
			resultItem.setCommonRiskPointInspection(_ctx.booleanValue("QueryLinkeBahamutGlobalappResponse.Result["+ i +"].CommonRiskPointInspection"));
			resultItem.setCoverageBaseline(_ctx.stringValue("QueryLinkeBahamutGlobalappResponse.Result["+ i +"].CoverageBaseline"));
			resultItem.setCoverageFromThirdPlatform(_ctx.booleanValue("QueryLinkeBahamutGlobalappResponse.Result["+ i +"].CoverageFromThirdPlatform"));
			resultItem.setCrucialApp(_ctx.booleanValue("QueryLinkeBahamutGlobalappResponse.Result["+ i +"].CrucialApp"));
			resultItem.setDevLang(_ctx.stringValue("QueryLinkeBahamutGlobalappResponse.Result["+ i +"].DevLang"));
			resultItem.setDevServerDeployment(_ctx.booleanValue("QueryLinkeBahamutGlobalappResponse.Result["+ i +"].DevServerDeployment"));
			resultItem.setDisplayName(_ctx.stringValue("QueryLinkeBahamutGlobalappResponse.Result["+ i +"].DisplayName"));
			resultItem.setGitLabGroupName(_ctx.stringValue("QueryLinkeBahamutGlobalappResponse.Result["+ i +"].GitLabGroupName"));
			resultItem.setGitLabHttpUrl(_ctx.stringValue("QueryLinkeBahamutGlobalappResponse.Result["+ i +"].GitLabHttpUrl"));
			resultItem.setGitLabRepoName(_ctx.stringValue("QueryLinkeBahamutGlobalappResponse.Result["+ i +"].GitLabRepoName"));
			resultItem.setGitLabSshUrl(_ctx.stringValue("QueryLinkeBahamutGlobalappResponse.Result["+ i +"].GitLabSshUrl"));
			resultItem.setGreyEmergencyRelease(_ctx.booleanValue("QueryLinkeBahamutGlobalappResponse.Result["+ i +"].GreyEmergencyRelease"));
			resultItem.setGreyRelease(_ctx.booleanValue("QueryLinkeBahamutGlobalappResponse.Result["+ i +"].GreyRelease"));
			resultItem.setLegacyConflict(_ctx.stringValue("QueryLinkeBahamutGlobalappResponse.Result["+ i +"].LegacyConflict"));
			resultItem.setLevel(_ctx.stringValue("QueryLinkeBahamutGlobalappResponse.Result["+ i +"].Level"));
			resultItem.setLockBranch(_ctx.booleanValue("QueryLinkeBahamutGlobalappResponse.Result["+ i +"].LockBranch"));
			resultItem.setName(_ctx.stringValue("QueryLinkeBahamutGlobalappResponse.Result["+ i +"].Name"));
			resultItem.setNetRelease(_ctx.booleanValue("QueryLinkeBahamutGlobalappResponse.Result["+ i +"].NetRelease"));
			resultItem.setOptionList(_ctx.stringValue("QueryLinkeBahamutGlobalappResponse.Result["+ i +"].OptionList"));
			resultItem.setParentArchDomainExternalId(_ctx.stringValue("QueryLinkeBahamutGlobalappResponse.Result["+ i +"].ParentArchDomainExternalId"));
			resultItem.setParentArchDomainName(_ctx.stringValue("QueryLinkeBahamutGlobalappResponse.Result["+ i +"].ParentArchDomainName"));
			resultItem.setPriPubOwner(_ctx.stringValue("QueryLinkeBahamutGlobalappResponse.Result["+ i +"].PriPubOwner"));
			resultItem.setReleaseDomainName(_ctx.stringValue("QueryLinkeBahamutGlobalappResponse.Result["+ i +"].ReleaseDomainName"));
			resultItem.setReleaseType(_ctx.stringValue("QueryLinkeBahamutGlobalappResponse.Result["+ i +"].ReleaseType"));
			resultItem.setRiskAssessNeeded(_ctx.booleanValue("QueryLinkeBahamutGlobalappResponse.Result["+ i +"].RiskAssessNeeded"));
			resultItem.setServerDeployment(_ctx.booleanValue("QueryLinkeBahamutGlobalappResponse.Result["+ i +"].ServerDeployment"));
			resultItem.setSitServerDeployment(_ctx.booleanValue("QueryLinkeBahamutGlobalappResponse.Result["+ i +"].SitServerDeployment"));
			resultItem.setStatus(_ctx.stringValue("QueryLinkeBahamutGlobalappResponse.Result["+ i +"].Status"));
			resultItem.setTcCenterPassRate(_ctx.booleanValue("QueryLinkeBahamutGlobalappResponse.Result["+ i +"].TcCenterPassRate"));
			resultItem.setTenantId(_ctx.stringValue("QueryLinkeBahamutGlobalappResponse.Result["+ i +"].TenantId"));
			resultItem.setTrunkMrNeedDefectOrReq(_ctx.booleanValue("QueryLinkeBahamutGlobalappResponse.Result["+ i +"].TrunkMrNeedDefectOrReq"));
			resultItem.setUseTenantQualityRule(_ctx.booleanValue("QueryLinkeBahamutGlobalappResponse.Result["+ i +"].UseTenantQualityRule"));
			resultItem.setVcs(_ctx.stringValue("QueryLinkeBahamutGlobalappResponse.Result["+ i +"].Vcs"));
			resultItem.setZoneMode(_ctx.stringValue("QueryLinkeBahamutGlobalappResponse.Result["+ i +"].ZoneMode"));

			List<String> customQualityDisplay = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutGlobalappResponse.Result["+ i +"].CustomQualityDisplay.Length"); j++) {
				customQualityDisplay.add(_ctx.stringValue("QueryLinkeBahamutGlobalappResponse.Result["+ i +"].CustomQualityDisplay["+ j +"]"));
			}
			resultItem.setCustomQualityDisplay(customQualityDisplay);

			List<String> devOwners = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutGlobalappResponse.Result["+ i +"].DevOwners.Length"); j++) {
				devOwners.add(_ctx.stringValue("QueryLinkeBahamutGlobalappResponse.Result["+ i +"].DevOwners["+ j +"]"));
			}
			resultItem.setDevOwners(devOwners);

			List<String> devOwnerUsers = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutGlobalappResponse.Result["+ i +"].DevOwnerUsers.Length"); j++) {
				devOwnerUsers.add(_ctx.stringValue("QueryLinkeBahamutGlobalappResponse.Result["+ i +"].DevOwnerUsers["+ j +"]"));
			}
			resultItem.setDevOwnerUsers(devOwnerUsers);

			List<String> members = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutGlobalappResponse.Result["+ i +"].Members.Length"); j++) {
				members.add(_ctx.stringValue("QueryLinkeBahamutGlobalappResponse.Result["+ i +"].Members["+ j +"]"));
			}
			resultItem.setMembers(members);

			List<String> memberNames = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutGlobalappResponse.Result["+ i +"].MemberNames.Length"); j++) {
				memberNames.add(_ctx.stringValue("QueryLinkeBahamutGlobalappResponse.Result["+ i +"].MemberNames["+ j +"]"));
			}
			resultItem.setMemberNames(memberNames);

			List<String> modules = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutGlobalappResponse.Result["+ i +"].Modules.Length"); j++) {
				modules.add(_ctx.stringValue("QueryLinkeBahamutGlobalappResponse.Result["+ i +"].Modules["+ j +"]"));
			}
			resultItem.setModules(modules);

			List<String> pes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutGlobalappResponse.Result["+ i +"].Pes.Length"); j++) {
				pes.add(_ctx.stringValue("QueryLinkeBahamutGlobalappResponse.Result["+ i +"].Pes["+ j +"]"));
			}
			resultItem.setPes(pes);

			List<String> productOwners = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutGlobalappResponse.Result["+ i +"].ProductOwners.Length"); j++) {
				productOwners.add(_ctx.stringValue("QueryLinkeBahamutGlobalappResponse.Result["+ i +"].ProductOwners["+ j +"]"));
			}
			resultItem.setProductOwners(productOwners);

			List<String> productTestOwners = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutGlobalappResponse.Result["+ i +"].ProductTestOwners.Length"); j++) {
				productTestOwners.add(_ctx.stringValue("QueryLinkeBahamutGlobalappResponse.Result["+ i +"].ProductTestOwners["+ j +"]"));
			}
			resultItem.setProductTestOwners(productTestOwners);

			List<String> pubOwners = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutGlobalappResponse.Result["+ i +"].PubOwners.Length"); j++) {
				pubOwners.add(_ctx.stringValue("QueryLinkeBahamutGlobalappResponse.Result["+ i +"].PubOwners["+ j +"]"));
			}
			resultItem.setPubOwners(pubOwners);

			List<String> qualityRules = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutGlobalappResponse.Result["+ i +"].QualityRules.Length"); j++) {
				qualityRules.add(_ctx.stringValue("QueryLinkeBahamutGlobalappResponse.Result["+ i +"].QualityRules["+ j +"]"));
			}
			resultItem.setQualityRules(qualityRules);

			List<String> testOwners = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutGlobalappResponse.Result["+ i +"].TestOwners.Length"); j++) {
				testOwners.add(_ctx.stringValue("QueryLinkeBahamutGlobalappResponse.Result["+ i +"].TestOwners["+ j +"]"));
			}
			resultItem.setTestOwners(testOwners);

			result.add(resultItem);
		}
		queryLinkeBahamutGlobalappResponse.setResult(result);
	 
	 	return queryLinkeBahamutGlobalappResponse;
	}
}