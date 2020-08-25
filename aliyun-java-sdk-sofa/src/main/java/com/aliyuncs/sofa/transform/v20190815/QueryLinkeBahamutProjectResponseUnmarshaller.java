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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutProjectResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutProjectResponse.Paginator;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutProjectResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutProjectResponseUnmarshaller {

	public static QueryLinkeBahamutProjectResponse unmarshall(QueryLinkeBahamutProjectResponse queryLinkeBahamutProjectResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutProjectResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutProjectResponse.RequestId"));
		queryLinkeBahamutProjectResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutProjectResponse.ResultCode"));
		queryLinkeBahamutProjectResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutProjectResponse.ResultMessage"));
		queryLinkeBahamutProjectResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutProjectResponse.ErrorMessage"));
		queryLinkeBahamutProjectResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutProjectResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutProjectResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutProjectResponse.Message"));
		queryLinkeBahamutProjectResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutProjectResponse.ResponseStatusCode"));
		queryLinkeBahamutProjectResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutProjectResponse.Success"));

		Paginator paginator = new Paginator();
		paginator.setItemCount(_ctx.longValue("QueryLinkeBahamutProjectResponse.Paginator.ItemCount"));
		paginator.setPage(_ctx.longValue("QueryLinkeBahamutProjectResponse.Paginator.Page"));
		paginator.setPageCount(_ctx.longValue("QueryLinkeBahamutProjectResponse.Paginator.PageCount"));
		paginator.setPageSize(_ctx.longValue("QueryLinkeBahamutProjectResponse.Paginator.PageSize"));
		queryLinkeBahamutProjectResponse.setPaginator(paginator);

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutProjectResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setCreator(_ctx.stringValue("QueryLinkeBahamutProjectResponse.Result["+ i +"].Creator"));
			resultItem.setFullName(_ctx.stringValue("QueryLinkeBahamutProjectResponse.Result["+ i +"].FullName"));
			resultItem.setId(_ctx.stringValue("QueryLinkeBahamutProjectResponse.Result["+ i +"].Id"));
			resultItem.setIdPath(_ctx.stringValue("QueryLinkeBahamutProjectResponse.Result["+ i +"].IdPath"));
			resultItem.setLink(_ctx.stringValue("QueryLinkeBahamutProjectResponse.Result["+ i +"].Link"));
			resultItem.setMode(_ctx.stringValue("QueryLinkeBahamutProjectResponse.Result["+ i +"].Mode"));
			resultItem.setName(_ctx.stringValue("QueryLinkeBahamutProjectResponse.Result["+ i +"].Name"));
			resultItem.setParentId(_ctx.longValue("QueryLinkeBahamutProjectResponse.Result["+ i +"].ParentId"));
			resultItem.setStatus(_ctx.stringValue("QueryLinkeBahamutProjectResponse.Result["+ i +"].Status"));
			resultItem.setType(_ctx.stringValue("QueryLinkeBahamutProjectResponse.Result["+ i +"].Type"));

			List<String> admins = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutProjectResponse.Result["+ i +"].Admins.Length"); j++) {
				admins.add(_ctx.stringValue("QueryLinkeBahamutProjectResponse.Result["+ i +"].Admins["+ j +"]"));
			}
			resultItem.setAdmins(admins);

			result.add(resultItem);
		}
		queryLinkeBahamutProjectResponse.setResult(result);
	 
	 	return queryLinkeBahamutProjectResponse;
	}
}