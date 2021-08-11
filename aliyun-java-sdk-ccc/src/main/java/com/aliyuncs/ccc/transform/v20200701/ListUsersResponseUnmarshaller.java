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

import com.aliyuncs.ccc.model.v20200701.ListUsersResponse;
import com.aliyuncs.ccc.model.v20200701.ListUsersResponse.Data;
import com.aliyuncs.ccc.model.v20200701.ListUsersResponse.Data.UserDetail;
import com.aliyuncs.ccc.model.v20200701.ListUsersResponse.Data.UserDetail.PhoneNumber;
import com.aliyuncs.ccc.model.v20200701.ListUsersResponse.Data.UserDetail.UserSkillLevel;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUsersResponseUnmarshaller {

	public static ListUsersResponse unmarshall(ListUsersResponse listUsersResponse, UnmarshallerContext _ctx) {
		
		listUsersResponse.setRequestId(_ctx.stringValue("ListUsersResponse.RequestId"));
		listUsersResponse.setCode(_ctx.stringValue("ListUsersResponse.Code"));
		listUsersResponse.setHttpStatusCode(_ctx.integerValue("ListUsersResponse.HttpStatusCode"));
		listUsersResponse.setMessage(_ctx.stringValue("ListUsersResponse.Message"));

		List<String> params = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListUsersResponse.Params.Length"); i++) {
			params.add(_ctx.stringValue("ListUsersResponse.Params["+ i +"]"));
		}
		listUsersResponse.setParams(params);

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListUsersResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListUsersResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListUsersResponse.Data.TotalCount"));

		List<UserDetail> list = new ArrayList<UserDetail>();
		for (int i = 0; i < _ctx.lengthValue("ListUsersResponse.Data.List.Length"); i++) {
			UserDetail userDetail = new UserDetail();
			userDetail.setDisplayName(_ctx.stringValue("ListUsersResponse.Data.List["+ i +"].DisplayName"));
			userDetail.setEmail(_ctx.stringValue("ListUsersResponse.Data.List["+ i +"].Email"));
			userDetail.setLoginName(_ctx.stringValue("ListUsersResponse.Data.List["+ i +"].LoginName"));
			userDetail.setMobile(_ctx.stringValue("ListUsersResponse.Data.List["+ i +"].Mobile"));
			userDetail.setRoleId(_ctx.stringValue("ListUsersResponse.Data.List["+ i +"].RoleId"));
			userDetail.setRoleName(_ctx.stringValue("ListUsersResponse.Data.List["+ i +"].RoleName"));
			userDetail.setUserId(_ctx.stringValue("ListUsersResponse.Data.List["+ i +"].UserId"));
			userDetail.setWorkMode(_ctx.stringValue("ListUsersResponse.Data.List["+ i +"].WorkMode"));
			userDetail.setPrimaryAccount(_ctx.booleanValue("ListUsersResponse.Data.List["+ i +"].PrimaryAccount"));

			List<PhoneNumber> personalOutboundNumberList = new ArrayList<PhoneNumber>();
			for (int j = 0; j < _ctx.lengthValue("ListUsersResponse.Data.List["+ i +"].PersonalOutboundNumberList.Length"); j++) {
				PhoneNumber phoneNumber = new PhoneNumber();
				phoneNumber.setActive(_ctx.booleanValue("ListUsersResponse.Data.List["+ i +"].PersonalOutboundNumberList["+ j +"].Active"));
				phoneNumber.setCity(_ctx.stringValue("ListUsersResponse.Data.List["+ i +"].PersonalOutboundNumberList["+ j +"].City"));
				phoneNumber.setNumber(_ctx.stringValue("ListUsersResponse.Data.List["+ i +"].PersonalOutboundNumberList["+ j +"].Number"));
				phoneNumber.setProvince(_ctx.stringValue("ListUsersResponse.Data.List["+ i +"].PersonalOutboundNumberList["+ j +"].Province"));
				phoneNumber.setUsage(_ctx.stringValue("ListUsersResponse.Data.List["+ i +"].PersonalOutboundNumberList["+ j +"].Usage"));

				personalOutboundNumberList.add(phoneNumber);
			}
			userDetail.setPersonalOutboundNumberList(personalOutboundNumberList);

			List<UserSkillLevel> skillLevelList = new ArrayList<UserSkillLevel>();
			for (int j = 0; j < _ctx.lengthValue("ListUsersResponse.Data.List["+ i +"].SkillLevelList.Length"); j++) {
				UserSkillLevel userSkillLevel = new UserSkillLevel();
				userSkillLevel.setSkillGroupId(_ctx.stringValue("ListUsersResponse.Data.List["+ i +"].SkillLevelList["+ j +"].SkillGroupId"));
				userSkillLevel.setSkillGroupName(_ctx.stringValue("ListUsersResponse.Data.List["+ i +"].SkillLevelList["+ j +"].SkillGroupName"));
				userSkillLevel.setSkillLevel(_ctx.integerValue("ListUsersResponse.Data.List["+ i +"].SkillLevelList["+ j +"].SkillLevel"));

				skillLevelList.add(userSkillLevel);
			}
			userDetail.setSkillLevelList(skillLevelList);

			list.add(userDetail);
		}
		data.setList(list);
		listUsersResponse.setData(data);
	 
	 	return listUsersResponse;
	}
}