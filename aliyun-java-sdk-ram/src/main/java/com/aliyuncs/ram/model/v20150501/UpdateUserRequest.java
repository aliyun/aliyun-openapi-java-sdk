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

package com.aliyuncs.ram.model.v20150501;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;

/**
 * @author auto create
 * @version 
 */
public class UpdateUserRequest extends RpcAcsRequest<UpdateUserResponse> {
	
	public UpdateUserRequest() {
		super("Ram", "2015-05-01", "UpdateUser", "ram");
		setProtocol(ProtocolType.HTTPS);
	}

	private String newUserName;

	private String newDisplayName;

	private String newMobilePhone;

	private String newComments;

	private String newEmail;

	private String userName;

	public String getNewUserName() {
		return this.newUserName;
	}

	public void setNewUserName(String newUserName) {
		this.newUserName = newUserName;
		if(newUserName != null){
			putQueryParameter("NewUserName", newUserName);
		}
	}

	public String getNewDisplayName() {
		return this.newDisplayName;
	}

	public void setNewDisplayName(String newDisplayName) {
		this.newDisplayName = newDisplayName;
		if(newDisplayName != null){
			putQueryParameter("NewDisplayName", newDisplayName);
		}
	}

	public String getNewMobilePhone() {
		return this.newMobilePhone;
	}

	public void setNewMobilePhone(String newMobilePhone) {
		this.newMobilePhone = newMobilePhone;
		if(newMobilePhone != null){
			putQueryParameter("NewMobilePhone", newMobilePhone);
		}
	}

	public String getNewComments() {
		return this.newComments;
	}

	public void setNewComments(String newComments) {
		this.newComments = newComments;
		if(newComments != null){
			putQueryParameter("NewComments", newComments);
		}
	}

	public String getNewEmail() {
		return this.newEmail;
	}

	public void setNewEmail(String newEmail) {
		this.newEmail = newEmail;
		if(newEmail != null){
			putQueryParameter("NewEmail", newEmail);
		}
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
		if(userName != null){
			putQueryParameter("UserName", userName);
		}
	}

	@Override
	public Class<UpdateUserResponse> getResponseClass() {
		return UpdateUserResponse.class;
	}

}
