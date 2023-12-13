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

package com.aliyuncs.ims.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ims.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateUserRequest extends RpcAcsRequest<UpdateUserResponse> {
	   

	private String newMobilePhone;

	private String userId;

	private String newEmail;

	private String newDisplayName;

	private String userPrincipalName;

	private String newComments;

	private String newUserPrincipalName;
	public UpdateUserRequest() {
		super("Ims", "2019-08-15", "UpdateUser", "ims");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("UserId", userId);
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

	public String getNewDisplayName() {
		return this.newDisplayName;
	}

	public void setNewDisplayName(String newDisplayName) {
		this.newDisplayName = newDisplayName;
		if(newDisplayName != null){
			putQueryParameter("NewDisplayName", newDisplayName);
		}
	}

	public String getUserPrincipalName() {
		return this.userPrincipalName;
	}

	public void setUserPrincipalName(String userPrincipalName) {
		this.userPrincipalName = userPrincipalName;
		if(userPrincipalName != null){
			putQueryParameter("UserPrincipalName", userPrincipalName);
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

	public String getNewUserPrincipalName() {
		return this.newUserPrincipalName;
	}

	public void setNewUserPrincipalName(String newUserPrincipalName) {
		this.newUserPrincipalName = newUserPrincipalName;
		if(newUserPrincipalName != null){
			putQueryParameter("NewUserPrincipalName", newUserPrincipalName);
		}
	}

	@Override
	public Class<UpdateUserResponse> getResponseClass() {
		return UpdateUserResponse.class;
	}

}
