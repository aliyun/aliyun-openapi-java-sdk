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
public class CreateLinkeBahamutVcsmergerequestRequest extends RpcAcsRequest<CreateLinkeBahamutVcsmergerequestResponse> {
	   

	private List<String> workItemsRepeatLists;

	private String reviewRules;

	private String description;

	private String title;

	private String assigneeId;

	private Boolean needReview;

	private Boolean squashMerge;

	private String targetBranch;

	private String appName;

	private String tenantId;

	private String sourceBranch;

	private Boolean shouldRemoveSourceBranch;

	private List<String> reviewersRepeatLists;

	private Long reviewersThreshold;

	private String assigneeUserName;

	private String iterationUnitId;

	private String stageId;
	public CreateLinkeBahamutVcsmergerequestRequest() {
		super("SOFA", "2019-08-15", "CreateLinkeBahamutVcsmergerequest", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getWorkItemsRepeatLists() {
		return this.workItemsRepeatLists;
	}

	public void setWorkItemsRepeatLists(List<String> workItemsRepeatLists) {
		this.workItemsRepeatLists = workItemsRepeatLists;	
		if (workItemsRepeatLists != null) {
			for (int i = 0; i < workItemsRepeatLists.size(); i++) {
				putBodyParameter("WorkItemsRepeatList." + (i + 1) , workItemsRepeatLists.get(i));
			}
		}	
	}

	public String getReviewRules() {
		return this.reviewRules;
	}

	public void setReviewRules(String reviewRules) {
		this.reviewRules = reviewRules;
		if(reviewRules != null){
			putBodyParameter("ReviewRules", reviewRules);
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

	public Boolean getNeedReview() {
		return this.needReview;
	}

	public void setNeedReview(Boolean needReview) {
		this.needReview = needReview;
		if(needReview != null){
			putBodyParameter("NeedReview", needReview.toString());
		}
	}

	public Boolean getSquashMerge() {
		return this.squashMerge;
	}

	public void setSquashMerge(Boolean squashMerge) {
		this.squashMerge = squashMerge;
		if(squashMerge != null){
			putBodyParameter("SquashMerge", squashMerge.toString());
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

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		if(appName != null){
			putBodyParameter("AppName", appName);
		}
	}

	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putBodyParameter("TenantId", tenantId);
		}
	}

	public String getSourceBranch() {
		return this.sourceBranch;
	}

	public void setSourceBranch(String sourceBranch) {
		this.sourceBranch = sourceBranch;
		if(sourceBranch != null){
			putBodyParameter("SourceBranch", sourceBranch);
		}
	}

	public Boolean getShouldRemoveSourceBranch() {
		return this.shouldRemoveSourceBranch;
	}

	public void setShouldRemoveSourceBranch(Boolean shouldRemoveSourceBranch) {
		this.shouldRemoveSourceBranch = shouldRemoveSourceBranch;
		if(shouldRemoveSourceBranch != null){
			putBodyParameter("ShouldRemoveSourceBranch", shouldRemoveSourceBranch.toString());
		}
	}

	public List<String> getReviewersRepeatLists() {
		return this.reviewersRepeatLists;
	}

	public void setReviewersRepeatLists(List<String> reviewersRepeatLists) {
		this.reviewersRepeatLists = reviewersRepeatLists;	
		if (reviewersRepeatLists != null) {
			for (int i = 0; i < reviewersRepeatLists.size(); i++) {
				putBodyParameter("ReviewersRepeatList." + (i + 1) , reviewersRepeatLists.get(i));
			}
		}	
	}

	public Long getReviewersThreshold() {
		return this.reviewersThreshold;
	}

	public void setReviewersThreshold(Long reviewersThreshold) {
		this.reviewersThreshold = reviewersThreshold;
		if(reviewersThreshold != null){
			putBodyParameter("ReviewersThreshold", reviewersThreshold.toString());
		}
	}

	public String getAssigneeUserName() {
		return this.assigneeUserName;
	}

	public void setAssigneeUserName(String assigneeUserName) {
		this.assigneeUserName = assigneeUserName;
		if(assigneeUserName != null){
			putBodyParameter("AssigneeUserName", assigneeUserName);
		}
	}

	public String getIterationUnitId() {
		return this.iterationUnitId;
	}

	public void setIterationUnitId(String iterationUnitId) {
		this.iterationUnitId = iterationUnitId;
		if(iterationUnitId != null){
			putBodyParameter("IterationUnitId", iterationUnitId);
		}
	}

	public String getStageId() {
		return this.stageId;
	}

	public void setStageId(String stageId) {
		this.stageId = stageId;
		if(stageId != null){
			putBodyParameter("StageId", stageId);
		}
	}

	@Override
	public Class<CreateLinkeBahamutVcsmergerequestResponse> getResponseClass() {
		return CreateLinkeBahamutVcsmergerequestResponse.class;
	}

}
