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

import com.aliyuncs.datalake.model.v20200710.ListMetastoreMigrationsResponse;
import com.aliyuncs.datalake.model.v20200710.ListMetastoreMigrationsResponse.MigrationInstances;
import com.aliyuncs.datalake.model.v20200710.ListMetastoreMigrationsResponse.MigrationInstances.WorkflowLastRunInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMetastoreMigrationsResponseUnmarshaller {

	public static ListMetastoreMigrationsResponse unmarshall(ListMetastoreMigrationsResponse listMetastoreMigrationsResponse, UnmarshallerContext _ctx) {
		
		listMetastoreMigrationsResponse.setRequestId(_ctx.stringValue("ListMetastoreMigrationsResponse.RequestId"));
		listMetastoreMigrationsResponse.setSuccess(_ctx.booleanValue("ListMetastoreMigrationsResponse.Success"));
		listMetastoreMigrationsResponse.setTotalCount(_ctx.integerValue("ListMetastoreMigrationsResponse.TotalCount"));

		List<MigrationInstances> data = new ArrayList<MigrationInstances>();
		for (int i = 0; i < _ctx.lengthValue("ListMetastoreMigrationsResponse.Data.Length"); i++) {
			MigrationInstances migrationInstances = new MigrationInstances();
			migrationInstances.setInstanceId(_ctx.stringValue("ListMetastoreMigrationsResponse.Data["+ i +"].InstanceId"));
			migrationInstances.setName(_ctx.stringValue("ListMetastoreMigrationsResponse.Data["+ i +"].Name"));
			migrationInstances.setDesc(_ctx.stringValue("ListMetastoreMigrationsResponse.Data["+ i +"].Desc"));
			migrationInstances.setMetastoreType(_ctx.stringValue("ListMetastoreMigrationsResponse.Data["+ i +"].MetastoreType"));
			migrationInstances.setMetastoreInfo(_ctx.stringValue("ListMetastoreMigrationsResponse.Data["+ i +"].MetastoreInfo"));
			migrationInstances.setRunOptions(_ctx.stringValue("ListMetastoreMigrationsResponse.Data["+ i +"].RunOptions"));
			migrationInstances.setRoleName(_ctx.stringValue("ListMetastoreMigrationsResponse.Data["+ i +"].RoleName"));
			migrationInstances.setStatus(_ctx.stringValue("ListMetastoreMigrationsResponse.Data["+ i +"].Status"));
			migrationInstances.setGmtCreate(_ctx.stringValue("ListMetastoreMigrationsResponse.Data["+ i +"].GmtCreate"));
			migrationInstances.setGmtModified(_ctx.stringValue("ListMetastoreMigrationsResponse.Data["+ i +"].GmtModified"));

			WorkflowLastRunInstance workflowLastRunInstance = new WorkflowLastRunInstance();
			workflowLastRunInstance.setFlowInstanceId(_ctx.stringValue("ListMetastoreMigrationsResponse.Data["+ i +"].WorkflowLastRunInstance.FlowInstanceId"));
			workflowLastRunInstance.setFlowId(_ctx.stringValue("ListMetastoreMigrationsResponse.Data["+ i +"].WorkflowLastRunInstance.FlowId"));
			workflowLastRunInstance.setFlowName(_ctx.stringValue("ListMetastoreMigrationsResponse.Data["+ i +"].WorkflowLastRunInstance.FlowName"));
			workflowLastRunInstance.setDuration(_ctx.longValue("ListMetastoreMigrationsResponse.Data["+ i +"].WorkflowLastRunInstance.Duration"));
			workflowLastRunInstance.setStartTime(_ctx.longValue("ListMetastoreMigrationsResponse.Data["+ i +"].WorkflowLastRunInstance.StartTime"));
			workflowLastRunInstance.setEndTime(_ctx.longValue("ListMetastoreMigrationsResponse.Data["+ i +"].WorkflowLastRunInstance.EndTime"));
			workflowLastRunInstance.setStatus(_ctx.stringValue("ListMetastoreMigrationsResponse.Data["+ i +"].WorkflowLastRunInstance.Status"));
			workflowLastRunInstance.setProjectId(_ctx.stringValue("ListMetastoreMigrationsResponse.Data["+ i +"].WorkflowLastRunInstance.ProjectId"));
			workflowLastRunInstance.setClusterId(_ctx.stringValue("ListMetastoreMigrationsResponse.Data["+ i +"].WorkflowLastRunInstance.ClusterId"));
			workflowLastRunInstance.setFailureInfo(_ctx.stringValue("ListMetastoreMigrationsResponse.Data["+ i +"].WorkflowLastRunInstance.FailureInfo"));
			workflowLastRunInstance.setFlowExtendResult(_ctx.stringValue("ListMetastoreMigrationsResponse.Data["+ i +"].WorkflowLastRunInstance.FlowExtendResult"));
			workflowLastRunInstance.setTotalCuUsage(_ctx.floatValue("ListMetastoreMigrationsResponse.Data["+ i +"].WorkflowLastRunInstance.TotalCuUsage"));
			workflowLastRunInstance.setOpsUrl(_ctx.stringValue("ListMetastoreMigrationsResponse.Data["+ i +"].WorkflowLastRunInstance.OpsUrl"));
			workflowLastRunInstance.setOffsetTime(_ctx.integerValue("ListMetastoreMigrationsResponse.Data["+ i +"].WorkflowLastRunInstance.OffsetTime"));
			workflowLastRunInstance.setBatchProgress(_ctx.integerValue("ListMetastoreMigrationsResponse.Data["+ i +"].WorkflowLastRunInstance.BatchProgress"));
			workflowLastRunInstance.setExecuteMode(_ctx.stringValue("ListMetastoreMigrationsResponse.Data["+ i +"].WorkflowLastRunInstance.ExecuteMode"));
			migrationInstances.setWorkflowLastRunInstance(workflowLastRunInstance);

			data.add(migrationInstances);
		}
		listMetastoreMigrationsResponse.setData(data);
	 
	 	return listMetastoreMigrationsResponse;
	}
}