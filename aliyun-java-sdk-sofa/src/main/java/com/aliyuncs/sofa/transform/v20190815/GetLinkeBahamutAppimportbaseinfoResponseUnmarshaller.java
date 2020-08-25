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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutAppimportbaseinfoResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutAppimportbaseinfoResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutAppimportbaseinfoResponseUnmarshaller {

	public static GetLinkeBahamutAppimportbaseinfoResponse unmarshall(GetLinkeBahamutAppimportbaseinfoResponse getLinkeBahamutAppimportbaseinfoResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutAppimportbaseinfoResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutAppimportbaseinfoResponse.RequestId"));
		getLinkeBahamutAppimportbaseinfoResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutAppimportbaseinfoResponse.ResultCode"));
		getLinkeBahamutAppimportbaseinfoResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutAppimportbaseinfoResponse.ResultMessage"));
		getLinkeBahamutAppimportbaseinfoResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutAppimportbaseinfoResponse.ErrorMessage"));
		getLinkeBahamutAppimportbaseinfoResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutAppimportbaseinfoResponse.ErrorMsgParamsMap"));
		getLinkeBahamutAppimportbaseinfoResponse.setMessage(_ctx.stringValue("GetLinkeBahamutAppimportbaseinfoResponse.Message"));
		getLinkeBahamutAppimportbaseinfoResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutAppimportbaseinfoResponse.ResponseStatusCode"));
		getLinkeBahamutAppimportbaseinfoResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutAppimportbaseinfoResponse.Success"));

		Result result = new Result();
		result.setAccessControl(_ctx.stringValue("GetLinkeBahamutAppimportbaseinfoResponse.Result.AccessControl"));
		result.setAppDisplayName(_ctx.stringValue("GetLinkeBahamutAppimportbaseinfoResponse.Result.AppDisplayName"));
		result.setAppLevel(_ctx.stringValue("GetLinkeBahamutAppimportbaseinfoResponse.Result.AppLevel"));
		result.setAppName(_ctx.stringValue("GetLinkeBahamutAppimportbaseinfoResponse.Result.AppName"));
		result.setAppTechStackName(_ctx.stringValue("GetLinkeBahamutAppimportbaseinfoResponse.Result.AppTechStackName"));
		result.setAppType(_ctx.stringValue("GetLinkeBahamutAppimportbaseinfoResponse.Result.AppType"));
		result.setArchDomainId(_ctx.stringValue("GetLinkeBahamutAppimportbaseinfoResponse.Result.ArchDomainId"));
		result.setCreateApp(_ctx.booleanValue("GetLinkeBahamutAppimportbaseinfoResponse.Result.CreateApp"));
		result.setCreateRepo(_ctx.booleanValue("GetLinkeBahamutAppimportbaseinfoResponse.Result.CreateRepo"));
		result.setDescription(_ctx.stringValue("GetLinkeBahamutAppimportbaseinfoResponse.Result.Description"));
		result.setFromLocal(_ctx.booleanValue("GetLinkeBahamutAppimportbaseinfoResponse.Result.FromLocal"));
		result.setGroup(_ctx.stringValue("GetLinkeBahamutAppimportbaseinfoResponse.Result.Group"));
		result.setRepo(_ctx.stringValue("GetLinkeBahamutAppimportbaseinfoResponse.Result.Repo"));
		result.setRepoEncode(_ctx.stringValue("GetLinkeBahamutAppimportbaseinfoResponse.Result.RepoEncode"));
		result.setRepoUrl(_ctx.stringValue("GetLinkeBahamutAppimportbaseinfoResponse.Result.RepoUrl"));
		result.setTechV2(_ctx.booleanValue("GetLinkeBahamutAppimportbaseinfoResponse.Result.TechV2"));
		result.setTenantExternalId(_ctx.stringValue("GetLinkeBahamutAppimportbaseinfoResponse.Result.TenantExternalId"));

		List<String> devOwnerAccounts = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutAppimportbaseinfoResponse.Result.DevOwnerAccounts.Length"); i++) {
			devOwnerAccounts.add(_ctx.stringValue("GetLinkeBahamutAppimportbaseinfoResponse.Result.DevOwnerAccounts["+ i +"]"));
		}
		result.setDevOwnerAccounts(devOwnerAccounts);

		List<String> fileList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutAppimportbaseinfoResponse.Result.FileList.Length"); i++) {
			fileList.add(_ctx.stringValue("GetLinkeBahamutAppimportbaseinfoResponse.Result.FileList["+ i +"]"));
		}
		result.setFileList(fileList);

		List<String> syncCloudTenants = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutAppimportbaseinfoResponse.Result.SyncCloudTenants.Length"); i++) {
			syncCloudTenants.add(_ctx.stringValue("GetLinkeBahamutAppimportbaseinfoResponse.Result.SyncCloudTenants["+ i +"]"));
		}
		result.setSyncCloudTenants(syncCloudTenants);

		List<String> testOwnerAccounts = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutAppimportbaseinfoResponse.Result.TestOwnerAccounts.Length"); i++) {
			testOwnerAccounts.add(_ctx.stringValue("GetLinkeBahamutAppimportbaseinfoResponse.Result.TestOwnerAccounts["+ i +"]"));
		}
		result.setTestOwnerAccounts(testOwnerAccounts);
		getLinkeBahamutAppimportbaseinfoResponse.setResult(result);
	 
	 	return getLinkeBahamutAppimportbaseinfoResponse;
	}
}