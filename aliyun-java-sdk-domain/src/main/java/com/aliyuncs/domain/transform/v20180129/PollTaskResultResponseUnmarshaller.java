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

import com.aliyuncs.domain.model.v20180129.PollTaskResultResponse;
import com.aliyuncs.domain.model.v20180129.PollTaskResultResponse.TaskDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class PollTaskResultResponseUnmarshaller {

	public static PollTaskResultResponse unmarshall(PollTaskResultResponse pollTaskResultResponse, UnmarshallerContext _ctx) {
		
		pollTaskResultResponse.setRequestId(_ctx.stringValue("PollTaskResultResponse.RequestId"));
		pollTaskResultResponse.setPrePage(_ctx.booleanValue("PollTaskResultResponse.PrePage"));
		pollTaskResultResponse.setCurrentPageNum(_ctx.integerValue("PollTaskResultResponse.CurrentPageNum"));
		pollTaskResultResponse.setPageSize(_ctx.integerValue("PollTaskResultResponse.PageSize"));
		pollTaskResultResponse.setTotalPageNum(_ctx.integerValue("PollTaskResultResponse.TotalPageNum"));
		pollTaskResultResponse.setTotalItemNum(_ctx.integerValue("PollTaskResultResponse.TotalItemNum"));
		pollTaskResultResponse.setNextPage(_ctx.booleanValue("PollTaskResultResponse.NextPage"));

		List<TaskDetail> data = new ArrayList<TaskDetail>();
		for (int i = 0; i < _ctx.lengthValue("PollTaskResultResponse.Data.Length"); i++) {
			TaskDetail taskDetail = new TaskDetail();
			taskDetail.setUpdateTime(_ctx.stringValue("PollTaskResultResponse.Data["+ i +"].UpdateTime"));
			taskDetail.setTaskDetailNo(_ctx.stringValue("PollTaskResultResponse.Data["+ i +"].TaskDetailNo"));
			taskDetail.setCreateTime(_ctx.stringValue("PollTaskResultResponse.Data["+ i +"].CreateTime"));
			taskDetail.setInstanceId(_ctx.stringValue("PollTaskResultResponse.Data["+ i +"].InstanceId"));
			taskDetail.setDomainName(_ctx.stringValue("PollTaskResultResponse.Data["+ i +"].DomainName"));
			taskDetail.setTaskType(_ctx.stringValue("PollTaskResultResponse.Data["+ i +"].TaskType"));
			taskDetail.setTaskNo(_ctx.stringValue("PollTaskResultResponse.Data["+ i +"].TaskNo"));
			taskDetail.setTaskResult(_ctx.stringValue("PollTaskResultResponse.Data["+ i +"].TaskResult"));
			taskDetail.setTaskStatusCode(_ctx.integerValue("PollTaskResultResponse.Data["+ i +"].TaskStatusCode"));
			taskDetail.setTaskStatus(_ctx.stringValue("PollTaskResultResponse.Data["+ i +"].TaskStatus"));
			taskDetail.setTaskTypeDescription(_ctx.stringValue("PollTaskResultResponse.Data["+ i +"].TaskTypeDescription"));
			taskDetail.setTryCount(_ctx.integerValue("PollTaskResultResponse.Data["+ i +"].TryCount"));
			taskDetail.setErrorMsg(_ctx.stringValue("PollTaskResultResponse.Data["+ i +"].ErrorMsg"));

			data.add(taskDetail);
		}
		pollTaskResultResponse.setData(data);
	 
	 	return pollTaskResultResponse;
	}
}