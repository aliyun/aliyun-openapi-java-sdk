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

import com.aliyuncs.oam.model.v20170101.ListGroupsByRoleResponse;
import com.aliyuncs.oam.model.v20170101.ListGroupsByRoleResponse.OamGroup;
import com.aliyuncs.oam.model.v20170101.ListGroupsByRoleResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListGroupsByRoleResponseUnmarshaller {

	public static ListGroupsByRoleResponse unmarshall(ListGroupsByRoleResponse listGroupsByRoleResponse, UnmarshallerContext _ctx) {
		
		listGroupsByRoleResponse.setCode(_ctx.stringValue("ListGroupsByRoleResponse.Code"));
		listGroupsByRoleResponse.setMessage(_ctx.stringValue("ListGroupsByRoleResponse.Message"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("ListGroupsByRoleResponse.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("ListGroupsByRoleResponse.PageInfo.PageSize"));
		pageInfo.setTotal(_ctx.integerValue("ListGroupsByRoleResponse.PageInfo.Total"));
		pageInfo.setTotalPage(_ctx.integerValue("ListGroupsByRoleResponse.PageInfo.TotalPage"));
		pageInfo.setNextPageToken(_ctx.stringValue("ListGroupsByRoleResponse.PageInfo.NextPageToken"));
		listGroupsByRoleResponse.setPageInfo(pageInfo);

		List<OamGroup> data = new ArrayList<OamGroup>();
		for (int i = 0; i < _ctx.lengthValue("ListGroupsByRoleResponse.Data.Length"); i++) {
			OamGroup oamGroup = new OamGroup();
			oamGroup.setGroupName(_ctx.stringValue("ListGroupsByRoleResponse.Data["+ i +"].GroupName"));
			oamGroup.setDescription(_ctx.stringValue("ListGroupsByRoleResponse.Data["+ i +"].Description"));
			oamGroup.setOwnerName(_ctx.stringValue("ListGroupsByRoleResponse.Data["+ i +"].OwnerName"));
			oamGroup.setGmtCreated(_ctx.stringValue("ListGroupsByRoleResponse.Data["+ i +"].GmtCreated"));
			oamGroup.setGmtModified(_ctx.stringValue("ListGroupsByRoleResponse.Data["+ i +"].GmtModified"));
			oamGroup.setGmtExpired(_ctx.stringValue("ListGroupsByRoleResponse.Data["+ i +"].GmtExpired"));

			data.add(oamGroup);
		}
		listGroupsByRoleResponse.setData(data);
	 
	 	return listGroupsByRoleResponse;
	}
}