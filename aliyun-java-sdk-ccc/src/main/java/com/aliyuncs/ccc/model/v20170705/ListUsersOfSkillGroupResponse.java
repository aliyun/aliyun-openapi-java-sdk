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

package com.aliyuncs.ccc.model.v20170705;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ccc.transform.v20170705.ListUsersOfSkillGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListUsersOfSkillGroupResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private Users users;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public static class Users {

		private Integer totalCount;

		private Integer pageNumber;

		private Integer pageSize;

		private List<User> list;

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public Integer getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Integer pageNumber) {
			this.pageNumber = pageNumber;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public List<User> getList() {
			return this.list;
		}

		public void setList(List<User> list) {
			this.list = list;
		}

		public static class User {

			private String userId;

			private String ramId;

			private String instanceId;

			private List<Role> roles;

			private List<SkillLevel> skillLevels;

			private Detail detail;

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public String getRamId() {
				return this.ramId;
			}

			public void setRamId(String ramId) {
				this.ramId = ramId;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public List<Role> getRoles() {
				return this.roles;
			}

			public void setRoles(List<Role> roles) {
				this.roles = roles;
			}

			public List<SkillLevel> getSkillLevels() {
				return this.skillLevels;
			}

			public void setSkillLevels(List<SkillLevel> skillLevels) {
				this.skillLevels = skillLevels;
			}

			public Detail getDetail() {
				return this.detail;
			}

			public void setDetail(Detail detail) {
				this.detail = detail;
			}

			public static class Role {

				private String roleId;

				private String instanceId;

				private String roleName;

				private String roleDescription;

				private Integer userCount;

				private List<Privilege> privileges;

				public String getRoleId() {
					return this.roleId;
				}

				public void setRoleId(String roleId) {
					this.roleId = roleId;
				}

				public String getInstanceId() {
					return this.instanceId;
				}

				public void setInstanceId(String instanceId) {
					this.instanceId = instanceId;
				}

				public String getRoleName() {
					return this.roleName;
				}

				public void setRoleName(String roleName) {
					this.roleName = roleName;
				}

				public String getRoleDescription() {
					return this.roleDescription;
				}

				public void setRoleDescription(String roleDescription) {
					this.roleDescription = roleDescription;
				}

				public Integer getUserCount() {
					return this.userCount;
				}

				public void setUserCount(Integer userCount) {
					this.userCount = userCount;
				}

				public List<Privilege> getPrivileges() {
					return this.privileges;
				}

				public void setPrivileges(List<Privilege> privileges) {
					this.privileges = privileges;
				}

				public static class Privilege {

					private String privilegeId;

					private String privilegeName;

					private String privilegeDescription;

					public String getPrivilegeId() {
						return this.privilegeId;
					}

					public void setPrivilegeId(String privilegeId) {
						this.privilegeId = privilegeId;
					}

					public String getPrivilegeName() {
						return this.privilegeName;
					}

					public void setPrivilegeName(String privilegeName) {
						this.privilegeName = privilegeName;
					}

					public String getPrivilegeDescription() {
						return this.privilegeDescription;
					}

					public void setPrivilegeDescription(String privilegeDescription) {
						this.privilegeDescription = privilegeDescription;
					}
				}
			}

			public static class SkillLevel {

				private String skillLevelId;

				private Integer level;

				private Skill skill;

				public String getSkillLevelId() {
					return this.skillLevelId;
				}

				public void setSkillLevelId(String skillLevelId) {
					this.skillLevelId = skillLevelId;
				}

				public Integer getLevel() {
					return this.level;
				}

				public void setLevel(Integer level) {
					this.level = level;
				}

				public Skill getSkill() {
					return this.skill;
				}

				public void setSkill(Skill skill) {
					this.skill = skill;
				}

				public static class Skill {

					private String skillGroupId;

					private String instanceId;

					private String skillGroupName;

					private String skillGroupDescription;

					public String getSkillGroupId() {
						return this.skillGroupId;
					}

					public void setSkillGroupId(String skillGroupId) {
						this.skillGroupId = skillGroupId;
					}

					public String getInstanceId() {
						return this.instanceId;
					}

					public void setInstanceId(String instanceId) {
						this.instanceId = instanceId;
					}

					public String getSkillGroupName() {
						return this.skillGroupName;
					}

					public void setSkillGroupName(String skillGroupName) {
						this.skillGroupName = skillGroupName;
					}

					public String getSkillGroupDescription() {
						return this.skillGroupDescription;
					}

					public void setSkillGroupDescription(String skillGroupDescription) {
						this.skillGroupDescription = skillGroupDescription;
					}
				}
			}

			public static class Detail {

				private String loginName;

				private String displayName;

				private String phone;

				private String email;

				private String department;

				public String getLoginName() {
					return this.loginName;
				}

				public void setLoginName(String loginName) {
					this.loginName = loginName;
				}

				public String getDisplayName() {
					return this.displayName;
				}

				public void setDisplayName(String displayName) {
					this.displayName = displayName;
				}

				public String getPhone() {
					return this.phone;
				}

				public void setPhone(String phone) {
					this.phone = phone;
				}

				public String getEmail() {
					return this.email;
				}

				public void setEmail(String email) {
					this.email = email;
				}

				public String getDepartment() {
					return this.department;
				}

				public void setDepartment(String department) {
					this.department = department;
				}
			}
		}
	}

	@Override
	public ListUsersOfSkillGroupResponse getInstance(UnmarshallerContext context) {
		return	ListUsersOfSkillGroupResponseUnmarshaller.unmarshall(this, context);
	}
}
