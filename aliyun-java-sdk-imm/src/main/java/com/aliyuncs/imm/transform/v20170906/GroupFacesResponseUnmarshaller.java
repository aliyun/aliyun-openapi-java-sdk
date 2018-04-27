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

package com.aliyuncs.imm.transform.v20170906;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imm.model.v20170906.GroupFacesResponse;
import com.aliyuncs.imm.model.v20170906.GroupFacesResponse.GroupsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GroupFacesResponseUnmarshaller {

	public static GroupFacesResponse unmarshall(GroupFacesResponse groupFacesResponse, UnmarshallerContext context) {
		
		groupFacesResponse.setRequestId(context.stringValue("GroupFacesResponse.RequestId"));
		groupFacesResponse.setSetId(context.stringValue("GroupFacesResponse.SetId"));
		groupFacesResponse.setHasMore(context.integerValue("GroupFacesResponse.HasMore"));

		List<GroupsItem> groups = new ArrayList<GroupsItem>();
		for (int i = 0; i < context.lengthValue("GroupFacesResponse.Groups.Length"); i++) {
			GroupsItem groupsItem = new GroupsItem();
			groupsItem.setFaceId(context.stringValue("GroupFacesResponse.Groups["+ i +"].FaceId"));
			groupsItem.setGroupId(context.stringValue("GroupFacesResponse.Groups["+ i +"].GroupId"));
			groupsItem.setUnGroupReason(context.stringValue("GroupFacesResponse.Groups["+ i +"].UnGroupReason"));

			groups.add(groupsItem);
		}
		groupFacesResponse.setGroups(groups);
	 
	 	return groupFacesResponse;
	}
}