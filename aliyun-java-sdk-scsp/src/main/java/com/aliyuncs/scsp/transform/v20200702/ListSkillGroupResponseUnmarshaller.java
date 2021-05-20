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

package com.aliyuncs.scsp.transform.v20200702;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.scsp.model.v20200702.ListSkillGroupResponse;
import com.aliyuncs.scsp.model.v20200702.ListSkillGroupResponse.SkillGroups;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSkillGroupResponseUnmarshaller {

	public static ListSkillGroupResponse unmarshall(ListSkillGroupResponse listSkillGroupResponse, UnmarshallerContext _ctx) {
		
		listSkillGroupResponse.setRequestId(_ctx.stringValue("ListSkillGroupResponse.RequestId"));
		listSkillGroupResponse.setMessage(_ctx.stringValue("ListSkillGroupResponse.Message"));
		listSkillGroupResponse.setCode(_ctx.stringValue("ListSkillGroupResponse.Code"));
		listSkillGroupResponse.setSuccess(_ctx.booleanValue("ListSkillGroupResponse.Success"));

		List<SkillGroups> data = new ArrayList<SkillGroups>();
		for (int i = 0; i < _ctx.lengthValue("ListSkillGroupResponse.Data.Length"); i++) {
			SkillGroups skillGroups = new SkillGroups();
			skillGroups.setDisplayName(_ctx.stringValue("ListSkillGroupResponse.Data["+ i +"].DisplayName"));
			skillGroups.setDescription(_ctx.stringValue("ListSkillGroupResponse.Data["+ i +"].Description"));
			skillGroups.setChannelType(_ctx.integerValue("ListSkillGroupResponse.Data["+ i +"].ChannelType"));
			skillGroups.setSkillGroupId(_ctx.longValue("ListSkillGroupResponse.Data["+ i +"].SkillGroupId"));
			skillGroups.setName(_ctx.stringValue("ListSkillGroupResponse.Data["+ i +"].Name"));

			data.add(skillGroups);
		}
		listSkillGroupResponse.setData(data);
	 
	 	return listSkillGroupResponse;
	}
}