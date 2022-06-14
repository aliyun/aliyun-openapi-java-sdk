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

package com.aliyuncs.retailbot.transform.v20210224;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.retailbot.model.v20210224.ListActiveGroupsResponse;
import com.aliyuncs.retailbot.model.v20210224.ListActiveGroupsResponse.Data;
import com.aliyuncs.retailbot.model.v20210224.ListActiveGroupsResponse.Data.GroupListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListActiveGroupsResponseUnmarshaller {

	public static ListActiveGroupsResponse unmarshall(ListActiveGroupsResponse listActiveGroupsResponse, UnmarshallerContext _ctx) {
		
		listActiveGroupsResponse.setRequestId(_ctx.stringValue("ListActiveGroupsResponse.RequestId"));
		listActiveGroupsResponse.setSuccess(_ctx.booleanValue("ListActiveGroupsResponse.Success"));
		listActiveGroupsResponse.setCode(_ctx.stringValue("ListActiveGroupsResponse.Code"));
		listActiveGroupsResponse.setMessage(_ctx.stringValue("ListActiveGroupsResponse.Message"));

		Data data = new Data();
		data.setPageNo(_ctx.integerValue("ListActiveGroupsResponse.Data.PageNo"));
		data.setPageSize(_ctx.integerValue("ListActiveGroupsResponse.Data.PageSize"));
		data.setTotalSize(_ctx.longValue("ListActiveGroupsResponse.Data.TotalSize"));
		data.setTotalPage(_ctx.integerValue("ListActiveGroupsResponse.Data.TotalPage"));

		List<GroupListItem> groupList = new ArrayList<GroupListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListActiveGroupsResponse.Data.GroupList.Length"); i++) {
			GroupListItem groupListItem = new GroupListItem();
			groupListItem.setGroupId(_ctx.longValue("ListActiveGroupsResponse.Data.GroupList["+ i +"].GroupId"));
			groupListItem.setGmtCreate(_ctx.longValue("ListActiveGroupsResponse.Data.GroupList["+ i +"].GmtCreate"));
			groupListItem.setGmtModified(_ctx.longValue("ListActiveGroupsResponse.Data.GroupList["+ i +"].GmtModified"));
			groupListItem.setInstanceId(_ctx.stringValue("ListActiveGroupsResponse.Data.GroupList["+ i +"].InstanceId"));
			groupListItem.setAppCode(_ctx.stringValue("ListActiveGroupsResponse.Data.GroupList["+ i +"].AppCode"));
			groupListItem.setShopId(_ctx.stringValue("ListActiveGroupsResponse.Data.GroupList["+ i +"].ShopId"));
			groupListItem.setAppVersion(_ctx.stringValue("ListActiveGroupsResponse.Data.GroupList["+ i +"].AppVersion"));
			groupListItem.setName(_ctx.stringValue("ListActiveGroupsResponse.Data.GroupList["+ i +"].Name"));
			groupListItem.setDescription(_ctx.stringValue("ListActiveGroupsResponse.Data.GroupList["+ i +"].Description"));
			groupListItem.setModifier(_ctx.stringValue("ListActiveGroupsResponse.Data.GroupList["+ i +"].Modifier"));
			groupListItem.setConfig(_ctx.stringValue("ListActiveGroupsResponse.Data.GroupList["+ i +"].Config"));
			groupListItem.setStatus(_ctx.integerValue("ListActiveGroupsResponse.Data.GroupList["+ i +"].Status"));

			groupList.add(groupListItem);
		}
		data.setGroupList(groupList);
		listActiveGroupsResponse.setData(data);
	 
	 	return listActiveGroupsResponse;
	}
}