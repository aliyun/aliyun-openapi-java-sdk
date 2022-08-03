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

package com.aliyuncs.eiam.model.v20211201;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.eiam.transform.v20211201.CreateApplicationClientSecretResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateApplicationClientSecretResponse extends AcsResponse {

	private String requestId;

	private ApplicationClientSecret applicationClientSecret;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ApplicationClientSecret getApplicationClientSecret() {
		return this.applicationClientSecret;
	}

	public void setApplicationClientSecret(ApplicationClientSecret applicationClientSecret) {
		this.applicationClientSecret = applicationClientSecret;
	}

	public static class ApplicationClientSecret {

		private String clientId;

		private String secretId;

		private String clientSecret;

		public String getClientId() {
			return this.clientId;
		}

		public void setClientId(String clientId) {
			this.clientId = clientId;
		}

		public String getSecretId() {
			return this.secretId;
		}

		public void setSecretId(String secretId) {
			this.secretId = secretId;
		}

		public String getClientSecret() {
			return this.clientSecret;
		}

		public void setClientSecret(String clientSecret) {
			this.clientSecret = clientSecret;
		}
	}

	@Override
	public CreateApplicationClientSecretResponse getInstance(UnmarshallerContext context) {
		return	CreateApplicationClientSecretResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
