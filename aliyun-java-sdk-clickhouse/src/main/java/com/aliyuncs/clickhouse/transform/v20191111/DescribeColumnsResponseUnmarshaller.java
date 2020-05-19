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

import com.aliyuncs.clickhouse.model.v20191111.DescribeColumnsResponse;
import com.aliyuncs.clickhouse.model.v20191111.DescribeColumnsResponse.Column;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeColumnsResponseUnmarshaller {

	public static DescribeColumnsResponse unmarshall(DescribeColumnsResponse describeColumnsResponse, UnmarshallerContext _ctx) {
		
		describeColumnsResponse.setRequestId(_ctx.stringValue("DescribeColumnsResponse.RequestId"));

		List<Column> items = new ArrayList<Column>();
		for (int i = 0; i < _ctx.lengthValue("DescribeColumnsResponse.Items.Length"); i++) {
			Column column = new Column();
			column.setDBClusterId(_ctx.stringValue("DescribeColumnsResponse.Items["+ i +"].DBClusterId"));
			column.setSchemaName(_ctx.stringValue("DescribeColumnsResponse.Items["+ i +"].SchemaName"));
			column.setTableName(_ctx.stringValue("DescribeColumnsResponse.Items["+ i +"].TableName"));
			column.setColumnName(_ctx.stringValue("DescribeColumnsResponse.Items["+ i +"].ColumnName"));
			column.setType(_ctx.stringValue("DescribeColumnsResponse.Items["+ i +"].Type"));
			column.setPrimaryKey(_ctx.booleanValue("DescribeColumnsResponse.Items["+ i +"].PrimaryKey"));
			column.setAutoIncrementColumn(_ctx.booleanValue("DescribeColumnsResponse.Items["+ i +"].AutoIncrementColumn"));

			items.add(column);
		}
		describeColumnsResponse.setItems(items);
	 
	 	return describeColumnsResponse;
	}
}