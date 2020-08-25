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

import com.aliyuncs.sofa.model.v20190815.GetCasRequestResponse;
import com.aliyuncs.sofa.model.v20190815.GetCasRequestResponse.Data;
import com.aliyuncs.sofa.model.v20190815.GetCasRequestResponse.Data.TasksItem;
import com.aliyuncs.sofa.model.v20190815.GetCasRequestResponse.Data.TasksItem.Request;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCasRequestResponseUnmarshaller {

	public static GetCasRequestResponse unmarshall(GetCasRequestResponse getCasRequestResponse, UnmarshallerContext _ctx) {
		
		getCasRequestResponse.setRequestId(_ctx.stringValue("GetCasRequestResponse.RequestId"));
		getCasRequestResponse.setResultCode(_ctx.stringValue("GetCasRequestResponse.ResultCode"));
		getCasRequestResponse.setResultMessage(_ctx.stringValue("GetCasRequestResponse.ResultMessage"));

		Data data = new Data();
		data.setContext(_ctx.stringValue("GetCasRequestResponse.Data.Context"));
		data.setId(_ctx.stringValue("GetCasRequestResponse.Data.Id"));
		data.setOperator(_ctx.stringValue("GetCasRequestResponse.Data.Operator"));
		data.setOperatorName(_ctx.stringValue("GetCasRequestResponse.Data.OperatorName"));
		data.setOperatorType(_ctx.stringValue("GetCasRequestResponse.Data.OperatorType"));
		data.setStatus(_ctx.stringValue("GetCasRequestResponse.Data.Status"));
		data.setToken(_ctx.stringValue("GetCasRequestResponse.Data.Token"));
		data.setType(_ctx.stringValue("GetCasRequestResponse.Data.Type"));
		data.setUtcCreate(_ctx.stringValue("GetCasRequestResponse.Data.UtcCreate"));
		data.setUtcModified(_ctx.stringValue("GetCasRequestResponse.Data.UtcModified"));

		List<TasksItem> tasks = new ArrayList<TasksItem>();
		for (int i = 0; i < _ctx.lengthValue("GetCasRequestResponse.Data.Tasks.Length"); i++) {
			TasksItem tasksItem = new TasksItem();
			tasksItem.setContext(_ctx.stringValue("GetCasRequestResponse.Data.Tasks["+ i +"].Context"));
			tasksItem.setExecutionTimes(_ctx.longValue("GetCasRequestResponse.Data.Tasks["+ i +"].ExecutionTimes"));
			tasksItem.setId(_ctx.stringValue("GetCasRequestResponse.Data.Tasks["+ i +"].Id"));
			tasksItem.setResourceId(_ctx.stringValue("GetCasRequestResponse.Data.Tasks["+ i +"].ResourceId"));
			tasksItem.setResourceType(_ctx.stringValue("GetCasRequestResponse.Data.Tasks["+ i +"].ResourceType"));
			tasksItem.setStatus(_ctx.stringValue("GetCasRequestResponse.Data.Tasks["+ i +"].Status"));
			tasksItem.setUtcCreate(_ctx.stringValue("GetCasRequestResponse.Data.Tasks["+ i +"].UtcCreate"));
			tasksItem.setUtcModified(_ctx.stringValue("GetCasRequestResponse.Data.Tasks["+ i +"].UtcModified"));
			tasksItem.setWorkspaceId(_ctx.stringValue("GetCasRequestResponse.Data.Tasks["+ i +"].WorkspaceId"));

			Request request = new Request();
			request.setId(_ctx.stringValue("GetCasRequestResponse.Data.Tasks["+ i +"].Request.Id"));
			request.setOperator(_ctx.stringValue("GetCasRequestResponse.Data.Tasks["+ i +"].Request.Operator"));
			request.setToken(_ctx.stringValue("GetCasRequestResponse.Data.Tasks["+ i +"].Request.Token"));
			tasksItem.setRequest(request);

			tasks.add(tasksItem);
		}
		data.setTasks(tasks);
		getCasRequestResponse.setData(data);
	 
	 	return getCasRequestResponse;
	}
}