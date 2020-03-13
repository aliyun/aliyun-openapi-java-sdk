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

import com.aliyuncs.sofa.model.v20190815.BatchqueryODPSchemasLogicTablesResponse;
import com.aliyuncs.sofa.model.v20190815.BatchqueryODPSchemasLogicTablesResponse.DataItem;
import com.aliyuncs.sofa.model.v20190815.BatchqueryODPSchemasLogicTablesResponse.DataItem.DbRulesItem;
import com.aliyuncs.sofa.model.v20190815.BatchqueryODPSchemasLogicTablesResponse.DataItem.RulesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchqueryODPSchemasLogicTablesResponseUnmarshaller {

	public static BatchqueryODPSchemasLogicTablesResponse unmarshall(BatchqueryODPSchemasLogicTablesResponse batchqueryODPSchemasLogicTablesResponse, UnmarshallerContext _ctx) {
		
		batchqueryODPSchemasLogicTablesResponse.setRequestId(_ctx.stringValue("BatchqueryODPSchemasLogicTablesResponse.RequestId"));
		batchqueryODPSchemasLogicTablesResponse.setResultCode(_ctx.stringValue("BatchqueryODPSchemasLogicTablesResponse.ResultCode"));
		batchqueryODPSchemasLogicTablesResponse.setResultMessage(_ctx.stringValue("BatchqueryODPSchemasLogicTablesResponse.ResultMessage"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("BatchqueryODPSchemasLogicTablesResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setBroadcastTable(_ctx.booleanValue("BatchqueryODPSchemasLogicTablesResponse.Data["+ i +"].BroadcastTable"));
			dataItem.setCreateTableNow(_ctx.booleanValue("BatchqueryODPSchemasLogicTablesResponse.Data["+ i +"].CreateTableNow"));
			dataItem.setEnvMode(_ctx.stringValue("BatchqueryODPSchemasLogicTablesResponse.Data["+ i +"].EnvMode"));
			dataItem.setEnvTenant(_ctx.stringValue("BatchqueryODPSchemasLogicTablesResponse.Data["+ i +"].EnvTenant"));
			dataItem.setGmtCreate(_ctx.stringValue("BatchqueryODPSchemasLogicTablesResponse.Data["+ i +"].GmtCreate"));
			dataItem.setGmtModified(_ctx.stringValue("BatchqueryODPSchemasLogicTablesResponse.Data["+ i +"].GmtModified"));
			dataItem.setGroupCount(_ctx.longValue("BatchqueryODPSchemasLogicTablesResponse.Data["+ i +"].GroupCount"));
			dataItem.setId(_ctx.longValue("BatchqueryODPSchemasLogicTablesResponse.Data["+ i +"].Id"));
			dataItem.setInstanceId(_ctx.stringValue("BatchqueryODPSchemasLogicTablesResponse.Data["+ i +"].InstanceId"));
			dataItem.setSchemaGroupType(_ctx.longValue("BatchqueryODPSchemasLogicTablesResponse.Data["+ i +"].SchemaGroupType"));
			dataItem.setSchemaName(_ctx.stringValue("BatchqueryODPSchemasLogicTablesResponse.Data["+ i +"].SchemaName"));
			dataItem.setSingleTable(_ctx.booleanValue("BatchqueryODPSchemasLogicTablesResponse.Data["+ i +"].SingleTable"));
			dataItem.setSqlText(_ctx.stringValue("BatchqueryODPSchemasLogicTablesResponse.Data["+ i +"].SqlText"));
			dataItem.setTableCount(_ctx.longValue("BatchqueryODPSchemasLogicTablesResponse.Data["+ i +"].TableCount"));
			dataItem.setTableName(_ctx.stringValue("BatchqueryODPSchemasLogicTablesResponse.Data["+ i +"].TableName"));
			dataItem.setTbSuffix(_ctx.stringValue("BatchqueryODPSchemasLogicTablesResponse.Data["+ i +"].TbSuffix"));
			dataItem.setTbSuffixPadding(_ctx.stringValue("BatchqueryODPSchemasLogicTablesResponse.Data["+ i +"].TbSuffixPadding"));

			List<DbRulesItem> dbRules = new ArrayList<DbRulesItem>();
			for (int j = 0; j < _ctx.lengthValue("BatchqueryODPSchemasLogicTablesResponse.Data["+ i +"].DbRules.Length"); j++) {
				DbRulesItem dbRulesItem = new DbRulesItem();
				dbRulesItem.setCustomized(_ctx.booleanValue("BatchqueryODPSchemasLogicTablesResponse.Data["+ i +"].DbRules["+ j +"].Customized"));
				dbRulesItem.setField(_ctx.stringValue("BatchqueryODPSchemasLogicTablesResponse.Data["+ i +"].DbRules["+ j +"].Field"));
				dbRulesItem.setText(_ctx.stringValue("BatchqueryODPSchemasLogicTablesResponse.Data["+ i +"].DbRules["+ j +"].Text"));
				dbRulesItem.setValue(_ctx.stringValue("BatchqueryODPSchemasLogicTablesResponse.Data["+ i +"].DbRules["+ j +"].Value"));

				dbRules.add(dbRulesItem);
			}
			dataItem.setDbRules(dbRules);

			List<RulesItem> rules = new ArrayList<RulesItem>();
			for (int j = 0; j < _ctx.lengthValue("BatchqueryODPSchemasLogicTablesResponse.Data["+ i +"].Rules.Length"); j++) {
				RulesItem rulesItem = new RulesItem();
				rulesItem.setCustomized(_ctx.booleanValue("BatchqueryODPSchemasLogicTablesResponse.Data["+ i +"].Rules["+ j +"].Customized"));
				rulesItem.setField(_ctx.stringValue("BatchqueryODPSchemasLogicTablesResponse.Data["+ i +"].Rules["+ j +"].Field"));
				rulesItem.setText(_ctx.stringValue("BatchqueryODPSchemasLogicTablesResponse.Data["+ i +"].Rules["+ j +"].Text"));
				rulesItem.setValue(_ctx.stringValue("BatchqueryODPSchemasLogicTablesResponse.Data["+ i +"].Rules["+ j +"].Value"));

				rules.add(rulesItem);
			}
			dataItem.setRules(rules);

			data.add(dataItem);
		}
		batchqueryODPSchemasLogicTablesResponse.setData(data);
	 
	 	return batchqueryODPSchemasLogicTablesResponse;
	}
}