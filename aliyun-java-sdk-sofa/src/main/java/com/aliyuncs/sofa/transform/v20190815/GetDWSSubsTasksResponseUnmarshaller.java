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

import com.aliyuncs.sofa.model.v20190815.GetDWSSubsTasksResponse;
import com.aliyuncs.sofa.model.v20190815.GetDWSSubsTasksResponse.Data;
import com.aliyuncs.sofa.model.v20190815.GetDWSSubsTasksResponse.Data.TasksItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDWSSubsTasksResponseUnmarshaller {

	public static GetDWSSubsTasksResponse unmarshall(GetDWSSubsTasksResponse getDWSSubsTasksResponse, UnmarshallerContext _ctx) {
		
		getDWSSubsTasksResponse.setRequestId(_ctx.stringValue("GetDWSSubsTasksResponse.RequestId"));
		getDWSSubsTasksResponse.setResultCode(_ctx.stringValue("GetDWSSubsTasksResponse.ResultCode"));
		getDWSSubsTasksResponse.setResultMessage(_ctx.stringValue("GetDWSSubsTasksResponse.ResultMessage"));

		Data data = new Data();
		data.setCurrentPageCount(_ctx.longValue("GetDWSSubsTasksResponse.Data.CurrentPageCount"));
		data.setTotalCount(_ctx.longValue("GetDWSSubsTasksResponse.Data.TotalCount"));

		List<TasksItem> tasks = new ArrayList<TasksItem>();
		for (int i = 0; i < _ctx.lengthValue("GetDWSSubsTasksResponse.Data.Tasks.Length"); i++) {
			TasksItem tasksItem = new TasksItem();
			tasksItem.setClusterUrl(_ctx.stringValue("GetDWSSubsTasksResponse.Data.Tasks["+ i +"].ClusterUrl"));
			tasksItem.setComment(_ctx.stringValue("GetDWSSubsTasksResponse.Data.Tasks["+ i +"].Comment"));
			tasksItem.setConnectionString(_ctx.stringValue("GetDWSSubsTasksResponse.Data.Tasks["+ i +"].ConnectionString"));
			tasksItem.setConsumer(_ctx.stringValue("GetDWSSubsTasksResponse.Data.Tasks["+ i +"].Consumer"));
			tasksItem.setGmtCreate(_ctx.longValue("GetDWSSubsTasksResponse.Data.Tasks["+ i +"].GmtCreate"));
			tasksItem.setGmtModify(_ctx.longValue("GetDWSSubsTasksResponse.Data.Tasks["+ i +"].GmtModify"));
			tasksItem.setGroup(_ctx.stringValue("GetDWSSubsTasksResponse.Data.Tasks["+ i +"].Group"));
			tasksItem.setId(_ctx.longValue("GetDWSSubsTasksResponse.Data.Tasks["+ i +"].Id"));
			tasksItem.setName(_ctx.stringValue("GetDWSSubsTasksResponse.Data.Tasks["+ i +"].Name"));
			tasksItem.setStatus(_ctx.stringValue("GetDWSSubsTasksResponse.Data.Tasks["+ i +"].Status"));
			tasksItem.setTableId(_ctx.stringValue("GetDWSSubsTasksResponse.Data.Tasks["+ i +"].TableId"));

			tasks.add(tasksItem);
		}
		data.setTasks(tasks);
		getDWSSubsTasksResponse.setData(data);
	 
	 	return getDWSSubsTasksResponse;
	}
}