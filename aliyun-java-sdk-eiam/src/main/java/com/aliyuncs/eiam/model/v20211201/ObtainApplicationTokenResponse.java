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
import com.aliyuncs.eiam.transform.v20211201.ObtainApplicationTokenResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ObtainApplicationTokenResponse extends AcsResponse {

	private String requestId;

	private ApplicationToken applicationToken;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ApplicationToken getApplicationToken() {
		return this.applicationToken;
	}

	public void setApplicationToken(ApplicationToken applicationToken) {
		this.applicationToken = applicationToken;
	}

	public static class ApplicationToken {

		private String instanceId;

		private String applicationId;

		private String applicationTokenId;

		private String applicationTokenType;

		private String applicationToken;

		private String status;

		private Long expirationTime;

		private Long lastUsedTime;

		private Long createTime;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getApplicationId() {
			return this.applicationId;
		}

		public void setApplicationId(String applicationId) {
			this.applicationId = applicationId;
		}

		public String getApplicationTokenId() {
			return this.applicationTokenId;
		}

		public void setApplicationTokenId(String applicationTokenId) {
			this.applicationTokenId = applicationTokenId;
		}

		public String getApplicationTokenType() {
			return this.applicationTokenType;
		}

		public void setApplicationTokenType(String applicationTokenType) {
			this.applicationTokenType = applicationTokenType;
		}

		public String getApplicationToken() {
			return this.applicationToken;
		}

		public void setApplicationToken(String applicationToken) {
			this.applicationToken = applicationToken;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Long getExpirationTime() {
			return this.expirationTime;
		}

		public void setExpirationTime(Long expirationTime) {
			this.expirationTime = expirationTime;
		}

		public Long getLastUsedTime() {
			return this.lastUsedTime;
		}

		public void setLastUsedTime(Long lastUsedTime) {
			this.lastUsedTime = lastUsedTime;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}
	}

	@Override
	public ObtainApplicationTokenResponse getInstance(UnmarshallerContext context) {
		return	ObtainApplicationTokenResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
