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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutIterationadvancedsearchResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutIterationadvancedsearchResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutIterationadvancedsearchResponseUnmarshaller {

	public static QueryLinkeBahamutIterationadvancedsearchResponse unmarshall(QueryLinkeBahamutIterationadvancedsearchResponse queryLinkeBahamutIterationadvancedsearchResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutIterationadvancedsearchResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutIterationadvancedsearchResponse.RequestId"));
		queryLinkeBahamutIterationadvancedsearchResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutIterationadvancedsearchResponse.ResultCode"));
		queryLinkeBahamutIterationadvancedsearchResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutIterationadvancedsearchResponse.ResultMessage"));
		queryLinkeBahamutIterationadvancedsearchResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutIterationadvancedsearchResponse.ErrorMessage"));
		queryLinkeBahamutIterationadvancedsearchResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutIterationadvancedsearchResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutIterationadvancedsearchResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutIterationadvancedsearchResponse.Message"));
		queryLinkeBahamutIterationadvancedsearchResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutIterationadvancedsearchResponse.ResponseStatusCode"));
		queryLinkeBahamutIterationadvancedsearchResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutIterationadvancedsearchResponse.Success"));

		Result result = new Result();
		result.setCount(_ctx.longValue("QueryLinkeBahamutIterationadvancedsearchResponse.Result.Count"));
		result.setPage(_ctx.longValue("QueryLinkeBahamutIterationadvancedsearchResponse.Result.Page"));
		result.setPageCount(_ctx.longValue("QueryLinkeBahamutIterationadvancedsearchResponse.Result.PageCount"));
		result.setPageSize(_ctx.longValue("QueryLinkeBahamutIterationadvancedsearchResponse.Result.PageSize"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutIterationadvancedsearchResponse.Result.Data.Length"); i++) {
			data.add(_ctx.stringValue("QueryLinkeBahamutIterationadvancedsearchResponse.Result.Data["+ i +"]"));
		}
		result.setData(data);
		queryLinkeBahamutIterationadvancedsearchResponse.setResult(result);
	 
	 	return queryLinkeBahamutIterationadvancedsearchResponse;
	}
}