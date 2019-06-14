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

package com.aliyuncs.nas.transform.v20170626;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.nas.model.v20170626.DescribeAccessGroupsResponse;
import com.aliyuncs.nas.model.v20170626.DescribeAccessGroupsResponse.AccessGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAccessGroupsResponseUnmarshaller {

	public static DescribeAccessGroupsResponse unmarshall(DescribeAccessGroupsResponse describeAccessGroupsResponse, UnmarshallerContext context) {
		
		describeAccessGroupsResponse.setRequestId(context.stringValue("DescribeAccessGroupsResponse.RequestId"));
		describeAccessGroupsResponse.setTotalCount(context.integerValue("DescribeAccessGroupsResponse.TotalCount"));
		describeAccessGroupsResponse.setPageSize(context.integerValue("DescribeAccessGroupsResponse.PageSize"));
		describeAccessGroupsResponse.setPageNumber(context.integerValue("DescribeAccessGroupsResponse.PageNumber"));

		List<AccessGroup> accessGroups = new ArrayList<AccessGroup>();
		for (int i = 0; i < context.lengthValue("DescribeAccessGroupsResponse.AccessGroups.Length"); i++) {
			AccessGroup accessGroup = new AccessGroup();
			accessGroup.setAccessGroupName(context.stringValue("DescribeAccessGroupsResponse.AccessGroups["+ i +"].AccessGroupName"));
			accessGroup.setAccessGroupType(context.stringValue("DescribeAccessGroupsResponse.AccessGroups["+ i +"].AccessGroupType"));
			accessGroup.setRuleCount(context.integerValue("DescribeAccessGroupsResponse.AccessGroups["+ i +"].RuleCount"));
			accessGroup.setMountTargetCount(context.integerValue("DescribeAccessGroupsResponse.AccessGroups["+ i +"].MountTargetCount"));
			accessGroup.setDescription(context.stringValue("DescribeAccessGroupsResponse.AccessGroups["+ i +"].Description"));

			accessGroups.add(accessGroup);
		}
		describeAccessGroupsResponse.setAccessGroups(accessGroups);
	 
	 	return describeAccessGroupsResponse;
	}
}