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

package com.aliyuncs.dms_lab.transform.v20200915;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dms_lab.model.v20200915.ListDatabasesResponse;
import com.aliyuncs.dms_lab.model.v20200915.ListDatabasesResponse.Database;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDatabasesResponseUnmarshaller {

	public static ListDatabasesResponse unmarshall(ListDatabasesResponse listDatabasesResponse, UnmarshallerContext _ctx) {
		
		listDatabasesResponse.setRequestId(_ctx.stringValue("ListDatabasesResponse.RequestId"));
		listDatabasesResponse.setSuccess(_ctx.booleanValue("ListDatabasesResponse.Success"));
		listDatabasesResponse.setErrorMessage(_ctx.stringValue("ListDatabasesResponse.ErrorMessage"));
		listDatabasesResponse.setErrorCode(_ctx.stringValue("ListDatabasesResponse.ErrorCode"));
		listDatabasesResponse.setTotalCount(_ctx.longValue("ListDatabasesResponse.TotalCount"));

		List<Database> databaseList = new ArrayList<Database>();
		for (int i = 0; i < _ctx.lengthValue("ListDatabasesResponse.DatabaseList.Length"); i++) {
			Database database = new Database();
			database.setSchemaName(_ctx.stringValue("ListDatabasesResponse.DatabaseList["+ i +"].SchemaName"));
			database.setAccount(_ctx.stringValue("ListDatabasesResponse.DatabaseList["+ i +"].Account"));
			database.setPassword(_ctx.stringValue("ListDatabasesResponse.DatabaseList["+ i +"].Password"));
			database.setStatus(_ctx.stringValue("ListDatabasesResponse.DatabaseList["+ i +"].Status"));
			database.setDbType(_ctx.stringValue("ListDatabasesResponse.DatabaseList["+ i +"].DbType"));
			database.setHost(_ctx.stringValue("ListDatabasesResponse.DatabaseList["+ i +"].Host"));
			database.setPort(_ctx.stringValue("ListDatabasesResponse.DatabaseList["+ i +"].Port"));
			database.setSid(_ctx.stringValue("ListDatabasesResponse.DatabaseList["+ i +"].Sid"));

			databaseList.add(database);
		}
		listDatabasesResponse.setDatabaseList(databaseList);
	 
	 	return listDatabasesResponse;
	}
}