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

package com.aliyuncs.aas.model.v20150701;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.aas.transform.v20150701.GenerateAccountLoginTokenResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GenerateAccountLoginTokenResponse extends AcsResponse {

	private String requestId;

	private LoginToken loginToken;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public LoginToken getLoginToken() {
		return this.loginToken;
	}

	public void setLoginToken(LoginToken loginToken) {
		this.loginToken = loginToken;
	}

	public static class LoginToken {

		private String targetPk;

		private String loginTokenString;

		public String getTargetPk() {
			return this.targetPk;
		}

		public void setTargetPk(String targetPk) {
			this.targetPk = targetPk;
		}

		public String getLoginTokenString() {
			return this.loginTokenString;
		}

		public void setLoginTokenString(String loginTokenString) {
			this.loginTokenString = loginTokenString;
		}
	}

	@Override
	public GenerateAccountLoginTokenResponse getInstance(UnmarshallerContext context) {
		return	GenerateAccountLoginTokenResponseUnmarshaller.unmarshall(this, context);
	}
}
