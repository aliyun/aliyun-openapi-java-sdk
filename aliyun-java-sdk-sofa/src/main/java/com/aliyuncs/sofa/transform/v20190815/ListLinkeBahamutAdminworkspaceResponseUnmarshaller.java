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

import com.aliyuncs.sofa.model.v20190815.ListLinkeBahamutAdminworkspaceResponse;
import com.aliyuncs.sofa.model.v20190815.ListLinkeBahamutAdminworkspaceResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLinkeBahamutAdminworkspaceResponseUnmarshaller {

	public static ListLinkeBahamutAdminworkspaceResponse unmarshall(ListLinkeBahamutAdminworkspaceResponse listLinkeBahamutAdminworkspaceResponse, UnmarshallerContext _ctx) {
		
		listLinkeBahamutAdminworkspaceResponse.setRequestId(_ctx.stringValue("ListLinkeBahamutAdminworkspaceResponse.RequestId"));
		listLinkeBahamutAdminworkspaceResponse.setResultCode(_ctx.stringValue("ListLinkeBahamutAdminworkspaceResponse.ResultCode"));
		listLinkeBahamutAdminworkspaceResponse.setResultMessage(_ctx.stringValue("ListLinkeBahamutAdminworkspaceResponse.ResultMessage"));
		listLinkeBahamutAdminworkspaceResponse.setErrorMessage(_ctx.stringValue("ListLinkeBahamutAdminworkspaceResponse.ErrorMessage"));
		listLinkeBahamutAdminworkspaceResponse.setErrorMsgParamsMap(_ctx.stringValue("ListLinkeBahamutAdminworkspaceResponse.ErrorMsgParamsMap"));
		listLinkeBahamutAdminworkspaceResponse.setMessage(_ctx.stringValue("ListLinkeBahamutAdminworkspaceResponse.Message"));
		listLinkeBahamutAdminworkspaceResponse.setResponseStatusCode(_ctx.longValue("ListLinkeBahamutAdminworkspaceResponse.ResponseStatusCode"));
		listLinkeBahamutAdminworkspaceResponse.setSuccess(_ctx.booleanValue("ListLinkeBahamutAdminworkspaceResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListLinkeBahamutAdminworkspaceResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAccessKey(_ctx.stringValue("ListLinkeBahamutAdminworkspaceResponse.Result["+ i +"].AccessKey"));
			resultItem.setAccessSecret(_ctx.stringValue("ListLinkeBahamutAdminworkspaceResponse.Result["+ i +"].AccessSecret"));
			resultItem.setCloudTenant(_ctx.stringValue("ListLinkeBahamutAdminworkspaceResponse.Result["+ i +"].CloudTenant"));
			resultItem.setClusterId(_ctx.stringValue("ListLinkeBahamutAdminworkspaceResponse.Result["+ i +"].ClusterId"));
			resultItem.setCreated(_ctx.longValue("ListLinkeBahamutAdminworkspaceResponse.Result["+ i +"].Created"));
			resultItem.setCrossCloud(_ctx.booleanValue("ListLinkeBahamutAdminworkspaceResponse.Result["+ i +"].CrossCloud"));
			resultItem.setCustomerId(_ctx.stringValue("ListLinkeBahamutAdminworkspaceResponse.Result["+ i +"].CustomerId"));
			resultItem.setDefaultUse(_ctx.booleanValue("ListLinkeBahamutAdminworkspaceResponse.Result["+ i +"].DefaultUse"));
			resultItem.setDeleted(_ctx.booleanValue("ListLinkeBahamutAdminworkspaceResponse.Result["+ i +"].Deleted"));
			resultItem.setEnvId(_ctx.stringValue("ListLinkeBahamutAdminworkspaceResponse.Result["+ i +"].EnvId"));
			resultItem.setExtraInfo(_ctx.stringValue("ListLinkeBahamutAdminworkspaceResponse.Result["+ i +"].ExtraInfo"));
			resultItem.setId(_ctx.stringValue("ListLinkeBahamutAdminworkspaceResponse.Result["+ i +"].Id"));
			resultItem.setLastModified(_ctx.longValue("ListLinkeBahamutAdminworkspaceResponse.Result["+ i +"].LastModified"));
			resultItem.setLinkETenant(_ctx.stringValue("ListLinkeBahamutAdminworkspaceResponse.Result["+ i +"].LinkETenant"));
			resultItem.setModifier(_ctx.stringValue("ListLinkeBahamutAdminworkspaceResponse.Result["+ i +"].Modifier"));
			resultItem.setNamespace(_ctx.stringValue("ListLinkeBahamutAdminworkspaceResponse.Result["+ i +"].Namespace"));
			resultItem.setType(_ctx.stringValue("ListLinkeBahamutAdminworkspaceResponse.Result["+ i +"].Type"));
			resultItem.setUse(_ctx.stringValue("ListLinkeBahamutAdminworkspaceResponse.Result["+ i +"].Use"));
			resultItem.setWorkspaceGroupId(_ctx.stringValue("ListLinkeBahamutAdminworkspaceResponse.Result["+ i +"].WorkspaceGroupId"));
			resultItem.setWorkspaceId(_ctx.stringValue("ListLinkeBahamutAdminworkspaceResponse.Result["+ i +"].WorkspaceId"));
			resultItem.setWorkspaceName(_ctx.stringValue("ListLinkeBahamutAdminworkspaceResponse.Result["+ i +"].WorkspaceName"));

			result.add(resultItem);
		}
		listLinkeBahamutAdminworkspaceResponse.setResult(result);
	 
	 	return listLinkeBahamutAdminworkspaceResponse;
	}
}