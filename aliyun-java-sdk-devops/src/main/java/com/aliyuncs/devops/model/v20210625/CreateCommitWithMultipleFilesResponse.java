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
import com.aliyuncs.devops.transform.v20210625.CreateCommitWithMultipleFilesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateCommitWithMultipleFilesResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String errorCode;

	private String errorMsg;

	private Result result;

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

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private String id;

		private String shortId;

		private String title;

		private String message;

		private String authorName;

		private String authorEmail;

		private String authoredDate;

		private String committerName;

		private String committerEmail;

		private String committedDate;

		private String createdAt;

		private List<String> parentIds;

		private Author author;

		private Committer committer;

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

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
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

		public String getAuthoredDate() {
			return this.authoredDate;
		}

		public void setAuthoredDate(String authoredDate) {
			this.authoredDate = authoredDate;
		}

		public String getCommitterName() {
			return this.committerName;
		}

		public void setCommitterName(String committerName) {
			this.committerName = committerName;
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

		public String getCreatedAt() {
			return this.createdAt;
		}

		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}

		public List<String> getParentIds() {
			return this.parentIds;
		}

		public void setParentIds(List<String> parentIds) {
			this.parentIds = parentIds;
		}

		public Author getAuthor() {
			return this.author;
		}

		public void setAuthor(Author author) {
			this.author = author;
		}

		public Committer getCommitter() {
			return this.committer;
		}

		public void setCommitter(Committer committer) {
			this.committer = committer;
		}

		public static class Author {

			private Long id;

			private String aliyunPk;

			private String name;

			private String username;

			private String email;

			private String state;

			private String avatarUrl;

			private String websiteUrl;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getAliyunPk() {
				return this.aliyunPk;
			}

			public void setAliyunPk(String aliyunPk) {
				this.aliyunPk = aliyunPk;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getUsername() {
				return this.username;
			}

			public void setUsername(String username) {
				this.username = username;
			}

			public String getEmail() {
				return this.email;
			}

			public void setEmail(String email) {
				this.email = email;
			}

			public String getState() {
				return this.state;
			}

			public void setState(String state) {
				this.state = state;
			}

			public String getAvatarUrl() {
				return this.avatarUrl;
			}

			public void setAvatarUrl(String avatarUrl) {
				this.avatarUrl = avatarUrl;
			}

			public String getWebsiteUrl() {
				return this.websiteUrl;
			}

			public void setWebsiteUrl(String websiteUrl) {
				this.websiteUrl = websiteUrl;
			}
		}

		public static class Committer {

			private Long id;

			private String aliyunPk;

			private String name;

			private String username;

			private String email;

			private String state;

			private String avatarUrl;

			private String websiteUrl;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getAliyunPk() {
				return this.aliyunPk;
			}

			public void setAliyunPk(String aliyunPk) {
				this.aliyunPk = aliyunPk;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getUsername() {
				return this.username;
			}

			public void setUsername(String username) {
				this.username = username;
			}

			public String getEmail() {
				return this.email;
			}

			public void setEmail(String email) {
				this.email = email;
			}

			public String getState() {
				return this.state;
			}

			public void setState(String state) {
				this.state = state;
			}

			public String getAvatarUrl() {
				return this.avatarUrl;
			}

			public void setAvatarUrl(String avatarUrl) {
				this.avatarUrl = avatarUrl;
			}

			public String getWebsiteUrl() {
				return this.websiteUrl;
			}

			public void setWebsiteUrl(String websiteUrl) {
				this.websiteUrl = websiteUrl;
			}
		}
	}

	@Override
	public CreateCommitWithMultipleFilesResponse getInstance(UnmarshallerContext context) {
		return	CreateCommitWithMultipleFilesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
