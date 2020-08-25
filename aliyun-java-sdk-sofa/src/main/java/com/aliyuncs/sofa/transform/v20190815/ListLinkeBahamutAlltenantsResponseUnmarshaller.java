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

import com.aliyuncs.sofa.model.v20190815.ListLinkeBahamutAlltenantsResponse;
import com.aliyuncs.sofa.model.v20190815.ListLinkeBahamutAlltenantsResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLinkeBahamutAlltenantsResponseUnmarshaller {

	public static ListLinkeBahamutAlltenantsResponse unmarshall(ListLinkeBahamutAlltenantsResponse listLinkeBahamutAlltenantsResponse, UnmarshallerContext _ctx) {
		
		listLinkeBahamutAlltenantsResponse.setRequestId(_ctx.stringValue("ListLinkeBahamutAlltenantsResponse.RequestId"));
		listLinkeBahamutAlltenantsResponse.setResultCode(_ctx.stringValue("ListLinkeBahamutAlltenantsResponse.ResultCode"));
		listLinkeBahamutAlltenantsResponse.setResultMessage(_ctx.stringValue("ListLinkeBahamutAlltenantsResponse.ResultMessage"));
		listLinkeBahamutAlltenantsResponse.setErrorMessage(_ctx.stringValue("ListLinkeBahamutAlltenantsResponse.ErrorMessage"));
		listLinkeBahamutAlltenantsResponse.setErrorMsgParamsMap(_ctx.stringValue("ListLinkeBahamutAlltenantsResponse.ErrorMsgParamsMap"));
		listLinkeBahamutAlltenantsResponse.setMessage(_ctx.stringValue("ListLinkeBahamutAlltenantsResponse.Message"));
		listLinkeBahamutAlltenantsResponse.setResponseStatusCode(_ctx.longValue("ListLinkeBahamutAlltenantsResponse.ResponseStatusCode"));
		listLinkeBahamutAlltenantsResponse.setSuccess(_ctx.booleanValue("ListLinkeBahamutAlltenantsResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListLinkeBahamutAlltenantsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAccessKey(_ctx.stringValue("ListLinkeBahamutAlltenantsResponse.Result["+ i +"].AccessKey"));
			resultItem.setAccessSecret(_ctx.stringValue("ListLinkeBahamutAlltenantsResponse.Result["+ i +"].AccessSecret"));
			resultItem.setAccessToken(_ctx.stringValue("ListLinkeBahamutAlltenantsResponse.Result["+ i +"].AccessToken"));
			resultItem.setAntflowEnabled(_ctx.booleanValue("ListLinkeBahamutAlltenantsResponse.Result["+ i +"].AntflowEnabled"));
			resultItem.setCreated(_ctx.longValue("ListLinkeBahamutAlltenantsResponse.Result["+ i +"].Created"));
			resultItem.setCustomer(_ctx.stringValue("ListLinkeBahamutAlltenantsResponse.Result["+ i +"].Customer"));
			resultItem.setDeleted(_ctx.booleanValue("ListLinkeBahamutAlltenantsResponse.Result["+ i +"].Deleted"));
			resultItem.setDisplayName(_ctx.stringValue("ListLinkeBahamutAlltenantsResponse.Result["+ i +"].DisplayName"));
			resultItem.setDropQualityApprovslDate(_ctx.longValue("ListLinkeBahamutAlltenantsResponse.Result["+ i +"].DropQualityApprovslDate"));
			resultItem.setEndPoint(_ctx.stringValue("ListLinkeBahamutAlltenantsResponse.Result["+ i +"].EndPoint"));
			resultItem.setExternalId(_ctx.stringValue("ListLinkeBahamutAlltenantsResponse.Result["+ i +"].ExternalId"));
			resultItem.setFromAliyun(_ctx.booleanValue("ListLinkeBahamutAlltenantsResponse.Result["+ i +"].FromAliyun"));
			resultItem.setFrontHost(_ctx.stringValue("ListLinkeBahamutAlltenantsResponse.Result["+ i +"].FrontHost"));
			resultItem.setGitlabPrefixMap(_ctx.stringValue("ListLinkeBahamutAlltenantsResponse.Result["+ i +"].GitlabPrefixMap"));
			resultItem.setGitLabSite(_ctx.stringValue("ListLinkeBahamutAlltenantsResponse.Result["+ i +"].GitLabSite"));
			resultItem.setHaveNotInited(_ctx.booleanValue("ListLinkeBahamutAlltenantsResponse.Result["+ i +"].HaveNotInited"));
			resultItem.setHighAvailabilityEnabled(_ctx.booleanValue("ListLinkeBahamutAlltenantsResponse.Result["+ i +"].HighAvailabilityEnabled"));
			resultItem.setId(_ctx.stringValue("ListLinkeBahamutAlltenantsResponse.Result["+ i +"].Id"));
			resultItem.setIndebt(_ctx.booleanValue("ListLinkeBahamutAlltenantsResponse.Result["+ i +"].Indebt"));
			resultItem.setInitStep(_ctx.stringValue("ListLinkeBahamutAlltenantsResponse.Result["+ i +"].InitStep"));
			resultItem.setJarEnabled(_ctx.booleanValue("ListLinkeBahamutAlltenantsResponse.Result["+ i +"].JarEnabled"));
			resultItem.setLastModified(_ctx.longValue("ListLinkeBahamutAlltenantsResponse.Result["+ i +"].LastModified"));
			resultItem.setMergeRequestEnabled(_ctx.booleanValue("ListLinkeBahamutAlltenantsResponse.Result["+ i +"].MergeRequestEnabled"));
			resultItem.setName(_ctx.stringValue("ListLinkeBahamutAlltenantsResponse.Result["+ i +"].Name"));
			resultItem.setOpenMyBankControl(_ctx.booleanValue("ListLinkeBahamutAlltenantsResponse.Result["+ i +"].OpenMyBankControl"));
			resultItem.setPath(_ctx.stringValue("ListLinkeBahamutAlltenantsResponse.Result["+ i +"].Path"));
			resultItem.setReleaseControlEnabled(_ctx.booleanValue("ListLinkeBahamutAlltenantsResponse.Result["+ i +"].ReleaseControlEnabled"));
			resultItem.setShowNewPRParamer(_ctx.booleanValue("ListLinkeBahamutAlltenantsResponse.Result["+ i +"].ShowNewPRParamer"));
			resultItem.setUseConfigTypes(_ctx.booleanValue("ListLinkeBahamutAlltenantsResponse.Result["+ i +"].UseConfigTypes"));
			resultItem.setUseNewAppReleaseShow(_ctx.booleanValue("ListLinkeBahamutAlltenantsResponse.Result["+ i +"].UseNewAppReleaseShow"));
			resultItem.setUseNewCloudAppImportView(_ctx.booleanValue("ListLinkeBahamutAlltenantsResponse.Result["+ i +"].UseNewCloudAppImportView"));

			List<String> authorizedUsers = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListLinkeBahamutAlltenantsResponse.Result["+ i +"].AuthorizedUsers.Length"); j++) {
				authorizedUsers.add(_ctx.stringValue("ListLinkeBahamutAlltenantsResponse.Result["+ i +"].AuthorizedUsers["+ j +"]"));
			}
			resultItem.setAuthorizedUsers(authorizedUsers);

			List<String> configTypes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListLinkeBahamutAlltenantsResponse.Result["+ i +"].ConfigTypes.Length"); j++) {
				configTypes.add(_ctx.stringValue("ListLinkeBahamutAlltenantsResponse.Result["+ i +"].ConfigTypes["+ j +"]"));
			}
			resultItem.setConfigTypes(configTypes);

			List<String> sitMergeTrialList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListLinkeBahamutAlltenantsResponse.Result["+ i +"].SitMergeTrialList.Length"); j++) {
				sitMergeTrialList.add(_ctx.stringValue("ListLinkeBahamutAlltenantsResponse.Result["+ i +"].SitMergeTrialList["+ j +"]"));
			}
			resultItem.setSitMergeTrialList(sitMergeTrialList);

			List<String> trialList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListLinkeBahamutAlltenantsResponse.Result["+ i +"].TrialList.Length"); j++) {
				trialList.add(_ctx.stringValue("ListLinkeBahamutAlltenantsResponse.Result["+ i +"].TrialList["+ j +"]"));
			}
			resultItem.setTrialList(trialList);

			List<String> zoneModeList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListLinkeBahamutAlltenantsResponse.Result["+ i +"].ZoneModeList.Length"); j++) {
				zoneModeList.add(_ctx.stringValue("ListLinkeBahamutAlltenantsResponse.Result["+ i +"].ZoneModeList["+ j +"]"));
			}
			resultItem.setZoneModeList(zoneModeList);

			result.add(resultItem);
		}
		listLinkeBahamutAlltenantsResponse.setResult(result);
	 
	 	return listLinkeBahamutAlltenantsResponse;
	}
}