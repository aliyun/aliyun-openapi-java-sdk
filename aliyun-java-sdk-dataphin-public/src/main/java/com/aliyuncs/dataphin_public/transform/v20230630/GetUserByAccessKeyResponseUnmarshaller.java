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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.GetUserByAccessKeyResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetUserByAccessKeyResponse.UserInfo;
import com.aliyuncs.dataphin_public.model.v20230630.GetUserByAccessKeyResponse.UserInfo.TenantRole;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUserByAccessKeyResponseUnmarshaller {

	public static GetUserByAccessKeyResponse unmarshall(GetUserByAccessKeyResponse getUserByAccessKeyResponse, UnmarshallerContext _ctx) {
		
		getUserByAccessKeyResponse.setRequestId(_ctx.stringValue("GetUserByAccessKeyResponse.RequestId"));
		getUserByAccessKeyResponse.setMessage(_ctx.stringValue("GetUserByAccessKeyResponse.Message"));
		getUserByAccessKeyResponse.setHttpStatusCode(_ctx.integerValue("GetUserByAccessKeyResponse.HttpStatusCode"));
		getUserByAccessKeyResponse.setCode(_ctx.stringValue("GetUserByAccessKeyResponse.Code"));
		getUserByAccessKeyResponse.setSuccess(_ctx.booleanValue("GetUserByAccessKeyResponse.Success"));

		UserInfo userInfo = new UserInfo();
		userInfo.setStatus(_ctx.stringValue("GetUserByAccessKeyResponse.UserInfo.Status"));
		userInfo.setUserName(_ctx.stringValue("GetUserByAccessKeyResponse.UserInfo.UserName"));
		userInfo.setMail(_ctx.stringValue("GetUserByAccessKeyResponse.UserInfo.Mail"));
		userInfo.setSourceType(_ctx.stringValue("GetUserByAccessKeyResponse.UserInfo.SourceType"));
		userInfo.setSourceUserId(_ctx.stringValue("GetUserByAccessKeyResponse.UserInfo.SourceUserId"));
		userInfo.setDisplayName(_ctx.stringValue("GetUserByAccessKeyResponse.UserInfo.DisplayName"));
		userInfo.setId(_ctx.stringValue("GetUserByAccessKeyResponse.UserInfo.Id"));
		userInfo.setNickName(_ctx.stringValue("GetUserByAccessKeyResponse.UserInfo.NickName"));

		List<TenantRole> tenantRoles = new ArrayList<TenantRole>();
		for (int i = 0; i < _ctx.lengthValue("GetUserByAccessKeyResponse.UserInfo.TenantRoles.Length"); i++) {
			TenantRole tenantRole = new TenantRole();
			tenantRole.setRoleKey(_ctx.stringValue("GetUserByAccessKeyResponse.UserInfo.TenantRoles["+ i +"].RoleKey"));
			tenantRole.setRoleName(_ctx.stringValue("GetUserByAccessKeyResponse.UserInfo.TenantRoles["+ i +"].RoleName"));

			tenantRoles.add(tenantRole);
		}
		userInfo.setTenantRoles(tenantRoles);
		getUserByAccessKeyResponse.setUserInfo(userInfo);
	 
	 	return getUserByAccessKeyResponse;
	}
}