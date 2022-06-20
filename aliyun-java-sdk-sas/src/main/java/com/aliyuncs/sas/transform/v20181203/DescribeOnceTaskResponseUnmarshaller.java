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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribeOnceTaskResponse;
import com.aliyuncs.sas.model.v20181203.DescribeOnceTaskResponse.PageInfo;
import com.aliyuncs.sas.model.v20181203.DescribeOnceTaskResponse.TaskManageResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeOnceTaskResponseUnmarshaller {

	public static DescribeOnceTaskResponse unmarshall(DescribeOnceTaskResponse describeOnceTaskResponse, UnmarshallerContext _ctx) {
		
		describeOnceTaskResponse.setRequestId(_ctx.stringValue("DescribeOnceTaskResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("DescribeOnceTaskResponse.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("DescribeOnceTaskResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("DescribeOnceTaskResponse.PageInfo.TotalCount"));
		pageInfo.setCount(_ctx.integerValue("DescribeOnceTaskResponse.PageInfo.Count"));
		describeOnceTaskResponse.setPageInfo(pageInfo);

		List<TaskManageResponse> taskManageResponseList = new ArrayList<TaskManageResponse>();
		for (int i = 0; i < _ctx.lengthValue("DescribeOnceTaskResponse.TaskManageResponseList.Length"); i++) {
			TaskManageResponse taskManageResponse = new TaskManageResponse();
			taskManageResponse.setTaskType(_ctx.stringValue("DescribeOnceTaskResponse.TaskManageResponseList["+ i +"].TaskType"));
			taskManageResponse.setProgress(_ctx.stringValue("DescribeOnceTaskResponse.TaskManageResponseList["+ i +"].Progress"));
			taskManageResponse.setTaskStatus(_ctx.integerValue("DescribeOnceTaskResponse.TaskManageResponseList["+ i +"].TaskStatus"));
			taskManageResponse.setDetailData(_ctx.stringValue("DescribeOnceTaskResponse.TaskManageResponseList["+ i +"].DetailData"));
			taskManageResponse.setTaskStatusText(_ctx.stringValue("DescribeOnceTaskResponse.TaskManageResponseList["+ i +"].TaskStatusText"));
			taskManageResponse.setTaskName(_ctx.stringValue("DescribeOnceTaskResponse.TaskManageResponseList["+ i +"].TaskName"));
			taskManageResponse.setTaskStartTime(_ctx.longValue("DescribeOnceTaskResponse.TaskManageResponseList["+ i +"].TaskStartTime"));
			taskManageResponse.setTaskEndTime(_ctx.longValue("DescribeOnceTaskResponse.TaskManageResponseList["+ i +"].TaskEndTime"));
			taskManageResponse.setTaskId(_ctx.stringValue("DescribeOnceTaskResponse.TaskManageResponseList["+ i +"].TaskId"));

			taskManageResponseList.add(taskManageResponse);
		}
		describeOnceTaskResponse.setTaskManageResponseList(taskManageResponseList);
	 
	 	return describeOnceTaskResponse;
	}
}