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
import com.aliyuncs.eiam.transform.v20211201.CreateApplicationTokenResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateApplicationTokenResponse extends AcsResponse {

	private String requestId;

	private ApplicationTokens applicationTokens;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ApplicationTokens getApplicationTokens() {
		return this.applicationTokens;
	}

	public void setApplicationTokens(ApplicationTokens applicationTokens) {
		this.applicationTokens = applicationTokens;
	}

	public static class ApplicationTokens {

		private String applicationTokenId;

		private String applicationToken;

		private String applicationTokenType;

		public String getApplicationTokenId() {
			return this.applicationTokenId;
		}

		public void setApplicationTokenId(String applicationTokenId) {
			this.applicationTokenId = applicationTokenId;
		}

		public String getApplicationToken() {
			return this.applicationToken;
		}

		public void setApplicationToken(String applicationToken) {
			this.applicationToken = applicationToken;
		}

		public String getApplicationTokenType() {
			return this.applicationTokenType;
		}

		public void setApplicationTokenType(String applicationTokenType) {
			this.applicationTokenType = applicationTokenType;
		}
	}

	@Override
	public CreateApplicationTokenResponse getInstance(UnmarshallerContext context) {
		return	CreateApplicationTokenResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
