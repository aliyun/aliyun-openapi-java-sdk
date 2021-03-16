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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeFleetTasksResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeFleetTasksResponse.Task;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeFleetTasksResponseUnmarshaller {

	public static OpsDescribeFleetTasksResponse unmarshall(OpsDescribeFleetTasksResponse opsDescribeFleetTasksResponse, UnmarshallerContext _ctx) {
		
		opsDescribeFleetTasksResponse.setRequestId(_ctx.stringValue("OpsDescribeFleetTasksResponse.RequestId"));
		opsDescribeFleetTasksResponse.setTotalCount(_ctx.integerValue("OpsDescribeFleetTasksResponse.TotalCount"));
		opsDescribeFleetTasksResponse.setPageNumber(_ctx.integerValue("OpsDescribeFleetTasksResponse.PageNumber"));
		opsDescribeFleetTasksResponse.setPageSize(_ctx.integerValue("OpsDescribeFleetTasksResponse.PageSize"));

		List<Task> tasks = new ArrayList<Task>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeFleetTasksResponse.Tasks.Length"); i++) {
			Task task = new Task();
			task.setId(_ctx.longValue("OpsDescribeFleetTasksResponse.Tasks["+ i +"].Id"));
			task.setAliUid(_ctx.longValue("OpsDescribeFleetTasksResponse.Tasks["+ i +"].AliUid"));
			task.setFleetId(_ctx.stringValue("OpsDescribeFleetTasksResponse.Tasks["+ i +"].FleetId"));
			task.setFleetTaskId(_ctx.stringValue("OpsDescribeFleetTasksResponse.Tasks["+ i +"].FleetTaskId"));
			task.setStatus(_ctx.stringValue("OpsDescribeFleetTasksResponse.Tasks["+ i +"].Status"));
			task.setResult(_ctx.stringValue("OpsDescribeFleetTasksResponse.Tasks["+ i +"].Result"));

			tasks.add(task);
		}
		opsDescribeFleetTasksResponse.setTasks(tasks);
	 
	 	return opsDescribeFleetTasksResponse;
	}
}