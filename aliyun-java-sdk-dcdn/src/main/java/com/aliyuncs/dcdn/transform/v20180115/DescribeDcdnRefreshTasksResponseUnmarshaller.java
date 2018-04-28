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

	public static DescribeDcdnRefreshTasksResponse unmarshall(DescribeDcdnRefreshTasksResponse describeDcdnRefreshTasksResponse, UnmarshallerContext context) {
		
		describeDcdnRefreshTasksResponse.setRequestId(context.stringValue("DescribeDcdnRefreshTasksResponse.RequestId"));
		describeDcdnRefreshTasksResponse.setPageNumber(context.longValue("DescribeDcdnRefreshTasksResponse.PageNumber"));
		describeDcdnRefreshTasksResponse.setPageSize(context.longValue("DescribeDcdnRefreshTasksResponse.PageSize"));
		describeDcdnRefreshTasksResponse.setTotalCount(context.longValue("DescribeDcdnRefreshTasksResponse.TotalCount"));

		List<Task> tasks = new ArrayList<Task>();
		for (int i = 0; i < context.lengthValue("DescribeDcdnRefreshTasksResponse.Tasks.Length"); i++) {
			Task task = new Task();
			task.setTaskId(context.stringValue("DescribeDcdnRefreshTasksResponse.Tasks["+ i +"].TaskId"));
			task.setObjectPath(context.stringValue("DescribeDcdnRefreshTasksResponse.Tasks["+ i +"].ObjectPath"));
			task.setProcess(context.stringValue("DescribeDcdnRefreshTasksResponse.Tasks["+ i +"].Process"));
			task.setStatus(context.stringValue("DescribeDcdnRefreshTasksResponse.Tasks["+ i +"].Status"));
			task.setCreationTime(context.stringValue("DescribeDcdnRefreshTasksResponse.Tasks["+ i +"].CreationTime"));
			task.setDescription(context.stringValue("DescribeDcdnRefreshTasksResponse.Tasks["+ i +"].Description"));
			task.setObjectType(context.stringValue("DescribeDcdnRefreshTasksResponse.Tasks["+ i +"].ObjectType"));

			tasks.add(task);
		}
		describeDcdnRefreshTasksResponse.setTasks(tasks);
	 
	 	return describeDcdnRefreshTasksResponse;
	}
}