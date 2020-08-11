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

import com.aliyuncs.oam.model.v20170101.SearchRoleByResourceAndActionResponse;
import com.aliyuncs.oam.model.v20170101.SearchRoleByResourceAndActionResponse.OamRole;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchRoleByResourceAndActionResponseUnmarshaller {

	public static SearchRoleByResourceAndActionResponse unmarshall(SearchRoleByResourceAndActionResponse searchRoleByResourceAndActionResponse, UnmarshallerContext _ctx) {
		
		searchRoleByResourceAndActionResponse.setCode(_ctx.stringValue("SearchRoleByResourceAndActionResponse.Code"));
		searchRoleByResourceAndActionResponse.setMessage(_ctx.stringValue("SearchRoleByResourceAndActionResponse.Message"));

		List<OamRole> data = new ArrayList<OamRole>();
		for (int i = 0; i < _ctx.lengthValue("SearchRoleByResourceAndActionResponse.Data.Length"); i++) {
			OamRole oamRole = new OamRole();
			oamRole.setBid(_ctx.stringValue("SearchRoleByResourceAndActionResponse.Data["+ i +"].Bid"));
			oamRole.setRoleId(_ctx.stringValue("SearchRoleByResourceAndActionResponse.Data["+ i +"].RoleId"));
			oamRole.setRoleName(_ctx.stringValue("SearchRoleByResourceAndActionResponse.Data["+ i +"].RoleName"));
			oamRole.setRoleType(_ctx.stringValue("SearchRoleByResourceAndActionResponse.Data["+ i +"].RoleType"));
			oamRole.setGmtModified(_ctx.stringValue("SearchRoleByResourceAndActionResponse.Data["+ i +"].GmtModified"));
			oamRole.setOwner(_ctx.stringValue("SearchRoleByResourceAndActionResponse.Data["+ i +"].Owner"));
			oamRole.setOwnerName(_ctx.stringValue("SearchRoleByResourceAndActionResponse.Data["+ i +"].OwnerName"));
			oamRole.setOwnerType(_ctx.stringValue("SearchRoleByResourceAndActionResponse.Data["+ i +"].OwnerType"));
			oamRole.setDescription(_ctx.stringValue("SearchRoleByResourceAndActionResponse.Data["+ i +"].Description"));
			oamRole.setAttribute(_ctx.stringValue("SearchRoleByResourceAndActionResponse.Data["+ i +"].Attribute"));

			data.add(oamRole);
		}
		searchRoleByResourceAndActionResponse.setData(data);
	 
	 	return searchRoleByResourceAndActionResponse;
	}
}