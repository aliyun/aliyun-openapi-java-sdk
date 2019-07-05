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

package com.aliyuncs.domain.transform.v20180129;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.domain.model.v20180129.QueryTaskListResponse;
import com.aliyuncs.domain.model.v20180129.QueryTaskListResponse.TaskInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTaskListResponseUnmarshaller {

	public static QueryTaskListResponse unmarshall(QueryTaskListResponse queryTaskListResponse, UnmarshallerContext _ctx) {
		
		queryTaskListResponse.setRequestId(_ctx.stringValue("QueryTaskListResponse.RequestId"));
		queryTaskListResponse.setTotalItemNum(_ctx.integerValue("QueryTaskListResponse.TotalItemNum"));
		queryTaskListResponse.setCurrentPageNum(_ctx.integerValue("QueryTaskListResponse.CurrentPageNum"));
		queryTaskListResponse.setTotalPageNum(_ctx.integerValue("QueryTaskListResponse.TotalPageNum"));
		queryTaskListResponse.setPageSize(_ctx.integerValue("QueryTaskListResponse.PageSize"));
		queryTaskListResponse.setPrePage(_ctx.booleanValue("QueryTaskListResponse.PrePage"));
		queryTaskListResponse.setNextPage(_ctx.booleanValue("QueryTaskListResponse.NextPage"));

		List<TaskInfo> data = new ArrayList<TaskInfo>();
		for (int i = 0; i < _ctx.lengthValue("QueryTaskListResponse.Data.Length"); i++) {
			TaskInfo taskInfo = new TaskInfo();
			taskInfo.setTaskType(_ctx.stringValue("QueryTaskListResponse.Data["+ i +"].TaskType"));
			taskInfo.setTaskNum(_ctx.integerValue("QueryTaskListResponse.Data["+ i +"].TaskNum"));
			taskInfo.setTaskStatus(_ctx.stringValue("QueryTaskListResponse.Data["+ i +"].TaskStatus"));
			taskInfo.setCreateTime(_ctx.stringValue("QueryTaskListResponse.Data["+ i +"].CreateTime"));
			taskInfo.setClientip(_ctx.stringValue("QueryTaskListResponse.Data["+ i +"].Clientip"));
			taskInfo.setTaskNo(_ctx.stringValue("QueryTaskListResponse.Data["+ i +"].TaskNo"));
			taskInfo.setTaskStatusCode(_ctx.integerValue("QueryTaskListResponse.Data["+ i +"].TaskStatusCode"));
			taskInfo.setTaskTypeDescription(_ctx.stringValue("QueryTaskListResponse.Data["+ i +"].TaskTypeDescription"));
			taskInfo.setTaskCancelStatus(_ctx.stringValue("QueryTaskListResponse.Data["+ i +"].TaskCancelStatus"));
			taskInfo.setTaskCancelStatusCode(_ctx.integerValue("QueryTaskListResponse.Data["+ i +"].TaskCancelStatusCode"));

			data.add(taskInfo);
		}
		queryTaskListResponse.setData(data);
	 
	 	return queryTaskListResponse;
	}
}