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
import com.aliyuncs.devops.transform.v20210625.ListSearchRepositoryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSearchRepositoryResponse extends AcsResponse {

	private String requestId;

	private String errorCode;

	private String errorMessage;

	private Boolean success;

	private Long total;

	private List<ResultItem> result;

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

			private String organizationId;

			private String creatorUserId;

			private String repoPath;

			private String repoNameWithNamespace;

			private String readMe;

			private String description;

			public String getOrganizationId() {
				return this.organizationId;
			}

			public void setOrganizationId(String organizationId) {
				this.organizationId = organizationId;
			}

			public String getCreatorUserId() {
				return this.creatorUserId;
			}

			public void setCreatorUserId(String creatorUserId) {
				this.creatorUserId = creatorUserId;
			}

			public String getRepoPath() {
				return this.repoPath;
			}

			public void setRepoPath(String repoPath) {
				this.repoPath = repoPath;
			}

			public String getRepoNameWithNamespace() {
				return this.repoNameWithNamespace;
			}

			public void setRepoNameWithNamespace(String repoNameWithNamespace) {
				this.repoNameWithNamespace = repoNameWithNamespace;
			}

			public String getReadMe() {
				return this.readMe;
			}

			public void setReadMe(String readMe) {
				this.readMe = readMe;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}
		}

		public static class Source {

			private String repoName;

			private String repoPath;

			private String description;

			private Integer visibilityLevel;

			private String createTime;

			private String lastActivityTime;

			private String readMe;

			private String organizationId;

			public String getRepoName() {
				return this.repoName;
			}

			public void setRepoName(String repoName) {
				this.repoName = repoName;
			}

			public String getRepoPath() {
				return this.repoPath;
			}

			public void setRepoPath(String repoPath) {
				this.repoPath = repoPath;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public Integer getVisibilityLevel() {
				return this.visibilityLevel;
			}

			public void setVisibilityLevel(Integer visibilityLevel) {
				this.visibilityLevel = visibilityLevel;
			}

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public String getLastActivityTime() {
				return this.lastActivityTime;
			}

			public void setLastActivityTime(String lastActivityTime) {
				this.lastActivityTime = lastActivityTime;
			}

			public String getReadMe() {
				return this.readMe;
			}

			public void setReadMe(String readMe) {
				this.readMe = readMe;
			}

			public String getOrganizationId() {
				return this.organizationId;
			}

			public void setOrganizationId(String organizationId) {
				this.organizationId = organizationId;
			}
		}
	}

	@Override
	public ListSearchRepositoryResponse getInstance(UnmarshallerContext context) {
		return	ListSearchRepositoryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
