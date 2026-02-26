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

package com.aliyuncs.dataphin_public.model.v20230630;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataphin_public.transform.v20230630.ListDataServiceMyAppPermissionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDataServiceMyAppPermissionsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer httpStatusCode;

	private String code;

	private String message;

	private PageResult pageResult;

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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
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

	public PageResult getPageResult() {
		return this.pageResult;
	}

	public void setPageResult(PageResult pageResult) {
		this.pageResult = pageResult;
	}

	public static class PageResult {

		private Integer totalCount;

		private List<Permission> permissionList;

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<Permission> getPermissionList() {
			return this.permissionList;
		}

		public void setPermissionList(List<Permission> permissionList) {
			this.permissionList = permissionList;
		}

		public static class Permission {

			private String owner;

			private String projectName;

			private Integer projectId;

			private String creator;

			private String createUserName;

			private String appName;

			private Integer role;

			private String privilegeBelongTo;

			private Integer appId;

			private Integer privilegeFrom;

			private String ownerUserName;

			private String currentUserRole;

			private List<RemarkForDebug> remarkForDebugList;

			public String getOwner() {
				return this.owner;
			}

			public void setOwner(String owner) {
				this.owner = owner;
			}

			public String getProjectName() {
				return this.projectName;
			}

			public void setProjectName(String projectName) {
				this.projectName = projectName;
			}

			public Integer getProjectId() {
				return this.projectId;
			}

			public void setProjectId(Integer projectId) {
				this.projectId = projectId;
			}

			public String getCreator() {
				return this.creator;
			}

			public void setCreator(String creator) {
				this.creator = creator;
			}

			public String getCreateUserName() {
				return this.createUserName;
			}

			public void setCreateUserName(String createUserName) {
				this.createUserName = createUserName;
			}

			public String getAppName() {
				return this.appName;
			}

			public void setAppName(String appName) {
				this.appName = appName;
			}

			public Integer getRole() {
				return this.role;
			}

			public void setRole(Integer role) {
				this.role = role;
			}

			public String getPrivilegeBelongTo() {
				return this.privilegeBelongTo;
			}

			public void setPrivilegeBelongTo(String privilegeBelongTo) {
				this.privilegeBelongTo = privilegeBelongTo;
			}

			public Integer getAppId() {
				return this.appId;
			}

			public void setAppId(Integer appId) {
				this.appId = appId;
			}

			public Integer getPrivilegeFrom() {
				return this.privilegeFrom;
			}

			public void setPrivilegeFrom(Integer privilegeFrom) {
				this.privilegeFrom = privilegeFrom;
			}

			public String getOwnerUserName() {
				return this.ownerUserName;
			}

			public void setOwnerUserName(String ownerUserName) {
				this.ownerUserName = ownerUserName;
			}

			public String getCurrentUserRole() {
				return this.currentUserRole;
			}

			public void setCurrentUserRole(String currentUserRole) {
				this.currentUserRole = currentUserRole;
			}

			public List<RemarkForDebug> getRemarkForDebugList() {
				return this.remarkForDebugList;
			}

			public void setRemarkForDebugList(List<RemarkForDebug> remarkForDebugList) {
				this.remarkForDebugList = remarkForDebugList;
			}

			public static class RemarkForDebug {

				private String value;

				private String key;

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}

				public String getKey() {
					return this.key;
				}

				public void setKey(String key) {
					this.key = key;
				}
			}
		}
	}

	@Override
	public ListDataServiceMyAppPermissionsResponse getInstance(UnmarshallerContext context) {
		return	ListDataServiceMyAppPermissionsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
