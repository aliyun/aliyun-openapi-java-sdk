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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutRecommenditerationResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutRecommenditerationResponse.Paginator;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutRecommenditerationResponseUnmarshaller {

	public static QueryLinkeBahamutRecommenditerationResponse unmarshall(QueryLinkeBahamutRecommenditerationResponse queryLinkeBahamutRecommenditerationResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutRecommenditerationResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutRecommenditerationResponse.RequestId"));
		queryLinkeBahamutRecommenditerationResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutRecommenditerationResponse.ResultCode"));
		queryLinkeBahamutRecommenditerationResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutRecommenditerationResponse.ResultMessage"));
		queryLinkeBahamutRecommenditerationResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutRecommenditerationResponse.ErrorMessage"));
		queryLinkeBahamutRecommenditerationResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutRecommenditerationResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutRecommenditerationResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutRecommenditerationResponse.Message"));
		queryLinkeBahamutRecommenditerationResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutRecommenditerationResponse.ResponseStatusCode"));
		queryLinkeBahamutRecommenditerationResponse.setResult(_ctx.stringValue("QueryLinkeBahamutRecommenditerationResponse.Result"));
		queryLinkeBahamutRecommenditerationResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutRecommenditerationResponse.Success"));

		Paginator paginator = new Paginator();
		paginator.setItemCount(_ctx.longValue("QueryLinkeBahamutRecommenditerationResponse.Paginator.ItemCount"));
		paginator.setPage(_ctx.longValue("QueryLinkeBahamutRecommenditerationResponse.Paginator.Page"));
		paginator.setPageCount(_ctx.longValue("QueryLinkeBahamutRecommenditerationResponse.Paginator.PageCount"));
		paginator.setPageSize(_ctx.longValue("QueryLinkeBahamutRecommenditerationResponse.Paginator.PageSize"));
		queryLinkeBahamutRecommenditerationResponse.setPaginator(paginator);
	 
	 	return queryLinkeBahamutRecommenditerationResponse;
	}
}