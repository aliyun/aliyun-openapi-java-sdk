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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ram.transform.v20150501.ListEntitiesForPolicyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListEntitiesForPolicyResponse extends AcsResponse {

	private String requestId;

	private List<Group> groups;

	private List<Role> roles;

	private List<User> users;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Group> getGroups() {
		return this.groups;
	}

	public void setGroups(List<Group> groups) {
		this.groups = groups;
	}

	public List<Role> getRoles() {
		return this.roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public List<User> getUsers() {
		return this.users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public static class Group {

		private String groupName;

		private String comments;

		private String attachDate;

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}

		public String getComments() {
			return this.comments;
		}

		public void setComments(String comments) {
			this.comments = comments;
		}

		public String getAttachDate() {
			return this.attachDate;
		}

		public void setAttachDate(String attachDate) {
			this.attachDate = attachDate;
		}
	}

	public static class Role {

		private String description;

		private String roleName;

		private String attachDate;

		private String arn;

		private String roleId;

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getRoleName() {
			return this.roleName;
		}

		public void setRoleName(String roleName) {
			this.roleName = roleName;
		}

		public String getAttachDate() {
			return this.attachDate;
		}

		public void setAttachDate(String attachDate) {
			this.attachDate = attachDate;
		}

		public String getArn() {
			return this.arn;
		}

		public void setArn(String arn) {
			this.arn = arn;
		}

		public String getRoleId() {
			return this.roleId;
		}

		public void setRoleId(String roleId) {
			this.roleId = roleId;
		}
	}

	public static class User {

		private String displayName;

		private String userId;

		private String userName;

		private String attachDate;

		public String getDisplayName() {
			return this.displayName;
		}

		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getUserName() {
			return this.userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getAttachDate() {
			return this.attachDate;
		}

		public void setAttachDate(String attachDate) {
			this.attachDate = attachDate;
		}
	}

	@Override
	public ListEntitiesForPolicyResponse getInstance(UnmarshallerContext context) {
		return	ListEntitiesForPolicyResponseUnmarshaller.unmarshall(this, context);
	}
}
