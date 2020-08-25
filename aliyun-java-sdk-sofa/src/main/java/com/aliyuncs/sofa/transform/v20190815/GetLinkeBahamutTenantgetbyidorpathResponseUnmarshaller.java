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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutTenantgetbyidorpathResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutTenantgetbyidorpathResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutTenantgetbyidorpathResponseUnmarshaller {

	public static GetLinkeBahamutTenantgetbyidorpathResponse unmarshall(GetLinkeBahamutTenantgetbyidorpathResponse getLinkeBahamutTenantgetbyidorpathResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutTenantgetbyidorpathResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutTenantgetbyidorpathResponse.RequestId"));
		getLinkeBahamutTenantgetbyidorpathResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutTenantgetbyidorpathResponse.ResultCode"));
		getLinkeBahamutTenantgetbyidorpathResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutTenantgetbyidorpathResponse.ResultMessage"));
		getLinkeBahamutTenantgetbyidorpathResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutTenantgetbyidorpathResponse.ErrorMessage"));
		getLinkeBahamutTenantgetbyidorpathResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutTenantgetbyidorpathResponse.ErrorMsgParamsMap"));
		getLinkeBahamutTenantgetbyidorpathResponse.setMessage(_ctx.stringValue("GetLinkeBahamutTenantgetbyidorpathResponse.Message"));
		getLinkeBahamutTenantgetbyidorpathResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutTenantgetbyidorpathResponse.ResponseStatusCode"));
		getLinkeBahamutTenantgetbyidorpathResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutTenantgetbyidorpathResponse.Success"));

		Result result = new Result();
		result.setAccessKey(_ctx.stringValue("GetLinkeBahamutTenantgetbyidorpathResponse.Result.AccessKey"));
		result.setAccessSecret(_ctx.stringValue("GetLinkeBahamutTenantgetbyidorpathResponse.Result.AccessSecret"));
		result.setAccessToken(_ctx.stringValue("GetLinkeBahamutTenantgetbyidorpathResponse.Result.AccessToken"));
		result.setAntflowEnabled(_ctx.booleanValue("GetLinkeBahamutTenantgetbyidorpathResponse.Result.AntflowEnabled"));
		result.setCreated(_ctx.longValue("GetLinkeBahamutTenantgetbyidorpathResponse.Result.Created"));
		result.setCustomer(_ctx.stringValue("GetLinkeBahamutTenantgetbyidorpathResponse.Result.Customer"));
		result.setDeleted(_ctx.booleanValue("GetLinkeBahamutTenantgetbyidorpathResponse.Result.Deleted"));
		result.setDisplayName(_ctx.stringValue("GetLinkeBahamutTenantgetbyidorpathResponse.Result.DisplayName"));
		result.setDropQualityApprovslDate(_ctx.longValue("GetLinkeBahamutTenantgetbyidorpathResponse.Result.DropQualityApprovslDate"));
		result.setEndPoint(_ctx.stringValue("GetLinkeBahamutTenantgetbyidorpathResponse.Result.EndPoint"));
		result.setExternalId(_ctx.stringValue("GetLinkeBahamutTenantgetbyidorpathResponse.Result.ExternalId"));
		result.setFromAliyun(_ctx.booleanValue("GetLinkeBahamutTenantgetbyidorpathResponse.Result.FromAliyun"));
		result.setFrontHost(_ctx.stringValue("GetLinkeBahamutTenantgetbyidorpathResponse.Result.FrontHost"));
		result.setGitlabPrefixMap(_ctx.stringValue("GetLinkeBahamutTenantgetbyidorpathResponse.Result.GitlabPrefixMap"));
		result.setGitLabSite(_ctx.stringValue("GetLinkeBahamutTenantgetbyidorpathResponse.Result.GitLabSite"));
		result.setHaveNotInited(_ctx.booleanValue("GetLinkeBahamutTenantgetbyidorpathResponse.Result.HaveNotInited"));
		result.setHighAvailabilityEnabled(_ctx.booleanValue("GetLinkeBahamutTenantgetbyidorpathResponse.Result.HighAvailabilityEnabled"));
		result.setId(_ctx.stringValue("GetLinkeBahamutTenantgetbyidorpathResponse.Result.Id"));
		result.setIndebt(_ctx.booleanValue("GetLinkeBahamutTenantgetbyidorpathResponse.Result.Indebt"));
		result.setInitStep(_ctx.stringValue("GetLinkeBahamutTenantgetbyidorpathResponse.Result.InitStep"));
		result.setJarEnabled(_ctx.booleanValue("GetLinkeBahamutTenantgetbyidorpathResponse.Result.JarEnabled"));
		result.setLastModified(_ctx.longValue("GetLinkeBahamutTenantgetbyidorpathResponse.Result.LastModified"));
		result.setMergeRequestEnabled(_ctx.booleanValue("GetLinkeBahamutTenantgetbyidorpathResponse.Result.MergeRequestEnabled"));
		result.setName(_ctx.stringValue("GetLinkeBahamutTenantgetbyidorpathResponse.Result.Name"));
		result.setOpenMyBankControl(_ctx.booleanValue("GetLinkeBahamutTenantgetbyidorpathResponse.Result.OpenMyBankControl"));
		result.setPath(_ctx.stringValue("GetLinkeBahamutTenantgetbyidorpathResponse.Result.Path"));
		result.setReleaseControlEnabled(_ctx.booleanValue("GetLinkeBahamutTenantgetbyidorpathResponse.Result.ReleaseControlEnabled"));
		result.setShowNewPRParamer(_ctx.booleanValue("GetLinkeBahamutTenantgetbyidorpathResponse.Result.ShowNewPRParamer"));
		result.setUseConfigTypes(_ctx.booleanValue("GetLinkeBahamutTenantgetbyidorpathResponse.Result.UseConfigTypes"));
		result.setUseNewAppReleaseShow(_ctx.booleanValue("GetLinkeBahamutTenantgetbyidorpathResponse.Result.UseNewAppReleaseShow"));
		result.setUseNewCloudAppImportView(_ctx.booleanValue("GetLinkeBahamutTenantgetbyidorpathResponse.Result.UseNewCloudAppImportView"));

		List<String> authorizedUsers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutTenantgetbyidorpathResponse.Result.AuthorizedUsers.Length"); i++) {
			authorizedUsers.add(_ctx.stringValue("GetLinkeBahamutTenantgetbyidorpathResponse.Result.AuthorizedUsers["+ i +"]"));
		}
		result.setAuthorizedUsers(authorizedUsers);

		List<String> configTypes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutTenantgetbyidorpathResponse.Result.ConfigTypes.Length"); i++) {
			configTypes.add(_ctx.stringValue("GetLinkeBahamutTenantgetbyidorpathResponse.Result.ConfigTypes["+ i +"]"));
		}
		result.setConfigTypes(configTypes);

		List<String> sitMergeTrialList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutTenantgetbyidorpathResponse.Result.SitMergeTrialList.Length"); i++) {
			sitMergeTrialList.add(_ctx.stringValue("GetLinkeBahamutTenantgetbyidorpathResponse.Result.SitMergeTrialList["+ i +"]"));
		}
		result.setSitMergeTrialList(sitMergeTrialList);

		List<String> trialList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutTenantgetbyidorpathResponse.Result.TrialList.Length"); i++) {
			trialList.add(_ctx.stringValue("GetLinkeBahamutTenantgetbyidorpathResponse.Result.TrialList["+ i +"]"));
		}
		result.setTrialList(trialList);

		List<String> zoneModeList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutTenantgetbyidorpathResponse.Result.ZoneModeList.Length"); i++) {
			zoneModeList.add(_ctx.stringValue("GetLinkeBahamutTenantgetbyidorpathResponse.Result.ZoneModeList["+ i +"]"));
		}
		result.setZoneModeList(zoneModeList);
		getLinkeBahamutTenantgetbyidorpathResponse.setResult(result);
	 
	 	return getLinkeBahamutTenantgetbyidorpathResponse;
	}
}