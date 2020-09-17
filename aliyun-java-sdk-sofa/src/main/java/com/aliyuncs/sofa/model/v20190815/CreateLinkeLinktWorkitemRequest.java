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
public class CreateLinkeLinktWorkitemRequest extends RpcAcsRequest<CreateLinkeLinktWorkitemResponse> {
	   

	private Long expectedAt;

	private String subject;

	private List<String> relatedDependentWorkItemsRepeatLists;

	private List<String> relatedProjectsRepeatLists;

	private List<Long> tagsRepeatLists;

	private Long statusId;

	private List<String> createdRelevantWorkItemsRepeatLists;

	private List<String> createdSubWorkItemsRepeatLists;

	private String parentSign;

	private String iterationSign;

	private Long priority;

	private Long templateId;

	private List<String> createdDependentWorkItemsRepeatLists;

	private String description;

	private String stamp;

	private List<String> customFieldsValuesRepeatLists;

	private List<String> ccsRepeatLists;

	private List<String> relatedSubWorkItemsRepeatLists;

	private String projectSign;

	private String creator;

	private String assignedToIds;

	private List<Long> modulesRepeatLists;

	private List<String> relatedRelevantWorkItemsRepeatLists;

	private List<String> attachmentVOsRepeatLists;
	public CreateLinkeLinktWorkitemRequest() {
		super("SOFA", "2019-08-15", "CreateLinkeLinktWorkitem", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getExpectedAt() {
		return this.expectedAt;
	}

	public void setExpectedAt(Long expectedAt) {
		this.expectedAt = expectedAt;
		if(expectedAt != null){
			putBodyParameter("ExpectedAt", expectedAt.toString());
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

	public List<String> getRelatedDependentWorkItemsRepeatLists() {
		return this.relatedDependentWorkItemsRepeatLists;
	}

	public void setRelatedDependentWorkItemsRepeatLists(List<String> relatedDependentWorkItemsRepeatLists) {
		this.relatedDependentWorkItemsRepeatLists = relatedDependentWorkItemsRepeatLists;	
		if (relatedDependentWorkItemsRepeatLists != null) {
			for (int i = 0; i < relatedDependentWorkItemsRepeatLists.size(); i++) {
				putBodyParameter("RelatedDependentWorkItemsRepeatList." + (i + 1) , relatedDependentWorkItemsRepeatLists.get(i));
			}
		}	
	}

	public List<String> getRelatedProjectsRepeatLists() {
		return this.relatedProjectsRepeatLists;
	}

	public void setRelatedProjectsRepeatLists(List<String> relatedProjectsRepeatLists) {
		this.relatedProjectsRepeatLists = relatedProjectsRepeatLists;	
		if (relatedProjectsRepeatLists != null) {
			for (int i = 0; i < relatedProjectsRepeatLists.size(); i++) {
				putBodyParameter("RelatedProjectsRepeatList." + (i + 1) , relatedProjectsRepeatLists.get(i));
			}
		}	
	}

	public List<Long> getTagsRepeatLists() {
		return this.tagsRepeatLists;
	}

	public void setTagsRepeatLists(List<Long> tagsRepeatLists) {
		this.tagsRepeatLists = tagsRepeatLists;	
		if (tagsRepeatLists != null) {
			for (int i = 0; i < tagsRepeatLists.size(); i++) {
				putBodyParameter("TagsRepeatList." + (i + 1) , tagsRepeatLists.get(i));
			}
		}	
	}

	public Long getStatusId() {
		return this.statusId;
	}

	public void setStatusId(Long statusId) {
		this.statusId = statusId;
		if(statusId != null){
			putBodyParameter("StatusId", statusId.toString());
		}
	}

	public List<String> getCreatedRelevantWorkItemsRepeatLists() {
		return this.createdRelevantWorkItemsRepeatLists;
	}

	public void setCreatedRelevantWorkItemsRepeatLists(List<String> createdRelevantWorkItemsRepeatLists) {
		this.createdRelevantWorkItemsRepeatLists = createdRelevantWorkItemsRepeatLists;	
		if (createdRelevantWorkItemsRepeatLists != null) {
			for (int i = 0; i < createdRelevantWorkItemsRepeatLists.size(); i++) {
				putBodyParameter("CreatedRelevantWorkItemsRepeatList." + (i + 1) , createdRelevantWorkItemsRepeatLists.get(i));
			}
		}	
	}

	public List<String> getCreatedSubWorkItemsRepeatLists() {
		return this.createdSubWorkItemsRepeatLists;
	}

	public void setCreatedSubWorkItemsRepeatLists(List<String> createdSubWorkItemsRepeatLists) {
		this.createdSubWorkItemsRepeatLists = createdSubWorkItemsRepeatLists;	
		if (createdSubWorkItemsRepeatLists != null) {
			for (int i = 0; i < createdSubWorkItemsRepeatLists.size(); i++) {
				putBodyParameter("CreatedSubWorkItemsRepeatList." + (i + 1) , createdSubWorkItemsRepeatLists.get(i));
			}
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

	public Long getPriority() {
		return this.priority;
	}

	public void setPriority(Long priority) {
		this.priority = priority;
		if(priority != null){
			putBodyParameter("Priority", priority.toString());
		}
	}

	public Long getTemplateId() {
		return this.templateId;
	}

	public void setTemplateId(Long templateId) {
		this.templateId = templateId;
		if(templateId != null){
			putBodyParameter("TemplateId", templateId.toString());
		}
	}

	public List<String> getCreatedDependentWorkItemsRepeatLists() {
		return this.createdDependentWorkItemsRepeatLists;
	}

	public void setCreatedDependentWorkItemsRepeatLists(List<String> createdDependentWorkItemsRepeatLists) {
		this.createdDependentWorkItemsRepeatLists = createdDependentWorkItemsRepeatLists;	
		if (createdDependentWorkItemsRepeatLists != null) {
			for (int i = 0; i < createdDependentWorkItemsRepeatLists.size(); i++) {
				putBodyParameter("CreatedDependentWorkItemsRepeatList." + (i + 1) , createdDependentWorkItemsRepeatLists.get(i));
			}
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

	public List<String> getCustomFieldsValuesRepeatLists() {
		return this.customFieldsValuesRepeatLists;
	}

	public void setCustomFieldsValuesRepeatLists(List<String> customFieldsValuesRepeatLists) {
		this.customFieldsValuesRepeatLists = customFieldsValuesRepeatLists;	
		if (customFieldsValuesRepeatLists != null) {
			for (int i = 0; i < customFieldsValuesRepeatLists.size(); i++) {
				putBodyParameter("CustomFieldsValuesRepeatList." + (i + 1) , customFieldsValuesRepeatLists.get(i));
			}
		}	
	}

	public List<String> getCcsRepeatLists() {
		return this.ccsRepeatLists;
	}

	public void setCcsRepeatLists(List<String> ccsRepeatLists) {
		this.ccsRepeatLists = ccsRepeatLists;	
		if (ccsRepeatLists != null) {
			for (int i = 0; i < ccsRepeatLists.size(); i++) {
				putBodyParameter("CcsRepeatList." + (i + 1) , ccsRepeatLists.get(i));
			}
		}	
	}

	public List<String> getRelatedSubWorkItemsRepeatLists() {
		return this.relatedSubWorkItemsRepeatLists;
	}

	public void setRelatedSubWorkItemsRepeatLists(List<String> relatedSubWorkItemsRepeatLists) {
		this.relatedSubWorkItemsRepeatLists = relatedSubWorkItemsRepeatLists;	
		if (relatedSubWorkItemsRepeatLists != null) {
			for (int i = 0; i < relatedSubWorkItemsRepeatLists.size(); i++) {
				putBodyParameter("RelatedSubWorkItemsRepeatList." + (i + 1) , relatedSubWorkItemsRepeatLists.get(i));
			}
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

	public String getCreator() {
		return this.creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
		if(creator != null){
			putBodyParameter("Creator", creator);
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

	public List<Long> getModulesRepeatLists() {
		return this.modulesRepeatLists;
	}

	public void setModulesRepeatLists(List<Long> modulesRepeatLists) {
		this.modulesRepeatLists = modulesRepeatLists;	
		if (modulesRepeatLists != null) {
			for (int i = 0; i < modulesRepeatLists.size(); i++) {
				putBodyParameter("ModulesRepeatList." + (i + 1) , modulesRepeatLists.get(i));
			}
		}	
	}

	public List<String> getRelatedRelevantWorkItemsRepeatLists() {
		return this.relatedRelevantWorkItemsRepeatLists;
	}

	public void setRelatedRelevantWorkItemsRepeatLists(List<String> relatedRelevantWorkItemsRepeatLists) {
		this.relatedRelevantWorkItemsRepeatLists = relatedRelevantWorkItemsRepeatLists;	
		if (relatedRelevantWorkItemsRepeatLists != null) {
			for (int i = 0; i < relatedRelevantWorkItemsRepeatLists.size(); i++) {
				putBodyParameter("RelatedRelevantWorkItemsRepeatList." + (i + 1) , relatedRelevantWorkItemsRepeatLists.get(i));
			}
		}	
	}

	public List<String> getAttachmentVOsRepeatLists() {
		return this.attachmentVOsRepeatLists;
	}

	public void setAttachmentVOsRepeatLists(List<String> attachmentVOsRepeatLists) {
		this.attachmentVOsRepeatLists = attachmentVOsRepeatLists;	
		if (attachmentVOsRepeatLists != null) {
			for (int i = 0; i < attachmentVOsRepeatLists.size(); i++) {
				putBodyParameter("AttachmentVOsRepeatList." + (i + 1) , attachmentVOsRepeatLists.get(i));
			}
		}	
	}

	@Override
	public Class<CreateLinkeLinktWorkitemResponse> getResponseClass() {
		return CreateLinkeLinktWorkitemResponse.class;
	}

}
