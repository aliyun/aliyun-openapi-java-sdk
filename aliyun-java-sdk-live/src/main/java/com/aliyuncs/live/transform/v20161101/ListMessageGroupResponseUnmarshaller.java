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

import com.aliyuncs.live.model.v20161101.ListMessageGroupResponse;
import com.aliyuncs.live.model.v20161101.ListMessageGroupResponse.Result;
import com.aliyuncs.live.model.v20161101.ListMessageGroupResponse.Result.GroupListItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMessageGroupResponseUnmarshaller {

	public static ListMessageGroupResponse unmarshall(ListMessageGroupResponse listMessageGroupResponse, UnmarshallerContext _ctx) {
		
		listMessageGroupResponse.setRequestId(_ctx.stringValue("ListMessageGroupResponse.RequestId"));

		Result result = new Result();
		result.setTotal(_ctx.integerValue("ListMessageGroupResponse.Result.Total"));
		result.setHasMore(_ctx.booleanValue("ListMessageGroupResponse.Result.HasMore"));

		List<GroupListItem> groupList = new ArrayList<GroupListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListMessageGroupResponse.Result.GroupList.Length"); i++) {
			GroupListItem groupListItem = new GroupListItem();
			groupListItem.setGroupId(_ctx.stringValue("ListMessageGroupResponse.Result.GroupList["+ i +"].GroupId"));
			groupListItem.setAppId(_ctx.stringValue("ListMessageGroupResponse.Result.GroupList["+ i +"].AppId"));
			groupListItem.setCreateTime(_ctx.longValue("ListMessageGroupResponse.Result.GroupList["+ i +"].CreateTime"));
			groupListItem.setStatus(_ctx.integerValue("ListMessageGroupResponse.Result.GroupList["+ i +"].Status"));
			groupListItem.setCreatorId(_ctx.stringValue("ListMessageGroupResponse.Result.GroupList["+ i +"].CreatorId"));
			groupListItem.setExtension(_ctx.mapValue("ListMessageGroupResponse.Result.GroupList["+ i +"].Extension"));

			groupList.add(groupListItem);
		}
		result.setGroupList(groupList);
		listMessageGroupResponse.setResult(result);
	 
	 	return listMessageGroupResponse;
	}
}