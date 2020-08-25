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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutAppssearchliteResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutAppssearchliteResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutAppssearchliteResponseUnmarshaller {

	public static QueryLinkeBahamutAppssearchliteResponse unmarshall(QueryLinkeBahamutAppssearchliteResponse queryLinkeBahamutAppssearchliteResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutAppssearchliteResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutAppssearchliteResponse.RequestId"));
		queryLinkeBahamutAppssearchliteResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutAppssearchliteResponse.ResultCode"));
		queryLinkeBahamutAppssearchliteResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutAppssearchliteResponse.ResultMessage"));
		queryLinkeBahamutAppssearchliteResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutAppssearchliteResponse.ErrorMessage"));
		queryLinkeBahamutAppssearchliteResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutAppssearchliteResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutAppssearchliteResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutAppssearchliteResponse.Message"));
		queryLinkeBahamutAppssearchliteResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutAppssearchliteResponse.ResponseStatusCode"));
		queryLinkeBahamutAppssearchliteResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutAppssearchliteResponse.Success"));

		Result result = new Result();
		result.setCount(_ctx.longValue("QueryLinkeBahamutAppssearchliteResponse.Result.Count"));
		result.setPage(_ctx.longValue("QueryLinkeBahamutAppssearchliteResponse.Result.Page"));
		result.setPageCount(_ctx.longValue("QueryLinkeBahamutAppssearchliteResponse.Result.PageCount"));
		result.setPageSize(_ctx.longValue("QueryLinkeBahamutAppssearchliteResponse.Result.PageSize"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutAppssearchliteResponse.Result.Data.Length"); i++) {
			data.add(_ctx.stringValue("QueryLinkeBahamutAppssearchliteResponse.Result.Data["+ i +"]"));
		}
		result.setData(data);
		queryLinkeBahamutAppssearchliteResponse.setResult(result);
	 
	 	return queryLinkeBahamutAppssearchliteResponse;
	}
}