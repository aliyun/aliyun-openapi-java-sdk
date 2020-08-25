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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutAppcustomcijoblogResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutAppcustomcijoblogResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutAppcustomcijoblogResponseUnmarshaller {

	public static QueryLinkeBahamutAppcustomcijoblogResponse unmarshall(QueryLinkeBahamutAppcustomcijoblogResponse queryLinkeBahamutAppcustomcijoblogResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutAppcustomcijoblogResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutAppcustomcijoblogResponse.RequestId"));
		queryLinkeBahamutAppcustomcijoblogResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutAppcustomcijoblogResponse.ResultCode"));
		queryLinkeBahamutAppcustomcijoblogResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutAppcustomcijoblogResponse.ResultMessage"));
		queryLinkeBahamutAppcustomcijoblogResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutAppcustomcijoblogResponse.ErrorMessage"));
		queryLinkeBahamutAppcustomcijoblogResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutAppcustomcijoblogResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutAppcustomcijoblogResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutAppcustomcijoblogResponse.Message"));
		queryLinkeBahamutAppcustomcijoblogResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutAppcustomcijoblogResponse.ResponseStatusCode"));
		queryLinkeBahamutAppcustomcijoblogResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutAppcustomcijoblogResponse.Success"));

		Result result = new Result();
		result.setCount(_ctx.longValue("QueryLinkeBahamutAppcustomcijoblogResponse.Result.Count"));
		result.setPage(_ctx.longValue("QueryLinkeBahamutAppcustomcijoblogResponse.Result.Page"));
		result.setPageCount(_ctx.longValue("QueryLinkeBahamutAppcustomcijoblogResponse.Result.PageCount"));
		result.setPageSize(_ctx.longValue("QueryLinkeBahamutAppcustomcijoblogResponse.Result.PageSize"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutAppcustomcijoblogResponse.Result.Data.Length"); i++) {
			data.add(_ctx.stringValue("QueryLinkeBahamutAppcustomcijoblogResponse.Result.Data["+ i +"]"));
		}
		result.setData(data);
		queryLinkeBahamutAppcustomcijoblogResponse.setResult(result);
	 
	 	return queryLinkeBahamutAppcustomcijoblogResponse;
	}
}