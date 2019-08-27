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

import com.aliyuncs.emr.model.v20160408.ListUserGroupsResponse;
import com.aliyuncs.emr.model.v20160408.ListUserGroupsResponse.GroupDTO;
import com.aliyuncs.emr.model.v20160408.ListUserGroupsResponse.GroupDTO.RoleDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUserGroupsResponseUnmarshaller {

	public static ListUserGroupsResponse unmarshall(ListUserGroupsResponse listUserGroupsResponse, UnmarshallerContext _ctx) {
		
		listUserGroupsResponse.setRequestId(_ctx.stringValue("ListUserGroupsResponse.RequestId"));
		listUserGroupsResponse.setPaging(_ctx.booleanValue("ListUserGroupsResponse.Paging"));

		List<GroupDTO> data = new ArrayList<GroupDTO>();
		for (int i = 0; i < _ctx.lengthValue("ListUserGroupsResponse.Data.Length"); i++) {
			GroupDTO groupDTO = new GroupDTO();
			groupDTO.setId(_ctx.longValue("ListUserGroupsResponse.Data["+ i +"].Id"));
			groupDTO.setType(_ctx.stringValue("ListUserGroupsResponse.Data["+ i +"].Type"));
			groupDTO.setName(_ctx.stringValue("ListUserGroupsResponse.Data["+ i +"].Name"));
			groupDTO.setGmtCreate(_ctx.stringValue("ListUserGroupsResponse.Data["+ i +"].GmtCreate"));

			List<RoleDTO> roleDTOList = new ArrayList<RoleDTO>();
			for (int j = 0; j < _ctx.lengthValue("ListUserGroupsResponse.Data["+ i +"].RoleDTOList.Length"); j++) {
				RoleDTO roleDTO = new RoleDTO();
				roleDTO.setId(_ctx.longValue("ListUserGroupsResponse.Data["+ i +"].RoleDTOList["+ j +"].Id"));
				roleDTO.setName(_ctx.stringValue("ListUserGroupsResponse.Data["+ i +"].RoleDTOList["+ j +"].Name"));
				roleDTO.setResourceType(_ctx.stringValue("ListUserGroupsResponse.Data["+ i +"].RoleDTOList["+ j +"].ResourceType"));
				roleDTO.setGmtCreate(_ctx.stringValue("ListUserGroupsResponse.Data["+ i +"].RoleDTOList["+ j +"].GmtCreate"));
				roleDTO.setGmtModified(_ctx.stringValue("ListUserGroupsResponse.Data["+ i +"].RoleDTOList["+ j +"].GmtModified"));
				roleDTO.setDescription(_ctx.stringValue("ListUserGroupsResponse.Data["+ i +"].RoleDTOList["+ j +"].Description"));

				roleDTOList.add(roleDTO);
			}
			groupDTO.setRoleDTOList(roleDTOList);

			data.add(groupDTO);
		}
		listUserGroupsResponse.setData(data);
	 
	 	return listUserGroupsResponse;
	}
}