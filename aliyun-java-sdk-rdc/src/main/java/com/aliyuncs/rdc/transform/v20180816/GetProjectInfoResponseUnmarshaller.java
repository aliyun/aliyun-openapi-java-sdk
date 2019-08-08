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

	public static GetProjectInfoResponse unmarshall(GetProjectInfoResponse getProjectInfoResponse, UnmarshallerContext _ctx) {
		
		getProjectInfoResponse.setRequestId(_ctx.stringValue("GetProjectInfoResponse.RequestId"));
		getProjectInfoResponse.setCode(_ctx.integerValue("GetProjectInfoResponse.Code"));
		getProjectInfoResponse.setSuccess(_ctx.booleanValue("GetProjectInfoResponse.Success"));
		getProjectInfoResponse.setMessage(_ctx.stringValue("GetProjectInfoResponse.Message"));

		Data data = new Data();
		data.setGmtModified(_ctx.stringValue("GetProjectInfoResponse.Data.GmtModified"));
		data.setDescription(_ctx.stringValue("GetProjectInfoResponse.Data.Description"));
		data.setStamp(_ctx.stringValue("GetProjectInfoResponse.Data.Stamp"));
		data.setGmtCreate(_ctx.stringValue("GetProjectInfoResponse.Data.GmtCreate"));
		data.setType(_ctx.stringValue("GetProjectInfoResponse.Data.Type"));
		data.setParentId(_ctx.integerValue("GetProjectInfoResponse.Data.ParentId"));
		data.setMode(_ctx.stringValue("GetProjectInfoResponse.Data.Mode"));
		data.setIdPath(_ctx.stringValue("GetProjectInfoResponse.Data.IdPath"));
		data.setName(_ctx.stringValue("GetProjectInfoResponse.Data.Name"));
		data.setId(_ctx.integerValue("GetProjectInfoResponse.Data.Id"));
		data.setRegion(_ctx.stringValue("GetProjectInfoResponse.Data.Region"));
		data.setCustomValues(_ctx.stringValue("GetProjectInfoResponse.Data.CustomValues"));
		data.setStatus(_ctx.stringValue("GetProjectInfoResponse.Data.Status"));

		Creator creator = new Creator();
		creator.setRealName(_ctx.stringValue("GetProjectInfoResponse.Data.Creator.RealName"));
		creator.setNickName(_ctx.stringValue("GetProjectInfoResponse.Data.Creator.NickName"));
		creator.setAvatar(_ctx.stringValue("GetProjectInfoResponse.Data.Creator.Avatar"));
		creator.setId(_ctx.integerValue("GetProjectInfoResponse.Data.Creator.Id"));
		creator.setEmail(_ctx.stringValue("GetProjectInfoResponse.Data.Creator.Email"));
		creator.setStaffId(_ctx.stringValue("GetProjectInfoResponse.Data.Creator.StaffId"));
		data.setCreator(creator);

		Modifier modifier = new Modifier();
		modifier.setRealName(_ctx.stringValue("GetProjectInfoResponse.Data.Modifier.RealName"));
		modifier.setNickName(_ctx.stringValue("GetProjectInfoResponse.Data.Modifier.NickName"));
		modifier.setAvatar(_ctx.stringValue("GetProjectInfoResponse.Data.Modifier.Avatar"));
		modifier.setId(_ctx.integerValue("GetProjectInfoResponse.Data.Modifier.Id"));
		modifier.setEmail(_ctx.stringValue("GetProjectInfoResponse.Data.Modifier.Email"));
		modifier.setStaffId(_ctx.stringValue("GetProjectInfoResponse.Data.Modifier.StaffId"));
		data.setModifier(modifier);

		List<ProjectMember> projectMembers = new ArrayList<ProjectMember>();
		for (int i = 0; i < _ctx.lengthValue("GetProjectInfoResponse.Data.ProjectMembers.Length"); i++) {
			ProjectMember projectMember = new ProjectMember();
			projectMember.setIdentifier(_ctx.stringValue("GetProjectInfoResponse.Data.ProjectMembers["+ i +"].Identifier"));
			projectMember.setName(_ctx.stringValue("GetProjectInfoResponse.Data.ProjectMembers["+ i +"].Name"));
			projectMember.setId(_ctx.integerValue("GetProjectInfoResponse.Data.ProjectMembers["+ i +"].Id"));

			List<User> users = new ArrayList<User>();
			for (int j = 0; j < _ctx.lengthValue("GetProjectInfoResponse.Data.ProjectMembers["+ i +"].Users.Length"); j++) {
				User user = new User();
				user.setRealName(_ctx.stringValue("GetProjectInfoResponse.Data.ProjectMembers["+ i +"].Users["+ j +"].RealName"));
				user.setNickName(_ctx.stringValue("GetProjectInfoResponse.Data.ProjectMembers["+ i +"].Users["+ j +"].NickName"));
				user.setAvatar(_ctx.stringValue("GetProjectInfoResponse.Data.ProjectMembers["+ i +"].Users["+ j +"].Avatar"));
				user.setId(_ctx.integerValue("GetProjectInfoResponse.Data.ProjectMembers["+ i +"].Users["+ j +"].Id"));
				user.setEmail(_ctx.stringValue("GetProjectInfoResponse.Data.ProjectMembers["+ i +"].Users["+ j +"].Email"));
				user.setStaffId(_ctx.stringValue("GetProjectInfoResponse.Data.ProjectMembers["+ i +"].Users["+ j +"].StaffId"));

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