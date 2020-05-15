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

import com.aliyuncs.sofa.model.v20190815.QueryODPSchemasResponse;
import com.aliyuncs.sofa.model.v20190815.QueryODPSchemasResponse.Data;
import com.aliyuncs.sofa.model.v20190815.QueryODPSchemasResponse.Data.NodeSchemaMappingsItem;
import com.aliyuncs.sofa.model.v20190815.QueryODPSchemasResponse.Data.ServerProps;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryODPSchemasResponseUnmarshaller {

	public static QueryODPSchemasResponse unmarshall(QueryODPSchemasResponse queryODPSchemasResponse, UnmarshallerContext _ctx) {
		
		queryODPSchemasResponse.setRequestId(_ctx.stringValue("QueryODPSchemasResponse.RequestId"));
		queryODPSchemasResponse.setResultCode(_ctx.stringValue("QueryODPSchemasResponse.ResultCode"));
		queryODPSchemasResponse.setResultMessage(_ctx.stringValue("QueryODPSchemasResponse.ResultMessage"));

		Data data = new Data();
		data.setAppDsName(_ctx.stringValue("QueryODPSchemasResponse.Data.AppDsName"));
		data.setAppName(_ctx.stringValue("QueryODPSchemasResponse.Data.AppName"));
		data.setAutoCreateSchema(_ctx.booleanValue("QueryODPSchemasResponse.Data.AutoCreateSchema"));
		data.setAutoUpdateVersion(_ctx.booleanValue("QueryODPSchemasResponse.Data.AutoUpdateVersion"));
		data.setCharset(_ctx.stringValue("QueryODPSchemasResponse.Data.Charset"));
		data.setCollation(_ctx.stringValue("QueryODPSchemasResponse.Data.Collation"));
		data.setDbNum(_ctx.longValue("QueryODPSchemasResponse.Data.DbNum"));
		data.setDescription(_ctx.stringValue("QueryODPSchemasResponse.Data.Description"));
		data.setEnableDtx(_ctx.booleanValue("QueryODPSchemasResponse.Data.EnableDtx"));
		data.setEnvMode(_ctx.stringValue("QueryODPSchemasResponse.Data.EnvMode"));
		data.setEnvTenant(_ctx.stringValue("QueryODPSchemasResponse.Data.EnvTenant"));
		data.setExpansionJobId(_ctx.stringValue("QueryODPSchemasResponse.Data.ExpansionJobId"));
		data.setExpansionStatus(_ctx.stringValue("QueryODPSchemasResponse.Data.ExpansionStatus"));
		data.setGmtCreate(_ctx.stringValue("QueryODPSchemasResponse.Data.GmtCreate"));
		data.setGmtModified(_ctx.stringValue("QueryODPSchemasResponse.Data.GmtModified"));
		data.setGmtValid(_ctx.stringValue("QueryODPSchemasResponse.Data.GmtValid"));
		data.setGroupCount(_ctx.longValue("QueryODPSchemasResponse.Data.GroupCount"));
		data.setId(_ctx.longValue("QueryODPSchemasResponse.Data.Id"));
		data.setInstanceId(_ctx.stringValue("QueryODPSchemasResponse.Data.InstanceId"));
		data.setInstanceName(_ctx.stringValue("QueryODPSchemasResponse.Data.InstanceName"));
		data.setLatestVersion(_ctx.stringValue("QueryODPSchemasResponse.Data.LatestVersion"));
		data.setLogicTableCount(_ctx.stringValue("QueryODPSchemasResponse.Data.LogicTableCount"));
		data.setOpenReadAndWriteSeparation(_ctx.booleanValue("QueryODPSchemasResponse.Data.OpenReadAndWriteSeparation"));
		data.setOperator(_ctx.stringValue("QueryODPSchemasResponse.Data.Operator"));
		data.setOwner(_ctx.stringValue("QueryODPSchemasResponse.Data.Owner"));
		data.setParserDbType(_ctx.stringValue("QueryODPSchemasResponse.Data.ParserDbType"));
		data.setPassword(_ctx.stringValue("QueryODPSchemasResponse.Data.Password"));
		data.setPhysicalSchemaCount(_ctx.longValue("QueryODPSchemasResponse.Data.PhysicalSchemaCount"));
		data.setSchemaGroupType(_ctx.longValue("QueryODPSchemasResponse.Data.SchemaGroupType"));
		data.setSchemaName(_ctx.stringValue("QueryODPSchemasResponse.Data.SchemaName"));
		data.setStatus(_ctx.stringValue("QueryODPSchemasResponse.Data.Status"));
		data.setUpdateStatus(_ctx.stringValue("QueryODPSchemasResponse.Data.UpdateStatus"));
		data.setVersion(_ctx.stringValue("QueryODPSchemasResponse.Data.Version"));

		ServerProps serverProps = new ServerProps();
		serverProps.setBackendMaxConn(_ctx.longValue("QueryODPSchemasResponse.Data.ServerProps.BackendMaxConn"));
		serverProps.setEnvMode(_ctx.stringValue("QueryODPSchemasResponse.Data.ServerProps.EnvMode"));
		serverProps.setEnvTenant(_ctx.stringValue("QueryODPSchemasResponse.Data.ServerProps.EnvTenant"));
		serverProps.setFrontendIdleTimeout(_ctx.longValue("QueryODPSchemasResponse.Data.ServerProps.FrontendIdleTimeout"));
		serverProps.setFrontendSlaLatency(_ctx.longValue("QueryODPSchemasResponse.Data.ServerProps.FrontendSlaLatency"));
		serverProps.setFrontendSlaTps(_ctx.longValue("QueryODPSchemasResponse.Data.ServerProps.FrontendSlaTps"));
		serverProps.setGmtCreate(_ctx.stringValue("QueryODPSchemasResponse.Data.ServerProps.GmtCreate"));
		serverProps.setGmtModified(_ctx.stringValue("QueryODPSchemasResponse.Data.ServerProps.GmtModified"));
		serverProps.setSchemaName(_ctx.stringValue("QueryODPSchemasResponse.Data.ServerProps.SchemaName"));
		data.setServerProps(serverProps);

		List<NodeSchemaMappingsItem> nodeSchemaMappings = new ArrayList<NodeSchemaMappingsItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryODPSchemasResponse.Data.NodeSchemaMappings.Length"); i++) {
			NodeSchemaMappingsItem nodeSchemaMappingsItem = new NodeSchemaMappingsItem();
			nodeSchemaMappingsItem.setNodeId(_ctx.stringValue("QueryODPSchemasResponse.Data.NodeSchemaMappings["+ i +"].NodeId"));
			nodeSchemaMappingsItem.setPhysicalPassword(_ctx.stringValue("QueryODPSchemasResponse.Data.NodeSchemaMappings["+ i +"].PhysicalPassword"));
			nodeSchemaMappingsItem.setPhysicalUsername(_ctx.stringValue("QueryODPSchemasResponse.Data.NodeSchemaMappings["+ i +"].PhysicalUsername"));
			nodeSchemaMappingsItem.setPowerfulPassword(_ctx.stringValue("QueryODPSchemasResponse.Data.NodeSchemaMappings["+ i +"].PowerfulPassword"));
			nodeSchemaMappingsItem.setPowerfulUsername(_ctx.stringValue("QueryODPSchemasResponse.Data.NodeSchemaMappings["+ i +"].PowerfulUsername"));
			nodeSchemaMappingsItem.setSchemaCount(_ctx.longValue("QueryODPSchemasResponse.Data.NodeSchemaMappings["+ i +"].SchemaCount"));
			nodeSchemaMappingsItem.setSchemaPattern(_ctx.stringValue("QueryODPSchemasResponse.Data.NodeSchemaMappings["+ i +"].SchemaPattern"));

			nodeSchemaMappings.add(nodeSchemaMappingsItem);
		}
		data.setNodeSchemaMappings(nodeSchemaMappings);
		queryODPSchemasResponse.setData(data);
	 
	 	return queryODPSchemasResponse;
	}
}