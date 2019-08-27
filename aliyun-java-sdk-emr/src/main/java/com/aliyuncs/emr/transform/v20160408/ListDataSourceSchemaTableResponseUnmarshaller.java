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

import com.aliyuncs.emr.model.v20160408.ListDataSourceSchemaTableResponse;
import com.aliyuncs.emr.model.v20160408.ListDataSourceSchemaTableResponse.Schema;
import com.aliyuncs.emr.model.v20160408.ListDataSourceSchemaTableResponse.Schema.Field;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDataSourceSchemaTableResponseUnmarshaller {

	public static ListDataSourceSchemaTableResponse unmarshall(ListDataSourceSchemaTableResponse listDataSourceSchemaTableResponse, UnmarshallerContext _ctx) {
		
		listDataSourceSchemaTableResponse.setRequestId(_ctx.stringValue("ListDataSourceSchemaTableResponse.RequestId"));
		listDataSourceSchemaTableResponse.setDataSourceId(_ctx.stringValue("ListDataSourceSchemaTableResponse.DataSourceId"));

		List<Schema> schemaList = new ArrayList<Schema>();
		for (int i = 0; i < _ctx.lengthValue("ListDataSourceSchemaTableResponse.SchemaList.Length"); i++) {
			Schema schema = new Schema();
			schema.setDbType(_ctx.stringValue("ListDataSourceSchemaTableResponse.SchemaList["+ i +"].DbType"));
			schema.setDbVersion(_ctx.stringValue("ListDataSourceSchemaTableResponse.SchemaList["+ i +"].DbVersion"));
			schema.setDbName(_ctx.stringValue("ListDataSourceSchemaTableResponse.SchemaList["+ i +"].DbName"));
			schema.setTableName(_ctx.stringValue("ListDataSourceSchemaTableResponse.SchemaList["+ i +"].TableName"));

			List<Field> fields = new ArrayList<Field>();
			for (int j = 0; j < _ctx.lengthValue("ListDataSourceSchemaTableResponse.SchemaList["+ i +"].Fields.Length"); j++) {
				Field field = new Field();
				field.setType(_ctx.stringValue("ListDataSourceSchemaTableResponse.SchemaList["+ i +"].Fields["+ j +"].Type"));
				field.setLength(_ctx.stringValue("ListDataSourceSchemaTableResponse.SchemaList["+ i +"].Fields["+ j +"].Length"));
				field.setName(_ctx.stringValue("ListDataSourceSchemaTableResponse.SchemaList["+ i +"].Fields["+ j +"].Name"));
				field.setIndex(_ctx.integerValue("ListDataSourceSchemaTableResponse.SchemaList["+ i +"].Fields["+ j +"].Index"));
				field.setRawType(_ctx.stringValue("ListDataSourceSchemaTableResponse.SchemaList["+ i +"].Fields["+ j +"].RawType"));
				field.setAssignType(_ctx.stringValue("ListDataSourceSchemaTableResponse.SchemaList["+ i +"].Fields["+ j +"].AssignType"));
				field.setAssignValue(_ctx.stringValue("ListDataSourceSchemaTableResponse.SchemaList["+ i +"].Fields["+ j +"].AssignValue"));
				field.setPartitionKey(_ctx.booleanValue("ListDataSourceSchemaTableResponse.SchemaList["+ i +"].Fields["+ j +"].PartitionKey"));

				fields.add(field);
			}
			schema.setFields(fields);

			schemaList.add(schema);
		}
		listDataSourceSchemaTableResponse.setSchemaList(schemaList);
	 
	 	return listDataSourceSchemaTableResponse;
	}
}