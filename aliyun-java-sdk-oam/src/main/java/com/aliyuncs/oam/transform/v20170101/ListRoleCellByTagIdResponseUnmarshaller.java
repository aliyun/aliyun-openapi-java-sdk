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

import com.aliyuncs.oam.model.v20170101.ListRoleCellByTagIdResponse;
import com.aliyuncs.oam.model.v20170101.ListRoleCellByTagIdResponse.OamMutexTagMiddleResult;
import com.aliyuncs.oam.model.v20170101.ListRoleCellByTagIdResponse.OamMutexTagMiddleResult.RoleCell;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRoleCellByTagIdResponseUnmarshaller {

	public static ListRoleCellByTagIdResponse unmarshall(ListRoleCellByTagIdResponse listRoleCellByTagIdResponse, UnmarshallerContext _ctx) {
		
		listRoleCellByTagIdResponse.setRequestId(_ctx.stringValue("ListRoleCellByTagIdResponse.RequestId"));
		listRoleCellByTagIdResponse.setCode(_ctx.stringValue("ListRoleCellByTagIdResponse.Code"));
		listRoleCellByTagIdResponse.setMessage(_ctx.stringValue("ListRoleCellByTagIdResponse.Message"));

		List<OamMutexTagMiddleResult> data = new ArrayList<OamMutexTagMiddleResult>();
		for (int i = 0; i < _ctx.lengthValue("ListRoleCellByTagIdResponse.Data.Length"); i++) {
			OamMutexTagMiddleResult oamMutexTagMiddleResult = new OamMutexTagMiddleResult();
			oamMutexTagMiddleResult.setRoleCellId(_ctx.stringValue("ListRoleCellByTagIdResponse.Data["+ i +"].RoleCellId"));
			oamMutexTagMiddleResult.setType(_ctx.stringValue("ListRoleCellByTagIdResponse.Data["+ i +"].Type"));

			RoleCell roleCell = new RoleCell();
			roleCell.setRoleName(_ctx.stringValue("ListRoleCellByTagIdResponse.Data["+ i +"].RoleCell.RoleName"));
			roleCell.setAttribute(_ctx.stringValue("ListRoleCellByTagIdResponse.Data["+ i +"].RoleCell.Attribute"));
			roleCell.setRoleId(_ctx.stringValue("ListRoleCellByTagIdResponse.Data["+ i +"].RoleCell.RoleId"));
			roleCell.setRoleCellId(_ctx.stringValue("ListRoleCellByTagIdResponse.Data["+ i +"].RoleCell.RoleCellId"));
			roleCell.setDescription(_ctx.stringValue("ListRoleCellByTagIdResponse.Data["+ i +"].RoleCell.Description"));
			roleCell.setGmtModified(_ctx.stringValue("ListRoleCellByTagIdResponse.Data["+ i +"].RoleCell.GmtModified"));
			roleCell.setGrantOption(_ctx.stringValue("ListRoleCellByTagIdResponse.Data["+ i +"].RoleCell.GrantOption"));

			List<String> actionList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListRoleCellByTagIdResponse.Data["+ i +"].RoleCell.ActionList.Length"); j++) {
				actionList.add(_ctx.stringValue("ListRoleCellByTagIdResponse.Data["+ i +"].RoleCell.ActionList["+ j +"]"));
			}
			roleCell.setActionList(actionList);
			oamMutexTagMiddleResult.setRoleCell(roleCell);

			data.add(oamMutexTagMiddleResult);
		}
		listRoleCellByTagIdResponse.setData(data);
	 
	 	return listRoleCellByTagIdResponse;
	}
}