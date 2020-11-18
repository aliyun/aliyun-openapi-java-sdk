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

import com.aliyuncs.linkvisual.model.v20180120.QueryFaceUserGroupResponse;
import com.aliyuncs.linkvisual.model.v20180120.QueryFaceUserGroupResponse.Data;
import com.aliyuncs.linkvisual.model.v20180120.QueryFaceUserGroupResponse.Data.UserGroupInfos;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryFaceUserGroupResponseUnmarshaller {

	public static QueryFaceUserGroupResponse unmarshall(QueryFaceUserGroupResponse queryFaceUserGroupResponse, UnmarshallerContext _ctx) {
		
		queryFaceUserGroupResponse.setRequestId(_ctx.stringValue("QueryFaceUserGroupResponse.RequestId"));
		queryFaceUserGroupResponse.setSuccess(_ctx.booleanValue("QueryFaceUserGroupResponse.Success"));
		queryFaceUserGroupResponse.setCode(_ctx.stringValue("QueryFaceUserGroupResponse.Code"));
		queryFaceUserGroupResponse.setErrorMessage(_ctx.stringValue("QueryFaceUserGroupResponse.ErrorMessage"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("QueryFaceUserGroupResponse.Data.Total"));
		data.setPageNo(_ctx.integerValue("QueryFaceUserGroupResponse.Data.PageNo"));
		data.setPageSize(_ctx.integerValue("QueryFaceUserGroupResponse.Data.PageSize"));

		List<UserGroupInfos> userGroupList = new ArrayList<UserGroupInfos>();
		for (int i = 0; i < _ctx.lengthValue("QueryFaceUserGroupResponse.Data.UserGroupList.Length"); i++) {
			UserGroupInfos userGroupInfos = new UserGroupInfos();
			userGroupInfos.setUserGroupId(_ctx.stringValue("QueryFaceUserGroupResponse.Data.UserGroupList["+ i +"].UserGroupId"));
			userGroupInfos.setUserGroupName(_ctx.stringValue("QueryFaceUserGroupResponse.Data.UserGroupList["+ i +"].UserGroupName"));
			userGroupInfos.setModifiedTime(_ctx.stringValue("QueryFaceUserGroupResponse.Data.UserGroupList["+ i +"].ModifiedTime"));

			userGroupList.add(userGroupInfos);
		}
		data.setUserGroupList(userGroupList);
		queryFaceUserGroupResponse.setData(data);
	 
	 	return queryFaceUserGroupResponse;
	}
}