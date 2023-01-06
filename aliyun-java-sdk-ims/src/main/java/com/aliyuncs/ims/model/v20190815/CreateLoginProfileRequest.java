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
public class CreateLoginProfileRequest extends RpcAcsRequest<CreateLoginProfileResponse> {
	   

	private String password;

	private Boolean mFABindRequired;

	private Boolean passwordResetRequired;

	private String userPrincipalName;

	private String status;
	public CreateLoginProfileRequest() {
		super("Ims", "2019-08-15", "CreateLoginProfile");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
		if(password != null){
			putQueryParameter("Password", password);
		}
	}

	public Boolean getMFABindRequired() {
		return this.mFABindRequired;
	}

	public void setMFABindRequired(Boolean mFABindRequired) {
		this.mFABindRequired = mFABindRequired;
		if(mFABindRequired != null){
			putQueryParameter("MFABindRequired", mFABindRequired.toString());
		}
	}

	public Boolean getPasswordResetRequired() {
		return this.passwordResetRequired;
	}

	public void setPasswordResetRequired(Boolean passwordResetRequired) {
		this.passwordResetRequired = passwordResetRequired;
		if(passwordResetRequired != null){
			putQueryParameter("PasswordResetRequired", passwordResetRequired.toString());
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

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status);
		}
	}

	@Override
	public Class<CreateLoginProfileResponse> getResponseClass() {
		return CreateLoginProfileResponse.class;
	}

}
