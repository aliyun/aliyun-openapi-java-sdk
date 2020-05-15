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

import com.aliyuncs.sofa.model.v20190815.RecognizeODPSchemasResponse;
import com.aliyuncs.sofa.model.v20190815.RecognizeODPSchemasResponse.Data;
import com.aliyuncs.sofa.model.v20190815.RecognizeODPSchemasResponse.Data.ConnProperties;
import com.aliyuncs.sofa.model.v20190815.RecognizeODPSchemasResponse.Data.LogicTablesItem;
import com.aliyuncs.sofa.model.v20190815.RecognizeODPSchemasResponse.Data.LogicTablesItem.DbRulesItem;
import com.aliyuncs.sofa.model.v20190815.RecognizeODPSchemasResponse.Data.LogicTablesItem.RulesItem;
import com.aliyuncs.sofa.model.v20190815.RecognizeODPSchemasResponse.Data.Schema;
import com.aliyuncs.sofa.model.v20190815.RecognizeODPSchemasResponse.Data.Schema.NodeSchemaMappingsItem;
import com.aliyuncs.sofa.model.v20190815.RecognizeODPSchemasResponse.Data.Schema.ServerProps;
import com.aliyuncs.transform.UnmarshallerContext;


public class RecognizeODPSchemasResponseUnmarshaller {

