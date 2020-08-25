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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinkaCpdResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinkaCpdResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeLinkaCpdResponseUnmarshaller {

	public static QueryLinkeLinkaCpdResponse unmarshall(QueryLinkeLinkaCpdResponse queryLinkeLinkaCpdResponse, UnmarshallerContext _ctx) {
		
		queryLinkeLinkaCpdResponse.setRequestId(_ctx.stringValue("QueryLinkeLinkaCpdResponse.RequestId"));
		queryLinkeLinkaCpdResponse.setResultCode(_ctx.stringValue("QueryLinkeLinkaCpdResponse.ResultCode"));
		queryLinkeLinkaCpdResponse.setResultMessage(_ctx.stringValue("QueryLinkeLinkaCpdResponse.ResultMessage"));
		queryLinkeLinkaCpdResponse.setErrorCode(_ctx.stringValue("QueryLinkeLinkaCpdResponse.ErrorCode"));
		queryLinkeLinkaCpdResponse.setErrorMsg(_ctx.stringValue("QueryLinkeLinkaCpdResponse.ErrorMsg"));
		queryLinkeLinkaCpdResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeLinkaCpdResponse.ResponseStatusCode"));
		queryLinkeLinkaCpdResponse.setSuccess(_ctx.booleanValue("QueryLinkeLinkaCpdResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeLinkaCpdResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setTokenCount(_ctx.longValue("QueryLinkeLinkaCpdResponse.Result["+ i +"].TokenCount"));

			List<String> statistics = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeLinkaCpdResponse.Result["+ i +"].Statistics.Length"); j++) {
				statistics.add(_ctx.stringValue("QueryLinkeLinkaCpdResponse.Result["+ i +"].Statistics["+ j +"]"));
			}
			resultItem.setStatistics(statistics);

			result.add(resultItem);
		}
		queryLinkeLinkaCpdResponse.setResult(result);
	 
	 	return queryLinkeLinkaCpdResponse;
	}
}