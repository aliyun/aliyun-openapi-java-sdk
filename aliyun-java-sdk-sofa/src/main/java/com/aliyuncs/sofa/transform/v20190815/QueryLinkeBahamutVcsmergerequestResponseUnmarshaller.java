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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutVcsmergerequestResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutVcsmergerequestResponseUnmarshaller {

	public static QueryLinkeBahamutVcsmergerequestResponse unmarshall(QueryLinkeBahamutVcsmergerequestResponse queryLinkeBahamutVcsmergerequestResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutVcsmergerequestResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutVcsmergerequestResponse.RequestId"));
		queryLinkeBahamutVcsmergerequestResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutVcsmergerequestResponse.ResultCode"));
		queryLinkeBahamutVcsmergerequestResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutVcsmergerequestResponse.ResultMessage"));
		queryLinkeBahamutVcsmergerequestResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutVcsmergerequestResponse.ErrorMessage"));
		queryLinkeBahamutVcsmergerequestResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutVcsmergerequestResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutVcsmergerequestResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutVcsmergerequestResponse.Message"));
		queryLinkeBahamutVcsmergerequestResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutVcsmergerequestResponse.ResponseStatusCode"));
		queryLinkeBahamutVcsmergerequestResponse.setResult(_ctx.stringValue("QueryLinkeBahamutVcsmergerequestResponse.Result"));
		queryLinkeBahamutVcsmergerequestResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutVcsmergerequestResponse.Success"));
	 
	 	return queryLinkeBahamutVcsmergerequestResponse;
	}
}