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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutPaasqueryserversResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutPaasqueryserversResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutPaasqueryserversResponseUnmarshaller {

	public static QueryLinkeBahamutPaasqueryserversResponse unmarshall(QueryLinkeBahamutPaasqueryserversResponse queryLinkeBahamutPaasqueryserversResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutPaasqueryserversResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutPaasqueryserversResponse.RequestId"));
		queryLinkeBahamutPaasqueryserversResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutPaasqueryserversResponse.ResultCode"));
		queryLinkeBahamutPaasqueryserversResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutPaasqueryserversResponse.ResultMessage"));
		queryLinkeBahamutPaasqueryserversResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutPaasqueryserversResponse.ErrorMessage"));
		queryLinkeBahamutPaasqueryserversResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutPaasqueryserversResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutPaasqueryserversResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutPaasqueryserversResponse.Message"));
		queryLinkeBahamutPaasqueryserversResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutPaasqueryserversResponse.ResponseStatusCode"));
		queryLinkeBahamutPaasqueryserversResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutPaasqueryserversResponse.Success"));

		Result result = new Result();
		result.setStatus(_ctx.stringValue("QueryLinkeBahamutPaasqueryserversResponse.Result.Status"));

		List<String> servers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutPaasqueryserversResponse.Result.Servers.Length"); i++) {
			servers.add(_ctx.stringValue("QueryLinkeBahamutPaasqueryserversResponse.Result.Servers["+ i +"]"));
		}
		result.setServers(servers);
		queryLinkeBahamutPaasqueryserversResponse.setResult(result);
	 
	 	return queryLinkeBahamutPaasqueryserversResponse;
	}
}