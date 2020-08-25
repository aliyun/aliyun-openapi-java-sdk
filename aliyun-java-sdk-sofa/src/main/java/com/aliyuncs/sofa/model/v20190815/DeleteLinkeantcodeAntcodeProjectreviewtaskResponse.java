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
import com.aliyuncs.sofa.transform.v20190815.DeleteLinkeantcodeAntcodeProjectreviewtaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DeleteLinkeantcodeAntcodeProjectreviewtaskResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private String createdAt;

	private String globPattern;

	private Long id;

	private Boolean isOwner;

	private Long responseStatusCode;

	private Long reviewId;

	private String role;

	private Long score;

	private String state;

	private String updatedAt;

	private Long weight;

	private Reviewer reviewer;

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

	public String getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getGlobPattern() {
		return this.globPattern;
	}

	public void setGlobPattern(String globPattern) {
		this.globPattern = globPattern;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getIsOwner() {
		return this.isOwner;
	}

	public void setIsOwner(Boolean isOwner) {
		this.isOwner = isOwner;
	}

	public Long getResponseStatusCode() {
		return this.responseStatusCode;
	}

	public void setResponseStatusCode(Long responseStatusCode) {
		this.responseStatusCode = responseStatusCode;
	}

	public Long getReviewId() {
		return this.reviewId;
	}

	public void setReviewId(Long reviewId) {
		this.reviewId = reviewId;
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Long getScore() {
		return this.score;
	}

	public void setScore(Long score) {
		this.score = score;
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

	public Long getWeight() {
		return this.weight;
	}

	public void setWeight(Long weight) {
		this.weight = weight;
	}

	public Reviewer getReviewer() {
		return this.reviewer;
	}

	public void setReviewer(Reviewer reviewer) {
		this.reviewer = reviewer;
	}

	public static class Reviewer {

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
	public DeleteLinkeantcodeAntcodeProjectreviewtaskResponse getInstance(UnmarshallerContext context) {
		return	DeleteLinkeantcodeAntcodeProjectreviewtaskResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
