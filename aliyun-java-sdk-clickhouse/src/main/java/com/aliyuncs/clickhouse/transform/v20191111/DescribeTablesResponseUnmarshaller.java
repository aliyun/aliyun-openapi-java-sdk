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

import com.aliyuncs.clickhouse.model.v20191111.DescribeTablesResponse;
import com.aliyuncs.clickhouse.model.v20191111.DescribeTablesResponse.Table;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTablesResponseUnmarshaller {

	public static DescribeTablesResponse unmarshall(DescribeTablesResponse describeTablesResponse, UnmarshallerContext _ctx) {
		
		describeTablesResponse.setRequestId(_ctx.stringValue("DescribeTablesResponse.RequestId"));

		List<Table> items = new ArrayList<Table>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTablesResponse.Items.Length"); i++) {
			Table table = new Table();
			table.setDBClusterId(_ctx.stringValue("DescribeTablesResponse.Items["+ i +"].DBClusterId"));
			table.setSchemaName(_ctx.stringValue("DescribeTablesResponse.Items["+ i +"].SchemaName"));
			table.setTableName(_ctx.stringValue("DescribeTablesResponse.Items["+ i +"].TableName"));

			items.add(table);
		}
		describeTablesResponse.setItems(items);
	 
	 	return describeTablesResponse;
	}
}