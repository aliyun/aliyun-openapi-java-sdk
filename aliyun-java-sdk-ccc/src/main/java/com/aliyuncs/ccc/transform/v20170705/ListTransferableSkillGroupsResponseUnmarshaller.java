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

import com.aliyuncs.ccc.model.v20170705.ListTransferableSkillGroupsResponse;
import com.aliyuncs.ccc.model.v20170705.ListTransferableSkillGroupsResponse.SkillGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTransferableSkillGroupsResponseUnmarshaller {

	public static ListTransferableSkillGroupsResponse unmarshall(ListTransferableSkillGroupsResponse listTransferableSkillGroupsResponse, UnmarshallerContext _ctx) {
		
		listTransferableSkillGroupsResponse.setRequestId(_ctx.stringValue("ListTransferableSkillGroupsResponse.RequestId"));
		listTransferableSkillGroupsResponse.setSuccess(_ctx.booleanValue("ListTransferableSkillGroupsResponse.Success"));
		listTransferableSkillGroupsResponse.setCode(_ctx.stringValue("ListTransferableSkillGroupsResponse.Code"));
		listTransferableSkillGroupsResponse.setMessage(_ctx.stringValue("ListTransferableSkillGroupsResponse.Message"));
		listTransferableSkillGroupsResponse.setHttpStatusCode(_ctx.integerValue("ListTransferableSkillGroupsResponse.HttpStatusCode"));

		List<SkillGroup> skillGroups = new ArrayList<SkillGroup>();
		for (int i = 0; i < _ctx.lengthValue("ListTransferableSkillGroupsResponse.SkillGroups.Length"); i++) {
			SkillGroup skillGroup = new SkillGroup();
			skillGroup.setSkillGroupId(_ctx.stringValue("ListTransferableSkillGroupsResponse.SkillGroups["+ i +"].SkillGroupId"));
			skillGroup.setInstanceId(_ctx.stringValue("ListTransferableSkillGroupsResponse.SkillGroups["+ i +"].InstanceId"));
			skillGroup.setSkillGroupName(_ctx.stringValue("ListTransferableSkillGroupsResponse.SkillGroups["+ i +"].SkillGroupName"));
			skillGroup.setAccSkillGroupName(_ctx.stringValue("ListTransferableSkillGroupsResponse.SkillGroups["+ i +"].AccSkillGroupName"));
			skillGroup.setAccQueueName(_ctx.stringValue("ListTransferableSkillGroupsResponse.SkillGroups["+ i +"].AccQueueName"));
			skillGroup.setSkillGroupDescription(_ctx.stringValue("ListTransferableSkillGroupsResponse.SkillGroups["+ i +"].SkillGroupDescription"));
			skillGroup.setRoutingStrategy(_ctx.stringValue("ListTransferableSkillGroupsResponse.SkillGroups["+ i +"].RoutingStrategy"));
			skillGroup.setAllowPrivateOutboundNumber(_ctx.booleanValue("ListTransferableSkillGroupsResponse.SkillGroups["+ i +"].AllowPrivateOutboundNumber"));
			skillGroup.setUserCount(_ctx.integerValue("ListTransferableSkillGroupsResponse.SkillGroups["+ i +"].UserCount"));

			skillGroups.add(skillGroup);
		}
		listTransferableSkillGroupsResponse.setSkillGroups(skillGroups);
	 
	 	return listTransferableSkillGroupsResponse;
	}
}