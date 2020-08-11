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

import com.aliyuncs.oam.model.v20170101.ListRoleByOperatorResponse;
import com.aliyuncs.oam.model.v20170101.ListRoleByOperatorResponse.OamRole;
import com.aliyuncs.oam.model.v20170101.ListRoleByOperatorResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRoleByOperatorResponseUnmarshaller {

	public static ListRoleByOperatorResponse unmarshall(ListRoleByOperatorResponse listRoleByOperatorResponse, UnmarshallerContext _ctx) {
		
		listRoleByOperatorResponse.setCode(_ctx.stringValue("ListRoleByOperatorResponse.Code"));
		listRoleByOperatorResponse.setMessage(_ctx.stringValue("ListRoleByOperatorResponse.Message"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("ListRoleByOperatorResponse.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("ListRoleByOperatorResponse.PageInfo.PageSize"));
		pageInfo.setTotal(_ctx.integerValue("ListRoleByOperatorResponse.PageInfo.Total"));
		pageInfo.setTotalPage(_ctx.integerValue("ListRoleByOperatorResponse.PageInfo.TotalPage"));
		pageInfo.setNextPageToken(_ctx.stringValue("ListRoleByOperatorResponse.PageInfo.NextPageToken"));
		listRoleByOperatorResponse.setPageInfo(pageInfo);

		List<OamRole> data = new ArrayList<OamRole>();
		for (int i = 0; i < _ctx.lengthValue("ListRoleByOperatorResponse.Data.Length"); i++) {
			OamRole oamRole = new OamRole();
			oamRole.setBid(_ctx.stringValue("ListRoleByOperatorResponse.Data["+ i +"].Bid"));
			oamRole.setRoleId(_ctx.stringValue("ListRoleByOperatorResponse.Data["+ i +"].RoleId"));
			oamRole.setRoleName(_ctx.stringValue("ListRoleByOperatorResponse.Data["+ i +"].RoleName"));
			oamRole.setRoleType(_ctx.stringValue("ListRoleByOperatorResponse.Data["+ i +"].RoleType"));
			oamRole.setGmtModified(_ctx.stringValue("ListRoleByOperatorResponse.Data["+ i +"].GmtModified"));
			oamRole.setOwner(_ctx.stringValue("ListRoleByOperatorResponse.Data["+ i +"].Owner"));
			oamRole.setOwnerName(_ctx.stringValue("ListRoleByOperatorResponse.Data["+ i +"].OwnerName"));
			oamRole.setOwnerType(_ctx.stringValue("ListRoleByOperatorResponse.Data["+ i +"].OwnerType"));
			oamRole.setDescription(_ctx.stringValue("ListRoleByOperatorResponse.Data["+ i +"].Description"));
			oamRole.setGmtExpired(_ctx.stringValue("ListRoleByOperatorResponse.Data["+ i +"].GmtExpired"));

			data.add(oamRole);
		}
		listRoleByOperatorResponse.setData(data);
	 
	 	return listRoleByOperatorResponse;
	}
}