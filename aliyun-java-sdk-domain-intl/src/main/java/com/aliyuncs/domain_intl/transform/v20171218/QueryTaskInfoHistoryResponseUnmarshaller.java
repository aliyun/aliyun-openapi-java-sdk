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

package com.aliyuncs.domain_intl.transform.v20171218;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.domain_intl.model.v20171218.QueryTaskInfoHistoryResponse;
import com.aliyuncs.domain_intl.model.v20171218.QueryTaskInfoHistoryResponse.CurrentPageCursor;
import com.aliyuncs.domain_intl.model.v20171218.QueryTaskInfoHistoryResponse.NextPageCursor;
import com.aliyuncs.domain_intl.model.v20171218.QueryTaskInfoHistoryResponse.PrePageCursor;
import com.aliyuncs.domain_intl.model.v20171218.QueryTaskInfoHistoryResponse.TaskInfoHistory;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTaskInfoHistoryResponseUnmarshaller {

	public static QueryTaskInfoHistoryResponse unmarshall(QueryTaskInfoHistoryResponse queryTaskInfoHistoryResponse, UnmarshallerContext _ctx) {
		
		queryTaskInfoHistoryResponse.setRequestId(_ctx.stringValue("QueryTaskInfoHistoryResponse.RequestId"));
		queryTaskInfoHistoryResponse.setPageSize(_ctx.integerValue("QueryTaskInfoHistoryResponse.PageSize"));

		CurrentPageCursor currentPageCursor = new CurrentPageCursor();
		currentPageCursor.setTaskType(_ctx.stringValue("QueryTaskInfoHistoryResponse.CurrentPageCursor.TaskType"));
		currentPageCursor.setTaskNo(_ctx.stringValue("QueryTaskInfoHistoryResponse.CurrentPageCursor.TaskNo"));
		currentPageCursor.setTaskStatusCode(_ctx.integerValue("QueryTaskInfoHistoryResponse.CurrentPageCursor.TaskStatusCode"));
		currentPageCursor.setTaskStatus(_ctx.stringValue("QueryTaskInfoHistoryResponse.CurrentPageCursor.TaskStatus"));
		currentPageCursor.setTaskTypeDescription(_ctx.stringValue("QueryTaskInfoHistoryResponse.CurrentPageCursor.TaskTypeDescription"));
		currentPageCursor.setTaskNum(_ctx.integerValue("QueryTaskInfoHistoryResponse.CurrentPageCursor.TaskNum"));
		currentPageCursor.setCreateTime(_ctx.stringValue("QueryTaskInfoHistoryResponse.CurrentPageCursor.CreateTime"));
		currentPageCursor.setCreateTimeLong(_ctx.longValue("QueryTaskInfoHistoryResponse.CurrentPageCursor.CreateTimeLong"));
		currentPageCursor.setClientip(_ctx.stringValue("QueryTaskInfoHistoryResponse.CurrentPageCursor.Clientip"));
		queryTaskInfoHistoryResponse.setCurrentPageCursor(currentPageCursor);

		PrePageCursor prePageCursor = new PrePageCursor();
		prePageCursor.setTaskType(_ctx.stringValue("QueryTaskInfoHistoryResponse.PrePageCursor.TaskType"));
		prePageCursor.setTaskNo(_ctx.stringValue("QueryTaskInfoHistoryResponse.PrePageCursor.TaskNo"));
		prePageCursor.setTaskStatusCode(_ctx.integerValue("QueryTaskInfoHistoryResponse.PrePageCursor.TaskStatusCode"));
		prePageCursor.setTaskStatus(_ctx.stringValue("QueryTaskInfoHistoryResponse.PrePageCursor.TaskStatus"));
		prePageCursor.setTaskTypeDescription(_ctx.stringValue("QueryTaskInfoHistoryResponse.PrePageCursor.TaskTypeDescription"));
		prePageCursor.setTaskNum(_ctx.integerValue("QueryTaskInfoHistoryResponse.PrePageCursor.TaskNum"));
		prePageCursor.setCreateTime(_ctx.stringValue("QueryTaskInfoHistoryResponse.PrePageCursor.CreateTime"));
		prePageCursor.setCreateTimeLong(_ctx.longValue("QueryTaskInfoHistoryResponse.PrePageCursor.CreateTimeLong"));
		prePageCursor.setClientip(_ctx.stringValue("QueryTaskInfoHistoryResponse.PrePageCursor.Clientip"));
		queryTaskInfoHistoryResponse.setPrePageCursor(prePageCursor);

		NextPageCursor nextPageCursor = new NextPageCursor();
		nextPageCursor.setTaskType(_ctx.stringValue("QueryTaskInfoHistoryResponse.NextPageCursor.TaskType"));
		nextPageCursor.setTaskNo(_ctx.stringValue("QueryTaskInfoHistoryResponse.NextPageCursor.TaskNo"));
		nextPageCursor.setTaskStatusCode(_ctx.integerValue("QueryTaskInfoHistoryResponse.NextPageCursor.TaskStatusCode"));
		nextPageCursor.setTaskStatus(_ctx.stringValue("QueryTaskInfoHistoryResponse.NextPageCursor.TaskStatus"));
		nextPageCursor.setTaskTypeDescription(_ctx.stringValue("QueryTaskInfoHistoryResponse.NextPageCursor.TaskTypeDescription"));
		nextPageCursor.setTaskNum(_ctx.integerValue("QueryTaskInfoHistoryResponse.NextPageCursor.TaskNum"));
		nextPageCursor.setCreateTime(_ctx.stringValue("QueryTaskInfoHistoryResponse.NextPageCursor.CreateTime"));
		nextPageCursor.setCreateTimeLong(_ctx.longValue("QueryTaskInfoHistoryResponse.NextPageCursor.CreateTimeLong"));
		nextPageCursor.setClientip(_ctx.stringValue("QueryTaskInfoHistoryResponse.NextPageCursor.Clientip"));
		queryTaskInfoHistoryResponse.setNextPageCursor(nextPageCursor);

		List<TaskInfoHistory> objects = new ArrayList<TaskInfoHistory>();
		for (int i = 0; i < _ctx.lengthValue("QueryTaskInfoHistoryResponse.Objects.Length"); i++) {
			TaskInfoHistory taskInfoHistory = new TaskInfoHistory();
			taskInfoHistory.setTaskType(_ctx.stringValue("QueryTaskInfoHistoryResponse.Objects["+ i +"].TaskType"));
			taskInfoHistory.setTaskNo(_ctx.stringValue("QueryTaskInfoHistoryResponse.Objects["+ i +"].TaskNo"));
			taskInfoHistory.setTaskStatusCode(_ctx.integerValue("QueryTaskInfoHistoryResponse.Objects["+ i +"].TaskStatusCode"));
			taskInfoHistory.setTaskStatus(_ctx.stringValue("QueryTaskInfoHistoryResponse.Objects["+ i +"].TaskStatus"));
			taskInfoHistory.setTaskTypeDescription(_ctx.stringValue("QueryTaskInfoHistoryResponse.Objects["+ i +"].TaskTypeDescription"));
			taskInfoHistory.setTaskNum(_ctx.integerValue("QueryTaskInfoHistoryResponse.Objects["+ i +"].TaskNum"));
			taskInfoHistory.setCreateTime(_ctx.stringValue("QueryTaskInfoHistoryResponse.Objects["+ i +"].CreateTime"));
			taskInfoHistory.setCreateTimeLong(_ctx.longValue("QueryTaskInfoHistoryResponse.Objects["+ i +"].CreateTimeLong"));
			taskInfoHistory.setClientip(_ctx.stringValue("QueryTaskInfoHistoryResponse.Objects["+ i +"].Clientip"));

			objects.add(taskInfoHistory);
		}
		queryTaskInfoHistoryResponse.setObjects(objects);
	 
	 	return queryTaskInfoHistoryResponse;
	}
}