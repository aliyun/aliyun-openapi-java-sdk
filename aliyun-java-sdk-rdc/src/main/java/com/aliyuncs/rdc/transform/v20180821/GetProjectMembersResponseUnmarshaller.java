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

	public static GetProjectMembersResponse unmarshall(GetProjectMembersResponse getProjectMembersResponse, UnmarshallerContext context) {
		
		getProjectMembersResponse.setRequestId(context.stringValue("GetProjectMembersResponse.RequestId"));
		getProjectMembersResponse.setCode(context.integerValue("GetProjectMembersResponse.Code"));
		getProjectMembersResponse.setSuccess(context.booleanValue("GetProjectMembersResponse.Success"));
		getProjectMembersResponse.setMessage(context.stringValue("GetProjectMembersResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < context.lengthValue("GetProjectMembersResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setId(context.integerValue("GetProjectMembersResponse.Data["+ i +"].Id"));
			dataItem.setName(context.stringValue("GetProjectMembersResponse.Data["+ i +"].Name"));
			dataItem.setIdentifier(context.stringValue("GetProjectMembersResponse.Data["+ i +"].Identifier"));

			List<UsersItem> users = new ArrayList<UsersItem>();
			for (int j = 0; j < context.lengthValue("GetProjectMembersResponse.Data["+ i +"].Users.Length"); j++) {
				UsersItem usersItem = new UsersItem();
				usersItem.setId(context.integerValue("GetProjectMembersResponse.Data["+ i +"].Users["+ j +"].Id"));
				usersItem.setStaffId(context.stringValue("GetProjectMembersResponse.Data["+ i +"].Users["+ j +"].StaffId"));
				usersItem.setRealName(context.stringValue("GetProjectMembersResponse.Data["+ i +"].Users["+ j +"].RealName"));
				usersItem.setNickName(context.stringValue("GetProjectMembersResponse.Data["+ i +"].Users["+ j +"].NickName"));
				usersItem.setAvatar(context.stringValue("GetProjectMembersResponse.Data["+ i +"].Users["+ j +"].Avatar"));
				usersItem.setEmail(context.stringValue("GetProjectMembersResponse.Data["+ i +"].Users["+ j +"].Email"));

				users.add(usersItem);
			}
			dataItem.setUsers(users);

			data.add(dataItem);
		}
		getProjectMembersResponse.setData(data);
	 
	 	return getProjectMembersResponse;
	}
}