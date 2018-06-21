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

package com.aliyuncs.cds.model.v20170925;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cds.transform.v20170925.GetCredentialsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetCredentialsResponse extends AcsResponse {

	private String requestId;

	private List<Credential> credentials;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Credential> getCredentials() {
		return this.credentials;
	}

	public void setCredentials(List<Credential> credentials) {
		this.credentials = credentials;
	}

	public static class Credential {

		private String credentialId;

		private String credentialType;

		public String getCredentialId() {
			return this.credentialId;
		}

		public void setCredentialId(String credentialId) {
			this.credentialId = credentialId;
		}

		public String getCredentialType() {
			return this.credentialType;
		}

		public void setCredentialType(String credentialType) {
			this.credentialType = credentialType;
		}
	}

	@Override
	public GetCredentialsResponse getInstance(UnmarshallerContext context) {
		return	GetCredentialsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
