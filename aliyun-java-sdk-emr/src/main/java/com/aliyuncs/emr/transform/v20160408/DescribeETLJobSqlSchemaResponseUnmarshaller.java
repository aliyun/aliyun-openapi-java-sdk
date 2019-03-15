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

import com.aliyuncs.emr.model.v20160408.DescribeETLJobSqlSchemaResponse;
import com.aliyuncs.emr.model.v20160408.DescribeETLJobSqlSchemaResponse.Schema;
import com.aliyuncs.emr.model.v20160408.DescribeETLJobSqlSchemaResponse.Schema.Field;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeETLJobSqlSchemaResponseUnmarshaller {

	public static DescribeETLJobSqlSchemaResponse unmarshall(DescribeETLJobSqlSchemaResponse describeETLJobSqlSchemaResponse, UnmarshallerContext context) {
		
		describeETLJobSqlSchemaResponse.setRequestId(context.stringValue("DescribeETLJobSqlSchemaResponse.RequestId"));

		Schema schema = new Schema();
		schema.setName(context.stringValue("DescribeETLJobSqlSchemaResponse.Schema.Name"));

		List<Field> fields = new ArrayList<Field>();
		for (int i = 0; i < context.lengthValue("DescribeETLJobSqlSchemaResponse.Schema.Fields.Length"); i++) {
			Field field = new Field();
			field.setType(context.stringValue("DescribeETLJobSqlSchemaResponse.Schema.Fields["+ i +"].Type"));
			field.setName(context.stringValue("DescribeETLJobSqlSchemaResponse.Schema.Fields["+ i +"].Name"));
			field.setIndex(context.integerValue("DescribeETLJobSqlSchemaResponse.Schema.Fields["+ i +"].Index"));
			field.setRawType(context.stringValue("DescribeETLJobSqlSchemaResponse.Schema.Fields["+ i +"].RawType"));
			field.setAssignType(context.stringValue("DescribeETLJobSqlSchemaResponse.Schema.Fields["+ i +"].AssignType"));
			field.setAssignValue(context.stringValue("DescribeETLJobSqlSchemaResponse.Schema.Fields["+ i +"].AssignValue"));

			fields.add(field);
		}
		schema.setFields(fields);
		describeETLJobSqlSchemaResponse.setSchema(schema);
	 
	 	return describeETLJobSqlSchemaResponse;
	}
}