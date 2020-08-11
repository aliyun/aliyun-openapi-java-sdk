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

import com.aliyuncs.oam.model.v20170101.ListRoleCellsByRoleNameResponse;
import com.aliyuncs.oam.model.v20170101.ListRoleCellsByRoleNameResponse.OamRoleCell;
import com.aliyuncs.oam.model.v20170101.ListRoleCellsByRoleNameResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRoleCellsByRoleNameResponseUnmarshaller {

	public static ListRoleCellsByRoleNameResponse unmarshall(ListRoleCellsByRoleNameResponse listRoleCellsByRoleNameResponse, UnmarshallerContext _ctx) {
		
		listRoleCellsByRoleNameResponse.setCode(_ctx.stringValue("ListRoleCellsByRoleNameResponse.Code"));
		listRoleCellsByRoleNameResponse.setMessage(_ctx.stringValue("ListRoleCellsByRoleNameResponse.Message"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("ListRoleCellsByRoleNameResponse.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("ListRoleCellsByRoleNameResponse.PageInfo.PageSize"));
		pageInfo.setTotal(_ctx.integerValue("ListRoleCellsByRoleNameResponse.PageInfo.Total"));
		pageInfo.setTotalPage(_ctx.integerValue("ListRoleCellsByRoleNameResponse.PageInfo.TotalPage"));
		pageInfo.setNextPageToken(_ctx.stringValue("ListRoleCellsByRoleNameResponse.PageInfo.NextPageToken"));
		listRoleCellsByRoleNameResponse.setPageInfo(pageInfo);

		List<OamRoleCell> data = new ArrayList<OamRoleCell>();
		for (int i = 0; i < _ctx.lengthValue("ListRoleCellsByRoleNameResponse.Data.Length"); i++) {
			OamRoleCell oamRoleCell = new OamRoleCell();
			oamRoleCell.setResource(_ctx.stringValue("ListRoleCellsByRoleNameResponse.Data["+ i +"].Resource"));
			oamRoleCell.setRoleCellId(_ctx.stringValue("ListRoleCellsByRoleNameResponse.Data["+ i +"].RoleCellId"));
			oamRoleCell.setGrantOption(_ctx.stringValue("ListRoleCellsByRoleNameResponse.Data["+ i +"].GrantOption"));
			oamRoleCell.setDescription(_ctx.stringValue("ListRoleCellsByRoleNameResponse.Data["+ i +"].Description"));
			oamRoleCell.setGmtModified(_ctx.stringValue("ListRoleCellsByRoleNameResponse.Data["+ i +"].GmtModified"));

			List<String> actionList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListRoleCellsByRoleNameResponse.Data["+ i +"].ActionList.Length"); j++) {
				actionList.add(_ctx.stringValue("ListRoleCellsByRoleNameResponse.Data["+ i +"].ActionList["+ j +"]"));
			}
			oamRoleCell.setActionList(actionList);

			data.add(oamRoleCell);
		}
		listRoleCellsByRoleNameResponse.setData(data);
	 
	 	return listRoleCellsByRoleNameResponse;
	}
}