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
public class UpdateLinkeBahamutVcsmergerequestsRequest extends RpcAcsRequest<UpdateLinkeBahamutVcsmergerequestsResponse> {
	   

	private String description;

	private String title;

	private String appName;

	private String tenantId;

	private String projectId;

	private String mergeRequestId;

	private String stateEvent;

	private String assignee;
	public UpdateLinkeBahamutVcsmergerequestsRequest() {
		super("SOFA", "2019-08-15", "UpdateLinkeBahamutVcsmergerequests", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putBodyParameter("ProjectId", projectId);
		}
	}

	public String getMergeRequestId() {
		return this.mergeRequestId;
	}

	public void setMergeRequestId(String mergeRequestId) {
		this.mergeRequestId = mergeRequestId;
		if(mergeRequestId != null){
			putBodyParameter("MergeRequestId", mergeRequestId);
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

	public String getAssignee() {
		return this.assignee;
	}

	public void setAssignee(String assignee) {
		this.assignee = assignee;
		if(assignee != null){
			putBodyParameter("Assignee", assignee);
		}
	}

	@Override
	public Class<UpdateLinkeBahamutVcsmergerequestsResponse> getResponseClass() {
		return UpdateLinkeBahamutVcsmergerequestsResponse.class;
	}

}
