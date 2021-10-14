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

import com.aliyuncs.ccc.model.v20200701.ListUserLevelsOfSkillGroupResponse;
import com.aliyuncs.ccc.model.v20200701.ListUserLevelsOfSkillGroupResponse.Data;
import com.aliyuncs.ccc.model.v20200701.ListUserLevelsOfSkillGroupResponse.Data.UserSkillLevel;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUserLevelsOfSkillGroupResponseUnmarshaller {

	public static ListUserLevelsOfSkillGroupResponse unmarshall(ListUserLevelsOfSkillGroupResponse listUserLevelsOfSkillGroupResponse, UnmarshallerContext _ctx) {
		
		listUserLevelsOfSkillGroupResponse.setRequestId(_ctx.stringValue("ListUserLevelsOfSkillGroupResponse.RequestId"));
		listUserLevelsOfSkillGroupResponse.setCode(_ctx.stringValue("ListUserLevelsOfSkillGroupResponse.Code"));
		listUserLevelsOfSkillGroupResponse.setHttpStatusCode(_ctx.integerValue("ListUserLevelsOfSkillGroupResponse.HttpStatusCode"));
		listUserLevelsOfSkillGroupResponse.setMessage(_ctx.stringValue("ListUserLevelsOfSkillGroupResponse.Message"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListUserLevelsOfSkillGroupResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListUserLevelsOfSkillGroupResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListUserLevelsOfSkillGroupResponse.Data.TotalCount"));

		List<UserSkillLevel> list = new ArrayList<UserSkillLevel>();
		for (int i = 0; i < _ctx.lengthValue("ListUserLevelsOfSkillGroupResponse.Data.List.Length"); i++) {
			UserSkillLevel userSkillLevel = new UserSkillLevel();
			userSkillLevel.setDisplayName(_ctx.stringValue("ListUserLevelsOfSkillGroupResponse.Data.List["+ i +"].DisplayName"));
			userSkillLevel.setLoginName(_ctx.stringValue("ListUserLevelsOfSkillGroupResponse.Data.List["+ i +"].LoginName"));
			userSkillLevel.setRoleId(_ctx.stringValue("ListUserLevelsOfSkillGroupResponse.Data.List["+ i +"].RoleId"));
			userSkillLevel.setRoleName(_ctx.stringValue("ListUserLevelsOfSkillGroupResponse.Data.List["+ i +"].RoleName"));
			userSkillLevel.setSkillGroupId(_ctx.stringValue("ListUserLevelsOfSkillGroupResponse.Data.List["+ i +"].SkillGroupId"));
			userSkillLevel.setSkillGroupName(_ctx.stringValue("ListUserLevelsOfSkillGroupResponse.Data.List["+ i +"].SkillGroupName"));
			userSkillLevel.setSkillLevel(_ctx.integerValue("ListUserLevelsOfSkillGroupResponse.Data.List["+ i +"].SkillLevel"));
			userSkillLevel.setUserId(_ctx.stringValue("ListUserLevelsOfSkillGroupResponse.Data.List["+ i +"].UserId"));

			list.add(userSkillLevel);
		}
		data.setList(list);
		listUserLevelsOfSkillGroupResponse.setData(data);
	 
	 	return listUserLevelsOfSkillGroupResponse;
	}
}