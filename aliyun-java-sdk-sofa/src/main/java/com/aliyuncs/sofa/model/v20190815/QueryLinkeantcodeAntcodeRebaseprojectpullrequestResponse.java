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
import com.aliyuncs.sofa.transform.v20190815.QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private String activeTime;

	private Boolean autoMerge;

	private Long compareId;

	private String createdAt;

	private String description;

	private Boolean ffOnlyEnabled;

	private Long id;

	private Long iid;

	private Boolean mergeable;

	private String mergeCommitMessage;

	private String mergeCommitSha;

	private String mergeError;

	private String mergeStatus;

	private Long responseStatusCode;

	private Boolean reviewed;

	private Boolean shouldBeRebased;

	private Boolean shouldRemoveSourceBranch;

	private String sourceBranch;

	private Long sourceProjectId;

	private Boolean squashMerge;

	private String state;

	private String targetBranch;

	private Long targetProjectId;

	private String title;

	private String updatedAt;

	private String url;

	private String webUrl;

	private Boolean workInProgress;

	private List<String> labels;

	private Assignee assignee;

	private Author author;

	private Review review;

	private Source source;

	private Target target;

	private UpdatedBy updatedBy;

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

	public String getActiveTime() {
		return this.activeTime;
	}

	public void setActiveTime(String activeTime) {
		this.activeTime = activeTime;
	}

	public Boolean getAutoMerge() {
		return this.autoMerge;
	}

	public void setAutoMerge(Boolean autoMerge) {
		this.autoMerge = autoMerge;
	}

	public Long getCompareId() {
		return this.compareId;
	}

	public void setCompareId(Long compareId) {
		this.compareId = compareId;
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

	public Boolean getFfOnlyEnabled() {
		return this.ffOnlyEnabled;
	}

	public void setFfOnlyEnabled(Boolean ffOnlyEnabled) {
		this.ffOnlyEnabled = ffOnlyEnabled;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIid() {
		return this.iid;
	}

	public void setIid(Long iid) {
		this.iid = iid;
	}

	public Boolean getMergeable() {
		return this.mergeable;
	}

	public void setMergeable(Boolean mergeable) {
		this.mergeable = mergeable;
	}

	public String getMergeCommitMessage() {
		return this.mergeCommitMessage;
	}

	public void setMergeCommitMessage(String mergeCommitMessage) {
		this.mergeCommitMessage = mergeCommitMessage;
	}

	public String getMergeCommitSha() {
		return this.mergeCommitSha;
	}

	public void setMergeCommitSha(String mergeCommitSha) {
		this.mergeCommitSha = mergeCommitSha;
	}

	public String getMergeError() {
		return this.mergeError;
	}

	public void setMergeError(String mergeError) {
		this.mergeError = mergeError;
	}

	public String getMergeStatus() {
		return this.mergeStatus;
	}

	public void setMergeStatus(String mergeStatus) {
		this.mergeStatus = mergeStatus;
	}

	public Long getResponseStatusCode() {
		return this.responseStatusCode;
	}

	public void setResponseStatusCode(Long responseStatusCode) {
		this.responseStatusCode = responseStatusCode;
	}

	public Boolean getReviewed() {
		return this.reviewed;
	}

	public void setReviewed(Boolean reviewed) {
		this.reviewed = reviewed;
	}

	public Boolean getShouldBeRebased() {
		return this.shouldBeRebased;
	}

	public void setShouldBeRebased(Boolean shouldBeRebased) {
		this.shouldBeRebased = shouldBeRebased;
	}

	public Boolean getShouldRemoveSourceBranch() {
		return this.shouldRemoveSourceBranch;
	}

	public void setShouldRemoveSourceBranch(Boolean shouldRemoveSourceBranch) {
		this.shouldRemoveSourceBranch = shouldRemoveSourceBranch;
	}

	public String getSourceBranch() {
		return this.sourceBranch;
	}

	public void setSourceBranch(String sourceBranch) {
		this.sourceBranch = sourceBranch;
	}

	public Long getSourceProjectId() {
		return this.sourceProjectId;
	}

	public void setSourceProjectId(Long sourceProjectId) {
		this.sourceProjectId = sourceProjectId;
	}

	public Boolean getSquashMerge() {
		return this.squashMerge;
	}

	public void setSquashMerge(Boolean squashMerge) {
		this.squashMerge = squashMerge;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getTargetBranch() {
		return this.targetBranch;
	}

	public void setTargetBranch(String targetBranch) {
		this.targetBranch = targetBranch;
	}

	public Long getTargetProjectId() {
		return this.targetProjectId;
	}

	public void setTargetProjectId(Long targetProjectId) {
		this.targetProjectId = targetProjectId;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getWebUrl() {
		return this.webUrl;
	}

	public void setWebUrl(String webUrl) {
		this.webUrl = webUrl;
	}

	public Boolean getWorkInProgress() {
		return this.workInProgress;
	}

	public void setWorkInProgress(Boolean workInProgress) {
		this.workInProgress = workInProgress;
	}

	public List<String> getLabels() {
		return this.labels;
	}

	public void setLabels(List<String> labels) {
		this.labels = labels;
	}

	public Assignee getAssignee() {
		return this.assignee;
	}

	public void setAssignee(Assignee assignee) {
		this.assignee = assignee;
	}

	public Author getAuthor() {
		return this.author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Review getReview() {
		return this.review;
	}

	public void setReview(Review review) {
		this.review = review;
	}

	public Source getSource() {
		return this.source;
	}

	public void setSource(Source source) {
		this.source = source;
	}

	public Target getTarget() {
		return this.target;
	}

	public void setTarget(Target target) {
		this.target = target;
	}

	public UpdatedBy getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(UpdatedBy updatedBy) {
		this.updatedBy = updatedBy;
	}

	public static class Assignee {

		private Long accessLevel;

		private String avatarUrl;

		private String createdAt;

		private String email;

		private String expiresAt;

		private String externUid;

		private Long id;

		private String name;

		private Long notificationLevel;

		private String state;

		private String updatedAt;

		private String username;

		private String webUrl;

		public Long getAccessLevel() {
			return this.accessLevel;
		}

		public void setAccessLevel(Long accessLevel) {
			this.accessLevel = accessLevel;
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

		public String getEmail() {
			return this.email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getExpiresAt() {
			return this.expiresAt;
		}

		public void setExpiresAt(String expiresAt) {
			this.expiresAt = expiresAt;
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

	public static class Author {

		private Long accessLevel;

		private String avatarUrl;

		private String createdAt;

		private String email;

		private String expiresAt;

		private String externUid;

		private Long id;

		private String name;

		private Long notificationLevel;

		private String state;

		private String updatedAt;

		private String username;

		private String webUrl;

		public Long getAccessLevel() {
			return this.accessLevel;
		}

		public void setAccessLevel(Long accessLevel) {
			this.accessLevel = accessLevel;
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

		public String getEmail() {
			return this.email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getExpiresAt() {
			return this.expiresAt;
		}

		public void setExpiresAt(String expiresAt) {
			this.expiresAt = expiresAt;
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

	public static class Review {

		private String createdAt;

		private Long id;

		private Long iid;

		private String rule;

		private String rulesType;

		private String state;

		private String stateDetail;

		private Boolean thresholdClear;

		private String updatedAt;

		private List<String> reviewers;

		public String getCreatedAt() {
			return this.createdAt;
		}

		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getIid() {
			return this.iid;
		}

		public void setIid(Long iid) {
			this.iid = iid;
		}

		public String getRule() {
			return this.rule;
		}

		public void setRule(String rule) {
			this.rule = rule;
		}

		public String getRulesType() {
			return this.rulesType;
		}

		public void setRulesType(String rulesType) {
			this.rulesType = rulesType;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getStateDetail() {
			return this.stateDetail;
		}

		public void setStateDetail(String stateDetail) {
			this.stateDetail = stateDetail;
		}

		public Boolean getThresholdClear() {
			return this.thresholdClear;
		}

		public void setThresholdClear(Boolean thresholdClear) {
			this.thresholdClear = thresholdClear;
		}

		public String getUpdatedAt() {
			return this.updatedAt;
		}

		public void setUpdatedAt(String updatedAt) {
			this.updatedAt = updatedAt;
		}

		public List<String> getReviewers() {
			return this.reviewers;
		}

		public void setReviewers(List<String> reviewers) {
			this.reviewers = reviewers;
		}
	}

	public static class Source {

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

		private String namespace;

		private String nameWithNamespace;

		private String owner;

		private String path;

		private String pathWithNamespace;

		private String permission;

		private Boolean _public;

		private String repositorySize;

		private Long repositorySizeLimit;

		private String runnersToken;

		private String sshUrlToRepo;

		private String visibility;

		private Long visibilityLevel;

		private String webUrl;

		private List<String> tagList;

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

		public String getNamespace() {
			return this.namespace;
		}

		public void setNamespace(String namespace) {
			this.namespace = namespace;
		}

		public String getNameWithNamespace() {
			return this.nameWithNamespace;
		}

		public void setNameWithNamespace(String nameWithNamespace) {
			this.nameWithNamespace = nameWithNamespace;
		}

		public String getOwner() {
			return this.owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
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
	}

	public static class Target {

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

		private String namespace;

		private String nameWithNamespace;

		private String owner;

		private String path;

		private String pathWithNamespace;

		private String permission;

		private Boolean _public;

		private String repositorySize;

		private Long repositorySizeLimit;

		private String runnersToken;

		private String sshUrlToRepo;

		private String visibility;

		private Long visibilityLevel;

		private String webUrl;

		private List<String> tagList1;

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

		public String getNamespace() {
			return this.namespace;
		}

		public void setNamespace(String namespace) {
			this.namespace = namespace;
		}

		public String getNameWithNamespace() {
			return this.nameWithNamespace;
		}

		public void setNameWithNamespace(String nameWithNamespace) {
			this.nameWithNamespace = nameWithNamespace;
		}

		public String getOwner() {
			return this.owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
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

		public List<String> getTagList1() {
			return this.tagList1;
		}

		public void setTagList1(List<String> tagList1) {
			this.tagList1 = tagList1;
		}
	}

	public static class UpdatedBy {

		private Long accessLevel;

		private String avatarUrl;

		private String createdAt;

		private String email;

		private String expiresAt;

		private String externUid;

		private Long id;

		private String name;

		private Long notificationLevel;

		private String state;

		private String updatedAt;

		private String username;

		private String webUrl;

		public Long getAccessLevel() {
			return this.accessLevel;
		}

		public void setAccessLevel(Long accessLevel) {
			this.accessLevel = accessLevel;
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

		public String getEmail() {
			return this.email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getExpiresAt() {
			return this.expiresAt;
		}

		public void setExpiresAt(String expiresAt) {
			this.expiresAt = expiresAt;
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

	@Override
	public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse getInstance(UnmarshallerContext context) {
		return	QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
