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

package com.aliyuncs.cs.transform.v20151215;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cs.model.v20151215.DescribeClusterTasksResponse;
import com.aliyuncs.cs.model.v20151215.DescribeClusterTasksResponse.Page_info;
import com.aliyuncs.cs.model.v20151215.DescribeClusterTasksResponse.Task;
import com.aliyuncs.cs.model.v20151215.DescribeClusterTasksResponse.Task.Error;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClusterTasksResponseUnmarshaller {

	public static DescribeClusterTasksResponse unmarshall(DescribeClusterTasksResponse describeClusterTasksResponse, UnmarshallerContext _ctx) {
		
		describeClusterTasksResponse.setRequestId(_ctx.stringValue("DescribeClusterTasksResponse.requestId"));

		Page_info page_info = new Page_info();
		page_info.setPage_size(_ctx.longValue("DescribeClusterTasksResponse.page_info.page_size"));
		page_info.setPage_number(_ctx.longValue("DescribeClusterTasksResponse.page_info.page_number"));
		page_info.setTotal_count(_ctx.longValue("DescribeClusterTasksResponse.page_info.total_count"));
		describeClusterTasksResponse.setPage_info(page_info);

		List<Task> tasks = new ArrayList<Task>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterTasksResponse.tasks.Length"); i++) {
			Task task = new Task();
			task.setTask_id(_ctx.stringValue("DescribeClusterTasksResponse.tasks["+ i +"].task_id"));
			task.setTask_type(_ctx.stringValue("DescribeClusterTasksResponse.tasks["+ i +"].task_type"));
			task.setState(_ctx.stringValue("DescribeClusterTasksResponse.tasks["+ i +"].state"));
			task.setCreated(_ctx.stringValue("DescribeClusterTasksResponse.tasks["+ i +"].created"));
			task.setUpdated(_ctx.stringValue("DescribeClusterTasksResponse.tasks["+ i +"].updated"));

			Error error = new Error();
			error.setMessage(_ctx.stringValue("DescribeClusterTasksResponse.tasks["+ i +"].error.message"));
			error.setCode(_ctx.stringValue("DescribeClusterTasksResponse.tasks["+ i +"].error.code"));
			task.setError(error);

			tasks.add(task);
		}
		describeClusterTasksResponse.setTasks(tasks);
	 
	 	return describeClusterTasksResponse;
	}
}