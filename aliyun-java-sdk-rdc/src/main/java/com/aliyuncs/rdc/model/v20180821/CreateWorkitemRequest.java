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
public class CreateWorkitemRequest extends RpcAcsRequest<CreateWorkitemResponse> {
	   

	private String author;

	private String subject;

	private String description;

	private String stamp;

	private Integer aKProjectId;

	private Integer templateId;

	private String assignedTo;

	private Integer priorityId;

	private Integer seriousLevelId;

	private String moduleIds;

	private String corpIdentifier;

	private String watcherUsers;

	private String verifier;

	private String cfList;
	public CreateWorkitemRequest() {
		super("Rdc", "2018-08-21", "CreateWorkitem");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
		if(author != null){
			putBodyParameter("Author", author);
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

	public Integer getAKProjectId() {
		return this.aKProjectId;
	}

	public void setAKProjectId(Integer aKProjectId) {
		this.aKProjectId = aKProjectId;
		if(aKProjectId != null){
			putBodyParameter("AKProjectId", aKProjectId.toString());
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

	public String getAssignedTo() {
		return this.assignedTo;
	}

	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
		if(assignedTo != null){
			putBodyParameter("AssignedTo", assignedTo);
		}
	}

	public Integer getPriorityId() {
		return this.priorityId;
	}

	public void setPriorityId(Integer priorityId) {
		this.priorityId = priorityId;
		if(priorityId != null){
			putBodyParameter("PriorityId", priorityId.toString());
		}
	}

	public Integer getSeriousLevelId() {
		return this.seriousLevelId;
	}

	public void setSeriousLevelId(Integer seriousLevelId) {
		this.seriousLevelId = seriousLevelId;
		if(seriousLevelId != null){
			putBodyParameter("SeriousLevelId", seriousLevelId.toString());
		}
	}

	public String getModuleIds() {
		return this.moduleIds;
	}

	public void setModuleIds(String moduleIds) {
		this.moduleIds = moduleIds;
		if(moduleIds != null){
			putBodyParameter("ModuleIds", moduleIds);
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

	public String getWatcherUsers() {
		return this.watcherUsers;
	}

	public void setWatcherUsers(String watcherUsers) {
		this.watcherUsers = watcherUsers;
		if(watcherUsers != null){
			putBodyParameter("WatcherUsers", watcherUsers);
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

	@Override
	public Class<CreateWorkitemResponse> getResponseClass() {
		return CreateWorkitemResponse.class;
	}

}
