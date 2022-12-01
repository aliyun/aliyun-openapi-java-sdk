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

package com.aliyuncs.opensearch.transform.v20171225;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.opensearch.model.v20171225.ListFunctionTasksResponse;
import com.aliyuncs.opensearch.model.v20171225.ListFunctionTasksResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFunctionTasksResponseUnmarshaller {

	public static ListFunctionTasksResponse unmarshall(ListFunctionTasksResponse listFunctionTasksResponse, UnmarshallerContext _ctx) {
		
		listFunctionTasksResponse.setRequestId(_ctx.stringValue("ListFunctionTasksResponse.RequestId"));
		listFunctionTasksResponse.setStatus(_ctx.stringValue("ListFunctionTasksResponse.Status"));
		listFunctionTasksResponse.setHttpCode(_ctx.longValue("ListFunctionTasksResponse.HttpCode"));
		listFunctionTasksResponse.setTotalCount(_ctx.longValue("ListFunctionTasksResponse.TotalCount"));
		listFunctionTasksResponse.setMessage(_ctx.stringValue("ListFunctionTasksResponse.Message"));
		listFunctionTasksResponse.setCode(_ctx.stringValue("ListFunctionTasksResponse.Code"));
		listFunctionTasksResponse.setLatency(_ctx.longValue("ListFunctionTasksResponse.Latency"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListFunctionTasksResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setEndTime(_ctx.longValue("ListFunctionTasksResponse.Result["+ i +"].EndTime"));
			resultItem.setExtendInfo(_ctx.stringValue("ListFunctionTasksResponse.Result["+ i +"].ExtendInfo"));
			resultItem.setFunctionName(_ctx.stringValue("ListFunctionTasksResponse.Result["+ i +"].FunctionName"));
			resultItem.setProgress(_ctx.longValue("ListFunctionTasksResponse.Result["+ i +"].Progress"));
			resultItem.setRunId(_ctx.stringValue("ListFunctionTasksResponse.Result["+ i +"].RunId"));
			resultItem.setStartTime(_ctx.longValue("ListFunctionTasksResponse.Result["+ i +"].StartTime"));
			resultItem.setStatus(_ctx.stringValue("ListFunctionTasksResponse.Result["+ i +"].Status"));
			resultItem.setGeneration(_ctx.stringValue("ListFunctionTasksResponse.Result["+ i +"].Generation"));

			result.add(resultItem);
		}
		listFunctionTasksResponse.setResult(result);
	 
	 	return listFunctionTasksResponse;
	}
}