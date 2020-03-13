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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.ListLinkeBahamutAppbranchsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListLinkeBahamutAppbranchsResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private String errorMessage;

	private String message;

	private Boolean success;

	private List<ResultItem> result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<ResultItem> getResult() {
		return this.result;
	}

	public void setResult(List<ResultItem> result) {
		this.result = result;
	}

	public static class ResultItem {

		private Boolean locked;

		private String name;

		private Commit commit;

		public Boolean getLocked() {
			return this.locked;
		}

		public void setLocked(Boolean locked) {
			this.locked = locked;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Commit getCommit() {
			return this.commit;
		}

		public void setCommit(Commit commit) {
			this.commit = commit;
		}

		public static class Commit {

			private Long authoredData;

			private String authorEmail;

			private String authorName;

			private String committedDate;

			private String committerEmail;

			private String committerName;

			private Long createdAt;

			private String id;

			private String message;

			private String shortId;

			private List<String> parentIds;

			public Long getAuthoredData() {
				return this.authoredData;
			}

			public void setAuthoredData(Long authoredData) {
				this.authoredData = authoredData;
			}

			public String getAuthorEmail() {
				return this.authorEmail;
			}

			public void setAuthorEmail(String authorEmail) {
				this.authorEmail = authorEmail;
			}

			public String getAuthorName() {
				return this.authorName;
			}

			public void setAuthorName(String authorName) {
				this.authorName = authorName;
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

			public Long getCreatedAt() {
				return this.createdAt;
			}

			public void setCreatedAt(Long createdAt) {
				this.createdAt = createdAt;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getMessage() {
				return this.message;
			}

			public void setMessage(String message) {
				this.message = message;
			}

			public String getShortId() {
				return this.shortId;
			}

			public void setShortId(String shortId) {
				this.shortId = shortId;
			}

			public List<String> getParentIds() {
				return this.parentIds;
			}

			public void setParentIds(List<String> parentIds) {
				this.parentIds = parentIds;
			}
		}
	}

	@Override
	public ListLinkeBahamutAppbranchsResponse getInstance(UnmarshallerContext context) {
		return	ListLinkeBahamutAppbranchsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
