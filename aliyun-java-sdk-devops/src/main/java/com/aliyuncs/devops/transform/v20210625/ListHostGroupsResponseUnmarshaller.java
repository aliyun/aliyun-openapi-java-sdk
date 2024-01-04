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

package com.aliyuncs.devops.transform.v20210625;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.devops.model.v20210625.ListHostGroupsResponse;
import com.aliyuncs.devops.model.v20210625.ListHostGroupsResponse.HostGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListHostGroupsResponseUnmarshaller {

	public static ListHostGroupsResponse unmarshall(ListHostGroupsResponse listHostGroupsResponse, UnmarshallerContext _ctx) {
		
		listHostGroupsResponse.setRequestId(_ctx.stringValue("ListHostGroupsResponse.requestId"));
		listHostGroupsResponse.setErrorMessage(_ctx.stringValue("ListHostGroupsResponse.errorMessage"));
		listHostGroupsResponse.setErrorCode(_ctx.stringValue("ListHostGroupsResponse.errorCode"));
		listHostGroupsResponse.setSuccess(_ctx.booleanValue("ListHostGroupsResponse.success"));
		listHostGroupsResponse.setTotalCount(_ctx.longValue("ListHostGroupsResponse.totalCount"));
		listHostGroupsResponse.setNextToken(_ctx.stringValue("ListHostGroupsResponse.nextToken"));

		List<HostGroup> hostGroups = new ArrayList<HostGroup>();
		for (int i = 0; i < _ctx.lengthValue("ListHostGroupsResponse.hostGroups.Length"); i++) {
			HostGroup hostGroup = new HostGroup();
			hostGroup.setCreatorAccountId(_ctx.stringValue("ListHostGroupsResponse.hostGroups["+ i +"].creatorAccountId"));
			hostGroup.setUpdateTime(_ctx.longValue("ListHostGroupsResponse.hostGroups["+ i +"].updateTime"));
			hostGroup.setHostNum(_ctx.longValue("ListHostGroupsResponse.hostGroups["+ i +"].hostNum"));
			hostGroup.setModifierAccountId(_ctx.stringValue("ListHostGroupsResponse.hostGroups["+ i +"].modifierAccountId"));
			hostGroup.setDescription(_ctx.stringValue("ListHostGroupsResponse.hostGroups["+ i +"].description"));
			hostGroup.setType(_ctx.stringValue("ListHostGroupsResponse.hostGroups["+ i +"].type"));
			hostGroup.setCreateTime(_ctx.longValue("ListHostGroupsResponse.hostGroups["+ i +"].createTime"));
			hostGroup.setEcsType(_ctx.stringValue("ListHostGroupsResponse.hostGroups["+ i +"].ecsType"));
			hostGroup.setAliyunRegion(_ctx.stringValue("ListHostGroupsResponse.hostGroups["+ i +"].aliyunRegion"));
			hostGroup.setEcsLabelKey(_ctx.stringValue("ListHostGroupsResponse.hostGroups["+ i +"].ecsLabelKey"));
			hostGroup.setName(_ctx.stringValue("ListHostGroupsResponse.hostGroups["+ i +"].name"));
			hostGroup.setId(_ctx.longValue("ListHostGroupsResponse.hostGroups["+ i +"].id"));
			hostGroup.setServiceConnectionId(_ctx.longValue("ListHostGroupsResponse.hostGroups["+ i +"].serviceConnectionId"));
			hostGroup.setEcsLabelValue(_ctx.stringValue("ListHostGroupsResponse.hostGroups["+ i +"].ecsLabelValue"));

			hostGroups.add(hostGroup);
		}
		listHostGroupsResponse.setHostGroups(hostGroups);
	 
	 	return listHostGroupsResponse;
	}
}