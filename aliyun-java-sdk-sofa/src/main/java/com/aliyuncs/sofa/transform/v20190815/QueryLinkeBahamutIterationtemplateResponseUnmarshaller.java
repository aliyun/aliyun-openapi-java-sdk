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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutIterationtemplateResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutIterationtemplateResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutIterationtemplateResponseUnmarshaller {

	public static QueryLinkeBahamutIterationtemplateResponse unmarshall(QueryLinkeBahamutIterationtemplateResponse queryLinkeBahamutIterationtemplateResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutIterationtemplateResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutIterationtemplateResponse.RequestId"));
		queryLinkeBahamutIterationtemplateResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutIterationtemplateResponse.ResultCode"));
		queryLinkeBahamutIterationtemplateResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutIterationtemplateResponse.ResultMessage"));
		queryLinkeBahamutIterationtemplateResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutIterationtemplateResponse.ErrorMessage"));
		queryLinkeBahamutIterationtemplateResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutIterationtemplateResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutIterationtemplateResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutIterationtemplateResponse.Message"));
		queryLinkeBahamutIterationtemplateResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutIterationtemplateResponse.ResponseStatusCode"));
		queryLinkeBahamutIterationtemplateResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutIterationtemplateResponse.Success"));

		Result result = new Result();
		result.setCount(_ctx.longValue("QueryLinkeBahamutIterationtemplateResponse.Result.Count"));
		result.setPage(_ctx.longValue("QueryLinkeBahamutIterationtemplateResponse.Result.Page"));
		result.setPageCount(_ctx.longValue("QueryLinkeBahamutIterationtemplateResponse.Result.PageCount"));
		result.setPageSize(_ctx.longValue("QueryLinkeBahamutIterationtemplateResponse.Result.PageSize"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutIterationtemplateResponse.Result.Data.Length"); i++) {
			data.add(_ctx.stringValue("QueryLinkeBahamutIterationtemplateResponse.Result.Data["+ i +"]"));
		}
		result.setData(data);
		queryLinkeBahamutIterationtemplateResponse.setResult(result);
	 
	 	return queryLinkeBahamutIterationtemplateResponse;
	}
}