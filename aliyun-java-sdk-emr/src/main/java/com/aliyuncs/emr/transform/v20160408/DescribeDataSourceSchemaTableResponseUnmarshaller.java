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

	public static DescribeDataSourceSchemaTableResponse unmarshall(DescribeDataSourceSchemaTableResponse describeDataSourceSchemaTableResponse, UnmarshallerContext context) {
		
		describeDataSourceSchemaTableResponse.setRequestId(context.stringValue("DescribeDataSourceSchemaTableResponse.RequestId"));
		describeDataSourceSchemaTableResponse.setDataSourceId(context.stringValue("DescribeDataSourceSchemaTableResponse.DataSourceId"));

		Schema schema = new Schema();
		schema.setDbType(context.stringValue("DescribeDataSourceSchemaTableResponse.Schema.DbType"));
		schema.setDbVersion(context.stringValue("DescribeDataSourceSchemaTableResponse.Schema.DbVersion"));
		schema.setDbName(context.stringValue("DescribeDataSourceSchemaTableResponse.Schema.DbName"));
		schema.setTableName(context.stringValue("DescribeDataSourceSchemaTableResponse.Schema.TableName"));

		List<Field> fields = new ArrayList<Field>();
		for (int i = 0; i < context.lengthValue("DescribeDataSourceSchemaTableResponse.Schema.Fields.Length"); i++) {
			Field field = new Field();
			field.setType(context.stringValue("DescribeDataSourceSchemaTableResponse.Schema.Fields["+ i +"].Type"));
			field.setName(context.stringValue("DescribeDataSourceSchemaTableResponse.Schema.Fields["+ i +"].Name"));
			field.setIndex(context.integerValue("DescribeDataSourceSchemaTableResponse.Schema.Fields["+ i +"].Index"));
			field.setRawType(context.stringValue("DescribeDataSourceSchemaTableResponse.Schema.Fields["+ i +"].RawType"));
			field.setAssignType(context.stringValue("DescribeDataSourceSchemaTableResponse.Schema.Fields["+ i +"].AssignType"));
			field.setAssignValue(context.stringValue("DescribeDataSourceSchemaTableResponse.Schema.Fields["+ i +"].AssignValue"));

			fields.add(field);
		}
		schema.setFields(fields);
		describeDataSourceSchemaTableResponse.setSchema(schema);
	 
	 	return describeDataSourceSchemaTableResponse;
	}
}