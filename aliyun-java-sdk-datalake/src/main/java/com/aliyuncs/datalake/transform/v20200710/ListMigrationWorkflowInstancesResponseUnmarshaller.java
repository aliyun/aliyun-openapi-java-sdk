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

import com.aliyuncs.datalake.model.v20200710.ListMigrationWorkflowInstancesResponse;
import com.aliyuncs.datalake.model.v20200710.ListMigrationWorkflowInstancesResponse.MigrationWorkflowInstances;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMigrationWorkflowInstancesResponseUnmarshaller {

	public static ListMigrationWorkflowInstancesResponse unmarshall(ListMigrationWorkflowInstancesResponse listMigrationWorkflowInstancesResponse, UnmarshallerContext _ctx) {
		
		listMigrationWorkflowInstancesResponse.setRequestId(_ctx.stringValue("ListMigrationWorkflowInstancesResponse.RequestId"));
		listMigrationWorkflowInstancesResponse.setSuccess(_ctx.booleanValue("ListMigrationWorkflowInstancesResponse.Success"));
		listMigrationWorkflowInstancesResponse.setTotalCount(_ctx.integerValue("ListMigrationWorkflowInstancesResponse.TotalCount"));

		List<MigrationWorkflowInstances> data = new ArrayList<MigrationWorkflowInstances>();
		for (int i = 0; i < _ctx.lengthValue("ListMigrationWorkflowInstancesResponse.Data.Length"); i++) {
			MigrationWorkflowInstances migrationWorkflowInstances = new MigrationWorkflowInstances();
			migrationWorkflowInstances.setInstanceId(_ctx.stringValue("ListMigrationWorkflowInstancesResponse.Data["+ i +"].InstanceId"));
			migrationWorkflowInstances.setName(_ctx.stringValue("ListMigrationWorkflowInstancesResponse.Data["+ i +"].Name"));
			migrationWorkflowInstances.setMetastoreType(_ctx.stringValue("ListMigrationWorkflowInstancesResponse.Data["+ i +"].MetastoreType"));
			migrationWorkflowInstances.setFlowInstanceId(_ctx.stringValue("ListMigrationWorkflowInstancesResponse.Data["+ i +"].FlowInstanceId"));
			migrationWorkflowInstances.setFlowId(_ctx.stringValue("ListMigrationWorkflowInstancesResponse.Data["+ i +"].FlowId"));
			migrationWorkflowInstances.setFlowName(_ctx.stringValue("ListMigrationWorkflowInstancesResponse.Data["+ i +"].FlowName"));
			migrationWorkflowInstances.setStartTime(_ctx.longValue("ListMigrationWorkflowInstancesResponse.Data["+ i +"].StartTime"));
			migrationWorkflowInstances.setEndTime(_ctx.longValue("ListMigrationWorkflowInstancesResponse.Data["+ i +"].EndTime"));
			migrationWorkflowInstances.setDuration(_ctx.longValue("ListMigrationWorkflowInstancesResponse.Data["+ i +"].Duration"));
			migrationWorkflowInstances.setStatus(_ctx.stringValue("ListMigrationWorkflowInstancesResponse.Data["+ i +"].Status"));
			migrationWorkflowInstances.setBatchProgress(_ctx.integerValue("ListMigrationWorkflowInstancesResponse.Data["+ i +"].BatchProgress"));
			migrationWorkflowInstances.setFailureInfo(_ctx.stringValue("ListMigrationWorkflowInstancesResponse.Data["+ i +"].FailureInfo"));
			migrationWorkflowInstances.setProjectId(_ctx.stringValue("ListMigrationWorkflowInstancesResponse.Data["+ i +"].ProjectId"));
			migrationWorkflowInstances.setFlowExtendResult(_ctx.stringValue("ListMigrationWorkflowInstancesResponse.Data["+ i +"].FlowExtendResult"));

			data.add(migrationWorkflowInstances);
		}
		listMigrationWorkflowInstancesResponse.setData(data);
	 
	 	return listMigrationWorkflowInstancesResponse;
	}
}