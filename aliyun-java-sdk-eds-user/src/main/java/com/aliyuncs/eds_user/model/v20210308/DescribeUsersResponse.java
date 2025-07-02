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
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eds_user.transform.v20210308.DescribeUsersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeUsersResponse extends AcsResponse {

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

		private String ownerType;

		private String remark;

		private String orgId;

		private String wyId;

		private Boolean isTenantManager;

		private String avatar;

		private String address;

		private String nickName;

		private String realNickName;

		private String jobNumber;

		private String externalName;

		private List<Group> groups;

		private List<Org> orgs;

		private List<Property> properties;

		private Extras extras;

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

		public String getOrgId() {
			return this.orgId;
		}

		public void setOrgId(String orgId) {
			this.orgId = orgId;
		}

		public String getWyId() {
			return this.wyId;
		}

		public void setWyId(String wyId) {
			this.wyId = wyId;
		}

		public Boolean getIsTenantManager() {
			return this.isTenantManager;
		}

		public void setIsTenantManager(Boolean isTenantManager) {
			this.isTenantManager = isTenantManager;
		}

		public String getAvatar() {
			return this.avatar;
		}

		public void setAvatar(String avatar) {
			this.avatar = avatar;
		}

		public String getAddress() {
			return this.address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getNickName() {
			return this.nickName;
		}

		public void setNickName(String nickName) {
			this.nickName = nickName;
		}

		public String getRealNickName() {
			return this.realNickName;
		}

		public void setRealNickName(String realNickName) {
			this.realNickName = realNickName;
		}

		public String getJobNumber() {
			return this.jobNumber;
		}

		public void setJobNumber(String jobNumber) {
			this.jobNumber = jobNumber;
		}

		public String getExternalName() {
			return this.externalName;
		}

		public void setExternalName(String externalName) {
			this.externalName = externalName;
		}

		public List<Group> getGroups() {
			return this.groups;
		}

		public void setGroups(List<Group> groups) {
			this.groups = groups;
		}

		public List<Org> getOrgs() {
			return this.orgs;
		}

		public void setOrgs(List<Org> orgs) {
			this.orgs = orgs;
		}

		public List<Property> getProperties() {
			return this.properties;
		}

		public void setProperties(List<Property> properties) {
			this.properties = properties;
		}

		public Extras getExtras() {
			return this.extras;
		}

		public void setExtras(Extras extras) {
			this.extras = extras;
		}

		public static class Group {

			private String groupId;

			private String groupName;

			public String getGroupId() {
				return this.groupId;
			}

			public void setGroupId(String groupId) {
				this.groupId = groupId;
			}

			public String getGroupName() {
				return this.groupName;
			}

			public void setGroupName(String groupName) {
				this.groupName = groupName;
			}
		}

		public static class Org {

			private String orgId;

			private String orgName;

			private String orgNamePath;

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

			public String getOrgNamePath() {
				return this.orgNamePath;
			}

			public void setOrgNamePath(String orgNamePath) {
				this.orgNamePath = orgNamePath;
			}
		}

		public static class Property {

			private String key;

			private String value;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}

		public static class Extras {

			private Map<Object,Object> assignedResourceCount;

			public Map<Object,Object> getAssignedResourceCount() {
				return this.assignedResourceCount;
			}

			public void setAssignedResourceCount(Map<Object,Object> assignedResourceCount) {
				this.assignedResourceCount = assignedResourceCount;
			}
		}
	}

	@Override
	public DescribeUsersResponse getInstance(UnmarshallerContext context) {
		return	DescribeUsersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
