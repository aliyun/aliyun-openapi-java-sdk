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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutComponentsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutComponentsResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutComponentsResponseUnmarshaller {

	public static QueryLinkeBahamutComponentsResponse unmarshall(QueryLinkeBahamutComponentsResponse queryLinkeBahamutComponentsResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutComponentsResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutComponentsResponse.RequestId"));
		queryLinkeBahamutComponentsResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutComponentsResponse.ResultCode"));
		queryLinkeBahamutComponentsResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutComponentsResponse.ResultMessage"));
		queryLinkeBahamutComponentsResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutComponentsResponse.ErrorMessage"));
		queryLinkeBahamutComponentsResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutComponentsResponse.Message"));
		queryLinkeBahamutComponentsResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutComponentsResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutComponentsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAllowSkip(_ctx.booleanValue("QueryLinkeBahamutComponentsResponse.Result["+ i +"].AllowSkip"));
			resultItem.setDisable(_ctx.booleanValue("QueryLinkeBahamutComponentsResponse.Result["+ i +"].Disable"));
			resultItem.setDisplayName(_ctx.stringValue("QueryLinkeBahamutComponentsResponse.Result["+ i +"].DisplayName"));
			resultItem.setExpression(_ctx.stringValue("QueryLinkeBahamutComponentsResponse.Result["+ i +"].Expression"));
			resultItem.setExpressionDesc(_ctx.stringValue("QueryLinkeBahamutComponentsResponse.Result["+ i +"].ExpressionDesc"));
			resultItem.setGmtCreate(_ctx.longValue("QueryLinkeBahamutComponentsResponse.Result["+ i +"].GmtCreate"));
			resultItem.setGmtModify(_ctx.longValue("QueryLinkeBahamutComponentsResponse.Result["+ i +"].GmtModify"));
			resultItem.setId(_ctx.stringValue("QueryLinkeBahamutComponentsResponse.Result["+ i +"].Id"));
			resultItem.setManual(_ctx.booleanValue("QueryLinkeBahamutComponentsResponse.Result["+ i +"].Manual"));
			resultItem.setName(_ctx.stringValue("QueryLinkeBahamutComponentsResponse.Result["+ i +"].Name"));
			resultItem.setRestUrl(_ctx.stringValue("QueryLinkeBahamutComponentsResponse.Result["+ i +"].RestUrl"));
			resultItem.setType(_ctx.stringValue("QueryLinkeBahamutComponentsResponse.Result["+ i +"].Type"));

			result.add(resultItem);
		}
		queryLinkeBahamutComponentsResponse.setResult(result);
	 
	 	return queryLinkeBahamutComponentsResponse;
	}
}