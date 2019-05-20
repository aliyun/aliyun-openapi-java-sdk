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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudcallcenter.transform.v20170705.GetPrivacyNumberAccountResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetPrivacyNumberAccountResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private PrivacyNumberAccount privacyNumberAccount;

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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public PrivacyNumberAccount getPrivacyNumberAccount() {
		return this.privacyNumberAccount;
	}

	public void setPrivacyNumberAccount(PrivacyNumberAccount privacyNumberAccount) {
		this.privacyNumberAccount = privacyNumberAccount;
	}

	public static class PrivacyNumberAccount {

		private String providerId;

		private String accountId;

		private String authToken;

		private Long aliyunUid;

		public String getProviderId() {
			return this.providerId;
		}

		public void setProviderId(String providerId) {
			this.providerId = providerId;
		}

		public String getAccountId() {
			return this.accountId;
		}

		public void setAccountId(String accountId) {
			this.accountId = accountId;
		}

		public String getAuthToken() {
			return this.authToken;
		}

		public void setAuthToken(String authToken) {
			this.authToken = authToken;
		}

		public Long getAliyunUid() {
			return this.aliyunUid;
		}

		public void setAliyunUid(Long aliyunUid) {
			this.aliyunUid = aliyunUid;
		}
	}

	@Override
	public GetPrivacyNumberAccountResponse getInstance(UnmarshallerContext context) {
		return	GetPrivacyNumberAccountResponseUnmarshaller.unmarshall(this, context);
	}
}
