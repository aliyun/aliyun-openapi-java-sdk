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

package com.aliyuncs.edas.model.v20170801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.edas.transform.v20170801.ListSubAccountResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSubAccountResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private List<SubAccount> subAccountList;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

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

	public List<SubAccount> getSubAccountList() {
		return this.subAccountList;
	}

	public void setSubAccountList(List<SubAccount> subAccountList) {
		this.subAccountList = subAccountList;
	}

	public static class SubAccount {

		private String adminUserId;

		private String subUserId;

		private String email;

		private String phone;

		private String adminUserKp;

		private String subUserKp;

		private String adminEdasId;

		private String subEdasId;

		public String getAdminUserId() {
			return this.adminUserId;
		}

		public void setAdminUserId(String adminUserId) {
			this.adminUserId = adminUserId;
		}

		public String getSubUserId() {
			return this.subUserId;
		}

		public void setSubUserId(String subUserId) {
			this.subUserId = subUserId;
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

		public String getAdminUserKp() {
			return this.adminUserKp;
		}

		public void setAdminUserKp(String adminUserKp) {
			this.adminUserKp = adminUserKp;
		}

		public String getSubUserKp() {
			return this.subUserKp;
		}

		public void setSubUserKp(String subUserKp) {
			this.subUserKp = subUserKp;
		}

		public String getAdminEdasId() {
			return this.adminEdasId;
		}

		public void setAdminEdasId(String adminEdasId) {
			this.adminEdasId = adminEdasId;
		}

		public String getSubEdasId() {
			return this.subEdasId;
		}

		public void setSubEdasId(String subEdasId) {
			this.subEdasId = subEdasId;
		}
	}

	@Override
	public ListSubAccountResponse getInstance(UnmarshallerContext context) {
		return	ListSubAccountResponseUnmarshaller.unmarshall(this, context);
	}
}
