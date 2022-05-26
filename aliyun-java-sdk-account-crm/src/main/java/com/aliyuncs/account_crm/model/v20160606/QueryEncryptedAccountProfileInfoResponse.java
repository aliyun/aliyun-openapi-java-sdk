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
import com.aliyuncs.account_crm.transform.v20160606.QueryEncryptedAccountProfileInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryEncryptedAccountProfileInfoResponse extends AcsResponse {

	private String requestId;

	private EncryptedProfileInfo encryptedProfileInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public EncryptedProfileInfo getEncryptedProfileInfo() {
		return this.encryptedProfileInfo;
	}

	public void setEncryptedProfileInfo(EncryptedProfileInfo encryptedProfileInfo) {
		this.encryptedProfileInfo = encryptedProfileInfo;
	}

	public static class EncryptedProfileInfo {

		private Boolean isAliyunIdAnEmail;

		private String encryptedAliyunID;

		private String encryptedEmail;

		private String encryptedMobile;

		private String encryptedSecurityMobile;

		private String pk;

		public Boolean getIsAliyunIdAnEmail() {
			return this.isAliyunIdAnEmail;
		}

		public void setIsAliyunIdAnEmail(Boolean isAliyunIdAnEmail) {
			this.isAliyunIdAnEmail = isAliyunIdAnEmail;
		}

		public String getEncryptedAliyunID() {
			return this.encryptedAliyunID;
		}

		public void setEncryptedAliyunID(String encryptedAliyunID) {
			this.encryptedAliyunID = encryptedAliyunID;
		}

		public String getEncryptedEmail() {
			return this.encryptedEmail;
		}

		public void setEncryptedEmail(String encryptedEmail) {
			this.encryptedEmail = encryptedEmail;
		}

		public String getEncryptedMobile() {
			return this.encryptedMobile;
		}

		public void setEncryptedMobile(String encryptedMobile) {
			this.encryptedMobile = encryptedMobile;
		}

		public String getEncryptedSecurityMobile() {
			return this.encryptedSecurityMobile;
		}

		public void setEncryptedSecurityMobile(String encryptedSecurityMobile) {
			this.encryptedSecurityMobile = encryptedSecurityMobile;
		}

		public String getPk() {
			return this.pk;
		}

		public void setPk(String pk) {
			this.pk = pk;
		}
	}

	@Override
	public QueryEncryptedAccountProfileInfoResponse getInstance(UnmarshallerContext context) {
		return	QueryEncryptedAccountProfileInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
