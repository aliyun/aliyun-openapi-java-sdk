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
public class ExecLinkeLinktSearchworkitemRequest extends RpcAcsRequest<ExecLinkeLinktSearchworkitemResponse> {
	   

	private Long expectedAtAfter;

	private List<String> assignedToIdsRepeatLists;

	private String subject;

	private String ccsOption;

	private String relatedProjectSign;

	private List<Long> tagsRepeatLists;

	private List<String> signNotInRepeatLists;

	private Long statusId;

	private String assignedToId;

	private String keyword;

	private String parentSign;

	private String iterationSign;

	private String signPathNotLike;

	private String orderBy;

	private List<String> stampsRepeatLists;

	private Long rootLength;

	private Long templateId;

	private List<Long> priorityIdsRepeatLists;

	private List<Long> statusIdsRepeatLists;

	private Long page;

	private Long begin;

	private String customFieldsSearchFormMap;

	private String relevantProjectSign;

	private List<String> templateLabelsRepeatLists;

	private Long updatedAtAfter;

	private List<String> signListRepeatLists;

	private String stamp;

	private String templateLabel;

	private String tagsOption;

	private String parentProjectSign;

	private Long createdAtBefore;

	private List<String> creatorsRepeatLists;

	private List<String> ccsRepeatLists;

	private Long pageSize;

	private String projectSign;

	private List<Long> templateIdsRepeatLists;

	private String creator;

	private Long expectedAtBefore;

	private String relevantUid;

	private Long length;

	private String moduleIdsOption;

	private String groupBy;

	private Long updatedAtBefore;

	private Long createdAtAfter;

	private List<Long> moduleIdsRepeatLists;

	private Long rootBegin;

	private String showMode;

	private List<Long> stageListRepeatLists;

