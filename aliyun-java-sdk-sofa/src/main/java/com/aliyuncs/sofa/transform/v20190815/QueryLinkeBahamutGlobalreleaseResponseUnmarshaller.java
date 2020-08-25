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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutGlobalreleaseResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutGlobalreleaseResponse.Paginator;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutGlobalreleaseResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutGlobalreleaseResponseUnmarshaller {

	public static QueryLinkeBahamutGlobalreleaseResponse unmarshall(QueryLinkeBahamutGlobalreleaseResponse queryLinkeBahamutGlobalreleaseResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutGlobalreleaseResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutGlobalreleaseResponse.RequestId"));
		queryLinkeBahamutGlobalreleaseResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutGlobalreleaseResponse.ResultCode"));
		queryLinkeBahamutGlobalreleaseResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutGlobalreleaseResponse.ResultMessage"));
		queryLinkeBahamutGlobalreleaseResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutGlobalreleaseResponse.ErrorMessage"));
		queryLinkeBahamutGlobalreleaseResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutGlobalreleaseResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutGlobalreleaseResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutGlobalreleaseResponse.Message"));
		queryLinkeBahamutGlobalreleaseResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutGlobalreleaseResponse.ResponseStatusCode"));
		queryLinkeBahamutGlobalreleaseResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutGlobalreleaseResponse.Success"));

		Paginator paginator = new Paginator();
		paginator.setItemCount(_ctx.longValue("QueryLinkeBahamutGlobalreleaseResponse.Paginator.ItemCount"));
		paginator.setPage(_ctx.longValue("QueryLinkeBahamutGlobalreleaseResponse.Paginator.Page"));
		paginator.setPageCount(_ctx.longValue("QueryLinkeBahamutGlobalreleaseResponse.Paginator.PageCount"));
		paginator.setPageSize(_ctx.longValue("QueryLinkeBahamutGlobalreleaseResponse.Paginator.PageSize"));
		queryLinkeBahamutGlobalreleaseResponse.setPaginator(paginator);

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutGlobalreleaseResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAoneReleaseId(_ctx.stringValue("QueryLinkeBahamutGlobalreleaseResponse.Result["+ i +"].AoneReleaseId"));
			resultItem.setAppGroupName(_ctx.stringValue("QueryLinkeBahamutGlobalreleaseResponse.Result["+ i +"].AppGroupName"));
			resultItem.setCreated(_ctx.longValue("QueryLinkeBahamutGlobalreleaseResponse.Result["+ i +"].Created"));
			resultItem.setCreator(_ctx.stringValue("QueryLinkeBahamutGlobalreleaseResponse.Result["+ i +"].Creator"));
			resultItem.setExternalId(_ctx.stringValue("QueryLinkeBahamutGlobalreleaseResponse.Result["+ i +"].ExternalId"));
			resultItem.setId(_ctx.stringValue("QueryLinkeBahamutGlobalreleaseResponse.Result["+ i +"].Id"));
			resultItem.setName(_ctx.stringValue("QueryLinkeBahamutGlobalreleaseResponse.Result["+ i +"].Name"));
			resultItem.setReleaseDate(_ctx.longValue("QueryLinkeBahamutGlobalreleaseResponse.Result["+ i +"].ReleaseDate"));
			resultItem.setStatus(_ctx.stringValue("QueryLinkeBahamutGlobalreleaseResponse.Result["+ i +"].Status"));
			resultItem.setType(_ctx.stringValue("QueryLinkeBahamutGlobalreleaseResponse.Result["+ i +"].Type"));

			List<String> managers = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutGlobalreleaseResponse.Result["+ i +"].Managers.Length"); j++) {
				managers.add(_ctx.stringValue("QueryLinkeBahamutGlobalreleaseResponse.Result["+ i +"].Managers["+ j +"]"));
			}
			resultItem.setManagers(managers);

			result.add(resultItem);
		}
		queryLinkeBahamutGlobalreleaseResponse.setResult(result);
	 
	 	return queryLinkeBahamutGlobalreleaseResponse;
	}
}