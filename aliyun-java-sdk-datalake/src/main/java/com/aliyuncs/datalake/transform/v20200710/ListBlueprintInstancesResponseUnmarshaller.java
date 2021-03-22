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

package com.aliyuncs.datalake.transform.v20200710;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.datalake.model.v20200710.ListBlueprintInstancesResponse;
import com.aliyuncs.datalake.model.v20200710.ListBlueprintInstancesResponse.BlueprintInstance;
import com.aliyuncs.datalake.model.v20200710.ListBlueprintInstancesResponse.BlueprintInstance.Workflow;
import com.aliyuncs.datalake.model.v20200710.ListBlueprintInstancesResponse.BlueprintInstance.WorkflowLastRunInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListBlueprintInstancesResponseUnmarshaller {

	public static ListBlueprintInstancesResponse unmarshall(ListBlueprintInstancesResponse listBlueprintInstancesResponse, UnmarshallerContext _ctx) {
		
		listBlueprintInstancesResponse.setRequestId(_ctx.stringValue("ListBlueprintInstancesResponse.RequestId"));
		listBlueprintInstancesResponse.setTotalCount(_ctx.integerValue("ListBlueprintInstancesResponse.TotalCount"));
		listBlueprintInstancesResponse.setSuccess(_ctx.booleanValue("ListBlueprintInstancesResponse.Success"));

		List<BlueprintInstance> blueprintInstances = new ArrayList<BlueprintInstance>();
		for (int i = 0; i < _ctx.lengthValue("ListBlueprintInstancesResponse.BlueprintInstances.Length"); i++) {
			BlueprintInstance blueprintInstance = new BlueprintInstance();
			blueprintInstance.setBlueprintInstanceId(_ctx.stringValue("ListBlueprintInstancesResponse.BlueprintInstances["+ i +"].BlueprintInstanceId"));
			blueprintInstance.setName(_ctx.stringValue("ListBlueprintInstancesResponse.BlueprintInstances["+ i +"].Name"));
			blueprintInstance.setRegionId(_ctx.stringValue("ListBlueprintInstancesResponse.BlueprintInstances["+ i +"].RegionId"));
			blueprintInstance.setBlueprintType(_ctx.stringValue("ListBlueprintInstancesResponse.BlueprintInstances["+ i +"].BlueprintType"));
			blueprintInstance.setDataSourceConfig(_ctx.stringValue("ListBlueprintInstancesResponse.BlueprintInstances["+ i +"].DataSourceConfig"));
			blueprintInstance.setTargetDatabase(_ctx.stringValue("ListBlueprintInstancesResponse.BlueprintInstances["+ i +"].TargetDatabase"));
			blueprintInstance.setTargetLocationUri(_ctx.stringValue("ListBlueprintInstancesResponse.BlueprintInstances["+ i +"].TargetLocationUri"));
			blueprintInstance.setTargetFormat(_ctx.stringValue("ListBlueprintInstancesResponse.BlueprintInstances["+ i +"].TargetFormat"));
			blueprintInstance.setTargetTable(_ctx.stringValue("ListBlueprintInstancesResponse.BlueprintInstances["+ i +"].TargetTable"));
			blueprintInstance.setExecuteType(_ctx.stringValue("ListBlueprintInstancesResponse.BlueprintInstances["+ i +"].ExecuteType"));
			blueprintInstance.setExecuteParameters(_ctx.stringValue("ListBlueprintInstancesResponse.BlueprintInstances["+ i +"].ExecuteParameters"));
			blueprintInstance.setExecuteCapacity(_ctx.stringValue("ListBlueprintInstancesResponse.BlueprintInstances["+ i +"].ExecuteCapacity"));
			blueprintInstance.setRoleName(_ctx.stringValue("ListBlueprintInstancesResponse.BlueprintInstances["+ i +"].RoleName"));
			blueprintInstance.setWorkflowId(_ctx.stringValue("ListBlueprintInstancesResponse.BlueprintInstances["+ i +"].WorkflowId"));
			blueprintInstance.setWorkflowProjectId(_ctx.stringValue("ListBlueprintInstancesResponse.BlueprintInstances["+ i +"].WorkflowProjectId"));
			blueprintInstance.setCreator(_ctx.longValue("ListBlueprintInstancesResponse.BlueprintInstances["+ i +"].Creator"));
			blueprintInstance.setOwner(_ctx.longValue("ListBlueprintInstancesResponse.BlueprintInstances["+ i +"].Owner"));
			blueprintInstance.setGmtModified(_ctx.stringValue("ListBlueprintInstancesResponse.BlueprintInstances["+ i +"].GmtModified"));
			blueprintInstance.setGmtCreate(_ctx.stringValue("ListBlueprintInstancesResponse.BlueprintInstances["+ i +"].GmtCreate"));
			blueprintInstance.setStatus(_ctx.integerValue("ListBlueprintInstancesResponse.BlueprintInstances["+ i +"].Status"));
			blueprintInstance.setFailureInfo(_ctx.stringValue("ListBlueprintInstancesResponse.BlueprintInstances["+ i +"].FailureInfo"));
			blueprintInstance.setOffsetTime(_ctx.integerValue("ListBlueprintInstancesResponse.BlueprintInstances["+ i +"].OffsetTime"));
			blueprintInstance.setBatchProgress(_ctx.integerValue("ListBlueprintInstancesResponse.BlueprintInstances["+ i +"].BatchProgress"));
			blueprintInstance.setTargetPartitions(_ctx.stringValue("ListBlueprintInstancesResponse.BlueprintInstances["+ i +"].TargetPartitions"));
			blueprintInstance.setCreatorLoginName(_ctx.stringValue("ListBlueprintInstancesResponse.BlueprintInstances["+ i +"].CreatorLoginName"));

			WorkflowLastRunInstance workflowLastRunInstance = new WorkflowLastRunInstance();
			workflowLastRunInstance.setFlowInstanceId(_ctx.stringValue("ListBlueprintInstancesResponse.BlueprintInstances["+ i +"].WorkflowLastRunInstance.FlowInstanceId"));
			workflowLastRunInstance.setFlowId(_ctx.stringValue("ListBlueprintInstancesResponse.BlueprintInstances["+ i +"].WorkflowLastRunInstance.FlowId"));
			workflowLastRunInstance.setFlowName(_ctx.stringValue("ListBlueprintInstancesResponse.BlueprintInstances["+ i +"].WorkflowLastRunInstance.FlowName"));
			workflowLastRunInstance.setDuration(_ctx.longValue("ListBlueprintInstancesResponse.BlueprintInstances["+ i +"].WorkflowLastRunInstance.Duration"));
			workflowLastRunInstance.setStartTime(_ctx.stringValue("ListBlueprintInstancesResponse.BlueprintInstances["+ i +"].WorkflowLastRunInstance.StartTime"));
			workflowLastRunInstance.setEndTime(_ctx.stringValue("ListBlueprintInstancesResponse.BlueprintInstances["+ i +"].WorkflowLastRunInstance.EndTime"));
			workflowLastRunInstance.setStatus(_ctx.stringValue("ListBlueprintInstancesResponse.BlueprintInstances["+ i +"].WorkflowLastRunInstance.Status"));
			workflowLastRunInstance.setProjectId(_ctx.stringValue("ListBlueprintInstancesResponse.BlueprintInstances["+ i +"].WorkflowLastRunInstance.ProjectId"));
			workflowLastRunInstance.setClusterId(_ctx.stringValue("ListBlueprintInstancesResponse.BlueprintInstances["+ i +"].WorkflowLastRunInstance.ClusterId"));
			workflowLastRunInstance.setFailureInfo(_ctx.stringValue("ListBlueprintInstancesResponse.BlueprintInstances["+ i +"].WorkflowLastRunInstance.FailureInfo"));
			workflowLastRunInstance.setOffsetTime(_ctx.integerValue("ListBlueprintInstancesResponse.BlueprintInstances["+ i +"].WorkflowLastRunInstance.OffsetTime"));
			workflowLastRunInstance.setBatchProgress(_ctx.integerValue("ListBlueprintInstancesResponse.BlueprintInstances["+ i +"].WorkflowLastRunInstance.BatchProgress"));
			blueprintInstance.setWorkflowLastRunInstance(workflowLastRunInstance);

			Workflow workflow = new Workflow();
			workflow.setWorkflowId(_ctx.stringValue("ListBlueprintInstancesResponse.BlueprintInstances["+ i +"].Workflow.WorkflowId"));
			workflow.setLatestInstanceStatus(_ctx.stringValue("ListBlueprintInstancesResponse.BlueprintInstances["+ i +"].Workflow.LatestInstanceStatus"));
			workflow.setLatestStartTime(_ctx.stringValue("ListBlueprintInstancesResponse.BlueprintInstances["+ i +"].Workflow.LatestStartTime"));
			workflow.setLatestEndTime(_ctx.stringValue("ListBlueprintInstancesResponse.BlueprintInstances["+ i +"].Workflow.LatestEndTime"));
			blueprintInstance.setWorkflow(workflow);

			blueprintInstances.add(blueprintInstance);
		}
		listBlueprintInstancesResponse.setBlueprintInstances(blueprintInstances);
	 
	 	return listBlueprintInstancesResponse;
	}
}