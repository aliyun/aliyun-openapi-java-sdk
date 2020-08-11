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

import com.aliyuncs.oam.model.v20170101.ListRolesByOwnerResponse;
import com.aliyuncs.oam.model.v20170101.ListRolesByOwnerResponse.OamRole;
import com.aliyuncs.oam.model.v20170101.ListRolesByOwnerResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRolesByOwnerResponseUnmarshaller {

	public static ListRolesByOwnerResponse unmarshall(ListRolesByOwnerResponse listRolesByOwnerResponse, UnmarshallerContext _ctx) {
		
		listRolesByOwnerResponse.setCode(_ctx.stringValue("ListRolesByOwnerResponse.Code"));
		listRolesByOwnerResponse.setMessage(_ctx.stringValue("ListRolesByOwnerResponse.Message"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("ListRolesByOwnerResponse.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("ListRolesByOwnerResponse.PageInfo.PageSize"));
		pageInfo.setTotal(_ctx.integerValue("ListRolesByOwnerResponse.PageInfo.Total"));
		pageInfo.setTotalPage(_ctx.integerValue("ListRolesByOwnerResponse.PageInfo.TotalPage"));
		pageInfo.setNextPageToken(_ctx.stringValue("ListRolesByOwnerResponse.PageInfo.NextPageToken"));
		listRolesByOwnerResponse.setPageInfo(pageInfo);

		List<OamRole> data = new ArrayList<OamRole>();
		for (int i = 0; i < _ctx.lengthValue("ListRolesByOwnerResponse.Data.Length"); i++) {
			OamRole oamRole = new OamRole();
			oamRole.setBid(_ctx.stringValue("ListRolesByOwnerResponse.Data["+ i +"].Bid"));
			oamRole.setRoleId(_ctx.stringValue("ListRolesByOwnerResponse.Data["+ i +"].RoleId"));
			oamRole.setRoleName(_ctx.stringValue("ListRolesByOwnerResponse.Data["+ i +"].RoleName"));
			oamRole.setRoleType(_ctx.stringValue("ListRolesByOwnerResponse.Data["+ i +"].RoleType"));
			oamRole.setGmtModified(_ctx.stringValue("ListRolesByOwnerResponse.Data["+ i +"].GmtModified"));
			oamRole.setOwner(_ctx.stringValue("ListRolesByOwnerResponse.Data["+ i +"].Owner"));
			oamRole.setOwnerName(_ctx.stringValue("ListRolesByOwnerResponse.Data["+ i +"].OwnerName"));
			oamRole.setOwnerType(_ctx.stringValue("ListRolesByOwnerResponse.Data["+ i +"].OwnerType"));
			oamRole.setDescription(_ctx.stringValue("ListRolesByOwnerResponse.Data["+ i +"].Description"));
			oamRole.setAttribute(_ctx.stringValue("ListRolesByOwnerResponse.Data["+ i +"].Attribute"));

			data.add(oamRole);
		}
		listRolesByOwnerResponse.setData(data);
	 
	 	return listRolesByOwnerResponse;
	}
}