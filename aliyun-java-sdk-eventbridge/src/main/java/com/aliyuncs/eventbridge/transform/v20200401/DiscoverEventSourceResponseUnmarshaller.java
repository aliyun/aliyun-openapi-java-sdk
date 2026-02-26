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

package com.aliyuncs.eventbridge.transform.v20200401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eventbridge.model.v20200401.DiscoverEventSourceResponse;
import com.aliyuncs.eventbridge.model.v20200401.DiscoverEventSourceResponse.Data;
import com.aliyuncs.eventbridge.model.v20200401.DiscoverEventSourceResponse.Data.SourceMySQLDiscovery;
import com.aliyuncs.eventbridge.model.v20200401.DiscoverEventSourceResponse.Data.SourceMySQLDiscovery.TableSchema;
import com.aliyuncs.eventbridge.model.v20200401.DiscoverEventSourceResponse.Data.SourceMySQLDiscovery.TableSchema.ColumnsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DiscoverEventSourceResponseUnmarshaller {

	public static DiscoverEventSourceResponse unmarshall(DiscoverEventSourceResponse discoverEventSourceResponse, UnmarshallerContext _ctx) {
		
		discoverEventSourceResponse.setRequestId(_ctx.stringValue("DiscoverEventSourceResponse.RequestId"));
		discoverEventSourceResponse.setCode(_ctx.stringValue("DiscoverEventSourceResponse.Code"));
		discoverEventSourceResponse.setMessage(_ctx.stringValue("DiscoverEventSourceResponse.Message"));
		discoverEventSourceResponse.setSuccess(_ctx.booleanValue("DiscoverEventSourceResponse.Success"));

		Data data = new Data();

		SourceMySQLDiscovery sourceMySQLDiscovery = new SourceMySQLDiscovery();
		sourceMySQLDiscovery.setSimpleData(_ctx.stringValue("DiscoverEventSourceResponse.Data.SourceMySQLDiscovery.SimpleData"));
		sourceMySQLDiscovery.setExpireLogsDays(_ctx.integerValue("DiscoverEventSourceResponse.Data.SourceMySQLDiscovery.ExpireLogsDays"));
		sourceMySQLDiscovery.setWaitTimeout(_ctx.integerValue("DiscoverEventSourceResponse.Data.SourceMySQLDiscovery.WaitTimeout"));
		sourceMySQLDiscovery.setEstimatedRows(_ctx.longValue("DiscoverEventSourceResponse.Data.SourceMySQLDiscovery.EstimatedRows"));

		List<String> databaseNames = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DiscoverEventSourceResponse.Data.SourceMySQLDiscovery.DatabaseNames.Length"); i++) {
			databaseNames.add(_ctx.stringValue("DiscoverEventSourceResponse.Data.SourceMySQLDiscovery.DatabaseNames["+ i +"]"));
		}
		sourceMySQLDiscovery.setDatabaseNames(databaseNames);

		List<String> tableNames = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DiscoverEventSourceResponse.Data.SourceMySQLDiscovery.TableNames.Length"); i++) {
			tableNames.add(_ctx.stringValue("DiscoverEventSourceResponse.Data.SourceMySQLDiscovery.TableNames["+ i +"]"));
		}
		sourceMySQLDiscovery.setTableNames(tableNames);

		TableSchema tableSchema = new TableSchema();
		tableSchema.setTableName(_ctx.stringValue("DiscoverEventSourceResponse.Data.SourceMySQLDiscovery.TableSchema.TableName"));

		List<ColumnsItem> columns = new ArrayList<ColumnsItem>();
		for (int i = 0; i < _ctx.lengthValue("DiscoverEventSourceResponse.Data.SourceMySQLDiscovery.TableSchema.Columns.Length"); i++) {
			ColumnsItem columnsItem = new ColumnsItem();
			columnsItem.setField(_ctx.stringValue("DiscoverEventSourceResponse.Data.SourceMySQLDiscovery.TableSchema.Columns["+ i +"].Field"));
			columnsItem.setIsNull(_ctx.stringValue("DiscoverEventSourceResponse.Data.SourceMySQLDiscovery.TableSchema.Columns["+ i +"].IsNull"));
			columnsItem.setExtra(_ctx.stringValue("DiscoverEventSourceResponse.Data.SourceMySQLDiscovery.TableSchema.Columns["+ i +"].Extra"));
			columnsItem.setType(_ctx.stringValue("DiscoverEventSourceResponse.Data.SourceMySQLDiscovery.TableSchema.Columns["+ i +"].Type"));
			columnsItem.setKey(_ctx.stringValue("DiscoverEventSourceResponse.Data.SourceMySQLDiscovery.TableSchema.Columns["+ i +"].Key"));

			columns.add(columnsItem);
		}
		tableSchema.setColumns(columns);
		sourceMySQLDiscovery.setTableSchema(tableSchema);
		data.setSourceMySQLDiscovery(sourceMySQLDiscovery);
		discoverEventSourceResponse.setData(data);
	 
	 	return discoverEventSourceResponse;
	}
}