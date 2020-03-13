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

import com.aliyuncs.sofa.model.v20190815.QueryRmsDataTopksResponse;
import com.aliyuncs.sofa.model.v20190815.QueryRmsDataTopksResponse.Response;
import com.aliyuncs.sofa.model.v20190815.QueryRmsDataTopksResponse.Response.Data;
import com.aliyuncs.sofa.model.v20190815.QueryRmsDataTopksResponse.Response.Data.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRmsDataTopksResponseUnmarshaller {

	public static QueryRmsDataTopksResponse unmarshall(QueryRmsDataTopksResponse queryRmsDataTopksResponse, UnmarshallerContext _ctx) {
		
		queryRmsDataTopksResponse.setRequestId(_ctx.stringValue("QueryRmsDataTopksResponse.RequestId"));
		queryRmsDataTopksResponse.setResultCode(_ctx.stringValue("QueryRmsDataTopksResponse.ResultCode"));
		queryRmsDataTopksResponse.setResultMessage(_ctx.stringValue("QueryRmsDataTopksResponse.ResultMessage"));

		Response response = new Response();
		response.setError(_ctx.stringValue("QueryRmsDataTopksResponse.Response.Error"));
		response.setErrorType(_ctx.stringValue("QueryRmsDataTopksResponse.Response.ErrorType"));
		response.setQuery(_ctx.stringValue("QueryRmsDataTopksResponse.Response.Query"));
		response.setStatus(_ctx.stringValue("QueryRmsDataTopksResponse.Response.Status"));

		Data data = new Data();
		data.setResultType(_ctx.stringValue("QueryRmsDataTopksResponse.Response.Data.ResultType"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryRmsDataTopksResponse.Response.Data.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setPort(_ctx.stringValue("QueryRmsDataTopksResponse.Response.Data.Result["+ i +"].Port"));
			resultItem.setTargetId(_ctx.stringValue("QueryRmsDataTopksResponse.Response.Data.Result["+ i +"].TargetId"));
			resultItem.setTargetName(_ctx.stringValue("QueryRmsDataTopksResponse.Response.Data.Result["+ i +"].TargetName"));
			resultItem.setTimestamp(_ctx.stringValue("QueryRmsDataTopksResponse.Response.Data.Result["+ i +"].Timestamp"));
			resultItem.setValue(_ctx.longValue("QueryRmsDataTopksResponse.Response.Data.Result["+ i +"].Value"));

			result.add(resultItem);
		}
		data.setResult(result);
		response.setData(data);
		queryRmsDataTopksResponse.setResponse(response);
	 
	 	return queryRmsDataTopksResponse;
	}
}