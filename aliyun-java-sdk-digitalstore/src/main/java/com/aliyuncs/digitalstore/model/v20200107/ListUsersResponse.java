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

package com.aliyuncs.digitalstore.model.v20200107;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.digitalstore.transform.v20200107.ListUsersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListUsersResponse extends AcsResponse {

	private Integer pageSize;

	private Integer totalCount;

	private Integer pageNumber;

	private String requestId;

	private Boolean success;

	private List<SysUserModel> users;

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

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

	public List<SysUserModel> getUsers() {
		return this.users;
	}

	public void setUsers(List<SysUserModel> users) {
		this.users = users;
	}

	public static class SysUserModel {

		private String mail;

		private String aliyunAccount;

		private String telephone;

		private String remark;

		private Long merchantId;

		private String userName;

		private Integer status;

		private Long userId;

		private List<SysUserUnitModel> stores;

		private List<UserRoleModel> roles;

		private List<SysUserUnitModel> warehouses;

		private List<SysUserUnitModel> factories;

		public String getMail() {
			return this.mail;
		}

		public void setMail(String mail) {
			this.mail = mail;
		}

		public String getAliyunAccount() {
			return this.aliyunAccount;
		}

		public void setAliyunAccount(String aliyunAccount) {
			this.aliyunAccount = aliyunAccount;
		}

		public String getTelephone() {
			return this.telephone;
		}

		public void setTelephone(String telephone) {
			this.telephone = telephone;
		}

		public String getRemark() {
			return this.remark;
		}

		public void setRemark(String remark) {
			this.remark = remark;
		}

		public Long getMerchantId() {
			return this.merchantId;
		}

		public void setMerchantId(Long merchantId) {
			this.merchantId = merchantId;
		}

		public String getUserName() {
			return this.userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Long getUserId() {
			return this.userId;
		}

		public void setUserId(Long userId) {
			this.userId = userId;
		}

		public List<SysUserUnitModel> getStores() {
			return this.stores;
		}

		public void setStores(List<SysUserUnitModel> stores) {
			this.stores = stores;
		}

		public List<UserRoleModel> getRoles() {
			return this.roles;
		}

		public void setRoles(List<UserRoleModel> roles) {
			this.roles = roles;
		}

		public List<SysUserUnitModel> getWarehouses() {
			return this.warehouses;
		}

		public void setWarehouses(List<SysUserUnitModel> warehouses) {
			this.warehouses = warehouses;
		}

		public List<SysUserUnitModel> getFactories() {
			return this.factories;
		}

		public void setFactories(List<SysUserUnitModel> factories) {
			this.factories = factories;
		}

		public static class SysUserUnitModel {

			private String unitName;

			private String unitId;

			public String getUnitName() {
				return this.unitName;
			}

			public void setUnitName(String unitName) {
				this.unitName = unitName;
			}

			public String getUnitId() {
				return this.unitId;
			}

			public void setUnitId(String unitId) {
				this.unitId = unitId;
			}
		}

		public static class UserRoleModel {

			private Integer roleId;

			private String roleName;

			private Integer status;

			public Integer getRoleId() {
				return this.roleId;
			}

			public void setRoleId(Integer roleId) {
				this.roleId = roleId;
			}

			public String getRoleName() {
				return this.roleName;
			}

			public void setRoleName(String roleName) {
				this.roleName = roleName;
			}

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}
		}
	}

	@Override
	public ListUsersResponse getInstance(UnmarshallerContext context) {
		return	ListUsersResponseUnmarshaller.unmarshall(this, context);
	}
}
