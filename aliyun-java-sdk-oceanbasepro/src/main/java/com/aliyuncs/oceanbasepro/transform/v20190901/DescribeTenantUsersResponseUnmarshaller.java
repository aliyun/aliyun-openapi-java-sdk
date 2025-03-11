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

import com.aliyuncs.oceanbasepro.model.v20190901.DescribeTenantUsersResponse;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeTenantUsersResponse.TenantUsersItem;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeTenantUsersResponse.TenantUsersItem.DatabasesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTenantUsersResponseUnmarshaller {

	public static DescribeTenantUsersResponse unmarshall(DescribeTenantUsersResponse describeTenantUsersResponse, UnmarshallerContext _ctx) {
		
		describeTenantUsersResponse.setRequestId(_ctx.stringValue("DescribeTenantUsersResponse.RequestId"));
		describeTenantUsersResponse.setTotalCount(_ctx.integerValue("DescribeTenantUsersResponse.TotalCount"));

		List<TenantUsersItem> tenantUsers = new ArrayList<TenantUsersItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTenantUsersResponse.TenantUsers.Length"); i++) {
			TenantUsersItem tenantUsersItem = new TenantUsersItem();
			tenantUsersItem.setUserType(_ctx.stringValue("DescribeTenantUsersResponse.TenantUsers["+ i +"].UserType"));
			tenantUsersItem.setDescription(_ctx.stringValue("DescribeTenantUsersResponse.TenantUsers["+ i +"].Description"));
			tenantUsersItem.setUserStatus(_ctx.stringValue("DescribeTenantUsersResponse.TenantUsers["+ i +"].UserStatus"));
			tenantUsersItem.setUserName(_ctx.stringValue("DescribeTenantUsersResponse.TenantUsers["+ i +"].UserName"));
			tenantUsersItem.setTenantId(_ctx.stringValue("DescribeTenantUsersResponse.TenantUsers["+ i +"].TenantId"));
			tenantUsersItem.setInstanceId(_ctx.stringValue("DescribeTenantUsersResponse.TenantUsers["+ i +"].InstanceId"));
			tenantUsersItem.setGlobalPermissions(_ctx.stringValue("DescribeTenantUsersResponse.TenantUsers["+ i +"].GlobalPermissions"));

			List<DatabasesItem> databases = new ArrayList<DatabasesItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeTenantUsersResponse.TenantUsers["+ i +"].Databases.Length"); j++) {
				DatabasesItem databasesItem = new DatabasesItem();
				databasesItem.setDatabase(_ctx.stringValue("DescribeTenantUsersResponse.TenantUsers["+ i +"].Databases["+ j +"].Database"));
				databasesItem.setRole(_ctx.stringValue("DescribeTenantUsersResponse.TenantUsers["+ i +"].Databases["+ j +"].Role"));
				databasesItem.setTable(_ctx.stringValue("DescribeTenantUsersResponse.TenantUsers["+ i +"].Databases["+ j +"].Table"));
				databasesItem.setPrivileges(_ctx.stringValue("DescribeTenantUsersResponse.TenantUsers["+ i +"].Databases["+ j +"].Privileges"));

				databases.add(databasesItem);
			}
			tenantUsersItem.setDatabases(databases);

			tenantUsers.add(tenantUsersItem);
		}
		describeTenantUsersResponse.setTenantUsers(tenantUsers);
	 
	 	return describeTenantUsersResponse;
	}
}