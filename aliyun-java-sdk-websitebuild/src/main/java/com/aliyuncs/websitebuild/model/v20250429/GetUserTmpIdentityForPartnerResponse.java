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

package com.aliyuncs.websitebuild.model.v20250429;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.websitebuild.transform.v20250429.GetUserTmpIdentityForPartnerResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetUserTmpIdentityForPartnerResponse extends AcsResponse {

	private String requestId;

	private String errorMsg;

	private Boolean success;

	private String errorCode;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Boolean hasCustomRoleAuth;

		private Credentials credentials;

		public Boolean getHasCustomRoleAuth() {
			return this.hasCustomRoleAuth;
		}

		public void setHasCustomRoleAuth(Boolean hasCustomRoleAuth) {
			this.hasCustomRoleAuth = hasCustomRoleAuth;
		}

		public Credentials getCredentials() {
			return this.credentials;
		}

		public void setCredentials(Credentials credentials) {
			this.credentials = credentials;
		}

		public static class Credentials {

			private String encryptedAccessKeyId;

			private String encryptedAccessKeySecret;

			private String encryptedSecurityToken;

			private String expiration;

			public String getEncryptedAccessKeyId() {
				return this.encryptedAccessKeyId;
			}

			public void setEncryptedAccessKeyId(String encryptedAccessKeyId) {
				this.encryptedAccessKeyId = encryptedAccessKeyId;
			}

			public String getEncryptedAccessKeySecret() {
				return this.encryptedAccessKeySecret;
			}

			public void setEncryptedAccessKeySecret(String encryptedAccessKeySecret) {
				this.encryptedAccessKeySecret = encryptedAccessKeySecret;
			}

			public String getEncryptedSecurityToken() {
				return this.encryptedSecurityToken;
			}

			public void setEncryptedSecurityToken(String encryptedSecurityToken) {
				this.encryptedSecurityToken = encryptedSecurityToken;
			}

			public String getExpiration() {
				return this.expiration;
			}

			public void setExpiration(String expiration) {
				this.expiration = expiration;
			}
		}
	}

	@Override
	public GetUserTmpIdentityForPartnerResponse getInstance(UnmarshallerContext context) {
		return	GetUserTmpIdentityForPartnerResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
