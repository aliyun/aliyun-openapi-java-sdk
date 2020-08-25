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
import com.aliyuncs.sofa.transform.v20190815.QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryLinkeantcodeAntcodeManualbranchpipelineexecResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private String beginAt;

	private String commitId;

	private String commitMsg;

	private String commitShortId;

	private String createdAt;

	private String eventTriggerType;

	private String execId;

	private String finishedAt;

	private String id;

	private Boolean lastest;

	private Long pullRequestId;

	private Long pullRequestIid;

	private String ref;

	private Long responseStatusCode;

	private String status;

	private String type;

	private String utCover;

	private String utCoverUrl;

	private String utPass;

	private List<ArtifactsItem> artifacts;

	private List<BuildsItem> builds;

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

	public String getBeginAt() {
		return this.beginAt;
	}

	public void setBeginAt(String beginAt) {
		this.beginAt = beginAt;
	}

	public String getCommitId() {
		return this.commitId;
	}

	public void setCommitId(String commitId) {
		this.commitId = commitId;
	}

	public String getCommitMsg() {
		return this.commitMsg;
	}

	public void setCommitMsg(String commitMsg) {
		this.commitMsg = commitMsg;
	}

	public String getCommitShortId() {
		return this.commitShortId;
	}

	public void setCommitShortId(String commitShortId) {
		this.commitShortId = commitShortId;
	}

	public String getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getEventTriggerType() {
		return this.eventTriggerType;
	}

	public void setEventTriggerType(String eventTriggerType) {
		this.eventTriggerType = eventTriggerType;
	}

	public String getExecId() {
		return this.execId;
	}

	public void setExecId(String execId) {
		this.execId = execId;
	}

	public String getFinishedAt() {
		return this.finishedAt;
	}

	public void setFinishedAt(String finishedAt) {
		this.finishedAt = finishedAt;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Boolean getLastest() {
		return this.lastest;
	}

	public void setLastest(Boolean lastest) {
		this.lastest = lastest;
	}

	public Long getPullRequestId() {
		return this.pullRequestId;
	}

	public void setPullRequestId(Long pullRequestId) {
		this.pullRequestId = pullRequestId;
	}

	public Long getPullRequestIid() {
		return this.pullRequestIid;
	}

	public void setPullRequestIid(Long pullRequestIid) {
		this.pullRequestIid = pullRequestIid;
	}

	public String getRef() {
		return this.ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public Long getResponseStatusCode() {
		return this.responseStatusCode;
	}

	public void setResponseStatusCode(Long responseStatusCode) {
		this.responseStatusCode = responseStatusCode;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUtCover() {
		return this.utCover;
	}

	public void setUtCover(String utCover) {
		this.utCover = utCover;
	}

	public String getUtCoverUrl() {
		return this.utCoverUrl;
	}

	public void setUtCoverUrl(String utCoverUrl) {
		this.utCoverUrl = utCoverUrl;
	}

	public String getUtPass() {
		return this.utPass;
	}

	public void setUtPass(String utPass) {
		this.utPass = utPass;
	}

	public List<ArtifactsItem> getArtifacts() {
		return this.artifacts;
	}

	public void setArtifacts(List<ArtifactsItem> artifacts) {
		this.artifacts = artifacts;
	}

	public List<BuildsItem> getBuilds() {
		return this.builds;
	}

	public void setBuilds(List<BuildsItem> builds) {
		this.builds = builds;
	}

	public Author getAuthor() {
		return this.author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public static class ArtifactsItem {

		private String buildId;

		private String buildSystem;

		private String buildType;

		private String createdAt;

		private String description;

		private String fsPath;

		private String fsType;

		private Long id;

		private String md5;

		private String name;

		private String sha;

		public String getBuildId() {
			return this.buildId;
		}

		public void setBuildId(String buildId) {
			this.buildId = buildId;
		}

		public String getBuildSystem() {
			return this.buildSystem;
		}

		public void setBuildSystem(String buildSystem) {
			this.buildSystem = buildSystem;
		}

		public String getBuildType() {
			return this.buildType;
		}

		public void setBuildType(String buildType) {
			this.buildType = buildType;
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

		public String getFsPath() {
			return this.fsPath;
		}

		public void setFsPath(String fsPath) {
			this.fsPath = fsPath;
		}

		public String getFsType() {
			return this.fsType;
		}

		public void setFsType(String fsType) {
			this.fsType = fsType;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getMd5() {
			return this.md5;
		}

		public void setMd5(String md5) {
			this.md5 = md5;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSha() {
			return this.sha;
		}

		public void setSha(String sha) {
			this.sha = sha;
		}
	}

	public static class BuildsItem {

		private String buildId;

		private String buildSystem;

		public String getBuildId() {
			return this.buildId;
		}

		public void setBuildId(String buildId) {
			this.buildId = buildId;
		}

		public String getBuildSystem() {
			return this.buildSystem;
		}

		public void setBuildSystem(String buildSystem) {
			this.buildSystem = buildSystem;
		}
	}

	public static class Author {

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

	@Override
	public QueryLinkeantcodeAntcodeManualbranchpipelineexecResponse getInstance(UnmarshallerContext context) {
		return	QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
