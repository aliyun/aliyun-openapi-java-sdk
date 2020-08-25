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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutAoneinternalnotrelatedreleaseaonecodechangeResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutAoneinternalnotrelatedreleaseaonecodechangeResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutAoneinternalnotrelatedreleaseaonecodechangeResponseUnmarshaller {

	public static QueryLinkeBahamutAoneinternalnotrelatedreleaseaonecodechangeResponse unmarshall(QueryLinkeBahamutAoneinternalnotrelatedreleaseaonecodechangeResponse queryLinkeBahamutAoneinternalnotrelatedreleaseaonecodechangeResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutAoneinternalnotrelatedreleaseaonecodechangeResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutAoneinternalnotrelatedreleaseaonecodechangeResponse.RequestId"));
		queryLinkeBahamutAoneinternalnotrelatedreleaseaonecodechangeResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutAoneinternalnotrelatedreleaseaonecodechangeResponse.ResultCode"));
		queryLinkeBahamutAoneinternalnotrelatedreleaseaonecodechangeResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutAoneinternalnotrelatedreleaseaonecodechangeResponse.ResultMessage"));
		queryLinkeBahamutAoneinternalnotrelatedreleaseaonecodechangeResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutAoneinternalnotrelatedreleaseaonecodechangeResponse.ErrorMessage"));
		queryLinkeBahamutAoneinternalnotrelatedreleaseaonecodechangeResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutAoneinternalnotrelatedreleaseaonecodechangeResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutAoneinternalnotrelatedreleaseaonecodechangeResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutAoneinternalnotrelatedreleaseaonecodechangeResponse.Message"));
		queryLinkeBahamutAoneinternalnotrelatedreleaseaonecodechangeResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutAoneinternalnotrelatedreleaseaonecodechangeResponse.ResponseStatusCode"));
		queryLinkeBahamutAoneinternalnotrelatedreleaseaonecodechangeResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutAoneinternalnotrelatedreleaseaonecodechangeResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutAoneinternalnotrelatedreleaseaonecodechangeResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setCodeChangeJsonObjects(_ctx.stringValue("QueryLinkeBahamutAoneinternalnotrelatedreleaseaonecodechangeResponse.Result["+ i +"].CodeChangeJsonObjects"));
			resultItem.setId(_ctx.stringValue("QueryLinkeBahamutAoneinternalnotrelatedreleaseaonecodechangeResponse.Result["+ i +"].Id"));
			resultItem.setName(_ctx.stringValue("QueryLinkeBahamutAoneinternalnotrelatedreleaseaonecodechangeResponse.Result["+ i +"].Name"));
			resultItem.setPortalUrl(_ctx.stringValue("QueryLinkeBahamutAoneinternalnotrelatedreleaseaonecodechangeResponse.Result["+ i +"].PortalUrl"));
			resultItem.setStatusName(_ctx.stringValue("QueryLinkeBahamutAoneinternalnotrelatedreleaseaonecodechangeResponse.Result["+ i +"].StatusName"));

			result.add(resultItem);
		}
		queryLinkeBahamutAoneinternalnotrelatedreleaseaonecodechangeResponse.setResult(result);
	 
	 	return queryLinkeBahamutAoneinternalnotrelatedreleaseaonecodechangeResponse;
	}
}