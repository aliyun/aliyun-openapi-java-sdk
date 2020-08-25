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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutReleasesandboxdeployResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutReleasesandboxdeployResponseUnmarshaller {

	public static QueryLinkeBahamutReleasesandboxdeployResponse unmarshall(QueryLinkeBahamutReleasesandboxdeployResponse queryLinkeBahamutReleasesandboxdeployResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutReleasesandboxdeployResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutReleasesandboxdeployResponse.RequestId"));
		queryLinkeBahamutReleasesandboxdeployResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutReleasesandboxdeployResponse.ResultCode"));
		queryLinkeBahamutReleasesandboxdeployResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutReleasesandboxdeployResponse.ResultMessage"));
		queryLinkeBahamutReleasesandboxdeployResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutReleasesandboxdeployResponse.ErrorMessage"));
		queryLinkeBahamutReleasesandboxdeployResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutReleasesandboxdeployResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutReleasesandboxdeployResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutReleasesandboxdeployResponse.Message"));
		queryLinkeBahamutReleasesandboxdeployResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutReleasesandboxdeployResponse.ResponseStatusCode"));
		queryLinkeBahamutReleasesandboxdeployResponse.setResult(_ctx.stringValue("QueryLinkeBahamutReleasesandboxdeployResponse.Result"));
		queryLinkeBahamutReleasesandboxdeployResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutReleasesandboxdeployResponse.Success"));
	 
	 	return queryLinkeBahamutReleasesandboxdeployResponse;
	}
}