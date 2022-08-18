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

package com.aliyuncs.eiam.transform.v20211201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eiam.model.v20211201.GetUserResponse;
import com.aliyuncs.eiam.model.v20211201.GetUserResponse.User;
import com.aliyuncs.eiam.model.v20211201.GetUserResponse.User.OrganizationalUnit;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUserResponseUnmarshaller {

	public static GetUserResponse unmarshall(GetUserResponse getUserResponse, UnmarshallerContext _ctx) {
		
		getUserResponse.setRequestId(_ctx.stringValue("GetUserResponse.RequestId"));

		User user = new User();
		user.setUserId(_ctx.stringValue("GetUserResponse.User.UserId"));
		user.setUsername(_ctx.stringValue("GetUserResponse.User.Username"));
		user.setDisplayName(_ctx.stringValue("GetUserResponse.User.DisplayName"));
		user.setPasswordSet(_ctx.booleanValue("GetUserResponse.User.PasswordSet"));
		user.setPhoneRegion(_ctx.stringValue("GetUserResponse.User.PhoneRegion"));
		user.setPhoneNumber(_ctx.stringValue("GetUserResponse.User.PhoneNumber"));
		user.setPhoneVerified(_ctx.booleanValue("GetUserResponse.User.PhoneVerified"));
		user.setPhoneNumberVerified(_ctx.booleanValue("GetUserResponse.User.PhoneNumberVerified"));
		user.setEmail(_ctx.stringValue("GetUserResponse.User.Email"));
		user.setEmailVerified(_ctx.booleanValue("GetUserResponse.User.EmailVerified"));
		user.setExternalId(_ctx.stringValue("GetUserResponse.User.ExternalId"));
		user.setUserExternalId(_ctx.stringValue("GetUserResponse.User.UserExternalId"));
		user.setSourceType(_ctx.stringValue("GetUserResponse.User.SourceType"));
		user.setUserSourceType(_ctx.stringValue("GetUserResponse.User.UserSourceType"));
		user.setSourceId(_ctx.stringValue("GetUserResponse.User.SourceId"));
		user.setUserSourceId(_ctx.stringValue("GetUserResponse.User.UserSourceId"));
		user.setStatus(_ctx.stringValue("GetUserResponse.User.Status"));
		user.setAccountExpireTime(_ctx.longValue("GetUserResponse.User.AccountExpireTime"));
		user.setRegisterTime(_ctx.longValue("GetUserResponse.User.RegisterTime"));
		user.setLockExpireTime(_ctx.longValue("GetUserResponse.User.LockExpireTime"));
		user.setCreateTime(_ctx.longValue("GetUserResponse.User.CreateTime"));
		user.setUpdateTime(_ctx.longValue("GetUserResponse.User.UpdateTime"));
		user.setDescription(_ctx.stringValue("GetUserResponse.User.Description"));
		user.setAliUid(_ctx.longValue("GetUserResponse.User.AliUid"));
		user.setInstanceId(_ctx.stringValue("GetUserResponse.User.InstanceId"));
		user.setLocked(_ctx.booleanValue("GetUserResponse.User.Locked"));
		user.setPrimaryOrganizationalUnitId(_ctx.stringValue("GetUserResponse.User.PrimaryOrganizationalUnitId"));
		user.setExtensionAttributes(_ctx.mapValue("GetUserResponse.User.ExtensionAttributes"));

		List<OrganizationalUnit> organizationalUnits = new ArrayList<OrganizationalUnit>();
		for (int i = 0; i < _ctx.lengthValue("GetUserResponse.User.OrganizationalUnits.Length"); i++) {
			OrganizationalUnit organizationalUnit = new OrganizationalUnit();
			organizationalUnit.setOrganizationalUnitId(_ctx.stringValue("GetUserResponse.User.OrganizationalUnits["+ i +"].OrganizationalUnitId"));
			organizationalUnit.setName(_ctx.stringValue("GetUserResponse.User.OrganizationalUnits["+ i +"].Name"));
			organizationalUnit.setOrganizationalUnitName(_ctx.stringValue("GetUserResponse.User.OrganizationalUnits["+ i +"].OrganizationalUnitName"));
			organizationalUnit.setPrimary(_ctx.booleanValue("GetUserResponse.User.OrganizationalUnits["+ i +"].Primary"));

			organizationalUnits.add(organizationalUnit);
		}
		user.setOrganizationalUnits(organizationalUnits);
		getUserResponse.setUser(user);
	 
	 	return getUserResponse;
	}
}