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
import com.aliyuncs.account_crm.transform.v20160606.FindContacterResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class FindContacterResponse extends AcsResponse {

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

		private Long contacterId;

		private String contacterMobile;

		private String contacterType;

		private String contacterName;

		private String contacterPosition;

		private Boolean mobileConfirmed;

		private Boolean emailConfirmed;

		private String contacterStaffNo;

		private String contacterDingding;

		private String contacterAddress;

		private String contacterWangwang;

		private String contacterEmail;

		public Long getContacterId() {
			return this.contacterId;
		}

		public void setContacterId(Long contacterId) {
			this.contacterId = contacterId;
		}

		public String getContacterMobile() {
			return this.contacterMobile;
		}

		public void setContacterMobile(String contacterMobile) {
			this.contacterMobile = contacterMobile;
		}

		public String getContacterType() {
			return this.contacterType;
		}

		public void setContacterType(String contacterType) {
			this.contacterType = contacterType;
		}

		public String getContacterName() {
			return this.contacterName;
		}

		public void setContacterName(String contacterName) {
			this.contacterName = contacterName;
		}

		public String getContacterPosition() {
			return this.contacterPosition;
		}

		public void setContacterPosition(String contacterPosition) {
			this.contacterPosition = contacterPosition;
		}

		public Boolean getMobileConfirmed() {
			return this.mobileConfirmed;
		}

		public void setMobileConfirmed(Boolean mobileConfirmed) {
			this.mobileConfirmed = mobileConfirmed;
		}

		public Boolean getEmailConfirmed() {
			return this.emailConfirmed;
		}

		public void setEmailConfirmed(Boolean emailConfirmed) {
			this.emailConfirmed = emailConfirmed;
		}

		public String getContacterStaffNo() {
			return this.contacterStaffNo;
		}

		public void setContacterStaffNo(String contacterStaffNo) {
			this.contacterStaffNo = contacterStaffNo;
		}

		public String getContacterDingding() {
			return this.contacterDingding;
		}

		public void setContacterDingding(String contacterDingding) {
			this.contacterDingding = contacterDingding;
		}

		public String getContacterAddress() {
			return this.contacterAddress;
		}

		public void setContacterAddress(String contacterAddress) {
			this.contacterAddress = contacterAddress;
		}

		public String getContacterWangwang() {
			return this.contacterWangwang;
		}

		public void setContacterWangwang(String contacterWangwang) {
			this.contacterWangwang = contacterWangwang;
		}

		public String getContacterEmail() {
			return this.contacterEmail;
		}

		public void setContacterEmail(String contacterEmail) {
			this.contacterEmail = contacterEmail;
		}
	}

	@Override
	public FindContacterResponse getInstance(UnmarshallerContext context) {
		return	FindContacterResponseUnmarshaller.unmarshall(this, context);
	}
}
