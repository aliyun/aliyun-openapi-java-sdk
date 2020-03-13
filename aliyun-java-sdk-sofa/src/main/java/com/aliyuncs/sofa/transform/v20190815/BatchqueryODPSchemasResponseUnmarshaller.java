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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.BatchqueryODPSchemasResponse;
import com.aliyuncs.sofa.model.v20190815.BatchqueryODPSchemasResponse.DataItem;
import com.aliyuncs.sofa.model.v20190815.BatchqueryODPSchemasResponse.DataItem.NodeSchemaMappingsItem;
import com.aliyuncs.sofa.model.v20190815.BatchqueryODPSchemasResponse.DataItem.ServerProps;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchqueryODPSchemasResponseUnmarshaller {

	public static BatchqueryODPSchemasResponse unmarshall(BatchqueryODPSchemasResponse batchqueryODPSchemasResponse, UnmarshallerContext _ctx) {
		
		batchqueryODPSchemasResponse.setRequestId(_ctx.stringValue("BatchqueryODPSchemasResponse.RequestId"));
		batchqueryODPSchemasResponse.setResultCode(_ctx.stringValue("BatchqueryODPSchemasResponse.ResultCode"));
		batchqueryODPSchemasResponse.setResultMessage(_ctx.stringValue("BatchqueryODPSchemasResponse.ResultMessage"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("BatchqueryODPSchemasResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setAppDsName(_ctx.stringValue("BatchqueryODPSchemasResponse.Data["+ i +"].AppDsName"));
			dataItem.setAppName(_ctx.stringValue("BatchqueryODPSchemasResponse.Data["+ i +"].AppName"));
			dataItem.setAutoCreateSchema(_ctx.booleanValue("BatchqueryODPSchemasResponse.Data["+ i +"].AutoCreateSchema"));
			dataItem.setAutoUpdateVersion(_ctx.booleanValue("BatchqueryODPSchemasResponse.Data["+ i +"].AutoUpdateVersion"));
			dataItem.setCharset(_ctx.stringValue("BatchqueryODPSchemasResponse.Data["+ i +"].Charset"));
			dataItem.setCollation(_ctx.stringValue("BatchqueryODPSchemasResponse.Data["+ i +"].Collation"));
			dataItem.setDbNum(_ctx.longValue("BatchqueryODPSchemasResponse.Data["+ i +"].DbNum"));
			dataItem.setDescription(_ctx.stringValue("BatchqueryODPSchemasResponse.Data["+ i +"].Description"));
			dataItem.setEnableDtx(_ctx.booleanValue("BatchqueryODPSchemasResponse.Data["+ i +"].EnableDtx"));
			dataItem.setEnvMode(_ctx.stringValue("BatchqueryODPSchemasResponse.Data["+ i +"].EnvMode"));
			dataItem.setEnvTenant(_ctx.stringValue("BatchqueryODPSchemasResponse.Data["+ i +"].EnvTenant"));
			dataItem.setExpansionJobId(_ctx.stringValue("BatchqueryODPSchemasResponse.Data["+ i +"].ExpansionJobId"));
			dataItem.setExpansionStatus(_ctx.stringValue("BatchqueryODPSchemasResponse.Data["+ i +"].ExpansionStatus"));
			dataItem.setGmtCreate(_ctx.stringValue("BatchqueryODPSchemasResponse.Data["+ i +"].GmtCreate"));
			dataItem.setGmtModified(_ctx.stringValue("BatchqueryODPSchemasResponse.Data["+ i +"].GmtModified"));
			dataItem.setGmtValid(_ctx.stringValue("BatchqueryODPSchemasResponse.Data["+ i +"].GmtValid"));
			dataItem.setGroupCount(_ctx.longValue("BatchqueryODPSchemasResponse.Data["+ i +"].GroupCount"));
			dataItem.setId(_ctx.longValue("BatchqueryODPSchemasResponse.Data["+ i +"].Id"));
			dataItem.setInstanceId(_ctx.stringValue("BatchqueryODPSchemasResponse.Data["+ i +"].InstanceId"));
			dataItem.setInstanceName(_ctx.stringValue("BatchqueryODPSchemasResponse.Data["+ i +"].InstanceName"));
			dataItem.setLatestVersion(_ctx.stringValue("BatchqueryODPSchemasResponse.Data["+ i +"].LatestVersion"));
			dataItem.setLogicTableCount(_ctx.stringValue("BatchqueryODPSchemasResponse.Data["+ i +"].LogicTableCount"));
			dataItem.setOpenReadAndWriteSeparation(_ctx.booleanValue("BatchqueryODPSchemasResponse.Data["+ i +"].OpenReadAndWriteSeparation"));
			dataItem.setOperator(_ctx.stringValue("BatchqueryODPSchemasResponse.Data["+ i +"].Operator"));
			dataItem.setOwner(_ctx.stringValue("BatchqueryODPSchemasResponse.Data["+ i +"].Owner"));
			dataItem.setParserDbType(_ctx.stringValue("BatchqueryODPSchemasResponse.Data["+ i +"].ParserDbType"));
			dataItem.setPassword(_ctx.stringValue("BatchqueryODPSchemasResponse.Data["+ i +"].Password"));
			dataItem.setPhysicalSchemaCount(_ctx.longValue("BatchqueryODPSchemasResponse.Data["+ i +"].PhysicalSchemaCount"));
			dataItem.setSchemaGroupType(_ctx.longValue("BatchqueryODPSchemasResponse.Data["+ i +"].SchemaGroupType"));
			dataItem.setSchemaName(_ctx.stringValue("BatchqueryODPSchemasResponse.Data["+ i +"].SchemaName"));
			dataItem.setStatus(_ctx.stringValue("BatchqueryODPSchemasResponse.Data["+ i +"].Status"));
			dataItem.setUpdateStatus(_ctx.stringValue("BatchqueryODPSchemasResponse.Data["+ i +"].UpdateStatus"));
			dataItem.setVersion(_ctx.stringValue("BatchqueryODPSchemasResponse.Data["+ i +"].Version"));

			ServerProps serverProps = new ServerProps();
			serverProps.setBackendMaxConn(_ctx.longValue("BatchqueryODPSchemasResponse.Data["+ i +"].ServerProps.BackendMaxConn"));
			serverProps.setEnvMode(_ctx.stringValue("BatchqueryODPSchemasResponse.Data["+ i +"].ServerProps.EnvMode"));
			serverProps.setEnvTenant(_ctx.stringValue("BatchqueryODPSchemasResponse.Data["+ i +"].ServerProps.EnvTenant"));
			serverProps.setFrontendIdleTimeout(_ctx.longValue("BatchqueryODPSchemasResponse.Data["+ i +"].ServerProps.FrontendIdleTimeout"));
			serverProps.setFrontendSlaLatency(_ctx.longValue("BatchqueryODPSchemasResponse.Data["+ i +"].ServerProps.FrontendSlaLatency"));
			serverProps.setFrontendSlaTps(_ctx.longValue("BatchqueryODPSchemasResponse.Data["+ i +"].ServerProps.FrontendSlaTps"));
			serverProps.setGmtCreate(_ctx.stringValue("BatchqueryODPSchemasResponse.Data["+ i +"].ServerProps.GmtCreate"));
			serverProps.setGmtModified(_ctx.stringValue("BatchqueryODPSchemasResponse.Data["+ i +"].ServerProps.GmtModified"));
			serverProps.setSchemaName(_ctx.stringValue("BatchqueryODPSchemasResponse.Data["+ i +"].ServerProps.SchemaName"));
			dataItem.setServerProps(serverProps);

			List<NodeSchemaMappingsItem> nodeSchemaMappings = new ArrayList<NodeSchemaMappingsItem>();
			for (int j = 0; j < _ctx.lengthValue("BatchqueryODPSchemasResponse.Data["+ i +"].NodeSchemaMappings.Length"); j++) {
				NodeSchemaMappingsItem nodeSchemaMappingsItem = new NodeSchemaMappingsItem();
				nodeSchemaMappingsItem.setNodeId(_ctx.stringValue("BatchqueryODPSchemasResponse.Data["+ i +"].NodeSchemaMappings["+ j +"].NodeId"));
				nodeSchemaMappingsItem.setPhysicalPassword(_ctx.stringValue("BatchqueryODPSchemasResponse.Data["+ i +"].NodeSchemaMappings["+ j +"].PhysicalPassword"));
				nodeSchemaMappingsItem.setPhysicalUsername(_ctx.stringValue("BatchqueryODPSchemasResponse.Data["+ i +"].NodeSchemaMappings["+ j +"].PhysicalUsername"));
				nodeSchemaMappingsItem.setPowerfulPassword(_ctx.stringValue("BatchqueryODPSchemasResponse.Data["+ i +"].NodeSchemaMappings["+ j +"].PowerfulPassword"));
				nodeSchemaMappingsItem.setPowerfulUsername(_ctx.stringValue("BatchqueryODPSchemasResponse.Data["+ i +"].NodeSchemaMappings["+ j +"].PowerfulUsername"));
				nodeSchemaMappingsItem.setSchemaCount(_ctx.longValue("BatchqueryODPSchemasResponse.Data["+ i +"].NodeSchemaMappings["+ j +"].SchemaCount"));
				nodeSchemaMappingsItem.setSchemaPattern(_ctx.stringValue("BatchqueryODPSchemasResponse.Data["+ i +"].NodeSchemaMappings["+ j +"].SchemaPattern"));

				nodeSchemaMappings.add(nodeSchemaMappingsItem);
			}
			dataItem.setNodeSchemaMappings(nodeSchemaMappings);

			data.add(dataItem);
		}
		batchqueryODPSchemasResponse.setData(data);
	 
	 	return batchqueryODPSchemasResponse;
	}
}