	public static RecognizeODPSchemasResponse unmarshall(RecognizeODPSchemasResponse recognizeODPSchemasResponse, UnmarshallerContext _ctx) {
		
		recognizeODPSchemasResponse.setRequestId(_ctx.stringValue("RecognizeODPSchemasResponse.RequestId"));
		recognizeODPSchemasResponse.setResultCode(_ctx.stringValue("RecognizeODPSchemasResponse.ResultCode"));
		recognizeODPSchemasResponse.setResultMessage(_ctx.stringValue("RecognizeODPSchemasResponse.ResultMessage"));

		Data data = new Data();

		ConnProperties connProperties = new ConnProperties();
		connProperties.setAllowMinPoolTimeout(_ctx.booleanValue("RecognizeODPSchemasResponse.Data.ConnProperties.AllowMinPoolTimeout"));
		connProperties.setBackgroundValidation(_ctx.booleanValue("RecognizeODPSchemasResponse.Data.ConnProperties.BackgroundValidation"));
		connProperties.setBackgroundValidationMinutes(_ctx.longValue("RecognizeODPSchemasResponse.Data.ConnProperties.BackgroundValidationMinutes"));
		connProperties.setBlockingTimeoutMillis(_ctx.longValue("RecognizeODPSchemasResponse.Data.ConnProperties.BlockingTimeoutMillis"));
		connProperties.setIdleTimeoutMinutes(_ctx.longValue("RecognizeODPSchemasResponse.Data.ConnProperties.IdleTimeoutMinutes"));
		connProperties.setMaxConn(_ctx.longValue("RecognizeODPSchemasResponse.Data.ConnProperties.MaxConn"));
		connProperties.setMinConn(_ctx.longValue("RecognizeODPSchemasResponse.Data.ConnProperties.MinConn"));
		connProperties.setNewConnectionSql(_ctx.stringValue("RecognizeODPSchemasResponse.Data.ConnProperties.NewConnectionSql"));
		connProperties.setOthers(_ctx.stringValue("RecognizeODPSchemasResponse.Data.ConnProperties.Others"));
		connProperties.setPrefill(_ctx.booleanValue("RecognizeODPSchemasResponse.Data.ConnProperties.Prefill"));
		connProperties.setQueryTimeout(_ctx.longValue("RecognizeODPSchemasResponse.Data.ConnProperties.QueryTimeout"));
		connProperties.setTestOnBorrow(_ctx.booleanValue("RecognizeODPSchemasResponse.Data.ConnProperties.TestOnBorrow"));
		connProperties.setValidationQuery(_ctx.stringValue("RecognizeODPSchemasResponse.Data.ConnProperties.ValidationQuery"));
		connProperties.setValidationQueryTimeout(_ctx.longValue("RecognizeODPSchemasResponse.Data.ConnProperties.ValidationQueryTimeout"));
		data.setConnProperties(connProperties);

		Schema schema = new Schema();
		schema.setAppDsName(_ctx.stringValue("RecognizeODPSchemasResponse.Data.Schema.AppDsName"));
		schema.setAppName(_ctx.stringValue("RecognizeODPSchemasResponse.Data.Schema.AppName"));
		schema.setAutoCreateSchema(_ctx.booleanValue("RecognizeODPSchemasResponse.Data.Schema.AutoCreateSchema"));
		schema.setAutoUpdateVersion(_ctx.booleanValue("RecognizeODPSchemasResponse.Data.Schema.AutoUpdateVersion"));
		schema.setCharset(_ctx.stringValue("RecognizeODPSchemasResponse.Data.Schema.Charset"));
		schema.setCollation(_ctx.stringValue("RecognizeODPSchemasResponse.Data.Schema.Collation"));
		schema.setDbNum(_ctx.longValue("RecognizeODPSchemasResponse.Data.Schema.DbNum"));
		schema.setDescription(_ctx.stringValue("RecognizeODPSchemasResponse.Data.Schema.Description"));
		schema.setEnableDtx(_ctx.booleanValue("RecognizeODPSchemasResponse.Data.Schema.EnableDtx"));
		schema.setEnvMode(_ctx.stringValue("RecognizeODPSchemasResponse.Data.Schema.EnvMode"));
		schema.setEnvTenant(_ctx.stringValue("RecognizeODPSchemasResponse.Data.Schema.EnvTenant"));
		schema.setExpansionJobId(_ctx.stringValue("RecognizeODPSchemasResponse.Data.Schema.ExpansionJobId"));
		schema.setExpansionStatus(_ctx.stringValue("RecognizeODPSchemasResponse.Data.Schema.ExpansionStatus"));
		schema.setGmtCreate(_ctx.stringValue("RecognizeODPSchemasResponse.Data.Schema.GmtCreate"));
		schema.setGmtModified(_ctx.stringValue("RecognizeODPSchemasResponse.Data.Schema.GmtModified"));
		schema.setGmtValid(_ctx.stringValue("RecognizeODPSchemasResponse.Data.Schema.GmtValid"));
		schema.setGroupCount(_ctx.longValue("RecognizeODPSchemasResponse.Data.Schema.GroupCount"));
		schema.setId(_ctx.longValue("RecognizeODPSchemasResponse.Data.Schema.Id"));
		schema.setInstanceId(_ctx.stringValue("RecognizeODPSchemasResponse.Data.Schema.InstanceId"));
		schema.setInstanceName(_ctx.stringValue("RecognizeODPSchemasResponse.Data.Schema.InstanceName"));
		schema.setLatestVersion(_ctx.stringValue("RecognizeODPSchemasResponse.Data.Schema.LatestVersion"));
		schema.setLogicTableCount(_ctx.stringValue("RecognizeODPSchemasResponse.Data.Schema.LogicTableCount"));
		schema.setOpenReadAndWriteSeparation(_ctx.booleanValue("RecognizeODPSchemasResponse.Data.Schema.OpenReadAndWriteSeparation"));
		schema.setOperator(_ctx.stringValue("RecognizeODPSchemasResponse.Data.Schema.Operator"));
		schema.setOwner(_ctx.stringValue("RecognizeODPSchemasResponse.Data.Schema.Owner"));
		schema.setParserDbType(_ctx.stringValue("RecognizeODPSchemasResponse.Data.Schema.ParserDbType"));
		schema.setPassword(_ctx.stringValue("RecognizeODPSchemasResponse.Data.Schema.Password"));
		schema.setPhysicalSchemaCount(_ctx.longValue("RecognizeODPSchemasResponse.Data.Schema.PhysicalSchemaCount"));
		schema.setSchemaGroupType(_ctx.longValue("RecognizeODPSchemasResponse.Data.Schema.SchemaGroupType"));
		schema.setSchemaName(_ctx.stringValue("RecognizeODPSchemasResponse.Data.Schema.SchemaName"));
		schema.setStatus(_ctx.stringValue("RecognizeODPSchemasResponse.Data.Schema.Status"));
		schema.setUpdateStatus(_ctx.stringValue("RecognizeODPSchemasResponse.Data.Schema.UpdateStatus"));
		schema.setVersion(_ctx.stringValue("RecognizeODPSchemasResponse.Data.Schema.Version"));

		ServerProps serverProps = new ServerProps();
		serverProps.setBackendMaxConn(_ctx.longValue("RecognizeODPSchemasResponse.Data.Schema.ServerProps.BackendMaxConn"));
		serverProps.setEnvMode(_ctx.stringValue("RecognizeODPSchemasResponse.Data.Schema.ServerProps.EnvMode"));
		serverProps.setEnvTenant(_ctx.stringValue("RecognizeODPSchemasResponse.Data.Schema.ServerProps.EnvTenant"));
		serverProps.setFrontendIdleTimeout(_ctx.longValue("RecognizeODPSchemasResponse.Data.Schema.ServerProps.FrontendIdleTimeout"));
		serverProps.setFrontendSlaLatency(_ctx.longValue("RecognizeODPSchemasResponse.Data.Schema.ServerProps.FrontendSlaLatency"));
		serverProps.setFrontendSlaTps(_ctx.longValue("RecognizeODPSchemasResponse.Data.Schema.ServerProps.FrontendSlaTps"));
		serverProps.setGmtCreate(_ctx.stringValue("RecognizeODPSchemasResponse.Data.Schema.ServerProps.GmtCreate"));
		serverProps.setGmtModified(_ctx.stringValue("RecognizeODPSchemasResponse.Data.Schema.ServerProps.GmtModified"));
		serverProps.setSchemaName(_ctx.stringValue("RecognizeODPSchemasResponse.Data.Schema.ServerProps.SchemaName"));
		schema.setServerProps(serverProps);

		List<NodeSchemaMappingsItem> nodeSchemaMappings = new ArrayList<NodeSchemaMappingsItem>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeODPSchemasResponse.Data.Schema.NodeSchemaMappings.Length"); i++) {
			NodeSchemaMappingsItem nodeSchemaMappingsItem = new NodeSchemaMappingsItem();
			nodeSchemaMappingsItem.setNodeId(_ctx.stringValue("RecognizeODPSchemasResponse.Data.Schema.NodeSchemaMappings["+ i +"].NodeId"));
			nodeSchemaMappingsItem.setPhysicalPassword(_ctx.stringValue("RecognizeODPSchemasResponse.Data.Schema.NodeSchemaMappings["+ i +"].PhysicalPassword"));
			nodeSchemaMappingsItem.setPhysicalUsername(_ctx.stringValue("RecognizeODPSchemasResponse.Data.Schema.NodeSchemaMappings["+ i +"].PhysicalUsername"));
			nodeSchemaMappingsItem.setPowerfulPassword(_ctx.stringValue("RecognizeODPSchemasResponse.Data.Schema.NodeSchemaMappings["+ i +"].PowerfulPassword"));
			nodeSchemaMappingsItem.setPowerfulUsername(_ctx.stringValue("RecognizeODPSchemasResponse.Data.Schema.NodeSchemaMappings["+ i +"].PowerfulUsername"));
			nodeSchemaMappingsItem.setSchemaCount(_ctx.longValue("RecognizeODPSchemasResponse.Data.Schema.NodeSchemaMappings["+ i +"].SchemaCount"));
			nodeSchemaMappingsItem.setSchemaPattern(_ctx.stringValue("RecognizeODPSchemasResponse.Data.Schema.NodeSchemaMappings["+ i +"].SchemaPattern"));

			nodeSchemaMappings.add(nodeSchemaMappingsItem);
		}
		schema.setNodeSchemaMappings(nodeSchemaMappings);
		data.setSchema(schema);

