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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutUsertokenResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutUsertokenResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutUsertokenResponseUnmarshaller {

	public static QueryLinkeBahamutUsertokenResponse unmarshall(QueryLinkeBahamutUsertokenResponse queryLinkeBahamutUsertokenResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutUsertokenResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutUsertokenResponse.RequestId"));
		queryLinkeBahamutUsertokenResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutUsertokenResponse.ResultCode"));
		queryLinkeBahamutUsertokenResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutUsertokenResponse.ResultMessage"));
		queryLinkeBahamutUsertokenResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutUsertokenResponse.ErrorMessage"));
		queryLinkeBahamutUsertokenResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutUsertokenResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutUsertokenResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutUsertokenResponse.Message"));
		queryLinkeBahamutUsertokenResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutUsertokenResponse.ResponseStatusCode"));
		queryLinkeBahamutUsertokenResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutUsertokenResponse.Success"));

		Result result = new Result();
		result.setAccount(_ctx.stringValue("QueryLinkeBahamutUsertokenResponse.Result.Account"));
		result.setCreated(_ctx.longValue("QueryLinkeBahamutUsertokenResponse.Result.Created"));
		result.setDeleted(_ctx.booleanValue("QueryLinkeBahamutUsertokenResponse.Result.Deleted"));
		result.setId(_ctx.stringValue("QueryLinkeBahamutUsertokenResponse.Result.Id"));
		result.setLastModified(_ctx.longValue("QueryLinkeBahamutUsertokenResponse.Result.LastModified"));
		result.setToken(_ctx.stringValue("QueryLinkeBahamutUsertokenResponse.Result.Token"));
		result.setUser(_ctx.stringValue("QueryLinkeBahamutUsertokenResponse.Result.User"));
		queryLinkeBahamutUsertokenResponse.setResult(result);
	 
	 	return queryLinkeBahamutUsertokenResponse;
	}
}