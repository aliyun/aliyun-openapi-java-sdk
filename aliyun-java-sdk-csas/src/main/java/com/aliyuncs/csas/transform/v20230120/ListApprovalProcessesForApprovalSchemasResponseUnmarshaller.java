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

package com.aliyuncs.csas.transform.v20230120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.csas.model.v20230120.ListApprovalProcessesForApprovalSchemasResponse;
import com.aliyuncs.csas.model.v20230120.ListApprovalProcessesForApprovalSchemasResponse.Data;
import com.aliyuncs.csas.model.v20230120.ListApprovalProcessesForApprovalSchemasResponse.Data.ProcessesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListApprovalProcessesForApprovalSchemasResponseUnmarshaller {

	public static ListApprovalProcessesForApprovalSchemasResponse unmarshall(ListApprovalProcessesForApprovalSchemasResponse listApprovalProcessesForApprovalSchemasResponse, UnmarshallerContext _ctx) {
		
		listApprovalProcessesForApprovalSchemasResponse.setRequestId(_ctx.stringValue("ListApprovalProcessesForApprovalSchemasResponse.RequestId"));

		List<Data> schemas = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("ListApprovalProcessesForApprovalSchemasResponse.Schemas.Length"); i++) {
			Data data = new Data();
			data.setSchemaId(_ctx.stringValue("ListApprovalProcessesForApprovalSchemasResponse.Schemas["+ i +"].SchemaId"));

			List<ProcessesItem> processes = new ArrayList<ProcessesItem>();
			for (int j = 0; j < _ctx.lengthValue("ListApprovalProcessesForApprovalSchemasResponse.Schemas["+ i +"].Processes.Length"); j++) {
				ProcessesItem processesItem = new ProcessesItem();
				processesItem.setCreateTime(_ctx.stringValue("ListApprovalProcessesForApprovalSchemasResponse.Schemas["+ i +"].Processes["+ j +"].CreateTime"));
				processesItem.setProcessId(_ctx.stringValue("ListApprovalProcessesForApprovalSchemasResponse.Schemas["+ i +"].Processes["+ j +"].ProcessId"));
				processesItem.setProcessName(_ctx.stringValue("ListApprovalProcessesForApprovalSchemasResponse.Schemas["+ i +"].Processes["+ j +"].ProcessName"));
				processesItem.setDescription(_ctx.stringValue("ListApprovalProcessesForApprovalSchemasResponse.Schemas["+ i +"].Processes["+ j +"].Description"));

				processes.add(processesItem);
			}
			data.setProcesses(processes);

			schemas.add(data);
		}
		listApprovalProcessesForApprovalSchemasResponse.setSchemas(schemas);
	 
	 	return listApprovalProcessesForApprovalSchemasResponse;
	}
}