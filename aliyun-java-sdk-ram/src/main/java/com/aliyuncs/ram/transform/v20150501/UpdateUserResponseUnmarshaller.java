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

import com.aliyuncs.ram.model.v20150501.UpdateUserResponse;
import com.aliyuncs.ram.model.v20150501.UpdateUserResponse.User;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateUserResponseUnmarshaller {

	public static UpdateUserResponse unmarshall(UpdateUserResponse updateUserResponse, UnmarshallerContext context) {
		
		updateUserResponse.setRequestId(context.stringValue("UpdateUserResponse.RequestId"));

		User user = new User();
		user.setUserId(context.stringValue("UpdateUserResponse.User.UserId"));
		user.setUserName(context.stringValue("UpdateUserResponse.User.UserName"));
		user.setDisplayName(context.stringValue("UpdateUserResponse.User.DisplayName"));
		user.setMobilePhone(context.stringValue("UpdateUserResponse.User.MobilePhone"));
		user.setEmail(context.stringValue("UpdateUserResponse.User.Email"));
		user.setComments(context.stringValue("UpdateUserResponse.User.Comments"));
		user.setCreateDate(context.stringValue("UpdateUserResponse.User.CreateDate"));
		user.setUpdateDate(context.stringValue("UpdateUserResponse.User.UpdateDate"));
		updateUserResponse.setUser(user);
	 
	 	return updateUserResponse;
	}
}