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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateLinkeantcodeAntcodeProjectpullrequestconfigRequest extends RpcAcsRequest<UpdateLinkeantcodeAntcodeProjectpullrequestconfigResponse> {
	   

	private String onlyAllDiscussionsResolved;

	private String reviewRequired;

	private String squashMerge;

	private String id;

	private String mergeMethod;

	private String requestGitOperate;

	private String shouldRemoveSourceBranch;

	private String workitemRequired;

	private String workitemFinishWhenMerge;

	private String onlyAllChecksSucceed;
	public UpdateLinkeantcodeAntcodeProjectpullrequestconfigRequest() {
		super("SOFA", "2019-08-15", "UpdateLinkeantcodeAntcodeProjectpullrequestconfig", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getOnlyAllDiscussionsResolved() {
		return this.onlyAllDiscussionsResolved;
	}

	public void setOnlyAllDiscussionsResolved(String onlyAllDiscussionsResolved) {
		this.onlyAllDiscussionsResolved = onlyAllDiscussionsResolved;
		if(onlyAllDiscussionsResolved != null){
			putBodyParameter("OnlyAllDiscussionsResolved", onlyAllDiscussionsResolved);
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

	public String getSquashMerge() {
		return this.squashMerge;
	}

	public void setSquashMerge(String squashMerge) {
		this.squashMerge = squashMerge;
		if(squashMerge != null){
			putBodyParameter("SquashMerge", squashMerge);
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

	public String getWorkitemRequired() {
		return this.workitemRequired;
	}

	public void setWorkitemRequired(String workitemRequired) {
		this.workitemRequired = workitemRequired;
		if(workitemRequired != null){
			putBodyParameter("WorkitemRequired", workitemRequired);
		}
	}

	public String getWorkitemFinishWhenMerge() {
		return this.workitemFinishWhenMerge;
	}

	public void setWorkitemFinishWhenMerge(String workitemFinishWhenMerge) {
		this.workitemFinishWhenMerge = workitemFinishWhenMerge;
		if(workitemFinishWhenMerge != null){
			putBodyParameter("WorkitemFinishWhenMerge", workitemFinishWhenMerge);
		}
	}

	public String getOnlyAllChecksSucceed() {
		return this.onlyAllChecksSucceed;
	}

	public void setOnlyAllChecksSucceed(String onlyAllChecksSucceed) {
		this.onlyAllChecksSucceed = onlyAllChecksSucceed;
		if(onlyAllChecksSucceed != null){
			putBodyParameter("OnlyAllChecksSucceed", onlyAllChecksSucceed);
		}
	}

	@Override
	public Class<UpdateLinkeantcodeAntcodeProjectpullrequestconfigResponse> getResponseClass() {
		return UpdateLinkeantcodeAntcodeProjectpullrequestconfigResponse.class;
	}

}
