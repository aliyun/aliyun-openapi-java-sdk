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

package com.aliyuncs.ivision.model.v20190308;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ivision.transform.v20190308.CreateUploadTokenResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateUploadTokenResponse extends AcsResponse {

	private String requestId;

	private UploadToken uploadToken;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public UploadToken getUploadToken() {
		return this.uploadToken;
	}

	public void setUploadToken(UploadToken uploadToken) {
		this.uploadToken = uploadToken;
	}

	public static class UploadToken {

		private String accessKeyId;

		private String accessKeySecret;

		private String securityToken;

		private String expiration;

		private String bucket;

		private String object;

		private String endpoint;

		private String url;

		public String getAccessKeyId() {
			return this.accessKeyId;
		}

		public void setAccessKeyId(String accessKeyId) {
			this.accessKeyId = accessKeyId;
		}

		public String getAccessKeySecret() {
			return this.accessKeySecret;
		}

		public void setAccessKeySecret(String accessKeySecret) {
			this.accessKeySecret = accessKeySecret;
		}

		public String getBizSecurityToken() {
			return this.securityToken;
		}

		public void setBizSecurityToken(String securityToken) {
			this.securityToken = securityToken;
		}

		/**
		 * @deprecated use getBizSecurityToken instead of this.
		 */
		@Deprecated
		public String getSecurityToken() {
			return this.securityToken;
		}

		/**
		 * @deprecated use setBizSecurityToken instead of this.
		 */
		@Deprecated
		public void setSecurityToken(String securityToken) {
			this.securityToken = securityToken;
		}

		public String getExpiration() {
			return this.expiration;
		}

		public void setExpiration(String expiration) {
			this.expiration = expiration;
		}

		public String getBucket() {
			return this.bucket;
		}

		public void setBucket(String bucket) {
			this.bucket = bucket;
		}

		public String getObject() {
			return this.object;
		}

		public void setObject(String object) {
			this.object = object;
		}

		public String getEndpoint() {
			return this.endpoint;
		}

		public void setEndpoint(String endpoint) {
			this.endpoint = endpoint;
		}

		public String getBizUrl() {
			return this.url;
		}

		public void setBizUrl(String url) {
			this.url = url;
		}

		/**
		 * @deprecated use getBizUrl instead of this.
		 */
		@Deprecated
		public String getUrl() {
			return this.url;
		}

		/**
		 * @deprecated use setBizUrl instead of this.
		 */
		@Deprecated
		public void setUrl(String url) {
			this.url = url;
		}
	}

	@Override
	public CreateUploadTokenResponse getInstance(UnmarshallerContext context) {
		return	CreateUploadTokenResponseUnmarshaller.unmarshall(this, context);
	}
}
