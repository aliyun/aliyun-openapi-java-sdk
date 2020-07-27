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

import com.aliyuncs.cdn.model.v20180510.DescribeRefreshTaskByIdResponse;
import com.aliyuncs.cdn.model.v20180510.DescribeRefreshTaskByIdResponse.CDNTask;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRefreshTaskByIdResponseUnmarshaller {

	public static DescribeRefreshTaskByIdResponse unmarshall(DescribeRefreshTaskByIdResponse describeRefreshTaskByIdResponse, UnmarshallerContext _ctx) {
		
		describeRefreshTaskByIdResponse.setRequestId(_ctx.stringValue("DescribeRefreshTaskByIdResponse.RequestId"));
		describeRefreshTaskByIdResponse.setPageNumber(_ctx.longValue("DescribeRefreshTaskByIdResponse.PageNumber"));
		describeRefreshTaskByIdResponse.setPageSize(_ctx.longValue("DescribeRefreshTaskByIdResponse.PageSize"));
		describeRefreshTaskByIdResponse.setTotalCount(_ctx.longValue("DescribeRefreshTaskByIdResponse.TotalCount"));

		List<CDNTask> tasks = new ArrayList<CDNTask>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRefreshTaskByIdResponse.Tasks.Length"); i++) {
			CDNTask cDNTask = new CDNTask();
			cDNTask.setTaskId(_ctx.stringValue("DescribeRefreshTaskByIdResponse.Tasks["+ i +"].TaskId"));
			cDNTask.setObjectPath(_ctx.stringValue("DescribeRefreshTaskByIdResponse.Tasks["+ i +"].ObjectPath"));
			cDNTask.setProcess(_ctx.stringValue("DescribeRefreshTaskByIdResponse.Tasks["+ i +"].Process"));
			cDNTask.setStatus(_ctx.stringValue("DescribeRefreshTaskByIdResponse.Tasks["+ i +"].Status"));
			cDNTask.setCreationTime(_ctx.stringValue("DescribeRefreshTaskByIdResponse.Tasks["+ i +"].CreationTime"));
			cDNTask.setDescription(_ctx.stringValue("DescribeRefreshTaskByIdResponse.Tasks["+ i +"].Description"));
			cDNTask.setObjectType(_ctx.stringValue("DescribeRefreshTaskByIdResponse.Tasks["+ i +"].ObjectType"));

			tasks.add(cDNTask);
		}
		describeRefreshTaskByIdResponse.setTasks(tasks);
	 
	 	return describeRefreshTaskByIdResponse;
	}
}