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

import com.aliyuncs.datalake.model.v20200710.GetMetastoreMigrationResponse;
import com.aliyuncs.datalake.model.v20200710.GetMetastoreMigrationResponse.Data;
import com.aliyuncs.datalake.model.v20200710.GetMetastoreMigrationResponse.Data.WorkflowLastRunInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMetastoreMigrationResponseUnmarshaller {

	public static GetMetastoreMigrationResponse unmarshall(GetMetastoreMigrationResponse getMetastoreMigrationResponse, UnmarshallerContext _ctx) {
		
		getMetastoreMigrationResponse.setRequestId(_ctx.stringValue("GetMetastoreMigrationResponse.RequestId"));
		getMetastoreMigrationResponse.setSuccess(_ctx.booleanValue("GetMetastoreMigrationResponse.Success"));

		Data data = new Data();
		data.setInstanceId(_ctx.stringValue("GetMetastoreMigrationResponse.Data.InstanceId"));
		data.setName(_ctx.stringValue("GetMetastoreMigrationResponse.Data.Name"));
		data.setDesc(_ctx.stringValue("GetMetastoreMigrationResponse.Data.Desc"));
		data.setMetastoreType(_ctx.stringValue("GetMetastoreMigrationResponse.Data.MetastoreType"));
		data.setMetastoreInfo(_ctx.stringValue("GetMetastoreMigrationResponse.Data.MetastoreInfo"));
		data.setRunOptions(_ctx.stringValue("GetMetastoreMigrationResponse.Data.RunOptions"));
		data.setRoleName(_ctx.stringValue("GetMetastoreMigrationResponse.Data.RoleName"));
		data.setStatus(_ctx.stringValue("GetMetastoreMigrationResponse.Data.Status"));
		data.setGmtCreate(_ctx.stringValue("GetMetastoreMigrationResponse.Data.GmtCreate"));
		data.setGmtModified(_ctx.stringValue("GetMetastoreMigrationResponse.Data.GmtModified"));

		WorkflowLastRunInstance workflowLastRunInstance = new WorkflowLastRunInstance();
		workflowLastRunInstance.setFlowInstanceId(_ctx.stringValue("GetMetastoreMigrationResponse.Data.WorkflowLastRunInstance.FlowInstanceId"));
		workflowLastRunInstance.setFlowId(_ctx.stringValue("GetMetastoreMigrationResponse.Data.WorkflowLastRunInstance.FlowId"));
		workflowLastRunInstance.setFlowName(_ctx.stringValue("GetMetastoreMigrationResponse.Data.WorkflowLastRunInstance.FlowName"));
		workflowLastRunInstance.setDuration(_ctx.longValue("GetMetastoreMigrationResponse.Data.WorkflowLastRunInstance.Duration"));
		workflowLastRunInstance.setStartTime(_ctx.longValue("GetMetastoreMigrationResponse.Data.WorkflowLastRunInstance.StartTime"));
		workflowLastRunInstance.setEndTime(_ctx.longValue("GetMetastoreMigrationResponse.Data.WorkflowLastRunInstance.EndTime"));
		workflowLastRunInstance.setStatus(_ctx.stringValue("GetMetastoreMigrationResponse.Data.WorkflowLastRunInstance.Status"));
		workflowLastRunInstance.setProjectId(_ctx.stringValue("GetMetastoreMigrationResponse.Data.WorkflowLastRunInstance.ProjectId"));
		workflowLastRunInstance.setClusterId(_ctx.stringValue("GetMetastoreMigrationResponse.Data.WorkflowLastRunInstance.ClusterId"));
		workflowLastRunInstance.setFailureInfo(_ctx.stringValue("GetMetastoreMigrationResponse.Data.WorkflowLastRunInstance.FailureInfo"));
		workflowLastRunInstance.setFlowExtendResult(_ctx.stringValue("GetMetastoreMigrationResponse.Data.WorkflowLastRunInstance.FlowExtendResult"));
		workflowLastRunInstance.setTotalCuUsage(_ctx.floatValue("GetMetastoreMigrationResponse.Data.WorkflowLastRunInstance.TotalCuUsage"));
		workflowLastRunInstance.setOpsUrl(_ctx.stringValue("GetMetastoreMigrationResponse.Data.WorkflowLastRunInstance.OpsUrl"));
		workflowLastRunInstance.setOffsetTime(_ctx.integerValue("GetMetastoreMigrationResponse.Data.WorkflowLastRunInstance.OffsetTime"));
		workflowLastRunInstance.setBatchProgress(_ctx.integerValue("GetMetastoreMigrationResponse.Data.WorkflowLastRunInstance.BatchProgress"));
		workflowLastRunInstance.setExecuteMode(_ctx.stringValue("GetMetastoreMigrationResponse.Data.WorkflowLastRunInstance.ExecuteMode"));
		data.setWorkflowLastRunInstance(workflowLastRunInstance);
		getMetastoreMigrationResponse.setData(data);
	 
	 	return getMetastoreMigrationResponse;
	}
}