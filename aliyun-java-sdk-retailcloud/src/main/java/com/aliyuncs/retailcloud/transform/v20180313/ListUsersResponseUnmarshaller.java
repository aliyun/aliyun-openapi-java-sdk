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

package com.aliyuncs.retailcloud.transform.v20180313;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.retailcloud.model.v20180313.ListUsersResponse;
import com.aliyuncs.retailcloud.model.v20180313.ListUsersResponse.ListUserResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUsersResponseUnmarshaller {

	public static ListUsersResponse unmarshall(ListUsersResponse listUsersResponse, UnmarshallerContext _ctx) {
		
		listUsersResponse.setRequestId(_ctx.stringValue("ListUsersResponse.RequestId"));
		listUsersResponse.setCode(_ctx.integerValue("ListUsersResponse.Code"));
		listUsersResponse.setErrorMsg(_ctx.stringValue("ListUsersResponse.ErrorMsg"));
		listUsersResponse.setPageNumber(_ctx.integerValue("ListUsersResponse.PageNumber"));
		listUsersResponse.setPageSize(_ctx.integerValue("ListUsersResponse.PageSize"));
		listUsersResponse.setTotalCount(_ctx.longValue("ListUsersResponse.TotalCount"));

		List<ListUserResponse> data = new ArrayList<ListUserResponse>();
		for (int i = 0; i < _ctx.lengthValue("ListUsersResponse.Data.Length"); i++) {
			ListUserResponse listUserResponse = new ListUserResponse();
			listUserResponse.setUserId(_ctx.stringValue("ListUsersResponse.Data["+ i +"].UserId"));
			listUserResponse.setUserType(_ctx.stringValue("ListUsersResponse.Data["+ i +"].UserType"));
			listUserResponse.setRealName(_ctx.stringValue("ListUsersResponse.Data["+ i +"].RealName"));

			data.add(listUserResponse);
		}
		listUsersResponse.setData(data);
	 
	 	return listUsersResponse;
	}
}