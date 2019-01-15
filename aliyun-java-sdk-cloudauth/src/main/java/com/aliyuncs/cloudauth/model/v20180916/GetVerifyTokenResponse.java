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

package com.aliyuncs.cloudauth.model.v20180916;

import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudauth.transform.v20180916.GetVerifyTokenResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetVerifyTokenResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String cloudauthPageUrl;

		private VerifyToken verifyToken;

		private StsToken stsToken;

		public String getCloudauthPageUrl() {
			return this.cloudauthPageUrl;
		}

		public void setCloudauthPageUrl(String cloudauthPageUrl) {
			this.cloudauthPageUrl = cloudauthPageUrl;
		}

		public VerifyToken getVerifyToken() {
			return this.verifyToken;
		}

		public void setVerifyToken(VerifyToken verifyToken) {
			this.verifyToken = verifyToken;
		}

		public StsToken getStsToken() {
			return this.stsToken;
		}

		public void setStsToken(StsToken stsToken) {
			this.stsToken = stsToken;
		}

		public static class VerifyToken {

			private String token;

			private Integer durationSeconds;

			public String getToken() {
				return this.token;
			}

			public void setToken(String token) {
				this.token = token;
			}

			public Integer getDurationSeconds() {
				return this.durationSeconds;
			}

			public void setDurationSeconds(Integer durationSeconds) {
				this.durationSeconds = durationSeconds;
			}
		}

		public static class StsToken {

			private String accessKeyId;

			private String accessKeySecret;

			private String expiration;

			private String endPoint;

			private String bucketName;

			private String path;

			private String token;

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

			public String getExpiration() {
				return this.expiration;
			}

			public void setExpiration(String expiration) {
				this.expiration = expiration;
			}

			public String getEndPoint() {
				return this.endPoint;
			}

			public void setEndPoint(String endPoint) {
				this.endPoint = endPoint;
			}

			public String getBucketName() {
				return this.bucketName;
			}

			public void setBucketName(String bucketName) {
				this.bucketName = bucketName;
			}

			public String getPath() {
				return this.path;
			}

			public void setPath(String path) {
				this.path = path;
			}

			public String getToken() {
				return this.token;
			}

			public void setToken(String token) {
				this.token = token;
			}
		}
	}

	@Override
	public GetVerifyTokenResponse getInstance(UnmarshallerContext context) {
		return	GetVerifyTokenResponseUnmarshaller.unmarshall(this, context);
	}
}
