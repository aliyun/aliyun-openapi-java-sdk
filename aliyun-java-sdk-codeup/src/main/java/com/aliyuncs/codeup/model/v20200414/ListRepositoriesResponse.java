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
import com.aliyuncs.codeup.transform.v20200414.ListRepositoriesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListRepositoriesResponse extends AcsResponse {

	private Integer errorCode;

	private String errorMessage;

	private String requestId;

	private Boolean success;

	private Long total;

	private List<ResultItem> result;

	public Integer getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}

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

		private String description;

		private String visibilityLevel;

		private String webUrl;

		private String name;

		private String nameWithNamespace;

		private String path;

		private String pathWithNamespace;

		private String createdAt;

		private String lastActivityAt;

		private Boolean archive;

		private String avatarUrl;

		private Boolean demoProjectStatus;

		private Integer accessLevel;

		private String importStatus;

		private Long namespaceId;

		private String updatedAt;

		private Long starCount;

		private Boolean star;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getVisibilityLevel() {
			return this.visibilityLevel;
		}

		public void setVisibilityLevel(String visibilityLevel) {
			this.visibilityLevel = visibilityLevel;
		}

		public String getWebUrl() {
			return this.webUrl;
		}

		public void setWebUrl(String webUrl) {
			this.webUrl = webUrl;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getNameWithNamespace() {
			return this.nameWithNamespace;
		}

		public void setNameWithNamespace(String nameWithNamespace) {
			this.nameWithNamespace = nameWithNamespace;
		}

		public String getPath() {
			return this.path;
		}

		public void setPath(String path) {
			this.path = path;
		}

		public String getPathWithNamespace() {
			return this.pathWithNamespace;
		}

		public void setPathWithNamespace(String pathWithNamespace) {
			this.pathWithNamespace = pathWithNamespace;
		}

		public String getCreatedAt() {
			return this.createdAt;
		}

		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}

		public String getLastActivityAt() {
			return this.lastActivityAt;
		}

		public void setLastActivityAt(String lastActivityAt) {
			this.lastActivityAt = lastActivityAt;
		}

		public Boolean getArchive() {
			return this.archive;
		}

		public void setArchive(Boolean archive) {
			this.archive = archive;
		}

		public String getAvatarUrl() {
			return this.avatarUrl;
		}

		public void setAvatarUrl(String avatarUrl) {
			this.avatarUrl = avatarUrl;
		}

		public Boolean getDemoProjectStatus() {
			return this.demoProjectStatus;
		}

		public void setDemoProjectStatus(Boolean demoProjectStatus) {
			this.demoProjectStatus = demoProjectStatus;
		}

		public Integer getAccessLevel() {
			return this.accessLevel;
		}

		public void setAccessLevel(Integer accessLevel) {
			this.accessLevel = accessLevel;
		}

		public String getImportStatus() {
			return this.importStatus;
		}

		public void setImportStatus(String importStatus) {
			this.importStatus = importStatus;
		}

		public Long getNamespaceId() {
			return this.namespaceId;
		}

		public void setNamespaceId(Long namespaceId) {
			this.namespaceId = namespaceId;
		}

		public String getUpdatedAt() {
			return this.updatedAt;
		}

		public void setUpdatedAt(String updatedAt) {
			this.updatedAt = updatedAt;
		}

		public Long getStarCount() {
			return this.starCount;
		}

		public void setStarCount(Long starCount) {
			this.starCount = starCount;
		}

		public Boolean getStar() {
			return this.star;
		}

		public void setStar(Boolean star) {
			this.star = star;
		}
	}

	@Override
	public ListRepositoriesResponse getInstance(UnmarshallerContext context) {
		return	ListRepositoriesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
