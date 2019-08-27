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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.ListExecutionPlanInstancesResponse;
import com.aliyuncs.emr.model.v20160408.ListExecutionPlanInstancesResponse.ExecutionPlanInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListExecutionPlanInstancesResponseUnmarshaller {

	public static ListExecutionPlanInstancesResponse unmarshall(ListExecutionPlanInstancesResponse listExecutionPlanInstancesResponse, UnmarshallerContext _ctx) {
		
		listExecutionPlanInstancesResponse.setRequestId(_ctx.stringValue("ListExecutionPlanInstancesResponse.RequestId"));
		listExecutionPlanInstancesResponse.setTotalCount(_ctx.integerValue("ListExecutionPlanInstancesResponse.TotalCount"));
		listExecutionPlanInstancesResponse.setPageNumber(_ctx.integerValue("ListExecutionPlanInstancesResponse.PageNumber"));
		listExecutionPlanInstancesResponse.setPageSize(_ctx.integerValue("ListExecutionPlanInstancesResponse.PageSize"));

		List<ExecutionPlanInstance> executionPlanInstances = new ArrayList<ExecutionPlanInstance>();
		for (int i = 0; i < _ctx.lengthValue("ListExecutionPlanInstancesResponse.ExecutionPlanInstances.Length"); i++) {
			ExecutionPlanInstance executionPlanInstance = new ExecutionPlanInstance();
			executionPlanInstance.setId(_ctx.stringValue("ListExecutionPlanInstancesResponse.ExecutionPlanInstances["+ i +"].Id"));
			executionPlanInstance.setExecutionPlanId(_ctx.stringValue("ListExecutionPlanInstancesResponse.ExecutionPlanInstances["+ i +"].ExecutionPlanId"));
			executionPlanInstance.setExecutionPlanName(_ctx.stringValue("ListExecutionPlanInstancesResponse.ExecutionPlanInstances["+ i +"].ExecutionPlanName"));
			executionPlanInstance.setStartTime(_ctx.longValue("ListExecutionPlanInstancesResponse.ExecutionPlanInstances["+ i +"].StartTime"));
			executionPlanInstance.setRunTime(_ctx.integerValue("ListExecutionPlanInstancesResponse.ExecutionPlanInstances["+ i +"].RunTime"));
			executionPlanInstance.setClusterId(_ctx.stringValue("ListExecutionPlanInstancesResponse.ExecutionPlanInstances["+ i +"].ClusterId"));
			executionPlanInstance.setClusterName(_ctx.stringValue("ListExecutionPlanInstancesResponse.ExecutionPlanInstances["+ i +"].ClusterName"));
			executionPlanInstance.setClusterType(_ctx.stringValue("ListExecutionPlanInstancesResponse.ExecutionPlanInstances["+ i +"].ClusterType"));
			executionPlanInstance.setStatus(_ctx.stringValue("ListExecutionPlanInstancesResponse.ExecutionPlanInstances["+ i +"].Status"));
			executionPlanInstance.setLogEnable(_ctx.booleanValue("ListExecutionPlanInstancesResponse.ExecutionPlanInstances["+ i +"].LogEnable"));
			executionPlanInstance.setLogPath(_ctx.stringValue("ListExecutionPlanInstancesResponse.ExecutionPlanInstances["+ i +"].LogPath"));
			executionPlanInstance.setWorkflowApp(_ctx.stringValue("ListExecutionPlanInstancesResponse.ExecutionPlanInstances["+ i +"].WorkflowApp"));

			executionPlanInstances.add(executionPlanInstance);
		}
		listExecutionPlanInstancesResponse.setExecutionPlanInstances(executionPlanInstances);
	 
	 	return listExecutionPlanInstancesResponse;
	}
}