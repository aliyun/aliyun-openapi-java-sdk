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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.ListRolesResponse;
import com.aliyuncs.emr.model.v20160408.ListRolesResponse.RoleDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRolesResponseUnmarshaller {

	public static ListRolesResponse unmarshall(ListRolesResponse listRolesResponse, UnmarshallerContext _ctx) {
		
		listRolesResponse.setRequestId(_ctx.stringValue("ListRolesResponse.RequestId"));
		listRolesResponse.setPaging(_ctx.booleanValue("ListRolesResponse.Paging"));

		List<RoleDTO> data = new ArrayList<RoleDTO>();
		for (int i = 0; i < _ctx.lengthValue("ListRolesResponse.Data.Length"); i++) {
			RoleDTO roleDTO = new RoleDTO();
			roleDTO.setId(_ctx.longValue("ListRolesResponse.Data["+ i +"].Id"));
			roleDTO.setName(_ctx.stringValue("ListRolesResponse.Data["+ i +"].Name"));
			roleDTO.setResourceType(_ctx.stringValue("ListRolesResponse.Data["+ i +"].ResourceType"));
			roleDTO.setGmtCreate(_ctx.stringValue("ListRolesResponse.Data["+ i +"].GmtCreate"));
			roleDTO.setGmtModified(_ctx.stringValue("ListRolesResponse.Data["+ i +"].GmtModified"));
			roleDTO.setDescription(_ctx.stringValue("ListRolesResponse.Data["+ i +"].Description"));

			data.add(roleDTO);
		}
		listRolesResponse.setData(data);
	 
	 	return listRolesResponse;
	}
}