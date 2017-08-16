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
package com.aliyuncs.domain.transform.v20160511;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.domain.model.v20160511.QueryBatchTaskListResponse;
import com.aliyuncs.domain.model.v20160511.QueryBatchTaskListResponse.TaskInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryBatchTaskListResponseUnmarshaller {

	public static QueryBatchTaskListResponse unmarshall(QueryBatchTaskListResponse queryBatchTaskListResponse, UnmarshallerContext context) {
		
		queryBatchTaskListResponse.setRequestId(context.stringValue("QueryBatchTaskListResponse.RequestId"));
		queryBatchTaskListResponse.setTotalItemNum(context.integerValue("QueryBatchTaskListResponse.TotalItemNum"));
		queryBatchTaskListResponse.setCurrentPageNum(context.integerValue("QueryBatchTaskListResponse.CurrentPageNum"));
		queryBatchTaskListResponse.setTotalPageNum(context.integerValue("QueryBatchTaskListResponse.TotalPageNum"));
		queryBatchTaskListResponse.setPageSize(context.integerValue("QueryBatchTaskListResponse.PageSize"));
		queryBatchTaskListResponse.setPrePage(context.booleanValue("QueryBatchTaskListResponse.PrePage"));
		queryBatchTaskListResponse.setNextPage(context.booleanValue("QueryBatchTaskListResponse.NextPage"));

		List<TaskInfo> data = new ArrayList<TaskInfo>();
		for (int i = 0; i < context.lengthValue("QueryBatchTaskListResponse.Data.Length"); i++) {
			TaskInfo taskInfo = new TaskInfo();
			taskInfo.setTaskType(context.stringValue("QueryBatchTaskListResponse.Data["+ i +"].TaskType"));
			taskInfo.setTaskNum(context.integerValue("QueryBatchTaskListResponse.Data["+ i +"].TaskNum"));
			taskInfo.setTaskStatus(context.stringValue("QueryBatchTaskListResponse.Data["+ i +"].TaskStatus"));
			taskInfo.setCreateTime(context.stringValue("QueryBatchTaskListResponse.Data["+ i +"].CreateTime"));
			taskInfo.setClientip(context.stringValue("QueryBatchTaskListResponse.Data["+ i +"].Clientip"));
			taskInfo.setTaskNo(context.stringValue("QueryBatchTaskListResponse.Data["+ i +"].TaskNo"));

			data.add(taskInfo);
		}
		queryBatchTaskListResponse.setData(data);
	 
	 	return queryBatchTaskListResponse;
	}
}