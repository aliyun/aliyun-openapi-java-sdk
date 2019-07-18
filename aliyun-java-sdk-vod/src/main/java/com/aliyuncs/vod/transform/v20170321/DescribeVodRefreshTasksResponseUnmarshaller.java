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

import com.aliyuncs.vod.model.v20170321.DescribeVodRefreshTasksResponse;
import com.aliyuncs.vod.model.v20170321.DescribeVodRefreshTasksResponse.Task;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVodRefreshTasksResponseUnmarshaller {

	public static DescribeVodRefreshTasksResponse unmarshall(DescribeVodRefreshTasksResponse describeVodRefreshTasksResponse, UnmarshallerContext _ctx) {
		
		describeVodRefreshTasksResponse.setRequestId(_ctx.stringValue("DescribeVodRefreshTasksResponse.RequestId"));
		describeVodRefreshTasksResponse.setPageNumber(_ctx.longValue("DescribeVodRefreshTasksResponse.PageNumber"));
		describeVodRefreshTasksResponse.setPageSize(_ctx.longValue("DescribeVodRefreshTasksResponse.PageSize"));
		describeVodRefreshTasksResponse.setTotalCount(_ctx.longValue("DescribeVodRefreshTasksResponse.TotalCount"));

		List<Task> tasks = new ArrayList<Task>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVodRefreshTasksResponse.Tasks.Length"); i++) {
			Task task = new Task();
			task.setTaskId(_ctx.stringValue("DescribeVodRefreshTasksResponse.Tasks["+ i +"].TaskId"));
			task.setObjectPath(_ctx.stringValue("DescribeVodRefreshTasksResponse.Tasks["+ i +"].ObjectPath"));
			task.setProcess(_ctx.stringValue("DescribeVodRefreshTasksResponse.Tasks["+ i +"].Process"));
			task.setStatus(_ctx.stringValue("DescribeVodRefreshTasksResponse.Tasks["+ i +"].Status"));
			task.setCreationTime(_ctx.stringValue("DescribeVodRefreshTasksResponse.Tasks["+ i +"].CreationTime"));
			task.setDescription(_ctx.stringValue("DescribeVodRefreshTasksResponse.Tasks["+ i +"].Description"));
			task.setObjectType(_ctx.stringValue("DescribeVodRefreshTasksResponse.Tasks["+ i +"].ObjectType"));

			tasks.add(task);
		}
		describeVodRefreshTasksResponse.setTasks(tasks);
	 
	 	return describeVodRefreshTasksResponse;
	}
}