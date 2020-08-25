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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutReleaserollbacktagResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutReleaserollbacktagResponseUnmarshaller {

	public static QueryLinkeBahamutReleaserollbacktagResponse unmarshall(QueryLinkeBahamutReleaserollbacktagResponse queryLinkeBahamutReleaserollbacktagResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutReleaserollbacktagResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutReleaserollbacktagResponse.RequestId"));
		queryLinkeBahamutReleaserollbacktagResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutReleaserollbacktagResponse.ResultCode"));
		queryLinkeBahamutReleaserollbacktagResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutReleaserollbacktagResponse.ResultMessage"));
		queryLinkeBahamutReleaserollbacktagResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutReleaserollbacktagResponse.ErrorMessage"));
		queryLinkeBahamutReleaserollbacktagResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutReleaserollbacktagResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutReleaserollbacktagResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutReleaserollbacktagResponse.Message"));
		queryLinkeBahamutReleaserollbacktagResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutReleaserollbacktagResponse.ResponseStatusCode"));
		queryLinkeBahamutReleaserollbacktagResponse.setResult(_ctx.booleanValue("QueryLinkeBahamutReleaserollbacktagResponse.Result"));
		queryLinkeBahamutReleaserollbacktagResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutReleaserollbacktagResponse.Success"));
	 
	 	return queryLinkeBahamutReleaserollbacktagResponse;
	}
}