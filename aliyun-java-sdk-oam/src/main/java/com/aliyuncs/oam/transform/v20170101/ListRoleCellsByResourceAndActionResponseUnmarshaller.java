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

import com.aliyuncs.oam.model.v20170101.ListRoleCellsByResourceAndActionResponse;
import com.aliyuncs.oam.model.v20170101.ListRoleCellsByResourceAndActionResponse.OamRoleCell;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRoleCellsByResourceAndActionResponseUnmarshaller {

	public static ListRoleCellsByResourceAndActionResponse unmarshall(ListRoleCellsByResourceAndActionResponse listRoleCellsByResourceAndActionResponse, UnmarshallerContext _ctx) {
		
		listRoleCellsByResourceAndActionResponse.setCode(_ctx.stringValue("ListRoleCellsByResourceAndActionResponse.Code"));
		listRoleCellsByResourceAndActionResponse.setMessage(_ctx.stringValue("ListRoleCellsByResourceAndActionResponse.Message"));

		List<OamRoleCell> data = new ArrayList<OamRoleCell>();
		for (int i = 0; i < _ctx.lengthValue("ListRoleCellsByResourceAndActionResponse.Data.Length"); i++) {
			OamRoleCell oamRoleCell = new OamRoleCell();
			oamRoleCell.setRoleName(_ctx.stringValue("ListRoleCellsByResourceAndActionResponse.Data["+ i +"].RoleName"));
			oamRoleCell.setAttribute(_ctx.stringValue("ListRoleCellsByResourceAndActionResponse.Data["+ i +"].Attribute"));
			oamRoleCell.setResource(_ctx.stringValue("ListRoleCellsByResourceAndActionResponse.Data["+ i +"].Resource"));
			oamRoleCell.setRoleCellId(_ctx.stringValue("ListRoleCellsByResourceAndActionResponse.Data["+ i +"].RoleCellId"));
			oamRoleCell.setGrantOption(_ctx.stringValue("ListRoleCellsByResourceAndActionResponse.Data["+ i +"].GrantOption"));
			oamRoleCell.setDescription(_ctx.stringValue("ListRoleCellsByResourceAndActionResponse.Data["+ i +"].Description"));
			oamRoleCell.setGmtModified(_ctx.stringValue("ListRoleCellsByResourceAndActionResponse.Data["+ i +"].GmtModified"));

			List<String> actionList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListRoleCellsByResourceAndActionResponse.Data["+ i +"].ActionList.Length"); j++) {
				actionList.add(_ctx.stringValue("ListRoleCellsByResourceAndActionResponse.Data["+ i +"].ActionList["+ j +"]"));
			}
			oamRoleCell.setActionList(actionList);

			data.add(oamRoleCell);
		}
		listRoleCellsByResourceAndActionResponse.setData(data);
	 
	 	return listRoleCellsByResourceAndActionResponse;
	}
}