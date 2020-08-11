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

package com.aliyuncs.oam.transform.v20170101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.oam.model.v20170101.ListUsersForGroupResponse;
import com.aliyuncs.oam.model.v20170101.ListUsersForGroupResponse.OamUser;
import com.aliyuncs.oam.model.v20170101.ListUsersForGroupResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUsersForGroupResponseUnmarshaller {

	public static ListUsersForGroupResponse unmarshall(ListUsersForGroupResponse listUsersForGroupResponse, UnmarshallerContext _ctx) {
		
		listUsersForGroupResponse.setCode(_ctx.stringValue("ListUsersForGroupResponse.Code"));
		listUsersForGroupResponse.setMessage(_ctx.stringValue("ListUsersForGroupResponse.Message"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("ListUsersForGroupResponse.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("ListUsersForGroupResponse.PageInfo.PageSize"));
		pageInfo.setTotal(_ctx.integerValue("ListUsersForGroupResponse.PageInfo.Total"));
		pageInfo.setTotalPage(_ctx.integerValue("ListUsersForGroupResponse.PageInfo.TotalPage"));
		pageInfo.setNextPageToken(_ctx.stringValue("ListUsersForGroupResponse.PageInfo.NextPageToken"));
		listUsersForGroupResponse.setPageInfo(pageInfo);

		List<OamUser> data = new ArrayList<OamUser>();
		for (int i = 0; i < _ctx.lengthValue("ListUsersForGroupResponse.Data.Length"); i++) {
			OamUser oamUser = new OamUser();
			oamUser.setUid(_ctx.longValue("ListUsersForGroupResponse.Data["+ i +"].Uid"));
			oamUser.setLoginId(_ctx.stringValue("ListUsersForGroupResponse.Data["+ i +"].LoginId"));
			oamUser.setCustomUserId(_ctx.stringValue("ListUsersForGroupResponse.Data["+ i +"].CustomUserId"));
			oamUser.setGmtModified(_ctx.stringValue("ListUsersForGroupResponse.Data["+ i +"].GmtModified"));

			data.add(oamUser);
		}
		listUsersForGroupResponse.setData(data);
	 
	 	return listUsersForGroupResponse;
	}
}