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

import com.aliyuncs.gpdb.model.v20160503.ListInstanceDatabasesResponse;
import com.aliyuncs.gpdb.model.v20160503.ListInstanceDatabasesResponse.DBInstanceDatabase;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInstanceDatabasesResponseUnmarshaller {

	public static ListInstanceDatabasesResponse unmarshall(ListInstanceDatabasesResponse listInstanceDatabasesResponse, UnmarshallerContext _ctx) {
		
		listInstanceDatabasesResponse.setRequestId(_ctx.stringValue("ListInstanceDatabasesResponse.RequestId"));
		listInstanceDatabasesResponse.setTotalCount(_ctx.stringValue("ListInstanceDatabasesResponse.TotalCount"));
		listInstanceDatabasesResponse.setDBInstanceId(_ctx.stringValue("ListInstanceDatabasesResponse.DBInstanceId"));

		List<DBInstanceDatabase> databases = new ArrayList<DBInstanceDatabase>();
		for (int i = 0; i < _ctx.lengthValue("ListInstanceDatabasesResponse.Databases.Length"); i++) {
			DBInstanceDatabase dBInstanceDatabase = new DBInstanceDatabase();
			dBInstanceDatabase.setDescription(_ctx.stringValue("ListInstanceDatabasesResponse.Databases["+ i +"].Description"));
			dBInstanceDatabase.setDatabaseName(_ctx.stringValue("ListInstanceDatabasesResponse.Databases["+ i +"].DatabaseName"));

			databases.add(dBInstanceDatabase);
		}
		listInstanceDatabasesResponse.setDatabases(databases);
	 
	 	return listInstanceDatabasesResponse;
	}
}