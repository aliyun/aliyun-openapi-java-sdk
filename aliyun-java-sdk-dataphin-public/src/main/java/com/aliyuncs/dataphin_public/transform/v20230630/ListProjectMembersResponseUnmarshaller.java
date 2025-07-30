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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.ListProjectMembersResponse;
import com.aliyuncs.dataphin_public.model.v20230630.ListProjectMembersResponse.PageResult;
import com.aliyuncs.dataphin_public.model.v20230630.ListProjectMembersResponse.PageResult.ProjectMember;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListProjectMembersResponseUnmarshaller {

	public static ListProjectMembersResponse unmarshall(ListProjectMembersResponse listProjectMembersResponse, UnmarshallerContext _ctx) {
		
		listProjectMembersResponse.setRequestId(_ctx.stringValue("ListProjectMembersResponse.RequestId"));
		listProjectMembersResponse.setSuccess(_ctx.booleanValue("ListProjectMembersResponse.Success"));
		listProjectMembersResponse.setHttpStatusCode(_ctx.integerValue("ListProjectMembersResponse.HttpStatusCode"));
		listProjectMembersResponse.setCode(_ctx.stringValue("ListProjectMembersResponse.Code"));
		listProjectMembersResponse.setMessage(_ctx.stringValue("ListProjectMembersResponse.Message"));

		PageResult pageResult = new PageResult();
		pageResult.setTotalCount(_ctx.integerValue("ListProjectMembersResponse.PageResult.TotalCount"));

		List<ProjectMember> projectMemberList = new ArrayList<ProjectMember>();
		for (int i = 0; i < _ctx.lengthValue("ListProjectMembersResponse.PageResult.ProjectMemberList.Length"); i++) {
			ProjectMember projectMember = new ProjectMember();
			projectMember.setGmtCreate(_ctx.stringValue("ListProjectMembersResponse.PageResult.ProjectMemberList["+ i +"].GmtCreate"));
			projectMember.setLastModifier(_ctx.stringValue("ListProjectMembersResponse.PageResult.ProjectMemberList["+ i +"].LastModifier"));
			projectMember.setUserName(_ctx.stringValue("ListProjectMembersResponse.PageResult.ProjectMemberList["+ i +"].UserName"));
			projectMember.setUserId(_ctx.stringValue("ListProjectMembersResponse.PageResult.ProjectMemberList["+ i +"].UserId"));
			projectMember.setGmtModified(_ctx.stringValue("ListProjectMembersResponse.PageResult.ProjectMemberList["+ i +"].GmtModified"));
			projectMember.setId(_ctx.longValue("ListProjectMembersResponse.PageResult.ProjectMemberList["+ i +"].Id"));
			projectMember.setLastModifierName(_ctx.stringValue("ListProjectMembersResponse.PageResult.ProjectMemberList["+ i +"].LastModifierName"));

			List<Integer> roleIdList = new ArrayList<Integer>();
			for (int j = 0; j < _ctx.lengthValue("ListProjectMembersResponse.PageResult.ProjectMemberList["+ i +"].RoleIdList.Length"); j++) {
				roleIdList.add(_ctx.integerValue("ListProjectMembersResponse.PageResult.ProjectMemberList["+ i +"].RoleIdList["+ j +"]"));
			}
			projectMember.setRoleIdList(roleIdList);

			projectMemberList.add(projectMember);
		}
		pageResult.setProjectMemberList(projectMemberList);
		listProjectMembersResponse.setPageResult(pageResult);
	 
	 	return listProjectMembersResponse;
	}
}