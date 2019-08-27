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

import com.aliyuncs.emr.model.v20160408.PageListUsersResponse;
import com.aliyuncs.emr.model.v20160408.PageListUsersResponse.Item;
import com.aliyuncs.emr.model.v20160408.PageListUsersResponse.Item.AccountDTO;
import com.aliyuncs.emr.model.v20160408.PageListUsersResponse.Item.GroupDTO;
import com.aliyuncs.emr.model.v20160408.PageListUsersResponse.Item.GroupDTO.RoleDTO2;
import com.aliyuncs.emr.model.v20160408.PageListUsersResponse.Item.RoleDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class PageListUsersResponseUnmarshaller {

	public static PageListUsersResponse unmarshall(PageListUsersResponse pageListUsersResponse, UnmarshallerContext _ctx) {
		
		pageListUsersResponse.setRequestId(_ctx.stringValue("PageListUsersResponse.RequestId"));
		pageListUsersResponse.setPaging(_ctx.booleanValue("PageListUsersResponse.Paging"));
		pageListUsersResponse.setPageNumber(_ctx.integerValue("PageListUsersResponse.PageNumber"));
		pageListUsersResponse.setPageSize(_ctx.integerValue("PageListUsersResponse.PageSize"));
		pageListUsersResponse.setTotalCount(_ctx.integerValue("PageListUsersResponse.TotalCount"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("PageListUsersResponse.Items.Length"); i++) {
			Item item = new Item();
			item.setAliyunUserId(_ctx.stringValue("PageListUsersResponse.Items["+ i +"].AliyunUserId"));
			item.setUserName(_ctx.stringValue("PageListUsersResponse.Items["+ i +"].UserName"));
			item.setUserType(_ctx.stringValue("PageListUsersResponse.Items["+ i +"].UserType"));
			item.setStatus(_ctx.stringValue("PageListUsersResponse.Items["+ i +"].Status"));
			item.setIsSuperAdmin(_ctx.stringValue("PageListUsersResponse.Items["+ i +"].IsSuperAdmin"));
			item.setDescription(_ctx.stringValue("PageListUsersResponse.Items["+ i +"].Description"));
			item.setGmtCreate(_ctx.stringValue("PageListUsersResponse.Items["+ i +"].GmtCreate"));
			item.setGmtModified(_ctx.stringValue("PageListUsersResponse.Items["+ i +"].GmtModified"));

			List<RoleDTO> roleDTOList = new ArrayList<RoleDTO>();
			for (int j = 0; j < _ctx.lengthValue("PageListUsersResponse.Items["+ i +"].RoleDTOList.Length"); j++) {
				RoleDTO roleDTO = new RoleDTO();
				roleDTO.setId(_ctx.longValue("PageListUsersResponse.Items["+ i +"].RoleDTOList["+ j +"].Id"));
				roleDTO.setName(_ctx.stringValue("PageListUsersResponse.Items["+ i +"].RoleDTOList["+ j +"].Name"));
				roleDTO.setResourceType(_ctx.stringValue("PageListUsersResponse.Items["+ i +"].RoleDTOList["+ j +"].ResourceType"));
				roleDTO.setGmtCreate(_ctx.stringValue("PageListUsersResponse.Items["+ i +"].RoleDTOList["+ j +"].GmtCreate"));
				roleDTO.setGmtModified(_ctx.stringValue("PageListUsersResponse.Items["+ i +"].RoleDTOList["+ j +"].GmtModified"));
				roleDTO.setDescription(_ctx.stringValue("PageListUsersResponse.Items["+ i +"].RoleDTOList["+ j +"].Description"));

				roleDTOList.add(roleDTO);
			}
			item.setRoleDTOList(roleDTOList);

			List<GroupDTO> groupDTOList = new ArrayList<GroupDTO>();
			for (int j = 0; j < _ctx.lengthValue("PageListUsersResponse.Items["+ i +"].GroupDTOList.Length"); j++) {
				GroupDTO groupDTO = new GroupDTO();
				groupDTO.setId(_ctx.longValue("PageListUsersResponse.Items["+ i +"].GroupDTOList["+ j +"].Id"));
				groupDTO.setType(_ctx.stringValue("PageListUsersResponse.Items["+ i +"].GroupDTOList["+ j +"].Type"));
				groupDTO.setName(_ctx.stringValue("PageListUsersResponse.Items["+ i +"].GroupDTOList["+ j +"].Name"));
				groupDTO.setGmtCreate(_ctx.stringValue("PageListUsersResponse.Items["+ i +"].GroupDTOList["+ j +"].GmtCreate"));

				List<RoleDTO2> roleDTOList1 = new ArrayList<RoleDTO2>();
				for (int k = 0; k < _ctx.lengthValue("PageListUsersResponse.Items["+ i +"].GroupDTOList["+ j +"].RoleDTOList.Length"); k++) {
					RoleDTO2 roleDTO2 = new RoleDTO2();
					roleDTO2.setId(_ctx.longValue("PageListUsersResponse.Items["+ i +"].GroupDTOList["+ j +"].RoleDTOList["+ k +"].Id"));
					roleDTO2.setName(_ctx.stringValue("PageListUsersResponse.Items["+ i +"].GroupDTOList["+ j +"].RoleDTOList["+ k +"].Name"));
					roleDTO2.setResourceType(_ctx.stringValue("PageListUsersResponse.Items["+ i +"].GroupDTOList["+ j +"].RoleDTOList["+ k +"].ResourceType"));
					roleDTO2.setGmtCreate(_ctx.stringValue("PageListUsersResponse.Items["+ i +"].GroupDTOList["+ j +"].RoleDTOList["+ k +"].GmtCreate"));
					roleDTO2.setGmtModified(_ctx.stringValue("PageListUsersResponse.Items["+ i +"].GroupDTOList["+ j +"].RoleDTOList["+ k +"].GmtModified"));
					roleDTO2.setDescription(_ctx.stringValue("PageListUsersResponse.Items["+ i +"].GroupDTOList["+ j +"].RoleDTOList["+ k +"].Description"));

					roleDTOList1.add(roleDTO2);
				}
				groupDTO.setRoleDTOList1(roleDTOList1);

				groupDTOList.add(groupDTO);
			}
			item.setGroupDTOList(groupDTOList);

			List<AccountDTO> accountDTOList = new ArrayList<AccountDTO>();
			for (int j = 0; j < _ctx.lengthValue("PageListUsersResponse.Items["+ i +"].AccountDTOList.Length"); j++) {
				AccountDTO accountDTO = new AccountDTO();
				accountDTO.setAliyunUserId(_ctx.stringValue("PageListUsersResponse.Items["+ i +"].AccountDTOList["+ j +"].AliyunUserId"));
				accountDTO.setAccountType(_ctx.stringValue("PageListUsersResponse.Items["+ i +"].AccountDTOList["+ j +"].AccountType"));
				accountDTO.setAuthType(_ctx.stringValue("PageListUsersResponse.Items["+ i +"].AccountDTOList["+ j +"].AuthType"));

				accountDTOList.add(accountDTO);
			}
			item.setAccountDTOList(accountDTOList);

			items.add(item);
		}
		pageListUsersResponse.setItems(items);
	 
	 	return pageListUsersResponse;
	}
}