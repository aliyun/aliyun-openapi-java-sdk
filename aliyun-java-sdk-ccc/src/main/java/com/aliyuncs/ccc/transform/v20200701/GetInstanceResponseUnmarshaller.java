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

package com.aliyuncs.ccc.transform.v20200701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20200701.GetInstanceResponse;
import com.aliyuncs.ccc.model.v20200701.GetInstanceResponse.Data;
import com.aliyuncs.ccc.model.v20200701.GetInstanceResponse.Data.PhoneNumber;
import com.aliyuncs.ccc.model.v20200701.GetInstanceResponse.Data.PhoneNumber.SkillGroup;
import com.aliyuncs.ccc.model.v20200701.GetInstanceResponse.Data.User;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetInstanceResponseUnmarshaller {

	public static GetInstanceResponse unmarshall(GetInstanceResponse getInstanceResponse, UnmarshallerContext _ctx) {
		
		getInstanceResponse.setRequestId(_ctx.stringValue("GetInstanceResponse.RequestId"));
		getInstanceResponse.setCode(_ctx.stringValue("GetInstanceResponse.Code"));
		getInstanceResponse.setHttpStatusCode(_ctx.integerValue("GetInstanceResponse.HttpStatusCode"));
		getInstanceResponse.setMessage(_ctx.stringValue("GetInstanceResponse.Message"));

		Data data = new Data();
		data.setStatus(_ctx.stringValue("GetInstanceResponse.Data.Status"));
		data.setConsoleUrl(_ctx.stringValue("GetInstanceResponse.Data.ConsoleUrl"));
		data.setDescription(_ctx.stringValue("GetInstanceResponse.Data.Description"));
		data.setAliyunUid(_ctx.stringValue("GetInstanceResponse.Data.AliyunUid"));
		data.setName(_ctx.stringValue("GetInstanceResponse.Data.Name"));
		data.setDomainName(_ctx.stringValue("GetInstanceResponse.Data.DomainName"));
		data.setId(_ctx.stringValue("GetInstanceResponse.Data.Id"));

		List<User> adminList = new ArrayList<User>();
		for (int i = 0; i < _ctx.lengthValue("GetInstanceResponse.Data.AdminList.Length"); i++) {
			User user = new User();
			user.setDisplayName(_ctx.stringValue("GetInstanceResponse.Data.AdminList["+ i +"].DisplayName"));
			user.setExtension(_ctx.stringValue("GetInstanceResponse.Data.AdminList["+ i +"].Extension"));
			user.setLoginName(_ctx.stringValue("GetInstanceResponse.Data.AdminList["+ i +"].LoginName"));
			user.setEmail(_ctx.stringValue("GetInstanceResponse.Data.AdminList["+ i +"].Email"));
			user.setWorkMode(_ctx.stringValue("GetInstanceResponse.Data.AdminList["+ i +"].WorkMode"));
			user.setMobile(_ctx.stringValue("GetInstanceResponse.Data.AdminList["+ i +"].Mobile"));
			user.setUserId(_ctx.stringValue("GetInstanceResponse.Data.AdminList["+ i +"].UserId"));
			user.setRoleName(_ctx.stringValue("GetInstanceResponse.Data.AdminList["+ i +"].RoleName"));
			user.setInstanceId(_ctx.stringValue("GetInstanceResponse.Data.AdminList["+ i +"].InstanceId"));
			user.setRoleId(_ctx.stringValue("GetInstanceResponse.Data.AdminList["+ i +"].RoleId"));

			adminList.add(user);
		}
		data.setAdminList(adminList);

		List<PhoneNumber> numberList = new ArrayList<PhoneNumber>();
		for (int i = 0; i < _ctx.lengthValue("GetInstanceResponse.Data.NumberList.Length"); i++) {
			PhoneNumber phoneNumber = new PhoneNumber();
			phoneNumber.setActive(_ctx.booleanValue("GetInstanceResponse.Data.NumberList["+ i +"].Active"));
			phoneNumber.setUserId(_ctx.stringValue("GetInstanceResponse.Data.NumberList["+ i +"].UserId"));
			phoneNumber.setNumber(_ctx.stringValue("GetInstanceResponse.Data.NumberList["+ i +"].Number"));
			phoneNumber.setCity(_ctx.stringValue("GetInstanceResponse.Data.NumberList["+ i +"].City"));
			phoneNumber.setInstanceId(_ctx.stringValue("GetInstanceResponse.Data.NumberList["+ i +"].InstanceId"));
			phoneNumber.setUsage(_ctx.stringValue("GetInstanceResponse.Data.NumberList["+ i +"].Usage"));
			phoneNumber.setContactFlowId(_ctx.stringValue("GetInstanceResponse.Data.NumberList["+ i +"].ContactFlowId"));
			phoneNumber.setProvince(_ctx.stringValue("GetInstanceResponse.Data.NumberList["+ i +"].Province"));

			List<SkillGroup> skillGroups = new ArrayList<SkillGroup>();
			for (int j = 0; j < _ctx.lengthValue("GetInstanceResponse.Data.NumberList["+ i +"].SkillGroups.Length"); j++) {
				SkillGroup skillGroup = new SkillGroup();
				skillGroup.setDisplayName(_ctx.stringValue("GetInstanceResponse.Data.NumberList["+ i +"].SkillGroups["+ j +"].DisplayName"));
				skillGroup.setDescription(_ctx.stringValue("GetInstanceResponse.Data.NumberList["+ i +"].SkillGroups["+ j +"].Description"));
				skillGroup.setPhoneNumberCount(_ctx.integerValue("GetInstanceResponse.Data.NumberList["+ i +"].SkillGroups["+ j +"].PhoneNumberCount"));
				skillGroup.setSkillGroupId(_ctx.stringValue("GetInstanceResponse.Data.NumberList["+ i +"].SkillGroups["+ j +"].SkillGroupId"));
				skillGroup.setUserCount(_ctx.integerValue("GetInstanceResponse.Data.NumberList["+ i +"].SkillGroups["+ j +"].UserCount"));
				skillGroup.setInstanceId(_ctx.stringValue("GetInstanceResponse.Data.NumberList["+ i +"].SkillGroups["+ j +"].InstanceId"));
				skillGroup.setName(_ctx.stringValue("GetInstanceResponse.Data.NumberList["+ i +"].SkillGroups["+ j +"].Name"));

				skillGroups.add(skillGroup);
			}
			phoneNumber.setSkillGroups(skillGroups);

			numberList.add(phoneNumber);
		}
		data.setNumberList(numberList);
		getInstanceResponse.setData(data);
	 
	 	return getInstanceResponse;
	}
}