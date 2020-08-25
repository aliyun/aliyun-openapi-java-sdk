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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinkaFilecontentResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeLinkaFilecontentResponseUnmarshaller {

	public static QueryLinkeLinkaFilecontentResponse unmarshall(QueryLinkeLinkaFilecontentResponse queryLinkeLinkaFilecontentResponse, UnmarshallerContext _ctx) {
		
		queryLinkeLinkaFilecontentResponse.setRequestId(_ctx.stringValue("QueryLinkeLinkaFilecontentResponse.RequestId"));
		queryLinkeLinkaFilecontentResponse.setResultCode(_ctx.stringValue("QueryLinkeLinkaFilecontentResponse.ResultCode"));
		queryLinkeLinkaFilecontentResponse.setResultMessage(_ctx.stringValue("QueryLinkeLinkaFilecontentResponse.ResultMessage"));
		queryLinkeLinkaFilecontentResponse.setErrorCode(_ctx.stringValue("QueryLinkeLinkaFilecontentResponse.ErrorCode"));
		queryLinkeLinkaFilecontentResponse.setErrorMsg(_ctx.stringValue("QueryLinkeLinkaFilecontentResponse.ErrorMsg"));
		queryLinkeLinkaFilecontentResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeLinkaFilecontentResponse.ResponseStatusCode"));
		queryLinkeLinkaFilecontentResponse.setSuccess(_ctx.booleanValue("QueryLinkeLinkaFilecontentResponse.Success"));

		List<String> result = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeLinkaFilecontentResponse.Result.Length"); i++) {
			result.add(_ctx.stringValue("QueryLinkeLinkaFilecontentResponse.Result["+ i +"]"));
		}
		queryLinkeLinkaFilecontentResponse.setResult(result);
	 
	 	return queryLinkeLinkaFilecontentResponse;
	}
}