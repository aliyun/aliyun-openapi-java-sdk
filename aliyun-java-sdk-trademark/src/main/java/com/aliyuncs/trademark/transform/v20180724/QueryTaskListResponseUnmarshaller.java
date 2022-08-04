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

	public static QueryTaskListResponse unmarshall(QueryTaskListResponse queryTaskListResponse, UnmarshallerContext _ctx) {
		
		queryTaskListResponse.setRequestId(_ctx.stringValue("QueryTaskListResponse.RequestId"));
		queryTaskListResponse.setCurrentPageNum(_ctx.integerValue("QueryTaskListResponse.CurrentPageNum"));
		queryTaskListResponse.setTotalPageNum(_ctx.integerValue("QueryTaskListResponse.TotalPageNum"));
		queryTaskListResponse.setPageSize(_ctx.integerValue("QueryTaskListResponse.PageSize"));
		queryTaskListResponse.setTotalItemNum(_ctx.integerValue("QueryTaskListResponse.TotalItemNum"));

		List<TaskList> data = new ArrayList<TaskList>();
		for (int i = 0; i < _ctx.lengthValue("QueryTaskListResponse.Data.Length"); i++) {
			TaskList taskList = new TaskList();
			taskList.setTaskType(_ctx.stringValue("QueryTaskListResponse.Data["+ i +"].TaskType"));
			taskList.setResult(_ctx.stringValue("QueryTaskListResponse.Data["+ i +"].Result"));
			taskList.setTaskStatus(_ctx.stringValue("QueryTaskListResponse.Data["+ i +"].TaskStatus"));
			taskList.setCompleteTime(_ctx.longValue("QueryTaskListResponse.Data["+ i +"].CompleteTime"));
			taskList.setCreateTime(_ctx.longValue("QueryTaskListResponse.Data["+ i +"].CreateTime"));
			taskList.setErrMsg(_ctx.stringValue("QueryTaskListResponse.Data["+ i +"].ErrMsg"));
			taskList.setFileName(_ctx.stringValue("QueryTaskListResponse.Data["+ i +"].FileName"));

			data.add(taskList);
		}
		queryTaskListResponse.setData(data);
	 
	 	return queryTaskListResponse;
	}
}