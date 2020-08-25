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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutAppinitmvnjarResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutAppinitmvnjarResponseUnmarshaller {

	public static QueryLinkeBahamutAppinitmvnjarResponse unmarshall(QueryLinkeBahamutAppinitmvnjarResponse queryLinkeBahamutAppinitmvnjarResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutAppinitmvnjarResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutAppinitmvnjarResponse.RequestId"));
		queryLinkeBahamutAppinitmvnjarResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutAppinitmvnjarResponse.ResultCode"));
		queryLinkeBahamutAppinitmvnjarResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutAppinitmvnjarResponse.ResultMessage"));
		queryLinkeBahamutAppinitmvnjarResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutAppinitmvnjarResponse.ErrorMessage"));
		queryLinkeBahamutAppinitmvnjarResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutAppinitmvnjarResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutAppinitmvnjarResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutAppinitmvnjarResponse.Message"));
		queryLinkeBahamutAppinitmvnjarResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutAppinitmvnjarResponse.ResponseStatusCode"));
		queryLinkeBahamutAppinitmvnjarResponse.setResult(_ctx.stringValue("QueryLinkeBahamutAppinitmvnjarResponse.Result"));
		queryLinkeBahamutAppinitmvnjarResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutAppinitmvnjarResponse.Success"));
	 
	 	return queryLinkeBahamutAppinitmvnjarResponse;
	}
}