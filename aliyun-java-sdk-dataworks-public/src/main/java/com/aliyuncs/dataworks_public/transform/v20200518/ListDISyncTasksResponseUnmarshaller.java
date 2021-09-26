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

package com.aliyuncs.dataworks_public.transform.v20200518;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20200518.ListDISyncTasksResponse;
import com.aliyuncs.dataworks_public.model.v20200518.ListDISyncTasksResponse.TaskList;
import com.aliyuncs.dataworks_public.model.v20200518.ListDISyncTasksResponse.TaskList.RealTimeSolutionListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDISyncTasksResponseUnmarshaller {

	public static ListDISyncTasksResponse unmarshall(ListDISyncTasksResponse listDISyncTasksResponse, UnmarshallerContext _ctx) {
		
		listDISyncTasksResponse.setRequestId(_ctx.stringValue("ListDISyncTasksResponse.RequestId"));
		listDISyncTasksResponse.setSuccess(_ctx.booleanValue("ListDISyncTasksResponse.Success"));

		TaskList taskList = new TaskList();
		taskList.setPageNumber(_ctx.integerValue("ListDISyncTasksResponse.TaskList.PageNumber"));
		taskList.setPageSize(_ctx.integerValue("ListDISyncTasksResponse.TaskList.PageSize"));
		taskList.setTotalCount(_ctx.integerValue("ListDISyncTasksResponse.TaskList.TotalCount"));

		List<RealTimeSolutionListItem> realTimeSolutionList = new ArrayList<RealTimeSolutionListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListDISyncTasksResponse.TaskList.RealTimeSolutionList.Length"); i++) {
			RealTimeSolutionListItem realTimeSolutionListItem = new RealTimeSolutionListItem();
			realTimeSolutionListItem.setProcessId(_ctx.longValue("ListDISyncTasksResponse.TaskList.RealTimeSolutionList["+ i +"].ProcessId"));
			realTimeSolutionListItem.setProcessName(_ctx.stringValue("ListDISyncTasksResponse.TaskList.RealTimeSolutionList["+ i +"].ProcessName"));
			realTimeSolutionListItem.setTaskStatus(_ctx.stringValue("ListDISyncTasksResponse.TaskList.RealTimeSolutionList["+ i +"].TaskStatus"));
			realTimeSolutionListItem.setTaskType(_ctx.stringValue("ListDISyncTasksResponse.TaskList.RealTimeSolutionList["+ i +"].TaskType"));
			realTimeSolutionListItem.setCreateTime(_ctx.longValue("ListDISyncTasksResponse.TaskList.RealTimeSolutionList["+ i +"].CreateTime"));

			realTimeSolutionList.add(realTimeSolutionListItem);
		}
		taskList.setRealTimeSolutionList(realTimeSolutionList);
		listDISyncTasksResponse.setTaskList(taskList);
	 
	 	return listDISyncTasksResponse;
	}
}