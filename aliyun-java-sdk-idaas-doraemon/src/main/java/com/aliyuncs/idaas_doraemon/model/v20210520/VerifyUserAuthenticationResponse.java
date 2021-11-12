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

package com.aliyuncs.idaas_doraemon.model.v20210520;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.idaas_doraemon.transform.v20210520.VerifyUserAuthenticationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class VerifyUserAuthenticationResponse extends AcsResponse {

	private String requestId;

	private Boolean verifyResult;

	private String etasSDKString;

	private String idToken;

	private AuthenticateResultInfo authenticateResultInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getVerifyResult() {
		return this.verifyResult;
	}

	public void setVerifyResult(Boolean verifyResult) {
		this.verifyResult = verifyResult;
	}

	public String getEtasSDKString() {
		return this.etasSDKString;
	}

	public void setEtasSDKString(String etasSDKString) {
		this.etasSDKString = etasSDKString;
	}

	public String getIdToken() {
		return this.idToken;
	}

	public void setIdToken(String idToken) {
		this.idToken = idToken;
	}

	public AuthenticateResultInfo getAuthenticateResultInfo() {
		return this.authenticateResultInfo;
	}

	public void setAuthenticateResultInfo(AuthenticateResultInfo authenticateResultInfo) {
		this.authenticateResultInfo = authenticateResultInfo;
	}

	public static class AuthenticateResultInfo {

		private String userId;

		private String credentialId;

		private String bindHashBase64;

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getCredentialId() {
			return this.credentialId;
		}

		public void setCredentialId(String credentialId) {
			this.credentialId = credentialId;
		}

		public String getBindHashBase64() {
			return this.bindHashBase64;
		}

		public void setBindHashBase64(String bindHashBase64) {
			this.bindHashBase64 = bindHashBase64;
		}
	}

	@Override
	public VerifyUserAuthenticationResponse getInstance(UnmarshallerContext context) {
		return	VerifyUserAuthenticationResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
