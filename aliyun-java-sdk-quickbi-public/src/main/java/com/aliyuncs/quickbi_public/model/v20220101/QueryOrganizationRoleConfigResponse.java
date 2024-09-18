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
import com.aliyuncs.quickbi_public.transform.v20220101.QueryOrganizationRoleConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryOrganizationRoleConfigResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Result result;

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

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private Boolean isSystemRole;

		private Long roleId;

		private String roleName;

		private List<AuthConfigListItem> authConfigList;

		public Boolean getIsSystemRole() {
			return this.isSystemRole;
		}

		public void setIsSystemRole(Boolean isSystemRole) {
			this.isSystemRole = isSystemRole;
		}

		public Long getRoleId() {
			return this.roleId;
		}

		public void setRoleId(Long roleId) {
			this.roleId = roleId;
		}

		public String getRoleName() {
			return this.roleName;
		}

		public void setRoleName(String roleName) {
			this.roleName = roleName;
		}

		public List<AuthConfigListItem> getAuthConfigList() {
			return this.authConfigList;
		}

		public void setAuthConfigList(List<AuthConfigListItem> authConfigList) {
			this.authConfigList = authConfigList;
		}

		public static class AuthConfigListItem {

			private String authKey;

			public String getAuthKey() {
				return this.authKey;
			}

			public void setAuthKey(String authKey) {
				this.authKey = authKey;
			}
		}
	}

	@Override
	public QueryOrganizationRoleConfigResponse getInstance(UnmarshallerContext context) {
		return	QueryOrganizationRoleConfigResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
