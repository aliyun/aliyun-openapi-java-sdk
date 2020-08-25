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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutIterationResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutIterationResponse.Paginator;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutIterationResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutIterationResponseUnmarshaller {

	public static QueryLinkeBahamutIterationResponse unmarshall(QueryLinkeBahamutIterationResponse queryLinkeBahamutIterationResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutIterationResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutIterationResponse.RequestId"));
		queryLinkeBahamutIterationResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutIterationResponse.ResultCode"));
		queryLinkeBahamutIterationResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutIterationResponse.ResultMessage"));
		queryLinkeBahamutIterationResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutIterationResponse.ErrorMessage"));
		queryLinkeBahamutIterationResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutIterationResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutIterationResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutIterationResponse.Message"));
		queryLinkeBahamutIterationResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutIterationResponse.ResponseStatusCode"));
		queryLinkeBahamutIterationResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutIterationResponse.Success"));

		Paginator paginator = new Paginator();
		paginator.setItemCount(_ctx.longValue("QueryLinkeBahamutIterationResponse.Paginator.ItemCount"));
		paginator.setPage(_ctx.longValue("QueryLinkeBahamutIterationResponse.Paginator.Page"));
		paginator.setPageCount(_ctx.longValue("QueryLinkeBahamutIterationResponse.Paginator.PageCount"));
		paginator.setPageSize(_ctx.longValue("QueryLinkeBahamutIterationResponse.Paginator.PageSize"));
		queryLinkeBahamutIterationResponse.setPaginator(paginator);

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutIterationResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setCreated(_ctx.longValue("QueryLinkeBahamutIterationResponse.Result["+ i +"].Created"));
			resultItem.setDeleted(_ctx.booleanValue("QueryLinkeBahamutIterationResponse.Result["+ i +"].Deleted"));
			resultItem.setExternalId(_ctx.stringValue("QueryLinkeBahamutIterationResponse.Result["+ i +"].ExternalId"));
			resultItem.setFinished(_ctx.booleanValue("QueryLinkeBahamutIterationResponse.Result["+ i +"].Finished"));
			resultItem.setId(_ctx.stringValue("QueryLinkeBahamutIterationResponse.Result["+ i +"].Id"));
			resultItem.setLastModified(_ctx.longValue("QueryLinkeBahamutIterationResponse.Result["+ i +"].LastModified"));
			resultItem.setName(_ctx.stringValue("QueryLinkeBahamutIterationResponse.Result["+ i +"].Name"));
			resultItem.setOwner(_ctx.stringValue("QueryLinkeBahamutIterationResponse.Result["+ i +"].Owner"));
			resultItem.setOwnerObj(_ctx.stringValue("QueryLinkeBahamutIterationResponse.Result["+ i +"].OwnerObj"));
			resultItem.setProject(_ctx.stringValue("QueryLinkeBahamutIterationResponse.Result["+ i +"].Project"));
			resultItem.setRelease(_ctx.stringValue("QueryLinkeBahamutIterationResponse.Result["+ i +"].Release"));
			resultItem.setStage(_ctx.stringValue("QueryLinkeBahamutIterationResponse.Result["+ i +"].Stage"));
			resultItem.setStageStep(_ctx.stringValue("QueryLinkeBahamutIterationResponse.Result["+ i +"].StageStep"));

			result.add(resultItem);
		}
		queryLinkeBahamutIterationResponse.setResult(result);
	 
	 	return queryLinkeBahamutIterationResponse;
	}
}