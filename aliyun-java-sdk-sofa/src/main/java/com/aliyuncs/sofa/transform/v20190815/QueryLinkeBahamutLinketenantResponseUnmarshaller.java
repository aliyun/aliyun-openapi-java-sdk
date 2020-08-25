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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutLinketenantResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutLinketenantResponseUnmarshaller {

	public static QueryLinkeBahamutLinketenantResponse unmarshall(QueryLinkeBahamutLinketenantResponse queryLinkeBahamutLinketenantResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutLinketenantResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutLinketenantResponse.RequestId"));
		queryLinkeBahamutLinketenantResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutLinketenantResponse.ResultCode"));
		queryLinkeBahamutLinketenantResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutLinketenantResponse.ResultMessage"));
		queryLinkeBahamutLinketenantResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutLinketenantResponse.ErrorMessage"));
		queryLinkeBahamutLinketenantResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutLinketenantResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutLinketenantResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutLinketenantResponse.Message"));
		queryLinkeBahamutLinketenantResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutLinketenantResponse.ResponseStatusCode"));
		queryLinkeBahamutLinketenantResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutLinketenantResponse.Success"));

		List<String> result = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutLinketenantResponse.Result.Length"); i++) {
			result.add(_ctx.stringValue("QueryLinkeBahamutLinketenantResponse.Result["+ i +"]"));
		}
		queryLinkeBahamutLinketenantResponse.setResult(result);
	 
	 	return queryLinkeBahamutLinketenantResponse;
	}
}