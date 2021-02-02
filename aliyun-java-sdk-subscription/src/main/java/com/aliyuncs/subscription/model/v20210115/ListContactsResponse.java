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

package com.aliyuncs.subscription.model.v20210115;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.subscription.transform.v20210115.ListContactsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListContactsResponse extends AcsResponse {

	private Integer totalCount;

	private String message;

	private Integer nextToken;

	private String requestId;

	private String code;

	private Boolean success;

	private List<Contact> contacts;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(Integer nextToken) {
		this.nextToken = nextToken;
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

	public List<Contact> getContacts() {
		return this.contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}

	public static class Contact {

		private String email;

		private Boolean isAccount;

		private String position;

		private Boolean isVerifiedEmail;

		private Long lastMobileVerificationTimeStamp;

		private Boolean isObsolete;

		private Boolean isVerifiedMobile;

		private Long contactId;

		private Long accountUID;

		private String mobile;

		private Long lastEmailVerificationTimeStamp;

		private String name;

		public String getEmail() {
			return this.email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Boolean getIsAccount() {
			return this.isAccount;
		}

		public void setIsAccount(Boolean isAccount) {
			this.isAccount = isAccount;
		}

		public String getPosition() {
			return this.position;
		}

		public void setPosition(String position) {
			this.position = position;
		}

		public Boolean getIsVerifiedEmail() {
			return this.isVerifiedEmail;
		}

		public void setIsVerifiedEmail(Boolean isVerifiedEmail) {
			this.isVerifiedEmail = isVerifiedEmail;
		}

		public Long getLastMobileVerificationTimeStamp() {
			return this.lastMobileVerificationTimeStamp;
		}

		public void setLastMobileVerificationTimeStamp(Long lastMobileVerificationTimeStamp) {
			this.lastMobileVerificationTimeStamp = lastMobileVerificationTimeStamp;
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

		public Long getContactId() {
			return this.contactId;
		}

		public void setContactId(Long contactId) {
			this.contactId = contactId;
		}

		public Long getAccountUID() {
			return this.accountUID;
		}

		public void setAccountUID(Long accountUID) {
			this.accountUID = accountUID;
		}

		public String getMobile() {
			return this.mobile;
		}

		public void setMobile(String mobile) {
			this.mobile = mobile;
		}

		public Long getLastEmailVerificationTimeStamp() {
			return this.lastEmailVerificationTimeStamp;
		}

		public void setLastEmailVerificationTimeStamp(Long lastEmailVerificationTimeStamp) {
			this.lastEmailVerificationTimeStamp = lastEmailVerificationTimeStamp;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
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
