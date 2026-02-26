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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.devops.transform.v20210625.GetFileLastCommitResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetFileLastCommitResponse extends AcsResponse {

	private String errorMessage;

	private String requestId;

	private Boolean success;

	private String errorCode;

	private Result result;

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

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

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private String shortId;

		private String authorName;

		private String authorDate;

		private String createdAt;

		private String message;

		private String title;

		private String committerName;

		private String authorEmail;

		private String id;

		private String committerEmail;

		private String committedDate;

		private List<String> parentIds;

		private Signature signature;

		public String getShortId() {
			return this.shortId;
		}

		public void setShortId(String shortId) {
			this.shortId = shortId;
		}

		public String getAuthorName() {
			return this.authorName;
		}

		public void setAuthorName(String authorName) {
			this.authorName = authorName;
		}

		public String getAuthorDate() {
			return this.authorDate;
		}

		public void setAuthorDate(String authorDate) {
			this.authorDate = authorDate;
		}

		public String getCreatedAt() {
			return this.createdAt;
		}

		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getCommitterName() {
			return this.committerName;
		}

		public void setCommitterName(String committerName) {
			this.committerName = committerName;
		}

		public String getAuthorEmail() {
			return this.authorEmail;
		}

		public void setAuthorEmail(String authorEmail) {
			this.authorEmail = authorEmail;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getCommitterEmail() {
			return this.committerEmail;
		}

		public void setCommitterEmail(String committerEmail) {
			this.committerEmail = committerEmail;
		}

		public String getCommittedDate() {
			return this.committedDate;
		}

		public void setCommittedDate(String committedDate) {
			this.committedDate = committedDate;
		}

		public List<String> getParentIds() {
			return this.parentIds;
		}

		public void setParentIds(List<String> parentIds) {
			this.parentIds = parentIds;
		}

		public Signature getSignature() {
			return this.signature;
		}

		public void setSignature(Signature signature) {
			this.signature = signature;
		}

		public static class Signature {

			private String verificationStatus;

			private String gpgKeyId;

			public String getVerificationStatus() {
				return this.verificationStatus;
			}

			public void setVerificationStatus(String verificationStatus) {
				this.verificationStatus = verificationStatus;
			}

			public String getGpgKeyId() {
				return this.gpgKeyId;
			}

			public void setGpgKeyId(String gpgKeyId) {
				this.gpgKeyId = gpgKeyId;
			}
		}
	}

	@Override
	public GetFileLastCommitResponse getInstance(UnmarshallerContext context) {
		return	GetFileLastCommitResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
