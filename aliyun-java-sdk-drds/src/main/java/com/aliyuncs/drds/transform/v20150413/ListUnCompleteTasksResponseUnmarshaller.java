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

package com.aliyuncs.drds.transform.v20150413;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.drds.model.v20150413.ListUnCompleteTasksResponse;
import com.aliyuncs.drds.model.v20150413.ListUnCompleteTasksResponse.Task;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUnCompleteTasksResponseUnmarshaller {

	public static ListUnCompleteTasksResponse unmarshall(ListUnCompleteTasksResponse listUnCompleteTasksResponse, UnmarshallerContext _ctx) {
		

		List<Task> data = new ArrayList<Task>();
		for (int i = 0; i < _ctx.lengthValue("ListUnCompleteTasksResponse.Data.Length"); i++) {
			Task task = new Task();
			task.setRequestId(_ctx.stringValue("ListUnCompleteTasksResponse.Data["+ i +"].RequestId"));
			task.setTargetId(_ctx.stringValue("ListUnCompleteTasksResponse.Data["+ i +"].TargetId"));
			task.setTaskDetail(_ctx.stringValue("ListUnCompleteTasksResponse.Data["+ i +"].TaskDetail"));
			task.setTaskStatus(_ctx.integerValue("ListUnCompleteTasksResponse.Data["+ i +"].taskStatus"));
			task.setTaskPhase(_ctx.stringValue("ListUnCompleteTasksResponse.Data["+ i +"].TaskPhase"));
			task.setTaskType(_ctx.integerValue("ListUnCompleteTasksResponse.Data["+ i +"].TaskType"));
			task.setTaskName(_ctx.stringValue("ListUnCompleteTasksResponse.Data["+ i +"].TaskName"));
			task.setGmtCreate(_ctx.longValue("ListUnCompleteTasksResponse.Data["+ i +"].gmtCreate"));
			task.setAllowCancel(_ctx.stringValue("ListUnCompleteTasksResponse.Data["+ i +"].AllowCancel"));
			task.setErrMsg(_ctx.stringValue("ListUnCompleteTasksResponse.Data["+ i +"].ErrMsg"));

			data.add(task);
		}
		listUnCompleteTasksResponse.setData(data);
	 
	 	return listUnCompleteTasksResponse;
	}
}