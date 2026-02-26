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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eiam.model.v20211201.ListGroupsResponse;
import com.aliyuncs.eiam.model.v20211201.ListGroupsResponse.Group;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListGroupsResponseUnmarshaller {

	public static ListGroupsResponse unmarshall(ListGroupsResponse listGroupsResponse, UnmarshallerContext _ctx) {
		
		listGroupsResponse.setRequestId(_ctx.stringValue("ListGroupsResponse.RequestId"));
		listGroupsResponse.setTotalCount(_ctx.longValue("ListGroupsResponse.TotalCount"));

		List<Group> groups = new ArrayList<Group>();
		for (int i = 0; i < _ctx.lengthValue("ListGroupsResponse.Groups.Length"); i++) {
			Group group = new Group();
			group.setGroupId(_ctx.stringValue("ListGroupsResponse.Groups["+ i +"].GroupId"));
			group.setGroupName(_ctx.stringValue("ListGroupsResponse.Groups["+ i +"].GroupName"));
			group.setDescription(_ctx.stringValue("ListGroupsResponse.Groups["+ i +"].Description"));
			group.setGroupExternalId(_ctx.stringValue("ListGroupsResponse.Groups["+ i +"].GroupExternalId"));
			group.setGroupSourceType(_ctx.stringValue("ListGroupsResponse.Groups["+ i +"].GroupSourceType"));
			group.setGroupSourceId(_ctx.stringValue("ListGroupsResponse.Groups["+ i +"].GroupSourceId"));
			group.setCreateTime(_ctx.longValue("ListGroupsResponse.Groups["+ i +"].CreateTime"));
			group.setUpdateTime(_ctx.longValue("ListGroupsResponse.Groups["+ i +"].UpdateTime"));
			group.setInstanceId(_ctx.stringValue("ListGroupsResponse.Groups["+ i +"].InstanceId"));

			groups.add(group);
		}
		listGroupsResponse.setGroups(groups);
	 
	 	return listGroupsResponse;
	}
}