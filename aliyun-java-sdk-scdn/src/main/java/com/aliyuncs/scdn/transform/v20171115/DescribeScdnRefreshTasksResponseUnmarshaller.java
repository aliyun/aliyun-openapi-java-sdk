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

package com.aliyuncs.scdn.transform.v20171115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.scdn.model.v20171115.DescribeScdnRefreshTasksResponse;
import com.aliyuncs.scdn.model.v20171115.DescribeScdnRefreshTasksResponse.Task;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScdnRefreshTasksResponseUnmarshaller {

	public static DescribeScdnRefreshTasksResponse unmarshall(DescribeScdnRefreshTasksResponse describeScdnRefreshTasksResponse, UnmarshallerContext _ctx) {
		
		describeScdnRefreshTasksResponse.setRequestId(_ctx.stringValue("DescribeScdnRefreshTasksResponse.RequestId"));
		describeScdnRefreshTasksResponse.setPageNumber(_ctx.longValue("DescribeScdnRefreshTasksResponse.PageNumber"));
		describeScdnRefreshTasksResponse.setPageSize(_ctx.longValue("DescribeScdnRefreshTasksResponse.PageSize"));
		describeScdnRefreshTasksResponse.setTotalCount(_ctx.longValue("DescribeScdnRefreshTasksResponse.TotalCount"));

		List<Task> tasks = new ArrayList<Task>();
		for (int i = 0; i < _ctx.lengthValue("DescribeScdnRefreshTasksResponse.Tasks.Length"); i++) {
			Task task = new Task();
			task.setTaskId(_ctx.stringValue("DescribeScdnRefreshTasksResponse.Tasks["+ i +"].TaskId"));
			task.setObjectPath(_ctx.stringValue("DescribeScdnRefreshTasksResponse.Tasks["+ i +"].ObjectPath"));
			task.setProcess(_ctx.stringValue("DescribeScdnRefreshTasksResponse.Tasks["+ i +"].Process"));
			task.setStatus(_ctx.stringValue("DescribeScdnRefreshTasksResponse.Tasks["+ i +"].Status"));
			task.setCreationTime(_ctx.stringValue("DescribeScdnRefreshTasksResponse.Tasks["+ i +"].CreationTime"));
			task.setDescription(_ctx.stringValue("DescribeScdnRefreshTasksResponse.Tasks["+ i +"].Description"));
			task.setObjectType(_ctx.stringValue("DescribeScdnRefreshTasksResponse.Tasks["+ i +"].ObjectType"));

			tasks.add(task);
		}
		describeScdnRefreshTasksResponse.setTasks(tasks);
	 
	 	return describeScdnRefreshTasksResponse;
	}
}