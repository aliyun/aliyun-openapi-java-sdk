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

import com.aliyuncs.datalake.model.v20200710.GetBlueprintInstanceResponse;
import com.aliyuncs.datalake.model.v20200710.GetBlueprintInstanceResponse.BlueprintInstance;
import com.aliyuncs.datalake.model.v20200710.GetBlueprintInstanceResponse.BlueprintInstance.Workflow;
import com.aliyuncs.datalake.model.v20200710.GetBlueprintInstanceResponse.BlueprintInstance.WorkflowLastRunInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetBlueprintInstanceResponseUnmarshaller {

	public static GetBlueprintInstanceResponse unmarshall(GetBlueprintInstanceResponse getBlueprintInstanceResponse, UnmarshallerContext _ctx) {
		
		getBlueprintInstanceResponse.setRequestId(_ctx.stringValue("GetBlueprintInstanceResponse.RequestId"));
		getBlueprintInstanceResponse.setSuccess(_ctx.stringValue("GetBlueprintInstanceResponse.Success"));

		BlueprintInstance blueprintInstance = new BlueprintInstance();
		blueprintInstance.setBlueprintInstanceId(_ctx.stringValue("GetBlueprintInstanceResponse.BlueprintInstance.BlueprintInstanceId"));
		blueprintInstance.setBlueprintType(_ctx.stringValue("GetBlueprintInstanceResponse.BlueprintInstance.BlueprintType"));
		blueprintInstance.setCreator(_ctx.stringValue("GetBlueprintInstanceResponse.BlueprintInstance.Creator"));
		blueprintInstance.setWorkflowId(_ctx.stringValue("GetBlueprintInstanceResponse.BlueprintInstance.WorkflowId"));
		blueprintInstance.setWorkflowProjectId(_ctx.stringValue("GetBlueprintInstanceResponse.BlueprintInstance.WorkflowProjectId"));
		blueprintInstance.setExecuteCapacity(_ctx.longValue("GetBlueprintInstanceResponse.BlueprintInstance.ExecuteCapacity"));
		blueprintInstance.setExecuteParameters(_ctx.stringValue("GetBlueprintInstanceResponse.BlueprintInstance.ExecuteParameters"));
		blueprintInstance.setExecuteType(_ctx.stringValue("GetBlueprintInstanceResponse.BlueprintInstance.ExecuteType"));
		blueprintInstance.setName(_ctx.stringValue("GetBlueprintInstanceResponse.BlueprintInstance.Name"));
		blueprintInstance.setOwner(_ctx.stringValue("GetBlueprintInstanceResponse.BlueprintInstance.Owner"));
		blueprintInstance.setRegionId(_ctx.stringValue("GetBlueprintInstanceResponse.BlueprintInstance.RegionId"));
		blueprintInstance.setRoleName(_ctx.stringValue("GetBlueprintInstanceResponse.BlueprintInstance.RoleName"));
		blueprintInstance.setDataSourceConfig(_ctx.stringValue("GetBlueprintInstanceResponse.BlueprintInstance.DataSourceConfig"));
		blueprintInstance.setTargetDatabase(_ctx.stringValue("GetBlueprintInstanceResponse.BlueprintInstance.TargetDatabase"));
		blueprintInstance.setTargetFormat(_ctx.stringValue("GetBlueprintInstanceResponse.BlueprintInstance.TargetFormat"));
		blueprintInstance.setTargetLocationUri(_ctx.stringValue("GetBlueprintInstanceResponse.BlueprintInstance.TargetLocationUri"));
		blueprintInstance.setTargetTable(_ctx.stringValue("GetBlueprintInstanceResponse.BlueprintInstance.TargetTable"));
		blueprintInstance.setGmtCreate(_ctx.stringValue("GetBlueprintInstanceResponse.BlueprintInstance.GmtCreate"));
		blueprintInstance.setGmtModified(_ctx.stringValue("GetBlueprintInstanceResponse.BlueprintInstance.GmtModified"));
		blueprintInstance.setStatus(_ctx.integerValue("GetBlueprintInstanceResponse.BlueprintInstance.Status"));
		blueprintInstance.setFailureInfo(_ctx.stringValue("GetBlueprintInstanceResponse.BlueprintInstance.FailureInfo"));
		blueprintInstance.setPreProcessingConfig(_ctx.stringValue("GetBlueprintInstanceResponse.BlueprintInstance.PreProcessingConfig"));
		blueprintInstance.setTargetPartitions(_ctx.stringValue("GetBlueprintInstanceResponse.BlueprintInstance.TargetPartitions"));

		WorkflowLastRunInstance workflowLastRunInstance = new WorkflowLastRunInstance();
		workflowLastRunInstance.setClusterId(_ctx.stringValue("GetBlueprintInstanceResponse.BlueprintInstance.WorkflowLastRunInstance.ClusterId"));
		workflowLastRunInstance.setDuration(_ctx.longValue("GetBlueprintInstanceResponse.BlueprintInstance.WorkflowLastRunInstance.Duration"));
		workflowLastRunInstance.setEndTime(_ctx.stringValue("GetBlueprintInstanceResponse.BlueprintInstance.WorkflowLastRunInstance.EndTime"));
		workflowLastRunInstance.setFlowId(_ctx.stringValue("GetBlueprintInstanceResponse.BlueprintInstance.WorkflowLastRunInstance.FlowId"));
		workflowLastRunInstance.setFlowInstanceId(_ctx.stringValue("GetBlueprintInstanceResponse.BlueprintInstance.WorkflowLastRunInstance.FlowInstanceId"));
		workflowLastRunInstance.setFlowName(_ctx.stringValue("GetBlueprintInstanceResponse.BlueprintInstance.WorkflowLastRunInstance.FlowName"));
		workflowLastRunInstance.setProjectId(_ctx.stringValue("GetBlueprintInstanceResponse.BlueprintInstance.WorkflowLastRunInstance.ProjectId"));
		workflowLastRunInstance.setStartTime(_ctx.stringValue("GetBlueprintInstanceResponse.BlueprintInstance.WorkflowLastRunInstance.StartTime"));
		workflowLastRunInstance.setStatus(_ctx.stringValue("GetBlueprintInstanceResponse.BlueprintInstance.WorkflowLastRunInstance.Status"));
		workflowLastRunInstance.setFailureInfo(_ctx.stringValue("GetBlueprintInstanceResponse.BlueprintInstance.WorkflowLastRunInstance.FailureInfo"));
		blueprintInstance.setWorkflowLastRunInstance(workflowLastRunInstance);

		Workflow workflow = new Workflow();
		workflow.setWorkflowId(_ctx.stringValue("GetBlueprintInstanceResponse.BlueprintInstance.Workflow.WorkflowId"));
		workflow.setLatestInstanceStatus(_ctx.stringValue("GetBlueprintInstanceResponse.BlueprintInstance.Workflow.LatestInstanceStatus"));
		workflow.setLatestStartTime(_ctx.stringValue("GetBlueprintInstanceResponse.BlueprintInstance.Workflow.LatestStartTime"));
		workflow.setLatestEndTime(_ctx.stringValue("GetBlueprintInstanceResponse.BlueprintInstance.Workflow.LatestEndTime"));
		blueprintInstance.setWorkflow(workflow);
		getBlueprintInstanceResponse.setBlueprintInstance(blueprintInstance);
	 
	 	return getBlueprintInstanceResponse;
	}
}