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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.DescribeDataSourceSchemaTableResponse;
import com.aliyuncs.emr.model.v20160408.DescribeDataSourceSchemaTableResponse.Schema;
import com.aliyuncs.emr.model.v20160408.DescribeDataSourceSchemaTableResponse.Schema.Field;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDataSourceSchemaTableResponseUnmarshaller {

	public static DescribeDataSourceSchemaTableResponse unmarshall(DescribeDataSourceSchemaTableResponse describeDataSourceSchemaTableResponse, UnmarshallerContext _ctx) {
		
		describeDataSourceSchemaTableResponse.setRequestId(_ctx.stringValue("DescribeDataSourceSchemaTableResponse.RequestId"));
		describeDataSourceSchemaTableResponse.setDataSourceId(_ctx.stringValue("DescribeDataSourceSchemaTableResponse.DataSourceId"));

		Schema schema = new Schema();
		schema.setDbType(_ctx.stringValue("DescribeDataSourceSchemaTableResponse.Schema.DbType"));
		schema.setDbVersion(_ctx.stringValue("DescribeDataSourceSchemaTableResponse.Schema.DbVersion"));
		schema.setDbName(_ctx.stringValue("DescribeDataSourceSchemaTableResponse.Schema.DbName"));
		schema.setTableName(_ctx.stringValue("DescribeDataSourceSchemaTableResponse.Schema.TableName"));

		List<Field> fields = new ArrayList<Field>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDataSourceSchemaTableResponse.Schema.Fields.Length"); i++) {
			Field field = new Field();
			field.setType(_ctx.stringValue("DescribeDataSourceSchemaTableResponse.Schema.Fields["+ i +"].Type"));
			field.setLength(_ctx.stringValue("DescribeDataSourceSchemaTableResponse.Schema.Fields["+ i +"].Length"));
			field.setName(_ctx.stringValue("DescribeDataSourceSchemaTableResponse.Schema.Fields["+ i +"].Name"));
			field.setIndex(_ctx.integerValue("DescribeDataSourceSchemaTableResponse.Schema.Fields["+ i +"].Index"));
			field.setRawType(_ctx.stringValue("DescribeDataSourceSchemaTableResponse.Schema.Fields["+ i +"].RawType"));
			field.setAssignType(_ctx.stringValue("DescribeDataSourceSchemaTableResponse.Schema.Fields["+ i +"].AssignType"));
			field.setAssignValue(_ctx.stringValue("DescribeDataSourceSchemaTableResponse.Schema.Fields["+ i +"].AssignValue"));
			field.setPartitionKey(_ctx.booleanValue("DescribeDataSourceSchemaTableResponse.Schema.Fields["+ i +"].PartitionKey"));

			fields.add(field);
		}
		schema.setFields(fields);
		describeDataSourceSchemaTableResponse.setSchema(schema);
	 
	 	return describeDataSourceSchemaTableResponse;
	}
}