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

package com.aliyuncs.imm.transform.v20170906;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imm.model.v20170906.ListFaceSearchGroupUsersResponse;
import com.aliyuncs.imm.model.v20170906.ListFaceSearchGroupUsersResponse.UsersItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFaceSearchGroupUsersResponseUnmarshaller {

	public static ListFaceSearchGroupUsersResponse unmarshall(ListFaceSearchGroupUsersResponse listFaceSearchGroupUsersResponse, UnmarshallerContext _ctx) {
		
		listFaceSearchGroupUsersResponse.setRequestId(_ctx.stringValue("ListFaceSearchGroupUsersResponse.RequestId"));
		listFaceSearchGroupUsersResponse.setNextMarker(_ctx.stringValue("ListFaceSearchGroupUsersResponse.NextMarker"));
		listFaceSearchGroupUsersResponse.setGroupName(_ctx.stringValue("ListFaceSearchGroupUsersResponse.GroupName"));
		listFaceSearchGroupUsersResponse.setGroupId(_ctx.stringValue("ListFaceSearchGroupUsersResponse.GroupId"));

		List<UsersItem> users = new ArrayList<UsersItem>();
		for (int i = 0; i < _ctx.lengthValue("ListFaceSearchGroupUsersResponse.Users.Length"); i++) {
			UsersItem usersItem = new UsersItem();
			usersItem.setUser(_ctx.stringValue("ListFaceSearchGroupUsersResponse.Users["+ i +"].User"));
			usersItem.setCount(_ctx.stringValue("ListFaceSearchGroupUsersResponse.Users["+ i +"].Count"));
			usersItem.setStatus(_ctx.stringValue("ListFaceSearchGroupUsersResponse.Users["+ i +"].Status"));
			usersItem.setCreateTime(_ctx.stringValue("ListFaceSearchGroupUsersResponse.Users["+ i +"].CreateTime"));
			usersItem.setModifyTime(_ctx.stringValue("ListFaceSearchGroupUsersResponse.Users["+ i +"].ModifyTime"));

			users.add(usersItem);
		}
		listFaceSearchGroupUsersResponse.setUsers(users);
	 
	 	return listFaceSearchGroupUsersResponse;
	}
}