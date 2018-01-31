/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
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

	public static QueryTaskInfoHistoryResponse unmarshall(QueryTaskInfoHistoryResponse queryTaskInfoHistoryResponse, UnmarshallerContext context) {
		
		queryTaskInfoHistoryResponse.setRequestId(context.stringValue("QueryTaskInfoHistoryResponse.RequestId"));
		queryTaskInfoHistoryResponse.setPageSize(context.integerValue("QueryTaskInfoHistoryResponse.PageSize"));

		CurrentPageCursor currentPageCursor = new CurrentPageCursor();
		currentPageCursor.setTaskType(context.stringValue("QueryTaskInfoHistoryResponse.CurrentPageCursor.TaskType"));
		currentPageCursor.setTaskNum(context.integerValue("QueryTaskInfoHistoryResponse.CurrentPageCursor.TaskNum"));
		currentPageCursor.setTaskStatus(context.stringValue("QueryTaskInfoHistoryResponse.CurrentPageCursor.TaskStatus"));
		currentPageCursor.setCreateTime(context.stringValue("QueryTaskInfoHistoryResponse.CurrentPageCursor.CreateTime"));
		currentPageCursor.setClientip(context.stringValue("QueryTaskInfoHistoryResponse.CurrentPageCursor.Clientip"));
		currentPageCursor.setTaskNo(context.stringValue("QueryTaskInfoHistoryResponse.CurrentPageCursor.TaskNo"));
		currentPageCursor.setCreateTimeLong(context.longValue("QueryTaskInfoHistoryResponse.CurrentPageCursor.CreateTimeLong"));
		currentPageCursor.setTaskStatusCode(context.integerValue("QueryTaskInfoHistoryResponse.CurrentPageCursor.TaskStatusCode"));
		queryTaskInfoHistoryResponse.setCurrentPageCursor(currentPageCursor);

		NextPageCursor nextPageCursor = new NextPageCursor();
		nextPageCursor.setTaskType(context.stringValue("QueryTaskInfoHistoryResponse.NextPageCursor.TaskType"));
		nextPageCursor.setTaskNum(context.integerValue("QueryTaskInfoHistoryResponse.NextPageCursor.TaskNum"));
		nextPageCursor.setTaskStatus(context.stringValue("QueryTaskInfoHistoryResponse.NextPageCursor.TaskStatus"));
		nextPageCursor.setCreateTime(context.stringValue("QueryTaskInfoHistoryResponse.NextPageCursor.CreateTime"));
		nextPageCursor.setClientip(context.stringValue("QueryTaskInfoHistoryResponse.NextPageCursor.Clientip"));
		nextPageCursor.setTaskNo(context.stringValue("QueryTaskInfoHistoryResponse.NextPageCursor.TaskNo"));
		nextPageCursor.setCreateTimeLong(context.longValue("QueryTaskInfoHistoryResponse.NextPageCursor.CreateTimeLong"));
		nextPageCursor.setTaskStatusCode(context.integerValue("QueryTaskInfoHistoryResponse.NextPageCursor.TaskStatusCode"));
		queryTaskInfoHistoryResponse.setNextPageCursor(nextPageCursor);

		PrePageCursor prePageCursor = new PrePageCursor();
		prePageCursor.setTaskType(context.stringValue("QueryTaskInfoHistoryResponse.PrePageCursor.TaskType"));
		prePageCursor.setTaskNum(context.integerValue("QueryTaskInfoHistoryResponse.PrePageCursor.TaskNum"));
		prePageCursor.setTaskStatus(context.stringValue("QueryTaskInfoHistoryResponse.PrePageCursor.TaskStatus"));
		prePageCursor.setCreateTime(context.stringValue("QueryTaskInfoHistoryResponse.PrePageCursor.CreateTime"));
		prePageCursor.setClientip(context.stringValue("QueryTaskInfoHistoryResponse.PrePageCursor.Clientip"));
		prePageCursor.setTaskNo(context.stringValue("QueryTaskInfoHistoryResponse.PrePageCursor.TaskNo"));
		prePageCursor.setCreateTimeLong(context.longValue("QueryTaskInfoHistoryResponse.PrePageCursor.CreateTimeLong"));
		prePageCursor.setTaskStatusCode(context.integerValue("QueryTaskInfoHistoryResponse.PrePageCursor.TaskStatusCode"));
		queryTaskInfoHistoryResponse.setPrePageCursor(prePageCursor);

		List<TaskInfoHistory> objects = new ArrayList<TaskInfoHistory>();
		for (int i = 0; i < context.lengthValue("QueryTaskInfoHistoryResponse.Objects.Length"); i++) {
			TaskInfoHistory taskInfoHistory = new TaskInfoHistory();
			taskInfoHistory.setTaskType(context.stringValue("QueryTaskInfoHistoryResponse.Objects["+ i +"].TaskType"));
			taskInfoHistory.setTaskNum(context.integerValue("QueryTaskInfoHistoryResponse.Objects["+ i +"].TaskNum"));
			taskInfoHistory.setTaskStatus(context.stringValue("QueryTaskInfoHistoryResponse.Objects["+ i +"].TaskStatus"));
			taskInfoHistory.setCreateTime(context.stringValue("QueryTaskInfoHistoryResponse.Objects["+ i +"].CreateTime"));
			taskInfoHistory.setClientip(context.stringValue("QueryTaskInfoHistoryResponse.Objects["+ i +"].Clientip"));
			taskInfoHistory.setTaskNo(context.stringValue("QueryTaskInfoHistoryResponse.Objects["+ i +"].TaskNo"));
			taskInfoHistory.setCreateTimeLong(context.longValue("QueryTaskInfoHistoryResponse.Objects["+ i +"].CreateTimeLong"));
			taskInfoHistory.setTaskStatusCode(context.integerValue("QueryTaskInfoHistoryResponse.Objects["+ i +"].TaskStatusCode"));

			objects.add(taskInfoHistory);
		}
		queryTaskInfoHistoryResponse.setObjects(objects);
	 
	 	return queryTaskInfoHistoryResponse;
	}
}