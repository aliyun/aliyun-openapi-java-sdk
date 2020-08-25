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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutSandboxdeploycheckResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutSandboxdeploycheckResponseUnmarshaller {

	public static QueryLinkeBahamutSandboxdeploycheckResponse unmarshall(QueryLinkeBahamutSandboxdeploycheckResponse queryLinkeBahamutSandboxdeploycheckResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutSandboxdeploycheckResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutSandboxdeploycheckResponse.RequestId"));
		queryLinkeBahamutSandboxdeploycheckResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutSandboxdeploycheckResponse.ResultCode"));
		queryLinkeBahamutSandboxdeploycheckResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutSandboxdeploycheckResponse.ResultMessage"));
		queryLinkeBahamutSandboxdeploycheckResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutSandboxdeploycheckResponse.ErrorMessage"));
		queryLinkeBahamutSandboxdeploycheckResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutSandboxdeploycheckResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutSandboxdeploycheckResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutSandboxdeploycheckResponse.Message"));
		queryLinkeBahamutSandboxdeploycheckResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutSandboxdeploycheckResponse.ResponseStatusCode"));
		queryLinkeBahamutSandboxdeploycheckResponse.setResult(_ctx.stringValue("QueryLinkeBahamutSandboxdeploycheckResponse.Result"));
		queryLinkeBahamutSandboxdeploycheckResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutSandboxdeploycheckResponse.Success"));
	 
	 	return queryLinkeBahamutSandboxdeploycheckResponse;
	}
}