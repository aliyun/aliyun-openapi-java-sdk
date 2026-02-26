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

package com.aliyuncs.csas.transform.v20230120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.csas.model.v20230120.ListUsersResponse;
import com.aliyuncs.csas.model.v20230120.ListUsersResponse.DataList;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUsersResponseUnmarshaller {

	public static ListUsersResponse unmarshall(ListUsersResponse listUsersResponse, UnmarshallerContext _ctx) {
		
		listUsersResponse.setRequestId(_ctx.stringValue("ListUsersResponse.RequestId"));
		listUsersResponse.setTotalNum(_ctx.stringValue("ListUsersResponse.TotalNum"));

		List<DataList> users = new ArrayList<DataList>();
		for (int i = 0; i < _ctx.lengthValue("ListUsersResponse.Users.Length"); i++) {
			DataList dataList = new DataList();
			dataList.setUsername(_ctx.stringValue("ListUsersResponse.Users["+ i +"].Username"));
			dataList.setSaseUserId(_ctx.stringValue("ListUsersResponse.Users["+ i +"].SaseUserId"));
			dataList.setDepartment(_ctx.stringValue("ListUsersResponse.Users["+ i +"].Department"));
			dataList.setEmail(_ctx.stringValue("ListUsersResponse.Users["+ i +"].Email"));
			dataList.setPhone(_ctx.stringValue("ListUsersResponse.Users["+ i +"].Phone"));
			dataList.setStatus(_ctx.stringValue("ListUsersResponse.Users["+ i +"].Status"));
			dataList.setIdpName(_ctx.stringValue("ListUsersResponse.Users["+ i +"].IdpName"));

			users.add(dataList);
		}
		listUsersResponse.setUsers(users);
	 
	 	return listUsersResponse;
	}
}