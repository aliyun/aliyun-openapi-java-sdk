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
package com.aliyuncs.ram.transform.v20150501;

import com.aliyuncs.ram.model.v20150501.CreateUserResponse;
import com.aliyuncs.ram.model.v20150501.CreateUserResponse.User;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateUserResponseUnmarshaller {

	public static CreateUserResponse unmarshall(CreateUserResponse createUserResponse, UnmarshallerContext context) {
		
		createUserResponse.setRequestId(context.stringValue("CreateUserResponse.RequestId"));

		User user = new User();
		user.setUserId(context.stringValue("CreateUserResponse.User.UserId"));
		user.setUserName(context.stringValue("CreateUserResponse.User.UserName"));
		user.setDisplayName(context.stringValue("CreateUserResponse.User.DisplayName"));
		user.setMobilePhone(context.stringValue("CreateUserResponse.User.MobilePhone"));
		user.setEmail(context.stringValue("CreateUserResponse.User.Email"));
		user.setComments(context.stringValue("CreateUserResponse.User.Comments"));
		user.setCreateDate(context.stringValue("CreateUserResponse.User.CreateDate"));
		createUserResponse.setUser(user);
	 
	 	return createUserResponse;
	}
}