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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ram.model.v20150501.ListGroupsResponse;
import com.aliyuncs.ram.model.v20150501.ListGroupsResponse.Group;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListGroupsResponseUnmarshaller {

	public static ListGroupsResponse unmarshall(ListGroupsResponse listGroupsResponse, UnmarshallerContext _ctx) {
		
		listGroupsResponse.setRequestId(_ctx.stringValue("ListGroupsResponse.RequestId"));
		listGroupsResponse.setIsTruncated(_ctx.booleanValue("ListGroupsResponse.IsTruncated"));
		listGroupsResponse.setMarker(_ctx.stringValue("ListGroupsResponse.Marker"));

		List<Group> groups = new ArrayList<Group>();
		for (int i = 0; i < _ctx.lengthValue("ListGroupsResponse.Groups.Length"); i++) {
			Group group = new Group();
			group.setGroupName(_ctx.stringValue("ListGroupsResponse.Groups["+ i +"].GroupName"));
			group.setComments(_ctx.stringValue("ListGroupsResponse.Groups["+ i +"].Comments"));
			group.setCreateDate(_ctx.stringValue("ListGroupsResponse.Groups["+ i +"].CreateDate"));
			group.setUpdateDate(_ctx.stringValue("ListGroupsResponse.Groups["+ i +"].UpdateDate"));

			groups.add(group);
		}
		listGroupsResponse.setGroups(groups);
	 
	 	return listGroupsResponse;
	}
}