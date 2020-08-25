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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutArchdomainResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutArchdomainResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutArchdomainResponseUnmarshaller {

	public static QueryLinkeBahamutArchdomainResponse unmarshall(QueryLinkeBahamutArchdomainResponse queryLinkeBahamutArchdomainResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutArchdomainResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutArchdomainResponse.RequestId"));
		queryLinkeBahamutArchdomainResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutArchdomainResponse.ResultCode"));
		queryLinkeBahamutArchdomainResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutArchdomainResponse.ResultMessage"));
		queryLinkeBahamutArchdomainResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutArchdomainResponse.ErrorMessage"));
		queryLinkeBahamutArchdomainResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutArchdomainResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutArchdomainResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutArchdomainResponse.Message"));
		queryLinkeBahamutArchdomainResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutArchdomainResponse.ResponseStatusCode"));
		queryLinkeBahamutArchdomainResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutArchdomainResponse.Success"));

		Result result = new Result();
		result.setCount(_ctx.longValue("QueryLinkeBahamutArchdomainResponse.Result.Count"));
		result.setPage(_ctx.longValue("QueryLinkeBahamutArchdomainResponse.Result.Page"));
		result.setPageCount(_ctx.longValue("QueryLinkeBahamutArchdomainResponse.Result.PageCount"));
		result.setPageSize(_ctx.longValue("QueryLinkeBahamutArchdomainResponse.Result.PageSize"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutArchdomainResponse.Result.Data.Length"); i++) {
			data.add(_ctx.stringValue("QueryLinkeBahamutArchdomainResponse.Result.Data["+ i +"]"));
		}
		result.setData(data);
		queryLinkeBahamutArchdomainResponse.setResult(result);
	 
	 	return queryLinkeBahamutArchdomainResponse;
	}
}