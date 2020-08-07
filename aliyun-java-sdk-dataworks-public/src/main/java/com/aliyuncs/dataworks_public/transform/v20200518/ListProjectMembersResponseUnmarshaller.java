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
import com.aliyuncs.dataworks_public.model.v20200518.ListProjectMembersResponse.ProjectMember;
import com.aliyuncs.dataworks_public.model.v20200518.ListProjectMembersResponse.ProjectMember.Role;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListProjectMembersResponseUnmarshaller {

	public static ListProjectMembersResponse unmarshall(ListProjectMembersResponse listProjectMembersResponse, UnmarshallerContext _ctx) {
		
		listProjectMembersResponse.setRequestId(_ctx.stringValue("ListProjectMembersResponse.RequestId"));
		listProjectMembersResponse.setPageNum(_ctx.integerValue("ListProjectMembersResponse.PageNum"));
		listProjectMembersResponse.setPageSize(_ctx.integerValue("ListProjectMembersResponse.PageSize"));
		listProjectMembersResponse.setTotalNum(_ctx.integerValue("ListProjectMembersResponse.TotalNum"));

		List<ProjectMember> projectMemberList = new ArrayList<ProjectMember>();
		for (int i = 0; i < _ctx.lengthValue("ListProjectMembersResponse.ProjectMemberList.Length"); i++) {
			ProjectMember projectMember = new ProjectMember();
			projectMember.setProjectMemberId(_ctx.stringValue("ListProjectMembersResponse.ProjectMemberList["+ i +"].ProjectMemberId"));
			projectMember.setProjectMemberName(_ctx.stringValue("ListProjectMembersResponse.ProjectMemberList["+ i +"].ProjectMemberName"));
			projectMember.setProjectMemberType(_ctx.stringValue("ListProjectMembersResponse.ProjectMemberList["+ i +"].ProjectMemberType"));
			projectMember.setCreateOn(_ctx.stringValue("ListProjectMembersResponse.ProjectMemberList["+ i +"].CreateOn"));
			projectMember.setNick(_ctx.stringValue("ListProjectMembersResponse.ProjectMemberList["+ i +"].Nick"));
			projectMember.setStatus(_ctx.stringValue("ListProjectMembersResponse.ProjectMemberList["+ i +"].Status"));

			List<Role> projectRoleList = new ArrayList<Role>();
			for (int j = 0; j < _ctx.lengthValue("ListProjectMembersResponse.ProjectMemberList["+ i +"].ProjectRoleList.Length"); j++) {
				Role role = new Role();
				role.setProjectRoleCode(_ctx.stringValue("ListProjectMembersResponse.ProjectMemberList["+ i +"].ProjectRoleList["+ j +"].ProjectRoleCode"));
				role.setProjectRoleId(_ctx.integerValue("ListProjectMembersResponse.ProjectMemberList["+ i +"].ProjectRoleList["+ j +"].ProjectRoleId"));
				role.setProjectRoleName(_ctx.stringValue("ListProjectMembersResponse.ProjectMemberList["+ i +"].ProjectRoleList["+ j +"].ProjectRoleName"));
				role.setProjectRoleType(_ctx.stringValue("ListProjectMembersResponse.ProjectMemberList["+ i +"].ProjectRoleList["+ j +"].ProjectRoleType"));

				projectRoleList.add(role);
			}
			projectMember.setProjectRoleList(projectRoleList);

			projectMemberList.add(projectMember);
		}
		listProjectMembersResponse.setProjectMemberList(projectMemberList);
	 
	 	return listProjectMembersResponse;
	}
}