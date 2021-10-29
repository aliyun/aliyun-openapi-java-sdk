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

import com.aliyuncs.clickhouse.model.v20191111.SearchRDSTablesResponse;
import com.aliyuncs.clickhouse.model.v20191111.SearchRDSTablesResponse.Schema;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchRDSTablesResponseUnmarshaller {

	public static SearchRDSTablesResponse unmarshall(SearchRDSTablesResponse searchRDSTablesResponse, UnmarshallerContext _ctx) {
		
		searchRDSTablesResponse.setRequestId(_ctx.stringValue("SearchRDSTablesResponse.RequestId"));

		List<Schema> schemas = new ArrayList<Schema>();
		for (int i = 0; i < _ctx.lengthValue("SearchRDSTablesResponse.Schemas.Length"); i++) {
			Schema schema = new Schema();
			schema.setDbName(_ctx.stringValue("SearchRDSTablesResponse.Schemas["+ i +"].DbName"));

			List<String> tables = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("SearchRDSTablesResponse.Schemas["+ i +"].Tables.Length"); j++) {
				tables.add(_ctx.stringValue("SearchRDSTablesResponse.Schemas["+ i +"].Tables["+ j +"]"));
			}
			schema.setTables(tables);

			schemas.add(schema);
		}
		searchRDSTablesResponse.setSchemas(schemas);
	 
	 	return searchRDSTablesResponse;
	}
}