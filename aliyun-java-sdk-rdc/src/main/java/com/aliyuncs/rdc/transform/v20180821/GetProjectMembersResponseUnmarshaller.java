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

package com.aliyuncs.rdc.transform.v20180821;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rdc.model.v20180821.GetProjectMembersResponse;
import com.aliyuncs.rdc.model.v20180821.GetProjectMembersResponse.DataItem;
import com.aliyuncs.rdc.model.v20180821.GetProjectMembersResponse.DataItem.UsersItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetProjectMembersResponseUnmarshaller {

	public static GetProjectMembersResponse unmarshall(GetProjectMembersResponse getProjectMembersResponse, UnmarshallerContext _ctx) {
		
		getProjectMembersResponse.setRequestId(_ctx.stringValue("GetProjectMembersResponse.RequestId"));
		getProjectMembersResponse.setCode(_ctx.integerValue("GetProjectMembersResponse.Code"));
		getProjectMembersResponse.setSuccess(_ctx.booleanValue("GetProjectMembersResponse.Success"));
		getProjectMembersResponse.setMessage(_ctx.stringValue("GetProjectMembersResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetProjectMembersResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setId(_ctx.integerValue("GetProjectMembersResponse.Data["+ i +"].Id"));
			dataItem.setName(_ctx.stringValue("GetProjectMembersResponse.Data["+ i +"].Name"));
			dataItem.setIdentifier(_ctx.stringValue("GetProjectMembersResponse.Data["+ i +"].Identifier"));

			List<UsersItem> users = new ArrayList<UsersItem>();
			for (int j = 0; j < _ctx.lengthValue("GetProjectMembersResponse.Data["+ i +"].Users.Length"); j++) {
				UsersItem usersItem = new UsersItem();
				usersItem.setId(_ctx.integerValue("GetProjectMembersResponse.Data["+ i +"].Users["+ j +"].Id"));
				usersItem.setStaffId(_ctx.stringValue("GetProjectMembersResponse.Data["+ i +"].Users["+ j +"].StaffId"));
				usersItem.setRealName(_ctx.stringValue("GetProjectMembersResponse.Data["+ i +"].Users["+ j +"].RealName"));
				usersItem.setNickName(_ctx.stringValue("GetProjectMembersResponse.Data["+ i +"].Users["+ j +"].NickName"));
				usersItem.setAvatar(_ctx.stringValue("GetProjectMembersResponse.Data["+ i +"].Users["+ j +"].Avatar"));
				usersItem.setEmail(_ctx.stringValue("GetProjectMembersResponse.Data["+ i +"].Users["+ j +"].Email"));

				users.add(usersItem);
			}
			dataItem.setUsers(users);

			data.add(dataItem);
		}
		getProjectMembersResponse.setData(data);
	 
	 	return getProjectMembersResponse;
	}
}