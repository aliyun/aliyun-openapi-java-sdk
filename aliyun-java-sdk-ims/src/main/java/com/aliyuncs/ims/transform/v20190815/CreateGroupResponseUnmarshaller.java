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

package com.aliyuncs.ims.transform.v20190815;

import com.aliyuncs.ims.model.v20190815.CreateGroupResponse;
import com.aliyuncs.ims.model.v20190815.CreateGroupResponse.Group;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateGroupResponseUnmarshaller {

	public static CreateGroupResponse unmarshall(CreateGroupResponse createGroupResponse, UnmarshallerContext _ctx) {
		
		createGroupResponse.setRequestId(_ctx.stringValue("CreateGroupResponse.RequestId"));

		Group group = new Group();
		group.setDisplayName(_ctx.stringValue("CreateGroupResponse.Group.DisplayName"));
		group.setGroupPrincipalName(_ctx.stringValue("CreateGroupResponse.Group.GroupPrincipalName"));
		group.setGroupId(_ctx.stringValue("CreateGroupResponse.Group.GroupId"));
		group.setUpdateDate(_ctx.stringValue("CreateGroupResponse.Group.UpdateDate"));
		group.setGroupName(_ctx.stringValue("CreateGroupResponse.Group.GroupName"));
		group.setComments(_ctx.stringValue("CreateGroupResponse.Group.Comments"));
		group.setCreateDate(_ctx.stringValue("CreateGroupResponse.Group.CreateDate"));
		createGroupResponse.setGroup(group);
	 
	 	return createGroupResponse;
	}
}