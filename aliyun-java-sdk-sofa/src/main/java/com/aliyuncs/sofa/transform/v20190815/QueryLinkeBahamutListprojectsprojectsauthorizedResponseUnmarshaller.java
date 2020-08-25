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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutListprojectsprojectsauthorizedResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutListprojectsprojectsauthorizedResponse.Paginator;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutListprojectsprojectsauthorizedResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutListprojectsprojectsauthorizedResponseUnmarshaller {

	public static QueryLinkeBahamutListprojectsprojectsauthorizedResponse unmarshall(QueryLinkeBahamutListprojectsprojectsauthorizedResponse queryLinkeBahamutListprojectsprojectsauthorizedResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutListprojectsprojectsauthorizedResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutListprojectsprojectsauthorizedResponse.RequestId"));
		queryLinkeBahamutListprojectsprojectsauthorizedResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutListprojectsprojectsauthorizedResponse.ResultCode"));
		queryLinkeBahamutListprojectsprojectsauthorizedResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutListprojectsprojectsauthorizedResponse.ResultMessage"));
		queryLinkeBahamutListprojectsprojectsauthorizedResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutListprojectsprojectsauthorizedResponse.ErrorMessage"));
		queryLinkeBahamutListprojectsprojectsauthorizedResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutListprojectsprojectsauthorizedResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutListprojectsprojectsauthorizedResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutListprojectsprojectsauthorizedResponse.Message"));
		queryLinkeBahamutListprojectsprojectsauthorizedResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutListprojectsprojectsauthorizedResponse.ResponseStatusCode"));
		queryLinkeBahamutListprojectsprojectsauthorizedResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutListprojectsprojectsauthorizedResponse.Success"));

		Paginator paginator = new Paginator();
		paginator.setItemCount(_ctx.longValue("QueryLinkeBahamutListprojectsprojectsauthorizedResponse.Paginator.ItemCount"));
		paginator.setPage(_ctx.longValue("QueryLinkeBahamutListprojectsprojectsauthorizedResponse.Paginator.Page"));
		paginator.setPageCount(_ctx.longValue("QueryLinkeBahamutListprojectsprojectsauthorizedResponse.Paginator.PageCount"));
		paginator.setPageSize(_ctx.longValue("QueryLinkeBahamutListprojectsprojectsauthorizedResponse.Paginator.PageSize"));
		queryLinkeBahamutListprojectsprojectsauthorizedResponse.setPaginator(paginator);

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutListprojectsprojectsauthorizedResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setDescription(_ctx.stringValue("QueryLinkeBahamutListprojectsprojectsauthorizedResponse.Result["+ i +"].Description"));
			resultItem.setEncoding(_ctx.stringValue("QueryLinkeBahamutListprojectsprojectsauthorizedResponse.Result["+ i +"].Encoding"));
			resultItem.setHttpUrlToRepo(_ctx.stringValue("QueryLinkeBahamutListprojectsprojectsauthorizedResponse.Result["+ i +"].HttpUrlToRepo"));
			resultItem.setId(_ctx.stringValue("QueryLinkeBahamutListprojectsprojectsauthorizedResponse.Result["+ i +"].Id"));
			resultItem.setName(_ctx.stringValue("QueryLinkeBahamutListprojectsprojectsauthorizedResponse.Result["+ i +"].Name"));
			resultItem.setNamespace(_ctx.stringValue("QueryLinkeBahamutListprojectsprojectsauthorizedResponse.Result["+ i +"].Namespace"));
			resultItem.setPublicStatus(_ctx.booleanValue("QueryLinkeBahamutListprojectsprojectsauthorizedResponse.Result["+ i +"].PublicStatus"));
			resultItem.setSshUrlToRepo(_ctx.stringValue("QueryLinkeBahamutListprojectsprojectsauthorizedResponse.Result["+ i +"].SshUrlToRepo"));
			resultItem.setVisibility(_ctx.stringValue("QueryLinkeBahamutListprojectsprojectsauthorizedResponse.Result["+ i +"].Visibility"));
			resultItem.setVisibilityLevel(_ctx.longValue("QueryLinkeBahamutListprojectsprojectsauthorizedResponse.Result["+ i +"].VisibilityLevel"));
			resultItem.setWebUrl(_ctx.stringValue("QueryLinkeBahamutListprojectsprojectsauthorizedResponse.Result["+ i +"].WebUrl"));

			result.add(resultItem);
		}
		queryLinkeBahamutListprojectsprojectsauthorizedResponse.setResult(result);
	 
	 	return queryLinkeBahamutListprojectsprojectsauthorizedResponse;
	}
}