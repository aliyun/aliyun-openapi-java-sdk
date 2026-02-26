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

import com.aliyuncs.domain_intl.model.v20171218.QueryTaskDetailHistoryResponse;
import com.aliyuncs.domain_intl.model.v20171218.QueryTaskDetailHistoryResponse.CurrentPageCursor;
import com.aliyuncs.domain_intl.model.v20171218.QueryTaskDetailHistoryResponse.NextPageCursor;
import com.aliyuncs.domain_intl.model.v20171218.QueryTaskDetailHistoryResponse.PrePageCursor;
import com.aliyuncs.domain_intl.model.v20171218.QueryTaskDetailHistoryResponse.TaskDetailHistory;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTaskDetailHistoryResponseUnmarshaller {

	public static QueryTaskDetailHistoryResponse unmarshall(QueryTaskDetailHistoryResponse queryTaskDetailHistoryResponse, UnmarshallerContext _ctx) {
		
		queryTaskDetailHistoryResponse.setRequestId(_ctx.stringValue("QueryTaskDetailHistoryResponse.RequestId"));
		queryTaskDetailHistoryResponse.setPageSize(_ctx.integerValue("QueryTaskDetailHistoryResponse.PageSize"));

		CurrentPageCursor currentPageCursor = new CurrentPageCursor();
		currentPageCursor.setUpdateTime(_ctx.stringValue("QueryTaskDetailHistoryResponse.CurrentPageCursor.UpdateTime"));
		currentPageCursor.setTaskDetailNo(_ctx.stringValue("QueryTaskDetailHistoryResponse.CurrentPageCursor.TaskDetailNo"));
		currentPageCursor.setCreateTime(_ctx.stringValue("QueryTaskDetailHistoryResponse.CurrentPageCursor.CreateTime"));
		currentPageCursor.setInstanceId(_ctx.stringValue("QueryTaskDetailHistoryResponse.CurrentPageCursor.InstanceId"));
		currentPageCursor.setDomainName(_ctx.stringValue("QueryTaskDetailHistoryResponse.CurrentPageCursor.DomainName"));
		currentPageCursor.setTaskType(_ctx.stringValue("QueryTaskDetailHistoryResponse.CurrentPageCursor.TaskType"));
		currentPageCursor.setTaskNo(_ctx.stringValue("QueryTaskDetailHistoryResponse.CurrentPageCursor.TaskNo"));
		currentPageCursor.setTaskStatusCode(_ctx.integerValue("QueryTaskDetailHistoryResponse.CurrentPageCursor.TaskStatusCode"));
		currentPageCursor.setTaskStatus(_ctx.stringValue("QueryTaskDetailHistoryResponse.CurrentPageCursor.TaskStatus"));
		currentPageCursor.setTaskTypeDescription(_ctx.stringValue("QueryTaskDetailHistoryResponse.CurrentPageCursor.TaskTypeDescription"));
		currentPageCursor.setTryCount(_ctx.integerValue("QueryTaskDetailHistoryResponse.CurrentPageCursor.TryCount"));
		currentPageCursor.setErrorMsg(_ctx.stringValue("QueryTaskDetailHistoryResponse.CurrentPageCursor.ErrorMsg"));
		queryTaskDetailHistoryResponse.setCurrentPageCursor(currentPageCursor);

		PrePageCursor prePageCursor = new PrePageCursor();
		prePageCursor.setUpdateTime(_ctx.stringValue("QueryTaskDetailHistoryResponse.PrePageCursor.UpdateTime"));
		prePageCursor.setTaskDetailNo(_ctx.stringValue("QueryTaskDetailHistoryResponse.PrePageCursor.TaskDetailNo"));
		prePageCursor.setCreateTime(_ctx.stringValue("QueryTaskDetailHistoryResponse.PrePageCursor.CreateTime"));
		prePageCursor.setInstanceId(_ctx.stringValue("QueryTaskDetailHistoryResponse.PrePageCursor.InstanceId"));
		prePageCursor.setDomainName(_ctx.stringValue("QueryTaskDetailHistoryResponse.PrePageCursor.DomainName"));
		prePageCursor.setTaskType(_ctx.stringValue("QueryTaskDetailHistoryResponse.PrePageCursor.TaskType"));
		prePageCursor.setTaskNo(_ctx.stringValue("QueryTaskDetailHistoryResponse.PrePageCursor.TaskNo"));
		prePageCursor.setTaskStatusCode(_ctx.integerValue("QueryTaskDetailHistoryResponse.PrePageCursor.TaskStatusCode"));
		prePageCursor.setTaskStatus(_ctx.stringValue("QueryTaskDetailHistoryResponse.PrePageCursor.TaskStatus"));
		prePageCursor.setTaskTypeDescription(_ctx.stringValue("QueryTaskDetailHistoryResponse.PrePageCursor.TaskTypeDescription"));
		prePageCursor.setTryCount(_ctx.integerValue("QueryTaskDetailHistoryResponse.PrePageCursor.TryCount"));
		prePageCursor.setErrorMsg(_ctx.stringValue("QueryTaskDetailHistoryResponse.PrePageCursor.ErrorMsg"));
		queryTaskDetailHistoryResponse.setPrePageCursor(prePageCursor);

		NextPageCursor nextPageCursor = new NextPageCursor();
		nextPageCursor.setUpdateTime(_ctx.stringValue("QueryTaskDetailHistoryResponse.NextPageCursor.UpdateTime"));
		nextPageCursor.setTaskDetailNo(_ctx.stringValue("QueryTaskDetailHistoryResponse.NextPageCursor.TaskDetailNo"));
		nextPageCursor.setCreateTime(_ctx.stringValue("QueryTaskDetailHistoryResponse.NextPageCursor.CreateTime"));
		nextPageCursor.setInstanceId(_ctx.stringValue("QueryTaskDetailHistoryResponse.NextPageCursor.InstanceId"));
		nextPageCursor.setDomainName(_ctx.stringValue("QueryTaskDetailHistoryResponse.NextPageCursor.DomainName"));
		nextPageCursor.setTaskType(_ctx.stringValue("QueryTaskDetailHistoryResponse.NextPageCursor.TaskType"));
		nextPageCursor.setTaskNo(_ctx.stringValue("QueryTaskDetailHistoryResponse.NextPageCursor.TaskNo"));
		nextPageCursor.setTaskStatusCode(_ctx.integerValue("QueryTaskDetailHistoryResponse.NextPageCursor.TaskStatusCode"));
		nextPageCursor.setTaskStatus(_ctx.stringValue("QueryTaskDetailHistoryResponse.NextPageCursor.TaskStatus"));
		nextPageCursor.setTaskTypeDescription(_ctx.stringValue("QueryTaskDetailHistoryResponse.NextPageCursor.TaskTypeDescription"));
		nextPageCursor.setTryCount(_ctx.integerValue("QueryTaskDetailHistoryResponse.NextPageCursor.TryCount"));
		nextPageCursor.setErrorMsg(_ctx.stringValue("QueryTaskDetailHistoryResponse.NextPageCursor.ErrorMsg"));
		queryTaskDetailHistoryResponse.setNextPageCursor(nextPageCursor);

		List<TaskDetailHistory> objects = new ArrayList<TaskDetailHistory>();
		for (int i = 0; i < _ctx.lengthValue("QueryTaskDetailHistoryResponse.Objects.Length"); i++) {
			TaskDetailHistory taskDetailHistory = new TaskDetailHistory();
			taskDetailHistory.setUpdateTime(_ctx.stringValue("QueryTaskDetailHistoryResponse.Objects["+ i +"].UpdateTime"));
			taskDetailHistory.setTaskDetailNo(_ctx.stringValue("QueryTaskDetailHistoryResponse.Objects["+ i +"].TaskDetailNo"));
			taskDetailHistory.setCreateTime(_ctx.stringValue("QueryTaskDetailHistoryResponse.Objects["+ i +"].CreateTime"));
			taskDetailHistory.setInstanceId(_ctx.stringValue("QueryTaskDetailHistoryResponse.Objects["+ i +"].InstanceId"));
			taskDetailHistory.setDomainName(_ctx.stringValue("QueryTaskDetailHistoryResponse.Objects["+ i +"].DomainName"));
			taskDetailHistory.setTaskType(_ctx.stringValue("QueryTaskDetailHistoryResponse.Objects["+ i +"].TaskType"));
			taskDetailHistory.setTaskNo(_ctx.stringValue("QueryTaskDetailHistoryResponse.Objects["+ i +"].TaskNo"));
			taskDetailHistory.setTaskStatusCode(_ctx.integerValue("QueryTaskDetailHistoryResponse.Objects["+ i +"].TaskStatusCode"));
			taskDetailHistory.setTaskStatus(_ctx.stringValue("QueryTaskDetailHistoryResponse.Objects["+ i +"].TaskStatus"));
			taskDetailHistory.setTaskTypeDescription(_ctx.stringValue("QueryTaskDetailHistoryResponse.Objects["+ i +"].TaskTypeDescription"));
			taskDetailHistory.setTryCount(_ctx.integerValue("QueryTaskDetailHistoryResponse.Objects["+ i +"].TryCount"));
			taskDetailHistory.setErrorMsg(_ctx.stringValue("QueryTaskDetailHistoryResponse.Objects["+ i +"].ErrorMsg"));

			objects.add(taskDetailHistory);
		}
		queryTaskDetailHistoryResponse.setObjects(objects);
	 
	 	return queryTaskDetailHistoryResponse;
	}
}