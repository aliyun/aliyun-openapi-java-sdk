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

package com.aliyuncs.resourcemanager.transform.v20200331;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.resourcemanager.model.v20200331.ListRolesResponse;
import com.aliyuncs.resourcemanager.model.v20200331.ListRolesResponse.Role;
import com.aliyuncs.resourcemanager.model.v20200331.ListRolesResponse.Role.LatestDeletionTask;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRolesResponseUnmarshaller {

	public static ListRolesResponse unmarshall(ListRolesResponse listRolesResponse, UnmarshallerContext _ctx) {
		
		listRolesResponse.setRequestId(_ctx.stringValue("ListRolesResponse.RequestId"));
		listRolesResponse.setTotalCount(_ctx.integerValue("ListRolesResponse.TotalCount"));
		listRolesResponse.setPageSize(_ctx.integerValue("ListRolesResponse.PageSize"));
		listRolesResponse.setPageNumber(_ctx.integerValue("ListRolesResponse.PageNumber"));

		List<Role> roles = new ArrayList<Role>();
		for (int i = 0; i < _ctx.lengthValue("ListRolesResponse.Roles.Length"); i++) {
			Role role = new Role();
			role.setRolePrincipalName(_ctx.stringValue("ListRolesResponse.Roles["+ i +"].RolePrincipalName"));
			role.setUpdateDate(_ctx.stringValue("ListRolesResponse.Roles["+ i +"].UpdateDate"));
			role.setDescription(_ctx.stringValue("ListRolesResponse.Roles["+ i +"].Description"));
			role.setMaxSessionDuration(_ctx.longValue("ListRolesResponse.Roles["+ i +"].MaxSessionDuration"));
			role.setRoleName(_ctx.stringValue("ListRolesResponse.Roles["+ i +"].RoleName"));
			role.setCreateDate(_ctx.stringValue("ListRolesResponse.Roles["+ i +"].CreateDate"));
			role.setRoleId(_ctx.stringValue("ListRolesResponse.Roles["+ i +"].RoleId"));
			role.setArn(_ctx.stringValue("ListRolesResponse.Roles["+ i +"].Arn"));
			role.setIsServiceLinkedRole(_ctx.booleanValue("ListRolesResponse.Roles["+ i +"].IsServiceLinkedRole"));

			LatestDeletionTask latestDeletionTask = new LatestDeletionTask();
			latestDeletionTask.setDeletionTaskId(_ctx.stringValue("ListRolesResponse.Roles["+ i +"].LatestDeletionTask.DeletionTaskId"));
			latestDeletionTask.setCreateDate(_ctx.stringValue("ListRolesResponse.Roles["+ i +"].LatestDeletionTask.CreateDate"));
			role.setLatestDeletionTask(latestDeletionTask);

			roles.add(role);
		}
		listRolesResponse.setRoles(roles);
	 
	 	return listRolesResponse;
	}
}