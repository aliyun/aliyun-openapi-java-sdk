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

package com.aliyuncs.arms.model.v20190808;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.arms.transform.v20190808.CreateOrUpdateContactResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateOrUpdateContactResponse extends AcsResponse {

	private String requestId;

	private AlertContact alertContact;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public AlertContact getAlertContact() {
		return this.alertContact;
	}

	public void setAlertContact(AlertContact alertContact) {
		this.alertContact = alertContact;
	}

	public static class AlertContact {

		private Float contactId;

		private String contactName;

		private String phone;

		private String email;

		private Boolean isVerify;

		private Long reissueSendNotice;

		public Float getContactId() {
			return this.contactId;
		}

		public void setContactId(Float contactId) {
			this.contactId = contactId;
		}

		public String getContactName() {
			return this.contactName;
		}

		public void setContactName(String contactName) {
			this.contactName = contactName;
		}

		public String getPhone() {
			return this.phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getEmail() {
			return this.email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Boolean getIsVerify() {
			return this.isVerify;
		}

		public void setIsVerify(Boolean isVerify) {
			this.isVerify = isVerify;
		}

		public Long getReissueSendNotice() {
			return this.reissueSendNotice;
		}

		public void setReissueSendNotice(Long reissueSendNotice) {
			this.reissueSendNotice = reissueSendNotice;
		}
	}

	@Override
	public CreateOrUpdateContactResponse getInstance(UnmarshallerContext context) {
		return	CreateOrUpdateContactResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
