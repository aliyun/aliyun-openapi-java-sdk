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

import com.aliyuncs.emr.model.v20160408.PageListUserGroupsResponse;
import com.aliyuncs.emr.model.v20160408.PageListUserGroupsResponse.Item;
import com.aliyuncs.emr.model.v20160408.PageListUserGroupsResponse.Item.RoleDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class PageListUserGroupsResponseUnmarshaller {

	public static PageListUserGroupsResponse unmarshall(PageListUserGroupsResponse pageListUserGroupsResponse, UnmarshallerContext _ctx) {
		
		pageListUserGroupsResponse.setRequestId(_ctx.stringValue("PageListUserGroupsResponse.RequestId"));
		pageListUserGroupsResponse.setPaging(_ctx.booleanValue("PageListUserGroupsResponse.Paging"));
		pageListUserGroupsResponse.setPageNumber(_ctx.integerValue("PageListUserGroupsResponse.PageNumber"));
		pageListUserGroupsResponse.setPageSize(_ctx.integerValue("PageListUserGroupsResponse.PageSize"));
		pageListUserGroupsResponse.setTotalCount(_ctx.integerValue("PageListUserGroupsResponse.TotalCount"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("PageListUserGroupsResponse.Items.Length"); i++) {
			Item item = new Item();
			item.setId(_ctx.longValue("PageListUserGroupsResponse.Items["+ i +"].Id"));
			item.setType(_ctx.stringValue("PageListUserGroupsResponse.Items["+ i +"].Type"));
			item.setName(_ctx.stringValue("PageListUserGroupsResponse.Items["+ i +"].Name"));
			item.setGmtCreate(_ctx.stringValue("PageListUserGroupsResponse.Items["+ i +"].GmtCreate"));

			List<RoleDTO> roleDTOList = new ArrayList<RoleDTO>();
			for (int j = 0; j < _ctx.lengthValue("PageListUserGroupsResponse.Items["+ i +"].RoleDTOList.Length"); j++) {
				RoleDTO roleDTO = new RoleDTO();
				roleDTO.setId(_ctx.longValue("PageListUserGroupsResponse.Items["+ i +"].RoleDTOList["+ j +"].Id"));
				roleDTO.setName(_ctx.stringValue("PageListUserGroupsResponse.Items["+ i +"].RoleDTOList["+ j +"].Name"));
				roleDTO.setResourceType(_ctx.stringValue("PageListUserGroupsResponse.Items["+ i +"].RoleDTOList["+ j +"].ResourceType"));
				roleDTO.setGmtCreate(_ctx.stringValue("PageListUserGroupsResponse.Items["+ i +"].RoleDTOList["+ j +"].GmtCreate"));
				roleDTO.setGmtModified(_ctx.stringValue("PageListUserGroupsResponse.Items["+ i +"].RoleDTOList["+ j +"].GmtModified"));
				roleDTO.setDescription(_ctx.stringValue("PageListUserGroupsResponse.Items["+ i +"].RoleDTOList["+ j +"].Description"));

				roleDTOList.add(roleDTO);
			}
			item.setRoleDTOList(roleDTOList);

			items.add(item);
		}
		pageListUserGroupsResponse.setItems(items);
	 
	 	return pageListUserGroupsResponse;
	}
}