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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutMyvcsgroupsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutMyvcsgroupsResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutMyvcsgroupsResponseUnmarshaller {

	public static QueryLinkeBahamutMyvcsgroupsResponse unmarshall(QueryLinkeBahamutMyvcsgroupsResponse queryLinkeBahamutMyvcsgroupsResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutMyvcsgroupsResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutMyvcsgroupsResponse.RequestId"));
		queryLinkeBahamutMyvcsgroupsResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutMyvcsgroupsResponse.ResultCode"));
		queryLinkeBahamutMyvcsgroupsResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutMyvcsgroupsResponse.ResultMessage"));
		queryLinkeBahamutMyvcsgroupsResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutMyvcsgroupsResponse.ErrorMessage"));
		queryLinkeBahamutMyvcsgroupsResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutMyvcsgroupsResponse.Message"));
		queryLinkeBahamutMyvcsgroupsResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutMyvcsgroupsResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutMyvcsgroupsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setDescription(_ctx.stringValue("QueryLinkeBahamutMyvcsgroupsResponse.Result["+ i +"].Description"));
			resultItem.setId(_ctx.stringValue("QueryLinkeBahamutMyvcsgroupsResponse.Result["+ i +"].Id"));
			resultItem.setName(_ctx.stringValue("QueryLinkeBahamutMyvcsgroupsResponse.Result["+ i +"].Name"));
			resultItem.setPath(_ctx.stringValue("QueryLinkeBahamutMyvcsgroupsResponse.Result["+ i +"].Path"));

			result.add(resultItem);
		}
		queryLinkeBahamutMyvcsgroupsResponse.setResult(result);
	 
	 	return queryLinkeBahamutMyvcsgroupsResponse;
	}
}