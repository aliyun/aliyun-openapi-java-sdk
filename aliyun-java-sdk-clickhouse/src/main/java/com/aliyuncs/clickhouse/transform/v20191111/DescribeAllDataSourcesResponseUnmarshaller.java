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

package com.aliyuncs.clickhouse.transform.v20191111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.clickhouse.model.v20191111.DescribeAllDataSourcesResponse;
import com.aliyuncs.clickhouse.model.v20191111.DescribeAllDataSourcesResponse.Column;
import com.aliyuncs.clickhouse.model.v20191111.DescribeAllDataSourcesResponse.Schema;
import com.aliyuncs.clickhouse.model.v20191111.DescribeAllDataSourcesResponse.Table;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAllDataSourcesResponseUnmarshaller {

	public static DescribeAllDataSourcesResponse unmarshall(DescribeAllDataSourcesResponse describeAllDataSourcesResponse, UnmarshallerContext _ctx) {
		
		describeAllDataSourcesResponse.setRequestId(_ctx.stringValue("DescribeAllDataSourcesResponse.RequestId"));

		List<Schema> schemas = new ArrayList<Schema>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAllDataSourcesResponse.Schemas.Length"); i++) {
			Schema schema = new Schema();
			schema.setDBClusterId(_ctx.stringValue("DescribeAllDataSourcesResponse.Schemas["+ i +"].DBClusterId"));
			schema.setSchemaName(_ctx.stringValue("DescribeAllDataSourcesResponse.Schemas["+ i +"].SchemaName"));

			schemas.add(schema);
		}
		describeAllDataSourcesResponse.setSchemas(schemas);

		List<Table> tables = new ArrayList<Table>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAllDataSourcesResponse.Tables.Length"); i++) {
			Table table = new Table();
			table.setDBClusterId(_ctx.stringValue("DescribeAllDataSourcesResponse.Tables["+ i +"].DBClusterId"));
			table.setSchemaName(_ctx.stringValue("DescribeAllDataSourcesResponse.Tables["+ i +"].SchemaName"));
			table.setTableName(_ctx.stringValue("DescribeAllDataSourcesResponse.Tables["+ i +"].TableName"));

			tables.add(table);
		}
		describeAllDataSourcesResponse.setTables(tables);

		List<Column> columns = new ArrayList<Column>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAllDataSourcesResponse.Columns.Length"); i++) {
			Column column = new Column();
			column.setDBClusterId(_ctx.stringValue("DescribeAllDataSourcesResponse.Columns["+ i +"].DBClusterId"));
			column.setSchemaName(_ctx.stringValue("DescribeAllDataSourcesResponse.Columns["+ i +"].SchemaName"));
			column.setTableName(_ctx.stringValue("DescribeAllDataSourcesResponse.Columns["+ i +"].TableName"));
			column.setColumnName(_ctx.stringValue("DescribeAllDataSourcesResponse.Columns["+ i +"].ColumnName"));
			column.setType(_ctx.stringValue("DescribeAllDataSourcesResponse.Columns["+ i +"].Type"));
			column.setPrimaryKey(_ctx.booleanValue("DescribeAllDataSourcesResponse.Columns["+ i +"].PrimaryKey"));
			column.setAutoIncrementColumn(_ctx.booleanValue("DescribeAllDataSourcesResponse.Columns["+ i +"].AutoIncrementColumn"));

			columns.add(column);
		}
		describeAllDataSourcesResponse.setColumns(columns);
	 
	 	return describeAllDataSourcesResponse;
	}
}