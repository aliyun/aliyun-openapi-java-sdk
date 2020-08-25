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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutSandboxdeployResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutSandboxdeployResponseUnmarshaller {

	public static QueryLinkeBahamutSandboxdeployResponse unmarshall(QueryLinkeBahamutSandboxdeployResponse queryLinkeBahamutSandboxdeployResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutSandboxdeployResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutSandboxdeployResponse.RequestId"));
		queryLinkeBahamutSandboxdeployResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutSandboxdeployResponse.ResultCode"));
		queryLinkeBahamutSandboxdeployResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutSandboxdeployResponse.ResultMessage"));
		queryLinkeBahamutSandboxdeployResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutSandboxdeployResponse.ErrorMessage"));
		queryLinkeBahamutSandboxdeployResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutSandboxdeployResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutSandboxdeployResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutSandboxdeployResponse.Message"));
		queryLinkeBahamutSandboxdeployResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutSandboxdeployResponse.ResponseStatusCode"));
		queryLinkeBahamutSandboxdeployResponse.setResult(_ctx.stringValue("QueryLinkeBahamutSandboxdeployResponse.Result"));
		queryLinkeBahamutSandboxdeployResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutSandboxdeployResponse.Success"));
	 
	 	return queryLinkeBahamutSandboxdeployResponse;
	}
}