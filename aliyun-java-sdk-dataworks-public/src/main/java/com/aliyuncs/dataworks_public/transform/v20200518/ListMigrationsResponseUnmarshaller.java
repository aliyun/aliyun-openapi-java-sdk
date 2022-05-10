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

package com.aliyuncs.dataworks_public.transform.v20200518;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20200518.ListMigrationsResponse;
import com.aliyuncs.dataworks_public.model.v20200518.ListMigrationsResponse.Data;
import com.aliyuncs.dataworks_public.model.v20200518.ListMigrationsResponse.Data.Migration;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMigrationsResponseUnmarshaller {

	public static ListMigrationsResponse unmarshall(ListMigrationsResponse listMigrationsResponse, UnmarshallerContext _ctx) {
		
		listMigrationsResponse.setRequestId(_ctx.stringValue("ListMigrationsResponse.RequestId"));
		listMigrationsResponse.setSuccess(_ctx.booleanValue("ListMigrationsResponse.Success"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListMigrationsResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListMigrationsResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListMigrationsResponse.Data.TotalCount"));

		List<Migration> migrations = new ArrayList<Migration>();
		for (int i = 0; i < _ctx.lengthValue("ListMigrationsResponse.Data.Migrations.Length"); i++) {
			Migration migration = new Migration();
			migration.setId(_ctx.longValue("ListMigrationsResponse.Data.Migrations["+ i +"].Id"));
			migration.setName(_ctx.stringValue("ListMigrationsResponse.Data.Migrations["+ i +"].Name"));
			migration.setPackageType(_ctx.stringValue("ListMigrationsResponse.Data.Migrations["+ i +"].PackageType"));
			migration.setMigrationType(_ctx.stringValue("ListMigrationsResponse.Data.Migrations["+ i +"].MigrationType"));
			migration.setCreateTime(_ctx.longValue("ListMigrationsResponse.Data.Migrations["+ i +"].CreateTime"));
			migration.setUpdateTime(_ctx.longValue("ListMigrationsResponse.Data.Migrations["+ i +"].UpdateTime"));
			migration.setCreateUser(_ctx.stringValue("ListMigrationsResponse.Data.Migrations["+ i +"].CreateUser"));
			migration.setCreateUserName(_ctx.stringValue("ListMigrationsResponse.Data.Migrations["+ i +"].CreateUserName"));
			migration.setUpdateUser(_ctx.stringValue("ListMigrationsResponse.Data.Migrations["+ i +"].UpdateUser"));
			migration.setUpdateUserName(_ctx.stringValue("ListMigrationsResponse.Data.Migrations["+ i +"].UpdateUserName"));
			migration.setProjectId(_ctx.longValue("ListMigrationsResponse.Data.Migrations["+ i +"].ProjectId"));
			migration.setTenantId(_ctx.longValue("ListMigrationsResponse.Data.Migrations["+ i +"].TenantId"));
			migration.setStatus(_ctx.stringValue("ListMigrationsResponse.Data.Migrations["+ i +"].Status"));
			migration.setMessage(_ctx.stringValue("ListMigrationsResponse.Data.Migrations["+ i +"].Message"));
			migration.setDownloadUrl(_ctx.stringValue("ListMigrationsResponse.Data.Migrations["+ i +"].DownloadUrl"));
			migration.setDescription(_ctx.stringValue("ListMigrationsResponse.Data.Migrations["+ i +"].Description"));

			migrations.add(migration);
		}
		data.setMigrations(migrations);
		listMigrationsResponse.setData(data);
	 
	 	return listMigrationsResponse;
	}
}