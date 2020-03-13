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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutVcsgroupsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutVcsgroupsResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutVcsgroupsResponseUnmarshaller {

	public static QueryLinkeBahamutVcsgroupsResponse unmarshall(QueryLinkeBahamutVcsgroupsResponse queryLinkeBahamutVcsgroupsResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutVcsgroupsResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutVcsgroupsResponse.RequestId"));
		queryLinkeBahamutVcsgroupsResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutVcsgroupsResponse.ResultCode"));
		queryLinkeBahamutVcsgroupsResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutVcsgroupsResponse.ResultMessage"));
		queryLinkeBahamutVcsgroupsResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutVcsgroupsResponse.ErrorMessage"));
		queryLinkeBahamutVcsgroupsResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutVcsgroupsResponse.Message"));
		queryLinkeBahamutVcsgroupsResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutVcsgroupsResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutVcsgroupsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setDescription(_ctx.stringValue("QueryLinkeBahamutVcsgroupsResponse.Result["+ i +"].Description"));
			resultItem.setId(_ctx.stringValue("QueryLinkeBahamutVcsgroupsResponse.Result["+ i +"].Id"));
			resultItem.setName(_ctx.stringValue("QueryLinkeBahamutVcsgroupsResponse.Result["+ i +"].Name"));
			resultItem.setPath(_ctx.stringValue("QueryLinkeBahamutVcsgroupsResponse.Result["+ i +"].Path"));

			result.add(resultItem);
		}
		queryLinkeBahamutVcsgroupsResponse.setResult(result);
	 
	 	return queryLinkeBahamutVcsgroupsResponse;
	}
}