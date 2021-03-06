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

import com.aliyuncs.dms_enterprise.model.v20181101.ListDatabasesResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.ListDatabasesResponse.Database;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDatabasesResponseUnmarshaller {

	public static ListDatabasesResponse unmarshall(ListDatabasesResponse listDatabasesResponse, UnmarshallerContext _ctx) {
		
		listDatabasesResponse.setRequestId(_ctx.stringValue("ListDatabasesResponse.RequestId"));
		listDatabasesResponse.setTotalCount(_ctx.longValue("ListDatabasesResponse.TotalCount"));
		listDatabasesResponse.setErrorCode(_ctx.stringValue("ListDatabasesResponse.ErrorCode"));
		listDatabasesResponse.setErrorMessage(_ctx.stringValue("ListDatabasesResponse.ErrorMessage"));
		listDatabasesResponse.setSuccess(_ctx.booleanValue("ListDatabasesResponse.Success"));

		List<Database> databaseList = new ArrayList<Database>();
		for (int i = 0; i < _ctx.lengthValue("ListDatabasesResponse.DatabaseList.Length"); i++) {
			Database database = new Database();
			database.setSearchName(_ctx.stringValue("ListDatabasesResponse.DatabaseList["+ i +"].SearchName"));
			database.setInstanceId(_ctx.stringValue("ListDatabasesResponse.DatabaseList["+ i +"].InstanceId"));
			database.setPort(_ctx.integerValue("ListDatabasesResponse.DatabaseList["+ i +"].Port"));
			database.setEncoding(_ctx.stringValue("ListDatabasesResponse.DatabaseList["+ i +"].Encoding"));
			database.setHost(_ctx.stringValue("ListDatabasesResponse.DatabaseList["+ i +"].Host"));
			database.setDatabaseId(_ctx.stringValue("ListDatabasesResponse.DatabaseList["+ i +"].DatabaseId"));
			database.setDbType(_ctx.stringValue("ListDatabasesResponse.DatabaseList["+ i +"].DbType"));
			database.setEnvType(_ctx.stringValue("ListDatabasesResponse.DatabaseList["+ i +"].EnvType"));
			database.setSid(_ctx.stringValue("ListDatabasesResponse.DatabaseList["+ i +"].Sid"));
			database.setDbaName(_ctx.stringValue("ListDatabasesResponse.DatabaseList["+ i +"].DbaName"));
			database.setDbaId(_ctx.stringValue("ListDatabasesResponse.DatabaseList["+ i +"].DbaId"));
			database.setState(_ctx.stringValue("ListDatabasesResponse.DatabaseList["+ i +"].State"));
			database.setCatalogName(_ctx.stringValue("ListDatabasesResponse.DatabaseList["+ i +"].CatalogName"));
			database.setSchemaName(_ctx.stringValue("ListDatabasesResponse.DatabaseList["+ i +"].SchemaName"));

			List<String> ownerNameList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListDatabasesResponse.DatabaseList["+ i +"].OwnerNameList.Length"); j++) {
				ownerNameList.add(_ctx.stringValue("ListDatabasesResponse.DatabaseList["+ i +"].OwnerNameList["+ j +"]"));
			}
			database.setOwnerNameList(ownerNameList);

			List<String> ownerIdList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListDatabasesResponse.DatabaseList["+ i +"].OwnerIdList.Length"); j++) {
				ownerIdList.add(_ctx.stringValue("ListDatabasesResponse.DatabaseList["+ i +"].OwnerIdList["+ j +"]"));
			}
			database.setOwnerIdList(ownerIdList);

			databaseList.add(database);
		}
		listDatabasesResponse.setDatabaseList(databaseList);
	 
	 	return listDatabasesResponse;
	}
}