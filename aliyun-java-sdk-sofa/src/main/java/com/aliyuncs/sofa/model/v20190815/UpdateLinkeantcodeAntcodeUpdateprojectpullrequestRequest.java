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

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateLinkeantcodeAntcodeUpdateprojectpullrequestRequest extends RpcAcsRequest<UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse> {
	   

	private String mergeCommitMessage;

	private String reviewRequired;

	private String description;

	private String threshold;

	private String title;

	private String assigneeId;

	private String squashMerge;

	private String targetBranch;

	private String pullRequestId;

	private String id;

	private String mergeMethod;

	private List<String> labelsRepeatLists;

	private String requestGitOperate;

	private String shouldRemoveSourceBranch;

	private String autoMerge;

	private String thresholdClear;

	private String stateEvent;
	public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestRequest() {
		super("SOFA", "2019-08-15", "UpdateLinkeantcodeAntcodeUpdateprojectpullrequest", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getMergeCommitMessage() {
		return this.mergeCommitMessage;
	}

	public void setMergeCommitMessage(String mergeCommitMessage) {
		this.mergeCommitMessage = mergeCommitMessage;
		if(mergeCommitMessage != null){
			putBodyParameter("MergeCommitMessage", mergeCommitMessage);
		}
	}

	public String getReviewRequired() {
		return this.reviewRequired;
	}

	public void setReviewRequired(String reviewRequired) {
		this.reviewRequired = reviewRequired;
		if(reviewRequired != null){
			putBodyParameter("ReviewRequired", reviewRequired);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putBodyParameter("Description", description);
		}
	}

	public String getThreshold() {
		return this.threshold;
	}

	public void setThreshold(String threshold) {
		this.threshold = threshold;
		if(threshold != null){
			putBodyParameter("Threshold", threshold);
		}
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
		if(title != null){
			putBodyParameter("Title", title);
		}
	}

	public String getAssigneeId() {
		return this.assigneeId;
	}

	public void setAssigneeId(String assigneeId) {
		this.assigneeId = assigneeId;
		if(assigneeId != null){
			putBodyParameter("AssigneeId", assigneeId);
		}
	}

	public String getSquashMerge() {
		return this.squashMerge;
	}

	public void setSquashMerge(String squashMerge) {
		this.squashMerge = squashMerge;
		if(squashMerge != null){
			putBodyParameter("SquashMerge", squashMerge);
		}
	}

	public String getTargetBranch() {
		return this.targetBranch;
	}

	public void setTargetBranch(String targetBranch) {
		this.targetBranch = targetBranch;
		if(targetBranch != null){
			putBodyParameter("TargetBranch", targetBranch);
		}
	}

	public String getPullRequestId() {
		return this.pullRequestId;
	}

	public void setPullRequestId(String pullRequestId) {
		this.pullRequestId = pullRequestId;
		if(pullRequestId != null){
			putBodyParameter("PullRequestId", pullRequestId);
		}
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		if(id != null){
			putBodyParameter("Id", id);
		}
	}

	public String getMergeMethod() {
		return this.mergeMethod;
	}

	public void setMergeMethod(String mergeMethod) {
		this.mergeMethod = mergeMethod;
		if(mergeMethod != null){
			putBodyParameter("MergeMethod", mergeMethod);
		}
	}

	public List<String> getLabelsRepeatLists() {
		return this.labelsRepeatLists;
	}

	public void setLabelsRepeatLists(List<String> labelsRepeatLists) {
		this.labelsRepeatLists = labelsRepeatLists;	
		if (labelsRepeatLists != null) {
			for (int i = 0; i < labelsRepeatLists.size(); i++) {
				putBodyParameter("LabelsRepeatList." + (i + 1) , labelsRepeatLists.get(i));
			}
		}	
	}

	public String getRequestGitOperate() {
		return this.requestGitOperate;
	}

	public void setRequestGitOperate(String requestGitOperate) {
		this.requestGitOperate = requestGitOperate;
		if(requestGitOperate != null){
			putBodyParameter("RequestGitOperate", requestGitOperate);
		}
	}

	public String getShouldRemoveSourceBranch() {
		return this.shouldRemoveSourceBranch;
	}

	public void setShouldRemoveSourceBranch(String shouldRemoveSourceBranch) {
		this.shouldRemoveSourceBranch = shouldRemoveSourceBranch;
		if(shouldRemoveSourceBranch != null){
			putBodyParameter("ShouldRemoveSourceBranch", shouldRemoveSourceBranch);
		}
	}

	public String getAutoMerge() {
		return this.autoMerge;
	}

	public void setAutoMerge(String autoMerge) {
		this.autoMerge = autoMerge;
		if(autoMerge != null){
			putBodyParameter("AutoMerge", autoMerge);
		}
	}

	public String getThresholdClear() {
		return this.thresholdClear;
	}

	public void setThresholdClear(String thresholdClear) {
		this.thresholdClear = thresholdClear;
		if(thresholdClear != null){
			putBodyParameter("ThresholdClear", thresholdClear);
		}
	}

	public String getStateEvent() {
		return this.stateEvent;
	}

	public void setStateEvent(String stateEvent) {
		this.stateEvent = stateEvent;
		if(stateEvent != null){
			putBodyParameter("StateEvent", stateEvent);
		}
	}

	@Override
	public Class<UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse> getResponseClass() {
		return UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.class;
	}

}
