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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutWebapilistguardResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutWebapilistguardResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutWebapilistguardResponseUnmarshaller {

	public static QueryLinkeBahamutWebapilistguardResponse unmarshall(QueryLinkeBahamutWebapilistguardResponse queryLinkeBahamutWebapilistguardResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutWebapilistguardResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutWebapilistguardResponse.RequestId"));
		queryLinkeBahamutWebapilistguardResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutWebapilistguardResponse.ResultCode"));
		queryLinkeBahamutWebapilistguardResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutWebapilistguardResponse.ResultMessage"));
		queryLinkeBahamutWebapilistguardResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutWebapilistguardResponse.ErrorMessage"));
		queryLinkeBahamutWebapilistguardResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutWebapilistguardResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutWebapilistguardResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutWebapilistguardResponse.Message"));
		queryLinkeBahamutWebapilistguardResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutWebapilistguardResponse.ResponseStatusCode"));
		queryLinkeBahamutWebapilistguardResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutWebapilistguardResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutWebapilistguardResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setCreated(_ctx.longValue("QueryLinkeBahamutWebapilistguardResponse.Result["+ i +"].Created"));
			resultItem.setDeleted(_ctx.booleanValue("QueryLinkeBahamutWebapilistguardResponse.Result["+ i +"].Deleted"));
			resultItem.setDescription(_ctx.stringValue("QueryLinkeBahamutWebapilistguardResponse.Result["+ i +"].Description"));
			resultItem.setExpression(_ctx.stringValue("QueryLinkeBahamutWebapilistguardResponse.Result["+ i +"].Expression"));
			resultItem.setId(_ctx.stringValue("QueryLinkeBahamutWebapilistguardResponse.Result["+ i +"].Id"));
			resultItem.setLastModified(_ctx.longValue("QueryLinkeBahamutWebapilistguardResponse.Result["+ i +"].LastModified"));
			resultItem.setName(_ctx.stringValue("QueryLinkeBahamutWebapilistguardResponse.Result["+ i +"].Name"));
			resultItem.setTenantId(_ctx.stringValue("QueryLinkeBahamutWebapilistguardResponse.Result["+ i +"].TenantId"));

			result.add(resultItem);
		}
		queryLinkeBahamutWebapilistguardResponse.setResult(result);
	 
	 	return queryLinkeBahamutWebapilistguardResponse;
	}
}