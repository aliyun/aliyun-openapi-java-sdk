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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutIterationsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutIterationsResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutIterationsResponseUnmarshaller {

	public static QueryLinkeBahamutIterationsResponse unmarshall(QueryLinkeBahamutIterationsResponse queryLinkeBahamutIterationsResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutIterationsResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutIterationsResponse.RequestId"));
		queryLinkeBahamutIterationsResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutIterationsResponse.ResultCode"));
		queryLinkeBahamutIterationsResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutIterationsResponse.ResultMessage"));
		queryLinkeBahamutIterationsResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutIterationsResponse.ErrorMessage"));
		queryLinkeBahamutIterationsResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutIterationsResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutIterationsResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutIterationsResponse.Message"));
		queryLinkeBahamutIterationsResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutIterationsResponse.ResponseStatusCode"));
		queryLinkeBahamutIterationsResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutIterationsResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutIterationsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setCreated(_ctx.longValue("QueryLinkeBahamutIterationsResponse.Result["+ i +"].Created"));
			resultItem.setDeleted(_ctx.booleanValue("QueryLinkeBahamutIterationsResponse.Result["+ i +"].Deleted"));
			resultItem.setExternalId(_ctx.stringValue("QueryLinkeBahamutIterationsResponse.Result["+ i +"].ExternalId"));
			resultItem.setFinished(_ctx.booleanValue("QueryLinkeBahamutIterationsResponse.Result["+ i +"].Finished"));
			resultItem.setId(_ctx.stringValue("QueryLinkeBahamutIterationsResponse.Result["+ i +"].Id"));
			resultItem.setLastModified(_ctx.longValue("QueryLinkeBahamutIterationsResponse.Result["+ i +"].LastModified"));
			resultItem.setName(_ctx.stringValue("QueryLinkeBahamutIterationsResponse.Result["+ i +"].Name"));
			resultItem.setOwner(_ctx.stringValue("QueryLinkeBahamutIterationsResponse.Result["+ i +"].Owner"));
			resultItem.setOwnerObj(_ctx.stringValue("QueryLinkeBahamutIterationsResponse.Result["+ i +"].OwnerObj"));
			resultItem.setProject(_ctx.stringValue("QueryLinkeBahamutIterationsResponse.Result["+ i +"].Project"));
			resultItem.setRelease(_ctx.stringValue("QueryLinkeBahamutIterationsResponse.Result["+ i +"].Release"));
			resultItem.setStage(_ctx.stringValue("QueryLinkeBahamutIterationsResponse.Result["+ i +"].Stage"));
			resultItem.setStageStep(_ctx.stringValue("QueryLinkeBahamutIterationsResponse.Result["+ i +"].StageStep"));

			result.add(resultItem);
		}
		queryLinkeBahamutIterationsResponse.setResult(result);
	 
	 	return queryLinkeBahamutIterationsResponse;
	}
}