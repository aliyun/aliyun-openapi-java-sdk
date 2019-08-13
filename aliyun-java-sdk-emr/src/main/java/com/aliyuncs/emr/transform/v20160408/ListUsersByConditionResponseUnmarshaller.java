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

import com.aliyuncs.emr.model.v20160408.ListUsersByConditionResponse;
import com.aliyuncs.emr.model.v20160408.ListUsersByConditionResponse.UserDTO;
import com.aliyuncs.emr.model.v20160408.ListUsersByConditionResponse.UserDTO.AccountDTO;
import com.aliyuncs.emr.model.v20160408.ListUsersByConditionResponse.UserDTO.GroupDTO;
import com.aliyuncs.emr.model.v20160408.ListUsersByConditionResponse.UserDTO.GroupDTO.RoleDTO2;
import com.aliyuncs.emr.model.v20160408.ListUsersByConditionResponse.UserDTO.RoleDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUsersByConditionResponseUnmarshaller {

	public static ListUsersByConditionResponse unmarshall(ListUsersByConditionResponse listUsersByConditionResponse, UnmarshallerContext _ctx) {
		
		listUsersByConditionResponse.setRequestId(_ctx.stringValue("ListUsersByConditionResponse.RequestId"));
		listUsersByConditionResponse.setPaging(_ctx.booleanValue("ListUsersByConditionResponse.Paging"));

		List<UserDTO> data = new ArrayList<UserDTO>();
		for (int i = 0; i < _ctx.lengthValue("ListUsersByConditionResponse.Data.Length"); i++) {
			UserDTO userDTO = new UserDTO();
			userDTO.setAliyunUserId(_ctx.stringValue("ListUsersByConditionResponse.Data["+ i +"].AliyunUserId"));
			userDTO.setUserName(_ctx.stringValue("ListUsersByConditionResponse.Data["+ i +"].UserName"));
			userDTO.setUserType(_ctx.stringValue("ListUsersByConditionResponse.Data["+ i +"].UserType"));
			userDTO.setStatus(_ctx.stringValue("ListUsersByConditionResponse.Data["+ i +"].Status"));
			userDTO.setIsSuperAdmin(_ctx.stringValue("ListUsersByConditionResponse.Data["+ i +"].IsSuperAdmin"));
			userDTO.setDescription(_ctx.stringValue("ListUsersByConditionResponse.Data["+ i +"].Description"));
			userDTO.setGmtCreate(_ctx.stringValue("ListUsersByConditionResponse.Data["+ i +"].GmtCreate"));
			userDTO.setGmtModified(_ctx.stringValue("ListUsersByConditionResponse.Data["+ i +"].GmtModified"));

			List<RoleDTO> roleDTOList = new ArrayList<RoleDTO>();
			for (int j = 0; j < _ctx.lengthValue("ListUsersByConditionResponse.Data["+ i +"].RoleDTOList.Length"); j++) {
				RoleDTO roleDTO = new RoleDTO();
				roleDTO.setId(_ctx.longValue("ListUsersByConditionResponse.Data["+ i +"].RoleDTOList["+ j +"].Id"));
				roleDTO.setName(_ctx.stringValue("ListUsersByConditionResponse.Data["+ i +"].RoleDTOList["+ j +"].Name"));
				roleDTO.setResourceType(_ctx.stringValue("ListUsersByConditionResponse.Data["+ i +"].RoleDTOList["+ j +"].ResourceType"));
				roleDTO.setGmtCreate(_ctx.stringValue("ListUsersByConditionResponse.Data["+ i +"].RoleDTOList["+ j +"].GmtCreate"));
				roleDTO.setGmtModified(_ctx.stringValue("ListUsersByConditionResponse.Data["+ i +"].RoleDTOList["+ j +"].GmtModified"));
				roleDTO.setDescription(_ctx.stringValue("ListUsersByConditionResponse.Data["+ i +"].RoleDTOList["+ j +"].Description"));

				roleDTOList.add(roleDTO);
			}
			userDTO.setRoleDTOList(roleDTOList);

			List<GroupDTO> groupDTOList = new ArrayList<GroupDTO>();
			for (int j = 0; j < _ctx.lengthValue("ListUsersByConditionResponse.Data["+ i +"].GroupDTOList.Length"); j++) {
				GroupDTO groupDTO = new GroupDTO();
				groupDTO.setId(_ctx.longValue("ListUsersByConditionResponse.Data["+ i +"].GroupDTOList["+ j +"].Id"));
				groupDTO.setType(_ctx.stringValue("ListUsersByConditionResponse.Data["+ i +"].GroupDTOList["+ j +"].Type"));
				groupDTO.setName(_ctx.stringValue("ListUsersByConditionResponse.Data["+ i +"].GroupDTOList["+ j +"].Name"));
				groupDTO.setGmtCreate(_ctx.stringValue("ListUsersByConditionResponse.Data["+ i +"].GroupDTOList["+ j +"].GmtCreate"));

				List<RoleDTO2> roleDTOList1 = new ArrayList<RoleDTO2>();
				for (int k = 0; k < _ctx.lengthValue("ListUsersByConditionResponse.Data["+ i +"].GroupDTOList["+ j +"].RoleDTOList.Length"); k++) {
					RoleDTO2 roleDTO2 = new RoleDTO2();
					roleDTO2.setId(_ctx.longValue("ListUsersByConditionResponse.Data["+ i +"].GroupDTOList["+ j +"].RoleDTOList["+ k +"].Id"));
					roleDTO2.setName(_ctx.stringValue("ListUsersByConditionResponse.Data["+ i +"].GroupDTOList["+ j +"].RoleDTOList["+ k +"].Name"));
					roleDTO2.setResourceType(_ctx.stringValue("ListUsersByConditionResponse.Data["+ i +"].GroupDTOList["+ j +"].RoleDTOList["+ k +"].ResourceType"));
					roleDTO2.setGmtCreate(_ctx.stringValue("ListUsersByConditionResponse.Data["+ i +"].GroupDTOList["+ j +"].RoleDTOList["+ k +"].GmtCreate"));
					roleDTO2.setGmtModified(_ctx.stringValue("ListUsersByConditionResponse.Data["+ i +"].GroupDTOList["+ j +"].RoleDTOList["+ k +"].GmtModified"));
					roleDTO2.setDescription(_ctx.stringValue("ListUsersByConditionResponse.Data["+ i +"].GroupDTOList["+ j +"].RoleDTOList["+ k +"].Description"));

					roleDTOList1.add(roleDTO2);
				}
				groupDTO.setRoleDTOList1(roleDTOList1);

				groupDTOList.add(groupDTO);
			}
			userDTO.setGroupDTOList(groupDTOList);

			List<AccountDTO> accountDTOList = new ArrayList<AccountDTO>();
			for (int j = 0; j < _ctx.lengthValue("ListUsersByConditionResponse.Data["+ i +"].AccountDTOList.Length"); j++) {
				AccountDTO accountDTO = new AccountDTO();
				accountDTO.setAliyunUserId(_ctx.stringValue("ListUsersByConditionResponse.Data["+ i +"].AccountDTOList["+ j +"].AliyunUserId"));
				accountDTO.setAccountType(_ctx.stringValue("ListUsersByConditionResponse.Data["+ i +"].AccountDTOList["+ j +"].AccountType"));
				accountDTO.setAuthType(_ctx.stringValue("ListUsersByConditionResponse.Data["+ i +"].AccountDTOList["+ j +"].AuthType"));

				accountDTOList.add(accountDTO);
			}
			userDTO.setAccountDTOList(accountDTOList);

			data.add(userDTO);
		}
		listUsersByConditionResponse.setData(data);
	 
	 	return listUsersByConditionResponse;
	}
}