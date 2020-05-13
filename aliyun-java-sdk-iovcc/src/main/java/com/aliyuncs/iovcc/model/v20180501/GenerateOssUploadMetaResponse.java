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

package com.aliyuncs.iovcc.model.v20180501;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.iovcc.transform.v20180501.GenerateOssUploadMetaResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GenerateOssUploadMetaResponse extends AcsResponse {

	private String requestId;

	private OssUploadMeta ossUploadMeta;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public OssUploadMeta getOssUploadMeta() {
		return this.ossUploadMeta;
	}

	public void setOssUploadMeta(OssUploadMeta ossUploadMeta) {
		this.ossUploadMeta = ossUploadMeta;
	}

	public static class OssUploadMeta {

		private String accessKeyId;

		private String accessKeySecret;

		private String securityToken;

		private String bucket;

		private String objectKey;

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

		public String getSecurityToken() {
			return this.securityToken;
		}

		public void setSecurityToken(String securityToken) {
			this.securityToken = securityToken;
		}

		public String getBucket() {
			return this.bucket;
		}

		public void setBucket(String bucket) {
			this.bucket = bucket;
		}

		public String getObjectKey() {
			return this.objectKey;
		}

		public void setObjectKey(String objectKey) {
			this.objectKey = objectKey;
		}
	}

	@Override
	public GenerateOssUploadMetaResponse getInstance(UnmarshallerContext context) {
		return	GenerateOssUploadMetaResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
