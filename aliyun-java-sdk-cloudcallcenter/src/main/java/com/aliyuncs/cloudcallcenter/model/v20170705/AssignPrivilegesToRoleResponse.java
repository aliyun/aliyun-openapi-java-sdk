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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudcallcenter.transform.v20170705.AssignPrivilegesToRoleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class AssignPrivilegesToRoleResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private Role role;

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

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public static class Role {

		private String roleId;

		private String instanceId;

		private String roleName;

		private String roleDescription;

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

	@Override
	public AssignPrivilegesToRoleResponse getInstance(UnmarshallerContext context) {
		return	AssignPrivilegesToRoleResponseUnmarshaller.unmarshall(this, context);
	}
}