		List<LogicTablesItem> logicTables = new ArrayList<LogicTablesItem>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeODPSchemasResponse.Data.LogicTables.Length"); i++) {
			LogicTablesItem logicTablesItem = new LogicTablesItem();
			logicTablesItem.setBroadcastTable(_ctx.booleanValue("RecognizeODPSchemasResponse.Data.LogicTables["+ i +"].BroadcastTable"));
			logicTablesItem.setCreateTableNow(_ctx.booleanValue("RecognizeODPSchemasResponse.Data.LogicTables["+ i +"].CreateTableNow"));
			logicTablesItem.setEnvMode(_ctx.stringValue("RecognizeODPSchemasResponse.Data.LogicTables["+ i +"].EnvMode"));
			logicTablesItem.setEnvTenant(_ctx.stringValue("RecognizeODPSchemasResponse.Data.LogicTables["+ i +"].EnvTenant"));
			logicTablesItem.setGmtCreate(_ctx.stringValue("RecognizeODPSchemasResponse.Data.LogicTables["+ i +"].GmtCreate"));
			logicTablesItem.setGmtModified(_ctx.stringValue("RecognizeODPSchemasResponse.Data.LogicTables["+ i +"].GmtModified"));
			logicTablesItem.setGroupCount(_ctx.longValue("RecognizeODPSchemasResponse.Data.LogicTables["+ i +"].GroupCount"));
			logicTablesItem.setId(_ctx.longValue("RecognizeODPSchemasResponse.Data.LogicTables["+ i +"].Id"));
			logicTablesItem.setInstanceId(_ctx.stringValue("RecognizeODPSchemasResponse.Data.LogicTables["+ i +"].InstanceId"));
			logicTablesItem.setSchemaGroupType(_ctx.longValue("RecognizeODPSchemasResponse.Data.LogicTables["+ i +"].SchemaGroupType"));
			logicTablesItem.setSchemaName(_ctx.stringValue("RecognizeODPSchemasResponse.Data.LogicTables["+ i +"].SchemaName"));
			logicTablesItem.setSingleTable(_ctx.booleanValue("RecognizeODPSchemasResponse.Data.LogicTables["+ i +"].SingleTable"));
			logicTablesItem.setSqlText(_ctx.stringValue("RecognizeODPSchemasResponse.Data.LogicTables["+ i +"].SqlText"));
			logicTablesItem.setTableCount(_ctx.longValue("RecognizeODPSchemasResponse.Data.LogicTables["+ i +"].TableCount"));
			logicTablesItem.setTableName(_ctx.stringValue("RecognizeODPSchemasResponse.Data.LogicTables["+ i +"].TableName"));
			logicTablesItem.setTbSuffix(_ctx.stringValue("RecognizeODPSchemasResponse.Data.LogicTables["+ i +"].TbSuffix"));
			logicTablesItem.setTbSuffixPadding(_ctx.stringValue("RecognizeODPSchemasResponse.Data.LogicTables["+ i +"].TbSuffixPadding"));

