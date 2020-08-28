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

package com.aliyuncs.ehpc.transform.v20180412;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ehpc.model.v20180412.ListTasksResponse;
import com.aliyuncs.ehpc.model.v20180412.ListTasksResponse.TaskInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTasksResponseUnmarshaller {

	public static ListTasksResponse unmarshall(ListTasksResponse listTasksResponse, UnmarshallerContext _ctx) {
		
		listTasksResponse.setRequestId(_ctx.stringValue("ListTasksResponse.RequestId"));
		listTasksResponse.setTotalCount(_ctx.integerValue("ListTasksResponse.TotalCount"));
		listTasksResponse.setPageNumber(_ctx.integerValue("ListTasksResponse.PageNumber"));
		listTasksResponse.setPageSize(_ctx.integerValue("ListTasksResponse.PageSize"));

		List<TaskInfo> tasks = new ArrayList<TaskInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListTasksResponse.Tasks.Length"); i++) {
			TaskInfo taskInfo = new TaskInfo();
			taskInfo.setTaskId(_ctx.stringValue("ListTasksResponse.Tasks["+ i +"].TaskId"));
			taskInfo.setTaskType(_ctx.stringValue("ListTasksResponse.Tasks["+ i +"].TaskType"));
			taskInfo.setClusterId(_ctx.stringValue("ListTasksResponse.Tasks["+ i +"].ClusterId"));
			taskInfo.setRequest(_ctx.stringValue("ListTasksResponse.Tasks["+ i +"].Request"));
			taskInfo.setStatus(_ctx.stringValue("ListTasksResponse.Tasks["+ i +"].Status"));
			taskInfo.setCurrentStep(_ctx.integerValue("ListTasksResponse.Tasks["+ i +"].CurrentStep"));
			taskInfo.setTotalSteps(_ctx.integerValue("ListTasksResponse.Tasks["+ i +"].TotalSteps"));
			taskInfo.setResult(_ctx.stringValue("ListTasksResponse.Tasks["+ i +"].Result"));
			taskInfo.setErrors(_ctx.stringValue("ListTasksResponse.Tasks["+ i +"].Errors"));

			tasks.add(taskInfo);
		}
		listTasksResponse.setTasks(tasks);
	 
	 	return listTasksResponse;
	}
}