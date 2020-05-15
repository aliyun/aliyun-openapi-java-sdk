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

package com.aliyuncs.digitalstore.transform.v20200107;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.digitalstore.model.v20200107.ListUsersResponse;
import com.aliyuncs.digitalstore.model.v20200107.ListUsersResponse.SysUserModel;
import com.aliyuncs.digitalstore.model.v20200107.ListUsersResponse.SysUserModel.SysUserUnitModel;
import com.aliyuncs.digitalstore.model.v20200107.ListUsersResponse.SysUserModel.UserRoleModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUsersResponseUnmarshaller {

	public static ListUsersResponse unmarshall(ListUsersResponse listUsersResponse, UnmarshallerContext _ctx) {
		
		listUsersResponse.setRequestId(_ctx.stringValue("ListUsersResponse.RequestId"));
		listUsersResponse.setPageSize(_ctx.integerValue("ListUsersResponse.PageSize"));
		listUsersResponse.setTotalCount(_ctx.integerValue("ListUsersResponse.TotalCount"));
		listUsersResponse.setPageNumber(_ctx.integerValue("ListUsersResponse.PageNumber"));
		listUsersResponse.setSuccess(_ctx.booleanValue("ListUsersResponse.Success"));

		List<SysUserModel> users = new ArrayList<SysUserModel>();
		for (int i = 0; i < _ctx.lengthValue("ListUsersResponse.Users.Length"); i++) {
			SysUserModel sysUserModel = new SysUserModel();
			sysUserModel.setMail(_ctx.stringValue("ListUsersResponse.Users["+ i +"].Mail"));
			sysUserModel.setAliyunAccount(_ctx.stringValue("ListUsersResponse.Users["+ i +"].AliyunAccount"));
			sysUserModel.setTelephone(_ctx.stringValue("ListUsersResponse.Users["+ i +"].Telephone"));
			sysUserModel.setRemark(_ctx.stringValue("ListUsersResponse.Users["+ i +"].Remark"));
			sysUserModel.setMerchantId(_ctx.longValue("ListUsersResponse.Users["+ i +"].MerchantId"));
			sysUserModel.setUserName(_ctx.stringValue("ListUsersResponse.Users["+ i +"].UserName"));
			sysUserModel.setStatus(_ctx.integerValue("ListUsersResponse.Users["+ i +"].Status"));
			sysUserModel.setUserId(_ctx.longValue("ListUsersResponse.Users["+ i +"].UserId"));

			List<SysUserUnitModel> stores = new ArrayList<SysUserUnitModel>();
			for (int j = 0; j < _ctx.lengthValue("ListUsersResponse.Users["+ i +"].Stores.Length"); j++) {
				SysUserUnitModel sysUserUnitModel = new SysUserUnitModel();
				sysUserUnitModel.setUnitName(_ctx.stringValue("ListUsersResponse.Users["+ i +"].Stores["+ j +"].UnitName"));
				sysUserUnitModel.setUnitId(_ctx.stringValue("ListUsersResponse.Users["+ i +"].Stores["+ j +"].UnitId"));

				stores.add(sysUserUnitModel);
			}
			sysUserModel.setStores(stores);

			List<UserRoleModel> roles = new ArrayList<UserRoleModel>();
			for (int j = 0; j < _ctx.lengthValue("ListUsersResponse.Users["+ i +"].Roles.Length"); j++) {
				UserRoleModel userRoleModel = new UserRoleModel();
				userRoleModel.setRoleId(_ctx.integerValue("ListUsersResponse.Users["+ i +"].Roles["+ j +"].RoleId"));
				userRoleModel.setRoleName(_ctx.stringValue("ListUsersResponse.Users["+ i +"].Roles["+ j +"].RoleName"));
				userRoleModel.setStatus(_ctx.integerValue("ListUsersResponse.Users["+ i +"].Roles["+ j +"].Status"));

				roles.add(userRoleModel);
			}
			sysUserModel.setRoles(roles);

			List<SysUserUnitModel> warehouses = new ArrayList<SysUserUnitModel>();
			for (int j = 0; j < _ctx.lengthValue("ListUsersResponse.Users["+ i +"].Warehouses.Length"); j++) {
				SysUserUnitModel sysUserUnitModel_ = new SysUserUnitModel();
				sysUserUnitModel_.setUnitName(_ctx.stringValue("ListUsersResponse.Users["+ i +"].Warehouses["+ j +"].UnitName"));
				sysUserUnitModel_.setUnitId(_ctx.stringValue("ListUsersResponse.Users["+ i +"].Warehouses["+ j +"].UnitId"));

				warehouses.add(sysUserUnitModel_);
			}
			sysUserModel.setWarehouses(warehouses);

			List<SysUserUnitModel> factories = new ArrayList<SysUserUnitModel>();
			for (int j = 0; j < _ctx.lengthValue("ListUsersResponse.Users["+ i +"].Factories.Length"); j++) {
				SysUserUnitModel sysUserUnitModel_ = new SysUserUnitModel();
				sysUserUnitModel_.setUnitName(_ctx.stringValue("ListUsersResponse.Users["+ i +"].Factories["+ j +"].UnitName"));
				sysUserUnitModel_.setUnitId(_ctx.stringValue("ListUsersResponse.Users["+ i +"].Factories["+ j +"].UnitId"));

				factories.add(sysUserUnitModel_);
			}
			sysUserModel.setFactories(factories);

			users.add(sysUserModel);
		}
		listUsersResponse.setUsers(users);
	 
	 	return listUsersResponse;
	}
}