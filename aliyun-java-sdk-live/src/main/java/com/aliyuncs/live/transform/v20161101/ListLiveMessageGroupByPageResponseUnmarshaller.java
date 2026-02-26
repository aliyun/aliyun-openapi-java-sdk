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

import com.aliyuncs.live.model.v20161101.ListLiveMessageGroupByPageResponse;
import com.aliyuncs.live.model.v20161101.ListLiveMessageGroupByPageResponse.Groups;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLiveMessageGroupByPageResponseUnmarshaller {

	public static ListLiveMessageGroupByPageResponse unmarshall(ListLiveMessageGroupByPageResponse listLiveMessageGroupByPageResponse, UnmarshallerContext _ctx) {
		
		listLiveMessageGroupByPageResponse.setRequestId(_ctx.stringValue("ListLiveMessageGroupByPageResponse.RequestId"));
		listLiveMessageGroupByPageResponse.setTotalCount(_ctx.integerValue("ListLiveMessageGroupByPageResponse.TotalCount"));
		listLiveMessageGroupByPageResponse.setPageNumber(_ctx.integerValue("ListLiveMessageGroupByPageResponse.PageNumber"));
		listLiveMessageGroupByPageResponse.setPageSize(_ctx.integerValue("ListLiveMessageGroupByPageResponse.PageSize"));

		List<Groups> groupList = new ArrayList<Groups>();
		for (int i = 0; i < _ctx.lengthValue("ListLiveMessageGroupByPageResponse.GroupList.Length"); i++) {
			Groups groups = new Groups();
			groups.setGroupId(_ctx.stringValue("ListLiveMessageGroupByPageResponse.GroupList["+ i +"].GroupId"));
			groups.setCreatorId(_ctx.stringValue("ListLiveMessageGroupByPageResponse.GroupList["+ i +"].CreatorId"));
			groups.setCreatetime(_ctx.longValue("ListLiveMessageGroupByPageResponse.GroupList["+ i +"].Createtime"));
			groups.setGroupName(_ctx.stringValue("ListLiveMessageGroupByPageResponse.GroupList["+ i +"].GroupName"));
			groups.setGroupInfo(_ctx.stringValue("ListLiveMessageGroupByPageResponse.GroupList["+ i +"].GroupInfo"));
			groups.setDelete(_ctx.booleanValue("ListLiveMessageGroupByPageResponse.GroupList["+ i +"].Delete"));

			List<String> adminList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListLiveMessageGroupByPageResponse.GroupList["+ i +"].AdminList.Length"); j++) {
				adminList.add(_ctx.stringValue("ListLiveMessageGroupByPageResponse.GroupList["+ i +"].AdminList["+ j +"]"));
			}
			groups.setAdminList(adminList);

			groupList.add(groups);
		}
		listLiveMessageGroupByPageResponse.setGroupList(groupList);
	 
	 	return listLiveMessageGroupByPageResponse;
	}
}