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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutAppcustomciqualityResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutAppcustomciqualityResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutAppcustomciqualityResponseUnmarshaller {

	public static QueryLinkeBahamutAppcustomciqualityResponse unmarshall(QueryLinkeBahamutAppcustomciqualityResponse queryLinkeBahamutAppcustomciqualityResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutAppcustomciqualityResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutAppcustomciqualityResponse.RequestId"));
		queryLinkeBahamutAppcustomciqualityResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutAppcustomciqualityResponse.ResultCode"));
		queryLinkeBahamutAppcustomciqualityResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutAppcustomciqualityResponse.ResultMessage"));
		queryLinkeBahamutAppcustomciqualityResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutAppcustomciqualityResponse.ErrorMessage"));
		queryLinkeBahamutAppcustomciqualityResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutAppcustomciqualityResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutAppcustomciqualityResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutAppcustomciqualityResponse.Message"));
		queryLinkeBahamutAppcustomciqualityResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutAppcustomciqualityResponse.ResponseStatusCode"));
		queryLinkeBahamutAppcustomciqualityResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutAppcustomciqualityResponse.Success"));

		Result result = new Result();
		result.setAppName(_ctx.stringValue("QueryLinkeBahamutAppcustomciqualityResponse.Result.AppName"));
		result.setBranch(_ctx.stringValue("QueryLinkeBahamutAppcustomciqualityResponse.Result.Branch"));
		result.setCodeName(_ctx.stringValue("QueryLinkeBahamutAppcustomciqualityResponse.Result.CodeName"));
		result.setPass(_ctx.booleanValue("QueryLinkeBahamutAppcustomciqualityResponse.Result.Pass"));

		List<String> items = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutAppcustomciqualityResponse.Result.Items.Length"); i++) {
			items.add(_ctx.stringValue("QueryLinkeBahamutAppcustomciqualityResponse.Result.Items["+ i +"]"));
		}
		result.setItems(items);
		queryLinkeBahamutAppcustomciqualityResponse.setResult(result);
	 
	 	return queryLinkeBahamutAppcustomciqualityResponse;
	}
}