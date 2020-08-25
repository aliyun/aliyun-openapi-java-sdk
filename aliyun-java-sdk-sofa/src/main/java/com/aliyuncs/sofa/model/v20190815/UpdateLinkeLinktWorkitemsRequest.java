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
public class UpdateLinkeLinktWorkitemsRequest extends RpcAcsRequest<UpdateLinkeLinktWorkitemsResponse> {
	   

	private String expectedAt;

	private List<String> signListRepeatLists;

	private String subject;

	private String description;

	private String templateLabel;

	private String ccs;

	private String statusId;

	private String projectSign;

	private String parentSign;

	private String iterationSign;

	private String assignedToIds;

	private String workitemSign;

	private List<String> customFieldsRepeatLists;

	private String priority;

	private String templateId;

	private String modules;

	private Boolean deleted;

	private String attachmentVOs;

	private String relatedProjects;
	public UpdateLinkeLinktWorkitemsRequest() {
		super("SOFA", "2019-08-15", "UpdateLinkeLinktWorkitems", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getExpectedAt() {
		return this.expectedAt;
	}

	public void setExpectedAt(String expectedAt) {
		this.expectedAt = expectedAt;
		if(expectedAt != null){
			putBodyParameter("ExpectedAt", expectedAt);
		}
	}

	public List<String> getSignListRepeatLists() {
		return this.signListRepeatLists;
	}

	public void setSignListRepeatLists(List<String> signListRepeatLists) {
		this.signListRepeatLists = signListRepeatLists;	
		if (signListRepeatLists != null) {
			for (int i = 0; i < signListRepeatLists.size(); i++) {
				putBodyParameter("SignListRepeatList." + (i + 1) , signListRepeatLists.get(i));
			}
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

	public String getTemplateLabel() {
		return this.templateLabel;
	}

	public void setTemplateLabel(String templateLabel) {
		this.templateLabel = templateLabel;
		if(templateLabel != null){
			putBodyParameter("TemplateLabel", templateLabel);
		}
	}

	public String getCcs() {
		return this.ccs;
	}

	public void setCcs(String ccs) {
		this.ccs = ccs;
		if(ccs != null){
			putBodyParameter("Ccs", ccs);
		}
	}

	public String getStatusId() {
		return this.statusId;
	}

	public void setStatusId(String statusId) {
		this.statusId = statusId;
		if(statusId != null){
			putBodyParameter("StatusId", statusId);
		}
	}

	public String getProjectSign() {
		return this.projectSign;
	}

	public void setProjectSign(String projectSign) {
		this.projectSign = projectSign;
		if(projectSign != null){
			putBodyParameter("ProjectSign", projectSign);
		}
	}

	public String getParentSign() {
		return this.parentSign;
	}

	public void setParentSign(String parentSign) {
		this.parentSign = parentSign;
		if(parentSign != null){
			putBodyParameter("ParentSign", parentSign);
		}
	}

	public String getIterationSign() {
		return this.iterationSign;
	}

	public void setIterationSign(String iterationSign) {
		this.iterationSign = iterationSign;
		if(iterationSign != null){
			putBodyParameter("IterationSign", iterationSign);
		}
	}

	public String getAssignedToIds() {
		return this.assignedToIds;
	}

	public void setAssignedToIds(String assignedToIds) {
		this.assignedToIds = assignedToIds;
		if(assignedToIds != null){
			putBodyParameter("AssignedToIds", assignedToIds);
		}
	}

	public String getWorkitemSign() {
		return this.workitemSign;
	}

	public void setWorkitemSign(String workitemSign) {
		this.workitemSign = workitemSign;
		if(workitemSign != null){
			putBodyParameter("WorkitemSign", workitemSign);
		}
	}

	public List<String> getCustomFieldsRepeatLists() {
		return this.customFieldsRepeatLists;
	}

	public void setCustomFieldsRepeatLists(List<String> customFieldsRepeatLists) {
		this.customFieldsRepeatLists = customFieldsRepeatLists;	
		if (customFieldsRepeatLists != null) {
			for (int i = 0; i < customFieldsRepeatLists.size(); i++) {
				putBodyParameter("CustomFieldsRepeatList." + (i + 1) , customFieldsRepeatLists.get(i));
			}
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

	public String getTemplateId() {
		return this.templateId;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
		if(templateId != null){
			putBodyParameter("TemplateId", templateId);
		}
	}

	public String getModules() {
		return this.modules;
	}

	public void setModules(String modules) {
		this.modules = modules;
		if(modules != null){
			putBodyParameter("Modules", modules);
		}
	}

	public Boolean getDeleted() {
		return this.deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
		if(deleted != null){
			putBodyParameter("Deleted", deleted.toString());
		}
	}

	public String getAttachmentVOs() {
		return this.attachmentVOs;
	}

	public void setAttachmentVOs(String attachmentVOs) {
		this.attachmentVOs = attachmentVOs;
		if(attachmentVOs != null){
			putBodyParameter("AttachmentVOs", attachmentVOs);
		}
	}

	public String getRelatedProjects() {
		return this.relatedProjects;
	}

	public void setRelatedProjects(String relatedProjects) {
		this.relatedProjects = relatedProjects;
		if(relatedProjects != null){
			putBodyParameter("RelatedProjects", relatedProjects);
		}
	}

	@Override
	public Class<UpdateLinkeLinktWorkitemsResponse> getResponseClass() {
		return UpdateLinkeLinktWorkitemsResponse.class;
	}

}
