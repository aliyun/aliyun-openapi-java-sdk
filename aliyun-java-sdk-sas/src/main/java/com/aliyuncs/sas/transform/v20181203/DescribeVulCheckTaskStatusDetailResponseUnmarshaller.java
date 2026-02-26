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

import com.aliyuncs.sas.model.v20181203.DescribeVulCheckTaskStatusDetailResponse;
import com.aliyuncs.sas.model.v20181203.DescribeVulCheckTaskStatusDetailResponse.TaskStatus;
import com.aliyuncs.sas.model.v20181203.DescribeVulCheckTaskStatusDetailResponse.TaskStatus.StatusItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVulCheckTaskStatusDetailResponseUnmarshaller {

	public static DescribeVulCheckTaskStatusDetailResponse unmarshall(DescribeVulCheckTaskStatusDetailResponse describeVulCheckTaskStatusDetailResponse, UnmarshallerContext _ctx) {
		
		describeVulCheckTaskStatusDetailResponse.setRequestId(_ctx.stringValue("DescribeVulCheckTaskStatusDetailResponse.RequestId"));
		describeVulCheckTaskStatusDetailResponse.setTotalCount(_ctx.integerValue("DescribeVulCheckTaskStatusDetailResponse.TotalCount"));

		List<TaskStatus> taskStatuses = new ArrayList<TaskStatus>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVulCheckTaskStatusDetailResponse.TaskStatuses.Length"); i++) {
			TaskStatus taskStatus = new TaskStatus();
			taskStatus.setTaskId(_ctx.stringValue("DescribeVulCheckTaskStatusDetailResponse.TaskStatuses["+ i +"].TaskId"));

			List<StatusItem> taskStatusList = new ArrayList<StatusItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeVulCheckTaskStatusDetailResponse.TaskStatuses["+ i +"].TaskStatusList.Length"); j++) {
				StatusItem statusItem = new StatusItem();
				statusItem.setType(_ctx.stringValue("DescribeVulCheckTaskStatusDetailResponse.TaskStatuses["+ i +"].TaskStatusList["+ j +"].Type"));
				statusItem.setStatus(_ctx.stringValue("DescribeVulCheckTaskStatusDetailResponse.TaskStatuses["+ i +"].TaskStatusList["+ j +"].Status"));
				statusItem.setCode(_ctx.stringValue("DescribeVulCheckTaskStatusDetailResponse.TaskStatuses["+ i +"].TaskStatusList["+ j +"].Code"));

				taskStatusList.add(statusItem);
			}
			taskStatus.setTaskStatusList(taskStatusList);

			taskStatuses.add(taskStatus);
		}
		describeVulCheckTaskStatusDetailResponse.setTaskStatuses(taskStatuses);
	 
	 	return describeVulCheckTaskStatusDetailResponse;
	}
}