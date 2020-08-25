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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutWorkspacewithoutakResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutWorkspacewithoutakResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutWorkspacewithoutakResponseUnmarshaller {

	public static QueryLinkeBahamutWorkspacewithoutakResponse unmarshall(QueryLinkeBahamutWorkspacewithoutakResponse queryLinkeBahamutWorkspacewithoutakResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutWorkspacewithoutakResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutWorkspacewithoutakResponse.RequestId"));
		queryLinkeBahamutWorkspacewithoutakResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutWorkspacewithoutakResponse.ResultCode"));
		queryLinkeBahamutWorkspacewithoutakResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutWorkspacewithoutakResponse.ResultMessage"));
		queryLinkeBahamutWorkspacewithoutakResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutWorkspacewithoutakResponse.ErrorMessage"));
		queryLinkeBahamutWorkspacewithoutakResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutWorkspacewithoutakResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutWorkspacewithoutakResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutWorkspacewithoutakResponse.Message"));
		queryLinkeBahamutWorkspacewithoutakResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutWorkspacewithoutakResponse.ResponseStatusCode"));
		queryLinkeBahamutWorkspacewithoutakResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutWorkspacewithoutakResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutWorkspacewithoutakResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAccessKey(_ctx.stringValue("QueryLinkeBahamutWorkspacewithoutakResponse.Result["+ i +"].AccessKey"));
			resultItem.setAccessSecret(_ctx.stringValue("QueryLinkeBahamutWorkspacewithoutakResponse.Result["+ i +"].AccessSecret"));
			resultItem.setCloudTenant(_ctx.stringValue("QueryLinkeBahamutWorkspacewithoutakResponse.Result["+ i +"].CloudTenant"));
			resultItem.setClusterId(_ctx.stringValue("QueryLinkeBahamutWorkspacewithoutakResponse.Result["+ i +"].ClusterId"));
			resultItem.setCreated(_ctx.longValue("QueryLinkeBahamutWorkspacewithoutakResponse.Result["+ i +"].Created"));
			resultItem.setCrossCloud(_ctx.booleanValue("QueryLinkeBahamutWorkspacewithoutakResponse.Result["+ i +"].CrossCloud"));
			resultItem.setCustomerId(_ctx.stringValue("QueryLinkeBahamutWorkspacewithoutakResponse.Result["+ i +"].CustomerId"));
			resultItem.setDefaultUse(_ctx.booleanValue("QueryLinkeBahamutWorkspacewithoutakResponse.Result["+ i +"].DefaultUse"));
			resultItem.setDeleted(_ctx.booleanValue("QueryLinkeBahamutWorkspacewithoutakResponse.Result["+ i +"].Deleted"));
			resultItem.setEnvId(_ctx.stringValue("QueryLinkeBahamutWorkspacewithoutakResponse.Result["+ i +"].EnvId"));
			resultItem.setExtraInfo(_ctx.stringValue("QueryLinkeBahamutWorkspacewithoutakResponse.Result["+ i +"].ExtraInfo"));
			resultItem.setId(_ctx.stringValue("QueryLinkeBahamutWorkspacewithoutakResponse.Result["+ i +"].Id"));
			resultItem.setLastModified(_ctx.longValue("QueryLinkeBahamutWorkspacewithoutakResponse.Result["+ i +"].LastModified"));
			resultItem.setLinkETenant(_ctx.stringValue("QueryLinkeBahamutWorkspacewithoutakResponse.Result["+ i +"].LinkETenant"));
			resultItem.setModifier(_ctx.stringValue("QueryLinkeBahamutWorkspacewithoutakResponse.Result["+ i +"].Modifier"));
			resultItem.setNamespace(_ctx.stringValue("QueryLinkeBahamutWorkspacewithoutakResponse.Result["+ i +"].Namespace"));
			resultItem.setType(_ctx.stringValue("QueryLinkeBahamutWorkspacewithoutakResponse.Result["+ i +"].Type"));
			resultItem.setUse(_ctx.stringValue("QueryLinkeBahamutWorkspacewithoutakResponse.Result["+ i +"].Use"));
			resultItem.setWorkspaceGroupId(_ctx.stringValue("QueryLinkeBahamutWorkspacewithoutakResponse.Result["+ i +"].WorkspaceGroupId"));
			resultItem.setWorkspaceId(_ctx.stringValue("QueryLinkeBahamutWorkspacewithoutakResponse.Result["+ i +"].WorkspaceId"));
			resultItem.setWorkspaceName(_ctx.stringValue("QueryLinkeBahamutWorkspacewithoutakResponse.Result["+ i +"].WorkspaceName"));

			result.add(resultItem);
		}
		queryLinkeBahamutWorkspacewithoutakResponse.setResult(result);
	 
	 	return queryLinkeBahamutWorkspacewithoutakResponse;
	}
}