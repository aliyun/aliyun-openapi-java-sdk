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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutAoneinternalgreenchannelsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutAoneinternalgreenchannelsResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutAoneinternalgreenchannelsResponseUnmarshaller {

	public static QueryLinkeBahamutAoneinternalgreenchannelsResponse unmarshall(QueryLinkeBahamutAoneinternalgreenchannelsResponse queryLinkeBahamutAoneinternalgreenchannelsResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutAoneinternalgreenchannelsResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutAoneinternalgreenchannelsResponse.RequestId"));
		queryLinkeBahamutAoneinternalgreenchannelsResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutAoneinternalgreenchannelsResponse.ResultCode"));
		queryLinkeBahamutAoneinternalgreenchannelsResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutAoneinternalgreenchannelsResponse.ResultMessage"));
		queryLinkeBahamutAoneinternalgreenchannelsResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutAoneinternalgreenchannelsResponse.ErrorMessage"));
		queryLinkeBahamutAoneinternalgreenchannelsResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutAoneinternalgreenchannelsResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutAoneinternalgreenchannelsResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutAoneinternalgreenchannelsResponse.Message"));
		queryLinkeBahamutAoneinternalgreenchannelsResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutAoneinternalgreenchannelsResponse.ResponseStatusCode"));
		queryLinkeBahamutAoneinternalgreenchannelsResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutAoneinternalgreenchannelsResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutAoneinternalgreenchannelsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setCodeChangeJsonObjects(_ctx.stringValue("QueryLinkeBahamutAoneinternalgreenchannelsResponse.Result["+ i +"].CodeChangeJsonObjects"));
			resultItem.setId(_ctx.stringValue("QueryLinkeBahamutAoneinternalgreenchannelsResponse.Result["+ i +"].Id"));
			resultItem.setName(_ctx.stringValue("QueryLinkeBahamutAoneinternalgreenchannelsResponse.Result["+ i +"].Name"));
			resultItem.setPortalUrl(_ctx.stringValue("QueryLinkeBahamutAoneinternalgreenchannelsResponse.Result["+ i +"].PortalUrl"));
			resultItem.setStatusName(_ctx.stringValue("QueryLinkeBahamutAoneinternalgreenchannelsResponse.Result["+ i +"].StatusName"));

			result.add(resultItem);
		}
		queryLinkeBahamutAoneinternalgreenchannelsResponse.setResult(result);
	 
	 	return queryLinkeBahamutAoneinternalgreenchannelsResponse;
	}
}