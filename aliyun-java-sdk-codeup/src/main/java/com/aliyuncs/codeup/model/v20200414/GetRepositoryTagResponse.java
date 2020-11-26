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

package com.aliyuncs.codeup.model.v20200414;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.codeup.transform.v20200414.GetRepositoryTagResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetRepositoryTagResponse extends AcsResponse {

	private String requestId;

	private String errorCode;

	private Boolean success;

	private String errorMessage;

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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private String id;

		private String name;

		private String message;

		private Commit commit;

		private Signature signature;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public Commit getCommit() {
			return this.commit;
		}

		public void setCommit(Commit commit) {
			this.commit = commit;
		}

		public Signature getSignature() {
			return this.signature;
		}

		public void setSignature(Signature signature) {
			this.signature = signature;
		}

		public static class Commit {

			private String id;

			private String shortId;

			private String title;

			private String authorName;

			private String authorEmail;

			private String createdAt;

			private String message;

			private String authoredDate;

			private String committedDate;

			private String committerEmail;

			private String committerName;

			private List<String> parentIds;

			private Signature1 signature1;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getShortId() {
				return this.shortId;
			}

			public void setShortId(String shortId) {
				this.shortId = shortId;
			}

			public String getTitle() {
				return this.title;
			}

			public void setTitle(String title) {
				this.title = title;
			}

			public String getAuthorName() {
				return this.authorName;
			}

			public void setAuthorName(String authorName) {
				this.authorName = authorName;
			}

			public String getAuthorEmail() {
				return this.authorEmail;
			}

			public void setAuthorEmail(String authorEmail) {
				this.authorEmail = authorEmail;
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

			public String getAuthoredDate() {
				return this.authoredDate;
			}

			public void setAuthoredDate(String authoredDate) {
				this.authoredDate = authoredDate;
			}

			public String getCommittedDate() {
				return this.committedDate;
			}

			public void setCommittedDate(String committedDate) {
				this.committedDate = committedDate;
			}

			public String getCommitterEmail() {
				return this.committerEmail;
			}

			public void setCommitterEmail(String committerEmail) {
				this.committerEmail = committerEmail;
			}

			public String getCommitterName() {
				return this.committerName;
			}

			public void setCommitterName(String committerName) {
				this.committerName = committerName;
			}

			public List<String> getParentIds() {
				return this.parentIds;
			}

			public void setParentIds(List<String> parentIds) {
				this.parentIds = parentIds;
			}

			public Signature1 getSignature1() {
				return this.signature1;
			}

			public void setSignature1(Signature1 signature1) {
				this.signature1 = signature1;
			}

			public static class Signature1 {

				private String gpgKeyId;

				private String verificationStatus;

				public String getGpgKeyId() {
					return this.gpgKeyId;
				}

				public void setGpgKeyId(String gpgKeyId) {
					this.gpgKeyId = gpgKeyId;
				}

				public String getVerificationStatus() {
					return this.verificationStatus;
				}

				public void setVerificationStatus(String verificationStatus) {
					this.verificationStatus = verificationStatus;
				}
			}
		}

		public static class Signature {

			private String gpgKeyId;

			private String verificationStatus;

			public String getGpgKeyId() {
				return this.gpgKeyId;
			}

			public void setGpgKeyId(String gpgKeyId) {
				this.gpgKeyId = gpgKeyId;
			}

			public String getVerificationStatus() {
				return this.verificationStatus;
			}

			public void setVerificationStatus(String verificationStatus) {
				this.verificationStatus = verificationStatus;
			}
		}
	}

	@Override
	public GetRepositoryTagResponse getInstance(UnmarshallerContext context) {
		return	GetRepositoryTagResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
