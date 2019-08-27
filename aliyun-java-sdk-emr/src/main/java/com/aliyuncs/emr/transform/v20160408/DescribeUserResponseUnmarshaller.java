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

import com.aliyuncs.emr.model.v20160408.DescribeUserResponse;
import com.aliyuncs.emr.model.v20160408.DescribeUserResponse.AccountDTO;
import com.aliyuncs.emr.model.v20160408.DescribeUserResponse.GroupDTO;
import com.aliyuncs.emr.model.v20160408.DescribeUserResponse.GroupDTO.RoleDTO2;
import com.aliyuncs.emr.model.v20160408.DescribeUserResponse.RoleDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUserResponseUnmarshaller {

	public static DescribeUserResponse unmarshall(DescribeUserResponse describeUserResponse, UnmarshallerContext _ctx) {
		
		describeUserResponse.setRequestId(_ctx.stringValue("DescribeUserResponse.RequestId"));
		describeUserResponse.setPaging(_ctx.booleanValue("DescribeUserResponse.Paging"));
		describeUserResponse.setAliyunUserId(_ctx.stringValue("DescribeUserResponse.AliyunUserId"));
		describeUserResponse.setUserName(_ctx.stringValue("DescribeUserResponse.UserName"));
		describeUserResponse.setUserType(_ctx.stringValue("DescribeUserResponse.UserType"));
		describeUserResponse.setStatus(_ctx.stringValue("DescribeUserResponse.Status"));
		describeUserResponse.setIsSuperAdmin(_ctx.stringValue("DescribeUserResponse.IsSuperAdmin"));
		describeUserResponse.setDescription(_ctx.stringValue("DescribeUserResponse.Description"));
		describeUserResponse.setGmtCreate(_ctx.stringValue("DescribeUserResponse.GmtCreate"));
		describeUserResponse.setGmtModified(_ctx.stringValue("DescribeUserResponse.GmtModified"));

		List<RoleDTO> roleDTOList = new ArrayList<RoleDTO>();
		for (int i = 0; i < _ctx.lengthValue("DescribeUserResponse.RoleDTOList.Length"); i++) {
			RoleDTO roleDTO = new RoleDTO();
			roleDTO.setId(_ctx.longValue("DescribeUserResponse.RoleDTOList["+ i +"].Id"));
			roleDTO.setName(_ctx.stringValue("DescribeUserResponse.RoleDTOList["+ i +"].Name"));
			roleDTO.setResourceType(_ctx.stringValue("DescribeUserResponse.RoleDTOList["+ i +"].ResourceType"));
			roleDTO.setGmtCreate(_ctx.stringValue("DescribeUserResponse.RoleDTOList["+ i +"].GmtCreate"));
			roleDTO.setGmtModified(_ctx.stringValue("DescribeUserResponse.RoleDTOList["+ i +"].GmtModified"));
			roleDTO.setDescription(_ctx.stringValue("DescribeUserResponse.RoleDTOList["+ i +"].Description"));

			roleDTOList.add(roleDTO);
		}
		describeUserResponse.setRoleDTOList(roleDTOList);

		List<GroupDTO> groupDTOList = new ArrayList<GroupDTO>();
		for (int i = 0; i < _ctx.lengthValue("DescribeUserResponse.GroupDTOList.Length"); i++) {
			GroupDTO groupDTO = new GroupDTO();
			groupDTO.setId(_ctx.longValue("DescribeUserResponse.GroupDTOList["+ i +"].Id"));
			groupDTO.setType(_ctx.stringValue("DescribeUserResponse.GroupDTOList["+ i +"].Type"));
			groupDTO.setName(_ctx.stringValue("DescribeUserResponse.GroupDTOList["+ i +"].Name"));
			groupDTO.setGmtCreate(_ctx.stringValue("DescribeUserResponse.GroupDTOList["+ i +"].GmtCreate"));

			List<RoleDTO2> roleDTOList1 = new ArrayList<RoleDTO2>();
			for (int j = 0; j < _ctx.lengthValue("DescribeUserResponse.GroupDTOList["+ i +"].RoleDTOList.Length"); j++) {
				RoleDTO2 roleDTO2 = new RoleDTO2();
				roleDTO2.setId(_ctx.longValue("DescribeUserResponse.GroupDTOList["+ i +"].RoleDTOList["+ j +"].Id"));
				roleDTO2.setName(_ctx.stringValue("DescribeUserResponse.GroupDTOList["+ i +"].RoleDTOList["+ j +"].Name"));
				roleDTO2.setResourceType(_ctx.stringValue("DescribeUserResponse.GroupDTOList["+ i +"].RoleDTOList["+ j +"].ResourceType"));
				roleDTO2.setGmtCreate(_ctx.stringValue("DescribeUserResponse.GroupDTOList["+ i +"].RoleDTOList["+ j +"].GmtCreate"));
				roleDTO2.setGmtModified(_ctx.stringValue("DescribeUserResponse.GroupDTOList["+ i +"].RoleDTOList["+ j +"].GmtModified"));
				roleDTO2.setDescription(_ctx.stringValue("DescribeUserResponse.GroupDTOList["+ i +"].RoleDTOList["+ j +"].Description"));

				roleDTOList1.add(roleDTO2);
			}
			groupDTO.setRoleDTOList1(roleDTOList1);

			groupDTOList.add(groupDTO);
		}
		describeUserResponse.setGroupDTOList(groupDTOList);

		List<AccountDTO> accountDTOList = new ArrayList<AccountDTO>();
		for (int i = 0; i < _ctx.lengthValue("DescribeUserResponse.AccountDTOList.Length"); i++) {
			AccountDTO accountDTO = new AccountDTO();
			accountDTO.setAliyunUserId(_ctx.stringValue("DescribeUserResponse.AccountDTOList["+ i +"].AliyunUserId"));
			accountDTO.setAccountType(_ctx.stringValue("DescribeUserResponse.AccountDTOList["+ i +"].AccountType"));
			accountDTO.setAuthType(_ctx.stringValue("DescribeUserResponse.AccountDTOList["+ i +"].AuthType"));

			accountDTOList.add(accountDTO);
		}
		describeUserResponse.setAccountDTOList(accountDTOList);
	 
	 	return describeUserResponse;
	}
}