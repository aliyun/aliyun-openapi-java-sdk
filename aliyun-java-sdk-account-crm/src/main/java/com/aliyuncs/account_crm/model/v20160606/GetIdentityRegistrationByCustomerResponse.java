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

package com.aliyuncs.account_crm.model.v20160606;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.account_crm.transform.v20160606.GetIdentityRegistrationByCustomerResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetIdentityRegistrationByCustomerResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String docBackPic;

		private String fullName;

		private String docFrontPic;

		private String tel;

		private Integer accountType;

		private String auditCode;

		private String registeredCountry;

		private String registeredNum;

		private String email;

		private String applyStatus;

		private String registeredAddress;

		private String docNum;

		private Long customerId;

		private String docType;

		private Long applicationId;

		public String getDocBackPic() {
			return this.docBackPic;
		}

		public void setDocBackPic(String docBackPic) {
			this.docBackPic = docBackPic;
		}

		public String getFullName() {
			return this.fullName;
		}

		public void setFullName(String fullName) {
			this.fullName = fullName;
		}

		public String getDocFrontPic() {
			return this.docFrontPic;
		}

		public void setDocFrontPic(String docFrontPic) {
			this.docFrontPic = docFrontPic;
		}

		public String getTel() {
			return this.tel;
		}

		public void setTel(String tel) {
			this.tel = tel;
		}

		public Integer getAccountType() {
			return this.accountType;
		}

		public void setAccountType(Integer accountType) {
			this.accountType = accountType;
		}

		public String getAuditCode() {
			return this.auditCode;
		}

		public void setAuditCode(String auditCode) {
			this.auditCode = auditCode;
		}

		public String getRegisteredCountry() {
			return this.registeredCountry;
		}

		public void setRegisteredCountry(String registeredCountry) {
			this.registeredCountry = registeredCountry;
		}

		public String getRegisteredNum() {
			return this.registeredNum;
		}

		public void setRegisteredNum(String registeredNum) {
			this.registeredNum = registeredNum;
		}

		public String getEmail() {
			return this.email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getApplyStatus() {
			return this.applyStatus;
		}

		public void setApplyStatus(String applyStatus) {
			this.applyStatus = applyStatus;
		}

		public String getRegisteredAddress() {
			return this.registeredAddress;
		}

		public void setRegisteredAddress(String registeredAddress) {
			this.registeredAddress = registeredAddress;
		}

		public String getDocNum() {
			return this.docNum;
		}

		public void setDocNum(String docNum) {
			this.docNum = docNum;
		}

		public Long getCustomerId() {
			return this.customerId;
		}

		public void setCustomerId(Long customerId) {
			this.customerId = customerId;
		}

		public String getDocType() {
			return this.docType;
		}

		public void setDocType(String docType) {
			this.docType = docType;
		}

		public Long getApplicationId() {
			return this.applicationId;
		}

		public void setApplicationId(Long applicationId) {
			this.applicationId = applicationId;
		}
	}

	@Override
	public GetIdentityRegistrationByCustomerResponse getInstance(UnmarshallerContext context) {
		return	GetIdentityRegistrationByCustomerResponseUnmarshaller.unmarshall(this, context);
	}
}
