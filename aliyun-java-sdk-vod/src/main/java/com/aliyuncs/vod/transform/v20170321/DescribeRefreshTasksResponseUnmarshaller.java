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

package com.aliyuncs.vod.transform.v20170321;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vod.model.v20170321.DescribeRefreshTasksResponse;
import com.aliyuncs.vod.model.v20170321.DescribeRefreshTasksResponse.Task;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRefreshTasksResponseUnmarshaller {

	public static DescribeRefreshTasksResponse unmarshall(DescribeRefreshTasksResponse describeRefreshTasksResponse, UnmarshallerContext context) {
		
		describeRefreshTasksResponse.setRequestId(context.stringValue("DescribeRefreshTasksResponse.RequestId"));
		describeRefreshTasksResponse.setPageSize(context.integerValue("DescribeRefreshTasksResponse.PageSize"));
		describeRefreshTasksResponse.setPageNumber(context.integerValue("DescribeRefreshTasksResponse.PageNumber"));
		describeRefreshTasksResponse.setTotalCount(context.integerValue("DescribeRefreshTasksResponse.TotalCount"));

		List<Task> tasks = new ArrayList<Task>();
		for (int i = 0; i < context.lengthValue("DescribeRefreshTasksResponse.Tasks.Length"); i++) {
			Task task = new Task();
			task.setTaskId(context.stringValue("DescribeRefreshTasksResponse.Tasks["+ i +"].TaskId"));
			task.setObjectPath(context.stringValue("DescribeRefreshTasksResponse.Tasks["+ i +"].ObjectPath"));
			task.setStatus(context.stringValue("DescribeRefreshTasksResponse.Tasks["+ i +"].Status"));
			task.setProcess(context.stringValue("DescribeRefreshTasksResponse.Tasks["+ i +"].Process"));
			task.setObjectType(context.stringValue("DescribeRefreshTasksResponse.Tasks["+ i +"].ObjectType"));
			task.setCreationTime(context.stringValue("DescribeRefreshTasksResponse.Tasks["+ i +"].CreationTime"));
			task.setDescription(context.stringValue("DescribeRefreshTasksResponse.Tasks["+ i +"].Description"));

			tasks.add(task);
		}
		describeRefreshTasksResponse.setTasks(tasks);
	 
	 	return describeRefreshTasksResponse;
	}
}