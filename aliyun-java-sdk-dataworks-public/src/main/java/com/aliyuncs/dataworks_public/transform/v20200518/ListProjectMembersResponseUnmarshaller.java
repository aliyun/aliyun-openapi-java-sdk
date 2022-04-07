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

import com.aliyuncs.dataworks_public.model.v20200518.ListProjectMembersResponse;
import com.aliyuncs.dataworks_public.model.v20200518.ListProjectMembersResponse.Data;
import com.aliyuncs.dataworks_public.model.v20200518.ListProjectMembersResponse.Data.ProjectMember;
import com.aliyuncs.dataworks_public.model.v20200518.ListProjectMembersResponse.Data.ProjectMember.Role;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListProjectMembersResponseUnmarshaller {

	public static ListProjectMembersResponse unmarshall(ListProjectMembersResponse listProjectMembersResponse, UnmarshallerContext _ctx) {
		
		listProjectMembersResponse.setRequestId(_ctx.stringValue("ListProjectMembersResponse.RequestId"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListProjectMembersResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListProjectMembersResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListProjectMembersResponse.Data.TotalCount"));

		List<ProjectMember> projectMemberList = new ArrayList<ProjectMember>();
		for (int i = 0; i < _ctx.lengthValue("ListProjectMembersResponse.Data.ProjectMemberList.Length"); i++) {
			ProjectMember projectMember = new ProjectMember();
			projectMember.setStatus(_ctx.stringValue("ListProjectMembersResponse.Data.ProjectMemberList["+ i +"].Status"));
			projectMember.setProjectMemberId(_ctx.stringValue("ListProjectMembersResponse.Data.ProjectMemberList["+ i +"].ProjectMemberId"));
			projectMember.setNick(_ctx.stringValue("ListProjectMembersResponse.Data.ProjectMemberList["+ i +"].Nick"));
			projectMember.setProjectMemberName(_ctx.stringValue("ListProjectMembersResponse.Data.ProjectMemberList["+ i +"].ProjectMemberName"));
			projectMember.setProjectMemberType(_ctx.stringValue("ListProjectMembersResponse.Data.ProjectMemberList["+ i +"].ProjectMemberType"));

			List<Role> projectRoleList = new ArrayList<Role>();
			for (int j = 0; j < _ctx.lengthValue("ListProjectMembersResponse.Data.ProjectMemberList["+ i +"].ProjectRoleList.Length"); j++) {
				Role role = new Role();
				role.setProjectRoleId(_ctx.integerValue("ListProjectMembersResponse.Data.ProjectMemberList["+ i +"].ProjectRoleList["+ j +"].ProjectRoleId"));
				role.setProjectRoleType(_ctx.stringValue("ListProjectMembersResponse.Data.ProjectMemberList["+ i +"].ProjectRoleList["+ j +"].ProjectRoleType"));
				role.setProjectRoleName(_ctx.stringValue("ListProjectMembersResponse.Data.ProjectMemberList["+ i +"].ProjectRoleList["+ j +"].ProjectRoleName"));
				role.setProjectRoleCode(_ctx.stringValue("ListProjectMembersResponse.Data.ProjectMemberList["+ i +"].ProjectRoleList["+ j +"].ProjectRoleCode"));

				projectRoleList.add(role);
			}
			projectMember.setProjectRoleList(projectRoleList);

			projectMemberList.add(projectMember);
		}
		data.setProjectMemberList(projectMemberList);
		listProjectMembersResponse.setData(data);
	 
	 	return listProjectMembersResponse;
	}
}