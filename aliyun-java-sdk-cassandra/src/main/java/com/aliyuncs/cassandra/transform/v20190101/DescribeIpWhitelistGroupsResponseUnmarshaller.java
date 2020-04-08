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

package com.aliyuncs.cassandra.transform.v20190101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cassandra.model.v20190101.DescribeIpWhitelistGroupsResponse;
import com.aliyuncs.cassandra.model.v20190101.DescribeIpWhitelistGroupsResponse.Group;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeIpWhitelistGroupsResponseUnmarshaller {

	public static DescribeIpWhitelistGroupsResponse unmarshall(DescribeIpWhitelistGroupsResponse describeIpWhitelistGroupsResponse, UnmarshallerContext _ctx) {
		
		describeIpWhitelistGroupsResponse.setRequestId(_ctx.stringValue("DescribeIpWhitelistGroupsResponse.RequestId"));

		List<Group> groups = new ArrayList<Group>();
		for (int i = 0; i < _ctx.lengthValue("DescribeIpWhitelistGroupsResponse.Groups.Length"); i++) {
			Group group = new Group();
			group.setGroupName(_ctx.stringValue("DescribeIpWhitelistGroupsResponse.Groups["+ i +"].GroupName"));
			group.setIpVersion(_ctx.integerValue("DescribeIpWhitelistGroupsResponse.Groups["+ i +"].IpVersion"));

			List<String> ipList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeIpWhitelistGroupsResponse.Groups["+ i +"].IpList.Length"); j++) {
				ipList.add(_ctx.stringValue("DescribeIpWhitelistGroupsResponse.Groups["+ i +"].IpList["+ j +"]"));
			}
			group.setIpList(ipList);

			groups.add(group);
		}
		describeIpWhitelistGroupsResponse.setGroups(groups);
	 
	 	return describeIpWhitelistGroupsResponse;
	}
}