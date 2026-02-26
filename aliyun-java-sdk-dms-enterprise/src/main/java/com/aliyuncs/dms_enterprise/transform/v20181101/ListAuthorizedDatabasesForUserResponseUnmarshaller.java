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

import com.aliyuncs.dms_enterprise.model.v20181101.ListAuthorizedDatabasesForUserResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.ListAuthorizedDatabasesForUserResponse.DatabasesItem;
import com.aliyuncs.dms_enterprise.model.v20181101.ListAuthorizedDatabasesForUserResponse.DatabasesItem.PermissionDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAuthorizedDatabasesForUserResponseUnmarshaller {

	public static ListAuthorizedDatabasesForUserResponse unmarshall(ListAuthorizedDatabasesForUserResponse listAuthorizedDatabasesForUserResponse, UnmarshallerContext _ctx) {
		
		listAuthorizedDatabasesForUserResponse.setRequestId(_ctx.stringValue("ListAuthorizedDatabasesForUserResponse.RequestId"));

		List<DatabasesItem> databases = new ArrayList<DatabasesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAuthorizedDatabasesForUserResponse.Databases.Length"); i++) {
			DatabasesItem databasesItem = new DatabasesItem();
			databasesItem.setDbId(_ctx.stringValue("ListAuthorizedDatabasesForUserResponse.Databases["+ i +"].DbId"));
			databasesItem.setSchemaName(_ctx.stringValue("ListAuthorizedDatabasesForUserResponse.Databases["+ i +"].SchemaName"));
			databasesItem.setSearchName(_ctx.stringValue("ListAuthorizedDatabasesForUserResponse.Databases["+ i +"].SearchName"));
			databasesItem.setInstanceId(_ctx.stringValue("ListAuthorizedDatabasesForUserResponse.Databases["+ i +"].InstanceId"));
			databasesItem.setLogic(_ctx.booleanValue("ListAuthorizedDatabasesForUserResponse.Databases["+ i +"].Logic"));
			databasesItem.setDbType(_ctx.stringValue("ListAuthorizedDatabasesForUserResponse.Databases["+ i +"].DbType"));
			databasesItem.setUserId(_ctx.stringValue("ListAuthorizedDatabasesForUserResponse.Databases["+ i +"].UserId"));
			databasesItem.setEnvType(_ctx.stringValue("ListAuthorizedDatabasesForUserResponse.Databases["+ i +"].EnvType"));

			PermissionDetail permissionDetail = new PermissionDetail();
			permissionDetail.setDsType(_ctx.stringValue("ListAuthorizedDatabasesForUserResponse.Databases["+ i +"].PermissionDetail.DsType"));
			permissionDetail.setPermType(_ctx.stringValue("ListAuthorizedDatabasesForUserResponse.Databases["+ i +"].PermissionDetail.PermType"));
			permissionDetail.setExpireDate(_ctx.stringValue("ListAuthorizedDatabasesForUserResponse.Databases["+ i +"].PermissionDetail.ExpireDate"));
			permissionDetail.setMessage(_ctx.stringValue("ListAuthorizedDatabasesForUserResponse.Databases["+ i +"].PermissionDetail.Message"));
			databasesItem.setPermissionDetail(permissionDetail);

			databases.add(databasesItem);
		}
		listAuthorizedDatabasesForUserResponse.setDatabases(databases);
	 
	 	return listAuthorizedDatabasesForUserResponse;
	}
}