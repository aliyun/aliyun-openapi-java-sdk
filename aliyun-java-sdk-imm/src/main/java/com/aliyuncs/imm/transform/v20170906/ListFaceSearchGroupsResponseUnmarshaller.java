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

import com.aliyuncs.imm.model.v20170906.ListFaceSearchGroupsResponse;
import com.aliyuncs.imm.model.v20170906.ListFaceSearchGroupsResponse.GroupsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFaceSearchGroupsResponseUnmarshaller {

	public static ListFaceSearchGroupsResponse unmarshall(ListFaceSearchGroupsResponse listFaceSearchGroupsResponse, UnmarshallerContext _ctx) {
		
		listFaceSearchGroupsResponse.setRequestId(_ctx.stringValue("ListFaceSearchGroupsResponse.RequestId"));
		listFaceSearchGroupsResponse.setNextMarker(_ctx.stringValue("ListFaceSearchGroupsResponse.NextMarker"));

		List<GroupsItem> groups = new ArrayList<GroupsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListFaceSearchGroupsResponse.Groups.Length"); i++) {
			GroupsItem groupsItem = new GroupsItem();
			groupsItem.setGroupName(_ctx.stringValue("ListFaceSearchGroupsResponse.Groups["+ i +"].GroupName"));
			groupsItem.setCount(_ctx.stringValue("ListFaceSearchGroupsResponse.Groups["+ i +"].Count"));
			groupsItem.setStatus(_ctx.stringValue("ListFaceSearchGroupsResponse.Groups["+ i +"].Status"));
			groupsItem.setCreateTime(_ctx.stringValue("ListFaceSearchGroupsResponse.Groups["+ i +"].CreateTime"));
			groupsItem.setModifyTime(_ctx.stringValue("ListFaceSearchGroupsResponse.Groups["+ i +"].ModifyTime"));
			groupsItem.setGroupId(_ctx.stringValue("ListFaceSearchGroupsResponse.Groups["+ i +"].GroupId"));

			groups.add(groupsItem);
		}
		listFaceSearchGroupsResponse.setGroups(groups);
	 
	 	return listFaceSearchGroupsResponse;
	}
}