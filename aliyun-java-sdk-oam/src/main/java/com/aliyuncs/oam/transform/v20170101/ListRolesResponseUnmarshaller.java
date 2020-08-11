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

import com.aliyuncs.oam.model.v20170101.ListRolesResponse;
import com.aliyuncs.oam.model.v20170101.ListRolesResponse.OamRole;
import com.aliyuncs.oam.model.v20170101.ListRolesResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRolesResponseUnmarshaller {

	public static ListRolesResponse unmarshall(ListRolesResponse listRolesResponse, UnmarshallerContext _ctx) {
		
		listRolesResponse.setCode(_ctx.stringValue("ListRolesResponse.Code"));
		listRolesResponse.setMessage(_ctx.stringValue("ListRolesResponse.Message"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("ListRolesResponse.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("ListRolesResponse.PageInfo.PageSize"));
		pageInfo.setTotal(_ctx.integerValue("ListRolesResponse.PageInfo.Total"));
		pageInfo.setTotalPage(_ctx.integerValue("ListRolesResponse.PageInfo.TotalPage"));
		pageInfo.setNextPageToken(_ctx.stringValue("ListRolesResponse.PageInfo.NextPageToken"));
		listRolesResponse.setPageInfo(pageInfo);

		List<OamRole> data = new ArrayList<OamRole>();
		for (int i = 0; i < _ctx.lengthValue("ListRolesResponse.Data.Length"); i++) {
			OamRole oamRole = new OamRole();
			oamRole.setBid(_ctx.stringValue("ListRolesResponse.Data["+ i +"].Bid"));
			oamRole.setRoleId(_ctx.stringValue("ListRolesResponse.Data["+ i +"].RoleId"));
			oamRole.setRoleName(_ctx.stringValue("ListRolesResponse.Data["+ i +"].RoleName"));
			oamRole.setRoleType(_ctx.stringValue("ListRolesResponse.Data["+ i +"].RoleType"));
			oamRole.setGmtModified(_ctx.stringValue("ListRolesResponse.Data["+ i +"].GmtModified"));
			oamRole.setOwner(_ctx.stringValue("ListRolesResponse.Data["+ i +"].Owner"));
			oamRole.setOwnerName(_ctx.stringValue("ListRolesResponse.Data["+ i +"].OwnerName"));
			oamRole.setOwnerType(_ctx.stringValue("ListRolesResponse.Data["+ i +"].OwnerType"));
			oamRole.setDescription(_ctx.stringValue("ListRolesResponse.Data["+ i +"].Description"));
			oamRole.setAttribute(_ctx.stringValue("ListRolesResponse.Data["+ i +"].Attribute"));

			data.add(oamRole);
		}
		listRolesResponse.setData(data);
	 
	 	return listRolesResponse;
	}
}