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

package com.aliyuncs.adb.transform.v20190315;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.adb.model.v20190315.DescribeAllDataSourceResponse;
import com.aliyuncs.adb.model.v20190315.DescribeAllDataSourceResponse.Column;
import com.aliyuncs.adb.model.v20190315.DescribeAllDataSourceResponse.Schema;
import com.aliyuncs.adb.model.v20190315.DescribeAllDataSourceResponse.Table;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAllDataSourceResponseUnmarshaller {

	public static DescribeAllDataSourceResponse unmarshall(DescribeAllDataSourceResponse describeAllDataSourceResponse, UnmarshallerContext _ctx) {
		
		describeAllDataSourceResponse.setRequestId(_ctx.stringValue("DescribeAllDataSourceResponse.RequestId"));

		List<Table> tables = new ArrayList<Table>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAllDataSourceResponse.Tables.Length"); i++) {
			Table table = new Table();
			table.setTableName(_ctx.stringValue("DescribeAllDataSourceResponse.Tables["+ i +"].TableName"));
			table.setDBClusterId(_ctx.stringValue("DescribeAllDataSourceResponse.Tables["+ i +"].DBClusterId"));
			table.setSchemaName(_ctx.stringValue("DescribeAllDataSourceResponse.Tables["+ i +"].SchemaName"));

			tables.add(table);
		}
		describeAllDataSourceResponse.setTables(tables);

		List<Column> columns = new ArrayList<Column>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAllDataSourceResponse.Columns.Length"); i++) {
			Column column = new Column();
			column.setType(_ctx.stringValue("DescribeAllDataSourceResponse.Columns["+ i +"].Type"));
			column.setColumnName(_ctx.stringValue("DescribeAllDataSourceResponse.Columns["+ i +"].ColumnName"));
			column.setTableName(_ctx.stringValue("DescribeAllDataSourceResponse.Columns["+ i +"].TableName"));
			column.setAutoIncrementColumn(_ctx.booleanValue("DescribeAllDataSourceResponse.Columns["+ i +"].AutoIncrementColumn"));
			column.setDBClusterId(_ctx.stringValue("DescribeAllDataSourceResponse.Columns["+ i +"].DBClusterId"));
			column.setPrimaryKey(_ctx.booleanValue("DescribeAllDataSourceResponse.Columns["+ i +"].PrimaryKey"));
			column.setSchemaName(_ctx.stringValue("DescribeAllDataSourceResponse.Columns["+ i +"].SchemaName"));

			columns.add(column);
		}
		describeAllDataSourceResponse.setColumns(columns);

		List<Schema> schemas = new ArrayList<Schema>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAllDataSourceResponse.Schemas.Length"); i++) {
			Schema schema = new Schema();
			schema.setDBClusterId(_ctx.stringValue("DescribeAllDataSourceResponse.Schemas["+ i +"].DBClusterId"));
			schema.setSchemaName(_ctx.stringValue("DescribeAllDataSourceResponse.Schemas["+ i +"].SchemaName"));

			schemas.add(schema);
		}
		describeAllDataSourceResponse.setSchemas(schemas);
	 
	 	return describeAllDataSourceResponse;
	}
}