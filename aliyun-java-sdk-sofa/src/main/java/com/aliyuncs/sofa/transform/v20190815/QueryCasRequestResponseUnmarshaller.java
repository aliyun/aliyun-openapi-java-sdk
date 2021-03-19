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

import com.aliyuncs.sofa.model.v20190815.QueryCasRequestResponse;
import com.aliyuncs.sofa.model.v20190815.QueryCasRequestResponse.DataItem;
import com.aliyuncs.sofa.model.v20190815.QueryCasRequestResponse.DataItem.TasksItem;
import com.aliyuncs.sofa.model.v20190815.QueryCasRequestResponse.DataItem.TasksItem.Request;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryCasRequestResponseUnmarshaller {

	public static QueryCasRequestResponse unmarshall(QueryCasRequestResponse queryCasRequestResponse, UnmarshallerContext _ctx) {
		
		queryCasRequestResponse.setRequestId(_ctx.stringValue("QueryCasRequestResponse.RequestId"));
		queryCasRequestResponse.setResultCode(_ctx.stringValue("QueryCasRequestResponse.ResultCode"));
		queryCasRequestResponse.setResultMessage(_ctx.stringValue("QueryCasRequestResponse.ResultMessage"));
		queryCasRequestResponse.setTotalCount(_ctx.longValue("QueryCasRequestResponse.TotalCount"));
		queryCasRequestResponse.setCurrentPage(_ctx.longValue("QueryCasRequestResponse.CurrentPage"));
		queryCasRequestResponse.setPageSize(_ctx.longValue("QueryCasRequestResponse.PageSize"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryCasRequestResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setContext(_ctx.stringValue("QueryCasRequestResponse.Data["+ i +"].Context"));
			dataItem.setId(_ctx.stringValue("QueryCasRequestResponse.Data["+ i +"].Id"));
			dataItem.setOperator(_ctx.stringValue("QueryCasRequestResponse.Data["+ i +"].Operator"));
			dataItem.setOperatorName(_ctx.stringValue("QueryCasRequestResponse.Data["+ i +"].OperatorName"));
			dataItem.setOperatorType(_ctx.stringValue("QueryCasRequestResponse.Data["+ i +"].OperatorType"));
			dataItem.setStatus(_ctx.stringValue("QueryCasRequestResponse.Data["+ i +"].Status"));
			dataItem.setToken(_ctx.stringValue("QueryCasRequestResponse.Data["+ i +"].Token"));
			dataItem.setType(_ctx.stringValue("QueryCasRequestResponse.Data["+ i +"].Type"));
			dataItem.setUtcCreate(_ctx.stringValue("QueryCasRequestResponse.Data["+ i +"].UtcCreate"));
			dataItem.setUtcModified(_ctx.stringValue("QueryCasRequestResponse.Data["+ i +"].UtcModified"));

			List<TasksItem> tasks = new ArrayList<TasksItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryCasRequestResponse.Data["+ i +"].Tasks.Length"); j++) {
				TasksItem tasksItem = new TasksItem();
				tasksItem.setContext(_ctx.stringValue("QueryCasRequestResponse.Data["+ i +"].Tasks["+ j +"].Context"));
				tasksItem.setExecutionTimes(_ctx.longValue("QueryCasRequestResponse.Data["+ i +"].Tasks["+ j +"].ExecutionTimes"));
				tasksItem.setId(_ctx.stringValue("QueryCasRequestResponse.Data["+ i +"].Tasks["+ j +"].Id"));
				tasksItem.setResourceId(_ctx.stringValue("QueryCasRequestResponse.Data["+ i +"].Tasks["+ j +"].ResourceId"));
				tasksItem.setResourceType(_ctx.stringValue("QueryCasRequestResponse.Data["+ i +"].Tasks["+ j +"].ResourceType"));
				tasksItem.setStatus(_ctx.stringValue("QueryCasRequestResponse.Data["+ i +"].Tasks["+ j +"].Status"));
				tasksItem.setUtcCreate(_ctx.stringValue("QueryCasRequestResponse.Data["+ i +"].Tasks["+ j +"].UtcCreate"));
				tasksItem.setUtcModified(_ctx.stringValue("QueryCasRequestResponse.Data["+ i +"].Tasks["+ j +"].UtcModified"));
				tasksItem.setWorkspaceId(_ctx.stringValue("QueryCasRequestResponse.Data["+ i +"].Tasks["+ j +"].WorkspaceId"));

				Request request = new Request();
				request.setId(_ctx.stringValue("QueryCasRequestResponse.Data["+ i +"].Tasks["+ j +"].Request.Id"));
				request.setOperator(_ctx.stringValue("QueryCasRequestResponse.Data["+ i +"].Tasks["+ j +"].Request.Operator"));
				request.setToken(_ctx.stringValue("QueryCasRequestResponse.Data["+ i +"].Tasks["+ j +"].Request.Token"));
				request.setType(_ctx.stringValue("QueryCasRequestResponse.Data["+ i +"].Tasks["+ j +"].Request.Type"));
				request.setStatus(_ctx.stringValue("QueryCasRequestResponse.Data["+ i +"].Tasks["+ j +"].Request.Status"));
				tasksItem.setRequest(request);

				tasks.add(tasksItem);
			}
			dataItem.setTasks(tasks);

			data.add(dataItem);
		}
		queryCasRequestResponse.setData(data);
	 
	 	return queryCasRequestResponse;
	}
}