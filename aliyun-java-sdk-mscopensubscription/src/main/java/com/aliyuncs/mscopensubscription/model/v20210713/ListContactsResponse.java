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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mscopensubscription.transform.v20210713.ListContactsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListContactsResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private Integer nextToken;

	private Boolean success;

	private String code;

	private String message;

	private List<Contact> contacts;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(Integer nextToken) {
		this.nextToken = nextToken;
	}

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

	public List<Contact> getContacts() {
		return this.contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}

	public static class Contact {

		private Long lastMobileVerificationTimeStamp;

		private String email;

		private Long lastEmailVerificationTimeStamp;

		private Long contactId;

		private String contactName;

		private Boolean isVerifiedEmail;

		private Boolean isObsolete;

		private String position;

		private Long accountUid;

		private String mobile;

		private Boolean isAccount;

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

		public String getContactName() {
			return this.contactName;
		}

		public void setContactName(String contactName) {
			this.contactName = contactName;
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

		public String getPosition() {
			return this.position;
		}

		public void setPosition(String position) {
			this.position = position;
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

		public Boolean getIsAccount() {
			return this.isAccount;
		}

		public void setIsAccount(Boolean isAccount) {
			this.isAccount = isAccount;
		}

		public Boolean getIsVerifiedMobile() {
			return this.isVerifiedMobile;
		}

		public void setIsVerifiedMobile(Boolean isVerifiedMobile) {
			this.isVerifiedMobile = isVerifiedMobile;
		}
	}

	@Override
	public ListContactsResponse getInstance(UnmarshallerContext context) {
		return	ListContactsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
