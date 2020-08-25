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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutWebapiguardsguardapilistguardResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutWebapiguardsguardapilistguardResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutWebapiguardsguardapilistguardResponseUnmarshaller {

	public static QueryLinkeBahamutWebapiguardsguardapilistguardResponse unmarshall(QueryLinkeBahamutWebapiguardsguardapilistguardResponse queryLinkeBahamutWebapiguardsguardapilistguardResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutWebapiguardsguardapilistguardResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutWebapiguardsguardapilistguardResponse.RequestId"));
		queryLinkeBahamutWebapiguardsguardapilistguardResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutWebapiguardsguardapilistguardResponse.ResultCode"));
		queryLinkeBahamutWebapiguardsguardapilistguardResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutWebapiguardsguardapilistguardResponse.ResultMessage"));
		queryLinkeBahamutWebapiguardsguardapilistguardResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutWebapiguardsguardapilistguardResponse.ErrorMessage"));
		queryLinkeBahamutWebapiguardsguardapilistguardResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutWebapiguardsguardapilistguardResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutWebapiguardsguardapilistguardResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutWebapiguardsguardapilistguardResponse.Message"));
		queryLinkeBahamutWebapiguardsguardapilistguardResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutWebapiguardsguardapilistguardResponse.ResponseStatusCode"));
		queryLinkeBahamutWebapiguardsguardapilistguardResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutWebapiguardsguardapilistguardResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutWebapiguardsguardapilistguardResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setCreated(_ctx.longValue("QueryLinkeBahamutWebapiguardsguardapilistguardResponse.Result["+ i +"].Created"));
			resultItem.setDeleted(_ctx.booleanValue("QueryLinkeBahamutWebapiguardsguardapilistguardResponse.Result["+ i +"].Deleted"));
			resultItem.setDescription(_ctx.stringValue("QueryLinkeBahamutWebapiguardsguardapilistguardResponse.Result["+ i +"].Description"));
			resultItem.setExpression(_ctx.stringValue("QueryLinkeBahamutWebapiguardsguardapilistguardResponse.Result["+ i +"].Expression"));
			resultItem.setId(_ctx.stringValue("QueryLinkeBahamutWebapiguardsguardapilistguardResponse.Result["+ i +"].Id"));
			resultItem.setLastModified(_ctx.longValue("QueryLinkeBahamutWebapiguardsguardapilistguardResponse.Result["+ i +"].LastModified"));
			resultItem.setName(_ctx.stringValue("QueryLinkeBahamutWebapiguardsguardapilistguardResponse.Result["+ i +"].Name"));
			resultItem.setTenantId(_ctx.stringValue("QueryLinkeBahamutWebapiguardsguardapilistguardResponse.Result["+ i +"].TenantId"));

			result.add(resultItem);
		}
		queryLinkeBahamutWebapiguardsguardapilistguardResponse.setResult(result);
	 
	 	return queryLinkeBahamutWebapiguardsguardapilistguardResponse;
	}
}