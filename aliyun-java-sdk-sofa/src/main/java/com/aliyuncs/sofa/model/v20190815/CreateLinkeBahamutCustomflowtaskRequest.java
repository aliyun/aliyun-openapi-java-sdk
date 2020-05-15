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
public class CreateLinkeBahamutCustomflowtaskRequest extends RpcAcsRequest<CreateLinkeBahamutCustomflowtaskResponse> {
	   

	private String ctuUrl;

	private String approvalTitle;

	private String appList;

	private String approvalContext;

	private String stcManager;

	private String approver;

	private String taskType;

	private String stage;

	private String iterationId;

	private String iterationUnitId;
	public CreateLinkeBahamutCustomflowtaskRequest() {
		super("SOFA", "2019-08-15", "CreateLinkeBahamutCustomflowtask", "ApplySidecarCert");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCtuUrl() {
		return this.ctuUrl;
	}

	public void setCtuUrl(String ctuUrl) {
		this.ctuUrl = ctuUrl;
		if(ctuUrl != null){
			putBodyParameter("CtuUrl", ctuUrl);
		}
	}

	public String getApprovalTitle() {
		return this.approvalTitle;
	}

	public void setApprovalTitle(String approvalTitle) {
		this.approvalTitle = approvalTitle;
		if(approvalTitle != null){
			putBodyParameter("ApprovalTitle", approvalTitle);
		}
	}

	public String getAppList() {
		return this.appList;
	}

	public void setAppList(String appList) {
		this.appList = appList;
		if(appList != null){
			putBodyParameter("AppList", appList);
		}
	}

	public String getApprovalContext() {
		return this.approvalContext;
	}

	public void setApprovalContext(String approvalContext) {
		this.approvalContext = approvalContext;
		if(approvalContext != null){
			putBodyParameter("ApprovalContext", approvalContext);
		}
	}

	public String getStcManager() {
		return this.stcManager;
	}

	public void setStcManager(String stcManager) {
		this.stcManager = stcManager;
		if(stcManager != null){
			putBodyParameter("StcManager", stcManager);
		}
	}

	public String getApprover() {
		return this.approver;
	}

	public void setApprover(String approver) {
		this.approver = approver;
		if(approver != null){
			putBodyParameter("Approver", approver);
		}
	}

	public String getTaskType() {
		return this.taskType;
	}

	public void setTaskType(String taskType) {
		this.taskType = taskType;
		if(taskType != null){
			putBodyParameter("TaskType", taskType);
		}
	}

	public String getStage() {
		return this.stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
		if(stage != null){
			putBodyParameter("Stage", stage);
		}
	}

	public String getIterationId() {
		return this.iterationId;
	}

	public void setIterationId(String iterationId) {
		this.iterationId = iterationId;
		if(iterationId != null){
			putBodyParameter("IterationId", iterationId);
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

	@Override
	public Class<CreateLinkeBahamutCustomflowtaskResponse> getResponseClass() {
		return CreateLinkeBahamutCustomflowtaskResponse.class;
	}

}
