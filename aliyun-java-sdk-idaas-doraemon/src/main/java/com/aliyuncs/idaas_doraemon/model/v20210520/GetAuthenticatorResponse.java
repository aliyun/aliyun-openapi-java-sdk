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
import com.aliyuncs.idaas_doraemon.transform.v20210520.GetAuthenticatorResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAuthenticatorResponse extends AcsResponse {

	private String requestId;

	private Authenticator authenticator;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Authenticator getAuthenticator() {
		return this.authenticator;
	}

	public void setAuthenticator(Authenticator authenticator) {
		this.authenticator = authenticator;
	}

	public static class Authenticator {

		private String authenticatorUuid;

		private String credentialId;

		private String type;

		private String authenticatorName;

		private Long registerTime;

		private Long lastVerifyTime;

		private String registerSourceIp;

		private String lastVerifySourceIp;

		private String lastVerifyUserAgent;

		private String customAuthenticator;

		public String getAuthenticatorUuid() {
			return this.authenticatorUuid;
		}

		public void setAuthenticatorUuid(String authenticatorUuid) {
			this.authenticatorUuid = authenticatorUuid;
		}

		public String getCredentialId() {
			return this.credentialId;
		}

		public void setCredentialId(String credentialId) {
			this.credentialId = credentialId;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getAuthenticatorName() {
			return this.authenticatorName;
		}

		public void setAuthenticatorName(String authenticatorName) {
			this.authenticatorName = authenticatorName;
		}

		public Long getRegisterTime() {
			return this.registerTime;
		}

		public void setRegisterTime(Long registerTime) {
			this.registerTime = registerTime;
		}

		public Long getLastVerifyTime() {
			return this.lastVerifyTime;
		}

		public void setLastVerifyTime(Long lastVerifyTime) {
			this.lastVerifyTime = lastVerifyTime;
		}

		public String getRegisterSourceIp() {
			return this.registerSourceIp;
		}

		public void setRegisterSourceIp(String registerSourceIp) {
			this.registerSourceIp = registerSourceIp;
		}

		public String getLastVerifySourceIp() {
			return this.lastVerifySourceIp;
		}

		public void setLastVerifySourceIp(String lastVerifySourceIp) {
			this.lastVerifySourceIp = lastVerifySourceIp;
		}

		public String getLastVerifyUserAgent() {
			return this.lastVerifyUserAgent;
		}

		public void setLastVerifyUserAgent(String lastVerifyUserAgent) {
			this.lastVerifyUserAgent = lastVerifyUserAgent;
		}

		public String getCustomAuthenticator() {
			return this.customAuthenticator;
		}

		public void setCustomAuthenticator(String customAuthenticator) {
			this.customAuthenticator = customAuthenticator;
		}
	}

	@Override
	public GetAuthenticatorResponse getInstance(UnmarshallerContext context) {
		return	GetAuthenticatorResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
