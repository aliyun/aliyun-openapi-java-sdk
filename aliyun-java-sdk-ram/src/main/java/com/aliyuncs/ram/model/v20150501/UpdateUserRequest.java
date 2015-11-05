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
package com.aliyuncs.ram.model.v20150501;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;

/**
 * @author auto create
 * @version 
 */
public class UpdateUserRequest extends RpcAcsRequest<UpdateUserResponse> {
	
	public UpdateUserRequest() {
		super("Ram", "2015-05-01", "UpdateUser");
		setProtocol(ProtocolType.HTTPS);
	}

	private String userName;

	private String newUserName;

	private String newDisplayName;

	private String newMobilePhone;

	private String newEmail;

	private String newComments;

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
		putQueryParameter("UserName", userName);
	}

	public String getNewUserName() {
		return this.newUserName;
	}

	public void setNewUserName(String newUserName) {
		this.newUserName = newUserName;
		putQueryParameter("NewUserName", newUserName);
	}

	public String getNewDisplayName() {
		return this.newDisplayName;
	}

	public void setNewDisplayName(String newDisplayName) {
		this.newDisplayName = newDisplayName;
		putQueryParameter("NewDisplayName", newDisplayName);
	}

	public String getNewMobilePhone() {
		return this.newMobilePhone;
	}

	public void setNewMobilePhone(String newMobilePhone) {
		this.newMobilePhone = newMobilePhone;
		putQueryParameter("NewMobilePhone", newMobilePhone);
	}

	public String getNewEmail() {
		return this.newEmail;
	}

	public void setNewEmail(String newEmail) {
		this.newEmail = newEmail;
		putQueryParameter("NewEmail", newEmail);
	}

	public String getNewComments() {
		return this.newComments;
	}

	public void setNewComments(String newComments) {
		this.newComments = newComments;
		putQueryParameter("NewComments", newComments);
	}

	@Override
	public Class<UpdateUserResponse> getResponseClass() {
		return UpdateUserResponse.class;
	}

}
