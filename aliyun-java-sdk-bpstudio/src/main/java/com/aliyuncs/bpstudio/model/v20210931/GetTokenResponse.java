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

package com.aliyuncs.bpstudio.model.v20210931;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.bpstudio.transform.v20210931.GetTokenResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTokenResponse extends AcsResponse {

	private String message;

	private String requestId;

	private Integer code;

	private Data data;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String securityToken;

		private String endpoint;

		private String accessKeySecret;

		private String accessKeyId;

		private String bucket;

		private String snapshotBucket;

		public String getSecurityToken() {
			return this.securityToken;
		}

		public void setSecurityToken(String securityToken) {
			this.securityToken = securityToken;
		}

		public String getEndpoint() {
			return this.endpoint;
		}

		public void setEndpoint(String endpoint) {
			this.endpoint = endpoint;
		}

		public String getAccessKeySecret() {
			return this.accessKeySecret;
		}

		public void setAccessKeySecret(String accessKeySecret) {
			this.accessKeySecret = accessKeySecret;
		}

		public String getAccessKeyId() {
			return this.accessKeyId;
		}

		public void setAccessKeyId(String accessKeyId) {
			this.accessKeyId = accessKeyId;
		}

		public String getBucket() {
			return this.bucket;
		}

		public void setBucket(String bucket) {
			this.bucket = bucket;
		}

		public String getSnapshotBucket() {
			return this.snapshotBucket;
		}

		public void setSnapshotBucket(String snapshotBucket) {
			this.snapshotBucket = snapshotBucket;
		}
	}

	@Override
	public GetTokenResponse getInstance(UnmarshallerContext context) {
		return	GetTokenResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
