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

import com.aliyuncs.sofa.model.v20190815.QueryCasRequestTaskResponse;
import com.aliyuncs.sofa.model.v20190815.QueryCasRequestTaskResponse.DataItem;
import com.aliyuncs.sofa.model.v20190815.QueryCasRequestTaskResponse.DataItem.Request;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryCasRequestTaskResponseUnmarshaller {

	public static QueryCasRequestTaskResponse unmarshall(QueryCasRequestTaskResponse queryCasRequestTaskResponse, UnmarshallerContext _ctx) {
		
		queryCasRequestTaskResponse.setRequestId(_ctx.stringValue("QueryCasRequestTaskResponse.RequestId"));
		queryCasRequestTaskResponse.setResultCode(_ctx.stringValue("QueryCasRequestTaskResponse.ResultCode"));
		queryCasRequestTaskResponse.setResultMessage(_ctx.stringValue("QueryCasRequestTaskResponse.ResultMessage"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryCasRequestTaskResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setContext(_ctx.stringValue("QueryCasRequestTaskResponse.Data["+ i +"].Context"));
			dataItem.setExecutionTimes(_ctx.longValue("QueryCasRequestTaskResponse.Data["+ i +"].ExecutionTimes"));
			dataItem.setId(_ctx.stringValue("QueryCasRequestTaskResponse.Data["+ i +"].Id"));
			dataItem.setResourceId(_ctx.stringValue("QueryCasRequestTaskResponse.Data["+ i +"].ResourceId"));
			dataItem.setResourceType(_ctx.stringValue("QueryCasRequestTaskResponse.Data["+ i +"].ResourceType"));
			dataItem.setStatus(_ctx.stringValue("QueryCasRequestTaskResponse.Data["+ i +"].Status"));
			dataItem.setUtcCreate(_ctx.stringValue("QueryCasRequestTaskResponse.Data["+ i +"].UtcCreate"));
			dataItem.setUtcModified(_ctx.stringValue("QueryCasRequestTaskResponse.Data["+ i +"].UtcModified"));
			dataItem.setWorkspaceId(_ctx.stringValue("QueryCasRequestTaskResponse.Data["+ i +"].WorkspaceId"));

			Request request = new Request();
			request.setId(_ctx.stringValue("QueryCasRequestTaskResponse.Data["+ i +"].Request.Id"));
			request.setOperator(_ctx.stringValue("QueryCasRequestTaskResponse.Data["+ i +"].Request.Operator"));
			request.setToken(_ctx.stringValue("QueryCasRequestTaskResponse.Data["+ i +"].Request.Token"));
			request.setType(_ctx.stringValue("QueryCasRequestTaskResponse.Data["+ i +"].Request.Type"));
			dataItem.setRequest(request);

			data.add(dataItem);
		}
		queryCasRequestTaskResponse.setData(data);
	 
	 	return queryCasRequestTaskResponse;
	}
}