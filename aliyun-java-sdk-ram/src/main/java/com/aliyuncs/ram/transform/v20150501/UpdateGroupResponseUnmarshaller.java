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

package com.aliyuncs.ram.transform.v20150501;

import com.aliyuncs.ram.model.v20150501.UpdateGroupResponse;
import com.aliyuncs.ram.model.v20150501.UpdateGroupResponse.Group;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateGroupResponseUnmarshaller {

	public static UpdateGroupResponse unmarshall(UpdateGroupResponse updateGroupResponse, UnmarshallerContext _ctx) {
		
		updateGroupResponse.setRequestId(_ctx.stringValue("UpdateGroupResponse.RequestId"));

		Group group = new Group();
		group.setGroupName(_ctx.stringValue("UpdateGroupResponse.Group.GroupName"));
		group.setComments(_ctx.stringValue("UpdateGroupResponse.Group.Comments"));
		group.setCreateDate(_ctx.stringValue("UpdateGroupResponse.Group.CreateDate"));
		group.setUpdateDate(_ctx.stringValue("UpdateGroupResponse.Group.UpdateDate"));
		updateGroupResponse.setGroup(group);
	 
	 	return updateGroupResponse;
	}
}