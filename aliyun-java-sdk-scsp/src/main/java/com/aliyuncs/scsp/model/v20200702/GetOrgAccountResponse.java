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

package com.aliyuncs.scsp.model.v20200702;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.scsp.transform.v20200702.GetOrgAccountResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetOrgAccountResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String code;

	private Boolean success;

	private List<DataItem> data;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private List<AccountItem> account;

		private List<SubDeptItem> subDept;

		private List<ParentDeptItem> parentDept;

		private CurrentDept currentDept;

		public List<AccountItem> getAccount() {
			return this.account;
		}

		public void setAccount(List<AccountItem> account) {
			this.account = account;
		}

		public List<SubDeptItem> getSubDept() {
			return this.subDept;
		}

		public void setSubDept(List<SubDeptItem> subDept) {
			this.subDept = subDept;
		}

		public List<ParentDeptItem> getParentDept() {
			return this.parentDept;
		}

		public void setParentDept(List<ParentDeptItem> parentDept) {
			this.parentDept = parentDept;
		}

		public CurrentDept getCurrentDept() {
			return this.currentDept;
		}

		public void setCurrentDept(CurrentDept currentDept) {
			this.currentDept = currentDept;
		}

		public static class AccountItem {

			private String deptCode;

			private String userId;

			private String nick;

			private String name;

			private List<RolesItem> roles;

			public String getDeptCode() {
				return this.deptCode;
			}

			public void setDeptCode(String deptCode) {
				this.deptCode = deptCode;
			}

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public String getNick() {
				return this.nick;
			}

			public void setNick(String nick) {
				this.nick = nick;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public List<RolesItem> getRoles() {
				return this.roles;
			}

			public void setRoles(List<RolesItem> roles) {
				this.roles = roles;
			}

			public static class RolesItem {

				private String id;

				private String name;

				public String getId() {
					return this.id;
				}

				public void setId(String id) {
					this.id = id;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}
			}
		}

		public static class SubDeptItem {

			private String parentCode;

			private String code;

			private String name;

			public String getParentCode() {
				return this.parentCode;
			}

			public void setParentCode(String parentCode) {
				this.parentCode = parentCode;
			}

			public String getCode() {
				return this.code;
			}

			public void setCode(String code) {
				this.code = code;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}

		public static class ParentDeptItem {

			private String parentCode;

			private String code;

			private String name;

			public String getParentCode() {
				return this.parentCode;
			}

			public void setParentCode(String parentCode) {
				this.parentCode = parentCode;
			}

			public String getCode() {
				return this.code;
			}

			public void setCode(String code) {
				this.code = code;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}

		public static class CurrentDept {

			private String parentCode;

			private String code;

			private String name;

			public String getParentCode() {
				return this.parentCode;
			}

			public void setParentCode(String parentCode) {
				this.parentCode = parentCode;
			}

			public String getCode() {
				return this.code;
			}

			public void setCode(String code) {
				this.code = code;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}
	}

	@Override
	public GetOrgAccountResponse getInstance(UnmarshallerContext context) {
		return	GetOrgAccountResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
