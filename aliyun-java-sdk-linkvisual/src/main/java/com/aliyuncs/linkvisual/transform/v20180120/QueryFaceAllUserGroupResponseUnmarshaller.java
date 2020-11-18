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

package com.aliyuncs.linkvisual.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkvisual.model.v20180120.QueryFaceAllUserGroupResponse;
import com.aliyuncs.linkvisual.model.v20180120.QueryFaceAllUserGroupResponse.Data;
import com.aliyuncs.linkvisual.model.v20180120.QueryFaceAllUserGroupResponse.Data.UserGroupListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryFaceAllUserGroupResponseUnmarshaller {

	public static QueryFaceAllUserGroupResponse unmarshall(QueryFaceAllUserGroupResponse queryFaceAllUserGroupResponse, UnmarshallerContext _ctx) {
		
		queryFaceAllUserGroupResponse.setRequestId(_ctx.stringValue("QueryFaceAllUserGroupResponse.RequestId"));
		queryFaceAllUserGroupResponse.setSuccess(_ctx.booleanValue("QueryFaceAllUserGroupResponse.Success"));
		queryFaceAllUserGroupResponse.setCode(_ctx.stringValue("QueryFaceAllUserGroupResponse.Code"));
		queryFaceAllUserGroupResponse.setErrorMessage(_ctx.stringValue("QueryFaceAllUserGroupResponse.ErrorMessage"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("QueryFaceAllUserGroupResponse.Data.Total"));
		data.setPageNo(_ctx.integerValue("QueryFaceAllUserGroupResponse.Data.PageNo"));
		data.setPageSize(_ctx.integerValue("QueryFaceAllUserGroupResponse.Data.PageSize"));

		List<UserGroupListItem> userGroupList = new ArrayList<UserGroupListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryFaceAllUserGroupResponse.Data.UserGroupList.Length"); i++) {
			UserGroupListItem userGroupListItem = new UserGroupListItem();
			userGroupListItem.setUserGroupId(_ctx.stringValue("QueryFaceAllUserGroupResponse.Data.UserGroupList["+ i +"].UserGroupId"));
			userGroupListItem.setUserGroupName(_ctx.stringValue("QueryFaceAllUserGroupResponse.Data.UserGroupList["+ i +"].UserGroupName"));
			userGroupListItem.setModifiedTime(_ctx.stringValue("QueryFaceAllUserGroupResponse.Data.UserGroupList["+ i +"].ModifiedTime"));

			userGroupList.add(userGroupListItem);
		}
		data.setUserGroupList(userGroupList);
		queryFaceAllUserGroupResponse.setData(data);
	 
	 	return queryFaceAllUserGroupResponse;
	}
}