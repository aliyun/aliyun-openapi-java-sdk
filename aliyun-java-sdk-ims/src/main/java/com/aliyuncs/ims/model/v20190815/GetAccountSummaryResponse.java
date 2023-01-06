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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ims.transform.v20190815.GetAccountSummaryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAccountSummaryResponse extends AcsResponse {

	private String requestId;

	private SummaryMap summaryMap;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public SummaryMap getSummaryMap() {
		return this.summaryMap;
	}

	public void setSummaryMap(SummaryMap summaryMap) {
		this.summaryMap = summaryMap;
	}

	public static class SummaryMap {

		private Integer mFADevices;

		private Integer accessKeysPerUserQuota;

		private Integer attachedPoliciesPerGroupQuota;

		private Integer attachedSystemPoliciesPerRoleQuota;

		private Integer attachedPoliciesPerRoleQuota;

		private Integer groupsPerUserQuota;

		private Integer roles;

		private Integer policySizeQuota;

		private Integer attachedSystemPoliciesPerGroupQuota;

		private Integer attachedSystemPoliciesPerUserQuota;

		private Integer attachedPoliciesPerUserQuota;

		private Integer groupsQuota;

		private Integer groups;

		private Integer policiesQuota;

		private Integer virtualMFADevicesQuota;

		private Integer versionsPerPolicyQuota;

		private Integer rolesQuota;

		private Integer usersQuota;

		private Integer policies;

		private Integer users;

		private Integer mFADevicesInUse;

		public Integer getMFADevices() {
			return this.mFADevices;
		}

		public void setMFADevices(Integer mFADevices) {
			this.mFADevices = mFADevices;
		}

		public Integer getAccessKeysPerUserQuota() {
			return this.accessKeysPerUserQuota;
		}

		public void setAccessKeysPerUserQuota(Integer accessKeysPerUserQuota) {
			this.accessKeysPerUserQuota = accessKeysPerUserQuota;
		}

		public Integer getAttachedPoliciesPerGroupQuota() {
			return this.attachedPoliciesPerGroupQuota;
		}

		public void setAttachedPoliciesPerGroupQuota(Integer attachedPoliciesPerGroupQuota) {
			this.attachedPoliciesPerGroupQuota = attachedPoliciesPerGroupQuota;
		}

		public Integer getAttachedSystemPoliciesPerRoleQuota() {
			return this.attachedSystemPoliciesPerRoleQuota;
		}

		public void setAttachedSystemPoliciesPerRoleQuota(Integer attachedSystemPoliciesPerRoleQuota) {
			this.attachedSystemPoliciesPerRoleQuota = attachedSystemPoliciesPerRoleQuota;
		}

		public Integer getAttachedPoliciesPerRoleQuota() {
			return this.attachedPoliciesPerRoleQuota;
		}

		public void setAttachedPoliciesPerRoleQuota(Integer attachedPoliciesPerRoleQuota) {
			this.attachedPoliciesPerRoleQuota = attachedPoliciesPerRoleQuota;
		}

		public Integer getGroupsPerUserQuota() {
			return this.groupsPerUserQuota;
		}

		public void setGroupsPerUserQuota(Integer groupsPerUserQuota) {
			this.groupsPerUserQuota = groupsPerUserQuota;
		}

		public Integer getRoles() {
			return this.roles;
		}

		public void setRoles(Integer roles) {
			this.roles = roles;
		}

		public Integer getPolicySizeQuota() {
			return this.policySizeQuota;
		}

		public void setPolicySizeQuota(Integer policySizeQuota) {
			this.policySizeQuota = policySizeQuota;
		}

		public Integer getAttachedSystemPoliciesPerGroupQuota() {
			return this.attachedSystemPoliciesPerGroupQuota;
		}

		public void setAttachedSystemPoliciesPerGroupQuota(Integer attachedSystemPoliciesPerGroupQuota) {
			this.attachedSystemPoliciesPerGroupQuota = attachedSystemPoliciesPerGroupQuota;
		}

		public Integer getAttachedSystemPoliciesPerUserQuota() {
			return this.attachedSystemPoliciesPerUserQuota;
		}

		public void setAttachedSystemPoliciesPerUserQuota(Integer attachedSystemPoliciesPerUserQuota) {
			this.attachedSystemPoliciesPerUserQuota = attachedSystemPoliciesPerUserQuota;
		}

		public Integer getAttachedPoliciesPerUserQuota() {
			return this.attachedPoliciesPerUserQuota;
		}

		public void setAttachedPoliciesPerUserQuota(Integer attachedPoliciesPerUserQuota) {
			this.attachedPoliciesPerUserQuota = attachedPoliciesPerUserQuota;
		}

		public Integer getGroupsQuota() {
			return this.groupsQuota;
		}

		public void setGroupsQuota(Integer groupsQuota) {
			this.groupsQuota = groupsQuota;
		}

		public Integer getGroups() {
			return this.groups;
		}

		public void setGroups(Integer groups) {
			this.groups = groups;
		}

		public Integer getPoliciesQuota() {
			return this.policiesQuota;
		}

		public void setPoliciesQuota(Integer policiesQuota) {
			this.policiesQuota = policiesQuota;
		}

		public Integer getVirtualMFADevicesQuota() {
			return this.virtualMFADevicesQuota;
		}

		public void setVirtualMFADevicesQuota(Integer virtualMFADevicesQuota) {
			this.virtualMFADevicesQuota = virtualMFADevicesQuota;
		}

		public Integer getVersionsPerPolicyQuota() {
			return this.versionsPerPolicyQuota;
		}

		public void setVersionsPerPolicyQuota(Integer versionsPerPolicyQuota) {
			this.versionsPerPolicyQuota = versionsPerPolicyQuota;
		}

		public Integer getRolesQuota() {
			return this.rolesQuota;
		}

		public void setRolesQuota(Integer rolesQuota) {
			this.rolesQuota = rolesQuota;
		}

		public Integer getUsersQuota() {
			return this.usersQuota;
		}

		public void setUsersQuota(Integer usersQuota) {
			this.usersQuota = usersQuota;
		}

		public Integer getPolicies() {
			return this.policies;
		}

		public void setPolicies(Integer policies) {
			this.policies = policies;
		}

		public Integer getUsers() {
			return this.users;
		}

		public void setUsers(Integer users) {
			this.users = users;
		}

		public Integer getMFADevicesInUse() {
			return this.mFADevicesInUse;
		}

		public void setMFADevicesInUse(Integer mFADevicesInUse) {
			this.mFADevicesInUse = mFADevicesInUse;
		}
	}

	@Override
	public GetAccountSummaryResponse getInstance(UnmarshallerContext context) {
		return	GetAccountSummaryResponseUnmarshaller.unmarshall(this, context);
	}
}
