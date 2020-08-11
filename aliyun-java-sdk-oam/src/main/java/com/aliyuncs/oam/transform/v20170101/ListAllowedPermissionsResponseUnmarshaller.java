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

import com.aliyuncs.oam.model.v20170101.ListAllowedPermissionsResponse;
import com.aliyuncs.oam.model.v20170101.ListAllowedPermissionsResponse.OamRoleCell;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAllowedPermissionsResponseUnmarshaller {

	public static ListAllowedPermissionsResponse unmarshall(ListAllowedPermissionsResponse listAllowedPermissionsResponse, UnmarshallerContext _ctx) {
		
		listAllowedPermissionsResponse.setCode(_ctx.stringValue("ListAllowedPermissionsResponse.Code"));
		listAllowedPermissionsResponse.setMessage(_ctx.stringValue("ListAllowedPermissionsResponse.Message"));

		List<OamRoleCell> data = new ArrayList<OamRoleCell>();
		for (int i = 0; i < _ctx.lengthValue("ListAllowedPermissionsResponse.Data.Length"); i++) {
			OamRoleCell oamRoleCell = new OamRoleCell();
			oamRoleCell.setResource(_ctx.stringValue("ListAllowedPermissionsResponse.Data["+ i +"].Resource"));

			List<String> actionList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListAllowedPermissionsResponse.Data["+ i +"].ActionList.Length"); j++) {
				actionList.add(_ctx.stringValue("ListAllowedPermissionsResponse.Data["+ i +"].ActionList["+ j +"]"));
			}
			oamRoleCell.setActionList(actionList);

			data.add(oamRoleCell);
		}
		listAllowedPermissionsResponse.setData(data);
	 
	 	return listAllowedPermissionsResponse;
	}
}