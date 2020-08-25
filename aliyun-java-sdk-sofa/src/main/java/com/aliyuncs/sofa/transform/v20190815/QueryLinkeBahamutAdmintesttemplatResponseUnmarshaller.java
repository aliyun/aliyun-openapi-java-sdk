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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutAdmintesttemplatResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutAdmintesttemplatResponseUnmarshaller {

	public static QueryLinkeBahamutAdmintesttemplatResponse unmarshall(QueryLinkeBahamutAdmintesttemplatResponse queryLinkeBahamutAdmintesttemplatResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutAdmintesttemplatResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutAdmintesttemplatResponse.RequestId"));
		queryLinkeBahamutAdmintesttemplatResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutAdmintesttemplatResponse.ResultCode"));
		queryLinkeBahamutAdmintesttemplatResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutAdmintesttemplatResponse.ResultMessage"));
		queryLinkeBahamutAdmintesttemplatResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutAdmintesttemplatResponse.ErrorMessage"));
		queryLinkeBahamutAdmintesttemplatResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutAdmintesttemplatResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutAdmintesttemplatResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutAdmintesttemplatResponse.Message"));
		queryLinkeBahamutAdmintesttemplatResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutAdmintesttemplatResponse.ResponseStatusCode"));
		queryLinkeBahamutAdmintesttemplatResponse.setResult(_ctx.stringValue("QueryLinkeBahamutAdmintesttemplatResponse.Result"));
		queryLinkeBahamutAdmintesttemplatResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutAdmintesttemplatResponse.Success"));
	 
	 	return queryLinkeBahamutAdmintesttemplatResponse;
	}
}