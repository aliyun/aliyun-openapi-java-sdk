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

package com.aliyuncs.quickbi_public.model.v20220101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.quickbi_public.transform.v20220101.ListWorkspaceUserRolesByUserIdResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListWorkspaceUserRolesByUserIdResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private List<Data> result;

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

	public List<Data> getResult() {
		return this.result;
	}

	public void setResult(List<Data> result) {
		this.result = result;
	}

	public static class Data {

		private String workspaceId;

		private String workspaceName;

		private RoleModel roleModel;

		public String getWorkspaceId() {
			return this.workspaceId;
		}

		public void setWorkspaceId(String workspaceId) {
			this.workspaceId = workspaceId;
		}

		public String getWorkspaceName() {
			return this.workspaceName;
		}

		public void setWorkspaceName(String workspaceName) {
			this.workspaceName = workspaceName;
		}

		public RoleModel getRoleModel() {
			return this.roleModel;
		}

		public void setRoleModel(RoleModel roleModel) {
			this.roleModel = roleModel;
		}

		public static class RoleModel {

			private String roleId;

			private String roleCode;

			private String roleName;

			public String getRoleId() {
				return this.roleId;
			}

			public void setRoleId(String roleId) {
				this.roleId = roleId;
			}

			public String getRoleCode() {
				return this.roleCode;
			}

			public void setRoleCode(String roleCode) {
				this.roleCode = roleCode;
			}

			public String getRoleName() {
				return this.roleName;
			}

			public void setRoleName(String roleName) {
				this.roleName = roleName;
			}
		}
	}

	@Override
	public ListWorkspaceUserRolesByUserIdResponse getInstance(UnmarshallerContext context) {
		return	ListWorkspaceUserRolesByUserIdResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
