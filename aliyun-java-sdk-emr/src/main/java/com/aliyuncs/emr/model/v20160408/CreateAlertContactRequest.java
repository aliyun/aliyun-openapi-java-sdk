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

package com.aliyuncs.emr.model.v20160408;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CreateAlertContactRequest extends RpcAcsRequest<CreateAlertContactResponse> {
	
	public CreateAlertContactRequest() {
		super("Emr", "2016-04-08", "CreateAlertContact");
	}

	private String emailVerificationCode;

	private Long resourceOwnerId;

	private String phoneNumberVerificationCode;

	private String name;

	private String phoneNumber;

	private String email;

	public String getEmailVerificationCode() {
		return this.emailVerificationCode;
	}

	public void setEmailVerificationCode(String emailVerificationCode) {
		this.emailVerificationCode = emailVerificationCode;
		if(emailVerificationCode != null){
			putQueryParameter("EmailVerificationCode", emailVerificationCode);
		}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getPhoneNumberVerificationCode() {
		return this.phoneNumberVerificationCode;
	}

	public void setPhoneNumberVerificationCode(String phoneNumberVerificationCode) {
		this.phoneNumberVerificationCode = phoneNumberVerificationCode;
		if(phoneNumberVerificationCode != null){
			putQueryParameter("PhoneNumberVerificationCode", phoneNumberVerificationCode);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		if(phoneNumber != null){
			putQueryParameter("PhoneNumber", phoneNumber);
		}
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
		if(email != null){
			putQueryParameter("Email", email);
		}
	}

	@Override
	public Class<CreateAlertContactResponse> getResponseClass() {
		return CreateAlertContactResponse.class;
	}

}
