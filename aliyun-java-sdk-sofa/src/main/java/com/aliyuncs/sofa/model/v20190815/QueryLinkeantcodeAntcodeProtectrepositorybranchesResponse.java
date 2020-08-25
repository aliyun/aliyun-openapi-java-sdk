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
import com.aliyuncs.sofa.transform.v20190815.QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryLinkeantcodeAntcodeProtectrepositorybranchesResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Long id;

	private String mergeAccessLevel;

	private String name;

	private String pushAccessLevel;

	private Long responseStatusCode;

	private List<AllowedMergeUsersItem> allowedMergeUsers;

	private List<AllowedPushUsersItem> allowedPushUsers;

	private List<String> matchedBranches;

	private Commit commit;

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

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMergeAccessLevel() {
		return this.mergeAccessLevel;
	}

	public void setMergeAccessLevel(String mergeAccessLevel) {
		this.mergeAccessLevel = mergeAccessLevel;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPushAccessLevel() {
		return this.pushAccessLevel;
	}

	public void setPushAccessLevel(String pushAccessLevel) {
		this.pushAccessLevel = pushAccessLevel;
	}

	public Long getResponseStatusCode() {
		return this.responseStatusCode;
	}

	public void setResponseStatusCode(Long responseStatusCode) {
		this.responseStatusCode = responseStatusCode;
	}

	public List<AllowedMergeUsersItem> getAllowedMergeUsers() {
		return this.allowedMergeUsers;
	}

	public void setAllowedMergeUsers(List<AllowedMergeUsersItem> allowedMergeUsers) {
		this.allowedMergeUsers = allowedMergeUsers;
	}

	public List<AllowedPushUsersItem> getAllowedPushUsers() {
		return this.allowedPushUsers;
	}

	public void setAllowedPushUsers(List<AllowedPushUsersItem> allowedPushUsers) {
		this.allowedPushUsers = allowedPushUsers;
	}

	public List<String> getMatchedBranches() {
		return this.matchedBranches;
	}

	public void setMatchedBranches(List<String> matchedBranches) {
		this.matchedBranches = matchedBranches;
	}

	public Commit getCommit() {
		return this.commit;
	}

	public void setCommit(Commit commit) {
		this.commit = commit;
	}

	public static class AllowedMergeUsersItem {

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

	public static class AllowedPushUsersItem {

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

	public static class Commit {

		private String authoredDate;

		private String authorEmail;

		private String authorName;

		private String committedDate;

		private String committerEmail;

		private String committerName;

		private String createdAt;

		private String id;

		private String message;

		private String shortId;

		private String title;

		private List<String> parentIds;

		public String getAuthoredDate() {
			return this.authoredDate;
		}

		public void setAuthoredDate(String authoredDate) {
			this.authoredDate = authoredDate;
		}

		public String getAuthorEmail() {
			return this.authorEmail;
		}

		public void setAuthorEmail(String authorEmail) {
			this.authorEmail = authorEmail;
		}

		public String getAuthorName() {
			return this.authorName;
		}

		public void setAuthorName(String authorName) {
			this.authorName = authorName;
		}

		public String getCommittedDate() {
			return this.committedDate;
		}

		public void setCommittedDate(String committedDate) {
			this.committedDate = committedDate;
		}

		public String getCommitterEmail() {
			return this.committerEmail;
		}

		public void setCommitterEmail(String committerEmail) {
			this.committerEmail = committerEmail;
		}

		public String getCommitterName() {
			return this.committerName;
		}

		public void setCommitterName(String committerName) {
			this.committerName = committerName;
		}

		public String getCreatedAt() {
			return this.createdAt;
		}

		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
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

		public String getShortId() {
			return this.shortId;
		}

		public void setShortId(String shortId) {
			this.shortId = shortId;
		}

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public List<String> getParentIds() {
			return this.parentIds;
		}

		public void setParentIds(List<String> parentIds) {
			this.parentIds = parentIds;
		}
	}

	@Override
	public QueryLinkeantcodeAntcodeProtectrepositorybranchesResponse getInstance(UnmarshallerContext context) {
		return	QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
