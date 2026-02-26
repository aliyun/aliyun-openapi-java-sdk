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

package com.aliyuncs.viapi.transform.v20230117;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.viapi.model.v20230117.QueryAsyncJobListResponse;
import com.aliyuncs.viapi.model.v20230117.QueryAsyncJobListResponse.Data;
import com.aliyuncs.viapi.model.v20230117.QueryAsyncJobListResponse.Data.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAsyncJobListResponseUnmarshaller {

	public static QueryAsyncJobListResponse unmarshall(QueryAsyncJobListResponse queryAsyncJobListResponse, UnmarshallerContext _ctx) {
		
		queryAsyncJobListResponse.setRequestId(_ctx.stringValue("QueryAsyncJobListResponse.RequestId"));
		queryAsyncJobListResponse.setMessage(_ctx.stringValue("QueryAsyncJobListResponse.Message"));
		queryAsyncJobListResponse.setSuccess(_ctx.booleanValue("QueryAsyncJobListResponse.Success"));
		queryAsyncJobListResponse.setHttpCode(_ctx.stringValue("QueryAsyncJobListResponse.HttpCode"));

		Data data = new Data();
		data.setCurrentPage(_ctx.integerValue("QueryAsyncJobListResponse.Data.CurrentPage"));
		data.setPageSize(_ctx.integerValue("QueryAsyncJobListResponse.Data.PageSize"));
		data.setTotalPage(_ctx.integerValue("QueryAsyncJobListResponse.Data.TotalPage"));
		data.setTotalRecord(_ctx.integerValue("QueryAsyncJobListResponse.Data.TotalRecord"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryAsyncJobListResponse.Data.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setCallerParentId(_ctx.stringValue("QueryAsyncJobListResponse.Data.Result["+ i +"].CallerParentId"));
			resultItem.setEndTime(_ctx.stringValue("QueryAsyncJobListResponse.Data.Result["+ i +"].EndTime"));
			resultItem.setGmtCreate(_ctx.stringValue("QueryAsyncJobListResponse.Data.Result["+ i +"].GmtCreate"));
			resultItem.setJobId(_ctx.stringValue("QueryAsyncJobListResponse.Data.Result["+ i +"].JobId"));
			resultItem.setPopApiName(_ctx.stringValue("QueryAsyncJobListResponse.Data.Result["+ i +"].PopApiName"));
			resultItem.setPopProduct(_ctx.stringValue("QueryAsyncJobListResponse.Data.Result["+ i +"].PopProduct"));
			resultItem.setStartTime(_ctx.stringValue("QueryAsyncJobListResponse.Data.Result["+ i +"].StartTime"));
			resultItem.setStatus(_ctx.stringValue("QueryAsyncJobListResponse.Data.Result["+ i +"].Status"));

			result.add(resultItem);
		}
		data.setResult(result);
		queryAsyncJobListResponse.setData(data);
	 
	 	return queryAsyncJobListResponse;
	}
}