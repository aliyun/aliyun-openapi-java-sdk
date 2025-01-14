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

import com.aliyuncs.csas.model.v20230120.ListApprovalSchemasForApprovalProcessesResponse;
import com.aliyuncs.csas.model.v20230120.ListApprovalSchemasForApprovalProcessesResponse.Data;
import com.aliyuncs.csas.model.v20230120.ListApprovalSchemasForApprovalProcessesResponse.Data.SchemasItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListApprovalSchemasForApprovalProcessesResponseUnmarshaller {

	public static ListApprovalSchemasForApprovalProcessesResponse unmarshall(ListApprovalSchemasForApprovalProcessesResponse listApprovalSchemasForApprovalProcessesResponse, UnmarshallerContext _ctx) {
		
		listApprovalSchemasForApprovalProcessesResponse.setRequestId(_ctx.stringValue("ListApprovalSchemasForApprovalProcessesResponse.RequestId"));

		List<Data> processes = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("ListApprovalSchemasForApprovalProcessesResponse.Processes.Length"); i++) {
			Data data = new Data();
			data.setProcessId(_ctx.stringValue("ListApprovalSchemasForApprovalProcessesResponse.Processes["+ i +"].ProcessId"));

			List<SchemasItem> schemas = new ArrayList<SchemasItem>();
			for (int j = 0; j < _ctx.lengthValue("ListApprovalSchemasForApprovalProcessesResponse.Processes["+ i +"].Schemas.Length"); j++) {
				SchemasItem schemasItem = new SchemasItem();
				schemasItem.setCreateTime(_ctx.stringValue("ListApprovalSchemasForApprovalProcessesResponse.Processes["+ i +"].Schemas["+ j +"].CreateTime"));
				schemasItem.setSchemaId(_ctx.stringValue("ListApprovalSchemasForApprovalProcessesResponse.Processes["+ i +"].Schemas["+ j +"].SchemaId"));
				schemasItem.setSchemaName(_ctx.stringValue("ListApprovalSchemasForApprovalProcessesResponse.Processes["+ i +"].Schemas["+ j +"].SchemaName"));
				schemasItem.setDescription(_ctx.stringValue("ListApprovalSchemasForApprovalProcessesResponse.Processes["+ i +"].Schemas["+ j +"].Description"));
				schemasItem.setSchemaContent(_ctx.stringValue("ListApprovalSchemasForApprovalProcessesResponse.Processes["+ i +"].Schemas["+ j +"].SchemaContent"));
				schemasItem.setSchemaVersion(_ctx.longValue("ListApprovalSchemasForApprovalProcessesResponse.Processes["+ i +"].Schemas["+ j +"].SchemaVersion"));
				schemasItem.setPolicyType(_ctx.stringValue("ListApprovalSchemasForApprovalProcessesResponse.Processes["+ i +"].Schemas["+ j +"].PolicyType"));
				schemasItem.setIsDefault(_ctx.booleanValue("ListApprovalSchemasForApprovalProcessesResponse.Processes["+ i +"].Schemas["+ j +"].IsDefault"));

				schemas.add(schemasItem);
			}
			data.setSchemas(schemas);

			processes.add(data);
		}
		listApprovalSchemasForApprovalProcessesResponse.setProcesses(processes);
	 
	 	return listApprovalSchemasForApprovalProcessesResponse;
	}
}