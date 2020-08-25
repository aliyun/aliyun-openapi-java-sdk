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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutAlltenantsResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutAlltenantsResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutAlltenantsResponseUnmarshaller {

	public static GetLinkeBahamutAlltenantsResponse unmarshall(GetLinkeBahamutAlltenantsResponse getLinkeBahamutAlltenantsResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutAlltenantsResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutAlltenantsResponse.RequestId"));
		getLinkeBahamutAlltenantsResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutAlltenantsResponse.ResultCode"));
		getLinkeBahamutAlltenantsResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutAlltenantsResponse.ResultMessage"));
		getLinkeBahamutAlltenantsResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutAlltenantsResponse.ErrorMessage"));
		getLinkeBahamutAlltenantsResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutAlltenantsResponse.ErrorMsgParamsMap"));
		getLinkeBahamutAlltenantsResponse.setMessage(_ctx.stringValue("GetLinkeBahamutAlltenantsResponse.Message"));
		getLinkeBahamutAlltenantsResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutAlltenantsResponse.ResponseStatusCode"));
		getLinkeBahamutAlltenantsResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutAlltenantsResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutAlltenantsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAccessKey(_ctx.stringValue("GetLinkeBahamutAlltenantsResponse.Result["+ i +"].AccessKey"));
			resultItem.setAccessSecret(_ctx.stringValue("GetLinkeBahamutAlltenantsResponse.Result["+ i +"].AccessSecret"));
			resultItem.setAccessToken(_ctx.stringValue("GetLinkeBahamutAlltenantsResponse.Result["+ i +"].AccessToken"));
			resultItem.setAntflowEnabled(_ctx.booleanValue("GetLinkeBahamutAlltenantsResponse.Result["+ i +"].AntflowEnabled"));
			resultItem.setCreated(_ctx.longValue("GetLinkeBahamutAlltenantsResponse.Result["+ i +"].Created"));
			resultItem.setCustomer(_ctx.stringValue("GetLinkeBahamutAlltenantsResponse.Result["+ i +"].Customer"));
			resultItem.setDeleted(_ctx.booleanValue("GetLinkeBahamutAlltenantsResponse.Result["+ i +"].Deleted"));
			resultItem.setDisplayName(_ctx.stringValue("GetLinkeBahamutAlltenantsResponse.Result["+ i +"].DisplayName"));
			resultItem.setDropQualityApprovslDate(_ctx.longValue("GetLinkeBahamutAlltenantsResponse.Result["+ i +"].DropQualityApprovslDate"));
			resultItem.setEndPoint(_ctx.stringValue("GetLinkeBahamutAlltenantsResponse.Result["+ i +"].EndPoint"));
			resultItem.setExternalId(_ctx.stringValue("GetLinkeBahamutAlltenantsResponse.Result["+ i +"].ExternalId"));
			resultItem.setFromAliyun(_ctx.booleanValue("GetLinkeBahamutAlltenantsResponse.Result["+ i +"].FromAliyun"));
			resultItem.setFrontHost(_ctx.stringValue("GetLinkeBahamutAlltenantsResponse.Result["+ i +"].FrontHost"));
			resultItem.setGitlabPrefixMap(_ctx.stringValue("GetLinkeBahamutAlltenantsResponse.Result["+ i +"].GitlabPrefixMap"));
			resultItem.setGitLabSite(_ctx.stringValue("GetLinkeBahamutAlltenantsResponse.Result["+ i +"].GitLabSite"));
			resultItem.setHaveNotInited(_ctx.booleanValue("GetLinkeBahamutAlltenantsResponse.Result["+ i +"].HaveNotInited"));
			resultItem.setHighAvailabilityEnabled(_ctx.booleanValue("GetLinkeBahamutAlltenantsResponse.Result["+ i +"].HighAvailabilityEnabled"));
			resultItem.setId(_ctx.stringValue("GetLinkeBahamutAlltenantsResponse.Result["+ i +"].Id"));
			resultItem.setIndebt(_ctx.booleanValue("GetLinkeBahamutAlltenantsResponse.Result["+ i +"].Indebt"));
			resultItem.setInitStep(_ctx.stringValue("GetLinkeBahamutAlltenantsResponse.Result["+ i +"].InitStep"));
			resultItem.setJarEnabled(_ctx.booleanValue("GetLinkeBahamutAlltenantsResponse.Result["+ i +"].JarEnabled"));
			resultItem.setLastModified(_ctx.longValue("GetLinkeBahamutAlltenantsResponse.Result["+ i +"].LastModified"));
			resultItem.setMergeRequestEnabled(_ctx.booleanValue("GetLinkeBahamutAlltenantsResponse.Result["+ i +"].MergeRequestEnabled"));
			resultItem.setName(_ctx.stringValue("GetLinkeBahamutAlltenantsResponse.Result["+ i +"].Name"));
			resultItem.setOpenMyBankControl(_ctx.booleanValue("GetLinkeBahamutAlltenantsResponse.Result["+ i +"].OpenMyBankControl"));
			resultItem.setPath(_ctx.stringValue("GetLinkeBahamutAlltenantsResponse.Result["+ i +"].Path"));
			resultItem.setReleaseControlEnabled(_ctx.booleanValue("GetLinkeBahamutAlltenantsResponse.Result["+ i +"].ReleaseControlEnabled"));
			resultItem.setShowNewPRParamer(_ctx.booleanValue("GetLinkeBahamutAlltenantsResponse.Result["+ i +"].ShowNewPRParamer"));
			resultItem.setUseConfigTypes(_ctx.booleanValue("GetLinkeBahamutAlltenantsResponse.Result["+ i +"].UseConfigTypes"));
			resultItem.setUseNewAppReleaseShow(_ctx.booleanValue("GetLinkeBahamutAlltenantsResponse.Result["+ i +"].UseNewAppReleaseShow"));
			resultItem.setUseNewCloudAppImportView(_ctx.booleanValue("GetLinkeBahamutAlltenantsResponse.Result["+ i +"].UseNewCloudAppImportView"));

			List<String> authorizedUsers = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAlltenantsResponse.Result["+ i +"].AuthorizedUsers.Length"); j++) {
				authorizedUsers.add(_ctx.stringValue("GetLinkeBahamutAlltenantsResponse.Result["+ i +"].AuthorizedUsers["+ j +"]"));
			}
			resultItem.setAuthorizedUsers(authorizedUsers);

			List<String> configTypes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAlltenantsResponse.Result["+ i +"].ConfigTypes.Length"); j++) {
				configTypes.add(_ctx.stringValue("GetLinkeBahamutAlltenantsResponse.Result["+ i +"].ConfigTypes["+ j +"]"));
			}
			resultItem.setConfigTypes(configTypes);

			List<String> sitMergeTrialList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAlltenantsResponse.Result["+ i +"].SitMergeTrialList.Length"); j++) {
				sitMergeTrialList.add(_ctx.stringValue("GetLinkeBahamutAlltenantsResponse.Result["+ i +"].SitMergeTrialList["+ j +"]"));
			}
			resultItem.setSitMergeTrialList(sitMergeTrialList);

			List<String> trialList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAlltenantsResponse.Result["+ i +"].TrialList.Length"); j++) {
				trialList.add(_ctx.stringValue("GetLinkeBahamutAlltenantsResponse.Result["+ i +"].TrialList["+ j +"]"));
			}
			resultItem.setTrialList(trialList);

			List<String> zoneModeList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAlltenantsResponse.Result["+ i +"].ZoneModeList.Length"); j++) {
				zoneModeList.add(_ctx.stringValue("GetLinkeBahamutAlltenantsResponse.Result["+ i +"].ZoneModeList["+ j +"]"));
			}
			resultItem.setZoneModeList(zoneModeList);

			result.add(resultItem);
		}
		getLinkeBahamutAlltenantsResponse.setResult(result);
	 
	 	return getLinkeBahamutAlltenantsResponse;
	}
}