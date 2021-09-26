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

package com.aliyuncs.dataworks_public.transform.v20200518;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20200518.ListDataServiceGroupsResponse;
import com.aliyuncs.dataworks_public.model.v20200518.ListDataServiceGroupsResponse.GroupPagingResult;
import com.aliyuncs.dataworks_public.model.v20200518.ListDataServiceGroupsResponse.GroupPagingResult.Group;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDataServiceGroupsResponseUnmarshaller {

	public static ListDataServiceGroupsResponse unmarshall(ListDataServiceGroupsResponse listDataServiceGroupsResponse, UnmarshallerContext _ctx) {
		
		listDataServiceGroupsResponse.setRequestId(_ctx.stringValue("ListDataServiceGroupsResponse.RequestId"));

		GroupPagingResult groupPagingResult = new GroupPagingResult();
		groupPagingResult.setPageNumber(_ctx.integerValue("ListDataServiceGroupsResponse.GroupPagingResult.PageNumber"));
		groupPagingResult.setPageSize(_ctx.integerValue("ListDataServiceGroupsResponse.GroupPagingResult.PageSize"));
		groupPagingResult.setTotalCount(_ctx.integerValue("ListDataServiceGroupsResponse.GroupPagingResult.TotalCount"));

		List<Group> groups = new ArrayList<Group>();
		for (int i = 0; i < _ctx.lengthValue("ListDataServiceGroupsResponse.GroupPagingResult.Groups.Length"); i++) {
			Group group = new Group();
			group.setTenantId(_ctx.longValue("ListDataServiceGroupsResponse.GroupPagingResult.Groups["+ i +"].TenantId"));
			group.setGroupId(_ctx.stringValue("ListDataServiceGroupsResponse.GroupPagingResult.Groups["+ i +"].GroupId"));
			group.setApiGatewayGroupId(_ctx.stringValue("ListDataServiceGroupsResponse.GroupPagingResult.Groups["+ i +"].ApiGatewayGroupId"));
			group.setGroupName(_ctx.stringValue("ListDataServiceGroupsResponse.GroupPagingResult.Groups["+ i +"].GroupName"));
			group.setDescription(_ctx.stringValue("ListDataServiceGroupsResponse.GroupPagingResult.Groups["+ i +"].Description"));
			group.setCreatedTime(_ctx.stringValue("ListDataServiceGroupsResponse.GroupPagingResult.Groups["+ i +"].CreatedTime"));
			group.setModifiedTime(_ctx.stringValue("ListDataServiceGroupsResponse.GroupPagingResult.Groups["+ i +"].ModifiedTime"));
			group.setCreatorId(_ctx.stringValue("ListDataServiceGroupsResponse.GroupPagingResult.Groups["+ i +"].CreatorId"));
			group.setProjectId(_ctx.longValue("ListDataServiceGroupsResponse.GroupPagingResult.Groups["+ i +"].ProjectId"));

			groups.add(group);
		}
		groupPagingResult.setGroups(groups);
		listDataServiceGroupsResponse.setGroupPagingResult(groupPagingResult);
	 
	 	return listDataServiceGroupsResponse;
	}
}