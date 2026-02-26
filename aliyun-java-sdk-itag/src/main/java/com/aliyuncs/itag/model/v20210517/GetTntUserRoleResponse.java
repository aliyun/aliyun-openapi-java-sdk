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

package com.aliyuncs.itag.model.v20210517;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.itag.transform.v20210517.GetTntUserRoleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTntUserRoleResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String errInfo;

	private String msg;

	private Boolean succ;

	private String errorCode;

	private Result result;

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

	public String getErrInfo() {
		return this.errInfo;
	}

	public void setErrInfo(String errInfo) {
		this.errInfo = errInfo;
	}

	public String getMsg() {
		return this.msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Boolean getSucc() {
		return this.succ;
	}

	public void setSucc(Boolean succ) {
		this.succ = succ;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private String role;

		private Boolean self;

		private String tntInstId;

		private String email;

		private String phone;

		private String supplierId;

		private String org;

		private String refUserId;

		private String userId;

		private String userName;

		private String accountType;

		private String accountNo;

		private String bizNo;

		public String getRole() {
			return this.role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public Boolean getSelf() {
			return this.self;
		}

		public void setSelf(Boolean self) {
			this.self = self;
		}

		public String getTntInstId() {
			return this.tntInstId;
		}

		public void setTntInstId(String tntInstId) {
			this.tntInstId = tntInstId;
		}

		public String getEmail() {
			return this.email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPhone() {
			return this.phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getSupplierId() {
			return this.supplierId;
		}

		public void setSupplierId(String supplierId) {
			this.supplierId = supplierId;
		}

		public String getOrg() {
			return this.org;
		}

		public void setOrg(String org) {
			this.org = org;
		}

		public String getRefUserId() {
			return this.refUserId;
		}

		public void setRefUserId(String refUserId) {
			this.refUserId = refUserId;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getUserName() {
			return this.userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getAccountType() {
			return this.accountType;
		}

		public void setAccountType(String accountType) {
			this.accountType = accountType;
		}

		public String getAccountNo() {
			return this.accountNo;
		}

		public void setAccountNo(String accountNo) {
			this.accountNo = accountNo;
		}

		public String getBizNo() {
			return this.bizNo;
		}

		public void setBizNo(String bizNo) {
			this.bizNo = bizNo;
		}
	}

	@Override
	public GetTntUserRoleResponse getInstance(UnmarshallerContext context) {
		return	GetTntUserRoleResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
