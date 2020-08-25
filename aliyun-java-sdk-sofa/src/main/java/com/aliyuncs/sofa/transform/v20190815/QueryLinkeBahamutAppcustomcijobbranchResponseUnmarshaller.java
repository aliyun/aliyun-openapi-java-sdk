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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutAppcustomcijobbranchResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutAppcustomcijobbranchResponseUnmarshaller {

	public static QueryLinkeBahamutAppcustomcijobbranchResponse unmarshall(QueryLinkeBahamutAppcustomcijobbranchResponse queryLinkeBahamutAppcustomcijobbranchResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutAppcustomcijobbranchResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutAppcustomcijobbranchResponse.RequestId"));
		queryLinkeBahamutAppcustomcijobbranchResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutAppcustomcijobbranchResponse.ResultCode"));
		queryLinkeBahamutAppcustomcijobbranchResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutAppcustomcijobbranchResponse.ResultMessage"));
		queryLinkeBahamutAppcustomcijobbranchResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutAppcustomcijobbranchResponse.ErrorMessage"));
		queryLinkeBahamutAppcustomcijobbranchResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutAppcustomcijobbranchResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutAppcustomcijobbranchResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutAppcustomcijobbranchResponse.Message"));
		queryLinkeBahamutAppcustomcijobbranchResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutAppcustomcijobbranchResponse.ResponseStatusCode"));
		queryLinkeBahamutAppcustomcijobbranchResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutAppcustomcijobbranchResponse.Success"));

		List<String> result = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutAppcustomcijobbranchResponse.Result.Length"); i++) {
			result.add(_ctx.stringValue("QueryLinkeBahamutAppcustomcijobbranchResponse.Result["+ i +"]"));
		}
		queryLinkeBahamutAppcustomcijobbranchResponse.setResult(result);
	 
	 	return queryLinkeBahamutAppcustomcijobbranchResponse;
	}
}