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
import com.aliyuncs.sofa.transform.v20190815.UpdateLinkeantcodeAntcodeProjectpullrequestconfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UpdateLinkeantcodeAntcodeProjectpullrequestconfigResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private String createdAt;

	private Boolean ffOnlyEnabled;

	private Long id;

	private Boolean onlyAllChecksSucceed;

	private Boolean onlyAllDiscussionsResolved;

	private Long projectId;

	private Boolean rebaseEnabled;

	private Long responseStatusCode;

	private Boolean reviewRequired;

	private Boolean shouldRemoveSourceBranch;

	private Boolean squashMerge;

	private String updatedAt;

	private Boolean workitemFinishWhenMerge;

	private Boolean workitemRequired;

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

	public Boolean getFfOnlyEnabled() {
		return this.ffOnlyEnabled;
	}

	public void setFfOnlyEnabled(Boolean ffOnlyEnabled) {
		this.ffOnlyEnabled = ffOnlyEnabled;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getOnlyAllChecksSucceed() {
		return this.onlyAllChecksSucceed;
	}

	public void setOnlyAllChecksSucceed(Boolean onlyAllChecksSucceed) {
		this.onlyAllChecksSucceed = onlyAllChecksSucceed;
	}

	public Boolean getOnlyAllDiscussionsResolved() {
		return this.onlyAllDiscussionsResolved;
	}

	public void setOnlyAllDiscussionsResolved(Boolean onlyAllDiscussionsResolved) {
		this.onlyAllDiscussionsResolved = onlyAllDiscussionsResolved;
	}

	public Long getProjectId() {
		return this.projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	public Boolean getRebaseEnabled() {
		return this.rebaseEnabled;
	}

	public void setRebaseEnabled(Boolean rebaseEnabled) {
		this.rebaseEnabled = rebaseEnabled;
	}

	public Long getResponseStatusCode() {
		return this.responseStatusCode;
	}

	public void setResponseStatusCode(Long responseStatusCode) {
		this.responseStatusCode = responseStatusCode;
	}

	public Boolean getReviewRequired() {
		return this.reviewRequired;
	}

	public void setReviewRequired(Boolean reviewRequired) {
		this.reviewRequired = reviewRequired;
	}

	public Boolean getShouldRemoveSourceBranch() {
		return this.shouldRemoveSourceBranch;
	}

	public void setShouldRemoveSourceBranch(Boolean shouldRemoveSourceBranch) {
		this.shouldRemoveSourceBranch = shouldRemoveSourceBranch;
	}

	public Boolean getSquashMerge() {
		return this.squashMerge;
	}

	public void setSquashMerge(Boolean squashMerge) {
		this.squashMerge = squashMerge;
	}

	public String getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Boolean getWorkitemFinishWhenMerge() {
		return this.workitemFinishWhenMerge;
	}

	public void setWorkitemFinishWhenMerge(Boolean workitemFinishWhenMerge) {
		this.workitemFinishWhenMerge = workitemFinishWhenMerge;
	}

	public Boolean getWorkitemRequired() {
		return this.workitemRequired;
	}

	public void setWorkitemRequired(Boolean workitemRequired) {
		this.workitemRequired = workitemRequired;
	}

	@Override
	public UpdateLinkeantcodeAntcodeProjectpullrequestconfigResponse getInstance(UnmarshallerContext context) {
		return	UpdateLinkeantcodeAntcodeProjectpullrequestconfigResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
