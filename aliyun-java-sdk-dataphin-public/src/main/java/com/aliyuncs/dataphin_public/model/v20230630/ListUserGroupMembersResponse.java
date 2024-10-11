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
import com.aliyuncs.dataphin_public.transform.v20230630.ListUserGroupMembersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListUserGroupMembersResponse extends AcsResponse {

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

		private List<UserGroupMemberInfo> memberList;

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<UserGroupMemberInfo> getMemberList() {
			return this.memberList;
		}

		public void setMemberList(List<UserGroupMemberInfo> memberList) {
			this.memberList = memberList;
		}

		public static class UserGroupMemberInfo {

			private String id;

			private String userGroupId;

			private String userRole;

			private Long gmtCreate;

			private UserInfo userInfo;

			private Creator creator;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getUserGroupId() {
				return this.userGroupId;
			}

			public void setUserGroupId(String userGroupId) {
				this.userGroupId = userGroupId;
			}

			public String getUserRole() {
				return this.userRole;
			}

			public void setUserRole(String userRole) {
				this.userRole = userRole;
			}

			public Long getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(Long gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public UserInfo getUserInfo() {
				return this.userInfo;
			}

			public void setUserInfo(UserInfo userInfo) {
				this.userInfo = userInfo;
			}

			public Creator getCreator() {
				return this.creator;
			}

			public void setCreator(Creator creator) {
				this.creator = creator;
			}

			public static class UserInfo {

				private String id;

				private String displayName;

				private String accountName;

				public String getId() {
					return this.id;
				}

				public void setId(String id) {
					this.id = id;
				}

				public String getDisplayName() {
					return this.displayName;
				}

				public void setDisplayName(String displayName) {
					this.displayName = displayName;
				}

				public String getAccountName() {
					return this.accountName;
				}

				public void setAccountName(String accountName) {
					this.accountName = accountName;
				}
			}

			public static class Creator {

				private String id;

				private String displayName;

				private String accountName;

				public String getId() {
					return this.id;
				}

				public void setId(String id) {
					this.id = id;
				}

				public String getDisplayName() {
					return this.displayName;
				}

				public void setDisplayName(String displayName) {
					this.displayName = displayName;
				}

				public String getAccountName() {
					return this.accountName;
				}

				public void setAccountName(String accountName) {
					this.accountName = accountName;
				}
			}
		}
	}

	@Override
	public ListUserGroupMembersResponse getInstance(UnmarshallerContext context) {
		return	ListUserGroupMembersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
