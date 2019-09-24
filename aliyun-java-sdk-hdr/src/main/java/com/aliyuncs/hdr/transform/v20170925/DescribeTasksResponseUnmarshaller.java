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

package com.aliyuncs.hdr.transform.v20170925;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hdr.model.v20170925.DescribeTasksResponse;
import com.aliyuncs.hdr.model.v20170925.DescribeTasksResponse.Task;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTasksResponseUnmarshaller {

	public static DescribeTasksResponse unmarshall(DescribeTasksResponse describeTasksResponse, UnmarshallerContext _ctx) {
		
		describeTasksResponse.setRequestId(_ctx.stringValue("DescribeTasksResponse.RequestId"));
		describeTasksResponse.setSuccess(_ctx.booleanValue("DescribeTasksResponse.Success"));
		describeTasksResponse.setCode(_ctx.stringValue("DescribeTasksResponse.Code"));
		describeTasksResponse.setMessage(_ctx.stringValue("DescribeTasksResponse.Message"));
		describeTasksResponse.setTotalCount(_ctx.longValue("DescribeTasksResponse.TotalCount"));
		describeTasksResponse.setPageNumber(_ctx.integerValue("DescribeTasksResponse.PageNumber"));
		describeTasksResponse.setPageSize(_ctx.integerValue("DescribeTasksResponse.PageSize"));

		List<Task> tasks = new ArrayList<Task>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTasksResponse.Tasks.Length"); i++) {
			Task task = new Task();
			task.setTaskId(_ctx.stringValue("DescribeTasksResponse.Tasks["+ i +"].TaskId"));
			task.setTargetName(_ctx.stringValue("DescribeTasksResponse.Tasks["+ i +"].TargetName"));
			task.setName(_ctx.stringValue("DescribeTasksResponse.Tasks["+ i +"].Name"));
			task.setProgress(_ctx.integerValue("DescribeTasksResponse.Tasks["+ i +"].Progress"));
			task.setStatusCode(_ctx.stringValue("DescribeTasksResponse.Tasks["+ i +"].StatusCode"));
			task.setStatusParams(_ctx.stringValue("DescribeTasksResponse.Tasks["+ i +"].StatusParams"));
			task.setUpdatedTime(_ctx.longValue("DescribeTasksResponse.Tasks["+ i +"].UpdatedTime"));
			task.setCreatedTime(_ctx.longValue("DescribeTasksResponse.Tasks["+ i +"].CreatedTime"));

			tasks.add(task);
		}
		describeTasksResponse.setTasks(tasks);
	 
	 	return describeTasksResponse;
	}
}