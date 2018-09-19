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

import com.aliyuncs.domain_intl.model.v20171218.QueryTaskListResponse;
import com.aliyuncs.domain_intl.model.v20171218.QueryTaskListResponse.TaskInfo;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTaskListResponseUnmarshaller {

	public static QueryTaskListResponse unmarshall(QueryTaskListResponse queryTaskListResponse, UnmarshallerContext context) {
		
		queryTaskListResponse.setRequestId(context.stringValue("QueryTaskListResponse.RequestId"));
		queryTaskListResponse.setTotalItemNum(context.integerValue("QueryTaskListResponse.TotalItemNum"));
		queryTaskListResponse.setCurrentPageNum(context.integerValue("QueryTaskListResponse.CurrentPageNum"));
		queryTaskListResponse.setTotalPageNum(context.integerValue("QueryTaskListResponse.TotalPageNum"));
		queryTaskListResponse.setPageSize(context.integerValue("QueryTaskListResponse.PageSize"));
		queryTaskListResponse.setPrePage(context.booleanValue("QueryTaskListResponse.PrePage"));
		queryTaskListResponse.setNextPage(context.booleanValue("QueryTaskListResponse.NextPage"));

		List<TaskInfo> data = new ArrayList<TaskInfo>();
		for (int i = 0; i < context.lengthValue("QueryTaskListResponse.Data.Length"); i++) {
			TaskInfo taskInfo = new TaskInfo();
			taskInfo.setTaskType(context.stringValue("QueryTaskListResponse.Data["+ i +"].TaskType"));
			taskInfo.setTaskNum(context.integerValue("QueryTaskListResponse.Data["+ i +"].TaskNum"));
			taskInfo.setTaskStatus(context.stringValue("QueryTaskListResponse.Data["+ i +"].TaskStatus"));
			taskInfo.setCreateTime(context.stringValue("QueryTaskListResponse.Data["+ i +"].CreateTime"));
			taskInfo.setClientip(context.stringValue("QueryTaskListResponse.Data["+ i +"].Clientip"));
			taskInfo.setTaskNo(context.stringValue("QueryTaskListResponse.Data["+ i +"].TaskNo"));
			taskInfo.setTaskTypeDescription(context.stringValue("QueryTaskListResponse.Data["+ i +"].TaskTypeDescription"));
			taskInfo.setTaskStatusCode(context.integerValue("QueryTaskListResponse.Data["+ i +"].TaskStatusCode"));

			data.add(taskInfo);
		}
		queryTaskListResponse.setData(data);
	 
	 	return queryTaskListResponse;
	}
}