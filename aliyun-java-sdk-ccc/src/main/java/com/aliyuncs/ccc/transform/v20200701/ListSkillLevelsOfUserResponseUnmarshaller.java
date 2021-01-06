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

import com.aliyuncs.ccc.model.v20200701.ListSkillLevelsOfUserResponse;
import com.aliyuncs.ccc.model.v20200701.ListSkillLevelsOfUserResponse.Data;
import com.aliyuncs.ccc.model.v20200701.ListSkillLevelsOfUserResponse.Data.UserSkillLevel;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSkillLevelsOfUserResponseUnmarshaller {

	public static ListSkillLevelsOfUserResponse unmarshall(ListSkillLevelsOfUserResponse listSkillLevelsOfUserResponse, UnmarshallerContext _ctx) {
		
		listSkillLevelsOfUserResponse.setRequestId(_ctx.stringValue("ListSkillLevelsOfUserResponse.RequestId"));
		listSkillLevelsOfUserResponse.setCode(_ctx.stringValue("ListSkillLevelsOfUserResponse.Code"));
		listSkillLevelsOfUserResponse.setHttpStatusCode(_ctx.integerValue("ListSkillLevelsOfUserResponse.HttpStatusCode"));
		listSkillLevelsOfUserResponse.setMessage(_ctx.stringValue("ListSkillLevelsOfUserResponse.Message"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListSkillLevelsOfUserResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListSkillLevelsOfUserResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListSkillLevelsOfUserResponse.Data.TotalCount"));

		List<UserSkillLevel> list = new ArrayList<UserSkillLevel>();
		for (int i = 0; i < _ctx.lengthValue("ListSkillLevelsOfUserResponse.Data.List.Length"); i++) {
			UserSkillLevel userSkillLevel = new UserSkillLevel();
			userSkillLevel.setSkillGroupId(_ctx.stringValue("ListSkillLevelsOfUserResponse.Data.List["+ i +"].SkillGroupId"));
			userSkillLevel.setSkillGroupName(_ctx.stringValue("ListSkillLevelsOfUserResponse.Data.List["+ i +"].SkillGroupName"));
			userSkillLevel.setSkillLevel(_ctx.stringValue("ListSkillLevelsOfUserResponse.Data.List["+ i +"].SkillLevel"));

			list.add(userSkillLevel);
		}
		data.setList(list);
		listSkillLevelsOfUserResponse.setData(data);
	 
	 	return listSkillLevelsOfUserResponse;
	}
}