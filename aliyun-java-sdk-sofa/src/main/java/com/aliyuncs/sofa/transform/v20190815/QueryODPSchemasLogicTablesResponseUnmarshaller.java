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

import com.aliyuncs.sofa.model.v20190815.QueryODPSchemasLogicTablesResponse;
import com.aliyuncs.sofa.model.v20190815.QueryODPSchemasLogicTablesResponse.Data;
import com.aliyuncs.sofa.model.v20190815.QueryODPSchemasLogicTablesResponse.Data.DbRulesItem;
import com.aliyuncs.sofa.model.v20190815.QueryODPSchemasLogicTablesResponse.Data.RulesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryODPSchemasLogicTablesResponseUnmarshaller {

	public static QueryODPSchemasLogicTablesResponse unmarshall(QueryODPSchemasLogicTablesResponse queryODPSchemasLogicTablesResponse, UnmarshallerContext _ctx) {
		
		queryODPSchemasLogicTablesResponse.setRequestId(_ctx.stringValue("QueryODPSchemasLogicTablesResponse.RequestId"));
		queryODPSchemasLogicTablesResponse.setResultCode(_ctx.stringValue("QueryODPSchemasLogicTablesResponse.ResultCode"));
		queryODPSchemasLogicTablesResponse.setResultMessage(_ctx.stringValue("QueryODPSchemasLogicTablesResponse.ResultMessage"));

		Data data = new Data();
		data.setBroadcastTable(_ctx.booleanValue("QueryODPSchemasLogicTablesResponse.Data.BroadcastTable"));
		data.setCreateTableNow(_ctx.booleanValue("QueryODPSchemasLogicTablesResponse.Data.CreateTableNow"));
		data.setEnvMode(_ctx.stringValue("QueryODPSchemasLogicTablesResponse.Data.EnvMode"));
		data.setEnvTenant(_ctx.stringValue("QueryODPSchemasLogicTablesResponse.Data.EnvTenant"));
		data.setGmtCreate(_ctx.stringValue("QueryODPSchemasLogicTablesResponse.Data.GmtCreate"));
		data.setGmtModified(_ctx.stringValue("QueryODPSchemasLogicTablesResponse.Data.GmtModified"));
		data.setGroupCount(_ctx.longValue("QueryODPSchemasLogicTablesResponse.Data.GroupCount"));
		data.setId(_ctx.longValue("QueryODPSchemasLogicTablesResponse.Data.Id"));
		data.setInstanceId(_ctx.stringValue("QueryODPSchemasLogicTablesResponse.Data.InstanceId"));
		data.setSchemaGroupType(_ctx.longValue("QueryODPSchemasLogicTablesResponse.Data.SchemaGroupType"));
		data.setSchemaName(_ctx.stringValue("QueryODPSchemasLogicTablesResponse.Data.SchemaName"));
		data.setSingleTable(_ctx.booleanValue("QueryODPSchemasLogicTablesResponse.Data.SingleTable"));
		data.setSqlText(_ctx.stringValue("QueryODPSchemasLogicTablesResponse.Data.SqlText"));
		data.setTableCount(_ctx.longValue("QueryODPSchemasLogicTablesResponse.Data.TableCount"));
		data.setTableName(_ctx.stringValue("QueryODPSchemasLogicTablesResponse.Data.TableName"));
		data.setTbSuffix(_ctx.stringValue("QueryODPSchemasLogicTablesResponse.Data.TbSuffix"));
		data.setTbSuffixPadding(_ctx.stringValue("QueryODPSchemasLogicTablesResponse.Data.TbSuffixPadding"));

		List<DbRulesItem> dbRules = new ArrayList<DbRulesItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryODPSchemasLogicTablesResponse.Data.DbRules.Length"); i++) {
			DbRulesItem dbRulesItem = new DbRulesItem();
			dbRulesItem.setCustomized(_ctx.booleanValue("QueryODPSchemasLogicTablesResponse.Data.DbRules["+ i +"].Customized"));
			dbRulesItem.setField(_ctx.stringValue("QueryODPSchemasLogicTablesResponse.Data.DbRules["+ i +"].Field"));
			dbRulesItem.setText(_ctx.stringValue("QueryODPSchemasLogicTablesResponse.Data.DbRules["+ i +"].Text"));
			dbRulesItem.setValue(_ctx.stringValue("QueryODPSchemasLogicTablesResponse.Data.DbRules["+ i +"].Value"));

			dbRules.add(dbRulesItem);
		}
		data.setDbRules(dbRules);

		List<RulesItem> rules = new ArrayList<RulesItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryODPSchemasLogicTablesResponse.Data.Rules.Length"); i++) {
			RulesItem rulesItem = new RulesItem();
			rulesItem.setCustomized(_ctx.booleanValue("QueryODPSchemasLogicTablesResponse.Data.Rules["+ i +"].Customized"));
			rulesItem.setField(_ctx.stringValue("QueryODPSchemasLogicTablesResponse.Data.Rules["+ i +"].Field"));
			rulesItem.setText(_ctx.stringValue("QueryODPSchemasLogicTablesResponse.Data.Rules["+ i +"].Text"));
			rulesItem.setValue(_ctx.stringValue("QueryODPSchemasLogicTablesResponse.Data.Rules["+ i +"].Value"));

			rules.add(rulesItem);
		}
		data.setRules(rules);
		queryODPSchemasLogicTablesResponse.setData(data);
	 
	 	return queryODPSchemasLogicTablesResponse;
	}
}