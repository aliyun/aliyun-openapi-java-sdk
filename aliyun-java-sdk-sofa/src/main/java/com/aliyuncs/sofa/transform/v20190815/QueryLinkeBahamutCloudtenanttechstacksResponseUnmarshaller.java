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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutCloudtenanttechstacksResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutCloudtenanttechstacksResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutCloudtenanttechstacksResponseUnmarshaller {

	public static QueryLinkeBahamutCloudtenanttechstacksResponse unmarshall(QueryLinkeBahamutCloudtenanttechstacksResponse queryLinkeBahamutCloudtenanttechstacksResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutCloudtenanttechstacksResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutCloudtenanttechstacksResponse.RequestId"));
		queryLinkeBahamutCloudtenanttechstacksResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutCloudtenanttechstacksResponse.ResultCode"));
		queryLinkeBahamutCloudtenanttechstacksResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutCloudtenanttechstacksResponse.ResultMessage"));
		queryLinkeBahamutCloudtenanttechstacksResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutCloudtenanttechstacksResponse.ErrorMessage"));
		queryLinkeBahamutCloudtenanttechstacksResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutCloudtenanttechstacksResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutCloudtenanttechstacksResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutCloudtenanttechstacksResponse.Message"));
		queryLinkeBahamutCloudtenanttechstacksResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutCloudtenanttechstacksResponse.ResponseStatusCode"));
		queryLinkeBahamutCloudtenanttechstacksResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutCloudtenanttechstacksResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutCloudtenanttechstacksResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setDescription(_ctx.stringValue("QueryLinkeBahamutCloudtenanttechstacksResponse.Result["+ i +"].Description"));
			resultItem.setId(_ctx.stringValue("QueryLinkeBahamutCloudtenanttechstacksResponse.Result["+ i +"].Id"));
			resultItem.setIdentity(_ctx.stringValue("QueryLinkeBahamutCloudtenanttechstacksResponse.Result["+ i +"].Identity"));
			resultItem.setName(_ctx.stringValue("QueryLinkeBahamutCloudtenanttechstacksResponse.Result["+ i +"].Name"));
			resultItem.setScope(_ctx.stringValue("QueryLinkeBahamutCloudtenanttechstacksResponse.Result["+ i +"].Scope"));
			resultItem.setStatus(_ctx.stringValue("QueryLinkeBahamutCloudtenanttechstacksResponse.Result["+ i +"].Status"));

			result.add(resultItem);
		}
		queryLinkeBahamutCloudtenanttechstacksResponse.setResult(result);
	 
	 	return queryLinkeBahamutCloudtenanttechstacksResponse;
	}
}