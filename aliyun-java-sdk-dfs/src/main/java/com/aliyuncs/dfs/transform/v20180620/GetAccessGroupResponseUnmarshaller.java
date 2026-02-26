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

import com.aliyuncs.dfs.model.v20180620.GetAccessGroupResponse;
import com.aliyuncs.dfs.model.v20180620.GetAccessGroupResponse.AccessGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAccessGroupResponseUnmarshaller {

	public static GetAccessGroupResponse unmarshall(GetAccessGroupResponse getAccessGroupResponse, UnmarshallerContext _ctx) {
		
		getAccessGroupResponse.setRequestId(_ctx.stringValue("GetAccessGroupResponse.RequestId"));

		AccessGroup accessGroup = new AccessGroup();
		accessGroup.setIsDefault(_ctx.booleanValue("GetAccessGroupResponse.AccessGroup.IsDefault"));
		accessGroup.setAccessGroupName(_ctx.stringValue("GetAccessGroupResponse.AccessGroup.AccessGroupName"));
		accessGroup.setMountPointCount(_ctx.integerValue("GetAccessGroupResponse.AccessGroup.MountPointCount"));
		accessGroup.setDescription(_ctx.stringValue("GetAccessGroupResponse.AccessGroup.Description"));
		accessGroup.setAccessGroupId(_ctx.stringValue("GetAccessGroupResponse.AccessGroup.AccessGroupId"));
		accessGroup.setCreateTime(_ctx.stringValue("GetAccessGroupResponse.AccessGroup.CreateTime"));
		accessGroup.setNetworkType(_ctx.stringValue("GetAccessGroupResponse.AccessGroup.NetworkType"));
		accessGroup.setRuleCount(_ctx.integerValue("GetAccessGroupResponse.AccessGroup.RuleCount"));
		accessGroup.setRegionId(_ctx.stringValue("GetAccessGroupResponse.AccessGroup.RegionId"));
		getAccessGroupResponse.setAccessGroup(accessGroup);
	 
	 	return getAccessGroupResponse;
	}
}