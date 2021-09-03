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

package com.aliyuncs.retailadvqa_public.model.v20200515;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.retailadvqa_public.transform.v20200515.GetTokenPayLoadByCheckResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTokenPayLoadByCheckResponse extends AcsResponse {

	private String requestId;

	private String errorCode;

	private String errorDesc;

	private Boolean success;

	private String traceId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorDesc() {
		return this.errorDesc;
	}

	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getTraceId() {
		return this.traceId;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String aud;

		private String audName;

		private String role;

		private String roleSign;

		private String dbRegion;

		private String tenantRegion;

		private String purchasePackage;

		private String purchasePackageQuota;

		private String mainAccount;

		private String mainAccountUid;

		private String userId;

		private String nickName;

		private String workspaceId;

		private String language;

		private List<WorkspacesItem> workspaces;

		public String getAud() {
			return this.aud;
		}

		public void setAud(String aud) {
			this.aud = aud;
		}

		public String getAudName() {
			return this.audName;
		}

		public void setAudName(String audName) {
			this.audName = audName;
		}

		public String getRole() {
			return this.role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public String getRoleSign() {
			return this.roleSign;
		}

		public void setRoleSign(String roleSign) {
			this.roleSign = roleSign;
		}

		public String getDbRegion() {
			return this.dbRegion;
		}

		public void setDbRegion(String dbRegion) {
			this.dbRegion = dbRegion;
		}

		public String getTenantRegion() {
			return this.tenantRegion;
		}

		public void setTenantRegion(String tenantRegion) {
			this.tenantRegion = tenantRegion;
		}

		public String getPurchasePackage() {
			return this.purchasePackage;
		}

		public void setPurchasePackage(String purchasePackage) {
			this.purchasePackage = purchasePackage;
		}

		public String getPurchasePackageQuota() {
			return this.purchasePackageQuota;
		}

		public void setPurchasePackageQuota(String purchasePackageQuota) {
			this.purchasePackageQuota = purchasePackageQuota;
		}

		public String getMainAccount() {
			return this.mainAccount;
		}

		public void setMainAccount(String mainAccount) {
			this.mainAccount = mainAccount;
		}

		public String getMainAccountUid() {
			return this.mainAccountUid;
		}

		public void setMainAccountUid(String mainAccountUid) {
			this.mainAccountUid = mainAccountUid;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getNickName() {
			return this.nickName;
		}

		public void setNickName(String nickName) {
			this.nickName = nickName;
		}

		public String getWorkspaceId() {
			return this.workspaceId;
		}

		public void setWorkspaceId(String workspaceId) {
			this.workspaceId = workspaceId;
		}

		public String getLanguage() {
			return this.language;
		}

		public void setLanguage(String language) {
			this.language = language;
		}

		public List<WorkspacesItem> getWorkspaces() {
			return this.workspaces;
		}

		public void setWorkspaces(List<WorkspacesItem> workspaces) {
			this.workspaces = workspaces;
		}

		public static class WorkspacesItem {

			private String roleId;

			private String name;

			private String id;

			public String getRoleId() {
				return this.roleId;
			}

			public void setRoleId(String roleId) {
				this.roleId = roleId;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}
		}
	}

	@Override
	public GetTokenPayLoadByCheckResponse getInstance(UnmarshallerContext context) {
		return	GetTokenPayLoadByCheckResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
