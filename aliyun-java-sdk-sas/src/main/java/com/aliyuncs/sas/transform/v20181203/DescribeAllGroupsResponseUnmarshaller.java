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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribeAllGroupsResponse;
import com.aliyuncs.sas.model.v20181203.DescribeAllGroupsResponse.Group;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAllGroupsResponseUnmarshaller {

	public static DescribeAllGroupsResponse unmarshall(DescribeAllGroupsResponse describeAllGroupsResponse, UnmarshallerContext _ctx) {
		
		describeAllGroupsResponse.setRequestId(_ctx.stringValue("DescribeAllGroupsResponse.RequestId"));
		describeAllGroupsResponse.setCount(_ctx.integerValue("DescribeAllGroupsResponse.Count"));

		List<Group> groups = new ArrayList<Group>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAllGroupsResponse.Groups.Length"); i++) {
			Group group = new Group();
			group.setGroupName(_ctx.stringValue("DescribeAllGroupsResponse.Groups["+ i +"].GroupName"));
			group.setGroupId(_ctx.integerValue("DescribeAllGroupsResponse.Groups["+ i +"].GroupId"));
			group.setGroupFlag(_ctx.integerValue("DescribeAllGroupsResponse.Groups["+ i +"].GroupFlag"));

			groups.add(group);
		}
		describeAllGroupsResponse.setGroups(groups);
	 
	 	return describeAllGroupsResponse;
	}
}