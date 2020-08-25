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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutAdmintenantidpipelineResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutAdmintenantidpipelineResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutAdmintenantidpipelineResponseUnmarshaller {

	public static QueryLinkeBahamutAdmintenantidpipelineResponse unmarshall(QueryLinkeBahamutAdmintenantidpipelineResponse queryLinkeBahamutAdmintenantidpipelineResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutAdmintenantidpipelineResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutAdmintenantidpipelineResponse.RequestId"));
		queryLinkeBahamutAdmintenantidpipelineResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutAdmintenantidpipelineResponse.ResultCode"));
		queryLinkeBahamutAdmintenantidpipelineResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutAdmintenantidpipelineResponse.ResultMessage"));
		queryLinkeBahamutAdmintenantidpipelineResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutAdmintenantidpipelineResponse.ErrorMessage"));
		queryLinkeBahamutAdmintenantidpipelineResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutAdmintenantidpipelineResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutAdmintenantidpipelineResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutAdmintenantidpipelineResponse.Message"));
		queryLinkeBahamutAdmintenantidpipelineResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutAdmintenantidpipelineResponse.ResponseStatusCode"));
		queryLinkeBahamutAdmintenantidpipelineResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutAdmintenantidpipelineResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutAdmintenantidpipelineResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setDescription(_ctx.stringValue("QueryLinkeBahamutAdmintenantidpipelineResponse.Result["+ i +"].Description"));
			resultItem.setId(_ctx.longValue("QueryLinkeBahamutAdmintenantidpipelineResponse.Result["+ i +"].Id"));
			resultItem.setName(_ctx.stringValue("QueryLinkeBahamutAdmintenantidpipelineResponse.Result["+ i +"].Name"));
			resultItem.setStatus(_ctx.stringValue("QueryLinkeBahamutAdmintenantidpipelineResponse.Result["+ i +"].Status"));

			result.add(resultItem);
		}
		queryLinkeBahamutAdmintenantidpipelineResponse.setResult(result);
	 
	 	return queryLinkeBahamutAdmintenantidpipelineResponse;
	}
}