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

	public static DescribeETLJobSqlSchemaResponse unmarshall(DescribeETLJobSqlSchemaResponse describeETLJobSqlSchemaResponse, UnmarshallerContext _ctx) {
		
		describeETLJobSqlSchemaResponse.setRequestId(_ctx.stringValue("DescribeETLJobSqlSchemaResponse.RequestId"));

		Schema schema = new Schema();
		schema.setName(_ctx.stringValue("DescribeETLJobSqlSchemaResponse.Schema.Name"));

		List<Field> fields = new ArrayList<Field>();
		for (int i = 0; i < _ctx.lengthValue("DescribeETLJobSqlSchemaResponse.Schema.Fields.Length"); i++) {
			Field field = new Field();
			field.setType(_ctx.stringValue("DescribeETLJobSqlSchemaResponse.Schema.Fields["+ i +"].Type"));
			field.setLength(_ctx.stringValue("DescribeETLJobSqlSchemaResponse.Schema.Fields["+ i +"].Length"));
			field.setName(_ctx.stringValue("DescribeETLJobSqlSchemaResponse.Schema.Fields["+ i +"].Name"));
			field.setIndex(_ctx.integerValue("DescribeETLJobSqlSchemaResponse.Schema.Fields["+ i +"].Index"));
			field.setRawType(_ctx.stringValue("DescribeETLJobSqlSchemaResponse.Schema.Fields["+ i +"].RawType"));
			field.setAssignType(_ctx.stringValue("DescribeETLJobSqlSchemaResponse.Schema.Fields["+ i +"].AssignType"));
			field.setAssignValue(_ctx.stringValue("DescribeETLJobSqlSchemaResponse.Schema.Fields["+ i +"].AssignValue"));
			field.setPartitionKey(_ctx.booleanValue("DescribeETLJobSqlSchemaResponse.Schema.Fields["+ i +"].PartitionKey"));

			fields.add(field);
		}
		schema.setFields(fields);
		describeETLJobSqlSchemaResponse.setSchema(schema);
	 
	 	return describeETLJobSqlSchemaResponse;
	}
}