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

package com.aliyuncs.quickbi_public.transform.v20220101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.quickbi_public.model.v20220101.QueryDataResponse;
import com.aliyuncs.quickbi_public.model.v20220101.QueryDataResponse.Result;
import com.aliyuncs.quickbi_public.model.v20220101.QueryDataResponse.Result.HeadersItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDataResponseUnmarshaller {

	public static QueryDataResponse unmarshall(QueryDataResponse queryDataResponse, UnmarshallerContext _ctx) {
		
		queryDataResponse.setRequestId(_ctx.stringValue("QueryDataResponse.RequestId"));
		queryDataResponse.setSuccess(_ctx.booleanValue("QueryDataResponse.Success"));

		Result result = new Result();
		result.setSql(_ctx.stringValue("QueryDataResponse.Result.Sql"));

		List<Map<Object, Object>> values = _ctx.listMapValue("QueryDataResponse.Result.Values");
		result.setValues(values);

		List<HeadersItem> headers = new ArrayList<HeadersItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryDataResponse.Result.Headers.Length"); i++) {
			HeadersItem headersItem = new HeadersItem();
			headersItem.setType(_ctx.stringValue("QueryDataResponse.Result.Headers["+ i +"].Type"));
			headersItem.setDataType(_ctx.stringValue("QueryDataResponse.Result.Headers["+ i +"].DataType"));
			headersItem.setGranularity(_ctx.stringValue("QueryDataResponse.Result.Headers["+ i +"].Granularity"));
			headersItem.setLabel(_ctx.stringValue("QueryDataResponse.Result.Headers["+ i +"].Label"));
			headersItem.setColumn(_ctx.stringValue("QueryDataResponse.Result.Headers["+ i +"].Column"));
			headersItem.setAggregator(_ctx.stringValue("QueryDataResponse.Result.Headers["+ i +"].Aggregator"));

			headers.add(headersItem);
		}
		result.setHeaders(headers);
		queryDataResponse.setResult(result);
	 
	 	return queryDataResponse;
	}
}