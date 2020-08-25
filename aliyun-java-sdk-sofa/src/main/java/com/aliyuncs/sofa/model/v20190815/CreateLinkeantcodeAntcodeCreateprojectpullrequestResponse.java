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
import com.aliyuncs.sofa.transform.v20190815.CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private String action;

	private String activeTime;

	private Boolean autoMerge;

	private Long compareId;

	private String createdAt;

	private String description;

	private Boolean ffOnlyEnabled;

	private Long id;

	private Long iid;

	private Boolean mergeable;

	private String mergedAt;

	private String mergeCommitMessage;

	private String mergeCommitSha;

	private String mergeError;

	private String mergeStatus;

	private Long responseStatusCode;

	private Boolean reviewed;

	private String reviewAction;

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

	private List<IssuesItem> issues;

	private List<String> labels;

	private Assignee assignee;

	private Author author;

	private LastCommit lastCommit;

	private MergedBy mergedBy;

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

	public String getAction() {
		return this.action;
	}

	public void setAction(String action) {
		this.action = action;
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

	public String getMergedAt() {
		return this.mergedAt;
	}

	public void setMergedAt(String mergedAt) {
		this.mergedAt = mergedAt;
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

	public String getReviewAction() {
		return this.reviewAction;
	}

	public void setReviewAction(String reviewAction) {
		this.reviewAction = reviewAction;
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

	public List<IssuesItem> getIssues() {
		return this.issues;
	}

	public void setIssues(List<IssuesItem> issues) {
		this.issues = issues;
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

	public LastCommit getLastCommit() {
		return this.lastCommit;
	}

	public void setLastCommit(LastCommit lastCommit) {
		this.lastCommit = lastCommit;
	}

	public MergedBy getMergedBy() {
		return this.mergedBy;
	}

	public void setMergedBy(MergedBy mergedBy) {
		this.mergedBy = mergedBy;
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

	public static class IssuesItem {

		private Long id;

		private String issueId;

		private String issueProvider;

		private String issueSite;

		private String issueTitle;

		private String issueType;

		private String issueUrl;

		private Long pullRequestId;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getIssueId() {
			return this.issueId;
		}

		public void setIssueId(String issueId) {
			this.issueId = issueId;
		}

		public String getIssueProvider() {
			return this.issueProvider;
		}

		public void setIssueProvider(String issueProvider) {
			this.issueProvider = issueProvider;
		}

		public String getIssueSite() {
			return this.issueSite;
		}

		public void setIssueSite(String issueSite) {
			this.issueSite = issueSite;
		}

		public String getIssueTitle() {
			return this.issueTitle;
		}

		public void setIssueTitle(String issueTitle) {
			this.issueTitle = issueTitle;
		}

		public String getIssueType() {
			return this.issueType;
		}

		public void setIssueType(String issueType) {
			this.issueType = issueType;
		}

		public String getIssueUrl() {
			return this.issueUrl;
		}

		public void setIssueUrl(String issueUrl) {
			this.issueUrl = issueUrl;
		}

		public Long getPullRequestId() {
			return this.pullRequestId;
		}

		public void setPullRequestId(Long pullRequestId) {
			this.pullRequestId = pullRequestId;
		}
	}

	public static class Assignee {

		private Long accessLevel;

		private String avatarUrl;

		private String bio;

		private Boolean canCreateGroup;

		private Boolean canCreateProject;

		private Long colorSchemeId;

		private String createdAt;

		private String currentSignInAt;

		private String department;

		private String email;

		private String expiresAt;

		private String externUid;

		private Long id;

		private Boolean isAdmin;

		private String name;

		private String privateToken;

		private Long projectsLimit;

		private Boolean registered;

		private Long role;

		private String state;

		private Long themeId;

		private String updatedAt;

		private String username;

		private String websiteUrl;

		private String webUrl;

		private List<String> identities;

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

		public String getBio() {
			return this.bio;
		}

		public void setBio(String bio) {
			this.bio = bio;
		}

		public Boolean getCanCreateGroup() {
			return this.canCreateGroup;
		}

		public void setCanCreateGroup(Boolean canCreateGroup) {
			this.canCreateGroup = canCreateGroup;
		}

		public Boolean getCanCreateProject() {
			return this.canCreateProject;
		}

		public void setCanCreateProject(Boolean canCreateProject) {
			this.canCreateProject = canCreateProject;
		}

		public Long getColorSchemeId() {
			return this.colorSchemeId;
		}

		public void setColorSchemeId(Long colorSchemeId) {
			this.colorSchemeId = colorSchemeId;
		}

		public String getCreatedAt() {
			return this.createdAt;
		}

		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}

		public String getCurrentSignInAt() {
			return this.currentSignInAt;
		}

		public void setCurrentSignInAt(String currentSignInAt) {
			this.currentSignInAt = currentSignInAt;
		}

		public String getDepartment() {
			return this.department;
		}

		public void setDepartment(String department) {
			this.department = department;
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

		public Boolean getIsAdmin() {
			return this.isAdmin;
		}

		public void setIsAdmin(Boolean isAdmin) {
			this.isAdmin = isAdmin;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPrivateToken() {
			return this.privateToken;
		}

		public void setPrivateToken(String privateToken) {
			this.privateToken = privateToken;
		}

		public Long getProjectsLimit() {
			return this.projectsLimit;
		}

		public void setProjectsLimit(Long projectsLimit) {
			this.projectsLimit = projectsLimit;
		}

		public Boolean getRegistered() {
			return this.registered;
		}

		public void setRegistered(Boolean registered) {
			this.registered = registered;
		}

		public Long getRole() {
			return this.role;
		}

		public void setRole(Long role) {
			this.role = role;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public Long getThemeId() {
			return this.themeId;
		}

		public void setThemeId(Long themeId) {
			this.themeId = themeId;
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

		public String getWebsiteUrl() {
			return this.websiteUrl;
		}

		public void setWebsiteUrl(String websiteUrl) {
			this.websiteUrl = websiteUrl;
		}

		public String getWebUrl() {
			return this.webUrl;
		}

		public void setWebUrl(String webUrl) {
			this.webUrl = webUrl;
		}

		public List<String> getIdentities() {
			return this.identities;
		}

		public void setIdentities(List<String> identities) {
			this.identities = identities;
		}
	}

	public static class Author {

		private Long accessLevel;

		private String avatarUrl;

		private String bio;

		private Boolean canCreateGroup;

		private Boolean canCreateProject;

		private Long colorSchemeId;

		private String createdAt;

		private String currentSignInAt;

		private String department;

		private String email;

		private String expiresAt;

		private String externUid;

		private Long id;

		private Boolean isAdmin;

		private String name;

		private String privateToken;

		private Long projectsLimit;

		private Boolean registered;

		private Long role;

		private String state;

		private Long themeId;

		private String updatedAt;

		private String username;

		private String websiteUrl;

		private String webUrl;

		private List<String> identities1;

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

		public String getBio() {
			return this.bio;
		}

		public void setBio(String bio) {
			this.bio = bio;
		}

		public Boolean getCanCreateGroup() {
			return this.canCreateGroup;
		}

		public void setCanCreateGroup(Boolean canCreateGroup) {
			this.canCreateGroup = canCreateGroup;
		}

		public Boolean getCanCreateProject() {
			return this.canCreateProject;
		}

		public void setCanCreateProject(Boolean canCreateProject) {
			this.canCreateProject = canCreateProject;
		}

		public Long getColorSchemeId() {
			return this.colorSchemeId;
		}

		public void setColorSchemeId(Long colorSchemeId) {
			this.colorSchemeId = colorSchemeId;
		}

		public String getCreatedAt() {
			return this.createdAt;
		}

		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}

		public String getCurrentSignInAt() {
			return this.currentSignInAt;
		}

		public void setCurrentSignInAt(String currentSignInAt) {
			this.currentSignInAt = currentSignInAt;
		}

		public String getDepartment() {
			return this.department;
		}

		public void setDepartment(String department) {
			this.department = department;
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

		public Boolean getIsAdmin() {
			return this.isAdmin;
		}

		public void setIsAdmin(Boolean isAdmin) {
			this.isAdmin = isAdmin;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPrivateToken() {
			return this.privateToken;
		}

		public void setPrivateToken(String privateToken) {
			this.privateToken = privateToken;
		}

		public Long getProjectsLimit() {
			return this.projectsLimit;
		}

		public void setProjectsLimit(Long projectsLimit) {
			this.projectsLimit = projectsLimit;
		}

		public Boolean getRegistered() {
			return this.registered;
		}

		public void setRegistered(Boolean registered) {
			this.registered = registered;
		}

		public Long getRole() {
			return this.role;
		}

		public void setRole(Long role) {
			this.role = role;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public Long getThemeId() {
			return this.themeId;
		}

		public void setThemeId(Long themeId) {
			this.themeId = themeId;
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

		public String getWebsiteUrl() {
			return this.websiteUrl;
		}

		public void setWebsiteUrl(String websiteUrl) {
			this.websiteUrl = websiteUrl;
		}

		public String getWebUrl() {
			return this.webUrl;
		}

		public void setWebUrl(String webUrl) {
			this.webUrl = webUrl;
		}

		public List<String> getIdentities1() {
			return this.identities1;
		}

		public void setIdentities1(List<String> identities1) {
			this.identities1 = identities1;
		}
	}

	public static class LastCommit {

		private String author;

		private String id;

		private String message;

		private String timestamp;

		private String url;

		public String getAuthor() {
			return this.author;
		}

		public void setAuthor(String author) {
			this.author = author;
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

		public String getTimestamp() {
			return this.timestamp;
		}

		public void setTimestamp(String timestamp) {
			this.timestamp = timestamp;
		}

		public String getUrl() {
			return this.url;
		}

		public void setUrl(String url) {
			this.url = url;
		}
	}

	public static class MergedBy {

		private Long accessLevel;

		private String avatarUrl;

		private String bio;

		private Boolean canCreateGroup;

		private Boolean canCreateProject;

		private Long colorSchemeId;

		private String createdAt;

		private String currentSignInAt;

		private String department;

		private String email;

		private String expiresAt;

		private String externUid;

		private Long id;

		private Boolean isAdmin;

		private String name;

		private String privateToken;

		private Long projectsLimit;

		private Boolean registered;

		private Long role;

		private String state;

		private Long themeId;

		private String updatedAt;

		private String username;

		private String websiteUrl;

		private String webUrl;

		private List<String> identities2;

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

		public String getBio() {
			return this.bio;
		}

		public void setBio(String bio) {
			this.bio = bio;
		}

		public Boolean getCanCreateGroup() {
			return this.canCreateGroup;
		}

		public void setCanCreateGroup(Boolean canCreateGroup) {
			this.canCreateGroup = canCreateGroup;
		}

		public Boolean getCanCreateProject() {
			return this.canCreateProject;
		}

		public void setCanCreateProject(Boolean canCreateProject) {
			this.canCreateProject = canCreateProject;
		}

		public Long getColorSchemeId() {
			return this.colorSchemeId;
		}

		public void setColorSchemeId(Long colorSchemeId) {
			this.colorSchemeId = colorSchemeId;
		}

		public String getCreatedAt() {
			return this.createdAt;
		}

		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}

		public String getCurrentSignInAt() {
			return this.currentSignInAt;
		}

		public void setCurrentSignInAt(String currentSignInAt) {
			this.currentSignInAt = currentSignInAt;
		}

		public String getDepartment() {
			return this.department;
		}

		public void setDepartment(String department) {
			this.department = department;
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

		public Boolean getIsAdmin() {
			return this.isAdmin;
		}

		public void setIsAdmin(Boolean isAdmin) {
			this.isAdmin = isAdmin;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPrivateToken() {
			return this.privateToken;
		}

		public void setPrivateToken(String privateToken) {
			this.privateToken = privateToken;
		}

		public Long getProjectsLimit() {
			return this.projectsLimit;
		}

		public void setProjectsLimit(Long projectsLimit) {
			this.projectsLimit = projectsLimit;
		}

		public Boolean getRegistered() {
			return this.registered;
		}

		public void setRegistered(Boolean registered) {
			this.registered = registered;
		}

		public Long getRole() {
			return this.role;
		}

		public void setRole(Long role) {
			this.role = role;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public Long getThemeId() {
			return this.themeId;
		}

		public void setThemeId(Long themeId) {
			this.themeId = themeId;
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

		public String getWebsiteUrl() {
			return this.websiteUrl;
		}

		public void setWebsiteUrl(String websiteUrl) {
			this.websiteUrl = websiteUrl;
		}

		public String getWebUrl() {
			return this.webUrl;
		}

		public void setWebUrl(String webUrl) {
			this.webUrl = webUrl;
		}

		public List<String> getIdentities2() {
			return this.identities2;
		}

		public void setIdentities2(List<String> identities2) {
			this.identities2 = identities2;
		}
	}

	public static class Review {

		private String author;

		private String createdAt;

		private String description;

		private Long id;

		private Long iid;

		private String rule;

		private String rulesType;

		private String sourceBranch;

		private String sourceProject;

		private String state;

		private String stateDetail;

		private String targetBranch;

		private String targetProject;

		private Boolean thresholdClear;

		private String title;

		private String type;

		private String updatedAt;

		private List<String> reviewers;

		private List<String> tasks;

		public String getAuthor() {
			return this.author;
		}

		public void setAuthor(String author) {
			this.author = author;
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

		public String getSourceBranch() {
			return this.sourceBranch;
		}

		public void setSourceBranch(String sourceBranch) {
			this.sourceBranch = sourceBranch;
		}

		public String getSourceProject() {
			return this.sourceProject;
		}

		public void setSourceProject(String sourceProject) {
			this.sourceProject = sourceProject;
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

		public String getTargetBranch() {
			return this.targetBranch;
		}

		public void setTargetBranch(String targetBranch) {
			this.targetBranch = targetBranch;
		}

		public String getTargetProject() {
			return this.targetProject;
		}

		public void setTargetProject(String targetProject) {
			this.targetProject = targetProject;
		}

		public Boolean getThresholdClear() {
			return this.thresholdClear;
		}

		public void setThresholdClear(Boolean thresholdClear) {
			this.thresholdClear = thresholdClear;
		}

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
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

		public List<String> getReviewers() {
			return this.reviewers;
		}

		public void setReviewers(List<String> reviewers) {
			this.reviewers = reviewers;
		}

		public List<String> getTasks() {
			return this.tasks;
		}

		public void setTasks(List<String> tasks) {
			this.tasks = tasks;
		}
	}

	public static class Source {

		private String httpUrl;

		private Long id;

		private String name;

		private String nameWithNamespace;

		private String path;

		private String pathWithNamespace;

		private String sshUrl;

		private Long visibilityLevel;

		private String webUrl;

		public String getHttpUrl() {
			return this.httpUrl;
		}

		public void setHttpUrl(String httpUrl) {
			this.httpUrl = httpUrl;
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

		public String getSshUrl() {
			return this.sshUrl;
		}

		public void setSshUrl(String sshUrl) {
			this.sshUrl = sshUrl;
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
	}

	public static class Target {

		private String httpUrl;

		private Long id;

		private String name;

		private String nameWithNamespace;

		private String path;

		private String pathWithNamespace;

		private String sshUrl;

		private Long visibilityLevel;

		private String webUrl;

		public String getHttpUrl() {
			return this.httpUrl;
		}

		public void setHttpUrl(String httpUrl) {
			this.httpUrl = httpUrl;
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

		public String getSshUrl() {
			return this.sshUrl;
		}

		public void setSshUrl(String sshUrl) {
			this.sshUrl = sshUrl;
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
	}

	public static class UpdatedBy {

		private Long accessLevel;

		private String avatarUrl;

		private String bio;

		private Boolean canCreateGroup;

		private Boolean canCreateProject;

		private Long colorSchemeId;

		private String createdAt;

		private String currentSignInAt;

		private String department;

		private String email;

		private String expiresAt;

		private String externUid;

		private Long id;

		private Boolean isAdmin;

		private String name;

		private String privateToken;

		private Long projectsLimit;

		private Boolean registered;

		private Long role;

		private String state;

		private Long themeId;

		private String updatedAt;

		private String username;

		private String websiteUrl;

		private String webUrl;

		private List<String> identities3;

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

		public String getBio() {
			return this.bio;
		}

		public void setBio(String bio) {
			this.bio = bio;
		}

		public Boolean getCanCreateGroup() {
			return this.canCreateGroup;
		}

		public void setCanCreateGroup(Boolean canCreateGroup) {
			this.canCreateGroup = canCreateGroup;
		}

		public Boolean getCanCreateProject() {
			return this.canCreateProject;
		}

		public void setCanCreateProject(Boolean canCreateProject) {
			this.canCreateProject = canCreateProject;
		}

		public Long getColorSchemeId() {
			return this.colorSchemeId;
		}

		public void setColorSchemeId(Long colorSchemeId) {
			this.colorSchemeId = colorSchemeId;
		}

		public String getCreatedAt() {
			return this.createdAt;
		}

		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}

		public String getCurrentSignInAt() {
			return this.currentSignInAt;
		}

		public void setCurrentSignInAt(String currentSignInAt) {
			this.currentSignInAt = currentSignInAt;
		}

		public String getDepartment() {
			return this.department;
		}

		public void setDepartment(String department) {
			this.department = department;
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

		public Boolean getIsAdmin() {
			return this.isAdmin;
		}

		public void setIsAdmin(Boolean isAdmin) {
			this.isAdmin = isAdmin;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPrivateToken() {
			return this.privateToken;
		}

		public void setPrivateToken(String privateToken) {
			this.privateToken = privateToken;
		}

		public Long getProjectsLimit() {
			return this.projectsLimit;
		}

		public void setProjectsLimit(Long projectsLimit) {
			this.projectsLimit = projectsLimit;
		}

		public Boolean getRegistered() {
			return this.registered;
		}

		public void setRegistered(Boolean registered) {
			this.registered = registered;
		}

		public Long getRole() {
			return this.role;
		}

		public void setRole(Long role) {
			this.role = role;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public Long getThemeId() {
			return this.themeId;
		}

		public void setThemeId(Long themeId) {
			this.themeId = themeId;
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

		public String getWebsiteUrl() {
			return this.websiteUrl;
		}

		public void setWebsiteUrl(String websiteUrl) {
			this.websiteUrl = websiteUrl;
		}

		public String getWebUrl() {
			return this.webUrl;
		}

		public void setWebUrl(String webUrl) {
			this.webUrl = webUrl;
		}

		public List<String> getIdentities3() {
			return this.identities3;
		}

		public void setIdentities3(List<String> identities3) {
			this.identities3 = identities3;
		}
	}

	@Override
	public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse getInstance(UnmarshallerContext context) {
		return	CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
