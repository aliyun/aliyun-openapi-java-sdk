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

package com.aliyuncs.drds.transform.v20190123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.drds.model.v20190123.CheckDrdsDefaultRoleResponse;
import com.aliyuncs.drds.model.v20190123.CheckDrdsDefaultRoleResponse.RoleAuth;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckDrdsDefaultRoleResponseUnmarshaller {

	public static CheckDrdsDefaultRoleResponse unmarshall(CheckDrdsDefaultRoleResponse checkDrdsDefaultRoleResponse, UnmarshallerContext _ctx) {
		
		checkDrdsDefaultRoleResponse.setRequestId(_ctx.stringValue("CheckDrdsDefaultRoleResponse.RequestId"));
		checkDrdsDefaultRoleResponse.setSuccess(_ctx.booleanValue("CheckDrdsDefaultRoleResponse.Success"));

		List<RoleAuth> roleAuths = new ArrayList<RoleAuth>();
		for (int i = 0; i < _ctx.lengthValue("CheckDrdsDefaultRoleResponse.RoleAuths.Length"); i++) {
			RoleAuth roleAuth = new RoleAuth();
			roleAuth.setTitle(_ctx.stringValue("CheckDrdsDefaultRoleResponse.RoleAuths["+ i +"].Title"));
			roleAuth.setContent(_ctx.stringValue("CheckDrdsDefaultRoleResponse.RoleAuths["+ i +"].Content"));
			roleAuth.setHasAuthorized(_ctx.booleanValue("CheckDrdsDefaultRoleResponse.RoleAuths["+ i +"].HasAuthorized"));
			roleAuth.setLink(_ctx.stringValue("CheckDrdsDefaultRoleResponse.RoleAuths["+ i +"].Link"));

			roleAuths.add(roleAuth);
		}
		checkDrdsDefaultRoleResponse.setRoleAuths(roleAuths);
	 
	 	return checkDrdsDefaultRoleResponse;
	}
}