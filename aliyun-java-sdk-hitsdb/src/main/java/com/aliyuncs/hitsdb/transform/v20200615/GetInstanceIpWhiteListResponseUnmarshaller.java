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

package com.aliyuncs.hitsdb.transform.v20200615;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hitsdb.model.v20200615.GetInstanceIpWhiteListResponse;
import com.aliyuncs.hitsdb.model.v20200615.GetInstanceIpWhiteListResponse.GroupListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetInstanceIpWhiteListResponseUnmarshaller {

	public static GetInstanceIpWhiteListResponse unmarshall(GetInstanceIpWhiteListResponse getInstanceIpWhiteListResponse, UnmarshallerContext _ctx) {
		
		getInstanceIpWhiteListResponse.setRequestId(_ctx.stringValue("GetInstanceIpWhiteListResponse.RequestId"));
		getInstanceIpWhiteListResponse.setInstanceId(_ctx.stringValue("GetInstanceIpWhiteListResponse.InstanceId"));

		List<String> ipList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetInstanceIpWhiteListResponse.IpList.Length"); i++) {
			ipList.add(_ctx.stringValue("GetInstanceIpWhiteListResponse.IpList["+ i +"]"));
		}
		getInstanceIpWhiteListResponse.setIpList(ipList);

		List<GroupListItem> groupList = new ArrayList<GroupListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetInstanceIpWhiteListResponse.GroupList.Length"); i++) {
			GroupListItem groupListItem = new GroupListItem();
			groupListItem.setGroupName(_ctx.stringValue("GetInstanceIpWhiteListResponse.GroupList["+ i +"].GroupName"));
			groupListItem.setSecurityIpList(_ctx.stringValue("GetInstanceIpWhiteListResponse.GroupList["+ i +"].SecurityIpList"));

			groupList.add(groupListItem);
		}
		getInstanceIpWhiteListResponse.setGroupList(groupList);
	 
	 	return getInstanceIpWhiteListResponse;
	}
}