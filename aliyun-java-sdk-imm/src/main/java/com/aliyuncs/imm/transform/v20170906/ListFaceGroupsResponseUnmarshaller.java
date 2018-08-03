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

import com.aliyuncs.imm.model.v20170906.ListFaceGroupsResponse;
import com.aliyuncs.imm.model.v20170906.ListFaceGroupsResponse.GroupsItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFaceGroupsResponseUnmarshaller {

	public static ListFaceGroupsResponse unmarshall(ListFaceGroupsResponse listFaceGroupsResponse, UnmarshallerContext context) {
		
		listFaceGroupsResponse.setRequestId(context.stringValue("ListFaceGroupsResponse.RequestId"));
		listFaceGroupsResponse.setNextMarker(context.integerValue("ListFaceGroupsResponse.NextMarker"));

		List<GroupsItem> groups = new ArrayList<GroupsItem>();
		for (int i = 0; i < context.lengthValue("ListFaceGroupsResponse.Groups.Length"); i++) {
			GroupsItem groupsItem = new GroupsItem();
			groupsItem.setGroupId(context.integerValue("ListFaceGroupsResponse.Groups["+ i +"].GroupId"));
			groupsItem.setFaceNum(context.integerValue("ListFaceGroupsResponse.Groups["+ i +"].FaceNum"));

			groups.add(groupsItem);
		}
		listFaceGroupsResponse.setGroups(groups);
	 
	 	return listFaceGroupsResponse;
	}
}