			List<DbRulesItem> dbRules = new ArrayList<DbRulesItem>();
			for (int j = 0; j < _ctx.lengthValue("RecognizeODPSchemasResponse.Data.LogicTables["+ i +"].DbRules.Length"); j++) {
				DbRulesItem dbRulesItem = new DbRulesItem();
				dbRulesItem.setCustomized(_ctx.booleanValue("RecognizeODPSchemasResponse.Data.LogicTables["+ i +"].DbRules["+ j +"].Customized"));
				dbRulesItem.setField(_ctx.stringValue("RecognizeODPSchemasResponse.Data.LogicTables["+ i +"].DbRules["+ j +"].Field"));
				dbRulesItem.setText(_ctx.stringValue("RecognizeODPSchemasResponse.Data.LogicTables["+ i +"].DbRules["+ j +"].Text"));
				dbRulesItem.setValue(_ctx.stringValue("RecognizeODPSchemasResponse.Data.LogicTables["+ i +"].DbRules["+ j +"].Value"));

				dbRules.add(dbRulesItem);
			}
			logicTablesItem.setDbRules(dbRules);

			List<RulesItem> rules = new ArrayList<RulesItem>();
			for (int j = 0; j < _ctx.lengthValue("RecognizeODPSchemasResponse.Data.LogicTables["+ i +"].Rules.Length"); j++) {
				RulesItem rulesItem = new RulesItem();
				rulesItem.setCustomized(_ctx.booleanValue("RecognizeODPSchemasResponse.Data.LogicTables["+ i +"].Rules["+ j +"].Customized"));
				rulesItem.setField(_ctx.stringValue("RecognizeODPSchemasResponse.Data.LogicTables["+ i +"].Rules["+ j +"].Field"));
				rulesItem.setText(_ctx.stringValue("RecognizeODPSchemasResponse.Data.LogicTables["+ i +"].Rules["+ j +"].Text"));
				rulesItem.setValue(_ctx.stringValue("RecognizeODPSchemasResponse.Data.LogicTables["+ i +"].Rules["+ j +"].Value"));

				rules.add(rulesItem);
			}
			logicTablesItem.setRules(rules);

			logicTables.add(logicTablesItem);
		}
		data.setLogicTables(logicTables);
		recognizeODPSchemasResponse.setData(data);
	 
	 	return recognizeODPSchemasResponse;
	}
}