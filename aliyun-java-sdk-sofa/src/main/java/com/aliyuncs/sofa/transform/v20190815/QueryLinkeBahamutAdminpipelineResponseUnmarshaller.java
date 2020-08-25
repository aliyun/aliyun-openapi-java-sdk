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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutAdminpipelineResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutAdminpipelineResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutAdminpipelineResponseUnmarshaller {

	public static QueryLinkeBahamutAdminpipelineResponse unmarshall(QueryLinkeBahamutAdminpipelineResponse queryLinkeBahamutAdminpipelineResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutAdminpipelineResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutAdminpipelineResponse.RequestId"));
		queryLinkeBahamutAdminpipelineResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutAdminpipelineResponse.ResultCode"));
		queryLinkeBahamutAdminpipelineResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutAdminpipelineResponse.ResultMessage"));
		queryLinkeBahamutAdminpipelineResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutAdminpipelineResponse.ErrorMessage"));
		queryLinkeBahamutAdminpipelineResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutAdminpipelineResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutAdminpipelineResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutAdminpipelineResponse.Message"));
		queryLinkeBahamutAdminpipelineResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutAdminpipelineResponse.ResponseStatusCode"));
		queryLinkeBahamutAdminpipelineResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutAdminpipelineResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutAdminpipelineResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setDescription(_ctx.stringValue("QueryLinkeBahamutAdminpipelineResponse.Result["+ i +"].Description"));
			resultItem.setId(_ctx.longValue("QueryLinkeBahamutAdminpipelineResponse.Result["+ i +"].Id"));
			resultItem.setName(_ctx.stringValue("QueryLinkeBahamutAdminpipelineResponse.Result["+ i +"].Name"));
			resultItem.setStatus(_ctx.stringValue("QueryLinkeBahamutAdminpipelineResponse.Result["+ i +"].Status"));

			result.add(resultItem);
		}
		queryLinkeBahamutAdminpipelineResponse.setResult(result);
	 
	 	return queryLinkeBahamutAdminpipelineResponse;
	}
}