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
import com.aliyuncs.sofa.transform.v20190815.ExecLinkeantcodeAntcodeCommitreviewResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ExecLinkeantcodeAntcodeCommitreviewResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private String body;

	private String createdAt;

	private Long id;

	private Boolean pending;

	private Long pullRequestId;

	private Long responseStatusCode;

	private String updatedAt;

	private List<ReviewNotesItem> reviewNotes;

	private Author author;

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

	public String getBody() {
		return this.body;
	}

	public void setBody(String body) {
		this.body = body;
	}

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

	public Boolean getPending() {
		return this.pending;
	}

	public void setPending(Boolean pending) {
		this.pending = pending;
	}

	public Long getPullRequestId() {
		return this.pullRequestId;
	}

	public void setPullRequestId(Long pullRequestId) {
		this.pullRequestId = pullRequestId;
	}

	public Long getResponseStatusCode() {
		return this.responseStatusCode;
	}

	public void setResponseStatusCode(Long responseStatusCode) {
		this.responseStatusCode = responseStatusCode;
	}

	public String getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	public List<ReviewNotesItem> getReviewNotes() {
		return this.reviewNotes;
	}

	public void setReviewNotes(List<ReviewNotesItem> reviewNotes) {
		this.reviewNotes = reviewNotes;
	}

	public Author getAuthor() {
		return this.author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public static class ReviewNotesItem {

		private String author;

		private String commitId;

		private String createdAt;

		private Long discussionId;

		private Long id;

		private Boolean isAward;

		private String latestStDiff;

		private String lineCode;

		private String lineType;

		private String note;

		private Long noteableId;

		private String noteableType;

		private Boolean outdated;

		private String path;

		private Long projectId;

		private String resolvedAt;

		private String resolvedBy;

		private String state;

		private String stDiff;

		private Boolean system;

		private String type;

		private String updatedAt;

		private String url;

		private List<String> discussions;

		private List<String> labels;

		public String getAuthor() {
			return this.author;
		}

		public void setAuthor(String author) {
			this.author = author;
		}

		public String getCommitId() {
			return this.commitId;
		}

		public void setCommitId(String commitId) {
			this.commitId = commitId;
		}

		public String getCreatedAt() {
			return this.createdAt;
		}

		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}

		public Long getDiscussionId() {
			return this.discussionId;
		}

		public void setDiscussionId(Long discussionId) {
			this.discussionId = discussionId;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Boolean getIsAward() {
			return this.isAward;
		}

		public void setIsAward(Boolean isAward) {
			this.isAward = isAward;
		}

		public String getLatestStDiff() {
			return this.latestStDiff;
		}

		public void setLatestStDiff(String latestStDiff) {
			this.latestStDiff = latestStDiff;
		}

		public String getLineCode() {
			return this.lineCode;
		}

		public void setLineCode(String lineCode) {
			this.lineCode = lineCode;
		}

		public String getLineType() {
			return this.lineType;
		}

		public void setLineType(String lineType) {
			this.lineType = lineType;
		}

		public String getNote() {
			return this.note;
		}

		public void setNote(String note) {
			this.note = note;
		}

		public Long getNoteableId() {
			return this.noteableId;
		}

		public void setNoteableId(Long noteableId) {
			this.noteableId = noteableId;
		}

		public String getNoteableType() {
			return this.noteableType;
		}

		public void setNoteableType(String noteableType) {
			this.noteableType = noteableType;
		}

		public Boolean getOutdated() {
			return this.outdated;
		}

		public void setOutdated(Boolean outdated) {
			this.outdated = outdated;
		}

		public String getPath() {
			return this.path;
		}

		public void setPath(String path) {
			this.path = path;
		}

		public Long getProjectId() {
			return this.projectId;
		}

		public void setProjectId(Long projectId) {
			this.projectId = projectId;
		}

		public String getResolvedAt() {
			return this.resolvedAt;
		}

		public void setResolvedAt(String resolvedAt) {
			this.resolvedAt = resolvedAt;
		}

		public String getResolvedBy() {
			return this.resolvedBy;
		}

		public void setResolvedBy(String resolvedBy) {
			this.resolvedBy = resolvedBy;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getStDiff() {
			return this.stDiff;
		}

		public void setStDiff(String stDiff) {
			this.stDiff = stDiff;
		}

		public Boolean getSystem() {
			return this.system;
		}

		public void setSystem(Boolean system) {
			this.system = system;
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

		public String getUrl() {
			return this.url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		public List<String> getDiscussions() {
			return this.discussions;
		}

		public void setDiscussions(List<String> discussions) {
			this.discussions = discussions;
		}

		public List<String> getLabels() {
			return this.labels;
		}

		public void setLabels(List<String> labels) {
			this.labels = labels;
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

	@Override
	public ExecLinkeantcodeAntcodeCommitreviewResponse getInstance(UnmarshallerContext context) {
		return	ExecLinkeantcodeAntcodeCommitreviewResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
