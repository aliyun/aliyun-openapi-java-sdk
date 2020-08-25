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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutAppqueryappisexistResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutAppqueryappisexistResponseUnmarshaller {

	public static QueryLinkeBahamutAppqueryappisexistResponse unmarshall(QueryLinkeBahamutAppqueryappisexistResponse queryLinkeBahamutAppqueryappisexistResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutAppqueryappisexistResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutAppqueryappisexistResponse.RequestId"));
		queryLinkeBahamutAppqueryappisexistResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutAppqueryappisexistResponse.ResultCode"));
		queryLinkeBahamutAppqueryappisexistResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutAppqueryappisexistResponse.ResultMessage"));
		queryLinkeBahamutAppqueryappisexistResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutAppqueryappisexistResponse.ErrorMessage"));
		queryLinkeBahamutAppqueryappisexistResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutAppqueryappisexistResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutAppqueryappisexistResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutAppqueryappisexistResponse.Message"));
		queryLinkeBahamutAppqueryappisexistResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutAppqueryappisexistResponse.ResponseStatusCode"));
		queryLinkeBahamutAppqueryappisexistResponse.setResult(_ctx.booleanValue("QueryLinkeBahamutAppqueryappisexistResponse.Result"));
		queryLinkeBahamutAppqueryappisexistResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutAppqueryappisexistResponse.Success"));
	 
	 	return queryLinkeBahamutAppqueryappisexistResponse;
	}
}