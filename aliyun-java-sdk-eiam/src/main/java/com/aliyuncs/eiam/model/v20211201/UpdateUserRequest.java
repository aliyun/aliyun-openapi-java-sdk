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

package com.aliyuncs.eiam.model.v20211201;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateUserRequest extends RpcAcsRequest<UpdateUserResponse> {
	   

	private String phoneNumber;

	private String userId;

	private String phoneRegion;

	private List<CustomFields> customFields;

	private Boolean phoneNumberVerified;

	private String email;

	private String instanceId;

	private String displayName;

	private String username;

	private Boolean emailVerified;
	public UpdateUserRequest() {
		super("Eiam", "2021-12-01", "UpdateUser", "eiam");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
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

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("UserId", userId);
		}
	}

	public String getPhoneRegion() {
		return this.phoneRegion;
	}

	public void setPhoneRegion(String phoneRegion) {
		this.phoneRegion = phoneRegion;
		if(phoneRegion != null){
			putQueryParameter("PhoneRegion", phoneRegion);
		}
	}

	public List<CustomFields> getCustomFields() {
		return this.customFields;
	}

	public void setCustomFields(List<CustomFields> customFields) {
		this.customFields = customFields;	
		if (customFields != null) {
			for (int depth1 = 0; depth1 < customFields.size(); depth1++) {
				if (customFields.get(depth1) != null) {
					
						putQueryParameter("CustomFields." + (depth1 + 1) + ".FieldName" , customFields.get(depth1).getFieldName());
						putQueryParameter("CustomFields." + (depth1 + 1) + ".FieldValue" , customFields.get(depth1).getFieldValue());
						putQueryParameter("CustomFields." + (depth1 + 1) + ".Operation" , customFields.get(depth1).getOperation());
				}
			}
		}	
	}

	public Boolean getPhoneNumberVerified() {
		return this.phoneNumberVerified;
	}

	public void setPhoneNumberVerified(Boolean phoneNumberVerified) {
		this.phoneNumberVerified = phoneNumberVerified;
		if(phoneNumberVerified != null){
			putQueryParameter("PhoneNumberVerified", phoneNumberVerified.toString());
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

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getDisplayName() {
		return this.displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
		if(displayName != null){
			putQueryParameter("DisplayName", displayName);
		}
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
		if(username != null){
			putQueryParameter("Username", username);
		}
	}

	public Boolean getEmailVerified() {
		return this.emailVerified;
	}

	public void setEmailVerified(Boolean emailVerified) {
		this.emailVerified = emailVerified;
		if(emailVerified != null){
			putQueryParameter("EmailVerified", emailVerified.toString());
		}
	}

	public static class CustomFields {

		private String fieldName;

		private String fieldValue;

		private String operation;

		public String getFieldName() {
			return this.fieldName;
		}

		public void setFieldName(String fieldName) {
			this.fieldName = fieldName;
		}

		public String getFieldValue() {
			return this.fieldValue;
		}

		public void setFieldValue(String fieldValue) {
			this.fieldValue = fieldValue;
		}

		public String getOperation() {
			return this.operation;
		}

		public void setOperation(String operation) {
			this.operation = operation;
		}
	}

	@Override
	public Class<UpdateUserResponse> getResponseClass() {
		return UpdateUserResponse.class;
	}

}
