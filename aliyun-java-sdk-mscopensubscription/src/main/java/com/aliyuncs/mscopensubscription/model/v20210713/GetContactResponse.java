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

package com.aliyuncs.mscopensubscription.model.v20210713;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.mscopensubscription.transform.v20210713.GetContactResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetContactResponse extends AcsResponse {

	private Boolean success;

	private String code;

	private String message;

	private String requestId;

	private Contact contact;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Contact getContact() {
		return this.contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public static class Contact {

		private Long lastMobileVerificationTimeStamp;

		private String email;

		private String position;

		private Long lastEmailVerificationTimeStamp;

		private Long contactId;

		private Long accountUid;

		private String mobile;

		private String contactName;

		private Boolean isAccount;

		private Boolean isVerifiedEmail;

		private Boolean isObsolete;

		private Boolean isVerifiedMobile;

		public Long getLastMobileVerificationTimeStamp() {
			return this.lastMobileVerificationTimeStamp;
		}

		public void setLastMobileVerificationTimeStamp(Long lastMobileVerificationTimeStamp) {
			this.lastMobileVerificationTimeStamp = lastMobileVerificationTimeStamp;
		}

		public String getEmail() {
			return this.email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPosition() {
			return this.position;
		}

		public void setPosition(String position) {
			this.position = position;
		}

		public Long getLastEmailVerificationTimeStamp() {
			return this.lastEmailVerificationTimeStamp;
		}

		public void setLastEmailVerificationTimeStamp(Long lastEmailVerificationTimeStamp) {
			this.lastEmailVerificationTimeStamp = lastEmailVerificationTimeStamp;
		}

		public Long getContactId() {
			return this.contactId;
		}

		public void setContactId(Long contactId) {
			this.contactId = contactId;
		}

		public Long getAccountUid() {
			return this.accountUid;
		}

		public void setAccountUid(Long accountUid) {
			this.accountUid = accountUid;
		}

		public String getMobile() {
			return this.mobile;
		}

		public void setMobile(String mobile) {
			this.mobile = mobile;
		}

		public String getContactName() {
			return this.contactName;
		}

		public void setContactName(String contactName) {
			this.contactName = contactName;
		}

		public Boolean getIsAccount() {
			return this.isAccount;
		}

		public void setIsAccount(Boolean isAccount) {
			this.isAccount = isAccount;
		}

		public Boolean getIsVerifiedEmail() {
			return this.isVerifiedEmail;
		}

		public void setIsVerifiedEmail(Boolean isVerifiedEmail) {
			this.isVerifiedEmail = isVerifiedEmail;
		}

		public Boolean getIsObsolete() {
			return this.isObsolete;
		}

		public void setIsObsolete(Boolean isObsolete) {
			this.isObsolete = isObsolete;
		}

		public Boolean getIsVerifiedMobile() {
			return this.isVerifiedMobile;
		}

		public void setIsVerifiedMobile(Boolean isVerifiedMobile) {
			this.isVerifiedMobile = isVerifiedMobile;
		}
	}

	@Override
	public GetContactResponse getInstance(UnmarshallerContext context) {
		return	GetContactResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
