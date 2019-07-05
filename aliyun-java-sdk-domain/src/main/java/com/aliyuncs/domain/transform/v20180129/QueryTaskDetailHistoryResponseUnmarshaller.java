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

import com.aliyuncs.domain.model.v20180129.QueryTaskDetailHistoryResponse;
import com.aliyuncs.domain.model.v20180129.QueryTaskDetailHistoryResponse.CurrentPageCursor;
import com.aliyuncs.domain.model.v20180129.QueryTaskDetailHistoryResponse.NextPageCursor;
import com.aliyuncs.domain.model.v20180129.QueryTaskDetailHistoryResponse.PrePageCursor;
import com.aliyuncs.domain.model.v20180129.QueryTaskDetailHistoryResponse.TaskDetailHistory;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTaskDetailHistoryResponseUnmarshaller {

	public static QueryTaskDetailHistoryResponse unmarshall(QueryTaskDetailHistoryResponse queryTaskDetailHistoryResponse, UnmarshallerContext _ctx) {
		
		queryTaskDetailHistoryResponse.setRequestId(_ctx.stringValue("QueryTaskDetailHistoryResponse.RequestId"));
		queryTaskDetailHistoryResponse.setPageSize(_ctx.integerValue("QueryTaskDetailHistoryResponse.PageSize"));

		CurrentPageCursor currentPageCursor = new CurrentPageCursor();
		currentPageCursor.setTaskNo(_ctx.stringValue("QueryTaskDetailHistoryResponse.CurrentPageCursor.TaskNo"));
		currentPageCursor.setTaskDetailNo(_ctx.stringValue("QueryTaskDetailHistoryResponse.CurrentPageCursor.TaskDetailNo"));
		currentPageCursor.setTaskType(_ctx.stringValue("QueryTaskDetailHistoryResponse.CurrentPageCursor.TaskType"));
		currentPageCursor.setInstanceId(_ctx.stringValue("QueryTaskDetailHistoryResponse.CurrentPageCursor.InstanceId"));
		currentPageCursor.setDomainName(_ctx.stringValue("QueryTaskDetailHistoryResponse.CurrentPageCursor.DomainName"));
		currentPageCursor.setTaskStatus(_ctx.stringValue("QueryTaskDetailHistoryResponse.CurrentPageCursor.TaskStatus"));
		currentPageCursor.setUpdateTime(_ctx.stringValue("QueryTaskDetailHistoryResponse.CurrentPageCursor.UpdateTime"));
		currentPageCursor.setCreateTime(_ctx.stringValue("QueryTaskDetailHistoryResponse.CurrentPageCursor.CreateTime"));
		currentPageCursor.setTryCount(_ctx.integerValue("QueryTaskDetailHistoryResponse.CurrentPageCursor.TryCount"));
		currentPageCursor.setErrorMsg(_ctx.stringValue("QueryTaskDetailHistoryResponse.CurrentPageCursor.ErrorMsg"));
		currentPageCursor.setTaskStatusCode(_ctx.integerValue("QueryTaskDetailHistoryResponse.CurrentPageCursor.TaskStatusCode"));
		currentPageCursor.setTaskTypeDescription(_ctx.stringValue("QueryTaskDetailHistoryResponse.CurrentPageCursor.TaskTypeDescription"));
		queryTaskDetailHistoryResponse.setCurrentPageCursor(currentPageCursor);

		NextPageCursor nextPageCursor = new NextPageCursor();
		nextPageCursor.setTaskNo(_ctx.stringValue("QueryTaskDetailHistoryResponse.NextPageCursor.TaskNo"));
		nextPageCursor.setTaskDetailNo(_ctx.stringValue("QueryTaskDetailHistoryResponse.NextPageCursor.TaskDetailNo"));
		nextPageCursor.setTaskType(_ctx.stringValue("QueryTaskDetailHistoryResponse.NextPageCursor.TaskType"));
		nextPageCursor.setInstanceId(_ctx.stringValue("QueryTaskDetailHistoryResponse.NextPageCursor.InstanceId"));
		nextPageCursor.setDomainName(_ctx.stringValue("QueryTaskDetailHistoryResponse.NextPageCursor.DomainName"));
		nextPageCursor.setTaskStatus(_ctx.stringValue("QueryTaskDetailHistoryResponse.NextPageCursor.TaskStatus"));
		nextPageCursor.setUpdateTime(_ctx.stringValue("QueryTaskDetailHistoryResponse.NextPageCursor.UpdateTime"));
		nextPageCursor.setCreateTime(_ctx.stringValue("QueryTaskDetailHistoryResponse.NextPageCursor.CreateTime"));
		nextPageCursor.setTryCount(_ctx.integerValue("QueryTaskDetailHistoryResponse.NextPageCursor.TryCount"));
		nextPageCursor.setErrorMsg(_ctx.stringValue("QueryTaskDetailHistoryResponse.NextPageCursor.ErrorMsg"));
		nextPageCursor.setTaskStatusCode(_ctx.integerValue("QueryTaskDetailHistoryResponse.NextPageCursor.TaskStatusCode"));
		nextPageCursor.setTaskTypeDescription(_ctx.stringValue("QueryTaskDetailHistoryResponse.NextPageCursor.TaskTypeDescription"));
		queryTaskDetailHistoryResponse.setNextPageCursor(nextPageCursor);

		PrePageCursor prePageCursor = new PrePageCursor();
		prePageCursor.setTaskNo(_ctx.stringValue("QueryTaskDetailHistoryResponse.PrePageCursor.TaskNo"));
		prePageCursor.setTaskDetailNo(_ctx.stringValue("QueryTaskDetailHistoryResponse.PrePageCursor.TaskDetailNo"));
		prePageCursor.setTaskType(_ctx.stringValue("QueryTaskDetailHistoryResponse.PrePageCursor.TaskType"));
		prePageCursor.setInstanceId(_ctx.stringValue("QueryTaskDetailHistoryResponse.PrePageCursor.InstanceId"));
		prePageCursor.setDomainName(_ctx.stringValue("QueryTaskDetailHistoryResponse.PrePageCursor.DomainName"));
		prePageCursor.setTaskStatus(_ctx.stringValue("QueryTaskDetailHistoryResponse.PrePageCursor.TaskStatus"));
		prePageCursor.setUpdateTime(_ctx.stringValue("QueryTaskDetailHistoryResponse.PrePageCursor.UpdateTime"));
		prePageCursor.setCreateTime(_ctx.stringValue("QueryTaskDetailHistoryResponse.PrePageCursor.CreateTime"));
		prePageCursor.setTryCount(_ctx.integerValue("QueryTaskDetailHistoryResponse.PrePageCursor.TryCount"));
		prePageCursor.setErrorMsg(_ctx.stringValue("QueryTaskDetailHistoryResponse.PrePageCursor.ErrorMsg"));
		prePageCursor.setTaskStatusCode(_ctx.integerValue("QueryTaskDetailHistoryResponse.PrePageCursor.TaskStatusCode"));
		prePageCursor.setTaskTypeDescription(_ctx.stringValue("QueryTaskDetailHistoryResponse.PrePageCursor.TaskTypeDescription"));
		queryTaskDetailHistoryResponse.setPrePageCursor(prePageCursor);

		List<TaskDetailHistory> objects = new ArrayList<TaskDetailHistory>();
		for (int i = 0; i < _ctx.lengthValue("QueryTaskDetailHistoryResponse.Objects.Length"); i++) {
			TaskDetailHistory taskDetailHistory = new TaskDetailHistory();
			taskDetailHistory.setTaskNo(_ctx.stringValue("QueryTaskDetailHistoryResponse.Objects["+ i +"].TaskNo"));
			taskDetailHistory.setTaskDetailNo(_ctx.stringValue("QueryTaskDetailHistoryResponse.Objects["+ i +"].TaskDetailNo"));
			taskDetailHistory.setTaskType(_ctx.stringValue("QueryTaskDetailHistoryResponse.Objects["+ i +"].TaskType"));
			taskDetailHistory.setInstanceId(_ctx.stringValue("QueryTaskDetailHistoryResponse.Objects["+ i +"].InstanceId"));
			taskDetailHistory.setDomainName(_ctx.stringValue("QueryTaskDetailHistoryResponse.Objects["+ i +"].DomainName"));
			taskDetailHistory.setTaskStatus(_ctx.stringValue("QueryTaskDetailHistoryResponse.Objects["+ i +"].TaskStatus"));
			taskDetailHistory.setUpdateTime(_ctx.stringValue("QueryTaskDetailHistoryResponse.Objects["+ i +"].UpdateTime"));
			taskDetailHistory.setCreateTime(_ctx.stringValue("QueryTaskDetailHistoryResponse.Objects["+ i +"].CreateTime"));
			taskDetailHistory.setTryCount(_ctx.integerValue("QueryTaskDetailHistoryResponse.Objects["+ i +"].TryCount"));
			taskDetailHistory.setErrorMsg(_ctx.stringValue("QueryTaskDetailHistoryResponse.Objects["+ i +"].ErrorMsg"));
			taskDetailHistory.setTaskStatusCode(_ctx.integerValue("QueryTaskDetailHistoryResponse.Objects["+ i +"].TaskStatusCode"));
			taskDetailHistory.setTaskTypeDescription(_ctx.stringValue("QueryTaskDetailHistoryResponse.Objects["+ i +"].TaskTypeDescription"));

			objects.add(taskDetailHistory);
		}
		queryTaskDetailHistoryResponse.setObjects(objects);
	 
	 	return queryTaskDetailHistoryResponse;
	}
}