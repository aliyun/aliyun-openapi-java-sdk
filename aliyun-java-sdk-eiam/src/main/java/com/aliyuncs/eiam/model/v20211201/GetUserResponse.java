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

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eiam.transform.v20211201.GetUserResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetUserResponse extends AcsResponse {

	private String requestId;

	private User user;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public static class User {

		private String userId;

		private String username;

		private String displayName;

		private Boolean passwordSet;

		private String phoneRegion;

		private String phoneNumber;

		private Boolean phoneVerified;

		private Boolean phoneNumberVerified;

		private String email;

		private Boolean emailVerified;

		private String externalId;

		private String userExternalId;

		private String sourceType;

		private String userSourceType;

		private String sourceId;

		private String userSourceId;

		private String status;

		private Long accountExpireTime;

		private Long registerTime;

		private Long lockExpireTime;

		private Long createTime;

		private Long updateTime;

		private String description;

		private Long aliUid;

		private String instanceId;

		private Boolean locked;

		private String primaryOrganizationalUnitId;

		private Map<Object,Object> extensionAttributes;

		private Long passwordExpireTime;

		private List<OrganizationalUnit> organizationalUnits;

		private List<CustomField> customFields;

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getUsername() {
			return this.username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getDisplayName() {
			return this.displayName;
		}

		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}

		public Boolean getPasswordSet() {
			return this.passwordSet;
		}

		public void setPasswordSet(Boolean passwordSet) {
			this.passwordSet = passwordSet;
		}

		public String getPhoneRegion() {
			return this.phoneRegion;
		}

		public void setPhoneRegion(String phoneRegion) {
			this.phoneRegion = phoneRegion;
		}

		public String getPhoneNumber() {
			return this.phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public Boolean getPhoneVerified() {
			return this.phoneVerified;
		}

		public void setPhoneVerified(Boolean phoneVerified) {
			this.phoneVerified = phoneVerified;
		}

		public Boolean getPhoneNumberVerified() {
			return this.phoneNumberVerified;
		}

		public void setPhoneNumberVerified(Boolean phoneNumberVerified) {
			this.phoneNumberVerified = phoneNumberVerified;
		}

		public String getEmail() {
			return this.email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Boolean getEmailVerified() {
			return this.emailVerified;
		}

		public void setEmailVerified(Boolean emailVerified) {
			this.emailVerified = emailVerified;
		}

		public String getExternalId() {
			return this.externalId;
		}

		public void setExternalId(String externalId) {
			this.externalId = externalId;
		}

		public String getUserExternalId() {
			return this.userExternalId;
		}

		public void setUserExternalId(String userExternalId) {
			this.userExternalId = userExternalId;
		}

		public String getSourceType() {
			return this.sourceType;
		}

		public void setSourceType(String sourceType) {
			this.sourceType = sourceType;
		}

		public String getUserSourceType() {
			return this.userSourceType;
		}

		public void setUserSourceType(String userSourceType) {
			this.userSourceType = userSourceType;
		}

		public String getSourceId() {
			return this.sourceId;
		}

		public void setSourceId(String sourceId) {
			this.sourceId = sourceId;
		}

		public String getUserSourceId() {
			return this.userSourceId;
		}

		public void setUserSourceId(String userSourceId) {
			this.userSourceId = userSourceId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Long getAccountExpireTime() {
			return this.accountExpireTime;
		}

		public void setAccountExpireTime(Long accountExpireTime) {
			this.accountExpireTime = accountExpireTime;
		}

		public Long getRegisterTime() {
			return this.registerTime;
		}

		public void setRegisterTime(Long registerTime) {
			this.registerTime = registerTime;
		}

		public Long getLockExpireTime() {
			return this.lockExpireTime;
		}

		public void setLockExpireTime(Long lockExpireTime) {
			this.lockExpireTime = lockExpireTime;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Long getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(Long updateTime) {
			this.updateTime = updateTime;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Long getAliUid() {
			return this.aliUid;
		}

		public void setAliUid(Long aliUid) {
			this.aliUid = aliUid;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Boolean getLocked() {
			return this.locked;
		}

		public void setLocked(Boolean locked) {
			this.locked = locked;
		}

		public String getPrimaryOrganizationalUnitId() {
			return this.primaryOrganizationalUnitId;
		}

		public void setPrimaryOrganizationalUnitId(String primaryOrganizationalUnitId) {
			this.primaryOrganizationalUnitId = primaryOrganizationalUnitId;
		}

		public Map<Object,Object> getExtensionAttributes() {
			return this.extensionAttributes;
		}

		public void setExtensionAttributes(Map<Object,Object> extensionAttributes) {
			this.extensionAttributes = extensionAttributes;
		}

		public Long getPasswordExpireTime() {
			return this.passwordExpireTime;
		}

		public void setPasswordExpireTime(Long passwordExpireTime) {
			this.passwordExpireTime = passwordExpireTime;
		}

		public List<OrganizationalUnit> getOrganizationalUnits() {
			return this.organizationalUnits;
		}

		public void setOrganizationalUnits(List<OrganizationalUnit> organizationalUnits) {
			this.organizationalUnits = organizationalUnits;
		}

		public List<CustomField> getCustomFields() {
			return this.customFields;
		}

		public void setCustomFields(List<CustomField> customFields) {
			this.customFields = customFields;
		}

		public static class OrganizationalUnit {

			private String organizationalUnitId;

			private String name;

			private String organizationalUnitName;

			private Boolean primary;

			public String getOrganizationalUnitId() {
				return this.organizationalUnitId;
			}

			public void setOrganizationalUnitId(String organizationalUnitId) {
				this.organizationalUnitId = organizationalUnitId;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getOrganizationalUnitName() {
				return this.organizationalUnitName;
			}

			public void setOrganizationalUnitName(String organizationalUnitName) {
				this.organizationalUnitName = organizationalUnitName;
			}

			public Boolean getPrimary() {
				return this.primary;
			}

			public void setPrimary(Boolean primary) {
				this.primary = primary;
			}
		}

		public static class CustomField {

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
	}

	@Override
	public GetUserResponse getInstance(UnmarshallerContext context) {
		return	GetUserResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
