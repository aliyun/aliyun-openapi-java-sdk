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
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class PollTaskResultResponseUnmarshaller {

	public static PollTaskResultResponse unmarshall(PollTaskResultResponse pollTaskResultResponse, UnmarshallerContext context) {
		
		pollTaskResultResponse.setRequestId(context.stringValue("PollTaskResultResponse.RequestId"));
		pollTaskResultResponse.setTotalItemNum(context.integerValue("PollTaskResultResponse.TotalItemNum"));
		pollTaskResultResponse.setCurrentPageNum(context.integerValue("PollTaskResultResponse.CurrentPageNum"));
		pollTaskResultResponse.setTotalPageNum(context.integerValue("PollTaskResultResponse.TotalPageNum"));
		pollTaskResultResponse.setPageSize(context.integerValue("PollTaskResultResponse.PageSize"));
		pollTaskResultResponse.setPrePage(context.booleanValue("PollTaskResultResponse.PrePage"));
		pollTaskResultResponse.setNextPage(context.booleanValue("PollTaskResultResponse.NextPage"));

		List<TaskDetail> data = new ArrayList<TaskDetail>();
		for (int i = 0; i < context.lengthValue("PollTaskResultResponse.Data.Length"); i++) {
			TaskDetail taskDetail = new TaskDetail();
			taskDetail.setTaskNo(context.stringValue("PollTaskResultResponse.Data["+ i +"].TaskNo"));
			taskDetail.setTaskDetailNo(context.stringValue("PollTaskResultResponse.Data["+ i +"].TaskDetailNo"));
			taskDetail.setTaskType(context.stringValue("PollTaskResultResponse.Data["+ i +"].TaskType"));
			taskDetail.setInstanceId(context.stringValue("PollTaskResultResponse.Data["+ i +"].InstanceId"));
			taskDetail.setDomainName(context.stringValue("PollTaskResultResponse.Data["+ i +"].DomainName"));
			taskDetail.setTaskStatus(context.stringValue("PollTaskResultResponse.Data["+ i +"].TaskStatus"));
			taskDetail.setUpdateTime(context.stringValue("PollTaskResultResponse.Data["+ i +"].UpdateTime"));
			taskDetail.setCreateTime(context.stringValue("PollTaskResultResponse.Data["+ i +"].CreateTime"));
			taskDetail.setTryCount(context.integerValue("PollTaskResultResponse.Data["+ i +"].TryCount"));
			taskDetail.setErrorMsg(context.stringValue("PollTaskResultResponse.Data["+ i +"].ErrorMsg"));
			taskDetail.setTaskStatusCode(context.integerValue("PollTaskResultResponse.Data["+ i +"].TaskStatusCode"));
			taskDetail.setTaskResult(context.stringValue("PollTaskResultResponse.Data["+ i +"].TaskResult"));
			taskDetail.setTaskTypeDescription(context.stringValue("PollTaskResultResponse.Data["+ i +"].TaskTypeDescription"));

			data.add(taskDetail);
		}
		pollTaskResultResponse.setData(data);
	 
	 	return pollTaskResultResponse;
	}
}