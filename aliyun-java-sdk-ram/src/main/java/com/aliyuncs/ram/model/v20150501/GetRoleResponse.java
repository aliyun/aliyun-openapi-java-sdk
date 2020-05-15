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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ram.transform.v20150501.GetRoleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetRoleResponse extends AcsResponse {

	private String requestId;

	private Role role;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public static class Role {

		private String roleId;

		private String roleName;

		private String arn;

		private String description;

		private String assumeRolePolicyDocument;

		private String createDate;

		private String updateDate;

		private Long maxSessionDuration;

		public String getRoleId() {
			return this.roleId;
		}

		public void setRoleId(String roleId) {
			this.roleId = roleId;
		}

		public String getRoleName() {
			return this.roleName;
		}

		public void setRoleName(String roleName) {
			this.roleName = roleName;
		}

		public String getArn() {
			return this.arn;
		}

		public void setArn(String arn) {
			this.arn = arn;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getAssumeRolePolicyDocument() {
			return this.assumeRolePolicyDocument;
		}

		public void setAssumeRolePolicyDocument(String assumeRolePolicyDocument) {
			this.assumeRolePolicyDocument = assumeRolePolicyDocument;
		}

		public String getCreateDate() {
			return this.createDate;
		}

		public void setCreateDate(String createDate) {
			this.createDate = createDate;
		}

		public String getUpdateDate() {
			return this.updateDate;
		}

		public void setUpdateDate(String updateDate) {
			this.updateDate = updateDate;
		}

		public Long getMaxSessionDuration() {
			return this.maxSessionDuration;
		}

		public void setMaxSessionDuration(Long maxSessionDuration) {
			this.maxSessionDuration = maxSessionDuration;
		}
	}

	@Override
	public GetRoleResponse getInstance(UnmarshallerContext context) {
		return	GetRoleResponseUnmarshaller.unmarshall(this, context);
	}
}
