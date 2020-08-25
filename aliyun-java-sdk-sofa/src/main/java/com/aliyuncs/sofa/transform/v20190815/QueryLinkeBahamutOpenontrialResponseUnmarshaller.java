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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutOpenontrialResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutOpenontrialResponseUnmarshaller {

	public static QueryLinkeBahamutOpenontrialResponse unmarshall(QueryLinkeBahamutOpenontrialResponse queryLinkeBahamutOpenontrialResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutOpenontrialResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutOpenontrialResponse.RequestId"));
		queryLinkeBahamutOpenontrialResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutOpenontrialResponse.ResultCode"));
		queryLinkeBahamutOpenontrialResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutOpenontrialResponse.ResultMessage"));
		queryLinkeBahamutOpenontrialResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutOpenontrialResponse.ErrorMessage"));
		queryLinkeBahamutOpenontrialResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutOpenontrialResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutOpenontrialResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutOpenontrialResponse.Message"));
		queryLinkeBahamutOpenontrialResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutOpenontrialResponse.ResponseStatusCode"));
		queryLinkeBahamutOpenontrialResponse.setResult(_ctx.booleanValue("QueryLinkeBahamutOpenontrialResponse.Result"));
		queryLinkeBahamutOpenontrialResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutOpenontrialResponse.Success"));
	 
	 	return queryLinkeBahamutOpenontrialResponse;
	}
}