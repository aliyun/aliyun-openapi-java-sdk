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
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTaskDetailListResponseUnmarshaller {

	public static QueryTaskDetailListResponse unmarshall(QueryTaskDetailListResponse queryTaskDetailListResponse, UnmarshallerContext _ctx) {
		
		queryTaskDetailListResponse.setRequestId(_ctx.stringValue("QueryTaskDetailListResponse.RequestId"));
		queryTaskDetailListResponse.setPrePage(_ctx.booleanValue("QueryTaskDetailListResponse.PrePage"));
		queryTaskDetailListResponse.setCurrentPageNum(_ctx.integerValue("QueryTaskDetailListResponse.CurrentPageNum"));
		queryTaskDetailListResponse.setPageSize(_ctx.integerValue("QueryTaskDetailListResponse.PageSize"));
		queryTaskDetailListResponse.setTotalPageNum(_ctx.integerValue("QueryTaskDetailListResponse.TotalPageNum"));
		queryTaskDetailListResponse.setTotalItemNum(_ctx.integerValue("QueryTaskDetailListResponse.TotalItemNum"));
		queryTaskDetailListResponse.setNextPage(_ctx.booleanValue("QueryTaskDetailListResponse.NextPage"));

		List<TaskDetail> data = new ArrayList<TaskDetail>();
		for (int i = 0; i < _ctx.lengthValue("QueryTaskDetailListResponse.Data.Length"); i++) {
			TaskDetail taskDetail = new TaskDetail();
			taskDetail.setUpdateTime(_ctx.stringValue("QueryTaskDetailListResponse.Data["+ i +"].UpdateTime"));
			taskDetail.setTaskDetailNo(_ctx.stringValue("QueryTaskDetailListResponse.Data["+ i +"].TaskDetailNo"));
			taskDetail.setCreateTime(_ctx.stringValue("QueryTaskDetailListResponse.Data["+ i +"].CreateTime"));
			taskDetail.setInstanceId(_ctx.stringValue("QueryTaskDetailListResponse.Data["+ i +"].InstanceId"));
			taskDetail.setDomainName(_ctx.stringValue("QueryTaskDetailListResponse.Data["+ i +"].DomainName"));
			taskDetail.setTaskType(_ctx.stringValue("QueryTaskDetailListResponse.Data["+ i +"].TaskType"));
			taskDetail.setTaskNo(_ctx.stringValue("QueryTaskDetailListResponse.Data["+ i +"].TaskNo"));
			taskDetail.setTaskResult(_ctx.stringValue("QueryTaskDetailListResponse.Data["+ i +"].TaskResult"));
			taskDetail.setTaskStatusCode(_ctx.integerValue("QueryTaskDetailListResponse.Data["+ i +"].TaskStatusCode"));
			taskDetail.setTaskStatus(_ctx.stringValue("QueryTaskDetailListResponse.Data["+ i +"].TaskStatus"));
			taskDetail.setTaskTypeDescription(_ctx.stringValue("QueryTaskDetailListResponse.Data["+ i +"].TaskTypeDescription"));
			taskDetail.setTryCount(_ctx.integerValue("QueryTaskDetailListResponse.Data["+ i +"].TryCount"));
			taskDetail.setErrorMsg(_ctx.stringValue("QueryTaskDetailListResponse.Data["+ i +"].ErrorMsg"));
			taskDetail.setFailReason(_ctx.stringValue("QueryTaskDetailListResponse.Data["+ i +"].FailReason"));

			data.add(taskDetail);
		}
		queryTaskDetailListResponse.setData(data);
	 
	 	return queryTaskDetailListResponse;
	}
}