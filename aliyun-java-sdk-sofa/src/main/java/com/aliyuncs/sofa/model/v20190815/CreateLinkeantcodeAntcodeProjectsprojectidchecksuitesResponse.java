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
import com.aliyuncs.sofa.transform.v20190815.CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

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

	private Long responseStatusCode;

	private Long serviceId;

	private String status;

	private String updatedAt;

	private List<CheckRunsItem> checkRuns;

	private Service service;

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

	public Long getResponseStatusCode() {
		return this.responseStatusCode;
	}

	public void setResponseStatusCode(Long responseStatusCode) {
		this.responseStatusCode = responseStatusCode;
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

	public List<CheckRunsItem> getCheckRuns() {
		return this.checkRuns;
	}

	public void setCheckRuns(List<CheckRunsItem> checkRuns) {
		this.checkRuns = checkRuns;
	}

	public Service getService() {
		return this.service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	public static class CheckRunsItem {

		private String completedAt;

		private String conclusion;

		private String context;

		private String createdAt;

		private String detailUrl;

		private String externalId;

		private Long id;

		private String startedAt;

		private String status;

		private Long suiteId;

		private String summary;

		private String title;

		private String updateAt;

		private List<String> annotations;

		public String getCompletedAt() {
			return this.completedAt;
		}

		public void setCompletedAt(String completedAt) {
			this.completedAt = completedAt;
		}

		public String getConclusion() {
			return this.conclusion;
		}

		public void setConclusion(String conclusion) {
			this.conclusion = conclusion;
		}

		public String getContext() {
			return this.context;
		}

		public void setContext(String context) {
			this.context = context;
		}

		public String getCreatedAt() {
			return this.createdAt;
		}

		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}

		public String getDetailUrl() {
			return this.detailUrl;
		}

		public void setDetailUrl(String detailUrl) {
			this.detailUrl = detailUrl;
		}

		public String getExternalId() {
			return this.externalId;
		}

		public void setExternalId(String externalId) {
			this.externalId = externalId;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getStartedAt() {
			return this.startedAt;
		}

		public void setStartedAt(String startedAt) {
			this.startedAt = startedAt;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Long getSuiteId() {
			return this.suiteId;
		}

		public void setSuiteId(Long suiteId) {
			this.suiteId = suiteId;
		}

		public String getSummary() {
			return this.summary;
		}

		public void setSummary(String summary) {
			this.summary = summary;
		}

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getUpdateAt() {
			return this.updateAt;
		}

		public void setUpdateAt(String updateAt) {
			this.updateAt = updateAt;
		}

		public List<String> getAnnotations() {
			return this.annotations;
		}

		public void setAnnotations(List<String> annotations) {
			this.annotations = annotations;
		}
	}

	public static class Service {

		private String accessLevel;

		private Long accessUserId;

		private Boolean autoCheckSuite;

		private String avatarUrl;

		private Boolean buildEvent;

		private String callUrl;

		private Boolean checks;

		private String checksDependOn;

		private String checkResultUrl;

		private Long checkSite;

		private String createdAt;

		private String description;

		private String homepage;

		private Long id;

		private Boolean issueEvent;

		private Boolean mergeRequestEvent;

		private String name;

		private Boolean noteEvent;

		private String properties;

		private Boolean pushEvent;

		private Long sourceId;

		private String sourceType;

		private Boolean tagPushEvent;

		private String updatedAt;

		private String visibilityLevel;

		public String getAccessLevel() {
			return this.accessLevel;
		}

		public void setAccessLevel(String accessLevel) {
			this.accessLevel = accessLevel;
		}

		public Long getAccessUserId() {
			return this.accessUserId;
		}

		public void setAccessUserId(Long accessUserId) {
			this.accessUserId = accessUserId;
		}

		public Boolean getAutoCheckSuite() {
			return this.autoCheckSuite;
		}

		public void setAutoCheckSuite(Boolean autoCheckSuite) {
			this.autoCheckSuite = autoCheckSuite;
		}

		public String getAvatarUrl() {
			return this.avatarUrl;
		}

		public void setAvatarUrl(String avatarUrl) {
			this.avatarUrl = avatarUrl;
		}

		public Boolean getBuildEvent() {
			return this.buildEvent;
		}

		public void setBuildEvent(Boolean buildEvent) {
			this.buildEvent = buildEvent;
		}

		public String getCallUrl() {
			return this.callUrl;
		}

		public void setCallUrl(String callUrl) {
			this.callUrl = callUrl;
		}

		public Boolean getChecks() {
			return this.checks;
		}

		public void setChecks(Boolean checks) {
			this.checks = checks;
		}

		public String getChecksDependOn() {
			return this.checksDependOn;
		}

		public void setChecksDependOn(String checksDependOn) {
			this.checksDependOn = checksDependOn;
		}

		public String getCheckResultUrl() {
			return this.checkResultUrl;
		}

		public void setCheckResultUrl(String checkResultUrl) {
			this.checkResultUrl = checkResultUrl;
		}

		public Long getCheckSite() {
			return this.checkSite;
		}

		public void setCheckSite(Long checkSite) {
			this.checkSite = checkSite;
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

		public String getHomepage() {
			return this.homepage;
		}

		public void setHomepage(String homepage) {
			this.homepage = homepage;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Boolean getIssueEvent() {
			return this.issueEvent;
		}

		public void setIssueEvent(Boolean issueEvent) {
			this.issueEvent = issueEvent;
		}

		public Boolean getMergeRequestEvent() {
			return this.mergeRequestEvent;
		}

		public void setMergeRequestEvent(Boolean mergeRequestEvent) {
			this.mergeRequestEvent = mergeRequestEvent;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Boolean getNoteEvent() {
			return this.noteEvent;
		}

		public void setNoteEvent(Boolean noteEvent) {
			this.noteEvent = noteEvent;
		}

		public String getProperties() {
			return this.properties;
		}

		public void setProperties(String properties) {
			this.properties = properties;
		}

		public Boolean getPushEvent() {
			return this.pushEvent;
		}

		public void setPushEvent(Boolean pushEvent) {
			this.pushEvent = pushEvent;
		}

		public Long getSourceId() {
			return this.sourceId;
		}

		public void setSourceId(Long sourceId) {
			this.sourceId = sourceId;
		}

		public String getSourceType() {
			return this.sourceType;
		}

		public void setSourceType(String sourceType) {
			this.sourceType = sourceType;
		}

		public Boolean getTagPushEvent() {
			return this.tagPushEvent;
		}

		public void setTagPushEvent(Boolean tagPushEvent) {
			this.tagPushEvent = tagPushEvent;
		}

		public String getUpdatedAt() {
			return this.updatedAt;
		}

		public void setUpdatedAt(String updatedAt) {
			this.updatedAt = updatedAt;
		}

		public String getVisibilityLevel() {
			return this.visibilityLevel;
		}

		public void setVisibilityLevel(String visibilityLevel) {
			this.visibilityLevel = visibilityLevel;
		}
	}

	@Override
	public CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse getInstance(UnmarshallerContext context) {
		return	CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
