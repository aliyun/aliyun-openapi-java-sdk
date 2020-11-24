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

package com.aliyuncs.ddoscoo.transform.v20200101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ddoscoo.model.v20200101.DescribeAsyncTasksResponse;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeAsyncTasksResponse.AsyncTask;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAsyncTasksResponseUnmarshaller {

	public static DescribeAsyncTasksResponse unmarshall(DescribeAsyncTasksResponse describeAsyncTasksResponse, UnmarshallerContext _ctx) {
		
		describeAsyncTasksResponse.setRequestId(_ctx.stringValue("DescribeAsyncTasksResponse.RequestId"));
		describeAsyncTasksResponse.setTotalCount(_ctx.integerValue("DescribeAsyncTasksResponse.TotalCount"));

		List<AsyncTask> asyncTasks = new ArrayList<AsyncTask>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAsyncTasksResponse.AsyncTasks.Length"); i++) {
			AsyncTask asyncTask = new AsyncTask();
			asyncTask.setTaskId(_ctx.longValue("DescribeAsyncTasksResponse.AsyncTasks["+ i +"].TaskId"));
			asyncTask.setEndTime(_ctx.longValue("DescribeAsyncTasksResponse.AsyncTasks["+ i +"].EndTime"));
			asyncTask.setStartTime(_ctx.longValue("DescribeAsyncTasksResponse.AsyncTasks["+ i +"].StartTime"));
			asyncTask.setTaskStatus(_ctx.integerValue("DescribeAsyncTasksResponse.AsyncTasks["+ i +"].TaskStatus"));
			asyncTask.setTaskResult(_ctx.stringValue("DescribeAsyncTasksResponse.AsyncTasks["+ i +"].TaskResult"));
			asyncTask.setTaskParams(_ctx.stringValue("DescribeAsyncTasksResponse.AsyncTasks["+ i +"].TaskParams"));
			asyncTask.setTaskType(_ctx.integerValue("DescribeAsyncTasksResponse.AsyncTasks["+ i +"].TaskType"));

			asyncTasks.add(asyncTask);
		}
		describeAsyncTasksResponse.setAsyncTasks(asyncTasks);
	 
	 	return describeAsyncTasksResponse;
	}
}