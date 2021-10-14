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

import com.aliyuncs.ccc.model.v20200701.ListSkillGroupsResponse;
import com.aliyuncs.ccc.model.v20200701.ListSkillGroupsResponse.Data;
import com.aliyuncs.ccc.model.v20200701.ListSkillGroupsResponse.Data.SkillGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSkillGroupsResponseUnmarshaller {

	public static ListSkillGroupsResponse unmarshall(ListSkillGroupsResponse listSkillGroupsResponse, UnmarshallerContext _ctx) {
		
		listSkillGroupsResponse.setRequestId(_ctx.stringValue("ListSkillGroupsResponse.RequestId"));
		listSkillGroupsResponse.setCode(_ctx.stringValue("ListSkillGroupsResponse.Code"));
		listSkillGroupsResponse.setHttpStatusCode(_ctx.integerValue("ListSkillGroupsResponse.HttpStatusCode"));
		listSkillGroupsResponse.setMessage(_ctx.stringValue("ListSkillGroupsResponse.Message"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListSkillGroupsResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListSkillGroupsResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListSkillGroupsResponse.Data.TotalCount"));

		List<SkillGroup> list = new ArrayList<SkillGroup>();
		for (int i = 0; i < _ctx.lengthValue("ListSkillGroupsResponse.Data.List.Length"); i++) {
			SkillGroup skillGroup = new SkillGroup();
			skillGroup.setDescription(_ctx.stringValue("ListSkillGroupsResponse.Data.List["+ i +"].Description"));
			skillGroup.setDisplayName(_ctx.stringValue("ListSkillGroupsResponse.Data.List["+ i +"].DisplayName"));
			skillGroup.setInstanceId(_ctx.stringValue("ListSkillGroupsResponse.Data.List["+ i +"].InstanceId"));
			skillGroup.setPhoneNumberCount(_ctx.integerValue("ListSkillGroupsResponse.Data.List["+ i +"].PhoneNumberCount"));
			skillGroup.setSkillGroupId(_ctx.stringValue("ListSkillGroupsResponse.Data.List["+ i +"].SkillGroupId"));
			skillGroup.setSkillGroupName(_ctx.stringValue("ListSkillGroupsResponse.Data.List["+ i +"].SkillGroupName"));
			skillGroup.setUserCount(_ctx.integerValue("ListSkillGroupsResponse.Data.List["+ i +"].UserCount"));

			list.add(skillGroup);
		}
		data.setList(list);
		listSkillGroupsResponse.setData(data);
	 
	 	return listSkillGroupsResponse;
	}
}