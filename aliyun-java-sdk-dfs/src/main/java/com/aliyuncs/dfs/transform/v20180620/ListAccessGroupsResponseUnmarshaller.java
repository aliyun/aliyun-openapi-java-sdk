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

package com.aliyuncs.dfs.transform.v20180620;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dfs.model.v20180620.ListAccessGroupsResponse;
import com.aliyuncs.dfs.model.v20180620.ListAccessGroupsResponse.AccessGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAccessGroupsResponseUnmarshaller {

	public static ListAccessGroupsResponse unmarshall(ListAccessGroupsResponse listAccessGroupsResponse, UnmarshallerContext _ctx) {
		
		listAccessGroupsResponse.setRequestId(_ctx.stringValue("ListAccessGroupsResponse.RequestId"));
		listAccessGroupsResponse.setTotalCount(_ctx.integerValue("ListAccessGroupsResponse.TotalCount"));
		listAccessGroupsResponse.setNextToken(_ctx.stringValue("ListAccessGroupsResponse.NextToken"));

		List<AccessGroup> accessGroups = new ArrayList<AccessGroup>();
		for (int i = 0; i < _ctx.lengthValue("ListAccessGroupsResponse.AccessGroups.Length"); i++) {
			AccessGroup accessGroup = new AccessGroup();
			accessGroup.setIsDefault(_ctx.booleanValue("ListAccessGroupsResponse.AccessGroups["+ i +"].IsDefault"));
			accessGroup.setAccessGroupName(_ctx.stringValue("ListAccessGroupsResponse.AccessGroups["+ i +"].AccessGroupName"));
			accessGroup.setMountPointCount(_ctx.integerValue("ListAccessGroupsResponse.AccessGroups["+ i +"].MountPointCount"));
			accessGroup.setDescription(_ctx.stringValue("ListAccessGroupsResponse.AccessGroups["+ i +"].Description"));
			accessGroup.setAccessGroupId(_ctx.stringValue("ListAccessGroupsResponse.AccessGroups["+ i +"].AccessGroupId"));
			accessGroup.setCreateTime(_ctx.stringValue("ListAccessGroupsResponse.AccessGroups["+ i +"].CreateTime"));
			accessGroup.setNetworkType(_ctx.stringValue("ListAccessGroupsResponse.AccessGroups["+ i +"].NetworkType"));
			accessGroup.setRuleCount(_ctx.integerValue("ListAccessGroupsResponse.AccessGroups["+ i +"].RuleCount"));
			accessGroup.setRegionId(_ctx.stringValue("ListAccessGroupsResponse.AccessGroups["+ i +"].RegionId"));

			accessGroups.add(accessGroup);
		}
		listAccessGroupsResponse.setAccessGroups(accessGroups);
	 
	 	return listAccessGroupsResponse;
	}
}