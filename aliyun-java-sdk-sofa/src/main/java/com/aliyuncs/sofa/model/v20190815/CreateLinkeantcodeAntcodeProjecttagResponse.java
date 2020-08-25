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
import com.aliyuncs.sofa.transform.v20190815.CreateLinkeantcodeAntcodeProjecttagResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateLinkeantcodeAntcodeProjecttagResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private String message;

	private String name;

	private Long responseStatusCode;

	private List<CheckSuitesItem> checkSuites;

	private Commit commit;

	private Release release;

	private Tagger tagger;

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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getResponseStatusCode() {
		return this.responseStatusCode;
	}

	public void setResponseStatusCode(Long responseStatusCode) {
		this.responseStatusCode = responseStatusCode;
	}

	public List<CheckSuitesItem> getCheckSuites() {
		return this.checkSuites;
	}

	public void setCheckSuites(List<CheckSuitesItem> checkSuites) {
		this.checkSuites = checkSuites;
	}

	public Commit getCommit() {
		return this.commit;
	}

	public void setCommit(Commit commit) {
		this.commit = commit;
	}

	public Release getRelease() {
		return this.release;
	}

	public void setRelease(Release release) {
		this.release = release;
	}

	public Tagger getTagger() {
		return this.tagger;
	}

	public void setTagger(Tagger tagger) {
		this.tagger = tagger;
	}

	public static class CheckSuitesItem {

		private String afterSha;

		private String beforeSha;

		private String conclusion;

		private String createdAt;

		private String eventType;

		private String headBranch;

		private String headSha;

		private Long id;

		private Long projectId;

		private Long pullRequestId;

		private String service;

		private Long serviceId;

		private String status;

		private String updatedAt;

		private List<String> checkRuns;

		public String getAfterSha() {
			return this.afterSha;
		}

		public void setAfterSha(String afterSha) {
			this.afterSha = afterSha;
		}

		public String getBeforeSha() {
			return this.beforeSha;
		}

		public void setBeforeSha(String beforeSha) {
			this.beforeSha = beforeSha;
		}

		public String getConclusion() {
			return this.conclusion;
		}

		public void setConclusion(String conclusion) {
			this.conclusion = conclusion;
		}

		public String getCreatedAt() {
			return this.createdAt;
		}

		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}

		public String getEventType() {
			return this.eventType;
		}

		public void setEventType(String eventType) {
			this.eventType = eventType;
		}

		public String getHeadBranch() {
			return this.headBranch;
		}

		public void setHeadBranch(String headBranch) {
			this.headBranch = headBranch;
		}

		public String getHeadSha() {
			return this.headSha;
		}

		public void setHeadSha(String headSha) {
			this.headSha = headSha;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getProjectId() {
			return this.projectId;
		}

		public void setProjectId(Long projectId) {
			this.projectId = projectId;
		}

		public Long getPullRequestId() {
			return this.pullRequestId;
		}

		public void setPullRequestId(Long pullRequestId) {
			this.pullRequestId = pullRequestId;
		}

		public String getService() {
			return this.service;
		}

		public void setService(String service) {
			this.service = service;
		}

		public Long getServiceId() {
			return this.serviceId;
		}

		public void setServiceId(Long serviceId) {
			this.serviceId = serviceId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getUpdatedAt() {
			return this.updatedAt;
		}

		public void setUpdatedAt(String updatedAt) {
			this.updatedAt = updatedAt;
		}

		public List<String> getCheckRuns() {
			return this.checkRuns;
		}

		public void setCheckRuns(List<String> checkRuns) {
			this.checkRuns = checkRuns;
		}
	}

	public static class Commit {

		private String author;

		private String authoredDate;

		private String authorEmail;

		private String authorName;

		private String committedDate;

		private String committer;

		private String committerEmail;

		private String committerName;

		private String createdAt;

		private String id;

		private String message;

		private String shortId;

		private String signature;

		private String title;

		private List<String> checkSuites1;

		private List<String> parentIds;

		public String getAuthor() {
			return this.author;
		}

		public void setAuthor(String author) {
			this.author = author;
		}

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

		public String getCommitter() {
			return this.committer;
		}

		public void setCommitter(String committer) {
			this.committer = committer;
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

		public String getSignature() {
			return this.signature;
		}

		public void setSignature(String signature) {
			this.signature = signature;
		}

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public List<String> getCheckSuites1() {
			return this.checkSuites1;
		}

		public void setCheckSuites1(List<String> checkSuites1) {
			this.checkSuites1 = checkSuites1;
		}

		public List<String> getParentIds() {
			return this.parentIds;
		}

		public void setParentIds(List<String> parentIds) {
			this.parentIds = parentIds;
		}
	}

	public static class Release {

		private String description;

		private String tagName;

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getTagName() {
			return this.tagName;
		}

		public void setTagName(String tagName) {
			this.tagName = tagName;
		}
	}

	public static class Tagger {

		private String email;

		private String name;

		private String when;

		public String getEmail() {
			return this.email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getWhen() {
			return this.when;
		}

		public void setWhen(String when) {
			this.when = when;
		}
	}

	@Override
	public CreateLinkeantcodeAntcodeProjecttagResponse getInstance(UnmarshallerContext context) {
		return	CreateLinkeantcodeAntcodeProjecttagResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
