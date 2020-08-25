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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinkaCoveragehistoryResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinkaCoveragehistoryResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeLinkaCoveragehistoryResponseUnmarshaller {

	public static QueryLinkeLinkaCoveragehistoryResponse unmarshall(QueryLinkeLinkaCoveragehistoryResponse queryLinkeLinkaCoveragehistoryResponse, UnmarshallerContext _ctx) {
		
		queryLinkeLinkaCoveragehistoryResponse.setRequestId(_ctx.stringValue("QueryLinkeLinkaCoveragehistoryResponse.RequestId"));
		queryLinkeLinkaCoveragehistoryResponse.setResultCode(_ctx.stringValue("QueryLinkeLinkaCoveragehistoryResponse.ResultCode"));
		queryLinkeLinkaCoveragehistoryResponse.setResultMessage(_ctx.stringValue("QueryLinkeLinkaCoveragehistoryResponse.ResultMessage"));
		queryLinkeLinkaCoveragehistoryResponse.setErrorCode(_ctx.stringValue("QueryLinkeLinkaCoveragehistoryResponse.ErrorCode"));
		queryLinkeLinkaCoveragehistoryResponse.setErrorMsg(_ctx.stringValue("QueryLinkeLinkaCoveragehistoryResponse.ErrorMsg"));
		queryLinkeLinkaCoveragehistoryResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeLinkaCoveragehistoryResponse.ResponseStatusCode"));
		queryLinkeLinkaCoveragehistoryResponse.setSuccess(_ctx.booleanValue("QueryLinkeLinkaCoveragehistoryResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeLinkaCoveragehistoryResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setCreatedAt(_ctx.longValue("QueryLinkeLinkaCoveragehistoryResponse.Result["+ i +"].CreatedAt"));
			resultItem.setGroup(_ctx.stringValue("QueryLinkeLinkaCoveragehistoryResponse.Result["+ i +"].Group"));
			resultItem.setId(_ctx.stringValue("QueryLinkeLinkaCoveragehistoryResponse.Result["+ i +"].Id"));
			resultItem.setOnlySummary(_ctx.booleanValue("QueryLinkeLinkaCoveragehistoryResponse.Result["+ i +"].OnlySummary"));
			resultItem.setTaskId(_ctx.stringValue("QueryLinkeLinkaCoveragehistoryResponse.Result["+ i +"].TaskId"));

			result.add(resultItem);
		}
		queryLinkeLinkaCoveragehistoryResponse.setResult(result);
	 
	 	return queryLinkeLinkaCoveragehistoryResponse;
	}
}