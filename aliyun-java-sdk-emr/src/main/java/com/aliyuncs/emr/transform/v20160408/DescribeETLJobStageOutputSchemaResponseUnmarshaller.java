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

import com.aliyuncs.emr.model.v20160408.DescribeETLJobStageOutputSchemaResponse;
import com.aliyuncs.emr.model.v20160408.DescribeETLJobStageOutputSchemaResponse.Schema;
import com.aliyuncs.emr.model.v20160408.DescribeETLJobStageOutputSchemaResponse.Schema.Field;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeETLJobStageOutputSchemaResponseUnmarshaller {

	public static DescribeETLJobStageOutputSchemaResponse unmarshall(DescribeETLJobStageOutputSchemaResponse describeETLJobStageOutputSchemaResponse, UnmarshallerContext _ctx) {
		
		describeETLJobStageOutputSchemaResponse.setRequestId(_ctx.stringValue("DescribeETLJobStageOutputSchemaResponse.RequestId"));

		Schema schema = new Schema();
		schema.setName(_ctx.stringValue("DescribeETLJobStageOutputSchemaResponse.Schema.Name"));

		List<Field> fields = new ArrayList<Field>();
		for (int i = 0; i < _ctx.lengthValue("DescribeETLJobStageOutputSchemaResponse.Schema.Fields.Length"); i++) {
			Field field = new Field();
			field.setType(_ctx.stringValue("DescribeETLJobStageOutputSchemaResponse.Schema.Fields["+ i +"].Type"));
			field.setLength(_ctx.stringValue("DescribeETLJobStageOutputSchemaResponse.Schema.Fields["+ i +"].Length"));
			field.setName(_ctx.stringValue("DescribeETLJobStageOutputSchemaResponse.Schema.Fields["+ i +"].Name"));
			field.setIndex(_ctx.integerValue("DescribeETLJobStageOutputSchemaResponse.Schema.Fields["+ i +"].Index"));
			field.setRawType(_ctx.stringValue("DescribeETLJobStageOutputSchemaResponse.Schema.Fields["+ i +"].RawType"));
			field.setAssignType(_ctx.stringValue("DescribeETLJobStageOutputSchemaResponse.Schema.Fields["+ i +"].AssignType"));
			field.setAssignValue(_ctx.stringValue("DescribeETLJobStageOutputSchemaResponse.Schema.Fields["+ i +"].AssignValue"));
			field.setPartitionKey(_ctx.booleanValue("DescribeETLJobStageOutputSchemaResponse.Schema.Fields["+ i +"].PartitionKey"));

			fields.add(field);
		}
		schema.setFields(fields);
		describeETLJobStageOutputSchemaResponse.setSchema(schema);
	 
	 	return describeETLJobStageOutputSchemaResponse;
	}
}