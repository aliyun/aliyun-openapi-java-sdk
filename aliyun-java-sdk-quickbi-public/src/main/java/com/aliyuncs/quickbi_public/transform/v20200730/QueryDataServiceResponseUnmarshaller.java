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

package com.aliyuncs.quickbi_public.transform.v20200730;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.quickbi_public.model.v20200730.QueryDataServiceResponse;
import com.aliyuncs.quickbi_public.model.v20200730.QueryDataServiceResponse.Result;
import com.aliyuncs.quickbi_public.model.v20200730.QueryDataServiceResponse.Result.HeadersItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDataServiceResponseUnmarshaller {

	public static QueryDataServiceResponse unmarshall(QueryDataServiceResponse queryDataServiceResponse, UnmarshallerContext _ctx) {
		
		queryDataServiceResponse.setRequestId(_ctx.stringValue("QueryDataServiceResponse.RequestId"));
		queryDataServiceResponse.setSuccess(_ctx.booleanValue("QueryDataServiceResponse.Success"));

		Result result = new Result();
		result.setSql(_ctx.stringValue("QueryDataServiceResponse.Result.Sql"));

		List<Map<Object, Object>> values = _ctx.listMapValue("QueryDataServiceResponse.Result.Values");
		result.setValues(values);

		List<HeadersItem> headers = new ArrayList<HeadersItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryDataServiceResponse.Result.Headers.Length"); i++) {
			HeadersItem headersItem = new HeadersItem();
			headersItem.setLabel(_ctx.stringValue("QueryDataServiceResponse.Result.Headers["+ i +"].Label"));
			headersItem.setType(_ctx.stringValue("QueryDataServiceResponse.Result.Headers["+ i +"].Type"));
			headersItem.setDataType(_ctx.stringValue("QueryDataServiceResponse.Result.Headers["+ i +"].DataType"));
			headersItem.setColumn(_ctx.stringValue("QueryDataServiceResponse.Result.Headers["+ i +"].Column"));
			headersItem.setAggregator(_ctx.stringValue("QueryDataServiceResponse.Result.Headers["+ i +"].Aggregator"));
			headersItem.setGranularity(_ctx.stringValue("QueryDataServiceResponse.Result.Headers["+ i +"].Granularity"));

			headers.add(headersItem);
		}
		result.setHeaders(headers);
		queryDataServiceResponse.setResult(result);
	 
	 	return queryDataServiceResponse;
	}
}