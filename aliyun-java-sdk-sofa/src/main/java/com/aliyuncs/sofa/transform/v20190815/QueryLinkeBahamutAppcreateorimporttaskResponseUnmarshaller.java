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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutAppcreateorimporttaskResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutAppcreateorimporttaskResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutAppcreateorimporttaskResponseUnmarshaller {

	public static QueryLinkeBahamutAppcreateorimporttaskResponse unmarshall(QueryLinkeBahamutAppcreateorimporttaskResponse queryLinkeBahamutAppcreateorimporttaskResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutAppcreateorimporttaskResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutAppcreateorimporttaskResponse.RequestId"));
		queryLinkeBahamutAppcreateorimporttaskResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutAppcreateorimporttaskResponse.ResultCode"));
		queryLinkeBahamutAppcreateorimporttaskResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutAppcreateorimporttaskResponse.ResultMessage"));
		queryLinkeBahamutAppcreateorimporttaskResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutAppcreateorimporttaskResponse.ErrorMessage"));
		queryLinkeBahamutAppcreateorimporttaskResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutAppcreateorimporttaskResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutAppcreateorimporttaskResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutAppcreateorimporttaskResponse.Message"));
		queryLinkeBahamutAppcreateorimporttaskResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutAppcreateorimporttaskResponse.ResponseStatusCode"));
		queryLinkeBahamutAppcreateorimporttaskResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutAppcreateorimporttaskResponse.Success"));

		Result result = new Result();
		result.setCount(_ctx.longValue("QueryLinkeBahamutAppcreateorimporttaskResponse.Result.Count"));
		result.setPage(_ctx.longValue("QueryLinkeBahamutAppcreateorimporttaskResponse.Result.Page"));
		result.setPageCount(_ctx.longValue("QueryLinkeBahamutAppcreateorimporttaskResponse.Result.PageCount"));
		result.setPageSize(_ctx.longValue("QueryLinkeBahamutAppcreateorimporttaskResponse.Result.PageSize"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutAppcreateorimporttaskResponse.Result.Data.Length"); i++) {
			data.add(_ctx.stringValue("QueryLinkeBahamutAppcreateorimporttaskResponse.Result.Data["+ i +"]"));
		}
		result.setData(data);
		queryLinkeBahamutAppcreateorimporttaskResponse.setResult(result);
	 
	 	return queryLinkeBahamutAppcreateorimporttaskResponse;
	}
}