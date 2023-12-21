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
import com.aliyuncs.eiam.model.v20211201.GetUserResponse.User.CustomField;
import com.aliyuncs.eiam.model.v20211201.GetUserResponse.User.Group;
import com.aliyuncs.eiam.model.v20211201.GetUserResponse.User.OrganizationalUnit;
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
		user.setPhoneNumberVerified(_ctx.booleanValue("GetUserResponse.User.PhoneNumberVerified"));
		user.setEmail(_ctx.stringValue("GetUserResponse.User.Email"));
		user.setEmailVerified(_ctx.booleanValue("GetUserResponse.User.EmailVerified"));
		user.setUserExternalId(_ctx.stringValue("GetUserResponse.User.UserExternalId"));
		user.setUserSourceType(_ctx.stringValue("GetUserResponse.User.UserSourceType"));
		user.setUserSourceId(_ctx.stringValue("GetUserResponse.User.UserSourceId"));
		user.setStatus(_ctx.stringValue("GetUserResponse.User.Status"));
		user.setAccountExpireTime(_ctx.longValue("GetUserResponse.User.AccountExpireTime"));
		user.setPasswordExpireTime(_ctx.longValue("GetUserResponse.User.PasswordExpireTime"));
		user.setRegisterTime(_ctx.longValue("GetUserResponse.User.RegisterTime"));
		user.setLockExpireTime(_ctx.longValue("GetUserResponse.User.LockExpireTime"));
		user.setCreateTime(_ctx.longValue("GetUserResponse.User.CreateTime"));
		user.setUpdateTime(_ctx.longValue("GetUserResponse.User.UpdateTime"));
		user.setDescription(_ctx.stringValue("GetUserResponse.User.Description"));
		user.setPrimaryOrganizationalUnitId(_ctx.stringValue("GetUserResponse.User.PrimaryOrganizationalUnitId"));
		user.setInstanceId(_ctx.stringValue("GetUserResponse.User.InstanceId"));

		List<OrganizationalUnit> organizationalUnits = new ArrayList<OrganizationalUnit>();
		for (int i = 0; i < _ctx.lengthValue("GetUserResponse.User.OrganizationalUnits.Length"); i++) {
			OrganizationalUnit organizationalUnit = new OrganizationalUnit();
			organizationalUnit.setOrganizationalUnitId(_ctx.stringValue("GetUserResponse.User.OrganizationalUnits["+ i +"].OrganizationalUnitId"));
			organizationalUnit.setOrganizationalUnitName(_ctx.stringValue("GetUserResponse.User.OrganizationalUnits["+ i +"].OrganizationalUnitName"));
			organizationalUnit.setPrimary(_ctx.booleanValue("GetUserResponse.User.OrganizationalUnits["+ i +"].Primary"));

			organizationalUnits.add(organizationalUnit);
		}
		user.setOrganizationalUnits(organizationalUnits);

		List<CustomField> customFields = new ArrayList<CustomField>();
		for (int i = 0; i < _ctx.lengthValue("GetUserResponse.User.CustomFields.Length"); i++) {
			CustomField customField = new CustomField();
			customField.setFieldName(_ctx.stringValue("GetUserResponse.User.CustomFields["+ i +"].FieldName"));
			customField.setFieldValue(_ctx.stringValue("GetUserResponse.User.CustomFields["+ i +"].FieldValue"));

			customFields.add(customField);
		}
		user.setCustomFields(customFields);

		List<Group> groups = new ArrayList<Group>();
		for (int i = 0; i < _ctx.lengthValue("GetUserResponse.User.Groups.Length"); i++) {
			Group group = new Group();
			group.setGroupId(_ctx.stringValue("GetUserResponse.User.Groups["+ i +"].GroupId"));
			group.setGroupName(_ctx.stringValue("GetUserResponse.User.Groups["+ i +"].GroupName"));
			group.setDescription(_ctx.stringValue("GetUserResponse.User.Groups["+ i +"].Description"));

			groups.add(group);
		}
		user.setGroups(groups);
		getUserResponse.setUser(user);
	 
	 	return getUserResponse;
	}
}