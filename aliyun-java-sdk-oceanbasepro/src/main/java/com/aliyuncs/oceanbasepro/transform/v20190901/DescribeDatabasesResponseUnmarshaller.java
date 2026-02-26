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

package com.aliyuncs.oceanbasepro.transform.v20190901;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.oceanbasepro.model.v20190901.DescribeDatabasesResponse;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeDatabasesResponse.Data;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeDatabasesResponse.Data.TablesItem;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeDatabasesResponse.Data.UsersItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDatabasesResponseUnmarshaller {

	public static DescribeDatabasesResponse unmarshall(DescribeDatabasesResponse describeDatabasesResponse, UnmarshallerContext _ctx) {
		
		describeDatabasesResponse.setRequestId(_ctx.stringValue("DescribeDatabasesResponse.RequestId"));
		describeDatabasesResponse.setTotalCount(_ctx.integerValue("DescribeDatabasesResponse.TotalCount"));

		List<Data> databases = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDatabasesResponse.Databases.Length"); i++) {
			Data data = new Data();
			data.setStatus(_ctx.stringValue("DescribeDatabasesResponse.Databases["+ i +"].Status"));
			data.setDescription(_ctx.stringValue("DescribeDatabasesResponse.Databases["+ i +"].Description"));
			data.setEncoding(_ctx.stringValue("DescribeDatabasesResponse.Databases["+ i +"].Encoding"));
			data.setDbType(_ctx.stringValue("DescribeDatabasesResponse.Databases["+ i +"].DbType"));
			data.setDatabaseName(_ctx.stringValue("DescribeDatabasesResponse.Databases["+ i +"].DatabaseName"));
			data.setCreateTime(_ctx.stringValue("DescribeDatabasesResponse.Databases["+ i +"].CreateTime"));
			data.setTenantId(_ctx.stringValue("DescribeDatabasesResponse.Databases["+ i +"].TenantId"));
			data.setRequiredSize(_ctx.doubleValue("DescribeDatabasesResponse.Databases["+ i +"].RequiredSize"));
			data.setDataSize(_ctx.doubleValue("DescribeDatabasesResponse.Databases["+ i +"].DataSize"));
			data.setCollation(_ctx.stringValue("DescribeDatabasesResponse.Databases["+ i +"].Collation"));
			data.setInstanceId(_ctx.stringValue("DescribeDatabasesResponse.Databases["+ i +"].InstanceId"));
			data.setTenantName(_ctx.stringValue("DescribeDatabasesResponse.Databases["+ i +"].TenantName"));

			List<UsersItem> users = new ArrayList<UsersItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDatabasesResponse.Databases["+ i +"].Users.Length"); j++) {
				UsersItem usersItem = new UsersItem();
				usersItem.setUserType(_ctx.stringValue("DescribeDatabasesResponse.Databases["+ i +"].Users["+ j +"].UserType"));
				usersItem.setRole(_ctx.stringValue("DescribeDatabasesResponse.Databases["+ i +"].Users["+ j +"].Role"));
				usersItem.setUserName(_ctx.stringValue("DescribeDatabasesResponse.Databases["+ i +"].Users["+ j +"].UserName"));
				usersItem.setPrivileges(_ctx.stringValue("DescribeDatabasesResponse.Databases["+ i +"].Users["+ j +"].Privileges"));

				users.add(usersItem);
			}
			data.setUsers(users);

			List<TablesItem> tables = new ArrayList<TablesItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDatabasesResponse.Databases["+ i +"].Tables.Length"); j++) {
				TablesItem tablesItem = new TablesItem();
				tablesItem.setTableName(_ctx.stringValue("DescribeDatabasesResponse.Databases["+ i +"].Tables["+ j +"].TableName"));

				tables.add(tablesItem);
			}
			data.setTables(tables);

			databases.add(data);
		}
		describeDatabasesResponse.setDatabases(databases);
	 
	 	return describeDatabasesResponse;
	}
}