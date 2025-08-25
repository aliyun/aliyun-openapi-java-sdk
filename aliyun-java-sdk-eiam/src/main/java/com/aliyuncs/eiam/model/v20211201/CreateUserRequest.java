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
public class CreateUserRequest extends RpcAcsRequest<CreateUserResponse> {
	   

	private String clientToken;

	private String phoneNumber;

	private String description;

	private String phoneRegion;

	private List<CustomFields> customFields;

	private String password;

	private PasswordInitializationConfig passwordInitializationConfig;

	private Boolean phoneNumberVerified;

	private String email;

	private String primaryOrganizationalUnitId;

	private List<String> organizationalUnitIds;

	private String userExternalId;

	private String instanceId;

	private String displayName;

	private String username;

	private Boolean emailVerified;
	public CreateUserRequest() {
		super("Eiam", "2021-12-01", "CreateUser", "eiam");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
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
				}
			}
		}	
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

	public PasswordInitializationConfig getPasswordInitializationConfig() {
		return this.passwordInitializationConfig;
	}

	public void setPasswordInitializationConfig(PasswordInitializationConfig passwordInitializationConfig) {
		this.passwordInitializationConfig = passwordInitializationConfig;	
		if (passwordInitializationConfig != null) {
			
				if (passwordInitializationConfig.getUserNotificationChannels() != null) {
					for (int depth1 = 0; depth1 < passwordInitializationConfig.getUserNotificationChannels().size(); depth1++) {
						putQueryParameter("PasswordInitializationConfig.UserNotificationChannels." + (depth1 + 1) , passwordInitializationConfig.getUserNotificationChannels().get(depth1));
					}
				}
				putQueryParameter("PasswordInitializationConfig.PasswordInitializationPolicyPriority" , passwordInitializationConfig.getPasswordInitializationPolicyPriority());
				putQueryParameter("PasswordInitializationConfig.PasswordForcedUpdateStatus" , passwordInitializationConfig.getPasswordForcedUpdateStatus());
				putQueryParameter("PasswordInitializationConfig.PasswordInitializationType" , passwordInitializationConfig.getPasswordInitializationType());
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

	public String getPrimaryOrganizationalUnitId() {
		return this.primaryOrganizationalUnitId;
	}

	public void setPrimaryOrganizationalUnitId(String primaryOrganizationalUnitId) {
		this.primaryOrganizationalUnitId = primaryOrganizationalUnitId;
		if(primaryOrganizationalUnitId != null){
			putQueryParameter("PrimaryOrganizationalUnitId", primaryOrganizationalUnitId);
		}
	}

	public List<String> getOrganizationalUnitIds() {
		return this.organizationalUnitIds;
	}

	public void setOrganizationalUnitIds(List<String> organizationalUnitIds) {
		this.organizationalUnitIds = organizationalUnitIds;	
		if (organizationalUnitIds != null) {
			for (int depth1 = 0; depth1 < organizationalUnitIds.size(); depth1++) {
				putQueryParameter("OrganizationalUnitIds." + (depth1 + 1) , organizationalUnitIds.get(depth1));
			}
		}	
	}

	public String getUserExternalId() {
		return this.userExternalId;
	}

	public void setUserExternalId(String userExternalId) {
		this.userExternalId = userExternalId;
		if(userExternalId != null){
			putQueryParameter("UserExternalId", userExternalId);
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
	}

	public static class PasswordInitializationConfig {

		private List<String> userNotificationChannels;

		private String passwordInitializationPolicyPriority;

		private String passwordForcedUpdateStatus;

		private String passwordInitializationType;

		public List<String> getUserNotificationChannels() {
			return this.userNotificationChannels;
		}

		public void setUserNotificationChannels(List<String> userNotificationChannels) {
			this.userNotificationChannels = userNotificationChannels;
		}

		public String getPasswordInitializationPolicyPriority() {
			return this.passwordInitializationPolicyPriority;
		}

		public void setPasswordInitializationPolicyPriority(String passwordInitializationPolicyPriority) {
			this.passwordInitializationPolicyPriority = passwordInitializationPolicyPriority;
		}

		public String getPasswordForcedUpdateStatus() {
			return this.passwordForcedUpdateStatus;
		}

		public void setPasswordForcedUpdateStatus(String passwordForcedUpdateStatus) {
			this.passwordForcedUpdateStatus = passwordForcedUpdateStatus;
		}

		public String getPasswordInitializationType() {
			return this.passwordInitializationType;
		}

		public void setPasswordInitializationType(String passwordInitializationType) {
			this.passwordInitializationType = passwordInitializationType;
		}
	}

	@Override
	public Class<CreateUserResponse> getResponseClass() {
		return CreateUserResponse.class;
	}

}
