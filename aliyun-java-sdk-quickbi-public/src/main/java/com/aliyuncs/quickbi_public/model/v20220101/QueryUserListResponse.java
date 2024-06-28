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
import com.aliyuncs.quickbi_public.transform.v20220101.QueryUserListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryUserListResponse extends AcsResponse {

	private Boolean success;

	private String requestId;

	private Result result;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private Integer totalPages;

		private Integer pageNum;

		private Integer pageSize;

		private Integer totalNum;

		private List<DataItem> data;

		public Integer getTotalPages() {
			return this.totalPages;
		}

		public void setTotalPages(Integer totalPages) {
			this.totalPages = totalPages;
		}

		public Integer getPageNum() {
			return this.pageNum;
		}

		public void setPageNum(Integer pageNum) {
			this.pageNum = pageNum;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getTotalNum() {
			return this.totalNum;
		}

		public void setTotalNum(Integer totalNum) {
			this.totalNum = totalNum;
		}

		public List<DataItem> getData() {
			return this.data;
		}

		public void setData(List<DataItem> data) {
			this.data = data;
		}

		public static class DataItem {

			private Integer userType;

			private String email;

			private String userId;

			private Boolean authAdminUser;

			private String accountId;

			private String nickName;

			private Boolean adminUser;

			private String phone;

			private String accountName;

			private Long joinedDate;

			private Long lastLoginTime;

			private List<Long> roleIdList;

			public Integer getUserType() {
				return this.userType;
			}

			public void setUserType(Integer userType) {
				this.userType = userType;
			}

			public String getEmail() {
				return this.email;
			}

			public void setEmail(String email) {
				this.email = email;
			}

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public Boolean getAuthAdminUser() {
				return this.authAdminUser;
			}

			public void setAuthAdminUser(Boolean authAdminUser) {
				this.authAdminUser = authAdminUser;
			}

			public String getAccountId() {
				return this.accountId;
			}

			public void setAccountId(String accountId) {
				this.accountId = accountId;
			}

			public String getNickName() {
				return this.nickName;
			}

			public void setNickName(String nickName) {
				this.nickName = nickName;
			}

			public Boolean getAdminUser() {
				return this.adminUser;
			}

			public void setAdminUser(Boolean adminUser) {
				this.adminUser = adminUser;
			}

			public String getPhone() {
				return this.phone;
			}

			public void setPhone(String phone) {
				this.phone = phone;
			}

			public String getAccountName() {
				return this.accountName;
			}

			public void setAccountName(String accountName) {
				this.accountName = accountName;
			}

			public Long getJoinedDate() {
				return this.joinedDate;
			}

			public void setJoinedDate(Long joinedDate) {
				this.joinedDate = joinedDate;
			}

			public Long getLastLoginTime() {
				return this.lastLoginTime;
			}

			public void setLastLoginTime(Long lastLoginTime) {
				this.lastLoginTime = lastLoginTime;
			}

			public List<Long> getRoleIdList() {
				return this.roleIdList;
			}

			public void setRoleIdList(List<Long> roleIdList) {
				this.roleIdList = roleIdList;
			}
		}
	}

	@Override
	public QueryUserListResponse getInstance(UnmarshallerContext context) {
		return	QueryUserListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
