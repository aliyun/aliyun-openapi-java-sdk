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

import com.aliyuncs.digitalstore.model.v20200107.ListRolesResponse;
import com.aliyuncs.digitalstore.model.v20200107.ListRolesResponse.SysRoleModel;
import com.aliyuncs.digitalstore.model.v20200107.ListRolesResponse.SysRoleModel.BaseModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRolesResponseUnmarshaller {

	public static ListRolesResponse unmarshall(ListRolesResponse listRolesResponse, UnmarshallerContext _ctx) {
		
		listRolesResponse.setRequestId(_ctx.stringValue("ListRolesResponse.RequestId"));
		listRolesResponse.setPageSize(_ctx.integerValue("ListRolesResponse.PageSize"));
		listRolesResponse.setTotalCount(_ctx.integerValue("ListRolesResponse.TotalCount"));
		listRolesResponse.setPageNumber(_ctx.integerValue("ListRolesResponse.PageNumber"));
		listRolesResponse.setSuccess(_ctx.booleanValue("ListRolesResponse.Success"));

		List<SysRoleModel> roles = new ArrayList<SysRoleModel>();
		for (int i = 0; i < _ctx.lengthValue("ListRolesResponse.Roles.Length"); i++) {
			SysRoleModel sysRoleModel = new SysRoleModel();
			sysRoleModel.setMerchantId(_ctx.longValue("ListRolesResponse.Roles["+ i +"].MerchantId"));
			sysRoleModel.setRoleId(_ctx.integerValue("ListRolesResponse.Roles["+ i +"].RoleId"));
			sysRoleModel.setRemark(_ctx.stringValue("ListRolesResponse.Roles["+ i +"].Remark"));
			sysRoleModel.setName(_ctx.stringValue("ListRolesResponse.Roles["+ i +"].Name"));
			sysRoleModel.setStatus(_ctx.integerValue("ListRolesResponse.Roles["+ i +"].Status"));

			List<BaseModel> apis = new ArrayList<BaseModel>();
			for (int j = 0; j < _ctx.lengthValue("ListRolesResponse.Roles["+ i +"].Apis.Length"); j++) {
				BaseModel baseModel = new BaseModel();
				baseModel.setId(_ctx.integerValue("ListRolesResponse.Roles["+ i +"].Apis["+ j +"].Id"));
				baseModel.setName(_ctx.stringValue("ListRolesResponse.Roles["+ i +"].Apis["+ j +"].Name"));
				baseModel.setCode(_ctx.stringValue("ListRolesResponse.Roles["+ i +"].Apis["+ j +"].Code"));

				apis.add(baseModel);
			}
			sysRoleModel.setApis(apis);

			List<BaseModel> menus = new ArrayList<BaseModel>();
			for (int j = 0; j < _ctx.lengthValue("ListRolesResponse.Roles["+ i +"].Menus.Length"); j++) {
				BaseModel baseModel_ = new BaseModel();
				baseModel_.setId(_ctx.integerValue("ListRolesResponse.Roles["+ i +"].Menus["+ j +"].Id"));
				baseModel_.setName(_ctx.stringValue("ListRolesResponse.Roles["+ i +"].Menus["+ j +"].Name"));
				baseModel_.setCode(_ctx.stringValue("ListRolesResponse.Roles["+ i +"].Menus["+ j +"].Code"));

				menus.add(baseModel_);
			}
			sysRoleModel.setMenus(menus);

			roles.add(sysRoleModel);
		}
		listRolesResponse.setRoles(roles);
	 
	 	return listRolesResponse;
	}
}