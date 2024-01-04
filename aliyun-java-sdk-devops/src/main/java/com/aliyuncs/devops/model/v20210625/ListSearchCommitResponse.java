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
import com.aliyuncs.devops.transform.v20210625.ListSearchCommitResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSearchCommitResponse extends AcsResponse {

	private String requestId;

	private String errorMessage;

	private String errorCode;

	private Boolean success;

	private Long total;

	private List<ResultItem> result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
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

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public List<ResultItem> getResult() {
		return this.result;
	}

	public void setResult(List<ResultItem> result) {
		this.result = result;
	}

	public static class ResultItem {

		private String docId;

		private HighlightTextMap highlightTextMap;

		private Source source;

		public String getDocId() {
			return this.docId;
		}

		public void setDocId(String docId) {
			this.docId = docId;
		}

		public HighlightTextMap getHighlightTextMap() {
			return this.highlightTextMap;
		}

		public void setHighlightTextMap(HighlightTextMap highlightTextMap) {
			this.highlightTextMap = highlightTextMap;
		}

		public Source getSource() {
			return this.source;
		}

		public void setSource(Source source) {
			this.source = source;
		}

		public static class HighlightTextMap {

			private String commitId;

			private String title;

			private String commitMessage;

			private String organizationId;

			public String getCommitId() {
				return this.commitId;
			}

			public void setCommitId(String commitId) {
				this.commitId = commitId;
			}

			public String getTitle() {
				return this.title;
			}

			public void setTitle(String title) {
				this.title = title;
			}

			public String getCommitMessage() {
				return this.commitMessage;
			}

			public void setCommitMessage(String commitMessage) {
				this.commitMessage = commitMessage;
			}

			public String getOrganizationId() {
				return this.organizationId;
			}

			public void setOrganizationId(String organizationId) {
				this.organizationId = organizationId;
			}
		}

		public static class Source {

			private String commitId;

			private String title;

			private String commitMessage;

			private String authorTime;

			private String repoPath;

			private String organizationId;

			private Author author;

			public String getCommitId() {
				return this.commitId;
			}

			public void setCommitId(String commitId) {
				this.commitId = commitId;
			}

			public String getTitle() {
				return this.title;
			}

			public void setTitle(String title) {
				this.title = title;
			}

			public String getCommitMessage() {
				return this.commitMessage;
			}

			public void setCommitMessage(String commitMessage) {
				this.commitMessage = commitMessage;
			}

			public String getAuthorTime() {
				return this.authorTime;
			}

			public void setAuthorTime(String authorTime) {
				this.authorTime = authorTime;
			}

			public String getRepoPath() {
				return this.repoPath;
			}

			public void setRepoPath(String repoPath) {
				this.repoPath = repoPath;
			}

			public String getOrganizationId() {
				return this.organizationId;
			}

			public void setOrganizationId(String organizationId) {
				this.organizationId = organizationId;
			}

			public Author getAuthor() {
				return this.author;
			}

			public void setAuthor(Author author) {
				this.author = author;
			}

			public static class Author {

				private String name;

				private String email;

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getEmail() {
					return this.email;
				}

				public void setEmail(String email) {
					this.email = email;
				}
			}
		}
	}

	@Override
	public ListSearchCommitResponse getInstance(UnmarshallerContext context) {
		return	ListSearchCommitResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
