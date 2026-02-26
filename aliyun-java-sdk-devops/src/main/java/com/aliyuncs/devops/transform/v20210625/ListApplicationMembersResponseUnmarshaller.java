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

package com.aliyuncs.devops.transform.v20210625;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.devops.model.v20210625.ListApplicationMembersResponse;
import com.aliyuncs.devops.model.v20210625.ListApplicationMembersResponse.RecordsItem;
import com.aliyuncs.devops.model.v20210625.ListApplicationMembersResponse.RecordsItem.RoleListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListApplicationMembersResponseUnmarshaller {

	public static ListApplicationMembersResponse unmarshall(ListApplicationMembersResponse listApplicationMembersResponse, UnmarshallerContext _ctx) {
		
		listApplicationMembersResponse.setTotal(_ctx.longValue("ListApplicationMembersResponse.total"));
		listApplicationMembersResponse.setCurrent(_ctx.longValue("ListApplicationMembersResponse.current"));
		listApplicationMembersResponse.setPageSize(_ctx.longValue("ListApplicationMembersResponse.pageSize"));
		listApplicationMembersResponse.setPages(_ctx.longValue("ListApplicationMembersResponse.pages"));
		listApplicationMembersResponse.setRequestId(_ctx.stringValue("ListApplicationMembersResponse.requestId"));

		List<RecordsItem> records = new ArrayList<RecordsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListApplicationMembersResponse.records.Length"); i++) {
			RecordsItem recordsItem = new RecordsItem();
			recordsItem.setId(_ctx.stringValue("ListApplicationMembersResponse.records["+ i +"].id"));
			recordsItem.setType(_ctx.stringValue("ListApplicationMembersResponse.records["+ i +"].type"));
			recordsItem.setDisplayName(_ctx.stringValue("ListApplicationMembersResponse.records["+ i +"].displayName"));
			recordsItem.setDescription(_ctx.stringValue("ListApplicationMembersResponse.records["+ i +"].description"));
			recordsItem.setAvatar(_ctx.stringValue("ListApplicationMembersResponse.records["+ i +"].avatar"));

			List<RoleListItem> roleList = new ArrayList<RoleListItem>();
			for (int j = 0; j < _ctx.lengthValue("ListApplicationMembersResponse.records["+ i +"].roleList.Length"); j++) {
				RoleListItem roleListItem = new RoleListItem();
				roleListItem.setName(_ctx.stringValue("ListApplicationMembersResponse.records["+ i +"].roleList["+ j +"].name"));
				roleListItem.setDisplayName(_ctx.stringValue("ListApplicationMembersResponse.records["+ i +"].roleList["+ j +"].displayName"));

				roleList.add(roleListItem);
			}
			recordsItem.setRoleList(roleList);

			records.add(recordsItem);
		}
		listApplicationMembersResponse.setRecords(records);
	 
	 	return listApplicationMembersResponse;
	}
}