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

package com.aliyuncs.sgw.transform.v20180511;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sgw.model.v20180511.DescribeCSGClientTasksResponse;
import com.aliyuncs.sgw.model.v20180511.DescribeCSGClientTasksResponse.Task;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCSGClientTasksResponseUnmarshaller {

	public static DescribeCSGClientTasksResponse unmarshall(DescribeCSGClientTasksResponse describeCSGClientTasksResponse, UnmarshallerContext _ctx) {
		
		describeCSGClientTasksResponse.setRequestId(_ctx.stringValue("DescribeCSGClientTasksResponse.RequestId"));
		describeCSGClientTasksResponse.setSuccess(_ctx.booleanValue("DescribeCSGClientTasksResponse.Success"));
		describeCSGClientTasksResponse.setCode(_ctx.stringValue("DescribeCSGClientTasksResponse.Code"));
		describeCSGClientTasksResponse.setMessage(_ctx.stringValue("DescribeCSGClientTasksResponse.Message"));
		describeCSGClientTasksResponse.setPageSize(_ctx.integerValue("DescribeCSGClientTasksResponse.PageSize"));
		describeCSGClientTasksResponse.setPageNumber(_ctx.integerValue("DescribeCSGClientTasksResponse.PageNumber"));
		describeCSGClientTasksResponse.setTotalCount(_ctx.integerValue("DescribeCSGClientTasksResponse.TotalCount"));

		List<Task> tasks = new ArrayList<Task>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCSGClientTasksResponse.Tasks.Length"); i++) {
			Task task = new Task();
			task.setStateCode(_ctx.stringValue("DescribeCSGClientTasksResponse.Tasks["+ i +"].StateCode"));
			task.setProgress(_ctx.integerValue("DescribeCSGClientTasksResponse.Tasks["+ i +"].Progress"));
			task.setMessageParams(_ctx.stringValue("DescribeCSGClientTasksResponse.Tasks["+ i +"].MessageParams"));
			task.setUpdatedTime(_ctx.longValue("DescribeCSGClientTasksResponse.Tasks["+ i +"].UpdatedTime"));
			task.setMessageKey(_ctx.stringValue("DescribeCSGClientTasksResponse.Tasks["+ i +"].MessageKey"));
			task.setName(_ctx.stringValue("DescribeCSGClientTasksResponse.Tasks["+ i +"].Name"));
			task.setTaskId(_ctx.stringValue("DescribeCSGClientTasksResponse.Tasks["+ i +"].TaskId"));
			task.setCreatedTime(_ctx.longValue("DescribeCSGClientTasksResponse.Tasks["+ i +"].CreatedTime"));

			tasks.add(task);
		}
		describeCSGClientTasksResponse.setTasks(tasks);
	 
	 	return describeCSGClientTasksResponse;
	}
}