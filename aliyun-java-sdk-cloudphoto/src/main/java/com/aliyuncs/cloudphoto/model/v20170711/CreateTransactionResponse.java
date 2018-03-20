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

package com.aliyuncs.cloudphoto.model.v20170711;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudphoto.transform.v20170711.CreateTransactionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateTransactionResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private String action;

	private Transaction transaction;

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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getAction() {
		return this.action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public Transaction getTransaction() {
		return this.transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

	public static class Transaction {

		private Upload upload;

		public Upload getUpload() {
			return this.upload;
		}

		public void setUpload(Upload upload) {
			this.upload = upload;
		}

		public static class Upload {

			private String bucket;

			private String fileId;

			private String ossEndpoint;

			private String objectKey;

			private String sessionId;

			private String accessKeyId;

			private String accessKeySecret;

			private String stsToken;

			public String getBucket() {
				return this.bucket;
			}

			public void setBucket(String bucket) {
				this.bucket = bucket;
			}

			public String getFileId() {
				return this.fileId;
			}

			public void setFileId(String fileId) {
				this.fileId = fileId;
			}

			public String getOssEndpoint() {
				return this.ossEndpoint;
			}

			public void setOssEndpoint(String ossEndpoint) {
				this.ossEndpoint = ossEndpoint;
			}

			public String getObjectKey() {
				return this.objectKey;
			}

			public void setObjectKey(String objectKey) {
				this.objectKey = objectKey;
			}

			public String getSessionId() {
				return this.sessionId;
			}

			public void setSessionId(String sessionId) {
				this.sessionId = sessionId;
			}

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

			public String getStsToken() {
				return this.stsToken;
			}

			public void setStsToken(String stsToken) {
				this.stsToken = stsToken;
			}
		}
	}

	@Override
	public CreateTransactionResponse getInstance(UnmarshallerContext context) {
		return	CreateTransactionResponseUnmarshaller.unmarshall(this, context);
	}
}
