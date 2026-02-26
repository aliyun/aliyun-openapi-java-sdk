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

import com.aliyuncs.eiam.model.v20211201.GetGroupResponse;
import com.aliyuncs.eiam.model.v20211201.GetGroupResponse.Group;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetGroupResponseUnmarshaller {

	public static GetGroupResponse unmarshall(GetGroupResponse getGroupResponse, UnmarshallerContext _ctx) {
		
		getGroupResponse.setRequestId(_ctx.stringValue("GetGroupResponse.RequestId"));

		Group group = new Group();
		group.setGroupId(_ctx.stringValue("GetGroupResponse.Group.GroupId"));
		group.setGroupName(_ctx.stringValue("GetGroupResponse.Group.GroupName"));
		group.setDescription(_ctx.stringValue("GetGroupResponse.Group.Description"));
		group.setGroupExternalId(_ctx.stringValue("GetGroupResponse.Group.GroupExternalId"));
		group.setGroupSourceType(_ctx.stringValue("GetGroupResponse.Group.GroupSourceType"));
		group.setGroupSourceId(_ctx.stringValue("GetGroupResponse.Group.GroupSourceId"));
		group.setCreateTime(_ctx.longValue("GetGroupResponse.Group.CreateTime"));
		group.setUpdateTime(_ctx.longValue("GetGroupResponse.Group.UpdateTime"));
		group.setInstanceId(_ctx.stringValue("GetGroupResponse.Group.InstanceId"));
		getGroupResponse.setGroup(group);
	 
	 	return getGroupResponse;
	}
}