	private List<String> projectSignsRepeatLists;
	public ExecLinkeLinktSearchworkitemRequest() {
		super("SOFA", "2019-08-15", "ExecLinkeLinktSearchworkitem", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getExpectedAtAfter() {
		return this.expectedAtAfter;
	}

	public void setExpectedAtAfter(Long expectedAtAfter) {
		this.expectedAtAfter = expectedAtAfter;
		if(expectedAtAfter != null){
			putBodyParameter("ExpectedAtAfter", expectedAtAfter.toString());
		}
	}

	public List<String> getAssignedToIdsRepeatLists() {
		return this.assignedToIdsRepeatLists;
	}

	public void setAssignedToIdsRepeatLists(List<String> assignedToIdsRepeatLists) {
		this.assignedToIdsRepeatLists = assignedToIdsRepeatLists;	
		if (assignedToIdsRepeatLists != null) {
			for (int i = 0; i < assignedToIdsRepeatLists.size(); i++) {
				putBodyParameter("AssignedToIdsRepeatList." + (i + 1) , assignedToIdsRepeatLists.get(i));
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

	public String getCcsOption() {
		return this.ccsOption;
	}

	public void setCcsOption(String ccsOption) {
		this.ccsOption = ccsOption;
		if(ccsOption != null){
			putBodyParameter("CcsOption", ccsOption);
		}
	}

	public String getRelatedProjectSign() {
		return this.relatedProjectSign;
	}

	public void setRelatedProjectSign(String relatedProjectSign) {
		this.relatedProjectSign = relatedProjectSign;
		if(relatedProjectSign != null){
			putBodyParameter("RelatedProjectSign", relatedProjectSign);
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

	public List<String> getSignNotInRepeatLists() {
		return this.signNotInRepeatLists;
	}

	public void setSignNotInRepeatLists(List<String> signNotInRepeatLists) {
		this.signNotInRepeatLists = signNotInRepeatLists;	
		if (signNotInRepeatLists != null) {
			for (int i = 0; i < signNotInRepeatLists.size(); i++) {
				putBodyParameter("SignNotInRepeatList." + (i + 1) , signNotInRepeatLists.get(i));
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

	public String getAssignedToId() {
		return this.assignedToId;
	}

	public void setAssignedToId(String assignedToId) {
		this.assignedToId = assignedToId;
		if(assignedToId != null){
			putBodyParameter("AssignedToId", assignedToId);
		}
	}

	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
		if(keyword != null){
			putBodyParameter("Keyword", keyword);
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

	public String getSignPathNotLike() {
		return this.signPathNotLike;
	}

	public void setSignPathNotLike(String signPathNotLike) {
		this.signPathNotLike = signPathNotLike;
		if(signPathNotLike != null){
			putBodyParameter("SignPathNotLike", signPathNotLike);
		}
	}

	public String getOrderBy() {
		return this.orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
		if(orderBy != null){
			putBodyParameter("OrderBy", orderBy);
		}
	}

	public List<String> getStampsRepeatLists() {
		return this.stampsRepeatLists;
	}

	public void setStampsRepeatLists(List<String> stampsRepeatLists) {
		this.stampsRepeatLists = stampsRepeatLists;	
		if (stampsRepeatLists != null) {
			for (int i = 0; i < stampsRepeatLists.size(); i++) {
				putBodyParameter("StampsRepeatList." + (i + 1) , stampsRepeatLists.get(i));
			}
		}	
	}

	public Long getRootLength() {
		return this.rootLength;
	}

	public void setRootLength(Long rootLength) {
		this.rootLength = rootLength;
		if(rootLength != null){
			putBodyParameter("RootLength", rootLength.toString());
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

	public List<Long> getPriorityIdsRepeatLists() {
		return this.priorityIdsRepeatLists;
	}

	public void setPriorityIdsRepeatLists(List<Long> priorityIdsRepeatLists) {
		this.priorityIdsRepeatLists = priorityIdsRepeatLists;	
		if (priorityIdsRepeatLists != null) {
			for (int i = 0; i < priorityIdsRepeatLists.size(); i++) {
				putBodyParameter("PriorityIdsRepeatList." + (i + 1) , priorityIdsRepeatLists.get(i));
			}
		}	
	}

	public List<Long> getStatusIdsRepeatLists() {
		return this.statusIdsRepeatLists;
	}

	public void setStatusIdsRepeatLists(List<Long> statusIdsRepeatLists) {
		this.statusIdsRepeatLists = statusIdsRepeatLists;	
		if (statusIdsRepeatLists != null) {
			for (int i = 0; i < statusIdsRepeatLists.size(); i++) {
				putBodyParameter("StatusIdsRepeatList." + (i + 1) , statusIdsRepeatLists.get(i));
			}
		}	
	}

	public Long getPage() {
		return this.page;
	}

	public void setPage(Long page) {
		this.page = page;
		if(page != null){
			putBodyParameter("Page", page.toString());
		}
	}

	public Long getBegin() {
		return this.begin;
	}

	public void setBegin(Long begin) {
		this.begin = begin;
		if(begin != null){
			putBodyParameter("Begin", begin.toString());
		}
	}

	public String getCustomFieldsSearchFormMap() {
		return this.customFieldsSearchFormMap;
	}

	public void setCustomFieldsSearchFormMap(String customFieldsSearchFormMap) {
		this.customFieldsSearchFormMap = customFieldsSearchFormMap;
		if(customFieldsSearchFormMap != null){
			putBodyParameter("CustomFieldsSearchFormMap", customFieldsSearchFormMap);
		}
	}

	public String getRelevantProjectSign() {
		return this.relevantProjectSign;
	}

	public void setRelevantProjectSign(String relevantProjectSign) {
		this.relevantProjectSign = relevantProjectSign;
		if(relevantProjectSign != null){
			putBodyParameter("RelevantProjectSign", relevantProjectSign);
		}
	}

	public List<String> getTemplateLabelsRepeatLists() {
		return this.templateLabelsRepeatLists;
	}

	public void setTemplateLabelsRepeatLists(List<String> templateLabelsRepeatLists) {
		this.templateLabelsRepeatLists = templateLabelsRepeatLists;	
		if (templateLabelsRepeatLists != null) {
			for (int i = 0; i < templateLabelsRepeatLists.size(); i++) {
				putBodyParameter("TemplateLabelsRepeatList." + (i + 1) , templateLabelsRepeatLists.get(i));
			}
		}	
	}

	public Long getUpdatedAtAfter() {
		return this.updatedAtAfter;
	}

	public void setUpdatedAtAfter(Long updatedAtAfter) {
		this.updatedAtAfter = updatedAtAfter;
		if(updatedAtAfter != null){
			putBodyParameter("UpdatedAtAfter", updatedAtAfter.toString());
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

	public String getStamp() {
		return this.stamp;
	}

	public void setStamp(String stamp) {
		this.stamp = stamp;
		if(stamp != null){
			putBodyParameter("Stamp", stamp);
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

	public String getTagsOption() {
		return this.tagsOption;
	}

	public void setTagsOption(String tagsOption) {
		this.tagsOption = tagsOption;
		if(tagsOption != null){
			putBodyParameter("TagsOption", tagsOption);
		}
	}

	public String getParentProjectSign() {
		return this.parentProjectSign;
	}

	public void setParentProjectSign(String parentProjectSign) {
		this.parentProjectSign = parentProjectSign;
		if(parentProjectSign != null){
			putBodyParameter("ParentProjectSign", parentProjectSign);
		}
	}

	public Long getCreatedAtBefore() {
		return this.createdAtBefore;
	}

	public void setCreatedAtBefore(Long createdAtBefore) {
		this.createdAtBefore = createdAtBefore;
		if(createdAtBefore != null){
			putBodyParameter("CreatedAtBefore", createdAtBefore.toString());
		}
	}

	public List<String> getCreatorsRepeatLists() {
		return this.creatorsRepeatLists;
	}

	public void setCreatorsRepeatLists(List<String> creatorsRepeatLists) {
		this.creatorsRepeatLists = creatorsRepeatLists;	
		if (creatorsRepeatLists != null) {
			for (int i = 0; i < creatorsRepeatLists.size(); i++) {
				putBodyParameter("CreatorsRepeatList." + (i + 1) , creatorsRepeatLists.get(i));
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

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
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

	public List<Long> getTemplateIdsRepeatLists() {
		return this.templateIdsRepeatLists;
	}

	public void setTemplateIdsRepeatLists(List<Long> templateIdsRepeatLists) {
		this.templateIdsRepeatLists = templateIdsRepeatLists;	
		if (templateIdsRepeatLists != null) {
			for (int i = 0; i < templateIdsRepeatLists.size(); i++) {
				putBodyParameter("TemplateIdsRepeatList." + (i + 1) , templateIdsRepeatLists.get(i));
			}
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

	public Long getExpectedAtBefore() {
		return this.expectedAtBefore;
	}

	public void setExpectedAtBefore(Long expectedAtBefore) {
		this.expectedAtBefore = expectedAtBefore;
		if(expectedAtBefore != null){
			putBodyParameter("ExpectedAtBefore", expectedAtBefore.toString());
		}
	}

	public String getRelevantUid() {
		return this.relevantUid;
	}

	public void setRelevantUid(String relevantUid) {
		this.relevantUid = relevantUid;
		if(relevantUid != null){
			putBodyParameter("RelevantUid", relevantUid);
		}
	}

	public Long getLength() {
		return this.length;
	}

	public void setLength(Long length) {
		this.length = length;
		if(length != null){
			putBodyParameter("Length", length.toString());
		}
	}

	public String getModuleIdsOption() {
		return this.moduleIdsOption;
	}

	public void setModuleIdsOption(String moduleIdsOption) {
		this.moduleIdsOption = moduleIdsOption;
		if(moduleIdsOption != null){
			putBodyParameter("ModuleIdsOption", moduleIdsOption);
		}
	}

	public String getGroupBy() {
		return this.groupBy;
	}

	public void setGroupBy(String groupBy) {
		this.groupBy = groupBy;
		if(groupBy != null){
			putBodyParameter("GroupBy", groupBy);
		}
	}

	public Long getUpdatedAtBefore() {
		return this.updatedAtBefore;
	}

	public void setUpdatedAtBefore(Long updatedAtBefore) {
		this.updatedAtBefore = updatedAtBefore;
		if(updatedAtBefore != null){
			putBodyParameter("UpdatedAtBefore", updatedAtBefore.toString());
		}
	}

	public Long getCreatedAtAfter() {
		return this.createdAtAfter;
	}

	public void setCreatedAtAfter(Long createdAtAfter) {
		this.createdAtAfter = createdAtAfter;
		if(createdAtAfter != null){
			putBodyParameter("CreatedAtAfter", createdAtAfter.toString());
		}
	}

	public List<Long> getModuleIdsRepeatLists() {
		return this.moduleIdsRepeatLists;
	}

	public void setModuleIdsRepeatLists(List<Long> moduleIdsRepeatLists) {
		this.moduleIdsRepeatLists = moduleIdsRepeatLists;	
		if (moduleIdsRepeatLists != null) {
			for (int i = 0; i < moduleIdsRepeatLists.size(); i++) {
				putBodyParameter("ModuleIdsRepeatList." + (i + 1) , moduleIdsRepeatLists.get(i));
			}
		}	
	}

	public Long getRootBegin() {
		return this.rootBegin;
	}

	public void setRootBegin(Long rootBegin) {
		this.rootBegin = rootBegin;
		if(rootBegin != null){
			putBodyParameter("RootBegin", rootBegin.toString());
		}
	}

	public String getShowMode() {
		return this.showMode;
	}

	public void setShowMode(String showMode) {
		this.showMode = showMode;
		if(showMode != null){
			putBodyParameter("ShowMode", showMode);
		}
	}

	public List<Long> getStageListRepeatLists() {
		return this.stageListRepeatLists;
	}

	public void setStageListRepeatLists(List<Long> stageListRepeatLists) {
		this.stageListRepeatLists = stageListRepeatLists;	
		if (stageListRepeatLists != null) {
			for (int i = 0; i < stageListRepeatLists.size(); i++) {
				putBodyParameter("StageListRepeatList." + (i + 1) , stageListRepeatLists.get(i));
			}
		}	
	}

	public List<String> getProjectSignsRepeatLists() {
		return this.projectSignsRepeatLists;
	}

	public void setProjectSignsRepeatLists(List<String> projectSignsRepeatLists) {
		this.projectSignsRepeatLists = projectSignsRepeatLists;	
		if (projectSignsRepeatLists != null) {
			for (int i = 0; i < projectSignsRepeatLists.size(); i++) {
				putBodyParameter("ProjectSignsRepeatList." + (i + 1) , projectSignsRepeatLists.get(i));
			}
		}	
	}

	@Override
	public Class<ExecLinkeLinktSearchworkitemResponse> getResponseClass() {
		return ExecLinkeLinktSearchworkitemResponse.class;
	}

}
