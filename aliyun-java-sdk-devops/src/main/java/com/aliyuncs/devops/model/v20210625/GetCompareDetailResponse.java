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
import com.aliyuncs.devops.transform.v20210625.GetCompareDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetCompareDetailResponse extends AcsResponse {

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

		private List<CommitsItem> commits;

		private List<DiffsItem> diffs;

		private List<String> messages;

		public List<CommitsItem> getCommits() {
			return this.commits;
		}

		public void setCommits(List<CommitsItem> commits) {
			this.commits = commits;
		}

		public List<DiffsItem> getDiffs() {
			return this.diffs;
		}

		public void setDiffs(List<DiffsItem> diffs) {
			this.diffs = diffs;
		}

		public List<String> getMessages() {
			return this.messages;
		}

		public void setMessages(List<String> messages) {
			this.messages = messages;
		}

		public static class CommitsItem {

			private String id;

			private String shortId;

			private String title;

			private String message;

			private String authorName;

			private String authorEmail;

			private String authoredDate;

			private String createdAt;

			private String committerName;

			private String committerEmail;

			private String committedDate;

			private Long commentsCount;

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

			public String getCreatedAt() {
				return this.createdAt;
			}

			public void setCreatedAt(String createdAt) {
				this.createdAt = createdAt;
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

			public Long getCommentsCount() {
				return this.commentsCount;
			}

			public void setCommentsCount(Long commentsCount) {
				this.commentsCount = commentsCount;
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

				private String name;

				private String username;

				private String state;

				private String avatarUrl;

				private String externUid;

				private String email;

				private String websiteUrl;

				public Long getId() {
					return this.id;
				}

				public void setId(Long id) {
					this.id = id;
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

				public String getExternUid() {
					return this.externUid;
				}

				public void setExternUid(String externUid) {
					this.externUid = externUid;
				}

				public String getEmail() {
					return this.email;
				}

				public void setEmail(String email) {
					this.email = email;
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

				private String name;

				private String username;

				private String state;

				private String avatarUrl;

				private String externUid;

				private String email;

				private String websiteUrl;

				public Long getId() {
					return this.id;
				}

				public void setId(Long id) {
					this.id = id;
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

				public String getExternUid() {
					return this.externUid;
				}

				public void setExternUid(String externUid) {
					this.externUid = externUid;
				}

				public String getEmail() {
					return this.email;
				}

				public void setEmail(String email) {
					this.email = email;
				}

				public String getWebsiteUrl() {
					return this.websiteUrl;
				}

				public void setWebsiteUrl(String websiteUrl) {
					this.websiteUrl = websiteUrl;
				}
			}
		}

		public static class DiffsItem {

			private String diff;

			private String newPath;

			private String oldPath;

			private String aMode;

			private String bMode;

			private Boolean newFile;

			private Boolean renamedFile;

			private Boolean deletedFile;

			private Boolean isBinary;

			private String oldId;

			private String newId;

			private Boolean isNewLfs;

			private Boolean isOldLfs;

			public String getDiff() {
				return this.diff;
			}

			public void setDiff(String diff) {
				this.diff = diff;
			}

			public String getNewPath() {
				return this.newPath;
			}

			public void setNewPath(String newPath) {
				this.newPath = newPath;
			}

			public String getOldPath() {
				return this.oldPath;
			}

			public void setOldPath(String oldPath) {
				this.oldPath = oldPath;
			}

			public String getAMode() {
				return this.aMode;
			}

			public void setAMode(String aMode) {
				this.aMode = aMode;
			}

			public String getBMode() {
				return this.bMode;
			}

			public void setBMode(String bMode) {
				this.bMode = bMode;
			}

			public Boolean getNewFile() {
				return this.newFile;
			}

			public void setNewFile(Boolean newFile) {
				this.newFile = newFile;
			}

			public Boolean getRenamedFile() {
				return this.renamedFile;
			}

			public void setRenamedFile(Boolean renamedFile) {
				this.renamedFile = renamedFile;
			}

			public Boolean getDeletedFile() {
				return this.deletedFile;
			}

			public void setDeletedFile(Boolean deletedFile) {
				this.deletedFile = deletedFile;
			}

			public Boolean getIsBinary() {
				return this.isBinary;
			}

			public void setIsBinary(Boolean isBinary) {
				this.isBinary = isBinary;
			}

			public String getOldId() {
				return this.oldId;
			}

			public void setOldId(String oldId) {
				this.oldId = oldId;
			}

			public String getNewId() {
				return this.newId;
			}

			public void setNewId(String newId) {
				this.newId = newId;
			}

			public Boolean getIsNewLfs() {
				return this.isNewLfs;
			}

			public void setIsNewLfs(Boolean isNewLfs) {
				this.isNewLfs = isNewLfs;
			}

			public Boolean getIsOldLfs() {
				return this.isOldLfs;
			}

			public void setIsOldLfs(Boolean isOldLfs) {
				this.isOldLfs = isOldLfs;
			}
		}
	}

	@Override
	public GetCompareDetailResponse getInstance(UnmarshallerContext context) {
		return	GetCompareDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
