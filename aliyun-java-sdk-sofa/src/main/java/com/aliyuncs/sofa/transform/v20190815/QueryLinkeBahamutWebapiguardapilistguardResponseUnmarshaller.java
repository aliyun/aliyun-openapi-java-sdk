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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutWebapiguardapilistguardResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutWebapiguardapilistguardResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutWebapiguardapilistguardResponseUnmarshaller {

	public static QueryLinkeBahamutWebapiguardapilistguardResponse unmarshall(QueryLinkeBahamutWebapiguardapilistguardResponse queryLinkeBahamutWebapiguardapilistguardResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutWebapiguardapilistguardResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutWebapiguardapilistguardResponse.RequestId"));
		queryLinkeBahamutWebapiguardapilistguardResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutWebapiguardapilistguardResponse.ResultCode"));
		queryLinkeBahamutWebapiguardapilistguardResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutWebapiguardapilistguardResponse.ResultMessage"));
		queryLinkeBahamutWebapiguardapilistguardResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutWebapiguardapilistguardResponse.ErrorMessage"));
		queryLinkeBahamutWebapiguardapilistguardResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutWebapiguardapilistguardResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutWebapiguardapilistguardResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutWebapiguardapilistguardResponse.Message"));
		queryLinkeBahamutWebapiguardapilistguardResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutWebapiguardapilistguardResponse.ResponseStatusCode"));
		queryLinkeBahamutWebapiguardapilistguardResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutWebapiguardapilistguardResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutWebapiguardapilistguardResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setCreated(_ctx.longValue("QueryLinkeBahamutWebapiguardapilistguardResponse.Result["+ i +"].Created"));
			resultItem.setDeleted(_ctx.booleanValue("QueryLinkeBahamutWebapiguardapilistguardResponse.Result["+ i +"].Deleted"));
			resultItem.setDescription(_ctx.stringValue("QueryLinkeBahamutWebapiguardapilistguardResponse.Result["+ i +"].Description"));
			resultItem.setExpression(_ctx.stringValue("QueryLinkeBahamutWebapiguardapilistguardResponse.Result["+ i +"].Expression"));
			resultItem.setId(_ctx.stringValue("QueryLinkeBahamutWebapiguardapilistguardResponse.Result["+ i +"].Id"));
			resultItem.setLastModified(_ctx.longValue("QueryLinkeBahamutWebapiguardapilistguardResponse.Result["+ i +"].LastModified"));
			resultItem.setName(_ctx.stringValue("QueryLinkeBahamutWebapiguardapilistguardResponse.Result["+ i +"].Name"));
			resultItem.setTenantId(_ctx.stringValue("QueryLinkeBahamutWebapiguardapilistguardResponse.Result["+ i +"].TenantId"));

			result.add(resultItem);
		}
		queryLinkeBahamutWebapiguardapilistguardResponse.setResult(result);
	 
	 	return queryLinkeBahamutWebapiguardapilistguardResponse;
	}
}