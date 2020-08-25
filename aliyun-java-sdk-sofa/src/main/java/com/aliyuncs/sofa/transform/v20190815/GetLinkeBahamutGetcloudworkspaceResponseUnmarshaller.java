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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutGetcloudworkspaceResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutGetcloudworkspaceResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutGetcloudworkspaceResponseUnmarshaller {

	public static GetLinkeBahamutGetcloudworkspaceResponse unmarshall(GetLinkeBahamutGetcloudworkspaceResponse getLinkeBahamutGetcloudworkspaceResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutGetcloudworkspaceResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutGetcloudworkspaceResponse.RequestId"));
		getLinkeBahamutGetcloudworkspaceResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutGetcloudworkspaceResponse.ResultCode"));
		getLinkeBahamutGetcloudworkspaceResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutGetcloudworkspaceResponse.ResultMessage"));
		getLinkeBahamutGetcloudworkspaceResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutGetcloudworkspaceResponse.ErrorMessage"));
		getLinkeBahamutGetcloudworkspaceResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutGetcloudworkspaceResponse.ErrorMsgParamsMap"));
		getLinkeBahamutGetcloudworkspaceResponse.setMessage(_ctx.stringValue("GetLinkeBahamutGetcloudworkspaceResponse.Message"));
		getLinkeBahamutGetcloudworkspaceResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutGetcloudworkspaceResponse.ResponseStatusCode"));
		getLinkeBahamutGetcloudworkspaceResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutGetcloudworkspaceResponse.Success"));

		Result result = new Result();
		result.setAccessKey(_ctx.stringValue("GetLinkeBahamutGetcloudworkspaceResponse.Result.AccessKey"));
		result.setAccessSecret(_ctx.stringValue("GetLinkeBahamutGetcloudworkspaceResponse.Result.AccessSecret"));
		result.setCloudTenant(_ctx.stringValue("GetLinkeBahamutGetcloudworkspaceResponse.Result.CloudTenant"));
		result.setClusterId(_ctx.stringValue("GetLinkeBahamutGetcloudworkspaceResponse.Result.ClusterId"));
		result.setCreated(_ctx.longValue("GetLinkeBahamutGetcloudworkspaceResponse.Result.Created"));
		result.setCrossCloud(_ctx.booleanValue("GetLinkeBahamutGetcloudworkspaceResponse.Result.CrossCloud"));
		result.setCustomerId(_ctx.stringValue("GetLinkeBahamutGetcloudworkspaceResponse.Result.CustomerId"));
		result.setDefaultUse(_ctx.booleanValue("GetLinkeBahamutGetcloudworkspaceResponse.Result.DefaultUse"));
		result.setDeleted(_ctx.booleanValue("GetLinkeBahamutGetcloudworkspaceResponse.Result.Deleted"));
		result.setEnvId(_ctx.stringValue("GetLinkeBahamutGetcloudworkspaceResponse.Result.EnvId"));
		result.setExtraInfo(_ctx.stringValue("GetLinkeBahamutGetcloudworkspaceResponse.Result.ExtraInfo"));
		result.setId(_ctx.stringValue("GetLinkeBahamutGetcloudworkspaceResponse.Result.Id"));
		result.setLastModified(_ctx.longValue("GetLinkeBahamutGetcloudworkspaceResponse.Result.LastModified"));
		result.setLinkETenant(_ctx.stringValue("GetLinkeBahamutGetcloudworkspaceResponse.Result.LinkETenant"));
		result.setModifier(_ctx.stringValue("GetLinkeBahamutGetcloudworkspaceResponse.Result.Modifier"));
		result.setNamespace(_ctx.stringValue("GetLinkeBahamutGetcloudworkspaceResponse.Result.Namespace"));
		result.setType(_ctx.stringValue("GetLinkeBahamutGetcloudworkspaceResponse.Result.Type"));
		result.setUse(_ctx.stringValue("GetLinkeBahamutGetcloudworkspaceResponse.Result.Use"));
		result.setWorkspaceGroupId(_ctx.stringValue("GetLinkeBahamutGetcloudworkspaceResponse.Result.WorkspaceGroupId"));
		result.setWorkspaceId(_ctx.stringValue("GetLinkeBahamutGetcloudworkspaceResponse.Result.WorkspaceId"));
		result.setWorkspaceName(_ctx.stringValue("GetLinkeBahamutGetcloudworkspaceResponse.Result.WorkspaceName"));
		getLinkeBahamutGetcloudworkspaceResponse.setResult(result);
	 
	 	return getLinkeBahamutGetcloudworkspaceResponse;
	}
}