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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.DeleteLinkeantcodeAntcodeTenantusedserviceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DeleteLinkeantcodeAntcodeTenantusedserviceResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

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

	private Long responseStatusCode;

	private Long sourceId;

	private String sourceType;

	private Boolean tagPushEvent;

	private String updatedAt;

	private String visibilityLevel;

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

	public Long getResponseStatusCode() {
		return this.responseStatusCode;
	}

	public void setResponseStatusCode(Long responseStatusCode) {
		this.responseStatusCode = responseStatusCode;
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

	@Override
	public DeleteLinkeantcodeAntcodeTenantusedserviceResponse getInstance(UnmarshallerContext context) {
		return	DeleteLinkeantcodeAntcodeTenantusedserviceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
