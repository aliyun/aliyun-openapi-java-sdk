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

import com.aliyuncs.oam.model.v20170101.ListBaseRolesByRoleResponse;
import com.aliyuncs.oam.model.v20170101.ListBaseRolesByRoleResponse.OamRole;
import com.aliyuncs.oam.model.v20170101.ListBaseRolesByRoleResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListBaseRolesByRoleResponseUnmarshaller {

	public static ListBaseRolesByRoleResponse unmarshall(ListBaseRolesByRoleResponse listBaseRolesByRoleResponse, UnmarshallerContext _ctx) {
		
		listBaseRolesByRoleResponse.setCode(_ctx.stringValue("ListBaseRolesByRoleResponse.Code"));
		listBaseRolesByRoleResponse.setMessage(_ctx.stringValue("ListBaseRolesByRoleResponse.Message"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("ListBaseRolesByRoleResponse.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("ListBaseRolesByRoleResponse.PageInfo.PageSize"));
		pageInfo.setTotal(_ctx.integerValue("ListBaseRolesByRoleResponse.PageInfo.Total"));
		pageInfo.setTotalPage(_ctx.integerValue("ListBaseRolesByRoleResponse.PageInfo.TotalPage"));
		pageInfo.setNextPageToken(_ctx.stringValue("ListBaseRolesByRoleResponse.PageInfo.NextPageToken"));
		listBaseRolesByRoleResponse.setPageInfo(pageInfo);

		List<OamRole> data = new ArrayList<OamRole>();
		for (int i = 0; i < _ctx.lengthValue("ListBaseRolesByRoleResponse.Data.Length"); i++) {
			OamRole oamRole = new OamRole();
			oamRole.setBid(_ctx.stringValue("ListBaseRolesByRoleResponse.Data["+ i +"].Bid"));
			oamRole.setRoleId(_ctx.stringValue("ListBaseRolesByRoleResponse.Data["+ i +"].RoleId"));
			oamRole.setRoleName(_ctx.stringValue("ListBaseRolesByRoleResponse.Data["+ i +"].RoleName"));
			oamRole.setRoleType(_ctx.stringValue("ListBaseRolesByRoleResponse.Data["+ i +"].RoleType"));
			oamRole.setGmtModified(_ctx.stringValue("ListBaseRolesByRoleResponse.Data["+ i +"].GmtModified"));
			oamRole.setOwner(_ctx.stringValue("ListBaseRolesByRoleResponse.Data["+ i +"].Owner"));
			oamRole.setOwnerName(_ctx.stringValue("ListBaseRolesByRoleResponse.Data["+ i +"].OwnerName"));
			oamRole.setOwnerType(_ctx.stringValue("ListBaseRolesByRoleResponse.Data["+ i +"].OwnerType"));
			oamRole.setDescription(_ctx.stringValue("ListBaseRolesByRoleResponse.Data["+ i +"].Description"));

			data.add(oamRole);
		}
		listBaseRolesByRoleResponse.setData(data);
	 
	 	return listBaseRolesByRoleResponse;
	}
}