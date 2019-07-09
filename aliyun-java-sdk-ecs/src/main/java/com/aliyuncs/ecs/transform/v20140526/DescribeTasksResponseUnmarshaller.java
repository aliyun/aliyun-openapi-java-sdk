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

package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeTasksResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeTasksResponse.Task;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTasksResponseUnmarshaller {

	public static DescribeTasksResponse unmarshall(DescribeTasksResponse describeTasksResponse, UnmarshallerContext _ctx) {
		
		describeTasksResponse.setRequestId(_ctx.stringValue("DescribeTasksResponse.RequestId"));
		describeTasksResponse.setRegionId(_ctx.stringValue("DescribeTasksResponse.RegionId"));
		describeTasksResponse.setTotalCount(_ctx.integerValue("DescribeTasksResponse.TotalCount"));
		describeTasksResponse.setPageNumber(_ctx.integerValue("DescribeTasksResponse.PageNumber"));
		describeTasksResponse.setPageSize(_ctx.integerValue("DescribeTasksResponse.PageSize"));

		List<Task> taskSet = new ArrayList<Task>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTasksResponse.TaskSet.Length"); i++) {
			Task task = new Task();
			task.setTaskId(_ctx.stringValue("DescribeTasksResponse.TaskSet["+ i +"].TaskId"));
			task.setTaskAction(_ctx.stringValue("DescribeTasksResponse.TaskSet["+ i +"].TaskAction"));
			task.setTaskStatus(_ctx.stringValue("DescribeTasksResponse.TaskSet["+ i +"].TaskStatus"));
			task.setSupportCancel(_ctx.stringValue("DescribeTasksResponse.TaskSet["+ i +"].SupportCancel"));
			task.setCreationTime(_ctx.stringValue("DescribeTasksResponse.TaskSet["+ i +"].CreationTime"));
			task.setFinishedTime(_ctx.stringValue("DescribeTasksResponse.TaskSet["+ i +"].FinishedTime"));

			taskSet.add(task);
		}
		describeTasksResponse.setTaskSet(taskSet);
	 
	 	return describeTasksResponse;
	}
}