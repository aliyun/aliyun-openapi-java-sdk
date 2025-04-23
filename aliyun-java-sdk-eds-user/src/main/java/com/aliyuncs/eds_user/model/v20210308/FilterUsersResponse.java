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

package com.aliyuncs.eds_user.model.v20210308;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eds_user.transform.v20210308.FilterUsersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class FilterUsersResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private List<Data> users;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public List<Data> getUsers() {
		return this.users;
	}

	public void setUsers(List<Data> users) {
		this.users = users;
	}

	public static class Data {

		private Long id;

		private String endUserId;

		private String email;

		private String phone;

		private Long status;

		private Long desktopCount;

		private Long desktopGroupCount;

		private String ownerType;

		private String remark;

		private Boolean isTenantManager;

		private Boolean enableAdminAccess;

		private String realNickName;

		private String autoLockTime;

		private Integer passwordExpireDays;

		private Integer passwordExpireRestDays;

		private List<UserSetPropertiesModelsItem> userSetPropertiesModels;

		private List<OrgListItem> orgList;

		private List<IdpInfo> supportLoginIdps;

		private ExternalInfo externalInfo;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getEndUserId() {
			return this.endUserId;
		}

		public void setEndUserId(String endUserId) {
			this.endUserId = endUserId;
		}

		public String getEmail() {
			return this.email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPhone() {
			return this.phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public Long getStatus() {
			return this.status;
		}

		public void setStatus(Long status) {
			this.status = status;
		}

		public Long getDesktopCount() {
			return this.desktopCount;
		}

		public void setDesktopCount(Long desktopCount) {
			this.desktopCount = desktopCount;
		}

		public Long getDesktopGroupCount() {
			return this.desktopGroupCount;
		}

		public void setDesktopGroupCount(Long desktopGroupCount) {
			this.desktopGroupCount = desktopGroupCount;
		}

		public String getOwnerType() {
			return this.ownerType;
		}

		public void setOwnerType(String ownerType) {
			this.ownerType = ownerType;
		}

		public String getRemark() {
			return this.remark;
		}

		public void setRemark(String remark) {
			this.remark = remark;
		}

		public Boolean getIsTenantManager() {
			return this.isTenantManager;
		}

		public void setIsTenantManager(Boolean isTenantManager) {
			this.isTenantManager = isTenantManager;
		}

		public Boolean getEnableAdminAccess() {
			return this.enableAdminAccess;
		}

		public void setEnableAdminAccess(Boolean enableAdminAccess) {
			this.enableAdminAccess = enableAdminAccess;
		}

		public String getRealNickName() {
			return this.realNickName;
		}

		public void setRealNickName(String realNickName) {
			this.realNickName = realNickName;
		}

		public String getAutoLockTime() {
			return this.autoLockTime;
		}

		public void setAutoLockTime(String autoLockTime) {
			this.autoLockTime = autoLockTime;
		}

		public Integer getPasswordExpireDays() {
			return this.passwordExpireDays;
		}

		public void setPasswordExpireDays(Integer passwordExpireDays) {
			this.passwordExpireDays = passwordExpireDays;
		}

		public Integer getPasswordExpireRestDays() {
			return this.passwordExpireRestDays;
		}

		public void setPasswordExpireRestDays(Integer passwordExpireRestDays) {
			this.passwordExpireRestDays = passwordExpireRestDays;
		}

		public List<UserSetPropertiesModelsItem> getUserSetPropertiesModels() {
			return this.userSetPropertiesModels;
		}

		public void setUserSetPropertiesModels(List<UserSetPropertiesModelsItem> userSetPropertiesModels) {
			this.userSetPropertiesModels = userSetPropertiesModels;
		}

		public List<OrgListItem> getOrgList() {
			return this.orgList;
		}

		public void setOrgList(List<OrgListItem> orgList) {
			this.orgList = orgList;
		}

		public List<IdpInfo> getSupportLoginIdps() {
			return this.supportLoginIdps;
		}

		public void setSupportLoginIdps(List<IdpInfo> supportLoginIdps) {
			this.supportLoginIdps = supportLoginIdps;
		}

		public ExternalInfo getExternalInfo() {
			return this.externalInfo;
		}

		public void setExternalInfo(ExternalInfo externalInfo) {
			this.externalInfo = externalInfo;
		}

		public static class UserSetPropertiesModelsItem {

			private Long userId;

			private String userName;

			private Long propertyId;

			private String propertyKey;

			private Integer propertyType;

			private List<PropertyValuesItem> propertyValues;

			public Long getUserId() {
				return this.userId;
			}

			public void setUserId(Long userId) {
				this.userId = userId;
			}

			public String getUserName() {
				return this.userName;
			}

			public void setUserName(String userName) {
				this.userName = userName;
			}

			public Long getPropertyId() {
				return this.propertyId;
			}

			public void setPropertyId(Long propertyId) {
				this.propertyId = propertyId;
			}

			public String getPropertyKey() {
				return this.propertyKey;
			}

			public void setPropertyKey(String propertyKey) {
				this.propertyKey = propertyKey;
			}

			public Integer getPropertyType() {
				return this.propertyType;
			}

			public void setPropertyType(Integer propertyType) {
				this.propertyType = propertyType;
			}

			public List<PropertyValuesItem> getPropertyValues() {
				return this.propertyValues;
			}

			public void setPropertyValues(List<PropertyValuesItem> propertyValues) {
				this.propertyValues = propertyValues;
			}

			public static class PropertyValuesItem {

				private Long propertyValueId;

				private String propertyValue;

				public Long getPropertyValueId() {
					return this.propertyValueId;
				}

				public void setPropertyValueId(Long propertyValueId) {
					this.propertyValueId = propertyValueId;
				}

				public String getPropertyValue() {
					return this.propertyValue;
				}

				public void setPropertyValue(String propertyValue) {
					this.propertyValue = propertyValue;
				}
			}
		}

		public static class OrgListItem {

			private String orgId;

			private String orgName;

			public String getOrgId() {
				return this.orgId;
			}

			public void setOrgId(String orgId) {
				this.orgId = orgId;
			}

			public String getOrgName() {
				return this.orgName;
			}

			public void setOrgName(String orgName) {
				this.orgName = orgName;
			}
		}

		public static class IdpInfo {

			private String idpId;

			private String idpName;

			public String getIdpId() {
				return this.idpId;
			}

			public void setIdpId(String idpId) {
				this.idpId = idpId;
			}

			public String getIdpName() {
				return this.idpName;
			}

			public void setIdpName(String idpName) {
				this.idpName = idpName;
			}
		}

		public static class ExternalInfo {

			private String externalName;

			private String jobNumber;

			public String getExternalName() {
				return this.externalName;
			}

			public void setExternalName(String externalName) {
				this.externalName = externalName;
			}

			public String getJobNumber() {
				return this.jobNumber;
			}

			public void setJobNumber(String jobNumber) {
				this.jobNumber = jobNumber;
			}
		}
	}

	@Override
	public FilterUsersResponse getInstance(UnmarshallerContext context) {
		return	FilterUsersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
