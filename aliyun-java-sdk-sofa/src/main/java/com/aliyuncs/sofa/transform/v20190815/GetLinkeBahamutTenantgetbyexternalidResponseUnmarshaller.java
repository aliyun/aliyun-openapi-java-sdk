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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutTenantgetbyexternalidResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutTenantgetbyexternalidResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutTenantgetbyexternalidResponseUnmarshaller {

	public static GetLinkeBahamutTenantgetbyexternalidResponse unmarshall(GetLinkeBahamutTenantgetbyexternalidResponse getLinkeBahamutTenantgetbyexternalidResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutTenantgetbyexternalidResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutTenantgetbyexternalidResponse.RequestId"));
		getLinkeBahamutTenantgetbyexternalidResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutTenantgetbyexternalidResponse.ResultCode"));
		getLinkeBahamutTenantgetbyexternalidResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutTenantgetbyexternalidResponse.ResultMessage"));
		getLinkeBahamutTenantgetbyexternalidResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutTenantgetbyexternalidResponse.ErrorMessage"));
		getLinkeBahamutTenantgetbyexternalidResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutTenantgetbyexternalidResponse.ErrorMsgParamsMap"));
		getLinkeBahamutTenantgetbyexternalidResponse.setMessage(_ctx.stringValue("GetLinkeBahamutTenantgetbyexternalidResponse.Message"));
		getLinkeBahamutTenantgetbyexternalidResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutTenantgetbyexternalidResponse.ResponseStatusCode"));
		getLinkeBahamutTenantgetbyexternalidResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutTenantgetbyexternalidResponse.Success"));

		Result result = new Result();
		result.setAccessKey(_ctx.stringValue("GetLinkeBahamutTenantgetbyexternalidResponse.Result.AccessKey"));
		result.setAccessSecret(_ctx.stringValue("GetLinkeBahamutTenantgetbyexternalidResponse.Result.AccessSecret"));
		result.setAccessToken(_ctx.stringValue("GetLinkeBahamutTenantgetbyexternalidResponse.Result.AccessToken"));
		result.setAntflowEnabled(_ctx.booleanValue("GetLinkeBahamutTenantgetbyexternalidResponse.Result.AntflowEnabled"));
		result.setCreated(_ctx.longValue("GetLinkeBahamutTenantgetbyexternalidResponse.Result.Created"));
		result.setCustomer(_ctx.stringValue("GetLinkeBahamutTenantgetbyexternalidResponse.Result.Customer"));
		result.setDeleted(_ctx.booleanValue("GetLinkeBahamutTenantgetbyexternalidResponse.Result.Deleted"));
		result.setDisplayName(_ctx.stringValue("GetLinkeBahamutTenantgetbyexternalidResponse.Result.DisplayName"));
		result.setDropQualityApprovslDate(_ctx.longValue("GetLinkeBahamutTenantgetbyexternalidResponse.Result.DropQualityApprovslDate"));
		result.setEndPoint(_ctx.stringValue("GetLinkeBahamutTenantgetbyexternalidResponse.Result.EndPoint"));
		result.setExternalId(_ctx.stringValue("GetLinkeBahamutTenantgetbyexternalidResponse.Result.ExternalId"));
		result.setFromAliyun(_ctx.booleanValue("GetLinkeBahamutTenantgetbyexternalidResponse.Result.FromAliyun"));
		result.setFrontHost(_ctx.stringValue("GetLinkeBahamutTenantgetbyexternalidResponse.Result.FrontHost"));
		result.setGitlabPrefixMap(_ctx.stringValue("GetLinkeBahamutTenantgetbyexternalidResponse.Result.GitlabPrefixMap"));
		result.setGitLabSite(_ctx.stringValue("GetLinkeBahamutTenantgetbyexternalidResponse.Result.GitLabSite"));
		result.setHaveNotInited(_ctx.booleanValue("GetLinkeBahamutTenantgetbyexternalidResponse.Result.HaveNotInited"));
		result.setHighAvailabilityEnabled(_ctx.booleanValue("GetLinkeBahamutTenantgetbyexternalidResponse.Result.HighAvailabilityEnabled"));
		result.setId(_ctx.stringValue("GetLinkeBahamutTenantgetbyexternalidResponse.Result.Id"));
		result.setIndebt(_ctx.booleanValue("GetLinkeBahamutTenantgetbyexternalidResponse.Result.Indebt"));
		result.setInitStep(_ctx.stringValue("GetLinkeBahamutTenantgetbyexternalidResponse.Result.InitStep"));
		result.setJarEnabled(_ctx.booleanValue("GetLinkeBahamutTenantgetbyexternalidResponse.Result.JarEnabled"));
		result.setLastModified(_ctx.longValue("GetLinkeBahamutTenantgetbyexternalidResponse.Result.LastModified"));
		result.setMergeRequestEnabled(_ctx.booleanValue("GetLinkeBahamutTenantgetbyexternalidResponse.Result.MergeRequestEnabled"));
		result.setName(_ctx.stringValue("GetLinkeBahamutTenantgetbyexternalidResponse.Result.Name"));
		result.setOpenMyBankControl(_ctx.booleanValue("GetLinkeBahamutTenantgetbyexternalidResponse.Result.OpenMyBankControl"));
		result.setPath(_ctx.stringValue("GetLinkeBahamutTenantgetbyexternalidResponse.Result.Path"));
		result.setReleaseControlEnabled(_ctx.booleanValue("GetLinkeBahamutTenantgetbyexternalidResponse.Result.ReleaseControlEnabled"));
		result.setShowNewPRParamer(_ctx.booleanValue("GetLinkeBahamutTenantgetbyexternalidResponse.Result.ShowNewPRParamer"));
		result.setUseConfigTypes(_ctx.booleanValue("GetLinkeBahamutTenantgetbyexternalidResponse.Result.UseConfigTypes"));
		result.setUseNewAppReleaseShow(_ctx.booleanValue("GetLinkeBahamutTenantgetbyexternalidResponse.Result.UseNewAppReleaseShow"));
		result.setUseNewCloudAppImportView(_ctx.booleanValue("GetLinkeBahamutTenantgetbyexternalidResponse.Result.UseNewCloudAppImportView"));

		List<String> authorizedUsers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutTenantgetbyexternalidResponse.Result.AuthorizedUsers.Length"); i++) {
			authorizedUsers.add(_ctx.stringValue("GetLinkeBahamutTenantgetbyexternalidResponse.Result.AuthorizedUsers["+ i +"]"));
		}
		result.setAuthorizedUsers(authorizedUsers);

		List<String> configTypes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutTenantgetbyexternalidResponse.Result.ConfigTypes.Length"); i++) {
			configTypes.add(_ctx.stringValue("GetLinkeBahamutTenantgetbyexternalidResponse.Result.ConfigTypes["+ i +"]"));
		}
		result.setConfigTypes(configTypes);

		List<String> sitMergeTrialList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutTenantgetbyexternalidResponse.Result.SitMergeTrialList.Length"); i++) {
			sitMergeTrialList.add(_ctx.stringValue("GetLinkeBahamutTenantgetbyexternalidResponse.Result.SitMergeTrialList["+ i +"]"));
		}
		result.setSitMergeTrialList(sitMergeTrialList);

		List<String> trialList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutTenantgetbyexternalidResponse.Result.TrialList.Length"); i++) {
			trialList.add(_ctx.stringValue("GetLinkeBahamutTenantgetbyexternalidResponse.Result.TrialList["+ i +"]"));
		}
		result.setTrialList(trialList);

		List<String> zoneModeList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutTenantgetbyexternalidResponse.Result.ZoneModeList.Length"); i++) {
			zoneModeList.add(_ctx.stringValue("GetLinkeBahamutTenantgetbyexternalidResponse.Result.ZoneModeList["+ i +"]"));
		}
		result.setZoneModeList(zoneModeList);
		getLinkeBahamutTenantgetbyexternalidResponse.setResult(result);
	 
	 	return getLinkeBahamutTenantgetbyexternalidResponse;
	}
}