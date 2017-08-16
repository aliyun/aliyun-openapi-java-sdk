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

import com.aliyuncs.domain.model.v20160511.QueryBatchTaskDetailListResponse;
import com.aliyuncs.domain.model.v20160511.QueryBatchTaskDetailListResponse.TaskDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryBatchTaskDetailListResponseUnmarshaller {

	public static QueryBatchTaskDetailListResponse unmarshall(QueryBatchTaskDetailListResponse queryBatchTaskDetailListResponse, UnmarshallerContext context) {
		
		queryBatchTaskDetailListResponse.setRequestId(context.stringValue("QueryBatchTaskDetailListResponse.RequestId"));
		queryBatchTaskDetailListResponse.setTotalItemNum(context.integerValue("QueryBatchTaskDetailListResponse.TotalItemNum"));
		queryBatchTaskDetailListResponse.setCurrentPageNum(context.integerValue("QueryBatchTaskDetailListResponse.CurrentPageNum"));
		queryBatchTaskDetailListResponse.setTotalPageNum(context.integerValue("QueryBatchTaskDetailListResponse.TotalPageNum"));
		queryBatchTaskDetailListResponse.setPageSize(context.integerValue("QueryBatchTaskDetailListResponse.PageSize"));
		queryBatchTaskDetailListResponse.setPrePage(context.booleanValue("QueryBatchTaskDetailListResponse.PrePage"));
		queryBatchTaskDetailListResponse.setNextPage(context.booleanValue("QueryBatchTaskDetailListResponse.NextPage"));

		List<TaskDetail> data = new ArrayList<TaskDetail>();
		for (int i = 0; i < context.lengthValue("QueryBatchTaskDetailListResponse.Data.Length"); i++) {
			TaskDetail taskDetail = new TaskDetail();
			taskDetail.setTaskNo(context.stringValue("QueryBatchTaskDetailListResponse.Data["+ i +"].TaskNo"));
			taskDetail.setTaskType(context.stringValue("QueryBatchTaskDetailListResponse.Data["+ i +"].TaskType"));
			taskDetail.setDomainName(context.stringValue("QueryBatchTaskDetailListResponse.Data["+ i +"].DomainName"));
			taskDetail.setTaskStatus(context.stringValue("QueryBatchTaskDetailListResponse.Data["+ i +"].TaskStatus"));
			taskDetail.setUpdateTime(context.stringValue("QueryBatchTaskDetailListResponse.Data["+ i +"].UpdateTime"));
			taskDetail.setTryCount(context.integerValue("QueryBatchTaskDetailListResponse.Data["+ i +"].TryCount"));
			taskDetail.setErrorMsg(context.stringValue("QueryBatchTaskDetailListResponse.Data["+ i +"].ErrorMsg"));

			data.add(taskDetail);
		}
		queryBatchTaskDetailListResponse.setData(data);
	 
	 	return queryBatchTaskDetailListResponse;
	}
}