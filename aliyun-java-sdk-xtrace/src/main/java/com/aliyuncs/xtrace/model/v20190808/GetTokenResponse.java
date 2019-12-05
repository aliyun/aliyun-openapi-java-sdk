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

package com.aliyuncs.xtrace.model.v20190808;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.xtrace.transform.v20190808.GetTokenResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTokenResponse extends AcsResponse {

	private String requestId;

	private Token token;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Token getToken() {
		return this.token;
	}

	public void setToken(Token token) {
		this.token = token;
	}

	public static class Token {

		private String domain;

		private String licenseKey;

		private String pid;

		private String internalDomain;

		public String getDomain() {
			return this.domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
		}

		public String getLicenseKey() {
			return this.licenseKey;
		}

		public void setLicenseKey(String licenseKey) {
			this.licenseKey = licenseKey;
		}

		public String getPid() {
			return this.pid;
		}

		public void setPid(String pid) {
			this.pid = pid;
		}

		public String getInternalDomain() {
			return this.internalDomain;
		}

		public void setInternalDomain(String internalDomain) {
			this.internalDomain = internalDomain;
		}
	}

	@Override
	public GetTokenResponse getInstance(UnmarshallerContext context) {
		return	GetTokenResponseUnmarshaller.unmarshall(this, context);
	}
}
