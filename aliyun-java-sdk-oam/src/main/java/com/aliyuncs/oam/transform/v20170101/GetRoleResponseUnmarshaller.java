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

package com.aliyuncs.oam.transform.v20170101;

import com.aliyuncs.oam.model.v20170101.GetRoleResponse;
import com.aliyuncs.oam.model.v20170101.GetRoleResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRoleResponseUnmarshaller {

	public static GetRoleResponse unmarshall(GetRoleResponse getRoleResponse, UnmarshallerContext _ctx) {
		
		getRoleResponse.setCode(_ctx.stringValue("GetRoleResponse.Code"));
		getRoleResponse.setMessage(_ctx.stringValue("GetRoleResponse.Message"));

		Data data = new Data();
		data.setBid(_ctx.stringValue("GetRoleResponse.Data.Bid"));
		data.setRoleId(_ctx.stringValue("GetRoleResponse.Data.RoleId"));
		data.setRoleName(_ctx.stringValue("GetRoleResponse.Data.RoleName"));
		data.setRoleType(_ctx.stringValue("GetRoleResponse.Data.RoleType"));
		data.setGmtModified(_ctx.stringValue("GetRoleResponse.Data.GmtModified"));
		data.setOwner(_ctx.stringValue("GetRoleResponse.Data.Owner"));
		data.setOwnerName(_ctx.stringValue("GetRoleResponse.Data.OwnerName"));
		data.setOwnerType(_ctx.stringValue("GetRoleResponse.Data.OwnerType"));
		data.setDescription(_ctx.stringValue("GetRoleResponse.Data.Description"));
		data.setAttribute(_ctx.stringValue("GetRoleResponse.Data.Attribute"));
		getRoleResponse.setData(data);
	 
	 	return getRoleResponse;
	}
}