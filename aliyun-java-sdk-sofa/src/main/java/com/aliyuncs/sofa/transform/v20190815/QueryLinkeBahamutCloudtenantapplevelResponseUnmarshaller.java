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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutCloudtenantapplevelResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutCloudtenantapplevelResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutCloudtenantapplevelResponseUnmarshaller {

	public static QueryLinkeBahamutCloudtenantapplevelResponse unmarshall(QueryLinkeBahamutCloudtenantapplevelResponse queryLinkeBahamutCloudtenantapplevelResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutCloudtenantapplevelResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutCloudtenantapplevelResponse.RequestId"));
		queryLinkeBahamutCloudtenantapplevelResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutCloudtenantapplevelResponse.ResultCode"));
		queryLinkeBahamutCloudtenantapplevelResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutCloudtenantapplevelResponse.ResultMessage"));
		queryLinkeBahamutCloudtenantapplevelResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutCloudtenantapplevelResponse.ErrorMessage"));
		queryLinkeBahamutCloudtenantapplevelResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutCloudtenantapplevelResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutCloudtenantapplevelResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutCloudtenantapplevelResponse.Message"));
		queryLinkeBahamutCloudtenantapplevelResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutCloudtenantapplevelResponse.ResponseStatusCode"));
		queryLinkeBahamutCloudtenantapplevelResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutCloudtenantapplevelResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutCloudtenantapplevelResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setId(_ctx.stringValue("QueryLinkeBahamutCloudtenantapplevelResponse.Result["+ i +"].Id"));
			resultItem.setName(_ctx.stringValue("QueryLinkeBahamutCloudtenantapplevelResponse.Result["+ i +"].Name"));
			resultItem.setOwnerLoginName(_ctx.stringValue("QueryLinkeBahamutCloudtenantapplevelResponse.Result["+ i +"].OwnerLoginName"));

			result.add(resultItem);
		}
		queryLinkeBahamutCloudtenantapplevelResponse.setResult(result);
	 
	 	return queryLinkeBahamutCloudtenantapplevelResponse;
	}
}