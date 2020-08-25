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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutCodeservicesearchgroupResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutCodeservicesearchgroupResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutCodeservicesearchgroupResponseUnmarshaller {

	public static QueryLinkeBahamutCodeservicesearchgroupResponse unmarshall(QueryLinkeBahamutCodeservicesearchgroupResponse queryLinkeBahamutCodeservicesearchgroupResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutCodeservicesearchgroupResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutCodeservicesearchgroupResponse.RequestId"));
		queryLinkeBahamutCodeservicesearchgroupResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutCodeservicesearchgroupResponse.ResultCode"));
		queryLinkeBahamutCodeservicesearchgroupResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutCodeservicesearchgroupResponse.ResultMessage"));
		queryLinkeBahamutCodeservicesearchgroupResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutCodeservicesearchgroupResponse.ErrorMessage"));
		queryLinkeBahamutCodeservicesearchgroupResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutCodeservicesearchgroupResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutCodeservicesearchgroupResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutCodeservicesearchgroupResponse.Message"));
		queryLinkeBahamutCodeservicesearchgroupResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutCodeservicesearchgroupResponse.ResponseStatusCode"));
		queryLinkeBahamutCodeservicesearchgroupResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutCodeservicesearchgroupResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutCodeservicesearchgroupResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setDescription(_ctx.stringValue("QueryLinkeBahamutCodeservicesearchgroupResponse.Result["+ i +"].Description"));
			resultItem.setId(_ctx.stringValue("QueryLinkeBahamutCodeservicesearchgroupResponse.Result["+ i +"].Id"));
			resultItem.setName(_ctx.stringValue("QueryLinkeBahamutCodeservicesearchgroupResponse.Result["+ i +"].Name"));
			resultItem.setPath(_ctx.stringValue("QueryLinkeBahamutCodeservicesearchgroupResponse.Result["+ i +"].Path"));

			result.add(resultItem);
		}
		queryLinkeBahamutCodeservicesearchgroupResponse.setResult(result);
	 
	 	return queryLinkeBahamutCodeservicesearchgroupResponse;
	}
}