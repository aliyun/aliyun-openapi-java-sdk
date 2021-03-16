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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribePlannedTasksResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribePlannedTasksResponse.PlannedTask;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribePlannedTasksResponseUnmarshaller {

	public static OpsDescribePlannedTasksResponse unmarshall(OpsDescribePlannedTasksResponse opsDescribePlannedTasksResponse, UnmarshallerContext _ctx) {
		
		opsDescribePlannedTasksResponse.setRequestId(_ctx.stringValue("OpsDescribePlannedTasksResponse.RequestId"));
		opsDescribePlannedTasksResponse.setTotalCount(_ctx.integerValue("OpsDescribePlannedTasksResponse.TotalCount"));
		opsDescribePlannedTasksResponse.setPageNumber(_ctx.integerValue("OpsDescribePlannedTasksResponse.PageNumber"));
		opsDescribePlannedTasksResponse.setPageSize(_ctx.integerValue("OpsDescribePlannedTasksResponse.PageSize"));

		List<PlannedTask> plannedTasks = new ArrayList<PlannedTask>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribePlannedTasksResponse.PlannedTasks.Length"); i++) {
			PlannedTask plannedTask = new PlannedTask();
			plannedTask.setId(_ctx.longValue("OpsDescribePlannedTasksResponse.PlannedTasks["+ i +"].Id"));
			plannedTask.setBid(_ctx.stringValue("OpsDescribePlannedTasksResponse.PlannedTasks["+ i +"].Bid"));
			plannedTask.setAliUid(_ctx.longValue("OpsDescribePlannedTasksResponse.PlannedTasks["+ i +"].AliUid"));
			plannedTask.setGmtCreate(_ctx.stringValue("OpsDescribePlannedTasksResponse.PlannedTasks["+ i +"].GmtCreate"));
			plannedTask.setGmtModified(_ctx.stringValue("OpsDescribePlannedTasksResponse.PlannedTasks["+ i +"].GmtModified"));
			plannedTask.setExpectedExecuteTime(_ctx.stringValue("OpsDescribePlannedTasksResponse.PlannedTasks["+ i +"].ExpectedExecuteTime"));
			plannedTask.setActionType(_ctx.integerValue("OpsDescribePlannedTasksResponse.PlannedTasks["+ i +"].ActionType"));
			plannedTask.setStatus(_ctx.integerValue("OpsDescribePlannedTasksResponse.PlannedTasks["+ i +"].Status"));
			plannedTask.setInstanceId(_ctx.stringValue("OpsDescribePlannedTasksResponse.PlannedTasks["+ i +"].InstanceId"));
			plannedTask.setExtendInfo(_ctx.stringValue("OpsDescribePlannedTasksResponse.PlannedTasks["+ i +"].ExtendInfo"));
			plannedTask.setDeleted(_ctx.booleanValue("OpsDescribePlannedTasksResponse.PlannedTasks["+ i +"].Deleted"));

			plannedTasks.add(plannedTask);
		}
		opsDescribePlannedTasksResponse.setPlannedTasks(plannedTasks);
	 
	 	return opsDescribePlannedTasksResponse;
	}
}