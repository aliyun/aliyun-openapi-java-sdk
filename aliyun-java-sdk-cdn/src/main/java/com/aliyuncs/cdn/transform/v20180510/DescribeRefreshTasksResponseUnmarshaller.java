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

package com.aliyuncs.cdn.transform.v20180510;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdn.model.v20180510.DescribeRefreshTasksResponse;
import com.aliyuncs.cdn.model.v20180510.DescribeRefreshTasksResponse.CDNTask;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRefreshTasksResponseUnmarshaller {

	public static DescribeRefreshTasksResponse unmarshall(DescribeRefreshTasksResponse describeRefreshTasksResponse, UnmarshallerContext context) {
		
		describeRefreshTasksResponse.setRequestId(context.stringValue("DescribeRefreshTasksResponse.RequestId"));
		describeRefreshTasksResponse.setPageNumber(context.longValue("DescribeRefreshTasksResponse.PageNumber"));
		describeRefreshTasksResponse.setPageSize(context.longValue("DescribeRefreshTasksResponse.PageSize"));
		describeRefreshTasksResponse.setTotalCount(context.longValue("DescribeRefreshTasksResponse.TotalCount"));

		List<CDNTask> tasks = new ArrayList<CDNTask>();
		for (int i = 0; i < context.lengthValue("DescribeRefreshTasksResponse.Tasks.Length"); i++) {
			CDNTask cDNTask = new CDNTask();
			cDNTask.setTaskId(context.stringValue("DescribeRefreshTasksResponse.Tasks["+ i +"].TaskId"));
			cDNTask.setObjectPath(context.stringValue("DescribeRefreshTasksResponse.Tasks["+ i +"].ObjectPath"));
			cDNTask.setProcess(context.stringValue("DescribeRefreshTasksResponse.Tasks["+ i +"].Process"));
			cDNTask.setStatus(context.stringValue("DescribeRefreshTasksResponse.Tasks["+ i +"].Status"));
			cDNTask.setCreationTime(context.stringValue("DescribeRefreshTasksResponse.Tasks["+ i +"].CreationTime"));
			cDNTask.setDescription(context.stringValue("DescribeRefreshTasksResponse.Tasks["+ i +"].Description"));
			cDNTask.setObjectType(context.stringValue("DescribeRefreshTasksResponse.Tasks["+ i +"].ObjectType"));

			tasks.add(cDNTask);
		}
		describeRefreshTasksResponse.setTasks(tasks);
	 
	 	return describeRefreshTasksResponse;
	}
}