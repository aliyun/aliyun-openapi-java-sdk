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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutAoneinternalpagedprojectsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutAoneinternalpagedprojectsResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutAoneinternalpagedprojectsResponseUnmarshaller {

	public static QueryLinkeBahamutAoneinternalpagedprojectsResponse unmarshall(QueryLinkeBahamutAoneinternalpagedprojectsResponse queryLinkeBahamutAoneinternalpagedprojectsResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutAoneinternalpagedprojectsResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutAoneinternalpagedprojectsResponse.RequestId"));
		queryLinkeBahamutAoneinternalpagedprojectsResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutAoneinternalpagedprojectsResponse.ResultCode"));
		queryLinkeBahamutAoneinternalpagedprojectsResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutAoneinternalpagedprojectsResponse.ResultMessage"));
		queryLinkeBahamutAoneinternalpagedprojectsResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutAoneinternalpagedprojectsResponse.ErrorMessage"));
		queryLinkeBahamutAoneinternalpagedprojectsResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutAoneinternalpagedprojectsResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutAoneinternalpagedprojectsResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutAoneinternalpagedprojectsResponse.Message"));
		queryLinkeBahamutAoneinternalpagedprojectsResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutAoneinternalpagedprojectsResponse.ResponseStatusCode"));
		queryLinkeBahamutAoneinternalpagedprojectsResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutAoneinternalpagedprojectsResponse.Success"));

		Result result = new Result();
		result.setCount(_ctx.longValue("QueryLinkeBahamutAoneinternalpagedprojectsResponse.Result.Count"));
		result.setPage(_ctx.longValue("QueryLinkeBahamutAoneinternalpagedprojectsResponse.Result.Page"));
		result.setPageCount(_ctx.longValue("QueryLinkeBahamutAoneinternalpagedprojectsResponse.Result.PageCount"));
		result.setPageSize(_ctx.longValue("QueryLinkeBahamutAoneinternalpagedprojectsResponse.Result.PageSize"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutAoneinternalpagedprojectsResponse.Result.Data.Length"); i++) {
			data.add(_ctx.stringValue("QueryLinkeBahamutAoneinternalpagedprojectsResponse.Result.Data["+ i +"]"));
		}
		result.setData(data);
		queryLinkeBahamutAoneinternalpagedprojectsResponse.setResult(result);
	 
	 	return queryLinkeBahamutAoneinternalpagedprojectsResponse;
	}
}