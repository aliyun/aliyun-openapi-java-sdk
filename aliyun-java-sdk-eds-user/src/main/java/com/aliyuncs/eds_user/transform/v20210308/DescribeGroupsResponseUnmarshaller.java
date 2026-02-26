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

package com.aliyuncs.eds_user.transform.v20210308;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eds_user.model.v20210308.DescribeGroupsResponse;
import com.aliyuncs.eds_user.model.v20210308.DescribeGroupsResponse.Group;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGroupsResponseUnmarshaller {

	public static DescribeGroupsResponse unmarshall(DescribeGroupsResponse describeGroupsResponse, UnmarshallerContext _ctx) {
		
		describeGroupsResponse.setRequestId(_ctx.stringValue("DescribeGroupsResponse.RequestId"));

		List<Group> groups = new ArrayList<Group>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGroupsResponse.Groups.Length"); i++) {
			Group group = new Group();
			group.setGroupName(_ctx.stringValue("DescribeGroupsResponse.Groups["+ i +"].GroupName"));
			group.setGroupId(_ctx.stringValue("DescribeGroupsResponse.Groups["+ i +"].GroupId"));

			groups.add(group);
		}
		describeGroupsResponse.setGroups(groups);
	 
	 	return describeGroupsResponse;
	}
}