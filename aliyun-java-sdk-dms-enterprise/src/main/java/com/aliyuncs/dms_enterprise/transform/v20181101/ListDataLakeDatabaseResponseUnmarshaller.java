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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dms_enterprise.model.v20181101.ListDataLakeDatabaseResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.ListDataLakeDatabaseResponse.Database;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDataLakeDatabaseResponseUnmarshaller {

	public static ListDataLakeDatabaseResponse unmarshall(ListDataLakeDatabaseResponse listDataLakeDatabaseResponse, UnmarshallerContext _ctx) {
		
		listDataLakeDatabaseResponse.setRequestId(_ctx.stringValue("ListDataLakeDatabaseResponse.RequestId"));
		listDataLakeDatabaseResponse.setSuccess(_ctx.booleanValue("ListDataLakeDatabaseResponse.Success"));
		listDataLakeDatabaseResponse.setErrorCode(_ctx.stringValue("ListDataLakeDatabaseResponse.ErrorCode"));
		listDataLakeDatabaseResponse.setErrorMessage(_ctx.stringValue("ListDataLakeDatabaseResponse.ErrorMessage"));

		List<Database> databaseList = new ArrayList<Database>();
		for (int i = 0; i < _ctx.lengthValue("ListDataLakeDatabaseResponse.DatabaseList.Length"); i++) {
			Database database = new Database();
			database.setDescription(_ctx.stringValue("ListDataLakeDatabaseResponse.DatabaseList["+ i +"].Description"));
			database.setParameters(_ctx.mapValue("ListDataLakeDatabaseResponse.DatabaseList["+ i +"].Parameters"));
			database.setDbId(_ctx.longValue("ListDataLakeDatabaseResponse.DatabaseList["+ i +"].DbId"));
			database.setCatalogName(_ctx.stringValue("ListDataLakeDatabaseResponse.DatabaseList["+ i +"].CatalogName"));
			database.setName(_ctx.stringValue("ListDataLakeDatabaseResponse.DatabaseList["+ i +"].Name"));
			database.setLocation(_ctx.stringValue("ListDataLakeDatabaseResponse.DatabaseList["+ i +"].Location"));

			databaseList.add(database);
		}
		listDataLakeDatabaseResponse.setDatabaseList(databaseList);
	 
	 	return listDataLakeDatabaseResponse;
	}
}