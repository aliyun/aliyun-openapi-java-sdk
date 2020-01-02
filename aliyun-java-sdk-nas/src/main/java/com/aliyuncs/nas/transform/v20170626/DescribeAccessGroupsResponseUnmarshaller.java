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
import com.aliyuncs.nas.model.v20170626.DescribeAccessGroupsResponse.AccessGroup.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAccessGroupsResponseUnmarshaller {

	public static DescribeAccessGroupsResponse unmarshall(DescribeAccessGroupsResponse describeAccessGroupsResponse, UnmarshallerContext _ctx) {
		
		describeAccessGroupsResponse.setRequestId(_ctx.stringValue("DescribeAccessGroupsResponse.RequestId"));
		describeAccessGroupsResponse.setTotalCount(_ctx.integerValue("DescribeAccessGroupsResponse.TotalCount"));
		describeAccessGroupsResponse.setPageSize(_ctx.integerValue("DescribeAccessGroupsResponse.PageSize"));
		describeAccessGroupsResponse.setPageNumber(_ctx.integerValue("DescribeAccessGroupsResponse.PageNumber"));

		List<AccessGroup> accessGroups = new ArrayList<AccessGroup>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAccessGroupsResponse.AccessGroups.Length"); i++) {
			AccessGroup accessGroup = new AccessGroup();
			accessGroup.setAccessGroupName(_ctx.stringValue("DescribeAccessGroupsResponse.AccessGroups["+ i +"].AccessGroupName"));
			accessGroup.setAccessGroupType(_ctx.stringValue("DescribeAccessGroupsResponse.AccessGroups["+ i +"].AccessGroupType"));
			accessGroup.setRuleCount(_ctx.integerValue("DescribeAccessGroupsResponse.AccessGroups["+ i +"].RuleCount"));
			accessGroup.setMountTargetCount(_ctx.integerValue("DescribeAccessGroupsResponse.AccessGroups["+ i +"].MountTargetCount"));
			accessGroup.setDescription(_ctx.stringValue("DescribeAccessGroupsResponse.AccessGroups["+ i +"].Description"));
			accessGroup.setCreateTime(_ctx.stringValue("DescribeAccessGroupsResponse.AccessGroups["+ i +"].CreateTime"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAccessGroupsResponse.AccessGroups["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("DescribeAccessGroupsResponse.AccessGroups["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("DescribeAccessGroupsResponse.AccessGroups["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			accessGroup.setTags(tags);

			accessGroups.add(accessGroup);
		}
		describeAccessGroupsResponse.setAccessGroups(accessGroups);
	 
	 	return describeAccessGroupsResponse;
	}
}