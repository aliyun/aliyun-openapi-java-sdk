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

package com.aliyuncs.cloudauth.model.v20190307;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudauth.transform.v20190307.DescribeVerifyTokenResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVerifyTokenResponse extends AcsResponse {

	private String requestId;

	private String verifyPageUrl;

	private String verifyToken;

	private OssUploadToken ossUploadToken;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getVerifyPageUrl() {
		return this.verifyPageUrl;
	}

	public void setVerifyPageUrl(String verifyPageUrl) {
		this.verifyPageUrl = verifyPageUrl;
	}

	public String getVerifyToken() {
		return this.verifyToken;
	}

	public void setVerifyToken(String verifyToken) {
		this.verifyToken = verifyToken;
	}

	public OssUploadToken getOssUploadToken() {
		return this.ossUploadToken;
	}

	public void setOssUploadToken(OssUploadToken ossUploadToken) {
		this.ossUploadToken = ossUploadToken;
	}

	public static class OssUploadToken {

		private String bucket;

		private String endPoint;

		private String path;

		private Long expired;

		private String secret;

		private String key;

		private String token;

		public String getBucket() {
			return this.bucket;
		}

		public void setBucket(String bucket) {
			this.bucket = bucket;
		}

		public String getEndPoint() {
			return this.endPoint;
		}

		public void setEndPoint(String endPoint) {
			this.endPoint = endPoint;
		}

		public String getPath() {
			return this.path;
		}

		public void setPath(String path) {
			this.path = path;
		}

		public Long getExpired() {
			return this.expired;
		}

		public void setExpired(Long expired) {
			this.expired = expired;
		}

		public String getSecret() {
			return this.secret;
		}

		public void setSecret(String secret) {
			this.secret = secret;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getToken() {
			return this.token;
		}

		public void setToken(String token) {
			this.token = token;
		}
	}

	@Override
	public DescribeVerifyTokenResponse getInstance(UnmarshallerContext context) {
		return	DescribeVerifyTokenResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
