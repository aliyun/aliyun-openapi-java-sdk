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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinkaFilecontentsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeLinkaFilecontentsResponseUnmarshaller {

	public static QueryLinkeLinkaFilecontentsResponse unmarshall(QueryLinkeLinkaFilecontentsResponse queryLinkeLinkaFilecontentsResponse, UnmarshallerContext _ctx) {
		
		queryLinkeLinkaFilecontentsResponse.setRequestId(_ctx.stringValue("QueryLinkeLinkaFilecontentsResponse.RequestId"));
		queryLinkeLinkaFilecontentsResponse.setResultCode(_ctx.stringValue("QueryLinkeLinkaFilecontentsResponse.ResultCode"));
		queryLinkeLinkaFilecontentsResponse.setResultMessage(_ctx.stringValue("QueryLinkeLinkaFilecontentsResponse.ResultMessage"));
		queryLinkeLinkaFilecontentsResponse.setErrorCode(_ctx.stringValue("QueryLinkeLinkaFilecontentsResponse.ErrorCode"));
		queryLinkeLinkaFilecontentsResponse.setErrorMsg(_ctx.stringValue("QueryLinkeLinkaFilecontentsResponse.ErrorMsg"));
		queryLinkeLinkaFilecontentsResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeLinkaFilecontentsResponse.ResponseStatusCode"));
		queryLinkeLinkaFilecontentsResponse.setResult(_ctx.stringValue("QueryLinkeLinkaFilecontentsResponse.Result"));
		queryLinkeLinkaFilecontentsResponse.setSuccess(_ctx.booleanValue("QueryLinkeLinkaFilecontentsResponse.Success"));
	 
	 	return queryLinkeLinkaFilecontentsResponse;
	}
}