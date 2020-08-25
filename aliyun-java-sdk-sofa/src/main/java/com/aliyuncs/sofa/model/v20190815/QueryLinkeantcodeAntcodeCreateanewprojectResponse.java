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
import com.aliyuncs.sofa.transform.v20190815.QueryLinkeantcodeAntcodeCreateanewprojectResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryLinkeantcodeAntcodeCreateanewprojectResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Boolean archived;

	private Boolean artifacts;

	private String avatarUrl;

	private Boolean checkEmail;

	private String createdAt;

	private Long creatorId;

	private String defaultBranch;

	private String description;

	private String encoding;

	private String exceptBranch;

	private String homepage;

	private String httpUrlToRepo;

	private Long id;

	private String importStatus;

	private Boolean isGray;

	private Boolean isReview;

	private String lastActivityAt;

	private String name;

	private String nameWithNamespace;

	private String path;

	private String pathWithNamespace;

	private Boolean _public;

	private String repositorySize;

	private Long repositorySizeLimit;

	private String responsePage;

	private String responsePageInfoNextPage;

	private String responsePageInfoPerPage;

	private String responsePageInfoPrevPage;

	private String responsePageInfoTotal;

	private String responsePageInfoTotalPages;

	private Long responseStatusCode;

	private String runnersToken;

	private String sshUrlToRepo;

	private String visibility;

	private Long visibilityLevel;

	private String webUrl;

	private List<String> tagList;

	private Namespace namespace;

	private Owner owner;

	private Permission permission;

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

	public Boolean getArchived() {
		return this.archived;
	}

	public void setArchived(Boolean archived) {
		this.archived = archived;
	}

	public Boolean getArtifacts() {
		return this.artifacts;
	}

	public void setArtifacts(Boolean artifacts) {
		this.artifacts = artifacts;
	}

	public String getAvatarUrl() {
		return this.avatarUrl;
	}

	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}

	public Boolean getCheckEmail() {
		return this.checkEmail;
	}

	public void setCheckEmail(Boolean checkEmail) {
		this.checkEmail = checkEmail;
	}

	public String getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public Long getCreatorId() {
		return this.creatorId;
	}

	public void setCreatorId(Long creatorId) {
		this.creatorId = creatorId;
	}

	public String getDefaultBranch() {
		return this.defaultBranch;
	}

	public void setDefaultBranch(String defaultBranch) {
		this.defaultBranch = defaultBranch;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEncoding() {
		return this.encoding;
	}

	public void setEncoding(String encoding) {
		this.encoding = encoding;
	}

	public String getExceptBranch() {
		return this.exceptBranch;
	}

	public void setExceptBranch(String exceptBranch) {
		this.exceptBranch = exceptBranch;
	}

	public String getHomepage() {
		return this.homepage;
	}

	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}

	public String getHttpUrlToRepo() {
		return this.httpUrlToRepo;
	}

	public void setHttpUrlToRepo(String httpUrlToRepo) {
		this.httpUrlToRepo = httpUrlToRepo;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getImportStatus() {
		return this.importStatus;
	}

	public void setImportStatus(String importStatus) {
		this.importStatus = importStatus;
	}

	public Boolean getIsGray() {
		return this.isGray;
	}

	public void setIsGray(Boolean isGray) {
		this.isGray = isGray;
	}

	public Boolean getIsReview() {
		return this.isReview;
	}

	public void setIsReview(Boolean isReview) {
		this.isReview = isReview;
	}

	public String getLastActivityAt() {
		return this.lastActivityAt;
	}

	public void setLastActivityAt(String lastActivityAt) {
		this.lastActivityAt = lastActivityAt;
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

	public Boolean get_Public() {
		return this._public;
	}

	public void set_Public(Boolean _public) {
		this._public = _public;
	}

	public String getRepositorySize() {
		return this.repositorySize;
	}

	public void setRepositorySize(String repositorySize) {
		this.repositorySize = repositorySize;
	}

	public Long getRepositorySizeLimit() {
		return this.repositorySizeLimit;
	}

	public void setRepositorySizeLimit(Long repositorySizeLimit) {
		this.repositorySizeLimit = repositorySizeLimit;
	}

	public String getResponsePage() {
		return this.responsePage;
	}

	public void setResponsePage(String responsePage) {
		this.responsePage = responsePage;
	}

	public String getResponsePageInfoNextPage() {
		return this.responsePageInfoNextPage;
	}

	public void setResponsePageInfoNextPage(String responsePageInfoNextPage) {
		this.responsePageInfoNextPage = responsePageInfoNextPage;
	}

	public String getResponsePageInfoPerPage() {
		return this.responsePageInfoPerPage;
	}

	public void setResponsePageInfoPerPage(String responsePageInfoPerPage) {
		this.responsePageInfoPerPage = responsePageInfoPerPage;
	}

	public String getResponsePageInfoPrevPage() {
		return this.responsePageInfoPrevPage;
	}

	public void setResponsePageInfoPrevPage(String responsePageInfoPrevPage) {
		this.responsePageInfoPrevPage = responsePageInfoPrevPage;
	}

	public String getResponsePageInfoTotal() {
		return this.responsePageInfoTotal;
	}

	public void setResponsePageInfoTotal(String responsePageInfoTotal) {
		this.responsePageInfoTotal = responsePageInfoTotal;
	}

	public String getResponsePageInfoTotalPages() {
		return this.responsePageInfoTotalPages;
	}

	public void setResponsePageInfoTotalPages(String responsePageInfoTotalPages) {
		this.responsePageInfoTotalPages = responsePageInfoTotalPages;
	}

	public Long getResponseStatusCode() {
		return this.responseStatusCode;
	}

	public void setResponseStatusCode(Long responseStatusCode) {
		this.responseStatusCode = responseStatusCode;
	}

	public String getRunnersToken() {
		return this.runnersToken;
	}

	public void setRunnersToken(String runnersToken) {
		this.runnersToken = runnersToken;
	}

	public String getSshUrlToRepo() {
		return this.sshUrlToRepo;
	}

	public void setSshUrlToRepo(String sshUrlToRepo) {
		this.sshUrlToRepo = sshUrlToRepo;
	}

	public String getVisibility() {
		return this.visibility;
	}

	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}

	public Long getVisibilityLevel() {
		return this.visibilityLevel;
	}

	public void setVisibilityLevel(Long visibilityLevel) {
		this.visibilityLevel = visibilityLevel;
	}

	public String getWebUrl() {
		return this.webUrl;
	}

	public void setWebUrl(String webUrl) {
		this.webUrl = webUrl;
	}

	public List<String> getTagList() {
		return this.tagList;
	}

	public void setTagList(List<String> tagList) {
		this.tagList = tagList;
	}

	public Namespace getNamespace() {
		return this.namespace;
	}

	public void setNamespace(Namespace namespace) {
		this.namespace = namespace;
	}

	public Owner getOwner() {
		return this.owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public Permission getPermission() {
		return this.permission;
	}

	public void setPermission(Permission permission) {
		this.permission = permission;
	}

	public static class Namespace {

		private String avatar;

		private String avatarUrl;

		private String createdAt;

		private String description;

		private Long id;

		private String name;

		private String owner;

		private Long ownerId;

		private String path;

		private String permission;

		private Boolean _public;

		private String state;

		private String tenant;

		private String type;

		private String updatedAt;

		private String webUrl;

		public String getAvatar() {
			return this.avatar;
		}

		public void setAvatar(String avatar) {
			this.avatar = avatar;
		}

		public String getAvatarUrl() {
			return this.avatarUrl;
		}

		public void setAvatarUrl(String avatarUrl) {
			this.avatarUrl = avatarUrl;
		}

		public String getCreatedAt() {
			return this.createdAt;
		}

		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

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

		public String getOwner() {
			return this.owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public Long getOwnerId() {
			return this.ownerId;
		}

		public void setOwnerId(Long ownerId) {
			this.ownerId = ownerId;
		}

		public String getPath() {
			return this.path;
		}

		public void setPath(String path) {
			this.path = path;
		}

		public String getPermission() {
			return this.permission;
		}

		public void setPermission(String permission) {
			this.permission = permission;
		}

		public Boolean get_Public() {
			return this._public;
		}

		public void set_Public(Boolean _public) {
			this._public = _public;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getTenant() {
			return this.tenant;
		}

		public void setTenant(String tenant) {
			this.tenant = tenant;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getUpdatedAt() {
			return this.updatedAt;
		}

		public void setUpdatedAt(String updatedAt) {
			this.updatedAt = updatedAt;
		}

		public String getWebUrl() {
			return this.webUrl;
		}

		public void setWebUrl(String webUrl) {
			this.webUrl = webUrl;
		}
	}

	public static class Owner {

		private String avatarUrl;

		private String createdAt;

		private String email;

		private String externUid;

		private Long id;

		private String name;

		private Long notificationLevel;

		private String state;

		private String updatedAt;

		private String username;

		private String webUrl;

		public String getAvatarUrl() {
			return this.avatarUrl;
		}

		public void setAvatarUrl(String avatarUrl) {
			this.avatarUrl = avatarUrl;
		}

		public String getCreatedAt() {
			return this.createdAt;
		}

		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}

		public String getEmail() {
			return this.email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getExternUid() {
			return this.externUid;
		}

		public void setExternUid(String externUid) {
			this.externUid = externUid;
		}

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

		public Long getNotificationLevel() {
			return this.notificationLevel;
		}

		public void setNotificationLevel(Long notificationLevel) {
			this.notificationLevel = notificationLevel;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getUpdatedAt() {
			return this.updatedAt;
		}

		public void setUpdatedAt(String updatedAt) {
			this.updatedAt = updatedAt;
		}

		public String getUsername() {
			return this.username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getWebUrl() {
			return this.webUrl;
		}

		public void setWebUrl(String webUrl) {
			this.webUrl = webUrl;
		}
	}

	public static class Permission {

		private String groupAccess;

		private String projectAccess;

		private String reviewAccess;

		private String tenantAccess;

		public String getGroupAccess() {
			return this.groupAccess;
		}

		public void setGroupAccess(String groupAccess) {
			this.groupAccess = groupAccess;
		}

		public String getProjectAccess() {
			return this.projectAccess;
		}

		public void setProjectAccess(String projectAccess) {
			this.projectAccess = projectAccess;
		}

		public String getReviewAccess() {
			return this.reviewAccess;
		}

		public void setReviewAccess(String reviewAccess) {
			this.reviewAccess = reviewAccess;
		}

		public String getTenantAccess() {
			return this.tenantAccess;
		}

		public void setTenantAccess(String tenantAccess) {
			this.tenantAccess = tenantAccess;
		}
	}

	@Override
	public QueryLinkeantcodeAntcodeCreateanewprojectResponse getInstance(UnmarshallerContext context) {
		return	QueryLinkeantcodeAntcodeCreateanewprojectResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
