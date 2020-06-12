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

package com.aliyuncs.rdc.model.v20180821;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.rdc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateWorkitemRequest extends RpcAcsRequest<UpdateWorkitemResponse> {
	   

	private Integer issueId;

	private String subject;

	private String modifier;

	private String seriousLevel;

	private Integer aKProjectId;

	private String description;

	private String stamp;

	private Integer templateId;

	private String priority;

	private String assignedTo;

	private Integer sprintId;

	private Boolean ignoreCheck;

	private String cfs;

	private String corpIdentifier;

	private String verifier;

	private String cfList;

	private String status;
	public UpdateWorkitemRequest() {
		super("Rdc", "2018-08-21", "UpdateWorkitem");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getIssueId() {
		return this.issueId;
	}

	public void setIssueId(Integer issueId) {
		this.issueId = issueId;
		if(issueId != null){
			putBodyParameter("IssueId", issueId.toString());
		}
	}

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
		if(subject != null){
			putBodyParameter("Subject", subject);
		}
	}

	public String getModifier() {
		return this.modifier;
	}

	public void setModifier(String modifier) {
		this.modifier = modifier;
		if(modifier != null){
			putBodyParameter("Modifier", modifier);
		}
	}

	public String getSeriousLevel() {
		return this.seriousLevel;
	}

	public void setSeriousLevel(String seriousLevel) {
		this.seriousLevel = seriousLevel;
		if(seriousLevel != null){
			putBodyParameter("SeriousLevel", seriousLevel);
		}
	}

	public Integer getAKProjectId() {
		return this.aKProjectId;
	}

	public void setAKProjectId(Integer aKProjectId) {
		this.aKProjectId = aKProjectId;
		if(aKProjectId != null){
			putBodyParameter("AKProjectId", aKProjectId.toString());
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

	public String getStamp() {
		return this.stamp;
	}

	public void setStamp(String stamp) {
		this.stamp = stamp;
		if(stamp != null){
			putBodyParameter("Stamp", stamp);
		}
	}

	public Integer getTemplateId() {
		return this.templateId;
	}

	public void setTemplateId(Integer templateId) {
		this.templateId = templateId;
		if(templateId != null){
			putBodyParameter("TemplateId", templateId.toString());
		}
	}

	public String getPriority() {
		return this.priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
		if(priority != null){
			putBodyParameter("Priority", priority);
		}
	}

	public String getAssignedTo() {
		return this.assignedTo;
	}

	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
		if(assignedTo != null){
			putBodyParameter("AssignedTo", assignedTo);
		}
	}

	public Integer getSprintId() {
		return this.sprintId;
	}

	public void setSprintId(Integer sprintId) {
		this.sprintId = sprintId;
		if(sprintId != null){
			putBodyParameter("SprintId", sprintId.toString());
		}
	}

	public Boolean getIgnoreCheck() {
		return this.ignoreCheck;
	}

	public void setIgnoreCheck(Boolean ignoreCheck) {
		this.ignoreCheck = ignoreCheck;
		if(ignoreCheck != null){
			putBodyParameter("IgnoreCheck", ignoreCheck.toString());
		}
	}

	public String getCfs() {
		return this.cfs;
	}

	public void setCfs(String cfs) {
		this.cfs = cfs;
		if(cfs != null){
			putBodyParameter("Cfs", cfs);
		}
	}

	public String getCorpIdentifier() {
		return this.corpIdentifier;
	}

	public void setCorpIdentifier(String corpIdentifier) {
		this.corpIdentifier = corpIdentifier;
		if(corpIdentifier != null){
			putQueryParameter("CorpIdentifier", corpIdentifier);
		}
	}

	public String getVerifier() {
		return this.verifier;
	}

	public void setVerifier(String verifier) {
		this.verifier = verifier;
		if(verifier != null){
			putBodyParameter("Verifier", verifier);
		}
	}

	public String getCfList() {
		return this.cfList;
	}

	public void setCfList(String cfList) {
		this.cfList = cfList;
		if(cfList != null){
			putBodyParameter("CfList", cfList);
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putBodyParameter("Status", status);
		}
	}

	@Override
	public Class<UpdateWorkitemResponse> getResponseClass() {
		return UpdateWorkitemResponse.class;
	}

}
