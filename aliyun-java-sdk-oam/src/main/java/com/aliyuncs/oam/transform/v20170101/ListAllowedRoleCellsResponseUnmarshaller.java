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

import com.aliyuncs.oam.model.v20170101.ListAllowedRoleCellsResponse;
import com.aliyuncs.oam.model.v20170101.ListAllowedRoleCellsResponse.OamRoleCell;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAllowedRoleCellsResponseUnmarshaller {

	public static ListAllowedRoleCellsResponse unmarshall(ListAllowedRoleCellsResponse listAllowedRoleCellsResponse, UnmarshallerContext _ctx) {
		
		listAllowedRoleCellsResponse.setCode(_ctx.stringValue("ListAllowedRoleCellsResponse.Code"));
		listAllowedRoleCellsResponse.setMessage(_ctx.stringValue("ListAllowedRoleCellsResponse.Message"));

		List<OamRoleCell> data = new ArrayList<OamRoleCell>();
		for (int i = 0; i < _ctx.lengthValue("ListAllowedRoleCellsResponse.Data.Length"); i++) {
			OamRoleCell oamRoleCell = new OamRoleCell();
			oamRoleCell.setResource(_ctx.stringValue("ListAllowedRoleCellsResponse.Data["+ i +"].Resource"));

			List<String> actionList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListAllowedRoleCellsResponse.Data["+ i +"].ActionList.Length"); j++) {
				actionList.add(_ctx.stringValue("ListAllowedRoleCellsResponse.Data["+ i +"].ActionList["+ j +"]"));
			}
			oamRoleCell.setActionList(actionList);

			data.add(oamRoleCell);
		}
		listAllowedRoleCellsResponse.setData(data);
	 
	 	return listAllowedRoleCellsResponse;
	}
}