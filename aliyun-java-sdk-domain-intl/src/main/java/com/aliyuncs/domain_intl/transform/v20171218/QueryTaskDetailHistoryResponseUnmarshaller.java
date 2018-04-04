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

	public static QueryTaskDetailHistoryResponse unmarshall(QueryTaskDetailHistoryResponse queryTaskDetailHistoryResponse, UnmarshallerContext context) {
		
		queryTaskDetailHistoryResponse.setRequestId(context.stringValue("QueryTaskDetailHistoryResponse.RequestId"));
		queryTaskDetailHistoryResponse.setPageSize(context.integerValue("QueryTaskDetailHistoryResponse.PageSize"));

		CurrentPageCursor currentPageCursor = new CurrentPageCursor();
		currentPageCursor.setTaskNo(context.stringValue("QueryTaskDetailHistoryResponse.CurrentPageCursor.TaskNo"));
		currentPageCursor.setTaskDetailNo(context.stringValue("QueryTaskDetailHistoryResponse.CurrentPageCursor.TaskDetailNo"));
		currentPageCursor.setTaskType(context.stringValue("QueryTaskDetailHistoryResponse.CurrentPageCursor.TaskType"));
		currentPageCursor.setInstanceId(context.stringValue("QueryTaskDetailHistoryResponse.CurrentPageCursor.InstanceId"));
		currentPageCursor.setDomainName(context.stringValue("QueryTaskDetailHistoryResponse.CurrentPageCursor.DomainName"));
		currentPageCursor.setTaskStatus(context.stringValue("QueryTaskDetailHistoryResponse.CurrentPageCursor.TaskStatus"));
		currentPageCursor.setUpdateTime(context.stringValue("QueryTaskDetailHistoryResponse.CurrentPageCursor.UpdateTime"));
		currentPageCursor.setCreateTime(context.stringValue("QueryTaskDetailHistoryResponse.CurrentPageCursor.CreateTime"));
		currentPageCursor.setTryCount(context.integerValue("QueryTaskDetailHistoryResponse.CurrentPageCursor.TryCount"));
		currentPageCursor.setErrorMsg(context.stringValue("QueryTaskDetailHistoryResponse.CurrentPageCursor.ErrorMsg"));
		currentPageCursor.setTaskStatusCode(context.integerValue("QueryTaskDetailHistoryResponse.CurrentPageCursor.TaskStatusCode"));
		currentPageCursor.setTaskTypeDescription(context.stringValue("QueryTaskDetailHistoryResponse.CurrentPageCursor.TaskTypeDescription"));
		queryTaskDetailHistoryResponse.setCurrentPageCursor(currentPageCursor);

		NextPageCursor nextPageCursor = new NextPageCursor();
		nextPageCursor.setTaskNo(context.stringValue("QueryTaskDetailHistoryResponse.NextPageCursor.TaskNo"));
		nextPageCursor.setTaskDetailNo(context.stringValue("QueryTaskDetailHistoryResponse.NextPageCursor.TaskDetailNo"));
		nextPageCursor.setTaskType(context.stringValue("QueryTaskDetailHistoryResponse.NextPageCursor.TaskType"));
		nextPageCursor.setInstanceId(context.stringValue("QueryTaskDetailHistoryResponse.NextPageCursor.InstanceId"));
		nextPageCursor.setDomainName(context.stringValue("QueryTaskDetailHistoryResponse.NextPageCursor.DomainName"));
		nextPageCursor.setTaskStatus(context.stringValue("QueryTaskDetailHistoryResponse.NextPageCursor.TaskStatus"));
		nextPageCursor.setUpdateTime(context.stringValue("QueryTaskDetailHistoryResponse.NextPageCursor.UpdateTime"));
		nextPageCursor.setCreateTime(context.stringValue("QueryTaskDetailHistoryResponse.NextPageCursor.CreateTime"));
		nextPageCursor.setTryCount(context.integerValue("QueryTaskDetailHistoryResponse.NextPageCursor.TryCount"));
		nextPageCursor.setErrorMsg(context.stringValue("QueryTaskDetailHistoryResponse.NextPageCursor.ErrorMsg"));
		nextPageCursor.setTaskStatusCode(context.integerValue("QueryTaskDetailHistoryResponse.NextPageCursor.TaskStatusCode"));
		nextPageCursor.setTaskTypeDescription(context.stringValue("QueryTaskDetailHistoryResponse.NextPageCursor.TaskTypeDescription"));
		queryTaskDetailHistoryResponse.setNextPageCursor(nextPageCursor);

		PrePageCursor prePageCursor = new PrePageCursor();
		prePageCursor.setTaskNo(context.stringValue("QueryTaskDetailHistoryResponse.PrePageCursor.TaskNo"));
		prePageCursor.setTaskDetailNo(context.stringValue("QueryTaskDetailHistoryResponse.PrePageCursor.TaskDetailNo"));
		prePageCursor.setTaskType(context.stringValue("QueryTaskDetailHistoryResponse.PrePageCursor.TaskType"));
		prePageCursor.setInstanceId(context.stringValue("QueryTaskDetailHistoryResponse.PrePageCursor.InstanceId"));
		prePageCursor.setDomainName(context.stringValue("QueryTaskDetailHistoryResponse.PrePageCursor.DomainName"));
		prePageCursor.setTaskStatus(context.stringValue("QueryTaskDetailHistoryResponse.PrePageCursor.TaskStatus"));
		prePageCursor.setUpdateTime(context.stringValue("QueryTaskDetailHistoryResponse.PrePageCursor.UpdateTime"));
		prePageCursor.setCreateTime(context.stringValue("QueryTaskDetailHistoryResponse.PrePageCursor.CreateTime"));
		prePageCursor.setTryCount(context.integerValue("QueryTaskDetailHistoryResponse.PrePageCursor.TryCount"));
		prePageCursor.setErrorMsg(context.stringValue("QueryTaskDetailHistoryResponse.PrePageCursor.ErrorMsg"));
		prePageCursor.setTaskStatusCode(context.integerValue("QueryTaskDetailHistoryResponse.PrePageCursor.TaskStatusCode"));
		prePageCursor.setTaskTypeDescription(context.stringValue("QueryTaskDetailHistoryResponse.PrePageCursor.TaskTypeDescription"));
		queryTaskDetailHistoryResponse.setPrePageCursor(prePageCursor);

		List<TaskDetailHistory> objects = new ArrayList<TaskDetailHistory>();
		for (int i = 0; i < context.lengthValue("QueryTaskDetailHistoryResponse.Objects.Length"); i++) {
			TaskDetailHistory taskDetailHistory = new TaskDetailHistory();
			taskDetailHistory.setTaskNo(context.stringValue("QueryTaskDetailHistoryResponse.Objects["+ i +"].TaskNo"));
			taskDetailHistory.setTaskDetailNo(context.stringValue("QueryTaskDetailHistoryResponse.Objects["+ i +"].TaskDetailNo"));
			taskDetailHistory.setTaskType(context.stringValue("QueryTaskDetailHistoryResponse.Objects["+ i +"].TaskType"));
			taskDetailHistory.setInstanceId(context.stringValue("QueryTaskDetailHistoryResponse.Objects["+ i +"].InstanceId"));
			taskDetailHistory.setDomainName(context.stringValue("QueryTaskDetailHistoryResponse.Objects["+ i +"].DomainName"));
			taskDetailHistory.setTaskStatus(context.stringValue("QueryTaskDetailHistoryResponse.Objects["+ i +"].TaskStatus"));
			taskDetailHistory.setUpdateTime(context.stringValue("QueryTaskDetailHistoryResponse.Objects["+ i +"].UpdateTime"));
			taskDetailHistory.setCreateTime(context.stringValue("QueryTaskDetailHistoryResponse.Objects["+ i +"].CreateTime"));
			taskDetailHistory.setTryCount(context.integerValue("QueryTaskDetailHistoryResponse.Objects["+ i +"].TryCount"));
			taskDetailHistory.setErrorMsg(context.stringValue("QueryTaskDetailHistoryResponse.Objects["+ i +"].ErrorMsg"));
			taskDetailHistory.setTaskStatusCode(context.integerValue("QueryTaskDetailHistoryResponse.Objects["+ i +"].TaskStatusCode"));
			taskDetailHistory.setTaskTypeDescription(context.stringValue("QueryTaskDetailHistoryResponse.Objects["+ i +"].TaskTypeDescription"));

			objects.add(taskDetailHistory);
		}
		queryTaskDetailHistoryResponse.setObjects(objects);
	 
	 	return queryTaskDetailHistoryResponse;
	}
}