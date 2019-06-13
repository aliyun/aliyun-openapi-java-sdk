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

package com.aliyuncs.rdc.transform.v20180816;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rdc.model.v20180816.GetProjectInfoResponse;
import com.aliyuncs.rdc.model.v20180816.GetProjectInfoResponse.Data;
import com.aliyuncs.rdc.model.v20180816.GetProjectInfoResponse.Data.Creator;
import com.aliyuncs.rdc.model.v20180816.GetProjectInfoResponse.Data.Modifier;
import com.aliyuncs.rdc.model.v20180816.GetProjectInfoResponse.Data.ProjectMember;
import com.aliyuncs.rdc.model.v20180816.GetProjectInfoResponse.Data.ProjectMember.User;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetProjectInfoResponseUnmarshaller {

	public static GetProjectInfoResponse unmarshall(GetProjectInfoResponse getProjectInfoResponse, UnmarshallerContext context) {
		
		getProjectInfoResponse.setRequestId(context.stringValue("GetProjectInfoResponse.RequestId"));
		getProjectInfoResponse.setCode(context.integerValue("GetProjectInfoResponse.Code"));
		getProjectInfoResponse.setSuccess(context.booleanValue("GetProjectInfoResponse.Success"));
		getProjectInfoResponse.setMessage(context.stringValue("GetProjectInfoResponse.Message"));

		Data data = new Data();
		data.setGmtModified(context.stringValue("GetProjectInfoResponse.Data.GmtModified"));
		data.setDescription(context.stringValue("GetProjectInfoResponse.Data.Description"));
		data.setStamp(context.stringValue("GetProjectInfoResponse.Data.Stamp"));
		data.setGmtCreate(context.stringValue("GetProjectInfoResponse.Data.GmtCreate"));
		data.setType(context.stringValue("GetProjectInfoResponse.Data.Type"));
		data.setParentId(context.integerValue("GetProjectInfoResponse.Data.ParentId"));
		data.setMode(context.stringValue("GetProjectInfoResponse.Data.Mode"));
		data.setIdPath(context.stringValue("GetProjectInfoResponse.Data.IdPath"));
		data.setName(context.stringValue("GetProjectInfoResponse.Data.Name"));
		data.setId(context.integerValue("GetProjectInfoResponse.Data.Id"));
		data.setRegion(context.stringValue("GetProjectInfoResponse.Data.Region"));
		data.setCustomValues(context.stringValue("GetProjectInfoResponse.Data.CustomValues"));
		data.setStatus(context.stringValue("GetProjectInfoResponse.Data.Status"));

		Creator creator = new Creator();
		creator.setRealName(context.stringValue("GetProjectInfoResponse.Data.Creator.RealName"));
		creator.setNickName(context.stringValue("GetProjectInfoResponse.Data.Creator.NickName"));
		creator.setAvatar(context.stringValue("GetProjectInfoResponse.Data.Creator.Avatar"));
		creator.setId(context.integerValue("GetProjectInfoResponse.Data.Creator.Id"));
		creator.setEmail(context.stringValue("GetProjectInfoResponse.Data.Creator.Email"));
		creator.setStaffId(context.stringValue("GetProjectInfoResponse.Data.Creator.StaffId"));
		data.setCreator(creator);

		Modifier modifier = new Modifier();
		modifier.setRealName(context.stringValue("GetProjectInfoResponse.Data.Modifier.RealName"));
		modifier.setNickName(context.stringValue("GetProjectInfoResponse.Data.Modifier.NickName"));
		modifier.setAvatar(context.stringValue("GetProjectInfoResponse.Data.Modifier.Avatar"));
		modifier.setId(context.integerValue("GetProjectInfoResponse.Data.Modifier.Id"));
		modifier.setEmail(context.stringValue("GetProjectInfoResponse.Data.Modifier.Email"));
		modifier.setStaffId(context.stringValue("GetProjectInfoResponse.Data.Modifier.StaffId"));
		data.setModifier(modifier);

		List<ProjectMember> projectMembers = new ArrayList<ProjectMember>();
		for (int i = 0; i < context.lengthValue("GetProjectInfoResponse.Data.ProjectMembers.Length"); i++) {
			ProjectMember projectMember = new ProjectMember();
			projectMember.setIdentifier(context.stringValue("GetProjectInfoResponse.Data.ProjectMembers["+ i +"].Identifier"));
			projectMember.setName(context.stringValue("GetProjectInfoResponse.Data.ProjectMembers["+ i +"].Name"));
			projectMember.setId(context.integerValue("GetProjectInfoResponse.Data.ProjectMembers["+ i +"].Id"));

			List<User> users = new ArrayList<User>();
			for (int j = 0; j < context.lengthValue("GetProjectInfoResponse.Data.ProjectMembers["+ i +"].Users.Length"); j++) {
				User user = new User();
				user.setRealName(context.stringValue("GetProjectInfoResponse.Data.ProjectMembers["+ i +"].Users["+ j +"].RealName"));
				user.setNickName(context.stringValue("GetProjectInfoResponse.Data.ProjectMembers["+ i +"].Users["+ j +"].NickName"));
				user.setAvatar(context.stringValue("GetProjectInfoResponse.Data.ProjectMembers["+ i +"].Users["+ j +"].Avatar"));
				user.setId(context.integerValue("GetProjectInfoResponse.Data.ProjectMembers["+ i +"].Users["+ j +"].Id"));
				user.setEmail(context.stringValue("GetProjectInfoResponse.Data.ProjectMembers["+ i +"].Users["+ j +"].Email"));
				user.setStaffId(context.stringValue("GetProjectInfoResponse.Data.ProjectMembers["+ i +"].Users["+ j +"].StaffId"));

				users.add(user);
			}
			projectMember.setUsers(users);

			projectMembers.add(projectMember);
		}
		data.setProjectMembers(projectMembers);
		getProjectInfoResponse.setData(data);
	 
	 	return getProjectInfoResponse;
	}
}