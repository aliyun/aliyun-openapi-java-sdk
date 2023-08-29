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

package com.aliyuncs.paifeaturestore.transform.v20230621;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.paifeaturestore.model.v20230621.ListDatasourceTablesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDatasourceTablesResponseUnmarshaller {

	public static ListDatasourceTablesResponse unmarshall(ListDatasourceTablesResponse listDatasourceTablesResponse, UnmarshallerContext _ctx) {
		
		listDatasourceTablesResponse.setRequestId(_ctx.stringValue("ListDatasourceTablesResponse.RequestId"));
		listDatasourceTablesResponse.setTotalCount(_ctx.longValue("ListDatasourceTablesResponse.TotalCount"));

		List<String> tables = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListDatasourceTablesResponse.Tables.Length"); i++) {
			tables.add(_ctx.stringValue("ListDatasourceTablesResponse.Tables["+ i +"]"));
		}
		listDatasourceTablesResponse.setTables(tables);
	 
	 	return listDatasourceTablesResponse;
	}
}