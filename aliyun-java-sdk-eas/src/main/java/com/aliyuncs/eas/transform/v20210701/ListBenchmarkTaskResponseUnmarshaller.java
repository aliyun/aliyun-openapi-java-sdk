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

package com.aliyuncs.eas.transform.v20210701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eas.model.v20210701.ListBenchmarkTaskResponse;
import com.aliyuncs.eas.model.v20210701.ListBenchmarkTaskResponse.Task;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListBenchmarkTaskResponseUnmarshaller {

	public static ListBenchmarkTaskResponse unmarshall(ListBenchmarkTaskResponse listBenchmarkTaskResponse, UnmarshallerContext _ctx) {
		
		listBenchmarkTaskResponse.setRequestId(_ctx.stringValue("ListBenchmarkTaskResponse.RequestId"));
		listBenchmarkTaskResponse.setTotalCount(_ctx.integerValue("ListBenchmarkTaskResponse.TotalCount"));
		listBenchmarkTaskResponse.setPageNumber(_ctx.integerValue("ListBenchmarkTaskResponse.PageNumber"));
		listBenchmarkTaskResponse.setPageSize(_ctx.integerValue("ListBenchmarkTaskResponse.PageSize"));

		List<Task> tasks = new ArrayList<Task>();
		for (int i = 0; i < _ctx.lengthValue("ListBenchmarkTaskResponse.Tasks.Length"); i++) {
			Task task = new Task();
			task.setTaskName(_ctx.stringValue("ListBenchmarkTaskResponse.Tasks["+ i +"].TaskName"));
			task.setTaskId(_ctx.stringValue("ListBenchmarkTaskResponse.Tasks["+ i +"].TaskId"));
			task.setServiceName(_ctx.stringValue("ListBenchmarkTaskResponse.Tasks["+ i +"].ServiceName"));
			task.setRegion(_ctx.stringValue("ListBenchmarkTaskResponse.Tasks["+ i +"].Region"));
			task.setAvailableAgent(_ctx.longValue("ListBenchmarkTaskResponse.Tasks["+ i +"].AvailableAgent"));
			task.setStatus(_ctx.stringValue("ListBenchmarkTaskResponse.Tasks["+ i +"].Status"));
			task.setMessage(_ctx.stringValue("ListBenchmarkTaskResponse.Tasks["+ i +"].Message"));
			task.setCreateTime(_ctx.stringValue("ListBenchmarkTaskResponse.Tasks["+ i +"].CreateTime"));
			task.setUpdateTime(_ctx.stringValue("ListBenchmarkTaskResponse.Tasks["+ i +"].UpdateTime"));

			tasks.add(task);
		}
		listBenchmarkTaskResponse.setTasks(tasks);
	 
	 	return listBenchmarkTaskResponse;
	}
}