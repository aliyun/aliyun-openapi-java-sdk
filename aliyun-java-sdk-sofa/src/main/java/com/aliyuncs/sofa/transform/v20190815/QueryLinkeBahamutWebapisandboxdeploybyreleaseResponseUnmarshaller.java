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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutWebapisandboxdeploybyreleaseResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutWebapisandboxdeploybyreleaseResponseUnmarshaller {

	public static QueryLinkeBahamutWebapisandboxdeploybyreleaseResponse unmarshall(QueryLinkeBahamutWebapisandboxdeploybyreleaseResponse queryLinkeBahamutWebapisandboxdeploybyreleaseResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutWebapisandboxdeploybyreleaseResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutWebapisandboxdeploybyreleaseResponse.RequestId"));
		queryLinkeBahamutWebapisandboxdeploybyreleaseResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutWebapisandboxdeploybyreleaseResponse.ResultCode"));
		queryLinkeBahamutWebapisandboxdeploybyreleaseResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutWebapisandboxdeploybyreleaseResponse.ResultMessage"));
		queryLinkeBahamutWebapisandboxdeploybyreleaseResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutWebapisandboxdeploybyreleaseResponse.ErrorMessage"));
		queryLinkeBahamutWebapisandboxdeploybyreleaseResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutWebapisandboxdeploybyreleaseResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutWebapisandboxdeploybyreleaseResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutWebapisandboxdeploybyreleaseResponse.Message"));
		queryLinkeBahamutWebapisandboxdeploybyreleaseResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutWebapisandboxdeploybyreleaseResponse.ResponseStatusCode"));
		queryLinkeBahamutWebapisandboxdeploybyreleaseResponse.setResult(_ctx.stringValue("QueryLinkeBahamutWebapisandboxdeploybyreleaseResponse.Result"));
		queryLinkeBahamutWebapisandboxdeploybyreleaseResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutWebapisandboxdeploybyreleaseResponse.Success"));
	 
	 	return queryLinkeBahamutWebapisandboxdeploybyreleaseResponse;
	}
}