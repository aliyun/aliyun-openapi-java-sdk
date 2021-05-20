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

package com.aliyuncs.cccxspaceinner.transform.v20191227;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cccxspaceinner.model.v20191227.GetRolesResponse;
import com.aliyuncs.cccxspaceinner.model.v20191227.GetRolesResponse.XspaceRole;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRolesResponseUnmarshaller {

	public static GetRolesResponse unmarshall(GetRolesResponse getRolesResponse, UnmarshallerContext _ctx) {
		
		getRolesResponse.setRequestId(_ctx.stringValue("GetRolesResponse.RequestId"));
		getRolesResponse.setMessage(_ctx.stringValue("GetRolesResponse.Message"));
		getRolesResponse.setCode(_ctx.stringValue("GetRolesResponse.Code"));
		getRolesResponse.setSuccess(_ctx.booleanValue("GetRolesResponse.Success"));

		List<XspaceRole> data = new ArrayList<XspaceRole>();
		for (int i = 0; i < _ctx.lengthValue("GetRolesResponse.Data.Length"); i++) {
			XspaceRole xspaceRole = new XspaceRole();
			xspaceRole.setBuId(_ctx.longValue("GetRolesResponse.Data["+ i +"].BuId"));
			xspaceRole.setRoleCode(_ctx.stringValue("GetRolesResponse.Data["+ i +"].RoleCode"));
			xspaceRole.setRoleName(_ctx.stringValue("GetRolesResponse.Data["+ i +"].RoleName"));
			xspaceRole.setRoleId(_ctx.longValue("GetRolesResponse.Data["+ i +"].RoleId"));

			data.add(xspaceRole);
		}
		getRolesResponse.setData(data);
	 
	 	return getRolesResponse;
	}
}