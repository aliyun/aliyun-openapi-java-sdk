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

package com.aliyuncs.gpdb.transform.v20160503;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.gpdb.model.v20160503.ListSchemasResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSchemasResponseUnmarshaller {

	public static ListSchemasResponse unmarshall(ListSchemasResponse listSchemasResponse, UnmarshallerContext _ctx) {
		
		listSchemasResponse.setRequestId(_ctx.stringValue("ListSchemasResponse.RequestId"));
		listSchemasResponse.setMessage(_ctx.stringValue("ListSchemasResponse.Message"));
		listSchemasResponse.setStatus(_ctx.stringValue("ListSchemasResponse.Status"));
		listSchemasResponse.setNextToken(_ctx.stringValue("ListSchemasResponse.NextToken"));

		List<String> schemas = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListSchemasResponse.Schemas.Length"); i++) {
			schemas.add(_ctx.stringValue("ListSchemasResponse.Schemas["+ i +"]"));
		}
		listSchemasResponse.setSchemas(schemas);
	 
	 	return listSchemasResponse;
	}
}