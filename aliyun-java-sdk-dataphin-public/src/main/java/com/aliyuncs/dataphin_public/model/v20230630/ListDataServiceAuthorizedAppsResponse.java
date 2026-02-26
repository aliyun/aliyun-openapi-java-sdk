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
import com.aliyuncs.dataphin_public.transform.v20230630.ListDataServiceAuthorizedAppsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDataServiceAuthorizedAppsResponse extends AcsResponse {

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

		private List<AuthorizedApp> authorizedAppList;

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<AuthorizedApp> getAuthorizedAppList() {
			return this.authorizedAppList;
		}

		public void setAuthorizedAppList(List<AuthorizedApp> authorizedAppList) {
			this.authorizedAppList = authorizedAppList;
		}

		public static class AuthorizedApp {

			private String owner;

			private Boolean realHasOwnerPrivilege;

			private String expireDate;

			private String projectName;

			private Integer projectId;

			private Integer revocableDetail;

			private String appName;

			private String applyUserId;

			private String applyUserName;

			private Integer appId;

			private Boolean realHasPrivilege;

			private Integer privilegeAccount;

			private String ownerUserName;

			private Boolean isProjectManager;

			private Integer id;

			private Boolean revocable;

			private Integer privilegeType;

			private List<RemarkForDebug> remarkForDebugList;

			public String getOwner() {
				return this.owner;
			}

			public void setOwner(String owner) {
				this.owner = owner;
			}

			public Boolean getRealHasOwnerPrivilege() {
				return this.realHasOwnerPrivilege;
			}

			public void setRealHasOwnerPrivilege(Boolean realHasOwnerPrivilege) {
				this.realHasOwnerPrivilege = realHasOwnerPrivilege;
			}

			public String getExpireDate() {
				return this.expireDate;
			}

			public void setExpireDate(String expireDate) {
				this.expireDate = expireDate;
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

			public Integer getRevocableDetail() {
				return this.revocableDetail;
			}

			public void setRevocableDetail(Integer revocableDetail) {
				this.revocableDetail = revocableDetail;
			}

			public String getAppName() {
				return this.appName;
			}

			public void setAppName(String appName) {
				this.appName = appName;
			}

			public String getApplyUserId() {
				return this.applyUserId;
			}

			public void setApplyUserId(String applyUserId) {
				this.applyUserId = applyUserId;
			}

			public String getApplyUserName() {
				return this.applyUserName;
			}

			public void setApplyUserName(String applyUserName) {
				this.applyUserName = applyUserName;
			}

			public Integer getAppId() {
				return this.appId;
			}

			public void setAppId(Integer appId) {
				this.appId = appId;
			}

			public Boolean getRealHasPrivilege() {
				return this.realHasPrivilege;
			}

			public void setRealHasPrivilege(Boolean realHasPrivilege) {
				this.realHasPrivilege = realHasPrivilege;
			}

			public Integer getPrivilegeAccount() {
				return this.privilegeAccount;
			}

			public void setPrivilegeAccount(Integer privilegeAccount) {
				this.privilegeAccount = privilegeAccount;
			}

			public String getOwnerUserName() {
				return this.ownerUserName;
			}

			public void setOwnerUserName(String ownerUserName) {
				this.ownerUserName = ownerUserName;
			}

			public Boolean getIsProjectManager() {
				return this.isProjectManager;
			}

			public void setIsProjectManager(Boolean isProjectManager) {
				this.isProjectManager = isProjectManager;
			}

			public Integer getId() {
				return this.id;
			}

			public void setId(Integer id) {
				this.id = id;
			}

			public Boolean getRevocable() {
				return this.revocable;
			}

			public void setRevocable(Boolean revocable) {
				this.revocable = revocable;
			}

			public Integer getPrivilegeType() {
				return this.privilegeType;
			}

			public void setPrivilegeType(Integer privilegeType) {
				this.privilegeType = privilegeType;
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
	public ListDataServiceAuthorizedAppsResponse getInstance(UnmarshallerContext context) {
		return	ListDataServiceAuthorizedAppsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
