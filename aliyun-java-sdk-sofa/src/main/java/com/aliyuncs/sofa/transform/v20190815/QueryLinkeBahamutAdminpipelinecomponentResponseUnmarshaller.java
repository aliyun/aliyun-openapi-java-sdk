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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutAdminpipelinecomponentResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutAdminpipelinecomponentResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutAdminpipelinecomponentResponseUnmarshaller {

	public static QueryLinkeBahamutAdminpipelinecomponentResponse unmarshall(QueryLinkeBahamutAdminpipelinecomponentResponse queryLinkeBahamutAdminpipelinecomponentResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutAdminpipelinecomponentResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutAdminpipelinecomponentResponse.RequestId"));
		queryLinkeBahamutAdminpipelinecomponentResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutAdminpipelinecomponentResponse.ResultCode"));
		queryLinkeBahamutAdminpipelinecomponentResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutAdminpipelinecomponentResponse.ResultMessage"));
		queryLinkeBahamutAdminpipelinecomponentResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutAdminpipelinecomponentResponse.ErrorMessage"));
		queryLinkeBahamutAdminpipelinecomponentResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutAdminpipelinecomponentResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutAdminpipelinecomponentResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutAdminpipelinecomponentResponse.Message"));
		queryLinkeBahamutAdminpipelinecomponentResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutAdminpipelinecomponentResponse.ResponseStatusCode"));
		queryLinkeBahamutAdminpipelinecomponentResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutAdminpipelinecomponentResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutAdminpipelinecomponentResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAllowSkip(_ctx.booleanValue("QueryLinkeBahamutAdminpipelinecomponentResponse.Result["+ i +"].AllowSkip"));
			resultItem.setDisable(_ctx.booleanValue("QueryLinkeBahamutAdminpipelinecomponentResponse.Result["+ i +"].Disable"));
			resultItem.setDisplayName(_ctx.stringValue("QueryLinkeBahamutAdminpipelinecomponentResponse.Result["+ i +"].DisplayName"));
			resultItem.setExpression(_ctx.stringValue("QueryLinkeBahamutAdminpipelinecomponentResponse.Result["+ i +"].Expression"));
			resultItem.setExpressionDesc(_ctx.stringValue("QueryLinkeBahamutAdminpipelinecomponentResponse.Result["+ i +"].ExpressionDesc"));
			resultItem.setGmtCreate(_ctx.longValue("QueryLinkeBahamutAdminpipelinecomponentResponse.Result["+ i +"].GmtCreate"));
			resultItem.setGmtModify(_ctx.longValue("QueryLinkeBahamutAdminpipelinecomponentResponse.Result["+ i +"].GmtModify"));
			resultItem.setId(_ctx.stringValue("QueryLinkeBahamutAdminpipelinecomponentResponse.Result["+ i +"].Id"));
			resultItem.setManual(_ctx.booleanValue("QueryLinkeBahamutAdminpipelinecomponentResponse.Result["+ i +"].Manual"));
			resultItem.setName(_ctx.stringValue("QueryLinkeBahamutAdminpipelinecomponentResponse.Result["+ i +"].Name"));
			resultItem.setRestUrl(_ctx.stringValue("QueryLinkeBahamutAdminpipelinecomponentResponse.Result["+ i +"].RestUrl"));
			resultItem.setType(_ctx.stringValue("QueryLinkeBahamutAdminpipelinecomponentResponse.Result["+ i +"].Type"));

			result.add(resultItem);
		}
		queryLinkeBahamutAdminpipelinecomponentResponse.setResult(result);
	 
	 	return queryLinkeBahamutAdminpipelinecomponentResponse;
	}
}