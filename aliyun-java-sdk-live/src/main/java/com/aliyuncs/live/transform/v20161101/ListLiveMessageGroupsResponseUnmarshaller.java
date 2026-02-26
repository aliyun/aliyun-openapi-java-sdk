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

package com.aliyuncs.live.transform.v20161101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.ListLiveMessageGroupsResponse;
import com.aliyuncs.live.model.v20161101.ListLiveMessageGroupsResponse.Groups;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLiveMessageGroupsResponseUnmarshaller {

	public static ListLiveMessageGroupsResponse unmarshall(ListLiveMessageGroupsResponse listLiveMessageGroupsResponse, UnmarshallerContext _ctx) {
		
		listLiveMessageGroupsResponse.setRequestId(_ctx.stringValue("ListLiveMessageGroupsResponse.RequestId"));
		listLiveMessageGroupsResponse.setHasmore(_ctx.booleanValue("ListLiveMessageGroupsResponse.Hasmore"));
		listLiveMessageGroupsResponse.setNextpageToken(_ctx.stringValue("ListLiveMessageGroupsResponse.NextpageToken"));

		List<Groups> groupList = new ArrayList<Groups>();
		for (int i = 0; i < _ctx.lengthValue("ListLiveMessageGroupsResponse.GroupList.Length"); i++) {
			Groups groups = new Groups();
			groups.setGroupId(_ctx.stringValue("ListLiveMessageGroupsResponse.GroupList["+ i +"].GroupId"));
			groups.setCreatorId(_ctx.stringValue("ListLiveMessageGroupsResponse.GroupList["+ i +"].CreatorId"));
			groups.setCreatetime(_ctx.longValue("ListLiveMessageGroupsResponse.GroupList["+ i +"].Createtime"));
			groups.setGroupName(_ctx.stringValue("ListLiveMessageGroupsResponse.GroupList["+ i +"].GroupName"));
			groups.setGroupInfo(_ctx.stringValue("ListLiveMessageGroupsResponse.GroupList["+ i +"].GroupInfo"));
			groups.setDelete(_ctx.booleanValue("ListLiveMessageGroupsResponse.GroupList["+ i +"].Delete"));

			List<String> adminList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListLiveMessageGroupsResponse.GroupList["+ i +"].AdminList.Length"); j++) {
				adminList.add(_ctx.stringValue("ListLiveMessageGroupsResponse.GroupList["+ i +"].AdminList["+ j +"]"));
			}
			groups.setAdminList(adminList);

			groupList.add(groups);
		}
		listLiveMessageGroupsResponse.setGroupList(groupList);
	 
	 	return listLiveMessageGroupsResponse;
	}
}