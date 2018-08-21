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

package com.aliyuncs.petadata.transform.v20160101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.petadata.model.v20160101.DescribeTablesResponse;
import com.aliyuncs.petadata.model.v20160101.DescribeTablesResponse.Table;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTablesResponseUnmarshaller {

	public static DescribeTablesResponse unmarshall(DescribeTablesResponse describeTablesResponse, UnmarshallerContext context) {
		
		describeTablesResponse.setRequestId(context.stringValue("DescribeTablesResponse.RequestId"));
		describeTablesResponse.setInstanceId(context.stringValue("DescribeTablesResponse.InstanceId"));
		describeTablesResponse.setDBName(context.stringValue("DescribeTablesResponse.DBName"));

		List<Table> tables = new ArrayList<Table>();
		for (int i = 0; i < context.lengthValue("DescribeTablesResponse.Tables.Length"); i++) {
			Table table = new Table();
			table.setTableName(context.stringValue("DescribeTablesResponse.Tables["+ i +"].TableName"));
			table.setPartitionKey(context.stringValue("DescribeTablesResponse.Tables["+ i +"].PartitionKey"));
			table.setPrimaryKey(context.stringValue("DescribeTablesResponse.Tables["+ i +"].PrimaryKey"));
			table.setTableStatus(context.stringValue("DescribeTablesResponse.Tables["+ i +"].TableStatus"));

			tables.add(table);
		}
		describeTablesResponse.setTables(tables);
	 
	 	return describeTablesResponse;
	}
}