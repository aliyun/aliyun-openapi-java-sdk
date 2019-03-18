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

package com.aliyuncs.trademark.transform.v20180724;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.trademark.model.v20180724.QueryTaskListResponse;
import com.aliyuncs.trademark.model.v20180724.QueryTaskListResponse.TaskList;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTaskListResponseUnmarshaller {

	public static QueryTaskListResponse unmarshall(QueryTaskListResponse queryTaskListResponse, UnmarshallerContext context) {
		
		queryTaskListResponse.setRequestId(context.stringValue("QueryTaskListResponse.RequestId"));

		List<TaskList> data = new ArrayList<TaskList>();
		for (int i = 0; i < context.lengthValue("QueryTaskListResponse.Data.Length"); i++) {
			TaskList taskList = new TaskList();
			taskList.setTaskStatus(context.stringValue("QueryTaskListResponse.Data["+ i +"].TaskStatus"));
			taskList.setTaskType(context.stringValue("QueryTaskListResponse.Data["+ i +"].TaskType"));
			taskList.setErrMsg(context.stringValue("QueryTaskListResponse.Data["+ i +"].ErrMsg"));
			taskList.setResult(context.stringValue("QueryTaskListResponse.Data["+ i +"].Result"));

			data.add(taskList);
		}
		queryTaskListResponse.setData(data);
	 
	 	return queryTaskListResponse;
	}
}