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
import com.aliyuncs.sofa.transform.v20190815.CreateLinkeantcodeAntcodeUsersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateLinkeantcodeAntcodeUsersResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private String avatarUrl;

	private String bio;

	private Boolean canCreateGroup;

	private Boolean canCreateProject;

	private Long colorSchemeId;

	private String createdAt;

	private String currentSignInAt;

	private String department;

	private String email;

	private String externUid;

	private Long id;

	private Boolean isAdmin;

	private String name;

	private String privateToken;

	private Long projectsLimit;

	private Long responseStatusCode;

	private Long role;

	private String state;

	private Long themeId;

	private String updatedAt;

	private String username;

	private String websiteUrl;

	private String webUrl;

	private List<IdentitiesItem> identities;

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

	public Long getResponseStatusCode() {
		return this.responseStatusCode;
	}

	public void setResponseStatusCode(Long responseStatusCode) {
		this.responseStatusCode = responseStatusCode;
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

	public List<IdentitiesItem> getIdentities() {
		return this.identities;
	}

	public void setIdentities(List<IdentitiesItem> identities) {
		this.identities = identities;
	}

	public static class IdentitiesItem {

		private String externUid;

		private String provider;

		public String getExternUid() {
			return this.externUid;
		}

		public void setExternUid(String externUid) {
			this.externUid = externUid;
		}

		public String getProvider() {
			return this.provider;
		}

		public void setProvider(String provider) {
			this.provider = provider;
		}
	}

	@Override
	public CreateLinkeantcodeAntcodeUsersResponse getInstance(UnmarshallerContext context) {
		return	CreateLinkeantcodeAntcodeUsersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
