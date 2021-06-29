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

package com.aliyuncs.vcs.transform.v20200515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vcs.model.v20200515.ListUserGroupsResponse;
import com.aliyuncs.vcs.model.v20200515.ListUserGroupsResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUserGroupsResponseUnmarshaller {

	public static ListUserGroupsResponse unmarshall(ListUserGroupsResponse listUserGroupsResponse, UnmarshallerContext _ctx) {
		
		listUserGroupsResponse.setRequestId(_ctx.stringValue("ListUserGroupsResponse.RequestId"));
		listUserGroupsResponse.setMessage(_ctx.stringValue("ListUserGroupsResponse.Message"));
		listUserGroupsResponse.setCode(_ctx.stringValue("ListUserGroupsResponse.Code"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListUserGroupsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setUpdateTime(_ctx.stringValue("ListUserGroupsResponse.Data["+ i +"].UpdateTime"));
			dataItem.setIsvSubId(_ctx.stringValue("ListUserGroupsResponse.Data["+ i +"].IsvSubId"));
			dataItem.setUserGroupId(_ctx.longValue("ListUserGroupsResponse.Data["+ i +"].UserGroupId"));
			dataItem.setCreateTime(_ctx.stringValue("ListUserGroupsResponse.Data["+ i +"].CreateTime"));
			dataItem.setUserGroupName(_ctx.stringValue("ListUserGroupsResponse.Data["+ i +"].UserGroupName"));
			dataItem.setUserCount(_ctx.longValue("ListUserGroupsResponse.Data["+ i +"].UserCount"));
			dataItem.setParentUserGroupId(_ctx.longValue("ListUserGroupsResponse.Data["+ i +"].ParentUserGroupId"));
			dataItem.setCreator(_ctx.stringValue("ListUserGroupsResponse.Data["+ i +"].Creator"));

			data.add(dataItem);
		}
		listUserGroupsResponse.setData(data);
	 
	 	return listUserGroupsResponse;
	}
}