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

import com.aliyuncs.oam.model.v20170101.ListOperatorByRoleResponse;
import com.aliyuncs.oam.model.v20170101.ListOperatorByRoleResponse.OamUser;
import com.aliyuncs.oam.model.v20170101.ListOperatorByRoleResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListOperatorByRoleResponseUnmarshaller {

	public static ListOperatorByRoleResponse unmarshall(ListOperatorByRoleResponse listOperatorByRoleResponse, UnmarshallerContext _ctx) {
		
		listOperatorByRoleResponse.setCode(_ctx.stringValue("ListOperatorByRoleResponse.Code"));
		listOperatorByRoleResponse.setMessage(_ctx.stringValue("ListOperatorByRoleResponse.Message"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("ListOperatorByRoleResponse.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("ListOperatorByRoleResponse.PageInfo.PageSize"));
		pageInfo.setTotal(_ctx.integerValue("ListOperatorByRoleResponse.PageInfo.Total"));
		pageInfo.setTotalPage(_ctx.integerValue("ListOperatorByRoleResponse.PageInfo.TotalPage"));
		pageInfo.setNextPageToken(_ctx.stringValue("ListOperatorByRoleResponse.PageInfo.NextPageToken"));
		listOperatorByRoleResponse.setPageInfo(pageInfo);

		List<OamUser> data = new ArrayList<OamUser>();
		for (int i = 0; i < _ctx.lengthValue("ListOperatorByRoleResponse.Data.Length"); i++) {
			OamUser oamUser = new OamUser();
			oamUser.setUid(_ctx.longValue("ListOperatorByRoleResponse.Data["+ i +"].Uid"));
			oamUser.setLoginId(_ctx.stringValue("ListOperatorByRoleResponse.Data["+ i +"].LoginId"));
			oamUser.setCustomUserId(_ctx.stringValue("ListOperatorByRoleResponse.Data["+ i +"].CustomUserId"));
			oamUser.setGmtModified(_ctx.stringValue("ListOperatorByRoleResponse.Data["+ i +"].GmtModified"));
			oamUser.setGmtExpired(_ctx.stringValue("ListOperatorByRoleResponse.Data["+ i +"].GmtExpired"));

			data.add(oamUser);
		}
		listOperatorByRoleResponse.setData(data);
	 
	 	return listOperatorByRoleResponse;
	}
}