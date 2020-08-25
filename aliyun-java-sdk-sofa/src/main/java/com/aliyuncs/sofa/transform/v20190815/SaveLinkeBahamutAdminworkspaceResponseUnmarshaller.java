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

import com.aliyuncs.sofa.model.v20190815.SaveLinkeBahamutAdminworkspaceResponse;
import com.aliyuncs.sofa.model.v20190815.SaveLinkeBahamutAdminworkspaceResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class SaveLinkeBahamutAdminworkspaceResponseUnmarshaller {

	public static SaveLinkeBahamutAdminworkspaceResponse unmarshall(SaveLinkeBahamutAdminworkspaceResponse saveLinkeBahamutAdminworkspaceResponse, UnmarshallerContext _ctx) {
		
		saveLinkeBahamutAdminworkspaceResponse.setRequestId(_ctx.stringValue("SaveLinkeBahamutAdminworkspaceResponse.RequestId"));
		saveLinkeBahamutAdminworkspaceResponse.setResultCode(_ctx.stringValue("SaveLinkeBahamutAdminworkspaceResponse.ResultCode"));
		saveLinkeBahamutAdminworkspaceResponse.setResultMessage(_ctx.stringValue("SaveLinkeBahamutAdminworkspaceResponse.ResultMessage"));
		saveLinkeBahamutAdminworkspaceResponse.setErrorMessage(_ctx.stringValue("SaveLinkeBahamutAdminworkspaceResponse.ErrorMessage"));
		saveLinkeBahamutAdminworkspaceResponse.setErrorMsgParamsMap(_ctx.stringValue("SaveLinkeBahamutAdminworkspaceResponse.ErrorMsgParamsMap"));
		saveLinkeBahamutAdminworkspaceResponse.setMessage(_ctx.stringValue("SaveLinkeBahamutAdminworkspaceResponse.Message"));
		saveLinkeBahamutAdminworkspaceResponse.setResponseStatusCode(_ctx.longValue("SaveLinkeBahamutAdminworkspaceResponse.ResponseStatusCode"));
		saveLinkeBahamutAdminworkspaceResponse.setSuccess(_ctx.booleanValue("SaveLinkeBahamutAdminworkspaceResponse.Success"));

		Result result = new Result();
		result.setAccessKey(_ctx.stringValue("SaveLinkeBahamutAdminworkspaceResponse.Result.AccessKey"));
		result.setAccessSecret(_ctx.stringValue("SaveLinkeBahamutAdminworkspaceResponse.Result.AccessSecret"));
		result.setCloudTenant(_ctx.stringValue("SaveLinkeBahamutAdminworkspaceResponse.Result.CloudTenant"));
		result.setClusterId(_ctx.stringValue("SaveLinkeBahamutAdminworkspaceResponse.Result.ClusterId"));
		result.setCreated(_ctx.longValue("SaveLinkeBahamutAdminworkspaceResponse.Result.Created"));
		result.setCrossCloud(_ctx.booleanValue("SaveLinkeBahamutAdminworkspaceResponse.Result.CrossCloud"));
		result.setCustomerId(_ctx.stringValue("SaveLinkeBahamutAdminworkspaceResponse.Result.CustomerId"));
		result.setDefaultUse(_ctx.booleanValue("SaveLinkeBahamutAdminworkspaceResponse.Result.DefaultUse"));
		result.setDeleted(_ctx.booleanValue("SaveLinkeBahamutAdminworkspaceResponse.Result.Deleted"));
		result.setEnvId(_ctx.stringValue("SaveLinkeBahamutAdminworkspaceResponse.Result.EnvId"));
		result.setExtraInfo(_ctx.stringValue("SaveLinkeBahamutAdminworkspaceResponse.Result.ExtraInfo"));
		result.setId(_ctx.stringValue("SaveLinkeBahamutAdminworkspaceResponse.Result.Id"));
		result.setLastModified(_ctx.longValue("SaveLinkeBahamutAdminworkspaceResponse.Result.LastModified"));
		result.setLinkETenant(_ctx.stringValue("SaveLinkeBahamutAdminworkspaceResponse.Result.LinkETenant"));
		result.setModifier(_ctx.stringValue("SaveLinkeBahamutAdminworkspaceResponse.Result.Modifier"));
		result.setNamespace(_ctx.stringValue("SaveLinkeBahamutAdminworkspaceResponse.Result.Namespace"));
		result.setType(_ctx.stringValue("SaveLinkeBahamutAdminworkspaceResponse.Result.Type"));
		result.setUse(_ctx.stringValue("SaveLinkeBahamutAdminworkspaceResponse.Result.Use"));
		result.setWorkspaceGroupId(_ctx.stringValue("SaveLinkeBahamutAdminworkspaceResponse.Result.WorkspaceGroupId"));
		result.setWorkspaceId(_ctx.stringValue("SaveLinkeBahamutAdminworkspaceResponse.Result.WorkspaceId"));
		result.setWorkspaceName(_ctx.stringValue("SaveLinkeBahamutAdminworkspaceResponse.Result.WorkspaceName"));
		saveLinkeBahamutAdminworkspaceResponse.setResult(result);
	 
	 	return saveLinkeBahamutAdminworkspaceResponse;
	}
}