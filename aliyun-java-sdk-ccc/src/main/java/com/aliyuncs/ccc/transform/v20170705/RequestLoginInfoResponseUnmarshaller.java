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

package com.aliyuncs.ccc.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20170705.RequestLoginInfoResponse;
import com.aliyuncs.ccc.model.v20170705.RequestLoginInfoResponse.LoginInfo;
import com.aliyuncs.ccc.model.v20170705.RequestLoginInfoResponse.LoginInfo.Role;
import com.aliyuncs.transform.UnmarshallerContext;


public class RequestLoginInfoResponseUnmarshaller {

	public static RequestLoginInfoResponse unmarshall(RequestLoginInfoResponse requestLoginInfoResponse, UnmarshallerContext _ctx) {
		
		requestLoginInfoResponse.setRequestId(_ctx.stringValue("RequestLoginInfoResponse.RequestId"));
		requestLoginInfoResponse.setHttpStatusCode(_ctx.integerValue("RequestLoginInfoResponse.HttpStatusCode"));
		requestLoginInfoResponse.setCode(_ctx.stringValue("RequestLoginInfoResponse.Code"));
		requestLoginInfoResponse.setMessage(_ctx.stringValue("RequestLoginInfoResponse.Message"));
		requestLoginInfoResponse.setSuccess(_ctx.booleanValue("RequestLoginInfoResponse.Success"));

		LoginInfo loginInfo = new LoginInfo();
		loginInfo.setDisplayName(_ctx.stringValue("RequestLoginInfoResponse.LoginInfo.DisplayName"));
		loginInfo.setSignature(_ctx.stringValue("RequestLoginInfoResponse.LoginInfo.Signature"));
		loginInfo.setExtension(_ctx.stringValue("RequestLoginInfoResponse.LoginInfo.Extension"));
		loginInfo.setSignData(_ctx.stringValue("RequestLoginInfoResponse.LoginInfo.SignData"));
		loginInfo.setPhoneNumber(_ctx.stringValue("RequestLoginInfoResponse.LoginInfo.PhoneNumber"));
		loginInfo.setRegion(_ctx.stringValue("RequestLoginInfoResponse.LoginInfo.Region"));
		loginInfo.setAgentServerUrl(_ctx.stringValue("RequestLoginInfoResponse.LoginInfo.AgentServerUrl"));
		loginInfo.setUserName(_ctx.stringValue("RequestLoginInfoResponse.LoginInfo.UserName"));
		loginInfo.setWebRtcUrl(_ctx.stringValue("RequestLoginInfoResponse.LoginInfo.WebRtcUrl"));
		loginInfo.setTenantId(_ctx.stringValue("RequestLoginInfoResponse.LoginInfo.TenantId"));

		List<Role> roles = new ArrayList<Role>();
		for (int i = 0; i < _ctx.lengthValue("RequestLoginInfoResponse.LoginInfo.Roles.Length"); i++) {
			Role role = new Role();
			role.setInstanceId(_ctx.stringValue("RequestLoginInfoResponse.LoginInfo.Roles["+ i +"].InstanceId"));
			role.setRoleName(_ctx.stringValue("RequestLoginInfoResponse.LoginInfo.Roles["+ i +"].RoleName"));
			role.setRoleDescription(_ctx.stringValue("RequestLoginInfoResponse.LoginInfo.Roles["+ i +"].RoleDescription"));
			role.setRoleId(_ctx.stringValue("RequestLoginInfoResponse.LoginInfo.Roles["+ i +"].RoleId"));

			roles.add(role);
		}
		loginInfo.setRoles(roles);
		requestLoginInfoResponse.setLoginInfo(loginInfo);
	 
	 	return requestLoginInfoResponse;
	}
}