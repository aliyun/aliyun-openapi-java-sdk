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
import com.aliyuncs.devops.transform.v20210625.ListGroupRepositoriesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListGroupRepositoriesResponse extends AcsResponse {

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

		private Long id;

		private String name;

		private String path;

		private String nameWithNamespace;

		private String pathWithNamespace;

		private String lastActivityAt;

		private String createdAt;

		private String updatedAt;

		private Integer visibilityLevel;

		private Integer starCount;

		private String webUrl;

		private String sshUrl;

		private String httpUrl;

		private String description;

		private Boolean privateFlag;

		private Long creatorId;

		private Boolean issuesEnabled;

		private Boolean mergeRequestsEnabled;

		private Boolean wikiEnabled;

		private Boolean namespaceId;

		private Boolean snippetsEnabled;

		private String importUrl;

		private Boolean archived;

		private Long commitCount;

		private Boolean isStared;

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

		public String getPath() {
			return this.path;
		}

		public void setPath(String path) {
			this.path = path;
		}

		public String getNameWithNamespace() {
			return this.nameWithNamespace;
		}

		public void setNameWithNamespace(String nameWithNamespace) {
			this.nameWithNamespace = nameWithNamespace;
		}

		public String getPathWithNamespace() {
			return this.pathWithNamespace;
		}

		public void setPathWithNamespace(String pathWithNamespace) {
			this.pathWithNamespace = pathWithNamespace;
		}

		public String getLastActivityAt() {
			return this.lastActivityAt;
		}

		public void setLastActivityAt(String lastActivityAt) {
			this.lastActivityAt = lastActivityAt;
		}

		public String getCreatedAt() {
			return this.createdAt;
		}

		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}

		public String getUpdatedAt() {
			return this.updatedAt;
		}

		public void setUpdatedAt(String updatedAt) {
			this.updatedAt = updatedAt;
		}

		public Integer getVisibilityLevel() {
			return this.visibilityLevel;
		}

		public void setVisibilityLevel(Integer visibilityLevel) {
			this.visibilityLevel = visibilityLevel;
		}

		public Integer getStarCount() {
			return this.starCount;
		}

		public void setStarCount(Integer starCount) {
			this.starCount = starCount;
		}

		public String getWebUrl() {
			return this.webUrl;
		}

		public void setWebUrl(String webUrl) {
			this.webUrl = webUrl;
		}

		public String getSshUrl() {
			return this.sshUrl;
		}

		public void setSshUrl(String sshUrl) {
			this.sshUrl = sshUrl;
		}

		public String getHttpUrl() {
			return this.httpUrl;
		}

		public void setHttpUrl(String httpUrl) {
			this.httpUrl = httpUrl;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Boolean getPrivateFlag() {
			return this.privateFlag;
		}

		public void setPrivateFlag(Boolean privateFlag) {
			this.privateFlag = privateFlag;
		}

		public Long getCreatorId() {
			return this.creatorId;
		}

		public void setCreatorId(Long creatorId) {
			this.creatorId = creatorId;
		}

		public Boolean getIssuesEnabled() {
			return this.issuesEnabled;
		}

		public void setIssuesEnabled(Boolean issuesEnabled) {
			this.issuesEnabled = issuesEnabled;
		}

		public Boolean getMergeRequestsEnabled() {
			return this.mergeRequestsEnabled;
		}

		public void setMergeRequestsEnabled(Boolean mergeRequestsEnabled) {
			this.mergeRequestsEnabled = mergeRequestsEnabled;
		}

		public Boolean getWikiEnabled() {
			return this.wikiEnabled;
		}

		public void setWikiEnabled(Boolean wikiEnabled) {
			this.wikiEnabled = wikiEnabled;
		}

		public Boolean getNamespaceId() {
			return this.namespaceId;
		}

		public void setNamespaceId(Boolean namespaceId) {
			this.namespaceId = namespaceId;
		}

		public Boolean getSnippetsEnabled() {
			return this.snippetsEnabled;
		}

		public void setSnippetsEnabled(Boolean snippetsEnabled) {
			this.snippetsEnabled = snippetsEnabled;
		}

		public String getImportUrl() {
			return this.importUrl;
		}

		public void setImportUrl(String importUrl) {
			this.importUrl = importUrl;
		}

		public Boolean getArchived() {
			return this.archived;
		}

		public void setArchived(Boolean archived) {
			this.archived = archived;
		}

		public Long getCommitCount() {
			return this.commitCount;
		}

		public void setCommitCount(Long commitCount) {
			this.commitCount = commitCount;
		}

		public Boolean getIsStared() {
			return this.isStared;
		}

		public void setIsStared(Boolean isStared) {
			this.isStared = isStared;
		}
	}

	@Override
	public ListGroupRepositoriesResponse getInstance(UnmarshallerContext context) {
		return	ListGroupRepositoriesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
