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

import com.aliyuncs.eiam.model.v20211201.ListGroupsForApplicationResponse;
import com.aliyuncs.eiam.model.v20211201.ListGroupsForApplicationResponse.Group;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListGroupsForApplicationResponseUnmarshaller {

	public static ListGroupsForApplicationResponse unmarshall(ListGroupsForApplicationResponse listGroupsForApplicationResponse, UnmarshallerContext _ctx) {
		
		listGroupsForApplicationResponse.setRequestId(_ctx.stringValue("ListGroupsForApplicationResponse.RequestId"));
		listGroupsForApplicationResponse.setTotalCount(_ctx.longValue("ListGroupsForApplicationResponse.TotalCount"));

		List<Group> groups = new ArrayList<Group>();
		for (int i = 0; i < _ctx.lengthValue("ListGroupsForApplicationResponse.Groups.Length"); i++) {
			Group group = new Group();
			group.setGroupId(_ctx.stringValue("ListGroupsForApplicationResponse.Groups["+ i +"].GroupId"));

			groups.add(group);
		}
		listGroupsForApplicationResponse.setGroups(groups);
	 
	 	return listGroupsForApplicationResponse;
	}
}