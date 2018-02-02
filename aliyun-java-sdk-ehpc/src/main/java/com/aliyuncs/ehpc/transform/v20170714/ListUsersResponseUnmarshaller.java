/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.ehpc.transform.v20170714;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ehpc.model.v20170714.ListUsersResponse;
import com.aliyuncs.ehpc.model.v20170714.ListUsersResponse.UserInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUsersResponseUnmarshaller {

	public static ListUsersResponse unmarshall(ListUsersResponse listUsersResponse, UnmarshallerContext context) {
		
		listUsersResponse.setRequestId(context.stringValue("ListUsersResponse.RequestId"));
		listUsersResponse.setTotalCount(context.integerValue("ListUsersResponse.TotalCount"));
		listUsersResponse.setPageNumber(context.integerValue("ListUsersResponse.PageNumber"));
		listUsersResponse.setPageSize(context.integerValue("ListUsersResponse.PageSize"));

		List<UserInfo> users = new ArrayList<UserInfo>();
		for (int i = 0; i < context.lengthValue("ListUsersResponse.Users.Length"); i++) {
			UserInfo userInfo = new UserInfo();
			userInfo.setName(context.stringValue("ListUsersResponse.Users["+ i +"].Name"));
			userInfo.setGroup(context.stringValue("ListUsersResponse.Users["+ i +"].Group"));
			userInfo.setAddTime(context.stringValue("ListUsersResponse.Users["+ i +"].AddTime"));

			users.add(userInfo);
		}
		listUsersResponse.setUsers(users);
	 
	 	return listUsersResponse;
	}
}