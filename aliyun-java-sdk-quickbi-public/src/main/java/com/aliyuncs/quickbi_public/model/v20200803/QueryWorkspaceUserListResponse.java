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

package com.aliyuncs.quickbi_public.model.v20200803;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.quickbi_public.transform.v20200803.QueryWorkspaceUserListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryWorkspaceUserListResponse extends AcsResponse {

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

		private Integer totalNum;

		private Integer totalPages;

		private Integer pageSize;

		private Integer pageNum;

		private List<DataItem> data;

		public Integer getTotalNum() {
			return this.totalNum;
		}

		public void setTotalNum(Integer totalNum) {
			this.totalNum = totalNum;
		}

		public Integer getTotalPages() {
			return this.totalPages;
		}

		public void setTotalPages(Integer totalPages) {
			this.totalPages = totalPages;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getPageNum() {
			return this.pageNum;
		}

		public void setPageNum(Integer pageNum) {
			this.pageNum = pageNum;
		}

		public List<DataItem> getData() {
			return this.data;
		}

		public void setData(List<DataItem> data) {
			this.data = data;
		}

		public static class DataItem {

			private String userId;

			private String accountName;

			private String phone;

			private String nickName;

			private String email;

			private String accountId;

			private Role role;

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public String getAccountName() {
				return this.accountName;
			}

			public void setAccountName(String accountName) {
				this.accountName = accountName;
			}

			public String getPhone() {
				return this.phone;
			}

			public void setPhone(String phone) {
				this.phone = phone;
			}

			public String getNickName() {
				return this.nickName;
			}

			public void setNickName(String nickName) {
				this.nickName = nickName;
			}

			public String getEmail() {
				return this.email;
			}

			public void setEmail(String email) {
				this.email = email;
			}

			public String getAccountId() {
				return this.accountId;
			}

			public void setAccountId(String accountId) {
				this.accountId = accountId;
			}

			public Role getRole() {
				return this.role;
			}

			public void setRole(Role role) {
				this.role = role;
			}

			public static class Role {

				private String roleName;

				private Long roleId;

				private String roleCode;

				public String getRoleName() {
					return this.roleName;
				}

				public void setRoleName(String roleName) {
					this.roleName = roleName;
				}

				public Long getRoleId() {
					return this.roleId;
				}

				public void setRoleId(Long roleId) {
					this.roleId = roleId;
				}

				public String getRoleCode() {
					return this.roleCode;
				}

				public void setRoleCode(String roleCode) {
					this.roleCode = roleCode;
				}
			}
		}
	}

	@Override
	public QueryWorkspaceUserListResponse getInstance(UnmarshallerContext context) {
		return	QueryWorkspaceUserListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
