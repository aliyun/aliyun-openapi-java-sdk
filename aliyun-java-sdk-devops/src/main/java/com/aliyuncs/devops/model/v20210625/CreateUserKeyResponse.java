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

package com.aliyuncs.devops.model.v20210625;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.devops.transform.v20210625.CreateUserKeyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateUserKeyResponse extends AcsResponse {

	private String requestId;

	private String errorCode;

	private String errorMessage;

	private Boolean success;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private Long id;

		private String title;

		private String publicKey;

		private String fingerPrint;

		private String keyScope;

		private String createdAt;

		private String expireTime;

		private String lastUsedTime;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getPublicKey() {
			return this.publicKey;
		}

		public void setPublicKey(String publicKey) {
			this.publicKey = publicKey;
		}

		public String getFingerPrint() {
			return this.fingerPrint;
		}

		public void setFingerPrint(String fingerPrint) {
			this.fingerPrint = fingerPrint;
		}

		public String getKeyScope() {
			return this.keyScope;
		}

		public void setKeyScope(String keyScope) {
			this.keyScope = keyScope;
		}

		public String getCreatedAt() {
			return this.createdAt;
		}

		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}

		public String getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(String expireTime) {
			this.expireTime = expireTime;
		}

		public String getLastUsedTime() {
			return this.lastUsedTime;
		}

		public void setLastUsedTime(String lastUsedTime) {
			this.lastUsedTime = lastUsedTime;
		}
	}

	@Override
	public CreateUserKeyResponse getInstance(UnmarshallerContext context) {
		return	CreateUserKeyResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
