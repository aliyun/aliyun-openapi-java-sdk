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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutAdminuserroleResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutAdminuserroleResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutAdminuserroleResponseUnmarshaller {

	public static QueryLinkeBahamutAdminuserroleResponse unmarshall(QueryLinkeBahamutAdminuserroleResponse queryLinkeBahamutAdminuserroleResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutAdminuserroleResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutAdminuserroleResponse.RequestId"));
		queryLinkeBahamutAdminuserroleResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutAdminuserroleResponse.ResultCode"));
		queryLinkeBahamutAdminuserroleResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutAdminuserroleResponse.ResultMessage"));
		queryLinkeBahamutAdminuserroleResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutAdminuserroleResponse.ErrorMessage"));
		queryLinkeBahamutAdminuserroleResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutAdminuserroleResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutAdminuserroleResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutAdminuserroleResponse.Message"));
		queryLinkeBahamutAdminuserroleResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutAdminuserroleResponse.ResponseStatusCode"));
		queryLinkeBahamutAdminuserroleResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutAdminuserroleResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutAdminuserroleResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAccount(_ctx.stringValue("QueryLinkeBahamutAdminuserroleResponse.Result["+ i +"].Account"));
			resultItem.setCreated(_ctx.longValue("QueryLinkeBahamutAdminuserroleResponse.Result["+ i +"].Created"));
			resultItem.setDeleted(_ctx.booleanValue("QueryLinkeBahamutAdminuserroleResponse.Result["+ i +"].Deleted"));
			resultItem.setId(_ctx.stringValue("QueryLinkeBahamutAdminuserroleResponse.Result["+ i +"].Id"));
			resultItem.setLastModified(_ctx.longValue("QueryLinkeBahamutAdminuserroleResponse.Result["+ i +"].LastModified"));
			resultItem.setRole(_ctx.stringValue("QueryLinkeBahamutAdminuserroleResponse.Result["+ i +"].Role"));
			resultItem.setTenant(_ctx.stringValue("QueryLinkeBahamutAdminuserroleResponse.Result["+ i +"].Tenant"));

			result.add(resultItem);
		}
		queryLinkeBahamutAdminuserroleResponse.setResult(result);
	 
	 	return queryLinkeBahamutAdminuserroleResponse;
	}
}