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

import com.aliyuncs.emr.model.v20160408.PageListResourceUsersResponse;
import com.aliyuncs.emr.model.v20160408.PageListResourceUsersResponse.Item;
import com.aliyuncs.emr.model.v20160408.PageListResourceUsersResponse.Item.RoleDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class PageListResourceUsersResponseUnmarshaller {

	public static PageListResourceUsersResponse unmarshall(PageListResourceUsersResponse pageListResourceUsersResponse, UnmarshallerContext _ctx) {
		
		pageListResourceUsersResponse.setRequestId(_ctx.stringValue("PageListResourceUsersResponse.RequestId"));
		pageListResourceUsersResponse.setPaging(_ctx.booleanValue("PageListResourceUsersResponse.Paging"));
		pageListResourceUsersResponse.setPageNumber(_ctx.integerValue("PageListResourceUsersResponse.PageNumber"));
		pageListResourceUsersResponse.setPageSize(_ctx.integerValue("PageListResourceUsersResponse.PageSize"));
		pageListResourceUsersResponse.setTotalCount(_ctx.integerValue("PageListResourceUsersResponse.TotalCount"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("PageListResourceUsersResponse.Items.Length"); i++) {
			Item item = new Item();
			item.setAliyunUserId(_ctx.stringValue("PageListResourceUsersResponse.Items["+ i +"].AliyunUserId"));
			item.setUserName(_ctx.stringValue("PageListResourceUsersResponse.Items["+ i +"].UserName"));
			item.setStatus(_ctx.stringValue("PageListResourceUsersResponse.Items["+ i +"].Status"));
			item.setGmtCreate(_ctx.longValue("PageListResourceUsersResponse.Items["+ i +"].GmtCreate"));
			item.setKnoxSyncStatus(_ctx.stringValue("PageListResourceUsersResponse.Items["+ i +"].KnoxSyncStatus"));
			item.setLinuxSyncStatus(_ctx.stringValue("PageListResourceUsersResponse.Items["+ i +"].LinuxSyncStatus"));
			item.setKerberosStutus(_ctx.stringValue("PageListResourceUsersResponse.Items["+ i +"].KerberosStutus"));
			item.setSourceType(_ctx.stringValue("PageListResourceUsersResponse.Items["+ i +"].SourceType"));

			List<RoleDTO> roleDTOList = new ArrayList<RoleDTO>();
			for (int j = 0; j < _ctx.lengthValue("PageListResourceUsersResponse.Items["+ i +"].RoleDTOList.Length"); j++) {
				RoleDTO roleDTO = new RoleDTO();
				roleDTO.setId(_ctx.longValue("PageListResourceUsersResponse.Items["+ i +"].RoleDTOList["+ j +"].Id"));
				roleDTO.setName(_ctx.stringValue("PageListResourceUsersResponse.Items["+ i +"].RoleDTOList["+ j +"].Name"));
				roleDTO.setResourceType(_ctx.stringValue("PageListResourceUsersResponse.Items["+ i +"].RoleDTOList["+ j +"].ResourceType"));
				roleDTO.setGmtCreate(_ctx.stringValue("PageListResourceUsersResponse.Items["+ i +"].RoleDTOList["+ j +"].GmtCreate"));
				roleDTO.setGmtModified(_ctx.stringValue("PageListResourceUsersResponse.Items["+ i +"].RoleDTOList["+ j +"].GmtModified"));
				roleDTO.setDescription(_ctx.stringValue("PageListResourceUsersResponse.Items["+ i +"].RoleDTOList["+ j +"].Description"));

				roleDTOList.add(roleDTO);
			}
			item.setRoleDTOList(roleDTOList);

			items.add(item);
		}
		pageListResourceUsersResponse.setItems(items);
	 
	 	return pageListResourceUsersResponse;
	}
}