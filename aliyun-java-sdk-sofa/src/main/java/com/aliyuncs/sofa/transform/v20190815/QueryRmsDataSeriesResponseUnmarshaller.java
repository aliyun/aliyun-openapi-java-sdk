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

import com.aliyuncs.sofa.model.v20190815.QueryRmsDataSeriesResponse;
import com.aliyuncs.sofa.model.v20190815.QueryRmsDataSeriesResponse.Response;
import com.aliyuncs.sofa.model.v20190815.QueryRmsDataSeriesResponse.Response.Data;
import com.aliyuncs.sofa.model.v20190815.QueryRmsDataSeriesResponse.Response.Data.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRmsDataSeriesResponseUnmarshaller {

	public static QueryRmsDataSeriesResponse unmarshall(QueryRmsDataSeriesResponse queryRmsDataSeriesResponse, UnmarshallerContext _ctx) {
		
		queryRmsDataSeriesResponse.setRequestId(_ctx.stringValue("QueryRmsDataSeriesResponse.RequestId"));
		queryRmsDataSeriesResponse.setResultCode(_ctx.stringValue("QueryRmsDataSeriesResponse.ResultCode"));
		queryRmsDataSeriesResponse.setResultMessage(_ctx.stringValue("QueryRmsDataSeriesResponse.ResultMessage"));

		Response response = new Response();
		response.setError(_ctx.stringValue("QueryRmsDataSeriesResponse.Response.Error"));
		response.setErrorType(_ctx.stringValue("QueryRmsDataSeriesResponse.Response.ErrorType"));
		response.setQuery(_ctx.stringValue("QueryRmsDataSeriesResponse.Response.Query"));
		response.setStatus(_ctx.stringValue("QueryRmsDataSeriesResponse.Response.Status"));

		Data data = new Data();
		data.setResultType(_ctx.stringValue("QueryRmsDataSeriesResponse.Response.Data.ResultType"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryRmsDataSeriesResponse.Response.Data.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setTimestamp(_ctx.longValue("QueryRmsDataSeriesResponse.Response.Data.Result["+ i +"].Timestamp"));
			resultItem.setValue(_ctx.stringValue("QueryRmsDataSeriesResponse.Response.Data.Result["+ i +"].Value"));

			result.add(resultItem);
		}
		data.setResult(result);
		response.setData(data);
		queryRmsDataSeriesResponse.setResponse(response);
	 
	 	return queryRmsDataSeriesResponse;
	}
}