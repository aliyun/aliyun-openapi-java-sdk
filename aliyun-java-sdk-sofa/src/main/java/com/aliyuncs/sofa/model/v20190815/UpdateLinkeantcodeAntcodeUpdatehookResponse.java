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
import com.aliyuncs.sofa.transform.v20190815.UpdateLinkeantcodeAntcodeUpdatehookResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UpdateLinkeantcodeAntcodeUpdatehookResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Boolean buildEvents;

	private String createdAt;

	private Boolean enableSslVerification;

	private Long id;

	private Boolean issuesEvents;

	private Boolean mergeRequestsEvents;

	private Boolean noteEvents;

	private Long projectId;

	private Boolean pushEvents;

	private Long responseStatusCode;

	private Long serviceId;

	private Boolean tagPushEvents;

	private String type;

	private String updatedAt;

	private String url;

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

	public Boolean getBuildEvents() {
		return this.buildEvents;
	}

	public void setBuildEvents(Boolean buildEvents) {
		this.buildEvents = buildEvents;
	}

	public String getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public Boolean getEnableSslVerification() {
		return this.enableSslVerification;
	}

	public void setEnableSslVerification(Boolean enableSslVerification) {
		this.enableSslVerification = enableSslVerification;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getIssuesEvents() {
		return this.issuesEvents;
	}

	public void setIssuesEvents(Boolean issuesEvents) {
		this.issuesEvents = issuesEvents;
	}

	public Boolean getMergeRequestsEvents() {
		return this.mergeRequestsEvents;
	}

	public void setMergeRequestsEvents(Boolean mergeRequestsEvents) {
		this.mergeRequestsEvents = mergeRequestsEvents;
	}

	public Boolean getNoteEvents() {
		return this.noteEvents;
	}

	public void setNoteEvents(Boolean noteEvents) {
		this.noteEvents = noteEvents;
	}

	public Long getProjectId() {
		return this.projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	public Boolean getPushEvents() {
		return this.pushEvents;
	}

	public void setPushEvents(Boolean pushEvents) {
		this.pushEvents = pushEvents;
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

	public Boolean getTagPushEvents() {
		return this.tagPushEvents;
	}

	public void setTagPushEvents(Boolean tagPushEvents) {
		this.tagPushEvents = tagPushEvents;
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

	@Override
	public UpdateLinkeantcodeAntcodeUpdatehookResponse getInstance(UnmarshallerContext context) {
		return	UpdateLinkeantcodeAntcodeUpdatehookResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
