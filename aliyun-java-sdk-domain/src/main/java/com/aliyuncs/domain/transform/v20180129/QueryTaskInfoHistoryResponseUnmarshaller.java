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

import com.aliyuncs.domain.model.v20180129.QueryTaskInfoHistoryResponse;
import com.aliyuncs.domain.model.v20180129.QueryTaskInfoHistoryResponse.CurrentPageCursor;
import com.aliyuncs.domain.model.v20180129.QueryTaskInfoHistoryResponse.NextPageCursor;
import com.aliyuncs.domain.model.v20180129.QueryTaskInfoHistoryResponse.PrePageCursor;
import com.aliyuncs.domain.model.v20180129.QueryTaskInfoHistoryResponse.TaskInfoHistory;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTaskInfoHistoryResponseUnmarshaller {

	public static QueryTaskInfoHistoryResponse unmarshall(QueryTaskInfoHistoryResponse queryTaskInfoHistoryResponse, UnmarshallerContext _ctx) {
		
		queryTaskInfoHistoryResponse.setRequestId(_ctx.stringValue("QueryTaskInfoHistoryResponse.RequestId"));
		queryTaskInfoHistoryResponse.setPageSize(_ctx.integerValue("QueryTaskInfoHistoryResponse.PageSize"));

		CurrentPageCursor currentPageCursor = new CurrentPageCursor();
		currentPageCursor.setTaskType(_ctx.stringValue("QueryTaskInfoHistoryResponse.CurrentPageCursor.TaskType"));
		currentPageCursor.setTaskNum(_ctx.integerValue("QueryTaskInfoHistoryResponse.CurrentPageCursor.TaskNum"));
		currentPageCursor.setTaskStatus(_ctx.stringValue("QueryTaskInfoHistoryResponse.CurrentPageCursor.TaskStatus"));
		currentPageCursor.setCreateTime(_ctx.stringValue("QueryTaskInfoHistoryResponse.CurrentPageCursor.CreateTime"));
		currentPageCursor.setClientip(_ctx.stringValue("QueryTaskInfoHistoryResponse.CurrentPageCursor.Clientip"));
		currentPageCursor.setTaskNo(_ctx.stringValue("QueryTaskInfoHistoryResponse.CurrentPageCursor.TaskNo"));
		currentPageCursor.setCreateTimeLong(_ctx.longValue("QueryTaskInfoHistoryResponse.CurrentPageCursor.CreateTimeLong"));
		currentPageCursor.setTaskStatusCode(_ctx.integerValue("QueryTaskInfoHistoryResponse.CurrentPageCursor.TaskStatusCode"));
		currentPageCursor.setTaskTypeDescription(_ctx.stringValue("QueryTaskInfoHistoryResponse.CurrentPageCursor.TaskTypeDescription"));
		queryTaskInfoHistoryResponse.setCurrentPageCursor(currentPageCursor);

		NextPageCursor nextPageCursor = new NextPageCursor();
		nextPageCursor.setTaskType(_ctx.stringValue("QueryTaskInfoHistoryResponse.NextPageCursor.TaskType"));
		nextPageCursor.setTaskNum(_ctx.integerValue("QueryTaskInfoHistoryResponse.NextPageCursor.TaskNum"));
		nextPageCursor.setTaskStatus(_ctx.stringValue("QueryTaskInfoHistoryResponse.NextPageCursor.TaskStatus"));
		nextPageCursor.setCreateTime(_ctx.stringValue("QueryTaskInfoHistoryResponse.NextPageCursor.CreateTime"));
		nextPageCursor.setClientip(_ctx.stringValue("QueryTaskInfoHistoryResponse.NextPageCursor.Clientip"));
		nextPageCursor.setTaskNo(_ctx.stringValue("QueryTaskInfoHistoryResponse.NextPageCursor.TaskNo"));
		nextPageCursor.setCreateTimeLong(_ctx.longValue("QueryTaskInfoHistoryResponse.NextPageCursor.CreateTimeLong"));
		nextPageCursor.setTaskStatusCode(_ctx.integerValue("QueryTaskInfoHistoryResponse.NextPageCursor.TaskStatusCode"));
		nextPageCursor.setTaskTypeDescription(_ctx.stringValue("QueryTaskInfoHistoryResponse.NextPageCursor.TaskTypeDescription"));
		queryTaskInfoHistoryResponse.setNextPageCursor(nextPageCursor);

		PrePageCursor prePageCursor = new PrePageCursor();
		prePageCursor.setTaskType(_ctx.stringValue("QueryTaskInfoHistoryResponse.PrePageCursor.TaskType"));
		prePageCursor.setTaskNum(_ctx.integerValue("QueryTaskInfoHistoryResponse.PrePageCursor.TaskNum"));
		prePageCursor.setTaskStatus(_ctx.stringValue("QueryTaskInfoHistoryResponse.PrePageCursor.TaskStatus"));
		prePageCursor.setCreateTime(_ctx.stringValue("QueryTaskInfoHistoryResponse.PrePageCursor.CreateTime"));
		prePageCursor.setClientip(_ctx.stringValue("QueryTaskInfoHistoryResponse.PrePageCursor.Clientip"));
		prePageCursor.setTaskNo(_ctx.stringValue("QueryTaskInfoHistoryResponse.PrePageCursor.TaskNo"));
		prePageCursor.setCreateTimeLong(_ctx.longValue("QueryTaskInfoHistoryResponse.PrePageCursor.CreateTimeLong"));
		prePageCursor.setTaskStatusCode(_ctx.integerValue("QueryTaskInfoHistoryResponse.PrePageCursor.TaskStatusCode"));
		prePageCursor.setTaskTypeDescription(_ctx.stringValue("QueryTaskInfoHistoryResponse.PrePageCursor.TaskTypeDescription"));
		queryTaskInfoHistoryResponse.setPrePageCursor(prePageCursor);

		List<TaskInfoHistory> objects = new ArrayList<TaskInfoHistory>();
		for (int i = 0; i < _ctx.lengthValue("QueryTaskInfoHistoryResponse.Objects.Length"); i++) {
			TaskInfoHistory taskInfoHistory = new TaskInfoHistory();
			taskInfoHistory.setTaskType(_ctx.stringValue("QueryTaskInfoHistoryResponse.Objects["+ i +"].TaskType"));
			taskInfoHistory.setTaskNum(_ctx.integerValue("QueryTaskInfoHistoryResponse.Objects["+ i +"].TaskNum"));
			taskInfoHistory.setTaskStatus(_ctx.stringValue("QueryTaskInfoHistoryResponse.Objects["+ i +"].TaskStatus"));
			taskInfoHistory.setCreateTime(_ctx.stringValue("QueryTaskInfoHistoryResponse.Objects["+ i +"].CreateTime"));
			taskInfoHistory.setClientip(_ctx.stringValue("QueryTaskInfoHistoryResponse.Objects["+ i +"].Clientip"));
			taskInfoHistory.setTaskNo(_ctx.stringValue("QueryTaskInfoHistoryResponse.Objects["+ i +"].TaskNo"));
			taskInfoHistory.setCreateTimeLong(_ctx.longValue("QueryTaskInfoHistoryResponse.Objects["+ i +"].CreateTimeLong"));
			taskInfoHistory.setTaskStatusCode(_ctx.integerValue("QueryTaskInfoHistoryResponse.Objects["+ i +"].TaskStatusCode"));
			taskInfoHistory.setTaskTypeDescription(_ctx.stringValue("QueryTaskInfoHistoryResponse.Objects["+ i +"].TaskTypeDescription"));

			objects.add(taskInfoHistory);
		}
		queryTaskInfoHistoryResponse.setObjects(objects);
	 
	 	return queryTaskInfoHistoryResponse;
	}
}