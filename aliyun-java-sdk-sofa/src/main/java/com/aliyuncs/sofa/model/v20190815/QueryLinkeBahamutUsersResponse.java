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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.QueryLinkeBahamutUsersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryLinkeBahamutUsersResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private String errorMessage;

	private String message;

	private Boolean success;

	private List<ResultItem> result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<ResultItem> getResult() {
		return this.result;
	}

	public void setResult(List<ResultItem> result) {
		this.result = result;
	}

	public static class ResultItem {

		private String account;

		private Long created;

		private String customer;

		private Boolean deleted;

		private String department;

		private String email;

		private String empId;

		private String id;

		private Long lastLogin;

		private Long lastModified;

		private String name;

		private String nick;

		private String uid;

		private String uniqueId;

		private String ww;

		private List<String> tenants;

		public String getAccount() {
			return this.account;
		}

		public void setAccount(String account) {
			this.account = account;
		}

		public Long getCreated() {
			return this.created;
		}

		public void setCreated(Long created) {
			this.created = created;
		}

		public String getCustomer() {
			return this.customer;
		}

		public void setCustomer(String customer) {
			this.customer = customer;
		}

		public Boolean getDeleted() {
			return this.deleted;
		}

		public void setDeleted(Boolean deleted) {
			this.deleted = deleted;
		}

		public String getDepartment() {
			return this.department;
		}

		public void setDepartment(String department) {
			this.department = department;
		}

		public String getEmail() {
			return this.email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getEmpId() {
			return this.empId;
		}

		public void setEmpId(String empId) {
			this.empId = empId;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public Long getLastLogin() {
			return this.lastLogin;
		}

		public void setLastLogin(Long lastLogin) {
			this.lastLogin = lastLogin;
		}

		public Long getLastModified() {
			return this.lastModified;
		}

		public void setLastModified(Long lastModified) {
			this.lastModified = lastModified;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getNick() {
			return this.nick;
		}

		public void setNick(String nick) {
			this.nick = nick;
		}

		public String getUid() {
			return this.uid;
		}

		public void setUid(String uid) {
			this.uid = uid;
		}

		public String getUniqueId() {
			return this.uniqueId;
		}

		public void setUniqueId(String uniqueId) {
			this.uniqueId = uniqueId;
		}

		public String getWw() {
			return this.ww;
		}

		public void setWw(String ww) {
			this.ww = ww;
		}

		public List<String> getTenants() {
			return this.tenants;
		}

		public void setTenants(List<String> tenants) {
			this.tenants = tenants;
		}
	}

	@Override
	public QueryLinkeBahamutUsersResponse getInstance(UnmarshallerContext context) {
		return	QueryLinkeBahamutUsersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
