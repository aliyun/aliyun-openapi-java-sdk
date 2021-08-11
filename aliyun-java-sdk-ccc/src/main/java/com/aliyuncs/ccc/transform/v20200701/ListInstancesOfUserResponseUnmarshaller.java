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

import com.aliyuncs.ccc.model.v20200701.ListInstancesOfUserResponse;
import com.aliyuncs.ccc.model.v20200701.ListInstancesOfUserResponse.Data;
import com.aliyuncs.ccc.model.v20200701.ListInstancesOfUserResponse.Data.CallCenterInstance;
import com.aliyuncs.ccc.model.v20200701.ListInstancesOfUserResponse.Data.CallCenterInstance.PhoneNumber;
import com.aliyuncs.ccc.model.v20200701.ListInstancesOfUserResponse.Data.CallCenterInstance.PhoneNumber.SkillGroup;
import com.aliyuncs.ccc.model.v20200701.ListInstancesOfUserResponse.Data.CallCenterInstance.User;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInstancesOfUserResponseUnmarshaller {

	public static ListInstancesOfUserResponse unmarshall(ListInstancesOfUserResponse listInstancesOfUserResponse, UnmarshallerContext _ctx) {
		
		listInstancesOfUserResponse.setRequestId(_ctx.stringValue("ListInstancesOfUserResponse.RequestId"));
		listInstancesOfUserResponse.setCode(_ctx.stringValue("ListInstancesOfUserResponse.Code"));
		listInstancesOfUserResponse.setHttpStatusCode(_ctx.integerValue("ListInstancesOfUserResponse.HttpStatusCode"));
		listInstancesOfUserResponse.setMessage(_ctx.stringValue("ListInstancesOfUserResponse.Message"));

		List<String> params = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListInstancesOfUserResponse.Params.Length"); i++) {
			params.add(_ctx.stringValue("ListInstancesOfUserResponse.Params["+ i +"]"));
		}
		listInstancesOfUserResponse.setParams(params);

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListInstancesOfUserResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListInstancesOfUserResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListInstancesOfUserResponse.Data.TotalCount"));

		List<CallCenterInstance> list = new ArrayList<CallCenterInstance>();
		for (int i = 0; i < _ctx.lengthValue("ListInstancesOfUserResponse.Data.List.Length"); i++) {
			CallCenterInstance callCenterInstance = new CallCenterInstance();
			callCenterInstance.setAliyunUid(_ctx.stringValue("ListInstancesOfUserResponse.Data.List["+ i +"].AliyunUid"));
			callCenterInstance.setConsoleUrl(_ctx.stringValue("ListInstancesOfUserResponse.Data.List["+ i +"].ConsoleUrl"));
			callCenterInstance.setDescription(_ctx.stringValue("ListInstancesOfUserResponse.Data.List["+ i +"].Description"));
			callCenterInstance.setDomainName(_ctx.stringValue("ListInstancesOfUserResponse.Data.List["+ i +"].DomainName"));
			callCenterInstance.setId(_ctx.stringValue("ListInstancesOfUserResponse.Data.List["+ i +"].Id"));
			callCenterInstance.setName(_ctx.stringValue("ListInstancesOfUserResponse.Data.List["+ i +"].Name"));
			callCenterInstance.setStatus(_ctx.stringValue("ListInstancesOfUserResponse.Data.List["+ i +"].Status"));

			List<User> adminList = new ArrayList<User>();
			for (int j = 0; j < _ctx.lengthValue("ListInstancesOfUserResponse.Data.List["+ i +"].AdminList.Length"); j++) {
				User user = new User();
				user.setDisplayName(_ctx.stringValue("ListInstancesOfUserResponse.Data.List["+ i +"].AdminList["+ j +"].DisplayName"));
				user.setEmail(_ctx.stringValue("ListInstancesOfUserResponse.Data.List["+ i +"].AdminList["+ j +"].Email"));
				user.setExtension(_ctx.stringValue("ListInstancesOfUserResponse.Data.List["+ i +"].AdminList["+ j +"].Extension"));
				user.setInstanceId(_ctx.stringValue("ListInstancesOfUserResponse.Data.List["+ i +"].AdminList["+ j +"].InstanceId"));
				user.setLoginName(_ctx.stringValue("ListInstancesOfUserResponse.Data.List["+ i +"].AdminList["+ j +"].LoginName"));
				user.setMobile(_ctx.stringValue("ListInstancesOfUserResponse.Data.List["+ i +"].AdminList["+ j +"].Mobile"));
				user.setRoleId(_ctx.stringValue("ListInstancesOfUserResponse.Data.List["+ i +"].AdminList["+ j +"].RoleId"));
				user.setRoleName(_ctx.stringValue("ListInstancesOfUserResponse.Data.List["+ i +"].AdminList["+ j +"].RoleName"));
				user.setUserId(_ctx.stringValue("ListInstancesOfUserResponse.Data.List["+ i +"].AdminList["+ j +"].UserId"));
				user.setWorkMode(_ctx.stringValue("ListInstancesOfUserResponse.Data.List["+ i +"].AdminList["+ j +"].WorkMode"));

				adminList.add(user);
			}
			callCenterInstance.setAdminList(adminList);

			List<PhoneNumber> numberList = new ArrayList<PhoneNumber>();
			for (int j = 0; j < _ctx.lengthValue("ListInstancesOfUserResponse.Data.List["+ i +"].NumberList.Length"); j++) {
				PhoneNumber phoneNumber = new PhoneNumber();
				phoneNumber.setActive(_ctx.booleanValue("ListInstancesOfUserResponse.Data.List["+ i +"].NumberList["+ j +"].Active"));
				phoneNumber.setCity(_ctx.stringValue("ListInstancesOfUserResponse.Data.List["+ i +"].NumberList["+ j +"].City"));
				phoneNumber.setContactFlowId(_ctx.stringValue("ListInstancesOfUserResponse.Data.List["+ i +"].NumberList["+ j +"].ContactFlowId"));
				phoneNumber.setInstanceId(_ctx.stringValue("ListInstancesOfUserResponse.Data.List["+ i +"].NumberList["+ j +"].InstanceId"));
				phoneNumber.setNumber(_ctx.stringValue("ListInstancesOfUserResponse.Data.List["+ i +"].NumberList["+ j +"].Number"));
				phoneNumber.setProvince(_ctx.stringValue("ListInstancesOfUserResponse.Data.List["+ i +"].NumberList["+ j +"].Province"));
				phoneNumber.setUsage(_ctx.stringValue("ListInstancesOfUserResponse.Data.List["+ i +"].NumberList["+ j +"].Usage"));
				phoneNumber.setUserId(_ctx.stringValue("ListInstancesOfUserResponse.Data.List["+ i +"].NumberList["+ j +"].UserId"));

				List<SkillGroup> skillGroups = new ArrayList<SkillGroup>();
				for (int k = 0; k < _ctx.lengthValue("ListInstancesOfUserResponse.Data.List["+ i +"].NumberList["+ j +"].SkillGroups.Length"); k++) {
					SkillGroup skillGroup = new SkillGroup();
					skillGroup.setDescription(_ctx.stringValue("ListInstancesOfUserResponse.Data.List["+ i +"].NumberList["+ j +"].SkillGroups["+ k +"].Description"));
					skillGroup.setDisplayName(_ctx.stringValue("ListInstancesOfUserResponse.Data.List["+ i +"].NumberList["+ j +"].SkillGroups["+ k +"].DisplayName"));
					skillGroup.setInstanceId(_ctx.stringValue("ListInstancesOfUserResponse.Data.List["+ i +"].NumberList["+ j +"].SkillGroups["+ k +"].InstanceId"));
					skillGroup.setName(_ctx.stringValue("ListInstancesOfUserResponse.Data.List["+ i +"].NumberList["+ j +"].SkillGroups["+ k +"].Name"));
					skillGroup.setPhoneNumberCount(_ctx.integerValue("ListInstancesOfUserResponse.Data.List["+ i +"].NumberList["+ j +"].SkillGroups["+ k +"].PhoneNumberCount"));
					skillGroup.setSkillGroupId(_ctx.stringValue("ListInstancesOfUserResponse.Data.List["+ i +"].NumberList["+ j +"].SkillGroups["+ k +"].SkillGroupId"));
					skillGroup.setUserCount(_ctx.integerValue("ListInstancesOfUserResponse.Data.List["+ i +"].NumberList["+ j +"].SkillGroups["+ k +"].UserCount"));

					skillGroups.add(skillGroup);
				}
				phoneNumber.setSkillGroups(skillGroups);

				numberList.add(phoneNumber);
			}
			callCenterInstance.setNumberList(numberList);

			list.add(callCenterInstance);
		}
		data.setList(list);
		listInstancesOfUserResponse.setData(data);
	 
	 	return listInstancesOfUserResponse;
	}
}