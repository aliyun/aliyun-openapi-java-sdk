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

package com.aliyuncs.emr.model.v20160408;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.ListUsersByConditionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListUsersByConditionResponse extends AcsResponse {

	private Boolean paging;

	private String requestId;

	private List<UserDTO> data;

	public Boolean getPaging() {
		return this.paging;
	}

	public void setPaging(Boolean paging) {
		this.paging = paging;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<UserDTO> getData() {
		return this.data;
	}

	public void setData(List<UserDTO> data) {
		this.data = data;
	}

	public static class UserDTO {

		private String aliyunUserId;

		private String userName;

		private String userType;

		private String status;

		private String isSuperAdmin;

		private String description;

		private String gmtCreate;

		private String gmtModified;

		private List<RoleDTO> roleDTOList;

		private List<GroupDTO> groupDTOList;

		private List<AccountDTO> accountDTOList;

		public String getAliyunUserId() {
			return this.aliyunUserId;
		}

		public void setAliyunUserId(String aliyunUserId) {
			this.aliyunUserId = aliyunUserId;
		}

		public String getUserName() {
			return this.userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getUserType() {
			return this.userType;
		}

		public void setUserType(String userType) {
			this.userType = userType;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getIsSuperAdmin() {
			return this.isSuperAdmin;
		}

		public void setIsSuperAdmin(String isSuperAdmin) {
			this.isSuperAdmin = isSuperAdmin;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public List<RoleDTO> getRoleDTOList() {
			return this.roleDTOList;
		}

		public void setRoleDTOList(List<RoleDTO> roleDTOList) {
			this.roleDTOList = roleDTOList;
		}

		public List<GroupDTO> getGroupDTOList() {
			return this.groupDTOList;
		}

		public void setGroupDTOList(List<GroupDTO> groupDTOList) {
			this.groupDTOList = groupDTOList;
		}

		public List<AccountDTO> getAccountDTOList() {
			return this.accountDTOList;
		}

		public void setAccountDTOList(List<AccountDTO> accountDTOList) {
			this.accountDTOList = accountDTOList;
		}

		public static class RoleDTO {

			private Long id;

			private String name;

			private String resourceType;

			private String gmtCreate;

			private String gmtModified;

			private String description;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getResourceType() {
				return this.resourceType;
			}

			public void setResourceType(String resourceType) {
				this.resourceType = resourceType;
			}

			public String getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(String gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public String getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(String gmtModified) {
				this.gmtModified = gmtModified;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}
		}

		public static class GroupDTO {

			private Long id;

			private String type;

			private String name;

			private String gmtCreate;

			private List<RoleDTO2> roleDTOList1;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(String gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public List<RoleDTO2> getRoleDTOList1() {
				return this.roleDTOList1;
			}

			public void setRoleDTOList1(List<RoleDTO2> roleDTOList1) {
				this.roleDTOList1 = roleDTOList1;
			}

			public static class RoleDTO2 {

				private Long id;

				private String name;

				private String resourceType;

				private String gmtCreate;

				private String gmtModified;

				private String description;

				public Long getId() {
					return this.id;
				}

				public void setId(Long id) {
					this.id = id;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getResourceType() {
					return this.resourceType;
				}

				public void setResourceType(String resourceType) {
					this.resourceType = resourceType;
				}

				public String getGmtCreate() {
					return this.gmtCreate;
				}

				public void setGmtCreate(String gmtCreate) {
					this.gmtCreate = gmtCreate;
				}

				public String getGmtModified() {
					return this.gmtModified;
				}

				public void setGmtModified(String gmtModified) {
					this.gmtModified = gmtModified;
				}

				public String getDescription() {
					return this.description;
				}

				public void setDescription(String description) {
					this.description = description;
				}
			}
		}

		public static class AccountDTO {

			private String aliyunUserId;

			private String accountType;

			private String authType;

			public String getAliyunUserId() {
				return this.aliyunUserId;
			}

			public void setAliyunUserId(String aliyunUserId) {
				this.aliyunUserId = aliyunUserId;
			}

			public String getAccountType() {
				return this.accountType;
			}

			public void setAccountType(String accountType) {
				this.accountType = accountType;
			}

			public String getAuthType() {
				return this.authType;
			}

			public void setAuthType(String authType) {
				this.authType = authType;
			}
		}
	}

	@Override
	public ListUsersByConditionResponse getInstance(UnmarshallerContext context) {
		return	ListUsersByConditionResponseUnmarshaller.unmarshall(this, context);
	}
}
