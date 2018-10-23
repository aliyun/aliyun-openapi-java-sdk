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

package com.aliyuncs.finmall.model.v20180723;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.finmall.transform.v20180723.GetCustomerVerifyInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetCustomerVerifyInfoResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String legalPersonName;

		private String idCardNumber;

		private String enterpriseName;

		private String businessLicense;

		private String address;

		private String phoneNumber;

		private String bankCard;

		private String loanSubject;

		private String idCardFrontPage;

		private String idCardBackPage;

		private String validateTime;

		private String validateState;

		private String email;

		public String getLegalPersonName() {
			return this.legalPersonName;
		}

		public void setLegalPersonName(String legalPersonName) {
			this.legalPersonName = legalPersonName;
		}

		public String getIdCardNumber() {
			return this.idCardNumber;
		}

		public void setIdCardNumber(String idCardNumber) {
			this.idCardNumber = idCardNumber;
		}

		public String getEnterpriseName() {
			return this.enterpriseName;
		}

		public void setEnterpriseName(String enterpriseName) {
			this.enterpriseName = enterpriseName;
		}

		public String getBusinessLicense() {
			return this.businessLicense;
		}

		public void setBusinessLicense(String businessLicense) {
			this.businessLicense = businessLicense;
		}

		public String getAddress() {
			return this.address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getPhoneNumber() {
			return this.phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String getBankCard() {
			return this.bankCard;
		}

		public void setBankCard(String bankCard) {
			this.bankCard = bankCard;
		}

		public String getLoanSubject() {
			return this.loanSubject;
		}

		public void setLoanSubject(String loanSubject) {
			this.loanSubject = loanSubject;
		}

		public String getIdCardFrontPage() {
			return this.idCardFrontPage;
		}

		public void setIdCardFrontPage(String idCardFrontPage) {
			this.idCardFrontPage = idCardFrontPage;
		}

		public String getIdCardBackPage() {
			return this.idCardBackPage;
		}

		public void setIdCardBackPage(String idCardBackPage) {
			this.idCardBackPage = idCardBackPage;
		}

		public String getValidateTime() {
			return this.validateTime;
		}

		public void setValidateTime(String validateTime) {
			this.validateTime = validateTime;
		}

		public String getValidateState() {
			return this.validateState;
		}

		public void setValidateState(String validateState) {
			this.validateState = validateState;
		}

		public String getEmail() {
			return this.email;
		}

		public void setEmail(String email) {
			this.email = email;
		}
	}

	@Override
	public GetCustomerVerifyInfoResponse getInstance(UnmarshallerContext context) {
		return	GetCustomerVerifyInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
