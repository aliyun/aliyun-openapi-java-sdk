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

import com.aliyuncs.petadata.model.v20160101.DescribeTableInfoResponse;
import com.aliyuncs.petadata.model.v20160101.DescribeTableInfoResponse.Column;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTableInfoResponseUnmarshaller {

	public static DescribeTableInfoResponse unmarshall(DescribeTableInfoResponse describeTableInfoResponse, UnmarshallerContext context) {
		
		describeTableInfoResponse.setRequestId(context.stringValue("DescribeTableInfoResponse.RequestId"));
		describeTableInfoResponse.setInstanceId(context.stringValue("DescribeTableInfoResponse.InstanceId"));
		describeTableInfoResponse.setDBName(context.stringValue("DescribeTableInfoResponse.DBName"));
		describeTableInfoResponse.setTableName(context.stringValue("DescribeTableInfoResponse.TableName"));
		describeTableInfoResponse.setPartitionKey(context.stringValue("DescribeTableInfoResponse.PartitionKey"));
		describeTableInfoResponse.setPrimaryKey(context.stringValue("DescribeTableInfoResponse.PrimaryKey"));

		List<Column> columns = new ArrayList<Column>();
		for (int i = 0; i < context.lengthValue("DescribeTableInfoResponse.Columns.Length"); i++) {
			Column column = new Column();
			column.setColumnName(context.stringValue("DescribeTableInfoResponse.Columns["+ i +"].ColumnName"));
			column.setColumnDataType(context.stringValue("DescribeTableInfoResponse.Columns["+ i +"].ColumnDataType"));
			column.setColumnDataLength(context.integerValue("DescribeTableInfoResponse.Columns["+ i +"].ColumnDataLength"));
			column.setIsNull(context.booleanValue("DescribeTableInfoResponse.Columns["+ i +"].IsNull"));

			columns.add(column);
		}
		describeTableInfoResponse.setColumns(columns);
	 
	 	return describeTableInfoResponse;
	}
}