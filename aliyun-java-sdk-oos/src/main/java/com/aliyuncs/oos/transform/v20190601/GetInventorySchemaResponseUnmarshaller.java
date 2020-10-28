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

package com.aliyuncs.oos.transform.v20190601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.oos.model.v20190601.GetInventorySchemaResponse;
import com.aliyuncs.oos.model.v20190601.GetInventorySchemaResponse.Schema;
import com.aliyuncs.oos.model.v20190601.GetInventorySchemaResponse.Schema.Attribute;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetInventorySchemaResponseUnmarshaller {

	public static GetInventorySchemaResponse unmarshall(GetInventorySchemaResponse getInventorySchemaResponse, UnmarshallerContext _ctx) {
		
		getInventorySchemaResponse.setRequestId(_ctx.stringValue("GetInventorySchemaResponse.RequestId"));
		getInventorySchemaResponse.setNextToken(_ctx.stringValue("GetInventorySchemaResponse.NextToken"));

		List<Schema> schemas = new ArrayList<Schema>();
		for (int i = 0; i < _ctx.lengthValue("GetInventorySchemaResponse.Schemas.Length"); i++) {
			Schema schema = new Schema();
			schema.setTypeName(_ctx.stringValue("GetInventorySchemaResponse.Schemas["+ i +"].TypeName"));
			schema.setVersion(_ctx.stringValue("GetInventorySchemaResponse.Schemas["+ i +"].Version"));

			List<Attribute> attributes = new ArrayList<Attribute>();
			for (int j = 0; j < _ctx.lengthValue("GetInventorySchemaResponse.Schemas["+ i +"].Attributes.Length"); j++) {
				Attribute attribute = new Attribute();
				attribute.setName(_ctx.stringValue("GetInventorySchemaResponse.Schemas["+ i +"].Attributes["+ j +"].Name"));
				attribute.setDataType(_ctx.stringValue("GetInventorySchemaResponse.Schemas["+ i +"].Attributes["+ j +"].DataType"));

				attributes.add(attribute);
			}
			schema.setAttributes(attributes);

			schemas.add(schema);
		}
		getInventorySchemaResponse.setSchemas(schemas);
	 
	 	return getInventorySchemaResponse;
	}
}