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
import com.aliyuncs.sofa.transform.v20190815.AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private String commitId;

	private String createdAt;

	private Long discussionId;

	private Long id;

	private Boolean isAward;

	private String lineCode;

	private String lineType;

	private String note;

	private Long noteableId;

	private String noteableType;

	private Boolean outdated;

	private String path;

	private Long projectId;

	private String resolvedAt;

	private Long responseStatusCode;

	private String state;

	private Boolean system;

	private String type;

	private String updatedAt;

	private String url;

	private List<DiscussionsItem> discussions;

	private List<String> labels;

	private Author author;

	private LatestStDiff latestStDiff;

	private ResolvedBy resolvedBy;

	private StDiff stDiff;

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

	public Long getResponseStatusCode() {
		return this.responseStatusCode;
	}

	public void setResponseStatusCode(Long responseStatusCode) {
		this.responseStatusCode = responseStatusCode;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
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

	public List<DiscussionsItem> getDiscussions() {
		return this.discussions;
	}

	public void setDiscussions(List<DiscussionsItem> discussions) {
		this.discussions = discussions;
	}

	public List<String> getLabels() {
		return this.labels;
	}

	public void setLabels(List<String> labels) {
		this.labels = labels;
	}

	public Author getAuthor() {
		return this.author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public LatestStDiff getLatestStDiff() {
		return this.latestStDiff;
	}

	public void setLatestStDiff(LatestStDiff latestStDiff) {
		this.latestStDiff = latestStDiff;
	}

	public ResolvedBy getResolvedBy() {
		return this.resolvedBy;
	}

	public void setResolvedBy(ResolvedBy resolvedBy) {
		this.resolvedBy = resolvedBy;
	}

	public StDiff getStDiff() {
		return this.stDiff;
	}

	public void setStDiff(StDiff stDiff) {
		this.stDiff = stDiff;
	}

	public static class DiscussionsItem {

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

		private List<String> discussions1;

		private List<String> labels2;

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

		public List<String> getDiscussions1() {
			return this.discussions1;
		}

		public void setDiscussions1(List<String> discussions1) {
			this.discussions1 = discussions1;
		}

		public List<String> getLabels2() {
			return this.labels2;
		}

		public void setLabels2(List<String> labels2) {
			this.labels2 = labels2;
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

	public static class LatestStDiff {

		private Long addLineNum;

		private String amode;

		private String aMode;

		private Boolean binaryFile;

		private String bmode;

		private String bMode;

		private String charsetName;

		private Long compareDiffId;

		private String createdAt;

		private Boolean deletedFile;

		private Long delLineNum;

		private String diff;

		private String highlightedDiff;

		private Long id;

		private Boolean newFile;

		private String newPath;

		private String oldPath;

		private Boolean renamedFile;

		private String suffix;

		private Boolean tooLarge;

		private String updatedAt;

		public Long getAddLineNum() {
			return this.addLineNum;
		}

		public void setAddLineNum(Long addLineNum) {
			this.addLineNum = addLineNum;
		}

		public String getAmode() {
			return this.amode;
		}

		public void setAmode(String amode) {
			this.amode = amode;
		}

		public String getAMode() {
			return this.aMode;
		}

		public void setAMode(String aMode) {
			this.aMode = aMode;
		}

		public Boolean getBinaryFile() {
			return this.binaryFile;
		}

		public void setBinaryFile(Boolean binaryFile) {
			this.binaryFile = binaryFile;
		}

		public String getBmode() {
			return this.bmode;
		}

		public void setBmode(String bmode) {
			this.bmode = bmode;
		}

		public String getBMode() {
			return this.bMode;
		}

		public void setBMode(String bMode) {
			this.bMode = bMode;
		}

		public String getCharsetName() {
			return this.charsetName;
		}

		public void setCharsetName(String charsetName) {
			this.charsetName = charsetName;
		}

		public Long getCompareDiffId() {
			return this.compareDiffId;
		}

		public void setCompareDiffId(Long compareDiffId) {
			this.compareDiffId = compareDiffId;
		}

		public String getCreatedAt() {
			return this.createdAt;
		}

		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}

		public Boolean getDeletedFile() {
			return this.deletedFile;
		}

		public void setDeletedFile(Boolean deletedFile) {
			this.deletedFile = deletedFile;
		}

		public Long getDelLineNum() {
			return this.delLineNum;
		}

		public void setDelLineNum(Long delLineNum) {
			this.delLineNum = delLineNum;
		}

		public String getDiff() {
			return this.diff;
		}

		public void setDiff(String diff) {
			this.diff = diff;
		}

		public String getHighlightedDiff() {
			return this.highlightedDiff;
		}

		public void setHighlightedDiff(String highlightedDiff) {
			this.highlightedDiff = highlightedDiff;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Boolean getNewFile() {
			return this.newFile;
		}

		public void setNewFile(Boolean newFile) {
			this.newFile = newFile;
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

		public Boolean getRenamedFile() {
			return this.renamedFile;
		}

		public void setRenamedFile(Boolean renamedFile) {
			this.renamedFile = renamedFile;
		}

		public String getSuffix() {
			return this.suffix;
		}

		public void setSuffix(String suffix) {
			this.suffix = suffix;
		}

		public Boolean getTooLarge() {
			return this.tooLarge;
		}

		public void setTooLarge(Boolean tooLarge) {
			this.tooLarge = tooLarge;
		}

		public String getUpdatedAt() {
			return this.updatedAt;
		}

		public void setUpdatedAt(String updatedAt) {
			this.updatedAt = updatedAt;
		}
	}

	public static class ResolvedBy {

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

	public static class StDiff {

		private Long addLineNum;

		private String amode;

		private String aMode;

		private Boolean binaryFile;

		private String bmode;

		private String bMode;

		private String charsetName;

		private Long compareDiffId;

		private String createdAt;

		private Boolean deletedFile;

		private Long delLineNum;

		private String diff;

		private String highlightedDiff;

		private Long id;

		private Boolean newFile;

		private String newPath;

		private String oldPath;

		private Boolean renamedFile;

		private String suffix;

		private Boolean tooLarge;

		private String updatedAt;

		public Long getAddLineNum() {
			return this.addLineNum;
		}

		public void setAddLineNum(Long addLineNum) {
			this.addLineNum = addLineNum;
		}

		public String getAmode() {
			return this.amode;
		}

		public void setAmode(String amode) {
			this.amode = amode;
		}

		public String getAMode() {
			return this.aMode;
		}

		public void setAMode(String aMode) {
			this.aMode = aMode;
		}

		public Boolean getBinaryFile() {
			return this.binaryFile;
		}

		public void setBinaryFile(Boolean binaryFile) {
			this.binaryFile = binaryFile;
		}

		public String getBmode() {
			return this.bmode;
		}

		public void setBmode(String bmode) {
			this.bmode = bmode;
		}

		public String getBMode() {
			return this.bMode;
		}

		public void setBMode(String bMode) {
			this.bMode = bMode;
		}

		public String getCharsetName() {
			return this.charsetName;
		}

		public void setCharsetName(String charsetName) {
			this.charsetName = charsetName;
		}

		public Long getCompareDiffId() {
			return this.compareDiffId;
		}

		public void setCompareDiffId(Long compareDiffId) {
			this.compareDiffId = compareDiffId;
		}

		public String getCreatedAt() {
			return this.createdAt;
		}

		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}

		public Boolean getDeletedFile() {
			return this.deletedFile;
		}

		public void setDeletedFile(Boolean deletedFile) {
			this.deletedFile = deletedFile;
		}

		public Long getDelLineNum() {
			return this.delLineNum;
		}

		public void setDelLineNum(Long delLineNum) {
			this.delLineNum = delLineNum;
		}

		public String getDiff() {
			return this.diff;
		}

		public void setDiff(String diff) {
			this.diff = diff;
		}

		public String getHighlightedDiff() {
			return this.highlightedDiff;
		}

		public void setHighlightedDiff(String highlightedDiff) {
			this.highlightedDiff = highlightedDiff;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Boolean getNewFile() {
			return this.newFile;
		}

		public void setNewFile(Boolean newFile) {
			this.newFile = newFile;
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

		public Boolean getRenamedFile() {
			return this.renamedFile;
		}

		public void setRenamedFile(Boolean renamedFile) {
			this.renamedFile = renamedFile;
		}

		public String getSuffix() {
			return this.suffix;
		}

		public void setSuffix(String suffix) {
			this.suffix = suffix;
		}

		public Boolean getTooLarge() {
			return this.tooLarge;
		}

		public void setTooLarge(Boolean tooLarge) {
			this.tooLarge = tooLarge;
		}

		public String getUpdatedAt() {
			return this.updatedAt;
		}

		public void setUpdatedAt(String updatedAt) {
			this.updatedAt = updatedAt;
		}
	}

	@Override
	public AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse getInstance(UnmarshallerContext context) {
		return	AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
