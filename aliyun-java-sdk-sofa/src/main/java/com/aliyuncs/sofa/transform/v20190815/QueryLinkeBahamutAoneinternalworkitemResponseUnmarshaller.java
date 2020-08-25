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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutAoneinternalworkitemResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutAoneinternalworkitemResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutAoneinternalworkitemResponseUnmarshaller {

	public static QueryLinkeBahamutAoneinternalworkitemResponse unmarshall(QueryLinkeBahamutAoneinternalworkitemResponse queryLinkeBahamutAoneinternalworkitemResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutAoneinternalworkitemResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutAoneinternalworkitemResponse.RequestId"));
		queryLinkeBahamutAoneinternalworkitemResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutAoneinternalworkitemResponse.ResultCode"));
		queryLinkeBahamutAoneinternalworkitemResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutAoneinternalworkitemResponse.ResultMessage"));
		queryLinkeBahamutAoneinternalworkitemResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutAoneinternalworkitemResponse.ErrorMessage"));
		queryLinkeBahamutAoneinternalworkitemResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutAoneinternalworkitemResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutAoneinternalworkitemResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutAoneinternalworkitemResponse.Message"));
		queryLinkeBahamutAoneinternalworkitemResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutAoneinternalworkitemResponse.ResponseStatusCode"));
		queryLinkeBahamutAoneinternalworkitemResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutAoneinternalworkitemResponse.Success"));

		Result result = new Result();
		result.setCount(_ctx.longValue("QueryLinkeBahamutAoneinternalworkitemResponse.Result.Count"));
		result.setPage(_ctx.longValue("QueryLinkeBahamutAoneinternalworkitemResponse.Result.Page"));
		result.setPageSize(_ctx.longValue("QueryLinkeBahamutAoneinternalworkitemResponse.Result.PageSize"));

		List<String> datas = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutAoneinternalworkitemResponse.Result.Datas.Length"); i++) {
			datas.add(_ctx.stringValue("QueryLinkeBahamutAoneinternalworkitemResponse.Result.Datas["+ i +"]"));
		}
		result.setDatas(datas);
		queryLinkeBahamutAoneinternalworkitemResponse.setResult(result);
	 
	 	return queryLinkeBahamutAoneinternalworkitemResponse;
	}
}