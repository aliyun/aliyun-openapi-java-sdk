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

import com.aliyuncs.domain.model.v20180129.QueryTaskDetailListResponse;
import com.aliyuncs.domain.model.v20180129.QueryTaskDetailListResponse.TaskDetail;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTaskDetailListResponseUnmarshaller {

	public static QueryTaskDetailListResponse unmarshall(QueryTaskDetailListResponse queryTaskDetailListResponse, UnmarshallerContext context) {
		
		queryTaskDetailListResponse.setRequestId(context.stringValue("QueryTaskDetailListResponse.RequestId"));
		queryTaskDetailListResponse.setTotalItemNum(context.integerValue("QueryTaskDetailListResponse.TotalItemNum"));
		queryTaskDetailListResponse.setCurrentPageNum(context.integerValue("QueryTaskDetailListResponse.CurrentPageNum"));
		queryTaskDetailListResponse.setTotalPageNum(context.integerValue("QueryTaskDetailListResponse.TotalPageNum"));
		queryTaskDetailListResponse.setPageSize(context.integerValue("QueryTaskDetailListResponse.PageSize"));
		queryTaskDetailListResponse.setPrePage(context.booleanValue("QueryTaskDetailListResponse.PrePage"));
		queryTaskDetailListResponse.setNextPage(context.booleanValue("QueryTaskDetailListResponse.NextPage"));

		List<TaskDetail> data = new ArrayList<TaskDetail>();
		for (int i = 0; i < context.lengthValue("QueryTaskDetailListResponse.Data.Length"); i++) {
			TaskDetail taskDetail = new TaskDetail();
			taskDetail.setTaskNo(context.stringValue("QueryTaskDetailListResponse.Data["+ i +"].TaskNo"));
			taskDetail.setTaskDetailNo(context.stringValue("QueryTaskDetailListResponse.Data["+ i +"].TaskDetailNo"));
			taskDetail.setTaskType(context.stringValue("QueryTaskDetailListResponse.Data["+ i +"].TaskType"));
			taskDetail.setInstanceId(context.stringValue("QueryTaskDetailListResponse.Data["+ i +"].InstanceId"));
			taskDetail.setDomainName(context.stringValue("QueryTaskDetailListResponse.Data["+ i +"].DomainName"));
			taskDetail.setTaskStatus(context.stringValue("QueryTaskDetailListResponse.Data["+ i +"].TaskStatus"));
			taskDetail.setUpdateTime(context.stringValue("QueryTaskDetailListResponse.Data["+ i +"].UpdateTime"));
			taskDetail.setCreateTime(context.stringValue("QueryTaskDetailListResponse.Data["+ i +"].CreateTime"));
			taskDetail.setTryCount(context.integerValue("QueryTaskDetailListResponse.Data["+ i +"].TryCount"));
			taskDetail.setErrorMsg(context.stringValue("QueryTaskDetailListResponse.Data["+ i +"].ErrorMsg"));
			taskDetail.setTaskStatusCode(context.integerValue("QueryTaskDetailListResponse.Data["+ i +"].TaskStatusCode"));
			taskDetail.setTaskResult(context.stringValue("QueryTaskDetailListResponse.Data["+ i +"].TaskResult"));
			taskDetail.setTaskTypeDescription(context.stringValue("QueryTaskDetailListResponse.Data["+ i +"].TaskTypeDescription"));

			data.add(taskDetail);
		}
		queryTaskDetailListResponse.setData(data);
	 
	 	return queryTaskDetailListResponse;
	}
}