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

package com.aliyuncs.dcdn.transform.v20180115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnRefreshTasksResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnRefreshTasksResponse.Task;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnRefreshTasksResponseUnmarshaller {

	public static DescribeDcdnRefreshTasksResponse unmarshall(DescribeDcdnRefreshTasksResponse describeDcdnRefreshTasksResponse, UnmarshallerContext _ctx) {
		
		describeDcdnRefreshTasksResponse.setRequestId(_ctx.stringValue("DescribeDcdnRefreshTasksResponse.RequestId"));
		describeDcdnRefreshTasksResponse.setPageNumber(_ctx.longValue("DescribeDcdnRefreshTasksResponse.PageNumber"));
		describeDcdnRefreshTasksResponse.setPageSize(_ctx.longValue("DescribeDcdnRefreshTasksResponse.PageSize"));
		describeDcdnRefreshTasksResponse.setTotalCount(_ctx.longValue("DescribeDcdnRefreshTasksResponse.TotalCount"));

		List<Task> tasks = new ArrayList<Task>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnRefreshTasksResponse.Tasks.Length"); i++) {
			Task task = new Task();
			task.setTaskId(_ctx.stringValue("DescribeDcdnRefreshTasksResponse.Tasks["+ i +"].TaskId"));
			task.setObjectPath(_ctx.stringValue("DescribeDcdnRefreshTasksResponse.Tasks["+ i +"].ObjectPath"));
			task.setProcess(_ctx.stringValue("DescribeDcdnRefreshTasksResponse.Tasks["+ i +"].Process"));
			task.setStatus(_ctx.stringValue("DescribeDcdnRefreshTasksResponse.Tasks["+ i +"].Status"));
			task.setCreationTime(_ctx.stringValue("DescribeDcdnRefreshTasksResponse.Tasks["+ i +"].CreationTime"));
			task.setDescription(_ctx.stringValue("DescribeDcdnRefreshTasksResponse.Tasks["+ i +"].Description"));
			task.setObjectType(_ctx.stringValue("DescribeDcdnRefreshTasksResponse.Tasks["+ i +"].ObjectType"));

			tasks.add(task);
		}
		describeDcdnRefreshTasksResponse.setTasks(tasks);
	 
	 	return describeDcdnRefreshTasksResponse;
	}
}